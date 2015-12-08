// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class oxo extends qlq
{

    private Integer a;
    private oxp b[];
    private oxj c[];
    private oxq d;

    public oxo()
    {
        a = null;
        b = oxp.b();
        c = oxj.b();
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
            j = i + qlp.e(1, a.intValue());
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
                    oxp oxp1 = b[j];
                    int k = i;
                    if (oxp1 != null)
                    {
                        k = i + qlp.c(2, oxp1);
                    }
                    j++;
                    i = k;
                }

            }
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (l >= c.length)
                    {
                        break;
                    }
                    oxj oxj1 = c[l];
                    j = i;
                    if (oxj1 != null)
                    {
                        j = i + qlp.c(3, oxj1);
                    }
                    l++;
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

            case 8: // '\b'
                a = Integer.valueOf(qlo1.i());
                break;

            case 18: // '\022'
                int l = qmb.b(qlo1, 18);
                oxp aoxp[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aoxp = new oxp[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aoxp, 0, j);
                    l = j;
                }
                for (; l < aoxp.length - 1; l++)
                {
                    aoxp[l] = new oxp();
                    qlo1.a(aoxp[l]);
                    qlo1.a();
                }

                aoxp[l] = new oxp();
                qlo1.a(aoxp[l]);
                b = aoxp;
                break;

            case 26: // '\032'
                int i1 = qmb.b(qlo1, 26);
                oxj aoxj[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                aoxj = new oxj[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, aoxj, 0, k);
                    i1 = k;
                }
                for (; i1 < aoxj.length - 1; i1++)
                {
                    aoxj[i1] = new oxj();
                    qlo1.a(aoxj[i1]);
                    qlo1.a();
                }

                aoxj[i1] = new oxj();
                qlo1.a(aoxj[i1]);
                c = aoxj;
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new oxq();
                }
                qlo1.a(d);
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (a != null)
        {
            qlp1.a(1, a.intValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                oxp oxp1 = b[i];
                if (oxp1 != null)
                {
                    qlp1.a(2, oxp1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                oxj oxj1 = c[j];
                if (oxj1 != null)
                {
                    qlp1.a(3, oxj1);
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
