// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class qec extends qlq
{

    public qig a;
    public qed b;
    public qgf c;
    private Boolean d;

    public qec()
    {
        d = null;
        a = null;
        b = null;
        c = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (d != null)
        {
            d.booleanValue();
            i = j + (qlp.c(1) + 1);
        }
        j = i;
        if (a != null)
        {
            j = i + qlp.c(2, a);
        }
        i = j;
        if (b != null)
        {
            i = j + qlp.c(3, b);
        }
        j = i;
        if (c != null)
        {
            j = i + qlp.c(4, c);
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
                d = Boolean.valueOf(qlo1.f());
                break;

            case 18: // '\022'
                if (a == null)
                {
                    a = new qig();
                }
                qlo1.a(a);
                break;

            case 26: // '\032'
                if (b == null)
                {
                    b = new qed();
                }
                qlo1.a(b);
                break;

            case 34: // '"'
                if (c == null)
                {
                    c = new qgf();
                }
                qlo1.a(c);
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (d != null)
        {
            qlp1.a(1, d.booleanValue());
        }
        if (a != null)
        {
            qlp1.a(2, a);
        }
        if (b != null)
        {
            qlp1.a(3, b);
        }
        if (c != null)
        {
            qlp1.a(4, c);
        }
        super.a(qlp1);
    }
}
