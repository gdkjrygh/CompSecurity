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
//            zzu

public final class zzj
    implements android.os.Handler.Callback
{

    final ArrayList a = new ArrayList();
    private final zza b;
    private final ArrayList c = new ArrayList();
    private final ArrayList d = new ArrayList();
    private volatile boolean e;
    private final AtomicInteger f = new AtomicInteger(0);
    private boolean g;
    private final Handler h;
    private final Object i = new Object();

    public zzj(Looper looper, zza zza)
    {
        e = false;
        g = false;
        b = zza;
        h = new Handler(looper, this);
    }

    public void a()
    {
        e = false;
        f.incrementAndGet();
    }

    public void a(int j)
    {
        h.removeMessages(1);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        int k;
        g = true;
        obj1 = new ArrayList(c);
        k = f.get();
        obj1 = ((ArrayList) (obj1)).iterator();
_L5:
        if (!((Iterator) (obj1)).hasNext()) goto _L2; else goto _L1
_L1:
        com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)((Iterator) (obj1)).next();
        if (e && f.get() == k) goto _L3; else goto _L2
_L2:
        a.clear();
        g = false;
        return;
_L3:
        if (c.contains(connectioncallbacks))
        {
            connectioncallbacks.onConnectionSuspended(j);
        }
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(Bundle bundle)
    {
        boolean flag1 = true;
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks;
        int j;
        boolean flag;
        if (!g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.a(flag);
        h.removeMessages(1);
        g = true;
        if (a.size() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzu.a(flag);
        obj1 = new ArrayList(c);
        j = f.get();
        obj1 = ((ArrayList) (obj1)).iterator();
_L5:
        if (!((Iterator) (obj1)).hasNext()) goto _L2; else goto _L1
_L1:
        connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)((Iterator) (obj1)).next();
        if (e && b.b() && f.get() == j) goto _L3; else goto _L2
_L2:
        a.clear();
        g = false;
        obj;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (!a.contains(connectioncallbacks))
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

    public void a(ConnectionResult connectionresult)
    {
        h.removeMessages(1);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        int j;
        obj1 = new ArrayList(d);
        j = f.get();
        obj1 = ((ArrayList) (obj1)).iterator();
_L2:
        com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener;
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_111;
        }
        onconnectionfailedlistener = (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)((Iterator) (obj1)).next();
        if (!e || f.get() != j)
        {
            return;
        }
        if (d.contains(onconnectionfailedlistener))
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

    public void a(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        zzu.a(connectioncallbacks);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (!c.contains(connectioncallbacks))
        {
            break MISSING_BLOCK_LABEL_85;
        }
        Log.w("GmsClientEvents", (new StringBuilder()).append("registerConnectionCallbacks(): listener ").append(connectioncallbacks).append(" is already registered").toString());
_L2:
        if (b.b())
        {
            h.sendMessage(h.obtainMessage(1, connectioncallbacks));
        }
        return;
        c.add(connectioncallbacks);
        if (true) goto _L2; else goto _L1
_L1:
        connectioncallbacks;
        obj;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public void a(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzu.a(onconnectionfailedlistener);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (!d.contains(onconnectionfailedlistener))
        {
            break MISSING_BLOCK_LABEL_56;
        }
        Log.w("GmsClientEvents", (new StringBuilder()).append("registerConnectionFailedListener(): listener ").append(onconnectionfailedlistener).append(" is already registered").toString());
_L2:
        return;
        d.add(onconnectionfailedlistener);
        if (true) goto _L2; else goto _L1
_L1:
        onconnectionfailedlistener;
        obj;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }

    public void b()
    {
        e = true;
    }

    public void b(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        zzu.a(connectioncallbacks);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (c.remove(connectioncallbacks)) goto _L2; else goto _L1
_L1:
        Log.w("GmsClientEvents", (new StringBuilder()).append("unregisterConnectionCallbacks(): listener ").append(connectioncallbacks).append(" not found").toString());
_L4:
        return;
_L2:
        if (g)
        {
            a.add(connectioncallbacks);
        }
        if (true) goto _L4; else goto _L3
_L3:
        connectioncallbacks;
        obj;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public void b(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzu.a(onconnectionfailedlistener);
        synchronized (i)
        {
            if (!d.remove(onconnectionfailedlistener))
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

    public boolean handleMessage(Message message)
    {
        if (message.what == 1)
        {
            com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)message.obj;
            synchronized (i)
            {
                if (e && b.b() && c.contains(connectioncallbacks))
                {
                    connectioncallbacks.onConnected(b.e_());
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

    private class zza
    {

        public abstract boolean b();

        public abstract Bundle e_();
    }

}
