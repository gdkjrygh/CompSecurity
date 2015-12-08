// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class qzn extends qlq
{

    public qzo a[];
    private Integer b;
    private String c[];
    private String d[];

    public qzn()
    {
        a = qzo.b();
        b = null;
        c = qmb.f;
        d = qmb.f;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int j = super.a();
        int i = j;
        if (b != null)
        {
            i = j + qlp.e(1, b.intValue());
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                j = 0;
                int l = 0;
                int k1;
                int i2;
                for (k1 = 0; j < c.length; k1 = i2)
                {
                    String s = c[j];
                    int k2 = l;
                    i2 = k1;
                    if (s != null)
                    {
                        i2 = k1 + 1;
                        k2 = l + qlp.a(s);
                    }
                    j++;
                    l = k2;
                }

                j = i + l + k1 * 1;
            }
        }
        i = j;
        if (d != null)
        {
            i = j;
            if (d.length > 0)
            {
                i = 0;
                int i1 = 0;
                int l1;
                int j2;
                for (l1 = 0; i < d.length; l1 = j2)
                {
                    String s1 = d[i];
                    int l2 = i1;
                    j2 = l1;
                    if (s1 != null)
                    {
                        j2 = l1 + 1;
                        l2 = i1 + qlp.a(s1);
                    }
                    i++;
                    i1 = l2;
                }

                i = j + i1 + l1 * 1;
            }
        }
        int j1 = i;
        if (a != null)
        {
            j1 = i;
            if (a.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    j1 = i;
                    if (k >= a.length)
                    {
                        break;
                    }
                    qzo qzo1 = a[k];
                    j1 = i;
                    if (qzo1 != null)
                    {
                        j1 = i + qlp.c(4, qzo1);
                    }
                    k++;
                    i = j1;
                } while (true);
            }
        }
        return j1;
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

            case 8: // '\b'
                b = Integer.valueOf(qlo1.i());
                break;

            case 18: // '\022'
                int i1 = qmb.b(qlo1, 18);
                String as[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                as = new String[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, as, 0, j);
                    i1 = j;
                }
                for (; i1 < as.length - 1; i1++)
                {
                    as[i1] = qlo1.g();
                    qlo1.a();
                }

                as[i1] = qlo1.g();
                c = as;
                break;

            case 26: // '\032'
                int j1 = qmb.b(qlo1, 26);
                String as1[];
                int k;
                if (d == null)
                {
                    k = 0;
                } else
                {
                    k = d.length;
                }
                as1 = new String[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(d, 0, as1, 0, k);
                    j1 = k;
                }
                for (; j1 < as1.length - 1; j1++)
                {
                    as1[j1] = qlo1.g();
                    qlo1.a();
                }

                as1[j1] = qlo1.g();
                d = as1;
                break;

            case 34: // '"'
                int k1 = qmb.b(qlo1, 34);
                qzo aqzo[];
                int l;
                if (a == null)
                {
                    l = 0;
                } else
                {
                    l = a.length;
                }
                aqzo = new qzo[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(a, 0, aqzo, 0, l);
                    k1 = l;
                }
                for (; k1 < aqzo.length - 1; k1++)
                {
                    aqzo[k1] = new qzo();
                    qlo1.a(aqzo[k1]);
                    qlo1.a();
                }

                aqzo[k1] = new qzo();
                qlo1.a(aqzo[k1]);
                a = aqzo;
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (b != null)
        {
            qlp1.a(1, b.intValue());
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                String s = c[i];
                if (s != null)
                {
                    qlp1.a(2, s);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int j = 0; j < d.length; j++)
            {
                String s1 = d[j];
                if (s1 != null)
                {
                    qlp1.a(3, s1);
                }
            }

        }
        if (a != null && a.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < a.length; k++)
            {
                qzo qzo1 = a[k];
                if (qzo1 != null)
                {
                    qlp1.a(4, qzo1);
                }
            }

        }
        super.a(qlp1);
    }
}
