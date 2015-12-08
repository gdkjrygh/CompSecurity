// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pnz extends qlq
{

    private Integer a;
    private Integer b;
    private Integer c;
    private Integer d;
    private Integer e;
    private Integer f;
    private Integer g;

    public pnz()
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
            i = j + qlp.e(1, a.intValue());
        }
        j = i;
        if (b != null)
        {
            j = i + qlp.e(2, b.intValue());
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.e(3, c.intValue());
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.e(4, d.intValue());
        }
        i = j;
        if (e != null)
        {
            i = j + qlp.e(5, e.intValue());
        }
        j = i;
        if (f != null)
        {
            j = i + qlp.e(6, f.intValue());
        }
        i = j;
        if (g != null)
        {
            i = j + qlp.e(7, g.intValue());
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

            case 8: // '\b'
                a = Integer.valueOf(qlo1.i());
                break;

            case 16: // '\020'
                b = Integer.valueOf(qlo1.i());
                break;

            case 24: // '\030'
                c = Integer.valueOf(qlo1.i());
                break;

            case 32: // ' '
                d = Integer.valueOf(qlo1.i());
                break;

            case 40: // '('
                e = Integer.valueOf(qlo1.i());
                break;

            case 48: // '0'
                f = Integer.valueOf(qlo1.i());
                break;

            case 56: // '8'
                g = Integer.valueOf(qlo1.i());
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(1, a.intValue());
        }
        if (b != null)
        {
            qlp1.a(2, b.intValue());
        }
        if (c != null)
        {
            qlp1.a(3, c.intValue());
        }
        if (d != null)
        {
            qlp1.a(4, d.intValue());
        }
        if (e != null)
        {
            qlp1.a(5, e.intValue());
        }
        if (f != null)
        {
            qlp1.a(6, f.intValue());
        }
        if (g != null)
        {
            qlp1.a(7, g.intValue());
        }
        super.a(qlp1);
    }
}
