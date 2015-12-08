// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pra extends qlq
{

    private prd a[];
    private prd b;

    public pra()
    {
        a = prd.b();
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
                    prd prd1 = a[k];
                    j = i;
                    if (prd1 != null)
                    {
                        j = i + qlp.c(1, prd1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + qlp.c(2, b);
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
                prd aprd[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aprd = new prd[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aprd, 0, j);
                    k = j;
                }
                for (; k < aprd.length - 1; k++)
                {
                    aprd[k] = new prd();
                    qlo1.a(aprd[k]);
                    qlo1.a();
                }

                aprd[k] = new prd();
                qlo1.a(aprd[k]);
                a = aprd;
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new prd();
                }
                qlo1.a(b);
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
                prd prd1 = a[i];
                if (prd1 != null)
                {
                    qlp1.a(1, prd1);
                }
            }

        }
        if (b != null)
        {
            qlp1.a(2, b);
        }
        super.a(qlp1);
    }
}
