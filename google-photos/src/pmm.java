// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pmm extends qlq
{

    private Long a;
    private Boolean b;
    private Boolean c;
    private pua d;

    public pmm()
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
            j = i + qlp.c(4, d);
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

            case 16: // '\020'
                b = Boolean.valueOf(qlo1.f());
                break;

            case 24: // '\030'
                c = Boolean.valueOf(qlo1.f());
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new pua();
                }
                qlo1.a(d);
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
            qlp1.a(2, b.booleanValue());
        }
        if (c != null)
        {
            qlp1.a(3, c.booleanValue());
        }
        if (d != null)
        {
            qlp1.a(4, d);
        }
        super.a(qlp1);
    }
}
