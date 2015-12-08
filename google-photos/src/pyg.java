// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pyg extends qlq
{

    private static volatile pyg g[];
    public int a[];
    public pyi b;
    public pyi c;
    public pyh d;
    public double e[];
    public pxt f;

    public pyg()
    {
        a = qmb.a;
        b = null;
        c = null;
        d = null;
        e = qmb.d;
        f = null;
        F = null;
        G = -1;
    }

    public static pyg[] b()
    {
        if (g == null)
        {
            synchronized (qlu.a)
            {
                if (g == null)
                {
                    g = new pyg[0];
                }
            }
        }
        return g;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        int i = 0;
        int k = super.a();
        int j;
        if (a != null && a.length > 0)
        {
            j = 0;
            for (; i < a.length; i++)
            {
                j += qlp.b(a[i]);
            }

            j = k + j + a.length * 1;
        } else
        {
            j = k;
        }
        i = j;
        if (b != null)
        {
            i = j + qlp.c(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i + qlp.c(3, c);
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.c(4, d);
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                j = i + e.length * 8 + e.length * 1;
            }
        }
        i = j;
        if (f != null)
        {
            i = j + qlp.c(6, f);
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

            case 8: // '\b'
                int j1 = qmb.b(qlo1, 8);
                int ai[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                ai = new int[j1 + j];
                j1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, ai, 0, j);
                    j1 = j;
                }
                for (; j1 < ai.length - 1; j1++)
                {
                    ai[j1] = qlo1.i();
                    qlo1.a();
                }

                ai[j1] = qlo1.i();
                a = ai;
                break;

            case 10: // '\n'
                int j2 = qlo1.c(qlo1.i());
                int k = qlo1.o();
                int k1;
                for (k1 = 0; qlo1.m() > 0; k1++)
                {
                    qlo1.i();
                }

                qlo1.e(k);
                int ai1[];
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                ai1 = new int[k1 + k];
                k1 = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, ai1, 0, k);
                    k1 = k;
                }
                for (; k1 < ai1.length; k1++)
                {
                    ai1[k1] = qlo1.i();
                }

                a = ai1;
                qlo1.d(j2);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new pyi();
                }
                qlo1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new pyi();
                }
                qlo1.a(c);
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new pyh();
                }
                qlo1.a(d);
                break;

            case 41: // ')'
                int l1 = qmb.b(qlo1, 41);
                double ad[];
                int l;
                if (e == null)
                {
                    l = 0;
                } else
                {
                    l = e.length;
                }
                ad = new double[l1 + l];
                l1 = l;
                if (l != 0)
                {
                    System.arraycopy(e, 0, ad, 0, l);
                    l1 = l;
                }
                for (; l1 < ad.length - 1; l1++)
                {
                    ad[l1] = Double.longBitsToDouble(qlo1.l());
                    qlo1.a();
                }

                ad[l1] = Double.longBitsToDouble(qlo1.l());
                e = ad;
                break;

            case 42: // '*'
                int i1 = qlo1.i();
                int k2 = qlo1.c(i1);
                int i2 = i1 / 8;
                double ad1[];
                if (e == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = e.length;
                }
                ad1 = new double[i2 + i1];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(e, 0, ad1, 0, i1);
                    i2 = i1;
                }
                for (; i2 < ad1.length; i2++)
                {
                    ad1[i2] = Double.longBitsToDouble(qlo1.l());
                }

                e = ad1;
                qlo1.d(k2);
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new pxt();
                }
                qlo1.a(f);
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
                qlp1.a(1, a[i]);
            }

        }
        if (b != null)
        {
            qlp1.a(2, b);
        }
        if (c != null)
        {
            qlp1.a(3, c);
        }
        if (d != null)
        {
            qlp1.a(4, d);
        }
        if (e != null && e.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < e.length; j++)
            {
                qlp1.a(5, e[j]);
            }

        }
        if (f != null)
        {
            qlp1.a(6, f);
        }
        super.a(qlp1);
    }
}
