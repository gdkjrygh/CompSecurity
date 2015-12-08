// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.g;

import com.kik.g.a;
import com.kik.g.as;
import com.kik.g.e;
import com.kik.g.f;
import com.kik.g.i;
import com.kik.g.k;
import com.kik.g.s;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kik.a.d.a.d;
import kik.a.d.j;
import kik.a.d.n;
import kik.a.e.p;
import kik.a.e.r;
import kik.a.f.f.aj;
import kik.a.f.f.ak;
import kik.a.f.f.am;
import kik.a.f.f.g;
import kik.a.h.h;
import kik.a.z;
import org.c.b;
import org.c.c;

// Referenced classes of package kik.a.g:
//            aj, ak, am, an, 
//            a, as, au, av, 
//            af, al, ag, ah, 
//            ap, ar, ai, w, 
//            ao, ab, aw, ad, 
//            x, z

public final class v
    implements p, r
{
    private final class a
        implements as
    {

        final v a;
        private String b;

        public final volatile Object a(Object obj)
        {
            return a.a(b, false);
        }

        a(String s1)
        {
            a = v.this;
            super();
            b = s1;
        }
    }

    private final class b
        implements Comparator
    {

        final v a;

        public final int compare(Object obj, Object obj1)
        {
            obj = (kik.a.d.k)obj;
            obj1 = (kik.a.d.k)obj1;
            return kik.a.h.i.a(((kik.a.d.k) (obj)).c(), ((kik.a.d.k) (obj1)).c());
        }

        private b()
        {
            a = v.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }


    private static final org.c.b q = org.c.c.a("ProfileManager");
    private k A;
    private k B;
    private k C;
    private final i D = new kik.a.g.aj(this);
    private final i E = new kik.a.g.ak(this);
    private final i F = new kik.a.g.am(this);
    private final i G = new an(this);
    private ScheduledFuture a;
    private Hashtable b;
    private String c;
    private long d;
    private final kik.a.e.v e;
    private final kik.a.e.f f;
    private kik.a.e.k g;
    private final Object h = new Object();
    private com.kik.g.p i;
    private Map j;
    private Object k;
    private f l;
    private LinkedHashMap m;
    private boolean n;
    private volatile long o;
    private volatile boolean p;
    private ScheduledExecutorService r;
    private boolean s;
    private k t;
    private k u;
    private k v;
    private k w;
    private k x;
    private k y;
    private k z;

    public v(kik.a.e.v v1, kik.a.e.f f1, kik.a.e.k k1, ExecutorService executorservice)
    {
        a = null;
        l = new f();
        o = 0x8000000000000000L;
        s = false;
        e = v1;
        f = f1;
        g = k1;
        j = new HashMap();
        u = new com.kik.g.a(this, executorservice);
        t = new com.kik.g.a(this, executorservice);
        v = new com.kik.g.a(this, executorservice);
        w = new com.kik.g.a(this, executorservice);
        x = new com.kik.g.a(this, executorservice);
        y = new com.kik.g.a(this, executorservice);
        z = new com.kik.g.a(this, executorservice);
        A = new com.kik.g.a(this, executorservice);
        B = new com.kik.g.a(this, executorservice);
        C = new com.kik.g.a(this, executorservice);
        k = new Object();
        m = new LinkedHashMap();
        r = Executors.newSingleThreadScheduledExecutor();
    }

    static LinkedHashMap a(v v1)
    {
        return v1.m;
    }

    private Set a(Set set)
    {
        Object obj;
        Iterator iterator;
        obj = new HashSet();
        iterator = set.iterator();
_L4:
        String s1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_113;
        }
        s1 = (String)iterator.next();
        set = m;
        set;
        JVM INSTR monitorenter ;
        if (!m.containsKey(s1))
        {
            break MISSING_BLOCK_LABEL_80;
        }
        ((Set) (obj)).add(m.get(s1));
_L2:
        continue; /* Loop/switch isn't completed */
        obj;
        set;
        JVM INSTR monitorexit ;
        throw obj;
        com.kik.g.p p1 = new com.kik.g.p();
        m.put(s1, p1);
        ((Set) (obj)).add(p1);
        if (true) goto _L2; else goto _L1
_L1:
        m();
        return ((Set) (obj));
        if (true) goto _L4; else goto _L3
_L3:
    }

    private kik.a.d.k a(String s1, boolean flag, kik.a.e.r.a a1, HashMap hashmap)
    {
        kik.a.d.k k1 = a(s1, true);
        Object obj;
        if (k1 instanceof n)
        {
            obj = kik.a.d.n.a((n)k1);
        } else
        {
            obj = kik.a.d.k.a(k1);
        }
        a1.a(((kik.a.d.k) (obj)));
        if (a(((kik.a.d.k) (obj)), true, flag))
        {
            t.a(null);
        }
        if (flag)
        {
            synchronized (h)
            {
                j.put(s1, new kik.a.g.a(s1, hashmap));
                p();
            }
        }
        return k1;
        s1;
        a1;
        JVM INSTR monitorexit ;
        throw s1;
    }

    static void a(v v1, List list, List list1, List list2, List list3, long l1, boolean flag)
    {
        Object obj = v1.k;
        obj;
        JVM INSTR monitorenter ;
        long l2;
        l2 = v1.d;
        list2 = list2.iterator();
_L2:
        Object obj1;
        do
        {
            if (!list2.hasNext())
            {
                break MISSING_BLOCK_LABEL_105;
            }
            obj1 = (j)list2.next();
            obj1 = (kik.a.d.k)v1.b.get(((j) (obj1)).a());
        } while (obj1 == null);
        v1.e.d(((kik.a.d.k) (obj1)));
        ((kik.a.d.k) (obj1)).d(false);
        ((kik.a.d.k) (obj1)).f(false);
        list.add(obj1);
        if (true) goto _L2; else goto _L1
_L1:
        v1;
        obj;
        JVM INSTR monitorexit ;
        throw v1;
        list2 = list3.iterator();
_L3:
        do
        {
            do
            {
                if (!list2.hasNext())
                {
                    break MISSING_BLOCK_LABEL_200;
                }
                list3 = (j)list2.next();
                list3 = (kik.a.d.k)v1.b.get(list3.a());
            } while (!(list3 instanceof n));
            list3 = (n)list3;
        } while (list3 == null);
        list3.i(true);
        list3.d(false);
        list3.k(false);
        list1.add(list3);
          goto _L3
        list2 = list.iterator();
_L5:
        do
        {
            if (!list2.hasNext())
            {
                break MISSING_BLOCK_LABEL_267;
            }
            list3 = (kik.a.d.k)list2.next();
        } while (list3 == null);
        obj1 = (kik.a.d.k)v1.b.get(list3.b());
        if (obj1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        list3.a(((kik.a.d.k) (obj1)).h());
        if (true) goto _L5; else goto _L4
_L4:
        boolean flag1 = false;
        if (list == null) goto _L7; else goto _L6
_L6:
        list2 = ((List) (v1.k));
        list2;
        JVM INSTR monitorenter ;
        list3 = list.iterator();
        flag1 = false;
        while (list3.hasNext()) 
        {
            if (v1.a((kik.a.d.k)list3.next(), false, true) || flag1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        }
        v1.e.b(list);
        list2;
        JVM INSTR monitorexit ;
_L7:
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_355;
        }
        v1.t.a(null);
        v1.B.a(list1);
        v1.d = l1;
        v1.p = flag;
        v1.e.c("ProfileManager.rosterTimeStamp", Long.toString(v1.d));
        list1 = v1.e;
        if (v1.p)
        {
            list = "1";
        } else
        {
            list = "0";
        }
        list1.c("ProfileManager.rosterIsBatchedKey", list);
        if (!flag) goto _L9; else goto _L8
_L8:
        if (l2 != l1) goto _L11; else goto _L10
_L10:
        q.c("Server re-sent last roster timestamp: {}", Long.valueOf(l1));
_L12:
        obj;
        JVM INSTR monitorexit ;
        return;
        v1;
        list2;
        JVM INSTR monitorexit ;
        throw v1;
_L11:
        v1.a(false, false);
          goto _L12
_L9:
        list = v1.b.elements();
        list1 = new HashSet();
        do
        {
            if (!list.hasMoreElements())
            {
                break;
            }
            list2 = (kik.a.d.k)list.nextElement();
            if (list2.g() && !(list2 instanceof n))
            {
                list1.add(list2.b());
            }
        } while (true);
        if (list1.size() <= 0) goto _L12; else goto _L13
_L13:
        v1.a(((Set) (list1)));
          goto _L12
    }

    private com.kik.g.p b(Set set)
    {
        try
        {
            set = com.kik.g.s.b(f.a(kik.a.f.f.f.a(set)));
            set.a(new kik.a.g.as(this));
            set = com.kik.g.s.b(set, new au(this));
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            return null;
        }
        return set;
    }

    private void b(kik.a.d.k k1)
    {
        if (k1 == null)
        {
            return;
        } else
        {
            e.d(k1);
            C.a(k1);
            return;
        }
    }

    static boolean b(v v1)
    {
        v1.n = false;
        return false;
    }

    static kik.a.e.f c(v v1)
    {
        return v1.f;
    }

    static Object d(v v1)
    {
        return v1.k;
    }

    static ScheduledFuture e(v v1)
    {
        v1.a = null;
        return null;
    }

    static k f(v v1)
    {
        return v1.A;
    }

    static com.kik.g.p g(v v1)
    {
        v1.i = null;
        return null;
    }

    static Object h(v v1)
    {
        return v1.h;
    }

    static k i(v v1)
    {
        return v1.y;
    }

    static k j(v v1)
    {
        return v1.u;
    }

    static void k(v v1)
    {
label0:
        {
            synchronized (v1.k)
            {
                if (!v1.s)
                {
                    break label0;
                }
            }
            return;
        }
        HashSet hashset;
        v1.s = true;
        hashset = new HashSet();
        Enumeration enumeration = v1.b.elements();
        do
        {
            if (!enumeration.hasMoreElements())
            {
                break;
            }
            kik.a.d.k k1 = (kik.a.d.k)enumeration.nextElement();
            if (k1.g() && !(k1 instanceof n))
            {
                hashset.add(k1.b());
                if (hashset.size() >= 50)
                {
                    v1.b(hashset);
                    hashset.clear();
                }
            }
        } while (true);
        break MISSING_BLOCK_LABEL_117;
        v1;
        obj;
        JVM INSTR monitorexit ;
        throw v1;
        if (hashset.size() > 0)
        {
            v1.b(hashset);
        }
        v1.s = false;
        obj;
        JVM INSTR monitorexit ;
    }

    static long l(v v1)
    {
        v1.d = 0L;
        return 0L;
    }

    static long m(v v1)
    {
        return v1.d;
    }

    static kik.a.e.v n(v v1)
    {
        return v1.e;
    }

    static long o(v v1)
    {
        return v1.o;
    }

    public final e a()
    {
        return t.a();
    }

    public final com.kik.g.p a(String s1)
    {
        kik.a.d.k k1;
        byte abyte0[];
        k1 = a(s1, false);
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        abyte0 = k1.j();
        if (abyte0 == null || abyte0.length == 0)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        com.kik.g.p p1 = com.kik.g.s.a(kik.a.h.h.a(abyte0));
        return p1;
        Object obj;
        obj;
_L2:
        if (k1 != null && k1.k())
        {
            return com.kik.g.s.a(null);
        } else
        {
            return com.kik.g.s.b(e(s1), new av(this));
        }
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final com.kik.g.p a(d d1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("type", d1.b());
        hashmap.put("reply", Boolean.toString(d1.f()));
        return a(d1.d(), hashmap);
    }

    public final com.kik.g.p a(j j1)
    {
        return a(j1, ((HashMap) (null)));
    }

    public final com.kik.g.p a(j j1, HashMap hashmap)
    {
        hashmap = a(j1.a(), true, ((kik.a.e.r.a) (new af(this))), hashmap);
        x.a(j1.a());
        z.a(j1.a());
        return com.kik.g.s.a(hashmap);
    }

    public final Set a(Set set, boolean flag)
    {
        HashSet hashset;
        HashSet hashset1;
        Iterator iterator;
        hashset = new HashSet();
        hashset1 = new HashSet();
        iterator = set.iterator();
_L7:
        String s1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_182;
        }
        s1 = (String)iterator.next();
        if (s1 == null)
        {
            throw new IllegalArgumentException("Can't get contact for null identifier");
        }
        Object obj = k;
        obj;
        JVM INSTR monitorenter ;
        set = (kik.a.d.k)b.get(s1);
        Set set1 = set;
        if (set != null) goto _L2; else goto _L1
_L1:
        set1 = set;
        if (!flag) goto _L2; else goto _L3
_L3:
        if (s1.indexOf("@groups.kik.com") == -1)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        set = kik.a.d.n.h(s1);
_L5:
        b.put(s1, set);
        set1 = set;
        if (set instanceof n) goto _L2; else goto _L4
_L4:
        hashset.add(s1);
        set1 = set;
_L2:
        if (set1 == null)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        hashset1.add(set1);
        obj;
        JVM INSTR monitorexit ;
        continue; /* Loop/switch isn't completed */
        set;
        obj;
        JVM INSTR monitorexit ;
        throw set;
        set = kik.a.d.k.a(s1);
          goto _L5
        if (hashset.size() > 0)
        {
            a(((Set) (hashset)));
        }
        return hashset1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final kik.a.d.k a(String s1, kik.a.e.r.a a1)
    {
        return a(s1, false, a1);
    }

    public final kik.a.d.k a(String s1, boolean flag)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("Can't get contact for null identifier");
        }
        HashSet hashset = new HashSet();
        hashset.add(s1);
        s1 = a(((Set) (hashset)), flag);
        if (s1.size() > 0)
        {
            if (s1.size() == 1)
            {
                return (kik.a.d.k)s1.iterator().next();
            } else
            {
                throw new IllegalStateException("More than one contact returned");
            }
        } else
        {
            return null;
        }
    }

    protected final kik.a.d.k a(String s1, boolean flag, kik.a.e.r.a a1)
    {
        return a(s1, flag, a1, null);
    }

    public final void a(e e1)
    {
        if (e1 != null)
        {
            l.a(e1, E);
        }
    }

    public final void a(kik.a.d.k k1)
    {
        if (a(k1, true, false))
        {
            t.a(null);
        }
    }

    public final void a(boolean flag, boolean flag1)
    {
        boolean flag2;
        long l1;
        flag2 = true;
        if (flag)
        {
            d = 0L;
            p = false;
        }
        l1 = f.j();
        obj = k;
        obj;
        JVM INSTR monitorenter ;
        if (flag1) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        if (flag2)
        {
            synchronized (k)
            {
                if (a != null)
                {
                    a.cancel(false);
                }
            }
            o();
        }
        return;
_L2:
        if (l1 > o + 10000L)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (a == null)
        {
            a = r.schedule(new al(this), 10000L, TimeUnit.MILLISECONDS);
        }
        break MISSING_BLOCK_LABEL_143;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        flag2 = false;
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final boolean a(kik.a.d.k k1, boolean flag, boolean flag1)
    {
        Object obj = k;
        obj;
        JVM INSTR monitorenter ;
        kik.a.d.k k2 = (kik.a.d.k)b.get(k1.a().a());
        if (k2 == null) goto _L2; else goto _L1
_L1:
        if (!k2.getClass().equals(k1.getClass())) goto _L2; else goto _L3
_L3:
        boolean flag2;
        flag2 = k2.n();
        if (!k2.s().equals(k1.s()))
        {
            b(k2);
        }
        if (flag1) goto _L5; else goto _L4
_L4:
        k1.f(k2.p());
        k1.g(k2.q());
        k1.a(k2.f());
        k1.h(k2.u());
_L7:
        k2.c(k1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_264;
        }
        e.b(k1);
        flag = flag2;
_L8:
        obj;
        JVM INSTR monitorexit ;
        w.a(k1.b());
        return flag != k1.n();
_L5:
        if (k1.v() == k2.v() && k1.m() == k2.m()) goto _L7; else goto _L6
_L6:
        C.a(k1);
          goto _L7
        k1;
        obj;
        JVM INSTR monitorexit ;
        throw k1;
_L2:
        b(k1);
        k1.f(k1.n());
        k1.g(k1.o());
        b.put(k1.a().a(), k1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_257;
        }
        e.c(k1);
        flag = false;
          goto _L8
        flag = flag2;
          goto _L8
    }

    public final e b()
    {
        return u.a();
    }

    public final com.kik.g.p b(j j1)
    {
        return com.kik.g.s.a(a(j1.a(), true, new ag(this)));
    }

    public final kik.a.d.k b(String s1)
    {
        s1 = e.k(s1);
        if (s1 != null)
        {
            return (kik.a.d.k)b.get(s1.b());
        } else
        {
            return null;
        }
    }

    public final e c()
    {
        return w.a();
    }

    public final com.kik.g.p c(j j1)
    {
        return com.kik.g.s.a(a(j1.a(), true, new ah(this)));
    }

    public final boolean c(String s1)
    {
        s1 = (kik.a.d.k)b.get(s1);
        return s1 != null && s1.l();
    }

    public final e d()
    {
        return A.a();
    }

    public final com.kik.g.p d(String s1)
    {
        s1 = com.kik.g.s.b(f.a(kik.a.f.f.g.a(null, s1)));
        s1.a(new ap(this));
        return com.kik.g.s.b(s1, new ar(this));
    }

    public final com.kik.g.p d(j j1)
    {
        return com.kik.g.s.a(a(j1.a(), true, new ai(this)));
    }

    public final e e()
    {
        return B.a();
    }

    public final com.kik.g.p e(String s1)
    {
        com.kik.g.p p1;
label0:
        {
            p1 = new com.kik.g.p();
            synchronized (m)
            {
                if (!m.containsKey(s1))
                {
                    break label0;
                }
                s1 = (com.kik.g.p)m.get(s1);
            }
            return s1;
        }
        m.put(s1, p1);
        linkedhashmap;
        JVM INSTR monitorexit ;
        m();
        return p1;
        s1;
        linkedhashmap;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final e f()
    {
        return C.a();
    }

    public final List g()
    {
        Object obj = k;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        obj1 = new ArrayList(b.size());
        Enumeration enumeration = b.elements();
        do
        {
            if (!enumeration.hasMoreElements())
            {
                break;
            }
            kik.a.d.k k1 = (kik.a.d.k)enumeration.nextElement();
            if (k1.l())
            {
                ((List) (obj1)).add(k1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_75;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        JVM INSTR monitorexit ;
        Collections.sort(((List) (obj1)), new b((byte)0));
        return ((List) (obj1));
    }

    public final List h()
    {
        Object obj = k;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        obj1 = new ArrayList(b.size());
        Enumeration enumeration = b.elements();
        do
        {
            if (!enumeration.hasMoreElements())
            {
                break;
            }
            kik.a.d.k k1 = (kik.a.d.k)enumeration.nextElement();
            if (k1.l() && !k1.m() && !(k1 instanceof n))
            {
                ((List) (obj1)).add(k1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_91;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        JVM INSTR monitorexit ;
        Collections.sort(((List) (obj1)), new b((byte)0));
        return ((List) (obj1));
    }

    public final List i()
    {
        Object obj = k;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        obj1 = new ArrayList(b.size());
        Enumeration enumeration = b.elements();
        do
        {
            if (!enumeration.hasMoreElements())
            {
                break;
            }
            kik.a.d.k k1 = (kik.a.d.k)enumeration.nextElement();
            if (k1.m())
            {
                ((List) (obj1)).add(k1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_75;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        JVM INSTR monitorexit ;
        Collections.sort(((List) (obj1)), new b((byte)0));
        return ((List) (obj1));
    }

    public final void j()
    {
        a(false, false);
    }

    public final void k()
    {
        l.a();
        r.shutdownNow();
    }

    public final void l()
    {
        boolean flag;
        flag = true;
        c = e.n("ProfileManager.rosterVersion");
        if (c == null)
        {
            c = "";
        }
        Iterator iterator;
        kik.a.d.k k1;
        try
        {
            d = Long.parseLong(e.n("ProfileManager.rosterTimeStamp"));
        }
        catch (Exception exception)
        {
            d = 0L;
        }
        if (Integer.parseInt(e.n("ProfileManager.rosterIsBatchedKey")) != 1)
        {
            flag = false;
        }
        p = flag;
_L2:
        b = e.i();
        iterator = b.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            k1 = (kik.a.d.k)iterator.next();
            if (!(k1 instanceof n))
            {
                j.put(k1.b(), new kik.a.g.a(k1.b(), null));
            }
        } while (true);
        break; /* Loop/switch isn't completed */
        Exception exception1;
        exception1;
        p = false;
        if (true) goto _L2; else goto _L1
_L1:
        l.a(g.a(), G);
        l.a(f.b(), D);
        l.a(e.d(), F);
        return;
    }

    protected final void m()
    {
label0:
        {
            synchronized (m)
            {
                if (!n && !m.isEmpty())
                {
                    break label0;
                }
            }
            return;
        }
        Object obj1;
        n = true;
        obj = new HashSet();
        obj1 = m.entrySet().iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            ((Set) (obj)).add(((java.util.Map.Entry)((Iterator) (obj1)).next()).getKey());
        } while (((Set) (obj)).size() < 50);
        obj1 = b(((Set) (obj)));
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); m.remove(obj1))
        {
            obj1 = (String)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_147;
        obj;
        linkedhashmap;
        JVM INSTR monitorexit ;
        throw obj;
        n = false;
        m();
        linkedhashmap;
        JVM INSTR monitorexit ;
        return;
        ((com.kik.g.p) (obj1)).a(new w(this, ((Set) (obj))));
        linkedhashmap;
        JVM INSTR monitorexit ;
    }

    public final Map n()
    {
        Object obj1 = new HashMap(b.size());
        Object obj = k;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = b.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if ((kik.a.d.k)entry.getValue() instanceof n)
            {
                ((HashMap) (obj1)).put(entry.getKey(), entry.getValue());
            }
        } while (true);
        break MISSING_BLOCK_LABEL_98;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        JVM INSTR monitorexit ;
        return ((Map) (obj1));
    }

    public final void o()
    {
        Object obj1 = k;
        obj1;
        JVM INSTR monitorenter ;
        Object obj;
        o = f.j();
        obj = kik.a.z.b(e);
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = "";
_L4:
        com.kik.g.s.b(f.a(new ak(d, p, ((String) (obj))), true)).a(new ao(this));
        obj1;
        JVM INSTR monitorexit ;
        return;
_L2:
        obj = ((z) (obj)).a().a();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void p()
    {
label0:
        {
            synchronized (h)
            {
                if (i == null && f.k())
                {
                    break label0;
                }
            }
            return;
        }
        obj = null;
        ArrayList arraylist;
        Iterator iterator;
        arraylist = new ArrayList();
        iterator = j.values().iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        j j1;
        kik.a.g.a a1;
        kik.a.d.k k1;
        a1 = (kik.a.g.a)iterator.next();
        obj = a1.a();
        j1 = kik.a.d.j.a(((String) (obj)));
        k1 = a(((String) (obj)), true);
        if (!k1.q() || k1.o()) goto _L4; else goto _L3
_L3:
        k1.f();
        Object obj2 = new kik.a.f.f.c(j1);
        obj2 = f.a(((kik.a.f.f.z) (obj2)));
        com.kik.g.s.b(((com.kik.g.p) (obj2))).a(new ab(this));
        i = com.kik.g.s.b(((com.kik.g.p) (obj2)), new a(j1.a()));
_L2:
        j.keySet().removeAll(arraylist);
        if (i != null)
        {
            i.a(new aw(this, ((String) (obj))));
        }
        obj1;
        JVM INSTR monitorexit ;
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
_L4:
label1:
        {
            if (k1.q() || !k1.o())
            {
                break label1;
            }
            k1.f();
            Object obj3 = new am(j1);
            obj3 = f.a(((kik.a.f.f.z) (obj3)));
            com.kik.g.s.b(((com.kik.g.p) (obj3))).a(new ad(this));
            i = com.kik.g.s.b(((com.kik.g.p) (obj3)), new a(j1.a()));
        }
          goto _L2
label2:
        {
            if (!k1.p() || k1.n())
            {
                break label2;
            }
            k1.f();
            Object obj4 = new kik.a.f.f.a(j1, a1.b());
            obj4 = f.a(((kik.a.f.f.z) (obj4)));
            com.kik.g.s.b(((com.kik.g.p) (obj4))).a(new x(this, j1));
            i = com.kik.g.s.b(((com.kik.g.p) (obj4)), new a(j1.a()));
        }
          goto _L2
label3:
        {
            if (k1.p() || !k1.n())
            {
                break label3;
            }
            k1.f();
            Object obj5 = new aj(Arrays.asList(new kik.a.d.k[] {
                a(j1.a(), true)
            }));
            obj5 = f.a(((kik.a.f.f.z) (obj5)));
            com.kik.g.s.b(((com.kik.g.p) (obj5))).a(new kik.a.g.z(this));
            i = com.kik.g.s.b(((com.kik.g.p) (obj5)), new a(j1.a()));
        }
          goto _L2
        arraylist.add(obj);
          goto _L5
    }

}
