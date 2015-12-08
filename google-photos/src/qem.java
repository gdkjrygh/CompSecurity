// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class qem extends qlq
{

    public String a;
    private Boolean b;
    private Long c;
    private String d;

    public qem()
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
            i = j + qlp.b(1, a);
        }
        j = i;
        if (c != null)
        {
            j = i + qlp.e(2, c.longValue());
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.b(3, d);
        }
        j = i;
        if (b != null)
        {
            b.booleanValue();
            j = i + (qlp.c(4) + 1);
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
                a = qlo1.g();
                break;

            case 16: // '\020'
                c = Long.valueOf(qlo1.j());
                break;

            case 26: // '\032'
                d = qlo1.g();
                break;

            case 32: // ' '
                b = Boolean.valueOf(qlo1.f());
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
        if (c != null)
        {
            qlp1.b(2, c.longValue());
        }
        if (d != null)
        {
            qlp1.a(3, d);
        }
        if (b != null)
        {
            qlp1.a(4, b.booleanValue());
        }
        super.a(qlp1);
    }
}
