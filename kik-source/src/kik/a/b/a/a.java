// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.b.a;

import com.kik.g.f;
import com.kik.g.k;
import com.kik.g.p;
import com.kik.m.o;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kik.a.d.a.d;
import kik.a.d.a.e;
import kik.a.d.a.g;
import kik.a.d.aa;
import kik.a.d.n;
import kik.a.d.s;
import kik.a.d.u;
import kik.a.e.i;
import kik.a.e.l;
import kik.a.e.r;
import kik.a.e.v;
import kik.a.e.w;
import kik.a.f.c.b;
import kik.a.f.f.ah;
import kik.a.f.f.ai;
import kik.a.f.f.an;
import kik.a.f.f.t;
import kik.a.f.f.x;
import kik.a.f.j;
import kik.a.h.m;
import kik.a.z;
import org.c.c;

// Referenced classes of package kik.a.b.a:
//            b, l, e, f, 
//            g, h, i, j, 
//            n, k, p, d, 
//            m, q, c, o

public final class kik.a.b.a.a
    implements i, kik.a.f.i, j
{
    private final class a
        implements Comparator
    {

        final kik.a.b.a.a a;

        public final int compare(Object obj, Object obj1)
        {
            obj = (o)obj;
            obj1 = (o)obj1;
            if (((Long)((o) (obj)).b).longValue() < ((Long)((o) (obj1)).b).longValue())
            {
                return 1;
            }
            if (((Long)((o) (obj)).b).longValue() > ((Long)((o) (obj1)).b).longValue())
            {
                return -1;
            } else
            {
                return ((String)((o) (obj)).a).compareTo((String)((o) (obj1)).a);
            }
        }

        private a()
        {
            a = kik.a.b.a.a.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    private final class b
        implements kik.a.h.d
    {

        final kik.a.b.a.a a;
        private final kik.a.d.f b;

        public final void a()
        {
            kik.a.b.a.a.l(a).a(b);
        }

        public b(kik.a.d.f f1)
        {
            a = kik.a.b.a.a.this;
            super();
            b = f1;
        }
    }

    public static final class c
    {

        public final String a;
        public final long b;
        public final s c;

        public c(s s1, String s2, long l1)
        {
            c = s1;
            a = s2;
            b = l1;
        }
    }

    public static final class d
    {

        public String a;
        public long b;
        public long c;
        public long d;
        private long e;

        public final void a(long l1)
        {
            c = l1 - e;
        }

        public d(long l1, long l2, String s1, long l3)
        {
            b = l1;
            e = l2;
            a = s1;
            d = l3;
        }
    }


    private static final org.c.b q = org.c.c.a("ConversationManager");
    private HashSet A;
    private int B;
    private d C;
    private f D;
    private k E;
    private k F;
    private k G;
    private k H;
    private k I;
    private k J;
    private k K;
    private k L;
    private k M;
    private k N;
    private k O;
    private k P;
    private k Q;
    private k R;
    private k S;
    private k T;
    private k U;
    private k V;
    private k W;
    private int X;
    private final com.kik.g.i Y = new kik.a.b.a.b(this);
    private final com.kik.g.i Z = new kik.a.b.a.l(this);
    List a;
    private final com.kik.g.i aa = new kik.a.b.a.e(this);
    private final com.kik.g.i ab = new kik.a.b.a.f(this);
    private com.kik.g.i ac;
    private com.kik.g.i ad;
    private com.kik.g.i ae;
    private com.kik.g.i af;
    List b;
    private HashMap c;
    private final kik.a.e.f d;
    private final v e;
    private final r f;
    private final kik.a.e.p g;
    private final kik.a.e.o h;
    private final w i;
    private final l j;
    private final SecureRandom k = new SecureRandom();
    private List l;
    private Set m;
    private m n;
    private ScheduledExecutorService o;
    private long p;
    private long r;
    private Hashtable s;
    private Hashtable t;
    private Hashtable u;
    private k v;
    private k w;
    private k x;
    private k y;
    private k z;

    public kik.a.b.a.a(kik.a.e.f f1, v v1, kik.a.e.o o1, kik.a.e.p p1, r r1, w w1, l l1, 
            ExecutorService executorservice)
    {
        c = new HashMap();
        n = new m();
        o = Executors.newScheduledThreadPool(1);
        p = 0x36ee80L;
        r = 0L;
        t = new Hashtable();
        u = new Hashtable();
        v = new k(this);
        w = new k(this);
        x = new k(this);
        y = new k(this);
        z = new k(this);
        A = new HashSet();
        D = new f();
        a = new ArrayList();
        b = new ArrayList();
        ac = new kik.a.b.a.g(this);
        ad = new h(this);
        ae = new kik.a.b.a.i(this);
        af = new kik.a.b.a.j(this);
        d = f1;
        e = v1;
        f = r1;
        i = w1;
        g = p1;
        h = o1;
        j = l1;
        l = new ArrayList();
        m = new HashSet();
        E = new com.kik.g.a(this, executorservice);
        F = new com.kik.g.a(this, executorservice);
        G = new com.kik.g.a(this, executorservice);
        H = new com.kik.g.a(this, executorservice);
        I = new com.kik.g.a(this, executorservice);
        J = new com.kik.g.a(this, executorservice);
        K = new com.kik.g.a(this, executorservice);
        L = new com.kik.g.a(this, executorservice);
        M = new com.kik.g.a(this, executorservice);
        N = new com.kik.g.a(this, executorservice);
        O = new com.kik.g.a(this, executorservice);
        P = new com.kik.g.a(this, executorservice);
        Q = new com.kik.g.a(this, executorservice);
        R = new com.kik.g.a(this, executorservice);
        S = new com.kik.g.a(this, executorservice);
        T = new com.kik.g.a(this, executorservice);
        U = new com.kik.g.a(this, executorservice);
        V = new com.kik.g.a(this, executorservice);
        W = new com.kik.g.a(this, executorservice);
    }

    private void M()
    {
        Hashtable hashtable = s;
        hashtable;
        JVM INSTR monitorenter ;
        Iterator iterator = s.values().iterator();
_L3:
        kik.a.d.f f1;
        long l1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_135;
        }
        f1 = (kik.a.d.f)iterator.next();
        l1 = kik.a.h.j.b();
        if (!f1.n() || f1.p() > l1 || f1.p() == -1L) goto _L2; else goto _L1
_L1:
        a(f1.b(), true);
          goto _L3
        Exception exception;
        exception;
        hashtable;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        if (!f1.n() || f1.p() <= l1 || t.containsKey(f1.b())) goto _L3; else goto _L4
_L4:
        b(f1.b(), f1.p());
          goto _L3
        hashtable;
        JVM INSTR monitorexit ;
    }

    private Vector N()
    {
        Object obj = new Vector();
        Hashtable hashtable = s;
        hashtable;
        JVM INSTR monitorenter ;
        Enumeration enumeration = s.elements();
_L2:
        kik.a.d.f f1;
        kik.a.d.k k1;
        do
        {
            if (!enumeration.hasMoreElements())
            {
                break MISSING_BLOCK_LABEL_99;
            }
            f1 = (kik.a.d.f)enumeration.nextElement();
            k1 = f.a(f1.b(), false);
        } while (k1 == null);
        if (!(k1 instanceof n) || !((n)k1).H()) goto _L2; else goto _L1
_L1:
        ((Vector) (obj)).add(f1);
          goto _L2
        obj;
        hashtable;
        JVM INSTR monitorexit ;
        throw obj;
        hashtable;
        JVM INSTR monitorexit ;
        return ((Vector) (obj));
    }

    private List a(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        Collections.sort(list, new a((byte)0));
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = (o)list.next();
            obj = (kik.a.d.f)s.get(((o) (obj)).a);
            if (obj != null)
            {
                arraylist.add(obj);
            }
        } while (true);
        return arraylist;
    }

    static d a(kik.a.b.a.a a1, d d1)
    {
        a1.C = d1;
        return d1;
    }

    static v a(kik.a.b.a.a a1)
    {
        return a1.e;
    }

    private ah a(Vector vector, Vector vector1, List list, boolean flag)
    {
        ah ah1 = new ah(this, (KeyPair)h.b().f(), h, flag);
        vector1 = vector1.iterator();
        while (vector1.hasNext()) 
        {
            kik.a.f.c.c c1 = (kik.a.f.c.c)vector1.next();
            kik.a.d.k k2 = f.a(c1.i(), false);
            if (k2 != null && (k2 instanceof n))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ah1.a(c1, flag, true);
        }
        vector = vector.iterator();
        while (vector.hasNext()) 
        {
            vector1 = (kik.a.f.c.c)vector.next();
            kik.a.d.k k1 = f.a(vector1.i(), false);
            if (k1 != null && (k1 instanceof n))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ah1.a(vector1, flag, false);
        }
        vector = list.iterator();
        while (vector.hasNext()) 
        {
            vector1 = (kik.a.f.c.c)vector.next();
            list = f.a(vector1.i(), false);
            if (list != null && (list instanceof n))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ah1.a(vector1, flag, false);
        }
        return ah1;
    }

    private void a(long l1)
    {
        p = l1;
        e.c("ConversationManager.QOS_POLLING_INTERVAL", Long.toString(l1));
    }

    private void a(String s1, String s2)
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        s2 = a(s2);
        if (s2 == null) goto _L2; else goto _L1
_L1:
        s2;
        JVM INSTR monitorenter ;
        arraylist.addAll(s2.c());
        s2.a(true);
        s2;
        JVM INSTR monitorexit ;
_L2:
        synchronized (f(s1))
        {
            ArrayList arraylist1 = new ArrayList();
            arraylist1.addAll(arraylist);
            arraylist1.addAll(f1.c());
            f1.a(arraylist1);
            f1.m();
        }
        if (!A.contains(s1))
        {
            A.add(s1);
            int i1 = A.size();
            w.a(Integer.valueOf(i1));
        }
        K.a(f1);
        if (s2 != null)
        {
            U.a(new String[] {
                s2.b(), s1
            });
        }
        return;
        s1;
        s2;
        JVM INSTR monitorexit ;
        throw s1;
        s1;
        f1;
        JVM INSTR monitorexit ;
        throw s1;
    }

    private void a(Vector vector)
    {
        b(vector);
    }

    static void a(kik.a.b.a.a a1, String s1)
    {
        a1.i(s1);
    }

    static void a(kik.a.b.a.a a1, String s1, String s2)
    {
        a1.a(s1, s2);
    }

    static void a(kik.a.b.a.a a1, kik.a.d.f f1)
    {
        a1.d(f1);
    }

    private void a(u u1)
    {
        kik.a.d.f f1;
        int k1;
        int l1;
        f1 = f(u1.b());
        k1 = u1.d().size();
        l1 = u1.a();
        if (l1 == 600)
        {
            f.e(u1.c());
        }
        f1;
        JVM INSTR monitorenter ;
        int i1;
        int j1;
        j1 = 0;
        i1 = 0;
_L6:
        if (j1 >= k1)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        if (f1.a((String)u1.d().elementAt(j1), l1, e))
        {
            i1++;
        }
        break MISSING_BLOCK_LABEL_209;
        f1;
        JVM INSTR monitorexit ;
        if (i1 >= k1 || u1.b().equals(u1.c())) goto _L2; else goto _L1
_L1:
        kik.a.d.f f2 = f(u1.c());
        f2;
        JVM INSTR monitorenter ;
        i1 = 0;
_L4:
        if (i1 >= u1.d().size())
        {
            break; /* Loop/switch isn't completed */
        }
        f1.a((String)u1.d().elementAt(i1), u1.a(), e);
        i1++;
        if (true) goto _L4; else goto _L3
        u1;
        f1;
        JVM INSTR monitorexit ;
        throw u1;
_L3:
        f2;
        JVM INSTR monitorexit ;
_L2:
        N.a(new Integer(u1.a()));
        return;
        u1;
        f2;
        JVM INSTR monitorexit ;
        throw u1;
        j1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private boolean a(s s1, boolean flag, boolean flag1)
    {
        kik.a.d.f f1 = e(s1);
        kik.a.d.k k1 = f.a(s1.h(), true);
        f1;
        JVM INSTR monitorenter ;
        if (!s1.d())
        {
            break MISSING_BLOCK_LABEL_103;
        }
        synchronized (A)
        {
            if (!A.contains(s1.i()))
            {
                A.add(s1.i());
                int i1 = A.size();
                w.a(Integer.valueOf(i1));
            }
        }
        T.a(s1.i());
        if (!f1.a(s1, k1, e, flag1))
        {
            break MISSING_BLOCK_LABEL_183;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        K.a(f1);
        if (f1.c(s1.h()))
        {
            M.a(f1);
        }
        if (kik.a.d.a.g.b(s1))
        {
            f1.a(false);
        }
        f1;
        JVM INSTR monitorexit ;
        return true;
        s1;
        hashset;
        JVM INSTR monitorexit ;
        throw s1;
        s1;
        f1;
        JVM INSTR monitorexit ;
        throw s1;
        f1;
        JVM INSTR monitorexit ;
        return false;
    }

    static k b(kik.a.b.a.a a1)
    {
        return a1.H;
    }

    private void b(String s1, long l1)
    {
        if (l1 != -1L)
        {
            Object obj = new kik.a.b.a.n(this, s1);
            obj = o.schedule(((Runnable) (obj)), l1 - kik.a.h.j.b(), TimeUnit.MILLISECONDS);
            t.put(s1, obj);
        }
    }

    private void b(List list)
    {
        if (list != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj3;
        int i1;
        boolean flag;
        int k1;
        boolean flag1;
        boolean flag2;
        Object obj1;
        if (list.size() > 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        list = list.iterator();
        i1 = 0;
_L10:
        if (!list.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (kik.a.f.c.c)list.next();
        obj1 = f.a(((kik.a.f.c.c) (obj)).i(), false);
        if (obj1 != null && ((kik.a.d.k) (obj1)).m())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (((kik.a.f.c.c) (obj)).f() && !flag1)
        {
            obj1 = new ah(this, (KeyPair)h.b().f(), h, flag1);
            obj3 = f.a(((kik.a.f.c.c) (obj)).i(), false);
            boolean flag5;
            if (obj3 != null && (obj3 instanceof n))
            {
                flag5 = true;
            } else
            {
                flag5 = false;
            }
            ((ah) (obj1)).a(((kik.a.f.c.c) (obj)), flag5, flag2);
            d.a(((kik.a.f.f.z) (obj1)), false);
        }
        obj3 = f.a(((kik.a.f.c.c) (obj)).h(), true);
        if (obj3 != null && ((kik.a.d.k) (obj3)).m())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k1 = i1;
        ((kik.a.f.c.c) (obj)).l();
        JVM INSTR tableswitch 4 9: default 248
    //                   4 1186
    //                   5 252
    //                   6 252
    //                   7 283
    //                   8 252
    //                   9 1162;
           goto _L3 _L4 _L5 _L5 _L6 _L5 _L7
_L3:
        k1 = i1;
_L5:
        i1 = k1;
        break MISSING_BLOCK_LABEL_28;
_L6:
        Object obj2;
        obj2 = ((kik.a.f.c.a)obj).b();
        k1 = i1;
        int j1;
        if (obj2 == null) goto _L5; else goto _L8
        list;
        obj5;
        JVM INSTR monitorexit ;
        throw list;
_L8:
        List list1 = ((s) (obj2)).q();
        String s2 = ((s) (obj2)).i();
        kik.a.d.f f1;
        synchronized (s)
        {
            f1 = (kik.a.d.f)s.get(s2);
        }
        if (f1 != null)
        {
            f1.b(list1);
            e.a(list1, s2);
        }
        if ((kik.a.d.a.k)kik.a.d.a.g.a(((s) (obj2)), kik/a/d/a/k) != null)
        {
            z.a(obj2);
        }
        obj5 = (kik.a.d.a.c)kik.a.d.a.g.a(((s) (obj2)), kik/a/d/a/c);
        if (obj5 != null && obj3 != null)
        {
            f.a(((kik.a.f.c.c) (obj)).h(), new kik.a.b.a.k(this, ((kik.a.d.a.c) (obj5))));
        }
        if (flag)
        {
            ((s) (obj2)).n();
        }
        if ((kik.a.d.a.j)kik.a.d.a.g.a(((s) (obj2)), kik/a/d/a/j) != null)
        {
            i1 = 1;
        }
        obj5 = (kik.a.d.a.d)kik.a.d.a.g.a(((s) (obj2)), kik/a/d/a/d);
        if (obj5 != null && !((kik.a.d.a.d) (obj5)).f())
        {
            ((kik.a.d.k) (obj3)).h(true);
            f.a(((kik.a.d.k) (obj3)), true, true);
        }
        obj3 = (e)kik.a.d.a.g.a(((s) (obj2)), kik/a/d/a/e);
        j1 = i1;
        if (obj3 != null)
        {
            obj5 = j.a(((e) (obj3)).d(), true);
            ((n) (obj5)).d(true);
            ((n) (obj5)).f(true);
            ((n) (obj5)).i(false);
            ((n) (obj5)).j(((e) (obj3)).e());
            if (((e) (obj3)).e())
            {
                j.a(((e) (obj3)).d());
            }
            if (((e) (obj3)).a().size() > 0 || ((e) (obj3)).b().size() > 0)
            {
                HashSet hashset = new HashSet();
                for (i1 = 0; i1 < ((e) (obj3)).a().size(); i1++)
                {
                    String s3 = (String)((e) (obj3)).a().elementAt(i1);
                    hashset.add(s3);
                    ((n) (obj5)).d(s3);
                }

                if (((e) (obj3)).a().size() > 0)
                {
                    f.a(hashset, true);
                }
                for (i1 = 0; i1 < ((e) (obj3)).b().size(); i1++)
                {
                    ((n) (obj5)).e((String)((e) (obj3)).b().elementAt(i1));
                }

                j.b(((n) (obj5)));
                f.a(((kik.a.d.k) (obj5)));
                e.d(((kik.a.d.k) (obj5)));
                i1 = 1;
            }
            j1 = i1;
            if (((e) (obj3)).c() != null)
            {
                a(((e) (obj3)).d(), ((e) (obj3)).c());
                j1 = i1;
            }
        }
        Object obj6 = (kik.a.d.a.f)kik.a.d.a.g.a(((s) (obj2)), kik/a/d/a/f);
        if (obj6 != null)
        {
            String s1 = ((s) (obj2)).i();
            Object obj4 = ((s) (obj2)).h();
            boolean flag3 = ((kik.a.d.a.f) (obj6)).a();
            obj6 = f(s1);
            if (flag3)
            {
                if (((kik.a.d.f) (obj6)).a(((String) (obj4)), n, new b(((kik.a.d.f) (obj6)))))
                {
                    M.a(obj6);
                }
            } else
            if (((kik.a.d.f) (obj6)).c(((String) (obj4))))
            {
                M.a(obj6);
            }
        }
        obj4 = (kik.a.d.a.i)kik.a.d.a.g.a(((s) (obj2)), kik/a/d/a/i);
        if (obj4 != null)
        {
            obj = ((kik.a.f.c.c) (obj)).i();
            obj4 = ((kik.a.d.a.i) (obj4)).a();
            obj = kik.a.d.s.a(((String) (obj)));
            ((s) (obj)).a(new kik.a.d.a.i(((String) (obj4))));
            d(((s) (obj)));
        }
        k1 = j1;
        if (!kik.a.d.a.g.a(((s) (obj2)))) goto _L5; else goto _L9
_L9:
        f.a(((s) (obj2)).i(), false);
        if (kik.a.d.a.g.a(((s) (obj2)), kik/a/d/a/m) == null)
        {
            kik.a.d.a.g.a(((s) (obj2)), kik/a/d/a/l);
        }
        i1 = a(e(((s) (obj2))));
        boolean flag4;
        if (i1 == 4 || i1 == 8)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        i1 = j1;
        if (a(((s) (obj2)), flag1, flag4))
        {
            if (!flag4)
            {
                synchronized (A)
                {
                    if (!A.contains(((s) (obj2)).i()))
                    {
                        A.add(((s) (obj2)).i());
                        i1 = A.size();
                        w.a(Integer.valueOf(i1));
                    }
                }
                I.a(obj2);
                i1 = j1;
            } else
            {
                J.a(obj2);
                i1 = j1;
            }
        }
          goto _L10
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
_L7:
        obj = ((kik.a.f.c.d)obj).b();
        k1 = i1;
        if (obj == null) goto _L5; else goto _L11
_L11:
        a(((u) (obj)));
          goto _L10
_L4:
        obj2 = f(((kik.a.f.c.b)obj).i());
        k1 = i1;
        if (obj2 == null) goto _L5; else goto _L12
_L12:
        obj2;
        JVM INSTR monitorenter ;
        ((kik.a.d.f) (obj2)).a(((kik.a.f.c.c) (obj)).j(), 600, e);
        K.a(obj2);
        obj2;
        JVM INSTR monitorexit ;
          goto _L10
        list;
        obj2;
        JVM INSTR monitorexit ;
        throw list;
        if (i1 == 0) goto _L1; else goto _L13
_L13:
        f.a(false, true);
        return;
    }

    static void b(kik.a.b.a.a a1, String s1)
    {
        if (s1 != null)
        {
            a1.d(a1.a(s1));
            s1 = a1.j.c(s1);
            if (s1 != null)
            {
                for (s1 = s1.iterator(); s1.hasNext(); a1.d(a1.a((String)s1.next()))) { }
            }
        }
    }

    static void c(kik.a.b.a.a a1)
    {
        Object obj = a1.N();
        if (((Vector) (obj)).size() != 0)
        {
            Object obj1 = (kik.a.d.f)((Vector) (obj)).get((new Random()).nextInt(((Vector) (obj)).size()));
            obj = a1.f.a(((kik.a.d.f) (obj1)).b(), false);
            if (obj == null || !(obj instanceof n))
            {
                throw new IllegalArgumentException("Trying to handle a convo marked as dirty that isn't a group");
            }
            obj1 = ((kik.a.d.f) (obj1)).b();
            a1.j.a((n)obj).a(new kik.a.b.a.p(a1, ((String) (obj1))));
        }
    }

    private static boolean c(kik.a.d.f f1)
    {
        return f1 != null && f1.e() != null;
    }

    static SecureRandom d(kik.a.b.a.a a1)
    {
        return a1.k;
    }

    private void d(kik.a.d.f f1)
    {
        HashMap hashmap = c;
        hashmap;
        JVM INSTR monitorenter ;
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        c.remove(f1.b());
        hashmap;
        JVM INSTR monitorexit ;
        return;
        f1;
        hashmap;
        JVM INSTR monitorexit ;
        throw f1;
    }

    private kik.a.d.f e(s s1)
    {
        return f(s1.i());
    }

    static kik.a.e.o e(kik.a.b.a.a a1)
    {
        return a1.h;
    }

    static kik.a.e.f f(kik.a.b.a.a a1)
    {
        return a1.d;
    }

    static List g(kik.a.b.a.a a1)
    {
        return a1.l;
    }

    static void h(kik.a.b.a.a a1)
    {
        ArrayList arraylist = new ArrayList();
        Hashtable hashtable = a1.s;
        hashtable;
        JVM INSTR monitorenter ;
        Iterator iterator = a1.s.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            kik.a.d.f f1 = (kik.a.d.f)iterator.next();
            if (f1.o())
            {
                arraylist.add(f1.b());
            }
        } while (true);
        break MISSING_BLOCK_LABEL_74;
        a1;
        hashtable;
        JVM INSTR monitorexit ;
        throw a1;
        hashtable;
        JVM INSTR monitorexit ;
        if (arraylist.isEmpty())
        {
            a1.G();
            return;
        } else
        {
            com.kik.g.s.b(a1.d.a(new kik.a.f.f.u(a1, arraylist))).a(new kik.a.b.a.d(a1));
            return;
        }
    }

    static Hashtable i(kik.a.b.a.a a1)
    {
        return a1.s;
    }

    private void i(String s1)
    {
        synchronized (s)
        {
            s.remove(s1);
        }
        synchronized (A)
        {
            if (A.contains(s1))
            {
                A.remove(s1);
                int i1 = A.size();
                w.a(Integer.valueOf(i1));
            }
        }
        e.j(s1);
        e.m(s1);
        return;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    static l j(kik.a.b.a.a a1)
    {
        return a1.j;
    }

    static k k(kik.a.b.a.a a1)
    {
        return a1.K;
    }

    static k l(kik.a.b.a.a a1)
    {
        return a1.M;
    }

    public final List A()
    {
        Object obj = new ArrayList();
        Hashtable hashtable = s;
        hashtable;
        JVM INSTR monitorenter ;
        Enumeration enumeration = s.elements();
_L5:
        if (!enumeration.hasMoreElements()) goto _L2; else goto _L1
_L1:
        kik.a.d.f f1;
        kik.a.d.k k1;
        f1 = (kik.a.d.f)enumeration.nextElement();
        k1 = f.a(f1.b(), false);
        if (k1 == null) goto _L4; else goto _L3
_L3:
        if ((k1 instanceof n) && ((n)k1).H()) goto _L5; else goto _L4
_L4:
        if (a(f1) != 1) goto _L7; else goto _L6
_L6:
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        if (k1.v() && !k1.m() && c(f1))
        {
            break MISSING_BLOCK_LABEL_201;
        }
        if (f.a(f1.b(), true) instanceof n)
        {
            break MISSING_BLOCK_LABEL_201;
        }
          goto _L7
_L9:
        boolean flag;
        if (!flag) goto _L5; else goto _L8
_L8:
        ((List) (obj)).add(new o(f1.b(), Long.valueOf(f1.a())));
          goto _L5
        obj;
        hashtable;
        JVM INSTR monitorexit ;
        throw obj;
_L7:
        flag = false;
          goto _L9
_L2:
        hashtable;
        JVM INSTR monitorexit ;
        return a(((List) (obj)));
        flag = true;
          goto _L9
    }

    public final List B()
    {
        Object obj = new ArrayList();
        Hashtable hashtable = s;
        hashtable;
        JVM INSTR monitorenter ;
        Enumeration enumeration = s.elements();
_L11:
        if (!enumeration.hasMoreElements()) goto _L2; else goto _L1
_L1:
        kik.a.d.f f1;
        Object obj1;
        f1 = (kik.a.d.f)enumeration.nextElement();
        obj1 = f.a(f1.b(), false);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        if ((obj1 instanceof n) && ((n)obj1).H())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        if (!c(f1) || a(f1) != 2) goto _L4; else goto _L5
_L5:
        boolean flag = true;
_L9:
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = f1.c().iterator();
_L7:
        kik.a.d.a.l l1;
        Object obj2;
        if (!((Iterator) (obj1)).hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj2 = (s)((Iterator) (obj1)).next();
        l1 = (kik.a.d.a.l)kik.a.d.a.g.a(((s) (obj2)), kik/a/d/a/l);
        obj2 = (kik.a.d.a.m)kik.a.d.a.g.a(((s) (obj2)), kik/a/d/a/m);
        if (l1 == null && obj2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (l1 == null) goto _L7; else goto _L6
_L6:
        if (!l1.c()) goto _L7; else goto _L8
_L8:
        ((List) (obj)).add(new o(f1.b(), Long.valueOf(f1.a())));
        continue; /* Loop/switch isn't completed */
        obj;
        hashtable;
        JVM INSTR monitorexit ;
        throw obj;
_L4:
        flag = false;
        if (true) goto _L9; else goto _L2
_L2:
        hashtable;
        JVM INSTR monitorexit ;
        return a(((List) (obj)));
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final List C()
    {
        Object obj = new ArrayList();
        Hashtable hashtable = s;
        hashtable;
        JVM INSTR monitorenter ;
        Enumeration enumeration = s.elements();
_L3:
        kik.a.d.f f1;
        Object obj1;
        if (!enumeration.hasMoreElements())
        {
            break MISSING_BLOCK_LABEL_172;
        }
        f1 = (kik.a.d.f)enumeration.nextElement();
        obj1 = f.a(f1.b(), false);
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        if ((obj1 instanceof n) && ((n)obj1).H()) goto _L3; else goto _L2
_L2:
        if (a(f1) != 8) goto _L3; else goto _L4
_L4:
        obj1 = f1.c().iterator();
_L7:
        if (!((Iterator) (obj1)).hasNext()) goto _L3; else goto _L5
_L5:
        if ((kik.a.d.a.l)kik.a.d.a.g.a((s)((Iterator) (obj1)).next(), kik/a/d/a/l) != null) goto _L7; else goto _L6
_L6:
        ((List) (obj)).add(new o(f1.b(), Long.valueOf(f1.a())));
          goto _L3
        obj;
        hashtable;
        JVM INSTR monitorexit ;
        throw obj;
        hashtable;
        JVM INSTR monitorexit ;
        return a(((List) (obj)));
    }

    public final int D()
    {
        return X;
    }

    public final void E()
    {
        synchronized (s)
        {
            s.clear();
        }
        return;
        exception;
        hashtable;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void F()
    {
        List list = l;
        list;
        JVM INSTR monitorenter ;
        Object obj = new ArrayList(l);
        l.clear();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); d((s)((Iterator) (obj)).next())) { }
        break MISSING_BLOCK_LABEL_66;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        list;
        JVM INSTR monitorexit ;
    }

    public final void G()
    {
        p p1 = h.b();
        if (p1.g())
        {
            d.a(new ah(this, (KeyPair)p1.f(), h), true);
        }
    }

    public final int H()
    {
        return K().size();
    }

    public final int I()
    {
        Iterator iterator = B().iterator();
        int i1 = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            kik.a.d.f f1 = (kik.a.d.f)iterator.next();
            if (f1.a(f) && !f1.n())
            {
                i1++;
            }
        } while (true);
        return i1;
    }

    public final List J()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = B().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            kik.a.d.f f1 = (kik.a.d.f)iterator.next();
            if (f1.a(f) && !f1.n())
            {
                arraylist.add(f1);
            }
        } while (true);
        return arraylist;
    }

    public final List K()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = A().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            kik.a.d.f f1 = (kik.a.d.f)iterator.next();
            if (f1.a(f) && !f1.n())
            {
                arraylist.add(f1);
            }
        } while (true);
        return arraylist;
    }

    public final int L()
    {
        List list = B();
        List list1 = C();
        int i1 = list.size() + list1.size();
        a(i1);
        return i1;
    }

    public final int a(kik.a.d.f f1)
    {
        if (f1 == null)
        {
            return 4;
        }
        HashMap hashmap = c;
        hashmap;
        JVM INSTR monitorenter ;
        String s1 = f1.b();
        if (!c.containsKey(s1) || c.get(s1) == null) goto _L2; else goto _L1
_L1:
        int i1 = ((Integer)c.get(s1)).intValue();
_L9:
        return i1;
        f1;
        hashmap;
        JVM INSTR monitorexit ;
        throw f1;
_L2:
        Object obj = f.a(f1.b(), false);
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (obj instanceof n) goto _L6; else goto _L5
_L5:
        if (!((kik.a.d.k) (obj)).m()) goto _L8; else goto _L7
_L7:
        i1 = 4;
_L11:
        c.put(s1, Integer.valueOf(i1));
          goto _L9
_L8:
        if (((kik.a.d.k) (obj)).u()) goto _L4; else goto _L10
_L10:
        Object obj1;
        kik.a.d.a.l l1;
        kik.a.d.a.m m1;
        int j1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (!((kik.a.d.k) (obj)).l())
        {
            if (((kik.a.d.k) (obj)).h())
            {
                i1 = 8;
            } else
            {
                i1 = 2;
            }
        } else
        {
            i1 = 1;
        }
          goto _L11
_L6:
        if (!(obj instanceof n)) goto _L4; else goto _L12
_L12:
        obj1 = (n)obj;
        if (((n) (obj1)).l())
        {
            break MISSING_BLOCK_LABEL_183;
        }
        i1 = 4;
          goto _L11
        if (((n) (obj1)).I()) goto _L4; else goto _L13
_L13:
        f1 = new ArrayList(f1.c());
        i1 = 0;
        obj1 = f1.iterator();
        j1 = 0;
        flag1 = false;
_L19:
        if (!((Iterator) (obj1)).hasNext()) goto _L15; else goto _L14
_L14:
        f1 = (s)((Iterator) (obj1)).next();
        l1 = (kik.a.d.a.l)kik.a.d.a.g.a(f1, kik/a/d/a/l);
        m1 = (kik.a.d.a.m)kik.a.d.a.g.a(f1, kik/a/d/a/m);
        f1 = f.a(f1.h(), false);
        if (l1 == null) goto _L17; else goto _L16
_L16:
        if (l1.c())
        {
            f1 = f.a(l1.b(), false);
        }
          goto _L17
_L28:
        if (l1 == null) goto _L19; else goto _L18
_L18:
        if (!l1.c()) goto _L19; else goto _L20
_L20:
        j1++;
        if (f1 == null) goto _L4; else goto _L21
_L21:
        if (!f1.m() && f1.l()) goto _L4; else goto _L22
_L22:
        if (!f1.m() && !f1.l())
        {
            if (f1.h())
            {
                flag1 = true;
            } else
            {
                i1 = 1;
            }
        }
          goto _L19
_L15:
        if (j1 != 0)
        {
            break MISSING_BLOCK_LABEL_537;
        }
        f1 = ((n)obj).w();
        if (f1.size() != 0)
        {
            break MISSING_BLOCK_LABEL_405;
        }
        i1 = 4;
          goto _L11
        f1 = f1.iterator();
        i1 = 0;
        flag = false;
_L27:
        if (!f1.hasNext())
        {
            break MISSING_BLOCK_LABEL_508;
        }
        obj = (String)f1.next();
        obj = f.a(((String) (obj)), false);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_502;
        }
        if (obj == null) goto _L24; else goto _L23
_L23:
        if (!((kik.a.d.k) (obj)).m()) goto _L24; else goto _L25
_L25:
        i1 = 4;
          goto _L11
_L24:
        if (((kik.a.d.k) (obj)).l()) goto _L27; else goto _L26
_L26:
        flag2 = ((kik.a.d.k) (obj)).h();
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_502;
        }
        flag = true;
          goto _L27
        i1 = 1;
          goto _L27
        if (flag)
        {
            i1 = 8;
        } else
        if (i1 != 0)
        {
            i1 = 2;
        } else
        {
            i1 = 1;
        }
          goto _L11
        if (i1 != 0)
        {
            i1 = 2;
        } else
        if (flag1)
        {
            i1 = 8;
        } else
        {
            i1 = 4;
        }
          goto _L11
_L4:
        i1 = 1;
          goto _L11
_L17:
        if (l1 == null && m1 == null) goto _L20; else goto _L28
    }

    public final com.kik.g.e a()
    {
        return E.a();
    }

    public final kik.a.d.f a(String s1)
    {
        synchronized (s)
        {
            s1 = (kik.a.d.f)s.get(s1);
        }
        return s1;
        s1;
        hashtable;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void a(int i1)
    {
        if (B != i1)
        {
            B = i1;
            x.a(Integer.valueOf(i1));
        }
    }

    public final void a(String s1, int i1)
    {
        kik.a.d.f f1;
        synchronized (s)
        {
            f1 = (kik.a.d.f)s.get(s1);
        }
        if (f1 == null)
        {
            return;
        }
        break MISSING_BLOCK_LABEL_33;
        s1;
        hashtable;
        JVM INSTR monitorexit ;
        throw s1;
        long l1 = kik.a.h.j.b();
        long l2 = Calendar.getInstance().getTimeInMillis();
        if (i1 == 0)
        {
            l1 += 0x36ee80L;
        } else
        if (i1 == 1)
        {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(l2);
            if (calendar.get(11) >= 8)
            {
                calendar.add(5, 1);
            }
            calendar.set(9, 0);
            calendar.set(10, 8);
            calendar.set(11, 8);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            l1 += calendar.getTimeInMillis() - l2;
        } else
        {
            l1 = -1L;
        }
        G.a(null);
        com.kik.g.s.b(d.a(new t(this, f1.b(), String.valueOf(l1)))).a(new kik.a.b.a.m(this, s1, l1, f1));
        return;
    }

    public final void a(String s1, long l1)
    {
        kik.a.d.f f1;
        synchronized (s)
        {
            f1 = (kik.a.d.f)s.get(s1);
        }
        if (f1 == null)
        {
            return;
        } else
        {
            f1.a(true, l1);
            b(s1, l1);
            u.put(s1, f1.q());
            e.a(f1.q());
            F.a(s1);
            return;
        }
        s1;
        hashtable;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void a(String s1, boolean flag)
    {
        kik.a.d.f f1;
        synchronized (s)
        {
            f1 = (kik.a.d.f)s.get(s1);
        }
        if (f1 == null)
        {
            return;
        }
        break MISSING_BLOCK_LABEL_33;
        s1;
        hashtable;
        JVM INSTR monitorexit ;
        throw s1;
        f1.a(false, -1L);
        if (t.containsKey(s1))
        {
            ((ScheduledFuture)t.get(s1)).cancel(false);
            t.remove(s1);
        }
        if (flag)
        {
            E.a(s1);
        }
        u.remove(s1);
        e.j(s1);
        F.a(s1);
        return;
    }

    public final void a(Vector vector, kik.a.d.k k1)
    {
        f.c(k1.a());
        d.a(new ai(k1.b(), kik.a.z.b(e).a().a(), vector));
        b(k1.b());
    }

    public final void a(kik.a.d.f f1, boolean flag)
    {
        if (f1 != null)
        {
            long l1 = System.currentTimeMillis();
            if ((flag || f1.l()) && (flag && !f1.l() || !flag && f1.l() || l1 - f1.k() > 4000L))
            {
                f1.c(flag);
                s s1 = kik.a.d.s.a(f1.b());
                s1.a(new kik.a.d.a.f(flag));
                d(s1);
                f1.a(l1);
                return;
            }
        }
    }

    public final void a(kik.a.f.c.g g1)
    {
        if (g1 instanceof kik.a.f.c.c)
        {
            g1 = (kik.a.f.c.c)g1;
            ArrayList arraylist = new ArrayList();
            arraylist.add(g1);
            b(arraylist);
        }
    }

    public final void a(kik.a.f.f.z z1, int i1)
    {
        if (!(z1 instanceof kik.a.f.f.v)) goto _L2; else goto _L1
_L1:
        Object obj = (kik.a.f.f.v)z1;
        i1;
        JVM INSTR tableswitch 1 3: default 40
    //                   1 113
    //                   2 40
    //                   3 236;
           goto _L2 _L3 _L2 _L4
_L2:
        if (!(z1 instanceof kik.a.f.f.u)) goto _L6; else goto _L5
_L5:
        obj = (kik.a.f.f.u)z1;
        i1;
        JVM INSTR tableswitch 2 3: default 76
    //                   2 290
    //                   3 425;
           goto _L6 _L7 _L8
_L6:
        if (!(z1 instanceof ah)) goto _L10; else goto _L9
_L9:
        z1 = (ah)z1;
        i1;
        JVM INSTR tableswitch 2 3: default 112
    //                   2 432
    //                   3 819;
           goto _L10 _L11 _L12
_L10:
        return;
_L3:
        if (!kik.a.d.a.g.a(((kik.a.f.f.v) (obj)).e())) goto _L2; else goto _L13
_L13:
        Object obj1 = e(((kik.a.f.f.v) (obj)).e());
        obj1;
        JVM INSTR monitorenter ;
        Object obj2;
        if (!((kik.a.d.f) (obj1)).a(((kik.a.f.f.v) (obj)).e().b(), 200, e))
        {
            break MISSING_BLOCK_LABEL_224;
        }
        N.a(new Integer(200));
        obj2 = ((kik.a.d.f) (obj1)).a(((kik.a.f.f.v) (obj)).e().b());
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        v.a(new c(((kik.a.f.f.v) (obj)).e(), ((kik.a.f.f.v) (obj)).e().b(), ((s) (obj2)).e()));
        obj1;
        JVM INSTR monitorexit ;
          goto _L2
        z1;
        obj1;
        JVM INSTR monitorexit ;
        throw z1;
_L4:
        synchronized (e(((kik.a.f.f.v) (obj)).e()))
        {
            f1.a(((kik.a.f.f.v) (obj)).e().b(), 600, e);
            K.a(f1);
        }
          goto _L2
        z1;
        f1;
        JVM INSTR monitorexit ;
        throw z1;
_L7:
        e.g();
        u = ((kik.a.f.f.u) (obj)).d();
        f1 = new ArrayList();
        obj = s;
        obj;
        JVM INSTR monitorenter ;
        kik.a.d.g g1;
        for (obj2 = u.values().iterator(); ((Iterator) (obj2)).hasNext(); f1.add(g1))
        {
            g1 = (kik.a.d.g)((Iterator) (obj2)).next();
            String s1 = g1.a();
            if (s.containsKey(s1))
            {
                ((kik.a.d.f)s.get(s1)).a(g1);
            }
        }

          goto _L14
        z1;
        obj;
        JVM INSTR monitorexit ;
        throw z1;
_L14:
        obj;
        JVM INSTR monitorexit ;
        e.a(f1);
_L8:
        G();
          goto _L6
_L11:
        Object obj3;
        Object obj4;
        R.a(null);
        obj3 = z1.e();
        obj4 = z1.g();
        if ((obj3 == null || ((Vector) (obj3)).isEmpty()) && (obj4 == null || ((List) (obj4)).isEmpty())) goto _L16; else goto _L15
_L15:
        a(z1.d());
        obj = new Vector();
        f1 = new Vector();
        obj2 = new ArrayList();
        Set set = m;
        m = new HashSet();
        for (obj4 = ((List) (obj4)).iterator(); ((Iterator) (obj4)).hasNext();)
        {
            kik.a.f.c.c c2 = (kik.a.f.c.c)((Iterator) (obj4)).next();
            String s2 = c2.j();
            if (set.contains(s2))
            {
                ((List) (obj2)).add(c2);
                set.remove(s2);
            } else
            {
                m.add(s2);
            }
        }

        obj3 = ((Vector) (obj3)).iterator();
        do
        {
            if (!((Iterator) (obj3)).hasNext())
            {
                break;
            }
            kik.a.f.c.c c1 = (kik.a.f.c.c)((Iterator) (obj3)).next();
            if (c1.i() != null)
            {
                kik.a.d.k k1 = f.a(c1.i(), false);
                if (k1 != null && k1.m())
                {
                    f1.addElement(c1);
                } else
                {
                    ((Vector) (obj)).addElement(c1);
                }
            }
        } while (true);
        a(((Vector) (obj)));
        if (((Vector) (obj)).size() <= 0 && f1.size() <= 0 && ((List) (obj2)).size() <= 0) goto _L16; else goto _L17
_L17:
        z1 = a(((Vector) (obj)), ((Vector) (f1)), ((List) (obj2)), z1.f());
        i1 = 1;
        d.a(z1, false);
_L18:
        if (i1 == 0)
        {
            if (C != null)
            {
                C.a(d.j());
                y.a(C);
                C = null;
            }
            Q.a(null);
            M();
            return;
        }
          goto _L10
_L12:
        if (z1.l() != 101)
        {
            (new StringBuilder("QoS request FAILED! error code: ")).append(z1.l());
        }
        S.a(null);
        C = null;
        return;
_L16:
        i1 = 0;
          goto _L18
    }

    public final boolean a(kik.a.d.f f1, s s1)
    {
        if (f1 == null)
        {
            return false;
        }
        Object obj = f1.c();
        if (obj == null)
        {
            return false;
        }
        f1 = f1.b();
        for (obj = ((Vector) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            s s2 = (s)((Iterator) (obj)).next();
            if (f1 == null || f1.equals(s2.i()))
            {
                kik.a.d.a.l l1 = (kik.a.d.a.l)kik.a.d.a.g.a(s2, kik/a/d/a/l);
                if (s2 != null && l1 == null && s2 != s1)
                {
                    return true;
                }
            }
        }

        return false;
    }

    public final boolean a(s s1)
    {
        Object obj = i.d();
        kik.a.d.f f1 = e(s1);
        kik.a.d.k k1;
        boolean flag;
        boolean flag2;
        if (!f1.n() || f1.n() && f1.p() != -1L && f1.p() <= kik.a.h.j.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((aa) (obj)).h != null)
        {
            flag2 = ((aa) (obj)).h.booleanValue();
        } else
        {
            flag2 = false;
        }
        obj = f.a(s1.i(), false);
        k1 = f.a(s1.h(), false);
        if (k1 == null || !k1.h() || k1.l())
        {
            boolean flag1;
            byte byte0;
            if (obj != null && (obj instanceof n) && ((n)obj).H())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag2)
            {
                byte0 = 3;
            } else
            {
                byte0 = 1;
            }
            if (flag && !flag1 && kik.a.d.a.g.b(s1) && (byte0 & a(f1)) != 0)
            {
                return true;
            }
        }
        return false;
    }

    public final com.kik.g.e b()
    {
        return F.a();
    }

    public final p b(s s1)
    {
        p p1 = new p();
        kik.a.d.f f1 = e(s1);
        com.kik.g.s.a(null);
        com.kik.g.s.a(null);
        Object obj = f.a(f1.b(), false);
        if (kik.a.d.a.g.a(s1))
        {
            ArrayList arraylist;
            if (obj instanceof n)
            {
                obj = new ArrayList(((n)obj).w());
            } else
            {
                obj = new ArrayList();
                ((List) (obj)).add(f1.b());
            }
            arraylist = new ArrayList();
            String s2;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(g.a(s2)))
            {
                s2 = (String)((Iterator) (obj)).next();
            }

            com.kik.g.s.a(h.b(), com.kik.g.s.a(arraylist), false).a(new q(this, s1, f1, p1));
            return com.kik.g.s.a(p1, 5000L);
        } else
        {
            return com.kik.g.s.a(null);
        }
    }

    public final void b(int i1)
    {
        X = i1;
        e.c("ConversationManager.missedconvos.watermark", String.valueOf(i1));
    }

    public final void b(String s1)
    {
        kik.a.d.f f1;
        synchronized (s)
        {
            f1 = (kik.a.d.f)s.get(s1);
        }
        i(s1);
        P.a(f1);
        return;
        s1;
        hashtable;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final boolean b(kik.a.d.f f1)
    {
        if (f1 != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        boolean flag;
        f1.a(false);
        Object obj2 = f1.b(false);
        if (((Vector) (obj2)).size() <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        L.a(obj2);
        Object obj = f.a(f1.b(), false);
        if (obj != null && ((kik.a.d.k) (obj)).m())
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1 = new Vector();
        if (obj instanceof n)
        {
            obj = ((n)obj).w();
            for (int i1 = 0; i1 < ((List) (obj)).size(); i1++)
            {
                kik.a.d.k k1 = f.a((String)((List) (obj)).get(i1), false);
                if (k1 != null && k1.m())
                {
                    ((Vector) (obj1)).add(((List) (obj)).get(i1));
                }
            }

        }
        int i2;
        if (((Vector) (obj2)).size() > 0)
        {
            Hashtable hashtable = new Hashtable();
            obj2 = ((Vector) (obj2)).iterator();
            int j1 = 0;
            do
            {
                if (!((Iterator) (obj2)).hasNext())
                {
                    break;
                }
                s s1 = (s)((Iterator) (obj2)).next();
                if (!((Vector) (obj1)).contains(s1.h()))
                {
                    int l1 = j1 + 1;
                    f1.a(s1, 500, e);
                    j1 = l1;
                    if (s1.j())
                    {
                        if (!hashtable.containsKey(s1.i()))
                        {
                            hashtable.put(s1.i(), new Hashtable());
                        }
                        Hashtable hashtable2 = (Hashtable)hashtable.get(s1.i());
                        if (!hashtable2.containsKey(s1.h()))
                        {
                            hashtable2.put(s1.h(), new Vector());
                        }
                        ((Vector)hashtable2.get(s1.h())).addElement(s1);
                        j1 = l1;
                    }
                }
            } while (true);
            obj1 = hashtable.keySet().iterator();
            do
            {
                i2 = j1;
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                Hashtable hashtable1 = (Hashtable)hashtable.get((String)((Iterator) (obj1)).next());
                Iterator iterator = hashtable1.keySet().iterator();
                while (iterator.hasNext()) 
                {
                    String s2 = (String)iterator.next();
                    d.a(new x((Vector)hashtable1.get(s2)));
                }
            } while (true);
        } else
        {
            i2 = 0;
        }
        if (i2 <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = true;
_L4:
        if (flag)
        {
            K.a(f1);
            O.a(f1);
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        flag = false;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final com.kik.g.e c()
    {
        return G.a();
    }

    public final void c(String s1)
    {
        kik.a.d.k k1 = f.a(s1, false);
        kik.a.d.f f1;
        synchronized (s)
        {
            f1 = (kik.a.d.f)s.get(s1);
        }
        if (k1 instanceof n)
        {
            j.a((n)k1);
        } else
        {
            i(s1);
        }
        P.a(f1);
        return;
        s1;
        hashtable;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void c(s s1)
    {
        kik.a.d.f f1 = e(s1);
        a(s1, false, false);
        f1.c(false);
    }

    public final com.kik.g.e d()
    {
        return H.a();
    }

    public final p d(s s1)
    {
        p p1 = new p();
        kik.a.d.f f1 = e(s1);
        kik.a.d.k k1 = f.a(f1.b(), false);
        if (kik.a.d.a.g.a(s1))
        {
            a(s1, false, false);
            f1.c(false);
        }
        b(s1).a(new kik.a.b.a.c(this, k1, s1, p1));
        return p1;
    }

    public final void d(String s1)
    {
        kik.a.d.f f1;
        synchronized (s)
        {
            f1 = (kik.a.d.f)s.get(s1);
        }
        if (f1 == null)
        {
            return;
        } else
        {
            G.a(null);
            com.kik.g.s.b(d.a(new an(this, f1.b()))).a(new kik.a.b.a.o(this, s1, f1));
            return;
        }
        s1;
        hashtable;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final com.kik.g.e e()
    {
        return I.a();
    }

    public final void e(String s1)
    {
        a(s1, false);
    }

    public final com.kik.g.e f()
    {
        return J.a();
    }

    public final kik.a.d.f f(String s1)
    {
        Hashtable hashtable = s;
        hashtable;
        JVM INSTR monitorenter ;
        kik.a.d.f f2 = (kik.a.d.f)s.get(s1);
        kik.a.d.f f1;
        f1 = f2;
        if (f2 != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        h(s1);
        f1 = (kik.a.d.f)s.get(s1);
        hashtable;
        JVM INSTR monitorexit ;
        return f1;
        s1;
        hashtable;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final com.kik.g.e g()
    {
        return K.a();
    }

    public final boolean g(String s1)
    {
        return d.a(s1);
    }

    public final com.kik.g.e h()
    {
        return M.a();
    }

    public final kik.a.d.f h(String s1)
    {
        kik.a.d.f f1 = new kik.a.d.f(s1);
        if (u.containsKey(s1))
        {
            f1.a((kik.a.d.g)u.get(s1));
            e.a((kik.a.d.g)u.get(s1));
        }
        synchronized (s)
        {
            s.put(s1, f1);
        }
        return f1;
        s1;
        hashtable;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final com.kik.g.e i()
    {
        return N.a();
    }

    public final com.kik.g.e j()
    {
        return O.a();
    }

    public final com.kik.g.e k()
    {
        return P.a();
    }

    public final com.kik.g.e l()
    {
        return Q.a();
    }

    public final com.kik.g.e m()
    {
        return R.a();
    }

    public final com.kik.g.e n()
    {
        return S.a();
    }

    public final com.kik.g.e o()
    {
        return T.a();
    }

    public final com.kik.g.e p()
    {
        return U.a();
    }

    public final com.kik.g.e q()
    {
        return V.a();
    }

    public final com.kik.g.e r()
    {
        return v.a();
    }

    public final com.kik.g.e s()
    {
        return w.a();
    }

    public final com.kik.g.e t()
    {
        return x.a();
    }

    public final com.kik.g.e u()
    {
        return y.a();
    }

    public final com.kik.g.e v()
    {
        return z.a();
    }

    public final void w()
    {
        s s1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); V.a(s1))
        {
            s1 = (s)iterator.next();
            d(s1);
        }

        a.clear();
    }

    public final void x()
    {
        s s1;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); V.a(s1))
        {
            s1 = (s)iterator.next();
        }

        b.clear();
    }

    public final void y()
    {
        Object obj = e.n("ConversationManager.missedconvos.watermark");
        int i1;
        if (obj == null)
        {
            i1 = 0;
        } else
        {
            i1 = Integer.valueOf(((String) (obj))).intValue();
        }
        X = i1;
        s = e.l();
        for (obj = s.values().iterator(); ((Iterator) (obj)).hasNext();)
        {
            kik.a.d.f f1 = (kik.a.d.f)((Iterator) (obj)).next();
            Iterator iterator2 = f1.c().iterator();
            while (iterator2.hasNext()) 
            {
                s s1 = (s)iterator2.next();
                boolean flag;
                if (s1.c() == 100)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (s1.c() == 101)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (i1 != 0 || flag)
                {
                    if ((long)s1.f() <= 3L)
                    {
                        if (i1 != 0)
                        {
                            a.add(s1);
                        } else
                        {
                            b.add(s1);
                        }
                        s1.g();
                        e.c(s1);
                    } else
                    {
                        f1.a(s1, 600, e);
                    }
                }
            }
        }

        obj = j.a().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            n n1 = (n)((Iterator) (obj)).next();
            if (n1.l())
            {
                n1.w();
                if (n1.w().size() > 0 && s.get(n1.b()) == null)
                {
                    h(n1.b());
                }
            }
        } while (true);
        obj = e.f();
        if (obj != null)
        {
            Iterator iterator = s.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                kik.a.d.f f2 = (kik.a.d.f)iterator.next();
                kik.a.d.g g1 = (kik.a.d.g)((Hashtable) (obj)).get(f2.b());
                if (g1 != null)
                {
                    f2.a(g1);
                }
            } while (true);
        }
        obj = e.j();
        if (obj != null)
        {
            kik.a.d.f f3;
            for (Iterator iterator1 = s.values().iterator(); iterator1.hasNext(); f3.b((List)((HashMap) (obj)).get(f3.b())))
            {
                f3 = (kik.a.d.f)iterator1.next();
            }

        }
        n = kik.a.h.m.a();
        d.a(this);
        obj = e.n("ConversationManager.QOS_POLLING_INTERVAL");
        Iterator iterator4;
        long l1;
        long l2;
        if (obj != null)
        {
            l1 = Long.parseLong(((String) (obj)));
        } else
        {
            l1 = 0x36ee80L;
        }
        l2 = l1;
        if (l1 == 0L)
        {
            l2 = 0x36ee80L;
        }
        a(l2);
        synchronized (c)
        {
            c.clear();
        }
        obj1 = new HashSet();
        obj2 = new HashSet();
        for (Iterator iterator3 = A().iterator(); iterator3.hasNext(); ((HashSet) (obj1)).add(((kik.a.d.f)iterator3.next()).b())) { }
        break MISSING_BLOCK_LABEL_599;
        obj2;
        obj1;
        JVM INSTR monitorexit ;
        throw obj2;
        for (iterator4 = B().iterator(); iterator4.hasNext(); ((HashSet) (obj2)).add(((kik.a.d.f)iterator4.next()).b())) { }
        A = ((HashSet) (obj1));
        B = ((HashSet) (obj2)).size();
        D.a(h.a(), ab);
        D.a(d.b(), aa);
        D.a(f.b(), ac);
        D.a(f.c(), ad);
        D.a(j.e(), ad);
        D.a(K.a(), ae);
        D.a(j.b(), Y);
        D.a(j.c(), Z);
        D.a(e.d(), af);
        return;
    }

    public final void z()
    {
        d.b(this);
        D.a();
    }

}
