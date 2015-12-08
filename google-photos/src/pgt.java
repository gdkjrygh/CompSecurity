// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pgt extends qlq
{

    public String a;
    public pgs b;
    public pom c[];
    public qgg d[];
    public Integer e;
    private ppq f[];
    private pqb g[];
    private String h;
    private Integer i;
    private Integer j;
    private Integer k;

    public pgt()
    {
        a = null;
        b = null;
        c = pom.b();
        f = ppq.b();
        d = qgg.b();
        g = pqb.b();
        h = null;
        e = null;
        i = null;
        j = null;
        k = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int l = super.a();
        int i1 = l;
        if (a != null)
        {
            i1 = l + qlp.b(1, a);
        }
        l = i1;
        if (b != null)
        {
            l = i1 + qlp.c(2, b);
        }
        i1 = l;
        if (c != null)
        {
            i1 = l;
            if (c.length > 0)
            {
                for (i1 = 0; i1 < c.length;)
                {
                    pom pom1 = c[i1];
                    int l1 = l;
                    if (pom1 != null)
                    {
                        l1 = l + qlp.c(3, pom1);
                    }
                    i1++;
                    l = l1;
                }

                i1 = l;
            }
        }
        l = i1;
        if (g != null)
        {
            l = i1;
            if (g.length > 0)
            {
                l = i1;
                for (i1 = 0; i1 < g.length;)
                {
                    pqb pqb1 = g[i1];
                    int i2 = l;
                    if (pqb1 != null)
                    {
                        i2 = l + qlp.c(4, pqb1);
                    }
                    i1++;
                    l = i2;
                }

            }
        }
        i1 = l;
        if (h != null)
        {
            i1 = l + qlp.b(5, h);
        }
        l = i1;
        if (e != null)
        {
            l = i1 + qlp.e(6, e.intValue());
        }
        i1 = l;
        if (i != null)
        {
            i1 = l + qlp.e(7, i.intValue());
        }
        l = i1;
        if (j != null)
        {
            l = i1 + qlp.e(8, j.intValue());
        }
        i1 = l;
        if (k != null)
        {
            i1 = l + qlp.e(9, k.intValue());
        }
        l = i1;
        if (f != null)
        {
            l = i1;
            if (f.length > 0)
            {
                l = i1;
                for (int j1 = 0; j1 < f.length;)
                {
                    ppq ppq1 = f[j1];
                    int j2 = l;
                    if (ppq1 != null)
                    {
                        j2 = l + qlp.c(10, ppq1);
                    }
                    j1++;
                    l = j2;
                }

            }
        }
        int k2 = l;
        if (d != null)
        {
            k2 = l;
            if (d.length > 0)
            {
                int k1 = ((flag) ? 1 : 0);
                do
                {
                    k2 = l;
                    if (k1 >= d.length)
                    {
                        break;
                    }
                    qgg qgg1 = d[k1];
                    k2 = l;
                    if (qgg1 != null)
                    {
                        k2 = l + qlp.c(11, qgg1);
                    }
                    k1++;
                    l = k2;
                } while (true);
            }
        }
        return k2;
    }

    public final qlw a(qlo qlo1)
    {
        do
        {
            int l = qlo1.a();
            switch (l)
            {
            default:
                if (super.a(qlo1, l))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                a = qlo1.g();
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new pgs();
                }
                qlo1.a(b);
                break;

            case 26: // '\032'
                int i2 = qmb.b(qlo1, 26);
                pom apom[];
                int i1;
                if (c == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = c.length;
                }
                apom = new pom[i2 + i1];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(c, 0, apom, 0, i1);
                    i2 = i1;
                }
                for (; i2 < apom.length - 1; i2++)
                {
                    apom[i2] = new pom();
                    qlo1.a(apom[i2]);
                    qlo1.a();
                }

                apom[i2] = new pom();
                qlo1.a(apom[i2]);
                c = apom;
                break;

            case 34: // '"'
                int j2 = qmb.b(qlo1, 34);
                pqb apqb[];
                int j1;
                if (g == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = g.length;
                }
                apqb = new pqb[j2 + j1];
                j2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(g, 0, apqb, 0, j1);
                    j2 = j1;
                }
                for (; j2 < apqb.length - 1; j2++)
                {
                    apqb[j2] = new pqb();
                    qlo1.a(apqb[j2]);
                    qlo1.a();
                }

                apqb[j2] = new pqb();
                qlo1.a(apqb[j2]);
                g = apqb;
                break;

            case 42: // '*'
                h = qlo1.g();
                break;

            case 48: // '0'
                e = Integer.valueOf(qlo1.i());
                break;

            case 56: // '8'
                i = Integer.valueOf(qlo1.i());
                break;

            case 64: // '@'
                j = Integer.valueOf(qlo1.i());
                break;

            case 72: // 'H'
                k = Integer.valueOf(qlo1.i());
                break;

            case 82: // 'R'
                int k2 = qmb.b(qlo1, 82);
                ppq appq[];
                int k1;
                if (f == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = f.length;
                }
                appq = new ppq[k2 + k1];
                k2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(f, 0, appq, 0, k1);
                    k2 = k1;
                }
                for (; k2 < appq.length - 1; k2++)
                {
                    appq[k2] = new ppq();
                    qlo1.a(appq[k2]);
                    qlo1.a();
                }

                appq[k2] = new ppq();
                qlo1.a(appq[k2]);
                f = appq;
                break;

            case 90: // 'Z'
                int l2 = qmb.b(qlo1, 90);
                qgg aqgg[];
                int l1;
                if (d == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = d.length;
                }
                aqgg = new qgg[l2 + l1];
                l2 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(d, 0, aqgg, 0, l1);
                    l2 = l1;
                }
                for (; l2 < aqgg.length - 1; l2++)
                {
                    aqgg[l2] = new qgg();
                    qlo1.a(aqgg[l2]);
                    qlo1.a();
                }

                aqgg[l2] = new qgg();
                qlo1.a(aqgg[l2]);
                d = aqgg;
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (a != null)
        {
            qlp1.a(1, a);
        }
        if (b != null)
        {
            qlp1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int l = 0; l < c.length; l++)
            {
                pom pom1 = c[l];
                if (pom1 != null)
                {
                    qlp1.a(3, pom1);
                }
            }

        }
        if (g != null && g.length > 0)
        {
            for (int i1 = 0; i1 < g.length; i1++)
            {
                pqb pqb1 = g[i1];
                if (pqb1 != null)
                {
                    qlp1.a(4, pqb1);
                }
            }

        }
        if (h != null)
        {
            qlp1.a(5, h);
        }
        if (e != null)
        {
            qlp1.a(6, e.intValue());
        }
        if (i != null)
        {
            qlp1.a(7, i.intValue());
        }
        if (j != null)
        {
            qlp1.a(8, j.intValue());
        }
        if (k != null)
        {
            qlp1.a(9, k.intValue());
        }
        if (f != null && f.length > 0)
        {
            for (int j1 = 0; j1 < f.length; j1++)
            {
                ppq ppq1 = f[j1];
                if (ppq1 != null)
                {
                    qlp1.a(10, ppq1);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int k1 = ((flag) ? 1 : 0); k1 < d.length; k1++)
            {
                qgg qgg1 = d[k1];
                if (qgg1 != null)
                {
                    qlp1.a(11, qgg1);
                }
            }

        }
        super.a(qlp1);
    }
}
