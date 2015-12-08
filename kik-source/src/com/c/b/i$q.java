// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.c.b:
//            i, y, av, by, 
//            g, f, h, be, 
//            bk, aq, bd, as, 
//            bn, bl, z

public static final class <init> extends 
    implements 
{
    public static final class a extends as.c
        implements i.r
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

        private a d(bd bd)
        {
            if (bd instanceof i.q)
            {
                return a((i.q)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private a d(g g1, aq aq)
        {
            g1 = (i.q)i.q.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (i.q)aq.a();
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

        private i.q t()
        {
            i.q q1 = g();
            if (!q1.a())
            {
                throw b(q1);
            } else
            {
                return q1;
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

        public final a.a a(bd bd)
        {
            return d(bd);
        }

        public final a.a a(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final a a(i.q q1)
        {
            bn bn1;
            bn1 = null;
            if (q1 == i.q.J())
            {
                return this;
            }
            if (q1.h())
            {
                a = a | 1;
                b = i.q.b(q1);
                q();
            }
            if (q1.i())
            {
                a = a | 2;
                c = i.q.c(q1);
                q();
            }
            if (q1.j())
            {
                boolean flag = q1.k();
                a = a | 4;
                d = flag;
                q();
            }
            if (q1.l())
            {
                boolean flag1 = q1.m();
                a = a | 8;
                e = flag1;
                q();
            }
            if (q1.n())
            {
                boolean flag2 = q1.o();
                a = a | 0x10;
                f = flag2;
                q();
            }
            if (q1.p())
            {
                b b1 = q1.q();
                if (b1 == null)
                {
                    throw new NullPointerException();
                }
                a = a | 0x20;
                g = b1.a();
                q();
            }
            if (q1.r())
            {
                a = a | 0x40;
                h = i.q.d(q1);
                q();
            }
            if (q1.s())
            {
                boolean flag3 = q1.x();
                a = a | 0x80;
                i = flag3;
                q();
            }
            if (q1.y())
            {
                boolean flag4 = q1.z();
                a = a | 0x100;
                j = flag4;
                q();
            }
            if (q1.A())
            {
                boolean flag5 = q1.B();
                a = a | 0x200;
                k = flag5;
                q();
            }
            if (q1.C())
            {
                boolean flag6 = q1.D();
                a = a | 0x400;
                l = flag6;
                q();
            }
            if (q1.E())
            {
                boolean flag7 = q1.F();
                a = a | 0x800;
                m = flag7;
                q();
            }
            if (q1.G())
            {
                a = a | 0x1000;
                n = i.q.e(q1);
                q();
            }
            if (q1.H())
            {
                a = a | 0x2000;
                o = i.q.f(q1);
                q();
            }
            if (q != null) goto _L2; else goto _L1
_L1:
            if (!i.q.g(q1).isEmpty())
            {
                if (p.isEmpty())
                {
                    p = i.q.g(q1);
                    a = a & 0xffffbfff;
                } else
                {
                    if ((a & 0x4000) != 16384)
                    {
                        p = new ArrayList(p);
                        a = a | 0x4000;
                    }
                    p.addAll(i.q.g(q1));
                }
                q();
            }
_L4:
            a(((as.d) (q1)));
            d(q1.e);
            q();
            return this;
_L2:
            if (!i.q.g(q1).isEmpty())
            {
                if (q.d())
                {
                    q.b();
                    q = null;
                    p = i.q.g(q1);
                    a = a & 0xffffbfff;
                    if (as.d)
                    {
                        bn1 = u();
                    }
                    q = bn1;
                } else
                {
                    q.a(i.q.g(q1));
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final boolean a()
        {
            int i1 = 0;
_L7:
            i.ag ag;
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
                ag = (i.ag)p.get(i1);
            } else
            {
                ag = (i.ag)q.a(i1);
            }
            if (ag.a()) goto _L4; else goto _L3
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
            return com.c.b.i.w().a(com/c/b/i$q, com/c/b/i$q$a);
        }

        public final ak.a e()
        {
            return com.c.b.i.v();
        }

        public final i.q g()
        {
            int j1 = 1;
            i.q q1 = new i.q(this, (byte)0);
            int k1 = a;
            int i1;
            if ((k1 & 1) != 1)
            {
                j1 = 0;
            }
            i.q.a(q1, b);
            i1 = j1;
            if ((k1 & 2) == 2)
            {
                i1 = j1 | 2;
            }
            i.q.b(q1, c);
            j1 = i1;
            if ((k1 & 4) == 4)
            {
                j1 = i1 | 4;
            }
            i.q.a(q1, d);
            i1 = j1;
            if ((k1 & 8) == 8)
            {
                i1 = j1 | 8;
            }
            i.q.b(q1, e);
            j1 = i1;
            if ((k1 & 0x10) == 16)
            {
                j1 = i1 | 0x10;
            }
            i.q.c(q1, f);
            i1 = j1;
            if ((k1 & 0x20) == 32)
            {
                i1 = j1 | 0x20;
            }
            i.q.a(q1, g);
            j1 = i1;
            if ((k1 & 0x40) == 64)
            {
                j1 = i1 | 0x40;
            }
            i.q.c(q1, h);
            i1 = j1;
            if ((k1 & 0x80) == 128)
            {
                i1 = j1 | 0x80;
            }
            i.q.d(q1, i);
            j1 = i1;
            if ((k1 & 0x100) == 256)
            {
                j1 = i1 | 0x100;
            }
            i.q.e(q1, j);
            i1 = j1;
            if ((k1 & 0x200) == 512)
            {
                i1 = j1 | 0x200;
            }
            i.q.f(q1, k);
            j1 = i1;
            if ((k1 & 0x400) == 1024)
            {
                j1 = i1 | 0x400;
            }
            i.q.g(q1, l);
            i1 = j1;
            if ((k1 & 0x800) == 2048)
            {
                i1 = j1 | 0x800;
            }
            i.q.h(q1, m);
            j1 = i1;
            if ((k1 & 0x1000) == 4096)
            {
                j1 = i1 | 0x1000;
            }
            i.q.d(q1, n);
            i1 = j1;
            if ((k1 & 0x2000) == 8192)
            {
                i1 = j1 | 0x2000;
            }
            i.q.e(q1, o);
            if (q == null)
            {
                if ((a & 0x4000) == 16384)
                {
                    p = Collections.unmodifiableList(p);
                    a = a & 0xffffbfff;
                }
                i.q.a(q1, p);
            } else
            {
                i.q.a(q1, q.e());
            }
            i.q.b(q1, i1);
            l();
            return q1;
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
            return i.q.J();
        }

        private a()
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

        a(byte byte0)
        {
            this();
        }

        private a(as.b b1)
        {
            super(b1);
            b = "";
            c = "";
            g = 1;
            h = "";
            n = "";
            o = "";
            p = Collections.emptyList();
            s();
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
        private static au.b d = new z();
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
            return (b)Enum.valueOf(com/c/b/i$q$b, s1);
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
            a = new b("SPEED", 0, 0, 1);
            b = new b("CODE_SIZE", 1, 1, 2);
            c = new b("LITE_RUNTIME", 2, 2, 3);
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


    public static final bk c = new y();
    private static final nit> x = new <init>();
    private int f;
    private volatile Object g;
    private volatile Object h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int l;
    private volatile Object m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private volatile Object s;
    private volatile Object t;
    private List u;
    private byte v;
    private int w;

    public static b J()
    {
        return x;
    }

    private f P()
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

    private f Q()
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

    private f R()
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

    private f S()
    {
        Object obj = s;
        if (obj instanceof String)
        {
            obj = com.c.b.f.a((String)obj);
            s = obj;
            return ((f) (obj));
        } else
        {
            return (f)obj;
        }
    }

    private f T()
    {
        Object obj = t;
        if (obj instanceof String)
        {
            obj = com.c.b.f.a((String)obj);
            t = obj;
            return ((f) (obj));
        } else
        {
            return (f)obj;
        }
    }

    static int a(t t1, int i1)
    {
        t1.l = i1;
        return i1;
    }

    public static a a(l l1)
    {
        return x.I().a(l1);
    }

    static Object a(ject ject, Object obj)
    {
        ject.g = obj;
        return obj;
    }

    static List a(st st, List list)
    {
        st.u = list;
        return list;
    }

    static boolean a(u u1, boolean flag)
    {
        u1.i = flag;
        return flag;
    }

    static int b(i i1, int j1)
    {
        i1.f = j1;
        return j1;
    }

    static Object b(f f1)
    {
        return f1.g;
    }

    static Object b(ject ject, Object obj)
    {
        ject.h = obj;
        return obj;
    }

    static boolean b(h h1, boolean flag)
    {
        h1.j = flag;
        return flag;
    }

    static Object c(j j1)
    {
        return j1.h;
    }

    static Object c(ject ject, Object obj)
    {
        ject.m = obj;
        return obj;
    }

    static boolean c(m m1, boolean flag)
    {
        m1.k = flag;
        return flag;
    }

    static Object d(k k1)
    {
        return k1.m;
    }

    static Object d(ject ject, Object obj)
    {
        ject.s = obj;
        return obj;
    }

    static boolean d(s s1, boolean flag)
    {
        s1.n = flag;
        return flag;
    }

    static Object e(n n1)
    {
        return n1.s;
    }

    static Object e(ject ject, Object obj)
    {
        ject.t = obj;
        return obj;
    }

    static boolean e(t t1, boolean flag)
    {
        t1.o = flag;
        return flag;
    }

    static Object f(o o1)
    {
        return o1.t;
    }

    static boolean f(t t1, boolean flag)
    {
        t1.p = flag;
        return flag;
    }

    static List g(p p1)
    {
        return p1.u;
    }

    static boolean g(u u1, boolean flag)
    {
        u1.q = flag;
        return flag;
    }

    static boolean h(q q1, boolean flag)
    {
        q1.r = flag;
        return flag;
    }

    public final boolean A()
    {
        return (f & 0x200) == 512;
    }

    public final boolean B()
    {
        return p;
    }

    public final boolean C()
    {
        return (f & 0x400) == 1024;
    }

    public final boolean D()
    {
        return q;
    }

    public final boolean E()
    {
        return (f & 0x800) == 2048;
    }

    public final boolean F()
    {
        return r;
    }

    public final boolean G()
    {
        return (f & 0x1000) == 4096;
    }

    public final boolean H()
    {
        return (f & 0x2000) == 8192;
    }

    public final a I()
    {
        if (this == x)
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
        .a a1 = N();
        if ((f & 1) == 1)
        {
            h1.a(1, P());
        }
        if ((f & 2) == 2)
        {
            h1.a(8, Q());
        }
        if ((f & 0x20) == 32)
        {
            h1.c(9, l);
        }
        if ((f & 4) == 4)
        {
            h1.a(10, i);
        }
        if ((f & 0x40) == 64)
        {
            h1.a(11, R());
        }
        if ((f & 0x80) == 128)
        {
            h1.a(16, n);
        }
        if ((f & 0x100) == 256)
        {
            h1.a(17, o);
        }
        if ((f & 0x200) == 512)
        {
            h1.a(18, p);
        }
        if ((f & 8) == 8)
        {
            h1.a(20, j);
        }
        if ((f & 0x400) == 1024)
        {
            h1.a(23, q);
        }
        if ((f & 0x10) == 16)
        {
            h1.a(27, k);
        }
        if ((f & 0x800) == 2048)
        {
            h1.a(31, r);
        }
        if ((f & 0x1000) == 4096)
        {
            h1.a(36, S());
        }
        if ((f & 0x2000) == 8192)
        {
            h1.a(37, T());
        }
        for (int i1 = 0; i1 < u.size(); i1++)
        {
            h1.b(999, (be)u.get(i1));
        }

        a1.a(h1);
        e.a(h1);
    }

    public final boolean a()
    {
        boolean flag = false;
        byte byte0 = v;
        if (byte0 == 1)
        {
            flag = true;
        } else
        if (byte0 != 0)
        {
            for (int i1 = 0; i1 < u.size(); i1++)
            {
                if (!(()u.get(i1)).a())
                {
                    v = 0;
                    return false;
                }
            }

            if (!M())
            {
                v = 0;
                return false;
            } else
            {
                v = 1;
                return true;
            }
        }
        return flag;
    }

    public final int b()
    {
        boolean flag = false;
        int i1 = w;
        if (i1 != -1)
        {
            return i1;
        }
        int j1;
        if ((f & 1) == 1)
        {
            j1 = com.c.b.h.c(1, P()) + 0;
        } else
        {
            j1 = 0;
        }
        i1 = j1;
        if ((f & 2) == 2)
        {
            i1 = j1 + com.c.b.h.c(8, Q());
        }
        j1 = i1;
        if ((f & 0x20) == 32)
        {
            j1 = i1 + com.c.b.h.f(9, l);
        }
        i1 = j1;
        if ((f & 4) == 4)
        {
            i1 = j1 + (com.c.b.h.j(10) + 1);
        }
        j1 = i1;
        if ((f & 0x40) == 64)
        {
            j1 = i1 + com.c.b.h.c(11, R());
        }
        i1 = j1;
        if ((f & 0x80) == 128)
        {
            i1 = j1 + (com.c.b.h.j(16) + 1);
        }
        j1 = i1;
        if ((f & 0x100) == 256)
        {
            j1 = i1 + (com.c.b.h.j(17) + 1);
        }
        i1 = j1;
        if ((f & 0x200) == 512)
        {
            i1 = j1 + (com.c.b.h.j(18) + 1);
        }
        j1 = i1;
        if ((f & 8) == 8)
        {
            j1 = i1 + (com.c.b.h.j(20) + 1);
        }
        i1 = j1;
        if ((f & 0x400) == 1024)
        {
            i1 = j1 + (com.c.b.h.j(23) + 1);
        }
        j1 = i1;
        if ((f & 0x10) == 16)
        {
            j1 = i1 + (com.c.b.h.j(27) + 1);
        }
        i1 = j1;
        if ((f & 0x800) == 2048)
        {
            i1 = j1 + (com.c.b.h.j(31) + 1);
        }
        j1 = i1;
        if ((f & 0x1000) == 4096)
        {
            j1 = i1 + com.c.b.h.c(36, S());
        }
        i1 = j1;
        if ((f & 0x2000) == 8192)
        {
            i1 = j1 + com.c.b.h.c(37, T());
        }
        for (j1 = ((flag) ? 1 : 0); j1 < u.size();)
        {
            int k1 = com.c.b.h.d(999, (be)u.get(j1));
            j1++;
            i1 = k1 + i1;
        }

        i1 = O() + i1 + e.b();
        w = i1;
        return i1;
    }

    protected final  c_()
    {
        return com.c.b.i.w().a(com/c/b/i$q, com/c/b/i$q$a);
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
        return (f & 4) == 4;
    }

    public final boolean k()
    {
        return i;
    }

    public final boolean l()
    {
        return (f & 8) == 8;
    }

    public final boolean m()
    {
        return j;
    }

    public final boolean n()
    {
        return (f & 0x10) == 16;
    }

    public final boolean o()
    {
        return k;
    }

    public final boolean p()
    {
        return (f & 0x20) == 32;
    }

    public final b q()
    {
        b b2 = b.a(l);
        b b1 = b2;
        if (b2 == null)
        {
            b1 = b.a;
        }
        return b1;
    }

    public final boolean r()
    {
        return (f & 0x40) == 64;
    }

    public final boolean s()
    {
        return (f & 0x80) == 128;
    }

    public final bk t()
    {
        return c;
    }

    public final  u()
    {
        return x.I();
    }

    public final  v()
    {
        return I();
    }

    public final volatile bd w()
    {
        return x;
    }

    public final boolean x()
    {
        return n;
    }

    public final boolean y()
    {
        return (f & 0x100) == 256;
    }

    public final boolean z()
    {
        return o;
    }


    private ()
    {
        v = -1;
        w = -1;
        g = "";
        h = "";
        i = false;
        j = false;
        k = false;
        l = 1;
        m = "";
        n = false;
        o = false;
        p = false;
        q = false;
        r = false;
        s = "";
        t = "";
        u = Collections.emptyList();
    }

    private ( )
    {
        super();
        v = -1;
        w = -1;
    }

    ( , byte byte0)
    {
        this();
    }

    private st(g g1, aq aq)
    {
         ;
        int i1;
        boolean flag;
        i1 = 0;
        this();
         = by.c();
        flag = false;
_L21:
        if (flag) goto _L2; else goto _L1
_L1:
        int k1;
        int l1;
        int i2;
        k1 = i1;
        l1 = i1;
        i2 = i1;
        int j1 = g1.a();
        j1;
        JVM INSTR lookupswitch 16: default 1198
    //                   0: 1201
    //                   10: 206
    //                   66: 323
    //                   72: 412
    //                   80: 518
    //                   90: 563
    //                   128: 625
    //                   136: 672
    //                   144: 719
    //                   160: 766
    //                   184: 812
    //                   216: 859
    //                   248: 905
    //                   290: 952
    //                   298: 1015
    //                   7994: 1078;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L3:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        if (a(g1, , aq, j1)) goto _L21; else goto _L20
_L20:
        flag = true;
          goto _L21
_L5:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f f1 = g1.l();
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f = f | 1;
        k1 = i1;
        l1 = i1;
        i2 = i1;
        g = f1;
          goto _L21
        g1;
        i1 = k1;
        throw new RuntimeException(g1.a(this));
        g1;
_L26:
        if ((i1 & 0x4000) == 16384)
        {
            u = Collections.unmodifiableList(u);
        }
        e = .b();
        L();
        throw g1;
_L6:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f1 = g1.l();
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f = f | 2;
        k1 = i1;
        l1 = i1;
        i2 = i1;
        h = f1;
          goto _L21
        g1;
        i1 = l1;
        throw new RuntimeException((new av(g1.getMessage())).a(this));
_L7:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        j1 = g1.n();
        k1 = i1;
        l1 = i1;
        i2 = i1;
        if (b.a(j1) != null) goto _L23; else goto _L22
_L22:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        .a(9, j1);
          goto _L21
_L23:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f = f | 0x20;
        k1 = i1;
        l1 = i1;
        i2 = i1;
        l = j1;
          goto _L21
_L8:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f = f | 4;
        k1 = i1;
        l1 = i1;
        i2 = i1;
        i = g1.i();
          goto _L21
_L9:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f1 = g1.l();
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f = f | 0x40;
        k1 = i1;
        l1 = i1;
        i2 = i1;
        m = f1;
          goto _L21
_L10:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f = f | 0x80;
        k1 = i1;
        l1 = i1;
        i2 = i1;
        n = g1.i();
          goto _L21
_L11:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f = f | 0x100;
        k1 = i1;
        l1 = i1;
        i2 = i1;
        o = g1.i();
          goto _L21
_L12:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f = f | 0x200;
        k1 = i1;
        l1 = i1;
        i2 = i1;
        p = g1.i();
          goto _L21
_L13:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f = f | 8;
        k1 = i1;
        l1 = i1;
        i2 = i1;
        j = g1.i();
          goto _L21
_L14:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f = f | 0x400;
        k1 = i1;
        l1 = i1;
        i2 = i1;
        q = g1.i();
          goto _L21
_L15:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f = f | 0x10;
        k1 = i1;
        l1 = i1;
        i2 = i1;
        k = g1.i();
          goto _L21
_L16:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f = f | 0x800;
        k1 = i1;
        l1 = i1;
        i2 = i1;
        r = g1.i();
          goto _L21
_L17:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f1 = g1.l();
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f = f | 0x1000;
        k1 = i1;
        l1 = i1;
        i2 = i1;
        s = f1;
          goto _L21
_L18:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f1 = g1.l();
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f = f | 0x2000;
        k1 = i1;
        l1 = i1;
        i2 = i1;
        t = f1;
          goto _L21
_L19:
        j1 = i1;
        if ((i1 & 0x4000) == 16384) goto _L25; else goto _L24
_L24:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        u = new ArrayList();
        j1 = i1 | 0x4000;
_L25:
        k1 = j1;
        l1 = j1;
        i2 = j1;
        u.add(g1.a(.c, aq));
        i1 = j1;
          goto _L21
_L2:
        if ((i1 & 0x4000) == 16384)
        {
            u = Collections.unmodifiableList(u);
        }
        e = .b();
        L();
        return;
_L4:
        flag = true;
          goto _L21
        g1;
        i1 = i2;
          goto _L26
    }

    L(g g1, aq aq, byte byte0)
    {
        this(g1, aq);
    }
}
