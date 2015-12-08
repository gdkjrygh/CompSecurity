// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fd extends Exception
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        private static final a f[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(fd$a, s);
        }

        public static a[] values()
        {
            return (a[])f.clone();
        }

        static 
        {
            a = new a("INVALID_COUNTRY_CODE", 0);
            b = new a("NOT_A_NUMBER", 1);
            c = new a("TOO_SHORT_AFTER_IDD", 2);
            d = new a("TOO_SHORT_NSN", 3);
            e = new a("TOO_LONG", 4);
            f = (new a[] {
                a, b, c, d, e
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    a a;
    private String b;

    public fd(a a1, String s)
    {
        super(s);
        b = s;
        a = a1;
    }

    public final String toString()
    {
        String s = String.valueOf(String.valueOf(a));
        String s1 = String.valueOf(String.valueOf(b));
        return (new StringBuilder(s.length() + 14 + s1.length())).append("Error type: ").append(s).append(". ").append(s1).toString();
    }
}
