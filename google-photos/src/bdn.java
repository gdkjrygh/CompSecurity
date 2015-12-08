// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bdn extends qlq
{

    private pvq a[];
    private Integer b;

    public bdn()
    {
        a = pvq.b();
        b = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int i = super.a();
        int j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= a.length)
                    {
                        break;
                    }
                    pvq pvq1 = a[k];
                    j = i;
                    if (pvq1 != null)
                    {
                        j = i + qlp.c(1, pvq1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + qlp.e(2, b.intValue());
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
                int k = qmb.b(qlo1, 10);
                pvq apvq[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                apvq = new pvq[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, apvq, 0, j);
                    k = j;
                }
                for (; k < apvq.length - 1; k++)
                {
                    apvq[k] = new pvq();
                    qlo1.a(apvq[k]);
                    qlo1.a();
                }

                apvq[k] = new pvq();
                qlo1.a(apvq[k]);
                a = apvq;
                break;

            case 16: // '\020'
                b = Integer.valueOf(qlo1.i());
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                pvq pvq1 = a[i];
                if (pvq1 != null)
                {
                    qlp1.a(1, pvq1);
                }
            }

        }
        if (b != null)
        {
            qlp1.a(2, b.intValue());
        }
        super.a(qlp1);
    }
}
