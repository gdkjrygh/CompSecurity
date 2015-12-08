// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.io.IOException;

// Referenced classes of package com.c.b:
//            as, i, r, av, 
//            by, g, f, h, 
//            bk, aq, bd, bp, 
//            be, bl, s, t

public static final class <init> extends as
    implements <init>
{
    public static final class a extends as.a
        implements i.l
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
        private i.m j;
        private bp k;

        private a d(bd bd)
        {
            if (bd instanceof i.k)
            {
                return a((i.k)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private a d(g g1, aq aq)
        {
            g1 = (i.k)i.k.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (i.k)aq.a();
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

        private i.k s()
        {
            i.k k1 = t();
            if (!k1.a())
            {
                throw b(k1);
            } else
            {
                return k1;
            }
        }

        private i.k t()
        {
            int j1 = 1;
            i.k k1 = new i.k(this, (byte)0);
            int l1 = a;
            int i1;
            if ((l1 & 1) != 1)
            {
                j1 = 0;
            }
            i.k.a(k1, b);
            i1 = j1;
            if ((l1 & 2) == 2)
            {
                i1 = j1 | 2;
            }
            i.k.a(k1, c);
            j1 = i1;
            if ((l1 & 4) == 4)
            {
                j1 = i1 | 4;
            }
            i.k.b(k1, d);
            i1 = j1;
            if ((l1 & 8) == 8)
            {
                i1 = j1 | 8;
            }
            i.k.c(k1, e);
            j1 = i1;
            if ((l1 & 0x10) == 16)
            {
                j1 = i1 | 0x10;
            }
            i.k.b(k1, f);
            i1 = j1;
            if ((l1 & 0x20) == 32)
            {
                i1 = j1 | 0x20;
            }
            i.k.c(k1, g);
            j1 = i1;
            if ((l1 & 0x40) == 64)
            {
                j1 = i1 | 0x40;
            }
            i.k.d(k1, h);
            i1 = j1;
            if ((l1 & 0x80) == 128)
            {
                i1 = j1 | 0x80;
            }
            i.k.d(k1, i);
            if ((l1 & 0x100) == 256)
            {
                i1 |= 0x100;
            }
            if (k == null)
            {
                i.k.a(k1, j);
            } else
            {
                i.k.a(k1, (i.m)k.c());
            }
            i.k.e(k1, i1);
            l();
            return k1;
        }

        private i.m u()
        {
            if (k == null)
            {
                if (j == null)
                {
                    return com.c.b.i.m.y();
                } else
                {
                    return j;
                }
            } else
            {
                return (i.m)k.b();
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

        public final a a(i.k k1)
        {
            if (k1 == i.k.D())
            {
                return this;
            }
            if (k1.h())
            {
                a = a | 1;
                b = i.k.a(k1);
                q();
            }
            if (k1.j())
            {
                int i1 = k1.k();
                a = a | 2;
                c = i1;
                q();
            }
            if (k1.l())
            {
                b b1 = k1.m();
                if (b1 == null)
                {
                    throw new NullPointerException();
                }
                a = a | 4;
                d = b1.a();
                q();
            }
            if (k1.n())
            {
                c c1 = k1.o();
                if (c1 == null)
                {
                    throw new NullPointerException();
                }
                a = a | 8;
                e = c1.a();
                q();
            }
            if (k1.p())
            {
                a = a | 0x10;
                f = i.k.b(k1);
                q();
            }
            if (k1.r())
            {
                a = a | 0x20;
                g = i.k.c(k1);
                q();
            }
            if (k1.x())
            {
                a = a | 0x40;
                h = i.k.d(k1);
                q();
            }
            if (k1.z())
            {
                int j1 = k1.A();
                a = a | 0x80;
                i = j1;
                q();
            }
            if (k1.B())
            {
                i.m m1 = k1.C();
                if (k == null)
                {
                    if ((a & 0x100) == 256 && j != null && j != com.c.b.i.m.y())
                    {
                        j = com.c.b.i.m.a(j).a(m1).g();
                    } else
                    {
                        j = m1;
                    }
                    q();
                } else
                {
                    k.b(m1);
                }
                a = a | 0x100;
            }
            d(k1.e);
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
            return com.c.b.i.k().a(com/c/b/i$k, com/c/b/i$k$a);
        }

        public final ak.a e()
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
            return i.k.D();
        }

        private a()
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

        a(byte byte0)
        {
            this();
        }

        private a(as.b b1)
        {
            super(b1);
            b = "";
            d = 1;
            e = 1;
            f = "";
            g = "";
            h = "";
            j = null;
            r();
        }

        a(as.b b1, byte byte0)
        {
            this(b1);
        }
    }

    public static final class b extends Enum
        implements bl
    {

        public static final b a;
        public static final b b;
        public static final b c;
        private static au.b d = new s();
        private static final b e[] = values();
        private static final b h[];
        private final int f;
        private final int g;

        public static b a(int i1)
        {
            switch (i1)
            {
            default:
                return null;

            case 1: // '\001'
                return a;

            case 2: // '\002'
                return b;

            case 3: // '\003'
                return c;
            }
        }

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(com/c/b/i$k$b, s1);
        }

        public static b[] values()
        {
            return (b[])h.clone();
        }

        public final int a()
        {
            return g;
        }

        static 
        {
            a = new b("LABEL_OPTIONAL", 0, 0, 1);
            b = new b("LABEL_REQUIRED", 1, 1, 2);
            c = new b("LABEL_REPEATED", 2, 2, 3);
            h = (new b[] {
                a, b, c
            });
        }

        private b(String s1, int i1, int j1, int k1)
        {
            super(s1, i1);
            f = j1;
            g = k1;
        }
    }

    public static final class c extends Enum
        implements bl
    {

        public static final c a;
        public static final c b;
        public static final c c;
        public static final c d;
        public static final c e;
        public static final c f;
        public static final c g;
        public static final c h;
        public static final c i;
        public static final c j;
        public static final c k;
        public static final c l;
        public static final c m;
        public static final c n;
        public static final c o;
        public static final c p;
        public static final c q;
        public static final c r;
        private static au.b s = new t();
        private static final c t[] = values();
        private static final c w[];
        private final int u;
        private final int v;

        public static c a(int i1)
        {
            switch (i1)
            {
            default:
                return null;

            case 1: // '\001'
                return a;

            case 2: // '\002'
                return b;

            case 3: // '\003'
                return c;

            case 4: // '\004'
                return d;

            case 5: // '\005'
                return e;

            case 6: // '\006'
                return f;

            case 7: // '\007'
                return g;

            case 8: // '\b'
                return h;

            case 9: // '\t'
                return i;

            case 10: // '\n'
                return j;

            case 11: // '\013'
                return k;

            case 12: // '\f'
                return l;

            case 13: // '\r'
                return m;

            case 14: // '\016'
                return n;

            case 15: // '\017'
                return o;

            case 16: // '\020'
                return p;

            case 17: // '\021'
                return q;

            case 18: // '\022'
                return r;
            }
        }

        public static c valueOf(String s1)
        {
            return (c)Enum.valueOf(com/c/b/i$k$c, s1);
        }

        public static c[] values()
        {
            return (c[])w.clone();
        }

        public final int a()
        {
            return v;
        }

        static 
        {
            a = new c("TYPE_DOUBLE", 0, 0, 1);
            b = new c("TYPE_FLOAT", 1, 1, 2);
            c = new c("TYPE_INT64", 2, 2, 3);
            d = new c("TYPE_UINT64", 3, 3, 4);
            e = new c("TYPE_INT32", 4, 4, 5);
            f = new c("TYPE_FIXED64", 5, 5, 6);
            g = new c("TYPE_FIXED32", 6, 6, 7);
            h = new c("TYPE_BOOL", 7, 7, 8);
            i = new c("TYPE_STRING", 8, 8, 9);
            j = new c("TYPE_GROUP", 9, 9, 10);
            k = new c("TYPE_MESSAGE", 10, 10, 11);
            l = new c("TYPE_BYTES", 11, 11, 12);
            m = new c("TYPE_UINT32", 12, 12, 13);
            n = new c("TYPE_ENUM", 13, 13, 14);
            o = new c("TYPE_SFIXED32", 14, 14, 15);
            p = new c("TYPE_SFIXED64", 15, 15, 16);
            q = new c("TYPE_SINT32", 16, 16, 17);
            r = new c("TYPE_SINT64", 17, 17, 18);
            w = (new c[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p, q, r
            });
        }

        private c(String s1, int i1, int j1, int k1)
        {
            super(s1, i1);
            u = j1;
            v = k1;
        }
    }


    public static final bk c = new r();
    private static final nit> r = new <init>();
    private int f;
    private volatile Object g;
    private int h;
    private int i;
    private int j;
    private volatile Object k;
    private volatile Object l;
    private volatile Object m;
    private int n;
    private ject o;
    private byte p;
    private int q;

    public static c D()
    {
        return r;
    }

    private f E()
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

    private f F()
    {
        Object obj = k;
        if (obj instanceof String)
        {
            obj = com.c.b.f.a((String)obj);
            k = obj;
            return ((f) (obj));
        } else
        {
            return (f)obj;
        }
    }

    private f G()
    {
        Object obj = l;
        if (obj instanceof String)
        {
            obj = com.c.b.f.a((String)obj);
            l = obj;
            return ((f) (obj));
        } else
        {
            return (f)obj;
        }
    }

    private f H()
    {
        Object obj = m;
        if (obj instanceof String)
        {
            obj = com.c.b.f.a((String)obj);
            m = obj;
            return ((f) (obj));
        } else
        {
            return (f)obj;
        }
    }

    private a I()
    {
        if (this == r)
        {
            return new a((byte)0);
        } else
        {
            return (new a((byte)0)).a(this);
        }
    }

    static int a(a.a a1, int i1)
    {
        a1.h = i1;
        return i1;
    }

    static h a(h h1, h h2)
    {
        h1.o = h2;
        return h2;
    }

    static Object a(o o1)
    {
        return o1.g;
    }

    static Object a(ject ject, Object obj)
    {
        ject.g = obj;
        return obj;
    }

    static int b(g g1, int i1)
    {
        g1.i = i1;
        return i1;
    }

    static Object b(i i1)
    {
        return i1.k;
    }

    static Object b(ject ject, Object obj)
    {
        ject.k = obj;
        return obj;
    }

    static int c(k k1, int i1)
    {
        k1.j = i1;
        return i1;
    }

    static Object c(j j1)
    {
        return j1.l;
    }

    static Object c(ject ject, Object obj)
    {
        ject.l = obj;
        return obj;
    }

    static int d(l l1, int i1)
    {
        l1.n = i1;
        return i1;
    }

    static Object d(n n1)
    {
        return n1.m;
    }

    static Object d(ject ject, Object obj)
    {
        ject.m = obj;
        return obj;
    }

    static int e(m m1, int i1)
    {
        m1.f = i1;
        return i1;
    }

    public final int A()
    {
        return n;
    }

    public final boolean B()
    {
        return (f & 0x100) == 256;
    }

    public final f C()
    {
        if (o == null)
        {
            return y();
        } else
        {
            return o;
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
            h1.a(1, E());
        }
        if ((f & 0x20) == 32)
        {
            h1.a(2, G());
        }
        if ((f & 2) == 2)
        {
            h1.a(3, h);
        }
        if ((f & 4) == 4)
        {
            h1.c(4, i);
        }
        if ((f & 8) == 8)
        {
            h1.c(5, j);
        }
        if ((f & 0x10) == 16)
        {
            h1.a(6, F());
        }
        if ((f & 0x40) == 64)
        {
            h1.a(7, H());
        }
        if ((f & 0x100) == 256)
        {
            h1.b(8, C());
        }
        if ((f & 0x80) == 128)
        {
            h1.a(9, n);
        }
        e.a(h1);
    }

    public final boolean a()
    {
        byte byte0 = p;
        if (byte0 == 1)
        {
            return true;
        }
        if (byte0 == 0)
        {
            return false;
        }
        if (B() && !C().a())
        {
            p = 0;
            return false;
        } else
        {
            p = 1;
            return true;
        }
    }

    public final int b()
    {
        int i1 = q;
        if (i1 != -1)
        {
            return i1;
        }
        int j1 = 0;
        if ((f & 1) == 1)
        {
            j1 = com.c.b.h.c(1, E()) + 0;
        }
        i1 = j1;
        if ((f & 0x20) == 32)
        {
            i1 = j1 + com.c.b.h.c(2, G());
        }
        j1 = i1;
        if ((f & 2) == 2)
        {
            j1 = i1 + com.c.b.h.d(3, h);
        }
        i1 = j1;
        if ((f & 4) == 4)
        {
            i1 = j1 + com.c.b.h.f(4, i);
        }
        j1 = i1;
        if ((f & 8) == 8)
        {
            j1 = i1 + com.c.b.h.f(5, j);
        }
        i1 = j1;
        if ((f & 0x10) == 16)
        {
            i1 = j1 + com.c.b.h.c(6, F());
        }
        j1 = i1;
        if ((f & 0x40) == 64)
        {
            j1 = i1 + com.c.b.h.c(7, H());
        }
        i1 = j1;
        if ((f & 0x100) == 256)
        {
            i1 = j1 + com.c.b.h.d(8, C());
        }
        j1 = i1;
        if ((f & 0x80) == 128)
        {
            j1 = i1 + com.c.b.h.d(9, n);
        }
        i1 = j1 + e.b();
        q = i1;
        return i1;
    }

    protected final  c_()
    {
        return com.c.b.i.k().a(com/c/b/i$k, com/c/b/i$k$a);
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

    public final int k()
    {
        return h;
    }

    public final boolean l()
    {
        return (f & 4) == 4;
    }

    public final b m()
    {
        b b2 = b.a(i);
        b b1 = b2;
        if (b2 == null)
        {
            b1 = b.a;
        }
        return b1;
    }

    public final boolean n()
    {
        return (f & 8) == 8;
    }

    public final c o()
    {
        c c2 = c.a(j);
        c c1 = c2;
        if (c2 == null)
        {
            c1 = c.a;
        }
        return c1;
    }

    public final boolean p()
    {
        return (f & 0x10) == 16;
    }

    public final String q()
    {
        Object obj = k;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        obj = (f)obj;
        String s1 = ((f) (obj)).f();
        if (((f) (obj)).g())
        {
            k = s1;
        }
        return s1;
    }

    public final boolean r()
    {
        return (f & 0x20) == 32;
    }

    public final String s()
    {
        Object obj = l;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        obj = (f)obj;
        String s1 = ((f) (obj)).f();
        if (((f) (obj)).g())
        {
            l = s1;
        }
        return s1;
    }

    public final bk t()
    {
        return c;
    }

    public final  u()
    {
        return r.I();
    }

    public final  v()
    {
        return I();
    }

    public final volatile bd w()
    {
        return r;
    }

    public final boolean x()
    {
        return (f & 0x40) == 64;
    }

    public final String y()
    {
        Object obj = m;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        obj = (f)obj;
        String s1 = ((f) (obj)).f();
        if (((f) (obj)).g())
        {
            m = s1;
        }
        return s1;
    }

    public final boolean z()
    {
        return (f & 0x80) == 128;
    }


    private ()
    {
        p = -1;
        q = -1;
        g = "";
        h = 0;
        i = 1;
        j = 1;
        k = "";
        l = "";
        m = "";
        n = 0;
    }

    private ( )
    {
        super();
        p = -1;
        q = -1;
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
_L20:
        if (flag) goto _L2; else goto _L1
_L1:
        int i1 = g1.a();
        i1;
        JVM INSTR lookupswitch 10: default 511
    //                   0: 514
    //                   10: 135
    //                   18: 188
    //                   24: 236
    //                   32: 257
    //                   40: 302
    //                   50: 348
    //                   58: 372
    //                   66: 396
    //                   72: 469;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
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
        f = f | 0x20;
        l = f2;
        continue; /* Loop/switch isn't completed */
        g1;
        throw new RuntimeException((new av(g1.getMessage())).a(this));
_L7:
        f = f | 2;
        h = g1.f();
        continue; /* Loop/switch isn't completed */
_L8:
        i1 = g1.n();
        if (b.a(i1) == null)
        {
            .a(4, i1);
            continue; /* Loop/switch isn't completed */
        }
        f = f | 4;
        i = i1;
        continue; /* Loop/switch isn't completed */
_L9:
        i1 = g1.n();
        if (c.a(i1) == null)
        {
            .a(5, i1);
            continue; /* Loop/switch isn't completed */
        }
        f = f | 8;
        j = i1;
        continue; /* Loop/switch isn't completed */
_L10:
        f f3 = g1.l();
        f = f | 0x10;
        k = f3;
        continue; /* Loop/switch isn't completed */
_L11:
        f f4 = g1.l();
        f = f | 0x40;
        m = f4;
        continue; /* Loop/switch isn't completed */
_L12:
        if ((f & 0x100) != 256) goto _L15; else goto _L14
_L14:
        a a1 = o.x();
_L18:
        o = (o)g1.a(c, aq);
        if (a1 == null) goto _L17; else goto _L16
_L16:
        a1.a(o);
        o = a1.g();
_L17:
        f = f | 0x100;
        continue; /* Loop/switch isn't completed */
_L13:
        f = f | 0x80;
        n = g1.f();
        continue; /* Loop/switch isn't completed */
_L2:
        e = .b();
        L();
        return;
_L15:
        a1 = null;
          goto _L18
_L4:
        flag = true;
        if (true) goto _L20; else goto _L19
_L19:
    }

    L(g g1, aq aq, byte byte0)
    {
        this(g1, aq);
    }
}
