// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;


// Referenced classes of package com.c.b:
//            i, av, bk, as, 
//            bp, bd, g, aq, 
//            be

public static final class <init> extends <init>
    implements <init>
{

    private int a;
    private Object b;
    private int c;
    private int d;
    private int e;
    private Object f;
    private Object g;
    private Object h;
    private int i;
    private ct j;
    private bp k;

    private <init> d(bd bd)
    {
        if (bd instanceof <init>)
        {
            return a((a)bd);
        } else
        {
            super.(bd);
            return this;
        }
    }

    private  d(g g1, aq aq)
    {
        g1 = ().a(g1, aq);
        if (g1 != null)
        {
            a(g1);
        }
        return this;
        aq;
        g1 = (a)aq.a();
        throw aq;
        aq;
_L2:
        if (g1 != null)
        {
            a(g1);
        }
        throw aq;
        aq;
        g1 = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void r()
    {
        if (as.d && k == null)
        {
            k = new bp(u(), p(), n());
            j = null;
        }
    }

    private j s()
    {
        j j1 = t();
        if (!j1.t())
        {
            throw b(j1);
        } else
        {
            return j1;
        }
    }

    private b t()
    {
        int i1 = 1;
        ct ct = new nit>(this, (byte)0);
        int j1 = a;
        int l;
        if ((j1 & 1) != 1)
        {
            i1 = 0;
        }
        a(ct, b);
        l = i1;
        if ((j1 & 2) == 2)
        {
            l = i1 | 2;
        }
        b(ct, c);
        i1 = l;
        if ((j1 & 4) == 4)
        {
            i1 = l | 4;
        }
        c(ct, d);
        l = i1;
        if ((j1 & 8) == 8)
        {
            l = i1 | 8;
        }
        d(ct, e);
        i1 = l;
        if ((j1 & 0x10) == 16)
        {
            i1 = l | 0x10;
        }
        e(ct, f);
        l = i1;
        if ((j1 & 0x20) == 32)
        {
            l = i1 | 0x20;
        }
        f(ct, g);
        i1 = l;
        if ((j1 & 0x40) == 64)
        {
            i1 = l | 0x40;
        }
        g(ct, h);
        l = i1;
        if ((j1 & 0x80) == 128)
        {
            l = i1 | 0x80;
        }
        h(ct, i);
        if ((j1 & 0x100) == 256)
        {
            l |= 0x100;
        }
        if (k == null)
        {
            k(ct, j);
        } else
        {
            j(ct, (j)k.c());
        }
        k(ct, l);
        l();
        return ct;
    }

    private l u()
    {
        if (k == null)
        {
            if (j == null)
            {
                return j();
            } else
            {
                return j;
            }
        } else
        {
            return (j)k.b();
        }
    }

    public final k a(bd bd)
    {
        return d(bd);
    }

    public final d a(g g1, aq aq)
    {
        return d(g1, aq);
    }

    public final d a(d d1)
    {
        if (d1 == d())
        {
            return this;
        }
        if (d1.d())
        {
            a = a | 1;
            b = b(d1);
            q();
        }
        if (d1.q())
        {
            int l = d1.q();
            a = a | 2;
            c = l;
            q();
        }
        if (d1.q())
        {
            d d2 = d1.q();
            if (d2 == null)
            {
                throw new NullPointerException();
            }
            a = a | 4;
            d = d2.a();
            q();
        }
        if (d1.q())
        {
            d d3 = d1.q();
            if (d3 == null)
            {
                throw new NullPointerException();
            }
            a = a | 8;
            e = d3.a();
            q();
        }
        if (d1.q())
        {
            a = a | 0x10;
            f = f(d1);
            q();
        }
        if (d1.q())
        {
            a = a | 0x20;
            g = g(d1);
            q();
        }
        if (d1.q())
        {
            a = a | 0x40;
            h = h(d1);
            q();
        }
        if (d1.q())
        {
            int i1 = d1.q();
            a = a | 0x80;
            i = i1;
            q();
        }
        if (d1.q())
        {
            d d4 = d1.q();
            if (k == null)
            {
                if ((a & 0x100) == 256 && j != null && j != j())
                {
                    j = j(j).a(d4).g();
                } else
                {
                    j = d4;
                }
                q();
            } else
            {
                k.b(d4);
            }
            a = a | 0x100;
        }
        d(d1.d);
        q();
        return this;
    }

    public final boolean a()
    {
        boolean flag;
        if ((a & 0x100) == 256)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return !flag || u().u();
    }

    public final u b(g g1, aq aq)
    {
        return d(g1, aq);
    }

    public final d c(bd bd)
    {
        return d(bd);
    }

    public final d c(g g1, aq aq)
    {
        return d(g1, aq);
    }

    protected final d d()
    {
        return com.c.b.i.k().(com/c/b/i$k, com/c/b/i$k$a);
    }

    public final s e()
    {
        return com.c.b.i.j();
    }

    public final bd h()
    {
        return t();
    }

    public final bd i()
    {
        return s();
    }

    public final be j()
    {
        return s();
    }

    public final bd w()
    {
        return s();
    }

    private ct()
    {
        b = "";
        d = 1;
        e = 1;
        f = "";
        g = "";
        h = "";
        j = null;
        r();
    }

    r(byte byte0)
    {
        this();
    }

    private <init>(<init> <init>1)
    {
        super(<init>1);
        b = "";
        d = 1;
        e = 1;
        f = "";
        g = "";
        h = "";
        j = null;
        r();
    }

    r(r r1, byte byte0)
    {
        this(r1);
    }
}
