// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.aa.al;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.aa.d;
import com.google.android.m4b.maps.ax.e;
import com.google.android.m4b.maps.ay.k;
import com.google.android.m4b.maps.az.f;
import com.google.android.m4b.maps.az.h;
import com.google.android.m4b.maps.az.i;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.ag;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bo.aq;
import com.google.android.m4b.maps.bo.ay;
import com.google.android.m4b.maps.bo.bh;
import com.google.android.m4b.maps.bo.bj;
import com.google.android.m4b.maps.br.a;
import com.google.android.m4b.maps.bw.g;
import com.google.android.m4b.maps.cc.q;
import com.google.android.m4b.maps.cg.c;
import com.google.android.m4b.maps.cg.cg;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            l, u, h, j, 
//            ab, ag, f, an

public final class com.google.android.m4b.maps.bx.b extends l
    implements com.google.android.m4b.maps.az.c.a, com.google.android.m4b.maps.az.h.a, com.google.android.m4b.maps.az.i.a, u
{
    static final class a extends an
    {

        int a;
        private boolean c;
        private float d;
        private long e;
        private final int f = 300;

        private static float a(long l1, long l2, int i1, boolean flag)
        {
            float f1 = Math.min(1.0F, Math.max(0.0F, (float)(l2 - l1) / (float)i1));
            if (flag)
            {
                return f1;
            } else
            {
                return 1.0F - f1;
            }
        }

        public final void b(int i1)
        {
            a = i1;
        }

        public final void b(boolean flag)
        {
            this;
            JVM INSTR monitorenter ;
            float f1;
            long l1;
            long l2;
            com.google.android.m4b.maps.ay.k.a();
            l1 = com.google.android.m4b.maps.ay.k.c();
            if (flag == c)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            c = flag;
            l2 = f;
            f1 = d;
            if (!c)
            {
                f1 = 1.0F - f1;
            }
            e = l1 - (long)(int)(f1 * (float)l2);
            d = a(e, e, f, c);
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public final boolean b()
        {
            this;
            JVM INSTR monitorenter ;
            if (d > 0.0F) goto _L2; else goto _L1
_L1:
            boolean flag = c;
            if (!flag) goto _L3; else goto _L2
_L2:
            flag = true;
_L5:
            this;
            JVM INSTR monitorexit ;
            return flag;
_L3:
            flag = false;
            if (true) goto _L5; else goto _L4
_L4:
            Exception exception;
            exception;
            throw exception;
        }

        public final boolean c()
        {
            this;
            JVM INSTR monitorenter ;
            float f1;
            com.google.android.m4b.maps.ay.k.a();
            long l1 = com.google.android.m4b.maps.ay.k.c();
            f1 = a(e, l1, f, c);
            if ((!c || d >= 1.0F) && (c || d <= 0.0F)) goto _L2; else goto _L1
_L1:
            d = f1;
            f1 = d;
            int i1 = a;
            super.b((int)(f1 * (float)(i1 >> 24 & 0xff)) << 24 | i1 & 0xffffff);
            boolean flag = true;
_L4:
            this;
            JVM INSTR monitorexit ;
            return flag;
_L2:
            flag = false;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            throw exception;
        }

        public a(r.a a1)
        {
            super(a1);
        }
    }

    static final class b
        implements com.google.android.m4b.maps.bx.h
    {

        private final Set a;

        public final Set a()
        {
            return a;
        }

        public final void a(com.google.android.m4b.maps.bm.d d1, com.google.android.m4b.maps.bi.b b1, ab ab1, com.google.android.m4b.maps.bo.g g1)
        {
            b1 = d1.a;
            if (ab1.c.b == com.google.android.m4b.maps.bx.ag.a.e)
            {
                d1.d();
                b1.glStencilOp(7681, 7681, 7681);
                b1.glStencilFunc(519, 255, 128);
                b1.glStencilMask(128);
                b1.glTexEnvx(8960, 8704, 7681);
                com.google.android.m4b.maps.bm.c.a(b1, 0xff606060);
            }
        }

        public final void a(com.google.android.m4b.maps.bm.d d1, ab ab1)
        {
            if (ab1.c.b == com.google.android.m4b.maps.bx.ag.a.e)
            {
                d1.e();
            }
        }

        public final volatile int compareTo(Object obj)
        {
            return 0;
        }

        public b(Set set)
        {
            a = al.a(set);
        }
    }

    static final class c
        implements com.google.android.m4b.maps.ax.h
    {

        private final com.google.android.m4b.maps.ax.h a;
        private final int b;
        private com.google.android.m4b.maps.bq.d c;
        private com.google.android.m4b.maps.az.c d;
        private final i e;

        public final e a(ah ah1, boolean flag, ag ag1, g g1)
        {
            return new e(ah1, ag1, g1);
        }

        public final com.google.android.m4b.maps.ax.f a(ah ah1, int i1, boolean flag, ag ag1, g g1)
        {
            ah1 = a.a(ah1, i1, flag, ag1, g1);
            if (c == null)
            {
                c = com.google.android.m4b.maps.bq.d.a();
            }
            if (d == null)
            {
                d = e.f;
            }
            return new com.google.android.m4b.maps.ax.a(ah1, d, c, b, e);
        }

        public c(com.google.android.m4b.maps.ax.h h1, int i1, i j1)
        {
            a = h1;
            b = i1;
            e = j1;
        }
    }


    final i a;
    final h b = new h();
    private volatile boolean q;
    private com.google.android.m4b.maps.ax.a r;
    private final a s;
    private final Set t = new HashSet();
    private volatile Set u;
    private final Map v = ax.b();
    private final Map w = ax.b();
    private final List x = new ArrayList();
    private final com.google.android.m4b.maps.bx.h y = new com.google.android.m4b.maps.bx.h() {

        private com.google.android.m4b.maps.bx.b a;

        public final Set a()
        {
            return com.google.android.m4b.maps.bx.b.a(a);
        }

        public final void a(com.google.android.m4b.maps.bm.d d1, com.google.android.m4b.maps.bi.b b1, ab ab1, com.google.android.m4b.maps.bo.g g2)
        {
        }

        public final void a(com.google.android.m4b.maps.bm.d d1, ab ab1)
        {
        }

        public final volatile int compareTo(Object obj)
        {
            return 0;
        }

            
            {
                a = com.google.android.m4b.maps.bx.b.this;
                super();
            }
    };

    protected com.google.android.m4b.maps.bx.b(com.google.android.m4b.maps.bf.c c1, com.google.android.m4b.maps.ax.h h1, int i1, int j1, r.a a1, i k1, g g1)
    {
        super(ah.n, c1, new c(h1, i1, k1), i1, j1, 4, a1, 256, false, true, false, true, true, false, g1);
        q = true;
        u = al.f();
        a = k1;
        s = new a(com.google.android.m4b.maps.bx.r.a.d);
        s.a = 0x80505050;
    }

    private com.google.android.m4b.maps.br.b a(com.google.android.m4b.maps.ak.a.c c1)
    {
        return new com.google.android.m4b.maps.br.a(p, c1);
    }

    static Set a(com.google.android.m4b.maps.bx.b b1)
    {
        return b1.u;
    }

    private boolean b(List list)
    {
        HashSet hashset;
        HashSet hashset1;
        Object obj1;
        if (!q)
        {
            break MISSING_BLOCK_LABEL_399;
        }
        q = false;
        list.clear();
        if (s.b())
        {
            list.add(a(com.google.android.m4b.maps.bx.ag.a.d));
        }
        hashset = new HashSet();
        hashset1 = new HashSet();
        obj1 = new HashSet();
        ((Set) (obj1)).addAll(a.e());
        synchronized (t)
        {
            ((Set) (obj1)).addAll(t);
        }
        obj1 = ((Set) (obj1)).iterator();
_L2:
        if (!((Iterator) (obj1)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        f f1 = (f)((Iterator) (obj1)).next();
        if (f1.c())
        {
            obj = a(com.google.android.m4b.maps.bx.ag.a.h, new com.google.android.m4b.maps.bx.h[] {
                f1
            });
        } else
        if (f1.b < 0.0F)
        {
            obj = a(com.google.android.m4b.maps.bx.ag.a.f, ae.a(f1), ae.a(y));
        } else
        {
            obj = a(com.google.android.m4b.maps.bx.ag.a.c, ae.a(f1), ae.a(y));
        }
        list.add(obj);
        if (f1.b > 0.0F && !f1.c())
        {
            hashset.addAll(f1.d());
        } else
        if (f1.b < 0.0F && !f1.c())
        {
            hashset1.addAll(f1.d());
            list.add(a(com.google.android.m4b.maps.bx.ag.a.g, new com.google.android.m4b.maps.bx.h[] {
                f1
            }));
        }
        continue; /* Loop/switch isn't completed */
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
        if (true) goto _L2; else goto _L1
_L1:
        if (!hashset.isEmpty())
        {
            list.add(a(ag.a.b, new com.google.android.m4b.maps.bx.h[] {
                new b(hashset)
            }));
        }
        if (!hashset1.isEmpty())
        {
            list.add(a(com.google.android.m4b.maps.bx.ag.a.e, new com.google.android.m4b.maps.bx.h[] {
                new b(hashset1)
            }));
        }
        return true;
        return false;
    }

    private void j()
    {
        if (r != null)
        {
            r.a = true;
            j j1 = i;
            if (j1 != null)
            {
                j1.a(true, false);
                return;
            }
        }
    }

    private void k()
    {
        Object obj = a.b();
        a a1;
        boolean flag;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = a.a(((cg) (obj)));
        }
        a1 = s;
        if (obj != null && ((com.google.android.m4b.maps.cg.c) (obj)).a().b < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a1.b(flag);
    }

    public final int a(aq aq1, com.google.android.m4b.maps.bx.f f1, Set set)
    {
        Object obj = a;
        Object obj1 = ((i) (obj)).c();
        set = new HashSet();
        obj1 = ((List) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            com.google.android.m4b.maps.cg.c c1 = ((i) (obj)).a((cg)((Iterator) (obj1)).next());
            if (c1 != null)
            {
                set.add(c1.a());
            }
        } while (true);
        obj = super.g.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            q q1 = (q)((Iterator) (obj)).next();
            if (q1 != null)
            {
                com.google.android.m4b.maps.ak.a.c c2 = ((bj)q1.b().a(com.google.android.m4b.maps.bo.bd.a.d)).a.a;
                if (set.contains(c2) && (aq1 == null || aq1.b(q1.b().d())))
                {
                    q1.a(a(c2));
                    q1.a(f1);
                }
            }
        } while (true);
        return 0;
    }

    protected final Set a(com.google.android.m4b.maps.bi.b b1)
    {
        if (r == null)
        {
            return al.f();
        } else
        {
            return r.b(b1);
        }
    }

    public final void a()
    {
        j();
    }

    protected final void a(com.google.android.m4b.maps.ax.f f1)
    {
        r = (com.google.android.m4b.maps.ax.a)f1;
        super.a(f1);
    }

    public final void a(i i1)
    {
        q = true;
        k();
        i1 = i1.b();
        if (i1 != null)
        {
            u = al.a(d.a(((bh) (i1)).b, com.google.android.m4b.maps.bo.bi.a.a));
        } else
        {
            u = al.f();
        }
        j();
    }

    public final void a(com.google.android.m4b.maps.bm.d d1)
    {
        super.a(d1);
        a.c(null);
        a.a(null);
    }

    public final void a(com.google.android.m4b.maps.bm.d d1, com.google.android.m4b.maps.bi.b b1, ab ab1)
    {
        if (ab1.c.b == com.google.android.m4b.maps.bx.ag.a.d)
        {
            if (s.b())
            {
                s.a(d1, b1, ab1);
            }
            return;
        }
        if (b1.b.b > 14.9F)
        {
            super.a(d1, b1, ab1);
            return;
        } else
        {
            n = true;
            return;
        }
    }

    public final void a(cg cg1)
    {
        q = true;
        k();
        if (r == null) goto _L2; else goto _L1
_L1:
        com.google.android.m4b.maps.ak.c c1;
        Object obj;
        obj = a.a(cg1.a());
        c1 = a.b(cg1.a());
        if (obj != null && c1 != null) goto _L3; else goto _L2
_L2:
        j();
        return;
_L3:
        Object obj1;
        f f1;
        obj1 = a;
        Iterator iterator;
        f f2;
        boolean flag;
        if (c1 != null && obj != null && c1.equals(((i) (obj1)).h) && ((com.google.android.m4b.maps.ak.c) (obj)).equals(((i) (obj1)).i))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L2; else goto _L4
_L4:
        r.b();
        obj1 = a;
        obj1.h = c1;
        obj1.i = ((com.google.android.m4b.maps.ak.c) (obj));
        ((i) (obj1)).f();
        obj1 = a.a(((com.google.android.m4b.maps.ak.c) (obj)).a, true, true);
        f1 = a.a(c1.a, true, false);
        if (obj1 == null || f1 == null) goto _L2; else goto _L5
_L5:
        obj = t;
        obj;
        JVM INSTR monitorenter ;
        for (iterator = t.iterator(); iterator.hasNext();)
        {
            f2 = (f)iterator.next();
            f2.d = 0;
            f2.e = 0.0F;
        }

        break MISSING_BLOCK_LABEL_239;
        cg1;
        obj;
        JVM INSTR monitorexit ;
        throw cg1;
        if (((f) (obj1)).b <= f1.b)
        {
            break MISSING_BLOCK_LABEL_318;
        }
        ((f) (obj1)).a(5);
        f1.a(24);
_L6:
        t.clear();
        t.add(obj1);
        t.add(f1);
        obj;
        JVM INSTR monitorexit ;
        r.a(cg1.a(), c1);
          goto _L2
        ((f) (obj1)).a(20);
        f1.a(10);
          goto _L6
    }

    public final void a(Set set, Map map)
    {
        for (Iterator iterator = a.d().iterator(); iterator.hasNext(); set.add(a(((com.google.android.m4b.maps.cg.c)iterator.next()).b()))) { }
        map.putAll(v);
    }

    public final boolean a(com.google.android.m4b.maps.bi.b b1, com.google.android.m4b.maps.bm.d d1)
    {
        if (r != null)
        {
            Object obj;
            Object obj1;
            com.google.android.m4b.maps.ak.a.c c1;
            boolean flag;
            if (b1.b.b > 17F)
            {
                obj = r.d(b1);
            } else
            {
                obj = null;
            }
            a.c(((com.google.android.m4b.maps.ak.a.c) (obj)));
        }
        if (r != null)
        {
            if (b1.b.b > 14.9F)
            {
                obj = r.c(b1);
                a.a(((Set) (obj)));
                for (obj = r.a(b1).iterator(); ((Iterator) (obj)).hasNext(); b.a(((ac) (obj1))))
                {
                    obj1 = (ac)((Iterator) (obj)).next();
                }

            } else
            {
                a.a(null);
            }
        }
        v.clear();
        if (b1.b.b > 14.9F)
        {
            flag = super.a(b1, d1);
            v.clear();
            w.clear();
            if (b1.b.b > 17F)
            {
                obj = super.g.iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    obj1 = (q)((Iterator) (obj)).next();
                    c1 = ((bj)((q) (obj1)).b().a(com.google.android.m4b.maps.bo.bd.a.d)).a.a;
                    d1 = (com.google.android.m4b.maps.br.b)w.get(c1);
                    b1 = d1;
                    if (d1 == null)
                    {
                        b1 = a(c1);
                        w.put(c1, b1);
                    }
                    d1 = b.a(((q) (obj1)).b());
                    if (d1 != null && d1 != h.b)
                    {
                        obj1 = (ay)v.get(b1);
                        if (obj1 == null)
                        {
                            d1 = new ay(new com.google.android.m4b.maps.bo.ax[] {
                                d1
                            });
                            v.put(b1, d1);
                        } else
                        {
                            ((ay) (obj1)).a(d1);
                        }
                    }
                } while (true);
            }
            return flag;
        } else
        {
            return true;
        }
    }

    public final boolean a(List list)
    {
        return b(list);
    }

    public final int b(com.google.android.m4b.maps.bi.b b1)
    {
        byte byte0;
label0:
        {
            byte0 = 0;
            if (s.c())
            {
                byte0 = 2;
            }
            synchronized (t)
            {
                if (!t.isEmpty())
                {
                    break label0;
                }
            }
            return byte0;
        }
        Iterator iterator = t.iterator();
_L3:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        float f2;
        f f3;
        f3 = (f)iterator.next();
        com.google.android.m4b.maps.ay.k.a();
        f2 = (float)(com.google.android.m4b.maps.ay.k.c() - f3.c) / 500F;
        float f1;
        if (f2 < 0.0F)
        {
            f1 = 0.0F;
        } else
        {
            f1 = f2;
            if (f2 > 1.0F)
            {
                f1 = 1.0F;
            }
        }
        f3.e = f1;
        if (!f3.b())
        {
            iterator.remove();
            q = true;
        }
        break MISSING_BLOCK_LABEL_187;
_L2:
        if (t.isEmpty())
        {
            r.b();
            i i1 = a;
            i1.h = null;
            i1.i = null;
            i1.f();
            j();
        }
        b1;
        JVM INSTR monitorexit ;
        return byte0;
        exception;
        b1;
        JVM INSTR monitorexit ;
        throw exception;
        byte0 = 2;
          goto _L3
    }

    public final void b()
    {
        j();
    }

    public final void c()
    {
        q = true;
    }

    public final void f()
    {
        a.a.remove(this);
        b.a.remove(this);
        a.f.b(this);
    }

    public final u g()
    {
        return this;
    }

    public final com.google.android.m4b.maps.bi.c h()
    {
        return null;
    }
}
