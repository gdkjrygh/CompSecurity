// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class phu extends qlq
{

    public phv a[];
    private phw b[];

    public phu()
    {
        b = phw.b();
        a = phv.b();
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
            i = j;
            if (b.length > 0)
            {
                i = j;
                for (int k = 0; k < b.length;)
                {
                    phw phw1 = b[k];
                    int i1 = i;
                    if (phw1 != null)
                    {
                        i1 = i + qlp.b(1, phw1);
                    }
                    k++;
                    i = i1;
                }

            }
        }
        int j1 = i;
        if (a != null)
        {
            j1 = i;
            if (a.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j1 = i;
                    if (l >= a.length)
                    {
                        break;
                    }
                    phv phv1 = a[l];
                    j1 = i;
                    if (phv1 != null)
                    {
                        j1 = i + qlp.c(3, phv1);
                    }
                    l++;
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

            case 11: // '\013'
                int l = qmb.b(qlo1, 11);
                phw aphw[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aphw = new phw[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aphw, 0, j);
                    l = j;
                }
                for (; l < aphw.length - 1; l++)
                {
                    aphw[l] = new phw();
                    qlo1.a(aphw[l], 1);
                    qlo1.a();
                }

                aphw[l] = new phw();
                qlo1.a(aphw[l], 1);
                b = aphw;
                break;

            case 26: // '\032'
                int i1 = qmb.b(qlo1, 26);
                phv aphv[];
                int k;
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                aphv = new phv[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, aphv, 0, k);
                    i1 = k;
                }
                for (; i1 < aphv.length - 1; i1++)
                {
                    aphv[i1] = new phv();
                    qlo1.a(aphv[i1]);
                    qlo1.a();
                }

                aphv[i1] = new phv();
                qlo1.a(aphv[i1]);
                a = aphv;
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                phw phw1 = b[i];
                if (phw1 != null)
                {
                    qlp1.g(1, 3);
                    phw1.a(qlp1);
                    qlp1.g(1, 4);
                }
            }

        }
        if (a != null && a.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < a.length; j++)
            {
                phv phv1 = a[j];
                if (phv1 != null)
                {
                    qlp1.a(3, phv1);
                }
            }

        }
        super.a(qlp1);
    }
}
