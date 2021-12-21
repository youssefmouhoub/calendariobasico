
/**
 * @author (Youssef) 
 * @version (18-12-2021)
 */
public class CalendarioBasico
{
    // instance variables - replace the example below with your own
    private int dia;
    private int mes;
    private int ano;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
        // initialise instance variables
        dia = 1;
        mes = 1;
        ano = 1;
    }
    
    public String obtenerFecha() {
        String fecha;
        fecha = (dia + "-" + mes + "-" + ano);
        return fecha;
    }
    
    public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAno) {
        dia = nuevoDia;
        mes = nuevoMes;
        ano = nuevoAno;
    }
    
    public void avanzarFecha () {
        if (dia <= 30) {
            dia = dia + 1;
            if (dia == 31) {
                dia = 1;
                mes = mes + 1;
                if (mes == 13) {
                    dia = 1;
                    mes = 1;
                    ano = ano + 1;
                    if (ano == 100) {
                        dia = 1;
                        mes = 1;
                        ano = 1;
                    }
                }
            }
        }
    }
}
