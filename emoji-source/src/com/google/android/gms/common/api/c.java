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
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.gy;
import com.google.android.gms.internal.hc;
import com.google.android.gms.internal.hm;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient, Api, Status

final class com.google.android.gms.common.api.c
    implements GoogleApiClient
{
    static interface a
    {

        public abstract void b(c c1);
    }

    class b extends Handler
    {

        final com.google.android.gms.common.api.c Ek;

        public void handleMessage(Message message)
        {
            if (message.what != 1)
            {
                break MISSING_BLOCK_LABEL_75;
            }
            com.google.android.gms.common.api.c.a(Ek).lock();
            if (!Ek.isConnected() && !Ek.isConnecting())
            {
                Ek.connect();
            }
            com.google.android.gms.common.api.c.a(Ek).unlock();
            return;
            message;
            com.google.android.gms.common.api.c.a(Ek).unlock();
            throw message;
            Log.wtf("GoogleApiClientImpl", "Don't know how to handle this message.");
            return;
        }

        b(Looper looper)
        {
            Ek = com.google.android.gms.common.api.c.this;
            super(looper);
        }
    }

    static interface c
    {

        public abstract void a(a a1);

        public abstract void b(Api.a a1)
            throws DeadObjectException;

        public abstract void cancel();

        public abstract Api.c eB();

        public abstract int eG();

        public abstract void m(Status status);
    }


    private final Looper DF;
    private final Lock DQ = new ReentrantLock();
    private final Condition DR;
    private final hc DS;
    private final Fragment DT;
    final Queue DU = new LinkedList();
    private ConnectionResult DV;
    private int DW;
    private int DX;
    private int DY;
    private boolean DZ;
    private final a Dy = new a() {

        final com.google.android.gms.common.api.c Ek;

        public void b(c c1)
        {
            Ek.Eh.remove(c1);
        }

            
            {
                Ek = com.google.android.gms.common.api.c.this;
                super();
            }
    };
    private int Ea;
    private long Eb;
    final Handler Ec;
    private final Bundle Ed = new Bundle();
    private final Map Ee = new HashMap();
    private final List Ef;
    private boolean Eg;
    final Set Eh = Collections.newSetFromMap(new ConcurrentHashMap());
    final GoogleApiClient.ConnectionCallbacks Ei = new GoogleApiClient.ConnectionCallbacks() {

        final com.google.android.gms.common.api.c Ek;

        public void onConnected(Bundle bundle)
        {
            com.google.android.gms.common.api.c.a(Ek).lock();
            if (com.google.android.gms.common.api.c.b(Ek) != 1)
            {
                break MISSING_BLOCK_LABEL_45;
            }
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_38;
            }
            com.google.android.gms.common.api.c.c(Ek).putAll(bundle);
            com.google.android.gms.common.api.c.d(Ek);
            com.google.android.gms.common.api.c.a(Ek).unlock();
            return;
            bundle;
            com.google.android.gms.common.api.c.a(Ek).unlock();
            throw bundle;
        }

        public void onConnectionSuspended(int j)
        {
            com.google.android.gms.common.api.c.a(Ek).lock();
            com.google.android.gms.common.api.c.a(Ek, j);
            j;
            JVM INSTR tableswitch 1 2: default 44
        //                       1 82
        //                       2 57;
               goto _L1 _L2 _L3
_L1:
            com.google.android.gms.common.api.c.a(Ek).unlock();
            return;
_L3:
            Ek.connect();
              goto _L1
            Exception exception;
            exception;
            com.google.android.gms.common.api.c.a(Ek).unlock();
            throw exception;
_L2:
            boolean flag = com.google.android.gms.common.api.c.e(Ek);
            if (flag)
            {
                com.google.android.gms.common.api.c.a(Ek).unlock();
                return;
            }
            com.google.android.gms.common.api.c.b(Ek, 2);
            Ek.Ec.sendMessageDelayed(Ek.Ec.obtainMessage(1), com.google.android.gms.common.api.c.f(Ek));
              goto _L1
        }

            
            {
                Ek = com.google.android.gms.common.api.c.this;
                super();
            }
    };
    private final com.google.android.gms.internal.hc.b Ej = new com.google.android.gms.internal.hc.b() {

        final com.google.android.gms.common.api.c Ek;

        public boolean eO()
        {
            return com.google.android.gms.common.api.c.g(Ek);
        }

        public Bundle ef()
        {
            return null;
        }

        public boolean isConnected()
        {
            return Ek.isConnected();
        }

            
            {
                Ek = com.google.android.gms.common.api.c.this;
                super();
            }
    };

    public com.google.android.gms.common.api.c(Context context, Looper looper, gy gy1, Map map, Fragment fragment, Set set, Set set1)
    {
        DR = DQ.newCondition();
        DX = 4;
        DY = 0;
        DZ = false;
        Eb = 5000L;
        DS = new hc(context, looper, Ej);
        DT = fragment;
        DF = looper;
        Ec = new b(looper);
        for (fragment = set.iterator(); fragment.hasNext(); DS.registerConnectionCallbacks(set))
        {
            set = (GoogleApiClient.ConnectionCallbacks)fragment.next();
        }

        for (fragment = set1.iterator(); fragment.hasNext(); DS.registerConnectionFailedListener(set))
        {
            set = (GoogleApiClient.OnConnectionFailedListener)fragment.next();
        }

        Object obj;
        for (fragment = map.keySet().iterator(); fragment.hasNext(); Ee.put(set.eB(), a(set1, obj, context, looper, gy1, Ei, new GoogleApiClient.OnConnectionFailedListener(set1) {

        final com.google.android.gms.common.api.c Ek;
        final Api.b El;

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            com.google.android.gms.common.api.c.a(Ek).lock();
            if (com.google.android.gms.common.api.c.h(Ek) == null || El.getPriority() < com.google.android.gms.common.api.c.i(Ek))
            {
                com.google.android.gms.common.api.c.a(Ek, connectionresult);
                com.google.android.gms.common.api.c.c(Ek, El.getPriority());
            }
            com.google.android.gms.common.api.c.d(Ek);
            com.google.android.gms.common.api.c.a(Ek).unlock();
            return;
            connectionresult;
            com.google.android.gms.common.api.c.a(Ek).unlock();
            throw connectionresult;
        }

            
            {
                Ek = com.google.android.gms.common.api.c.this;
                El = b1;
                super();
            }
    })))
        {
            set = (Api)fragment.next();
            set1 = set.ez();
            obj = map.get(set);
        }

        Ef = Collections.unmodifiableList(gy1.fl());
    }

    static ConnectionResult a(com.google.android.gms.common.api.c c1, ConnectionResult connectionresult)
    {
        c1.DV = connectionresult;
        return connectionresult;
    }

    private static Api.a a(Api.b b1, Object obj, Context context, Looper looper, gy gy1, GoogleApiClient.ConnectionCallbacks connectioncallbacks, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return b1.a(context, looper, gy1, obj, connectioncallbacks, onconnectionfailedlistener);
    }

    static Lock a(com.google.android.gms.common.api.c c1)
    {
        return c1.DQ;
    }

    private void a(c c1)
        throws DeadObjectException
    {
        boolean flag1;
        flag1 = true;
        DQ.lock();
        boolean flag;
        if (!isConnected() && !eM())
        {
            flag = false;
        } else
        {
            flag = true;
        }
        hm.a(flag, "GoogleApiClient is not connected yet.");
        if (c1.eB() != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        hm.b(flag, "This task can not be executed or enqueued (it's probably a Batch or malformed)");
        Eh.add(c1);
        c1.a(Dy);
        if (!eM())
        {
            break MISSING_BLOCK_LABEL_114;
        }
        c1.m(new Status(8));
        DQ.unlock();
        return;
        c1.b(a(c1.eB()));
        DQ.unlock();
        return;
        c1;
        DQ.unlock();
        throw c1;
    }

    static void a(com.google.android.gms.common.api.c c1, int j)
    {
        c1.aa(j);
    }

    private void aa(int j)
    {
        DQ.lock();
        if (DX == 3)
        {
            break MISSING_BLOCK_LABEL_314;
        }
        if (j != -1)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        if (isConnecting())
        {
            Iterator iterator = DU.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                c c1 = (c)iterator.next();
                if (c1.eG() != 1)
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
        DQ.unlock();
        throw exception;
        DU.clear();
        for (Iterator iterator1 = Eh.iterator(); iterator1.hasNext(); ((c)iterator1.next()).cancel()) { }
        Eh.clear();
        if (DV != null || DU.isEmpty())
        {
            break MISSING_BLOCK_LABEL_183;
        }
        DZ = true;
        DQ.unlock();
        return;
        boolean flag;
        boolean flag1;
        flag = isConnecting();
        flag1 = isConnected();
        DX = 3;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        if (j != -1)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        DV = null;
        DR.signalAll();
        Eg = false;
        Iterator iterator2 = Ee.values().iterator();
        do
        {
            if (!iterator2.hasNext())
            {
                break;
            }
            Api.a a1 = (Api.a)iterator2.next();
            if (a1.isConnected())
            {
                a1.disconnect();
            }
        } while (true);
        Eg = true;
        DX = 4;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_314;
        }
        if (j == -1)
        {
            break MISSING_BLOCK_LABEL_309;
        }
        DS.ao(j);
        Eg = false;
        DQ.unlock();
        return;
    }

    static int b(com.google.android.gms.common.api.c c1)
    {
        return c1.DX;
    }

    static int b(com.google.android.gms.common.api.c c1, int j)
    {
        c1.DY = j;
        return j;
    }

    static int c(com.google.android.gms.common.api.c c1, int j)
    {
        c1.DW = j;
        return j;
    }

    static Bundle c(com.google.android.gms.common.api.c c1)
    {
        return c1.Ed;
    }

    static void d(com.google.android.gms.common.api.c c1)
    {
        c1.eK();
    }

    static boolean e(com.google.android.gms.common.api.c c1)
    {
        return c1.eM();
    }

    private void eK()
    {
        DQ.lock();
        Ea = Ea - 1;
        if (Ea != 0) goto _L2; else goto _L1
_L1:
        if (DV == null) goto _L4; else goto _L3
_L3:
        DZ = false;
        aa(3);
        if (eM())
        {
            DY = DY - 1;
        }
        if (!eM()) goto _L6; else goto _L5
_L5:
        Ec.sendMessageDelayed(Ec.obtainMessage(1), Eb);
_L7:
        Eg = false;
_L2:
        DQ.unlock();
        return;
_L6:
        DS.a(DV);
          goto _L7
        Exception exception;
        exception;
        DQ.unlock();
        throw exception;
_L4:
label0:
        {
            DX = 2;
            eN();
            DR.signalAll();
            eL();
            if (!DZ)
            {
                break label0;
            }
            DZ = false;
            aa(-1);
        }
          goto _L2
        if (!Ed.isEmpty())
        {
            break MISSING_BLOCK_LABEL_193;
        }
        Bundle bundle = null;
_L8:
        DS.c(bundle);
          goto _L2
        bundle = Ed;
          goto _L8
    }

    private void eL()
    {
        Object obj;
        boolean flag;
        if (isConnected() || eM())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hm.a(flag, "GoogleApiClient is not connected yet.");
        DQ.lock();
        flag = DU.isEmpty();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        a((c)DU.remove());
        break MISSING_BLOCK_LABEL_31;
        obj;
        Log.w("GoogleApiClientImpl", "Service died while flushing queue", ((Throwable) (obj)));
        break MISSING_BLOCK_LABEL_31;
        obj;
        DQ.unlock();
        throw obj;
        DQ.unlock();
        return;
    }

    private boolean eM()
    {
        DQ.lock();
        int j = DY;
        boolean flag;
        if (j != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        DQ.unlock();
        return flag;
        Exception exception;
        exception;
        DQ.unlock();
        throw exception;
    }

    private void eN()
    {
        DQ.lock();
        DY = 0;
        Ec.removeMessages(1);
        DQ.unlock();
        return;
        Exception exception;
        exception;
        DQ.unlock();
        throw exception;
    }

    static long f(com.google.android.gms.common.api.c c1)
    {
        return c1.Eb;
    }

    static boolean g(com.google.android.gms.common.api.c c1)
    {
        return c1.Eg;
    }

    static ConnectionResult h(com.google.android.gms.common.api.c c1)
    {
        return c1.DV;
    }

    static int i(com.google.android.gms.common.api.c c1)
    {
        return c1.DW;
    }

    public Api.a a(Api.c c1)
    {
        c1 = (Api.a)Ee.get(c1);
        hm.b(c1, "Appropriate Api was not requested.");
        return c1;
    }

    public a.b a(a.b b1)
    {
        DQ.lock();
        if (!isConnected()) goto _L2; else goto _L1
_L1:
        b(b1);
_L4:
        DQ.unlock();
        return b1;
_L2:
        DU.add(b1);
        if (true) goto _L4; else goto _L3
_L3:
        b1;
        DQ.unlock();
        throw b1;
    }

    public a.b b(a.b b1)
    {
        boolean flag;
        if (isConnected() || eM())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hm.a(flag, "GoogleApiClient is not connected yet.");
        eL();
        try
        {
            a(b1);
        }
        catch (DeadObjectException deadobjectexception)
        {
            aa(1);
            return b1;
        }
        return b1;
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
        hm.a(flag, "blockingConnect must not be called on the UI thread");
        DQ.lock();
        connect();
_L1:
        flag = isConnecting();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        DR.await();
          goto _L1
        interruptedexception;
        Thread.currentThread().interrupt();
        connectionresult = new ConnectionResult(15, null);
        DQ.unlock();
        return connectionresult;
        ConnectionResult connectionresult1;
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_108;
        }
        connectionresult1 = ConnectionResult.CS;
        DQ.unlock();
        return connectionresult1;
        if (DV == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        connectionresult1 = DV;
        DQ.unlock();
        return connectionresult1;
        connectionresult1 = new ConnectionResult(13, null);
        DQ.unlock();
        return connectionresult1;
        Exception exception;
        exception;
        DQ.unlock();
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
        hm.a(flag, "blockingConnect must not be called on the UI thread");
        DQ.lock();
        connect();
        l = timeunit.toNanos(l);
_L2:
        flag = isConnecting();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        l1 = DR.awaitNanos(l);
        l = l1;
        if (l1 > 0L) goto _L2; else goto _L1
_L1:
        timeunit = new ConnectionResult(14, null);
        DQ.unlock();
        return timeunit;
        timeunit;
        Thread.currentThread().interrupt();
        timeunit = new ConnectionResult(15, null);
        DQ.unlock();
        return timeunit;
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_151;
        }
        timeunit = ConnectionResult.CS;
        DQ.unlock();
        return timeunit;
        if (DV == null)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        timeunit = DV;
        DQ.unlock();
        return timeunit;
        timeunit = new ConnectionResult(13, null);
        DQ.unlock();
        return timeunit;
        timeunit;
        DQ.unlock();
        throw timeunit;
    }

    public void connect()
    {
        DQ.lock();
        boolean flag;
        DZ = false;
        if (isConnected())
        {
            break MISSING_BLOCK_LABEL_30;
        }
        flag = isConnecting();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        DQ.unlock();
        return;
        Eg = true;
        DV = null;
        DX = 1;
        Ed.clear();
        Ea = Ee.size();
        for (Iterator iterator = Ee.values().iterator(); iterator.hasNext(); ((Api.a)iterator.next()).connect()) { }
        break MISSING_BLOCK_LABEL_128;
        Exception exception;
        exception;
        DQ.unlock();
        throw exception;
        DQ.unlock();
        return;
    }

    public void disconnect()
    {
        eN();
        aa(-1);
    }

    public Looper getLooper()
    {
        return DF;
    }

    public boolean isConnected()
    {
        DQ.lock();
        int j = DX;
        boolean flag;
        if (j == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        DQ.unlock();
        return flag;
        Exception exception;
        exception;
        DQ.unlock();
        throw exception;
    }

    public boolean isConnecting()
    {
        boolean flag;
        flag = true;
        DQ.lock();
        int j = DX;
        if (j != 1)
        {
            flag = false;
        }
        DQ.unlock();
        return flag;
        Exception exception;
        exception;
        DQ.unlock();
        throw exception;
    }

    public boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        return DS.isConnectionCallbacksRegistered(connectioncallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return DS.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
    }

    public void reconnect()
    {
        disconnect();
        connect();
    }

    public void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        DS.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        DS.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void stopAutoManage()
    {
        boolean flag;
        if (DT != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hm.a(flag, "Called stopAutoManage but automatic lifecycle management is not enabled.");
        if (DT.getActivity() != null)
        {
            DT.getActivity().getSupportFragmentManager().beginTransaction().remove(DT).commit();
            disconnect();
        }
    }

    public void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        DS.unregisterConnectionCallbacks(connectioncallbacks);
    }

    public void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        DS.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }
}
