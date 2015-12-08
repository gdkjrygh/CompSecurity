// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pov extends qlq
{

    public Long a;
    public Long b;
    public Boolean c;
    public Boolean d;

    public pov()
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
        int i = super.a();
        int j = qlp.e(1, a.longValue());
        int k = qlp.e(2, b.longValue());
        c.booleanValue();
        j = i + j + k + (qlp.c(3) + 1);
        i = j;
        if (d != null)
        {
            d.booleanValue();
            i = j + (qlp.c(4) + 1);
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
                a = Long.valueOf(qlo1.j());
                break;

            case 16: // '\020'
                b = Long.valueOf(qlo1.j());
                break;

            case 24: // '\030'
                c = Boolean.valueOf(qlo1.f());
                break;

            case 32: // ' '
                d = Boolean.valueOf(qlo1.f());
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        qlp1.b(1, a.longValue());
        qlp1.b(2, b.longValue());
        qlp1.a(3, c.booleanValue());
        if (d != null)
        {
            qlp1.a(4, d.booleanValue());
        }
        super.a(qlp1);
    }
}
