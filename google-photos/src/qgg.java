// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class qgg extends qlq
{

    private static volatile qgg h[];
    public String a;
    public qeo b;
    public qeq c;
    public qfb d;
    public qei e;
    public qff f;
    public qgb g;
    private pzj i;
    private qgq j;
    private qdd k;
    private qeu l;
    private qdx m[];
    private pyz n;
    private qdh o;
    private qgn p;
    private qhp q;

    public qgg()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = qdx.b();
        n = null;
        o = null;
        e = null;
        p = null;
        f = null;
        g = null;
        q = null;
        F = null;
        G = -1;
    }

    public static qgg a(byte abyte0[])
    {
        return (qgg)qlw.a(new qgg(), abyte0);
    }

    public static qgg[] b()
    {
        if (h == null)
        {
            synchronized (qlu.a)
            {
                if (h == null)
                {
                    h = new qgg[0];
                }
            }
        }
        return h;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        int j1 = super.a();
        int i1 = j1;
        if (a != null)
        {
            i1 = j1 + qlp.b(1, a);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + qlp.c(2, c);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + qlp.c(3, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + qlp.c(4, k);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + qlp.c(5, d);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + qlp.c(6, b);
        }
        int k1 = j1;
        if (l != null)
        {
            k1 = j1 + qlp.c(7, l);
        }
        i1 = k1;
        if (i != null)
        {
            i1 = k1 + qlp.c(8, i);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1;
            if (m.length > 0)
            {
                for (j1 = 0; j1 < m.length;)
                {
                    qdx qdx1 = m[j1];
                    int l1 = i1;
                    if (qdx1 != null)
                    {
                        l1 = i1 + qlp.c(9, qdx1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + qlp.c(10, n);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + qlp.c(11, o);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + qlp.c(12, e);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + qlp.c(13, p);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + qlp.c(14, f);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + qlp.c(15, g);
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + qlp.c(16, q);
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
                a = qlo1.g();
                break;

            case 18: // '\022'
                if (c == null)
                {
                    c = new qeq();
                }
                qlo1.a(c);
                break;

            case 26: // '\032'
                if (j == null)
                {
                    j = new qgq();
                }
                qlo1.a(j);
                break;

            case 34: // '"'
                if (k == null)
                {
                    k = new qdd();
                }
                qlo1.a(k);
                break;

            case 42: // '*'
                if (d == null)
                {
                    d = new qfb();
                }
                qlo1.a(d);
                break;

            case 50: // '2'
                if (b == null)
                {
                    b = new qeo();
                }
                qlo1.a(b);
                break;

            case 58: // ':'
                if (l == null)
                {
                    l = new qeu();
                }
                qlo1.a(l);
                break;

            case 66: // 'B'
                if (i == null)
                {
                    i = new pzj();
                }
                qlo1.a(i);
                break;

            case 74: // 'J'
                int k1 = qmb.b(qlo1, 74);
                qdx aqdx[];
                int j1;
                if (m == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = m.length;
                }
                aqdx = new qdx[k1 + j1];
                k1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(m, 0, aqdx, 0, j1);
                    k1 = j1;
                }
                for (; k1 < aqdx.length - 1; k1++)
                {
                    aqdx[k1] = new qdx();
                    qlo1.a(aqdx[k1]);
                    qlo1.a();
                }

                aqdx[k1] = new qdx();
                qlo1.a(aqdx[k1]);
                m = aqdx;
                break;

            case 82: // 'R'
                if (n == null)
                {
                    n = new pyz();
                }
                qlo1.a(n);
                break;

            case 90: // 'Z'
                if (o == null)
                {
                    o = new qdh();
                }
                qlo1.a(o);
                break;

            case 98: // 'b'
                if (e == null)
                {
                    e = new qei();
                }
                qlo1.a(e);
                break;

            case 106: // 'j'
                if (p == null)
                {
                    p = new qgn();
                }
                qlo1.a(p);
                break;

            case 114: // 'r'
                if (f == null)
                {
                    f = new qff();
                }
                qlo1.a(f);
                break;

            case 122: // 'z'
                if (g == null)
                {
                    g = new qgb();
                }
                qlo1.a(g);
                break;

            case 130: 
                if (q == null)
                {
                    q = new qhp();
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
        if (c != null)
        {
            qlp1.a(2, c);
        }
        if (j != null)
        {
            qlp1.a(3, j);
        }
        if (k != null)
        {
            qlp1.a(4, k);
        }
        if (d != null)
        {
            qlp1.a(5, d);
        }
        if (b != null)
        {
            qlp1.a(6, b);
        }
        if (l != null)
        {
            qlp1.a(7, l);
        }
        if (i != null)
        {
            qlp1.a(8, i);
        }
        if (m != null && m.length > 0)
        {
            for (int i1 = 0; i1 < m.length; i1++)
            {
                qdx qdx1 = m[i1];
                if (qdx1 != null)
                {
                    qlp1.a(9, qdx1);
                }
            }

        }
        if (n != null)
        {
            qlp1.a(10, n);
        }
        if (o != null)
        {
            qlp1.a(11, o);
        }
        if (e != null)
        {
            qlp1.a(12, e);
        }
        if (p != null)
        {
            qlp1.a(13, p);
        }
        if (f != null)
        {
            qlp1.a(14, f);
        }
        if (g != null)
        {
            qlp1.a(15, g);
        }
        if (q != null)
        {
            qlp1.a(16, q);
        }
        super.a(qlp1);
    }
}
