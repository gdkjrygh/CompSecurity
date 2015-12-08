// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.c.b:
//            as, i, x, ay, 
//            av, by, g, az, 
//            f, bk, h, be, 
//            bm, aq, bd, bp, 
//            bn

public static final class <init> extends as
    implements <init>
{
    public static final class a extends as.a
        implements i.p
    {

        private int a;
        private Object b;
        private Object c;
        private az d;
        private List e;
        private List f;
        private List g;
        private bn h;
        private List i;
        private bn j;
        private List k;
        private bn l;
        private List m;
        private bn n;
        private i.q o;
        private bp p;
        private i.ae q;
        private bp r;
        private Object s;

        private a d(bd bd)
        {
            if (bd instanceof i.o)
            {
                return a((i.o)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private a d(g g1, aq aq)
        {
            g1 = (i.o)i.o.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (i.o)aq.a();
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
                v();
                x();
                y();
                if (p == null)
                {
                    p = new bp(z(), p(), n());
                    o = null;
                }
                if (r == null)
                {
                    i.ae ae;
                    if (r == null)
                    {
                        if (q == null)
                        {
                            ae = com.c.b.i.ae.i();
                        } else
                        {
                            ae = q;
                        }
                    } else
                    {
                        ae = (i.ae)r.b();
                    }
                    r = new bp(ae, p(), n());
                    q = null;
                }
            }
        }

        private i.o s()
        {
            int i1 = 1;
            i.o o1 = new i.o(this, (byte)0);
            int k1 = a;
            int j1;
            if ((k1 & 1) != 1)
            {
                i1 = 0;
            }
            i.o.a(o1, b);
            j1 = i1;
            if ((k1 & 2) == 2)
            {
                j1 = i1 | 2;
            }
            i.o.b(o1, c);
            if ((a & 4) == 4)
            {
                d = d.e();
                a = a & -5;
            }
            i.o.a(o1, d);
            if ((a & 8) == 8)
            {
                e = Collections.unmodifiableList(e);
                a = a & -9;
            }
            i.o.a(o1, e);
            if ((a & 0x10) == 16)
            {
                f = Collections.unmodifiableList(f);
                a = a & 0xffffffef;
            }
            i.o.b(o1, f);
            if (h == null)
            {
                if ((a & 0x20) == 32)
                {
                    g = Collections.unmodifiableList(g);
                    a = a & 0xffffffdf;
                }
                i.o.c(o1, g);
            } else
            {
                i.o.c(o1, h.e());
            }
            if (j == null)
            {
                if ((a & 0x40) == 64)
                {
                    i = Collections.unmodifiableList(i);
                    a = a & 0xffffffbf;
                }
                i.o.d(o1, i);
            } else
            {
                i.o.d(o1, j.e());
            }
            if (l == null)
            {
                if ((a & 0x80) == 128)
                {
                    k = Collections.unmodifiableList(k);
                    a = a & 0xffffff7f;
                }
                i.o.e(o1, k);
            } else
            {
                i.o.e(o1, l.e());
            }
            if (n == null)
            {
                if ((a & 0x100) == 256)
                {
                    m = Collections.unmodifiableList(m);
                    a = a & 0xfffffeff;
                }
                i.o.f(o1, m);
            } else
            {
                i.o.f(o1, n.e());
            }
            if ((k1 & 0x200) == 512)
            {
                j1 |= 4;
            }
            if (p == null)
            {
                i.o.a(o1, o);
            } else
            {
                i.o.a(o1, (i.q)p.c());
            }
            i1 = j1;
            if ((k1 & 0x400) == 1024)
            {
                i1 = j1 | 8;
            }
            if (r == null)
            {
                i.o.a(o1, q);
            } else
            {
                i.o.a(o1, (i.ae)r.c());
            }
            j1 = i1;
            if ((k1 & 0x800) == 2048)
            {
                j1 = i1 | 0x10;
            }
            i.o.c(o1, s);
            i.o.a(o1, j1);
            l();
            return o1;
        }

        private void t()
        {
            if ((a & 0x20) != 32)
            {
                g = new ArrayList(g);
                a = a | 0x20;
            }
        }

        private bn u()
        {
            if (h == null)
            {
                List list = g;
                boolean flag;
                if ((a & 0x20) == 32)
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

        private bn v()
        {
            if (j == null)
            {
                List list = i;
                boolean flag;
                if ((a & 0x40) == 64)
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

        private bn x()
        {
            if (l == null)
            {
                List list = k;
                boolean flag;
                if ((a & 0x80) == 128)
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

        private bn y()
        {
            if (n == null)
            {
                List list = m;
                boolean flag;
                if ((a & 0x100) == 256)
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

        private i.q z()
        {
            if (p == null)
            {
                if (o == null)
                {
                    return com.c.b.i.q.J();
                } else
                {
                    return o;
                }
            } else
            {
                return (i.q)p.b();
            }
        }

        public final a.a a(bd bd)
        {
            return d(bd);
        }

        public final a.a a(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final a a(i.a a1)
        {
            if (h == null)
            {
                if (a1 == null)
                {
                    throw new NullPointerException();
                } else
                {
                    t();
                    g.add(a1);
                    q();
                    return this;
                }
            } else
            {
                h.a(a1);
                return this;
            }
        }

        public final a a(i.o o1)
        {
            Object obj1 = null;
            if (o1 == i.o.C())
            {
                return this;
            }
            if (o1.h())
            {
                a = a | 1;
                b = i.o.a(o1);
                q();
            }
            if (o1.j())
            {
                a = a | 2;
                c = i.o.b(o1);
                q();
            }
            Object obj;
            if (!i.o.c(o1).isEmpty())
            {
                if (d.isEmpty())
                {
                    d = i.o.c(o1);
                    a = a & -5;
                } else
                {
                    if ((a & 4) != 4)
                    {
                        d = new ay(d);
                        a = a | 4;
                    }
                    d.addAll(i.o.c(o1));
                }
                q();
            }
            if (!i.o.d(o1).isEmpty())
            {
                if (e.isEmpty())
                {
                    e = i.o.d(o1);
                    a = a & -9;
                } else
                {
                    if ((a & 8) != 8)
                    {
                        e = new ArrayList(e);
                        a = a | 8;
                    }
                    e.addAll(i.o.d(o1));
                }
                q();
            }
            if (!i.o.e(o1).isEmpty())
            {
                if (f.isEmpty())
                {
                    f = i.o.e(o1);
                    a = a & 0xffffffef;
                } else
                {
                    if ((a & 0x10) != 16)
                    {
                        f = new ArrayList(f);
                        a = a | 0x10;
                    }
                    f.addAll(i.o.e(o1));
                }
                q();
            }
            if (h == null)
            {
                if (!i.o.f(o1).isEmpty())
                {
                    if (g.isEmpty())
                    {
                        g = i.o.f(o1);
                        a = a & 0xffffffdf;
                    } else
                    {
                        t();
                        g.addAll(i.o.f(o1));
                    }
                    q();
                }
            } else
            if (!i.o.f(o1).isEmpty())
            {
                if (h.d())
                {
                    h.b();
                    h = null;
                    g = i.o.f(o1);
                    a = a & 0xffffffdf;
                    if (as.d)
                    {
                        obj = u();
                    } else
                    {
                        obj = null;
                    }
                    h = ((bn) (obj));
                } else
                {
                    h.a(i.o.f(o1));
                }
            }
            if (j == null)
            {
                if (!i.o.g(o1).isEmpty())
                {
                    if (i.isEmpty())
                    {
                        i = i.o.g(o1);
                        a = a & 0xffffffbf;
                    } else
                    {
                        if ((a & 0x40) != 64)
                        {
                            i = new ArrayList(i);
                            a = a | 0x40;
                        }
                        i.addAll(i.o.g(o1));
                    }
                    q();
                }
            } else
            if (!i.o.g(o1).isEmpty())
            {
                if (j.d())
                {
                    j.b();
                    j = null;
                    i = i.o.g(o1);
                    a = a & 0xffffffbf;
                    if (as.d)
                    {
                        obj = v();
                    } else
                    {
                        obj = null;
                    }
                    j = ((bn) (obj));
                } else
                {
                    j.a(i.o.g(o1));
                }
            }
            if (l == null)
            {
                if (!i.o.h(o1).isEmpty())
                {
                    if (k.isEmpty())
                    {
                        k = i.o.h(o1);
                        a = a & 0xffffff7f;
                    } else
                    {
                        if ((a & 0x80) != 128)
                        {
                            k = new ArrayList(k);
                            a = a | 0x80;
                        }
                        k.addAll(i.o.h(o1));
                    }
                    q();
                }
            } else
            if (!i.o.h(o1).isEmpty())
            {
                if (l.d())
                {
                    l.b();
                    l = null;
                    k = i.o.h(o1);
                    a = a & 0xffffff7f;
                    if (as.d)
                    {
                        obj = x();
                    } else
                    {
                        obj = null;
                    }
                    l = ((bn) (obj));
                } else
                {
                    l.a(i.o.h(o1));
                }
            }
            if (n == null)
            {
                if (!i.o.i(o1).isEmpty())
                {
                    if (m.isEmpty())
                    {
                        m = i.o.i(o1);
                        a = a & 0xfffffeff;
                    } else
                    {
                        if ((a & 0x100) != 256)
                        {
                            m = new ArrayList(m);
                            a = a | 0x100;
                        }
                        m.addAll(i.o.i(o1));
                    }
                    q();
                }
            } else
            if (!i.o.i(o1).isEmpty())
            {
                if (n.d())
                {
                    n.b();
                    n = null;
                    m = i.o.i(o1);
                    a = a & 0xfffffeff;
                    obj = obj1;
                    if (as.d)
                    {
                        obj = y();
                    }
                    n = ((bn) (obj));
                } else
                {
                    n.a(i.o.i(o1));
                }
            }
            if (o1.r())
            {
                obj = o1.s();
                if (p == null)
                {
                    if ((a & 0x200) == 512 && o != null && o != com.c.b.i.q.J())
                    {
                        o = com.c.b.i.q.a(o).a(((i.q) (obj))).g();
                    } else
                    {
                        o = ((i.q) (obj));
                    }
                    q();
                } else
                {
                    p.b(((as) (obj)));
                }
                a = a | 0x200;
            }
            if (o1.x())
            {
                obj = o1.y();
                if (r == null)
                {
                    if ((a & 0x400) == 1024 && q != null && q != com.c.b.i.ae.i())
                    {
                        q = com.c.b.i.ae.a(q).a(((i.ae) (obj))).g();
                    } else
                    {
                        q = ((i.ae) (obj));
                    }
                    q();
                } else
                {
                    r.b(((as) (obj)));
                }
                a = a | 0x400;
            }
            if (o1.z())
            {
                a = a | 0x800;
                s = i.o.j(o1);
                q();
            }
            d(o1.e);
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
            i.a a1;
            int j1;
            if (h == null)
            {
                j1 = g.size();
            } else
            {
                j1 = h.c();
            }
            if (i1 >= j1) goto _L2; else goto _L1
_L1:
            if (h == null)
            {
                a1 = (i.a)g.get(i1);
            } else
            {
                a1 = (i.a)h.a(i1);
            }
            if (a1.a()) goto _L4; else goto _L3
_L3:
            return false;
_L4:
            i1++;
            continue; /* Loop/switch isn't completed */
_L2:
            i1 = 0;
_L6:
            i.c c1;
            int l1;
            if (j == null)
            {
                l1 = i.size();
            } else
            {
                l1 = j.c();
            }
            if (i1 >= l1)
            {
                break MISSING_BLOCK_LABEL_172;
            }
            if (j == null)
            {
                c1 = (i.c)i.get(i1);
            } else
            {
                c1 = (i.c)j.a(i1);
            }
            if (!c1.a()) goto _L3; else goto _L5
_L5:
            i1++;
              goto _L6
            i1 = 0;
_L8:
            i.aa aa;
            int i2;
            if (l == null)
            {
                i2 = k.size();
            } else
            {
                i2 = l.c();
            }
            if (i1 >= i2)
            {
                break MISSING_BLOCK_LABEL_257;
            }
            if (l == null)
            {
                aa = (i.aa)k.get(i1);
            } else
            {
                aa = (i.aa)l.a(i1);
            }
            if (!aa.a()) goto _L3; else goto _L7
_L7:
            i1++;
              goto _L8
            i1 = 0;
_L10:
            i.k k1;
            int j2;
            if (n == null)
            {
                j2 = m.size();
            } else
            {
                j2 = n.c();
            }
            if (i1 >= j2)
            {
                break MISSING_BLOCK_LABEL_342;
            }
            if (n == null)
            {
                k1 = (i.k)m.get(i1);
            } else
            {
                k1 = (i.k)n.a(i1);
            }
            if (!k1.a()) goto _L3; else goto _L9
_L9:
            i1++;
              goto _L10
            if ((a & 0x200) == 512)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 && !z().a()) goto _L3; else goto _L11
_L11:
            return true;
            if (true) goto _L13; else goto _L12
_L12:
        }

        public final b.a b(g g1, aq aq)
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
            return com.c.b.i.c().a(com/c/b/i$o, com/c/b/i$o$a);
        }

        public final ak.a e()
        {
            return com.c.b.i.b();
        }

        public final i.o g()
        {
            i.o o1 = s();
            if (!o1.a())
            {
                throw b(o1);
            } else
            {
                return o1;
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
            return i.o.C();
        }

