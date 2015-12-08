// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pxn extends qlq
{

    public pxm a;
    private pxp b[];

    public pxn()
    {
        b = pxp.b();
        a = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int i = super.a();
        int j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= b.length)
                    {
                        break;
                    }
                    pxp pxp1 = b[k];
                    j = i;
                    if (pxp1 != null)
                    {
                        j = i + qlp.c(1, pxp1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (a != null)
        {
            i = j + qlp.c(2, a);
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
                pxp apxp[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                apxp = new pxp[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, apxp, 0, j);
                    k = j;
                }
                for (; k < apxp.length - 1; k++)
                {
                    apxp[k] = new pxp();
                    qlo1.a(apxp[k]);
                    qlo1.a();
                }

                apxp[k] = new pxp();
                qlo1.a(apxp[k]);
                b = apxp;
                break;

            case 18: // '\022'
                if (a == null)
                {
                    a = new pxm();
                }
                qlo1.a(a);
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                pxp pxp1 = b[i];
                if (pxp1 != null)
                {
                    qlp1.a(1, pxp1);
                }
            }

        }
        if (a != null)
        {
            qlp1.a(2, a);
        }
        super.a(qlp1);
    }
}
