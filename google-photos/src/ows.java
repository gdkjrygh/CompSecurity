// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ows extends qlq
{

    public oww a;
    public owy b[];

    public ows()
    {
        a = null;
        b = owy.b();
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (a != null)
        {
            i = j + qlp.c(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    owy owy1 = b[j];
                    int k = i;
                    if (owy1 != null)
                    {
                        k = i + qlp.c(2, owy1);
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
                    a = new oww();
                }
                qlo1.a(a);
                break;

            case 18: // '\022'
                int k = qmb.b(qlo1, 18);
                owy aowy[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aowy = new owy[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aowy, 0, j);
                    k = j;
                }
                for (; k < aowy.length - 1; k++)
                {
                    aowy[k] = new owy();
                    qlo1.a(aowy[k]);
                    qlo1.a();
                }

                aowy[k] = new owy();
                qlo1.a(aowy[k]);
                b = aowy;
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
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                owy owy1 = b[i];
                if (owy1 != null)
                {
                    qlp1.a(2, owy1);
                }
            }

        }
        super.a(qlp1);
    }
}
