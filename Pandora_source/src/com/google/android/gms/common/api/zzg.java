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
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzhi;
import com.google.android.gms.internal.zzhj;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
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
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient, zzf, Api, zzh, 
//            PendingResult, zzi, zze, zzk, 
//            zzd, zzl, zzm, Status, 
//            Scope, ResultCallback, Result

final class zzg
    implements GoogleApiClient
{
    final class a extends Handler
    {

        final zzg a;

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                Log.w("GoogleApiClientImpl", (new StringBuilder()).append("Unknown message id: ").append(message.what).toString());
                return;

            case 1: // '\001'
                zzg.g(a);
                return;

            case 2: // '\002'
                zzg.f(a);
                break;
            }
        }

        a(Looper looper)
        {
            a = zzg.this;
            super(looper);
        }
    }

    private static class b extends BroadcastReceiver
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
                if ((context = (zzg)a.get()) != null)
                {
                    zzg.f(context);
                    return;
                }
            }
        }

        b(zzg zzg1)
        {
            a = new WeakReference(zzg1);
        }
    }

    static interface c
    {

        public abstract void a(d d1);
    }

    static interface d
    {

        public abstract void cancel();

        public abstract void forceFailureUnlessReady(Status status);

        public abstract void zza(c c1);

        public abstract void zzb(Api.zza zza1)
            throws DeadObjectException;

        public abstract void zzk(Status status);

        public abstract Api.zzc zzkF();

        public abstract int zzkI();
    }

    public abstract class zzd
        implements GoogleApiClient.ConnectionCallbacks
    {

        final zzg zzQJ;

        public void onConnectionSuspended(int i1)
        {
            zzg.b(zzQJ).lock();
            boolean flag = zzg.a(zzQJ) instanceof zzf;
            if (flag)
            {
                zzg.b(zzQJ).unlock();
                return;
            }
            i1;
            JVM INSTR tableswitch 1 2: default 64
        //                       1 110
        //                       2 77;
               goto _L1 _L2 _L3
_L1:
            zzg.b(zzQJ).unlock();
            return;
_L3:
            zzg.a(zzQJ, i1);
            zzQJ.connect();
              goto _L1
            Exception exception;
            exception;
            zzg.b(zzQJ).unlock();
            throw exception;
_L2:
            flag = zzQJ.e();
            if (flag)
            {
                zzg.b(zzQJ).unlock();
                return;
            }
            zzg.a(zzQJ, true);
            if (zzQJ.d == null)
            {
                zzQJ.d = new b(zzQJ);
                IntentFilter intentfilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                intentfilter.addDataScheme("package");
                zzg.c(zzQJ).getApplicationContext().registerReceiver(zzQJ.d, intentfilter);
            }
            zzQJ.c.sendMessageDelayed(zzQJ.c.obtainMessage(1), zzg.d(zzQJ));
            zzQJ.c.sendMessageDelayed(zzQJ.c.obtainMessage(2), zzg.e(zzQJ));
            zzg.a(zzQJ, i1);
              goto _L1
        }

        public zzd()
        {
            zzQJ = zzg.this;
            super();
        }
    }


    final zzj a;
    final Queue b = new LinkedList();
    final a c;
    BroadcastReceiver d;
    final Map e = new HashMap();
    final Map f = new HashMap();
    Set g;
    final zze h;
    final Map i = new HashMap();
    final Api.zzb j;
    final Set k = Collections.newSetFromMap(new ConcurrentHashMap(16, 0.75F, 2));
    private final Lock l = new ReentrantLock();
    private final Condition m;
    private final int n;
    private final int o;
    private final Context p;
    private final Looper q;
    private volatile boolean r;
    private long s;
    private long t;
    private volatile zzh u;
    private ConnectionResult v;
    private final Set w = Collections.newSetFromMap(new WeakHashMap());
    private final c x = new c() {

        final zzg a;

        public void a(d d1)
        {
            a.k.remove(d1);
        }

            
            {
                a = zzg.this;
                super();
            }
    };
    private final GoogleApiClient.ConnectionCallbacks y = new zzd() {

        final zzg a;

        public void onConnected(Bundle bundle)
        {
            zzg.a(a).onConnected(bundle);
        }

            
            {
                a = zzg.this;
                super();
            }
    };
    private final com.google.android.gms.common.internal.zzj.zza z = new com.google.android.gms.common.internal.zzj.zza() {

        final zzg a;

        public boolean isConnected()
        {
            return a.isConnected();
        }

        public Bundle zzjZ()
        {
            return null;
        }

            
            {
                a = zzg.this;
                super();
            }
    };

    public zzg(Context context, Looper looper, zze zze1, Api.zzb zzb1, Map map, Set set, Set set1, 
            int i1, int j1)
    {
        s = 0x1d4c0L;
        t = 5000L;
        g = new HashSet();
        v = null;
        p = context;
        a = new zzj(looper, z);
        q = looper;
        c = new a(looper);
        n = i1;
        o = j1;
        m = l.newCondition();
        u = new zzf(this);
        GoogleApiClient.ConnectionCallbacks connectioncallbacks;
        for (set = set.iterator(); set.hasNext(); a.registerConnectionCallbacks(connectioncallbacks))
        {
            connectioncallbacks = (GoogleApiClient.ConnectionCallbacks)set.next();
        }

        for (set = set1.iterator(); set.hasNext(); a.registerConnectionFailedListener(set1))
        {
            set1 = (GoogleApiClient.OnConnectionFailedListener)set.next();
        }

        set1 = zze1.zzlI();
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) 
        {
            Api api = (Api)iterator.next();
            set = ((Set) (map.get(api)));
            if (set1.get(api) != null)
            {
                if (((com.google.android.gms.common.internal.zze.zza)set1.get(api)).zzTa)
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
            i.put(api, Integer.valueOf(i1));
            if (api.zzkG())
            {
                set = a(api.zzkD(), set, context, looper, zze1, y, a(api, i1));
            } else
            {
                set = a(api.zzkC(), set, context, looper, zze1, y, a(api, i1));
            }
            e.put(api.zzkF(), set);
        }
        h = zze1;
        j = zzb1;
    }

    private static Api.zza a(Api.zzb zzb1, Object obj, Context context, Looper looper, zze zze1, GoogleApiClient.ConnectionCallbacks connectioncallbacks, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return zzb1.zza(context, looper, zze1, obj, connectioncallbacks, onconnectionfailedlistener);
    }

    private final GoogleApiClient.OnConnectionFailedListener a(Api api, int i1)
    {
        return new GoogleApiClient.OnConnectionFailedListener(api, i1) {

            final Api a;
            final int b;
            final zzg c;

            public void onConnectionFailed(ConnectionResult connectionresult)
            {
                zzg.a(c).zza(connectionresult, a, b);
            }

            
            {
                c = zzg.this;
                a = api;
                b = i1;
                super();
            }
        };
    }

    static zzh a(zzg zzg1)
    {
        return zzg1.u;
    }

    private static zzaa a(Api.zze zze1, Object obj, Context context, Looper looper, zze zze2, GoogleApiClient.ConnectionCallbacks connectioncallbacks, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return new zzaa(context, looper, zze1.zzkH(), connectioncallbacks, onconnectionfailedlistener, zze2, zze1.zzi(obj));
    }

    private void a(int i1)
    {
        l.lock();
        u.zzas(i1);
        l.unlock();
        return;
        Exception exception;
        exception;
        l.unlock();
        throw exception;
    }

    private void a(GoogleApiClient googleapiclient, zzk zzk1, boolean flag)
    {
        zzhi.zzUh.zzc(googleapiclient).setResultCallback(new ResultCallback(zzk1, flag, googleapiclient) {

            final zzk a;
            final boolean b;
            final GoogleApiClient c;
            final zzg d;

            public void a(Status status)
            {
                if (status.isSuccess() && d.isConnected())
                {
                    d.reconnect();
                }
                a.setResult(status);
                if (b)
                {
                    c.disconnect();
                }
            }

            public void onResult(Result result)
            {
                a((Status)result);
            }

            
            {
                d = zzg.this;
                a = zzk1;
                b = flag;
                c = googleapiclient;
                super();
            }
        });
    }

    static void a(zzg zzg1, int i1)
    {
        zzg1.a(i1);
    }

    static void a(zzg zzg1, GoogleApiClient googleapiclient, zzk zzk1, boolean flag)
    {
        zzg1.a(googleapiclient, zzk1, flag);
    }

    static boolean a(zzg zzg1, boolean flag)
    {
        zzg1.r = flag;
        return flag;
    }

    static Lock b(zzg zzg1)
    {
        return zzg1.l;
    }

    static Context c(zzg zzg1)
    {
        return zzg1.p;
    }

    static long d(zzg zzg1)
    {
        return zzg1.s;
    }

    static long e(zzg zzg1)
    {
        return zzg1.t;
    }

    static void f(zzg zzg1)
    {
        zzg1.g();
    }

    private void g()
    {
        l.lock();
        if (e())
        {
            connect();
        }
        l.unlock();
        return;
        Exception exception;
        exception;
        l.unlock();
        throw exception;
    }

    static void g(zzg zzg1)
    {
        zzg1.h();
    }

    private void h()
    {
        l.lock();
        if (f())
        {
            connect();
        }
        l.unlock();
        return;
        Exception exception;
        exception;
        l.unlock();
        throw exception;
    }

    void a()
    {
        d d1;
        for (Iterator iterator = k.iterator(); iterator.hasNext(); d1.cancel())
        {
            d1 = (d)iterator.next();
            d1.zza(null);
        }

        k.clear();
        for (Iterator iterator1 = w.iterator(); iterator1.hasNext(); ((zzi)iterator1.next()).clear()) { }
        w.clear();
        g.clear();
    }

    void a(ConnectionResult connectionresult)
    {
        l.lock();
        v = connectionresult;
        u = new zzf(this);
        u.begin();
        m.signalAll();
        l.unlock();
        return;
        connectionresult;
        l.unlock();
        throw connectionresult;
    }

    void a(d d1)
    {
        k.add(d1);
        d1.zza(x);
    }

    void b()
    {
        for (Iterator iterator = e.values().iterator(); iterator.hasNext(); ((Api.zza)iterator.next()).disconnect()) { }
    }

    public ConnectionResult blockingConnect()
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
        zzv.zza(flag, "blockingConnect must not be called on the UI thread");
        l.lock();
        connect();
_L1:
        flag = isConnecting();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        m.await();
          goto _L1
        interruptedexception;
        Thread.currentThread().interrupt();
        connectionresult = new ConnectionResult(15, null);
        l.unlock();
        return connectionresult;
        ConnectionResult connectionresult1;
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_108;
        }
        connectionresult1 = ConnectionResult.zzOI;
        l.unlock();
        return connectionresult1;
        if (v == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        connectionresult1 = v;
        l.unlock();
        return connectionresult1;
        connectionresult1 = new ConnectionResult(13, null);
        l.unlock();
        return connectionresult1;
        Exception exception;
        exception;
        l.unlock();
        throw exception;
    }

    public ConnectionResult blockingConnect(long l1, TimeUnit timeunit)
    {
        long l2;
        boolean flag;
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzv.zza(flag, "blockingConnect must not be called on the UI thread");
        l.lock();
        connect();
        l1 = timeunit.toNanos(l1);
_L2:
        flag = isConnecting();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        l2 = m.awaitNanos(l1);
        l1 = l2;
        if (l2 > 0L) goto _L2; else goto _L1
_L1:
        timeunit = new ConnectionResult(14, null);
        l.unlock();
        return timeunit;
        timeunit;
        Thread.currentThread().interrupt();
        timeunit = new ConnectionResult(15, null);
        l.unlock();
        return timeunit;
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_151;
        }
        timeunit = ConnectionResult.zzOI;
        l.unlock();
        return timeunit;
        if (v == null)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        timeunit = v;
        l.unlock();
        return timeunit;
        timeunit = new ConnectionResult(13, null);
        l.unlock();
        return timeunit;
        timeunit;
        l.unlock();
        throw timeunit;
    }

    void c()
    {
        l.lock();
        u = new com.google.android.gms.common.api.zze(this, h, i, j, l, p);
        u.begin();
        m.signalAll();
        l.unlock();
        return;
        Exception exception;
        exception;
        l.unlock();
        throw exception;
    }

    public PendingResult clearDefaultAccountAndReconnect()
    {
        zzv.zza(isConnected(), "GoogleApiClient is not connected yet.");
        zzk zzk1 = new zzk(q);
        if (e.containsKey(zzhi.zzKh))
        {
            a(this, zzk1, false);
            return zzk1;
        } else
        {
            AtomicReference atomicreference = new AtomicReference();
            Object obj = new GoogleApiClient.ConnectionCallbacks(atomicreference, zzk1) {

                final AtomicReference a;
                final zzk b;
                final zzg c;

                public void onConnected(Bundle bundle)
                {
                    zzg.a(c, (GoogleApiClient)a.get(), b, true);
                }

                public void onConnectionSuspended(int i1)
                {
                }

            
            {
                c = zzg.this;
                a = atomicreference;
                b = zzk1;
                super();
            }
            };
            GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener = new GoogleApiClient.OnConnectionFailedListener(zzk1) {

                final zzk a;
                final zzg b;

                public void onConnectionFailed(ConnectionResult connectionresult)
                {
                    a.setResult(new Status(8));
                }

            
            {
                b = zzg.this;
                a = zzk1;
                super();
            }
            };
            obj = (new GoogleApiClient.Builder(p)).addApi(zzhi.API).addConnectionCallbacks(((GoogleApiClient.ConnectionCallbacks) (obj))).addOnConnectionFailedListener(onconnectionfailedlistener).setHandler(c).build();
            atomicreference.set(obj);
            ((GoogleApiClient) (obj)).connect();
            return zzk1;
        }
    }

    public void connect()
    {
        l.lock();
        u.connect();
        l.unlock();
        return;
        Exception exception;
        exception;
        l.unlock();
        throw exception;
    }

    void d()
    {
        l.lock();
        f();
        u = new com.google.android.gms.common.api.zzd(this);
        u.begin();
        m.signalAll();
        l.unlock();
        return;
        Exception exception;
        exception;
        l.unlock();
        throw exception;
    }

    public void disconnect()
    {
        f();
        a(-1);
    }

    public void dump(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.append(s1).println("GoogleApiClient:");
        s1 = (new StringBuilder()).append(s1).append("  ").toString();
        printwriter.append(s1).append("mState=").append(u.getName());
        printwriter.append(" mResuming=").print(r);
        printwriter.append(" mWorkQueue.size()=").print(b.size());
        printwriter.append(" mUnconsumedRunners.size()=").println(k.size());
        for (Iterator iterator = e.values().iterator(); iterator.hasNext(); ((Api.zza)iterator.next()).dump(s1, filedescriptor, printwriter, as)) { }
    }

    boolean e()
    {
        return r;
    }

    boolean f()
    {
        l.lock();
        boolean flag = e();
        if (!flag)
        {
            l.unlock();
            return false;
        }
        r = false;
        c.removeMessages(2);
        c.removeMessages(1);
        if (d != null)
        {
            p.getApplicationContext().unregisterReceiver(d);
            d = null;
        }
        l.unlock();
        return true;
        Exception exception;
        exception;
        l.unlock();
        throw exception;
    }

    public ConnectionResult getConnectionResult(Api api)
    {
        Api.zzc zzc;
        zzc = api.zzkF();
        l.lock();
        if (!isConnected() && !e())
        {
            throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
        }
        break MISSING_BLOCK_LABEL_51;
        api;
        l.unlock();
        throw api;
        if (!e.containsKey(zzc))
        {
            break MISSING_BLOCK_LABEL_196;
        }
        if (!((Api.zza)e.get(zzc)).isConnected())
        {
            break MISSING_BLOCK_LABEL_100;
        }
        api = ConnectionResult.zzOI;
        l.unlock();
        return api;
        if (!f.containsKey(zzc))
        {
            break MISSING_BLOCK_LABEL_138;
        }
        api = (ConnectionResult)f.get(zzc);
        l.unlock();
        return api;
        Log.wtf("GoogleApiClientImpl", (new StringBuilder()).append(api.getName()).append(" requested in getConnectionResult").append(" is not connected but is not present in the failed connections map").toString());
        api = new ConnectionResult(8, null);
        l.unlock();
        return api;
        l.unlock();
        throw new IllegalArgumentException((new StringBuilder()).append(api.getName()).append(" was never registered with GoogleApiClient").toString());
    }

    public Context getContext()
    {
        return p;
    }

    public Looper getLooper()
    {
        return q;
    }

    public int getSessionId()
    {
        return System.identityHashCode(this);
    }

    public boolean hasConnectedApi(Api api)
    {
        api = (Api.zza)e.get(api.zzkF());
        if (api == null)
        {
            return false;
        } else
        {
            return api.isConnected();
        }
    }

    public boolean isConnected()
    {
        return u instanceof com.google.android.gms.common.api.zzd;
    }

    public boolean isConnecting()
    {
        return u instanceof com.google.android.gms.common.api.zze;
    }

    public boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        return a.isConnectionCallbacksRegistered(connectioncallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return a.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
    }

    public void reconnect()
    {
        disconnect();
        connect();
    }

    public void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        a.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        a.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void stopAutoManage(FragmentActivity fragmentactivity)
    {
        if (n >= 0)
        {
            com.google.android.gms.common.api.zzl.zza(fragmentactivity).zzax(n);
            return;
        }
        if (o >= 0)
        {
            zzm.zzb(fragmentactivity).zzax(o);
            return;
        } else
        {
            throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
        }
    }

    public void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        a.unregisterConnectionCallbacks(connectioncallbacks);
    }

    public void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        a.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }

    public Api.zza zza(Api.zzc zzc)
    {
        zzc = (Api.zza)e.get(zzc);
        zzv.zzb(zzc, "Appropriate Api was not requested.");
        return zzc;
    }

    public zza.zza zza(zza.zza zza1)
    {
        boolean flag;
        if (zza1.zzkF() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzv.zzb(flag, "This task can not be enqueued (it's probably a Batch or malformed)");
        zzv.zzb(e.containsKey(zza1.zzkF()), "GoogleApiClient is not configured to use the API required for this call.");
        l.lock();
        zza1 = u.zza(zza1);
        l.unlock();
        return zza1;
        zza1;
        l.unlock();
        throw zza1;
    }

    public boolean zza(Api api)
    {
        return e.containsKey(api.zzkF());
    }

    public boolean zza(Scope scope)
    {
        l.lock();
        if (!isConnected()) goto _L2; else goto _L1
_L1:
        boolean flag = g.contains(scope);
        if (!flag) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        l.unlock();
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        scope;
        l.unlock();
        throw scope;
    }

    public zza.zza zzb(zza.zza zza1)
    {
        d d1;
        boolean flag;
        if (zza1.zzkF() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzv.zzb(flag, "This task can not be executed (it's probably a Batch or malformed)");
        l.lock();
        if (!e())
        {
            break MISSING_BLOCK_LABEL_113;
        }
        b.add(zza1);
        for (; !b.isEmpty(); d1.zzk(Status.zzQW))
        {
            d1 = (d)b.remove();
            a(d1);
        }

        break MISSING_BLOCK_LABEL_102;
        zza1;
        l.unlock();
        throw zza1;
        l.unlock();
        return zza1;
        zza1 = u.zzb(zza1);
        l.unlock();
        return zza1;
    }

    public zzi zzl(Object obj)
    {
        zzv.zzb(obj, "Listener must not be null");
        l.lock();
        obj = new zzi(q, obj);
        w.add(obj);
        l.unlock();
        return ((zzi) (obj));
        obj;
        l.unlock();
        throw obj;
    }
}
