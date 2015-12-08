// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pxm extends qlq
{

    public pxo a[];

    public pxm()
    {
        a = pxo.b();
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
                    pxo pxo1 = a[j];
                    k = i;
                    if (pxo1 != null)
                    {
                        k = i + qlp.c(1, pxo1);
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

            case 10: // '\n'
                int k = qmb.b(qlo1, 10);
                pxo apxo[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                apxo = new pxo[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, apxo, 0, j);
                    k = j;
                }
                for (; k < apxo.length - 1; k++)
                {
                    apxo[k] = new pxo();
                    qlo1.a(apxo[k]);
                    qlo1.a();
                }

                apxo[k] = new pxo();
                qlo1.a(apxo[k]);
                a = apxo;
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
                pxo pxo1 = a[i];
                if (pxo1 != null)
                {
                    qlp1.a(1, pxo1);
                }
            }

        }
        super.a(qlp1);
    }
}
