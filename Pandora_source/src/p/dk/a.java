// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dk;


public interface p.dk.a
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a e[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/dk/a$a, s);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        static 
        {
            a = new a("STATION_CHANGE", 0);
            b = new a("PROMOTED_STATION_SHOWN", 1);
            c = new a("PROMOTED_STATION_DISMISSED", 2);
            d = new a("TIMEOUT", 3);
            e = (new a[] {
                a, b, c, d
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract void a();

    public abstract boolean a(a a1);

    public abstract void b();
}
