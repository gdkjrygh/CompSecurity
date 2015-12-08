// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pln extends qlq
{

    public Integer a;
    public String b;
    public plr c;
    public qgh d;
    private pli e;
    private plj f;
    private qkt g;
    private pvz h;
    private plu i;

    public pln()
    {
        a = null;
        b = null;
        e = null;
        c = null;
        f = null;
        d = null;
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
            j = k + qlp.e(1, a.intValue());
        }
        k = j;
        if (b != null)
        {
            k = j + qlp.b(2, b);
        }
        j = k;
        if (e != null)
        {
            j = k + qlp.c(3, e);
        }
        k = j;
        if (c != null)
        {
            k = j + qlp.c(4, c);
        }
        j = k;
        if (f != null)
        {
            j = k + qlp.c(5, f);
        }
        k = j;
        if (d != null)
        {
            k = j + qlp.c(6, d);
        }
        j = k;
        if (g != null)
        {
            j = k + qlp.c(7, g);
        }
        k = j;
        if (h != null)
        {
            k = j + qlp.c(8, h);
        }
        j = k;
        if (i != null)
        {
            j = k + qlp.c(9, i);
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

            case 8: // '\b'
                a = Integer.valueOf(qlo1.i());
                break;

            case 18: // '\022'
                b = qlo1.g();
                break;

            case 26: // '\032'
                if (e == null)
                {
                    e = new pli();
                }
                qlo1.a(e);
                break;

            case 34: // '"'
                if (c == null)
                {
                    c = new plr();
                }
                qlo1.a(c);
                break;

            case 42: // '*'
                if (f == null)
                {
                    f = new plj();
                }
                qlo1.a(f);
                break;

            case 50: // '2'
                if (d == null)
                {
                    d = new qgh();
                }
                qlo1.a(d);
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new qkt();
                }
                qlo1.a(g);
                break;

            case 66: // 'B'
                if (h == null)
                {
                    h = new pvz();
                }
                qlo1.a(h);
                break;

            case 74: // 'J'
                if (i == null)
                {
                    i = new plu();
                }
                qlo1.a(i);
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(1, a.intValue());
        }
        if (b != null)
        {
            qlp1.a(2, b);
        }
        if (e != null)
        {
            qlp1.a(3, e);
        }
        if (c != null)
        {
            qlp1.a(4, c);
        }
        if (f != null)
        {
            qlp1.a(5, f);
        }
        if (d != null)
        {
            qlp1.a(6, d);
        }
        if (g != null)
        {
            qlp1.a(7, g);
        }
        if (h != null)
        {
            qlp1.a(8, h);
        }
        if (i != null)
        {
            qlp1.a(9, i);
        }
        super.a(qlp1);
    }
}
