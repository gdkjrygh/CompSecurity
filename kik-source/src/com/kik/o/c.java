// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.o;

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

// Referenced classes of package com.kik.o:
//            e, d, a

public final class c extends as
    implements e
{
    public static final class a extends com.c.b.as.a
        implements e
    {

        private Object a;

        private a d(bd bd)
        {
            if (bd instanceof c)
            {
                return a((c)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private a d(g g1, aq aq)
        {
            g1 = (c)c.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (c)aq.a();
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

        public final volatile com.c.b.a.a a(by by1)
        {
            return this;
        }

        public final com.c.b.a.a a(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final a a(c c1)
        {
            if (c1 == c.k())
            {
                return this;
            }
            if (!c1.h().isEmpty())
            {
                a = c.b(c1);
                q();
            }
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
                a = s1;
                q();
                return this;
            }
        }

        public final boolean a()
        {
            return true;
        }

        public final com.c.b.b.a b(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final volatile com.c.b.bd.a b(by by1)
        {
            return this;
        }

        public final volatile com.c.b.as.a c(by by1)
        {
            return this;
        }

        public final com.c.b.bd.a c(bd bd)
        {
            return d(bd);
        }

        public final com.c.b.be.a c(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final volatile com.c.b.as.a d(by by1)
        {
            return this;
        }

        protected final com.c.b.as.g d()
        {
            return com.kik.o.a.d.a(com/kik/o/c, com/kik/o/c$a);
        }

        public final com.c.b.ak.a e()
        {
            return com.kik.o.a.c;
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

        public final c r()
        {
            c c1 = s();
            if (!c1.a())
            {
                throw b(c1);
            } else
            {
                return c1;
            }
        }

        public final c s()
        {
            c c1 = new c(this, (byte)0);
            c.a(c1, a);
            l();
            return c1;
        }

        public final bd w()
        {
            return c.k();
        }

        private a()
        {
            a = "";
            c.l();
        }

        a(byte byte0)
        {
            this();
        }

        private a(com.c.b.as.b b1)
        {
            super(b1);
            a = "";
            c.l();
        }

        a(com.c.b.as.b b1, byte byte0)
        {
            this(b1);
        }
    }


    public static final bk c = new d();
    private static final c i = new c();
    private volatile Object f;
    private byte g;
    private int h;

    private c()
    {
        g = -1;
        h = -1;
        f = "";
    }

    private c(com.c.b.as.a a1)
    {
        super(a1);
        g = -1;
        h = -1;
    }

    c(com.c.b.as.a a1, byte byte0)
    {
        this(a1);
    }

    private c(g g1)
    {
        boolean flag;
        this();
        flag = false;
_L7:
        if (flag) goto _L2; else goto _L1
_L1:
        int i1 = g1.a();
        i1;
        JVM INSTR lookupswitch 2: default 118
    //                   0: 121
    //                   10: 57;
           goto _L3 _L4 _L5
_L3:
        if (!g1.b(i1))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        f = g1.l();
        continue; /* Loop/switch isn't completed */
        g1;
        throw new RuntimeException(g1.a(this));
        g1;
        L();
        throw g1;
_L2:
        L();
        return;
        g1;
        throw new RuntimeException((new av(g1.getMessage())).a(this));
_L4:
        flag = true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    c(g g1, byte byte0)
    {
        this(g1);
    }

    public static a a(c c1)
    {
        return i.j().a(c1);
    }

    static Object a(c c1, Object obj)
    {
        c1.f = obj;
        return obj;
    }

    static Object b(c c1)
    {
        return c1.f;
    }

    public static a i()
    {
        return i.j();
    }

    public static c k()
    {
        return i;
    }

    static boolean l()
    {
        return d;
    }

    private f m()
    {
        Object obj = f;
        if (obj instanceof String)
        {
            obj = com.c.b.f.a((String)obj);
            f = obj;
            return ((f) (obj));
        } else
        {
            return (f)obj;
        }
    }

    protected final com.c.b.bd.a a(com.c.b.as.b b1)
    {
        return new a(b1, (byte)0);
    }

    public final void a(h h1)
    {
        if (!m().d())
        {
            h1.a(1, m());
        }
    }

    public final boolean a()
    {
        byte byte0 = g;
        if (byte0 == 1)
        {
            return true;
        }
        if (byte0 == 0)
        {
            return false;
        } else
        {
            g = 1;
            return true;
        }
    }

    public final int b()
    {
        int i1 = h;
        if (i1 != -1)
        {
            return i1;
        }
        i1 = 0;
        if (!m().d())
        {
            i1 = com.c.b.h.c(1, m()) + 0;
        }
        h = i1;
        return i1;
    }

    protected final com.c.b.as.g c_()
    {
        return com.kik.o.a.d.a(com/kik/o/c, com/kik/o/c$a);
    }

    public final by f()
    {
        return by.e();
    }

    public final String h()
    {
        Object obj = f;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        obj = (f)obj;
        String s = ((f) (obj)).f();
        if (((f) (obj)).g())
        {
            f = s;
        }
        return s;
    }

    public final a j()
    {
        if (this == i)
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

    public final com.c.b.bd.a u()
    {
        return i.j();
    }

    public final com.c.b.be.a v()
    {
        return j();
    }

    public final volatile bd w()
    {
        return i;
    }

}
