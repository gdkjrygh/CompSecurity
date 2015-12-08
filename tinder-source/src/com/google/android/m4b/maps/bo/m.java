// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;


// Referenced classes of package com.google.android.m4b.maps.bo:
//            n, g

public final class m extends n
{

    protected g a;
    protected g b;
    private volatile g c;
    private volatile g d;

    public m(g g1, g g2)
    {
        a = g1;
        b = g2;
    }

    public static m a(g g1, int i)
    {
        return new m(new g(g1.a - i, g1.b - i), new g(g1.a + i, g1.b + i));
    }

    public static m a(g g1, g g2)
    {
        int i;
        int j;
        int k;
        int l;
        if (g1.a < g2.a)
        {
            j = g1.a;
            i = g2.a;
        } else
        {
            j = g2.a;
            i = g1.a;
        }
        if (g1.b < g2.b)
        {
            k = g1.b;
            l = g2.b;
        } else
        {
            k = g2.b;
            l = g1.b;
        }
        return new m(new g(j, k), new g(i, l));
    }

    public static m a(g ag[])
    {
        g g1 = ag[0];
        int j1 = g1.a;
        int j = g1.b;
        int i = 1;
        int i1 = j1;
        int l = j;
        while (i < ag.length) 
        {
            g g2 = ag[i];
            int k = j1;
            if (g2.a < j1)
            {
                k = g2.a;
            }
            j1 = i1;
            if (g2.a > i1)
            {
                j1 = g2.a;
            }
            i1 = l;
            if (g2.b < l)
            {
                i1 = g2.b;
            }
            l = j;
            if (g2.b > j)
            {
                l = g2.b;
            }
            i++;
            j = l;
            l = i1;
            i1 = j1;
            j1 = k;
        }
        return new m(new g(j1, l), new g(i1, j));
    }

    public final g a(int i)
    {
        switch (i)
        {
        default:
            throw new ArrayIndexOutOfBoundsException();

        case 0: // '\0'
            if (c == null)
            {
                c = new g(b.a, a.b);
            }
            return c;

        case 1: // '\001'
            return b;

        case 2: // '\002'
            if (d == null)
            {
                d = new g(a.a, b.b);
            }
            return d;

        case 3: // '\003'
            return a;
        }
    }

    public final m a()
    {
        return this;
    }

    final void a(m m1)
    {
        a.a = Math.min(a.a, m1.a.a);
        a.b = Math.min(a.b, m1.a.b);
        b.a = Math.max(b.a, m1.b.a);
        b.b = Math.max(b.b, m1.b.b);
        c = null;
        d = null;
    }

    public final boolean a(g g1)
    {
        return g1.a >= a.a && g1.a <= b.a && g1.b >= a.b && g1.b <= b.b;
    }

    public final boolean a(n n1)
    {
        if (n1 instanceof m)
        {
            n1 = (m)n1;
            return a.a <= ((m) (n1)).b.a && a.b <= ((m) (n1)).b.b && b.a >= ((m) (n1)).a.a && b.b >= ((m) (n1)).a.b;
        } else
        {
            return super.a(n1);
        }
    }

    public final int b()
    {
        return 4;
    }

    public final boolean b(n n1)
    {
        n1 = n1.a();
        return a.a <= ((m) (n1)).a.a && a.b <= ((m) (n1)).a.b && b.a >= ((m) (n1)).b.a && b.b >= ((m) (n1)).b.b;
    }

    public final g c()
    {
        return a;
    }

    public final g d()
    {
        return b;
    }

    public final g e()
    {
        return new g((a.a + b.a) / 2, (a.b + b.b) / 2);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof m)
            {
                if (!((m) (obj = (m)obj)).b.equals(b) || !((m) (obj)).a.equals(a))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final int f()
    {
        return b.a - a.a;
    }

    public final int g()
    {
        return b.b - a.b;
    }

    public final g h()
    {
        return a;
    }

    public final int hashCode()
    {
        return (b.hashCode() + 31) * 31 + a.hashCode();
    }

    public final String toString()
    {
        String s = String.valueOf(a);
        String s1 = String.valueOf(b);
        return (new StringBuilder(String.valueOf(s).length() + 4 + String.valueOf(s1).length())).append("[").append(s).append(", ").append(s1).append("]").toString();
    }
}
