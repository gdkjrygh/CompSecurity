// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pqj extends qlq
{

    private ptq a;
    private pte b;
    private pqk c;
    private ptn d;
    private ptu e;
    private ptg f;
    private ptt g;
    private psm h;
    private ptr i;
    private ptf j;
    private pqe k;
    private pth l;
    private pti m;
    private ptj n;
    private ppy o;
    private ptp p;
    private pqh q;

    public pqj()
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
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
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
        if (b != null)
        {
            j1 = i1 + qlp.c(2, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + qlp.c(3, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + qlp.c(4, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + qlp.c(5, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + qlp.c(6, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + qlp.c(7, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + qlp.c(8, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + qlp.c(9, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + qlp.c(11, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + qlp.c(12, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + qlp.c(13, l);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + qlp.c(14, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + qlp.c(15, n);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + qlp.c(16, o);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + qlp.c(17, p);
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + qlp.c(18, q);
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
                    a = new ptq();
                }
                qlo1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new pte();
                }
                qlo1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new pqk();
                }
                qlo1.a(c);
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new ptn();
                }
                qlo1.a(d);
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new ptu();
                }
                qlo1.a(e);
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new ptg();
                }
                qlo1.a(f);
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new ptt();
                }
                qlo1.a(g);
                break;

            case 66: // 'B'
                if (h == null)
                {
                    h = new psm();
                }
                qlo1.a(h);
                break;

            case 74: // 'J'
                if (i == null)
                {
                    i = new ptr();
                }
                qlo1.a(i);
                break;

            case 90: // 'Z'
                if (j == null)
                {
                    j = new ptf();
                }
                qlo1.a(j);
                break;

            case 98: // 'b'
                if (k == null)
                {
                    k = new pqe();
                }
                qlo1.a(k);
                break;

            case 106: // 'j'
                if (l == null)
                {
                    l = new pth();
                }
                qlo1.a(l);
                break;

            case 114: // 'r'
                if (m == null)
                {
                    m = new pti();
                }
                qlo1.a(m);
                break;

            case 122: // 'z'
                if (n == null)
                {
                    n = new ptj();
                }
                qlo1.a(n);
                break;

            case 130: 
                if (o == null)
                {
                    o = new ppy();
                }
                qlo1.a(o);
                break;

            case 138: 
                if (p == null)
                {
                    p = new ptp();
                }
                qlo1.a(p);
                break;

            case 146: 
                if (q == null)
                {
                    q = new pqh();
                }
                qlo1.a(q);
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
        if (f != null)
        {
            qlp1.a(6, f);
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
        if (j != null)
        {
            qlp1.a(11, j);
        }
        if (k != null)
        {
            qlp1.a(12, k);
        }
        if (l != null)
        {
            qlp1.a(13, l);
        }
        if (m != null)
        {
            qlp1.a(14, m);
        }
        if (n != null)
        {
            qlp1.a(15, n);
        }
        if (o != null)
        {
            qlp1.a(16, o);
        }
        if (p != null)
        {
            qlp1.a(17, p);
        }
        if (q != null)
        {
            qlp1.a(18, q);
        }
        super.a(qlp1);
    }
}
