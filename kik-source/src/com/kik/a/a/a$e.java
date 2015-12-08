// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.a.a;

import com.c.b.aq;
import com.c.b.as;
import com.c.b.av;
import com.c.b.bd;
import com.c.b.be;
import com.c.b.bk;
import com.c.b.bn;
import com.c.b.by;
import com.c.b.g;
import com.c.b.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.kik.a.a:
//            a, e

public static final class <init> extends as
    implements <init>
{
    public static final class a extends com.c.b.as.a
        implements a.f
    {

        private int a;
        private List b;
        private bn c;
        private boolean d;

        private a d(bd bd)
        {
            if (bd instanceof a.e)
            {
                return a((a.e)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private a d(g g1, aq aq)
        {
            g1 = (a.e)a.e.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (a.e)aq.a();
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
            if (a.e.k())
            {
                u();
            }
        }

        private a.e s()
        {
            a.e e1 = t();
            if (!e1.a())
            {
                throw b(e1);
            } else
            {
                return e1;
            }
        }

        private a.e t()
        {
            a.e e1 = new a.e(this, (byte)0);
            if (c == null)
            {
                if ((a & 1) == 1)
                {
                    b = Collections.unmodifiableList(b);
                    a = a & -2;
                }
                a.e.a(e1, b);
            } else
            {
                a.e.a(e1, c.e());
            }
            a.e.a(e1, d);
            a.e.a(e1);
            l();
            return e1;
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

        public final a a(a.e e1)
        {
            bn bn1;
            bn1 = null;
            if (e1 == a.e.j())
            {
                return this;
            }
            if (c != null) goto _L2; else goto _L1
_L1:
            if (!a.e.b(e1).isEmpty())
            {
                if (b.isEmpty())
                {
                    b = a.e.b(e1);
                    a = a & -2;
                } else
                {
                    if ((a & 1) != 1)
                    {
                        b = new ArrayList(b);
                        a = a | 1;
                    }
                    b.addAll(a.e.b(e1));
                }
                q();
            }
_L4:
            if (e1.i())
            {
                d = e1.i();
                q();
            }
            q();
            return this;
_L2:
            if (!a.e.b(e1).isEmpty())
            {
                if (c.d())
                {
                    c.b();
                    c = null;
                    b = a.e.b(e1);
                    a = a & -2;
                    if (a.e.l())
                    {
                        bn1 = u();
                    }
                    c = bn1;
                } else
                {
                    c.a(a.e.b(e1));
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
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
            return com.kik.a.a.a.f().a(com/kik/a/a/a$e, com/kik/a/a/a$e$a);
        }

        public final com.c.b.ak.a e()
        {
            return com.kik.a.a.a.e();
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
            return a.e.j();
        }

        private a()
        {
            b = Collections.emptyList();
            r();
        }

        a(byte byte0)
        {
            this();
        }

        private a(com.c.b.as.b b1)
        {
            super(b1);
            b = Collections.emptyList();
            r();
        }

        a(com.c.b.as.b b1, byte byte0)
        {
            this(b1);
        }
    }


    public static final bk c = new e();
    private static final nit> k = new <init>();
    private int f;
    private List g;
    private boolean h;
    private byte i;
    private int j;

    static int a(j j1)
    {
        j1.f = 0;
        return 0;
    }

    static List a(f f1, List list)
    {
        f1.g = list;
        return list;
    }

    static boolean a(g g1, boolean flag)
    {
        g1.h = flag;
        return flag;
    }

    static List b(h h1)
    {
        return h1.g;
    }

    public static g j()
    {
        return k;
    }

    static boolean k()
    {
        return d;
    }

    static boolean l()
    {
        return d;
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

    protected final com.c.b. a(com.c.b. )
    {
        return new a(, (byte)0);
    }

    public final void a(h h1)
    {
        for (int i1 = 0; i1 < g.size(); i1++)
        {
            h1.b(1, (be)g.get(i1));
        }

        if (h)
        {
            h1.a(2, h);
        }
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
        int j1 = 0;
        i1 = 0;
        for (; j1 < g.size(); j1++)
        {
            i1 += com.c.b.h.d(1, (be)g.get(j1));
        }

        j1 = i1;
        if (h)
        {
            j1 = i1 + com.c.b.h.g(2);
        }
        j = j1;
        return j1;
    }

    protected final com.c.b. c_()
    {
        return com.kik.a.a.a.f().a(com/kik/a/a/a$e, com/kik/a/a/a$e$a);
    }

    public final by f()
    {
        return by.e();
    }

    public final List h()
    {
        return g;
    }

    public final boolean i()
    {
        return h;
    }

    public final bk t()
    {
        return c;
    }

    public final com.c.b. u()
    {
        return k.m();
    }

    public final com.c.b. v()
    {
        return m();
    }

    public final volatile bd w()
    {
        return k;
    }


    private a()
    {
        i = -1;
        j = -1;
        g = Collections.emptyList();
        h = false;
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
        boolean flag;
        boolean flag2;
        flag2 = false;
        this();
        flag = false;
_L10:
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
        JVM INSTR lookupswitch 3: default 274
    //                   0: 277
    //                   10: 88
    //                   16: 203;
           goto _L3 _L4 _L5 _L6
_L3:
        flag3 = flag;
        flag1 = flag;
        flag4 = flag;
        if (!g1.b(i1))
        {
            flag2 = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        i1 = ((flag) ? 1 : 0);
        if ((flag & true)) goto _L8; else goto _L7
_L7:
        flag3 = flag;
        flag1 = flag;
        flag4 = flag;
        g = new ArrayList();
        i1 = flag | true;
_L8:
        flag3 = i1;
        flag1 = i1;
        flag4 = i1;
        g.add(g1.a(c, aq));
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
        L();
        throw g1;
_L6:
        flag3 = flag;
        flag1 = flag;
        flag4 = flag;
        h = g1.i();
        continue; /* Loop/switch isn't completed */
        g1;
        flag1 = flag4;
        throw new RuntimeException((new av(g1.getMessage())).a(this));
_L2:
        if ((flag & true))
        {
            g = Collections.unmodifiableList(g);
        }
        L();
        return;
_L4:
        flag2 = true;
        if (true) goto _L10; else goto _L9
_L9:
    }

    L(g g1, aq aq, byte byte0)
    {
        this(g1, aq);
    }
}
