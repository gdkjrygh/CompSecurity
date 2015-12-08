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
import com.c.b.bn;
import com.c.b.by;
import com.c.b.f;
import com.c.b.g;
import com.c.b.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.kik.d.b:
//            a, g

public static final class <init> extends as
    implements <init>
{
    public static final class a extends com.c.b.as.a
        implements a.h
    {

        private int a;
        private Object b;
        private Object c;
        private Object d;
        private List e;
        private bn f;
        private Object g;

        private a d(bd bd)
        {
            if (bd instanceof a.g)
            {
                return a((a.g)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private a d(g g1, aq aq)
        {
            g1 = (a.g)a.g.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (a.g)aq.a();
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
            if (a.g.n())
            {
                v();
            }
        }

        private a.g t()
        {
            int j1 = 1;
            a.g g1 = new a.g(this, (byte)0);
            int k1 = a;
            int i1;
            if ((k1 & 1) != 1)
            {
                j1 = 0;
            }
            a.g.a(g1, b);
            i1 = j1;
            if ((k1 & 2) == 2)
            {
                i1 = j1 | 2;
            }
            a.g.b(g1, c);
            j1 = i1;
            if ((k1 & 4) == 4)
            {
                j1 = i1 | 4;
            }
            a.g.c(g1, d);
            if (f == null)
            {
                if ((a & 8) == 8)
                {
                    e = Collections.unmodifiableList(e);
                    a = a & -9;
                }
                a.g.a(g1, e);
            } else
            {
                a.g.a(g1, f.e());
            }
            i1 = j1;
            if ((k1 & 0x10) == 16)
            {
                i1 = j1 | 8;
            }
            a.g.d(g1, g);
            a.g.a(g1, i1);
            l();
            return g1;
        }

        private void u()
        {
            if ((a & 8) != 8)
            {
                e = new ArrayList(e);
                a = a | 8;
            }
        }

        private bn v()
        {
            if (f == null)
            {
                List list = e;
                boolean flag;
                if ((a & 8) == 8)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                f = new bn(list, flag, p(), n());
                e = null;
            }
            return f;
        }

        public final com.c.b.a.a a(bd bd)
        {
            return d(bd);
        }

        public final com.c.b.a.a a(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final a a(a.g g1)
        {
            bn bn1;
            bn1 = null;
            if (g1 == a.g.m())
            {
                return this;
            }
            if (g1.h())
            {
                a = a | 1;
                b = a.g.a(g1);
                q();
            }
            if (g1.i())
            {
                a = a | 2;
                c = a.g.b(g1);
                q();
            }
            if (g1.j())
            {
                a = a | 4;
                d = a.g.c(g1);
                q();
            }
            if (f != null) goto _L2; else goto _L1
_L1:
            if (!a.g.d(g1).isEmpty())
            {
                if (e.isEmpty())
                {
                    e = a.g.d(g1);
                    a = a & -9;
                } else
                {
                    u();
                    e.addAll(a.g.d(g1));
                }
                q();
            }
_L4:
            if (g1.k())
            {
                a = a | 0x10;
                g = a.g.e(g1);
                q();
            }
            d(com.kik.d.b.a.g.f(g1));
            q();
            return this;
_L2:
            if (!a.g.d(g1).isEmpty())
            {
                if (f.d())
                {
                    f.b();
                    f = null;
                    e = a.g.d(g1);
                    a = a & -9;
                    if (a.g.o())
                    {
                        bn1 = v();
                    }
                    f = bn1;
                } else
                {
                    f.a(a.g.d(g1));
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final a a(Iterable iterable)
        {
            if (f == null)
            {
                u();
                com.c.b.b.a.a(iterable, e);
                q();
                return this;
            } else
            {
                f.a(iterable);
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
            if (flag) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            int i1;
            if ((a & 2) == 2)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 == 0) goto _L1; else goto _L3
_L3:
            i1 = 0;
_L5:
            a.a a1;
            int j1;
            if (f == null)
            {
                j1 = e.size();
            } else
            {
                j1 = f.c();
            }
            if (i1 >= j1)
            {
                break MISSING_BLOCK_LABEL_129;
            }
            if (f == null)
            {
                a1 = (a.a)e.get(i1);
            } else
            {
                a1 = (a.a)f.a(i1);
            }
            if (!a1.a()) goto _L1; else goto _L4
_L4:
            i1++;
              goto _L5
            return true;
        }

        public final com.c.b.b.a b(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final a b(String s1)
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

        public final com.c.b.bd.a c(bd bd)
        {
            return d(bd);
        }

        public final com.c.b.be.a c(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final a c(String s1)
        {
            if (s1 == null)
            {
                throw new NullPointerException();
            } else
            {
                a = a | 4;
                d = s1;
                q();
                return this;
            }
        }

        protected final com.c.b.as.g d()
        {
            return com.kik.d.b.a.h().a(com/kik/d/b/a$g, com/kik/d/b/a$g$a);
        }

        public final a d(String s1)
        {
            if (s1 == null)
            {
                throw new NullPointerException();
            } else
            {
                a = a | 0x10;
                g = s1;
                q();
                return this;
            }
        }

        public final com.c.b.ak.a e()
        {
            return com.kik.d.b.a.g();
        }

        public final bd h()
        {
            return t();
        }

        public final bd i()
        {
            return r();
        }

        public final be j()
        {
            return r();
        }

        public final a.g r()
        {
            a.g g1 = t();
            if (!g1.a())
            {
                throw b(g1);
            } else
            {
                return g1;
            }
        }

        public final bd w()
        {
            return a.g.m();
        }

        private a()
        {
            b = "";
            c = "";
            d = "";
            e = Collections.emptyList();
            g = "";
            s();
        }

        a(byte byte0)
        {
            this();
        }

        private a(com.c.b.as.b b1)
        {
            super(b1);
            b = "";
            c = "";
            d = "";
            e = Collections.emptyList();
            g = "";
            s();
        }

        a(com.c.b.as.b b1, byte byte0)
        {
            this(b1);
        }
    }


    public static final bk c = new com.kik.d.b.g();
    private static final nit> n = new <init>();
    private int f;
    private volatile Object g;
    private volatile Object h;
    private volatile Object i;
    private List j;
    private volatile Object k;
    private byte l;
    private int m;

    static int a( , int i1)
    {
        .f = i1;
        return i1;
    }

    static Object a(f f1)
    {
        return f1.g;
    }

    static Object a( , Object obj)
    {
        .g = obj;
        return obj;
    }

    static List a(g g1, List list)
    {
        g1.j = list;
        return list;
    }

    static Object b(j j1)
    {
        return j1.h;
    }

    static Object b( , Object obj)
    {
        .h = obj;
        return obj;
    }

    static Object c(h h1)
    {
        return h1.i;
    }

    static Object c( , Object obj)
    {
        .i = obj;
        return obj;
    }

    static Object d( , Object obj)
    {
        .k = obj;
        return obj;
    }

    static List d(k k1)
    {
        return k1.j;
    }

    static Object e(j j1)
    {
        return j1.k;
    }

    static by f(k k1)
    {
        return k1.e;
    }

    public static a l()
    {
        return n.x();
    }

    public static x m()
    {
        return n;
    }

    static boolean n()
    {
        return d;
    }

    static boolean o()
    {
        return d;
    }

    private f p()
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

    private f q()
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

    private f r()
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

    private f s()
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

    private a x()
    {
        if (this == n)
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
            h1.a(1, p());
        }
        if ((f & 2) == 2)
        {
            h1.a(2, q());
        }
        for (int i1 = 0; i1 < j.size(); i1++)
        {
            h1.b(4, (be)j.get(i1));
        }

        if ((f & 4) == 4)
        {
            h1.a(5, r());
        }
        if ((f & 8) == 8)
        {
            h1.a(6, s());
        }
        e.a(h1);
    }

    public final boolean a()
    {
        boolean flag = false;
        byte byte0 = l;
        if (byte0 == 1)
        {
            flag = true;
        } else
        if (byte0 != 0)
        {
            if (!h())
            {
                l = 0;
                return false;
            }
            if (!i())
            {
                l = 0;
                return false;
            }
            for (int i1 = 0; i1 < j.size(); i1++)
            {
                if (!((ize)j.get(i1)).a())
                {
                    l = 0;
                    return false;
                }
            }

            l = 1;
            return true;
        }
        return flag;
    }

    public final int b()
    {
        boolean flag = false;
        int i1 = m;
        if (i1 != -1)
        {
            return i1;
        }
        int j1;
        if ((f & 1) == 1)
        {
            i1 = com.c.b.h.c(1, p()) + 0;
        } else
        {
            i1 = 0;
        }
        j1 = i1;
        if ((f & 2) == 2)
        {
            j1 = i1 + com.c.b.h.c(2, q());
        }
        i1 = j1;
        for (j1 = ((flag) ? 1 : 0); j1 < j.size();)
        {
            int k1 = com.c.b.h.d(4, (be)j.get(j1));
            j1++;
            i1 = k1 + i1;
        }

        j1 = i1;
        if ((f & 4) == 4)
        {
            j1 = i1 + com.c.b.h.c(5, r());
        }
        i1 = j1;
        if ((f & 8) == 8)
        {
            i1 = j1 + com.c.b.h.c(6, s());
        }
        i1 = e.b() + i1;
        m = i1;
        return i1;
    }

    protected final com.c.b. c_()
    {
        return com.kik.d.b.a.h().a(com/kik/d/b/a$g, com/kik/d/b/a$g$a);
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
        return (f & 8) == 8;
    }

    public final bk t()
    {
        return c;
    }

    public final com.c.b. u()
    {
        return n.x();
    }

    public final com.c.b. v()
    {
        return x();
    }

    public final volatile bd w()
    {
        return n;
    }


    private a()
    {
        l = -1;
        m = -1;
        g = "";
        h = "";
        i = "";
        j = Collections.emptyList();
        k = "";
    }

    private k(com.c.b. )
    {
        super();
        l = -1;
        m = -1;
    }

    m(com.c.b. , byte byte0)
    {
        this();
    }

    private ble(g g1, aq aq)
    {
        com.c.b. ;
        int i1;
        boolean flag;
        flag = false;
        this();
         = by.c();
        i1 = 0;
_L13:
        if (flag) goto _L2; else goto _L1
_L1:
        int k1;
        int l1;
        int i2;
        l1 = i1;
        k1 = i1;
        i2 = i1;
        int j1 = g1.a();
        j1;
        JVM INSTR lookupswitch 6: default 568
    //                   0: 571
    //                   10: 126
    //                   18: 241
    //                   34: 330
    //                   42: 411
    //                   50: 472;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        l1 = i1;
        k1 = i1;
        i2 = i1;
        if (!a(g1, , aq, j1))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        l1 = i1;
        k1 = i1;
        i2 = i1;
        f f1 = g1.l();
        l1 = i1;
        k1 = i1;
        i2 = i1;
        f = f | 1;
        l1 = i1;
        k1 = i1;
        i2 = i1;
        g = f1;
        continue; /* Loop/switch isn't completed */
        g1;
        k1 = l1;
        throw new RuntimeException(g1.a(this));
        g1;
        if ((k1 & 8) == 8)
        {
            j = Collections.unmodifiableList(j);
        }
        e = .b();
        L();
        throw g1;
_L6:
        l1 = i1;
        k1 = i1;
        i2 = i1;
        f1 = g1.l();
        l1 = i1;
        k1 = i1;
        i2 = i1;
        f = f | 2;
        l1 = i1;
        k1 = i1;
        i2 = i1;
        h = f1;
        continue; /* Loop/switch isn't completed */
        g1;
        k1 = i2;
        throw new RuntimeException((new av(g1.getMessage())).a(this));
_L7:
        j1 = i1;
        if ((i1 & 8) == 8) goto _L11; else goto _L10
_L10:
        l1 = i1;
        k1 = i1;
        i2 = i1;
        j = new ArrayList();
        j1 = i1 | 8;
_L11:
        l1 = j1;
        k1 = j1;
        i2 = j1;
        j.add(g1.a(c, aq));
        i1 = j1;
        continue; /* Loop/switch isn't completed */
_L8:
        l1 = i1;
        k1 = i1;
        i2 = i1;
        f1 = g1.l();
        l1 = i1;
        k1 = i1;
        i2 = i1;
        f = f | 4;
        l1 = i1;
        k1 = i1;
        i2 = i1;
        i = f1;
        continue; /* Loop/switch isn't completed */
_L9:
        l1 = i1;
        k1 = i1;
        i2 = i1;
        f1 = g1.l();
        l1 = i1;
        k1 = i1;
        i2 = i1;
        f = f | 8;
        l1 = i1;
        k1 = i1;
        i2 = i1;
        k = f1;
        continue; /* Loop/switch isn't completed */
_L2:
        if ((i1 & 8) == 8)
        {
            j = Collections.unmodifiableList(j);
        }
        e = .b();
        L();
        return;
_L4:
        flag = true;
        if (true) goto _L13; else goto _L12
_L12:
    }

    L(g g1, aq aq, byte byte0)
    {
        this(g1, aq);
    }
}
