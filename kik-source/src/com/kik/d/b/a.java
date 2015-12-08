// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.d.b;

import com.c.b.aq;
import com.c.b.as;
import com.c.b.av;
import com.c.b.ay;
import com.c.b.az;
import com.c.b.bd;
import com.c.b.be;
import com.c.b.bg;
import com.c.b.bk;
import com.c.b.bl;
import com.c.b.bm;
import com.c.b.bn;
import com.c.b.bp;
import com.c.b.by;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.kik.d.b:
//            b, c, h, i, 
//            e, f, j, l, 
//            k, d, g

public final class com.kik.d.b.a
{
    public static final class a extends as
        implements b
    {

        public static final bk c = new com.kik.d.b.c();
        private static final a r = new a();
        private int f;
        private i g;
        private d h;
        private long i;
        private int j;
        private volatile Object k;
        private az l;
        private List m;
        private List n;
        private List o;
        private byte p;
        private int q;

        private com.c.b.f A()
        {
            Object obj = k;
            if (obj instanceof String)
            {
                obj = com.c.b.f.a((String)obj);
                k = obj;
                return ((com.c.b.f) (obj));
            } else
            {
                return (com.c.b.f)obj;
            }
        }

        private a B()
        {
            if (this == r)
            {
                return new a((byte)0);
            } else
            {
                return (new a((byte)0)).a(this);
            }
        }

        static int a(a a1, int i1)
        {
            a1.j = i1;
            return i1;
        }

        static long a(a a1, long l1)
        {
            a1.i = l1;
            return l1;
        }

        static az a(a a1, az az1)
        {
            a1.l = az1;
            return az1;
        }

        static d a(a a1, d d1)
        {
            a1.h = d1;
            return d1;
        }

        static i a(a a1, i i1)
        {
            a1.g = i1;
            return i1;
        }

        static Object a(a a1)
        {
            return a1.k;
        }

        static Object a(a a1, Object obj)
        {
            a1.k = obj;
            return obj;
        }

        static List a(a a1, List list)
        {
            a1.m = list;
            return list;
        }

        static int b(a a1, int i1)
        {
            a1.f = i1;
            return i1;
        }

        static az b(a a1)
        {
            return a1.l;
        }

        static List b(a a1, List list)
        {
            a1.n = list;
            return list;
        }

        static List c(a a1)
        {
            return a1.m;
        }

        static List c(a a1, List list)
        {
            a1.o = list;
            return list;
        }

        static List d(a a1)
        {
            return a1.n;
        }

        static List e(a a1)
        {
            return a1.o;
        }

        static by f(a a1)
        {
            return a1.e;
        }

        public static a q()
        {
            return r.B();
        }

        public static a r()
        {
            return r;
        }

        static boolean s()
        {
            return d;
        }

        static boolean x()
        {
            return d;
        }

        static boolean y()
        {
            return d;
        }

        static boolean z()
        {
            return d;
        }

        protected final com.c.b.bd.a a(com.c.b.as.b b1)
        {
            return new a(b1, (byte)0);
        }

        public final void a(com.c.b.h h1)
        {
            boolean flag = false;
            if ((f & 1) == 1)
            {
                h1.b(1, i());
            }
            if ((f & 2) == 2)
            {
                h1.b(2, k());
            }
            if ((f & 4) == 4)
            {
                h1.b(3, i);
            }
            if ((f & 8) == 8)
            {
                h1.a(j);
            }
            if ((f & 0x10) == 16)
            {
                h1.a(6, A());
            }
            for (int i1 = 0; i1 < l.size(); i1++)
            {
                h1.a(7, l.a(i1));
            }

            for (int j1 = 0; j1 < m.size(); j1++)
            {
                h1.b(8, (be)m.get(j1));
            }

            int k1 = 0;
            int l1;
            do
            {
                l1 = ((flag) ? 1 : 0);
                if (k1 >= n.size())
                {
                    break;
                }
                h1.b(9, (be)n.get(k1));
                k1++;
            } while (true);
            for (; l1 < o.size(); l1++)
            {
                h1.b(10, (be)o.get(l1));
            }

            e.a(h1);
        }

        public final boolean a()
        {
            boolean flag = false;
            byte byte0 = p;
            if (byte0 == 1)
            {
                flag = true;
            } else
            if (byte0 != 0)
            {
                if (!l())
                {
                    p = 0;
                    return false;
                }
                if (!n())
                {
                    p = 0;
                    return false;
                }
                if (h() && !i().a())
                {
                    p = 0;
                    return false;
                }
                if (j() && !k().a())
                {
                    p = 0;
                    return false;
                }
                for (int i1 = 0; i1 < m.size(); i1++)
                {
                    if (!((l)m.get(i1)).a())
                    {
                        p = 0;
                        return false;
                    }
                }

                for (int j1 = 0; j1 < n.size(); j1++)
                {
                    if (!((p)n.get(j1)).a())
                    {
                        p = 0;
                        return false;
                    }
                }

                for (int k1 = 0; k1 < o.size(); k1++)
                {
                    if (!((n)o.get(k1)).a())
                    {
                        p = 0;
                        return false;
                    }
                }

                p = 1;
                return true;
            }
            return flag;
        }

        public final int b()
        {
            boolean flag = false;
            int i1 = q;
            if (i1 != -1)
            {
                return i1;
            }
            int j1;
            int k1;
            int l1;
            if ((f & 1) == 1)
            {
                j1 = com.c.b.h.d(1, i()) + 0;
            } else
            {
                j1 = 0;
            }
            i1 = j1;
            if ((f & 2) == 2)
            {
                i1 = j1 + com.c.b.h.d(2, k());
            }
            j1 = i1;
            if ((f & 4) == 4)
            {
                j1 = i1 + com.c.b.h.e(3, i);
            }
            i1 = j1;
            if ((f & 8) == 8)
            {
                i1 = j1 + com.c.b.h.a();
            }
            j1 = i1;
            if ((f & 0x10) == 16)
            {
                j1 = i1 + com.c.b.h.c(6, A());
            }
            k1 = 0;
            i1 = 0;
            for (; k1 < l.size(); k1++)
            {
                i1 += com.c.b.h.b(l.a(k1));
            }

            l1 = l.size();
            k1 = 0;
            i1 = j1 + i1 + l1 * 1;
            for (j1 = k1; j1 < m.size(); j1++)
            {
                i1 += com.c.b.h.d(8, (be)m.get(j1));
            }

            j1 = 0;
            do
            {
                k1 = ((flag) ? 1 : 0);
                l1 = i1;
                if (j1 >= n.size())
                {
                    break;
                }
                i1 += com.c.b.h.d(9, (be)n.get(j1));
                j1++;
            } while (true);
            for (; k1 < o.size(); k1++)
            {
                l1 += com.c.b.h.d(10, (be)o.get(k1));
            }

            i1 = e.b() + l1;
            q = i1;
            return i1;
        }

        protected final com.c.b.as.g c_()
        {
            return com.kik.d.b.a.f().a(com/kik/d/b/a$a, com/kik/d/b/a$a$a);
        }

        public final by f()
        {
            return e;
        }

        public final boolean h()
        {
            return (f & 1) == 1;
        }

        public final i i()
        {
            if (g == null)
            {
                return i.l();
            } else
            {
                return g;
            }
        }

        public final boolean j()
        {
            return (f & 2) == 2;
        }

        public final d k()
        {
            if (h == null)
            {
                return d.m();
            } else
            {
                return h;
            }
        }

        public final boolean l()
        {
            return (f & 4) == 4;
        }

        public final long m()
        {
            return i;
        }

        public final boolean n()
        {
            return (f & 8) == 8;
        }

        public final int o()
        {
            return j;
        }

        public final boolean p()
        {
            return (f & 0x10) == 16;
        }

        public final bk t()
        {
            return c;
        }

        public final com.c.b.bd.a u()
        {
            return r.B();
        }

        public final com.c.b.be.a v()
        {
            return B();
        }

        public final volatile bd w()
        {
            return r;
        }


        private a()
        {
            p = -1;
            q = -1;
            i = 0L;
            j = 0;
            k = "";
            l = ay.a;
            m = Collections.emptyList();
            n = Collections.emptyList();
            o = Collections.emptyList();
        }

        private a(com.c.b.as.a a1)
        {
            super(a1);
            p = -1;
            q = -1;
        }

        a(com.c.b.as.a a1, byte byte0)
        {
            this(a1);
        }

        private a(com.c.b.g g1, aq aq)
        {
            com.c.b.by.a a1;
            int i1;
            boolean flag;
            this();
            i1 = 0;
            a1 = by.c();
            flag = false;
_L34:
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
            JVM INSTR lookupswitch 10: default 1207
        //                       0: 1210
        //                       10: 163
        //                       18: 426
        //                       24: 593
        //                       37: 638
        //                       50: 684
        //                       58: 744
        //                       66: 834
        //                       74: 915
        //                       82: 999;
               goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L3:
            k1 = i1;
            j1 = i1;
            l1 = i1;
            if (!a(g1, a1, aq, i2))
            {
                flag = true;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            k1 = i1;
            j1 = i1;
            l1 = i1;
            if ((f & 1) != 1) goto _L15; else goto _L14
_L14:
            k1 = i1;
            j1 = i1;
            l1 = i1;
            Object obj = g.k();
_L32:
            k1 = i1;
            j1 = i1;
            l1 = i1;
            g = (i)g1.a(i.c, aq);
            if (obj == null) goto _L17; else goto _L16
_L16:
            k1 = i1;
            j1 = i1;
            l1 = i1;
            ((i.a) (obj)).a(g);
            k1 = i1;
            j1 = i1;
            l1 = i1;
            g = ((i.a) (obj)).s();
_L17:
            k1 = i1;
            j1 = i1;
            l1 = i1;
            f = f | 1;
            continue; /* Loop/switch isn't completed */
            g1;
            j1 = k1;
_L30:
            throw new RuntimeException(g1.a(this));
            g1;
_L28:
            if ((j1 & 0x20) == 32)
            {
                l = l.e();
            }
            if ((j1 & 0x40) == 64)
            {
                m = Collections.unmodifiableList(m);
            }
            if ((j1 & 0x80) == 128)
            {
                n = Collections.unmodifiableList(n);
            }
            if ((j1 & 0x100) == 256)
            {
                o = Collections.unmodifiableList(o);
            }
            e = a1.b();
            L();
            throw g1;
_L6:
            k1 = i1;
            j1 = i1;
            l1 = i1;
            if ((f & 2) != 2) goto _L19; else goto _L18
_L18:
            k1 = i1;
            j1 = i1;
            l1 = i1;
            obj = h.l();
_L31:
            k1 = i1;
            j1 = i1;
            l1 = i1;
            h = (d)g1.a(d.c, aq);
            if (obj == null) goto _L21; else goto _L20
_L20:
            k1 = i1;
            j1 = i1;
            l1 = i1;
            ((d.a) (obj)).a(h);
            k1 = i1;
            j1 = i1;
            l1 = i1;
            h = ((d.a) (obj)).s();
_L21:
            k1 = i1;
            j1 = i1;
            l1 = i1;
            f = f | 2;
            continue; /* Loop/switch isn't completed */
            g1;
            j1 = l1;
_L29:
            throw new RuntimeException((new av(g1.getMessage())).a(this));
_L7:
            k1 = i1;
            j1 = i1;
            l1 = i1;
            f = f | 4;
            k1 = i1;
            j1 = i1;
            l1 = i1;
            i = g1.e();
            continue; /* Loop/switch isn't completed */
_L8:
            k1 = i1;
            j1 = i1;
            l1 = i1;
            f = f | 8;
            k1 = i1;
            j1 = i1;
            l1 = i1;
            j = g1.o();
            continue; /* Loop/switch isn't completed */
_L9:
            k1 = i1;
            j1 = i1;
            l1 = i1;
            obj = g1.l();
            k1 = i1;
            j1 = i1;
            l1 = i1;
            f = f | 0x10;
            k1 = i1;
            j1 = i1;
            l1 = i1;
            k = obj;
            continue; /* Loop/switch isn't completed */
_L10:
            k1 = i1;
            j1 = i1;
            l1 = i1;
            obj = g1.l();
            i2 = i1;
            if ((i1 & 0x20) == 32) goto _L23; else goto _L22
_L22:
            k1 = i1;
            j1 = i1;
            l1 = i1;
            l = new ay();
            i2 = i1 | 0x20;
_L23:
            k1 = i2;
            j1 = i2;
            l1 = i2;
            l.a(((com.c.b.f) (obj)));
            i1 = i2;
            continue; /* Loop/switch isn't completed */
_L11:
            i2 = i1;
            if ((i1 & 0x40) == 64) goto _L25; else goto _L24
_L24:
            k1 = i1;
            j1 = i1;
            l1 = i1;
            m = new ArrayList();
            i2 = i1 | 0x40;
_L25:
            k1 = i2;
            j1 = i2;
            l1 = i2;
            m.add(g1.a(l.c, aq));
            i1 = i2;
            continue; /* Loop/switch isn't completed */
_L12:
            i2 = i1;
            if ((i1 & 0x80) == 128) goto _L27; else goto _L26
_L26:
            k1 = i1;
            j1 = i1;
            l1 = i1;
            n = new ArrayList();
            i2 = i1 | 0x80;
_L27:
            k1 = i2;
            j1 = i2;
            l1 = i2;
            n.add(g1.a(p.c, aq));
            i1 = i2;
            continue; /* Loop/switch isn't completed */
_L13:
            if ((i1 & 0x100) == 256)
            {
                break MISSING_BLOCK_LABEL_1042;
            }
            k1 = i1;
            j1 = i1;
            l1 = i1;
            o = new ArrayList();
            i1 |= 0x100;
            o.add(g1.a(n.c, aq));
            continue; /* Loop/switch isn't completed */
_L2:
            if ((i1 & 0x20) == 32)
            {
                l = l.e();
            }
            if ((i1 & 0x40) == 64)
            {
                m = Collections.unmodifiableList(m);
            }
            if ((i1 & 0x80) == 128)
            {
                n = Collections.unmodifiableList(n);
            }
            if ((i1 & 0x100) == 256)
            {
                o = Collections.unmodifiableList(o);
            }
            e = a1.b();
            L();
            return;
            g1;
            j1 = i1;
              goto _L28
            g1;
            j1 = i1;
              goto _L29
            g1;
            j1 = i1;
              goto _L30
_L19:
            obj = null;
              goto _L31
_L15:
            obj = null;
              goto _L32
_L4:
            flag = true;
            if (true) goto _L34; else goto _L33
_L33:
        }

        a(com.c.b.g g1, aq aq, byte byte0)
        {
            this(g1, aq);
        }
    }

    public static final class a.a extends com.c.b.as.a
        implements b
    {

        private int a;
        private i b;
        private bp c;
        private d d;
        private bp e;
        private long f;
        private int g;
        private Object h;
        private az i;
        private List j;
        private bn k;
        private List l;
        private bn m;
        private List n;
        private bn o;

        private bn A()
        {
            if (m == null)
            {
                List list = l;
                boolean flag;
                if ((a & 0x80) == 128)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                m = new bn(list, flag, p(), n());
                l = null;
            }
            return m;
        }

        private void B()
        {
            if ((a & 0x100) != 256)
            {
                n = new ArrayList(n);
                a = a | 0x100;
            }
        }

        private bn C()
        {
            if (o == null)
            {
                List list = n;
                boolean flag;
                if ((a & 0x100) == 256)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                o = new bn(list, flag, p(), n());
                n = null;
            }
            return o;
        }

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

        private a.a d(com.c.b.g g1, aq aq)
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

        private void s()
        {
            if (a.s())
            {
                if (c == null)
                {
                    c = new bp(u(), p(), n());
                    b = null;
                }
                if (e == null)
                {
                    e = new bp(v(), p(), n());
                    d = null;
                }
                y();
                A();
                C();
            }
        }

        private a t()
        {
            int j1 = 0;
            a a1 = new a(this, (byte)0);
            int k1 = a;
            if ((k1 & 1) == 1)
            {
                j1 = 1;
            }
            int i1;
            if (c == null)
            {
                a.a(a1, b);
            } else
            {
                a.a(a1, (i)c.c());
            }
            i1 = j1;
            if ((k1 & 2) == 2)
            {
                i1 = j1 | 2;
            }
            if (e == null)
            {
                a.a(a1, d);
            } else
            {
                a.a(a1, (d)e.c());
            }
            j1 = i1;
            if ((k1 & 4) == 4)
            {
                j1 = i1 | 4;
            }
            a.a(a1, f);
            i1 = j1;
            if ((k1 & 8) == 8)
            {
                i1 = j1 | 8;
            }
            a.a(a1, g);
            j1 = i1;
            if ((k1 & 0x10) == 16)
            {
                j1 = i1 | 0x10;
            }
            a.a(a1, h);
            if ((a & 0x20) == 32)
            {
                i = i.e();
                a = a & 0xffffffdf;
            }
            a.a(a1, i);
            if (k == null)
            {
                if ((a & 0x40) == 64)
                {
                    j = Collections.unmodifiableList(j);
                    a = a & 0xffffffbf;
                }
                a.a(a1, j);
            } else
            {
                a.a(a1, k.e());
            }
            if (m == null)
            {
                if ((a & 0x80) == 128)
                {
                    l = Collections.unmodifiableList(l);
                    a = a & 0xffffff7f;
                }
                a.b(a1, l);
            } else
            {
                a.b(a1, m.e());
            }
            if (o == null)
            {
                if ((a & 0x100) == 256)
                {
                    n = Collections.unmodifiableList(n);
                    a = a & 0xfffffeff;
                }
                a.c(a1, n);
            } else
            {
                a.c(a1, o.e());
            }
            a.b(a1, j1);
            l();
            return a1;
        }

        private i u()
        {
            if (c == null)
            {
                if (b == null)
                {
                    return i.l();
                } else
                {
                    return b;
                }
            } else
            {
                return (i)c.b();
            }
        }

        private d v()
        {
            if (e == null)
            {
                if (d == null)
                {
                    return d.m();
                } else
                {
                    return d;
                }
            } else
            {
                return (d)e.b();
            }
        }

        private void x()
        {
            if ((a & 0x40) != 64)
            {
                j = new ArrayList(j);
                a = a | 0x40;
            }
        }

        private bn y()
        {
            if (k == null)
            {
                List list = j;
                boolean flag;
                if ((a & 0x40) == 64)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                k = new bn(list, flag, p(), n());
                j = null;
            }
            return k;
        }

        private void z()
        {
            if ((a & 0x80) != 128)
            {
                l = new ArrayList(l);
                a = a | 0x80;
            }
        }

        public final com.c.b.a a(bd bd)
        {
            return d(bd);
        }

        public final com.c.b.a a(com.c.b.g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final a.a a(int i1)
        {
            a = a | 8;
            g = i1;
            q();
            return this;
        }

        public final a.a a(long l1)
        {
            a = a | 4;
            f = l1;
            q();
            return this;
        }

        public final a.a a(a a1)
        {
            Object obj1 = null;
            if (a1 == a.r())
            {
                return this;
            }
            Object obj;
            if (a1.h())
            {
                obj = a1.i();
                if (c == null)
                {
                    if ((a & 1) == 1 && b != null && b != i.l())
                    {
                        b = i.a(b).a(((i) (obj))).s();
                    } else
                    {
                        b = ((i) (obj));
                    }
                    q();
                } else
                {
                    c.b(((as) (obj)));
                }
                a = a | 1;
            }
            if (a1.j())
            {
                obj = a1.k();
                if (e == null)
                {
                    if ((a & 2) == 2 && d != null && d != d.m())
                    {
                        d = d.a(d).a(((d) (obj))).s();
                    } else
                    {
                        d = ((d) (obj));
                    }
                    q();
                } else
                {
                    e.b(((as) (obj)));
                }
                a = a | 2;
            }
            if (a1.l())
            {
                a(a1.m());
            }
            if (a1.n())
            {
                a(a1.o());
            }
            if (a1.p())
            {
                a = a | 0x10;
                h = a.a(a1);
                q();
            }
            if (!a.b(a1).isEmpty())
            {
                if (i.isEmpty())
                {
                    i = a.b(a1);
                    a = a & 0xffffffdf;
                } else
                {
                    if ((a & 0x20) != 32)
                    {
                        i = new ay(i);
                        a = a | 0x20;
                    }
                    i.addAll(a.b(a1));
                }
                q();
            }
            if (k == null)
            {
                if (!a.c(a1).isEmpty())
                {
                    if (j.isEmpty())
                    {
                        j = a.c(a1);
                        a = a & 0xffffffbf;
                    } else
                    {
                        x();
                        j.addAll(a.c(a1));
                    }
                    q();
                }
            } else
            if (!a.c(a1).isEmpty())
            {
                if (k.d())
                {
                    k.b();
                    k = null;
                    j = a.c(a1);
                    a = a & 0xffffffbf;
                    bn bn1;
                    if (a.x())
                    {
                        bn1 = y();
                    } else
                    {
                        bn1 = null;
                    }
                    k = bn1;
                } else
                {
                    k.a(a.c(a1));
                }
            }
            if (m == null)
            {
                if (!a.d(a1).isEmpty())
                {
                    if (l.isEmpty())
                    {
                        l = a.d(a1);
                        a = a & 0xffffff7f;
                    } else
                    {
                        z();
                        l.addAll(a.d(a1));
                    }
                    q();
                }
            } else
            if (!a.d(a1).isEmpty())
            {
                if (m.d())
                {
                    m.b();
                    m = null;
                    l = a.d(a1);
                    a = a & 0xffffff7f;
                    bn bn2;
                    if (a.y())
                    {
                        bn2 = A();
                    } else
                    {
                        bn2 = null;
                    }
                    m = bn2;
                } else
                {
                    m.a(a.d(a1));
                }
            }
            if (o == null)
            {
                if (!a.e(a1).isEmpty())
                {
                    if (n.isEmpty())
                    {
                        n = a.e(a1);
                        a = a & 0xfffffeff;
                    } else
                    {
                        B();
                        n.addAll(a.e(a1));
                    }
                    q();
                }
            } else
            if (!a.e(a1).isEmpty())
            {
                if (o.d())
                {
                    o.b();
                    o = null;
                    n = a.e(a1);
                    a = a & 0xfffffeff;
                    bn bn3 = obj1;
                    if (a.z())
                    {
                        bn3 = C();
                    }
                    o = bn3;
                } else
                {
                    o.a(a.e(a1));
                }
            }
            d(a.f(a1));
            q();
            return this;
        }

        public final a.a a(d d1)
        {
            if (e == null)
            {
                if (d1 == null)
                {
                    throw new NullPointerException();
                }
                d = d1;
                q();
            } else
            {
                e.a(d1);
            }
            a = a | 2;
            return this;
        }

        public final a.a a(i i1)
        {
            if (c == null)
            {
                if (i1 == null)
                {
                    throw new NullPointerException();
                }
                b = i1;
                q();
            } else
            {
                c.a(i1);
            }
            a = a | 1;
            return this;
        }

        public final a.a a(l.a a1)
        {
            if (k == null)
            {
                x();
                j.add(a1.r());
                q();
                return this;
            } else
            {
                k.a(a1.r());
                return this;
            }
        }

        public final a.a a(n.a a1)
        {
            if (o == null)
            {
                B();
                n.add(a1.r());
                q();
                return this;
            } else
            {
                o.a(a1.r());
                return this;
            }
        }

        public final a.a a(p.a a1)
        {
            if (m == null)
            {
                z();
                l.add(a1.r());
                q();
                return this;
            } else
            {
                m.a(a1.r());
                return this;
            }
        }

        public final boolean a()
        {
            boolean flag;
            if ((a & 4) == 4)
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
            if ((a & 8) == 8)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 == 0) goto _L1; else goto _L3
_L3:
            if ((a & 1) == 1)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0 && !u().a()) goto _L1; else goto _L4
_L4:
            if ((a & 2) == 2)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0 && !v().a()) goto _L1; else goto _L5
_L5:
            i1 = 0;
_L7:
            l l1;
            int j1;
            if (k == null)
            {
                j1 = j.size();
            } else
            {
                j1 = k.c();
            }
            if (i1 >= j1)
            {
                break MISSING_BLOCK_LABEL_193;
            }
            if (k == null)
            {
                l1 = (l)j.get(i1);
            } else
            {
                l1 = (l)k.a(i1);
            }
            if (!l1.a()) goto _L1; else goto _L6
_L6:
            i1++;
              goto _L7
            i1 = 0;
_L9:
            p p1;
            int k1;
            if (m == null)
            {
                k1 = l.size();
            } else
            {
                k1 = m.c();
            }
            if (i1 >= k1)
            {
                break MISSING_BLOCK_LABEL_278;
            }
            if (m == null)
            {
                p1 = (p)l.get(i1);
            } else
            {
                p1 = (p)m.a(i1);
            }
            if (!p1.a()) goto _L1; else goto _L8
_L8:
            i1++;
              goto _L9
            i1 = 0;
_L11:
            n n1;
            int i2;
            if (o == null)
            {
                i2 = n.size();
            } else
            {
                i2 = o.c();
            }
            if (i1 >= i2)
            {
                break MISSING_BLOCK_LABEL_363;
            }
            if (o == null)
            {
                n1 = (n)n.get(i1);
            } else
            {
                n1 = (n)o.a(i1);
            }
            if (!n1.a()) goto _L1; else goto _L10
_L10:
            i1++;
              goto _L11
            return true;
        }

        public final com.c.b.b.a b(com.c.b.g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final com.c.b.bd.a c(bd bd)
        {
            return d(bd);
        }

        public final com.c.b.be.a c(com.c.b.g g1, aq aq)
        {
            return d(g1, aq);
        }

        protected final com.c.b.as.g d()
        {
            return com.kik.d.b.a.f().a(com/kik/d/b/a$a, com/kik/d/b/a$a$a);
        }

        public final com.c.b.ak.a e()
        {
            return com.kik.d.b.a.e();
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

        public final a r()
        {
            a a1 = t();
            if (!a1.a())
            {
                throw b(a1);
            } else
            {
                return a1;
            }
        }

        public final bd w()
        {
            return a.r();
        }

        private a.a()
        {
            b = null;
            d = null;
            h = "";
            i = ay.a;
            j = Collections.emptyList();
            l = Collections.emptyList();
            n = Collections.emptyList();
            s();
        }

        a.a(byte byte0)
        {
            this();
        }

        private a.a(com.c.b.as.b b1)
        {
            super(b1);
            b = null;
            d = null;
            h = "";
            i = ay.a;
            j = Collections.emptyList();
            l = Collections.emptyList();
            n = Collections.emptyList();
            s();
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

    public static final class c extends Enum
        implements bl
    {

        private static com.c.b.au.b A = new com.kik.d.b.d();
        private static final c B[] = values();
        private static final c E[];
        public static final c a;
        public static final c b;
        public static final c c;
        public static final c d;
        public static final c e;
        public static final c f;
        public static final c g;
        public static final c h;
        public static final c i;
        public static final c j;
        public static final c k;
        public static final c l;
        public static final c m;
        public static final c n;
        public static final c o;
        public static final c p;
        public static final c q;
        public static final c r;
        public static final c s;
        public static final c t;
        public static final c u;
        public static final c v;
        public static final c w;
        public static final c x;
        public static final c y;
        public static final c z;
        private final int C;
        private final int D;

        public static c valueOf(String s1)
        {
            return (c)Enum.valueOf(com/kik/d/b/a$c, s1);
        }

        public static c[] values()
        {
            return (c[])E.clone();
        }

        public final int a()
        {
            return D;
        }

        static 
        {
            a = new c("PROFILE_PIC", 0, 0, 100);
            b = new c("NOTIFY_SOUND", 1, 1, 101);
            c = new c("NOTIFY_VIBRATION", 2, 2, 102);
            d = new c("NOTIFY_MESSAGE_PREVIEW", 3, 3, 103);
            e = new c("IGNORE_NEW_PEOPLE", 4, 4, 104);
            f = new c("TELL_SMS", 5, 5, 105);
            g = new c("TELL_EMAIL", 6, 6, 106);
            h = new c("TELL_SOCIAL", 7, 7, 107);
            i = new c("CHANGE_NAME", 8, 8, 108);
            j = new c("CHANGE_EMAIL", 9, 9, 109);
            k = new c("CHANGE_PASSWORD", 10, 10, 110);
            l = new c("RESET_KIK", 11, 11, 111);
            m = new c("ADDRESS_BOOK", 12, 12, 112);
            n = new c("BLOCK_LIST", 13, 13, 113);
            o = new c("BUBBLE_COLOR", 14, 14, 114);
            p = new c("ENTER_KEY_SEND", 15, 15, 115);
            q = new c("AUTO_ADD_ON_REPLY", 16, 16, 116);
            r = new c("HELP", 17, 17, 117);
            s = new c("UPDATE_KIK", 18, 18, 118);
            t = new c("LICENSES", 19, 19, 119);
            u = new c("PRIVACY_POLICY", 20, 20, 120);
            v = new c("DEVELOPER_MODE", 21, 21, 121);
            w = new c("TELL_OTHER", 22, 22, 122);
            x = new c("NOTIFY_LED_COLOR", 23, 23, 123);
            y = new c("NOTIFY_FOR_NEW_PEOPLE", 24, 24, 124);
            z = new c("AUTO_DOWNLOAD_VIDEOS", 25, 25, 125);
            E = (new c[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p, q, r, s, t, 
                u, v, w, x, y, z
            });
        }

        private c(String s1, int i1, int j1, int k1)
        {
            super(s1, i1);
            C = j1;
            D = k1;
        }
    }

    public static final class d extends as
        implements e
    {

        public static final bk c = new com.kik.d.b.e();
        private static final d k = new d();
        private int f;
        private int g;
        private volatile Object h;
        private byte i;
        private int j;

        static int a(d d1, int i1)
        {
            d1.g = i1;
            return i1;
        }

        public static a a(d d1)
        {
            return k.l().a(d1);
        }

        static Object a(d d1, Object obj)
        {
            d1.h = obj;
            return obj;
        }

        static int b(d d1, int i1)
        {
            d1.f = i1;
            return i1;
        }

        static Object b(d d1)
        {
            return d1.h;
        }

        static by c(d d1)
        {
            return d1.e;
        }

        public static a k()
        {
            return k.l();
        }

        public static d m()
        {
            return k;
        }

        static boolean n()
        {
            return d;
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

        protected final com.c.b.bd.a a(com.c.b.as.b b1)
        {
            return new a(b1, (byte)0);
        }

        public final void a(com.c.b.h h1)
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

        protected final com.c.b.as.g c_()
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
            f f2 = f.a(g);
            f f1 = f2;
            if (f2 == null)
            {
                f1 = f.a;
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

        public final com.c.b.bd.a u()
        {
            return k.l();
        }

        public final com.c.b.be.a v()
        {
            return l();
        }

        public final volatile bd w()
        {
            return k;
        }


        private d()
        {
            i = -1;
            j = -1;
            g = 300;
            h = "";
        }

        private d(com.c.b.as.a a1)
        {
            super(a1);
            i = -1;
            j = -1;
        }

        d(com.c.b.as.a a1, byte byte0)
        {
            this(a1);
        }

        private d(com.c.b.g g1, aq aq)
        {
            com.c.b.by.a a1;
            boolean flag;
            this();
            a1 = by.c();
            flag = false;
_L9:
            if (flag) goto _L2; else goto _L1
_L1:
            int i1 = g1.a();
            i1;
            JVM INSTR lookupswitch 3: default 213
        //                       0: 216
        //                       8: 78
        //                       18: 175;
               goto _L3 _L4 _L5 _L6
_L3:
            if (!a(g1, a1, aq, i1))
            {
                flag = true;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            i1 = g1.n();
            if (f.a(i1) == null)
            {
                a1.a(1, i1);
                continue; /* Loop/switch isn't completed */
            }
              goto _L7
            g1;
            throw new RuntimeException(g1.a(this));
            g1;
            e = a1.b();
            L();
            throw g1;
_L7:
            f = f | 1;
            g = i1;
            continue; /* Loop/switch isn't completed */
            g1;
            throw new RuntimeException((new av(g1.getMessage())).a(this));
_L6:
            com.c.b.f f1 = g1.l();
            f = f | 2;
            h = f1;
            continue; /* Loop/switch isn't completed */
_L2:
            e = a1.b();
            L();
            return;
_L4:
            flag = true;
            if (true) goto _L9; else goto _L8
_L8:
        }

        d(com.c.b.g g1, aq aq, byte byte0)
        {
            this(g1, aq);
        }
    }

    public static final class d.a extends com.c.b.as.a
        implements e
    {

        private int a;
        private int b;
        private Object c;

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

        private d.a d(com.c.b.g g1, aq aq)
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

        public final com.c.b.a a(bd bd)
        {
            return d(bd);
        }

        public final com.c.b.a a(com.c.b.g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final d.a a(d d1)
        {
            if (d1 == d.m())
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
                c = d.b(d1);
                q();
            }
            d(d.c(d1));
            q();
            return this;
        }

        public final d.a a(f f1)
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

        public final d.a a(String s1)
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

        public final com.c.b.b.a b(com.c.b.g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final com.c.b.bd.a c(bd bd)
        {
            return d(bd);
        }

        public final com.c.b.be.a c(com.c.b.g g1, aq aq)
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

        public final d r()
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

        public final d s()
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
            d.a(d1, c);
            d.b(d1, j1);
            l();
            return d1;
        }

        public final bd w()
        {
            return d.m();
        }

        private d.a()
        {
            b = 300;
            c = "";
            d.n();
        }

        d.a(byte byte0)
        {
            this();
        }

        private d.a(com.c.b.as.b b1)
        {
            super(b1);
            b = 300;
            c = "";
            d.n();
        }

        d.a(com.c.b.as.b b1, byte byte0)
        {
            this(b1);
        }
    }

    public static interface e
        extends bg
    {
    }

    public static final class f extends Enum
        implements bl
    {

        public static final f a;
        public static final f b;
        private static com.c.b.au.b c = new com.kik.d.b.f();
        private static final f d[] = values();
        private static final f g[];
        private final int e;
        private final int f;

        public static f a(int i1)
        {
            switch (i1)
            {
            default:
                return null;

            case 300: 
                return a;

            case 301: 
                return b;
            }
        }

        public static f valueOf(String s)
        {
            return (f)Enum.valueOf(com/kik/d/b/a$f, s);
        }

        public static f[] values()
        {
            return (f[])g.clone();
        }

        public final int a()
        {
            return f;
        }

        static 
        {
            a = new f("MESSAGE_SENT_CONFIRMED", 0, 0, 300);
            b = new f("PUSH_RECEIVED", 1, 1, 301);
            g = (new f[] {
                a, b
            });
        }

        private f(String s, int i1, int j1, int k1)
        {
            super(s, i1);
            e = j1;
            f = k1;
        }
    }

    public static final class g extends as
        implements h
    {

        public static final bk c = new com.kik.d.b.g();
        private static final g n = new g();
        private int f;
        private volatile Object g;
        private volatile Object h;
        private volatile Object i;
        private List j;
        private volatile Object k;
        private byte l;
        private int m;

        static int a(g g1, int i1)
        {
            g1.f = i1;
            return i1;
        }

        static Object a(g g1)
        {
            return g1.g;
        }

        static Object a(g g1, Object obj)
        {
            g1.g = obj;
            return obj;
        }

        static List a(g g1, List list)
        {
            g1.j = list;
            return list;
        }

        static Object b(g g1)
        {
            return g1.h;
        }

        static Object b(g g1, Object obj)
        {
            g1.h = obj;
            return obj;
        }

        static Object c(g g1)
        {
            return g1.i;
        }

        static Object c(g g1, Object obj)
        {
            g1.i = obj;
            return obj;
        }

        static Object d(g g1, Object obj)
        {
            g1.k = obj;
            return obj;
        }

        static List d(g g1)
        {
            return g1.j;
        }

        static Object e(g g1)
        {
            return g1.k;
        }

        static by f(g g1)
        {
            return g1.e;
        }

        public static a l()
        {
            return n.x();
        }

        public static g m()
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

        private com.c.b.f p()
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

        private com.c.b.f q()
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

        private com.c.b.f r()
        {
            Object obj = i;
            if (obj instanceof String)
            {
                obj = com.c.b.f.a((String)obj);
                i = obj;
                return ((com.c.b.f) (obj));
            } else
            {
                return (com.c.b.f)obj;
            }
        }

        private com.c.b.f s()
        {
            Object obj = k;
            if (obj instanceof String)
            {
                obj = com.c.b.f.a((String)obj);
                k = obj;
                return ((com.c.b.f) (obj));
            } else
            {
                return (com.c.b.f)obj;
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

        protected final com.c.b.bd.a a(com.c.b.as.b b1)
        {
            return new a(b1, (byte)0);
        }

        public final void a(com.c.b.h h1)
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
                    if (!((a)j.get(i1)).a())
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

        protected final com.c.b.as.g c_()
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

        public final com.c.b.bd.a u()
        {
            return n.x();
        }

        public final com.c.b.be.a v()
        {
            return x();
        }

        public final volatile bd w()
        {
            return n;
        }


        private g()
        {
            l = -1;
            m = -1;
            g = "";
            h = "";
            i = "";
            j = Collections.emptyList();
            k = "";
        }

        private g(com.c.b.as.a a1)
        {
            super(a1);
            l = -1;
            m = -1;
        }

        g(com.c.b.as.a a1, byte byte0)
        {
            this(a1);
        }

        private g(com.c.b.g g1, aq aq)
        {
            com.c.b.by.a a1;
            int i1;
            boolean flag;
            flag = false;
            this();
            a1 = by.c();
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
        //                       0: 571
        //                       10: 126
        //                       18: 241
        //                       34: 330
        //                       42: 411
        //                       50: 472;
               goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
            l1 = i1;
            k1 = i1;
            i2 = i1;
            if (!a(g1, a1, aq, j1))
            {
                flag = true;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            l1 = i1;
            k1 = i1;
            i2 = i1;
            com.c.b.f f1 = g1.l();
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
            e = a1.b();
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
            j.add(g1.a(a.c, aq));
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
            e = a1.b();
            L();
            return;
_L4:
            flag = true;
            if (true) goto _L13; else goto _L12
_L12:
        }

        g(com.c.b.g g1, aq aq, byte byte0)
        {
            this(g1, aq);
        }
    }

    public static final class g.a extends com.c.b.as.a
        implements h
    {

        private int a;
        private Object b;
        private Object c;
        private Object d;
        private List e;
        private bn f;
        private Object g;

        private g.a d(bd bd)
        {
            if (bd instanceof g)
            {
                return a((g)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private g.a d(com.c.b.g g1, aq aq)
        {
            g1 = (g)g.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (g)aq.a();
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
            if (g.n())
            {
                v();
            }
        }

        private g t()
        {
            int j1 = 1;
            g g1 = new g(this, (byte)0);
            int k1 = a;
            int i1;
            if ((k1 & 1) != 1)
            {
                j1 = 0;
            }
            g.a(g1, b);
            i1 = j1;
            if ((k1 & 2) == 2)
            {
                i1 = j1 | 2;
            }
            g.b(g1, c);
            j1 = i1;
            if ((k1 & 4) == 4)
            {
                j1 = i1 | 4;
            }
            g.c(g1, d);
            if (f == null)
            {
                if ((a & 8) == 8)
                {
                    e = Collections.unmodifiableList(e);
                    a = a & -9;
                }
                g.a(g1, e);
            } else
            {
                g.a(g1, f.e());
            }
            i1 = j1;
            if ((k1 & 0x10) == 16)
            {
                i1 = j1 | 8;
            }
            g.d(g1, g);
            g.a(g1, i1);
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

        public final com.c.b.a a(bd bd)
        {
            return d(bd);
        }

        public final com.c.b.a a(com.c.b.g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final g.a a(g g1)
        {
            bn bn1;
            bn1 = null;
            if (g1 == g.m())
            {
                return this;
            }
            if (g1.h())
            {
                a = a | 1;
                b = g.a(g1);
                q();
            }
            if (g1.i())
            {
                a = a | 2;
                c = g.b(g1);
                q();
            }
            if (g1.j())
            {
                a = a | 4;
                d = g.c(g1);
                q();
            }
            if (f != null) goto _L2; else goto _L1
_L1:
            if (!g.d(g1).isEmpty())
            {
                if (e.isEmpty())
                {
                    e = g.d(g1);
                    a = a & -9;
                } else
                {
                    u();
                    e.addAll(g.d(g1));
                }
                q();
            }
_L4:
            if (g1.k())
            {
                a = a | 0x10;
                g = g.e(g1);
                q();
            }
            d(g.f(g1));
            q();
            return this;
_L2:
            if (!g.d(g1).isEmpty())
            {
                if (f.d())
                {
                    f.b();
                    f = null;
                    e = g.d(g1);
                    a = a & -9;
                    if (g.o())
                    {
                        bn1 = v();
                    }
                    f = bn1;
                } else
                {
                    f.a(g.d(g1));
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final g.a a(Iterable iterable)
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

        public final g.a a(String s1)
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
            a a1;
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
                a1 = (a)e.get(i1);
            } else
            {
                a1 = (a)f.a(i1);
            }
            if (!a1.a()) goto _L1; else goto _L4
_L4:
            i1++;
              goto _L5
            return true;
        }

        public final com.c.b.b.a b(com.c.b.g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final g.a b(String s1)
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

        public final com.c.b.be.a c(com.c.b.g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final g.a c(String s1)
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

        public final g.a d(String s1)
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

        public final g r()
        {
            g g1 = t();
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
            return g.m();
        }

        private g.a()
        {
            b = "";
            c = "";
            d = "";
            e = Collections.emptyList();
            g = "";
            s();
        }

        g.a(byte byte0)
        {
            this();
        }

        private g.a(com.c.b.as.b b1)
        {
            super(b1);
            b = "";
            c = "";
            d = "";
            e = Collections.emptyList();
            g = "";
            s();
        }

        g.a(com.c.b.as.b b1, byte byte0)
        {
            this(b1);
        }
    }

    public static interface h
        extends bg
    {
    }

    public static final class i extends as
        implements j
    {

        public static final bk c = new com.kik.d.b.h();
        private static final i j = new i();
        private int f;
        private int g;
        private byte h;
        private int i;

        static int a(i i1, int j1)
        {
            i1.g = j1;
            return j1;
        }

        public static a a(i i1)
        {
            return j.k().a(i1);
        }

        static int b(i i1, int j1)
        {
            i1.f = j1;
            return j1;
        }

        static by b(i i1)
        {
            return i1.e;
        }

        public static a j()
        {
            return j.k();
        }

        public static i l()
        {
            return j;
        }

        static boolean m()
        {
            return d;
        }

        protected final com.c.b.bd.a a(com.c.b.as.b b1)
        {
            return new a(b1, (byte)0);
        }

        public final void a(com.c.b.h h1)
        {
            if ((f & 1) == 1)
            {
                h1.c(1, g);
            }
            e.a(h1);
        }

        public final boolean a()
        {
            byte byte0 = h;
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
                h = 0;
                return false;
            } else
            {
                h = 1;
                return true;
            }
        }

        public final int b()
        {
            int i1 = i;
            if (i1 != -1)
            {
                return i1;
            }
            i1 = 0;
            if ((f & 1) == 1)
            {
                i1 = com.c.b.h.f(1, g) + 0;
            }
            i1 += e.b();
            i = i1;
            return i1;
        }

        protected final com.c.b.as.g c_()
        {
            return com.kik.d.b.a.b().a(com/kik/d/b/a$i, com/kik/d/b/a$i$a);
        }

        public final by f()
        {
            return e;
        }

        public final boolean h()
        {
            return (f & 1) == 1;
        }

        public final k i()
        {
            k k2 = k.a(g);
            k k1 = k2;
            if (k2 == null)
            {
                k1 = k.a;
            }
            return k1;
        }

        public final a k()
        {
            if (this == j)
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
            return j.k();
        }

        public final com.c.b.be.a v()
        {
            return k();
        }

        public final volatile bd w()
        {
            return j;
        }


        private i()
        {
            h = -1;
            i = -1;
            g = 300;
        }

        private i(com.c.b.as.a a1)
        {
            super(a1);
            h = -1;
            i = -1;
        }

        i(com.c.b.as.a a1, byte byte0)
        {
            this(a1);
        }

        private i(com.c.b.g g1, aq aq)
        {
            com.c.b.by.a a1;
            boolean flag;
            this();
            a1 = by.c();
            flag = false;
_L8:
            if (flag) goto _L2; else goto _L1
_L1:
            int i1 = g1.a();
            i1;
            JVM INSTR lookupswitch 2: default 180
        //                       0: 183
        //                       8: 70;
               goto _L3 _L4 _L5
_L3:
            if (!a(g1, a1, aq, i1))
            {
                flag = true;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            i1 = g1.n();
            if (k.a(i1) == null)
            {
                a1.a(1, i1);
                continue; /* Loop/switch isn't completed */
            }
              goto _L6
            g1;
            throw new RuntimeException(g1.a(this));
            g1;
            e = a1.b();
            L();
            throw g1;
_L6:
            f = f | 1;
            g = i1;
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

        i(com.c.b.g g1, aq aq, byte byte0)
        {
            this(g1, aq);
        }
    }

    public static final class i.a extends com.c.b.as.a
        implements j
    {

        private int a;
        private int b;

        private i.a d(bd bd)
        {
            if (bd instanceof i)
            {
                return a((i)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private i.a d(com.c.b.g g1, aq aq)
        {
            g1 = (i)i.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (i)aq.a();
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

        public final com.c.b.a a(bd bd)
        {
            return d(bd);
        }

        public final com.c.b.a a(com.c.b.g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final i.a a(i i1)
        {
            if (i1 == i.l())
            {
                return this;
            }
            if (i1.h())
            {
                a(i1.i());
            }
            d(i.b(i1));
            q();
            return this;
        }

        public final i.a a(k k1)
        {
            if (k1 == null)
            {
                throw new NullPointerException();
            } else
            {
                a = a | 1;
                b = k1.a();
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
            return flag;
        }

        public final com.c.b.b.a b(com.c.b.g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final com.c.b.bd.a c(bd bd)
        {
            return d(bd);
        }

        public final com.c.b.be.a c(com.c.b.g g1, aq aq)
        {
            return d(g1, aq);
        }

        protected final com.c.b.as.g d()
        {
            return com.kik.d.b.a.b().a(com/kik/d/b/a$i, com/kik/d/b/a$i$a);
        }

        public final com.c.b.ak.a e()
        {
            return com.kik.d.b.a.a();
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

        public final i r()
        {
            i i1 = s();
            if (!i1.a())
            {
                throw b(i1);
            } else
            {
                return i1;
            }
        }

        public final i s()
        {
            int j1 = 1;
            i i1 = new i(this, (byte)0);
            if ((a & 1) != 1)
            {
                j1 = 0;
            }
            i.a(i1, b);
            i.b(i1, j1);
            l();
            return i1;
        }

        public final bd w()
        {
            return i.l();
        }

        private i.a()
        {
            b = 300;
            i.m();
        }

        i.a(byte byte0)
        {
            this();
        }

        private i.a(com.c.b.as.b b1)
        {
            super(b1);
            b = 300;
            i.m();
        }

        i.a(com.c.b.as.b b1, byte byte0)
        {
            this(b1);
        }
    }

    public static interface j
        extends bg
    {
    }

    public static final class k extends Enum
        implements bl
    {

        public static final k A;
        public static final k B;
        public static final k C;
        public static final k D;
        public static final k E;
        public static final k F;
        public static final k G;
        public static final k H;
        public static final k I;
        public static final k J;
        public static final k K;
        public static final k L;
        public static final k M;
        public static final k N;
        public static final k O;
        public static final k P;
        public static final k Q;
        public static final k R;
        public static final k S;
        public static final k T;
        public static final k U;
        public static final k V;
        public static final k W;
        public static final k X;
        public static final k Y;
        public static final k Z;
        public static final k a;
        public static final k aa;
        public static final k ab;
        public static final k ac;
        public static final k ad;
        public static final k ae;
        public static final k af;
        public static final k ag;
        public static final k ah;
        private static com.c.b.au.b ai = new com.kik.d.b.i();
        private static final k aj[] = values();
        private static final k am[];
        public static final k b;
        public static final k c;
        public static final k d;
        public static final k e;
        public static final k f;
        public static final k g;
        public static final k h;
        public static final k i;
        public static final k j;
        public static final k k;
        public static final k l;
        public static final k m;
        public static final k n;
        public static final k o;
        public static final k p;
        public static final k q;
        public static final k r;
        public static final k s;
        public static final k t;
        public static final k u;
        public static final k v;
        public static final k w;
        public static final k x;
        public static final k y;
        public static final k z;
        private final int ak;
        private final int al;

        public static k a(int i1)
        {
            switch (i1)
            {
            case 334: 
            case 335: 
            case 356: 
            case 357: 
            case 358: 
            case 359: 
            default:
                return null;

            case 300: 
                return a;

            case 301: 
                return b;

            case 302: 
                return c;

            case 303: 
                return d;

            case 304: 
                return e;

            case 305: 
                return f;

            case 306: 
                return g;

            case 307: 
                return h;

            case 308: 
                return i;

            case 309: 
                return j;

            case 310: 
                return k;

            case 311: 
                return l;

            case 312: 
                return m;

            case 313: 
                return n;

            case 314: 
                return o;

            case 315: 
                return p;

            case 316: 
                return q;

            case 317: 
                return r;

            case 318: 
                return s;

            case 319: 
                return t;

            case 320: 
                return u;

            case 321: 
                return v;

            case 322: 
                return w;

            case 323: 
                return x;

            case 324: 
                return y;

            case 325: 
                return z;

            case 326: 
                return A;

            case 327: 
                return B;

            case 328: 
                return C;

            case 329: 
                return D;

            case 330: 
                return E;

            case 331: 
                return F;

            case 332: 
                return G;

            case 333: 
                return H;

            case 336: 
                return I;

            case 337: 
                return J;

            case 338: 
                return K;

            case 339: 
                return L;

            case 340: 
                return M;

            case 341: 
                return N;

            case 342: 
                return O;

            case 343: 
                return P;

            case 344: 
                return Q;

            case 345: 
                return R;

            case 346: 
                return S;

            case 347: 
                return T;

            case 348: 
                return U;

            case 349: 
                return V;

            case 350: 
                return W;

            case 351: 
                return X;

            case 352: 
                return Y;

            case 353: 
                return Z;

            case 354: 
                return aa;

            case 355: 
                return ab;

            case 360: 
                return ac;

            case 361: 
                return ad;

            case 362: 
                return ae;

            case 363: 
                return af;

            case 364: 
                return ag;

            case 365: 
                return ah;
            }
        }

        public static k valueOf(String s1)
        {
            return (k)Enum.valueOf(com/kik/d/b/a$k, s1);
        }

        public static k[] values()
        {
            return (k[])am.clone();
        }

        public final int a()
        {
            return al;
        }

        static 
        {
            a = new k("DISCARDED_DATA", 0, 0, 300);
            b = new k("FIRST_EVER_RUN", 1, 1, 301);
            c = new k("SCREEN_VISITED", 2, 2, 302);
            d = new k("FIELD_VISITED", 3, 3, 303);
            e = new k("LOGIN_SUCCESS", 4, 4, 304);
            f = new k("LOGIN_ERROR", 5, 5, 305);
            g = new k("REGISTRATION_SUCCESS", 6, 6, 306);
            h = new k("REGISTRATION_ERROR", 7, 7, 307);
            i = new k("UNIT_TEST", 8, 8, 308);
            j = new k("AB_SELECTION", 9, 9, 309);
            k = new k("APP_OPENED", 10, 10, 310);
            l = new k("STREAM_INIT_COMPLETE", 11, 11, 311);
            m = new k("OPEN_CONVERSATIONS_CHANGED", 12, 12, 312);
            n = new k("MISSED_CONVERSATIONS_CHANGED", 13, 13, 313);
            o = new k("SIDEBAR_OPENED", 14, 14, 314);
            p = new k("CARD_LOADED", 15, 15, 315);
            q = new k("CARD_DELETED", 16, 16, 316);
            r = new k("CARD_ERROR_PROMPT_DISPLAYED", 17, 17, 317);
            s = new k("CARD_SWITCH_BEFORE_READY", 18, 18, 318);
            t = new k("CERTIFICATE_ERROR", 19, 19, 319);
            u = new k("CARD_FAVORITED", 20, 20, 320);
            v = new k("CARD_UNFAVORITED", 21, 21, 321);
            w = new k("SETTINGS_VISITED", 22, 22, 322);
            x = new k("USER_SEARCHED", 23, 23, 323);
            y = new k("EXPLICIT_SEARCH_SCREEN_VISITED", 24, 24, 324);
            z = new k("IAP_PURCHASE_SUCCESSFUL", 25, 25, 325);
            A = new k("IAP_PURCHASE_CANCELLED", 26, 26, 326);
            B = new k("IAP_PURCHASE_ERROR", 27, 27, 327);
            C = new k("MEDIA_TRAY_OPENED", 28, 28, 328);
            D = new k("MEDIA_TRAY_LAUNCHED_CARD", 29, 29, 329);
            E = new k("SMILEY_TRAY_OPENED", 30, 30, 330);
            F = new k("SMILEY_TRAY_SMILEY_SELECTED", 31, 31, 331);
            G = new k("PICKER_BACK_PRESSED", 32, 32, 332);
            H = new k("CONVO_OPENED", 33, 33, 333);
            I = new k("SEARCH_SUGGESTIONS_SHOWN", 34, 34, 336);
            J = new k("SEARCH_SUGGESTION_VISITED", 35, 35, 337);
            K = new k("SEARCH_ERROR", 36, 36, 338);
            L = new k("SEARCH_COMPLETED", 37, 37, 339);
            M = new k("SETTING_USED", 38, 38, 340);
            N = new k("STICKERS_OPENED_FROM_SMILEY", 39, 39, 341);
            O = new k("STICKERS_OPENED_FROM_TRAY", 40, 40, 342);
            P = new k("NETWORK_PING", 41, 41, 343);
            Q = new k("APP_READY", 42, 42, 344);
            R = new k("CONNECTION_FAILED_DIALOG_SHOWN", 43, 43, 345);
            S = new k("CHAT_BUBBLE_COLOR_OPENED", 44, 44, 346);
            T = new k("CHAT_BUBBLE_COLOR_CHANGED", 45, 45, 347);
            U = new k("MESSAGE_SENT", 46, 46, 348);
            V = new k("MESSAGE_DELETED", 47, 47, 349);
            W = new k("AB_TEST_JOINED", 48, 48, 350);
            X = new k("DEEP_LINK_TAPPED", 49, 49, 351);
            Y = new k("APP_CLOSED", 50, 50, 352);
            Z = new k("SCROLLED_CHATS_SCREEN", 51, 51, 353);
            aa = new k("SCROLLED_TALK_TO_SCREEN", 52, 52, 354);
            ab = new k("SCROLLED_MESSAGES_SCREEN", 53, 53, 355);
            ac = new k("LOADED_CHATS_SCREEN", 54, 54, 360);
            ad = new k("LOADED_TALK_TO_SCREEN", 55, 55, 361);
            ae = new k("LINK_WARNING_SHOWN_IGNORED", 56, 56, 362);
            af = new k("LINK_WARNING_SHOWN_ACCEPTED", 57, 57, 363);
            ag = new k("LINK_STATUS_TIMEOUT", 58, 58, 364);
            ah = new k("ADDRESS_BOOK_PROMPT", 59, 59, 365);
            am = (new k[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p, q, r, s, t, 
                u, v, w, x, y, z, A, B, C, D, 
                E, F, G, H, I, J, K, L, M, N, 
                O, P, Q, R, S, T, U, V, W, X, 
                Y, Z, aa, ab, ac, ad, ae, af, ag, ah
            });
        }

        private k(String s1, int i1, int j1, int k1)
        {
            super(s1, i1);
            ak = j1;
            al = k1;
        }
    }

    public static final class l extends as
        implements m
    {

        public static final bk c = new com.kik.d.b.j();
        private static final l k = new l();
        private int f;
        private volatile Object g;
        private volatile Object h;
        private byte i;
        private int j;

        static int a(l l1, int i1)
        {
            l1.f = i1;
            return i1;
        }

        static Object a(l l1)
        {
            return l1.g;
        }

        static Object a(l l1, Object obj)
        {
            l1.g = obj;
            return obj;
        }

        static Object b(l l1)
        {
            return l1.h;
        }

        static Object b(l l1, Object obj)
        {
            l1.h = obj;
            return obj;
        }

        static by c(l l1)
        {
            return l1.e;
        }

        public static a j()
        {
            return k.o();
        }

        public static l k()
        {
            return k;
        }

        static boolean l()
        {
            return d;
        }

        private com.c.b.f m()
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

        private com.c.b.f n()
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

        protected final com.c.b.bd.a a(com.c.b.as.b b1)
        {
            return new a(b1, (byte)0);
        }

        public final void a(com.c.b.h h1)
        {
            if ((f & 1) == 1)
            {
                h1.a(1, m());
            }
            if ((f & 2) == 2)
            {
                h1.a(2, n());
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
                i1 = com.c.b.h.c(1, m()) + 0;
            }
            int j1 = i1;
            if ((f & 2) == 2)
            {
                j1 = i1 + com.c.b.h.c(2, n());
            }
            i1 = j1 + e.b();
            j = i1;
            return i1;
        }

        protected final com.c.b.as.g c_()
        {
            return com.kik.d.b.a.j().a(com/kik/d/b/a$l, com/kik/d/b/a$l$a);
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

        public final bk t()
        {
            return c;
        }

        public final com.c.b.bd.a u()
        {
            return k.o();
        }

        public final com.c.b.be.a v()
        {
            return o();
        }

        public final volatile bd w()
        {
            return k;
        }


        private l()
        {
            i = -1;
            j = -1;
            g = "";
            h = "";
        }

        private l(com.c.b.as.a a1)
        {
            super(a1);
            i = -1;
            j = -1;
        }

        l(com.c.b.as.a a1, byte byte0)
        {
            this(a1);
        }

        private l(com.c.b.g g1, aq aq)
        {
            com.c.b.by.a a1;
            boolean flag;
            this();
            a1 = by.c();
            flag = false;
_L8:
            if (flag) goto _L2; else goto _L1
_L1:
            int i1 = g1.a();
            i1;
            JVM INSTR lookupswitch 3: default 194
        //                       0: 197
        //                       10: 78
        //                       18: 132;
               goto _L3 _L4 _L5 _L6
_L3:
            if (!a(g1, a1, aq, i1))
            {
                flag = true;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            com.c.b.f f1 = g1.l();
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
            com.c.b.f f2 = g1.l();
            f = f | 2;
            h = f2;
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

        l(com.c.b.g g1, aq aq, byte byte0)
        {
            this(g1, aq);
        }
    }

    public static final class l.a extends com.c.b.as.a
        implements m
    {

        private int a;
        private Object b;
        private Object c;

        private l.a d(bd bd)
        {
            if (bd instanceof l)
            {
                return a((l)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private l.a d(com.c.b.g g1, aq aq)
        {
            g1 = (l)l.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (l)aq.a();
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

        private l s()
        {
            int i1 = 1;
            l l1 = new l(this, (byte)0);
            int k1 = a;
            int j1;
            if ((k1 & 1) != 1)
            {
                i1 = 0;
            }
            l.a(l1, b);
            j1 = i1;
            if ((k1 & 2) == 2)
            {
                j1 = i1 | 2;
            }
            l.b(l1, c);
            l.a(l1, j1);
            l();
            return l1;
        }

        public final com.c.b.a a(bd bd)
        {
            return d(bd);
        }

        public final com.c.b.a a(com.c.b.g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final l.a a(l l1)
        {
            if (l1 == l.k())
            {
                return this;
            }
            if (l1.h())
            {
                a = a | 1;
                b = l.a(l1);
                q();
            }
            if (l1.i())
            {
                a = a | 2;
                c = l.b(l1);
                q();
            }
            d(l.c(l1));
            q();
            return this;
        }

        public final l.a a(String s1)
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

        public final com.c.b.b.a b(com.c.b.g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final l.a b(String s1)
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

        public final com.c.b.be.a c(com.c.b.g g1, aq aq)
        {
            return d(g1, aq);
        }

        protected final com.c.b.as.g d()
        {
            return com.kik.d.b.a.j().a(com/kik/d/b/a$l, com/kik/d/b/a$l$a);
        }

        public final com.c.b.ak.a e()
        {
            return com.kik.d.b.a.i();
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

        public final l r()
        {
            l l1 = s();
            if (!l1.a())
            {
                throw b(l1);
            } else
            {
                return l1;
            }
        }

        public final bd w()
        {
            return l.k();
        }

        private l.a()
        {
            b = "";
            c = "";
            l.l();
        }

        l.a(byte byte0)
        {
            this();
        }

        private l.a(com.c.b.as.b b1)
        {
            super(b1);
            b = "";
            c = "";
            l.l();
        }

        l.a(com.c.b.as.b b1, byte byte0)
        {
            this(b1);
        }
    }

    public static interface m
        extends bg
    {
    }

    public static final class n extends as
        implements o
    {

        public static final bk c = new com.kik.d.b.k();
        private static final n k = new n();
        private int f;
        private volatile Object g;
        private az h;
        private byte i;
        private int j;

        static int a(n n1, int i1)
        {
            n1.f = i1;
            return i1;
        }

        static az a(n n1, az az1)
        {
            n1.h = az1;
            return az1;
        }

        static Object a(n n1)
        {
            return n1.g;
        }

        static Object a(n n1, Object obj)
        {
            n1.g = obj;
            return obj;
        }

        static az b(n n1)
        {
            return n1.h;
        }

        static by c(n n1)
        {
            return n1.e;
        }

        public static a i()
        {
            return k.m();
        }

        public static n j()
        {
            return k;
        }

        static boolean k()
        {
            return d;
        }

        private com.c.b.f l()
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

        public final void a(com.c.b.h h1)
        {
            if ((f & 1) == 1)
            {
                h1.a(1, l());
            }
            for (int i1 = 0; i1 < h.size(); i1++)
            {
                h1.a(2, h.a(i1));
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
            } else
            {
                i = 1;
                return true;
            }
        }

        public final int b()
        {
            int j1 = 0;
            int i1 = j;
            if (i1 != -1)
            {
                return i1;
            }
            int k1;
            if ((f & 1) == 1)
            {
                i1 = com.c.b.h.c(1, l()) + 0;
            } else
            {
                i1 = 0;
            }
            k1 = 0;
            for (; j1 < h.size(); j1++)
            {
                k1 += com.c.b.h.b(h.a(j1));
            }

            i1 = i1 + k1 + h.size() * 1 + e.b();
            j = i1;
            return i1;
        }

        protected final com.c.b.as.g c_()
        {
            return com.kik.d.b.a.n().a(com/kik/d/b/a$n, com/kik/d/b/a$n$a);
        }

        public final by f()
        {
            return e;
        }

        public final boolean h()
        {
            return (f & 1) == 1;
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


        private n()
        {
            i = -1;
            j = -1;
            g = "";
            h = ay.a;
        }

        private n(com.c.b.as.a a1)
        {
            super(a1);
            i = -1;
            j = -1;
        }

        n(com.c.b.as.a a1, byte byte0)
        {
            this(a1);
        }

        private n(com.c.b.g g1, aq aq)
        {
            com.c.b.by.a a1;
            int i1;
            boolean flag;
            i1 = 0;
            this();
            a1 = by.c();
            flag = false;
_L11:
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
            JVM INSTR lookupswitch 3: default 376
        //                       0: 379
        //                       10: 102
        //                       18: 217;
               goto _L3 _L4 _L5 _L6
_L3:
            k1 = i1;
            l1 = i1;
            i2 = i1;
            if (!a(g1, a1, aq, j1))
            {
                flag = true;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            k1 = i1;
            l1 = i1;
            i2 = i1;
            com.c.b.f f1 = g1.l();
            k1 = i1;
            l1 = i1;
            i2 = i1;
            f = f | 1;
            k1 = i1;
            l1 = i1;
            i2 = i1;
            g = f1;
            continue; /* Loop/switch isn't completed */
            g1;
            i1 = k1;
            throw new RuntimeException(g1.a(this));
            g1;
_L9:
            if ((i1 & 2) == 2)
            {
                h = h.e();
            }
            e = a1.b();
            L();
            throw g1;
_L6:
            k1 = i1;
            l1 = i1;
            i2 = i1;
            f1 = g1.l();
            j1 = i1;
            if ((i1 & 2) == 2) goto _L8; else goto _L7
_L7:
            k1 = i1;
            l1 = i1;
            i2 = i1;
            h = new ay();
            j1 = i1 | 2;
_L8:
            k1 = j1;
            l1 = j1;
            i2 = j1;
            h.a(f1);
            i1 = j1;
            continue; /* Loop/switch isn't completed */
            g1;
            i1 = l1;
            throw new RuntimeException((new av(g1.getMessage())).a(this));
_L2:
            if ((i1 & 2) == 2)
            {
                h = h.e();
            }
            e = a1.b();
            L();
            return;
            g1;
            i1 = i2;
              goto _L9
_L4:
            flag = true;
            if (true) goto _L11; else goto _L10
_L10:
        }

        n(com.c.b.g g1, aq aq, byte byte0)
        {
            this(g1, aq);
        }
    }

    public static final class n.a extends com.c.b.as.a
        implements o
    {

        private int a;
        private Object b;
        private az c;

        private n.a d(bd bd)
        {
            if (bd instanceof n)
            {
                return a((n)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private n.a d(com.c.b.g g1, aq aq)
        {
            g1 = (n)n.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (n)aq.a();
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

        private n s()
        {
            int i1 = 1;
            n n1 = new n(this, (byte)0);
            if ((a & 1) != 1)
            {
                i1 = 0;
            }
            n.a(n1, b);
            if ((a & 2) == 2)
            {
                c = c.e();
                a = a & -3;
            }
            n.a(n1, c);
            n.a(n1, i1);
            l();
            return n1;
        }

        private void t()
        {
            if ((a & 2) != 2)
            {
                c = new ay(c);
                a = a | 2;
            }
        }

        public final com.c.b.a a(bd bd)
        {
            return d(bd);
        }

        public final com.c.b.a a(com.c.b.g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final n.a a(n n1)
        {
            if (n1 == n.j())
            {
                return this;
            }
            if (n1.h())
            {
                a = a | 1;
                b = n.a(n1);
                q();
            }
            if (!n.b(n1).isEmpty())
            {
                if (c.isEmpty())
                {
                    c = n.b(n1);
                    a = a & -3;
                } else
                {
                    t();
                    c.addAll(n.b(n1));
                }
                q();
            }
            d(n.c(n1));
            q();
            return this;
        }

        public final n.a a(Iterable iterable)
        {
            t();
            com.c.b.b.a.a(iterable, c);
            q();
            return this;
        }

        public final n.a a(String s1)
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
            return flag;
        }

        public final com.c.b.b.a b(com.c.b.g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final com.c.b.bd.a c(bd bd)
        {
            return d(bd);
        }

        public final com.c.b.be.a c(com.c.b.g g1, aq aq)
        {
            return d(g1, aq);
        }

        protected final com.c.b.as.g d()
        {
            return com.kik.d.b.a.n().a(com/kik/d/b/a$n, com/kik/d/b/a$n$a);
        }

        public final com.c.b.ak.a e()
        {
            return com.kik.d.b.a.m();
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

        public final n r()
        {
            n n1 = s();
            if (!n1.a())
            {
                throw b(n1);
            } else
            {
                return n1;
            }
        }

        public final bd w()
        {
            return n.j();
        }

        private n.a()
        {
            b = "";
            c = ay.a;
            n.k();
        }

        n.a(byte byte0)
        {
            this();
        }

        private n.a(com.c.b.as.b b1)
        {
            super(b1);
            b = "";
            c = ay.a;
            n.k();
        }

        n.a(com.c.b.as.b b1, byte byte0)
        {
            this(b1);
        }
    }

    public static interface o
        extends bg
    {
    }

    public static final class p extends as
        implements q
    {

        public static final bk c = new com.kik.d.b.l();
        private static final p k = new p();
        private int f;
        private volatile Object g;
        private long h;
        private byte i;
        private int j;

        static int a(p p1, int i1)
        {
            p1.f = i1;
            return i1;
        }

        static long a(p p1, long l1)
        {
            p1.h = l1;
            return l1;
        }

        static Object a(p p1)
        {
            return p1.g;
        }

        static Object a(p p1, Object obj)
        {
            p1.g = obj;
            return obj;
        }

        static by b(p p1)
        {
            return p1.e;
        }

        public static a k()
        {
            return k.o();
        }

        public static p l()
        {
            return k;
        }

        static boolean m()
        {
            return d;
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

        protected final com.c.b.bd.a a(com.c.b.as.b b1)
        {
            return new a(b1, (byte)0);
        }

        public final void a(com.c.b.h h1)
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

        protected final com.c.b.as.g c_()
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

        public final com.c.b.bd.a u()
        {
            return k.o();
        }

        public final com.c.b.be.a v()
        {
            return o();
        }

        public final volatile bd w()
        {
            return k;
        }


        private p()
        {
            i = -1;
            j = -1;
            g = "";
            h = 0L;
        }

        private p(com.c.b.as.a a1)
        {
            super(a1);
            i = -1;
            j = -1;
        }

        p(com.c.b.as.a a1, byte byte0)
        {
            this(a1);
        }

        private p(com.c.b.g g1, aq aq)
        {
            com.c.b.by.a a1;
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
            com.c.b.f f1 = g1.l();
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
            h = g1.e();
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

        p(com.c.b.g g1, aq aq, byte byte0)
        {
            this(g1, aq);
        }
    }

    public static final class p.a extends com.c.b.as.a
        implements q
    {

        private int a;
        private Object b;
        private long c;

        private p.a d(bd bd)
        {
            if (bd instanceof p)
            {
                return a((p)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private p.a d(com.c.b.g g1, aq aq)
        {
            g1 = (p)p.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (p)aq.a();
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

        private p s()
        {
            int i1 = 1;
            p p1 = new p(this, (byte)0);
            int k1 = a;
            int j1;
            if ((k1 & 1) != 1)
            {
                i1 = 0;
            }
            p.a(p1, b);
            j1 = i1;
            if ((k1 & 2) == 2)
            {
                j1 = i1 | 2;
            }
            p.a(p1, c);
            p.a(p1, j1);
            l();
            return p1;
        }

        public final com.c.b.a a(bd bd)
        {
            return d(bd);
        }

        public final com.c.b.a a(com.c.b.g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final p.a a(long l1)
        {
            a = a | 2;
            c = l1;
            q();
            return this;
        }

        public final p.a a(p p1)
        {
            if (p1 == p.l())
            {
                return this;
            }
            if (p1.h())
            {
                a = a | 1;
                b = p.a(p1);
                q();
            }
            if (p1.i())
            {
                a(p1.j());
            }
            d(p.b(p1));
            q();
            return this;
        }

        public final p.a a(String s1)
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

        public final com.c.b.b.a b(com.c.b.g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final com.c.b.bd.a c(bd bd)
        {
            return d(bd);
        }

        public final com.c.b.be.a c(com.c.b.g g1, aq aq)
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

        public final p r()
        {
            p p1 = s();
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
            return p.l();
        }

        private p.a()
        {
            b = "";
            p.m();
        }

        p.a(byte byte0)
        {
            this();
        }

        private p.a(com.c.b.as.b b1)
        {
            super(b1);
            b = "";
            p.m();
        }

        p.a(com.c.b.as.b b1, byte byte0)
        {
            this(b1);
        }
    }

    public static interface q
        extends bg
    {
    }


    private static com.c.b.ak.a a;
    private static com.c.b.as.g b;
    private static com.c.b.ak.a c;
    private static com.c.b.as.g d;
    private static com.c.b.ak.a e;
    private static com.c.b.as.g f;
    private static com.c.b.ak.a g;
    private static com.c.b.as.g h;
    private static com.c.b.ak.a i;
    private static com.c.b.as.g j;
    private static com.c.b.ak.a k;
    private static com.c.b.as.g l;
    private static com.c.b.ak.a m;
    private static com.c.b.as.g n;
    private static com.c.b.ak.g o;

    static com.c.b.ak.a a()
    {
        return a;
    }

    static com.c.b.ak.g a(com.c.b.ak.g g1)
    {
        o = g1;
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

    static com.c.b.ak.a g()
    {
        return g;
    }

    static com.c.b.as.g h()
    {
        return h;
    }

    static com.c.b.ak.a i()
    {
        return i;
    }

    static com.c.b.as.g j()
    {
        return j;
    }

    static com.c.b.ak.a k()
    {
        return k;
    }

    static com.c.b.as.g l()
    {
        return l;
    }

    static com.c.b.ak.a m()
    {
        return m;
    }

    static com.c.b.as.g n()
    {
        return n;
    }

    static 
    {
        com.kik.d.b.b b1 = new com.kik.d.b.b();
        com.c.b.ak.g.a(new String[] {
            "\n\023clientmetrics.proto\022\025com.kik.clientmetrics\"K\n\017ClientUserEvent\0228\n\004type\030\001 \002(\0162*.com.kik.clientmetrics.ClientUserEventType\"a\n\021ClientPacketEvent\022:\n\004type\030\001 \002(\0162,.com.kik.clientmetrics.ClientPacketEventType\022\020\n\bpacketId\030\002 \002(\t\"\371\002\n\017ClientEventData\0229\n\tuserEvent\030\001 \001(\0132&.com.kik.clientmetrics.ClientUserEvent\022=\n\013packetEvent\030\002 \001(\0132(.com.kik.clientmetrics.ClientPacketEvent\022\021\n\ttimestamp\030\003 \002(\003\022\022\n\ninstanceId\030\004 \002(", "\017\022\025\n\rrelatedPacket\030\006 \001(\t\022\027\n\017relatedUserJids\030\007 \003(\t\022)\n\004data\030\b \003(\0132\033.com.kik.clientmetrics.Data\0227\n\013numericData\030\t \003(\0132\".com.kik.clientmetrics.NumericData\0221\n\blistData\030\n \003(\0132\037.com.kik.clientmetrics.ListData\"\237\001\n\023ClientUploadRequest\022\016\n\006userId\030\001 \002(\t\022\024\n\fdevicePrefix\030\002 \002(\t\022\025\n\rclientVersion\030\005 \001(\t\0226\n\006events\030\004 \003(\0132&.com.kik.clientmetrics.ClientEventData\022\023\n\013anonymousId\030\006 \001(\t\"\034\n\004Data\022\t\n\001k\030\001 \002(\t\022\t\n\001v\030\002 \002(\t\"#\n\013Nume", "ricData\022\t\n\001k\030\001 \002(\t\022\t\n\001v\030\002 \002(\003\" \n\bListData\022\t\n\001k\030\001 \002(\t\022\t\n\001v\030\002 \003(\t*\210\f\n\023ClientUserEventType\022\023\n\016DISCARDED_DATA\020\254\002\022\023\n\016FIRST_EVER_RUN\020\255\002\022\023\n\016SCREEN_VISITED\020\256\002\022\022\n\rFIELD_VISITED\020\257\002\022\022\n\rLOGIN_SUCCESS\020\260\002\022\020\n\013LOGIN_ERROR\020\261\002\022\031\n\024REGISTRATION_SUCCESS\020\262\002\022\027\n\022REGISTRATION_ERROR\020\263\002\022\016\n\tUNIT_TEST\020\264\002\022\021\n\fAB_SELECTION\020\265\002\022\017\n\nAPP_OPENED\020\266\002\022\031\n\024STREAM_INIT_COMPLETE\020\267\002\022\037\n\032OPEN_CONVERSATIONS_CHANGED\020\270\002\022!\n\034MISSED_CONVERSATIONS_CHA", "NGED\020\271\002\022\023\n\016SIDEBAR_OPENED\020\272\002\022\020\n\013CARD_LOADED\020\273\002\022\021\n\fCARD_DELETED\020\274\002\022 \n\033CARD_ERROR_PROMPT_DISPLAYED\020\275\002\022\035\n\030CARD_SWITCH_BEFORE_READY\020\276\002\022\026\n\021CERTIFICATE_ERROR\020\277\002\022\023\n\016CARD_FAVORITED\020\300\002\022\025\n\020CARD_UNFAVORITED\020\301\002\022\025\n\020SETTINGS_VISITED\020\302\002\022\022\n\rUSER_SEARCHED\020\303\002\022#\n\036EXPLICIT_SEARCH_SCREEN_VISITED\020\304\002\022\034\n\027IAP_PURCHASE_SUCCESSFUL\020\305\002\022\033\n\026IAP_PURCHASE_CANCELLED\020\306\002\022\027\n\022IAP_PURCHASE_ERROR\020\307\002\022\026\n\021MEDIA_TRAY_OPENED\020\310\002\022\035\n\030MEDIA_TRAY", "_LAUNCHED_CARD\020\311\002\022\027\n\022SMILEY_TRAY_OPENED\020\312\002\022 \n\033SMILEY_TRAY_SMILEY_SELECTED\020\313\002\022\030\n\023PICKER_BACK_PRESSED\020\314\002\022\021\n\fCONVO_OPENED\020\315\002\022\035\n\030SEARCH_SUGGESTIONS_SHOWN\020\320\002\022\036\n\031SEARCH_SUGGESTION_VISITED\020\321\002\022\021\n\fSEARCH_ERROR\020\322\002\022\025\n\020SEARCH_COMPLETED\020\323\002\022\021\n\fSETTING_USED\020\324\002\022 \n\033STICKERS_OPENED_FROM_SMILEY\020\325\002\022\036\n\031STICKERS_OPENED_FROM_TRAY\020\326\002\022\021\n\fNETWORK_PING\020\327\002\022\016\n\tAPP_READY\020\330\002\022#\n\036CONNECTION_FAILED_DIALOG_SHOWN\020\331\002\022\035\n\030CHAT_BUBBLE_C", "OLOR_OPENED\020\332\002\022\036\n\031CHAT_BUBBLE_COLOR_CHANGED\020\333\002\022\021\n\fMESSAGE_SENT\020\334\002\022\024\n\017MESSAGE_DELETED\020\335\002\022\023\n\016AB_TEST_JOINED\020\336\002\022\025\n\020DEEP_LINK_TAPPED\020\337\002\022\017\n\nAPP_CLOSED\020\340\002\022\032\n\025SCROLLED_CHATS_SCREEN\020\341\002\022\034\n\027SCROLLED_TALK_TO_SCREEN\020\342\002\022\035\n\030SCROLLED_MESSAGES_SCREEN\020\343\002\022\030\n\023LOADED_CHATS_SCREEN\020\350\002\022\032\n\025LOADED_TALK_TO_SCREEN\020\351\002\022\037\n\032LINK_WARNING_SHOWN_IGNORED\020\352\002\022 \n\033LINK_WARNING_SHOWN_ACCEPTED\020\353\002\022\030\n\023LINK_STATUS_TIMEOUT\020\354\002\022\030\n\023ADDRESS_BOOK", "_PROMPT\020\355\002*H\n\025ClientPacketEventType\022\033\n\026MESSAGE_SENT_CONFIRMED\020\254\002\022\022\n\rPUSH_RECEIVED\020\255\002*\213\004\n\035ClientMetricsSettingsUsedType\022\017\n\013PROFILE_PIC\020d\022\020\n\fNOTIFY_SOUND\020e\022\024\n\020NOTIFY_VIBRATION\020f\022\032\n\026NOTIFY_MESSAGE_PREVIEW\020g\022\025\n\021IGNORE_NEW_PEOPLE\020h\022\f\n\bTELL_SMS\020i\022\016\n\nTELL_EMAIL\020j\022\017\n\013TELL_SOCIAL\020k\022\017\n\013CHANGE_NAME\020l\022\020\n\fCHANGE_EMAIL\020m\022\023\n\017CHANGE_PASSWORD\020n\022\r\n\tRESET_KIK\020o\022\020\n\fADDRESS_BOOK\020p\022\016\n\nBLOCK_LIST\020q\022\020\n\fBUBBLE_COLOR\020r\022\022\n\016", "ENTER_KEY_SEND\020s\022\025\n\021AUTO_ADD_ON_REPLY\020t\022\b\n\004HELP\020u\022\016\n\nUPDATE_KIK\020v\022\f\n\bLICENSES\020w\022\022\n\016PRIVACY_POLICY\020x\022\022\n\016DEVELOPER_MODE\020y\022\016\n\nTELL_OTHER\020z\022\024\n\020NOTIFY_LED_COLOR\020{\022\031\n\025NOTIFY_FOR_NEW_PEOPLE\020|\022\030\n\024AUTO_DOWNLOAD_VIDEOS\020}B\037\n\033com.kik.clientmetrics.modelH\001"
        }, new com.c.b.ak.g[0], b1);
        a = (com.c.b.ak.a)o.g().get(0);
        b = new com.c.b.as.g(a, new String[] {
            "Type"
        });
        c = (com.c.b.ak.a)o.g().get(1);
        d = new com.c.b.as.g(c, new String[] {
            "Type", "PacketId"
        });
        e = (com.c.b.ak.a)o.g().get(2);
        f = new com.c.b.as.g(e, new String[] {
            "UserEvent", "PacketEvent", "Timestamp", "InstanceId", "RelatedPacket", "RelatedUserJids", "Data", "NumericData", "ListData"
        });
        g = (com.c.b.ak.a)o.g().get(3);
        h = new com.c.b.as.g(g, new String[] {
            "UserId", "DevicePrefix", "ClientVersion", "Events", "AnonymousId"
        });
        i = (com.c.b.ak.a)o.g().get(4);
        j = new com.c.b.as.g(i, new String[] {
            "K", "V"
        });
        k = (com.c.b.ak.a)o.g().get(5);
        l = new com.c.b.as.g(k, new String[] {
            "K", "V"
        });
        m = (com.c.b.ak.a)o.g().get(6);
        n = new com.c.b.as.g(m, new String[] {
            "K", "V"
        });
    }
}
