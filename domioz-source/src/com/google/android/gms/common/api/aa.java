// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.ab;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.iu;
import com.google.android.gms.internal.lj;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.gms.common.api:
//            l, ab, ah, ai, 
//            aj, an, n, o, 
//            c, ak, h, ac, 
//            ad, i, ar, as, 
//            ae, Status, af, ag, 
//            al, j, am, y, 
//            ap, r

final class aa
    implements l
{

    private int A;
    private boolean B;
    private boolean C;
    private ab D;
    private boolean E;
    private boolean F;
    private final Set G = Collections.newSetFromMap(new WeakHashMap());
    private final com.google.android.gms.common.api.ap H = new com.google.android.gms.common.api.ab(this);
    private final n I = new ah(this);
    private final r J = new ai(this);
    private final u K = new aj(this);
    final Queue a = new LinkedList();
    BroadcastReceiver b;
    final Set c = Collections.newSetFromMap(new ConcurrentHashMap(16, 0.75F, 2));
    private final Lock d = new ReentrantLock();
    private final Condition e;
    private final t f;
    private final int g;
    private final Context h;
    private final Looper i;
    private ConnectionResult j;
    private int k;
    private volatile int l;
    private volatile boolean m;
    private int n;
    private boolean o;
    private int p;
    private long q;
    private long r;
    private final an s;
    private final Bundle t = new Bundle();
    private final Map u = new HashMap();
    private final Set v = new HashSet();
    private final Map w = new HashMap();
    private final List x;
    private boolean y;
    private lj z;

    public aa(Context context, Looper looper, h h1, i i1, Map map, Map map1, Set set, 
            Set set1, int j1)
    {
        e = d.newCondition();
        l = 4;
        n = 0;
        o = false;
        q = 0x1d4c0L;
        r = 5000L;
        h = context;
        f = new t(looper, K);
        i = looper;
        s = new an(this, looper);
        g = j1;
        n n1;
        for (set = set.iterator(); set.hasNext(); f.a(n1))
        {
            n1 = (n)set.next();
        }

        for (set = set1.iterator(); set.hasNext(); f.a(set1))
        {
            set1 = (o)set.next();
        }

        x = Collections.unmodifiableList(h1.d());
        B = false;
        A = 2;
        set = map.keySet().iterator();
        while (set.hasNext()) 
        {
            set1 = (c)set.next();
            Object obj = map.get(set1);
            if (map1.get(set1) != null)
            {
                if (((Boolean)map1.get(set1)).booleanValue())
                {
                    j1 = 2;
                } else
                {
                    j1 = 1;
                }
            } else
            {
                j1 = 0;
            }
            obj = a(set1.a(), obj, context, looper, h1, I, new ak(this, j1, set1));
            ((com.google.android.gms.common.api.h) (obj)).a(J);
            u.put(set1.c(), obj);
        }
        if (B)
        {
            h1.a(Integer.valueOf(System.identityHashCode(this)));
            z = (lj)a(i1, h1.g(), context, looper, h1, new ac(this), new ad(this));
        }
    }

    static ConnectionResult a(aa aa1, ConnectionResult connectionresult)
    {
        aa1.j = connectionresult;
        return connectionresult;
    }

    private static com.google.android.gms.common.api.h a(i i1, Object obj, Context context, Looper looper, h h1, n n1, o o1)
    {
        return i1.a(context, looper, h1, obj, n1, o1);
    }

    static ab a(aa aa1, ab ab1)
    {
        aa1.D = ab1;
        return ab1;
    }

    static Lock a(aa aa1)
    {
        return aa1.d;
    }

    private void a(int i1)
    {
        d.lock();
        if (l == 3) goto _L2; else goto _L1
_L1:
        if (i1 != -1)
        {
            break MISSING_BLOCK_LABEL_268;
        }
        if (g())
        {
            for (Iterator iterator = a.iterator(); iterator.hasNext(); iterator.remove())
            {
                ((ar)iterator.next()).b();
            }

            break MISSING_BLOCK_LABEL_128;
        }
        break MISSING_BLOCK_LABEL_83;
        Exception exception;
        exception;
        d.unlock();
        throw exception;
        for (Iterator iterator1 = a.iterator(); iterator1.hasNext(); ((ar)iterator1.next()).b()) { }
        a.clear();
        ar ar1;
        for (Iterator iterator2 = c.iterator(); iterator2.hasNext(); ar1.b())
        {
            ar1 = (ar)iterator2.next();
            ar1.a(null);
        }

        c.clear();
        for (Iterator iterator3 = G.iterator(); iterator3.hasNext(); ((as)iterator3.next()).a()) { }
        G.clear();
        if (j != null || a.isEmpty())
        {
            break MISSING_BLOCK_LABEL_259;
        }
        o = true;
        d.unlock();
        return;
        w.clear();
        boolean flag;
        boolean flag1;
        flag = g();
        flag1 = f();
        l = 3;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_309;
        }
        if (i1 != -1)
        {
            break MISSING_BLOCK_LABEL_300;
        }
        j = null;
        e.signalAll();
        y = false;
        for (Iterator iterator4 = u.values().iterator(); iterator4.hasNext(); ((com.google.android.gms.common.api.h)iterator4.next()).b()) { }
          goto _L3
_L6:
        a(flag);
        y = true;
        l = 4;
        if (!flag1) goto _L2; else goto _L4
_L4:
        if (i1 == -1)
        {
            break MISSING_BLOCK_LABEL_389;
        }
        f.a(i1);
        y = false;
_L2:
        d.unlock();
        return;
_L3:
        while (i1 != -1) 
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a(ConnectionResult connectionresult)
    {
        o = false;
        boolean flag;
        if (!connectionresult.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        a(3);
        if (!m || !com.google.android.gms.common.e.d(h, connectionresult.c()))
        {
            m();
            f.a(connectionresult);
        }
        y = false;
    }

    static void a(aa aa1, int i1)
    {
        aa1.a(i1);
    }

    static void a(aa aa1, zzaa zzaa1)
    {
        ConnectionResult connectionresult = zzaa1.b();
        if (connectionresult.b())
        {
            aa1.s.post(new ae(aa1, zzaa1));
            return;
        } else
        {
            aa1.b(connectionresult);
            return;
        }
    }

    private void a(ar ar1)
    {
        d.lock();
        boolean flag;
        if (ar1.e() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ap.b(flag, "This task can not be executed or enqueued (it's probably a Batch or malformed)");
        c.add(ar1);
        ar1.a(H);
        if (!m)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        ar1.b(new Status(8));
        d.unlock();
        return;
        com.google.android.gms.common.api.h h1;
        h1 = a(ar1.e());
        if (h1.c() || !w.containsKey(ar1.e()))
        {
            break MISSING_BLOCK_LABEL_148;
        }
        ar1.b(new Status(17));
        d.unlock();
        return;
        ar1.a(h1);
        d.unlock();
        return;
        ar1;
        d.unlock();
        throw ar1;
    }

    private void a(boolean flag)
    {
        if (z != null)
        {
            if (z.c())
            {
                if (flag)
                {
                    z.g_();
                }
                z.b();
            }
            D = null;
        }
    }

    static boolean a(aa aa1, int i1, ConnectionResult connectionresult)
    {
        return (i1 != 1 || connectionresult.a()) && (aa1.j == null || 0x7fffffff < aa1.k);
    }

    static boolean a(aa aa1, boolean flag)
    {
        aa1.E = flag;
        return flag;
    }

    static Bundle b(aa aa1)
    {
        return aa1.t;
    }

    private void b(ConnectionResult connectionresult)
    {
        s.post(new af(this, connectionresult));
    }

    static void b(aa aa1, ConnectionResult connectionresult)
    {
        aa1.b(connectionresult);
    }

    static boolean b(aa aa1, boolean flag)
    {
        aa1.F = flag;
        return flag;
    }

    static void c(aa aa1)
    {
        aa1.i();
    }

    static void c(aa aa1, ConnectionResult connectionresult)
    {
        if (connectionresult.b())
        {
            aa1.s.post(new ag(aa1));
            return;
        } else
        {
            aa1.b(connectionresult);
            return;
        }
    }

    static boolean c(aa aa1, boolean flag)
    {
        aa1.y = flag;
        return flag;
    }

    static boolean d(aa aa1)
    {
        aa1.m = true;
        return true;
    }

    static boolean d(aa aa1, ConnectionResult connectionresult)
    {
        return aa1.A == 2 || aa1.A == 1 && !connectionresult.a();
    }

    static Context e(aa aa1)
    {
        return aa1.h;
    }

    static void e(aa aa1, ConnectionResult connectionresult)
    {
        aa1.a(connectionresult);
    }

    static an f(aa aa1)
    {
        return aa1.s;
    }

    static long g(aa aa1)
    {
        return aa1.q;
    }

    static long h(aa aa1)
    {
        return aa1.r;
    }

    static int i(aa aa1)
    {
        return aa1.n;
    }

    private void i()
    {
label0:
        {
            p = p - 1;
            if (p == 0)
            {
                if (j == null)
                {
                    break label0;
                }
                a(j);
            }
            return;
        }
        switch (n)
        {
        default:
            return;

        case 0: // '\0'
            if (B)
            {
                n = 1;
                j();
                return;
            } else
            {
                k();
                return;
            }

        case 1: // '\001'
            z.a(D, new HashSet(Arrays.asList(iu.a(x))), new al(this));
            return;

        case 2: // '\002'
            l = 2;
            m();
            break;
        }
        if (z != null)
        {
            if (E)
            {
                z.a(D, F);
            }
            a(false);
        }
        e.signalAll();
        l();
        if (o)
        {
            o = false;
            a(-1);
            return;
        }
        Bundle bundle;
        if (t.isEmpty())
        {
            bundle = null;
        } else
        {
            bundle = t;
        }
        f.a(bundle);
    }

    static int j(aa aa1)
    {
        return aa1.l;
    }

    private void j()
    {
        j j1;
        Iterator iterator;
        boolean flag;
        if (i == s.getLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ap.a(flag, "This method must be run on the mHandlerForCallbacks thread");
        if (n != 1 || !C) goto _L2; else goto _L1
_L1:
        p = u.size();
        iterator = u.keySet().iterator();
_L3:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = (j)iterator.next();
        if (!w.containsKey(j1))
        {
            break MISSING_BLOCK_LABEL_140;
        }
        d.lock();
        i();
        d.unlock();
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        d.unlock();
        throw exception;
        ((com.google.android.gms.common.api.h)u.get(j1)).a(D);
        if (true) goto _L3; else goto _L2
_L2:
    }

    private void k()
    {
        n = 2;
        p = u.size();
        for (Iterator iterator = u.keySet().iterator(); iterator.hasNext();)
        {
            j j1 = (j)iterator.next();
            if (w.containsKey(j1))
            {
                i();
            } else
            {
                ((com.google.android.gms.common.api.h)u.get(j1)).d();
            }
        }

    }

    static boolean k(aa aa1)
    {
        return aa1.y;
    }

    private void l()
    {
        d.lock();
        Object obj;
        boolean flag;
        if (!f() && !m)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        ap.a(flag, "GoogleApiClient is not connected yet.");
_L1:
        flag = a.isEmpty();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        a((ar)a.remove());
          goto _L1
        obj;
        Log.w("GoogleApiClientImpl", "Service died while flushing queue", ((Throwable) (obj)));
          goto _L1
        obj;
        d.unlock();
        throw obj;
        d.unlock();
        return;
    }

    static void l(aa aa1)
    {
        aa1.d.lock();
        if (aa1.m)
        {
            aa1.c();
        }
        aa1.d.unlock();
        return;
        Exception exception;
        exception;
        aa1.d.unlock();
        throw exception;
    }

    private void m()
    {
        d.lock();
        boolean flag = m;
        if (!flag)
        {
            d.unlock();
            return;
        }
        m = false;
        s.removeMessages(2);
        s.removeMessages(1);
        if (b != null)
        {
            h.getApplicationContext().unregisterReceiver(b);
            b = null;
        }
        d.unlock();
        return;
        Exception exception;
        exception;
        d.unlock();
        throw exception;
    }

    static void m(aa aa1)
    {
        aa1.m();
    }

    static int n(aa aa1)
    {
        aa1.k = 0x7fffffff;
        return 0x7fffffff;
    }

    static Map o(aa aa1)
    {
        return aa1.w;
    }

    static void p(aa aa1)
    {
        aa1.z.a(new am(aa1));
    }

    static boolean q(aa aa1)
    {
        aa1.C = true;
        return true;
    }

    static void r(aa aa1)
    {
        aa1.j();
    }

    static Set s(aa aa1)
    {
        return aa1.v;
    }

    static Map t(aa aa1)
    {
        return aa1.u;
    }

    static void u(aa aa1)
    {
        aa1.k();
    }

    public final Context a()
    {
        return h;
    }

    public final com.google.android.gms.common.api.h a(j j1)
    {
        j1 = (com.google.android.gms.common.api.h)u.get(j1);
        ap.a(j1, "Appropriate Api was not requested.");
        return j1;
    }

    public final y a(y y1)
    {
        ap.b(u.containsKey(y1.e()), "GoogleApiClient is not configured to use the API required for this call.");
        d.lock();
        if (!f()) goto _L2; else goto _L1
_L1:
        b(y1);
_L4:
        d.unlock();
        return y1;
_L2:
        a.add(y1);
        if (true) goto _L4; else goto _L3
_L3:
        y1;
        d.unlock();
        throw y1;
    }

    public final void a(n n1)
    {
        f.a(n1);
    }

    public final void a(o o1)
    {
        f.a(o1);
    }

    public final void a(String s1, PrintWriter printwriter)
    {
        printwriter.append(s1).println("GoogleApiClient:");
        s1 = (new StringBuilder()).append(s1).append("  ").toString();
        printwriter.append(s1).append("mConnectionState=");
        l;
        JVM INSTR tableswitch 1 4: default 80
    //                   1 200
    //                   2 210
    //                   3 220
    //                   4 230;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        printwriter.print("UNKNOWN");
_L7:
        printwriter.append(" mResuming=").print(m);
        printwriter.append(" mWaitingToDisconnect=").println(o);
        printwriter.append(s1).append("mWorkQueue.size()=").print(a.size());
        printwriter.append(" mUnconsumedRunners.size()=").println(c.size());
        for (Iterator iterator = u.values().iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.h)iterator.next()).a(s1, printwriter)) { }
        break; /* Loop/switch isn't completed */
_L2:
        printwriter.print("CONNECTING");
        continue; /* Loop/switch isn't completed */
_L3:
        printwriter.print("CONNECTED");
        continue; /* Loop/switch isn't completed */
_L4:
        printwriter.print("DISCONNECTING");
        continue; /* Loop/switch isn't completed */
_L5:
        printwriter.print("DISCONNECTED");
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final Looper b()
    {
        return i;
    }

    public final y b(y y1)
    {
        boolean flag;
        if (f() || m)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ap.a(flag, "GoogleApiClient is not connected yet.");
        l();
        try
        {
            a(y1);
        }
        catch (DeadObjectException deadobjectexception)
        {
            a(1);
            return y1;
        }
        return y1;
    }

    public final void b(n n1)
    {
        f.b(n1);
    }

    public final void b(o o1)
    {
        f.b(o1);
    }

    public final void c()
    {
        d.lock();
        boolean flag;
        o = false;
        if (f())
        {
            break MISSING_BLOCK_LABEL_30;
        }
        flag = g();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        d.unlock();
        return;
        y = true;
        j = null;
        l = 1;
        n = 0;
        t.clear();
        p = u.size();
        w.clear();
        C = false;
        E = false;
        F = false;
        if (B)
        {
            z.a();
        }
        for (Iterator iterator = u.values().iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.h)iterator.next()).a()) { }
        break MISSING_BLOCK_LABEL_173;
        Exception exception;
        exception;
        d.unlock();
        throw exception;
        d.unlock();
        return;
    }

    public final ConnectionResult d()
    {
        InterruptedException interruptedexception;
        ConnectionResult connectionresult;
        boolean flag;
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ap.a(flag, "blockingConnect must not be called on the UI thread");
        d.lock();
        c();
_L1:
        flag = g();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        e.await();
          goto _L1
        interruptedexception;
        Thread.currentThread().interrupt();
        connectionresult = new ConnectionResult(15, null);
        d.unlock();
        return connectionresult;
        ConnectionResult connectionresult1;
        if (!f())
        {
            break MISSING_BLOCK_LABEL_108;
        }
        connectionresult1 = ConnectionResult.a;
        d.unlock();
        return connectionresult1;
        if (j == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        connectionresult1 = j;
        d.unlock();
        return connectionresult1;
        connectionresult1 = new ConnectionResult(13, null);
        d.unlock();
        return connectionresult1;
        Exception exception;
        exception;
        d.unlock();
        throw exception;
    }

    public final void e()
    {
        m();
        a(-1);
    }

    public final boolean f()
    {
        return l == 2;
    }

    public final boolean g()
    {
        return l == 1;
    }

    final boolean h()
    {
        return m;
    }
}
