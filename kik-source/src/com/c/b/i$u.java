// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.io.IOException;

// Referenced classes of package com.c.b:
//            as, i, ab, av, 
//            by, g, f, h, 
//            bk, aq, bd, bp, 
//            be

public static final class <init> extends as
    implements <init>
{
    public static final class a extends as.a
        implements i.v
    {

        private int a;
        private Object b;
        private Object c;
        private Object d;
        private i.w e;
        private bp f;
        private boolean g;
        private boolean h;

        private a d(bd bd)
        {
            if (bd instanceof i.u)
            {
                return a((i.u)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private a d(g g1, aq aq)
        {
            g1 = (i.u)i.u.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (i.u)aq.a();
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

        private i.u s()
        {
            i.u u1 = t();
            if (!u1.a())
            {
                throw b(u1);
            } else
            {
                return u1;
            }
        }

        private i.u t()
        {
            int j1 = 1;
            i.u u1 = new i.u(this, (byte)0);
            int k1 = a;
            int i1;
            if ((k1 & 1) != 1)
            {
                j1 = 0;
            }
            i.u.a(u1, b);
            i1 = j1;
            if ((k1 & 2) == 2)
            {
                i1 = j1 | 2;
            }
            i.u.b(u1, c);
            j1 = i1;
            if ((k1 & 4) == 4)
            {
                j1 = i1 | 4;
            }
            i.u.c(u1, d);
            if ((k1 & 8) == 8)
            {
                j1 |= 8;
            }
            if (f == null)
            {
                i.u.a(u1, e);
            } else
            {
                i.u.a(u1, (i.w)f.c());
            }
            i1 = j1;
            if ((k1 & 0x10) == 16)
            {
                i1 = j1 | 0x10;
            }
            i.u.a(u1, g);
            j1 = i1;
            if ((k1 & 0x20) == 32)
            {
                j1 = i1 | 0x20;
            }
            i.u.b(u1, h);
            i.u.a(u1, j1);
            l();
            return u1;
        }

        private i.w u()
        {
            if (f == null)
            {
                if (e == null)
                {
                    return com.c.b.i.w.k();
                } else
                {
                    return e;
                }
            } else
            {
                return (i.w)f.b();
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

        public final a a(i.u u1)
        {
            if (u1 == i.u.x())
            {
                return this;
            }
            if (u1.h())
            {
                a = a | 1;
                b = i.u.a(u1);
                q();
            }
            if (u1.j())
            {
                a = a | 2;
                c = i.u.b(u1);
                q();
            }
            if (u1.l())
            {
                a = a | 4;
                d = i.u.c(u1);
                q();
            }
            if (u1.n())
            {
                i.w w1 = u1.o();
                if (f == null)
                {
                    boolean flag;
                    if ((a & 8) == 8 && e != null && e != com.c.b.i.w.k())
                    {
                        e = com.c.b.i.w.a(e).a(w1).g();
                    } else
                    {
                        e = w1;
                    }
                    q();
                } else
                {
                    f.b(w1);
                }
                a = a | 8;
            }
            if (u1.p())
            {
                flag = u1.q();
                a = a | 0x10;
                g = flag;
                q();
            }
            if (u1.r())
            {
                flag = u1.s();
                a = a | 0x20;
                h = flag;
                q();
            }
            d(u1.e);
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
            return !flag || u().a();
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
            return com.c.b.i.u().a(com/c/b/i$u, com/c/b/i$u$a);
        }

        public final ak.a e()
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
            return i.u.x();
        }

        private a()
        {
            b = "";
            c = "";
            d = "";
            e = null;
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
            c = "";
            d = "";
            e = null;
            r();
        }

        a(as.b b1, byte byte0)
        {
            this(b1);
        }
    }


    public static final bk c = new ab();
    private static final init> o = new <init>();
    private int f;
    private volatile Object g;
    private volatile Object h;
    private volatile Object i;
    private ject j;
    private boolean k;
    private boolean l;
    private byte m;
    private int n;

    private f A()
    {
        Object obj = i;
        if (obj instanceof String)
        {
            obj = com.c.b.f.a((String)obj);
            i = obj;
            return ((f) (obj));
        } else
        {
            return (f)obj;
        }
    }

    private a B()
    {
        if (this == o)
        {
            return new a((byte)0);
        } else
        {
            return (new a((byte)0)).a(this);
        }
    }

    static int a(a.a a1, int i1)
    {
        a1.f = i1;
        return i1;
    }

    static f a(f f1, f f2)
    {
        f1.j = f2;
        return f2;
    }

    static Object a(j j1)
    {
        return j1.g;
    }

    static Object a(ject ject, Object obj)
    {
        ject.g = obj;
        return obj;
    }

    static boolean a(g g1, boolean flag)
    {
        g1.k = flag;
        return flag;
    }

    static Object b(k k1)
    {
        return k1.h;
    }

    static Object b(ject ject, Object obj)
    {
        ject.h = obj;
        return obj;
    }

    static boolean b(h h1, boolean flag)
    {
        h1.l = flag;
        return flag;
    }

    static Object c(l l1)
    {
        return l1.i;
    }

    static Object c(ject ject, Object obj)
    {
        ject.i = obj;
        return obj;
    }

    public static i x()
    {
        return o;
    }

    private f y()
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

    private f z()
    {
        Object obj = h;
        if (obj instanceof String)
        {
            obj = com.c.b.f.a((String)obj);
            h = obj;
            return ((f) (obj));
        } else
        {
            return (f)obj;
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
            h1.a(1, y());
        }
        if ((f & 2) == 2)
        {
            h1.a(2, z());
        }
        if ((f & 4) == 4)
        {
            h1.a(3, A());
        }
        if ((f & 8) == 8)
        {
            h1.b(4, o());
        }
        if ((f & 0x10) == 16)
        {
            h1.a(5, k);
        }
        if ((f & 0x20) == 32)
        {
            h1.a(6, l);
        }
        e.a(h1);
    }

    public final boolean a()
    {
        byte byte0 = m;
        if (byte0 == 1)
        {
            return true;
        }
        if (byte0 == 0)
        {
            return false;
        }
        if (n() && !o().a())
        {
            m = 0;
            return false;
        } else
        {
            m = 1;
            return true;
        }
    }

    public final int b()
    {
        int i1 = n;
        if (i1 != -1)
        {
            return i1;
        }
        int j1 = 0;
        if ((f & 1) == 1)
        {
            j1 = com.c.b.h.c(1, y()) + 0;
        }
        i1 = j1;
        if ((f & 2) == 2)
        {
            i1 = j1 + com.c.b.h.c(2, z());
        }
        j1 = i1;
        if ((f & 4) == 4)
        {
            j1 = i1 + com.c.b.h.c(3, A());
        }
        i1 = j1;
        if ((f & 8) == 8)
        {
            i1 = j1 + com.c.b.h.d(4, o());
        }
        j1 = i1;
        if ((f & 0x10) == 16)
        {
            j1 = i1 + (com.c.b.h.j(5) + 1);
        }
        i1 = j1;
        if ((f & 0x20) == 32)
        {
            i1 = j1 + (com.c.b.h.j(6) + 1);
        }
        i1 += e.b();
        n = i1;
        return i1;
    }

    protected final  c_()
    {
        return com.c.b.i.u().a(com/c/b/i$u, com/c/b/i$u$a);
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
        String s1 = ((f) (obj)).f();
        if (((f) (obj)).g())
        {
            g = s1;
        }
        return s1;
    }

    public final boolean j()
    {
        return (f & 2) == 2;
    }

    public final String k()
    {
        Object obj = h;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        obj = (f)obj;
        String s1 = ((f) (obj)).f();
        if (((f) (obj)).g())
        {
            h = s1;
        }
        return s1;
    }

    public final boolean l()
    {
        return (f & 4) == 4;
    }

    public final String m()
    {
        Object obj = i;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        obj = (f)obj;
        String s1 = ((f) (obj)).f();
        if (((f) (obj)).g())
        {
            i = s1;
        }
        return s1;
    }

    public final boolean n()
    {
        return (f & 8) == 8;
    }

    public final f o()
    {
        if (j == null)
        {
            return k();
        } else
        {
            return j;
        }
    }

    public final boolean p()
    {
        return (f & 0x10) == 16;
    }

    public final boolean q()
    {
        return k;
    }

    public final boolean r()
    {
        return (f & 0x20) == 32;
    }

    public final boolean s()
    {
        return l;
    }

    public final bk t()
    {
        return c;
    }

    public final  u()
    {
        return o.B();
    }

    public final  v()
    {
        return B();
    }

    public final volatile bd w()
    {
        return o;
    }


    private ()
    {
        m = -1;
        n = -1;
        g = "";
        h = "";
        i = "";
        k = false;
        l = false;
    }

    private ( )
    {
        super();
        m = -1;
        n = -1;
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
_L17:
        if (flag) goto _L2; else goto _L1
_L1:
        int i1 = g1.a();
        i1;
        JVM INSTR lookupswitch 7: default 367
    //                   0: 370
    //                   10: 111
    //                   18: 164
    //                   26: 211
    //                   34: 234
    //                   40: 304
    //                   48: 326;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
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
        f f2 = g1.l();
        f = f | 2;
        h = f2;
        continue; /* Loop/switch isn't completed */
        g1;
        throw new RuntimeException((new av(g1.getMessage())).a(this));
_L7:
        f f3 = g1.l();
        f = f | 4;
        i = f3;
        continue; /* Loop/switch isn't completed */
_L8:
        if ((f & 8) != 8) goto _L12; else goto _L11
_L11:
        a a1 = j.j();
_L15:
        j = (j)g1.a(c, aq);
        if (a1 == null) goto _L14; else goto _L13
_L13:
        a1.a(j);
        j = a1.g();
_L14:
        f = f | 8;
        continue; /* Loop/switch isn't completed */
_L9:
        f = f | 0x10;
        k = g1.i();
        continue; /* Loop/switch isn't completed */
_L10:
        f = f | 0x20;
        l = g1.i();
        continue; /* Loop/switch isn't completed */
_L2:
        e = .b();
        L();
        return;
_L12:
        a1 = null;
          goto _L15
_L4:
        flag = true;
        if (true) goto _L17; else goto _L16
_L16:
    }

    L(g g1, aq aq, byte byte0)
    {
        this(g1, aq);
    }
}
