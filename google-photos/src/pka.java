// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pka extends qlq
{

    public pom a;
    public pov b;
    public qgg c;
    private Boolean d;
    private pkp e;

    public pka()
    {
        a = null;
        d = null;
        e = null;
        b = null;
        c = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (a != null)
        {
            i = j + qlp.c(1, a);
        }
        j = i;
        if (d != null)
        {
            d.booleanValue();
            j = i + (qlp.c(2) + 1);
        }
        i = j;
        if (e != null)
        {
            i = j + qlp.c(3, e);
        }
        j = i;
        if (b != null)
        {
            j = i + qlp.c(4, b);
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.c(5, c);
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
                if (a == null)
                {
                    a = new pom();
                }
                qlo1.a(a);
                break;

            case 16: // '\020'
                d = Boolean.valueOf(qlo1.f());
                break;

            case 26: // '\032'
                if (e == null)
                {
                    e = new pkp();
                }
                qlo1.a(e);
                break;

            case 34: // '"'
                if (b == null)
                {
                    b = new pov();
                }
                qlo1.a(b);
                break;

            case 42: // '*'
                if (c == null)
                {
                    c = new qgg();
                }
                qlo1.a(c);
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
        if (d != null)
        {
            qlp1.a(2, d.booleanValue());
        }
        if (e != null)
        {
            qlp1.a(3, e);
        }
        if (b != null)
        {
            qlp1.a(4, b);
        }
        if (c != null)
        {
            qlp1.a(5, c);
        }
        super.a(qlp1);
    }
}
