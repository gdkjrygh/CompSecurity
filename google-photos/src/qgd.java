// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class qgd extends qlq
{

    public String a;
    public String b;
    public String c;
    public Float d;
    public Float e;
    public Integer f;
    public Float g;

    public qgd()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
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
        if (b != null)
        {
            j = i + qlp.b(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.b(3, c);
        }
        j = i;
        if (d != null)
        {
            d.floatValue();
            j = i + (qlp.c(4) + 4);
        }
        i = j;
        if (e != null)
        {
            e.floatValue();
            i = j + (qlp.c(5) + 4);
        }
        j = i;
        if (f != null)
        {
            j = i + qlp.e(6, f.intValue());
        }
        i = j;
        if (g != null)
        {
            g.floatValue();
            i = j + (qlp.c(7) + 4);
        }
        return i;
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
                b = qlo1.g();
                break;

            case 26: // '\032'
                c = qlo1.g();
                break;

            case 37: // '%'
                d = Float.valueOf(Float.intBitsToFloat(qlo1.k()));
                break;

            case 45: // '-'
                e = Float.valueOf(Float.intBitsToFloat(qlo1.k()));
                break;

            case 48: // '0'
                f = Integer.valueOf(qlo1.i());
                break;

            case 61: // '='
                g = Float.valueOf(Float.intBitsToFloat(qlo1.k()));
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
        if (b != null)
        {
            qlp1.a(2, b);
        }
        if (c != null)
        {
            qlp1.a(3, c);
        }
        if (d != null)
        {
            qlp1.a(4, d.floatValue());
        }
        if (e != null)
        {
            qlp1.a(5, e.floatValue());
        }
        if (f != null)
        {
            qlp1.a(6, f.intValue());
        }
        if (g != null)
        {
            qlp1.a(7, g.floatValue());
        }
        super.a(qlp1);
    }
}
