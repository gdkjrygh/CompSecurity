// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class phz extends qlq
{

    public Long a;
    public Double b;
    public String c;
    private byte d[];

    public phz()
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
            i = j + qlp.e(1, a.longValue());
        }
        j = i;
        if (b != null)
        {
            b.doubleValue();
            j = i + (qlp.c(2) + 8);
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.b(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.b(4, d);
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
                a = Long.valueOf(qlo1.j());
                break;

            case 17: // '\021'
                b = Double.valueOf(Double.longBitsToDouble(qlo1.l()));
                break;

            case 26: // '\032'
                c = qlo1.g();
                break;

            case 34: // '"'
                d = qlo1.h();
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.b(1, a.longValue());
        }
        if (b != null)
        {
            qlp1.a(2, b.doubleValue());
        }
        if (c != null)
        {
            qlp1.a(3, c);
        }
        if (d != null)
        {
            qlp1.a(4, d);
        }
        super.a(qlp1);
    }
}
