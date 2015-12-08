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
//            fq

public final class fg
{
    final class a extends Handler
    {

        final fg Dt;

        public void handleMessage(Message message)
        {
            if (message.what == 1)
            {
                synchronized (fg.a(Dt))
                {
                    if (fg.b(Dt).em() && fg.b(Dt).isConnected() && fg.a(Dt).contains(message.obj))
                    {
                        Bundle bundle = fg.b(Dt).dG();
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
            Dt = fg.this;
            super(looper);
        }
    }

    public static interface b
    {

        public abstract Bundle dG();

        public abstract boolean em();

        public abstract boolean isConnected();
    }


    private final b Do;
    private final ArrayList Dp = new ArrayList();
    final ArrayList Dq = new ArrayList();
    private boolean Dr;
    private final ArrayList Ds = new ArrayList();
    private final Handler mHandler;

    public fg(Context context, Looper looper, b b1)
    {
        Dr = false;
        Do = b1;
        mHandler = new a(looper);
    }

    static ArrayList a(fg fg1)
    {
        return fg1.Dp;
    }

    static b b(fg fg1)
    {
        return fg1.Do;
    }

    public void O(int i)
    {
        mHandler.removeMessages(1);
        ArrayList arraylist = Dp;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator;
        Dr = true;
        iterator = (new ArrayList(Dp)).iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)iterator.next();
        if (Do.em()) goto _L3; else goto _L2
_L2:
        Dr = false;
        return;
_L3:
        if (Dp.contains(connectioncallbacks))
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

    public void a(ConnectionResult connectionresult)
    {
        mHandler.removeMessages(1);
        ArrayList arraylist = Ds;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator = (new ArrayList(Ds)).iterator();
_L2:
        com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_93;
        }
        onconnectionfailedlistener = (com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener)iterator.next();
        if (!Do.em())
        {
            return;
        }
        if (Ds.contains(onconnectionfailedlistener))
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

    public void b(Bundle bundle)
    {
        boolean flag1 = true;
        ArrayList arraylist = Dp;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator;
        com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks;
        boolean flag;
        if (!Dr)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fq.x(flag);
        mHandler.removeMessages(1);
        Dr = true;
        if (Dq.size() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        fq.x(flag);
        iterator = (new ArrayList(Dp)).iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)iterator.next();
        if (Do.em() && Do.isConnected()) goto _L3; else goto _L2
_L2:
        Dq.clear();
        Dr = false;
        arraylist;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (!Dq.contains(connectioncallbacks))
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

    protected void bV()
    {
        synchronized (Dp)
        {
            b(Do.dG());
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        fq.f(connectioncallbacks);
        boolean flag;
        synchronized (Dp)
        {
            flag = Dp.contains(connectioncallbacks);
        }
        return flag;
        connectioncallbacks;
        arraylist;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        fq.f(onconnectionfailedlistener);
        boolean flag;
        synchronized (Ds)
        {
            flag = Ds.contains(onconnectionfailedlistener);
        }
        return flag;
        onconnectionfailedlistener;
        arraylist;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        fq.f(connectioncallbacks);
        ArrayList arraylist = Dp;
        arraylist;
        JVM INSTR monitorenter ;
        if (!Dp.contains(connectioncallbacks))
        {
            break MISSING_BLOCK_LABEL_85;
        }
        Log.w("GmsClientEvents", (new StringBuilder()).append("registerConnectionCallbacks(): listener ").append(connectioncallbacks).append(" is already registered").toString());
_L2:
        if (Do.isConnected())
        {
            mHandler.sendMessage(mHandler.obtainMessage(1, connectioncallbacks));
        }
        return;
        Dp.add(connectioncallbacks);
        if (true) goto _L2; else goto _L1
_L1:
        connectioncallbacks;
        arraylist;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        fq.f(onconnectionfailedlistener);
        ArrayList arraylist = Ds;
        arraylist;
        JVM INSTR monitorenter ;
        if (!Ds.contains(onconnectionfailedlistener))
        {
            break MISSING_BLOCK_LABEL_56;
        }
        Log.w("GmsClientEvents", (new StringBuilder()).append("registerConnectionFailedListener(): listener ").append(onconnectionfailedlistener).append(" is already registered").toString());
_L2:
        return;
        Ds.add(onconnectionfailedlistener);
        if (true) goto _L2; else goto _L1
_L1:
        onconnectionfailedlistener;
        arraylist;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }

    public void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        fq.f(connectioncallbacks);
        ArrayList arraylist = Dp;
        arraylist;
        JVM INSTR monitorenter ;
        if (Dp == null) goto _L2; else goto _L1
_L1:
        if (Dp.remove(connectioncallbacks)) goto _L4; else goto _L3
_L3:
        Log.w("GmsClientEvents", (new StringBuilder()).append("unregisterConnectionCallbacks(): listener ").append(connectioncallbacks).append(" not found").toString());
_L2:
        return;
_L4:
        if (Dr)
        {
            Dq.add(connectioncallbacks);
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
        fq.f(onconnectionfailedlistener);
        synchronized (Ds)
        {
            if (Ds != null && !Ds.remove(onconnectionfailedlistener))
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
