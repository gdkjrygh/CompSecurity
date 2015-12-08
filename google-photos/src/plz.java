// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class plz extends qlq
{

    public qgg a[];
    public String b;
    private ppq c[];
    private Boolean d;
    private qks e[];
    private pma f[];

    public plz()
    {
        c = ppq.b();
        a = qgg.b();
        b = null;
        d = null;
        e = qks.b();
        f = pma.b();
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int j = super.a();
        int i = j;
        if (c != null)
        {
            i = j;
            if (c.length > 0)
            {
                i = j;
                for (j = 0; j < c.length;)
                {
                    ppq ppq1 = c[j];
                    int i1 = i;
                    if (ppq1 != null)
                    {
                        i1 = i + qlp.c(1, ppq1);
                    }
                    j++;
                    i = i1;
                }

            }
        }
        j = i;
        if (b != null)
        {
            j = i + qlp.b(2, b);
        }
        i = j;
        if (d != null)
        {
            d.booleanValue();
            i = j + (qlp.c(3) + 1);
        }
        j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                for (j = 0; j < a.length;)
                {
                    qgg qgg1 = a[j];
                    int j1 = i;
                    if (qgg1 != null)
                    {
                        j1 = i + qlp.c(4, qgg1);
                    }
                    j++;
                    i = j1;
                }

                j = i;
            }
        }
        i = j;
        if (e != null)
        {
            i = j;
            if (e.length > 0)
            {
                i = j;
                for (int k = 0; k < e.length;)
                {
                    qks qks1 = e[k];
                    int k1 = i;
                    if (qks1 != null)
                    {
                        k1 = i + qlp.c(5, qks1);
                    }
                    k++;
                    i = k1;
                }

            }
        }
        int l1 = i;
        if (f != null)
        {
            l1 = i;
            if (f.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    l1 = i;
                    if (l >= f.length)
                    {
                        break;
                    }
                    pma pma1 = f[l];
                    l1 = i;
                    if (pma1 != null)
                    {
                        l1 = i + qlp.c(6, pma1);
                    }
                    l++;
                    i = l1;
                } while (true);
            }
        }
        return l1;
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
                int j1 = qmb.b(qlo1, 10);
                ppq appq[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                appq = new ppq[j1 + j];
                j1 = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, appq, 0, j);
                    j1 = j;
                }
                for (; j1 < appq.length - 1; j1++)
                {
                    appq[j1] = new ppq();
                    qlo1.a(appq[j1]);
                    qlo1.a();
                }

                appq[j1] = new ppq();
                qlo1.a(appq[j1]);
                c = appq;
                break;

            case 18: // '\022'
                b = qlo1.g();
                break;

            case 24: // '\030'
                d = Boolean.valueOf(qlo1.f());
                break;

            case 34: // '"'
                int k1 = qmb.b(qlo1, 34);
                qgg aqgg[];
                int k;
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                aqgg = new qgg[k1 + k];
                k1 = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, aqgg, 0, k);
                    k1 = k;
                }
                for (; k1 < aqgg.length - 1; k1++)
                {
                    aqgg[k1] = new qgg();
                    qlo1.a(aqgg[k1]);
                    qlo1.a();
                }

                aqgg[k1] = new qgg();
                qlo1.a(aqgg[k1]);
                a = aqgg;
                break;

            case 42: // '*'
                int l1 = qmb.b(qlo1, 42);
                qks aqks[];
                int l;
                if (e == null)
                {
                    l = 0;
                } else
                {
                    l = e.length;
                }
                aqks = new qks[l1 + l];
                l1 = l;
                if (l != 0)
                {
                    System.arraycopy(e, 0, aqks, 0, l);
                    l1 = l;
                }
                for (; l1 < aqks.length - 1; l1++)
                {
                    aqks[l1] = new qks();
                    qlo1.a(aqks[l1]);
                    qlo1.a();
                }

                aqks[l1] = new qks();
                qlo1.a(aqks[l1]);
                e = aqks;
                break;

            case 50: // '2'
                int i2 = qmb.b(qlo1, 50);
                pma apma[];
                int i1;
                if (f == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = f.length;
                }
                apma = new pma[i2 + i1];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(f, 0, apma, 0, i1);
                    i2 = i1;
                }
                for (; i2 < apma.length - 1; i2++)
                {
                    apma[i2] = new pma();
                    qlo1.a(apma[i2]);
                    qlo1.a();
                }

                apma[i2] = new pma();
                qlo1.a(apma[i2]);
                f = apma;
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                ppq ppq1 = c[i];
                if (ppq1 != null)
                {
                    qlp1.a(1, ppq1);
                }
            }

        }
        if (b != null)
        {
            qlp1.a(2, b);
        }
        if (d != null)
        {
            qlp1.a(3, d.booleanValue());
        }
        if (a != null && a.length > 0)
        {
            for (int j = 0; j < a.length; j++)
            {
                qgg qgg1 = a[j];
                if (qgg1 != null)
                {
                    qlp1.a(4, qgg1);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int k = 0; k < e.length; k++)
            {
                qks qks1 = e[k];
                if (qks1 != null)
                {
                    qlp1.a(5, qks1);
                }
            }

        }
        if (f != null && f.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < f.length; l++)
            {
                pma pma1 = f[l];
                if (pma1 != null)
                {
                    qlp1.a(6, pma1);
                }
            }

        }
        super.a(qlp1);
    }
}
