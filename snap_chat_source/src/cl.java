// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cl
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        private static final a k[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(cl$a, s);
        }

        public static a[] values()
        {
            return (a[])k.clone();
        }

        static 
        {
            a = new a("None", 0);
            b = new a("XMinYMin", 1);
            c = new a("XMidYMin", 2);
            d = new a("XMaxYMin", 3);
            e = new a("XMinYMid", 4);
            f = new a("XMidYMid", 5);
            g = new a("XMaxYMid", 6);
            h = new a("XMinYMax", 7);
            i = new a("XMidYMax", 8);
            j = new a("XMaxYMax", 9);
            k = (new a[] {
                a, b, c, d, e, f, g, h, i, j
            });
        }

        private a(String s, int l)
        {
            super(s, l);
        }
    }


    public static final cl c;
    public static final cl d;
    a a;
    int b;

    public cl(a a1, int i)
    {
        a = a1;
        b = i;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (cl)obj;
            if (a != ((cl) (obj)).a)
            {
                return false;
            }
            if (b != ((cl) (obj)).b)
            {
                return false;
            }
        }
        return true;
    }

    static 
    {
        new cl(null, 0);
        c = new cl(a.a, 0);
        d = new cl(a.f, 1);
        new cl(a.b, 1);
        new cl(a.j, 1);
        new cl(a.c, 1);
        new cl(a.i, 1);
        new cl(a.f, 2);
        new cl(a.b, 2);
    }
}
