// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pog extends qlq
{

    private Double a;
    private Double b;
    private Double c;
    private Double d;
    private Double e;
    private Boolean f;

    public pog()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int i = super.a();
        a.doubleValue();
        int j = qlp.c(1);
        b.doubleValue();
        j = i + (j + 8) + (qlp.c(2) + 8);
        i = j;
        if (c != null)
        {
            c.doubleValue();
            i = j + (qlp.c(3) + 8);
        }
        j = i;
        if (d != null)
        {
            d.doubleValue();
            j = i + (qlp.c(4) + 8);
        }
        i = j;
        if (e != null)
        {
            e.doubleValue();
            i = j + (qlp.c(5) + 8);
        }
        j = i;
        if (f != null)
        {
            f.booleanValue();
            j = i + (qlp.c(6) + 1);
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

            case 9: // '\t'
                a = Double.valueOf(Double.longBitsToDouble(qlo1.l()));
                break;

            case 17: // '\021'
                b = Double.valueOf(Double.longBitsToDouble(qlo1.l()));
                break;

            case 25: // '\031'
                c = Double.valueOf(Double.longBitsToDouble(qlo1.l()));
                break;

            case 33: // '!'
                d = Double.valueOf(Double.longBitsToDouble(qlo1.l()));
                break;

            case 41: // ')'
                e = Double.valueOf(Double.longBitsToDouble(qlo1.l()));
                break;

            case 48: // '0'
                f = Boolean.valueOf(qlo1.f());
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        qlp1.a(1, a.doubleValue());
        qlp1.a(2, b.doubleValue());
        if (c != null)
        {
            qlp1.a(3, c.doubleValue());
        }
        if (d != null)
        {
            qlp1.a(4, d.doubleValue());
        }
        if (e != null)
        {
            qlp1.a(5, e.doubleValue());
        }
        if (f != null)
        {
            qlp1.a(6, f.booleanValue());
        }
        super.a(qlp1);
    }
}
