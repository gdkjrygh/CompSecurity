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
    private Object c;
    private Object d;
    private ct e;
    private bp f;
    private boolean g;
    private boolean h;

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
        if (as.d && f == null)
        {
            f = new bp(u(), p(), n());
            e = null;
        }
    }

    private e s()
    {
        e e1 = t();
        if (!e1.t())
        {
            throw b(e1);
        } else
        {
            return e1;
        }
    }

    private b t()
    {
        int l = 1;
        ct ct = new nit>(this, (byte)0);
        int i1 = a;
        int k;
        if ((i1 & 1) != 1)
        {
            l = 0;
        }
        a(ct, b);
        k = l;
        if ((i1 & 2) == 2)
        {
            k = l | 2;
        }
        b(ct, c);
        l = k;
        if ((i1 & 4) == 4)
        {
            l = k | 4;
        }
        c(ct, d);
        if ((i1 & 8) == 8)
        {
            l |= 8;
        }
        if (f == null)
        {
            f(ct, e);
        } else
        {
            e(ct, (e)f.c());
        }
        k = l;
        if ((i1 & 0x10) == 16)
        {
            k = l | 0x10;
        }
        f(ct, g);
        l = k;
        if ((i1 & 0x20) == 32)
        {
            l = k | 0x20;
        }
        g(ct, h);
        h(ct, l);
        l();
        return ct;
    }

    private l u()
    {
        if (f == null)
        {
            if (e == null)
            {
                return e();
            } else
            {
                return e;
            }
        } else
        {
            return (e)f.b();
        }
    }

    public final f a(bd bd)
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
            a = a | 2;
            c = c(d1);
            q();
        }
        if (d1.q())
        {
            a = a | 4;
            d = d(d1);
            q();
        }
        if (d1.q())
        {
            d d2 = d1.q();
            if (f == null)
            {
                boolean flag;
                if ((a & 8) == 8 && e != null && e != e())
                {
                    e = e(e).a(d2).g();
                } else
                {
                    e = d2;
                }
                q();
            } else
            {
                f.b(d2);
            }
            a = a | 8;
        }
        if (d1.a())
        {
            flag = d1.a();
            a = a | 0x10;
            g = flag;
            q();
        }
        if (d1.q())
        {
            flag = d1.q();
            a = a | 0x20;
            h = flag;
            q();
        }
        d(d1.d);
        q();
        return this;
    }

    public final boolean a()
    {
        boolean flag;
        if ((a & 8) == 8)
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
        return com.c.b.i.u().(com/c/b/i$u, com/c/b/i$u$a);
    }

    public final s e()
    {
        return com.c.b.i.t();
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
        c = "";
        d = "";
        e = null;
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
        c = "";
        d = "";
        e = null;
        r();
    }

    r(r r1, byte byte0)
    {
        this(r1);
    }
}
