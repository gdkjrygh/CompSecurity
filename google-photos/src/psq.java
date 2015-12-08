// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class psq extends qlq
{

    private Boolean a;
    private Boolean b;
    private Boolean c;
    private Boolean d;
    private Boolean e;
    private Boolean f;
    private pqv g;
    private String h[];
    private Boolean i;
    private String j;
    private Boolean k;
    private Boolean l;
    private Boolean m;
    private psr n[];
    private pss o;

    public psq()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = qmb.f;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = psr.b();
        o = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int j1 = super.a();
        int i1 = j1;
        if (a != null)
        {
            a.booleanValue();
            i1 = j1 + (qlp.c(3) + 1);
        }
        j1 = i1;
        if (b != null)
        {
            b.booleanValue();
            j1 = i1 + (qlp.c(5) + 1);
        }
        i1 = j1;
        if (c != null)
        {
            c.booleanValue();
            i1 = j1 + (qlp.c(6) + 1);
        }
        j1 = i1;
        if (d != null)
        {
            d.booleanValue();
            j1 = i1 + (qlp.c(7) + 1);
        }
        i1 = j1;
        if (e != null)
        {
            e.booleanValue();
            i1 = j1 + (qlp.c(14) + 1);
        }
        j1 = i1;
        if (f != null)
        {
            f.booleanValue();
            j1 = i1 + (qlp.c(15) + 1);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + qlp.c(16, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1;
            if (h.length > 0)
            {
                j1 = 0;
                int k1 = 0;
                int i2;
                int j2;
                for (i2 = 0; j1 < h.length; i2 = j2)
                {
                    String s = h[j1];
                    int k2 = k1;
                    j2 = i2;
                    if (s != null)
                    {
                        j2 = i2 + 1;
                        k2 = k1 + qlp.a(s);
                    }
                    j1++;
                    k1 = k2;
                }

                j1 = i1 + k1 + i2 * 2;
            }
        }
        i1 = j1;
        if (i != null)
        {
            i.booleanValue();
            i1 = j1 + (qlp.c(18) + 1);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + qlp.b(19, j);
        }
        i1 = j1;
        if (k != null)
        {
            k.booleanValue();
            i1 = j1 + (qlp.c(20) + 1);
        }
        j1 = i1;
        if (l != null)
        {
            l.booleanValue();
            j1 = i1 + (qlp.c(21) + 1);
        }
        i1 = j1;
        if (m != null)
        {
            m.booleanValue();
            i1 = j1 + (qlp.c(22) + 1);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1;
            if (n.length > 0)
            {
                int l1 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (l1 >= n.length)
                    {
                        break;
                    }
                    psr psr1 = n[l1];
                    j1 = i1;
                    if (psr1 != null)
                    {
                        j1 = i1 + qlp.c(23, psr1);
                    }
                    l1++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + qlp.c(24, o);
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

            case 24: // '\030'
                a = Boolean.valueOf(qlo1.f());
                break;

            case 40: // '('
                b = Boolean.valueOf(qlo1.f());
                break;

            case 48: // '0'
                c = Boolean.valueOf(qlo1.f());
                break;

            case 56: // '8'
                d = Boolean.valueOf(qlo1.f());
                break;

            case 112: // 'p'
                e = Boolean.valueOf(qlo1.f());
                break;

            case 120: // 'x'
                f = Boolean.valueOf(qlo1.f());
                break;

            case 130: 
                if (g == null)
                {
                    g = new pqv();
                }
                qlo1.a(g);
                break;

            case 138: 
                int l1 = qmb.b(qlo1, 138);
                String as[];
                int j1;
                if (h == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = h.length;
                }
                as = new String[l1 + j1];
                l1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(h, 0, as, 0, j1);
                    l1 = j1;
                }
                for (; l1 < as.length - 1; l1++)
                {
                    as[l1] = qlo1.g();
                    qlo1.a();
                }

                as[l1] = qlo1.g();
                h = as;
                break;

            case 144: 
                i = Boolean.valueOf(qlo1.f());
                break;

            case 154: 
                j = qlo1.g();
                break;

            case 160: 
                k = Boolean.valueOf(qlo1.f());
                break;

            case 168: 
                l = Boolean.valueOf(qlo1.f());
                break;

            case 176: 
                m = Boolean.valueOf(qlo1.f());
                break;

            case 186: 
                int i2 = qmb.b(qlo1, 186);
                psr apsr[];
                int k1;
                if (n == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = n.length;
                }
                apsr = new psr[i2 + k1];
                i2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(n, 0, apsr, 0, k1);
                    i2 = k1;
                }
                for (; i2 < apsr.length - 1; i2++)
                {
                    apsr[i2] = new psr();
                    qlo1.a(apsr[i2]);
                    qlo1.a();
                }

                apsr[i2] = new psr();
                qlo1.a(apsr[i2]);
                n = apsr;
                break;

            case 194: 
                if (o == null)
                {
                    o = new pss();
                }
                qlo1.a(o);
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (a != null)
        {
            qlp1.a(3, a.booleanValue());
        }
        if (b != null)
        {
            qlp1.a(5, b.booleanValue());
        }
        if (c != null)
        {
            qlp1.a(6, c.booleanValue());
        }
        if (d != null)
        {
            qlp1.a(7, d.booleanValue());
        }
        if (e != null)
        {
            qlp1.a(14, e.booleanValue());
        }
        if (f != null)
        {
            qlp1.a(15, f.booleanValue());
        }
        if (g != null)
        {
            qlp1.a(16, g);
        }
        if (h != null && h.length > 0)
        {
            for (int i1 = 0; i1 < h.length; i1++)
            {
                String s = h[i1];
                if (s != null)
                {
                    qlp1.a(17, s);
                }
            }

        }
        if (i != null)
        {
            qlp1.a(18, i.booleanValue());
        }
        if (j != null)
        {
            qlp1.a(19, j);
        }
        if (k != null)
        {
            qlp1.a(20, k.booleanValue());
        }
        if (l != null)
        {
            qlp1.a(21, l.booleanValue());
        }
        if (m != null)
        {
            qlp1.a(22, m.booleanValue());
        }
        if (n != null && n.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < n.length; j1++)
            {
                psr psr1 = n[j1];
                if (psr1 != null)
                {
                    qlp1.a(23, psr1);
                }
            }

        }
        if (o != null)
        {
            qlp1.a(24, o);
        }
        super.a(qlp1);
    }
}
