// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class qer extends qlq
{

    public qcn a;
    public pze b;
    public qae c;
    public qal d;
    public qbh e;
    public qit f;
    public qet g;
    public qen h;
    public qey i;
    public qgl j;
    private Boolean k;
    private pzi l;
    private qel m;

    public qer()
    {
        k = null;
        a = null;
        b = null;
        l = null;
        c = null;
        d = null;
        m = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
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
        if (k != null)
        {
            k.booleanValue();
            j1 = i1 + (qlp.c(2) + 1);
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + qlp.c(3, b);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + qlp.c(4, l);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + qlp.c(5, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + qlp.c(6, d);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + qlp.c(7, m);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + qlp.c(15, e);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + qlp.c(16, f);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + qlp.c(17, g);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + qlp.c(19, h);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + qlp.c(20, i);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + qlp.c(21, j);
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
                    a = new qcn();
                }
                qlo1.a(a);
                break;

            case 16: // '\020'
                k = Boolean.valueOf(qlo1.f());
                break;

            case 26: // '\032'
                if (b == null)
                {
                    b = new pze();
                }
                qlo1.a(b);
                break;

            case 34: // '"'
                if (l == null)
                {
                    l = new pzi();
                }
                qlo1.a(l);
                break;

            case 42: // '*'
                if (c == null)
                {
                    c = new qae();
                }
                qlo1.a(c);
                break;

            case 50: // '2'
                if (d == null)
                {
                    d = new qal();
                }
                qlo1.a(d);
                break;

            case 58: // ':'
                if (m == null)
                {
                    m = new qel();
                }
                qlo1.a(m);
                break;

            case 122: // 'z'
                if (e == null)
                {
                    e = new qbh();
                }
                qlo1.a(e);
                break;

            case 130: 
                if (f == null)
                {
                    f = new qit();
                }
                qlo1.a(f);
                break;

            case 138: 
                if (g == null)
                {
                    g = new qet();
                }
                qlo1.a(g);
                break;

            case 154: 
                if (h == null)
                {
                    h = new qen();
                }
                qlo1.a(h);
                break;

            case 162: 
                if (i == null)
                {
                    i = new qey();
                }
                qlo1.a(i);
                break;

            case 170: 
                if (j == null)
                {
                    j = new qgl();
                }
                qlo1.a(j);
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
        if (k != null)
        {
            qlp1.a(2, k.booleanValue());
        }
        if (b != null)
        {
            qlp1.a(3, b);
        }
        if (l != null)
        {
            qlp1.a(4, l);
        }
        if (c != null)
        {
            qlp1.a(5, c);
        }
        if (d != null)
        {
            qlp1.a(6, d);
        }
        if (m != null)
        {
            qlp1.a(7, m);
        }
        if (e != null)
        {
            qlp1.a(15, e);
        }
        if (f != null)
        {
            qlp1.a(16, f);
        }
        if (g != null)
        {
            qlp1.a(17, g);
        }
        if (h != null)
        {
            qlp1.a(19, h);
        }
        if (i != null)
        {
            qlp1.a(20, i);
        }
        if (j != null)
        {
            qlp1.a(21, j);
        }
        super.a(qlp1);
    }
}
