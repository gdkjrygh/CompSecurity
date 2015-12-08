// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            kt, ky, ku, kp

public final class ej extends kt
{

    private static volatile ej o[];
    public int a;
    public String b;
    public ej c[];
    public ej d[];
    public ej e[];
    public String f;
    public String g;
    public long h;
    public boolean i;
    public ej j[];
    public int k[];
    public boolean l;

    public ej()
    {
        a = 1;
        b = "";
        c = c();
        d = c();
        e = c();
        f = "";
        g = "";
        h = 0L;
        i = false;
        j = c();
        k = ky.a;
        l = false;
        m = null;
        n = -1;
    }

    private static ej[] c()
    {
        if (o == null)
        {
            synchronized (ku.a)
            {
                if (o == null)
                {
                    o = new ej[0];
                }
            }
        }
        return o;
    }

    public final void a(kp kp1)
    {
        boolean flag = false;
        kp1.a(1, a);
        if (!b.equals(""))
        {
            kp1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i1 = 0; i1 < c.length; i1++)
            {
                ej ej1 = c[i1];
                if (ej1 != null)
                {
                    kp1.a(3, ej1);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int j1 = 0; j1 < d.length; j1++)
            {
                ej ej2 = d[j1];
                if (ej2 != null)
                {
                    kp1.a(4, ej2);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int k1 = 0; k1 < e.length; k1++)
            {
                ej ej3 = e[k1];
                if (ej3 != null)
                {
                    kp1.a(5, ej3);
                }
            }

        }
        if (!f.equals(""))
        {
            kp1.a(6, f);
        }
        if (!g.equals(""))
        {
            kp1.a(7, g);
        }
        if (h != 0L)
        {
            kp1.a(8, h);
        }
        if (l)
        {
            kp1.a(9, l);
        }
        if (k != null && k.length > 0)
        {
            for (int l1 = 0; l1 < k.length; l1++)
            {
                kp1.a(10, k[l1]);
            }

        }
        if (j != null && j.length > 0)
        {
            for (int i2 = ((flag) ? 1 : 0); i2 < j.length; i2++)
            {
                ej ej4 = j[i2];
                if (ej4 != null)
                {
                    kp1.a(11, ej4);
                }
            }

        }
        if (i)
        {
            kp1.a(12, i);
        }
        super.a(kp1);
    }

    public final int b()
    {
        boolean flag = false;
        int j1 = super.b() + kp.a(a);
        int i1 = j1;
        if (!b.equals(""))
        {
            i1 = j1 + kp.b(2, b);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1;
            if (c.length > 0)
            {
                for (j1 = 0; j1 < c.length;)
                {
                    ej ej1 = c[j1];
                    int k1 = i1;
                    if (ej1 != null)
                    {
                        k1 = i1 + kp.b(3, ej1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1;
            if (d.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < d.length;)
                {
                    ej ej2 = d[j1];
                    int l1 = i1;
                    if (ej2 != null)
                    {
                        l1 = i1 + kp.b(4, ej2);
                    }
                    j1++;
                    i1 = l1;
                }

            }
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1;
            if (e.length > 0)
            {
                for (j1 = 0; j1 < e.length;)
                {
                    ej ej3 = e[j1];
                    int i2 = i1;
                    if (ej3 != null)
                    {
                        i2 = i1 + kp.b(5, ej3);
                    }
                    j1++;
                    i1 = i2;
                }

                j1 = i1;
            }
        }
        int j2 = j1;
        if (!f.equals(""))
        {
            j2 = j1 + kp.b(6, f);
        }
        i1 = j2;
        if (!g.equals(""))
        {
            i1 = j2 + kp.b(7, g);
        }
        j2 = i1;
        if (h != 0L)
        {
            long l3 = h;
            j1 = kp.c(8);
            j2 = i1 + (kp.a(l3) + j1);
        }
        j1 = j2;
        if (l)
        {
            boolean flag1 = l;
            j1 = j2 + (kp.c(9) + 1);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1;
            if (k.length > 0)
            {
                i1 = 0;
                int k2 = 0;
                for (; i1 < k.length; i1++)
                {
                    k2 += kp.b(k[i1]);
                }

                i1 = j1 + k2 + k.length * 1;
            }
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1;
            if (j.length > 0)
            {
                int l2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (l2 >= j.length)
                    {
                        break;
                    }
                    ej ej4 = j[l2];
                    j1 = i1;
                    if (ej4 != null)
                    {
                        j1 = i1 + kp.b(11, ej4);
                    }
                    l2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (i)
        {
            boolean flag2 = i;
            i1 = j1 + (kp.c(12) + 1);
        }
        n = i1;
        return i1;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ej))
            {
                return false;
            }
            obj = (ej)obj;
            if (a != ((ej) (obj)).a)
            {
                return false;
            }
            if (b == null)
            {
                if (((ej) (obj)).b != null)
                {
                    return false;
                }
            } else
            if (!b.equals(((ej) (obj)).b))
            {
                return false;
            }
            if (!ku.a(c, ((ej) (obj)).c))
            {
                return false;
            }
            if (!ku.a(d, ((ej) (obj)).d))
            {
                return false;
            }
            if (!ku.a(e, ((ej) (obj)).e))
            {
                return false;
            }
            if (f == null)
            {
                if (((ej) (obj)).f != null)
                {
                    return false;
                }
            } else
            if (!f.equals(((ej) (obj)).f))
            {
                return false;
            }
            if (g == null)
            {
                if (((ej) (obj)).g != null)
                {
                    return false;
                }
            } else
            if (!g.equals(((ej) (obj)).g))
            {
                return false;
            }
            if (h != ((ej) (obj)).h)
            {
                return false;
            }
            if (i != ((ej) (obj)).i)
            {
                return false;
            }
            if (!ku.a(j, ((ej) (obj)).j))
            {
                return false;
            }
            if (!ku.a(k, ((ej) (obj)).k))
            {
                return false;
            }
            if (l != ((ej) (obj)).l)
            {
                return false;
            }
            if (m == null || m.isEmpty())
            {
                if (((ej) (obj)).m != null && !((ej) (obj)).m.isEmpty())
                {
                    return false;
                }
            } else
            {
                return m.equals(((ej) (obj)).m);
            }
        }
        return true;
    }

    public final int hashCode()
    {
        char c2 = '\u04CF';
        boolean flag = false;
        int i2 = a;
        int i1;
        int j1;
        int k1;
        char c1;
        int l1;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        if (b == null)
        {
            i1 = 0;
        } else
        {
            i1 = b.hashCode();
        }
        j2 = ku.a(c);
        k2 = ku.a(d);
        l2 = ku.a(e);
        if (f == null)
        {
            j1 = 0;
        } else
        {
            j1 = f.hashCode();
        }
        if (g == null)
        {
            k1 = 0;
        } else
        {
            k1 = g.hashCode();
        }
        i3 = (int)(h ^ h >>> 32);
        if (i)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        j3 = ku.a(j);
        k3 = ku.a(k);
        if (!l)
        {
            c2 = '\u04D5';
        }
        l1 = ((flag) ? 1 : 0);
        if (m != null)
        {
            if (m.isEmpty())
            {
                l1 = ((flag) ? 1 : 0);
            } else
            {
                l1 = m.hashCode();
            }
        }
        return ((((c1 + ((k1 + (j1 + ((((i1 + (i2 + 527) * 31) * 31 + j2) * 31 + k2) * 31 + l2) * 31) * 31) * 31 + i3) * 31) * 31 + j3) * 31 + k3) * 31 + c2) * 31 + l1;
    }
}
