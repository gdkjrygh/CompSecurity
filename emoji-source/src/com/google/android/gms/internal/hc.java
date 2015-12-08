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
//            hm

public final class hc
{
    final class a extends Handler
    {

        final hc Gu;

        public void handleMessage(Message message)
        {
            if (message.what == 1)
            {
                synchronized (hc.a(Gu))
                {
                    if (hc.b(Gu).eO() && hc.b(Gu).isConnected() && hc.a(Gu).contains(message.obj))
                    {
                        Bundle bundle = hc.b(Gu).ef();
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
            Gu = hc.this;
            super(looper);
        }
    }

    public static interface b
    {

        public abstract boolean eO();

        public abstract Bundle ef();

        public abstract boolean isConnected();
    }


    private final b Gp;
    private final ArrayList Gq = new ArrayList();
    final ArrayList Gr = new ArrayList();
    private boolean Gs;
    private final ArrayList Gt = new ArrayList();
    private final Handler mHandler;

    public hc(Context context, Looper looper, b b1)
    {
        Gs = false;
        Gp = b1;
        mHandler = new a(looper);
    }

    static ArrayList a(hc hc1)
    {
        return hc1.Gq;
    }

    static b b(hc hc1)
    {
        return hc1.Gp;
    }

    public void a(ConnectionResult connectionresult)
    {
        mHandler.removeMessages(1);
        ArrayList arraylist = Gt;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator = (new ArrayList(Gt)).iterator();
_L2:
        com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_93;
        }
        onconnectionfailedlistener = (com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener)iterator.next();
        if (!Gp.eO())
        {
            return;
        }
        if (Gt.contains(onconnectionfailedlistener))
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

    public void ao(int i)
    {
        mHandler.removeMessages(1);
        ArrayList arraylist = Gq;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator;
        Gs = true;
        iterator = (new ArrayList(Gq)).iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)iterator.next();
        if (Gp.eO()) goto _L3; else goto _L2
_L2:
        Gs = false;
        return;
_L3:
        if (Gq.contains(connectioncallbacks))
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

    public void c(Bundle bundle)
    {
        boolean flag1 = true;
        ArrayList arraylist = Gq;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator;
        com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks;
        boolean flag;
        if (!Gs)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hm.A(flag);
        mHandler.removeMessages(1);
        Gs = true;
        if (Gr.size() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        hm.A(flag);
        iterator = (new ArrayList(Gq)).iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)iterator.next();
        if (Gp.eO() && Gp.isConnected()) goto _L3; else goto _L2
_L2:
        Gr.clear();
        Gs = false;
        arraylist;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (!Gr.contains(connectioncallbacks))
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

    protected void cp()
    {
        synchronized (Gq)
        {
            c(Gp.ef());
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        hm.f(connectioncallbacks);
        boolean flag;
        synchronized (Gq)
        {
            flag = Gq.contains(connectioncallbacks);
        }
        return flag;
        connectioncallbacks;
        arraylist;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        hm.f(onconnectionfailedlistener);
        boolean flag;
        synchronized (Gt)
        {
            flag = Gt.contains(onconnectionfailedlistener);
        }
        return flag;
        onconnectionfailedlistener;
        arraylist;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        hm.f(connectioncallbacks);
        ArrayList arraylist = Gq;
        arraylist;
        JVM INSTR monitorenter ;
        if (!Gq.contains(connectioncallbacks))
        {
            break MISSING_BLOCK_LABEL_85;
        }
        Log.w("GmsClientEvents", (new StringBuilder()).append("registerConnectionCallbacks(): listener ").append(connectioncallbacks).append(" is already registered").toString());
_L2:
        if (Gp.isConnected())
        {
            mHandler.sendMessage(mHandler.obtainMessage(1, connectioncallbacks));
        }
        return;
        Gq.add(connectioncallbacks);
        if (true) goto _L2; else goto _L1
_L1:
        connectioncallbacks;
        arraylist;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        hm.f(onconnectionfailedlistener);
        ArrayList arraylist = Gt;
        arraylist;
        JVM INSTR monitorenter ;
        if (!Gt.contains(onconnectionfailedlistener))
        {
            break MISSING_BLOCK_LABEL_56;
        }
        Log.w("GmsClientEvents", (new StringBuilder()).append("registerConnectionFailedListener(): listener ").append(onconnectionfailedlistener).append(" is already registered").toString());
_L2:
        return;
        Gt.add(onconnectionfailedlistener);
        if (true) goto _L2; else goto _L1
_L1:
        onconnectionfailedlistener;
        arraylist;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }

    public void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        hm.f(connectioncallbacks);
        ArrayList arraylist = Gq;
        arraylist;
        JVM INSTR monitorenter ;
        if (Gq == null) goto _L2; else goto _L1
_L1:
        if (Gq.remove(connectioncallbacks)) goto _L4; else goto _L3
_L3:
        Log.w("GmsClientEvents", (new StringBuilder()).append("unregisterConnectionCallbacks(): listener ").append(connectioncallbacks).append(" not found").toString());
_L2:
        return;
_L4:
        if (Gs)
        {
            Gr.add(connectioncallbacks);
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
        hm.f(onconnectionfailedlistener);
        synchronized (Gt)
        {
            if (Gt != null && !Gt.remove(onconnectionfailedlistener))
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
