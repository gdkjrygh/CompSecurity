// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pjp extends qlq
{

    public String a;
    public String b;
    public String c;
    public String d;
    private Long e;

    public pjp()
    {
        a = null;
        e = null;
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
        if (e != null)
        {
            j = i + qlp.e(2, e.longValue());
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.b(3, d);
        }
        j = i;
        if (b != null)
        {
            j = i + qlp.b(4, b);
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.b(5, c);
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
                a = qlo1.g();
                break;

            case 16: // '\020'
                e = Long.valueOf(qlo1.j());
                break;

            case 26: // '\032'
                d = qlo1.g();
                break;

            case 34: // '"'
                b = qlo1.g();
                break;

            case 42: // '*'
                c = qlo1.g();
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
        if (e != null)
        {
            qlp1.b(2, e.longValue());
        }
        if (d != null)
        {
            qlp1.a(3, d);
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
