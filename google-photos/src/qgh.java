// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class qgh extends qlq
{

    public qer a;
    public qfc b;
    public qdi c;
    public qej d;
    public qfk e;
    public qgc f;
    private Boolean g;
    private pzk h;
    private qgr i;
    private qde j;
    private qdy k;
    private qgo l;
    private qhq m;

    public qgh()
    {
        g = null;
        a = null;
        b = null;
        h = null;
        i = null;
        j = null;
        k = null;
        c = null;
        d = null;
        l = null;
        e = null;
        f = null;
        m = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j1 = super.a();
        int i1 = j1;
        if (a != null)
        {
            i1 = j1 + qlp.c(1, a);
        }
        j1 = i1;
        if (g != null)
        {
            g.booleanValue();
            j1 = i1 + (qlp.c(2) + 1);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + qlp.c(3, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + qlp.c(4, j);
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + qlp.c(5, b);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + qlp.c(6, h);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + qlp.c(7, k);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + qlp.c(8, c);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + qlp.c(9, d);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + qlp.c(10, l);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + qlp.c(11, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + qlp.c(12, f);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + qlp.c(13, m);
        }
        return i1;
    }

    public final qlw a(qlo qlo1)
    {
        do
        {
            int i1 = qlo1.a();
            switch (i1)
            {
            default:
                if (super.a(qlo1, i1))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (a == null)
                {
                    a = new qer();
                }
                qlo1.a(a);
                break;

            case 16: // '\020'
                g = Boolean.valueOf(qlo1.f());
                break;

            case 26: // '\032'
                if (i == null)
                {
                    i = new qgr();
                }
                qlo1.a(i);
                break;

            case 34: // '"'
                if (j == null)
                {
                    j = new qde();
                }
                qlo1.a(j);
                break;

            case 42: // '*'
                if (b == null)
                {
                    b = new qfc();
                }
                qlo1.a(b);
                break;

            case 50: // '2'
                if (h == null)
                {
                    h = new pzk();
                }
                qlo1.a(h);
                break;

            case 58: // ':'
                if (k == null)
                {
                    k = new qdy();
                }
                qlo1.a(k);
                break;

            case 66: // 'B'
                if (c == null)
                {
                    c = new qdi();
                }
                qlo1.a(c);
                break;

            case 74: // 'J'
                if (d == null)
                {
                    d = new qej();
                }
                qlo1.a(d);
                break;

            case 82: // 'R'
                if (l == null)
                {
                    l = new qgo();
                }
                qlo1.a(l);
                break;

            case 90: // 'Z'
                if (e == null)
                {
                    e = new qfk();
                }
                qlo1.a(e);
                break;

            case 98: // 'b'
                if (f == null)
                {
                    f = new qgc();
                }
                qlo1.a(f);
                break;

            case 106: // 'j'
                if (m == null)
                {
                    m = new qhq();
                }
                qlo1.a(m);
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
        if (g != null)
        {
            qlp1.a(2, g.booleanValue());
        }
        if (i != null)
        {
            qlp1.a(3, i);
        }
        if (j != null)
        {
            qlp1.a(4, j);
        }
        if (b != null)
        {
            qlp1.a(5, b);
        }
        if (h != null)
        {
            qlp1.a(6, h);
        }
        if (k != null)
        {
            qlp1.a(7, k);
        }
        if (c != null)
        {
            qlp1.a(8, c);
        }
        if (d != null)
        {
            qlp1.a(9, d);
        }
        if (l != null)
        {
            qlp1.a(10, l);
        }
        if (e != null)
        {
            qlp1.a(11, e);
        }
        if (f != null)
        {
            qlp1.a(12, f);
        }
        if (m != null)
        {
            qlp1.a(13, m);
        }
        super.a(qlp1);
    }
}
