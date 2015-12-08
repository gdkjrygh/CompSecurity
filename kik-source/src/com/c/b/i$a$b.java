// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.io.IOException;

// Referenced classes of package com.c.b:
//            as, i, l, av, 
//            by, g, h, bk, 
//            aq, bd, be

public static final class <init> extends as
    implements <init>
{
    public static final class a extends as.a
        implements i.a.c
    {

        private int a;
        private int b;
        private int c;

        private a d(bd bd)
        {
            if (bd instanceof i.a.b)
            {
                return a((i.a.b)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private a d(g g1, aq aq)
        {
            g1 = (i.a.b)i.a.b.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (i.a.b)aq.a();
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

        private i.a.b r()
        {
            int i1 = 1;
            i.a.b b1 = new i.a.b(this, (byte)0);
            int k1 = a;
            int j1;
            if ((k1 & 1) != 1)
            {
                i1 = 0;
            }
            i.a.b.a(b1, b);
            j1 = i1;
            if ((k1 & 2) == 2)
            {
                j1 = i1 | 2;
            }
            i.a.b.b(b1, c);
            i.a.b.c(b1, j1);
            l();
            return b1;
        }

        public final a.a a(bd bd)
        {
            return d(bd);
        }

        public final a.a a(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final a a(int i1)
        {
            a = a | 1;
            b = i1;
            q();
            return this;
        }

        public final a a(i.a.b b1)
        {
            if (b1 == i.a.b.m())
            {
                return this;
            }
            if (b1.h())
            {
                a(b1.i());
            }
            if (b1.j())
            {
                b(b1.k());
            }
            d(b1.e);
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

        public final a b(int i1)
        {
            a = a | 2;
            c = i1;
            q();
            return this;
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
            return com.c.b.i.g().a(com/c/b/i$a$b, com/c/b/i$a$b$a);
        }

        public final ak.a e()
        {
            return com.c.b.i.f();
        }

        public final i.a.b g()
        {
            i.a.b b1 = r();
            if (!b1.a())
            {
                throw b(b1);
            } else
            {
                return b1;
            }
        }

        public final bd h()
        {
            return r();
        }

        public final bd i()
        {
            return g();
        }

        public final be j()
        {
            return g();
        }

        public final bd w()
        {
            return i.a.b.m();
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


    public static final bk c = new l();
    private static final t> k = new <init>();
    private int f;
    private int g;
    private int h;
    private byte i;
    private int j;

    static int a(m m1, int i1)
    {
        m1.g = i1;
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

    public static a l()
    {
        return k.n();
    }

    public static n m()
    {
        return k;
    }

    private a n()
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
        return com.c.b.i.g().(com/c/b/i$a$b, com/c/b/i$a$b$a);
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
        return k.n();
    }

    public final n v()
    {
        return n();
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
