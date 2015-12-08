// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pgc extends qlq
{

    public pgd a[];
    public pfx b[];
    public Integer c;

    public pgc()
    {
        a = pgd.b();
        b = pfx.b();
        c = null;
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
                    pgd pgd1 = a[j];
                    int k = i;
                    if (pgd1 != null)
                    {
                        k = i + qlp.c(1, pgd1);
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
                int l = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (l >= b.length)
                    {
                        break;
                    }
                    pfx pfx1 = b[l];
                    j = i;
                    if (pfx1 != null)
                    {
                        j = i + qlp.c(2, pfx1);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.e(3, c.intValue());
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

            case 10: // '\n'
                int l = qmb.b(qlo1, 10);
                pgd apgd[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                apgd = new pgd[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, apgd, 0, j);
                    l = j;
                }
                for (; l < apgd.length - 1; l++)
                {
                    apgd[l] = new pgd();
                    qlo1.a(apgd[l]);
                    qlo1.a();
                }

                apgd[l] = new pgd();
                qlo1.a(apgd[l]);
                a = apgd;
                break;

            case 18: // '\022'
                int i1 = qmb.b(qlo1, 18);
                pfx apfx[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                apfx = new pfx[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, apfx, 0, k);
                    i1 = k;
                }
                for (; i1 < apfx.length - 1; i1++)
                {
                    apfx[i1] = new pfx();
                    qlo1.a(apfx[i1]);
                    qlo1.a();
                }

                apfx[i1] = new pfx();
                qlo1.a(apfx[i1]);
                b = apfx;
                break;

            case 24: // '\030'
                c = Integer.valueOf(qlo1.i());
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
                pgd pgd1 = a[i];
                if (pgd1 != null)
                {
                    qlp1.a(1, pgd1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                pfx pfx1 = b[j];
                if (pfx1 != null)
                {
                    qlp1.a(2, pfx1);
                }
            }

        }
        if (c != null)
        {
            qlp1.a(3, c.intValue());
        }
        super.a(qlp1);
    }
}
