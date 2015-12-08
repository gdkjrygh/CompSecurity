// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ozs extends qlq
{

    public static final qlr a = qlr.a(11, ozs, 0x2213a60aL);
    public pzt b;
    public qla c;
    private ozz d;
    private ozv e[];
    private ozu f;
    private ozu g[];
    private ozx h;
    private ozt i;

    public ozs()
    {
        b = null;
        c = null;
        d = null;
        e = ozv.b();
        f = null;
        g = ozu.b();
        h = null;
        i = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int k = super.a();
        int j = k;
        if (d != null)
        {
            j = k + qlp.c(1, d);
        }
        k = j;
        if (e != null)
        {
            k = j;
            if (e.length > 0)
            {
                for (k = 0; k < e.length;)
                {
                    ozv ozv1 = e[k];
                    int l = j;
                    if (ozv1 != null)
                    {
                        l = j + qlp.c(2, ozv1);
                    }
                    k++;
                    j = l;
                }

                k = j;
            }
        }
        j = k;
        if (f != null)
        {
            j = k + qlp.c(3, f);
        }
        k = j;
        if (g != null)
        {
            k = j;
            if (g.length > 0)
            {
                int i1 = ((flag) ? 1 : 0);
                do
                {
                    k = j;
                    if (i1 >= g.length)
                    {
                        break;
                    }
                    ozu ozu1 = g[i1];
                    k = j;
                    if (ozu1 != null)
                    {
                        k = j + qlp.c(4, ozu1);
                    }
                    i1++;
                    j = k;
                } while (true);
            }
        }
        j = k;
        if (h != null)
        {
            j = k + qlp.c(5, h);
        }
        k = j;
        if (i != null)
        {
            k = j + qlp.c(6, i);
        }
        j = k;
        if (b != null)
        {
            j = k + qlp.c(7, b);
        }
        k = j;
        if (c != null)
        {
            k = j + qlp.c(8, c);
        }
        return k;
    }

    public final qlw a(qlo qlo1)
    {
        do
        {
            int j = qlo1.a();
            switch (j)
            {
            default:
                if (super.a(qlo1, j))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (d == null)
                {
                    d = new ozz();
                }
                qlo1.a(d);
                break;

            case 18: // '\022'
                int i1 = qmb.b(qlo1, 18);
                ozv aozv[];
                int k;
                if (e == null)
                {
                    k = 0;
                } else
                {
                    k = e.length;
                }
                aozv = new ozv[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(e, 0, aozv, 0, k);
                    i1 = k;
                }
                for (; i1 < aozv.length - 1; i1++)
                {
                    aozv[i1] = new ozv();
                    qlo1.a(aozv[i1]);
                    qlo1.a();
                }

                aozv[i1] = new ozv();
                qlo1.a(aozv[i1]);
                e = aozv;
                break;

            case 26: // '\032'
                if (f == null)
                {
                    f = new ozu();
                }
                qlo1.a(f);
                break;

            case 34: // '"'
                int j1 = qmb.b(qlo1, 34);
                ozu aozu[];
                int l;
                if (g == null)
                {
                    l = 0;
                } else
                {
                    l = g.length;
                }
                aozu = new ozu[j1 + l];
                j1 = l;
                if (l != 0)
                {
                    System.arraycopy(g, 0, aozu, 0, l);
                    j1 = l;
                }
                for (; j1 < aozu.length - 1; j1++)
                {
                    aozu[j1] = new ozu();
                    qlo1.a(aozu[j1]);
                    qlo1.a();
                }

                aozu[j1] = new ozu();
                qlo1.a(aozu[j1]);
                g = aozu;
                break;

            case 42: // '*'
                if (h == null)
                {
                    h = new ozx();
                }
                qlo1.a(h);
                break;

            case 50: // '2'
                if (i == null)
                {
                    i = new ozt();
                }
                qlo1.a(i);
                break;

            case 58: // ':'
                if (b == null)
                {
                    b = new pzt();
                }
                qlo1.a(b);
                break;

            case 66: // 'B'
                if (c == null)
                {
                    c = new qla();
                }
                qlo1.a(c);
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (d != null)
        {
            qlp1.a(1, d);
        }
        if (e != null && e.length > 0)
        {
            for (int j = 0; j < e.length; j++)
            {
                ozv ozv1 = e[j];
                if (ozv1 != null)
                {
                    qlp1.a(2, ozv1);
                }
            }

        }
        if (f != null)
        {
            qlp1.a(3, f);
        }
        if (g != null && g.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < g.length; k++)
            {
                ozu ozu1 = g[k];
                if (ozu1 != null)
                {
                    qlp1.a(4, ozu1);
                }
            }

        }
        if (h != null)
        {
            qlp1.a(5, h);
        }
        if (i != null)
        {
            qlp1.a(6, i);
        }
        if (b != null)
        {
            qlp1.a(7, b);
        }
        if (c != null)
        {
            qlp1.a(8, c);
        }
        super.a(qlp1);
    }

}
