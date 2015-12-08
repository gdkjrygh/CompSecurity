// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pkq extends qlq
{

    private qoc a;
    private qog b;
    private qlf c;
    private qsq d;
    private Long e;

    public pkq()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
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
        if (b != null)
        {
            j = i + qlp.c(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.c(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.c(4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + qlp.e(5, e.longValue());
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
                    a = new qoc();
                }
                qlo1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new qog();
                }
                qlo1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new qlf();
                }
                qlo1.a(c);
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new qsq();
                }
                qlo1.a(d);
                break;

            case 40: // '('
                e = Long.valueOf(qlo1.j());
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
        if (b != null)
        {
            qlp1.a(2, b);
        }
        if (c != null)
        {
            qlp1.a(3, c);
        }
        if (d != null)
        {
            qlp1.a(4, d);
        }
        if (e != null)
        {
            qlp1.b(5, e.longValue());
        }
        super.a(qlp1);
    }
}
