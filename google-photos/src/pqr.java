// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pqr extends qlq
{

    private pqb a;
    private pqb b[];
    private pqn c;

    public pqr()
    {
        a = null;
        b = pqb.b();
        c = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (a != null)
        {
            i = j + qlp.c(4, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    pqb pqb1 = b[j];
                    int k = i;
                    if (pqb1 != null)
                    {
                        k = i + qlp.c(5, pqb1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.c(6, c);
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

            case 34: // '"'
                if (a == null)
                {
                    a = new pqb();
                }
                qlo1.a(a);
                break;

            case 42: // '*'
                int k = qmb.b(qlo1, 42);
                pqb apqb[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                apqb = new pqb[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, apqb, 0, j);
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
                b = apqb;
                break;

            case 50: // '2'
                if (c == null)
                {
                    c = new pqn();
                }
                qlo1.a(c);
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(4, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                pqb pqb1 = b[i];
                if (pqb1 != null)
                {
                    qlp1.a(5, pqb1);
                }
            }

        }
        if (c != null)
        {
            qlp1.a(6, c);
        }
        super.a(qlp1);
    }
}
