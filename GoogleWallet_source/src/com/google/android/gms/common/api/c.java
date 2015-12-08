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
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.jw;
import com.google.android.gms.internal.kc;
import com.google.android.gms.internal.kn;
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
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient, Api, Status, d

final class com.google.android.gms.common.api.c
    implements GoogleApiClient
{
    static final class a extends BroadcastReceiver
    {

        private WeakReference Td;

        public final void onReceive(Context context, Intent intent)
        {
            intent = intent.getData();
            context = null;
            if (intent != null)
            {
                context = intent.getSchemeSpecificPart();
            }
            if (context != null && context.equals("com.google.android.gms"))
            {
                if ((context = (com.google.android.gms.common.api.c)Td.get()) != null && !context.isConnected() && !context.isConnecting() && context.ih())
                {
                    context.connect();
                    return;
                }
            }
        }

        a(com.google.android.gms.common.api.c c1)
        {
            Td = new WeakReference(c1);
        }
    }

    static interface b
    {

        public abstract void b(d d1);
    }

    final class c extends Handler
    {

        final com.google.android.gms.common.api.c SY;

        public final void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                Log.w("GoogleApiClientImpl", (new StringBuilder("Unknown message id: ")).append(message.what).toString());
                return;

            case 1: // '\001'
                com.google.android.gms.common.api.c.i(SY);
                return;

            case 2: // '\002'
                com.google.android.gms.common.api.c.j(SY);
                break;
            }
        }

        c(Looper looper)
        {
            SY = com.google.android.gms.common.api.c.this;
            super(looper);
        }
    }

    static interface d
    {

        public abstract void a(b b1);

        public abstract void b(Api.a a1)
            throws DeadObjectException;

        public abstract void cancel();

        public abstract Api.c hV();

        public abstract int ib();

        public abstract void r(Status status);
    }


    private final Looper JL;
    private final Set Kk = Collections.newSetFromMap(new WeakHashMap());
    private final Condition SD;
    private final kc SE;
    private final int SF;
    final Queue SG = new LinkedList();
    private ConnectionResult SH;
    private int SI;
    private volatile int SJ;
    private volatile boolean SK;
    private boolean SL;
    private int SM;
    private long SN;
    private long SO;
    final Handler SP;
    BroadcastReceiver SQ;
    private final Bundle SR = new Bundle();
    private final Map SS = new HashMap();
    private final List ST;
    private boolean SU;
    final Set SV = Collections.newSetFromMap(new ConcurrentHashMap());
    private final GoogleApiClient.ConnectionCallbacks SW = new GoogleApiClient.ConnectionCallbacks() {

        final com.google.android.gms.common.api.c SY;

        public final void onConnected(Bundle bundle)
        {
            com.google.android.gms.common.api.c.a(SY).lock();
            if (com.google.android.gms.common.api.c.b(SY) != 1)
            {
                break MISSING_BLOCK_LABEL_45;
            }
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_38;
            }
            com.google.android.gms.common.api.c.c(SY).putAll(bundle);
            com.google.android.gms.common.api.c.d(SY);
            com.google.android.gms.common.api.c.a(SY).unlock();
            return;
            bundle;
            com.google.android.gms.common.api.c.a(SY).unlock();
            throw bundle;
        }

        public final void onConnectionSuspended(int j1)
        {
            com.google.android.gms.common.api.c.a(SY).lock();
            j1;
            JVM INSTR tableswitch 1 2: default 36
        //                       1 82
        //                       2 49;
               goto _L1 _L2 _L3
_L1:
            com.google.android.gms.common.api.c.a(SY).unlock();
            return;
_L3:
            com.google.android.gms.common.api.c.a(SY, j1);
            SY.connect();
              goto _L1
            Exception exception;
            exception;
            com.google.android.gms.common.api.c.a(SY).unlock();
            throw exception;
_L2:
            boolean flag = SY.ih();
            if (flag)
            {
                com.google.android.gms.common.api.c.a(SY).unlock();
                return;
            }
            com.google.android.gms.common.api.c.a(SY, true);
            SY.SQ = new a(SY);
            IntentFilter intentfilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentfilter.addDataScheme("package");
            com.google.android.gms.common.api.c.e(SY).registerReceiver(SY.SQ, intentfilter);
            SY.SP.sendMessageDelayed(SY.SP.obtainMessage(1), com.google.android.gms.common.api.c.f(SY));
            SY.SP.sendMessageDelayed(SY.SP.obtainMessage(2), com.google.android.gms.common.api.c.g(SY));
            com.google.android.gms.common.api.c.a(SY, j1);
              goto _L1
        }

            
            {
                SY = com.google.android.gms.common.api.c.this;
                super();
            }
    };
    private final com.google.android.gms.internal.kc.b SX = new com.google.android.gms.internal.kc.b() {

        final com.google.android.gms.common.api.c SY;

        public final Bundle ht()
        {
            return null;
        }

        public final boolean ij()
        {
            return com.google.android.gms.common.api.c.h(SY);
        }

        public final boolean isConnected()
        {
            return SY.isConnected();
        }

            
            {
                SY = com.google.android.gms.common.api.c.this;
                super();
            }
    };
    private final b Sm = new b() {

        final com.google.android.gms.common.api.c SY;

        public final void b(d d1)
        {
            SY.SV.remove(d1);
        }

            
            {
                SY = com.google.android.gms.common.api.c.this;
                super();
            }
    };
    private final Context mContext;
    private final Lock zM = new ReentrantLock();

    public com.google.android.gms.common.api.c(Context context, Looper looper, jw jw1, Map map, Set set, Set set1, int i1)
    {
        SD = zM.newCondition();
        SJ = 4;
        SL = false;
        SN = 0x1d4c0L;
        SO = 5000L;
        mContext = context;
        SE = new kc(context, looper, SX);
        JL = looper;
        SP = new c(looper);
        SF = i1;
        GoogleApiClient.ConnectionCallbacks connectioncallbacks;
        for (set = set.iterator(); set.hasNext(); SE.registerConnectionCallbacks(connectioncallbacks))
        {
            connectioncallbacks = (GoogleApiClient.ConnectionCallbacks)set.next();
        }

        for (set = set1.iterator(); set.hasNext(); SE.registerConnectionFailedListener(set1))
        {
            set1 = (com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener)set.next();
        }

        Api.b b1;
        Object obj;
        for (set = map.keySet().iterator(); set.hasNext(); SS.put(set1.hV(), a$67e41ac5(b1, obj, context, looper, jw1, SW, new com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener(b1) {

        final com.google.android.gms.common.api.c SY;
        final Api.b SZ;

        public final void onConnectionFailed(ConnectionResult connectionresult)
        {
            com.google.android.gms.common.api.c.a(SY).lock();
            if (com.google.android.gms.common.api.c.k(SY) == null || SZ.getPriority() < com.google.android.gms.common.api.c.l(SY))
            {
                com.google.android.gms.common.api.c.a(SY, connectionresult);
                com.google.android.gms.common.api.c.b(SY, SZ.getPriority());
            }
            com.google.android.gms.common.api.c.d(SY);
            com.google.android.gms.common.api.c.a(SY).unlock();
            return;
            connectionresult;
            com.google.android.gms.common.api.c.a(SY).unlock();
            throw connectionresult;
        }

            
            {
                SY = com.google.android.gms.common.api.c.this;
                SZ = b1;
                super();
            }
    })))
        {
            set1 = (Api)set.next();
            b1 = set1.hT();
            obj = map.get(set1);
        }

        ST = Collections.unmodifiableList(jw1.iH());
    }

    static ConnectionResult a(com.google.android.gms.common.api.c c1, ConnectionResult connectionresult)
    {
        c1.SH = connectionresult;
        return connectionresult;
    }

    static Lock a(com.google.android.gms.common.api.c c1)
    {
        return c1.zM;
    }

    private void a(d d1)
        throws DeadObjectException
    {
        zM.lock();
        boolean flag;
        if (d1.hV() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        kn.b(flag, "This task can not be executed or enqueued (it's probably a Batch or malformed)");
        SV.add(d1);
        d1.a(Sm);
        if (!ih())
        {
            break MISSING_BLOCK_LABEL_84;
        }
        d1.r(new Status(8));
        zM.unlock();
        return;
        d1.b(a(d1.hV()));
        zM.unlock();
        return;
        d1;
        zM.unlock();
        throw d1;
    }

    static void a(com.google.android.gms.common.api.c c1, int i1)
    {
        c1.cN(i1);
    }

    static boolean a(com.google.android.gms.common.api.c c1, boolean flag)
    {
        c1.SK = flag;
        return flag;
    }

    private static Api.a a$67e41ac5(Api.b b1, Object obj, Context context, Looper looper, jw jw1, GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return b1.a$28a3456d(context, looper, jw1, obj, connectioncallbacks, onconnectionfailedlistener);
    }

    static int b(com.google.android.gms.common.api.c c1)
    {
        return c1.SJ;
    }

    static int b(com.google.android.gms.common.api.c c1, int i1)
    {
        c1.SI = i1;
        return i1;
    }

    static Bundle c(com.google.android.gms.common.api.c c1)
    {
        return c1.SR;
    }

    private void cN(int i1)
    {
        zM.lock();
        if (SJ == 3)
        {
            break MISSING_BLOCK_LABEL_357;
        }
        if (i1 != -1)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        if (isConnecting())
        {
            Iterator iterator = SG.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                d d1 = (d)iterator.next();
                if (d1.ib() != 1)
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
        zM.unlock();
        throw exception;
        SG.clear();
        for (Iterator iterator1 = SV.iterator(); iterator1.hasNext(); ((d)iterator1.next()).cancel()) { }
        SV.clear();
        for (Iterator iterator2 = Kk.iterator(); iterator2.hasNext(); ((com.google.android.gms.common.api.d)iterator2.next()).clear()) { }
        Kk.clear();
        if (SH != null || SG.isEmpty())
        {
            break MISSING_BLOCK_LABEL_226;
        }
        SL = true;
        zM.unlock();
        return;
        boolean flag;
        boolean flag1;
        flag = isConnecting();
        flag1 = isConnected();
        SJ = 3;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        if (i1 != -1)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        SH = null;
        SD.signalAll();
        SU = false;
        Iterator iterator3 = SS.values().iterator();
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
        SU = true;
        SJ = 4;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_357;
        }
        if (i1 == -1)
        {
            break MISSING_BLOCK_LABEL_352;
        }
        SE.dh(i1);
        SU = false;
        zM.unlock();
        return;
    }

    static void d(com.google.android.gms.common.api.c c1)
    {
        c1._mthif();
    }

    static Context e(com.google.android.gms.common.api.c c1)
    {
        return c1.mContext;
    }

    static long f(com.google.android.gms.common.api.c c1)
    {
        return c1.SN;
    }

    static long g(com.google.android.gms.common.api.c c1)
    {
        return c1.SO;
    }

    static boolean h(com.google.android.gms.common.api.c c1)
    {
        return c1.SU;
    }

    static void i(com.google.android.gms.common.api.c c1)
    {
        c1.ii();
    }

    private void _mthif()
    {
label0:
        {
            SM = SM - 1;
            if (SM == 0)
            {
                if (SH == null)
                {
                    break label0;
                }
                SL = false;
                cN(3);
                if (!ih() || !GooglePlayServicesUtil.isPlayServicesPossiblyUpdating(mContext, SH.getErrorCode()))
                {
                    ii();
                    SE.b(SH);
                }
                SU = false;
            }
            return;
        }
        SJ = 2;
        ii();
        SD.signalAll();
        ig();
        if (SL)
        {
            SL = false;
            cN(-1);
            return;
        }
        Bundle bundle;
        if (SR.isEmpty())
        {
            bundle = null;
        } else
        {
            bundle = SR;
        }
        SE.h(bundle);
    }

    private void ig()
    {
        zM.lock();
        Object obj;
        boolean flag;
        if (!isConnected() && !ih())
        {
            flag = false;
        } else
        {
            flag = true;
        }
        kn.a(flag, "GoogleApiClient is not connected yet.");
_L1:
        flag = SG.isEmpty();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        a((d)SG.remove());
          goto _L1
        obj;
        Log.w("GoogleApiClientImpl", "Service died while flushing queue", ((Throwable) (obj)));
          goto _L1
        obj;
        zM.unlock();
        throw obj;
        zM.unlock();
        return;
    }

    private void ii()
    {
        zM.lock();
        boolean flag = SK;
        if (!flag)
        {
            zM.unlock();
            return;
        }
        SK = false;
        SP.removeMessages(2);
        SP.removeMessages(1);
        mContext.unregisterReceiver(SQ);
        zM.unlock();
        return;
        Exception exception;
        exception;
        zM.unlock();
        throw exception;
    }

    static void j(com.google.android.gms.common.api.c c1)
    {
        c1.resume();
    }

    static ConnectionResult k(com.google.android.gms.common.api.c c1)
    {
        return c1.SH;
    }

    static int l(com.google.android.gms.common.api.c c1)
    {
        return c1.SI;
    }

    private void resume()
    {
        zM.lock();
        if (ih())
        {
            connect();
        }
        zM.unlock();
        return;
        Exception exception;
        exception;
        zM.unlock();
        throw exception;
    }

    public final Api.a a(Api.c c1)
    {
        c1 = (Api.a)SS.get(c1);
        kn.b(c1, "Appropriate Api was not requested.");
        return c1;
    }

    public final BaseImplementation.a a(BaseImplementation.a a1)
    {
        zM.lock();
        if (!isConnected()) goto _L2; else goto _L1
_L1:
        b(a1);
_L4:
        zM.unlock();
        return a1;
_L2:
        SG.add(a1);
        if (true) goto _L4; else goto _L3
_L3:
        a1;
        zM.unlock();
        throw a1;
    }

    public final BaseImplementation.a b(BaseImplementation.a a1)
    {
        boolean flag;
        if (isConnected() || ih())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        kn.a(flag, "GoogleApiClient is not connected yet.");
        ig();
        try
        {
            a(a1);
        }
        catch (DeadObjectException deadobjectexception)
        {
            cN(1);
            return a1;
        }
        return a1;
    }

    public final void connect()
    {
        zM.lock();
        boolean flag;
        SL = false;
        if (isConnected())
        {
            break MISSING_BLOCK_LABEL_30;
        }
        flag = isConnecting();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        zM.unlock();
        return;
        SU = true;
        SH = null;
        SJ = 1;
        SR.clear();
        SM = SS.size();
        for (Iterator iterator = SS.values().iterator(); iterator.hasNext(); ((Api.a)iterator.next()).connect()) { }
        break MISSING_BLOCK_LABEL_128;
        Exception exception;
        exception;
        zM.unlock();
        throw exception;
        zM.unlock();
        return;
    }

    public final void disconnect()
    {
        ii();
        cN(-1);
    }

    public final Looper getLooper()
    {
        return JL;
    }

    final boolean ih()
    {
        return SK;
    }

    public final boolean isConnected()
    {
        return SJ == 2;
    }

    public final boolean isConnecting()
    {
        return SJ == 1;
    }

    public final void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        SE.registerConnectionCallbacks(connectioncallbacks);
    }

    public final void registerConnectionFailedListener$40dd7b8f(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        SE.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public final void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        SE.unregisterConnectionCallbacks(connectioncallbacks);
    }

    public final void unregisterConnectionFailedListener$40dd7b8f(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        SE.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }
}
