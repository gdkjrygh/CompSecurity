// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pqv extends qlq
{

    private pqw a[];
    private ppx b[];
    private prc c[];
    private pqd d;

    public pqv()
    {
        a = pqw.b();
        b = ppx.b();
        c = prc.b();
        d = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int i = super.a();
        int j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                for (j = 0; j < a.length;)
                {
                    pqw pqw1 = a[j];
                    int k = i;
                    if (pqw1 != null)
                    {
                        k = i + qlp.c(1, pqw1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (b != null)
        {
            i = j;
            if (b.length > 0)
            {
                i = j;
                for (j = 0; j < b.length;)
                {
                    ppx ppx1 = b[j];
                    int l = i;
                    if (ppx1 != null)
                    {
                        l = i + qlp.c(2, ppx1);
                    }
                    j++;
                    i = l;
                }

            }
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                int i1 = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (i1 >= c.length)
                    {
                        break;
                    }
                    prc prc1 = c[i1];
                    j = i;
                    if (prc1 != null)
                    {
                        j = i + qlp.c(3, prc1);
                    }
                    i1++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.c(4, d);
        }
        return i;
    }

    public final qlw a(qlo qlo1)
    {
        do
        {
            int i = qlo1.a();
            switch (i)
            {
            default:
                if (super.a(qlo1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int i1 = qmb.b(qlo1, 10);
                pqw apqw[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                apqw = new pqw[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, apqw, 0, j);
                    i1 = j;
                }
                for (; i1 < apqw.length - 1; i1++)
                {
                    apqw[i1] = new pqw();
                    qlo1.a(apqw[i1]);
                    qlo1.a();
                }

                apqw[i1] = new pqw();
                qlo1.a(apqw[i1]);
                a = apqw;
                break;

            case 18: // '\022'
                int j1 = qmb.b(qlo1, 18);
                ppx appx[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                appx = new ppx[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, appx, 0, k);
                    j1 = k;
                }
                for (; j1 < appx.length - 1; j1++)
                {
                    appx[j1] = new ppx();
                    qlo1.a(appx[j1]);
                    qlo1.a();
                }

                appx[j1] = new ppx();
                qlo1.a(appx[j1]);
                b = appx;
                break;

            case 26: // '\032'
                int k1 = qmb.b(qlo1, 26);
                prc aprc[];
                int l;
                if (c == null)
                {
                    l = 0;
                } else
                {
                    l = c.length;
                }
                aprc = new prc[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(c, 0, aprc, 0, l);
                    k1 = l;
                }
                for (; k1 < aprc.length - 1; k1++)
                {
                    aprc[k1] = new prc();
                    qlo1.a(aprc[k1]);
                    qlo1.a();
                }

                aprc[k1] = new prc();
                qlo1.a(aprc[k1]);
                c = aprc;
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new pqd();
                }
                qlo1.a(d);
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                pqw pqw1 = a[i];
                if (pqw1 != null)
                {
                    qlp1.a(1, pqw1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                ppx ppx1 = b[j];
                if (ppx1 != null)
                {
                    qlp1.a(2, ppx1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < c.length; k++)
            {
                prc prc1 = c[k];
                if (prc1 != null)
                {
                    qlp1.a(3, prc1);
                }
            }

        }
        if (d != null)
        {
            qlp1.a(4, d);
        }
        super.a(qlp1);
    }
}
