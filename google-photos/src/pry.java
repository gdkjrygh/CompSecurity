// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pry extends qlq
{

    public Integer a;
    public Integer b;
    public String c;
    public String d;
    public prz e;
    public String f;
    public psh g[];
    private Float h;
    private Float i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private Boolean o;
    private Double p;
    private Boolean q;
    private String r;

    public pry()
    {
        a = null;
        b = null;
        h = null;
        i = null;
        c = null;
        d = null;
        j = null;
        k = null;
        e = null;
        l = null;
        m = null;
        f = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        g = psh.b();
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j1 = super.a();
        int i1 = j1;
        if (h != null)
        {
            h.floatValue();
            i1 = j1 + (qlp.c(1) + 4);
        }
        j1 = i1;
        if (i != null)
        {
            i.floatValue();
            j1 = i1 + (qlp.c(2) + 4);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + qlp.b(3, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + qlp.b(4, d);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + qlp.b(5, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + qlp.b(6, k);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + qlp.c(7, e);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + qlp.b(8, l);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + qlp.b(9, m);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + qlp.b(10, f);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + qlp.b(11, n);
        }
        j1 = i1;
        if (o != null)
        {
            o.booleanValue();
            j1 = i1 + (qlp.c(12) + 1);
        }
        i1 = j1;
        if (p != null)
        {
            p.doubleValue();
            i1 = j1 + (qlp.c(13) + 8);
        }
        j1 = i1;
        if (a != null)
        {
            j1 = i1 + qlp.e(14, a.intValue());
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + qlp.e(15, b.intValue());
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
            i1 = j1 + qlp.b(17, r);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1;
            if (g.length > 0)
            {
                for (j1 = 0; j1 < g.length;)
                {
                    psh psh1 = g[j1];
                    int k1 = i1;
                    if (psh1 != null)
                    {
                        k1 = i1 + qlp.c(18, psh1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
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

            case 13: // '\r'
                h = Float.valueOf(Float.intBitsToFloat(qlo1.k()));
                break;

            case 21: // '\025'
                i = Float.valueOf(Float.intBitsToFloat(qlo1.k()));
                break;

            case 26: // '\032'
                c = qlo1.g();
                break;

            case 34: // '"'
                d = qlo1.g();
                break;

            case 42: // '*'
                j = qlo1.g();
                break;

            case 50: // '2'
                k = qlo1.g();
                break;

            case 58: // ':'
                if (e == null)
                {
                    e = new prz();
                }
                qlo1.a(e);
                break;

            case 66: // 'B'
                l = qlo1.g();
                break;

            case 74: // 'J'
                m = qlo1.g();
                break;

            case 82: // 'R'
                f = qlo1.g();
                break;

            case 90: // 'Z'
                n = qlo1.g();
                break;

            case 96: // '`'
                o = Boolean.valueOf(qlo1.f());
                break;

            case 105: // 'i'
                p = Double.valueOf(Double.longBitsToDouble(qlo1.l()));
                break;

            case 112: // 'p'
                a = Integer.valueOf(qlo1.i());
                break;

            case 120: // 'x'
                b = Integer.valueOf(qlo1.i());
                break;

            case 128: 
                q = Boolean.valueOf(qlo1.f());
                break;

            case 138: 
                r = qlo1.g();
                break;

            case 146: 
                int k1 = qmb.b(qlo1, 146);
                psh apsh[];
                int j1;
                if (g == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = g.length;
                }
                apsh = new psh[k1 + j1];
                k1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(g, 0, apsh, 0, j1);
                    k1 = j1;
                }
                for (; k1 < apsh.length - 1; k1++)
                {
                    apsh[k1] = new psh();
                    qlo1.a(apsh[k1]);
                    qlo1.a();
                }

                apsh[k1] = new psh();
                qlo1.a(apsh[k1]);
                g = apsh;
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (h != null)
        {
            qlp1.a(1, h.floatValue());
        }
        if (i != null)
        {
            qlp1.a(2, i.floatValue());
        }
        if (c != null)
        {
            qlp1.a(3, c);
        }
        if (d != null)
        {
            qlp1.a(4, d);
        }
        if (j != null)
        {
            qlp1.a(5, j);
        }
        if (k != null)
        {
            qlp1.a(6, k);
        }
        if (e != null)
        {
            qlp1.a(7, e);
        }
        if (l != null)
        {
            qlp1.a(8, l);
        }
        if (m != null)
        {
            qlp1.a(9, m);
        }
        if (f != null)
        {
            qlp1.a(10, f);
        }
        if (n != null)
        {
            qlp1.a(11, n);
        }
        if (o != null)
        {
            qlp1.a(12, o.booleanValue());
        }
        if (p != null)
        {
            qlp1.a(13, p.doubleValue());
        }
        if (a != null)
        {
            qlp1.a(14, a.intValue());
        }
        if (b != null)
        {
            qlp1.a(15, b.intValue());
        }
        if (q != null)
        {
            qlp1.a(16, q.booleanValue());
        }
        if (r != null)
        {
            qlp1.a(17, r);
        }
        if (g != null && g.length > 0)
        {
            for (int i1 = 0; i1 < g.length; i1++)
            {
                psh psh1 = g[i1];
                if (psh1 != null)
                {
                    qlp1.a(18, psh1);
                }
            }

        }
        super.a(qlp1);
    }
}
