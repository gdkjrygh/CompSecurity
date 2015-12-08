// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class phx extends qlq
{

    public phy a[];
    private int b[];

    public phx()
    {
        a = phy.b();
        b = qmb.a;
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
                    phy phy1 = a[j];
                    int k = i;
                    if (phy1 != null)
                    {
                        k = i + qlp.c(1, phy1);
                    }
                    j++;
                    i = k;
                }

            }
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < b.length; j++)
                {
                    l += qlp.b(b[j]);
                }

                j = i + l + b.length * 1;
            }
        }
        return j;
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
                phy aphy[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aphy = new phy[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aphy, 0, j);
                    i1 = j;
                }
                for (; i1 < aphy.length - 1; i1++)
                {
                    aphy[i1] = new phy();
                    qlo1.a(aphy[i1]);
                    qlo1.a();
                }

                aphy[i1] = new phy();
                qlo1.a(aphy[i1]);
                a = aphy;
                break;

            case 16: // '\020'
                int j1 = qmb.b(qlo1, 16);
                int ai[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                ai = new int[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, ai, 0, k);
                    j1 = k;
                }
                for (; j1 < ai.length - 1; j1++)
                {
                    ai[j1] = qlo1.i();
                    qlo1.a();
                }

                ai[j1] = qlo1.i();
                b = ai;
                break;

            case 18: // '\022'
                int l1 = qlo1.c(qlo1.i());
                int l = qlo1.o();
                int k1;
                for (k1 = 0; qlo1.m() > 0; k1++)
                {
                    qlo1.i();
                }

                qlo1.e(l);
                int ai1[];
                if (b == null)
                {
                    l = 0;
                } else
                {
                    l = b.length;
                }
                ai1 = new int[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(b, 0, ai1, 0, l);
                    k1 = l;
                }
                for (; k1 < ai1.length; k1++)
                {
                    ai1[k1] = qlo1.i();
                }

                b = ai1;
                qlo1.d(l1);
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
                phy phy1 = a[i];
                if (phy1 != null)
                {
                    qlp1.a(1, phy1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                qlp1.a(2, b[j]);
            }

        }
        super.a(qlp1);
    }
}
