// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pkj extends qlq
{

    public String a;
    public pkn b;
    private pjd c;
    private pju d[];
    private Boolean e;

    public pkj()
    {
        a = null;
        c = null;
        d = pju.b();
        e = null;
        b = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int i = super.a();
        int j = i;
        if (a != null)
        {
            j = i + qlp.b(1, a);
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.c(2, c);
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                for (j = 0; j < d.length;)
                {
                    pju pju1 = d[j];
                    int k = i;
                    if (pju1 != null)
                    {
                        k = i + qlp.c(3, pju1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (e != null)
        {
            e.booleanValue();
            i = j + (qlp.c(4) + 1);
        }
        j = i;
        if (b != null)
        {
            j = i + qlp.c(5, b);
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
                    c = new pjd();
                }
                qlo1.a(c);
                break;

            case 26: // '\032'
                int k = qmb.b(qlo1, 26);
                pju apju[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                apju = new pju[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, apju, 0, j);
                    k = j;
                }
                for (; k < apju.length - 1; k++)
                {
                    apju[k] = new pju();
                    qlo1.a(apju[k]);
                    qlo1.a();
                }

                apju[k] = new pju();
                qlo1.a(apju[k]);
                d = apju;
                break;

            case 32: // ' '
                e = Boolean.valueOf(qlo1.f());
                break;

            case 42: // '*'
                if (b == null)
                {
                    b = new pkn();
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
        if (c != null)
        {
            qlp1.a(2, c);
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                pju pju1 = d[i];
                if (pju1 != null)
                {
                    qlp1.a(3, pju1);
                }
            }

        }
        if (e != null)
        {
            qlp1.a(4, e.booleanValue());
        }
        if (b != null)
        {
            qlp1.a(5, b);
        }
        super.a(qlp1);
    }
}
