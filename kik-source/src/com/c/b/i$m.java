// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.c.b:
//            i, u, av, by, 
//            g, h, be, bk, 
//            aq, bd, as, bn, 
//            bl, v, w

public static final class <init> extends 
    implements 
{
    public static final class a extends as.c
        implements i.n
    {

        private int a;
        private int b;
        private boolean c;
        private int d;
        private boolean e;
        private boolean f;
        private boolean g;
        private List h;
        private bn i;

        private a d(bd bd)
        {
            if (bd instanceof i.m)
            {
                return a((i.m)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private a d(g g1, aq aq)
        {
            g1 = (i.m)i.m.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (i.m)aq.a();
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

        private i.m t()
        {
            i.m m1 = g();
            if (!m1.a())
            {
                throw b(m1);
            } else
            {
                return m1;
            }
        }

        private bn u()
        {
            if (i == null)
            {
                List list = h;
                boolean flag;
                if ((a & 0x40) == 64)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                i = new bn(list, flag, p(), n());
                h = null;
            }
            return i;
        }

        public final a.a a(bd bd)
        {
            return d(bd);
        }

        public final a.a a(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final a a(i.m m1)
        {
            bn bn1;
            bn1 = null;
            if (m1 == i.m.y())
            {
                return this;
            }
            if (m1.h())
            {
                b b1 = m1.i();
                if (b1 == null)
                {
                    throw new NullPointerException();
                }
                a = a | 1;
                b = b1.a();
                q();
            }
            if (m1.j())
            {
                boolean flag = m1.k();
                a = a | 2;
                c = flag;
                q();
            }
            if (m1.l())
            {
                c c1 = m1.m();
                if (c1 == null)
                {
                    throw new NullPointerException();
                }
                a = a | 4;
                d = c1.a();
                q();
            }
            if (m1.n())
            {
                boolean flag1 = m1.o();
                a = a | 8;
                e = flag1;
                q();
            }
            if (m1.p())
            {
                boolean flag2 = m1.q();
                a = a | 0x10;
                f = flag2;
                q();
            }
            if (m1.r())
            {
                boolean flag3 = m1.s();
                a = a | 0x20;
                g = flag3;
                q();
            }
            if (i != null) goto _L2; else goto _L1
_L1:
            if (!i.m.b(m1).isEmpty())
            {
                if (h.isEmpty())
                {
                    h = i.m.b(m1);
                    a = a & 0xffffffbf;
                } else
                {
                    if ((a & 0x40) != 64)
                    {
                        h = new ArrayList(h);
                        a = a | 0x40;
                    }
                    h.addAll(i.m.b(m1));
                }
                q();
            }
_L4:
            a(((as.d) (m1)));
            d(m1.e);
            q();
            return this;
_L2:
            if (!i.m.b(m1).isEmpty())
            {
                if (i.d())
                {
                    i.b();
                    i = null;
                    h = i.m.b(m1);
                    a = a & 0xffffffbf;
                    if (as.d)
                    {
                        bn1 = u();
                    }
                    i = bn1;
                } else
                {
                    i.a(i.m.b(m1));
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
            if (i == null)
            {
                j1 = h.size();
            } else
            {
                j1 = i.c();
            }
            if (i1 >= j1) goto _L2; else goto _L1
_L1:
            if (i == null)
            {
                ag = (i.ag)h.get(i1);
            } else
            {
                ag = (i.ag)i.a(i1);
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
            return com.c.b.i.A().a(com/c/b/i$m, com/c/b/i$m$a);
        }

        public final ak.a e()
        {
            return com.c.b.i.z();
        }

        public final i.m g()
        {
            int j1 = 1;
            i.m m1 = new i.m(this, (byte)0);
            int k1 = a;
            int i1;
            if ((k1 & 1) != 1)
            {
                j1 = 0;
            }
            i.m.a(m1, b);
            i1 = j1;
            if ((k1 & 2) == 2)
            {
                i1 = j1 | 2;
            }
            i.m.a(m1, c);
            j1 = i1;
            if ((k1 & 4) == 4)
            {
                j1 = i1 | 4;
            }
            i.m.b(m1, d);
            i1 = j1;
            if ((k1 & 8) == 8)
            {
                i1 = j1 | 8;
            }
            i.m.b(m1, e);
            j1 = i1;
            if ((k1 & 0x10) == 16)
            {
                j1 = i1 | 0x10;
            }
            i.m.c(m1, f);
            i1 = j1;
            if ((k1 & 0x20) == 32)
            {
                i1 = j1 | 0x20;
            }
            i.m.d(m1, g);
            if (i == null)
            {
                if ((a & 0x40) == 64)
                {
                    h = Collections.unmodifiableList(h);
                    a = a & 0xffffffbf;
                }
                i.m.a(m1, h);
            } else
            {
                i.m.a(m1, i.e());
            }
            i.m.c(m1, i1);
            l();
            return m1;
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
            return i.m.y();
        }

        private a()
        {
            b = 0;
            d = 0;
            h = Collections.emptyList();
            s();
        }

        a(byte byte0)
        {
            this();
        }

        private a(as.b b1)
        {
            super(b1);
            b = 0;
            d = 0;
            h = Collections.emptyList();
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
        private static au.b d = new v();
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

            case 0: // '\0'
                return a;

            case 1: // '\001'
                return b;

            case 2: // '\002'
                return c;
            }
        }

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(com/c/b/i$m$b, s1);
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
            a = new b("STRING", 0, 0, 0);
            b = new b("CORD", 1, 1, 1);
            c = new b("STRING_PIECE", 2, 2, 2);
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
        private static au.b d = new w();
        private static final c e[] = values();
        private static final c h[];
        private final int f;
        private final int g;

        public static c a(int i1)
        {
            switch (i1)
            {
            default:
                return null;

            case 0: // '\0'
                return a;

            case 1: // '\001'
                return b;

            case 2: // '\002'
                return c;
            }
        }

        public static c valueOf(String s1)
        {
            return (c)Enum.valueOf(com/c/b/i$m$c, s1);
        }

        public static c[] values()
        {
            return (c[])h.clone();
        }

        public final int a()
        {
            return g;
        }

        static 
        {
            a = new c("JS_NORMAL", 0, 0, 0);
            b = new c("JS_STRING", 1, 1, 1);
            c = new c("JS_NUMBER", 2, 2, 2);
            h = (new c[] {
                a, b, c
            });
        }

        private c(String s1, int i1, int j1, int k1)
        {
            super(s1, i1);
            f = j1;
            g = k1;
        }
    }


    public static final bk c = new u();
    private static final nit> p = new <init>();
    private int f;
    private int g;
    private boolean h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private List m;
    private byte n;
    private int o;

    static int a(c c1, int i1)
    {
        c1.g = i1;
        return i1;
    }

    public static a a(g g1)
    {
        return p.x().a(g1);
    }

    static List a(st st, List list)
    {
        st.m = list;
        return list;
    }

    static boolean a(m m1, boolean flag)
    {
        m1.h = flag;
        return flag;
    }

    static int b(h h1, int i1)
    {
        h1.i = i1;
        return i1;
    }

    static List b(i i1)
    {
        return i1.m;
    }

    static boolean b(m m1, boolean flag)
    {
        m1.j = flag;
        return flag;
    }

    static int c(j j1, int i1)
    {
        j1.f = i1;
        return i1;
    }

    static boolean c(f f1, boolean flag)
    {
        f1.k = flag;
        return flag;
    }

    static boolean d(k k1, boolean flag)
    {
        k1.l = flag;
        return flag;
    }

    public static l y()
    {
        return p;
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
            h1.c(1, g);
        }
        if ((f & 2) == 2)
        {
            h1.a(2, h);
        }
        if ((f & 0x10) == 16)
        {
            h1.a(3, k);
        }
        if ((f & 8) == 8)
        {
            h1.a(5, j);
        }
        if ((f & 4) == 4)
        {
            h1.c(6, i);
        }
        if ((f & 0x20) == 32)
        {
            h1.a(10, l);
        }
        for (int i1 = 0; i1 < m.size(); i1++)
        {
            h1.b(999, (be)m.get(i1));
        }

        a1.a(h1);
        e.a(h1);
    }

    public final boolean a()
    {
        boolean flag = false;
        byte byte0 = n;
        if (byte0 == 1)
        {
            flag = true;
        } else
        if (byte0 != 0)
        {
            for (int i1 = 0; i1 < m.size(); i1++)
            {
                if (!(()m.get(i1)).a())
                {
                    n = 0;
                    return false;
                }
            }

            if (!M())
            {
                n = 0;
                return false;
            } else
            {
                n = 1;
                return true;
            }
        }
        return flag;
    }

    public final int b()
    {
        boolean flag = false;
        int i1 = o;
        if (i1 != -1)
        {
            return i1;
        }
        int j1;
        if ((f & 1) == 1)
        {
            j1 = com.c.b.h.f(1, g) + 0;
        } else
        {
            j1 = 0;
        }
        i1 = j1;
        if ((f & 2) == 2)
        {
            i1 = j1 + (com.c.b.h.j(2) + 1);
        }
        j1 = i1;
        if ((f & 0x10) == 16)
        {
            j1 = i1 + (com.c.b.h.j(3) + 1);
        }
        i1 = j1;
        if ((f & 8) == 8)
        {
            i1 = j1 + (com.c.b.h.j(5) + 1);
        }
        j1 = i1;
        if ((f & 4) == 4)
        {
            j1 = i1 + com.c.b.h.f(6, i);
        }
        i1 = j1;
        if ((f & 0x20) == 32)
        {
            i1 = j1 + (com.c.b.h.j(10) + 1);
        }
        for (j1 = ((flag) ? 1 : 0); j1 < m.size();)
        {
            int k1 = com.c.b.h.d(999, (be)m.get(j1));
            j1++;
            i1 = k1 + i1;
        }

        i1 = O() + i1 + e.b();
        o = i1;
        return i1;
    }

    protected final  c_()
    {
        return com.c.b.i.A().a(com/c/b/i$m, com/c/b/i$m$a);
    }

    public final by f()
    {
        return e;
    }

    public final boolean h()
    {
        return (f & 1) == 1;
    }

    public final b i()
    {
        b b2 = b.a(g);
        b b1 = b2;
        if (b2 == null)
        {
            b1 = b.a;
        }
        return b1;
    }

    public final boolean j()
    {
        return (f & 2) == 2;
    }

    public final boolean k()
    {
        return h;
    }

    public final boolean l()
    {
        return (f & 4) == 4;
    }

    public final c m()
    {
        c c2 = c.a(i);
        c c1 = c2;
        if (c2 == null)
        {
            c1 = c.a;
        }
        return c1;
    }

    public final boolean n()
    {
        return (f & 8) == 8;
    }

    public final boolean o()
    {
        return j;
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
        return p.x();
    }

    public final  v()
    {
        return x();
    }

    public final volatile bd w()
    {
        return p;
    }

    public final a x()
    {
        if (this == p)
        {
            return new a((byte)0);
        } else
        {
            return (new a((byte)0)).a(this);
        }
    }


    private ()
    {
        n = -1;
        o = -1;
        g = 0;
        h = false;
        i = 0;
        j = false;
        k = false;
        l = false;
        m = Collections.emptyList();
    }

    private ( )
    {
        super();
        n = -1;
        o = -1;
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
_L13:
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
        JVM INSTR lookupswitch 8: default 731
    //                   0: 734
    //                   8: 142
    //                   16: 328
    //                   24: 373
    //                   40: 419
    //                   48: 465
    //                   80: 570
    //                   7994: 616;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L3:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        if (a(g1, , aq, j1)) goto _L13; else goto _L12
_L12:
        flag = true;
          goto _L13
_L5:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        j1 = g1.n();
        k1 = i1;
        l1 = i1;
        i2 = i1;
        if (b.a(j1) != null) goto _L15; else goto _L14
_L14:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        .a(1, j1);
          goto _L13
        g1;
        i1 = k1;
        throw new RuntimeException(g1.a(this));
        g1;
_L20:
        if ((i1 & 0x40) == 64)
        {
            m = Collections.unmodifiableList(m);
        }
        e = .b();
        L();
        throw g1;
_L15:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f = f | 1;
        k1 = i1;
        l1 = i1;
        i2 = i1;
        g = j1;
          goto _L13
        g1;
        i1 = l1;
        throw new RuntimeException((new av(g1.getMessage())).a(this));
_L6:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f = f | 2;
        k1 = i1;
        l1 = i1;
        i2 = i1;
        h = g1.i();
          goto _L13
_L7:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f = f | 0x10;
        k1 = i1;
        l1 = i1;
        i2 = i1;
        k = g1.i();
          goto _L13
_L8:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f = f | 8;
        k1 = i1;
        l1 = i1;
        i2 = i1;
        j = g1.i();
          goto _L13
_L9:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        j1 = g1.n();
        k1 = i1;
        l1 = i1;
        i2 = i1;
        if (c.a(j1) != null) goto _L17; else goto _L16
_L16:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        .a(6, j1);
          goto _L13
_L17:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f = f | 4;
        k1 = i1;
        l1 = i1;
        i2 = i1;
        i = j1;
          goto _L13
_L10:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f = f | 0x20;
        k1 = i1;
        l1 = i1;
        i2 = i1;
        l = g1.i();
          goto _L13
_L11:
        j1 = i1;
        if ((i1 & 0x40) == 64) goto _L19; else goto _L18
_L18:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        m = new ArrayList();
        j1 = i1 | 0x40;
_L19:
        k1 = j1;
        l1 = j1;
        i2 = j1;
        m.add(g1.a(.c, aq));
        i1 = j1;
          goto _L13
_L2:
        if ((i1 & 0x40) == 64)
        {
            m = Collections.unmodifiableList(m);
        }
        e = .b();
        L();
        return;
_L4:
        flag = true;
          goto _L13
        g1;
        i1 = i2;
          goto _L20
    }

    L(g g1, aq aq, byte byte0)
    {
        this(g1, aq);
    }
}
