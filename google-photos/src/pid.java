// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pid extends qlq
{

    public oyi a[];
    public pie b;
    public Long c;

    public pid()
    {
        a = oyi.b();
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
                    oyi oyi1 = a[k];
                    j = i;
                    if (oyi1 != null)
                    {
                        j = i + qlp.c(1, oyi1);
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
            j = i + qlp.d(3, c.longValue());
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
                oyi aoyi[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aoyi = new oyi[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aoyi, 0, j);
                    k = j;
                }
                for (; k < aoyi.length - 1; k++)
                {
                    aoyi[k] = new oyi();
                    qlo1.a(aoyi[k]);
                    qlo1.a();
                }

                aoyi[k] = new oyi();
                qlo1.a(aoyi[k]);
                a = aoyi;
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new pie();
                }
                qlo1.a(b);
                break;

            case 24: // '\030'
                c = Long.valueOf(qlo1.j());
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
                oyi oyi1 = a[i];
                if (oyi1 != null)
                {
                    qlp1.a(1, oyi1);
                }
            }

        }
        if (b != null)
        {
            qlp1.a(2, b);
        }
        if (c != null)
        {
            qlp1.a(3, c.longValue());
        }
        super.a(qlp1);
    }
}
