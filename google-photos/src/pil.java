// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pil extends qlq
{

    private pim a[];

    public pil()
    {
        a = pim.b();
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int i = super.a();
        int k = i;
        if (a != null)
        {
            k = i;
            if (a.length > 0)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= a.length)
                    {
                        break;
                    }
                    pim pim1 = a[j];
                    k = i;
                    if (pim1 != null)
                    {
                        k = i + qlp.c(4, pim1);
                    }
                    j++;
                    i = k;
                } while (true);
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
                if (super.a(qlo1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 34: // '"'
                int k = qmb.b(qlo1, 34);
                pim apim[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                apim = new pim[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, apim, 0, j);
                    k = j;
                }
                for (; k < apim.length - 1; k++)
                {
                    apim[k] = new pim();
                    qlo1.a(apim[k]);
                    qlo1.a();
                }

                apim[k] = new pim();
                qlo1.a(apim[k]);
                a = apim;
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
                pim pim1 = a[i];
                if (pim1 != null)
                {
                    qlp1.a(4, pim1);
                }
            }

        }
        super.a(qlp1);
    }
}
