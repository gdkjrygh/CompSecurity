// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.c.b:
//            as, i, ai, f, 
//            av, by, g, be, 
//            h, bk, aq, bd, 
//            bn, aj, bg

public static final class <init> extends as
    implements <init>
{
    public static final class a extends as.a
        implements i.ah
    {

        private int a;
        private List b;
        private bn c;
        private Object d;
        private long e;
        private long f;
        private double g;
        private f h;
        private Object i;

        private a d(bd bd)
        {
            if (bd instanceof i.ag)
            {
                return a((i.ag)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private a d(g g1, aq aq)
        {
            g1 = (i.ag)i.ag.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (i.ag)aq.a();
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
            if (as.d)
            {
                u();
            }
        }

        private i.ag s()
        {
            i.ag ag1 = t();
            if (!ag1.a())
            {
                throw b(ag1);
            } else
            {
                return ag1;
            }
        }

        private i.ag t()
        {
            int j1 = 1;
            i.ag ag1 = new i.ag(this, (byte)0);
            int k1 = a;
            int i1;
            if (c == null)
            {
                if ((a & 1) == 1)
                {
                    b = Collections.unmodifiableList(b);
                    a = a & -2;
                }
                i.ag.a(ag1, b);
            } else
            {
                i.ag.a(ag1, c.e());
            }
            if ((k1 & 2) != 2)
            {
                j1 = 0;
            }
            i.ag.a(ag1, d);
            i1 = j1;
            if ((k1 & 4) == 4)
            {
                i1 = j1 | 2;
            }
            i.ag.a(ag1, e);
            j1 = i1;
            if ((k1 & 8) == 8)
            {
                j1 = i1 | 4;
            }
            i.ag.b(ag1, f);
            i1 = j1;
            if ((k1 & 0x10) == 16)
            {
                i1 = j1 | 8;
            }
            i.ag.a(ag1, g);
            j1 = i1;
            if ((k1 & 0x20) == 32)
            {
                j1 = i1 | 0x10;
            }
            i.ag.a(ag1, h);
            i1 = j1;
            if ((k1 & 0x40) == 64)
            {
                i1 = j1 | 0x20;
            }
            i.ag.b(ag1, i);
            i.ag.a(ag1, i1);
            l();
            return ag1;
        }

        private bn u()
        {
            boolean flag = true;
            if (c == null)
            {
                List list = b;
                if ((a & 1) != 1)
                {
                    flag = false;
                }
                c = new bn(list, flag, p(), n());
                b = null;
            }
            return c;
        }

        public final a.a a(bd bd)
        {
            return d(bd);
        }

        public final a.a a(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final a a(i.ag ag1)
        {
            Object obj = null;
            if (ag1 == i.ag.r())
            {
                return this;
            }
            if (c == null)
            {
                if (!i.ag.a(ag1).isEmpty())
                {
                    double d1;
                    long l1;
                    if (b.isEmpty())
                    {
                        b = i.ag.a(ag1);
                        a = a & -2;
                    } else
                    {
                        if ((a & 1) != 1)
                        {
                            b = new ArrayList(b);
                            a = a | 1;
                        }
                        b.addAll(i.ag.a(ag1));
                    }
                    q();
                }
            } else
            if (!i.ag.a(ag1).isEmpty())
            {
                if (c.d())
                {
                    c.b();
                    c = null;
                    b = i.ag.a(ag1);
                    a = a & -2;
                    if (as.d)
                    {
                        obj = u();
                    }
                    c = ((bn) (obj));
                } else
                {
                    c.a(i.ag.a(ag1));
                }
            }
            if (ag1.h())
            {
                a = a | 2;
                d = i.ag.b(ag1);
                q();
            }
            if (ag1.i())
            {
                l1 = ag1.j();
                a = a | 4;
                e = l1;
                q();
            }
            if (ag1.k())
            {
                l1 = ag1.l();
                a = a | 8;
                f = l1;
                q();
            }
            if (ag1.m())
            {
                d1 = ag1.n();
                a = a | 0x10;
                g = d1;
                q();
            }
            if (ag1.o())
            {
                obj = ag1.p();
                if (obj == null)
                {
                    throw new NullPointerException();
                }
                a = a | 0x20;
                h = ((f) (obj));
                q();
            }
            if (ag1.q())
            {
                a = a | 0x40;
                i = i.ag.c(ag1);
                q();
            }
            d(ag1.e);
            q();
            return this;
        }

        public final boolean a()
        {
            int i1 = 0;
            do
            {
                int j1;
                if (c == null)
                {
                    j1 = b.size();
                } else
                {
                    j1 = c.c();
                }
                if (i1 < j1)
                {
                    b b1;
                    if (c == null)
                    {
                        b1 = (b)b.get(i1);
                    } else
                    {
                        b1 = (b)c.a(i1);
                    }
                    if (!b1.a())
                    {
                        return false;
                    }
                    i1++;
                } else
                {
                    return true;
                }
            } while (true);
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
            return com.c.b.i.K().a(com/c/b/i$ag, com/c/b/i$ag$a);
        }

        public final ak.a e()
        {
            return com.c.b.i.J();
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
            return i.ag.r();
        }

        private a()
        {
            b = Collections.emptyList();
            d = "";
            h = f.a;
            i = "";
            r();
        }

        a(byte byte0)
        {
            this();
        }

        private a(as.b b1)
        {
            super(b1);
            b = Collections.emptyList();
            d = "";
            h = f.a;
            i = "";
            r();
        }

        a(as.b b1, byte byte0)
        {
            this(b1);
        }
    }

    public static final class b extends as
        implements c
    {

        public static final bk c = new aj();
        private static final b k = new b();
        private int f;
        private volatile Object g;
        private boolean h;
        private byte i;
        private int j;

        static int a(b b1, int i1)
        {
            b1.f = i1;
            return i1;
        }

        static Object a(b b1)
        {
            return b1.g;
        }

        static Object a(b b1, Object obj)
        {
            b1.g = obj;
            return obj;
        }

        static boolean a(b b1, boolean flag)
        {
            b1.h = flag;
            return flag;
        }

        public static b k()
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

        protected final bd.a a(as.b b1)
        {
            return new a(b1, (byte)0);
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

        protected final as.g c_()
        {
            return com.c.b.i.M().a(com/c/b/i$ag$b, com/c/b/i$ag$b$a);
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

        public final bd.a u()
        {
            return k.m();
        }

        public final be.a v()
        {
            return m();
        }

        public final volatile bd w()
        {
            return k;
        }


        private b()
        {
            i = -1;
            j = -1;
            g = "";
            h = false;
        }

        private b(as.a a1)
        {
            super(a1);
            i = -1;
            j = -1;
        }

        b(as.a a1, byte byte0)
        {
            this(a1);
        }

        private b(g g1, aq aq)
        {
            by.a a1;
            boolean flag;
            this();
            a1 = by.c();
            flag = false;
_L8:
            if (flag) goto _L2; else goto _L1
_L1:
            int i1 = g1.a();
            i1;
            JVM INSTR lookupswitch 3: default 190
        //                       0: 193
        //                       10: 78
        //                       16: 132;
               goto _L3 _L4 _L5 _L6
_L3:
            if (!a(g1, a1, aq, i1))
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
            e = a1.b();
            L();
            throw g1;
_L6:
            f = f | 2;
            h = g1.i();
            continue; /* Loop/switch isn't completed */
            g1;
            throw new RuntimeException((new av(g1.getMessage())).a(this));
_L2:
            e = a1.b();
            L();
            return;
_L4:
            flag = true;
            if (true) goto _L8; else goto _L7
_L7:
        }

        b(g g1, aq aq, byte byte0)
        {
            this(g1, aq);
        }
    }

    public static final class b.a extends as.a
        implements c
    {

        private int a;
        private Object b;
        private boolean c;

        private b.a d(bd bd)
        {
            if (bd instanceof b)
            {
                return a((b)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private b.a d(g g1, aq aq)
        {
            g1 = (b)b.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (b)aq.a();
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

        private b r()
        {
            b b1 = s();
            if (!b1.a())
            {
                throw b(b1);
            } else
            {
                return b1;
            }
        }

        private b s()
        {
            int i1 = 1;
            b b1 = new b(this, (byte)0);
            int k1 = a;
            int j1;
            if ((k1 & 1) != 1)
            {
                i1 = 0;
            }
            b.a(b1, b);
            j1 = i1;
            if ((k1 & 2) == 2)
            {
                j1 = i1 | 2;
            }
            b.a(b1, c);
            b.a(b1, j1);
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

        public final b.a a(b b1)
        {
            if (b1 == b.k())
            {
                return this;
            }
            if (b1.h())
            {
                a = a | 1;
                b = b.a(b1);
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
            return b.k();
        }

        private b.a()
        {
            b = "";
        }

        b.a(byte byte0)
        {
            this();
        }

        private b.a(as.b b1)
        {
            super(b1);
            b = "";
        }

        b.a(as.b b1, byte byte0)
        {
            this(b1);
        }
    }

    public static interface c
        extends bg
    {
    }


    public static final bk c = new ai();
    private static final nit> p = new <init>();
    private int f;
    private List g;
    private volatile Object h;
    private long i;
    private long j;
    private double k;
    private f l;
    private volatile Object m;
    private byte n;
    private int o;

    static double a(ect ect, double d)
    {
        ect.k = d;
        return d;
    }

    static int a(k k1, int i1)
    {
        k1.f = i1;
        return i1;
    }

    static long a(f f1, long l1)
    {
        f1.i = l1;
        return l1;
    }

    static f a(i i1, f f1)
    {
        i1.l = f1;
        return f1;
    }

    static Object a(ect ect, Object obj)
    {
        ect.h = obj;
        return obj;
    }

    static List a(h h1)
    {
        return h1.g;
    }

    static List a(t t1, List list)
    {
        t1.g = list;
        return list;
    }

    static long b(g g1, long l1)
    {
        g1.j = l1;
        return l1;
    }

    static Object b(j j1)
    {
        return j1.h;
    }

    static Object b(ect ect, Object obj)
    {
        ect.m = obj;
        return obj;
    }

    static Object c(m m1)
    {
        return m1.m;
    }

    public static m r()
    {
        return p;
    }

    private f s()
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

    private f x()
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

    private a y()
    {
        if (this == p)
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
        for (int i1 = 0; i1 < g.size(); i1++)
        {
            h1.b(2, (be)g.get(i1));
        }

        if ((f & 1) == 1)
        {
            h1.a(3, s());
        }
        if ((f & 2) == 2)
        {
            h1.a(4, i);
        }
        if ((f & 4) == 4)
        {
            h1.b(5, j);
        }
        if ((f & 8) == 8)
        {
            double d = k;
            h1.g(6, 1);
            h1.a(d);
        }
        if ((f & 0x10) == 16)
        {
            h1.a(7, l);
        }
        if ((f & 0x20) == 32)
        {
            h1.a(8, x());
        }
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
            for (int i1 = 0; i1 < g.size(); i1++)
            {
                if (!((b)g.get(i1)).a())
                {
                    n = 0;
                    return false;
                }
            }

            n = 1;
            return true;
        }
        return flag;
    }

    public final int b()
    {
        int i1 = o;
        if (i1 != -1)
        {
            return i1;
        }
        int j1 = 0;
        i1 = 0;
        for (; j1 < g.size(); j1++)
        {
            i1 += com.c.b.h.d(2, (be)g.get(j1));
        }

        j1 = i1;
        if ((f & 1) == 1)
        {
            j1 = i1 + com.c.b.h.c(3, s());
        }
        i1 = j1;
        if ((f & 2) == 2)
        {
            i1 = j1 + com.c.b.h.d(4, i);
        }
        j1 = i1;
        if ((f & 4) == 4)
        {
            j1 = i1 + com.c.b.h.e(5, j);
        }
        i1 = j1;
        if ((f & 8) == 8)
        {
            i1 = j1 + (com.c.b.h.j(6) + 8);
        }
        j1 = i1;
        if ((f & 0x10) == 16)
        {
            j1 = i1 + com.c.b.h.c(7, l);
        }
        i1 = j1;
        if ((f & 0x20) == 32)
        {
            i1 = j1 + com.c.b.h.c(8, x());
        }
        i1 = e.b() + i1;
        o = i1;
        return i1;
    }

    protected final o c_()
    {
        return com.c.b.i.K().a(com/c/b/i$ag, com/c/b/i$ag$a);
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

    public final long j()
    {
        return i;
    }

    public final boolean k()
    {
        return (f & 4) == 4;
    }

    public final long l()
    {
        return j;
    }

    public final boolean m()
    {
        return (f & 8) == 8;
    }

    public final double n()
    {
        return k;
    }

    public final boolean o()
    {
        return (f & 0x10) == 16;
    }

    public final f p()
    {
        return l;
    }

    public final boolean q()
    {
        return (f & 0x20) == 32;
    }

    public final bk t()
    {
        return c;
    }

    public final c u()
    {
        return p.y();
    }

    public final y v()
    {
        return y();
    }

    public final volatile bd w()
    {
        return p;
    }


    private ect()
    {
        n = -1;
        o = -1;
        g = Collections.emptyList();
        h = "";
        i = 0L;
        j = 0L;
        k = 0.0D;
        l = f.a;
        m = "";
    }

    private m(m m1)
    {
        super(m1);
        n = -1;
        o = -1;
    }

    o(o o1, byte byte0)
    {
        this(o1);
    }

    private t(g g1, aq aq)
    {
        t t1;
        boolean flag;
        boolean flag2;
        flag2 = false;
        this();
        t1 = by.c();
        flag = false;
_L15:
        if (flag2) goto _L2; else goto _L1
_L1:
        boolean flag1;
        boolean flag3;
        boolean flag4;
        flag3 = flag;
        flag1 = flag;
        flag4 = flag;
        int i1 = g1.a();
        i1;
        JVM INSTR lookupswitch 8: default 637
    //                   0: 640
    //                   18: 142
    //                   26: 272
    //                   32: 361
    //                   40: 406
    //                   49: 451
    //                   58: 497
    //                   66: 543;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L3:
        flag3 = flag;
        flag1 = flag;
        flag4 = flag;
        if (!a(g1, t1, aq, i1))
        {
            flag2 = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        i1 = ((flag) ? 1 : 0);
        if ((flag & true)) goto _L13; else goto _L12
_L12:
        flag3 = flag;
        flag1 = flag;
        flag4 = flag;
        g = new ArrayList();
        i1 = flag | true;
_L13:
        flag3 = i1;
        flag1 = i1;
        flag4 = i1;
        g.add(g1.a(b.c, aq));
        flag = i1;
        continue; /* Loop/switch isn't completed */
        g1;
        flag1 = flag3;
        throw new RuntimeException(g1.a(this));
        g1;
        if ((flag1 & true))
        {
            g = Collections.unmodifiableList(g);
        }
        e = t1.b();
        L();
        throw g1;
_L6:
        flag3 = flag;
        flag1 = flag;
        flag4 = flag;
        f f1 = g1.l();
        flag3 = flag;
        flag1 = flag;
        flag4 = flag;
        f = f | 1;
        flag3 = flag;
        flag1 = flag;
        flag4 = flag;
        h = f1;
        continue; /* Loop/switch isn't completed */
        g1;
        flag1 = flag4;
        throw new RuntimeException((new av(g1.getMessage())).a(this));
_L7:
        flag3 = flag;
        flag1 = flag;
        flag4 = flag;
        f = f | 2;
        flag3 = flag;
        flag1 = flag;
        flag4 = flag;
        i = g1.d();
        continue; /* Loop/switch isn't completed */
_L8:
        flag3 = flag;
        flag1 = flag;
        flag4 = flag;
        f = f | 4;
        flag3 = flag;
        flag1 = flag;
        flag4 = flag;
        j = g1.e();
        continue; /* Loop/switch isn't completed */
_L9:
        flag3 = flag;
        flag1 = flag;
        flag4 = flag;
        f = f | 8;
        flag3 = flag;
        flag1 = flag;
        flag4 = flag;
        k = g1.b();
        continue; /* Loop/switch isn't completed */
_L10:
        flag3 = flag;
        flag1 = flag;
        flag4 = flag;
        f = f | 0x10;
        flag3 = flag;
        flag1 = flag;
        flag4 = flag;
        l = g1.l();
        continue; /* Loop/switch isn't completed */
_L11:
        flag3 = flag;
        flag1 = flag;
        flag4 = flag;
        f1 = g1.l();
        flag3 = flag;
        flag1 = flag;
        flag4 = flag;
        f = f | 0x20;
        flag3 = flag;
        flag1 = flag;
        flag4 = flag;
        m = f1;
        continue; /* Loop/switch isn't completed */
_L2:
        if ((flag & true))
        {
            g = Collections.unmodifiableList(g);
        }
        e = t1.b();
        L();
        return;
_L4:
        flag2 = true;
        if (true) goto _L15; else goto _L14
_L14:
    }

    L(g g1, aq aq, byte byte0)
    {
        this(g1, aq);
    }
}
