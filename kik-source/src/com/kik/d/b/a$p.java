// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.d.b;

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

// Referenced classes of package com.kik.d.b:
//            a, l

public static final class <init> extends as
    implements <init>
{
    public static final class a extends com.c.b.as.a
        implements a.q
    {

        private int a;
        private Object b;
        private long c;

        private a d(bd bd)
        {
            if (bd instanceof a.p)
            {
                return a((a.p)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private a d(g g1, aq aq)
        {
            g1 = (a.p)a.p.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (a.p)aq.a();
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

        private a.p s()
        {
            int i1 = 1;
            a.p p1 = new a.p(this, (byte)0);
            int k1 = a;
            int j1;
            if ((k1 & 1) != 1)
            {
                i1 = 0;
            }
            a.p.a(p1, b);
            j1 = i1;
            if ((k1 & 2) == 2)
            {
                j1 = i1 | 2;
            }
            a.p.a(p1, c);
            a.p.a(p1, j1);
            l();
            return p1;
        }

        public final com.c.b.a.a a(bd bd)
        {
            return d(bd);
        }

        public final com.c.b.a.a a(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final a a(long l1)
        {
            a = a | 2;
            c = l1;
            q();
            return this;
        }

        public final a a(a.p p1)
        {
            if (p1 == a.p.l())
            {
                return this;
            }
            if (p1.h())
            {
                a = a | 1;
                b = a.p.a(p1);
                q();
            }
            if (p1.i())
            {
                a(p1.j());
            }
            d(a.p.b(p1));
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
            return com.kik.d.b.a.l().a(com/kik/d/b/a$p, com/kik/d/b/a$p$a);
        }

        public final com.c.b.ak.a e()
        {
            return com.kik.d.b.a.k();
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

        public final a.p r()
        {
            a.p p1 = s();
            if (!p1.a())
            {
                throw b(p1);
            } else
            {
                return p1;
            }
        }

        public final bd w()
        {
            return a.p.l();
        }

        private a()
        {
            b = "";
            a.p.m();
        }

        a(byte byte0)
        {
            this();
        }

        private a(com.c.b.as.b b1)
        {
            super(b1);
            b = "";
            a.p.m();
        }

        a(com.c.b.as.b b1, byte byte0)
        {
            this(b1);
        }
    }


    public static final bk c = new l();
    private static final nit> k = new <init>();
    private int f;
    private volatile Object g;
    private long h;
    private byte i;
    private int j;

    static int a( , int i1)
    {
        .f = i1;
        return i1;
    }

    static long a(f f1, long l1)
    {
        f1.h = l1;
        return l1;
    }

    static Object a(h h1)
    {
        return h1.g;
    }

    static Object a( , Object obj)
    {
        .g = obj;
        return obj;
    }

    static by b(g g1)
    {
        return g1.e;
    }

    public static a k()
    {
        return k.o();
    }

    public static o l()
    {
        return k;
    }

    static boolean m()
    {
        return d;
    }

    private f n()
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

    private a o()
    {
        if (this == k)
        {
            return new a((byte)0);
        } else
        {
            return (new a((byte)0)).a(this);
        }
    }

    protected final com.c.b. a(com.c.b. )
    {
        return new a(, (byte)0);
    }

    public final void a(h h1)
    {
        if ((f & 1) == 1)
        {
            h1.a(1, n());
        }
        if ((f & 2) == 2)
        {
            h1.b(2, h);
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
            i1 = com.c.b.h.c(1, n()) + 0;
        }
        int j1 = i1;
        if ((f & 2) == 2)
        {
            j1 = i1 + com.c.b.h.e(2, h);
        }
        i1 = j1 + e.b();
        j = i1;
        return i1;
    }

    protected final com.c.b. c_()
    {
        return com.kik.d.b.a.l().a(com/kik/d/b/a$p, com/kik/d/b/a$p$a);
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
        return h;
    }

    public final bk t()
    {
        return c;
    }

    public final com.c.b. u()
    {
        return k.o();
    }

    public final com.c.b. v()
    {
        return o();
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
        h = 0L;
    }

    private h(com.c.b. )
    {
        super();
        i = -1;
        j = -1;
    }

    j(com.c.b. , byte byte0)
    {
        this();
    }

    private ble(g g1, aq aq)
    {
        com.c.b. ;
        boolean flag;
        this();
         = by.c();
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
        h = g1.e();
        continue; /* Loop/switch isn't completed */
        g1;
        throw new RuntimeException((new av(g1.getMessage())).a(this));
_L2:
        e = .b();
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
