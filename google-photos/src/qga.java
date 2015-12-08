// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class qga extends qlq
{

    public qcb a;
    public qbr b;
    public qie c;
    public qfk d;
    public qbo e;
    public qcl f;
    public qcj g;
    public qbu h;
    private Boolean i;
    private qdt j;
    private qbb k;
    private qjo l;
    private qcr m;
    private qhq n;

    public qga()
    {
        i = null;
        a = null;
        j = null;
        b = null;
        k = null;
        c = null;
        l = null;
        d = null;
        e = null;
        f = null;
        g = null;
        m = null;
        n = null;
        h = null;
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
        if (j != null)
        {
            j1 = i1 + qlp.c(2, j);
        }
        i1 = j1;
        if (i != null)
        {
            i.booleanValue();
            i1 = j1 + (qlp.c(3) + 1);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + qlp.c(4, b);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + qlp.c(5, k);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + qlp.c(6, c);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + qlp.c(7, l);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + qlp.c(8, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + qlp.c(9, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + qlp.c(11, f);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + qlp.c(12, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + qlp.c(13, n);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + qlp.c(14, h);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + qlp.c(15, g);
        }
        return j1;
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
                    a = new qcb();
                }
                qlo1.a(a);
                break;

            case 18: // '\022'
                if (j == null)
                {
                    j = new qdt();
                }
                qlo1.a(j);
                break;

            case 24: // '\030'
                i = Boolean.valueOf(qlo1.f());
                break;

            case 34: // '"'
                if (b == null)
                {
                    b = new qbr();
                }
                qlo1.a(b);
                break;

            case 42: // '*'
                if (k == null)
                {
                    k = new qbb();
                }
                qlo1.a(k);
                break;

            case 50: // '2'
                if (c == null)
                {
                    c = new qie();
                }
                qlo1.a(c);
                break;

            case 58: // ':'
                if (l == null)
                {
                    l = new qjo();
                }
                qlo1.a(l);
                break;

            case 66: // 'B'
                if (d == null)
                {
                    d = new qfk();
                }
                qlo1.a(d);
                break;

            case 74: // 'J'
                if (e == null)
                {
                    e = new qbo();
                }
                qlo1.a(e);
                break;

            case 90: // 'Z'
                if (f == null)
                {
                    f = new qcl();
                }
                qlo1.a(f);
                break;

            case 98: // 'b'
                if (m == null)
                {
                    m = new qcr();
                }
                qlo1.a(m);
                break;

            case 106: // 'j'
                if (n == null)
                {
                    n = new qhq();
                }
                qlo1.a(n);
                break;

            case 114: // 'r'
                if (h == null)
                {
                    h = new qbu();
                }
                qlo1.a(h);
                break;

            case 122: // 'z'
                if (g == null)
                {
                    g = new qcj();
                }
                qlo1.a(g);
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
        if (j != null)
        {
            qlp1.a(2, j);
        }
        if (i != null)
        {
            qlp1.a(3, i.booleanValue());
        }
        if (b != null)
        {
            qlp1.a(4, b);
        }
        if (k != null)
        {
            qlp1.a(5, k);
        }
        if (c != null)
        {
            qlp1.a(6, c);
        }
        if (l != null)
        {
            qlp1.a(7, l);
        }
        if (d != null)
        {
            qlp1.a(8, d);
        }
        if (e != null)
        {
            qlp1.a(9, e);
        }
        if (f != null)
        {
            qlp1.a(11, f);
        }
        if (m != null)
        {
            qlp1.a(12, m);
        }
        if (n != null)
        {
            qlp1.a(13, n);
        }
        if (h != null)
        {
            qlp1.a(14, h);
        }
        if (g != null)
        {
            qlp1.a(15, g);
        }
        super.a(qlp1);
    }
}
