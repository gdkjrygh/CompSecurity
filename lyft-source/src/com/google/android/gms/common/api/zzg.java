// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzz;
import java.io.FileDescriptor;
import java.io.PrintWriter;
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
//            GoogleApiClient, zzf, Api, zzh, 
//            Status, zzd, zze, zzi

final class zzg
    implements GoogleApiClient
{

    final zzj a;
    final Queue b = new LinkedList();
    final zza c;
    BroadcastReceiver d;
    final Map e = new HashMap();
    final Map f = new HashMap();
    Set g;
    final com.google.android.gms.common.internal.zze h;
    final Map i = new HashMap();
    final Api.zza j;
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
    private final zzc x = new zzc() {

        final zzg a;

        public void a(zze zze2)
        {
            a.k.remove(zze2);
        }

            
            {
                a = zzg.this;
                super();
            }
    };
    private final GoogleApiClient.ConnectionCallbacks y = new zzd() {
            private class zzd
                implements GoogleApiClient.ConnectionCallbacks
            {

                final zzg b;

                public void onConnectionSuspended(int i1)
                {
                    zzg.b(b).lock();
                    zzg.a(b).b(i1);
                    zzg.b(b).unlock();
                    return;
                    Exception exception;
                    exception;
                    zzg.b(b).unlock();
                    throw exception;
                }

                public zzd()
                {
                    b = zzg.this;
                    super();
                }
            }


        final zzg a;

        public void onConnected(Bundle bundle)
        {
            zzg.a(a).a(bundle);
        }

            
            {
                a = zzg.this;
                super();
            }
    };
    private final com.google.android.gms.common.internal.zzj.zza z = new com.google.android.gms.common.internal.zzj.zza() {

        final zzg a;

        public boolean b()
        {
            return a.d();
        }

        public Bundle e_()
        {
            return null;
        }

            
            {
                a = zzg.this;
                super();
            }
    };

    public zzg(Context context, Looper looper, zze zze1, Api.zza zza1, Map map, Set set, Set set1, 
            int i1, int j1)
    {
        s = 0x1d4c0L;
        t = 5000L;
        g = new HashSet();
        v = null;
        p = context;
        a = new zzj(looper, z);
        q = looper;
        c = new zza(looper);
        n = i1;
        o = j1;
        m = l.newCondition();
        u = new zzf(this);
        GoogleApiClient.ConnectionCallbacks connectioncallbacks;
        for (set = set.iterator(); set.hasNext(); a.a(connectioncallbacks))
        {
            connectioncallbacks = (GoogleApiClient.ConnectionCallbacks)set.next();
        }

        for (set = set1.iterator(); set.hasNext(); a.a(set1))
        {
            set1 = (GoogleApiClient.OnConnectionFailedListener)set.next();
        }

        set1 = zze1.f();
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) 
        {
            Api api = (Api)iterator.next();
            set = ((Set) (map.get(api)));
            if (set1.get(api) != null)
            {
                if (((com.google.android.gms.common.internal.zze.zza)set1.get(api)).b)
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
            if (api.e())
            {
                set = a(api.b(), set, context, looper, zze1, y, a(api, i1));
            } else
            {
                set = a(api.a(), set, context, looper, zze1, y, a(api, i1));
            }
            e.put(api.d(), set);
        }
        h = zze1;
        j = zza1;
    }

    private static Api.Client a(Api.zza zza1, Object obj, Context context, Looper looper, zze zze1, GoogleApiClient.ConnectionCallbacks connectioncallbacks, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return zza1.a(context, looper, zze1, obj, connectioncallbacks, onconnectionfailedlistener);
    }

    private final GoogleApiClient.OnConnectionFailedListener a(Api api, int i1)
    {
        return new GoogleApiClient.OnConnectionFailedListener(api, i1) {

            final Api a;
            final int b;
            final zzg c;

            public void onConnectionFailed(ConnectionResult connectionresult)
            {
                zzg.a(c).a(connectionresult, a, b);
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

    private static zzz a(Api.zzc zzc, Object obj, Context context, Looper looper, zze zze1, GoogleApiClient.ConnectionCallbacks connectioncallbacks, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return new zzz(context, looper, zzc.a(), connectioncallbacks, onconnectionfailedlistener, zze1, zzc.a(obj));
    }

    private void a(int i1)
    {
        l.lock();
        u.a(i1);
        l.unlock();
        return;
        Exception exception;
        exception;
        l.unlock();
        throw exception;
    }

    static Lock b(zzg zzg1)
    {
        return zzg1.l;
    }

    static void c(zzg zzg1)
    {
        zzg1.n();
    }

    static void d(zzg zzg1)
    {
        zzg1.o();
    }

    private void n()
    {
        l.lock();
        if (j())
        {
            b();
        }
        l.unlock();
        return;
        Exception exception;
        exception;
        l.unlock();
        throw exception;
    }

    private void o()
    {
        l.lock();
        if (l())
        {
            b();
        }
        l.unlock();
        return;
        Exception exception;
        exception;
        l.unlock();
        throw exception;
    }

    public Looper a()
    {
        return q;
    }

    public Api.Client a(Api.ClientKey clientkey)
    {
        clientkey = (Api.Client)e.get(clientkey);
        zzu.a(clientkey, "Appropriate Api was not requested.");
        return clientkey;
    }

    public zza.zza a(zza.zza zza1)
    {
        boolean flag;
        if (zza1.f() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.b(flag, "This task can not be enqueued (it's probably a Batch or malformed)");
        zzu.b(e.containsKey(zza1.f()), "GoogleApiClient is not configured to use the API required for this call.");
        l.lock();
        zza1 = u.a(zza1);
        l.unlock();
        return zza1;
        zza1;
        l.unlock();
        throw zza1;
    }

    void a(ConnectionResult connectionresult)
    {
        l.lock();
        v = connectionresult;
        u = new zzf(this);
        u.a();
        m.signalAll();
        l.unlock();
        return;
        connectionresult;
        l.unlock();
        throw connectionresult;
    }

    public void a(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        a.a(connectioncallbacks);
    }

    public void a(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        a.a(onconnectionfailedlistener);
    }

    void a(zze zze1)
    {
        k.add(zze1);
        zze1.a(x);
    }

    public void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.append(s1).append("mState=").append(u.c());
        printwriter.append(" mResuming=").print(r);
        printwriter.append(" mWorkQueue.size()=").print(b.size());
        printwriter.append(" mUnconsumedRunners.size()=").println(k.size());
        String s2 = (new StringBuilder()).append(s1).append("  ").toString();
        Api api;
        for (Iterator iterator = i.keySet().iterator(); iterator.hasNext(); ((Api.Client)e.get(api.d())).a(s2, filedescriptor, printwriter, as))
        {
            api = (Api)iterator.next();
            printwriter.append(s1).append(api.f()).println(":");
        }

    }

    public boolean a(Api api)
    {
        api = (Api.Client)e.get(api.d());
        if (api == null)
        {
            return false;
        } else
        {
            return api.b();
        }
    }

    public zza.zza b(zza.zza zza1)
    {
        zze zze1;
        boolean flag;
        if (zza1.f() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.b(flag, "This task can not be executed (it's probably a Batch or malformed)");
        l.lock();
        if (!j())
        {
            break MISSING_BLOCK_LABEL_113;
        }
        b.add(zza1);
        for (; !b.isEmpty(); zze1.c(Status.c))
        {
            zze1 = (zze)b.remove();
            a(zze1);
        }

        break MISSING_BLOCK_LABEL_102;
        zza1;
        l.unlock();
        throw zza1;
        l.unlock();
        return zza1;
        zza1 = u.b(zza1);
        l.unlock();
        return zza1;
    }

    public void b()
    {
        l.lock();
        u.b();
        l.unlock();
        return;
        Exception exception;
        exception;
        l.unlock();
        throw exception;
    }

    public void b(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        a.b(connectioncallbacks);
    }

    public void b(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        a.b(onconnectionfailedlistener);
    }

    public void c()
    {
        l();
        a(-1);
    }

    public boolean d()
    {
        return u instanceof zzd;
    }

    public boolean e()
    {
        return u instanceof com.google.android.gms.common.api.zze;
    }

    void f()
    {
        zze zze1;
        for (Iterator iterator = k.iterator(); iterator.hasNext(); zze1.c())
        {
            zze1 = (zze)iterator.next();
            zze1.a(null);
        }

        k.clear();
        for (Iterator iterator1 = w.iterator(); iterator1.hasNext(); ((zzi)iterator1.next()).a()) { }
        w.clear();
        g.clear();
    }

    void g()
    {
        for (Iterator iterator = e.values().iterator(); iterator.hasNext(); ((Api.Client)iterator.next()).a()) { }
    }

    void h()
    {
        l.lock();
        u = new com.google.android.gms.common.api.zze(this, h, i, j, l, p);
        u.a();
        m.signalAll();
        l.unlock();
        return;
        Exception exception;
        exception;
        l.unlock();
        throw exception;
    }

    void i()
    {
        l.lock();
        l();
        u = new zzd(this);
        u.a();
        m.signalAll();
        l.unlock();
        return;
        Exception exception;
        exception;
        l.unlock();
        throw exception;
    }

    boolean j()
    {
        return r;
    }

    void k()
    {
        if (j())
        {
            return;
        }
        r = true;
        if (d == null)
        {
            d = new zzb();
            IntentFilter intentfilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentfilter.addDataScheme("package");
            p.getApplicationContext().registerReceiver(d, intentfilter);
        }
        c.sendMessageDelayed(c.obtainMessage(1), s);
        c.sendMessageDelayed(c.obtainMessage(2), t);
    }

    boolean l()
    {
        l.lock();
        boolean flag = j();
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

    public int m()
    {
        return System.identityHashCode(this);
    }

    private class zza extends Handler
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
                zzg.d(a);
                return;

            case 2: // '\002'
                zzg.c(a);
                break;
            }
        }

        zza(Looper looper)
        {
            a = zzg.this;
            super(looper);
        }
    }


    private class zze
    {

        public abstract void a(Api.Client client);

        public abstract void a(Status status);

        public abstract void a(zzc zzc);

        public abstract void c();

        public abstract void c(Status status);

        public abstract Api.ClientKey f();

        public abstract int g();
    }


    private class zzb extends BroadcastReceiver
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
                    zzg.c(context);
                    return;
                }
            }
        }

        zzb()
        {
            a = new WeakReference(zzg.this);
        }
    }

}
