// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            xt, ye, ya, xr, 
//            xy

public final class g extends xt
{

    private static volatile g o[];
    public int a;
    public String b;
    public g c[];
    public g d[];
    public g e[];
    public String f;
    public String g;
    public long h;
    public boolean i;
    public g j[];
    public int k[];
    public boolean l;

    public g()
    {
        a = 1;
        b = "";
        c = e();
        d = e();
        e = e();
        f = "";
        g = "";
        h = 0L;
        i = false;
        j = e();
        k = ye.a;
        l = false;
        m = null;
        n = -1;
    }

    private static g[] e()
    {
        if (o == null)
        {
            synchronized (ya.a)
            {
                if (o == null)
                {
                    o = new g[0];
                }
            }
        }
        return o;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        boolean flag = false;
        int i1 = super.a();
        int j1 = a;
        int k1 = xr.b(1);
        j1 = i1 + (xr.a(j1) + k1);
        i1 = j1;
        if (!b.equals(""))
        {
            i1 = j1 + xr.b(2, b);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1;
            if (c.length > 0)
            {
                for (j1 = 0; j1 < c.length;)
                {
                    g g1 = c[j1];
                    int l1 = i1;
                    if (g1 != null)
                    {
                        l1 = i1 + xr.b(3, g1);
                    }
                    j1++;
                    i1 = l1;
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
                    g g2 = d[j1];
                    int i2 = i1;
                    if (g2 != null)
                    {
                        i2 = i1 + xr.b(4, g2);
                    }
                    j1++;
                    i1 = i2;
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
                    g g3 = e[j1];
                    int j2 = i1;
                    if (g3 != null)
                    {
                        j2 = i1 + xr.b(5, g3);
                    }
                    j1++;
                    i1 = j2;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (!f.equals(""))
        {
            i1 = j1 + xr.b(6, f);
        }
        j1 = i1;
        if (!g.equals(""))
        {
            j1 = i1 + xr.b(7, g);
        }
        i1 = j1;
        if (h != 0L)
        {
            long l3 = h;
            int k2 = xr.b(8);
            if ((-128L & l3) == 0L)
            {
                i1 = 1;
            } else
            if ((-16384L & l3) == 0L)
            {
                i1 = 2;
            } else
            if ((0xffffffffffe00000L & l3) == 0L)
            {
                i1 = 3;
            } else
            if ((0xfffffffff0000000L & l3) == 0L)
            {
                i1 = 4;
            } else
            if ((0xfffffff800000000L & l3) == 0L)
            {
                i1 = 5;
            } else
            if ((0xfffffc0000000000L & l3) == 0L)
            {
                i1 = 6;
            } else
            if ((0xfffe000000000000L & l3) == 0L)
            {
                i1 = 7;
            } else
            if ((0xff00000000000000L & l3) == 0L)
            {
                i1 = 8;
            } else
            if ((0x8000000000000000L & l3) == 0L)
            {
                i1 = 9;
            } else
            {
                i1 = 10;
            }
            i1 = j1 + (i1 + k2);
        }
        j1 = i1;
        if (l)
        {
            j1 = i1 + (xr.b(9) + 1);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1;
            if (k.length > 0)
            {
                i1 = 0;
                int l2 = 0;
                for (; i1 < k.length; i1++)
                {
                    l2 += xr.a(k[i1]);
                }

                i1 = j1 + l2 + k.length * 1;
            }
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1;
            if (j.length > 0)
            {
                int i3 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (i3 >= j.length)
                    {
                        break;
                    }
                    g g4 = j[i3];
                    j1 = i1;
                    if (g4 != null)
                    {
                        j1 = i1 + xr.b(11, g4);
                    }
                    i3++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (i)
        {
            i1 = j1 + (xr.b(12) + 1);
        }
        return i1;
    }

    public final void a(xr xr1)
    {
        boolean flag = false;
        xr1.a(1, a);
        if (!b.equals(""))
        {
            xr1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i1 = 0; i1 < c.length; i1++)
            {
                g g1 = c[i1];
                if (g1 != null)
                {
                    xr1.a(3, g1);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int j1 = 0; j1 < d.length; j1++)
            {
                g g2 = d[j1];
                if (g2 != null)
                {
                    xr1.a(4, g2);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int k1 = 0; k1 < e.length; k1++)
            {
                g g3 = e[k1];
                if (g3 != null)
                {
                    xr1.a(5, g3);
                }
            }

        }
        if (!f.equals(""))
        {
            xr1.a(6, f);
        }
        if (!g.equals(""))
        {
            xr1.a(7, g);
        }
        if (h != 0L)
        {
            xr1.a(8, h);
        }
        if (l)
        {
            xr1.a(9, l);
        }
        if (k != null && k.length > 0)
        {
            for (int l1 = 0; l1 < k.length; l1++)
            {
                xr1.a(10, k[l1]);
            }

        }
        if (j != null && j.length > 0)
        {
            for (int i2 = ((flag) ? 1 : 0); i2 < j.length; i2++)
            {
                g g4 = j[i2];
                if (g4 != null)
                {
                    xr1.a(11, g4);
                }
            }

        }
        if (i)
        {
            xr1.a(12, i);
        }
        super.a(xr1);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof g))
            {
                return false;
            }
            obj = (g)obj;
            if (a != ((g) (obj)).a)
            {
                return false;
            }
            if (b == null)
            {
                if (((g) (obj)).b != null)
                {
                    return false;
                }
            } else
            if (!b.equals(((g) (obj)).b))
            {
                return false;
            }
            if (!ya.a(c, ((g) (obj)).c))
            {
                return false;
            }
            if (!ya.a(d, ((g) (obj)).d))
            {
                return false;
            }
            if (!ya.a(e, ((g) (obj)).e))
            {
                return false;
            }
            if (f == null)
            {
                if (((g) (obj)).f != null)
                {
                    return false;
                }
            } else
            if (!f.equals(((g) (obj)).f))
            {
                return false;
            }
            if (g == null)
            {
                if (((g) (obj)).g != null)
                {
                    return false;
                }
            } else
            if (!g.equals(((g) (obj)).g))
            {
                return false;
            }
            if (h != ((g) (obj)).h)
            {
                return false;
            }
            if (i != ((g) (obj)).i)
            {
                return false;
            }
            if (!ya.a(j, ((g) (obj)).j))
            {
                return false;
            }
            if (!ya.a(k, ((g) (obj)).k))
            {
                return false;
            }
            if (l != ((g) (obj)).l)
            {
                return false;
            }
            if (m == null || m.b())
            {
                if (((g) (obj)).m != null && !((g) (obj)).m.b())
                {
                    return false;
                }
            } else
            {
                return m.equals(((g) (obj)).m);
            }
        }
        return true;
    }

    public final int hashCode()
    {
        char c2 = '\u04CF';
        boolean flag = false;
        int i2 = getClass().getName().hashCode();
        int j2 = a;
        int i1;
        int j1;
        int k1;
        char c1;
        int l1;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        if (b == null)
        {
            i1 = 0;
        } else
        {
            i1 = b.hashCode();
        }
        k2 = ya.a(c);
        l2 = ya.a(d);
        i3 = ya.a(e);
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
        j3 = (int)(h ^ h >>> 32);
        if (i)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        k3 = ya.a(j);
        l3 = ya.a(k);
        if (!l)
        {
            c2 = '\u04D5';
        }
        l1 = ((flag) ? 1 : 0);
        if (m != null)
        {
            if (m.b())
            {
                l1 = ((flag) ? 1 : 0);
            } else
            {
                l1 = m.hashCode();
            }
        }
        return ((((c1 + ((k1 + (j1 + ((((i1 + ((i2 + 527) * 31 + j2) * 31) * 31 + k2) * 31 + l2) * 31 + i3) * 31) * 31) * 31 + j3) * 31) * 31 + k3) * 31 + l3) * 31 + c2) * 31 + l1;
    }
}
