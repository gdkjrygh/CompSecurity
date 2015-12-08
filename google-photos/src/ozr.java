// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ozr extends qlq
{

    private ozp a[];

    public ozr()
    {
        a = ozp.b();
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
                    ozp ozp1 = a[j];
                    k = i;
                    if (ozp1 != null)
                    {
                        k = i + qlp.c(1, ozp1);
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
                ozp aozp[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aozp = new ozp[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aozp, 0, j);
                    k = j;
                }
                for (; k < aozp.length - 1; k++)
                {
                    aozp[k] = new ozp();
                    qlo1.a(aozp[k]);
                    qlo1.a();
                }

                aozp[k] = new ozp();
                qlo1.a(aozp[k]);
                a = aozp;
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
                ozp ozp1 = a[i];
                if (ozp1 != null)
                {
                    qlp1.a(1, ozp1);
                }
            }

        }
        super.a(qlp1);
    }
}
