public class NombreAleatoire {
    public static void main(String args[]) {
        
        // génération d'un double >= 0.0 et < 1.0
        double d = Math.random();
        System.out.println(d);
      
        // La conversion en entier va malheureusement retrancher les chiffres
        // après le point et la valeur obtenue sera 0.
        int n = (int)d;
        System.out.println(n); // toujours 0
      
        // Pour obtenir une valeur entière non nulle, il faut multiplier le
        // nombre aléatoire avec un nombre supérieur 0 avant la conversion.
        // Par exemple, la multiplication par 5 donnera au final un nombre
        // entier égal à 0, 1, 2, 3 ou 4.
      
        // génération d'un entier >= 0 et < 5
        n = (int)(Math.random() * 5);
        System.out.println(n);       
        
        //génération d'un entier entre 
        int Max=10;
        int Min=5;
        
        n=(int)(Math.random() * ( Max - Min ));
 System.out.println("entier min max "+ n);
    }
}
