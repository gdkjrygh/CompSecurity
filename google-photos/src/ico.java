// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ico extends qlq
{

    public icn a;
    public icn b;
    public icn c;
    public icn d;
    public icn e;
    public icn f;
    private icn g;

    public ico()
    {
        a = null;
        b = null;
        g = null;
        c = null;
        d = null;
        e = null;
        f = null;
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
        if (g != null)
        {
            i = j + qlp.c(3, g);
        }
        j = i;
        if (c != null)
        {
            j = i + qlp.c(4, c);
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.c(5, d);
        }
        j = i;
        if (e != null)
        {
            j = i + qlp.c(6, e);
        }
        i = j;
        if (f != null)
        {
            i = j + qlp.c(7, f);
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
                    a = new icn();
                }
                qlo1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new icn();
                }
                qlo1.a(b);
                break;

            case 26: // '\032'
                if (g == null)
                {
                    g = new icn();
                }
                qlo1.a(g);
                break;

            case 34: // '"'
                if (c == null)
                {
                    c = new icn();
                }
                qlo1.a(c);
                break;

            case 42: // '*'
                if (d == null)
                {
                    d = new icn();
                }
                qlo1.a(d);
                break;

            case 50: // '2'
                if (e == null)
                {
                    e = new icn();
                }
                qlo1.a(e);
                break;

            case 58: // ':'
                if (f == null)
                {
                    f = new icn();
                }
                qlo1.a(f);
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
        if (g != null)
        {
            qlp1.a(3, g);
        }
        if (c != null)
        {
            qlp1.a(4, c);
        }
        if (d != null)
        {
            qlp1.a(5, d);
        }
        if (e != null)
        {
            qlp1.a(6, e);
        }
        if (f != null)
        {
            qlp1.a(7, f);
        }
        super.a(qlp1);
    }
}
