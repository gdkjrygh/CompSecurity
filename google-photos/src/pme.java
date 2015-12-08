// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pme extends qlq
{

    public Boolean a;
    public pnp b;
    public qgg c;
    private pom d;
    private ppq e;

    public pme()
    {
        a = null;
        b = null;
        d = null;
        e = null;
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
            a.booleanValue();
            i = j + (qlp.c(1) + 1);
        }
        j = i;
        if (b != null)
        {
            j = i + qlp.c(2, b);
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.c(3, d);
        }
        j = i;
        if (e != null)
        {
            j = i + qlp.c(4, e);
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

            case 8: // '\b'
                a = Boolean.valueOf(qlo1.f());
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new pnp();
                }
                qlo1.a(b);
                break;

            case 26: // '\032'
                if (d == null)
                {
                    d = new pom();
                }
                qlo1.a(d);
                break;

            case 34: // '"'
                if (e == null)
                {
                    e = new ppq();
                }
                qlo1.a(e);
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
            qlp1.a(1, a.booleanValue());
        }
        if (b != null)
        {
            qlp1.a(2, b);
        }
        if (d != null)
        {
            qlp1.a(3, d);
        }
        if (e != null)
        {
            qlp1.a(4, e);
        }
        if (c != null)
        {
            qlp1.a(5, c);
        }
        super.a(qlp1);
    }
}
