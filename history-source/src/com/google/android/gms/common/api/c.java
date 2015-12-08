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
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.jm;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.kc;
import com.google.android.gms.internal.kd;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
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
//            GoogleApiClient, Api, PendingResult, Status, 
//            d, Scope, f, g, 
//            ResultCallback, Result

final class com.google.android.gms.common.api.c
    implements GoogleApiClient
{
    private static class a extends BroadcastReceiver
    {

        private WeakReference Ks;

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
                if ((context = (com.google.android.gms.common.api.c)Ks.get()) != null && !context.isConnected() && !context.isConnecting() && context.gL())
                {
                    context.connect();
                    return;
                }
            }
        }

        a(com.google.android.gms.common.api.c c1)
        {
            Ks = new WeakReference(c1);
        }
    }

    static interface b
    {

        public abstract void b(d d1);
    }

    private class c extends Handler
    {

        final com.google.android.gms.common.api.c Kn;

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                Log.w("GoogleApiClientImpl", (new StringBuilder()).append("Unknown message id: ").append(message.what).toString());
                return;

            case 1: // '\001'
                com.google.android.gms.common.api.c.i(Kn);
                return;

            case 2: // '\002'
                com.google.android.gms.common.api.c.j(Kn);
                break;
            }
        }

        c(Looper looper)
        {
            Kn = com.google.android.gms.common.api.c.this;
            super(looper);
        }
    }

    static interface d
    {

        public abstract void a(b b1);

        public abstract void b(Api.a a1)
            throws DeadObjectException;

        public abstract void cancel();

        public abstract int gF();

        public abstract Api.c gz();

        public abstract void l(Status status);
    }


    private final Looper JF;
    private final Condition JR;
    private final jm JS;
    private final int JT;
    final Queue JU = new LinkedList();
    private ConnectionResult JV;
    private int JW;
    private volatile int JX;
    private volatile boolean JY;
    private boolean JZ;
    private final b Jy = new b() {

        final com.google.android.gms.common.api.c Kn;

        public void b(d d1)
        {
            Kn.Kk.remove(d1);
        }

            
            {
                Kn = com.google.android.gms.common.api.c.this;
                super();
            }
    };
    private int Ka;
    private long Kb;
    private long Kc;
    final Handler Kd;
    BroadcastReceiver Ke;
    private final Bundle Kf = new Bundle();
    private final Map Kg = new HashMap();
    private final List Kh;
    private boolean Ki;
    private final Set Kj = Collections.newSetFromMap(new WeakHashMap());
    final Set Kk = Collections.newSetFromMap(new ConcurrentHashMap());
    private final GoogleApiClient.ConnectionCallbacks Kl = new GoogleApiClient.ConnectionCallbacks() {

        final com.google.android.gms.common.api.c Kn;

        public void onConnected(Bundle bundle)
        {
            com.google.android.gms.common.api.c.a(Kn).lock();
            if (com.google.android.gms.common.api.c.b(Kn) != 1)
            {
                break MISSING_BLOCK_LABEL_45;
            }
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_38;
            }
            com.google.android.gms.common.api.c.c(Kn).putAll(bundle);
            com.google.android.gms.common.api.c.d(Kn);
            com.google.android.gms.common.api.c.a(Kn).unlock();
            return;
            bundle;
            com.google.android.gms.common.api.c.a(Kn).unlock();
            throw bundle;
        }

        public void onConnectionSuspended(int j1)
        {
            com.google.android.gms.common.api.c.a(Kn).lock();
            j1;
            JVM INSTR tableswitch 1 2: default 36
        //                       1 82
        //                       2 49;
               goto _L1 _L2 _L3
_L1:
            com.google.android.gms.common.api.c.a(Kn).unlock();
            return;
_L3:
            com.google.android.gms.common.api.c.a(Kn, j1);
            Kn.connect();
              goto _L1
            Exception exception;
            exception;
            com.google.android.gms.common.api.c.a(Kn).unlock();
            throw exception;
_L2:
            boolean flag = Kn.gL();
            if (flag)
            {
                com.google.android.gms.common.api.c.a(Kn).unlock();
                return;
            }
            com.google.android.gms.common.api.c.a(Kn, true);
            Kn.Ke = new a(Kn);
            IntentFilter intentfilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentfilter.addDataScheme("package");
            com.google.android.gms.common.api.c.e(Kn).registerReceiver(Kn.Ke, intentfilter);
            Kn.Kd.sendMessageDelayed(Kn.Kd.obtainMessage(1), com.google.android.gms.common.api.c.f(Kn));
            Kn.Kd.sendMessageDelayed(Kn.Kd.obtainMessage(2), com.google.android.gms.common.api.c.g(Kn));
            com.google.android.gms.common.api.c.a(Kn, j1);
              goto _L1
        }

            
            {
                Kn = com.google.android.gms.common.api.c.this;
                super();
            }
    };
    private final com.google.android.gms.internal.jm.b Km = new com.google.android.gms.internal.jm.b() {

        final com.google.android.gms.common.api.c Kn;

        public Bundle fX()
        {
            return null;
        }

        public boolean gN()
        {
            return com.google.android.gms.common.api.c.h(Kn);
        }

        public boolean isConnected()
        {
            return Kn.isConnected();
        }

            
            {
                Kn = com.google.android.gms.common.api.c.this;
                super();
            }
    };
    private final Context mContext;
    private final Lock zO = new ReentrantLock();

    public com.google.android.gms.common.api.c(Context context, Looper looper, jg jg1, Map map, Set set, Set set1, int i1)
    {
        JR = zO.newCondition();
        JX = 4;
        JZ = false;
        Kb = 0x1d4c0L;
        Kc = 5000L;
        mContext = context;
        JS = new jm(context, looper, Km);
        JF = looper;
        Kd = new c(looper);
        JT = i1;
        GoogleApiClient.ConnectionCallbacks connectioncallbacks;
        for (set = set.iterator(); set.hasNext(); JS.registerConnectionCallbacks(connectioncallbacks))
        {
            connectioncallbacks = (GoogleApiClient.ConnectionCallbacks)set.next();
        }

        for (set = set1.iterator(); set.hasNext(); JS.registerConnectionFailedListener(set1))
        {
            set1 = (GoogleApiClient.OnConnectionFailedListener)set.next();
        }

        Api.b b1;
        Object obj;
        for (set = map.keySet().iterator(); set.hasNext(); Kg.put(set1.gz(), a(b1, obj, context, looper, jg1, Kl, new GoogleApiClient.OnConnectionFailedListener(b1) {

        final com.google.android.gms.common.api.c Kn;
        final Api.b Ko;

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            com.google.android.gms.common.api.c.a(Kn).lock();
            if (com.google.android.gms.common.api.c.k(Kn) == null || Ko.getPriority() < com.google.android.gms.common.api.c.l(Kn))
            {
                com.google.android.gms.common.api.c.a(Kn, connectionresult);
                com.google.android.gms.common.api.c.b(Kn, Ko.getPriority());
            }
            com.google.android.gms.common.api.c.d(Kn);
            com.google.android.gms.common.api.c.a(Kn).unlock();
            return;
            connectionresult;
            com.google.android.gms.common.api.c.a(Kn).unlock();
            throw connectionresult;
        }

            
            {
                Kn = com.google.android.gms.common.api.c.this;
                Ko = b1;
                super();
            }
    })))
        {
            set1 = (Api)set.next();
            b1 = set1.gx();
            obj = map.get(set1);
        }

        Kh = Collections.unmodifiableList(jg1.ho());
    }

    static ConnectionResult a(com.google.android.gms.common.api.c c1, ConnectionResult connectionresult)
    {
        c1.JV = connectionresult;
        return connectionresult;
    }

    private static Api.a a(Api.b b1, Object obj, Context context, Looper looper, jg jg1, GoogleApiClient.ConnectionCallbacks connectioncallbacks, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return b1.a(context, looper, jg1, obj, connectioncallbacks, onconnectionfailedlistener);
    }

    static Lock a(com.google.android.gms.common.api.c c1)
    {
        return c1.zO;
    }

    private void a(GoogleApiClient googleapiclient, f f1, boolean flag)
    {
        kc.Nu.c(googleapiclient).setResultCallback(new ResultCallback(f1, flag, googleapiclient) {

            final GoogleApiClient GB;
            final com.google.android.gms.common.api.c Kn;
            final f Kq;
            final boolean Kr;

            public void j(Status status)
            {
                if (status.isSuccess() && Kn.isConnected())
                {
                    Kn.reconnect();
                }
                Kq.b(status);
                if (Kr)
                {
                    GB.disconnect();
                }
            }

            public void onResult(Result result)
            {
                j((Status)result);
            }

            
            {
                Kn = com.google.android.gms.common.api.c.this;
                Kq = f1;
                Kr = flag;
                GB = googleapiclient;
                super();
            }
        });
    }

    private void a(d d1)
        throws DeadObjectException
    {
        zO.lock();
        boolean flag;
        if (d1.gz() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "This task can not be executed or enqueued (it's probably a Batch or malformed)");
        Kk.add(d1);
        d1.a(Jy);
        if (!gL())
        {
            break MISSING_BLOCK_LABEL_85;
        }
        d1.l(new Status(8));
        zO.unlock();
        return;
        d1.b(a(d1.gz()));
        zO.unlock();
        return;
        d1;
        zO.unlock();
        throw d1;
    }

    static void a(com.google.android.gms.common.api.c c1, int i1)
    {
        c1.al(i1);
    }

    static void a(com.google.android.gms.common.api.c c1, GoogleApiClient googleapiclient, f f1, boolean flag)
    {
        c1.a(googleapiclient, f1, flag);
    }

    static boolean a(com.google.android.gms.common.api.c c1, boolean flag)
    {
        c1.JY = flag;
        return flag;
    }

    private void al(int i1)
    {
        zO.lock();
        if (JX == 3)
        {
            break MISSING_BLOCK_LABEL_357;
        }
        if (i1 != -1)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        if (isConnecting())
        {
            Iterator iterator = JU.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                d d1 = (d)iterator.next();
                if (d1.gF() != 1)
                {
                    d1.cancel();
                    iterator.remove();
                }
            } while (true);
            break MISSING_BLOCK_LABEL_104;
        }
        break MISSING_BLOCK_LABEL_95;
        Exception exception;
        exception;
        zO.unlock();
        throw exception;
        JU.clear();
        for (Iterator iterator1 = Kk.iterator(); iterator1.hasNext(); ((d)iterator1.next()).cancel()) { }
        Kk.clear();
        for (Iterator iterator2 = Kj.iterator(); iterator2.hasNext(); ((com.google.android.gms.common.api.d)iterator2.next()).clear()) { }
        Kj.clear();
        if (JV != null || JU.isEmpty())
        {
            break MISSING_BLOCK_LABEL_226;
        }
        JZ = true;
        zO.unlock();
        return;
        boolean flag;
        boolean flag1;
        flag = isConnecting();
        flag1 = isConnected();
        JX = 3;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        if (i1 != -1)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        JV = null;
        JR.signalAll();
        Ki = false;
        Iterator iterator3 = Kg.values().iterator();
        do
        {
            if (!iterator3.hasNext())
            {
                break;
            }
            Api.a a1 = (Api.a)iterator3.next();
            if (a1.isConnected())
            {
                a1.disconnect();
            }
        } while (true);
        Ki = true;
        JX = 4;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_357;
        }
        if (i1 == -1)
        {
            break MISSING_BLOCK_LABEL_352;
        }
        JS.aE(i1);
        Ki = false;
        zO.unlock();
        return;
    }

    static int b(com.google.android.gms.common.api.c c1)
    {
        return c1.JX;
    }

    static int b(com.google.android.gms.common.api.c c1, int i1)
    {
        c1.JW = i1;
        return i1;
    }

    static Bundle c(com.google.android.gms.common.api.c c1)
    {
        return c1.Kf;
    }

    static void d(com.google.android.gms.common.api.c c1)
    {
        c1.gJ();
    }

    static Context e(com.google.android.gms.common.api.c c1)
    {
        return c1.mContext;
    }

    static long f(com.google.android.gms.common.api.c c1)
    {
        return c1.Kb;
    }

    static long g(com.google.android.gms.common.api.c c1)
    {
        return c1.Kc;
    }

    private void gJ()
    {
label0:
        {
            Ka = Ka - 1;
            if (Ka == 0)
            {
                if (JV == null)
                {
                    break label0;
                }
                JZ = false;
                al(3);
                if (!gL() || !GooglePlayServicesUtil.e(mContext, JV.getErrorCode()))
                {
                    gM();
                    JS.b(JV);
                }
                Ki = false;
            }
            return;
        }
        JX = 2;
        gM();
        JR.signalAll();
        gK();
        if (JZ)
        {
            JZ = false;
            al(-1);
            return;
        }
        Bundle bundle;
        if (Kf.isEmpty())
        {
            bundle = null;
        } else
        {
            bundle = Kf;
        }
        JS.f(bundle);
    }

    private void gK()
    {
        zO.lock();
        Object obj;
        boolean flag;
        if (!isConnected() && !gL())
        {
            flag = false;
        } else
        {
            flag = true;
        }
        jx.a(flag, "GoogleApiClient is not connected yet.");
_L1:
        flag = JU.isEmpty();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        a((d)JU.remove());
          goto _L1
        obj;
        Log.w("GoogleApiClientImpl", "Service died while flushing queue", ((Throwable) (obj)));
          goto _L1
        obj;
        zO.unlock();
        throw obj;
        zO.unlock();
        return;
    }

    private void gM()
    {
        zO.lock();
        boolean flag = JY;
        if (!flag)
        {
            zO.unlock();
            return;
        }
        JY = false;
        Kd.removeMessages(2);
        Kd.removeMessages(1);
        mContext.unregisterReceiver(Ke);
        zO.unlock();
        return;
        Exception exception;
        exception;
        zO.unlock();
        throw exception;
    }

    static boolean h(com.google.android.gms.common.api.c c1)
    {
        return c1.Ki;
    }

    static void i(com.google.android.gms.common.api.c c1)
    {
        c1.gM();
    }

    static void j(com.google.android.gms.common.api.c c1)
    {
        c1.resume();
    }

    static ConnectionResult k(com.google.android.gms.common.api.c c1)
    {
        return c1.JV;
    }

    static int l(com.google.android.gms.common.api.c c1)
    {
        return c1.JW;
    }

    private void resume()
    {
        zO.lock();
        if (gL())
        {
            connect();
        }
        zO.unlock();
        return;
        Exception exception;
        exception;
        zO.unlock();
        throw exception;
    }

    public Api.a a(Api.c c1)
    {
        c1 = (Api.a)Kg.get(c1);
        jx.b(c1, "Appropriate Api was not requested.");
        return c1;
    }

    public BaseImplementation.a a(BaseImplementation.a a1)
    {
        zO.lock();
        if (!isConnected()) goto _L2; else goto _L1
_L1:
        b(a1);
_L4:
        zO.unlock();
        return a1;
_L2:
        JU.add(a1);
        if (true) goto _L4; else goto _L3
_L3:
        a1;
        zO.unlock();
        throw a1;
    }

    public boolean a(Scope scope)
    {
        return Kh.contains(scope.gO());
    }

    public BaseImplementation.a b(BaseImplementation.a a1)
    {
        boolean flag;
        if (isConnected() || gL())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, "GoogleApiClient is not connected yet.");
        gK();
        try
        {
            a(a1);
        }
        catch (DeadObjectException deadobjectexception)
        {
            al(1);
            return a1;
        }
        return a1;
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
        jx.a(flag, "blockingConnect must not be called on the UI thread");
        zO.lock();
        connect();
_L1:
        flag = isConnecting();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        JR.await();
          goto _L1
        interruptedexception;
        Thread.currentThread().interrupt();
        connectionresult = new ConnectionResult(15, null);
        zO.unlock();
        return connectionresult;
        ConnectionResult connectionresult1;
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_108;
        }
        connectionresult1 = ConnectionResult.Iu;
        zO.unlock();
        return connectionresult1;
        if (JV == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        connectionresult1 = JV;
        zO.unlock();
        return connectionresult1;
        connectionresult1 = new ConnectionResult(13, null);
        zO.unlock();
        return connectionresult1;
        Exception exception;
        exception;
        zO.unlock();
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
        jx.a(flag, "blockingConnect must not be called on the UI thread");
        zO.lock();
        connect();
        l1 = timeunit.toNanos(l1);
_L2:
        flag = isConnecting();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        l2 = JR.awaitNanos(l1);
        l1 = l2;
        if (l2 > 0L) goto _L2; else goto _L1
_L1:
        timeunit = new ConnectionResult(14, null);
        zO.unlock();
        return timeunit;
        timeunit;
        Thread.currentThread().interrupt();
        timeunit = new ConnectionResult(15, null);
        zO.unlock();
        return timeunit;
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_151;
        }
        timeunit = ConnectionResult.Iu;
        zO.unlock();
        return timeunit;
        if (JV == null)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        timeunit = JV;
        zO.unlock();
        return timeunit;
        timeunit = new ConnectionResult(13, null);
        zO.unlock();
        return timeunit;
        timeunit;
        zO.unlock();
        throw timeunit;
    }

    public PendingResult clearDefaultAccountAndReconnect()
    {
        jx.a(isConnected(), "GoogleApiClient is not connected yet.");
        f f1 = new f(JF);
        if (Kg.containsKey(kc.DQ))
        {
            a(this, f1, false);
            return f1;
        } else
        {
            AtomicReference atomicreference = new AtomicReference();
            Object obj = new GoogleApiClient.ConnectionCallbacks(atomicreference, f1) {

                final com.google.android.gms.common.api.c Kn;
                final AtomicReference Kp;
                final f Kq;

                public void onConnected(Bundle bundle)
                {
                    com.google.android.gms.common.api.c.a(Kn, (GoogleApiClient)Kp.get(), Kq, true);
                }

                public void onConnectionSuspended(int i1)
                {
                }

            
            {
                Kn = com.google.android.gms.common.api.c.this;
                Kp = atomicreference;
                Kq = f1;
                super();
            }
            };
            GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener = new GoogleApiClient.OnConnectionFailedListener(f1) {

                final com.google.android.gms.common.api.c Kn;
                final f Kq;

                public void onConnectionFailed(ConnectionResult connectionresult)
                {
                    Kq.b(new Status(8));
                }

            
            {
                Kn = com.google.android.gms.common.api.c.this;
                Kq = f1;
                super();
            }
            };
            obj = (new GoogleApiClient.Builder(mContext)).addApi(kc.API).addConnectionCallbacks(((GoogleApiClient.ConnectionCallbacks) (obj))).addOnConnectionFailedListener(onconnectionfailedlistener).setHandler(Kd).build();
            atomicreference.set(obj);
            ((GoogleApiClient) (obj)).connect();
            return f1;
        }
    }

    public void connect()
    {
        zO.lock();
        boolean flag;
        JZ = false;
        if (isConnected())
        {
            break MISSING_BLOCK_LABEL_30;
        }
        flag = isConnecting();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        zO.unlock();
        return;
        Ki = true;
        JV = null;
        JX = 1;
        Kf.clear();
        Ka = Kg.size();
        for (Iterator iterator = Kg.values().iterator(); iterator.hasNext(); ((Api.a)iterator.next()).connect()) { }
        break MISSING_BLOCK_LABEL_128;
        Exception exception;
        exception;
        zO.unlock();
        throw exception;
        zO.unlock();
        return;
    }

    public com.google.android.gms.common.api.d d(Object obj)
    {
        jx.b(obj, "Listener must not be null");
        zO.lock();
        obj = new com.google.android.gms.common.api.d(JF, obj);
        Kj.add(obj);
        zO.unlock();
        return ((com.google.android.gms.common.api.d) (obj));
        obj;
        zO.unlock();
        throw obj;
    }

    public void disconnect()
    {
        gM();
        al(-1);
    }

    boolean gL()
    {
        return JY;
    }

    public Looper getLooper()
    {
        return JF;
    }

    public boolean isConnected()
    {
        return JX == 2;
    }

    public boolean isConnecting()
    {
        return JX == 1;
    }

    public boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        return JS.isConnectionCallbacksRegistered(connectioncallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return JS.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
    }

    public void reconnect()
    {
        disconnect();
        connect();
    }

    public void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        JS.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        JS.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void stopAutoManage(FragmentActivity fragmentactivity)
    {
        boolean flag;
        if (JT >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Called stopAutoManage but automatic lifecycle management is not enabled.");
        com.google.android.gms.common.api.g.a(fragmentactivity).ao(JT);
    }

    public void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        JS.unregisterConnectionCallbacks(connectioncallbacks);
    }

    public void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        JS.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }
}
