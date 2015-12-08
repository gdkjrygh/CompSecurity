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
//            a, e

public static final class <init> extends as
    implements <init>
{
    public static final class a extends com.c.b.as.a
        implements a.e
    {

        private int a;
        private int b;
        private Object c;

        private a d(bd bd)
        {
            if (bd instanceof a.d)
            {
                return a((a.d)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private a d(g g1, aq aq)
        {
            g1 = (a.d)a.d.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (a.d)aq.a();
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

        public final com.c.b.a.a a(bd bd)
        {
            return d(bd);
        }

        public final com.c.b.a.a a(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final a a(a.d d1)
        {
            if (d1 == a.d.m())
            {
                return this;
            }
            if (d1.h())
            {
                a(d1.i());
            }
            if (d1.j())
            {
                a = a | 2;
                c = a.d.b(d1);
                q();
            }
            d(a.d.c(d1));
            q();
            return this;
        }

        public final a a(a.f f1)
        {
            if (f1 == null)
            {
                throw new NullPointerException();
            } else
            {
                a = a | 1;
                b = f1.a();
                q();
                return this;
            }
        }

        public final a a(String s1)
        {
            if (s1 == null)
            {
                throw new NullPointerException();
            } else
            {
                a = a | 2;
                c = s1;
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
            return com.kik.d.b.a.d().a(com/kik/d/b/a$d, com/kik/d/b/a$d$a);
        }

        public final com.c.b.ak.a e()
        {
            return com.kik.d.b.a.c();
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

        public final a.d r()
        {
            a.d d1 = s();
            if (!d1.a())
            {
                throw b(d1);
            } else
            {
                return d1;
            }
        }

        public final a.d s()
        {
            int i1 = 1;
            a.d d1 = new a.d(this, (byte)0);
            int k1 = a;
            int j1;
            if ((k1 & 1) != 1)
            {
                i1 = 0;
            }
            a.d.a(d1, b);
            j1 = i1;
            if ((k1 & 2) == 2)
            {
                j1 = i1 | 2;
            }
            a.d.a(d1, c);
            a.d.b(d1, j1);
            l();
            return d1;
        }

        public final bd w()
        {
            return a.d.m();
        }

        private a()
        {
            b = 300;
            c = "";
            a.d.n();
        }

        a(byte byte0)
        {
            this();
        }

        private a(com.c.b.as.b b1)
        {
            super(b1);
            b = 300;
            c = "";
            a.d.n();
        }

        a(com.c.b.as.b b1, byte byte0)
        {
            this(b1);
        }
    }


    public static final bk c = new e();
    private static final nit> k = new <init>();
    private int f;
    private int g;
    private volatile Object h;
    private byte i;
    private int j;

    static int a( , int i1)
    {
        .g = i1;
        return i1;
    }

    public static a a(g g1)
    {
        return k.l().a(g1);
    }

    static Object a( , Object obj)
    {
        .h = obj;
        return obj;
    }

    static int b(h h1, int i1)
    {
        h1.f = i1;
        return i1;
    }

    static Object b(f f1)
    {
        return f1.h;
    }

    static by c(h h1)
    {
        return h1.e;
    }

    public static a k()
    {
        return k.l();
    }

    public static l m()
    {
        return k;
    }

    static boolean n()
    {
        return d;
    }

    private f o()
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

    protected final com.c.b. a(com.c.b. )
    {
        return new a(, (byte)0);
    }

    public final void a(h h1)
    {
        if ((f & 1) == 1)
        {
            h1.c(1, g);
        }
        if ((f & 2) == 2)
        {
            h1.a(2, o());
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
        if (!j())
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
            i1 = com.c.b.h.f(1, g) + 0;
        }
        int j1 = i1;
        if ((f & 2) == 2)
        {
            j1 = i1 + com.c.b.h.c(2, o());
        }
        i1 = j1 + e.b();
        j = i1;
        return i1;
    }

    protected final com.c.b. c_()
    {
        return com.kik.d.b.a.d().a(com/kik/d/b/a$d, com/kik/d/b/a$d$a);
    }

    public final by f()
    {
        return e;
    }

    public final boolean h()
    {
        return (f & 1) == 1;
    }

    public final f i()
    {
        f f2 = a(g);
        f f1 = f2;
        if (f2 == null)
        {
            f1 = a;
        }
        return f1;
    }

    public final boolean j()
    {
        return (f & 2) == 2;
    }

    public final a l()
    {
        if (this == k)
        {
            return new a((byte)0);
        } else
        {
            return (new a((byte)0)).a(this);
        }
    }

    public final bk t()
    {
        return c;
    }

    public final com.c.b. u()
    {
        return k.l();
    }

    public final com.c.b. v()
    {
        return l();
    }

    public final volatile bd w()
    {
        return k;
    }


    private a()
    {
        i = -1;
        j = -1;
        g = 300;
        h = "";
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
_L9:
        if (flag) goto _L2; else goto _L1
_L1:
        int i1 = g1.a();
        i1;
        JVM INSTR lookupswitch 3: default 213
    //                   0: 216
    //                   8: 78
    //                   18: 175;
           goto _L3 _L4 _L5 _L6
_L3:
        if (!a(g1, , aq, i1))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        i1 = g1.n();
        if (a(i1) == null)
        {
            .a(1, i1);
            continue; /* Loop/switch isn't completed */
        }
          goto _L7
        g1;
        throw new RuntimeException(g1.a(this));
        g1;
        e = .b();
        L();
        throw g1;
_L7:
        f = f | 1;
        g = i1;
        continue; /* Loop/switch isn't completed */
        g1;
        throw new RuntimeException((new av(g1.getMessage())).a(this));
_L6:
        f f1 = g1.l();
        f = f | 2;
        h = f1;
        continue; /* Loop/switch isn't completed */
_L2:
        e = .b();
        L();
        return;
_L4:
        flag = true;
        if (true) goto _L9; else goto _L8
_L8:
    }

    L(g g1, aq aq, byte byte0)
    {
        this(g1, aq);
    }
}
