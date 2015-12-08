// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pgz extends qlq
{

    private Boolean a;
    private Boolean b;
    private Integer c;
    private Integer d;
    private Integer e;
    private Integer f;

    public pgz()
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

            case 8: // '\b'
                a = Boolean.valueOf(qlo1.f());
                break;

            case 16: // '\020'
                b = Boolean.valueOf(qlo1.f());
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
        super.a(qlp1);
    }
}
