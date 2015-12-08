// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.io.IOException;

// Referenced classes of package com.c.b:
//            as, i, p, av, 
//            by, g, f, h, 
//            bk, aq, bd, bp, 
//            be

public static final class <init> extends as
    implements <init>
{
    public static final class a extends as.a
        implements i.h
    {

        private int a;
        private Object b;
        private int c;
        private i.i d;
        private bp e;

        private a d(bd bd)
        {
            if (bd instanceof i.g)
            {
                return a((i.g)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private a d(g g1, aq aq)
        {
            g1 = (i.g)i.g.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (i.g)aq.a();
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
            if (as.d && e == null)
            {
                e = new bp(t(), p(), n());
                d = null;
            }
        }

        private i.g s()
        {
            int i1 = 1;
            i.g g1 = new i.g(this, (byte)0);
            int k1 = a;
            int j1;
            if ((k1 & 1) != 1)
            {
                i1 = 0;
            }
            i.g.a(g1, b);
            j1 = i1;
            if ((k1 & 2) == 2)
            {
                j1 = i1 | 2;
            }
            i.g.a(g1, c);
            if ((k1 & 4) == 4)
            {
                i1 = j1 | 4;
            } else
            {
                i1 = j1;
            }
            if (e == null)
            {
                i.g.a(g1, d);
            } else
            {
                i.g.a(g1, (i.i)e.c());
            }
            i.g.b(g1, i1);
            l();
            return g1;
        }

        private i.i t()
        {
            if (e == null)
            {
                if (d == null)
                {
                    return com.c.b.i.i.k();
                } else
                {
                    return d;
                }
            } else
            {
                return (i.i)e.b();
            }
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
            a = a | 2;
            c = i1;
            q();
            return this;
        }

        public final a a(i.g g1)
        {
            if (g1 == i.g.o())
            {
                return this;
            }
            if (g1.h())
            {
                a = a | 1;
                b = i.g.a(g1);
                q();
            }
            if (g1.j())
            {
                a(g1.k());
            }
            if (g1.l())
            {
                i.i i1 = g1.m();
                if (e == null)
                {
                    if ((a & 4) == 4 && d != null && d != com.c.b.i.i.k())
                    {
                        d = com.c.b.i.i.a(d).a(i1).g();
                    } else
                    {
                        d = i1;
                    }
                    q();
                } else
                {
                    e.b(i1);
                }
                a = a | 4;
            }
            d(g1.e);
            q();
            return this;
        }

        public final a a(String s1)
        {
            if (s1 == null)
            {
                throw new NullPointerException();
            } else
            {
                a = a | 1;
                b = s1;
                q();
                return this;
            }
        }

        public final boolean a()
        {
            boolean flag;
            if ((a & 4) == 4)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return !flag || t().a();
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
            return com.c.b.i.q().a(com/c/b/i$g, com/c/b/i$g$a);
        }

        public final ak.a e()
        {
            return com.c.b.i.p();
        }

        public final i.g g()
        {
            i.g g1 = s();
            if (!g1.a())
            {
                throw b(g1);
            } else
            {
                return g1;
            }
        }

        public final bd h()
        {
            return s();
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
            return i.g.o();
        }

        private a()
        {
            b = "";
            d = null;
            r();
        }

        a(byte byte0)
        {
            this();
        }

        private a(as.b b1)
        {
            super(b1);
            b = "";
            d = null;
            r();
        }

        a(as.b b1, byte byte0)
        {
            this(b1);
        }
    }


    public static final bk c = new p();
    private static final nit> l = new <init>();
    private int f;
    private volatile Object g;
    private int h;
    private ject i;
    private byte j;
    private int k;

    static int a(ject ject, int i1)
    {
        ject.h = i1;
        return i1;
    }

    static h a(h h1, h h2)
    {
        h1.i = h2;
        return h2;
    }

    static Object a(i i1)
    {
        return i1.g;
    }

    static Object a(ject ject, Object obj)
    {
        ject.g = obj;
        return obj;
    }

    static int b(g g1, int i1)
    {
        g1.f = i1;
        return i1;
    }

    public static a n()
    {
        return l.q();
    }

    public static q o()
    {
        return l;
    }

    private f p()
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

    private a q()
    {
        if (this == l)
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
            h1.a(1, p());
        }
        if ((f & 2) == 2)
        {
            h1.a(2, h);
        }
        if ((f & 4) == 4)
        {
            h1.b(3, m());
        }
        e.a(h1);
    }

    public final boolean a()
    {
        byte byte0 = j;
        if (byte0 == 1)
        {
            return true;
        }
        if (byte0 == 0)
        {
            return false;
        }
        if (l() && !m().a())
        {
            j = 0;
            return false;
        } else
        {
            j = 1;
            return true;
        }
    }

    public final int b()
    {
        int i1 = k;
        if (i1 != -1)
        {
            return i1;
        }
        int j1 = 0;
        if ((f & 1) == 1)
        {
            j1 = com.c.b.h.c(1, p()) + 0;
        }
        i1 = j1;
        if ((f & 2) == 2)
        {
            i1 = j1 + com.c.b.h.d(2, h);
        }
        j1 = i1;
        if ((f & 4) == 4)
        {
            j1 = i1 + com.c.b.h.d(3, m());
        }
        i1 = j1 + e.b();
        k = i1;
        return i1;
    }

    protected final  c_()
    {
        return com.c.b.i.q().a(com/c/b/i$g, com/c/b/i$g$a);
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

    public final boolean j()
    {
        return (f & 2) == 2;
    }

    public final int k()
    {
        return h;
    }

    public final boolean l()
    {
        return (f & 4) == 4;
    }

    public final f m()
    {
        if (i == null)
        {
            return k();
        } else
        {
            return i;
        }
    }

    public final bk t()
    {
        return c;
    }

    public final  u()
    {
        return l.q();
    }

    public final  v()
    {
        return q();
    }

    public final volatile bd w()
    {
        return l;
    }


    private ()
    {
        j = -1;
        k = -1;
        g = "";
        h = 0;
    }

    private ( )
    {
        super();
        j = -1;
        k = -1;
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
_L14:
        if (flag) goto _L2; else goto _L1
_L1:
        int i1 = g1.a();
        i1;
        JVM INSTR lookupswitch 4: default 271
    //                   0: 274
    //                   10: 87
    //                   16: 140
    //                   26: 185;
           goto _L3 _L4 _L5 _L6 _L7
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
_L6:
        f = f | 2;
        h = g1.f();
        continue; /* Loop/switch isn't completed */
        g1;
        throw new RuntimeException((new av(g1.getMessage())).a(this));
_L7:
        if ((f & 4) != 4) goto _L9; else goto _L8
_L8:
        a a1 = i.j();
_L12:
        i = (i)g1.a(c, aq);
        if (a1 == null) goto _L11; else goto _L10
_L10:
        a1.a(i);
        i = a1.g();
_L11:
        f = f | 4;
        continue; /* Loop/switch isn't completed */
_L2:
        e = .b();
        L();
        return;
_L9:
        a1 = null;
          goto _L12
_L4:
        flag = true;
        if (true) goto _L14; else goto _L13
_L13:
    }

    L(g g1, aq aq, byte byte0)
    {
        this(g1, aq);
    }
}
