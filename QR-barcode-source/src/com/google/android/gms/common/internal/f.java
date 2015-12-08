// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.internal:
//            o

public final class f
{
    final class a extends Handler
    {

        final f LR;

        public void handleMessage(Message message)
        {
            if (message.what == 1)
            {
                synchronized (f.a(LR))
                {
                    if (f.b(LR).gq() && f.b(LR).isConnected() && f.a(LR).contains(message.obj))
                    {
                        Bundle bundle = f.b(LR).fC();
                        ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)message.obj).onConnected(bundle);
                    }
                }
                return;
            } else
            {
                Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
                return;
            }
            message;
            arraylist;
            JVM INSTR monitorexit ;
            throw message;
        }

        public a(Looper looper)
        {
            LR = f.this;
            super(looper);
        }
    }

    public static interface b
    {

        public abstract Bundle fC();

        public abstract boolean gq();

        public abstract boolean isConnected();
    }


    private final b LM;
    private final ArrayList LN = new ArrayList();
    final ArrayList LO = new ArrayList();
    private boolean LP;
    private final ArrayList LQ = new ArrayList();
    private final Handler mHandler;

    public f(Context context, Looper looper, b b1)
    {
        LP = false;
        LM = b1;
        mHandler = new a(looper);
    }

    static ArrayList a(f f1)
    {
        return f1.LN;
    }

    static b b(f f1)
    {
        return f1.LM;
    }

    public void aB(int i)
    {
        mHandler.removeMessages(1);
        ArrayList arraylist = LN;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator;
        LP = true;
        iterator = (new ArrayList(LN)).iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)iterator.next();
        if (LM.gq()) goto _L3; else goto _L2
_L2:
        LP = false;
        return;
_L3:
        if (LN.contains(connectioncallbacks))
        {
            connectioncallbacks.onConnectionSuspended(i);
        }
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b(ConnectionResult connectionresult)
    {
        mHandler.removeMessages(1);
        ArrayList arraylist = LQ;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator = (new ArrayList(LQ)).iterator();
_L2:
        com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_93;
        }
        onconnectionfailedlistener = (com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener)iterator.next();
        if (!LM.gq())
        {
            return;
        }
        if (LQ.contains(onconnectionfailedlistener))
        {
            onconnectionfailedlistener.onConnectionFailed(connectionresult);
        }
        if (true) goto _L2; else goto _L1
_L1:
        connectionresult;
        arraylist;
        JVM INSTR monitorexit ;
        throw connectionresult;
        arraylist;
        JVM INSTR monitorexit ;
    }

    public void d(Bundle bundle)
    {
        boolean flag1 = true;
        ArrayList arraylist = LN;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator;
        com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks;
        boolean flag;
        if (!LP)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.I(flag);
        mHandler.removeMessages(1);
        LP = true;
        if (LO.size() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        o.I(flag);
        iterator = (new ArrayList(LN)).iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)iterator.next();
        if (LM.gq() && LM.isConnected()) goto _L3; else goto _L2
_L2:
        LO.clear();
        LP = false;
        arraylist;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (!LO.contains(connectioncallbacks))
        {
            connectioncallbacks.onConnected(bundle);
        }
        if (true) goto _L5; else goto _L4
_L4:
        bundle;
        arraylist;
        JVM INSTR monitorexit ;
        throw bundle;
    }

    protected void dL()
    {
        synchronized (LN)
        {
            d(LM.fC());
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        o.i(connectioncallbacks);
        boolean flag;
        synchronized (LN)
        {
            flag = LN.contains(connectioncallbacks);
        }
        return flag;
        connectioncallbacks;
        arraylist;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        o.i(onconnectionfailedlistener);
        boolean flag;
        synchronized (LQ)
        {
            flag = LQ.contains(onconnectionfailedlistener);
        }
        return flag;
        onconnectionfailedlistener;
        arraylist;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        o.i(connectioncallbacks);
        ArrayList arraylist = LN;
        arraylist;
        JVM INSTR monitorenter ;
        if (!LN.contains(connectioncallbacks))
        {
            break MISSING_BLOCK_LABEL_85;
        }
        Log.w("GmsClientEvents", (new StringBuilder()).append("registerConnectionCallbacks(): listener ").append(connectioncallbacks).append(" is already registered").toString());
_L2:
        if (LM.isConnected())
        {
            mHandler.sendMessage(mHandler.obtainMessage(1, connectioncallbacks));
        }
        return;
        LN.add(connectioncallbacks);
        if (true) goto _L2; else goto _L1
_L1:
        connectioncallbacks;
        arraylist;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        o.i(onconnectionfailedlistener);
        ArrayList arraylist = LQ;
        arraylist;
        JVM INSTR monitorenter ;
        if (!LQ.contains(onconnectionfailedlistener))
        {
            break MISSING_BLOCK_LABEL_56;
        }
        Log.w("GmsClientEvents", (new StringBuilder()).append("registerConnectionFailedListener(): listener ").append(onconnectionfailedlistener).append(" is already registered").toString());
_L2:
        return;
        LQ.add(onconnectionfailedlistener);
        if (true) goto _L2; else goto _L1
_L1:
        onconnectionfailedlistener;
        arraylist;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }

    public void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        o.i(connectioncallbacks);
        ArrayList arraylist = LN;
        arraylist;
        JVM INSTR monitorenter ;
        if (LN == null) goto _L2; else goto _L1
_L1:
        if (LN.remove(connectioncallbacks)) goto _L4; else goto _L3
_L3:
        Log.w("GmsClientEvents", (new StringBuilder()).append("unregisterConnectionCallbacks(): listener ").append(connectioncallbacks).append(" not found").toString());
_L2:
        return;
_L4:
        if (LP)
        {
            LO.add(connectioncallbacks);
        }
        if (true) goto _L2; else goto _L5
_L5:
        connectioncallbacks;
        arraylist;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public void unregisterConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        o.i(onconnectionfailedlistener);
        synchronized (LQ)
        {
            if (LQ != null && !LQ.remove(onconnectionfailedlistener))
            {
                Log.w("GmsClientEvents", (new StringBuilder()).append("unregisterConnectionFailedListener(): listener ").append(onconnectionfailedlistener).append(" not found").toString());
            }
        }
        return;
        onconnectionfailedlistener;
        arraylist;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }
}
