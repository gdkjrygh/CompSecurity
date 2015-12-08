// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class oyr extends qlq
{

    public String a;
    private String b;
    private oyx c;
    private String d;

    public oyr()
    {
        b = null;
        c = null;
        a = null;
        d = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (b != null)
        {
            i = j + qlp.b(1, b);
        }
        j = i;
        if (c != null)
        {
            j = i + qlp.c(2, c);
        }
        i = j;
        if (a != null)
        {
            i = j + qlp.b(3, a);
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

            case 10: // '\n'
                b = qlo1.g();
                break;

            case 18: // '\022'
                if (c == null)
                {
                    c = new oyx();
                }
                qlo1.a(c);
                break;

            case 26: // '\032'
                a = qlo1.g();
                break;

            case 34: // '"'
                d = qlo1.g();
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (b != null)
        {
            qlp1.a(1, b);
        }
        if (c != null)
        {
            qlp1.a(2, c);
        }
        if (a != null)
        {
            qlp1.a(3, a);
        }
        if (d != null)
        {
            qlp1.a(4, d);
        }
        super.a(qlp1);
    }
}
