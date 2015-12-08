// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzv

public final class zzj
    implements android.os.Handler.Callback
{
    public static interface zza
    {

        public abstract boolean isConnected();

        public abstract Bundle zzjZ();
    }


    private final Handler mHandler;
    private final zza zzTD;
    private final ArrayList zzTE = new ArrayList();
    final ArrayList zzTF = new ArrayList();
    private final ArrayList zzTG = new ArrayList();
    private volatile boolean zzTH;
    private final AtomicInteger zzTI = new AtomicInteger(0);
    private boolean zzTJ;
    private final Object zzoe = new Object();

    public zzj(Looper looper, zza zza1)
    {
        zzTH = false;
        zzTJ = false;
        zzTD = zza1;
        mHandler = new Handler(looper, this);
    }

    public boolean handleMessage(Message message)
    {
        if (message.what == 1)
        {
            com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)message.obj;
            synchronized (zzoe)
            {
                if (zzTH && zzTD.isConnected() && zzTE.contains(connectioncallbacks))
                {
                    connectioncallbacks.onConnected(zzTD.zzjZ());
                }
            }
            return true;
        } else
        {
            Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
            return false;
        }
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        zzv.zzr(connectioncallbacks);
        boolean flag;
        synchronized (zzoe)
        {
            flag = zzTE.contains(connectioncallbacks);
        }
        return flag;
        connectioncallbacks;
        obj;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzv.zzr(onconnectionfailedlistener);
        boolean flag;
        synchronized (zzoe)
        {
            flag = zzTG.contains(onconnectionfailedlistener);
        }
        return flag;
        onconnectionfailedlistener;
        obj;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        zzv.zzr(connectioncallbacks);
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (!zzTE.contains(connectioncallbacks))
        {
            break MISSING_BLOCK_LABEL_85;
        }
        Log.w("GmsClientEvents", (new StringBuilder()).append("registerConnectionCallbacks(): listener ").append(connectioncallbacks).append(" is already registered").toString());
_L2:
        if (zzTD.isConnected())
        {
            mHandler.sendMessage(mHandler.obtainMessage(1, connectioncallbacks));
        }
        return;
        zzTE.add(connectioncallbacks);
        if (true) goto _L2; else goto _L1
_L1:
        connectioncallbacks;
        obj;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzv.zzr(onconnectionfailedlistener);
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (!zzTG.contains(onconnectionfailedlistener))
        {
            break MISSING_BLOCK_LABEL_56;
        }
        Log.w("GmsClientEvents", (new StringBuilder()).append("registerConnectionFailedListener(): listener ").append(onconnectionfailedlistener).append(" is already registered").toString());
_L2:
        return;
        zzTG.add(onconnectionfailedlistener);
        if (true) goto _L2; else goto _L1
_L1:
        onconnectionfailedlistener;
        obj;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }

    public void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        zzv.zzr(connectioncallbacks);
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (zzTE.remove(connectioncallbacks)) goto _L2; else goto _L1
_L1:
        Log.w("GmsClientEvents", (new StringBuilder()).append("unregisterConnectionCallbacks(): listener ").append(connectioncallbacks).append(" not found").toString());
_L4:
        return;
_L2:
        if (zzTJ)
        {
            zzTF.add(connectioncallbacks);
        }
        if (true) goto _L4; else goto _L3
_L3:
        connectioncallbacks;
        obj;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public void unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzv.zzr(onconnectionfailedlistener);
        synchronized (zzoe)
        {
            if (!zzTG.remove(onconnectionfailedlistener))
            {
                Log.w("GmsClientEvents", (new StringBuilder()).append("unregisterConnectionFailedListener(): listener ").append(onconnectionfailedlistener).append(" not found").toString());
            }
        }
        return;
        onconnectionfailedlistener;
        obj;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }

    public void zzaP(int i)
    {
        mHandler.removeMessages(1);
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        int j;
        zzTJ = true;
        obj1 = new ArrayList(zzTE);
        j = zzTI.get();
        obj1 = ((ArrayList) (obj1)).iterator();
_L5:
        if (!((Iterator) (obj1)).hasNext()) goto _L2; else goto _L1
_L1:
        com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)((Iterator) (obj1)).next();
        if (zzTH && zzTI.get() == j) goto _L3; else goto _L2
_L2:
        zzTF.clear();
        zzTJ = false;
        return;
_L3:
        if (zzTE.contains(connectioncallbacks))
        {
            connectioncallbacks.onConnectionSuspended(i);
        }
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzg(Bundle bundle)
    {
        boolean flag1 = true;
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks;
        int i;
        boolean flag;
        if (!zzTJ)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzv.zzP(flag);
        mHandler.removeMessages(1);
        zzTJ = true;
        if (zzTF.size() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzv.zzP(flag);
        obj1 = new ArrayList(zzTE);
        i = zzTI.get();
        obj1 = ((ArrayList) (obj1)).iterator();
_L5:
        if (!((Iterator) (obj1)).hasNext()) goto _L2; else goto _L1
_L1:
        connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)((Iterator) (obj1)).next();
        if (zzTH && zzTD.isConnected() && zzTI.get() == i) goto _L3; else goto _L2
_L2:
        zzTF.clear();
        zzTJ = false;
        obj;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (!zzTF.contains(connectioncallbacks))
        {
            connectioncallbacks.onConnected(bundle);
        }
        if (true) goto _L5; else goto _L4
_L4:
        bundle;
        obj;
        JVM INSTR monitorexit ;
        throw bundle;
    }

    public void zzj(ConnectionResult connectionresult)
    {
        mHandler.removeMessages(1);
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        int i;
        obj1 = new ArrayList(zzTG);
        i = zzTI.get();
        obj1 = ((ArrayList) (obj1)).iterator();
_L2:
        com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener;
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_111;
        }
        onconnectionfailedlistener = (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)((Iterator) (obj1)).next();
        if (!zzTH || zzTI.get() != i)
        {
            return;
        }
        if (zzTG.contains(onconnectionfailedlistener))
        {
            onconnectionfailedlistener.onConnectionFailed(connectionresult);
        }
        if (true) goto _L2; else goto _L1
_L1:
        connectionresult;
        obj;
        JVM INSTR monitorexit ;
        throw connectionresult;
        obj;
        JVM INSTR monitorexit ;
    }

    public void zzmf()
    {
        zzTH = false;
        zzTI.incrementAndGet();
    }

    public void zzmg()
    {
        zzTH = true;
    }

    protected void zzmh()
    {
        synchronized (zzoe)
        {
            zzg(zzTD.zzjZ());
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
