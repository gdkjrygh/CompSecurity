// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pec extends qlq
{

    public pdr a;
    public String b;
    public String c;
    public Boolean d;

    public pec()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (b != null)
        {
            i = j + qlp.b(1, b);
        }
        j = i;
        if (a != null)
        {
            j = i + qlp.c(8, a);
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.b(9, c);
        }
        j = i;
        if (d != null)
        {
            d.booleanValue();
            j = i + (qlp.c(10) + 1);
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
                b = qlo1.g();
                break;

            case 66: // 'B'
                if (a == null)
                {
                    a = new pdr();
                }
                qlo1.a(a);
                break;

            case 74: // 'J'
                c = qlo1.g();
                break;

            case 80: // 'P'
                d = Boolean.valueOf(qlo1.f());
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (b != null)
        {
            qlp1.a(1, b);
        }
        if (a != null)
        {
            qlp1.a(8, a);
        }
        if (c != null)
        {
            qlp1.a(9, c);
        }
        if (d != null)
        {
            qlp1.a(10, d.booleanValue());
        }
        super.a(qlp1);
    }
}
