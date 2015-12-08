// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.c.b:
//            i, av, bk, as, 
//            bn, bd, g, aq, 
//            be

public static final class <init> extends <init>
    implements <init>
{

    private int a;
    private Object b;
    private Object c;
    private boolean d;
    private boolean e;
    private boolean f;
    private int g;
    private Object h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private Object n;
    private Object o;
    private List p;
    private bn q;

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

    private void s()
    {
        if (as.d)
        {
            u();
        }
    }

    private u t()
    {
        u u1 = g();
        if (!u1.g())
        {
            throw b(u1);
        } else
        {
            return u1;
        }
    }

    private bn u()
    {
        if (q == null)
        {
            List list = p;
            boolean flag;
            if ((a & 0x4000) == 16384)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            q = new bn(list, flag, p(), n());
            p = null;
        }
        return q;
    }

    public final q a(bd bd)
    {
        return d(bd);
    }

    public final d a(g g1, aq aq)
    {
        return d(g1, aq);
    }

    public final d a(d d1)
    {
        bn bn1;
        bn1 = null;
        if (d1 == able())
        {
            return this;
        }
        if (d1.able())
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
            boolean flag = d1.q();
            a = a | 4;
            d = flag;
            q();
        }
        if (d1.q())
        {
            boolean flag1 = d1.q();
            a = a | 8;
            e = flag1;
            q();
        }
        if (d1.q())
        {
            boolean flag2 = d1.q();
            a = a | 0x10;
            f = flag2;
            q();
        }
        if (d1.q())
        {
            able able = d1.q();
            if (able == null)
            {
                throw new NullPointerException();
            }
            a = a | 0x20;
            g = able.a();
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
            boolean flag3 = d1.q();
            a = a | 0x80;
            i = flag3;
            q();
        }
        if (d1.q())
        {
            boolean flag4 = d1.q();
            a = a | 0x100;
            j = flag4;
            q();
        }
        if (d1.q())
        {
            boolean flag5 = d1.q();
            a = a | 0x200;
            k = flag5;
            q();
        }
        if (d1.q())
        {
            boolean flag6 = d1.q();
            a = a | 0x400;
            l = flag6;
            q();
        }
        if (d1.q())
        {
            boolean flag7 = d1.q();
            a = a | 0x800;
            m = flag7;
            q();
        }
        if (d1.q())
        {
            a = a | 0x1000;
            n = n(d1);
            q();
        }
        if (d1.q())
        {
            a = a | 0x2000;
            o = o(d1);
            q();
        }
        if (q != null) goto _L2; else goto _L1
_L1:
        if (!q(d1).isEmpty())
        {
            if (p.isEmpty())
            {
                p = p(d1);
                a = a & 0xffffbfff;
            } else
            {
                if ((a & 0x4000) != 16384)
                {
                    p = new ArrayList(p);
                    a = a | 0x4000;
                }
                p.addAll(ection(d1));
            }
            q();
        }
_L4:
        a(((a) (d1)));
        d(d1.d);
        q();
        return this;
_L2:
        if (!q(d1).isEmpty())
        {
            if (q.d())
            {
                q.b();
                q = null;
                p = p(d1);
                a = a & 0xffffbfff;
                if (as.d)
                {
                    bn1 = u();
                }
                q = bn1;
            } else
            {
                q.a(able(d1));
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean a()
    {
        int i1 = 0;
_L7:
        able able;
        int j1;
        if (q == null)
        {
            j1 = p.size();
        } else
        {
            j1 = q.c();
        }
        if (i1 >= j1) goto _L2; else goto _L1
_L1:
        if (q == null)
        {
            able = (q)p.get(i1);
        } else
        {
            able = (.get)q.a(i1);
        }
        if (able.()) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        i1++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (!r()) goto _L3; else goto _L5
_L5:
        return true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final r b(g g1, aq aq)
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
        return com.c.b.i.w().(com/c/b/i$q, com/c/b/i$q$a);
    }

    public final s e()
    {
        return com.c.b.i.v();
    }

    public final s g()
    {
        int j1 = 1;
          = new nit>(this, (byte)0);
        int k1 = a;
        int i1;
        if ((k1 & 1) != 1)
        {
            j1 = 0;
        }
        a(, b);
        i1 = j1;
        if ((k1 & 2) == 2)
        {
            i1 = j1 | 2;
        }
        b(, c);
        j1 = i1;
        if ((k1 & 4) == 4)
        {
            j1 = i1 | 4;
        }
        c(, d);
        i1 = j1;
        if ((k1 & 8) == 8)
        {
            i1 = j1 | 8;
        }
        d(, e);
        j1 = i1;
        if ((k1 & 0x10) == 16)
        {
            j1 = i1 | 0x10;
        }
        e(, f);
        i1 = j1;
        if ((k1 & 0x20) == 32)
        {
            i1 = j1 | 0x20;
        }
        f(, g);
        j1 = i1;
        if ((k1 & 0x40) == 64)
        {
            j1 = i1 | 0x40;
        }
        g(, h);
        i1 = j1;
        if ((k1 & 0x80) == 128)
        {
            i1 = j1 | 0x80;
        }
        h(, i);
        j1 = i1;
        if ((k1 & 0x100) == 256)
        {
            j1 = i1 | 0x100;
        }
        i(, j);
        i1 = j1;
        if ((k1 & 0x200) == 512)
        {
            i1 = j1 | 0x200;
        }
        j(, k);
        j1 = i1;
        if ((k1 & 0x400) == 1024)
        {
            j1 = i1 | 0x400;
        }
        k(, l);
        i1 = j1;
        if ((k1 & 0x800) == 2048)
        {
            i1 = j1 | 0x800;
        }
        l(, m);
        j1 = i1;
        if ((k1 & 0x1000) == 4096)
        {
            j1 = i1 | 0x1000;
        }
        m(, n);
        i1 = j1;
        if ((k1 & 0x2000) == 8192)
        {
            i1 = j1 | 0x2000;
        }
        n(, o);
        if (q == null)
        {
            if ((a & 0x4000) == 16384)
            {
                p = Collections.unmodifiableList(p);
                a = a & 0xffffbfff;
            }
            a(, p);
        } else
        {
            p(, q.e());
        }
        q(, i1);
        l();
        return ;
    }

    public final bd h()
    {
        return g();
    }

    public final bd i()
    {
        return t();
    }

    public final be j()
    {
        return t();
    }

    public final bd w()
    {
        return t();
    }

    private ()
    {
        b = "";
        c = "";
        g = 1;
        h = "";
        n = "";
        o = "";
        p = Collections.emptyList();
        s();
    }

    s(byte byte0)
    {
        this();
    }

    private <init>(<init> <init>1)
    {
        super(<init>1);
        b = "";
        c = "";
        g = 1;
        h = "";
        n = "";
        o = "";
        p = Collections.emptyList();
        s();
    }

    s(s s1, byte byte0)
    {
        this(s1);
    }
}
