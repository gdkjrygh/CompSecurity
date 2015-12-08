// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.k;

import com.c.b.aq;
import com.c.b.as;
import com.c.b.av;
import com.c.b.bd;
import com.c.b.be;
import com.c.b.bk;
import com.c.b.by;
import com.c.b.f;
import com.c.b.g;
import com.c.b.h;
import java.io.IOException;

// Referenced classes of package com.kik.k:
//            a, c

public static final class <init> extends as
    implements <init>
{
    public static final class a extends com.c.b.as.a
        implements a.b
    {

        private int a;
        private boolean b;
        private Object c;
        private int d;
        private int e;
        private long f;
        private long g;
        private int h;
        private int i;

        private a d(bd bd)
        {
            if (bd instanceof a.a)
            {
                return a((a.a)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private a d(g g1, aq aq)
        {
            g1 = (a.a)a.a.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (a.a)aq.a();
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

        private a.a r()
        {
            a.a a1 = s();
            if (!a1.a())
            {
                throw b(a1);
            } else
            {
                return a1;
            }
        }

        private a.a s()
        {
            int j1 = 1;
            a.a a1 = new a.a(this, (byte)0);
            int k1 = a;
            int i1;
            if ((k1 & 1) != 1)
            {
                j1 = 0;
            }
            a.a.a(a1, b);
            i1 = j1;
            if ((k1 & 2) == 2)
            {
                i1 = j1 | 2;
            }
            a.a.a(a1, c);
            j1 = i1;
            if ((k1 & 4) == 4)
            {
                j1 = i1 | 4;
            }
            a.a.a(a1, d);
            i1 = j1;
            if ((k1 & 8) == 8)
            {
                i1 = j1 | 8;
            }
            a.a.b(a1, e);
            j1 = i1;
            if ((k1 & 0x10) == 16)
            {
                j1 = i1 | 0x10;
            }
            a.a.a(a1, f);
            i1 = j1;
            if ((k1 & 0x20) == 32)
            {
                i1 = j1 | 0x20;
            }
            a.a.b(a1, g);
            j1 = i1;
            if ((k1 & 0x40) == 64)
            {
                j1 = i1 | 0x40;
            }
            a.a.c(a1, h);
            i1 = j1;
            if ((k1 & 0x80) == 128)
            {
                i1 = j1 | 0x80;
            }
            a.a.d(a1, i);
            a.a.e(a1, i1);
            l();
            return a1;
        }

        public final com.c.b.a.a a(bd bd)
        {
            return d(bd);
        }

        public final com.c.b.a.a a(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final a a(a.a a1)
        {
            if (a1 == a.a.A())
            {
                return this;
            }
            if (a1.h())
            {
                boolean flag = a1.i();
                a = a | 1;
                b = flag;
                q();
            }
            if (a1.j())
            {
                a = a | 2;
                c = a.a.a(a1);
                q();
            }
            if (a1.k())
            {
                int i1 = a1.l();
                a = a | 4;
                d = i1;
                q();
            }
            if (a1.m())
            {
                int j1 = a1.n();
                a = a | 8;
                e = j1;
                q();
            }
            if (a1.o())
            {
                long l2 = a1.p();
                a = a | 0x10;
                f = l2;
                q();
            }
            if (a1.q())
            {
                long l3 = a1.r();
                a = a | 0x20;
                g = l3;
                q();
            }
            if (a1.s())
            {
                int k1 = a1.x();
                a = a | 0x40;
                h = k1;
                q();
            }
            if (a1.y())
            {
                int l1 = a1.z();
                a = a | 0x80;
                i = l1;
                q();
            }
            d(a.a.b(a1));
            q();
            return this;
        }

        public final boolean a()
        {
            return true;
        }

        public final com.c.b.b.a b(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final com.c.b.bd.a c(bd bd)
        {
            return d(bd);
        }

        public final com.c.b.be.a c(g g1, aq aq)
        {
            return d(g1, aq);
        }

        protected final com.c.b.as.g d()
        {
            return com.kik.k.a.c().a(com/kik/k/a$a, com/kik/k/a$a$a);
        }

        public final com.c.b.ak.a e()
        {
            return com.kik.k.a.b();
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
            return a.a.A();
        }

        private a()
        {
            c = "";
            a.a.B();
        }

        a(byte byte0)
        {
            this();
        }

        private a(com.c.b.as.b b1)
        {
            super(b1);
            c = "";
            a.a.B();
        }

        a(com.c.b.as.b b1, byte byte0)
        {
            this(b1);
        }
    }


    public static final bk c = new c();
    private static final nit> q = new <init>();
    private int f;
    private boolean g;
    private volatile Object h;
    private int i;
    private int j;
    private long k;
    private long l;
    private int m;
    private int n;
    private byte o;
    private int p;

    public static ct A()
    {
        return q;
    }

    static boolean B()
    {
        return d;
    }

    private f C()
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

    private a D()
    {
        if (this == q)
        {
            return new a((byte)0);
        } else
        {
            return (new a((byte)0)).a(this);
        }
    }

    static int a(a.a a1, int i1)
    {
        a1.i = i1;
        return i1;
    }

    static long a(i i1, long l1)
    {
        i1.k = l1;
        return l1;
    }

    static Object a(k k1)
    {
        return k1.h;
    }

    static Object a(ct ct, Object obj)
    {
        ct.h = obj;
        return obj;
    }

    static boolean a(h h1, boolean flag)
    {
        h1.g = flag;
        return flag;
    }

    static int b(g g1, int i1)
    {
        g1.j = i1;
        return i1;
    }

    static long b(j j1, long l1)
    {
        j1.l = l1;
        return l1;
    }

    static by b(l l1)
    {
        return l1.e;
    }

    static int c(e e1, int i1)
    {
        e1.m = i1;
        return i1;
    }

    static int d(m m1, int i1)
    {
        m1.n = i1;
        return i1;
    }

    static int e(n n1, int i1)
    {
        n1.f = i1;
        return i1;
    }

    protected final com.c.b. a(com.c.b. )
    {
        return new a(, (byte)0);
    }

    public final void a(h h1)
    {
        if ((f & 1) == 1)
        {
            h1.a(1, g);
        }
        if ((f & 2) == 2)
        {
            h1.a(2, C());
        }
        if ((f & 4) == 4)
        {
            h1.a(5, i);
        }
        if ((f & 8) == 8)
        {
            h1.a(6, j);
        }
        if ((f & 0x10) == 16)
        {
            h1.c(7, k);
        }
        if ((f & 0x20) == 32)
        {
            h1.c(8, l);
        }
        if ((f & 0x40) == 64)
        {
            h1.b(15, m);
        }
        if ((f & 0x80) == 128)
        {
            h1.b(16, n);
        }
        e.a(h1);
    }

    public final boolean a()
    {
        byte byte0 = o;
        if (byte0 == 1)
        {
            return true;
        }
        if (byte0 == 0)
        {
            return false;
        } else
        {
            o = 1;
            return true;
        }
    }

    public final int b()
    {
        int i1 = p;
        if (i1 != -1)
        {
            return i1;
        }
        int j1 = 0;
        if ((f & 1) == 1)
        {
            j1 = com.c.b.h.g(1) + 0;
        }
        i1 = j1;
        if ((f & 2) == 2)
        {
            i1 = j1 + com.c.b.h.c(2, C());
        }
        j1 = i1;
        if ((f & 4) == 4)
        {
            j1 = i1 + com.c.b.h.d(5, i);
        }
        i1 = j1;
        if ((f & 8) == 8)
        {
            i1 = j1 + com.c.b.h.d(6, j);
        }
        j1 = i1;
        if ((f & 0x10) == 16)
        {
            j1 = i1 + com.c.b.h.h(7);
        }
        i1 = j1;
        if ((f & 0x20) == 32)
        {
            i1 = j1 + com.c.b.h.h(8);
        }
        j1 = i1;
        if ((f & 0x40) == 64)
        {
            j1 = i1 + com.c.b.h.e(15, m);
        }
        i1 = j1;
        if ((f & 0x80) == 128)
        {
            i1 = j1 + com.c.b.h.e(16, n);
        }
        i1 += e.b();
        p = i1;
        return i1;
    }

    protected final com.c.b. c_()
    {
        return com.kik.k.a.c().a(com/kik/k/a$a, com/kik/k/a$a$a);
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
        return g;
    }

    public final boolean j()
    {
        return (f & 2) == 2;
    }

    public final boolean k()
    {
        return (f & 4) == 4;
    }

    public final int l()
    {
        return i;
    }

    public final boolean m()
    {
        return (f & 8) == 8;
    }

    public final int n()
    {
        return j;
    }

    public final boolean o()
    {
        return (f & 0x10) == 16;
    }

    public final long p()
    {
        return k;
    }

    public final boolean q()
    {
        return (f & 0x20) == 32;
    }

    public final long r()
    {
        return l;
    }

    public final boolean s()
    {
        return (f & 0x40) == 64;
    }

    public final bk t()
    {
        return c;
    }

    public final com.c.b. u()
    {
        return q.D();
    }

    public final com.c.b. v()
    {
        return D();
    }

    public final volatile bd w()
    {
        return q;
    }

    public final int x()
    {
        return m;
    }

    public final boolean y()
    {
        return (f & 0x80) == 128;
    }

    public final int z()
    {
        return n;
    }


    private a()
    {
        o = -1;
        p = -1;
        g = false;
        h = "";
        i = 0;
        j = 0;
        k = 0L;
        l = 0L;
        m = 0;
        n = 0;
    }

    private n(com.c.b. )
    {
        super();
        o = -1;
        p = -1;
    }

    p(com.c.b. , byte byte0)
    {
        this();
    }

    private wable(g g1, aq aq)
    {
        com.c.b. ;
        boolean flag;
        this();
         = by.c();
        flag = false;
_L14:
        if (flag) goto _L2; else goto _L1
_L1:
        int i1 = g1.a();
        i1;
        JVM INSTR lookupswitch 9: default 370
    //                   0: 373
    //                   8: 126
    //                   18: 176
    //                   40: 225
    //                   48: 246
    //                   57: 268
    //                   65: 290
    //                   120: 312
    //                   128: 334;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L3:
        if (!a(g1, , aq, i1))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        f = f | 1;
        g = g1.i();
        continue; /* Loop/switch isn't completed */
        g1;
        throw new RuntimeException(g1.a(this));
        g1;
        e = .b();
        L();
        throw g1;
_L6:
        f f1 = g1.l();
        f = f | 2;
        h = f1;
        continue; /* Loop/switch isn't completed */
        g1;
        throw new RuntimeException((new av(g1.getMessage())).a(this));
_L7:
        f = f | 4;
        i = g1.f();
        continue; /* Loop/switch isn't completed */
_L8:
        f = f | 8;
        j = g1.f();
        continue; /* Loop/switch isn't completed */
_L9:
        f = f | 0x10;
        k = g1.p();
        continue; /* Loop/switch isn't completed */
_L10:
        f = f | 0x20;
        l = g1.p();
        continue; /* Loop/switch isn't completed */
_L11:
        f = f | 0x40;
        m = g1.m();
        continue; /* Loop/switch isn't completed */
_L12:
        f = f | 0x80;
        n = g1.m();
        continue; /* Loop/switch isn't completed */
_L2:
        e = .b();
        L();
        return;
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
