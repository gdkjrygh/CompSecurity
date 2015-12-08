// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pmr extends qlq
{

    public Boolean a;
    public Boolean b;
    public pms c;
    public pms d[];
    public Boolean e;
    private Boolean f;

    public pmr()
    {
        a = null;
        b = null;
        c = null;
        d = pms.b();
        e = null;
        f = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (a != null)
        {
            a.booleanValue();
            i = j + (qlp.c(2) + 1);
        }
        j = i;
        if (b != null)
        {
            b.booleanValue();
            j = i + (qlp.c(3) + 1);
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.c(4, c);
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                for (j = 0; j < d.length;)
                {
                    pms pms1 = d[j];
                    int k = i;
                    if (pms1 != null)
                    {
                        k = i + qlp.c(5, pms1);
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
            i = j + (qlp.c(6) + 1);
        }
        j = i;
        if (f != null)
        {
            f.booleanValue();
            j = i + (qlp.c(7) + 1);
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

            case 16: // '\020'
                a = Boolean.valueOf(qlo1.f());
                break;

            case 24: // '\030'
                b = Boolean.valueOf(qlo1.f());
                break;

            case 34: // '"'
                if (c == null)
                {
                    c = new pms();
                }
                qlo1.a(c);
                break;

            case 42: // '*'
                int k = qmb.b(qlo1, 42);
                pms apms[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                apms = new pms[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, apms, 0, j);
                    k = j;
                }
                for (; k < apms.length - 1; k++)
                {
                    apms[k] = new pms();
                    qlo1.a(apms[k]);
                    qlo1.a();
                }

                apms[k] = new pms();
                qlo1.a(apms[k]);
                d = apms;
                break;

            case 48: // '0'
                e = Boolean.valueOf(qlo1.f());
                break;

            case 56: // '8'
                f = Boolean.valueOf(qlo1.f());
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(2, a.booleanValue());
        }
        if (b != null)
        {
            qlp1.a(3, b.booleanValue());
        }
        if (c != null)
        {
            qlp1.a(4, c);
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                pms pms1 = d[i];
                if (pms1 != null)
                {
                    qlp1.a(5, pms1);
                }
            }

        }
        if (e != null)
        {
            qlp1.a(6, e.booleanValue());
        }
        if (f != null)
        {
            qlp1.a(7, f.booleanValue());
        }
        super.a(qlp1);
    }
}
