// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.io.IOException;

// Referenced classes of package com.c.b:
//            as, i, m, av, 
//            by, g, h, bk, 
//            aq, bd, be

public static final class <init> extends as
    implements <init>
{
    public static final class a extends as.a
        implements i.a.e
    {

        private int a;
        private int b;
        private int c;

        private a d(bd bd)
        {
            if (bd instanceof i.a.d)
            {
                return a((i.a.d)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private a d(g g1, aq aq)
        {
            g1 = (i.a.d)i.a.d.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (i.a.d)aq.a();
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

        private i.a.d r()
        {
            i.a.d d1 = s();
            if (!d1.a())
            {
                throw b(d1);
            } else
            {
                return d1;
            }
        }

        private i.a.d s()
        {
            int i1 = 1;
            i.a.d d1 = new i.a.d(this, (byte)0);
            int k1 = a;
            int j1;
            if ((k1 & 1) != 1)
            {
                i1 = 0;
            }
            i.a.d.a(d1, b);
            j1 = i1;
            if ((k1 & 2) == 2)
            {
                j1 = i1 | 2;
            }
            i.a.d.b(d1, c);
            i.a.d.c(d1, j1);
            l();
            return d1;
        }

        public final a.a a(bd bd)
        {
            return d(bd);
        }

        public final a.a a(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final a a(i.a.d d1)
        {
            if (d1 == i.a.d.l())
            {
                return this;
            }
            if (d1.h())
            {
                int i1 = d1.i();
                a = a | 1;
                b = i1;
                q();
            }
            if (d1.j())
            {
                int j1 = d1.k();
                a = a | 2;
                c = j1;
                q();
            }
            d(d1.e);
            q();
            return this;
        }

        public final boolean a()
        {
            return true;
        }

        public final b.a b(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final bd.a c(bd bd)
        {
            return d(bd);
        }

        public final be.a c(g g1, aq aq)
        {
            return d(g1, aq);
        }

        protected final as.g d()
        {
            return com.c.b.i.i().a(com/c/b/i$a$d, com/c/b/i$a$d$a);
        }

        public final ak.a e()
        {
            return com.c.b.i.h();
        }

        public final bd h()
        {
            return s();
        }

        public final bd i()
        {
            return r();
        }

        public final be j()
        {
            return r();
        }

        public final bd w()
        {
            return i.a.d.l();
        }

        private a()
        {
        }

        a(byte byte0)
        {
            this();
        }

        private a(as.b b1)
        {
            super(b1);
        }

        a(as.b b1, byte byte0)
        {
            this(b1);
        }
    }


    public static final bk c = new m();
    private static final t> k = new <init>();
    private int f;
    private int g;
    private int h;
    private byte i;
    private int j;

    static int a(l l1, int i1)
    {
        l1.g = i1;
        return i1;
    }

    static int b(g g1, int i1)
    {
        g1.h = i1;
        return i1;
    }

    static int c(h h1, int i1)
    {
        h1.f = i1;
        return i1;
    }

    public static f l()
    {
        return k;
    }

    private a m()
    {
        if (this == k)
        {
            return new a((byte)0);
        } else
        {
            return (new a((byte)0)).a(this);
        }
    }

    protected final a.a a(a.a a1)
    {
        return new a(a1, (byte)0);
    }

    public final void a(h h1)
    {
        if ((f & 1) == 1)
        {
            h1.a(1, g);
        }
        if ((f & 2) == 2)
        {
            h1.a(2, h);
        }
        e.a(h1);
    }

    public final boolean a()
    {
        byte byte0 = i;
        if (byte0 == 1)
        {
            return true;
        }
        if (byte0 == 0)
        {
            return false;
        } else
        {
            i = 1;
            return true;
        }
    }

    public final int b()
    {
        int i1 = j;
        if (i1 != -1)
        {
            return i1;
        }
        i1 = 0;
        if ((f & 1) == 1)
        {
            i1 = com.c.b.h.d(1, g) + 0;
        }
        int j1 = i1;
        if ((f & 2) == 2)
        {
            j1 = i1 + com.c.b.h.d(2, h);
        }
        i1 = j1 + e.b();
        j = i1;
        return i1;
    }

    protected final j c_()
    {
        return com.c.b.i.i().(com/c/b/i$a$d, com/c/b/i$a$d$a);
    }

    public final by f()
    {
        return e;
    }

    public final boolean h()
    {
        return (f & 1) == 1;
    }

    public final int i()
    {
        return g;
    }

    public final boolean j()
    {
        return (f & 2) == 2;
    }

    public final int k()
    {
        return h;
    }

    public final bk t()
    {
        return c;
    }

    public final c u()
    {
        return k.m();
    }

    public final m v()
    {
        return m();
    }

    public final volatile bd w()
    {
        return k;
    }


    private a()
    {
        i = -1;
        j = -1;
        g = 0;
        h = 0;
    }

    private h(h h1)
    {
        super(h1);
        i = -1;
        j = -1;
    }

    j(j j1, byte byte0)
    {
        this(j1);
    }

    private wable(g g1, aq aq)
    {
        wable wable;
        boolean flag;
        this();
        wable = by.c();
        flag = false;
_L8:
        if (flag) goto _L2; else goto _L1
_L1:
        int i1 = g1.a();
        i1;
        JVM INSTR lookupswitch 3: default 186
    //                   0: 189
    //                   8: 78
    //                   16: 128;
           goto _L3 _L4 _L5 _L6
_L3:
        if (!a(g1, wable, aq, i1))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        f = f | 1;
        g = g1.f();
        continue; /* Loop/switch isn't completed */
        g1;
        throw new RuntimeException(g1.a(this));
        g1;
        e = wable.();
        L();
        throw g1;
_L6:
        f = f | 2;
        h = g1.f();
        continue; /* Loop/switch isn't completed */
        g1;
        throw new RuntimeException((new av(g1.getMessage())).a(this));
_L2:
        e = wable.();
        L();
        return;
_L4:
        flag = true;
        if (true) goto _L8; else goto _L7
_L7:
    }

    L(g g1, aq aq, byte byte0)
    {
        this(g1, aq);
    }
}
