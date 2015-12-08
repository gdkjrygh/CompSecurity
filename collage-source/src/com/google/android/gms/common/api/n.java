// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.z;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
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

// Referenced classes of package com.google.android.gms.common.api:
//            c, m, a, o, 
//            l, zzg, q, Status, 
//            zzp

final class n
    implements com.google.android.gms.common.api.c
{
    final class a extends Handler
    {

        final n a;

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                Log.w("GoogleApiClientImpl", (new StringBuilder()).append("Unknown message id: ").append(message.what).toString());
                return;

            case 1: // '\001'
                n.d(a);
                return;

            case 2: // '\002'
                com.google.android.gms.common.api.n.c(a);
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
            a = n.this;
            super(looper);
        }
    }

    static abstract class b
    {

        private final o a;

        protected abstract void a();

        public final void a(n n1)
        {
            n.a(n1).lock();
            o o1;
            o o2;
            o1 = com.google.android.gms.common.api.n.b(n1);
            o2 = a;
            if (o1 != o2)
            {
                n.a(n1).unlock();
                return;
            }
            a();
            n.a(n1).unlock();
            return;
            Exception exception;
            exception;
            n.a(n1).unlock();
            throw exception;
        }

        protected b(o o1)
        {
            a = o1;
        }
    }

    private static class c extends BroadcastReceiver
    {

        private WeakReference a;

        public void onReceive(Context context, Intent intent)
        {
            intent = intent.getData();
            context = null;
            if (intent != null)
            {
                context = intent.getSchemeSpecificPart();
            }
            if (context != null && context.equals("com.google.android.gms"))
            {
                if ((context = (n)a.get()) != null)
                {
                    com.google.android.gms.common.api.n.c(context);
                    return;
                }
            }
        }

        c(n n1)
        {
            a = new WeakReference(n1);
        }
    }

    static interface d
    {

        public abstract void a(e e1);
    }

    static interface e
    {

        public abstract void a(d d1);

        public abstract void b();

        public abstract void b(a.c c1)
            throws DeadObjectException;

        public abstract void c(Status status);

        public abstract void d(Status status);

        public abstract a.d e();

        public abstract int f();
    }


    private final com.google.android.gms.common.internal.a A = new com.google.android.gms.common.internal.a() {

        final n a;

        public boolean isConnected()
        {
            return a.d();
        }

        public Bundle zzmw()
        {
            return null;
        }

            
            {
                a = n.this;
                super();
            }
    };
    final com.google.android.gms.common.internal.n a;
    final Queue b = new LinkedList();
    BroadcastReceiver c;
    final Map d = new HashMap();
    final Map e = new HashMap();
    Set f;
    final i g;
    final Map h = new HashMap();
    final a.b i;
    final Set j = Collections.newSetFromMap(new ConcurrentHashMap(16, 0.75F, 2));
    private final Lock k = new ReentrantLock();
    private final Condition l;
    private final int m;
    private final int n;
    private final Context o;
    private final Looper p;
    private volatile boolean q;
    private long r;
    private long s;
    private final a t;
    private final com.google.android.gms.common.b u;
    private volatile o v;
    private ConnectionResult w;
    private final Set x = Collections.newSetFromMap(new WeakHashMap());
    private final d y = new d() {

        final n a;

        public void a(e e1)
        {
            a.j.remove(e1);
        }

            
            {
                a = n.this;
                super();
            }
    };
    private final c.b z = new c.b() {

        final n a;

        public void onConnected(Bundle bundle)
        {
            n.a(a).lock();
            com.google.android.gms.common.api.n.b(a).a(bundle);
            n.a(a).unlock();
            return;
            bundle;
            n.a(a).unlock();
            throw bundle;
        }

        public void onConnectionSuspended(int l1)
        {
            n.a(a).lock();
            com.google.android.gms.common.api.n.b(a).a(l1);
            n.a(a).unlock();
            return;
            Exception exception;
            exception;
            n.a(a).unlock();
            throw exception;
        }

            
            {
                a = n.this;
                super();
            }
    };

    public n(Context context, Looper looper, i i1, com.google.android.gms.common.b b1, a.b b2, Map map, ArrayList arraylist, 
            ArrayList arraylist1, int j1, int k1)
    {
        r = 0x1d4c0L;
        s = 5000L;
        f = new HashSet();
        w = null;
        o = context;
        a = new com.google.android.gms.common.internal.n(looper, A);
        p = looper;
        t = new a(looper);
        u = b1;
        m = j1;
        n = k1;
        l = k.newCondition();
        v = new m(this);
        for (b1 = arraylist.iterator(); b1.hasNext(); a.a(arraylist))
        {
            arraylist = (c.b)b1.next();
        }

        for (b1 = arraylist1.iterator(); b1.hasNext(); a.a(arraylist))
        {
            arraylist = (c.c)b1.next();
        }

        arraylist = i1.e();
        arraylist1 = map.keySet().iterator();
        while (arraylist1.hasNext()) 
        {
            com.google.android.gms.common.api.a a1 = (com.google.android.gms.common.api.a)arraylist1.next();
            b1 = ((com.google.android.gms.common.b) (map.get(a1)));
            if (arraylist.get(a1) != null)
            {
                if (((com.google.android.gms.common.internal.i.a)arraylist.get(a1)).b)
                {
                    j1 = 1;
                } else
                {
                    j1 = 2;
                }
            } else
            {
                j1 = 0;
            }
            h.put(a1, Integer.valueOf(j1));
            if (a1.d())
            {
                b1 = a(a1.b(), b1, context, looper, i1, z, a(a1, j1));
            } else
            {
                b1 = a(a1.a(), b1, context, looper, i1, z, a(a1, j1));
            }
            d.put(a1.c(), b1);
        }
        g = i1;
        i = b2;
    }

    private static a.c a(a.b b1, Object obj, Context context, Looper looper, i i1, c.b b2, c.c c1)
    {
        return b1.a(context, looper, i1, obj, b2, c1);
    }

    private final c.c a(com.google.android.gms.common.api.a a1, int i1)
    {
        return new c.c(a1, i1) {

            final com.google.android.gms.common.api.a a;
            final int b;
            final n c;

            public void onConnectionFailed(ConnectionResult connectionresult)
            {
                n.a(c).lock();
                com.google.android.gms.common.api.n.b(c).a(connectionresult, a, b);
                n.a(c).unlock();
                return;
                connectionresult;
                n.a(c).unlock();
                throw connectionresult;
            }

            
            {
                c = n.this;
                a = a1;
                b = i1;
                super();
            }
        };
    }

    private static com.google.android.gms.common.internal.c a(a.f f1, Object obj, Context context, Looper looper, i i1, c.b b1, c.c c1)
    {
        return new com.google.android.gms.common.internal.c(context, looper, f1.a(), b1, c1, i1, f1.a(obj));
    }

    static Lock a(n n1)
    {
        return n1.k;
    }

    static o b(n n1)
    {
        return n1.v;
    }

    static void c(n n1)
    {
        n1.n();
    }

    static void d(n n1)
    {
        n1.o();
    }

    static int e(n n1)
    {
        return n1.m;
    }

    private void n()
    {
        k.lock();
        if (j())
        {
            b();
        }
        k.unlock();
        return;
        Exception exception;
        exception;
        k.unlock();
        throw exception;
    }

    private void o()
    {
        k.lock();
        if (l())
        {
            b();
        }
        k.unlock();
        return;
        Exception exception;
        exception;
        k.unlock();
        throw exception;
    }

    public Looper a()
    {
        return p;
    }

    public a.c a(a.d d1)
    {
        d1 = (a.c)d.get(d1);
        com.google.android.gms.common.internal.z.a(d1, "Appropriate Api was not requested.");
        return d1;
    }

    public k.a a(k.a a1)
    {
        boolean flag;
        if (a1.e() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.gms.common.internal.z.b(flag, "This task can not be enqueued (it's probably a Batch or malformed)");
        com.google.android.gms.common.internal.z.b(d.containsKey(a1.e()), "GoogleApiClient is not configured to use the API required for this call.");
        k.lock();
        a1 = v.a(a1);
        k.unlock();
        return a1;
        a1;
        k.unlock();
        throw a1;
    }

    void a(ConnectionResult connectionresult)
    {
        k.lock();
        w = connectionresult;
        v = new m(this);
        v.a();
        l.signalAll();
        k.unlock();
        return;
        connectionresult;
        k.unlock();
        throw connectionresult;
    }

    public void a(c.b b1)
    {
        a.a(b1);
    }

    public void a(c.c c1)
    {
        a.a(c1);
    }

    void a(b b1)
    {
        b1 = t.obtainMessage(3, b1);
        t.sendMessage(b1);
    }

    void a(e e1)
    {
        j.add(e1);
        e1.a(y);
    }

    void a(RuntimeException runtimeexception)
    {
        runtimeexception = t.obtainMessage(4, runtimeexception);
        t.sendMessage(runtimeexception);
    }

    public void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.append(s1).append("mState=").append(v.d());
        printwriter.append(" mResuming=").print(q);
        printwriter.append(" mWorkQueue.size()=").print(b.size());
        printwriter.append(" mUnconsumedRunners.size()=").println(j.size());
        String s2 = (new StringBuilder()).append(s1).append("  ").toString();
        com.google.android.gms.common.api.a a1;
        for (Iterator iterator = h.keySet().iterator(); iterator.hasNext(); ((a.c)d.get(a1.c())).dump(s2, filedescriptor, printwriter, as))
        {
            a1 = (com.google.android.gms.common.api.a)iterator.next();
            printwriter.append(s1).append(a1.e()).println(":");
        }

    }

    public void b()
    {
        k.lock();
        v.c();
        k.unlock();
        return;
        Exception exception;
        exception;
        k.unlock();
        throw exception;
    }

    public void b(c.b b1)
    {
        a.b(b1);
    }

    public void b(c.c c1)
    {
        a.b(c1);
    }

    public void c()
    {
        k.lock();
        l();
        v.b();
        k.unlock();
        return;
        Exception exception;
        exception;
        k.unlock();
        throw exception;
    }

    public boolean d()
    {
        return v instanceof l;
    }

    public boolean e()
    {
        return v instanceof zzg;
    }

    void f()
    {
        e e1;
        for (Iterator iterator = j.iterator(); iterator.hasNext(); e1.b())
        {
            e1 = (e)iterator.next();
            e1.a(null);
        }

        j.clear();
        for (Iterator iterator1 = x.iterator(); iterator1.hasNext(); ((q)iterator1.next()).a()) { }
        x.clear();
    }

    void g()
    {
        for (Iterator iterator = d.values().iterator(); iterator.hasNext(); ((a.c)iterator.next()).disconnect()) { }
    }

    void h()
    {
        k.lock();
        v = new zzg(this, g, h, u, i, k, o);
        v.a();
        l.signalAll();
        k.unlock();
        return;
        Exception exception;
        exception;
        k.unlock();
        throw exception;
    }

    void i()
    {
        k.lock();
        l();
        v = new l(this);
        v.a();
        l.signalAll();
        k.unlock();
        return;
        Exception exception;
        exception;
        k.unlock();
        throw exception;
    }

    boolean j()
    {
        return q;
    }

    void k()
    {
        if (j())
        {
            return;
        }
        q = true;
        if (c == null)
        {
            c = new c(this);
            IntentFilter intentfilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentfilter.addDataScheme("package");
            o.getApplicationContext().registerReceiver(c, intentfilter);
        }
        t.sendMessageDelayed(t.obtainMessage(1), r);
        t.sendMessageDelayed(t.obtainMessage(2), s);
    }

    boolean l()
    {
        if (!j())
        {
            return false;
        }
        q = false;
        t.removeMessages(2);
        t.removeMessages(1);
        if (c != null)
        {
            o.getApplicationContext().unregisterReceiver(c);
            c = null;
        }
        return true;
    }

    public int m()
    {
        return System.identityHashCode(this);
    }

    // Unreferenced inner class com/google/android/gms/common/api/zzi$8

/* anonymous class */
    class zzi._cls8
        implements Runnable
    {

        final FragmentActivity a;
        final n b;

        public void run()
        {
            if (a.isFinishing() || a.getSupportFragmentManager().isDestroyed())
            {
                return;
            } else
            {
                com.google.android.gms.common.api.zzp.b(a).a(n.e(b));
                return;
            }
        }
    }

}
