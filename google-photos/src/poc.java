// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class poc extends qlq
{

    private Boolean a;
    private Boolean b;
    private Boolean c;
    private Boolean d;
    private Boolean e;
    private Boolean f;
    private Boolean g;

    public poc()
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
            a.booleanValue();
            i = j + (qlp.c(1) + 1);
        }
        j = i;
        if (b != null)
        {
            b.booleanValue();
            j = i + (qlp.c(2) + 1);
        }
        i = j;
        if (c != null)
        {
            c.booleanValue();
            i = j + (qlp.c(3) + 1);
        }
        j = i;
        if (d != null)
        {
            d.booleanValue();
            j = i + (qlp.c(4) + 1);
        }
        i = j;
        if (e != null)
        {
            e.booleanValue();
            i = j + (qlp.c(5) + 1);
        }
        j = i;
        if (f != null)
        {
            f.booleanValue();
            j = i + (qlp.c(6) + 1);
        }
        i = j;
        if (g != null)
        {
            g.booleanValue();
            i = j + (qlp.c(7) + 1);
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
                a = Boolean.valueOf(qlo1.f());
                break;

            case 16: // '\020'
                b = Boolean.valueOf(qlo1.f());
                break;

            case 24: // '\030'
                c = Boolean.valueOf(qlo1.f());
                break;

            case 32: // ' '
                d = Boolean.valueOf(qlo1.f());
                break;

            case 40: // '('
                e = Boolean.valueOf(qlo1.f());
                break;

            case 48: // '0'
                f = Boolean.valueOf(qlo1.f());
                break;

            case 56: // '8'
                g = Boolean.valueOf(qlo1.f());
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(1, a.booleanValue());
        }
        if (b != null)
        {
            qlp1.a(2, b.booleanValue());
        }
        if (c != null)
        {
            qlp1.a(3, c.booleanValue());
        }
        if (d != null)
        {
            qlp1.a(4, d.booleanValue());
        }
        if (e != null)
        {
            qlp1.a(5, e.booleanValue());
        }
        if (f != null)
        {
            qlp1.a(6, f.booleanValue());
        }
        if (g != null)
        {
            qlp1.a(7, g.booleanValue());
        }
        super.a(qlp1);
    }
}
