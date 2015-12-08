// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pke extends qlq
{

    private pkd a[];

    public pke()
    {
        a = pkd.b();
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
                    pkd pkd1 = a[j];
                    k = i;
                    if (pkd1 != null)
                    {
                        k = i + qlp.c(1, pkd1);
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
                pkd apkd[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                apkd = new pkd[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, apkd, 0, j);
                    k = j;
                }
                for (; k < apkd.length - 1; k++)
                {
                    apkd[k] = new pkd();
                    qlo1.a(apkd[k]);
                    qlo1.a();
                }

                apkd[k] = new pkd();
                qlo1.a(apkd[k]);
                a = apkd;
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
                pkd pkd1 = a[i];
                if (pkd1 != null)
                {
                    qlp1.a(1, pkd1);
                }
            }

        }
        super.a(qlp1);
    }
}
