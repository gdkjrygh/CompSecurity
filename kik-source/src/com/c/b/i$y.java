// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.io.IOException;

// Referenced classes of package com.c.b:
//            as, i, ad, av, 
//            by, g, f, h, 
//            bk, aq, bd, be

public static final class <init> extends as
    implements <init>
{
    public static final class a extends as.a
        implements i.z
    {

        private int a;
        private Object b;

        private a d(bd bd)
        {
            if (bd instanceof i.y)
            {
                return a((i.y)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private a d(g g1, aq aq)
        {
            g1 = (i.y)i.y.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (i.y)aq.a();
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

        private i.y r()
        {
            i.y y1 = s();
            if (!y1.a())
            {
                throw b(y1);
            } else
            {
                return y1;
            }
        }

        private i.y s()
        {
            int i1 = 1;
            i.y y1 = new i.y(this, (byte)0);
            if ((a & 1) != 1)
            {
                i1 = 0;
            }
            i.y.a(y1, b);
            i.y.a(y1, i1);
            l();
            return y1;
        }

        public final a.a a(bd bd)
        {
            return d(bd);
        }

        public final a.a a(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final a a(i.y y1)
        {
            if (y1 == i.y.j())
            {
                return this;
            }
            if (y1.h())
            {
                a = a | 1;
                b = i.y.a(y1);
                q();
            }
            d(y1.e);
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
            return com.c.b.i.m().a(com/c/b/i$y, com/c/b/i$y$a);
        }

        public final ak.a e()
        {
            return com.c.b.i.l();
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
            return i.y.j();
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


    public static final bk c = new ad();
    private static final init> j = new <init>();
    private int f;
    private volatile Object g;
    private byte h;
    private int i;

    static int a(ject ject, int i1)
    {
        ject.f = i1;
        return i1;
    }

    static Object a(f f1)
    {
        return f1.g;
    }

    static Object a(ject ject, Object obj)
    {
        ject.g = obj;
        return obj;
    }

    public static g j()
    {
        return j;
    }

    private f k()
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

    private a l()
    {
        if (this == j)
        {
            return new a((byte)0);
        } else
        {
            return (new a((byte)0)).a(this);
        }
    }

    protected final  a( )
    {
        return new a(, (byte)0);
    }

    public final void a(h h1)
    {
        if ((f & 1) == 1)
        {
            h1.a(1, k());
        }
        e.a(h1);
    }

    public final boolean a()
    {
        byte byte0 = h;
        if (byte0 == 1)
        {
            return true;
        }
        if (byte0 == 0)
        {
            return false;
        } else
        {
            h = 1;
            return true;
        }
    }

    public final int b()
    {
        int i1 = i;
        if (i1 != -1)
        {
            return i1;
        }
        i1 = 0;
        if ((f & 1) == 1)
        {
            i1 = com.c.b.h.c(1, k()) + 0;
        }
        i1 += e.b();
        i = i1;
        return i1;
    }

    protected final  c_()
    {
        return com.c.b.i.m().a(com/c/b/i$y, com/c/b/i$y$a);
    }

    public final by f()
    {
        return e;
    }

    public final boolean h()
    {
        return (f & 1) == 1;
    }

    public final String i()
    {
        Object obj = g;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        obj = (f)obj;
        String s = ((f) (obj)).f();
        if (((f) (obj)).g())
        {
            g = s;
        }
        return s;
    }

    public final bk t()
    {
        return c;
    }

    public final  u()
    {
        return j.l();
    }

    public final  v()
    {
        return l();
    }

    public final volatile bd w()
    {
        return j;
    }


    private ()
    {
        h = -1;
        i = -1;
        g = "";
    }

    private ( )
    {
        super();
        h = -1;
        i = -1;
    }

    ( , byte byte0)
    {
        this();
    }

    private rowable(g g1, aq aq)
    {
         ;
        boolean flag;
        this();
         = by.c();
        flag = false;
_L7:
        if (flag) goto _L2; else goto _L1
_L1:
        int i1 = g1.a();
        i1;
        JVM INSTR lookupswitch 2: default 161
    //                   0: 164
    //                   10: 70;
           goto _L3 _L4 _L5
_L3:
        if (!a(g1, , aq, i1))
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
        e = .b();
        L();
        throw g1;
        g1;
        throw new RuntimeException((new av(g1.getMessage())).a(this));
_L2:
        e = .b();
        L();
        return;
_L4:
        flag = true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    L(g g1, aq aq, byte byte0)
    {
        this(g1, aq);
    }
}
