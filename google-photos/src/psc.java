// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class psc extends qlq
{

    private static volatile psc a[];
    private qmy A;
    private String b;
    private String c;
    private String d;
    private Integer e;
    private Integer f;
    private Integer g;
    private Integer h;
    private String i;
    private String j;
    private Integer k;
    private Integer l;
    private Integer m;
    private Integer n;
    private String o;
    private String p;
    private Boolean q;
    private Double r;
    private String s;
    private String t;
    private String u;
    private String v;
    private String w;
    private String x;
    private String y;
    private String z;

    public psc()
    {
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
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
        w = null;
        x = null;
        y = null;
        z = null;
        A = null;
        F = null;
        G = -1;
    }

    public static psc[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new psc[0];
                }
            }
        }
        return a;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        int j1 = super.a();
        int i1 = j1;
        if (b != null)
        {
            i1 = j1 + qlp.b(1, b);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + qlp.b(2, c);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + qlp.b(3, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + qlp.e(4, e.intValue());
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + qlp.e(5, f.intValue());
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + qlp.e(6, g.intValue());
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + qlp.e(7, h.intValue());
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + qlp.b(8, i);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + qlp.b(9, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + qlp.e(10, k.intValue());
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + qlp.e(11, l.intValue());
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + qlp.e(12, m.intValue());
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + qlp.e(13, n.intValue());
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + qlp.b(14, o);
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + qlp.b(15, p);
        }
        j1 = i1;
        if (q != null)
        {
            q.booleanValue();
            j1 = i1 + (qlp.c(16) + 1);
        }
        i1 = j1;
        if (r != null)
        {
            r.doubleValue();
            i1 = j1 + (qlp.c(17) + 8);
        }
        j1 = i1;
        if (s != null)
        {
            j1 = i1 + qlp.b(18, s);
        }
        i1 = j1;
        if (t != null)
        {
            i1 = j1 + qlp.b(19, t);
        }
        j1 = i1;
        if (u != null)
        {
            j1 = i1 + qlp.b(20, u);
        }
        i1 = j1;
        if (v != null)
        {
            i1 = j1 + qlp.b(21, v);
        }
        j1 = i1;
        if (w != null)
        {
            j1 = i1 + qlp.b(22, w);
        }
        i1 = j1;
        if (x != null)
        {
            i1 = j1 + qlp.b(23, x);
        }
        j1 = i1;
        if (y != null)
        {
            j1 = i1 + qlp.b(24, y);
        }
        i1 = j1;
        if (z != null)
        {
            i1 = j1 + qlp.b(25, z);
        }
        j1 = i1;
        if (A != null)
        {
            j1 = i1 + qlp.c(27, A);
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
                b = qlo1.g();
                break;

            case 18: // '\022'
                c = qlo1.g();
                break;

            case 26: // '\032'
                d = qlo1.g();
                break;

            case 32: // ' '
                e = Integer.valueOf(qlo1.i());
                break;

            case 40: // '('
                f = Integer.valueOf(qlo1.i());
                break;

            case 48: // '0'
                g = Integer.valueOf(qlo1.i());
                break;

            case 56: // '8'
                h = Integer.valueOf(qlo1.i());
                break;

            case 66: // 'B'
                i = qlo1.g();
                break;

            case 74: // 'J'
                j = qlo1.g();
                break;

            case 80: // 'P'
                k = Integer.valueOf(qlo1.i());
                break;

            case 88: // 'X'
                l = Integer.valueOf(qlo1.i());
                break;

            case 96: // '`'
                m = Integer.valueOf(qlo1.i());
                break;

            case 104: // 'h'
                n = Integer.valueOf(qlo1.i());
                break;

            case 114: // 'r'
                o = qlo1.g();
                break;

            case 122: // 'z'
                p = qlo1.g();
                break;

            case 128: 
                q = Boolean.valueOf(qlo1.f());
                break;

            case 137: 
                r = Double.valueOf(Double.longBitsToDouble(qlo1.l()));
                break;

            case 146: 
                s = qlo1.g();
                break;

            case 154: 
                t = qlo1.g();
                break;

            case 162: 
                u = qlo1.g();
                break;

            case 170: 
                v = qlo1.g();
                break;

            case 178: 
                w = qlo1.g();
                break;

            case 186: 
                x = qlo1.g();
                break;

            case 194: 
                y = qlo1.g();
                break;

            case 202: 
                z = qlo1.g();
                break;

            case 218: 
                if (A == null)
                {
                    A = new qmy();
                }
                qlo1.a(A);
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
        if (e != null)
        {
            qlp1.a(4, e.intValue());
        }
        if (f != null)
        {
            qlp1.a(5, f.intValue());
        }
        if (g != null)
        {
            qlp1.a(6, g.intValue());
        }
        if (h != null)
        {
            qlp1.a(7, h.intValue());
        }
        if (i != null)
        {
            qlp1.a(8, i);
        }
        if (j != null)
        {
            qlp1.a(9, j);
        }
        if (k != null)
        {
            qlp1.a(10, k.intValue());
        }
        if (l != null)
        {
            qlp1.a(11, l.intValue());
        }
        if (m != null)
        {
            qlp1.a(12, m.intValue());
        }
        if (n != null)
        {
            qlp1.a(13, n.intValue());
        }
        if (o != null)
        {
            qlp1.a(14, o);
        }
        if (p != null)
        {
            qlp1.a(15, p);
        }
        if (q != null)
        {
            qlp1.a(16, q.booleanValue());
        }
        if (r != null)
        {
            qlp1.a(17, r.doubleValue());
        }
        if (s != null)
        {
            qlp1.a(18, s);
        }
        if (t != null)
        {
            qlp1.a(19, t);
        }
        if (u != null)
        {
            qlp1.a(20, u);
        }
        if (v != null)
        {
            qlp1.a(21, v);
        }
        if (w != null)
        {
            qlp1.a(22, w);
        }
        if (x != null)
        {
            qlp1.a(23, x);
        }
        if (y != null)
        {
            qlp1.a(24, y);
        }
        if (z != null)
        {
            qlp1.a(25, z);
        }
        if (A != null)
        {
            qlp1.a(27, A);
        }
        super.a(qlp1);
    }
}
