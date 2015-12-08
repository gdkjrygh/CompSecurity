// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.e;

import android.content.Context;
import android.util.Log;
import com.nuance.b.a.ae;
import com.nuance.b.a.i;
import com.nuance.b.a.l;
import com.nuance.b.a.r;
import com.nuance.b.a.s;
import com.nuance.b.a.z;
import com.nuance.b.b.a;
import com.nuance.b.b.aa;
import com.nuance.b.b.ab;
import com.nuance.b.b.aq;
import com.nuance.b.b.az;
import com.nuance.b.b.bx;
import com.nuance.b.b.v;
import com.nuance.b.e.a.b;
import com.nuance.b.e.a.d;
import com.nuance.b.e.a.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.nuance.b.e:
//            aa, z, m, n, 
//            s, o, p, q, 
//            t, r, a, ak, 
//            w, ab, u, h, 
//            l, d, j, f, 
//            g, x, i, k

public final class c
    implements com.nuance.b.e.aa, com.nuance.b.e.z
{

    private static volatile aq c;
    private static m d = new m();
    private static n e = new n("Connect");
    private static n f = new n("Reset");
    private static long g;
    private static final c h = new c();
    private Context A;
    private Runnable B;
    private ae C;
    private final AtomicReference D = new AtomicReference(null);
    private final AtomicReference E = new AtomicReference(null);
    private boolean F;
    private final o G = new o(this);
    private final p H = new p(this);
    private final q I = new q(this);
    private final t J = new t(this);
    private final com.nuance.b.e.s K = new com.nuance.b.e.s(this);
    private final com.nuance.b.e.r L = new com.nuance.b.e.r(this);
    final AtomicBoolean a = new AtomicBoolean(false);
    final Object b = new Object();
    private volatile b i;
    private final v j = com.nuance.b.b.v.r();
    private com.nuance.b.e.a k;
    private com.nuance.b.e.ab l;
    private boolean m;
    private HashSet n;
    private n o;
    private String p;
    private z q;
    private AtomicBoolean r;
    private AtomicBoolean s;
    private List t;
    private List u;
    private AtomicBoolean v;
    private ExecutorService w;
    private volatile boolean x;
    private boolean y;
    private final AtomicReference z = new AtomicReference();

    private c()
    {
        m = false;
        n = new HashSet();
        o = new n("CoreBusy");
        p = null;
        r = new AtomicBoolean(false);
        s = new AtomicBoolean(false);
        t = new ArrayList();
        u = new ArrayList();
        v = new AtomicBoolean(false);
        w = Executors.newSingleThreadExecutor();
        x = false;
        y = false;
        B = null;
        F = false;
    }

    static n A()
    {
        return f;
    }

    static long B()
    {
        return g;
    }

    private boolean C()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = x;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    private void D()
    {
        a.getAndSet(true);
        k.a();
        u();
        synchronized (b)
        {
            j.h();
        }
        j.i();
        obj = i;
        if (obj != null)
        {
            ((b) (obj)).waitForUser(null);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static boolean E()
    {
        try
        {
            Thread.sleep(250L);
        }
        catch (InterruptedException interruptedexception)
        {
            Log.w("Nina", "Interrupted while sleeping.");
            return false;
        }
        return true;
    }

    private long F()
    {
        v v1;
        aa aa1;
        HashMap hashmap;
        long l1;
        if (o.d())
        {
            try
            {
                o.c();
            }
            catch (InterruptedException interruptedexception)
            {
                Log.w("Nina", "interrupted during reset while awaiting pending responses");
            }
        }
        v1 = j;
        aa1 = aa.c;
        hashmap = new HashMap(1);
        hashmap.put("GLOBAL", "reset");
        l1 = v1.a(hashmap, aa1);
        Log.d("Nina", (new StringBuilder("new RESET requestId: ")).append(l1).toString());
        if (l1 >= 0L)
        {
            f.a();
            g = l1;
            return l1;
        }
        a(false);
        if (l1 == -2L || l1 == -3L || l1 == -4L)
        {
            return 0x7fffffffffffffffL;
        } else
        {
            f((new StringBuilder("Unable to reset adk server state: ")).append(l1).toString());
            return l1;
        }
    }

    private void G()
    {
_L8:
        long l1 = H();
        if (l1 != -1L) goto _L2; else goto _L1
_L1:
        Log.d("Nina", "Already connected");
        i.enable(true);
_L4:
        return;
_L2:
        if (l1 >= 0L || l1 == -2L) goto _L4; else goto _L3
_L3:
        if (l1 != -3L)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!E()) goto _L4; else goto _L5
_L5:
        Log.d("Nina", "Connecting from DISCONNECTING_ATTEMPT during connect()");
        continue; /* Loop/switch isn't completed */
        if (l1 >= 0L) goto _L4; else goto _L6
_L6:
        Log.e("Nina", (new StringBuilder("Failed to connect to server (")).append(l1).append(")").toString());
        a(com.nuance.b.e.ak.b);
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private long H()
    {
        if (!C())
        {
            throw new IllegalStateException("Nina not initialized when connecting");
        }
        long l1 = j.a(A, C);
        if (l1 >= 0L)
        {
            e.a();
            g = l1;
        }
        return l1;
    }

    private long a(String s1, ab ab1)
    {
        if (s1 == null || s1.trim().length() <= 0)
        {
            i.waitForUser(null);
            return -1004L;
        }
        if (a(true))
        {
            long l1 = j.a(s1, ab1);
            if (l1 >= 0L)
            {
                a(l1);
                a(d.j);
                return l1;
            } else
            {
                f((new StringBuilder("Failed to send interpretText to server (")).append(l1).append(")").toString());
                return l1;
            }
        } else
        {
            return -1003L;
        }
    }

    static ae a(c c1)
    {
        c1.C = null;
        return null;
    }

    public static void a()
    {
        h.p = null;
    }

    private void a(long l1)
    {
        HashSet hashset = n;
        hashset;
        JVM INSTR monitorenter ;
        int i1 = n.size();
        if (!n.add(Long.valueOf(l1)) || i1 != 0)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        o.a();
        hashset;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void a(Context context, b b1, ae ae1)
    {
        c c1 = h;
        if (context == null)
        {
            throw new IllegalArgumentException("Context must not be null");
        }
        if (b1 == null)
        {
            throw new IllegalArgumentException("Persona must not be null");
        }
        if (ae1 == null)
        {
            throw new IllegalArgumentException("Dialog model must not be null");
        }
        if (!c1.x)
        {
            c1.A = context.getApplicationContext();
            c1.C = ae1;
            c1.i = b1;
            c1.z.set(com.nuance.b.e.w.a);
            c1.x = true;
            c1.k = new com.nuance.b.e.a(c1.j);
            context = com.nuance.b.b.v.r().u();
            context.a(c1.G);
            context.a(c1.H);
            context.a(c1.I);
            context.a(c1.J);
            context.a(c1.K);
            context.a(c1.L);
        }
    }

    static void a(aq aq1)
    {
        c = aq1;
    }

    private void a(d d1)
    {
        if (C())
        {
            i.reportNinaEvent(d1);
        }
    }

    static void a(c c1, long l1)
    {
        HashSet hashset = c1.n;
        hashset;
        JVM INSTR monitorenter ;
        int i1 = c1.n.size();
        if (!c1.n.remove(Long.valueOf(l1)) || i1 != 1)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        c1.o.b();
        hashset;
        JVM INSTR monitorexit ;
        return;
        c1;
        hashset;
        JVM INSTR monitorexit ;
        throw c1;
    }

    static void a(c c1, aq aq1)
    {
        c1.a(d.k);
        if (c1.y)
        {
            c1.l.a(aq1, false);
            return;
        } else
        {
            c1.a(false);
            return;
        }
    }

    static void a(c c1, d d1)
    {
        c1.a(d1);
    }

    static void a(c c1, String s1)
    {
        c1.f(s1);
    }

    static void a(c c1, boolean flag)
    {
        c1.y = false;
        c1.k.a(false);
        c1.b(true);
        if (flag)
        {
            c1.F();
        }
        synchronized (c1.t)
        {
            c1.t.clear();
        }
        c1.l.c();
        c1.z.set(com.nuance.b.e.w.a);
        list = c1.u;
        list;
        JVM INSTR monitorenter ;
        u u1;
        for (Iterator iterator = c1.u.iterator(); iterator.hasNext(); c1.w.execute(new h(c1, u1)))
        {
            u1 = (u)iterator.next();
        }

        break MISSING_BLOCK_LABEL_131;
        c1;
        list;
        JVM INSTR monitorexit ;
        throw c1;
        c1;
        list;
        JVM INSTR monitorexit ;
        throw c1;
        list;
        JVM INSTR monitorexit ;
    }

    public static void a(com.nuance.b.e.l l1)
    {
        c c1 = h;
        n n1 = e;
        n1;
        JVM INSTR monitorenter ;
        if (e.d()) goto _L2; else goto _L1
_L1:
        long l2;
        c1.D.set(l1);
        l2 = c1.H();
        boolean flag = true;
_L8:
        n1;
        JVM INSTR monitorexit ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        if (l2 != -1L) goto _L4; else goto _L3
_L3:
        b(true, c1.D);
_L6:
        return;
        l1;
        n1;
        JVM INSTR monitorexit ;
        throw l1;
_L4:
        if (l2 >= 0L) goto _L6; else goto _L5
_L5:
        Log.w("Nina", (new StringBuilder("Connection failed. Reason: ")).append(l2).toString());
        b(false, c1.D);
        return;
        l1.completed(false);
        return;
_L2:
        l2 = 0L;
        flag = false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static void a(u u1)
    {
        synchronized (h.u)
        {
            if (!list.contains(u1))
            {
                list.add(u1);
            }
        }
        return;
        u1;
        list;
        JVM INSTR monitorexit ;
        throw u1;
    }

    public static void a(String s1)
    {
        h.p = s1;
    }

    static void a(boolean flag, AtomicReference atomicreference)
    {
        b(flag, atomicreference);
    }

    static b b(c c1)
    {
        c1.i = null;
        return null;
    }

    public static String b()
    {
        return h.p;
    }

    public static void b(u u1)
    {
        synchronized (h.u)
        {
            list.remove(u1);
        }
        return;
        u1;
        list;
        JVM INSTR monitorexit ;
        throw u1;
    }

    private void b(boolean flag)
    {
        D();
        com.nuance.b.e.ab ab1 = l;
        if (ab1 != null)
        {
            ab1.a(flag);
        }
    }

    private static void b(boolean flag, AtomicReference atomicreference)
    {
        atomicreference = (com.nuance.b.e.l)atomicreference.getAndSet(null);
        if (atomicreference != null)
        {
            atomicreference.completed(flag);
        }
    }

    static b c(c c1)
    {
        return c1.i;
    }

    public static void c()
    {
        obj = h;
        if (((c) (obj)).C())
        {
            obj.x = false;
            synchronized (((c) (obj)).u)
            {
                ((c) (obj)).u.clear();
            }
            obj1 = new com.nuance.b.e.d(((c) (obj)));
            ((c) (obj)).E.set(obj1);
            long l1 = ((c) (obj)).j.d();
            if (l1 == -4L)
            {
                b(true, ((c) (obj)).E);
            } else
            {
                if (l1 == -3L)
                {
                    Log.d("Nina", "Disconnect called but already disconnecting. Will wait for onDisconnected.");
                    return;
                }
                if (l1 < 0L)
                {
                    b(false, ((c) (obj)).E);
                    return;
                }
            }
        }
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    static void d(c c1)
    {
        Object obj1 = null;
        if (e.c()) goto _L2; else goto _L1
_L1:
        Object obj = "Unable to load intial state because the last connect never completed.";
_L4:
        if (obj != null)
        {
            c1.f(((String) (obj)));
        }
        return;
_L2:
        if (!f.c())
        {
            obj = "Unable to load intial state because the last reset never completed.";
            continue; /* Loop/switch isn't completed */
        }
        aq aq1 = c;
        if (aq1 == null)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        if (aq1.b < g)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        obj = obj1;
        if (c1.t())
        {
            continue; /* Loop/switch isn't completed */
        }
        Log.i("Nina", "Loading initial state...");
        c1.l.a(aq1, true).get();
        obj = obj1;
        continue; /* Loop/switch isn't completed */
        try
        {
            obj = (new StringBuilder("Refusing to load out-of-date state as initial state -- lastKnownState.requestId: ")).append(aq1.b).append(" lastResetRequestId: ").append(g).toString();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.i("Nina", "Loading initial state cancelled.");
            obj = obj1;
        }
        catch (InterruptedException interruptedexception)
        {
            Log.e("Nina", "Interrupted loading initial state.", interruptedexception);
            interruptedexception = "Interrupted loading initial state.";
        }
        catch (ExecutionException executionexception)
        {
            Log.e("Nina", "Exception loading initial state.", executionexception);
            executionexception = "Exception loading initial state.";
        }
        continue; /* Loop/switch isn't completed */
        obj = obj1;
        if (!c1.t())
        {
            obj = "No initial state found.";
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static az e()
    {
        return com.nuance.b.b.v.r().j();
    }

    static AtomicReference e(c c1)
    {
        return c1.z;
    }

    private void e(String s1)
    {
        if (!z.compareAndSet(com.nuance.b.e.w.b, com.nuance.b.e.w.d) && !z.compareAndSet(w.c, com.nuance.b.e.w.d))
        {
            return;
        } else
        {
            s1 = new Thread(new j(this, s1));
            s1.setName("Nina.doExit");
            s1.start();
            return;
        }
    }

    public static bx f()
    {
        return com.nuance.b.b.v.r().u();
    }

    static Runnable f(c c1)
    {
        return c1.B;
    }

    private void f(String s1)
    {
        Log.e("Nina", s1);
        a(com.nuance.b.e.ak.e);
    }

    static AtomicReference g(c c1)
    {
        return c1.D;
    }

    public static void g()
    {
        Object obj = h;
        if (!((c) (obj)).z.compareAndSet(com.nuance.b.e.w.a, com.nuance.b.e.w.b)) goto _L2; else goto _L1
_L1:
        List list = ((c) (obj)).u;
        list;
        JVM INSTR monitorenter ;
        u u1;
        for (Iterator iterator = ((c) (obj)).u.iterator(); iterator.hasNext(); ((c) (obj)).w.execute(new f(((c) (obj)), u1)))
        {
            u1 = (u)iterator.next();
        }

        break MISSING_BLOCK_LABEL_82;
        obj;
        list;
        JVM INSTR monitorexit ;
        throw obj;
        list;
        JVM INSTR monitorexit ;
        long l1;
        ((c) (obj)).r.set(false);
        ((c) (obj)).s.set(false);
        obj.q = new z(((c) (obj)).C);
        obj.l = new com.nuance.b.e.ab(((c) (obj)).q, ((c) (obj)));
        ((c) (obj)).k.a(true);
        obj.y = true;
        Log.i("Nina", "Sending ping...");
        l1 = ((c) (obj)).j.n();
        Log.d("Nina", (new StringBuilder("Connection check requestId: ")).append(l1).toString());
        if (l1 != -4L) goto _L4; else goto _L3
_L3:
        Log.d("Nina", "checkValidConnection: DISCONNECTED");
        ((c) (obj)).G();
_L6:
        ((c) (obj)).i.show();
        (new Thread(new g(((c) (obj))))).start();
_L2:
        return;
_L4:
        if (l1 == -2L)
        {
            Log.d("Nina", "checkValidConnection: CONNECTING_ATTEMPT");
        } else
        if (l1 == -3L)
        {
            Log.d("Nina", "checkValidConnection: DISCONNECTING_ATTEMPT");
            ((c) (obj)).G();
        } else
        if (l1 < 0L)
        {
            Log.w("Nina", (new StringBuilder("Unable to check if connection is valid (")).append(l1).append(").").toString());
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    static AtomicReference h(c c1)
    {
        return c1.E;
    }

    public static void h()
    {
        h.s();
    }

    public static boolean i()
    {
        return h.y;
    }

    static boolean i(c c1)
    {
        return c1.F;
    }

    public static void j()
    {
        c c1 = h;
        c1.s.set(false);
        if (c1.y)
        {
            c1.k.a(true);
        }
    }

    static boolean j(c c1)
    {
        return c1.C();
    }

    public static void k()
    {
        c c1 = h;
        c1.s.set(true);
        c1.k.a(false);
        c1.D();
    }

    public static com.nuance.b.e.z l()
    {
        return h;
    }

    public static com.nuance.b.e.aa m()
    {
        return h;
    }

    static void y()
    {
        c = null;
        d.a();
        e.b();
        f.b();
    }

    static n z()
    {
        return e;
    }

    public final transient long a(a aa1[])
    {
        boolean flag = true;
        for (int i1 = 0; i1 <= 0; i1++)
        {
            if (aa1[0] == null)
            {
                flag = false;
            }
        }

        if (t())
        {
            Log.d("Nina", "sendCommand aborted: exiting.");
            return -1001L;
        }
        if (!flag)
        {
            return -1005L;
        }
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        boolean flag1 = s.get();
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        long l1;
        if (t())
        {
            break MISSING_BLOCK_LABEL_171;
        }
        if (!a(true))
        {
            break MISSING_BLOCK_LABEL_163;
        }
        l1 = j.a(aa1);
        if (l1 < 0L) goto _L2; else goto _L1
_L1:
        a(l1);
_L3:
        obj;
        JVM INSTR monitorexit ;
        if (l1 >= 0L)
        {
            Log.d("Nina", (new StringBuilder("sendCommand reqId: ")).append(l1).toString());
            return l1;
        } else
        {
            Log.e("Nina", (new StringBuilder("Failed to send agent commands (")).append(l1).append(")").toString());
            return l1;
        }
_L2:
        a(false);
          goto _L3
        aa1;
        obj;
        JVM INSTR monitorexit ;
        throw aa1;
        l1 = -1003L;
          goto _L3
        Log.d("Nina", "sendCommand aborted because paused or exiting");
        i.waitForUser(null);
        if (flag1)
        {
            l1 = -1002L;
        } else
        {
            l1 = -1001L;
        }
        obj;
        JVM INSTR monitorexit ;
        return l1;
    }

    final void a(int i1)
    {
        Context context = A;
        String s1 = null;
        if (context != null)
        {
            s1 = context.getString(i1);
        }
        e(s1);
    }

    public final void a(int i1, CountDownLatch countdownlatch)
    {
        k.a(i1, countdownlatch);
    }

    public final void a(x x1)
    {
        synchronized (t)
        {
            if (!t.contains(x1))
            {
                t.add(x1);
            }
        }
        return;
        x1;
        list;
        JVM INSTR monitorexit ;
        throw x1;
    }

    public final void a(List list, CountDownLatch countdownlatch)
    {
        k.a(list, countdownlatch);
    }

    final boolean a(boolean flag)
    {
        AtomicBoolean atomicboolean = v;
        atomicboolean;
        JVM INSTR monitorenter ;
        Object obj = v;
        Exception exception;
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag1 = ((AtomicBoolean) (obj)).compareAndSet(flag1, flag);
        if (!flag1) goto _L2; else goto _L1
_L1:
        obj = t;
        obj;
        JVM INSTR monitorenter ;
        x x1;
        for (Iterator iterator = t.iterator(); iterator.hasNext(); w.submit(new com.nuance.b.e.i(this, flag, x1)))
        {
            x1 = (x)iterator.next();
        }

        break MISSING_BLOCK_LABEL_115;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        atomicboolean;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        JVM INSTR monitorexit ;
_L2:
        atomicboolean;
        JVM INSTR monitorexit ;
        return flag1;
    }

    public final long b(String s1)
    {
        return a(s1, ab.a);
    }

    public final boolean b(x x1)
    {
        boolean flag;
        synchronized (t)
        {
            flag = t.remove(x1);
        }
        return flag;
        x1;
        list;
        JVM INSTR monitorexit ;
        throw x1;
    }

    public final long c(String s1)
    {
        return a(s1, ab.b);
    }

    public final void d()
    {
        Object obj2;
        Object obj = q.a().c();
        obj = q.a.b(((String) (obj)));
        obj2 = i;
        if (obj == null || ((i) (obj)).concept.type != s.c)
        {
            break MISSING_BLOCK_LABEL_308;
        }
        ((b) (obj2)).setMode(e.c);
        obj = ((i) (obj)).concept;
        com.nuance.b.b.v.r().j().a(((r) (obj)).maxCaptureTime * 1000);
        obj2 = ((r) (obj)).name;
        if (t())
        {
            Log.d("Nina", "dictate aborted because exiting.");
            return;
        }
        if (v.get())
        {
            Log.i("Nina", "startDictation aborted because another dialog change in progress.");
            return;
        }
        Object obj1 = b;
        obj1;
        JVM INSTR monitorenter ;
        k k1;
        long l1;
        if (s.get() || t())
        {
            break MISSING_BLOCK_LABEL_255;
        }
        a(d.h);
        k1 = new k(this);
        com.nuance.b.b.v.r().u().a(k1);
        l1 = j.a(((String) (obj2)));
        if (l1 < 0L)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        F = true;
        a(l1);
_L1:
        obj1;
        JVM INSTR monitorexit ;
        if (l1 >= 0L)
        {
            Log.d("Nina", (new StringBuilder("dictate reqId: ")).append(l1).toString());
            return;
        } else
        {
            Log.e("Nina", (new StringBuilder("Failed to start dictation (")).append(l1).append(")").toString());
            return;
        }
        com.nuance.b.b.v.r().u().b(k1);
        a(d.i);
          goto _L1
        obj2;
        obj1;
        JVM INSTR monitorexit ;
        throw obj2;
        Log.d("Nina", "dictate aborted because paused or exiting");
        i.waitForUser(null);
        obj1;
        JVM INSTR monitorexit ;
        return;
        ((b) (obj2)).setMode(e.a);
        v();
        return;
    }

    public final void d(String s1)
    {
        e(s1);
    }

    public final void n()
    {
        a.getAndSet(true);
        synchronized (b)
        {
            b(false);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void o()
    {
        k.a();
    }

    public final void p()
    {
        l.b();
    }

    public final Context q()
    {
        return A;
    }

    public final void r()
    {
        Log.d("Nina", String.format("Nina.exitNina( %s ) ", new Object[] {
            "NoServerReset"
        }));
        e(((String) (null)));
    }

    public final void s()
    {
        Log.d("Nina", "Nina.exitNina");
        e(((String) (null)));
    }

    final boolean t()
    {
        w w1 = (w)z.get();
        return com.nuance.b.e.w.d == w1 || com.nuance.b.e.w.a == w1;
    }

    public final void u()
    {
        synchronized (b)
        {
            j.g();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final long v()
    {
        long l1;
label0:
        {
            l1 = -1001L;
            synchronized (b)
            {
                if (!t())
                {
                    break label0;
                }
                Log.d("Nina", "startSpeechInterpretation aborted because exiting.");
            }
            return -1001L;
        }
        if (!v.get())
        {
            break MISSING_BLOCK_LABEL_63;
        }
        Log.i("Nina", "startSpeechInterpretation aborted because another dialog change in progress.");
        obj;
        JVM INSTR monitorexit ;
        return -1003L;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        a(d.a);
        if (s.get() || t()) goto _L2; else goto _L1
_L1:
        l1 = j.e();
        Log.d("Nina", (new StringBuilder("startSpeechInterpretation reqId: ")).append(l1).toString());
        if (l1 >= 0L) goto _L4; else goto _L3
_L3:
        Log.e("Nina", (new StringBuilder("Failed to start listening (")).append(l1).append(")").toString());
_L5:
        obj;
        JVM INSTR monitorexit ;
        return l1;
_L4:
        a(l1);
        F = true;
          goto _L5
_L2:
        if (!t()) goto _L7; else goto _L6
_L6:
        Log.d("Nina", "startSpeechInterpretation aborted because exiting");
_L8:
        i.waitForUser(null);
          goto _L5
_L7:
        Log.d("Nina", "startSpeechInterpretation aborted because paused");
        l1 = -1002L;
          goto _L8
    }

    public final void w()
    {
        j.f();
        j.i();
    }

    final b x()
    {
        return i;
    }

}
