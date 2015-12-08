// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ksm extends krs
{

    private static volatile ksm c[];
    private int d[];
    private int e[];
    private int f[];
    private int g[];
    private int h[];
    private int i[];
    private int j[];
    private int k[];
    private int l[];
    private int m[];

    public ksm()
    {
        d = kry.a;
        e = kry.a;
        f = kry.a;
        g = kry.a;
        h = kry.a;
        i = kry.a;
        j = kry.a;
        k = kry.a;
        l = kry.a;
        m = kry.a;
        a = null;
        b = -1;
    }

    public static ksm[] f()
    {
        if (c == null)
        {
            synchronized (krv.a)
            {
                if (c == null)
                {
                    c = new ksm[0];
                }
            }
        }
        return c;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        boolean flag = false;
        int l1 = super.a();
        int j1;
        int k1;
        if (d != null && d.length > 0)
        {
            int i1 = 0;
            k1 = 0;
            for (; i1 < d.length; i1++)
            {
                k1 += krr.a(d[i1]);
            }

            k1 = l1 + k1 + d.length * 1;
        } else
        {
            k1 = l1;
        }
        j1 = k1;
        if (e != null)
        {
            j1 = k1;
            if (e.length > 0)
            {
                j1 = 0;
                l1 = 0;
                for (; j1 < e.length; j1++)
                {
                    l1 += krr.a(e[j1]);
                }

                j1 = k1 + l1 + e.length * 1;
            }
        }
        k1 = j1;
        if (f != null)
        {
            k1 = j1;
            if (f.length > 0)
            {
                k1 = 0;
                l1 = 0;
                for (; k1 < f.length; k1++)
                {
                    l1 += krr.a(f[k1]);
                }

                k1 = j1 + l1 + f.length * 1;
            }
        }
        j1 = k1;
        if (g != null)
        {
            j1 = k1;
            if (g.length > 0)
            {
                j1 = 0;
                l1 = 0;
                for (; j1 < g.length; j1++)
                {
                    l1 += krr.a(g[j1]);
                }

                j1 = k1 + l1 + g.length * 1;
            }
        }
        k1 = j1;
        if (h != null)
        {
            k1 = j1;
            if (h.length > 0)
            {
                k1 = 0;
                l1 = 0;
                for (; k1 < h.length; k1++)
                {
                    l1 += krr.a(h[k1]);
                }

                k1 = j1 + l1 + h.length * 1;
            }
        }
        j1 = k1;
        if (i != null)
        {
            j1 = k1;
            if (i.length > 0)
            {
                j1 = 0;
                l1 = 0;
                for (; j1 < i.length; j1++)
                {
                    l1 += krr.a(i[j1]);
                }

                j1 = k1 + l1 + i.length * 1;
            }
        }
        k1 = j1;
        if (j != null)
        {
            k1 = j1;
            if (j.length > 0)
            {
                k1 = 0;
                l1 = 0;
                for (; k1 < j.length; k1++)
                {
                    l1 += krr.a(j[k1]);
                }

                k1 = j1 + l1 + j.length * 1;
            }
        }
        j1 = k1;
        if (k != null)
        {
            j1 = k1;
            if (k.length > 0)
            {
                j1 = 0;
                l1 = 0;
                for (; j1 < k.length; j1++)
                {
                    l1 += krr.a(k[j1]);
                }

                j1 = k1 + l1 + k.length * 1;
            }
        }
        k1 = j1;
        if (l != null)
        {
            k1 = j1;
            if (l.length > 0)
            {
                k1 = 0;
                l1 = 0;
                for (; k1 < l.length; k1++)
                {
                    l1 += krr.a(l[k1]);
                }

                k1 = j1 + l1 + l.length * 1;
            }
        }
        j1 = k1;
        if (m != null)
        {
            j1 = k1;
            if (m.length > 0)
            {
                l1 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < m.length; j1++)
                {
                    l1 += krr.a(m[j1]);
                }

                j1 = k1 + l1 + m.length * 1;
            }
        }
        return j1;
    }

    public final void a(krr krr1)
    {
        boolean flag = false;
        if (d != null && d.length > 0)
        {
            for (int i1 = 0; i1 < d.length; i1++)
            {
                krr1.a(1, d[i1]);
            }

        }
        if (e != null && e.length > 0)
        {
            for (int j1 = 0; j1 < e.length; j1++)
            {
                krr1.a(2, e[j1]);
            }

        }
        if (f != null && f.length > 0)
        {
            for (int k1 = 0; k1 < f.length; k1++)
            {
                krr1.a(3, f[k1]);
            }

        }
        if (g != null && g.length > 0)
        {
            for (int l1 = 0; l1 < g.length; l1++)
            {
                krr1.a(4, g[l1]);
            }

        }
        if (h != null && h.length > 0)
        {
            for (int i2 = 0; i2 < h.length; i2++)
            {
                krr1.a(5, h[i2]);
            }

        }
        if (i != null && i.length > 0)
        {
            for (int j2 = 0; j2 < i.length; j2++)
            {
                krr1.a(6, i[j2]);
            }

        }
        if (j != null && j.length > 0)
        {
            for (int k2 = 0; k2 < j.length; k2++)
            {
                krr1.a(7, j[k2]);
            }

        }
        if (k != null && k.length > 0)
        {
            for (int l2 = 0; l2 < k.length; l2++)
            {
                krr1.a(8, k[l2]);
            }

        }
        if (l != null && l.length > 0)
        {
            for (int i3 = 0; i3 < l.length; i3++)
            {
                krr1.a(9, l[i3]);
            }

        }
        if (m != null && m.length > 0)
        {
            for (int j3 = ((flag) ? 1 : 0); j3 < m.length; j3++)
            {
                krr1.a(10, m[j3]);
            }

        }
        super.a(krr1);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj instanceof ksm)
            {
                obj = (ksm)obj;
                flag = flag1;
                if (krv.a(d, ((ksm) (obj)).d))
                {
                    flag = flag1;
                    if (krv.a(e, ((ksm) (obj)).e))
                    {
                        flag = flag1;
                        if (krv.a(f, ((ksm) (obj)).f))
                        {
                            flag = flag1;
                            if (krv.a(g, ((ksm) (obj)).g))
                            {
                                flag = flag1;
                                if (krv.a(h, ((ksm) (obj)).h))
                                {
                                    flag = flag1;
                                    if (krv.a(i, ((ksm) (obj)).i))
                                    {
                                        flag = flag1;
                                        if (krv.a(j, ((ksm) (obj)).j))
                                        {
                                            flag = flag1;
                                            if (krv.a(k, ((ksm) (obj)).k))
                                            {
                                                flag = flag1;
                                                if (krv.a(l, ((ksm) (obj)).l))
                                                {
                                                    flag = flag1;
                                                    if (krv.a(m, ((ksm) (obj)).m))
                                                    {
                                                        return a(((krs) (obj)));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return ((((((((((krv.a(d) + 527) * 31 + krv.a(e)) * 31 + krv.a(f)) * 31 + krv.a(g)) * 31 + krv.a(h)) * 31 + krv.a(i)) * 31 + krv.a(j)) * 31 + krv.a(k)) * 31 + krv.a(l)) * 31 + krv.a(m)) * 31 + b();
    }
}
