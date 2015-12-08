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
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.fc;
import com.google.android.gms.internal.fg;
import com.google.android.gms.internal.fq;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient, Api, Status

final class com.google.android.gms.common.api.b
    implements GoogleApiClient
{
    static interface a
    {

        public abstract void b(c c1);
    }

    class b extends Handler
    {

        final com.google.android.gms.common.api.b Bs;

        public void handleMessage(Message message)
        {
            if (message.what != 1)
            {
                break MISSING_BLOCK_LABEL_75;
            }
            com.google.android.gms.common.api.b.a(Bs).lock();
            if (!Bs.isConnected() && !Bs.isConnecting())
            {
                Bs.connect();
            }
            com.google.android.gms.common.api.b.a(Bs).unlock();
            return;
            message;
            com.google.android.gms.common.api.b.a(Bs).unlock();
            throw message;
            Log.wtf("GoogleApiClientImpl", "Don't know how to handle this message.");
            return;
        }

        b(Looper looper)
        {
            Bs = com.google.android.gms.common.api.b.this;
            super(looper);
        }
    }

    static interface c
    {

        public abstract void a(a a1);

        public abstract void b(Api.a a1)
            throws DeadObjectException;

        public abstract void cancel();

        public abstract Api.c ea();

        public abstract int ef();

        public abstract void k(Status status);
    }


    private final a AL = new a() {

        final com.google.android.gms.common.api.b Bs;

        public void b(c c1)
        {
            com.google.android.gms.common.api.b.a(Bs).lock();
            Bs.Bp.remove(c1);
            com.google.android.gms.common.api.b.a(Bs).unlock();
            return;
            c1;
            com.google.android.gms.common.api.b.a(Bs).unlock();
            throw c1;
        }

            
            {
                Bs = com.google.android.gms.common.api.b.this;
                super();
            }
    };
    private final Looper AS;
    private final Lock Ba = new ReentrantLock();
    private final Condition Bb;
    private final fg Bc;
    final Queue Bd = new LinkedList();
    private ConnectionResult Be;
    private int Bf;
    private int Bg;
    private int Bh;
    private boolean Bi;
    private int Bj;
    private long Bk;
    final Handler Bl;
    private final Bundle Bm = new Bundle();
    private final Map Bn = new HashMap();
    private boolean Bo;
    final Set Bp = new HashSet();
    final GoogleApiClient.ConnectionCallbacks Bq = new GoogleApiClient.ConnectionCallbacks() {

        final com.google.android.gms.common.api.b Bs;

        public void onConnected(Bundle bundle)
        {
            com.google.android.gms.common.api.b.a(Bs).lock();
            if (com.google.android.gms.common.api.b.b(Bs) != 1)
            {
                break MISSING_BLOCK_LABEL_45;
            }
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_38;
            }
            com.google.android.gms.common.api.b.c(Bs).putAll(bundle);
            com.google.android.gms.common.api.b.d(Bs);
            com.google.android.gms.common.api.b.a(Bs).unlock();
            return;
            bundle;
            com.google.android.gms.common.api.b.a(Bs).unlock();
            throw bundle;
        }

        public void onConnectionSuspended(int j)
        {
            com.google.android.gms.common.api.b.a(Bs).lock();
            com.google.android.gms.common.api.b.a(Bs, j);
            j;
            JVM INSTR tableswitch 1 2: default 44
        //                       1 82
        //                       2 57;
               goto _L1 _L2 _L3
_L1:
            com.google.android.gms.common.api.b.a(Bs).unlock();
            return;
_L3:
            Bs.connect();
              goto _L1
            Exception exception;
            exception;
            com.google.android.gms.common.api.b.a(Bs).unlock();
            throw exception;
_L2:
            boolean flag = com.google.android.gms.common.api.b.e(Bs);
            if (flag)
            {
                com.google.android.gms.common.api.b.a(Bs).unlock();
                return;
            }
            com.google.android.gms.common.api.b.b(Bs, 2);
            Bs.Bl.sendMessageDelayed(Bs.Bl.obtainMessage(1), com.google.android.gms.common.api.b.f(Bs));
              goto _L1
        }

            
            {
                Bs = com.google.android.gms.common.api.b.this;
                super();
            }
    };
    private final com.google.android.gms.internal.fg.b Br = new com.google.android.gms.internal.fg.b() {

        final com.google.android.gms.common.api.b Bs;

        public Bundle dG()
        {
            return null;
        }

        public boolean em()
        {
            return com.google.android.gms.common.api.b.g(Bs);
        }

        public boolean isConnected()
        {
            return Bs.isConnected();
        }

            
            {
                Bs = com.google.android.gms.common.api.b.this;
                super();
            }
    };

    public com.google.android.gms.common.api.b(Context context, Looper looper, fc fc, Map map, Set set, Set set1)
    {
        Bb = Ba.newCondition();
        Bg = 4;
        Bh = 0;
        Bi = false;
        Bk = 5000L;
        Bc = new fg(context, looper, Br);
        AS = looper;
        Bl = new b(looper);
        GoogleApiClient.ConnectionCallbacks connectioncallbacks;
        for (set = set.iterator(); set.hasNext(); Bc.registerConnectionCallbacks(connectioncallbacks))
        {
            connectioncallbacks = (GoogleApiClient.ConnectionCallbacks)set.next();
        }

        for (set = set1.iterator(); set.hasNext(); Bc.registerConnectionFailedListener(set1))
        {
            set1 = (GoogleApiClient.OnConnectionFailedListener)set.next();
        }

        Api.b b1;
        Object obj;
        for (set = map.keySet().iterator(); set.hasNext(); Bn.put(set1.ea(), a(b1, obj, context, looper, fc, Bq, new GoogleApiClient.OnConnectionFailedListener(b1) {

        final com.google.android.gms.common.api.b Bs;
        final Api.b Bt;

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            com.google.android.gms.common.api.b.a(Bs).lock();
            if (com.google.android.gms.common.api.b.h(Bs) == null || Bt.getPriority() < com.google.android.gms.common.api.b.i(Bs))
            {
                com.google.android.gms.common.api.b.a(Bs, connectionresult);
                com.google.android.gms.common.api.b.c(Bs, Bt.getPriority());
            }
            com.google.android.gms.common.api.b.d(Bs);
            com.google.android.gms.common.api.b.a(Bs).unlock();
            return;
            connectionresult;
            com.google.android.gms.common.api.b.a(Bs).unlock();
            throw connectionresult;
        }

            
            {
                Bs = com.google.android.gms.common.api.b.this;
                Bt = b2;
                super();
            }
    })))
        {
            set1 = (Api)set.next();
            b1 = set1.dY();
            obj = map.get(set1);
        }

    }

    private void E(int j)
    {
        Ba.lock();
        if (Bg == 3)
        {
            break MISSING_BLOCK_LABEL_314;
        }
        if (j != -1)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        if (isConnecting())
        {
            Iterator iterator = Bd.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                c c1 = (c)iterator.next();
                if (c1.ef() != 1)
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
        Ba.unlock();
        throw exception;
        Bd.clear();
        for (Iterator iterator1 = Bp.iterator(); iterator1.hasNext(); ((c)iterator1.next()).cancel()) { }
        Bp.clear();
        if (Be != null || Bd.isEmpty())
        {
            break MISSING_BLOCK_LABEL_183;
        }
        Bi = true;
        Ba.unlock();
        return;
        boolean flag;
        boolean flag1;
        flag = isConnecting();
        flag1 = isConnected();
        Bg = 3;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        if (j != -1)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        Be = null;
        Bb.signalAll();
        Bo = false;
        Iterator iterator2 = Bn.values().iterator();
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
        Bo = true;
        Bg = 4;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_314;
        }
        if (j == -1)
        {
            break MISSING_BLOCK_LABEL_309;
        }
        Bc.O(j);
        Bo = false;
        Ba.unlock();
        return;
    }

    static ConnectionResult a(com.google.android.gms.common.api.b b1, ConnectionResult connectionresult)
    {
        b1.Be = connectionresult;
        return connectionresult;
    }

    private static Api.a a(Api.b b1, Object obj, Context context, Looper looper, fc fc, GoogleApiClient.ConnectionCallbacks connectioncallbacks, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return b1.a(context, looper, fc, obj, connectioncallbacks, onconnectionfailedlistener);
    }

    static Lock a(com.google.android.gms.common.api.b b1)
    {
        return b1.Ba;
    }

    private void a(c c1)
        throws DeadObjectException
    {
        boolean flag1;
        flag1 = true;
        Ba.lock();
        boolean flag;
        if (!isConnected() && !ek())
        {
            flag = false;
        } else
        {
            flag = true;
        }
        fq.a(flag, "GoogleApiClient is not connected yet.");
        if (c1.ea() != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        fq.b(flag, "This task can not be executed or enqueued (it's probably a Batch or malformed)");
        Bp.add(c1);
        c1.a(AL);
        if (!ek())
        {
            break MISSING_BLOCK_LABEL_116;
        }
        c1.k(new Status(8));
        Ba.unlock();
        return;
        c1.b(a(c1.ea()));
        Ba.unlock();
        return;
        c1;
        Ba.unlock();
        throw c1;
    }

    static void a(com.google.android.gms.common.api.b b1, int j)
    {
        b1.E(j);
    }

    static int b(com.google.android.gms.common.api.b b1)
    {
        return b1.Bg;
    }

    static int b(com.google.android.gms.common.api.b b1, int j)
    {
        b1.Bh = j;
        return j;
    }

    static int c(com.google.android.gms.common.api.b b1, int j)
    {
        b1.Bf = j;
        return j;
    }

    static Bundle c(com.google.android.gms.common.api.b b1)
    {
        return b1.Bm;
    }

    static void d(com.google.android.gms.common.api.b b1)
    {
        b1.ei();
    }

    static boolean e(com.google.android.gms.common.api.b b1)
    {
        return b1.ek();
    }

    private void ei()
    {
        Ba.lock();
        Bj = Bj - 1;
        if (Bj != 0) goto _L2; else goto _L1
_L1:
        if (Be == null) goto _L4; else goto _L3
_L3:
        Bi = false;
        E(3);
        if (ek())
        {
            Bh = Bh - 1;
        }
        if (!ek()) goto _L6; else goto _L5
_L5:
        Bl.sendMessageDelayed(Bl.obtainMessage(1), Bk);
_L7:
        Bo = false;
_L2:
        Ba.unlock();
        return;
_L6:
        Bc.a(Be);
          goto _L7
        Exception exception;
        exception;
        Ba.unlock();
        throw exception;
_L4:
label0:
        {
            Bg = 2;
            el();
            Bb.signalAll();
            ej();
            if (!Bi)
            {
                break label0;
            }
            Bi = false;
            E(-1);
        }
          goto _L2
        if (!Bm.isEmpty())
        {
            break MISSING_BLOCK_LABEL_193;
        }
        Bundle bundle = null;
_L8:
        Bc.b(bundle);
          goto _L2
        bundle = Bm;
          goto _L8
    }

    private void ej()
    {
        Object obj;
        boolean flag;
        if (isConnected() || ek())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fq.a(flag, "GoogleApiClient is not connected yet.");
        Ba.lock();
        flag = Bd.isEmpty();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        a((c)Bd.remove());
        break MISSING_BLOCK_LABEL_32;
        obj;
        Log.w("GoogleApiClientImpl", "Service died while flushing queue", ((Throwable) (obj)));
        break MISSING_BLOCK_LABEL_32;
        obj;
        Ba.unlock();
        throw obj;
        Ba.unlock();
        return;
    }

    private boolean ek()
    {
        Ba.lock();
        int j = Bh;
        boolean flag;
        if (j != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Ba.unlock();
        return flag;
        Exception exception;
        exception;
        Ba.unlock();
        throw exception;
    }

    private void el()
    {
        Ba.lock();
        Bh = 0;
        Bl.removeMessages(1);
        Ba.unlock();
        return;
        Exception exception;
        exception;
        Ba.unlock();
        throw exception;
    }

    static long f(com.google.android.gms.common.api.b b1)
    {
        return b1.Bk;
    }

    static boolean g(com.google.android.gms.common.api.b b1)
    {
        return b1.Bo;
    }

    static ConnectionResult h(com.google.android.gms.common.api.b b1)
    {
        return b1.Be;
    }

    static int i(com.google.android.gms.common.api.b b1)
    {
        return b1.Bf;
    }

    public Api.a a(Api.c c1)
    {
        c1 = (Api.a)Bn.get(c1);
        fq.b(c1, "Appropriate Api was not requested.");
        return c1;
    }

    public a.b a(a.b b1)
    {
        Ba.lock();
        if (!isConnected()) goto _L2; else goto _L1
_L1:
        b(b1);
_L4:
        Ba.unlock();
        return b1;
_L2:
        Bd.add(b1);
        if (true) goto _L4; else goto _L3
_L3:
        b1;
        Ba.unlock();
        throw b1;
    }

    public a.b b(a.b b1)
    {
        boolean flag;
        if (isConnected() || ek())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fq.a(flag, "GoogleApiClient is not connected yet.");
        ej();
        try
        {
            a(b1);
        }
        catch (DeadObjectException deadobjectexception)
        {
            E(1);
            return b1;
        }
        return b1;
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
        fq.a(flag, "blockingConnect must not be called on the UI thread");
        Ba.lock();
        connect();
        l = timeunit.toNanos(l);
_L2:
        flag = isConnecting();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        l1 = Bb.awaitNanos(l);
        l = l1;
        if (l1 > 0L) goto _L2; else goto _L1
_L1:
        timeunit = new ConnectionResult(14, null);
        Ba.unlock();
        return timeunit;
        timeunit;
        Thread.currentThread().interrupt();
        timeunit = new ConnectionResult(15, null);
        Ba.unlock();
        return timeunit;
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_151;
        }
        timeunit = ConnectionResult.Ag;
        Ba.unlock();
        return timeunit;
        if (Be == null)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        timeunit = Be;
        Ba.unlock();
        return timeunit;
        timeunit = new ConnectionResult(13, null);
        Ba.unlock();
        return timeunit;
        timeunit;
        Ba.unlock();
        throw timeunit;
    }

    public void connect()
    {
        Ba.lock();
        boolean flag;
        Bi = false;
        if (isConnected())
        {
            break MISSING_BLOCK_LABEL_30;
        }
        flag = isConnecting();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        Ba.unlock();
        return;
        Bo = true;
        Be = null;
        Bg = 1;
        Bm.clear();
        Bj = Bn.size();
        for (Iterator iterator = Bn.values().iterator(); iterator.hasNext(); ((Api.a)iterator.next()).connect()) { }
        break MISSING_BLOCK_LABEL_128;
        Exception exception;
        exception;
        Ba.unlock();
        throw exception;
        Ba.unlock();
        return;
    }

    public void disconnect()
    {
        el();
        E(-1);
    }

    public Looper getLooper()
    {
        return AS;
    }

    public boolean isConnected()
    {
        Ba.lock();
        int j = Bg;
        boolean flag;
        if (j == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Ba.unlock();
        return flag;
        Exception exception;
        exception;
        Ba.unlock();
        throw exception;
    }

    public boolean isConnecting()
    {
        boolean flag;
        flag = true;
        Ba.lock();
        int j = Bg;
        if (j != 1)
        {
            flag = false;
        }
        Ba.unlock();
        return flag;
        Exception exception;
        exception;
        Ba.unlock();
        throw exception;
    }

    public boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        return Bc.isConnectionCallbacksRegistered(connectioncallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return Bc.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
    }

    public void reconnect()
    {
        disconnect();
        connect();
    }

    public void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        Bc.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        Bc.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        Bc.unregisterConnectionCallbacks(connectioncallbacks);
    }

    public void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        Bc.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }
}
