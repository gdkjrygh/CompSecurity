// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.d;


public final class z
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a e[];
        String c;
        int d;

        public static a a(int i)
        {
            a aa[] = values();
            int k = aa.length;
            for (int j = 0; j < k; j++)
            {
                a a1 = aa[j];
                if (a1.d == i)
                {
                    return a1;
                }
            }

            return b;
        }

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(kik/a/d/z$a, s);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        public final int a()
        {
            return d;
        }

        static 
        {
            a = new a("TEXT", 0, "text", 0);
            b = new a("UNSUPPORTED", 1, "unsupported", -1);
            e = (new a[] {
                a, b
            });
        }

        private a(String s, int i, String s1, int j)
        {
            super(s, i);
            c = s1;
            d = j;
        }
    }


    private String a;
    private CharSequence b;
    private a c;

    public z(String s, CharSequence charsequence)
    {
        c = null;
        a = s;
        b = charsequence;
        c = a.b;
        charsequence = a.values();
        int j = charsequence.length;
        for (int i = 0; i < j; i++)
        {
            a a1 = charsequence[i];
            if (s.equals(a1.c))
            {
                c = a1;
            }
        }

    }

    public final String a()
    {
        return a;
    }

    public final void a(CharSequence charsequence)
    {
        b = charsequence;
    }

    public final a b()
    {
        return c;
    }

    public final CharSequence c()
    {
        return b;
    }

    public final String d()
    {
        return (new StringBuilder("{type:'")).append(a).append("', data:'").append(b).append("'}").toString();
    }
}
