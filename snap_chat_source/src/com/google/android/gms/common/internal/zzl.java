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

// Referenced classes of package com.google.android.gms.common.internal:
//            zzx

public final class zzl
    implements android.os.Handler.Callback
{
    public static interface zza
    {

        public abstract boolean isConnected();

        public abstract Bundle zzhp();

        public abstract boolean zzin();
    }


    private final Handler mHandler;
    private final zza zzPX;
    private final ArrayList zzPY = new ArrayList();
    final ArrayList zzPZ = new ArrayList();
    private boolean zzQa;
    private final ArrayList zzQb = new ArrayList();

    public zzl(Looper looper, zza zza1)
    {
        zzQa = false;
        zzPX = zza1;
        mHandler = new Handler(looper, this);
    }

    public final boolean handleMessage(Message message)
    {
        if (message.what == 1)
        {
            com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)message.obj;
            synchronized (zzPY)
            {
                if (zzPX.zzin() && zzPX.isConnected() && zzPY.contains(connectioncallbacks))
                {
                    connectioncallbacks.onConnected(zzPX.zzhp());
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

    public final void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        zzx.zzl(connectioncallbacks);
        ArrayList arraylist = zzPY;
        arraylist;
        JVM INSTR monitorenter ;
        if (!zzPY.contains(connectioncallbacks))
        {
            break MISSING_BLOCK_LABEL_74;
        }
        (new StringBuilder("registerConnectionCallbacks(): listener ")).append(connectioncallbacks).append(" is already registered");
_L2:
        if (zzPX.isConnected())
        {
            mHandler.sendMessage(mHandler.obtainMessage(1, connectioncallbacks));
        }
        return;
        zzPY.add(connectioncallbacks);
        if (true) goto _L2; else goto _L1
_L1:
        connectioncallbacks;
        arraylist;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public final void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzx.zzl(onconnectionfailedlistener);
        ArrayList arraylist = zzQb;
        arraylist;
        JVM INSTR monitorenter ;
        if (!zzQb.contains(onconnectionfailedlistener))
        {
            break MISSING_BLOCK_LABEL_45;
        }
        (new StringBuilder("registerConnectionFailedListener(): listener ")).append(onconnectionfailedlistener).append(" is already registered");
_L2:
        return;
        zzQb.add(onconnectionfailedlistener);
        if (true) goto _L2; else goto _L1
_L1:
        onconnectionfailedlistener;
        arraylist;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }

    public final void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        zzx.zzl(connectioncallbacks);
        ArrayList arraylist = zzPY;
        arraylist;
        JVM INSTR monitorenter ;
        if (zzPY.remove(connectioncallbacks)) goto _L2; else goto _L1
_L1:
        (new StringBuilder("unregisterConnectionCallbacks(): listener ")).append(connectioncallbacks).append(" not found");
_L4:
        return;
_L2:
        if (zzQa)
        {
            zzPZ.add(connectioncallbacks);
        }
        if (true) goto _L4; else goto _L3
_L3:
        connectioncallbacks;
        arraylist;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public final void unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzx.zzl(onconnectionfailedlistener);
        synchronized (zzQb)
        {
            if (!zzQb.remove(onconnectionfailedlistener))
            {
                (new StringBuilder("unregisterConnectionFailedListener(): listener ")).append(onconnectionfailedlistener).append(" not found");
            }
        }
        return;
        onconnectionfailedlistener;
        arraylist;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }

    public final void zzaJ(int i)
    {
        mHandler.removeMessages(1);
        ArrayList arraylist = zzPY;
        arraylist;
        JVM INSTR monitorenter ;
        zzQa = true;
        Iterator iterator = (new ArrayList(zzPY)).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)iterator.next();
            if (!zzPX.zzin())
            {
                break;
            }
            if (zzPY.contains(connectioncallbacks))
            {
                connectioncallbacks.onConnectionSuspended(i);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_95;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
        zzPZ.clear();
        zzQa = false;
        arraylist;
        JVM INSTR monitorexit ;
    }

    protected final void zzfe()
    {
        synchronized (zzPY)
        {
            zzj(zzPX.zzhp());
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void zzg(ConnectionResult connectionresult)
    {
        mHandler.removeMessages(1);
        ArrayList arraylist = zzQb;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator = (new ArrayList(zzQb)).iterator();
_L2:
        com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_93;
        }
        onconnectionfailedlistener = (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)iterator.next();
        if (!zzPX.zzin())
        {
            return;
        }
        if (zzQb.contains(onconnectionfailedlistener))
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

    public final void zzj(Bundle bundle)
    {
        boolean flag1 = true;
        ArrayList arraylist = zzPY;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator;
        boolean flag;
        if (!zzQa)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzN(flag);
        mHandler.removeMessages(1);
        zzQa = true;
        if (zzPZ.size() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzx.zzN(flag);
        iterator = (new ArrayList(zzPY)).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)iterator.next();
            if (!zzPX.zzin() || !zzPX.isConnected())
            {
                break;
            }
            if (!zzPZ.contains(connectioncallbacks))
            {
                connectioncallbacks.onConnected(bundle);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_156;
        bundle;
        arraylist;
        JVM INSTR monitorexit ;
        throw bundle;
        zzPZ.clear();
        zzQa = false;
        arraylist;
        JVM INSTR monitorexit ;
    }
}
