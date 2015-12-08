// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class oyq extends qlq
{

    public oym a;
    private oys b;
    private oyy c;
    private ozf d;

    public oyq()
    {
        b = null;
        c = null;
        d = null;
        a = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (b != null)
        {
            i = j + qlp.c(1, b);
        }
        j = i;
        if (c != null)
        {
            j = i + qlp.c(2, c);
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.c(3, d);
        }
        j = i;
        if (a != null)
        {
            j = i + qlp.c(4, a);
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
                if (b == null)
                {
                    b = new oys();
                }
                qlo1.a(b);
                break;

            case 18: // '\022'
                if (c == null)
                {
                    c = new oyy();
                }
                qlo1.a(c);
                break;

            case 26: // '\032'
                if (d == null)
                {
                    d = new ozf();
                }
                qlo1.a(d);
                break;

            case 34: // '"'
                if (a == null)
                {
                    a = new oym();
                }
                qlo1.a(a);
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
        if (d != null)
        {
            qlp1.a(3, d);
        }
        if (a != null)
        {
            qlp1.a(4, a);
        }
        super.a(qlp1);
    }
}
