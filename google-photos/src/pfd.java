// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pfd extends qlq
{

    public Float a;
    public Float b;
    public Float c;
    public Float d;

    public pfd()
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
        if (a != null)
        {
            a.floatValue();
            i = j + (qlp.c(5) + 4);
        }
        j = i;
        if (b != null)
        {
            b.floatValue();
            j = i + (qlp.c(6) + 4);
        }
        i = j;
        if (c != null)
        {
            c.floatValue();
            i = j + (qlp.c(7) + 4);
        }
        j = i;
        if (d != null)
        {
            d.floatValue();
            j = i + (qlp.c(8) + 4);
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

            case 45: // '-'
                a = Float.valueOf(Float.intBitsToFloat(qlo1.k()));
                break;

            case 53: // '5'
                b = Float.valueOf(Float.intBitsToFloat(qlo1.k()));
                break;

            case 61: // '='
                c = Float.valueOf(Float.intBitsToFloat(qlo1.k()));
                break;

            case 69: // 'E'
                d = Float.valueOf(Float.intBitsToFloat(qlo1.k()));
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(5, a.floatValue());
        }
        if (b != null)
        {
            qlp1.a(6, b.floatValue());
        }
        if (c != null)
        {
            qlp1.a(7, c.floatValue());
        }
        if (d != null)
        {
            qlp1.a(8, d.floatValue());
        }
        super.a(qlp1);
    }
}
