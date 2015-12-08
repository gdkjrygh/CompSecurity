// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cvk extends qlw
{

    public cvj a[];

    public cvk()
    {
        a = cvj.b();
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
                    cvj cvj1 = a[j];
                    k = i;
                    if (cvj1 != null)
                    {
                        k = i + qlp.c(1, cvj1);
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
                if (qmb.a(qlo1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int k = qmb.b(qlo1, 10);
                cvj acvj[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                acvj = new cvj[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, acvj, 0, j);
                    k = j;
                }
                for (; k < acvj.length - 1; k++)
                {
                    acvj[k] = new cvj();
                    qlo1.a(acvj[k]);
                    qlo1.a();
                }

                acvj[k] = new cvj();
                qlo1.a(acvj[k]);
                a = acvj;
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
                cvj cvj1 = a[i];
                if (cvj1 != null)
                {
                    qlp1.a(1, cvj1);
                }
            }

        }
        super.a(qlp1);
    }
}
