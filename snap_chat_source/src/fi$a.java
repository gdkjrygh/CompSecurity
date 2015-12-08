// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public static final class a.a
    implements Serializable
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
            return (a)Enum.valueOf(fi$a$a, s);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        static 
        {
            a = new a("FROM_NUMBER_WITH_PLUS_SIGN", 0);
            b = new a("FROM_NUMBER_WITH_IDD", 1);
            c = new a("FROM_NUMBER_WITHOUT_PLUS_SIGN", 2);
            d = new a("FROM_DEFAULT_COUNTRY", 3);
            e = (new a[] {
                a, b, c, d
            });
        }

        private a(String s, int i1)
        {
            super(s, i1);
        }
    }


    int a;
    long b;
    boolean c;
    String d;
    boolean e;
    int f;
    boolean g;
    String h;
    a i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private String p;

    public final a a()
    {
        c = false;
        d = "";
        return this;
    }

    public final d a(int i1)
    {
        j = true;
        a = i1;
        return this;
    }

    public final a a(long l1)
    {
        k = true;
        b = l1;
        return this;
    }

    public final a a(a a1)
    {
        if (a1 == null)
        {
            throw new NullPointerException();
        } else
        {
            n = true;
            i = a1;
            return this;
        }
    }

    public final i a(i i1)
    {
        if (i1.j)
        {
            a(i1.a);
        }
        if (i1.k)
        {
            a(i1.b);
        }
        if (i1.c)
        {
            a(i1.d);
        }
        if (i1.l)
        {
            a(i1.e);
        }
        if (i1.m)
        {
            b(i1.f);
        }
        if (i1.g)
        {
            b(i1.h);
        }
        if (i1.n)
        {
            a(i1.i);
        }
        if (i1.o)
        {
            c(i1.p);
        }
        return this;
    }

    public final lang.String a(String s)
    {
        if (s == null)
        {
            throw new NullPointerException();
        } else
        {
            c = true;
            d = s;
            return this;
        }
    }

    public final d a(boolean flag)
    {
        l = true;
        e = flag;
        return this;
    }

    public final e b()
    {
        g = false;
        h = "";
        return this;
    }

    public final h b(int i1)
    {
        m = true;
        f = i1;
        return this;
    }

    public final lang.String b(String s)
    {
        if (s == null)
        {
            throw new NullPointerException();
        } else
        {
            g = true;
            h = s;
            return this;
        }
    }

    public final boolean b(h h1)
    {
        if (h1 != null)
        {
            if (this == h1)
            {
                return true;
            }
            if (a == h1.a && b == h1.b && d.equals(h1.d) && e == h1.e && f == h1.f && h.equals(h1.h) && i == h1.i && p.equals(h1.p) && o == h1.o)
            {
                return true;
            }
        }
        return false;
    }

    public final o c()
    {
        n = false;
        i = a.a;
        return this;
    }

    public final lang.String c(String s)
    {
        if (s == null)
        {
            throw new NullPointerException();
        } else
        {
            o = true;
            p = s;
            return this;
        }
    }

    public final p d()
    {
        o = false;
        p = "";
        return this;
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof s) && b((b)obj);
    }

    public final int hashCode()
    {
        char c2 = '\u04CF';
        int i1 = a;
        int j1 = Long.valueOf(b).hashCode();
        int k1 = d.hashCode();
        char c1;
        int l1;
        int i2;
        int j2;
        int k2;
        if (e)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        l1 = f;
        i2 = h.hashCode();
        j2 = i.hashCode();
        k2 = p.hashCode();
        if (!o)
        {
            c2 = '\u04D5';
        }
        return (((((c1 + (((i1 + 2173) * 53 + j1) * 53 + k1) * 53) * 53 + l1) * 53 + i2) * 53 + j2) * 53 + k2) * 53 + c2;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Country Code: ").append(a);
        stringbuilder.append(" National Number: ").append(b);
        if (l && e)
        {
            stringbuilder.append(" Leading Zero(s): true");
        }
        if (m)
        {
            stringbuilder.append(" Number of leading zeros: ").append(f);
        }
        if (c)
        {
            stringbuilder.append(" Extension: ").append(d);
        }
        if (n)
        {
            stringbuilder.append(" Country Code Source: ").append(i);
        }
        if (o)
        {
            stringbuilder.append(" Preferred Domestic Carrier Code: ").append(p);
        }
        return stringbuilder.toString();
    }

    public >()
    {
        a = 0;
        b = 0L;
        d = "";
        e = false;
        f = 1;
        h = "";
        p = "";
        i = a.a;
    }
}
