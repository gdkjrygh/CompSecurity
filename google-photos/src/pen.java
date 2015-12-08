// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pen extends qlq
{

    public pep a[];
    private pel b;
    private Boolean c;

    public pen()
    {
        a = pep.b();
        b = null;
        c = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int i = super.a();
        int j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= a.length)
                    {
                        break;
                    }
                    pep pep1 = a[k];
                    j = i;
                    if (pep1 != null)
                    {
                        j = i + qlp.c(1, pep1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + qlp.c(2, b);
        }
        j = i;
        if (c != null)
        {
            c.booleanValue();
            j = i + (qlp.c(3) + 1);
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
                int k = qmb.b(qlo1, 10);
                pep apep[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                apep = new pep[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, apep, 0, j);
                    k = j;
                }
                for (; k < apep.length - 1; k++)
                {
                    apep[k] = new pep();
                    qlo1.a(apep[k]);
                    qlo1.a();
                }

                apep[k] = new pep();
                qlo1.a(apep[k]);
                a = apep;
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new pel();
                }
                qlo1.a(b);
                break;

            case 24: // '\030'
                c = Boolean.valueOf(qlo1.f());
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
                pep pep1 = a[i];
                if (pep1 != null)
                {
                    qlp1.a(1, pep1);
                }
            }

        }
        if (b != null)
        {
            qlp1.a(2, b);
        }
        if (c != null)
        {
            qlp1.a(3, c.booleanValue());
        }
        super.a(qlp1);
    }
}
