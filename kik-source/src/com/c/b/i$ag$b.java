// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.io.IOException;

// Referenced classes of package com.c.b:
//            as, i, aj, av, 
//            by, g, f, h, 
//            bk, aq, bd, be

public static final class <init> extends as
    implements <init>
{
    public static final class a extends as.a
        implements i.ag.c
    {

        private int a;
        private Object b;
        private boolean c;

        private a d(bd bd)
        {
            if (bd instanceof i.ag.b)
            {
                return a((i.ag.b)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private a d(g g1, aq aq)
        {
            g1 = (i.ag.b)i.ag.b.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (i.ag.b)aq.a();
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

        private i.ag.b r()
        {
            i.ag.b b1 = s();
            if (!b1.a())
            {
                throw b(b1);
            } else
            {
                return b1;
            }
        }

        private i.ag.b s()
        {
            int i1 = 1;
            i.ag.b b1 = new i.ag.b(this, (byte)0);
            int k1 = a;
            int j1;
            if ((k1 & 1) != 1)
            {
                i1 = 0;
            }
            i.ag.b.a(b1, b);
            j1 = i1;
            if ((k1 & 2) == 2)
            {
                j1 = i1 | 2;
            }
            i.ag.b.a(b1, c);
            i.ag.b.a(b1, j1);
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

        public final a a(i.ag.b b1)
        {
            if (b1 == i.ag.b.k())
            {
                return this;
            }
            if (b1.h())
            {
                a = a | 1;
                b = i.ag.b.a(b1);
                q();
            }
            if (b1.i())
            {
                boolean flag = b1.j();
                a = a | 2;
                c = flag;
                q();
            }
            d(b1.e);
            q();
            return this;
        }

        public final boolean a()
        {
            boolean flag;
            if ((a & 1) == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                boolean flag1;
                if ((a & 2) == 2)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (flag1)
                {
                    return true;
                }
            }
            return false;
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
            return com.c.b.i.M().a(com/c/b/i$ag$b, com/c/b/i$ag$b$a);
        }

        public final ak.a e()
        {
            return com.c.b.i.L();
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
            return i.ag.b.k();
        }

        private a()
        {
            b = "";
        }

        a(byte byte0)
        {
            this();
        }

        private a(as.b b1)
        {
            super(b1);
            b = "";
        }

        a(as.b b1, byte byte0)
        {
            this(b1);
        }
    }


    public static final bk c = new aj();
    private static final t> k = new <init>();
    private int f;
    private volatile Object g;
    private boolean h;
    private byte i;
    private int j;

    static int a(t t1, int i1)
    {
        t1.f = i1;
        return i1;
    }

    static Object a(f f1)
    {
        return f1.g;
    }

    static Object a(t t1, Object obj)
    {
        t1.g = obj;
        return obj;
    }

    static boolean a(g g1, boolean flag)
    {
        g1.h = flag;
        return flag;
    }

    public static h k()
    {
        return k;
    }

    private f l()
    {
        Object obj = g;
        if (obj instanceof String)
        {
            obj = com.c.b.f.a((String)obj);
            g = obj;
            return ((f) (obj));
        } else
        {
            return (f)obj;
        }
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
            h1.a(1, l());
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
        }
        if (!h())
        {
            i = 0;
            return false;
        }
        if (!i())
        {
            i = 0;
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
            i1 = com.c.b.h.c(1, l()) + 0;
        }
        int j1 = i1;
        if ((f & 2) == 2)
        {
            j1 = i1 + (com.c.b.h.j(2) + 1);
        }
        i1 = j1 + e.b();
        j = i1;
        return i1;
    }

    protected final j c_()
    {
        return com.c.b.i.M().(com/c/b/i$ag$b, com/c/b/i$ag$b$a);
    }

    public final by f()
    {
        return e;
    }

    public final boolean h()
    {
        return (f & 1) == 1;
    }

    public final boolean i()
    {
        return (f & 2) == 2;
    }

    public final boolean j()
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
        g = "";
        h = false;
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

    private able(g g1, aq aq)
    {
        able able;
        boolean flag;
        this();
        able = by.c();
        flag = false;
_L8:
        if (flag) goto _L2; else goto _L1
_L1:
        int i1 = g1.a();
        i1;
        JVM INSTR lookupswitch 3: default 190
    //                   0: 193
    //                   10: 78
    //                   16: 132;
           goto _L3 _L4 _L5 _L6
_L3:
        if (!a(g1, able, aq, i1))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        f f1 = g1.l();
        f = f | 1;
        g = f1;
        continue; /* Loop/switch isn't completed */
        g1;
        throw new RuntimeException(g1.a(this));
        g1;
        e = able.e();
        L();
        throw g1;
_L6:
        f = f | 2;
        h = g1.i();
        continue; /* Loop/switch isn't completed */
        g1;
        throw new RuntimeException((new av(g1.getMessage())).a(this));
_L2:
        e = able.e();
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
