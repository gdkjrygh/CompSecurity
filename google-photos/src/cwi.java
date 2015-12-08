// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cwi extends qlw
{

    public long a[];
    public long b[];

    public cwi()
    {
        a = qmb.b;
        b = qmb.b;
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
                j += qlp.a(a[i]);
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
                l = 0;
                for (k = ((flag) ? 1 : 0); k < b.length; k++)
                {
                    l += qlp.a(b[k]);
                }

                k = i + l + b.length * 1;
            }
        }
        return k;
    }

    public final qlw a(qlo qlo1)
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
                int j1 = qmb.b(qlo1, 8);
                long al[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                al = new long[j1 + j];
                j1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, al, 0, j);
                    j1 = j;
                }
                for (; j1 < al.length - 1; j1++)
                {
                    al[j1] = qlo1.j();
                    qlo1.a();
                }

                al[j1] = qlo1.j();
                a = al;
                break;

            case 10: // '\n'
                int j2 = qlo1.c(qlo1.i());
                int k = qlo1.o();
                int k1;
                for (k1 = 0; qlo1.m() > 0; k1++)
                {
                    qlo1.j();
                }

                qlo1.e(k);
                long al1[];
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                al1 = new long[k1 + k];
                k1 = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, al1, 0, k);
                    k1 = k;
                }
                for (; k1 < al1.length; k1++)
                {
                    al1[k1] = qlo1.j();
                }

                a = al1;
                qlo1.d(j2);
                break;

            case 16: // '\020'
                int l1 = qmb.b(qlo1, 16);
                long al2[];
                int l;
                if (b == null)
                {
                    l = 0;
                } else
                {
                    l = b.length;
                }
                al2 = new long[l1 + l];
                l1 = l;
                if (l != 0)
                {
                    System.arraycopy(b, 0, al2, 0, l);
                    l1 = l;
                }
                for (; l1 < al2.length - 1; l1++)
                {
                    al2[l1] = qlo1.j();
                    qlo1.a();
                }

                al2[l1] = qlo1.j();
                b = al2;
                break;

            case 18: // '\022'
                int k2 = qlo1.c(qlo1.i());
                int i1 = qlo1.o();
                int i2;
                for (i2 = 0; qlo1.m() > 0; i2++)
                {
                    qlo1.j();
                }

                qlo1.e(i1);
                long al3[];
                if (b == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = b.length;
                }
                al3 = new long[i2 + i1];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(b, 0, al3, 0, i1);
                    i2 = i1;
                }
                for (; i2 < al3.length; i2++)
                {
                    al3[i2] = qlo1.j();
                }

                b = al3;
                qlo1.d(k2);
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
                qlp1.b(1, a[i]);
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                qlp1.b(2, b[j]);
            }

        }
        super.a(qlp1);
    }
}
