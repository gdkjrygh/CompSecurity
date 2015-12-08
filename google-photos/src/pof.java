// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pof extends qlq
{

    private String a;
    private String b;
    private Integer c;
    private Float d;
    private Float e;
    private Float f;
    private Long g;
    private Float h;
    private Boolean i;
    private Float j;
    private String k;
    private Long l;
    private Integer m;
    private Integer n;
    private Integer o;
    private String p;
    private String q;
    private String r;
    private String s;

    public pof()
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
        r = null;
        s = null;
        F = null;
        G = -1;
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
        if (b != null)
        {
            j1 = i1 + qlp.b(2, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + qlp.e(3, c.intValue());
        }
        j1 = i1;
        if (d != null)
        {
            d.floatValue();
            j1 = i1 + (qlp.c(4) + 4);
        }
        i1 = j1;
        if (e != null)
        {
            e.floatValue();
            i1 = j1 + (qlp.c(5) + 4);
        }
        j1 = i1;
        if (f != null)
        {
            f.floatValue();
            j1 = i1 + (qlp.c(6) + 4);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + qlp.e(7, g.longValue());
        }
        j1 = i1;
        if (h != null)
        {
            h.floatValue();
            j1 = i1 + (qlp.c(8) + 4);
        }
        i1 = j1;
        if (i != null)
        {
            i.booleanValue();
            i1 = j1 + (qlp.c(9) + 1);
        }
        j1 = i1;
        if (j != null)
        {
            j.floatValue();
            j1 = i1 + (qlp.c(10) + 4);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + qlp.b(11, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + qlp.e(12, l.longValue());
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + qlp.e(13, m.intValue());
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + qlp.e(14, n.intValue());
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + qlp.e(15, o.intValue());
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + qlp.b(16, p);
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + qlp.b(17, q);
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + qlp.b(18, r);
        }
        i1 = j1;
        if (s != null)
        {
            i1 = j1 + qlp.b(19, s);
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
                b = qlo1.g();
                break;

            case 24: // '\030'
                c = Integer.valueOf(qlo1.i());
                break;

            case 37: // '%'
                d = Float.valueOf(Float.intBitsToFloat(qlo1.k()));
                break;

            case 45: // '-'
                e = Float.valueOf(Float.intBitsToFloat(qlo1.k()));
                break;

            case 53: // '5'
                f = Float.valueOf(Float.intBitsToFloat(qlo1.k()));
                break;

            case 56: // '8'
                g = Long.valueOf(qlo1.j());
                break;

            case 69: // 'E'
                h = Float.valueOf(Float.intBitsToFloat(qlo1.k()));
                break;

            case 72: // 'H'
                i = Boolean.valueOf(qlo1.f());
                break;

            case 85: // 'U'
                j = Float.valueOf(Float.intBitsToFloat(qlo1.k()));
                break;

            case 90: // 'Z'
                k = qlo1.g();
                break;

            case 96: // '`'
                l = Long.valueOf(qlo1.j());
                break;

            case 104: // 'h'
                m = Integer.valueOf(qlo1.i());
                break;

            case 112: // 'p'
                n = Integer.valueOf(qlo1.i());
                break;

            case 120: // 'x'
                o = Integer.valueOf(qlo1.i());
                break;

            case 130: 
                p = qlo1.g();
                break;

            case 138: 
                q = qlo1.g();
                break;

            case 146: 
                r = qlo1.g();
                break;

            case 154: 
                s = qlo1.g();
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
            qlp1.a(3, c.intValue());
        }
        if (d != null)
        {
            qlp1.a(4, d.floatValue());
        }
        if (e != null)
        {
            qlp1.a(5, e.floatValue());
        }
        if (f != null)
        {
            qlp1.a(6, f.floatValue());
        }
        if (g != null)
        {
            qlp1.b(7, g.longValue());
        }
        if (h != null)
        {
            qlp1.a(8, h.floatValue());
        }
        if (i != null)
        {
            qlp1.a(9, i.booleanValue());
        }
        if (j != null)
        {
            qlp1.a(10, j.floatValue());
        }
        if (k != null)
        {
            qlp1.a(11, k);
        }
        if (l != null)
        {
            qlp1.b(12, l.longValue());
        }
        if (m != null)
        {
            qlp1.a(13, m.intValue());
        }
        if (n != null)
        {
            qlp1.a(14, n.intValue());
        }
        if (o != null)
        {
            qlp1.a(15, o.intValue());
        }
        if (p != null)
        {
            qlp1.a(16, p);
        }
        if (q != null)
        {
            qlp1.a(17, q);
        }
        if (r != null)
        {
            qlp1.a(18, r);
        }
        if (s != null)
        {
            qlp1.a(19, s);
        }
        super.a(qlp1);
    }
}
