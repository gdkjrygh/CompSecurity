// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.a.a;

import com.c.b.ap;
import com.c.b.aq;
import com.c.b.as;
import com.c.b.av;
import com.c.b.bd;
import com.c.b.be;
import com.c.b.bg;
import com.c.b.bk;
import com.c.b.bn;
import com.c.b.bp;
import com.c.b.by;
import com.c.b.g;
import com.c.b.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.kik.a.a:
//            b, c, d, e

public final class com.kik.a.a.a
{
    public static final class a extends as
        implements b
    {

        public static final bk c = new com.kik.a.a.c();
        private static final a k = new a();
        private volatile Object f;
        private volatile Object g;
        private volatile Object h;
        private byte i;
        private int j;

        static Object a(a a1)
        {
            return a1.f;
        }

        static Object a(a a1, Object obj)
        {
            a1.f = obj;
            return obj;
        }

        static Object b(a a1)
        {
            return a1.g;
        }

        static Object b(a a1, Object obj)
        {
            a1.g = obj;
            return obj;
        }

        static Object c(a a1)
        {
            return a1.h;
        }

        static Object c(a a1, Object obj)
        {
            a1.h = obj;
            return obj;
        }

        public static a k()
        {
            return k;
        }

        static boolean l()
        {
            return d;
        }

        private com.c.b.f m()
        {
            Object obj = f;
            if (obj instanceof String)
            {
                obj = com.c.b.f.a((String)obj);
                f = obj;
                return ((com.c.b.f) (obj));
            } else
            {
                return (com.c.b.f)obj;
            }
        }

        private com.c.b.f n()
        {
            Object obj = g;
            if (obj instanceof String)
            {
                obj = com.c.b.f.a((String)obj);
                g = obj;
                return ((com.c.b.f) (obj));
            } else
            {
                return (com.c.b.f)obj;
            }
        }

        private com.c.b.f o()
        {
            Object obj = h;
            if (obj instanceof String)
            {
                obj = com.c.b.f.a((String)obj);
                h = obj;
                return ((com.c.b.f) (obj));
            } else
            {
                return (com.c.b.f)obj;
            }
        }

        private a p()
        {
            if (this == k)
            {
                return new a((byte)0);
            } else
            {
                return (new a((byte)0)).a(this);
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
            if (!n().d())
            {
                h1.a(2, n());
            }
            if (!o().d())
            {
                h1.a(3, o());
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
            if (!m().d())
            {
                j1 = com.c.b.h.c(1, m()) + 0;
            }
            i1 = j1;
            if (!n().d())
            {
                i1 = j1 + com.c.b.h.c(2, n());
            }
            j1 = i1;
            if (!o().d())
            {
                j1 = i1 + com.c.b.h.c(3, o());
            }
            j = j1;
            return j1;
        }

        protected final com.c.b.as.g c_()
        {
            return com.kik.a.a.a.b().a(com/kik/a/a/a$a, com/kik/a/a/a$a$a);
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
            obj = (com.c.b.f)obj;
            String s = ((com.c.b.f) (obj)).f();
            if (((com.c.b.f) (obj)).g())
            {
                f = s;
            }
            return s;
        }

        public final String i()
        {
            Object obj = g;
            if (obj instanceof String)
            {
                return (String)obj;
            }
            obj = (com.c.b.f)obj;
            String s = ((com.c.b.f) (obj)).f();
            if (((com.c.b.f) (obj)).g())
            {
                g = s;
            }
            return s;
        }

        public final String j()
        {
            Object obj = h;
            if (obj instanceof String)
            {
                return (String)obj;
            }
            obj = (com.c.b.f)obj;
            String s = ((com.c.b.f) (obj)).f();
            if (((com.c.b.f) (obj)).g())
            {
                h = s;
            }
            return s;
        }

        public final bk t()
        {
            return c;
        }

        public final com.c.b.bd.a u()
        {
            return k.p();
        }

        public final com.c.b.be.a v()
        {
            return p();
        }

        public final volatile bd w()
        {
            return k;
        }


        private a()
        {
            i = -1;
            j = -1;
            f = "";
            g = "";
            h = "";
        }

        private a(com.c.b.as.a a1)
        {
            super(a1);
            i = -1;
            j = -1;
        }

        a(com.c.b.as.a a1, byte byte0)
        {
            this(a1);
        }

        private a(g g1)
        {
            boolean flag;
            this();
            flag = false;
_L9:
            if (flag) goto _L2; else goto _L1
_L1:
            int i1 = g1.a();
            i1;
            JVM INSTR lookupswitch 4: default 156
        //                       0: 159
        //                       10: 73
        //                       18: 105
        //                       26: 140;
               goto _L3 _L4 _L5 _L6 _L7
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
_L6:
            g = g1.l();
            continue; /* Loop/switch isn't completed */
            g1;
            throw new RuntimeException((new av(g1.getMessage())).a(this));
_L7:
            h = g1.l();
            continue; /* Loop/switch isn't completed */
_L2:
            L();
            return;
_L4:
            flag = true;
            if (true) goto _L9; else goto _L8
_L8:
        }

        a(g g1, byte byte0)
        {
            this(g1);
        }
    }

    public static final class a.a extends com.c.b.as.a
        implements b
    {

        private Object a;
        private Object b;
        private Object c;

        private a.a d(bd bd)
        {
            if (bd instanceof a)
            {
                return a((a)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private a.a d(g g1, aq aq)
        {
            g1 = (a)a.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (a)aq.a();
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

        private a r()
        {
            a a1 = s();
            if (!a1.a())
            {
                throw b(a1);
            } else
            {
                return a1;
            }
        }

        private a s()
        {
            a a1 = new a(this, (byte)0);
            a.a(a1, a);
            a.b(a1, b);
            a.c(a1, c);
            l();
            return a1;
        }

        public final com.c.b.a a(bd bd)
        {
            return d(bd);
        }

        public final volatile com.c.b.a a(by by)
        {
            return this;
        }

        public final com.c.b.a a(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final a.a a(a a1)
        {
            if (a1 == a.k())
            {
                return this;
            }
            if (!a1.h().isEmpty())
            {
                a = a.a(a1);
                q();
            }
            if (!a1.i().isEmpty())
            {
                b = a.b(a1);
                q();
            }
            if (!a1.j().isEmpty())
            {
                c = a.c(a1);
                q();
            }
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

        public final volatile com.c.b.bd.a b(by by)
        {
            return this;
        }

        public final volatile com.c.b.as.a c(by by)
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

        public final volatile com.c.b.as.a d(by by)
        {
            return this;
        }

        protected final com.c.b.as.g d()
        {
            return com.kik.a.a.a.b().a(com/kik/a/a/a$a, com/kik/a/a/a$a$a);
        }

        public final com.c.b.ak.a e()
        {
            return com.kik.a.a.a.a();
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
            return a.k();
        }

        private a.a()
        {
            a = "";
            b = "";
            c = "";
            a.l();
        }

        a.a(byte byte0)
        {
            this();
        }

        private a.a(com.c.b.as.b b1)
        {
            super(b1);
            a = "";
            b = "";
            c = "";
            a.l();
        }

        a.a(com.c.b.as.b b1, byte byte0)
        {
            this(b1);
        }
    }

    public static interface b
        extends bg
    {
    }

    public static final class c extends as
        implements d
    {

        public static final bk c = new com.kik.a.a.d();
        private static final c i = new c();
        private com.kik.o.c f;
        private byte g;
        private int h;

        static com.kik.o.c a(c c1, com.kik.o.c c2)
        {
            c1.f = c2;
            return c2;
        }

        public static a j()
        {
            return i.m();
        }

        public static c k()
        {
            return i;
        }

        static boolean l()
        {
            return d;
        }

        private a m()
        {
            if (this == i)
            {
                return new a((byte)0);
            } else
            {
                return (new a((byte)0)).a(this);
            }
        }

        protected final com.c.b.bd.a a(com.c.b.as.b b1)
        {
            return new a(b1, (byte)0);
        }

        public final void a(h h1)
        {
            if (f != null)
            {
                h1.b(1, i());
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
            if (f != null)
            {
                i1 = com.c.b.h.d(1, i()) + 0;
            }
            h = i1;
            return i1;
        }

        protected final com.c.b.as.g c_()
        {
            return com.kik.a.a.a.d().a(com/kik/a/a/a$c, com/kik/a/a/a$c$a);
        }

        public final by f()
        {
            return by.e();
        }

        public final boolean h()
        {
            return f != null;
        }

        public final com.kik.o.c i()
        {
            if (f == null)
            {
                return com.kik.o.c.k();
            } else
            {
                return f;
            }
        }

        public final bk t()
        {
            return c;
        }

        public final com.c.b.bd.a u()
        {
            return i.m();
        }

        public final com.c.b.be.a v()
        {
            return m();
        }

        public final volatile bd w()
        {
            return i;
        }


        private c()
        {
            g = -1;
            h = -1;
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

        private c(g g1, aq aq)
        {
            boolean flag;
            this();
            flag = false;
_L10:
            if (flag) goto _L2; else goto _L1
_L1:
            int i1 = g1.a();
            i1;
            JVM INSTR lookupswitch 2: default 172
        //                       0: 175
        //                       10: 63;
               goto _L3 _L4 _L5
_L3:
            if (!g1.b(i1))
            {
                flag = true;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            if (f == null) goto _L7; else goto _L6
_L6:
            com.kik.o.c.a a1 = f.j();
_L8:
            f = (com.kik.o.c)g1.a(com.kik.o.c.c, aq);
            if (a1 == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            a1.a(f);
            f = a1.s();
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
_L7:
            a1 = null;
              goto _L8
_L4:
            flag = true;
            if (true) goto _L10; else goto _L9
_L9:
        }

        c(g g1, aq aq, byte byte0)
        {
            this(g1, aq);
        }
    }

    public static final class c.a extends com.c.b.as.a
        implements d
    {

        private com.kik.o.c a;
        private bp b;

        private c.a d(bd bd)
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

        private c.a d(g g1, aq aq)
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

        private c s()
        {
            c c1 = new c(this, (byte)0);
            if (b == null)
            {
                c.a(c1, a);
            } else
            {
                c.a(c1, (com.kik.o.c)b.c());
            }
            l();
            return c1;
        }

        public final com.c.b.a a(bd bd)
        {
            return d(bd);
        }

        public final volatile com.c.b.a a(by by)
        {
            return this;
        }

        public final com.c.b.a a(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final c.a a(c c1)
        {
            if (c1 == c.k())
            {
                return this;
            }
            if (c1.h())
            {
                c1 = c1.i();
                if (b == null)
                {
                    if (a != null)
                    {
                        a = com.kik.o.c.a(a).a(c1).s();
                    } else
                    {
                        a = c1;
                    }
                    q();
                } else
                {
                    b.b(c1);
                }
            }
            q();
            return this;
        }

        public final c.a a(com.kik.o.c c1)
        {
            if (b == null)
            {
                if (c1 == null)
                {
                    throw new NullPointerException();
                } else
                {
                    a = c1;
                    q();
                    return this;
                }
            } else
            {
                b.a(c1);
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

        public final volatile com.c.b.bd.a b(by by)
        {
            return this;
        }

        public final volatile com.c.b.as.a c(by by)
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

        public final volatile com.c.b.as.a d(by by)
        {
            return this;
        }

        protected final com.c.b.as.g d()
        {
            return com.kik.a.a.a.d().a(com/kik/a/a/a$c, com/kik/a/a/a$c$a);
        }

        public final com.c.b.ak.a e()
        {
            return com.kik.a.a.a.c();
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

        public final bd w()
        {
            return c.k();
        }

        private c.a()
        {
            a = null;
            c.l();
        }

        c.a(byte byte0)
        {
            this();
        }

        private c.a(com.c.b.as.b b1)
        {
            super(b1);
            a = null;
            c.l();
        }

        c.a(com.c.b.as.b b1, byte byte0)
        {
            this(b1);
        }
    }

    public static interface d
        extends bg
    {
    }

    public static final class e extends as
        implements f
    {

        public static final bk c = new com.kik.a.a.e();
        private static final e k = new e();
        private int f;
        private List g;
        private boolean h;
        private byte i;
        private int j;

        static int a(e e1)
        {
            e1.f = 0;
            return 0;
        }

        static List a(e e1, List list)
        {
            e1.g = list;
            return list;
        }

        static boolean a(e e1, boolean flag)
        {
            e1.h = flag;
            return flag;
        }

        static List b(e e1)
        {
            return e1.g;
        }

        public static e j()
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

        protected final com.c.b.bd.a a(com.c.b.as.b b1)
        {
            return new a(b1, (byte)0);
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

        protected final com.c.b.as.g c_()
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

        public final com.c.b.bd.a u()
        {
            return k.m();
        }

        public final com.c.b.be.a v()
        {
            return m();
        }

        public final volatile bd w()
        {
            return k;
        }


        private e()
        {
            i = -1;
            j = -1;
            g = Collections.emptyList();
            h = false;
        }

        private e(com.c.b.as.a a1)
        {
            super(a1);
            i = -1;
            j = -1;
        }

        e(com.c.b.as.a a1, byte byte0)
        {
            this(a1);
        }

        private e(g g1, aq aq)
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
        //                       0: 277
        //                       10: 88
        //                       16: 203;
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
            g.add(g1.a(a.c, aq));
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

        e(g g1, aq aq, byte byte0)
        {
            this(g1, aq);
        }
    }

    public static final class e.a extends com.c.b.as.a
        implements f
    {

        private int a;
        private List b;
        private bn c;
        private boolean d;

        private e.a d(bd bd)
        {
            if (bd instanceof e)
            {
                return a((e)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private e.a d(g g1, aq aq)
        {
            g1 = (e)e.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (e)aq.a();
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
            if (e.k())
            {
                u();
            }
        }

        private e s()
        {
            e e1 = t();
            if (!e1.a())
            {
                throw b(e1);
            } else
            {
                return e1;
            }
        }

        private e t()
        {
            e e1 = new e(this, (byte)0);
            if (c == null)
            {
                if ((a & 1) == 1)
                {
                    b = Collections.unmodifiableList(b);
                    a = a & -2;
                }
                e.a(e1, b);
            } else
            {
                e.a(e1, c.e());
            }
            e.a(e1, d);
            e.a(e1);
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

        public final com.c.b.a a(bd bd)
        {
            return d(bd);
        }

        public final volatile com.c.b.a a(by by)
        {
            return this;
        }

        public final com.c.b.a a(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final e.a a(e e1)
        {
            bn bn1;
            bn1 = null;
            if (e1 == e.j())
            {
                return this;
            }
            if (c != null) goto _L2; else goto _L1
_L1:
            if (!e.b(e1).isEmpty())
            {
                if (b.isEmpty())
                {
                    b = e.b(e1);
                    a = a & -2;
                } else
                {
                    if ((a & 1) != 1)
                    {
                        b = new ArrayList(b);
                        a = a | 1;
                    }
                    b.addAll(e.b(e1));
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
            if (!e.b(e1).isEmpty())
            {
                if (c.d())
                {
                    c.b();
                    c = null;
                    b = e.b(e1);
                    a = a & -2;
                    if (e.l())
                    {
                        bn1 = u();
                    }
                    c = bn1;
                } else
                {
                    c.a(e.b(e1));
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

        public final volatile com.c.b.bd.a b(by by)
        {
            return this;
        }

        public final volatile com.c.b.as.a c(by by)
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

        public final volatile com.c.b.as.a d(by by)
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
            return e.j();
        }

        private e.a()
        {
            b = Collections.emptyList();
            r();
        }

        e.a(byte byte0)
        {
            this();
        }

        private e.a(com.c.b.as.b b1)
        {
            super(b1);
            b = Collections.emptyList();
            r();
        }

        e.a(com.c.b.as.b b1, byte byte0)
        {
            this(b1);
        }
    }

    public static interface f
        extends bg
    {
    }


    private static com.c.b.ak.a a;
    private static com.c.b.as.g b;
    private static com.c.b.ak.a c;
    private static com.c.b.as.g d;
    private static com.c.b.ak.a e;
    private static com.c.b.as.g f;
    private static com.c.b.ak.g g;

    static com.c.b.ak.a a()
    {
        return a;
    }

    static com.c.b.ak.g a(com.c.b.ak.g g1)
    {
        g = g1;
        return g1;
    }

    static com.c.b.as.g b()
    {
        return b;
    }

    static com.c.b.ak.a c()
    {
        return c;
    }

    static com.c.b.as.g d()
    {
        return d;
    }

    static com.c.b.ak.a e()
    {
        return e;
    }

    static com.c.b.as.g f()
    {
        return f;
    }

    static 
    {
        Object obj = new com.kik.a.a.b();
        com.c.b.ak.g g1 = com.kik.o.a.a();
        com.c.b.ak.g g2 = com.kik.k.a.a();
        com.c.b.ak.g.a(new String[] {
            "\n\020ab_service.proto\022\023mobile.abtesting.v1\032\022common_model.proto\032\031protobuf_validation.proto\"i\n\nExperiment\022\031\n\004name\030\001 \001(\tB\013\312\235%\007\b\001(\0010\377\001\022\034\n\007variant\030\002 \001(\tB\013\312\235%\007\b\001(\0010\377\001\022\"\n\rexperiment_id\030\003 \001(\tB\013\312\235%\007\b\000(\0000\377\001\"C\n\025GetExperimentsRequest\022*\n\003jid\030\001 \001(\0132\025.common.XiBareUserJidB\006\312\235%\002\b\001\"\177\n\026GetExperimentsResponse\022B\n\031participating_experiments\030\001 \003(\0132\037.mobile.abtesting.v1.Experiment\022!\n\031should_send_metrics_event\030\002 \001(\b2\205\001\n\tAbTe", "sting\022x\n\033GetParticipatingExperiments\022*.mobile.abtesting.v1.GetExperimentsRequest\032+.mobile.abtesting.v1.GetExperimentsResponse\"\000B\027\n\025com.kik.abtesting.rpcb\006proto3"
        }, new com.c.b.ak.g[] {
            g1, g2
        }, ((com.c.b.ak.g.a) (obj)));
        a = (com.c.b.ak.a)g.g().get(0);
        b = new com.c.b.as.g(a, new String[] {
            "Name", "Variant", "ExperimentId"
        });
        c = (com.c.b.ak.a)g.g().get(1);
        d = new com.c.b.as.g(c, new String[] {
            "Jid"
        });
        e = (com.c.b.ak.a)g.g().get(2);
        f = new com.c.b.as.g(e, new String[] {
            "ParticipatingExperiments", "ShouldSendMetricsEvent"
        });
        obj = ap.a();
        ((ap) (obj)).a(com.kik.k.a.a);
        com.c.b.ak.g.a(g, ((ap) (obj)));
        com.kik.o.a.a();
        com.kik.k.a.a();
    }
}
