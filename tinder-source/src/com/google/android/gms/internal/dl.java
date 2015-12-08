// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.common.internal.u;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.gms.internal:
//            dk, dm, dp, di, 
//            dj, do

public final class dl extends com.google.android.gms.common.api.c
{
    final class a extends Handler
    {

        final dl a;

        public final void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                Log.w("GoogleApiClientImpl", (new StringBuilder("Unknown message id: ")).append(message.what).toString());
                return;

            case 1: // '\001'
                dl.e(a);
                return;

            case 2: // '\002'
                dl.d(a);
                return;

            case 3: // '\003'
                ((b)message.obj).a(a);
                return;

            case 4: // '\004'
                throw (RuntimeException)message.obj;
            }
        }

        a(Looper looper)
        {
            a = dl.this;
            super(looper);
        }
    }

    static abstract class b
    {

        private final dm a;

        protected abstract void a();

        public final void a(dl dl1)
        {
            com.google.android.gms.internal.dl.b(dl1).lock();
            dm dm1;
            dm dm2;
            dm1 = com.google.android.gms.internal.dl.c(dl1);
            dm2 = a;
            if (dm1 != dm2)
            {
                com.google.android.gms.internal.dl.b(dl1).unlock();
                return;
            }
            a();
            com.google.android.gms.internal.dl.b(dl1).unlock();
            return;
            Exception exception;
            exception;
            com.google.android.gms.internal.dl.b(dl1).unlock();
            throw exception;
        }

        protected b(dm dm1)
        {
            a = dm1;
        }
    }

    private static final class c
        implements android.os.IBinder.DeathRecipient, e
    {

        private final WeakReference a;
        private final WeakReference b;
        private final WeakReference c;

        private void a()
        {
            Object obj = (f)a.get();
            i i1 = (i)b.get();
            if (i1 != null && obj != null)
            {
                ((f) (obj)).a().intValue();
                i1.a();
            }
            obj = (IBinder)c.get();
            if (c != null)
            {
                ((IBinder) (obj)).unlinkToDeath(this, 0);
            }
        }

        public final void a(f f1)
        {
            a();
        }

        public final void binderDied()
        {
            a();
        }

        private c(f f1, i i1, IBinder ibinder)
        {
            b = new WeakReference(i1);
            a = new WeakReference(f1);
            c = new WeakReference(ibinder);
        }

        c(f f1, i i1, IBinder ibinder, byte byte0)
        {
            this(f1, i1, ibinder);
        }
    }

    static final class d extends do
    {

        private WeakReference b;

        public final void a()
        {
            dl dl1 = (dl)b.get();
            if (dl1 == null)
            {
                return;
            } else
            {
                dl.d(dl1);
                return;
            }
        }

        d(dl dl1)
        {
            b = new WeakReference(dl1);
        }
    }

    static interface e
    {

        public abstract void a(f f1);
    }

    static interface f
    {

        public abstract Integer a();

        public abstract void a(Status status);

        public abstract void a(com.google.android.gms.common.api.a.b b1)
            throws DeadObjectException;

        public abstract void a(e e1);

        public abstract com.google.android.gms.common.api.a.c b();

        public abstract void b(Status status);

        public abstract void c();

        public abstract boolean e();

        public abstract void f();
    }


    private final com.google.android.gms.common.internal.k.a A;
    final Lock a;
    final Condition b;
    final k c;
    final Context d;
    final Looper e;
    final Queue f;
    volatile boolean g;
    long h;
    long i;
    final a j;
    final com.google.android.gms.common.b k;
    d l;
    final Map m;
    final Map n;
    Set o;
    final g p;
    final Map q;
    final com.google.android.gms.common.api.a.a r;
    volatile dm s;
    final Set t;
    private final int u;
    private ConnectionResult v;
    private final Set w;
    private i x;
    private final e y;
    private final com.google.android.gms.common.api.c.b z;

    public dl(Context context, Looper looper, g g1, com.google.android.gms.common.b b1, com.google.android.gms.common.api.a.a a1, Map map, ArrayList arraylist, 
            ArrayList arraylist1, int i1)
    {
        a = new ReentrantLock();
        f = new LinkedList();
        h = 0x1d4c0L;
        i = 5000L;
        m = new HashMap();
        n = new HashMap();
        o = new HashSet();
        v = null;
        w = Collections.newSetFromMap(new WeakHashMap());
        t = Collections.newSetFromMap(new ConcurrentHashMap(16, 0.75F, 2));
        y = new e() {

            final dl a;

            public final void a(f f1)
            {
                a.t.remove(f1);
                if (f1.a() != null && com.google.android.gms.internal.dl.a(a) != null)
                {
                    i j1 = com.google.android.gms.internal.dl.a(a);
                    f1.a().intValue();
                    j1.a();
                }
            }

            
            {
                a = dl.this;
                super();
            }
        };
        z = new com.google.android.gms.common.api.c.b() {

            final dl a;

            public final void a(int j1)
            {
                com.google.android.gms.internal.dl.b(a).lock();
                com.google.android.gms.internal.dl.c(a).a(j1);
                com.google.android.gms.internal.dl.b(a).unlock();
                return;
                Exception exception;
                exception;
                com.google.android.gms.internal.dl.b(a).unlock();
                throw exception;
            }

            public final void a(Bundle bundle)
            {
                com.google.android.gms.internal.dl.b(a).lock();
                com.google.android.gms.internal.dl.c(a).a(bundle);
                com.google.android.gms.internal.dl.b(a).unlock();
                return;
                bundle;
                com.google.android.gms.internal.dl.b(a).unlock();
                throw bundle;
            }

            
            {
                a = dl.this;
                super();
            }
        };
        A = new com.google.android.gms.common.internal.k.a() {

            final dl a;

            public final boolean b()
            {
                return a.s instanceof di;
            }

            
            {
                a = dl.this;
                super();
            }
        };
        d = context;
        c = new k(looper, A);
        e = looper;
        j = new a(looper);
        k = b1;
        u = i1;
        q = new HashMap();
        b = a.newCondition();
        s = new dk(this);
        arraylist = arraylist.iterator();
_L4:
        com.google.android.gms.common.api.c.b b2;
        k k1;
        if (!arraylist.hasNext())
        {
            break MISSING_BLOCK_LABEL_385;
        }
        b2 = (com.google.android.gms.common.api.c.b)arraylist.next();
        k1 = c;
        com.google.android.gms.common.internal.u.a(b2);
        b1 = ((com.google.android.gms.common.b) (k1.i));
        b1;
        JVM INSTR monitorenter ;
        if (!k1.b.contains(b2))
        {
            break MISSING_BLOCK_LABEL_365;
        }
        Log.w("GmsClientEvents", (new StringBuilder("registerConnectionCallbacks(): listener ")).append(b2).append(" is already registered").toString());
_L2:
        if (k1.a.b())
        {
            k1.h.sendMessage(k1.h.obtainMessage(1, b2));
        }
        continue; /* Loop/switch isn't completed */
        k1.b.add(b2);
        if (true) goto _L2; else goto _L1
_L1:
        context;
        b1;
        JVM INSTR monitorexit ;
        throw context;
        for (b1 = arraylist1.iterator(); b1.hasNext(); c.a(arraylist))
        {
            arraylist = (com.google.android.gms.common.api.c.c)b1.next();
        }

        arraylist = g1.d;
        arraylist1 = map.keySet().iterator();
        while (arraylist1.hasNext()) 
        {
            com.google.android.gms.common.api.a a2 = (com.google.android.gms.common.api.a)arraylist1.next();
            b1 = ((com.google.android.gms.common.b) (map.get(a2)));
            boolean flag;
            if (arraylist.get(a2) != null)
            {
                if (((com.google.android.gms.common.internal.g.a)arraylist.get(a2)).b)
                {
                    i1 = 1;
                } else
                {
                    i1 = 2;
                }
            } else
            {
                i1 = 0;
            }
            q.put(a2, Integer.valueOf(i1));
            if (a2.b != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                com.google.android.gms.common.api.c.b b3;
                com.google.android.gms.common.api.c.c c1;
                boolean flag1;
                if (a2.a != null)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                com.google.android.gms.common.internal.u.a(flag1, "This API was constructed with a ClientBuilder. Use getClientBuilder");
                b1 = a2.a;
                b3 = z;
                c1 = a(a2, i1);
                b1 = new com.google.android.gms.common.internal.b(context, looper, b1.b(), b3, c1, g1, b1.a());
            } else
            {
                b1 = a2.a().a(context, looper, g1, b1, z, a(a2, i1));
            }
            m.put(a2.b(), b1);
        }
        p = g1;
        r = a1;
        return;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private com.google.android.gms.common.api.c.c a(com.google.android.gms.common.api.a a1, int i1)
    {
        return new com.google.android.gms.common.api.c.c(a1, i1) {

            final com.google.android.gms.common.api.a a;
            final int b;
            final dl c;

            public final void a(ConnectionResult connectionresult)
            {
                com.google.android.gms.internal.dl.b(c).lock();
                com.google.android.gms.internal.dl.c(c).a(connectionresult, a, b);
                com.google.android.gms.internal.dl.b(c).unlock();
                return;
                connectionresult;
                com.google.android.gms.internal.dl.b(c).unlock();
                throw connectionresult;
            }

            
            {
                c = dl.this;
                a = a1;
                b = i1;
                super();
            }
        };
    }

    static i a(dl dl1)
    {
        return dl1.x;
    }

    static Lock b(dl dl1)
    {
        return dl1.a;
    }

    static dm c(dl dl1)
    {
        return dl1.s;
    }

    static void d(dl dl1)
    {
        dl1.a.lock();
        if (dl1.g)
        {
            dl1.b();
        }
        dl1.a.unlock();
        return;
        Exception exception;
        exception;
        dl1.a.unlock();
        throw exception;
    }

    static void e(dl dl1)
    {
        dl1.a.lock();
        if (dl1.g())
        {
            dl1.b();
        }
        dl1.a.unlock();
        return;
        Exception exception;
        exception;
        dl1.a.unlock();
        throw exception;
    }

    public final Looper a()
    {
        return e;
    }

    public final com.google.android.gms.common.api.a.b a(com.google.android.gms.common.api.a.c c1)
    {
        c1 = (com.google.android.gms.common.api.a.b)m.get(c1);
        com.google.android.gms.common.internal.u.a(c1, "Appropriate Api was not requested.");
        return c1;
    }

    public final dg.a a(dg.a a1)
    {
        boolean flag;
        if (a1.a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.gms.common.internal.u.b(flag, "This task can not be enqueued (it's probably a Batch or malformed)");
        com.google.android.gms.common.internal.u.b(m.containsKey(a1.a), "GoogleApiClient is not configured to use the API required for this call.");
        a.lock();
        a1 = s.a(a1);
        a.unlock();
        return a1;
        a1;
        a.unlock();
        throw a1;
    }

    public final dp a(Object obj)
    {
        com.google.android.gms.common.internal.u.a(obj, "Listener must not be null");
        a.lock();
        obj = new dp(e, obj);
        w.add(obj);
        a.unlock();
        return ((dp) (obj));
        obj;
        a.unlock();
        throw obj;
    }

    final void a(ConnectionResult connectionresult)
    {
        a.lock();
        v = connectionresult;
        s = new dk(this);
        s.a();
        b.signalAll();
        a.unlock();
        return;
        connectionresult;
        a.unlock();
        throw connectionresult;
    }

    public final void a(com.google.android.gms.common.api.c.c c1)
    {
        c.a(c1);
    }

    final void a(b b1)
    {
        b1 = j.obtainMessage(3, b1);
        j.sendMessage(b1);
    }

    final void a(f f1)
    {
        t.add(f1);
        f1.a(y);
    }

    public final void a(String s1, PrintWriter printwriter)
    {
        printwriter.append(s1).append("mState=").append(s.d());
        printwriter.append(" mResuming=").print(g);
        printwriter.append(" mWorkQueue.size()=").print(f.size());
        printwriter.append(" mUnconsumedRunners.size()=").println(t.size());
        String s2 = (new StringBuilder()).append(s1).append("  ").toString();
        com.google.android.gms.common.api.a a1;
        for (Iterator iterator = q.keySet().iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.a.b)m.get(a1.b())).a(s2, printwriter))
        {
            a1 = (com.google.android.gms.common.api.a)iterator.next();
            printwriter.append(s1).append(a1.c).println(":");
        }

    }

    public final boolean a(com.google.android.gms.common.api.a a1)
    {
        a1 = (com.google.android.gms.common.api.a.b)m.get(a1.b());
        return a1 != null && a1.b();
    }

    public final dg.a b(dg.a a1)
    {
        f f1;
        boolean flag;
        if (a1.a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.gms.common.internal.u.b(flag, "This task can not be executed (it's probably a Batch or malformed)");
        a.lock();
        if (!g)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        f.add(a1);
        for (; !f.isEmpty(); f1.a(Status.c))
        {
            f1 = (f)f.remove();
            a(f1);
        }

        break MISSING_BLOCK_LABEL_102;
        a1;
        a.unlock();
        throw a1;
        a.unlock();
        return a1;
        a1 = s.b(a1);
        a.unlock();
        return a1;
    }

    public final void b()
    {
        a.lock();
        s.c();
        a.unlock();
        return;
        Exception exception;
        exception;
        a.unlock();
        throw exception;
    }

    public final void b(com.google.android.gms.common.api.c.c c1)
    {
        k k1 = c;
        com.google.android.gms.common.internal.u.a(c1);
        synchronized (k1.i)
        {
            if (!k1.d.remove(c1))
            {
                Log.w("GmsClientEvents", (new StringBuilder("unregisterConnectionFailedListener(): listener ")).append(c1).append(" not found").toString());
            }
        }
        return;
        c1;
        obj;
        JVM INSTR monitorexit ;
        throw c1;
    }

    public final void c()
    {
        a.lock();
        g();
        s.b();
        a.unlock();
        return;
        Exception exception;
        exception;
        a.unlock();
        throw exception;
    }

    public final boolean d()
    {
        return s instanceof di;
    }

    public final boolean e()
    {
        return s instanceof dj;
    }

    final void f()
    {
        for (Iterator iterator = t.iterator(); iterator.hasNext();)
        {
            f f1 = (f)iterator.next();
            f1.a(null);
            if (f1.a() == null)
            {
                f1.f();
            } else
            {
                f1.c();
                IBinder ibinder = a(f1.b()).d();
                i i1 = x;
                if (f1.e())
                {
                    f1.a(new c(f1, i1, ibinder, (byte)0));
                } else
                if (ibinder != null && ibinder.isBinderAlive())
                {
                    c c1 = new c(f1, i1, ibinder, (byte)0);
                    f1.a(c1);
                    try
                    {
                        ibinder.linkToDeath(c1, 0);
                    }
                    catch (RemoteException remoteexception)
                    {
                        f1.f();
                        f1.a().intValue();
                        i1.a();
                    }
                } else
                {
                    f1.a(null);
                    f1.f();
                    f1.a().intValue();
                    i1.a();
                }
            }
        }

        t.clear();
        for (Iterator iterator1 = w.iterator(); iterator1.hasNext();)
        {
            ((dp)iterator1.next()).a = null;
        }

        w.clear();
    }

    final boolean g()
    {
        if (!g)
        {
            return false;
        }
        g = false;
        j.removeMessages(2);
        j.removeMessages(1);
        if (l != null)
        {
            l.b();
            l = null;
        }
        return true;
    }

    final String h()
    {
        StringWriter stringwriter = new StringWriter();
        a("", new PrintWriter(stringwriter));
        return stringwriter.toString();
    }
}
