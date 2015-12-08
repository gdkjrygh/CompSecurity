// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class poj extends qlq
{

    private int a[];
    private int b[];
    private int c[];

    public poj()
    {
        a = qmb.a;
        b = qmb.a;
        c = qmb.a;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int l = super.a();
        int i;
        int k;
        if (a != null && a.length > 0)
        {
            i = 0;
            int j = 0;
            for (; i < a.length; i++)
            {
                j += qlp.b(a[i]);
            }

            i = l + j + a.length * 1;
        } else
        {
            i = l;
        }
        k = i;
        if (b != null)
        {
            k = i;
            if (b.length > 0)
            {
                k = 0;
                l = 0;
                for (; k < b.length; k++)
                {
                    l += qlp.b(b[k]);
                }

                k = i + l + b.length * 1;
            }
        }
        i = k;
        if (c != null)
        {
            i = k;
            if (c.length > 0)
            {
                l = 0;
                for (i = ((flag) ? 1 : 0); i < c.length; i++)
                {
                    l += qlp.b(c[i]);
                }

                i = k + l + c.length * 1;
            }
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
                int l1 = qmb.b(qlo1, 8);
                int ai[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                ai = new int[l1 + j];
                l1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, ai, 0, j);
                    l1 = j;
                }
                for (; l1 < ai.length - 1; l1++)
                {
                    ai[l1] = qlo1.i();
                    qlo1.a();
                }

                ai[l1] = qlo1.i();
                a = ai;
                break;

            case 10: // '\n'
                int j3 = qlo1.c(qlo1.i());
                int k = qlo1.o();
                int i2;
                for (i2 = 0; qlo1.m() > 0; i2++)
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
                ai1 = new int[i2 + k];
                i2 = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, ai1, 0, k);
                    i2 = k;
                }
                for (; i2 < ai1.length; i2++)
                {
                    ai1[i2] = qlo1.i();
                }

                a = ai1;
                qlo1.d(j3);
                break;

            case 16: // '\020'
                int j2 = qmb.b(qlo1, 16);
                int ai2[];
                int l;
                if (b == null)
                {
                    l = 0;
                } else
                {
                    l = b.length;
                }
                ai2 = new int[j2 + l];
                j2 = l;
                if (l != 0)
                {
                    System.arraycopy(b, 0, ai2, 0, l);
                    j2 = l;
                }
                for (; j2 < ai2.length - 1; j2++)
                {
                    ai2[j2] = qlo1.i();
                    qlo1.a();
                }

                ai2[j2] = qlo1.i();
                b = ai2;
                break;

            case 18: // '\022'
                int k3 = qlo1.c(qlo1.i());
                int i1 = qlo1.o();
                int k2;
                for (k2 = 0; qlo1.m() > 0; k2++)
                {
                    qlo1.i();
                }

                qlo1.e(i1);
                int ai3[];
                if (b == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = b.length;
                }
                ai3 = new int[k2 + i1];
                k2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(b, 0, ai3, 0, i1);
                    k2 = i1;
                }
                for (; k2 < ai3.length; k2++)
                {
                    ai3[k2] = qlo1.i();
                }

                b = ai3;
                qlo1.d(k3);
                break;

            case 24: // '\030'
                int l2 = qmb.b(qlo1, 24);
                int ai4[];
                int j1;
                if (c == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = c.length;
                }
                ai4 = new int[l2 + j1];
                l2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(c, 0, ai4, 0, j1);
                    l2 = j1;
                }
                for (; l2 < ai4.length - 1; l2++)
                {
                    ai4[l2] = qlo1.i();
                    qlo1.a();
                }

                ai4[l2] = qlo1.i();
                c = ai4;
                break;

            case 26: // '\032'
                int l3 = qlo1.c(qlo1.i());
                int k1 = qlo1.o();
                int i3;
                for (i3 = 0; qlo1.m() > 0; i3++)
                {
                    qlo1.i();
                }

                qlo1.e(k1);
                int ai5[];
                if (c == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = c.length;
                }
                ai5 = new int[i3 + k1];
                i3 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(c, 0, ai5, 0, k1);
                    i3 = k1;
                }
                for (; i3 < ai5.length; i3++)
                {
                    ai5[i3] = qlo1.i();
                }

                c = ai5;
                qlo1.d(l3);
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
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                qlp1.a(2, b[j]);
            }

        }
        if (c != null && c.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < c.length; k++)
            {
                qlp1.a(3, c[k]);
            }

        }
        super.a(qlp1);
    }
}
