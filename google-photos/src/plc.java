// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class plc extends qlq
{

    public String a;
    public qin b;
    private pzc c;
    private pld d[];

    public plc()
    {
        a = null;
        c = null;
        b = null;
        d = pld.b();
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (a != null)
        {
            i = j + qlp.b(1, a);
        }
        j = i;
        if (c != null)
        {
            j = i + qlp.c(2, c);
        }
        i = j;
        if (b != null)
        {
            i = j + qlp.c(3, b);
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                for (j = 0; j < d.length;)
                {
                    pld pld1 = d[j];
                    int k = i;
                    if (pld1 != null)
                    {
                        k = i + qlp.c(4, pld1);
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
                a = qlo1.g();
                break;

            case 18: // '\022'
                if (c == null)
                {
                    c = new pzc();
                }
                qlo1.a(c);
                break;

            case 26: // '\032'
                if (b == null)
                {
                    b = new qin();
                }
                qlo1.a(b);
                break;

            case 34: // '"'
                int k = qmb.b(qlo1, 34);
                pld apld[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                apld = new pld[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, apld, 0, j);
                    k = j;
                }
                for (; k < apld.length - 1; k++)
                {
                    apld[k] = new pld();
                    qlo1.a(apld[k]);
                    qlo1.a();
                }

                apld[k] = new pld();
                qlo1.a(apld[k]);
                d = apld;
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
        if (c != null)
        {
            qlp1.a(2, c);
        }
        if (b != null)
        {
            qlp1.a(3, b);
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                pld pld1 = d[i];
                if (pld1 != null)
                {
                    qlp1.a(4, pld1);
                }
            }

        }
        super.a(qlp1);
    }
}
