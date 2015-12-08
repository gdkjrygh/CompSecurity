// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bf;

import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.k;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.ag;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bo.ap;
import com.google.android.m4b.maps.bo.bd;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bq.j;
import com.google.android.m4b.maps.bq.l;
import com.google.android.m4b.maps.bq.m;
import com.google.android.m4b.maps.bq.n;
import com.google.android.m4b.maps.bw.a;
import com.google.android.m4b.maps.bw.e;
import com.google.android.m4b.maps.bw.g;
import com.google.android.m4b.maps.cc.f;
import com.google.android.m4b.maps.cc.q;
import com.google.android.m4b.maps.cc.t;
import com.google.android.m4b.maps.cc.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.m4b.maps.bf:
//            a, b

public class com.google.android.m4b.maps.bf.c
{
    final class a
        implements com.google.android.m4b.maps.bd.d
    {

        private com.google.android.m4b.maps.bf.c a;

        public final void a(ac ac1, int i1, aa aa)
        {
            if (i1 != 3)
            {
                if ((aa = com.google.android.m4b.maps.bf.c.a(a, ac1, i1, aa)) != null)
                {
                    Long long1 = (Long)com.google.android.m4b.maps.bf.c.c(a).remove(ac1);
                    if (long1 == null)
                    {
                        if (ab.a("TileFetcher", 6))
                        {
                            ac1 = String.valueOf(ac1);
                            Log.e("TileFetcher", (new StringBuilder(String.valueOf(ac1).length() + 25)).append("Received an unknown tile ").append(ac1).toString());
                            return;
                        }
                    } else
                    {
                        SystemClock.elapsedRealtime();
                        long1.longValue();
                        com.google.android.m4b.maps.bf.c.a(a, ac1, aa);
                        return;
                    }
                }
            }
        }

        private a()
        {
            a = com.google.android.m4b.maps.bf.c.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    final class b
        implements com.google.android.m4b.maps.bd.d
    {

        private com.google.android.m4b.maps.bf.c a;

        private q a(com.google.android.m4b.maps.bf.b b1)
        {
            q q1 = a.b(b1.a);
            if (q1 != null)
            {
                com.google.android.m4b.maps.ay.k.a();
                if (q1.c())
                {
                    com.google.android.m4b.maps.bf.c.b(a, b1.a, q1);
                    return q1;
                }
            }
            if (q1 == null)
            {
                Pair pair = (Pair)com.google.android.m4b.maps.bf.c.d(a).get(b1.a);
                if (pair != null)
                {
                    if (b1.b)
                    {
                        com.google.android.m4b.maps.bf.c.d(a).remove(b1.a);
                        com.google.android.m4b.maps.bf.c.f(a);
                    } else
                    {
                        com.google.android.m4b.maps.bf.c.d(a).put(b1.a, Pair.create(b1, pair.second));
                    }
                    return com.google.android.m4b.maps.bf.c.b();
                }
                synchronized (com.google.android.m4b.maps.bf.c.e(a))
                {
                    if (com.google.android.m4b.maps.bf.c.e(a).a(b1))
                    {
                        com.google.android.m4b.maps.bf.c.d(a).put(b1.a, Pair.create(b1, Long.valueOf(SystemClock.elapsedRealtime())));
                        com.google.android.m4b.maps.bf.c.g(a);
                        com.google.android.m4b.maps.bf.c.a(a, b1.a, b1.b, com.google.android.m4b.maps.bf.c.h(a));
                    }
                }
                return q1;
            } else
            {
                return q1;
            }
            b1;
            a1;
            JVM INSTR monitorexit ;
            throw b1;
        }

        private void a(com.google.android.m4b.maps.bf.b b1, boolean flag)
        {
            do
            {
                b1 = com.google.android.m4b.maps.bf.c.e(a).a(b1, flag);
                if (b1 == null)
                {
                    break;
                }
                q q1 = a(b1);
                if (q1 == null)
                {
                    break;
                }
                if (q1 != com.google.android.m4b.maps.bf.c.b())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } while (true);
        }

        public final void a(ac ac1, int i1, aa aa)
        {
            boolean flag;
            boolean flag1;
            flag1 = true;
            flag = true;
            if (ac1 != j.d) goto _L2; else goto _L1
_L1:
            synchronized (com.google.android.m4b.maps.bf.c.e(a))
            {
                aa = com.google.android.m4b.maps.bf.c.i(a);
                com.google.android.m4b.maps.bf.c.j(a);
            }
            a(((com.google.android.m4b.maps.bf.b) (aa)), true);
_L4:
            return;
            aa;
            ac1;
            JVM INSTR monitorexit ;
            throw aa;
_L2:
            Pair pair;
            pair = (Pair)com.google.android.m4b.maps.bf.c.d(a).get(ac1);
            if (pair != null)
            {
                break; /* Loop/switch isn't completed */
            }
            if (ab.a("TileFetcher", 6))
            {
                ac1 = String.valueOf(ac1);
                Log.e("TileFetcher", (new StringBuilder(String.valueOf(ac1).length() + 25)).append("Received an unknown tile ").append(ac1).toString());
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
            if (com.google.android.m4b.maps.bf.c.e(a).a((com.google.android.m4b.maps.bf.b)pair.first)) goto _L6; else goto _L5
_L5:
            aa = null;
            i1 = 0;
_L8:
            flag1 = false;
_L10:
            if (flag)
            {
                com.google.android.m4b.maps.bf.c.d(a).remove(ac1);
                com.google.android.m4b.maps.bf.c.f(a);
            }
            if (i1 != 0)
            {
                a((com.google.android.m4b.maps.bf.b)pair.first, flag1);
            }
            if (aa != null)
            {
                SystemClock.elapsedRealtime();
                ((Long)pair.second).longValue();
                com.google.android.m4b.maps.bf.c.a(a, ac1, aa);
                return;
            }
              goto _L4
_L6:
label0:
            {
                if (i1 != 3)
                {
                    break label0;
                }
                flag = ((com.google.android.m4b.maps.bf.b)pair.first).b;
                i1 = 1;
                aa = null;
            }
            if (true) goto _L8; else goto _L7
_L7:
label1:
            {
                aa = com.google.android.m4b.maps.bf.c.a(a, ac1, i1, aa);
                if (aa == null || aa == com.google.android.m4b.maps.bf.c.b())
                {
                    break label1;
                }
                flag = true;
                i1 = 1;
            }
            if (true) goto _L10; else goto _L9
_L9:
            i1 = 1;
              goto _L8
        }

        private b()
        {
            a = com.google.android.m4b.maps.bf.c.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }

    final class c
        implements com.google.android.m4b.maps.bd.d
    {

        private com.google.android.m4b.maps.bf.c a;

        public final void a(ac ac1, int i1, aa aa1)
        {
            if (i1 != 3)
            {
                if ((ac1 = com.google.android.m4b.maps.bf.c.b(a, ac1, i1, aa1)) != null)
                {
                    com.google.android.m4b.maps.bf.c.a(a, aa1.a(), ac1);
                    return;
                }
            }
        }

        private c()
        {
            a = com.google.android.m4b.maps.bf.c.this;
            super();
        }

        c(byte byte0)
        {
            this();
        }
    }

    public static interface d
    {

        public abstract void a(ac ac1, q q1, boolean flag);
    }


    public static final q a = new u();
    public com.google.android.m4b.maps.bh.a b;
    public final j c;
    public volatile com.google.android.m4b.maps.bh.a.d d;
    public final com.google.android.m4b.maps.bw.a e;
    public final List f;
    public ag g;
    public final com.google.android.m4b.maps.bq.j.a h;
    public AtomicInteger i;
    public final Set j;
    public final LinkedList k;
    public final com.google.android.m4b.maps.bf.a l;
    public volatile long m;
    public volatile com.google.android.m4b.maps.bm.d n;
    private final e o;
    private Map p;
    private Map q;
    private volatile int r;
    private com.google.android.m4b.maps.bf.b s;
    private final com.google.android.m4b.maps.bd.d t;
    private final com.google.android.m4b.maps.bd.d u;
    private final c v;
    private final com.google.android.m4b.maps.bs.e w;
    private final g x;

    public com.google.android.m4b.maps.bf.c(ah ah, com.google.android.m4b.maps.bf.a a1, com.google.android.m4b.maps.bs.e e1, g g1)
    {
        this(ah, new com.google.android.m4b.maps.bh.a.d(ah), a1, com.google.android.m4b.maps.bw.a.a, e1, g1);
    }

    public com.google.android.m4b.maps.bf.c(ah ah, com.google.android.m4b.maps.bh.a.d d1, com.google.android.m4b.maps.bf.a a1, com.google.android.m4b.maps.bw.a a2, com.google.android.m4b.maps.bs.e e1, g g1)
    {
        o = new e(300);
        i = new AtomicInteger(0);
        j = new TreeSet();
        p = Collections.synchronizedMap(ax.b());
        q = ax.b();
        r = 0;
        t = new a((byte)0);
        u = new b((byte)0);
        v = new c((byte)0);
        d = d1;
        b = null;
        e = a2;
        f = new ArrayList();
        k = new LinkedList();
        if (com.google.android.m4b.maps.bq.l.a(ah))
        {
            c = com.google.android.m4b.maps.bq.l.b(ah);
            h = new com.google.android.m4b.maps.bq.j.a() {

                private com.google.android.m4b.maps.bf.c a;

                public final void a()
                {
                    synchronized (com.google.android.m4b.maps.bf.c.a(a))
                    {
                        com.google.android.m4b.maps.bf.c.a(a).add(com.google.android.m4b.maps.bf.c.b(a));
                    }
                    return;
                    exception;
                    set;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

                public final void a(aa aa1)
                {
                    if (aa1 != null)
                    {
                        q q1 = com.google.android.m4b.maps.bf.c.a(a, aa1.a(), 0, aa1);
                        com.google.android.m4b.maps.bf.c.a(a, aa1.a(), q1);
                    }
                }

            
            {
                a = com.google.android.m4b.maps.bf.c.this;
                super();
            }
            };
            c.a(h);
        } else
        {
            c = null;
            h = null;
        }
        l = a1;
        w = e1;
        x = g1;
    }

    static q a(com.google.android.m4b.maps.bf.c c1, ac ac1, int i1, aa aa)
    {
        return c1.a(ac1, i1, aa);
    }

    private q a(ac ac1, int i1, aa aa)
    {
        Object obj2;
        Object obj3;
        synchronized (o)
        {
            o.b(ac1, ac1);
        }
        obj2 = g;
        obj = ac1.d;
        if (obj == null)
        {
            obj = new af();
        }
        obj3 = ((af) (obj)).a().iterator();
_L4:
        if (!((Iterator) (obj3)).hasNext()) goto _L2; else goto _L1
_L1:
        boolean flag;
        Object obj4 = (com.google.android.m4b.maps.bo.bd.a)((Iterator) (obj3)).next();
        bd bd1 = af.a(((af) (obj)), ((com.google.android.m4b.maps.bo.bd.a) (obj4)));
        obj4 = af.a(((ag) (obj2)).a, ((com.google.android.m4b.maps.bo.bd.a) (obj4)));
        boolean flag1;
        if (obj4 == null)
        {
            if (bd1 == null || bd1.a(((bd) (obj4))))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        } else
        {
            flag1 = ((bd) (obj4)).a(bd1);
        }
        if (flag1) goto _L4; else goto _L3
_L3:
        flag = false;
_L7:
        if (flag) goto _L6; else goto _L5
_L5:
        aa = null;
_L10:
        return aa;
        ac1;
        obj;
        JVM INSTR monitorexit ;
        throw ac1;
_L2:
        flag = true;
          goto _L7
_L6:
        Object obj1;
        obj1 = aa;
        if (f.isEmpty())
        {
            break MISSING_BLOCK_LABEL_289;
        }
        obj1 = aa;
        if (ac1.d == null)
        {
            break MISSING_BLOCK_LABEL_289;
        }
        obj1 = aa;
        if (!(aa instanceof ap))
        {
            break MISSING_BLOCK_LABEL_289;
        }
        obj1 = f;
        obj1;
        JVM INSTR monitorenter ;
        obj2 = f.iterator();
_L8:
        do
        {
            if (!((Iterator) (obj2)).hasNext())
            {
                break MISSING_BLOCK_LABEL_283;
            }
            obj3 = ((m)((Iterator) (obj2)).next()).a(ac1, true);
        } while (obj3 == null);
        aa = com.google.android.m4b.maps.bo.e.a((ap)aa, (ap)obj3, w);
          goto _L8
        obj1;
        JVM INSTR monitorexit ;
        obj1 = aa;
        com.google.android.m4b.maps.bm.d d1 = n;
        if (d1 == null || i1 != 0)
        {
            break MISSING_BLOCK_LABEL_399;
        }
        if (obj1 instanceof ap)
        {
            aa = com.google.android.m4b.maps.cc.t.a(((aa) (obj1)), e, d1, x);
        } else
        {
            if (!(obj1 instanceof bg))
            {
                break MISSING_BLOCK_LABEL_399;
            }
            aa = com.google.android.m4b.maps.cc.f.a(((aa) (obj1)));
        }
_L11:
        obj1 = aa;
        if (aa == null)
        {
            if (i1 != 2)
            {
                break MISSING_BLOCK_LABEL_397;
            }
            obj1 = a;
        }
        aa = ((aa) (obj1));
        if (b == null) goto _L10; else goto _L9
_L9:
        b.a(d1, d, ac1, ((q) (obj1)));
        return ((q) (obj1));
        ac1;
        obj1;
        JVM INSTR monitorexit ;
        throw ac1;
        return null;
        aa = null;
          goto _L11
    }

    static Set a(com.google.android.m4b.maps.bf.c c1)
    {
        return c1.j;
    }

    static void a(com.google.android.m4b.maps.bf.c c1, ac ac1, q q1)
    {
        if (q1 == null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        LinkedList linkedlist;
        ArrayList arraylist;
        int i1;
        boolean flag;
        if (q1 == a)
        {
            q1 = null;
        }
        if (c1.p.size() != 0 || c1.r != 0 || c1.l != null && !c1.l.c())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        linkedlist = c1.k;
        linkedlist;
        JVM INSTR monitorenter ;
        if (c1.k.size() != 1) goto _L2; else goto _L1
_L1:
        ((d)c1.k.get(0)).a(ac1, q1, flag);
_L6:
        return;
_L2:
        arraylist = new ArrayList(c1.k.size());
        arraylist.addAll(c1.k);
        i1 = 0;
_L4:
        if (i1 >= arraylist.size())
        {
            break; /* Loop/switch isn't completed */
        }
        ((d)arraylist.get(i1)).a(ac1, q1, flag);
        i1++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
        c1;
        linkedlist;
        JVM INSTR monitorexit ;
        throw c1;
    }

    static void a(com.google.android.m4b.maps.bf.c c1, ac ac1, boolean flag, com.google.android.m4b.maps.bd.d d1)
    {
        c1.a(ac1, flag, d1);
    }

    private void a(ac ac1, boolean flag, com.google.android.m4b.maps.bd.d d1)
    {
        synchronized (o)
        {
            o.d(ac1);
        }
        if (c != null)
        {
            if (flag)
            {
                c.b(ac1, d1);
            } else
            {
                c.a(ac1, d1);
            }
        }
        if (ac1 == n.d) goto _L2; else goto _L1
_L1:
        d1 = f;
        d1;
        JVM INSTR monitorenter ;
        if (c != null && !f.isEmpty())
        {
            c.a(ac1, true);
        }
        for (obj = f.iterator(); ((Iterator) (obj)).hasNext(); ((m)((Iterator) (obj)).next()).c(ac1, v)) { }
        break MISSING_BLOCK_LABEL_155;
        ac1;
        d1;
        JVM INSTR monitorexit ;
        throw ac1;
        ac1;
        obj;
        JVM INSTR monitorexit ;
        throw ac1;
        d1;
        JVM INSTR monitorexit ;
_L2:
    }

    private boolean a(ac ac1, q q1)
    {
        boolean flag;
label0:
        {
            flag = false;
            if (q1 != null)
            {
                com.google.android.m4b.maps.ay.k.a();
                if (!q1.c())
                {
                    break label0;
                }
            }
            if (p.put(ac1, Long.valueOf(SystemClock.elapsedRealtime())) == null)
            {
                a(ac1, false, t);
            }
            flag = true;
        }
        return flag;
    }

    static com.google.android.m4b.maps.bh.a.d b(com.google.android.m4b.maps.bf.c c1)
    {
        return c1.d;
    }

    static q b()
    {
        return a;
    }

    static q b(com.google.android.m4b.maps.bf.c c1, ac ac1, int i1, aa aa)
    {
        return c1.b(ac1, i1, aa);
    }

    private q b(ac ac1, int i1, aa aa)
    {
label0:
        {
            if (aa == null)
            {
                return null;
            }
            if (((ap)aa).n() == 0)
            {
                if (((ap)aa).m() < 0L)
                {
                    return null;
                }
                q q1 = b.a(n, d, ac1, false);
                if (q1 != null && q1 != a)
                {
                    ((t)q1).a(((ap)aa).m());
                    return null;
                }
            }
            synchronized (o)
            {
                if (o.b(ac1) != null)
                {
                    break label0;
                }
            }
            return null;
        }
        aa;
        JVM INSTR monitorexit ;
        aa = c.a(ac1, true);
        if (aa != null)
        {
            return a(ac1, i1, aa);
        } else
        {
            return null;
        }
        ac1;
        aa;
        JVM INSTR monitorexit ;
        throw ac1;
    }

    static boolean b(com.google.android.m4b.maps.bf.c c1, ac ac1, q q1)
    {
        return c1.a(ac1, q1);
    }

    static Map c(com.google.android.m4b.maps.bf.c c1)
    {
        return c1.p;
    }

    static Map d(com.google.android.m4b.maps.bf.c c1)
    {
        return c1.q;
    }

    static com.google.android.m4b.maps.bf.a e(com.google.android.m4b.maps.bf.c c1)
    {
        return c1.l;
    }

    static int f(com.google.android.m4b.maps.bf.c c1)
    {
        int i1 = c1.r;
        c1.r = i1 - 1;
        return i1;
    }

    static int g(com.google.android.m4b.maps.bf.c c1)
    {
        int i1 = c1.r;
        c1.r = i1 + 1;
        return i1;
    }

    static com.google.android.m4b.maps.bd.d h(com.google.android.m4b.maps.bf.c c1)
    {
        return c1.u;
    }

    static com.google.android.m4b.maps.bf.b i(com.google.android.m4b.maps.bf.c c1)
    {
        return c1.s;
    }

    static com.google.android.m4b.maps.bf.b j(com.google.android.m4b.maps.bf.c c1)
    {
        c1.s = null;
        return null;
    }

    public q a(ac ac1)
    {
        q q1 = b.a(n, d, ac1, false);
        if (q1 != a) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if (q1 != null)
        {
            com.google.android.m4b.maps.ay.k.a();
            if (!q1.d())
            {
                break MISSING_BLOCK_LABEL_101;
            }
        }
        ac1 = b.a(n, d, ac1.a(), false);
        if (ac1 == a) goto _L1; else goto _L3
_L3:
label0:
        {
            if (ac1 != null)
            {
                com.google.android.m4b.maps.ay.k.a();
                if (!ac1.d())
                {
                    break label0;
                }
            }
            i.incrementAndGet();
            return null;
        }
        return ac1;
        return q1;
    }

    public final void a(com.google.android.m4b.maps.ax.f f1, com.google.android.m4b.maps.bo.g g1, List list, Set set, boolean flag)
    {
        b.d(n, d);
        synchronized (l)
        {
            l.a(f1, g1, list, set, flag);
            f1 = l.b();
            if (s == null)
            {
                a(((com.google.android.m4b.maps.bf.b) (f1)).a, ((com.google.android.m4b.maps.bf.b) (f1)).b, u);
            }
            s = f1;
        }
        return;
        f1;
        a1;
        JVM INSTR monitorexit ;
        throw f1;
    }

    public final boolean a()
    {
        if (j.isEmpty())
        {
            break MISSING_BLOCK_LABEL_88;
        }
        Set set = j;
        set;
        JVM INSTR monitorenter ;
        Iterator iterator = j.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.m4b.maps.bh.a.d d1 = (com.google.android.m4b.maps.bh.a.d)iterator.next();
            if (b != null)
            {
                b.a(n, d1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_75;
        Exception exception;
        exception;
        set;
        JVM INSTR monitorexit ;
        throw exception;
        j.clear();
        set;
        JVM INSTR monitorexit ;
        return true;
        return false;
    }

    protected q b(ac ac1)
    {
        q q1 = b.a(n, d, ac1, true);
        ac1 = q1;
        if (q1 != a)
        {
            ac1 = q1;
            if (q1 != null)
            {
                com.google.android.m4b.maps.ay.k.a();
                ac1 = q1;
                if (q1.d())
                {
                    ac1 = null;
                }
            }
        }
        return ac1;
    }

}
