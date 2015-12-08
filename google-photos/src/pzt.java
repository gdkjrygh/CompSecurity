// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pzt extends qlq
{

    public qgg a[];
    public qfu b[];
    public qfz c[];
    public pzx d[];
    public pzv e;
    public pzu f;

    public pzt()
    {
        a = qgg.b();
        b = qfu.b();
        c = qfz.b();
        d = pzx.b();
        e = null;
        f = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int j = super.a();
        int i = j;
        if (a != null)
        {
            i = j;
            if (a.length > 0)
            {
                i = j;
                for (j = 0; j < a.length;)
                {
                    qgg qgg1 = a[j];
                    int l = i;
                    if (qgg1 != null)
                    {
                        l = i + qlp.c(1, qgg1);
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
                for (j = 0; j < c.length;)
                {
                    qfz qfz1 = c[j];
                    int i1 = i;
                    if (qfz1 != null)
                    {
                        i1 = i + qlp.c(2, qfz1);
                    }
                    j++;
                    i = i1;
                }

                j = i;
            }
        }
        i = j;
        if (d != null)
        {
            i = j;
            if (d.length > 0)
            {
                i = j;
                for (j = 0; j < d.length;)
                {
                    pzx pzx1 = d[j];
                    int j1 = i;
                    if (pzx1 != null)
                    {
                        j1 = i + qlp.c(3, pzx1);
                    }
                    j++;
                    i = j1;
                }

            }
        }
        j = i;
        if (e != null)
        {
            j = i + qlp.c(4, e);
        }
        i = j;
        if (f != null)
        {
            i = j + qlp.c(5, f);
        }
        int k1 = i;
        if (b != null)
        {
            k1 = i;
            if (b.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    k1 = i;
                    if (k >= b.length)
                    {
                        break;
                    }
                    qfu qfu1 = b[k];
                    k1 = i;
                    if (qfu1 != null)
                    {
                        k1 = i + qlp.c(6, qfu1);
                    }
                    k++;
                    i = k1;
                } while (true);
            }
        }
        return k1;
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
                qgg aqgg[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aqgg = new qgg[j1 + j];
                j1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aqgg, 0, j);
                    j1 = j;
                }
                for (; j1 < aqgg.length - 1; j1++)
                {
                    aqgg[j1] = new qgg();
                    qlo1.a(aqgg[j1]);
                    qlo1.a();
                }

                aqgg[j1] = new qgg();
                qlo1.a(aqgg[j1]);
                a = aqgg;
                break;

            case 18: // '\022'
                int k1 = qmb.b(qlo1, 18);
                qfz aqfz[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                aqfz = new qfz[k1 + k];
                k1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, aqfz, 0, k);
                    k1 = k;
                }
                for (; k1 < aqfz.length - 1; k1++)
                {
                    aqfz[k1] = new qfz();
                    qlo1.a(aqfz[k1]);
                    qlo1.a();
                }

                aqfz[k1] = new qfz();
                qlo1.a(aqfz[k1]);
                c = aqfz;
                break;

            case 26: // '\032'
                int l1 = qmb.b(qlo1, 26);
                pzx apzx[];
                int l;
                if (d == null)
                {
                    l = 0;
                } else
                {
                    l = d.length;
                }
                apzx = new pzx[l1 + l];
                l1 = l;
                if (l != 0)
                {
                    System.arraycopy(d, 0, apzx, 0, l);
                    l1 = l;
                }
                for (; l1 < apzx.length - 1; l1++)
                {
                    apzx[l1] = new pzx();
                    qlo1.a(apzx[l1]);
                    qlo1.a();
                }

                apzx[l1] = new pzx();
                qlo1.a(apzx[l1]);
                d = apzx;
                break;

            case 34: // '"'
                if (e == null)
                {
                    e = new pzv();
                }
                qlo1.a(e);
                break;

            case 42: // '*'
                if (f == null)
                {
                    f = new pzu();
                }
                qlo1.a(f);
                break;

            case 50: // '2'
                int i2 = qmb.b(qlo1, 50);
                qfu aqfu[];
                int i1;
                if (b == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = b.length;
                }
                aqfu = new qfu[i2 + i1];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(b, 0, aqfu, 0, i1);
                    i2 = i1;
                }
                for (; i2 < aqfu.length - 1; i2++)
                {
                    aqfu[i2] = new qfu();
                    qlo1.a(aqfu[i2]);
                    qlo1.a();
                }

                aqfu[i2] = new qfu();
                qlo1.a(aqfu[i2]);
                b = aqfu;
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
                qgg qgg1 = a[i];
                if (qgg1 != null)
                {
                    qlp1.a(1, qgg1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = 0; j < c.length; j++)
            {
                qfz qfz1 = c[j];
                if (qfz1 != null)
                {
                    qlp1.a(2, qfz1);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int k = 0; k < d.length; k++)
            {
                pzx pzx1 = d[k];
                if (pzx1 != null)
                {
                    qlp1.a(3, pzx1);
                }
            }

        }
        if (e != null)
        {
            qlp1.a(4, e);
        }
        if (f != null)
        {
            qlp1.a(5, f);
        }
        if (b != null && b.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < b.length; l++)
            {
                qfu qfu1 = b[l];
                if (qfu1 != null)
                {
                    qlp1.a(6, qfu1);
                }
            }

        }
        super.a(qlp1);
    }
}
