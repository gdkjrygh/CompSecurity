// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pah extends qlq
{

    public qyi a;
    public String b;
    private Boolean c;
    private String d;

    public pah()
    {
        c = null;
        a = null;
        d = null;
        b = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (c != null)
        {
            c.booleanValue();
            i = j + (qlp.c(2) + 1);
        }
        j = i;
        if (a != null)
        {
            j = i + qlp.c(3, a);
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.b(4, d);
        }
        j = i;
        if (b != null)
        {
            j = i + qlp.b(5, b);
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

            case 16: // '\020'
                c = Boolean.valueOf(qlo1.f());
                break;

            case 26: // '\032'
                if (a == null)
                {
                    a = new qyi();
                }
                qlo1.a(a);
                break;

            case 34: // '"'
                d = qlo1.g();
                break;

            case 42: // '*'
                b = qlo1.g();
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (c != null)
        {
            qlp1.a(2, c.booleanValue());
        }
        if (a != null)
        {
            qlp1.a(3, a);
        }
        if (d != null)
        {
            qlp1.a(4, d);
        }
        if (b != null)
        {
            qlp1.a(5, b);
        }
        super.a(qlp1);
    }
}
