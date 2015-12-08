// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pqk extends qlq
{

    private pqo a;
    private pqu b;
    private pqt c;
    private pqr d;
    private pqm e;
    private pql f;
    private pqr g;
    private pqq h;
    private pqs i;

    public pqk()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int k = super.a();
        int j = k;
        if (a != null)
        {
            j = k + qlp.c(1, a);
        }
        k = j;
        if (b != null)
        {
            k = j + qlp.c(2, b);
        }
        j = k;
        if (c != null)
        {
            j = k + qlp.c(3, c);
        }
        k = j;
        if (d != null)
        {
            k = j + qlp.c(4, d);
        }
        j = k;
        if (e != null)
        {
            j = k + qlp.c(5, e);
        }
        k = j;
        if (g != null)
        {
            k = j + qlp.c(6, g);
        }
        j = k;
        if (h != null)
        {
            j = k + qlp.c(7, h);
        }
        k = j;
        if (i != null)
        {
            k = j + qlp.c(9, i);
        }
        j = k;
        if (f != null)
        {
            j = k + qlp.c(10, f);
        }
        return j;
    }

    public final qlw a(qlo qlo1)
    {
        do
        {
            int j = qlo1.a();
            switch (j)
            {
            default:
                if (super.a(qlo1, j))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (a == null)
                {
                    a = new pqo();
                }
                qlo1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new pqu();
                }
                qlo1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new pqt();
                }
                qlo1.a(c);
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new pqr();
                }
                qlo1.a(d);
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new pqm();
                }
                qlo1.a(e);
                break;

            case 50: // '2'
                if (g == null)
                {
                    g = new pqr();
                }
                qlo1.a(g);
                break;

            case 58: // ':'
                if (h == null)
                {
                    h = new pqq();
                }
                qlo1.a(h);
                break;

            case 74: // 'J'
                if (i == null)
                {
                    i = new pqs();
                }
                qlo1.a(i);
                break;

            case 82: // 'R'
                if (f == null)
                {
                    f = new pql();
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
            qlp1.a(5, e);
        }
        if (g != null)
        {
            qlp1.a(6, g);
        }
        if (h != null)
        {
            qlp1.a(7, h);
        }
        if (i != null)
        {
            qlp1.a(9, i);
        }
        if (f != null)
        {
            qlp1.a(10, f);
        }
        super.a(qlp1);
    }
}
