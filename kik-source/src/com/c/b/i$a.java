// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.c.b:
//            as, i, k, ay, 
//            av, by, g, az, 
//            f, h, be, bm, 
//            bk, aq, bd, bn, 
//            bp, l, bg, m

public static final class <init> extends as
    implements <init>
{
    public static final class a extends as.a
        implements i.b
    {

        private int a;
        private Object b;
        private List c;
        private bn d;
        private List e;
        private bn f;
        private List g;
        private bn h;
        private List i;
        private bn j;
        private List k;
        private bn l;
        private List m;
        private bn n;
        private i.s o;
        private bp p;
        private List q;
        private bn r;
        private az s;

        private bn A()
        {
            if (n == null)
            {
                List list = m;
                boolean flag;
                if ((a & 0x40) == 64)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                n = new bn(list, flag, p(), n());
                m = null;
            }
            return n;
        }

        private i.s B()
        {
            if (p == null)
            {
                if (o == null)
                {
                    return com.c.b.i.s.q();
                } else
                {
                    return o;
                }
            } else
            {
                return (i.s)p.b();
            }
        }

        private bn C()
        {
            if (r == null)
            {
                List list = q;
                boolean flag;
                if ((a & 0x100) == 256)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                r = new bn(list, flag, p(), n());
                q = null;
            }
            return r;
        }

        private a d(bd bd)
        {
            if (bd instanceof i.a)
            {
                return a((i.a)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private a d(g g1, aq aq)
        {
            g1 = (i.a)i.a.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (i.a)aq.a();
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
                t();
                u();
                v();
                x();
                z();
                A();
                if (p == null)
                {
                    p = new bp(B(), p(), n());
                    o = null;
                }
                C();
            }
        }

        private i.a s()
        {
            int i1 = 1;
            i.a a1 = new i.a(this, (byte)0);
            int j1 = a;
            if ((j1 & 1) != 1)
            {
                i1 = 0;
            }
            i.a.a(a1, b);
            if (d == null)
            {
                if ((a & 2) == 2)
                {
                    c = Collections.unmodifiableList(c);
                    a = a & -3;
                }
                i.a.a(a1, c);
            } else
            {
                i.a.a(a1, d.e());
            }
            if (f == null)
            {
                if ((a & 4) == 4)
                {
                    e = Collections.unmodifiableList(e);
                    a = a & -5;
                }
                i.a.b(a1, e);
            } else
            {
                i.a.b(a1, f.e());
            }
            if (h == null)
            {
                if ((a & 8) == 8)
                {
                    g = Collections.unmodifiableList(g);
                    a = a & -9;
                }
                i.a.c(a1, g);
            } else
            {
                i.a.c(a1, h.e());
            }
            if (j == null)
            {
                if ((a & 0x10) == 16)
                {
                    i = Collections.unmodifiableList(i);
                    a = a & 0xffffffef;
                }
                i.a.d(a1, i);
            } else
            {
                i.a.d(a1, j.e());
            }
            if (l == null)
            {
                if ((a & 0x20) == 32)
                {
                    k = Collections.unmodifiableList(k);
                    a = a & 0xffffffdf;
                }
                i.a.e(a1, k);
            } else
            {
                i.a.e(a1, l.e());
            }
            if (n == null)
            {
                if ((a & 0x40) == 64)
                {
                    m = Collections.unmodifiableList(m);
                    a = a & 0xffffffbf;
                }
                i.a.f(a1, m);
            } else
            {
                i.a.f(a1, n.e());
            }
            if ((j1 & 0x80) == 128)
            {
                i1 |= 2;
            }
            if (p == null)
            {
                i.a.a(a1, o);
            } else
            {
                i.a.a(a1, (i.s)p.c());
            }
            if (r == null)
            {
                if ((a & 0x100) == 256)
                {
                    q = Collections.unmodifiableList(q);
                    a = a & 0xfffffeff;
                }
                i.a.g(a1, q);
            } else
            {
                i.a.g(a1, r.e());
            }
            if ((a & 0x200) == 512)
            {
                s = s.e();
                a = a & 0xfffffdff;
            }
            i.a.a(a1, s);
            i.a.a(a1, i1);
            l();
            return a1;
        }

        private bn t()
        {
            if (d == null)
            {
                List list = c;
                boolean flag;
                if ((a & 2) == 2)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                d = new bn(list, flag, p(), n());
                c = null;
            }
            return d;
        }

        private bn u()
        {
            if (f == null)
            {
                List list = e;
                boolean flag;
                if ((a & 4) == 4)
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

        private bn v()
        {
            if (h == null)
            {
                List list = g;
                boolean flag;
                if ((a & 8) == 8)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                h = new bn(list, flag, p(), n());
                g = null;
            }
            return h;
        }

        private bn x()
        {
            if (j == null)
            {
                List list = i;
                boolean flag;
                if ((a & 0x10) == 16)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                j = new bn(list, flag, p(), n());
                i = null;
            }
            return j;
        }

        private void y()
        {
            if ((a & 0x20) != 32)
            {
                k = new ArrayList(k);
                a = a | 0x20;
            }
        }

        private bn z()
        {
            if (l == null)
            {
                List list = k;
                boolean flag;
                if ((a & 0x20) == 32)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                l = new bn(list, flag, p(), n());
                k = null;
            }
            return l;
        }

        public final a.a a(bd bd)
        {
            return d(bd);
        }

        public final a.a a(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final a a(b b1)
        {
            if (l == null)
            {
                if (b1 == null)
                {
                    throw new NullPointerException();
                } else
                {
                    y();
                    k.add(b1);
                    q();
                    return this;
                }
            } else
            {
                l.a(b1);
                return this;
            }
        }

        public final a a(i.a a1)
        {
            Object obj1 = null;
            if (a1 == i.a.s())
            {
                return this;
            }
            if (a1.h())
            {
                a = a | 1;
                b = i.a.a(a1);
                q();
            }
            if (d == null)
            {
                if (!i.a.b(a1).isEmpty())
                {
                    if (c.isEmpty())
                    {
                        c = i.a.b(a1);
                        a = a & -3;
                    } else
                    {
                        if ((a & 2) != 2)
                        {
                            c = new ArrayList(c);
                            a = a | 2;
                        }
                        c.addAll(i.a.b(a1));
                    }
                    q();
                }
            } else
            if (!i.a.b(a1).isEmpty())
            {
                if (d.d())
                {
                    d.b();
                    d = null;
                    c = i.a.b(a1);
                    a = a & -3;
                    if (as.d)
                    {
                        obj = t();
                    } else
                    {
                        obj = null;
                    }
                    d = ((bn) (obj));
                } else
                {
                    d.a(i.a.b(a1));
                }
            }
            if (f == null)
            {
                if (!i.a.c(a1).isEmpty())
                {
                    if (e.isEmpty())
                    {
                        e = i.a.c(a1);
                        a = a & -5;
                    } else
                    {
                        if ((a & 4) != 4)
                        {
                            e = new ArrayList(e);
                            a = a | 4;
                        }
                        e.addAll(i.a.c(a1));
                    }
                    q();
                }
            } else
            if (!i.a.c(a1).isEmpty())
            {
                if (f.d())
                {
                    f.b();
                    f = null;
                    e = i.a.c(a1);
                    a = a & -5;
                    if (as.d)
                    {
                        obj = u();
                    } else
                    {
                        obj = null;
                    }
                    f = ((bn) (obj));
                } else
                {
                    f.a(i.a.c(a1));
                }
            }
            if (h == null)
            {
                if (!i.a.d(a1).isEmpty())
                {
                    if (g.isEmpty())
                    {
                        g = i.a.d(a1);
                        a = a & -9;
                    } else
                    {
                        if ((a & 8) != 8)
                        {
                            g = new ArrayList(g);
                            a = a | 8;
                        }
                        g.addAll(i.a.d(a1));
                    }
                    q();
                }
            } else
            if (!i.a.d(a1).isEmpty())
            {
                if (h.d())
                {
                    h.b();
                    h = null;
                    g = i.a.d(a1);
                    a = a & -9;
                    if (as.d)
                    {
                        obj = v();
                    } else
                    {
                        obj = null;
                    }
                    h = ((bn) (obj));
                } else
                {
                    h.a(i.a.d(a1));
                }
            }
            if (j == null)
            {
                if (!i.a.e(a1).isEmpty())
                {
                    if (i.isEmpty())
                    {
                        i = i.a.e(a1);
                        a = a & 0xffffffef;
                    } else
                    {
                        if ((a & 0x10) != 16)
                        {
                            i = new ArrayList(i);
                            a = a | 0x10;
                        }
                        i.addAll(i.a.e(a1));
                    }
                    q();
                }
            } else
            if (!i.a.e(a1).isEmpty())
            {
                if (j.d())
                {
                    j.b();
                    j = null;
                    i = i.a.e(a1);
                    a = a & 0xffffffef;
                    if (as.d)
                    {
                        obj = x();
                    } else
                    {
                        obj = null;
                    }
                    j = ((bn) (obj));
                } else
                {
                    j.a(i.a.e(a1));
                }
            }
            if (l == null)
            {
                if (!i.a.f(a1).isEmpty())
                {
                    if (k.isEmpty())
                    {
                        k = i.a.f(a1);
                        a = a & 0xffffffdf;
                    } else
                    {
                        y();
                        k.addAll(i.a.f(a1));
                    }
                    q();
                }
            } else
            if (!i.a.f(a1).isEmpty())
            {
                if (l.d())
                {
                    l.b();
                    l = null;
                    k = i.a.f(a1);
                    a = a & 0xffffffdf;
                    if (as.d)
                    {
                        obj = z();
                    } else
                    {
                        obj = null;
                    }
                    l = ((bn) (obj));
                } else
                {
                    l.a(i.a.f(a1));
                }
            }
            if (n == null)
            {
                if (!i.a.g(a1).isEmpty())
                {
                    if (m.isEmpty())
                    {
                        m = i.a.g(a1);
                        a = a & 0xffffffbf;
                    } else
                    {
                        if ((a & 0x40) != 64)
                        {
                            m = new ArrayList(m);
                            a = a | 0x40;
                        }
                        m.addAll(i.a.g(a1));
                    }
                    q();
                }
            } else
            if (!i.a.g(a1).isEmpty())
            {
                if (n.d())
                {
                    n.b();
                    n = null;
                    m = i.a.g(a1);
                    a = a & 0xffffffbf;
                    if (as.d)
                    {
                        obj = A();
                    } else
                    {
                        obj = null;
                    }
                    n = ((bn) (obj));
                } else
                {
                    n.a(i.a.g(a1));
                }
            }
            if (a1.p())
            {
                Object obj = a1.q();
                if (p == null)
                {
                    if ((a & 0x80) == 128 && o != null && o != com.c.b.i.s.q())
                    {
                        o = com.c.b.i.s.a(o).a(((i.s) (obj))).g();
                    } else
                    {
                        o = ((i.s) (obj));
                    }
                    q();
                } else
                {
                    p.b(((as) (obj)));
                }
                a = a | 0x80;
            }
            if (r == null)
            {
                if (!i.a.h(a1).isEmpty())
                {
                    if (q.isEmpty())
                    {
                        q = i.a.h(a1);
                        a = a & 0xfffffeff;
                    } else
                    {
                        if ((a & 0x100) != 256)
                        {
                            q = new ArrayList(q);
                            a = a | 0x100;
                        }
                        q.addAll(i.a.h(a1));
                    }
                    q();
                }
            } else
            if (!i.a.h(a1).isEmpty())
            {
                if (r.d())
                {
                    r.b();
                    r = null;
                    q = i.a.h(a1);
                    a = a & 0xfffffeff;
                    bn bn1 = obj1;
                    if (as.d)
                    {
                        bn1 = C();
                    }
                    r = bn1;
                } else
                {
                    r.a(i.a.h(a1));
                }
            }
            if (!i.a.i(a1).isEmpty())
            {
                if (s.isEmpty())
                {
                    s = i.a.i(a1);
                    a = a & 0xfffffdff;
                } else
                {
                    if ((a & 0x200) != 512)
                    {
                        s = new ay(s);
                        a = a | 0x200;
                    }
                    s.addAll(i.a.i(a1));
                }
                q();
            }
            d(a1.e);
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
            int i1 = 0;
_L13:
            i.k k1;
            int j1;
            if (d == null)
            {
                j1 = c.size();
            } else
            {
                j1 = d.c();
            }
            if (i1 >= j1) goto _L2; else goto _L1
_L1:
            if (d == null)
            {
                k1 = (i.k)c.get(i1);
            } else
            {
                k1 = (i.k)d.a(i1);
            }
            if (k1.a()) goto _L4; else goto _L3
_L3:
            return false;
_L4:
            i1++;
            continue; /* Loop/switch isn't completed */
_L2:
            i1 = 0;
_L6:
            i.k k2;
            int l1;
            if (f == null)
            {
                l1 = e.size();
            } else
            {
                l1 = f.c();
            }
            if (i1 >= l1)
            {
                break MISSING_BLOCK_LABEL_172;
            }
            if (f == null)
            {
                k2 = (i.k)e.get(i1);
            } else
            {
                k2 = (i.k)f.a(i1);
            }
            if (!k2.a()) goto _L3; else goto _L5
_L5:
            i1++;
              goto _L6
            i1 = 0;
_L8:
            i.a a1;
            int i2;
            if (h == null)
            {
                i2 = g.size();
            } else
            {
                i2 = h.c();
            }
            if (i1 >= i2)
            {
                break MISSING_BLOCK_LABEL_257;
            }
            if (h == null)
            {
                a1 = (i.a)g.get(i1);
            } else
            {
                a1 = (i.a)h.a(i1);
            }
            if (!a1.a()) goto _L3; else goto _L7
_L7:
            i1++;
              goto _L8
            i1 = 0;
_L10:
            i.c c1;
            int j2;
            if (j == null)
            {
                j2 = i.size();
            } else
            {
                j2 = j.c();
            }
            if (i1 >= j2)
            {
                break MISSING_BLOCK_LABEL_342;
            }
            if (j == null)
            {
                c1 = (i.c)i.get(i1);
            } else
            {
                c1 = (i.c)j.a(i1);
            }
            if (!c1.a()) goto _L3; else goto _L9
_L9:
            i1++;
              goto _L10
            if ((a & 0x80) == 128)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 && !B().a()) goto _L3; else goto _L11
_L11:
            return true;
            if (true) goto _L13; else goto _L12
_L12:
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
            return com.c.b.i.e().a(com/c/b/i$a, com/c/b/i$a$a);
        }

        public final ak.a e()
        {
            return com.c.b.i.d();
        }

        public final i.a g()
        {
            i.a a1 = s();
            if (!a1.a())
            {
                throw b(a1);
            } else
            {
                return a1;
            }
        }

        public final bd h()
        {
            return s();
        }

        public final bd i()
        {
            return g();
        }

        public final be j()
        {
            return g();
        }

        public final bd w()
        {
            return i.a.s();
        }

        private a()
        {
            b = "";
            c = Collections.emptyList();
            e = Collections.emptyList();
            g = Collections.emptyList();
            i = Collections.emptyList();
            k = Collections.emptyList();
            m = Collections.emptyList();
            o = null;
            q = Collections.emptyList();
            s = ay.a;
            r();
        }

        a(byte byte0)
        {
            this();
        }

        private a(as.b b1)
        {
            super(b1);
            b = "";
            c = Collections.emptyList();
            e = Collections.emptyList();
            g = Collections.emptyList();
            i = Collections.emptyList();
            k = Collections.emptyList();
            m = Collections.emptyList();
            o = null;
            q = Collections.emptyList();
            s = ay.a;
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

        public static final bk c = new l();
        private static final b k = new b();
        private int f;
        private int g;
        private int h;
        private byte i;
        private int j;

        static int a(b b1, int i1)
        {
            b1.g = i1;
            return i1;
        }

        static int b(b b1, int i1)
        {
            b1.h = i1;
            return i1;
        }

        static int c(b b1, int i1)
        {
            b1.f = i1;
            return i1;
        }

        public static a l()
        {
            return k.n();
        }

        public static b m()
        {
            return k;
        }

        private a n()
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
                h1.a(1, g);
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
                i1 = com.c.b.h.d(1, g) + 0;
            }
            int j1 = i1;
            if ((f & 2) == 2)
            {
                j1 = i1 + com.c.b.h.d(2, h);
            }
            i1 = j1 + e.b();
            j = i1;
            return i1;
        }

        protected final as.g c_()
        {
            return com.c.b.i.g().a(com/c/b/i$a$b, com/c/b/i$a$b$a);
        }

        public final by f()
        {
            return e;
        }

        public final boolean h()
        {
            return (f & 1) == 1;
        }

        public final int i()
        {
            return g;
        }

        public final boolean j()
        {
            return (f & 2) == 2;
        }

        public final int k()
        {
            return h;
        }

        public final bk t()
        {
            return c;
        }

        public final bd.a u()
        {
            return k.n();
        }

        public final be.a v()
        {
            return n();
        }

        public final volatile bd w()
        {
            return k;
        }


        private b()
        {
            i = -1;
            j = -1;
            g = 0;
            h = 0;
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
            JVM INSTR lookupswitch 3: default 186
        //                       0: 189
        //                       8: 78
        //                       16: 128;
               goto _L3 _L4 _L5 _L6
_L3:
            if (!a(g1, a1, aq, i1))
            {
                flag = true;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            f = f | 1;
            g = g1.f();
            continue; /* Loop/switch isn't completed */
            g1;
            throw new RuntimeException(g1.a(this));
            g1;
            e = a1.b();
            L();
            throw g1;
_L6:
            f = f | 2;
            h = g1.f();
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
        private int b;
        private int c;

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
            b.b(b1, c);
            b.c(b1, j1);
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

        public final b.a a(int i1)
        {
            a = a | 1;
            b = i1;
            q();
            return this;
        }

        public final b.a a(b b1)
        {
            if (b1 == b.m())
            {
                return this;
            }
            if (b1.h())
            {
                a(b1.i());
            }
            if (b1.j())
            {
                b(b1.k());
            }
            d(b1.e);
            q();
            return this;
        }

        public final boolean a()
        {
            return true;
        }

        public final b.a b(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final b.a b(int i1)
        {
            a = a | 2;
            c = i1;
            q();
            return this;
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
            return com.c.b.i.g().a(com/c/b/i$a$b, com/c/b/i$a$b$a);
        }

        public final ak.a e()
        {
            return com.c.b.i.f();
        }

        public final b g()
        {
            b b1 = r();
            if (!b1.a())
            {
                throw b(b1);
            } else
            {
                return b1;
            }
        }

        public final bd h()
        {
            return r();
        }

        public final bd i()
        {
            return g();
        }

        public final be j()
        {
            return g();
        }

        public final bd w()
        {
            return b.m();
        }

        private b.a()
        {
        }

        b.a(byte byte0)
        {
            this();
        }

        private b.a(as.b b1)
        {
            super(b1);
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

    public static final class d extends as
        implements e
    {

        public static final bk c = new m();
        private static final d k = new d();
        private int f;
        private int g;
        private int h;
        private byte i;
        private int j;

        static int a(d d1, int i1)
        {
            d1.g = i1;
            return i1;
        }

        static int b(d d1, int i1)
        {
            d1.h = i1;
            return i1;
        }

        static int c(d d1, int i1)
        {
            d1.f = i1;
            return i1;
        }

        public static d l()
        {
            return k;
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
                h1.a(1, g);
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
                i1 = com.c.b.h.d(1, g) + 0;
            }
            int j1 = i1;
            if ((f & 2) == 2)
            {
                j1 = i1 + com.c.b.h.d(2, h);
            }
            i1 = j1 + e.b();
            j = i1;
            return i1;
        }

        protected final as.g c_()
        {
            return com.c.b.i.i().a(com/c/b/i$a$d, com/c/b/i$a$d$a);
        }

        public final by f()
        {
            return e;
        }

        public final boolean h()
        {
            return (f & 1) == 1;
        }

        public final int i()
        {
            return g;
        }

        public final boolean j()
        {
            return (f & 2) == 2;
        }

        public final int k()
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


        private d()
        {
            i = -1;
            j = -1;
            g = 0;
            h = 0;
        }

        private d(as.a a1)
        {
            super(a1);
            i = -1;
            j = -1;
        }

        d(as.a a1, byte byte0)
        {
            this(a1);
        }

        private d(g g1, aq aq)
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
            JVM INSTR lookupswitch 3: default 186
        //                       0: 189
        //                       8: 78
        //                       16: 128;
               goto _L3 _L4 _L5 _L6
_L3:
            if (!a(g1, a1, aq, i1))
            {
                flag = true;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            f = f | 1;
            g = g1.f();
            continue; /* Loop/switch isn't completed */
            g1;
            throw new RuntimeException(g1.a(this));
            g1;
            e = a1.b();
            L();
            throw g1;
_L6:
            f = f | 2;
            h = g1.f();
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

        d(g g1, aq aq, byte byte0)
        {
            this(g1, aq);
        }
    }

    public static final class d.a extends as.a
        implements e
    {

        private int a;
        private int b;
        private int c;

        private d.a d(bd bd)
        {
            if (bd instanceof d)
            {
                return a((d)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private d.a d(g g1, aq aq)
        {
            g1 = (d)d.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (d)aq.a();
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

        private d r()
        {
            d d1 = s();
            if (!d1.a())
            {
                throw b(d1);
            } else
            {
                return d1;
            }
        }

        private d s()
        {
            int i1 = 1;
            d d1 = new d(this, (byte)0);
            int k1 = a;
            int j1;
            if ((k1 & 1) != 1)
            {
                i1 = 0;
            }
            d.a(d1, b);
            j1 = i1;
            if ((k1 & 2) == 2)
            {
                j1 = i1 | 2;
            }
            d.b(d1, c);
            d.c(d1, j1);
            l();
            return d1;
        }

        public final a.a a(bd bd)
        {
            return d(bd);
        }

        public final a.a a(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final d.a a(d d1)
        {
            if (d1 == d.l())
            {
                return this;
            }
            if (d1.h())
            {
                int i1 = d1.i();
                a = a | 1;
                b = i1;
                q();
            }
            if (d1.j())
            {
                int j1 = d1.k();
                a = a | 2;
                c = j1;
                q();
            }
            d(d1.e);
            q();
            return this;
        }

        public final boolean a()
        {
            return true;
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
            return com.c.b.i.i().a(com/c/b/i$a$d, com/c/b/i$a$d$a);
        }

        public final ak.a e()
        {
            return com.c.b.i.h();
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
            return d.l();
        }

        private d.a()
        {
        }

        d.a(byte byte0)
        {
            this();
        }

        private d.a(as.b b1)
        {
            super(b1);
        }

        d.a(as.b b1, byte byte0)
        {
            this(b1);
        }
    }

    public static interface e
        extends bg
    {
    }


    public static final bk c = new k();
    private static final nit> s = new <init>();
    private int f;
    private volatile Object g;
    private List h;
    private List i;
    private List j;
    private List k;
    private List l;
    private List m;
    private st n;
    private List o;
    private az p;
    private byte q;
    private int r;

    static int a(ject ject, int i1)
    {
        ject.f = i1;
        return i1;
    }

    static az a(f f1, az az1)
    {
        f1.p = az1;
        return az1;
    }

    static p a(p p1, p p2)
    {
        p1.n = p2;
        return p2;
    }

    static Object a(n n1)
    {
        return n1.g;
    }

    static Object a(ject ject, Object obj)
    {
        ject.g = obj;
        return obj;
    }

    static List a(st st, List list)
    {
        st.h = list;
        return list;
    }

    static List b(h h1)
    {
        return h1.h;
    }

    static List b(st st, List list)
    {
        st.i = list;
        return list;
    }

    static List c(i i1)
    {
        return i1.i;
    }

    static List c(st st, List list)
    {
        st.j = list;
        return list;
    }

    static List d(j j1)
    {
        return j1.j;
    }

    static List d(st st, List list)
    {
        st.k = list;
        return list;
    }

    static List e(k k1)
    {
        return k1.k;
    }

    static List e(st st, List list)
    {
        st.l = list;
        return list;
    }

    static List f(l l1)
    {
        return l1.l;
    }

    static List f(st st, List list)
    {
        st.m = list;
        return list;
    }

    static List g(m m1)
    {
        return m1.m;
    }

    static List g(st st, List list)
    {
        st.o = list;
        return list;
    }

    static List h(o o1)
    {
        return o1.o;
    }

    static az i(o o1)
    {
        return o1.p;
    }

    public static a r()
    {
        return s.y();
    }

    public static y s()
    {
        return s;
    }

    private f x()
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

    private a y()
    {
        if (this == s)
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

    public final  a(int i1)
    {
        return ()h.get(i1);
    }

    public final void a(h h1)
    {
        boolean flag = false;
        if ((f & 1) == 1)
        {
            h1.a(1, x());
        }
        for (int i1 = 0; i1 < h.size(); i1++)
        {
            h1.b(2, (be)h.get(i1));
        }

        for (int j1 = 0; j1 < j.size(); j1++)
        {
            h1.b(3, (be)j.get(j1));
        }

        for (int k1 = 0; k1 < k.size(); k1++)
        {
            h1.b(4, (be)k.get(k1));
        }

        for (int l1 = 0; l1 < l.size(); l1++)
        {
            h1.b(5, (be)l.get(l1));
        }

        for (int i2 = 0; i2 < i.size(); i2++)
        {
            h1.b(6, (be)i.get(i2));
        }

        if ((f & 2) == 2)
        {
            h1.b(7, q());
        }
        for (int j2 = 0; j2 < m.size(); j2++)
        {
            h1.b(8, (be)m.get(j2));
        }

        int k2 = 0;
        int l2;
        do
        {
            l2 = ((flag) ? 1 : 0);
            if (k2 >= o.size())
            {
                break;
            }
            h1.b(9, (be)o.get(k2));
            k2++;
        } while (true);
        for (; l2 < p.size(); l2++)
        {
            h1.a(10, p.a(l2));
        }

        e.a(h1);
    }

    public final boolean a()
    {
        boolean flag = false;
        byte byte0 = q;
        if (byte0 == 1)
        {
            flag = true;
        } else
        if (byte0 != 0)
        {
            for (int i1 = 0; i1 < j(); i1++)
            {
                if (!a(i1).a())
                {
                    q = 0;
                    return false;
                }
            }

            for (int j1 = 0; j1 < k(); j1++)
            {
                if (!b(j1).a())
                {
                    q = 0;
                    return false;
                }
            }

            for (int k1 = 0; k1 < l(); k1++)
            {
                if (!c(k1).a())
                {
                    q = 0;
                    return false;
                }
            }

            for (int l1 = 0; l1 < m(); l1++)
            {
                if (!d(l1).a())
                {
                    q = 0;
                    return false;
                }
            }

            if (p() && !q().a())
            {
                q = 0;
                return false;
            } else
            {
                q = 1;
                return true;
            }
        }
        return flag;
    }

    public final int b()
    {
        int k1 = 0;
        int i1 = r;
        if (i1 != -1)
        {
            return i1;
        }
        int j1;
        boolean flag;
        if ((f & 1) == 1)
        {
            i1 = com.c.b.h.c(1, x()) + 0;
        } else
        {
            i1 = 0;
        }
        for (j1 = 0; j1 < h.size(); j1++)
        {
            i1 += com.c.b.h.d(2, (be)h.get(j1));
        }

        for (j1 = 0; j1 < j.size(); j1++)
        {
            i1 += com.c.b.h.d(3, (be)j.get(j1));
        }

        for (j1 = 0; j1 < k.size(); j1++)
        {
            i1 += com.c.b.h.d(4, (be)k.get(j1));
        }

        for (j1 = 0; j1 < l.size(); j1++)
        {
            i1 += com.c.b.h.d(5, (be)l.get(j1));
        }

        for (j1 = 0; j1 < i.size(); j1++)
        {
            i1 += com.c.b.h.d(6, (be)i.get(j1));
        }

        j1 = i1;
        if ((f & 2) == 2)
        {
            j1 = i1 + com.c.b.h.d(7, q());
        }
        flag = false;
        i1 = j1;
        for (j1 = ((flag) ? 1 : 0); j1 < m.size(); j1++)
        {
            i1 += com.c.b.h.d(8, (be)m.get(j1));
        }

        for (j1 = 0; j1 < o.size(); j1++)
        {
            i1 += com.c.b.h.d(9, (be)o.get(j1));
        }

        flag = false;
        j1 = k1;
        k1 = ((flag) ? 1 : 0);
        for (; j1 < p.size(); j1++)
        {
            k1 += com.c.b.h.b(p.a(j1));
        }

        i1 = k1 + i1 + p.size() * 1 + e.b();
        r = i1;
        return i1;
    }

    public final r b(int i1)
    {
        return (r)i.get(i1);
    }

    public final st.get c(int i1)
    {
        return (st.get)j.get(i1);
    }

    protected final  c_()
    {
        return com.c.b.i.e().a(com/c/b/i$a, com/c/b/i$a$a);
    }

    public final ass d(int i1)
    {
        return (ass)k.get(i1);
    }

    public final st.get e(int i1)
    {
        return (st.get)m.get(i1);
    }

    public final by f()
    {
        return e;
    }

    public final boolean h()
    {
        return (f & 1) == 1;
    }

    public final String i()
    {
        Object obj = g;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        obj = (f)obj;
        String s1 = ((f) (obj)).f();
        if (((f) (obj)).g())
        {
            g = s1;
        }
        return s1;
    }

    public final int j()
    {
        return h.size();
    }

    public final int k()
    {
        return i.size();
    }

    public final int l()
    {
        return j.size();
    }

    public final int m()
    {
        return k.size();
    }

    public final List n()
    {
        return l;
    }

    public final int o()
    {
        return m.size();
    }

    public final boolean p()
    {
        return (f & 2) == 2;
    }

    public final f q()
    {
        if (n == null)
        {
            return q();
        } else
        {
            return n;
        }
    }

    public final bk t()
    {
        return c;
    }

    public final  u()
    {
        return s.y();
    }

    public final  v()
    {
        return y();
    }

    public final volatile bd w()
    {
        return s;
    }


    private ()
    {
        q = -1;
        r = -1;
        g = "";
        h = Collections.emptyList();
        i = Collections.emptyList();
        j = Collections.emptyList();
        k = Collections.emptyList();
        l = Collections.emptyList();
        m = Collections.emptyList();
        o = Collections.emptyList();
        p = ay.a;
    }

    private ( )
    {
        super();
        q = -1;
        r = -1;
    }

    ( , byte byte0)
    {
        this();
    }

    private ject(g g1, aq aq)
    {
         ;
        int i1;
        boolean flag;
        this();
        i1 = 0;
         = by.c();
        flag = false;
_L38:
        if (flag) goto _L2; else goto _L1
_L1:
        int j1;
        int k1;
        int l1;
        k1 = i1;
        j1 = i1;
        l1 = i1;
        int i2 = g1.a();
        i2;
        JVM INSTR lookupswitch 11: default 1457
    //                   0: 1460
    //                   10: 171
    //                   18: 434
    //                   26: 540
    //                   34: 621
    //                   42: 702
    //                   50: 783
    //                   58: 861
    //                   66: 1000
    //                   74: 1081
    //                   82: 1165;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L3:
        k1 = i1;
        j1 = i1;
        l1 = i1;
        if (!a(g1, , aq, i2))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        k1 = i1;
        j1 = i1;
        l1 = i1;
        Object obj = g1.l();
        k1 = i1;
        j1 = i1;
        l1 = i1;
        f = f | 1;
        k1 = i1;
        j1 = i1;
        l1 = i1;
        g = obj;
        continue; /* Loop/switch isn't completed */
        g1;
        j1 = k1;
_L35:
        throw new RuntimeException(g1.a(this));
        g1;
_L33:
        if ((j1 & 2) == 2)
        {
            h = Collections.unmodifiableList(h);
        }
        if ((j1 & 8) == 8)
        {
            j = Collections.unmodifiableList(j);
        }
        if ((j1 & 0x10) == 16)
        {
            k = Collections.unmodifiableList(k);
        }
        if ((j1 & 0x20) == 32)
        {
            l = Collections.unmodifiableList(l);
        }
        if ((j1 & 4) == 4)
        {
            i = Collections.unmodifiableList(i);
        }
        if ((j1 & 0x40) == 64)
        {
            m = Collections.unmodifiableList(m);
        }
        if ((j1 & 0x100) == 256)
        {
            o = Collections.unmodifiableList(o);
        }
        if ((j1 & 0x200) == 512)
        {
            p = p.e();
        }
        e = .b();
        L();
        throw g1;
_L6:
        i2 = i1;
        if ((i1 & 2) == 2) goto _L16; else goto _L15
_L15:
        k1 = i1;
        j1 = i1;
        l1 = i1;
        h = new ArrayList();
        i2 = i1 | 2;
_L16:
        k1 = i2;
        j1 = i2;
        l1 = i2;
        h.add(g1.a(c, aq));
        i1 = i2;
        continue; /* Loop/switch isn't completed */
        g1;
        j1 = l1;
_L34:
        throw new RuntimeException((new av(g1.getMessage())).a(this));
_L7:
        i2 = i1;
        if ((i1 & 8) == 8) goto _L18; else goto _L17
_L17:
        k1 = i1;
        j1 = i1;
        l1 = i1;
        j = new ArrayList();
        i2 = i1 | 8;
_L18:
        k1 = i2;
        j1 = i2;
        l1 = i2;
        j.add(g1.a(c, aq));
        i1 = i2;
        continue; /* Loop/switch isn't completed */
_L8:
        i2 = i1;
        if ((i1 & 0x10) == 16) goto _L20; else goto _L19
_L19:
        k1 = i1;
        j1 = i1;
        l1 = i1;
        k = new ArrayList();
        i2 = i1 | 0x10;
_L20:
        k1 = i2;
        j1 = i2;
        l1 = i2;
        k.add(g1.a(c, aq));
        i1 = i2;
        continue; /* Loop/switch isn't completed */
_L9:
        i2 = i1;
        if ((i1 & 0x20) == 32) goto _L22; else goto _L21
_L21:
        k1 = i1;
        j1 = i1;
        l1 = i1;
        l = new ArrayList();
        i2 = i1 | 0x20;
_L22:
        k1 = i2;
        j1 = i2;
        l1 = i2;
        l.add(g1.a(b.c, aq));
        i1 = i2;
        continue; /* Loop/switch isn't completed */
_L10:
        i2 = i1;
        if ((i1 & 4) == 4) goto _L24; else goto _L23
_L23:
        k1 = i1;
        j1 = i1;
        l1 = i1;
        i = new ArrayList();
        i2 = i1 | 4;
_L24:
        k1 = i2;
        j1 = i2;
        l1 = i2;
        i.add(g1.a(c, aq));
        i1 = i2;
        continue; /* Loop/switch isn't completed */
_L11:
        k1 = i1;
        j1 = i1;
        l1 = i1;
        if ((f & 2) != 2) goto _L26; else goto _L25
_L25:
        k1 = i1;
        j1 = i1;
        l1 = i1;
        obj = n.p();
_L36:
        k1 = i1;
        j1 = i1;
        l1 = i1;
        n = (n)g1.a(c, aq);
        if (obj == null) goto _L28; else goto _L27
_L27:
        k1 = i1;
        j1 = i1;
        l1 = i1;
        ((a) (obj)).a(n);
        k1 = i1;
        j1 = i1;
        l1 = i1;
        n = ((a) (obj)).g();
_L28:
        k1 = i1;
        j1 = i1;
        l1 = i1;
        f = f | 2;
        continue; /* Loop/switch isn't completed */
_L12:
        i2 = i1;
        if ((i1 & 0x40) == 64) goto _L30; else goto _L29
_L29:
        k1 = i1;
        j1 = i1;
        l1 = i1;
        m = new ArrayList();
        i2 = i1 | 0x40;
_L30:
        k1 = i2;
        j1 = i2;
        l1 = i2;
        m.add(g1.a(c, aq));
        i1 = i2;
        continue; /* Loop/switch isn't completed */
_L13:
        i2 = i1;
        if ((i1 & 0x100) == 256) goto _L32; else goto _L31
_L31:
        k1 = i1;
        j1 = i1;
        l1 = i1;
        o = new ArrayList();
        i2 = i1 | 0x100;
_L32:
        k1 = i2;
        j1 = i2;
        l1 = i2;
        o.add(g1.a(d.c, aq));
        i1 = i2;
        continue; /* Loop/switch isn't completed */
_L14:
        k1 = i1;
        j1 = i1;
        l1 = i1;
        obj = g1.l();
        if ((i1 & 0x200) == 512)
        {
            break MISSING_BLOCK_LABEL_1225;
        }
        k1 = i1;
        j1 = i1;
        l1 = i1;
        p = new ay();
        i1 |= 0x200;
        p.a(((f) (obj)));
        continue; /* Loop/switch isn't completed */
_L2:
        if ((i1 & 2) == 2)
        {
            h = Collections.unmodifiableList(h);
        }
        if ((i1 & 8) == 8)
        {
            j = Collections.unmodifiableList(j);
        }
        if ((i1 & 0x10) == 16)
        {
            k = Collections.unmodifiableList(k);
        }
        if ((i1 & 0x20) == 32)
        {
            l = Collections.unmodifiableList(l);
        }
        if ((i1 & 4) == 4)
        {
            i = Collections.unmodifiableList(i);
        }
        if ((i1 & 0x40) == 64)
        {
            m = Collections.unmodifiableList(m);
        }
        if ((i1 & 0x100) == 256)
        {
            o = Collections.unmodifiableList(o);
        }
        if ((i1 & 0x200) == 512)
        {
            p = p.e();
        }
        e = .b();
        L();
        return;
        g1;
        j1 = i1;
          goto _L33
        g1;
        j1 = i1;
          goto _L34
        g1;
        j1 = i1;
          goto _L35
_L26:
        obj = null;
          goto _L36
_L4:
        flag = true;
        if (true) goto _L38; else goto _L37
_L37:
    }

    L(g g1, aq aq, byte byte0)
    {
        this(g1, aq);
    }
}
