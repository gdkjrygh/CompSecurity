// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cwe extends qlw
{

    public cvw a[];

    public cwe()
    {
        a = cvw.b();
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
                    cvw cvw1 = a[j];
                    k = i;
                    if (cvw1 != null)
                    {
                        k = i + qlp.c(1, cvw1);
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
                cvw acvw[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                acvw = new cvw[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, acvw, 0, j);
                    k = j;
                }
                for (; k < acvw.length - 1; k++)
                {
                    acvw[k] = new cvw();
                    qlo1.a(acvw[k]);
                    qlo1.a();
                }

                acvw[k] = new cvw();
                qlo1.a(acvw[k]);
                a = acvw;
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
                cvw cvw1 = a[i];
                if (cvw1 != null)
                {
                    qlp1.a(1, cvw1);
                }
            }

        }
        super.a(qlp1);
    }
}
