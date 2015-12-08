// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pnr extends qlq
{

    public pns a;
    public pyp b;
    private qov c[];
    private String d;

    public pnr()
    {
        a = null;
        c = qov.b();
        d = null;
        b = null;
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
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    qov qov1 = c[j];
                    int k = i;
                    if (qov1 != null)
                    {
                        k = i + qlp.c(2, qov1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.b(3, d);
        }
        j = i;
        if (b != null)
        {
            j = i + qlp.c(4, b);
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
                    a = new pns();
                }
                qlo1.a(a);
                break;

            case 18: // '\022'
                int k = qmb.b(qlo1, 18);
                qov aqov[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                aqov = new qov[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, aqov, 0, j);
                    k = j;
                }
                for (; k < aqov.length - 1; k++)
                {
                    aqov[k] = new qov();
                    qlo1.a(aqov[k]);
                    qlo1.a();
                }

                aqov[k] = new qov();
                qlo1.a(aqov[k]);
                c = aqov;
                break;

            case 26: // '\032'
                d = qlo1.g();
                break;

            case 34: // '"'
                if (b == null)
                {
                    b = new pyp();
                }
                qlo1.a(b);
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
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                qov qov1 = c[i];
                if (qov1 != null)
                {
                    qlp1.a(2, qov1);
                }
            }

        }
        if (d != null)
        {
            qlp1.a(3, d);
        }
        if (b != null)
        {
            qlp1.a(4, b);
        }
        super.a(qlp1);
    }
}
