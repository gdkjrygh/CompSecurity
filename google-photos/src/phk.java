// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class phk extends qlq
{

    private phi a[];
    private phj b[];
    private Integer c;

    public phk()
    {
        a = phi.b();
        b = phj.b();
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
                    phi phi1 = a[j];
                    int k = i;
                    if (phi1 != null)
                    {
                        k = i + qlp.c(1, phi1);
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
                    phj phj1 = b[l];
                    j = i;
                    if (phj1 != null)
                    {
                        j = i + qlp.c(2, phj1);
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
                phi aphi[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aphi = new phi[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aphi, 0, j);
                    l = j;
                }
                for (; l < aphi.length - 1; l++)
                {
                    aphi[l] = new phi();
                    qlo1.a(aphi[l]);
                    qlo1.a();
                }

                aphi[l] = new phi();
                qlo1.a(aphi[l]);
                a = aphi;
                break;

            case 18: // '\022'
                int i1 = qmb.b(qlo1, 18);
                phj aphj[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                aphj = new phj[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, aphj, 0, k);
                    i1 = k;
                }
                for (; i1 < aphj.length - 1; i1++)
                {
                    aphj[i1] = new phj();
                    qlo1.a(aphj[i1]);
                    qlo1.a();
                }

                aphj[i1] = new phj();
                qlo1.a(aphj[i1]);
                b = aphj;
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
                phi phi1 = a[i];
                if (phi1 != null)
                {
                    qlp1.a(1, phi1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                phj phj1 = b[j];
                if (phj1 != null)
                {
                    qlp1.a(2, phj1);
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
