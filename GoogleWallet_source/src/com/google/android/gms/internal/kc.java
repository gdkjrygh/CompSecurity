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
//            kn

public final class kc
{
    final class a extends Handler
    {

        final kc Wf;

        public final void handleMessage(Message message)
        {
            if (message.what == 1)
            {
                synchronized (kc.a(Wf))
                {
                    if (kc.b(Wf).ij() && kc.b(Wf).isConnected() && kc.a(Wf).contains(message.obj))
                    {
                        Bundle bundle = kc.b(Wf).ht();
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
            Wf = kc.this;
            super(looper);
        }
    }

    public static interface b
    {

        public abstract Bundle ht();

        public abstract boolean ij();

        public abstract boolean isConnected();
    }


    private final b Wa;
    private final ArrayList Wb = new ArrayList();
    final ArrayList Wc = new ArrayList();
    private boolean Wd;
    private final ArrayList We = new ArrayList();
    private final Handler mHandler;

    public kc(Context context, Looper looper, b b1)
    {
        Wd = false;
        Wa = b1;
        mHandler = new a(looper);
    }

    static ArrayList a(kc kc1)
    {
        return kc1.Wb;
    }

    static b b(kc kc1)
    {
        return kc1.Wa;
    }

    public final void b(ConnectionResult connectionresult)
    {
        mHandler.removeMessages(1);
        ArrayList arraylist = We;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator = (new ArrayList(We)).iterator();
_L2:
        com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_93;
        }
        onconnectionfailedlistener = (com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener)iterator.next();
        if (!Wa.ij())
        {
            return;
        }
        if (We.contains(onconnectionfailedlistener))
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

    protected final void dT()
    {
        synchronized (Wb)
        {
            h(Wa.ht());
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void dh(int i)
    {
        mHandler.removeMessages(1);
        ArrayList arraylist = Wb;
        arraylist;
        JVM INSTR monitorenter ;
        Wd = true;
        Iterator iterator = (new ArrayList(Wb)).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)iterator.next();
            if (!Wa.ij())
            {
                break;
            }
            if (Wb.contains(connectioncallbacks))
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
        Wd = false;
        arraylist;
        JVM INSTR monitorexit ;
    }

    public final void h(Bundle bundle)
    {
        boolean flag1 = true;
        ArrayList arraylist = Wb;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator;
        boolean flag;
        if (!Wd)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        kn.K(flag);
        mHandler.removeMessages(1);
        Wd = true;
        if (Wc.size() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        kn.K(flag);
        iterator = (new ArrayList(Wb)).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)iterator.next();
            if (!Wa.ij() || !Wa.isConnected())
            {
                break;
            }
            if (!Wc.contains(connectioncallbacks))
            {
                connectioncallbacks.onConnected(bundle);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_156;
        bundle;
        arraylist;
        JVM INSTR monitorexit ;
        throw bundle;
        Wc.clear();
        Wd = false;
        arraylist;
        JVM INSTR monitorexit ;
    }

    public final void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        kn.k(connectioncallbacks);
        ArrayList arraylist = Wb;
        arraylist;
        JVM INSTR monitorenter ;
        if (!Wb.contains(connectioncallbacks))
        {
            break MISSING_BLOCK_LABEL_82;
        }
        Log.w("GmsClientEvents", (new StringBuilder("registerConnectionCallbacks(): listener ")).append(connectioncallbacks).append(" is already registered").toString());
_L2:
        if (Wa.isConnected())
        {
            mHandler.sendMessage(mHandler.obtainMessage(1, connectioncallbacks));
        }
        return;
        Wb.add(connectioncallbacks);
        if (true) goto _L2; else goto _L1
_L1:
        connectioncallbacks;
        arraylist;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public final void registerConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        kn.k(onconnectionfailedlistener);
        ArrayList arraylist = We;
        arraylist;
        JVM INSTR monitorenter ;
        if (!We.contains(onconnectionfailedlistener))
        {
            break MISSING_BLOCK_LABEL_53;
        }
        Log.w("GmsClientEvents", (new StringBuilder("registerConnectionFailedListener(): listener ")).append(onconnectionfailedlistener).append(" is already registered").toString());
_L2:
        return;
        We.add(onconnectionfailedlistener);
        if (true) goto _L2; else goto _L1
_L1:
        onconnectionfailedlistener;
        arraylist;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }

    public final void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        kn.k(connectioncallbacks);
        ArrayList arraylist = Wb;
        arraylist;
        JVM INSTR monitorenter ;
        if (Wb == null) goto _L2; else goto _L1
_L1:
        if (Wb.remove(connectioncallbacks)) goto _L4; else goto _L3
_L3:
        Log.w("GmsClientEvents", (new StringBuilder("unregisterConnectionCallbacks(): listener ")).append(connectioncallbacks).append(" not found").toString());
_L2:
        return;
_L4:
        if (Wd)
        {
            Wc.add(connectioncallbacks);
        }
        if (true) goto _L2; else goto _L5
_L5:
        connectioncallbacks;
        arraylist;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public final void unregisterConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        kn.k(onconnectionfailedlistener);
        synchronized (We)
        {
            if (We != null && !We.remove(onconnectionfailedlistener))
            {
                Log.w("GmsClientEvents", (new StringBuilder("unregisterConnectionFailedListener(): listener ")).append(onconnectionfailedlistener).append(" not found").toString());
            }
        }
        return;
        onconnectionfailedlistener;
        arraylist;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }
}
