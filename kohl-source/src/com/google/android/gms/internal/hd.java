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
//            hn

public final class hd
{
    final class a extends Handler
    {

        final hd Gr;

        public void handleMessage(Message message)
        {
            if (message.what == 1)
            {
                synchronized (hd.a(Gr))
                {
                    if (hd.b(Gr).eJ() && hd.b(Gr).isConnected() && hd.a(Gr).contains(message.obj))
                    {
                        Bundle bundle = hd.b(Gr).ea();
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
            Gr = hd.this;
            super(looper);
        }
    }

    public static interface b
    {

        public abstract boolean eJ();

        public abstract Bundle ea();

        public abstract boolean isConnected();
    }


    private final b Gm;
    private final ArrayList Gn = new ArrayList();
    final ArrayList Go = new ArrayList();
    private boolean Gp;
    private final ArrayList Gq = new ArrayList();
    private final Handler mHandler;

    public hd(Context context, Looper looper, b b1)
    {
        Gp = false;
        Gm = b1;
        mHandler = new a(looper);
    }

    static ArrayList a(hd hd1)
    {
        return hd1.Gn;
    }

    static b b(hd hd1)
    {
        return hd1.Gm;
    }

    public void a(ConnectionResult connectionresult)
    {
        mHandler.removeMessages(1);
        ArrayList arraylist = Gq;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator = (new ArrayList(Gq)).iterator();
_L2:
        com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_93;
        }
        onconnectionfailedlistener = (com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener)iterator.next();
        if (!Gm.eJ())
        {
            return;
        }
        if (Gq.contains(onconnectionfailedlistener))
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
        ArrayList arraylist = Gn;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator;
        Gp = true;
        iterator = (new ArrayList(Gn)).iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)iterator.next();
        if (Gm.eJ()) goto _L3; else goto _L2
_L2:
        Gp = false;
        return;
_L3:
        if (Gn.contains(connectioncallbacks))
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
        ArrayList arraylist = Gn;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator;
        com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks;
        boolean flag;
        if (!Gp)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hn.A(flag);
        mHandler.removeMessages(1);
        Gp = true;
        if (Go.size() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        hn.A(flag);
        iterator = (new ArrayList(Gn)).iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)iterator.next();
        if (Gm.eJ() && Gm.isConnected()) goto _L3; else goto _L2
_L2:
        Go.clear();
        Gp = false;
        arraylist;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (!Go.contains(connectioncallbacks))
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

    protected void ck()
    {
        synchronized (Gn)
        {
            c(Gm.ea());
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        hn.f(connectioncallbacks);
        boolean flag;
        synchronized (Gn)
        {
            flag = Gn.contains(connectioncallbacks);
        }
        return flag;
        connectioncallbacks;
        arraylist;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        hn.f(onconnectionfailedlistener);
        boolean flag;
        synchronized (Gq)
        {
            flag = Gq.contains(onconnectionfailedlistener);
        }
        return flag;
        onconnectionfailedlistener;
        arraylist;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        hn.f(connectioncallbacks);
        ArrayList arraylist = Gn;
        arraylist;
        JVM INSTR monitorenter ;
        if (!Gn.contains(connectioncallbacks))
        {
            break MISSING_BLOCK_LABEL_85;
        }
        Log.w("GmsClientEvents", (new StringBuilder()).append("registerConnectionCallbacks(): listener ").append(connectioncallbacks).append(" is already registered").toString());
_L2:
        if (Gm.isConnected())
        {
            mHandler.sendMessage(mHandler.obtainMessage(1, connectioncallbacks));
        }
        return;
        Gn.add(connectioncallbacks);
        if (true) goto _L2; else goto _L1
_L1:
        connectioncallbacks;
        arraylist;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        hn.f(onconnectionfailedlistener);
        ArrayList arraylist = Gq;
        arraylist;
        JVM INSTR monitorenter ;
        if (!Gq.contains(onconnectionfailedlistener))
        {
            break MISSING_BLOCK_LABEL_56;
        }
        Log.w("GmsClientEvents", (new StringBuilder()).append("registerConnectionFailedListener(): listener ").append(onconnectionfailedlistener).append(" is already registered").toString());
_L2:
        return;
        Gq.add(onconnectionfailedlistener);
        if (true) goto _L2; else goto _L1
_L1:
        onconnectionfailedlistener;
        arraylist;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }

    public void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        hn.f(connectioncallbacks);
        ArrayList arraylist = Gn;
        arraylist;
        JVM INSTR monitorenter ;
        if (Gn == null) goto _L2; else goto _L1
_L1:
        if (Gn.remove(connectioncallbacks)) goto _L4; else goto _L3
_L3:
        Log.w("GmsClientEvents", (new StringBuilder()).append("unregisterConnectionCallbacks(): listener ").append(connectioncallbacks).append(" not found").toString());
_L2:
        return;
_L4:
        if (Gp)
        {
            Go.add(connectioncallbacks);
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
        hn.f(onconnectionfailedlistener);
        synchronized (Gq)
        {
            if (Gq != null && !Gq.remove(onconnectionfailedlistener))
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
