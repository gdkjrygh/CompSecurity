// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cvn extends qlw
{

    public int a[];
    public long b;
    public long c;
    public int d;
    public int e;
    private int f;

    public cvn()
    {
        f = 0;
        a = qmb.a;
        b = -1L;
        c = -1L;
        d = -1;
        e = -1;
        G = -1;
    }

    protected final int a()
    {
        int i = 0;
        int j = super.a();
        int k = qlp.e(1, f) + j;
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
        if (b != -1L)
        {
            i = j + qlp.e(3, b);
        }
        j = i;
        if (c != -1L)
        {
            j = i + qlp.e(4, c);
        }
        i = j;
        if (d != -1)
        {
            i = j + qlp.e(5, d);
        }
        j = i;
        if (e != -1)
        {
            j = i + qlp.e(6, e);
        }
        return j;
    }

    public final qlw a(qlo qlo1)
    {
        return b(qlo1);
    }

    public final void a(qlp qlp1)
    {
        qlp1.a(1, f);
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                qlp1.a(2, a[i]);
            }

        }
        if (b != -1L)
        {
            qlp1.b(3, b);
        }
        if (c != -1L)
        {
            qlp1.b(4, c);
        }
        if (d != -1)
        {
            qlp1.a(5, d);
        }
        if (e != -1)
        {
            qlp1.a(6, e);
        }
        super.a(qlp1);
    }

    public final cvn b(qlo qlo1)
    {
        do
        {
            int i = qlo1.a();
            switch (i)
            {
            default:
                if (qmb.a(qlo1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                f = qlo1.i();
                break;

            case 16: // '\020'
                int l = qmb.b(qlo1, 16);
                int ai[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                ai = new int[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, ai, 0, j);
                    l = j;
                }
                for (; l < ai.length - 1; l++)
                {
                    ai[l] = qlo1.i();
                    qlo1.a();
                }

                ai[l] = qlo1.i();
                a = ai;
                break;

            case 18: // '\022'
                int j1 = qlo1.c(qlo1.i());
                int k = qlo1.o();
                int i1;
                for (i1 = 0; qlo1.m() > 0; i1++)
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
                ai1 = new int[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, ai1, 0, k);
                    i1 = k;
                }
                for (; i1 < ai1.length; i1++)
                {
                    ai1[i1] = qlo1.i();
                }

                a = ai1;
                qlo1.d(j1);
                break;

            case 24: // '\030'
                b = qlo1.j();
                break;

            case 32: // ' '
                c = qlo1.j();
                break;

            case 40: // '('
                d = qlo1.i();
                break;

            case 48: // '0'
                e = qlo1.i();
                break;
            }
        } while (true);
    }
}
