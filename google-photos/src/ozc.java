// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ozc extends qlq
{

    public oyp a;
    public oyv b;
    public oyq c;
    public oyo d;
    private ozo e;
    private String f;

    public ozc()
    {
        a = null;
        b = null;
        c = null;
        e = null;
        f = null;
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
        if (e != null)
        {
            j = i + qlp.c(4, e);
        }
        i = j;
        if (f != null)
        {
            i = j + qlp.b(5, f);
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.c(6, d);
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
                if (a == null)
                {
                    a = new oyp();
                }
                qlo1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new oyv();
                }
                qlo1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new oyq();
                }
                qlo1.a(c);
                break;

            case 34: // '"'
                if (e == null)
                {
                    e = new ozo();
                }
                qlo1.a(e);
                break;

            case 42: // '*'
                f = qlo1.g();
                break;

            case 50: // '2'
                if (d == null)
                {
                    d = new oyo();
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
        if (e != null)
        {
            qlp1.a(4, e);
        }
        if (f != null)
        {
            qlp1.a(5, f);
        }
        if (d != null)
        {
            qlp1.a(6, d);
        }
        super.a(qlp1);
    }
}
