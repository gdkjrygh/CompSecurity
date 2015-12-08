// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pai extends qlq
{

    public owr a;
    public oxg b;
    private qns c;
    private qoe d;
    private String e;
    private qyl f;

    public pai()
    {
        c = null;
        d = null;
        e = null;
        f = null;
        a = null;
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
            i = j + qlp.c(1, c);
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.c(2, d);
        }
        i = j;
        if (e != null)
        {
            i = j + qlp.b(3, e);
        }
        j = i;
        if (f != null)
        {
            j = i + qlp.c(4, f);
        }
        i = j;
        if (a != null)
        {
            i = j + qlp.c(5, a);
        }
        j = i;
        if (b != null)
        {
            j = i + qlp.c(6, b);
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
                if (c == null)
                {
                    c = new qns();
                }
                qlo1.a(c);
                break;

            case 18: // '\022'
                if (d == null)
                {
                    d = new qoe();
                }
                qlo1.a(d);
                break;

            case 26: // '\032'
                e = qlo1.g();
                break;

            case 34: // '"'
                if (f == null)
                {
                    f = new qyl();
                }
                qlo1.a(f);
                break;

            case 42: // '*'
                if (a == null)
                {
                    a = new owr();
                }
                qlo1.a(a);
                break;

            case 50: // '2'
                if (b == null)
                {
                    b = new oxg();
                }
                qlo1.a(b);
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (c != null)
        {
            qlp1.a(1, c);
        }
        if (d != null)
        {
            qlp1.a(2, d);
        }
        if (e != null)
        {
            qlp1.a(3, e);
        }
        if (f != null)
        {
            qlp1.a(4, f);
        }
        if (a != null)
        {
            qlp1.a(5, a);
        }
        if (b != null)
        {
            qlp1.a(6, b);
        }
        super.a(qlp1);
    }
}
