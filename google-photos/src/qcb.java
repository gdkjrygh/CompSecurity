// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class qcb extends qlq
{

    public pze a;
    public pze b;
    public qcv c;
    public pzi d;
    public qae e;
    public qal f;
    public qew g;
    public qcp h;
    public qcz i;
    public qcf j;
    public qch k;
    public qct l;
    private Boolean m;

    public qcb()
    {
        m = null;
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
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j1 = super.a();
        int i1 = j1;
        if (m != null)
        {
            m.booleanValue();
            i1 = j1 + (qlp.c(1) + 1);
        }
        j1 = i1;
        if (a != null)
        {
            j1 = i1 + qlp.c(2, a);
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + qlp.c(3, b);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + qlp.c(4, c);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + qlp.c(5, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + qlp.c(6, e);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + qlp.c(7, f);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + qlp.c(8, g);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + qlp.c(9, h);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + qlp.c(10, i);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + qlp.c(11, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + qlp.c(12, k);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + qlp.c(13, l);
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

            case 8: // '\b'
                m = Boolean.valueOf(qlo1.f());
                break;

            case 18: // '\022'
                if (a == null)
                {
                    a = new pze();
                }
                qlo1.a(a);
                break;

            case 26: // '\032'
                if (b == null)
                {
                    b = new pze();
                }
                qlo1.a(b);
                break;

            case 34: // '"'
                if (c == null)
                {
                    c = new qcv();
                }
                qlo1.a(c);
                break;

            case 42: // '*'
                if (d == null)
                {
                    d = new pzi();
                }
                qlo1.a(d);
                break;

            case 50: // '2'
                if (e == null)
                {
                    e = new qae();
                }
                qlo1.a(e);
                break;

            case 58: // ':'
                if (f == null)
                {
                    f = new qal();
                }
                qlo1.a(f);
                break;

            case 66: // 'B'
                if (g == null)
                {
                    g = new qew();
                }
                qlo1.a(g);
                break;

            case 74: // 'J'
                if (h == null)
                {
                    h = new qcp();
                }
                qlo1.a(h);
                break;

            case 82: // 'R'
                if (i == null)
                {
                    i = new qcz();
                }
                qlo1.a(i);
                break;

            case 90: // 'Z'
                if (j == null)
                {
                    j = new qcf();
                }
                qlo1.a(j);
                break;

            case 98: // 'b'
                if (k == null)
                {
                    k = new qch();
                }
                qlo1.a(k);
                break;

            case 106: // 'j'
                if (l == null)
                {
                    l = new qct();
                }
                qlo1.a(l);
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (m != null)
        {
            qlp1.a(1, m.booleanValue());
        }
        if (a != null)
        {
            qlp1.a(2, a);
        }
        if (b != null)
        {
            qlp1.a(3, b);
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
        if (g != null)
        {
            qlp1.a(8, g);
        }
        if (h != null)
        {
            qlp1.a(9, h);
        }
        if (i != null)
        {
            qlp1.a(10, i);
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
        super.a(qlp1);
    }
}
