// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pqm extends qlq
{

    private pqb a;
    private pqn b;
    private pqb c[];

    public pqm()
    {
        a = null;
        b = null;
        c = pqb.b();
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int i = super.a();
        int j = i;
        if (a != null)
        {
            j = i + qlp.c(1, a);
        }
        i = j;
        if (b != null)
        {
            i = j + qlp.c(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    pqb pqb1 = c[j];
                    int k = i;
                    if (pqb1 != null)
                    {
                        k = i + qlp.c(3, pqb1);
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

            case 10: // '\n'
                if (a == null)
                {
                    a = new pqb();
                }
                qlo1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new pqn();
                }
                qlo1.a(b);
                break;

            case 26: // '\032'
                int k = qmb.b(qlo1, 26);
                pqb apqb[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                apqb = new pqb[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, apqb, 0, j);
                    k = j;
                }
                for (; k < apqb.length - 1; k++)
                {
                    apqb[k] = new pqb();
                    qlo1.a(apqb[k]);
                    qlo1.a();
                }

                apqb[k] = new pqb();
                qlo1.a(apqb[k]);
                c = apqb;
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(1, a);
        }
        if (b != null)
        {
            qlp1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                pqb pqb1 = c[i];
                if (pqb1 != null)
                {
                    qlp1.a(3, pqb1);
                }
            }

        }
        super.a(qlp1);
    }
}
