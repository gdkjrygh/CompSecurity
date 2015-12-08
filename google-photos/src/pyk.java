// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pyk extends qlq
{

    public pyj a;
    public pyg b[];

    public pyk()
    {
        a = null;
        b = pyg.b();
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (a != null)
        {
            i = j + qlp.c(2, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    pyg pyg1 = b[j];
                    int k = i;
                    if (pyg1 != null)
                    {
                        k = i + qlp.c(3, pyg1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        return j;
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

            case 18: // '\022'
                if (a == null)
                {
                    a = new pyj();
                }
                qlo1.a(a);
                break;

            case 26: // '\032'
                int k = qmb.b(qlo1, 26);
                pyg apyg[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                apyg = new pyg[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, apyg, 0, j);
                    k = j;
                }
                for (; k < apyg.length - 1; k++)
                {
                    apyg[k] = new pyg();
                    qlo1.a(apyg[k]);
                    qlo1.a();
                }

                apyg[k] = new pyg();
                qlo1.a(apyg[k]);
                b = apyg;
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(2, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                pyg pyg1 = b[i];
                if (pyg1 != null)
                {
                    qlp1.a(3, pyg1);
                }
            }

        }
        super.a(qlp1);
    }
}
