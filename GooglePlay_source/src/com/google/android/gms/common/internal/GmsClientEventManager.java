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
//            Preconditions

public final class GmsClientEventManager
    implements android.os.Handler.Callback
{
    public static interface GmsClientEventState
    {

        public abstract Bundle getConnectionHint();

        public abstract boolean isConnected();
    }


    public volatile boolean mCallbacksEnabled;
    public final ArrayList mConnectionFailedListeners = new ArrayList();
    public final ArrayList mConnectionListeners = new ArrayList();
    public final ArrayList mConnectionListenersRemoved = new ArrayList();
    private final AtomicInteger mDisableCallbacksCount = new AtomicInteger(0);
    private final GmsClientEventState mEventState;
    private final Handler mHandler;
    public boolean mIsProcessingConnectionCallback;
    public final Object mLock = new Object();

    public GmsClientEventManager(Looper looper, GmsClientEventState gmsclienteventstate)
    {
        mCallbacksEnabled = false;
        mIsProcessingConnectionCallback = false;
        mEventState = gmsclienteventstate;
        mHandler = new Handler(looper, this);
    }

    public final void disableCallbacks()
    {
        mCallbacksEnabled = false;
        mDisableCallbacksCount.incrementAndGet();
    }

    public final boolean handleMessage(Message message)
    {
        if (message.what == 1)
        {
            com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)message.obj;
            synchronized (mLock)
            {
                if (mCallbacksEnabled && mEventState.isConnected() && mConnectionListeners.contains(connectioncallbacks))
                {
                    connectioncallbacks.onConnected(mEventState.getConnectionHint());
                }
            }
            return true;
        } else
        {
            Log.wtf("GmsClientEvents", (new StringBuilder("Don't know how to handle message: ")).append(message.what).toString(), new Exception());
            return false;
        }
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onConnectionFailure(ConnectionResult connectionresult)
    {
        Object obj;
        Object obj1;
        com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener;
        int i;
        boolean flag;
        if (Looper.myLooper() == mHandler.getLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "onConnectionFailure must only be called on the Handler thread");
        mHandler.removeMessages(1);
        obj = mLock;
        obj;
        JVM INSTR monitorenter ;
        obj1 = new ArrayList(mConnectionFailedListeners);
        i = mDisableCallbacksCount.get();
        obj1 = ((ArrayList) (obj1)).iterator();
_L2:
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_134;
        }
        onconnectionfailedlistener = (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)((Iterator) (obj1)).next();
        if (!mCallbacksEnabled || mDisableCallbacksCount.get() != i)
        {
            return;
        }
        if (mConnectionFailedListeners.contains(onconnectionfailedlistener))
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

    public final void onConnectionSuccess(Bundle bundle)
    {
        Object obj;
        boolean flag;
        boolean flag1 = true;
        Object obj1;
        com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks;
        int i;
        if (Looper.myLooper() == mHandler.getLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "onConnectionSuccess must only be called on the Handler thread");
        obj = mLock;
        obj;
        JVM INSTR monitorenter ;
        if (!mIsProcessingConnectionCallback)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        mHandler.removeMessages(1);
        mIsProcessingConnectionCallback = true;
        if (mConnectionListenersRemoved.size() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        obj1 = new ArrayList(mConnectionListeners);
        i = mDisableCallbacksCount.get();
        obj1 = ((ArrayList) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)((Iterator) (obj1)).next();
            if (!mCallbacksEnabled || !mEventState.isConnected() || mDisableCallbacksCount.get() != i)
            {
                break;
            }
            if (!mConnectionListenersRemoved.contains(connectioncallbacks))
            {
                connectioncallbacks.onConnected(bundle);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_203;
        bundle;
        obj;
        JVM INSTR monitorexit ;
        throw bundle;
        mConnectionListenersRemoved.clear();
        mIsProcessingConnectionCallback = false;
        obj;
        JVM INSTR monitorexit ;
    }

    public final void onUnintentionalDisconnection(int i)
    {
        boolean flag = false;
        if (Looper.myLooper() == mHandler.getLooper())
        {
            flag = true;
        }
        Preconditions.checkState(flag, "onUnintentionalDisconnection must only be called on the Handler thread");
        mHandler.removeMessages(1);
        Object obj = mLock;
        obj;
        JVM INSTR monitorenter ;
        mIsProcessingConnectionCallback = true;
        Object obj1 = new ArrayList(mConnectionListeners);
        int j = mDisableCallbacksCount.get();
        obj1 = ((ArrayList) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)((Iterator) (obj1)).next();
            if (!mCallbacksEnabled || mDisableCallbacksCount.get() != j)
            {
                break;
            }
            if (mConnectionListeners.contains(connectioncallbacks))
            {
                connectioncallbacks.onConnectionSuspended(i);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_139;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        mConnectionListenersRemoved.clear();
        mIsProcessingConnectionCallback = false;
        obj;
        JVM INSTR monitorexit ;
    }

    public final void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        Preconditions.checkNotNull(connectioncallbacks);
        Object obj = mLock;
        obj;
        JVM INSTR monitorenter ;
        if (!mConnectionListeners.contains(connectioncallbacks))
        {
            break MISSING_BLOCK_LABEL_82;
        }
        Log.w("GmsClientEvents", (new StringBuilder("registerConnectionCallbacks(): listener ")).append(connectioncallbacks).append(" is already registered").toString());
_L2:
        if (mEventState.isConnected())
        {
            mHandler.sendMessage(mHandler.obtainMessage(1, connectioncallbacks));
        }
        return;
        mConnectionListeners.add(connectioncallbacks);
        if (true) goto _L2; else goto _L1
_L1:
        connectioncallbacks;
        obj;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public final void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        Preconditions.checkNotNull(onconnectionfailedlistener);
        Object obj = mLock;
        obj;
        JVM INSTR monitorenter ;
        if (!mConnectionFailedListeners.contains(onconnectionfailedlistener))
        {
            break MISSING_BLOCK_LABEL_53;
        }
        Log.w("GmsClientEvents", (new StringBuilder("registerConnectionFailedListener(): listener ")).append(onconnectionfailedlistener).append(" is already registered").toString());
_L2:
        return;
        mConnectionFailedListeners.add(onconnectionfailedlistener);
        if (true) goto _L2; else goto _L1
_L1:
        onconnectionfailedlistener;
        obj;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }
}
