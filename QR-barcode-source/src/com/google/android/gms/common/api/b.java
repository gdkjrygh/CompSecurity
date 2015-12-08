// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.o;
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
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient, Api, Status, c, 
//            Scope, d

final class com.google.android.gms.common.api.b
    implements GoogleApiClient
{
    static interface a
    {

        public abstract void b(c c1);
    }

    class b extends Handler
    {

        final com.google.android.gms.common.api.b Jq;

        public void handleMessage(Message message)
        {
            if (message.what != 1)
            {
                break MISSING_BLOCK_LABEL_108;
            }
            com.google.android.gms.common.api.b.a(Jq).lock();
            boolean flag;
            if (Jq.isConnected() || Jq.isConnecting())
            {
                break MISSING_BLOCK_LABEL_52;
            }
            flag = com.google.android.gms.common.api.b.e(Jq);
            if (flag)
            {
                break MISSING_BLOCK_LABEL_65;
            }
            com.google.android.gms.common.api.b.a(Jq).unlock();
            return;
            com.google.android.gms.common.api.b.h(Jq);
            Jq.connect();
            com.google.android.gms.common.api.b.a(Jq).unlock();
            return;
            message;
            com.google.android.gms.common.api.b.a(Jq).unlock();
            throw message;
            Log.wtf("GoogleApiClientImpl", "Don't know how to handle this message.");
            return;
        }

        b(Looper looper)
        {
            Jq = com.google.android.gms.common.api.b.this;
            super(looper);
        }
    }

    static interface c
    {

        public abstract void a(a a1);

        public abstract void b(Api.a a1)
            throws DeadObjectException;

        public abstract void cancel();

        public abstract Api.c ge();

        public abstract int gj();

        public abstract void m(Status status);
    }


    private final Looper IH;
    final int IU;
    private final Lock IV = new ReentrantLock();
    private final Condition IW;
    private final f IX;
    private final int IY;
    final Queue IZ = new LinkedList();
    private final a Iz = new a() {

        final com.google.android.gms.common.api.b Jq;

        public void b(c c1)
        {
            Jq.Jn.remove(c1);
        }

            
            {
                Jq = com.google.android.gms.common.api.b.this;
                super();
            }
    };
    private ConnectionResult Ja;
    private int Jb;
    private volatile int Jc;
    private volatile int Jd;
    private boolean Je;
    private int Jf;
    private long Jg;
    final Handler Jh;
    private final Bundle Ji = new Bundle();
    private final Map Jj = new HashMap();
    private final List Jk;
    private boolean Jl;
    private final Set Jm = Collections.newSetFromMap(new WeakHashMap());
    final Set Jn = Collections.newSetFromMap(new ConcurrentHashMap());
    private final GoogleApiClient.ConnectionCallbacks Jo = new GoogleApiClient.ConnectionCallbacks() {

        final com.google.android.gms.common.api.b Jq;

        public void onConnected(Bundle bundle)
        {
            com.google.android.gms.common.api.b.a(Jq).lock();
            if (com.google.android.gms.common.api.b.b(Jq) != 1)
            {
                break MISSING_BLOCK_LABEL_45;
            }
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_38;
            }
            com.google.android.gms.common.api.b.c(Jq).putAll(bundle);
            com.google.android.gms.common.api.b.d(Jq);
            com.google.android.gms.common.api.b.a(Jq).unlock();
            return;
            bundle;
            com.google.android.gms.common.api.b.a(Jq).unlock();
            throw bundle;
        }

        public void onConnectionSuspended(int i1)
        {
            com.google.android.gms.common.api.b.a(Jq).lock();
            com.google.android.gms.common.api.b.a(Jq, i1);
            i1;
            JVM INSTR tableswitch 1 2: default 44
        //                       1 82
        //                       2 57;
               goto _L1 _L2 _L3
_L1:
            com.google.android.gms.common.api.b.a(Jq).unlock();
            return;
_L3:
            Jq.connect();
              goto _L1
            Exception exception;
            exception;
            com.google.android.gms.common.api.b.a(Jq).unlock();
            throw exception;
_L2:
            boolean flag = com.google.android.gms.common.api.b.e(Jq);
            if (flag)
            {
                com.google.android.gms.common.api.b.a(Jq).unlock();
                return;
            }
            com.google.android.gms.common.api.b.b(Jq, Jq.IU);
            Jq.Jh.sendMessageDelayed(Jq.Jh.obtainMessage(1), com.google.android.gms.common.api.b.f(Jq));
              goto _L1
        }

            
            {
                Jq = com.google.android.gms.common.api.b.this;
                super();
            }
    };
    private final com.google.android.gms.common.internal.f.b Jp = new com.google.android.gms.common.internal.f.b() {

        final com.google.android.gms.common.api.b Jq;

        public Bundle fC()
        {
            return null;
        }

        public boolean gq()
        {
            return com.google.android.gms.common.api.b.g(Jq);
        }

        public boolean isConnected()
        {
            return Jq.isConnected();
        }

            
            {
                Jq = com.google.android.gms.common.api.b.this;
                super();
            }
    };

    public com.google.android.gms.common.api.b(Context context, Looper looper, ClientSettings clientsettings, Map map, Set set, Set set1, int k, 
            int l)
    {
        IW = IV.newCondition();
        Jc = 4;
        Je = false;
        Jg = 5000L;
        IX = new f(context, looper, Jp);
        IH = looper;
        Jh = new b(looper);
        IY = k;
        IU = l;
        GoogleApiClient.ConnectionCallbacks connectioncallbacks;
        for (set = set.iterator(); set.hasNext(); IX.registerConnectionCallbacks(connectioncallbacks))
        {
            connectioncallbacks = (GoogleApiClient.ConnectionCallbacks)set.next();
        }

        for (set = set1.iterator(); set.hasNext(); IX.registerConnectionFailedListener(set1))
        {
            set1 = (GoogleApiClient.OnConnectionFailedListener)set.next();
        }

        Api.b b1;
        Object obj;
        for (set = map.keySet().iterator(); set.hasNext(); Jj.put(set1.ge(), a(b1, obj, context, looper, clientsettings, Jo, new GoogleApiClient.OnConnectionFailedListener(b1) {

        final com.google.android.gms.common.api.b Jq;
        final Api.b Jr;

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            com.google.android.gms.common.api.b.a(Jq).lock();
            if (com.google.android.gms.common.api.b.i(Jq) == null || Jr.getPriority() < com.google.android.gms.common.api.b.j(Jq))
            {
                com.google.android.gms.common.api.b.a(Jq, connectionresult);
                com.google.android.gms.common.api.b.c(Jq, Jr.getPriority());
            }
            com.google.android.gms.common.api.b.d(Jq);
            com.google.android.gms.common.api.b.a(Jq).unlock();
            return;
            connectionresult;
            com.google.android.gms.common.api.b.a(Jq).unlock();
            throw connectionresult;
        }

            
            {
                Jq = com.google.android.gms.common.api.b.this;
                Jr = b2;
                super();
            }
    })))
        {
            set1 = (Api)set.next();
            b1 = set1.gb();
            obj = map.get(set1);
        }

        Jk = Collections.unmodifiableList(clientsettings.getScopes());
    }

    static ConnectionResult a(com.google.android.gms.common.api.b b1, ConnectionResult connectionresult)
    {
        b1.Ja = connectionresult;
        return connectionresult;
    }

    private static Api.a a(Api.b b1, Object obj, Context context, Looper looper, ClientSettings clientsettings, GoogleApiClient.ConnectionCallbacks connectioncallbacks, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return b1.a(context, looper, clientsettings, obj, connectioncallbacks, onconnectionfailedlistener);
    }

    static Lock a(com.google.android.gms.common.api.b b1)
    {
        return b1.IV;
    }

    private void a(c c1)
        throws DeadObjectException
    {
        IV.lock();
        boolean flag;
        if (c1.ge() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "This task can not be executed or enqueued (it's probably a Batch or malformed)");
        Jn.add(c1);
        c1.a(Iz);
        if (!go())
        {
            break MISSING_BLOCK_LABEL_84;
        }
        c1.m(new Status(8));
        IV.unlock();
        return;
        c1.b(a(c1.ge()));
        IV.unlock();
        return;
        c1;
        IV.unlock();
        throw c1;
    }

    static void a(com.google.android.gms.common.api.b b1, int k)
    {
        b1.aj(k);
    }

    private void aj(int k)
    {
        IV.lock();
        if (Jc == 3)
        {
            break MISSING_BLOCK_LABEL_357;
        }
        if (k != -1)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        if (isConnecting())
        {
            Iterator iterator = IZ.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                c c1 = (c)iterator.next();
                if (c1.gj() != 1)
                {
                    c1.cancel();
                    iterator.remove();
                }
            } while (true);
            break MISSING_BLOCK_LABEL_104;
        }
        break MISSING_BLOCK_LABEL_95;
        Exception exception;
        exception;
        IV.unlock();
        throw exception;
        IZ.clear();
        for (Iterator iterator1 = Jn.iterator(); iterator1.hasNext(); ((c)iterator1.next()).cancel()) { }
        Jn.clear();
        for (Iterator iterator2 = Jm.iterator(); iterator2.hasNext(); ((com.google.android.gms.common.api.c)iterator2.next()).clear()) { }
        Jm.clear();
        if (Ja != null || IZ.isEmpty())
        {
            break MISSING_BLOCK_LABEL_226;
        }
        Je = true;
        IV.unlock();
        return;
        boolean flag;
        boolean flag1;
        flag = isConnecting();
        flag1 = isConnected();
        Jc = 3;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        if (k != -1)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        Ja = null;
        IW.signalAll();
        Jl = false;
        Iterator iterator3 = Jj.values().iterator();
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
        Jl = true;
        Jc = 4;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_357;
        }
        if (k == -1)
        {
            break MISSING_BLOCK_LABEL_352;
        }
        IX.aB(k);
        Jl = false;
        IV.unlock();
        return;
    }

    static int b(com.google.android.gms.common.api.b b1)
    {
        return b1.Jc;
    }

    static int b(com.google.android.gms.common.api.b b1, int k)
    {
        b1.Jd = k;
        return k;
    }

    static int c(com.google.android.gms.common.api.b b1, int k)
    {
        b1.Jb = k;
        return k;
    }

    static Bundle c(com.google.android.gms.common.api.b b1)
    {
        return b1.Ji;
    }

    static void d(com.google.android.gms.common.api.b b1)
    {
        b1.gm();
    }

    static boolean e(com.google.android.gms.common.api.b b1)
    {
        return b1.go();
    }

    static long f(com.google.android.gms.common.api.b b1)
    {
        return b1.Jg;
    }

    static boolean g(com.google.android.gms.common.api.b b1)
    {
        return b1.Jl;
    }

    private void gm()
    {
label0:
        {
            Jf = Jf - 1;
            if (Jf == 0)
            {
                if (Ja == null)
                {
                    break label0;
                }
                Je = false;
                aj(3);
                if (go())
                {
                    Jh.sendMessageDelayed(Jh.obtainMessage(1), Jg);
                } else
                {
                    IX.b(Ja);
                }
                Jl = false;
            }
            return;
        }
        Jc = 2;
        gp();
        IW.signalAll();
        gn();
        if (Je)
        {
            Je = false;
            aj(-1);
            return;
        }
        Bundle bundle;
        if (Ji.isEmpty())
        {
            bundle = null;
        } else
        {
            bundle = Ji;
        }
        IX.d(bundle);
    }

    private void gn()
    {
        IV.lock();
        Object obj;
        boolean flag;
        if (!isConnected() && !go())
        {
            flag = false;
        } else
        {
            flag = true;
        }
        o.a(flag, "GoogleApiClient is not connected yet.");
_L1:
        flag = IZ.isEmpty();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        a((c)IZ.remove());
          goto _L1
        obj;
        Log.w("GoogleApiClientImpl", "Service died while flushing queue", ((Throwable) (obj)));
          goto _L1
        obj;
        IV.unlock();
        throw obj;
        IV.unlock();
        return;
    }

    private boolean go()
    {
        return Jd != 0;
    }

    private void gp()
    {
        IV.lock();
        Jd = 0;
        Jh.removeMessages(1);
        IV.unlock();
        return;
        Exception exception;
        exception;
        IV.unlock();
        throw exception;
    }

    static int h(com.google.android.gms.common.api.b b1)
    {
        int k = b1.Jd;
        b1.Jd = k - 1;
        return k;
    }

    static ConnectionResult i(com.google.android.gms.common.api.b b1)
    {
        return b1.Ja;
    }

    static int j(com.google.android.gms.common.api.b b1)
    {
        return b1.Jb;
    }

    public Api.a a(Api.c c1)
    {
        c1 = (Api.a)Jj.get(c1);
        o.b(c1, "Appropriate Api was not requested.");
        return c1;
    }

    public BaseImplementation.a a(BaseImplementation.a a1)
    {
        IV.lock();
        a1.a(new BaseImplementation.CallbackHandler(getLooper()));
        if (!isConnected()) goto _L2; else goto _L1
_L1:
        b(a1);
_L4:
        IV.unlock();
        return a1;
_L2:
        IZ.add(a1);
        if (true) goto _L4; else goto _L3
_L3:
        a1;
        IV.unlock();
        throw a1;
    }

    public boolean a(Scope scope)
    {
        return Jk.contains(scope.gs());
    }

    public BaseImplementation.a b(BaseImplementation.a a1)
    {
        boolean flag;
        if (isConnected() || go())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.a(flag, "GoogleApiClient is not connected yet.");
        gn();
        try
        {
            a(a1);
        }
        catch (DeadObjectException deadobjectexception)
        {
            aj(1);
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
        o.a(flag, "blockingConnect must not be called on the UI thread");
        IV.lock();
        connect();
_L1:
        flag = isConnecting();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        IW.await();
          goto _L1
        interruptedexception;
        Thread.currentThread().interrupt();
        connectionresult = new ConnectionResult(15, null);
        IV.unlock();
        return connectionresult;
        ConnectionResult connectionresult1;
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_108;
        }
        connectionresult1 = ConnectionResult.HE;
        IV.unlock();
        return connectionresult1;
        if (Ja == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        connectionresult1 = Ja;
        IV.unlock();
        return connectionresult1;
        connectionresult1 = new ConnectionResult(13, null);
        IV.unlock();
        return connectionresult1;
        Exception exception;
        exception;
        IV.unlock();
        throw exception;
    }

    public ConnectionResult blockingConnect(long l, TimeUnit timeunit)
    {
        long l1;
        boolean flag;
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.a(flag, "blockingConnect must not be called on the UI thread");
        IV.lock();
        connect();
        l = timeunit.toNanos(l);
_L2:
        flag = isConnecting();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        l1 = IW.awaitNanos(l);
        l = l1;
        if (l1 > 0L) goto _L2; else goto _L1
_L1:
        timeunit = new ConnectionResult(14, null);
        IV.unlock();
        return timeunit;
        timeunit;
        Thread.currentThread().interrupt();
        timeunit = new ConnectionResult(15, null);
        IV.unlock();
        return timeunit;
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_151;
        }
        timeunit = ConnectionResult.HE;
        IV.unlock();
        return timeunit;
        if (Ja == null)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        timeunit = Ja;
        IV.unlock();
        return timeunit;
        timeunit = new ConnectionResult(13, null);
        IV.unlock();
        return timeunit;
        timeunit;
        IV.unlock();
        throw timeunit;
    }

    public com.google.android.gms.common.api.c c(Object obj)
    {
        o.b(obj, "Listener must not be null");
        IV.lock();
        obj = new com.google.android.gms.common.api.c(IH, obj);
        Jm.add(obj);
        IV.unlock();
        return ((com.google.android.gms.common.api.c) (obj));
        obj;
        IV.unlock();
        throw obj;
    }

    public void connect()
    {
        IV.lock();
        boolean flag;
        Je = false;
        if (isConnected())
        {
            break MISSING_BLOCK_LABEL_30;
        }
        flag = isConnecting();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        IV.unlock();
        return;
        Jl = true;
        Ja = null;
        Jc = 1;
        Ji.clear();
        Jf = Jj.size();
        for (Iterator iterator = Jj.values().iterator(); iterator.hasNext(); ((Api.a)iterator.next()).connect()) { }
        break MISSING_BLOCK_LABEL_128;
        Exception exception;
        exception;
        IV.unlock();
        throw exception;
        IV.unlock();
        return;
    }

    public void disconnect()
    {
        gp();
        aj(-1);
    }

    public Looper getLooper()
    {
        return IH;
    }

    public boolean isConnected()
    {
        return Jc == 2;
    }

    public boolean isConnecting()
    {
        return Jc == 1;
    }

    public boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        return IX.isConnectionCallbacksRegistered(connectioncallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return IX.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
    }

    public void reconnect()
    {
        disconnect();
        connect();
    }

    public void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        IX.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        IX.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void stopAutoManage(FragmentActivity fragmentactivity)
    {
        boolean flag;
        if (IY >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.a(flag, "Called stopAutoManage but automatic lifecycle management is not enabled.");
        com.google.android.gms.common.api.d.a(fragmentactivity).al(IY);
    }

    public void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        IX.unregisterConnectionCallbacks(connectioncallbacks);
    }

    public void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        IX.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }
}
