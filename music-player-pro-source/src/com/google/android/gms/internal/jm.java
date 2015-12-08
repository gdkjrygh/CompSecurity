// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//            jx

public final class jm
{
    final class a extends Handler
    {

        final jm Nc;

        public void handleMessage(Message message)
        {
            if (message.what == 1)
            {
                synchronized (jm.a(Nc))
                {
                    if (jm.b(Nc).gN() && jm.b(Nc).isConnected() && jm.a(Nc).contains(message.obj))
                    {
                        Bundle bundle = jm.b(Nc).fX();
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
            Nc = jm.this;
            super(looper);
        }
    }

    public static interface b
    {

        public abstract Bundle fX();

        public abstract boolean gN();

        public abstract boolean isConnected();
    }


    private final b MX;
    private final ArrayList MY = new ArrayList();
    final ArrayList MZ = new ArrayList();
    private boolean Na;
    private final ArrayList Nb = new ArrayList();
    private final Handler mHandler;

    public jm(Context context, Looper looper, b b1)
    {
        Na = false;
        MX = b1;
        mHandler = new a(looper);
    }

    static ArrayList a(jm jm1)
    {
        return jm1.MY;
    }

    static b b(jm jm1)
    {
        return jm1.MX;
    }

    public void aE(int i)
    {
        mHandler.removeMessages(1);
        ArrayList arraylist = MY;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator;
        Na = true;
        iterator = (new ArrayList(MY)).iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)iterator.next();
        if (MX.gN()) goto _L3; else goto _L2
_L2:
        Na = false;
        return;
_L3:
        if (MY.contains(connectioncallbacks))
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
        ArrayList arraylist = Nb;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator = (new ArrayList(Nb)).iterator();
_L2:
        com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_93;
        }
        onconnectionfailedlistener = (com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener)iterator.next();
        if (!MX.gN())
        {
            return;
        }
        if (Nb.contains(onconnectionfailedlistener))
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

    protected void dU()
    {
        synchronized (MY)
        {
            f(MX.fX());
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void f(Bundle bundle)
    {
        boolean flag1 = true;
        ArrayList arraylist = MY;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator;
        com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks;
        boolean flag;
        if (!Na)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.K(flag);
        mHandler.removeMessages(1);
        Na = true;
        if (MZ.size() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        jx.K(flag);
        iterator = (new ArrayList(MY)).iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)iterator.next();
        if (MX.gN() && MX.isConnected()) goto _L3; else goto _L2
_L2:
        MZ.clear();
        Na = false;
        arraylist;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (!MZ.contains(connectioncallbacks))
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

    public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        jx.i(connectioncallbacks);
        boolean flag;
        synchronized (MY)
        {
            flag = MY.contains(connectioncallbacks);
        }
        return flag;
        connectioncallbacks;
        arraylist;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        jx.i(onconnectionfailedlistener);
        boolean flag;
        synchronized (Nb)
        {
            flag = Nb.contains(onconnectionfailedlistener);
        }
        return flag;
        onconnectionfailedlistener;
        arraylist;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        jx.i(connectioncallbacks);
        ArrayList arraylist = MY;
        arraylist;
        JVM INSTR monitorenter ;
        if (!MY.contains(connectioncallbacks))
        {
            break MISSING_BLOCK_LABEL_85;
        }
        Log.w("GmsClientEvents", (new StringBuilder()).append("registerConnectionCallbacks(): listener ").append(connectioncallbacks).append(" is already registered").toString());
_L2:
        if (MX.isConnected())
        {
            mHandler.sendMessage(mHandler.obtainMessage(1, connectioncallbacks));
        }
        return;
        MY.add(connectioncallbacks);
        if (true) goto _L2; else goto _L1
_L1:
        connectioncallbacks;
        arraylist;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        jx.i(onconnectionfailedlistener);
        ArrayList arraylist = Nb;
        arraylist;
        JVM INSTR monitorenter ;
        if (!Nb.contains(onconnectionfailedlistener))
        {
            break MISSING_BLOCK_LABEL_56;
        }
        Log.w("GmsClientEvents", (new StringBuilder()).append("registerConnectionFailedListener(): listener ").append(onconnectionfailedlistener).append(" is already registered").toString());
_L2:
        return;
        Nb.add(onconnectionfailedlistener);
        if (true) goto _L2; else goto _L1
_L1:
        onconnectionfailedlistener;
        arraylist;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }

    public void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        jx.i(connectioncallbacks);
        ArrayList arraylist = MY;
        arraylist;
        JVM INSTR monitorenter ;
        if (MY == null) goto _L2; else goto _L1
_L1:
        if (MY.remove(connectioncallbacks)) goto _L4; else goto _L3
_L3:
        Log.w("GmsClientEvents", (new StringBuilder()).append("unregisterConnectionCallbacks(): listener ").append(connectioncallbacks).append(" not found").toString());
_L2:
        return;
_L4:
        if (Na)
        {
            MZ.add(connectioncallbacks);
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
        jx.i(onconnectionfailedlistener);
        synchronized (Nb)
        {
            if (Nb != null && !Nb.remove(onconnectionfailedlistener))
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
