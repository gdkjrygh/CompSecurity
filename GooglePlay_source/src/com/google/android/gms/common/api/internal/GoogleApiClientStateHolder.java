// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ClientSettings;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            InternalGoogleApiClient, ClientCallbacks, GoogleApiClientDisconnected, GoogleApiClientConnecting, 
//            GoogleApiClientState, GoogleApiClientConnected, GoogleApiClientImpl

public final class GoogleApiClientStateHolder
    implements InternalGoogleApiClient
{
    static abstract class HandlerTask
    {

        private final GoogleApiClientState mOwner;

        public final void run(GoogleApiClientStateHolder googleapiclientstateholder)
        {
            googleapiclientstateholder.mLock.lock();
            GoogleApiClientState googleapiclientstate;
            GoogleApiClientState googleapiclientstate1;
            googleapiclientstate = googleapiclientstateholder.mState;
            googleapiclientstate1 = mOwner;
            if (googleapiclientstate != googleapiclientstate1)
            {
                googleapiclientstateholder.mLock.unlock();
                return;
            }
            runLocked();
            googleapiclientstateholder.mLock.unlock();
            return;
            Exception exception;
            exception;
            googleapiclientstateholder.mLock.unlock();
            throw exception;
        }

        protected abstract void runLocked();

        protected HandlerTask(GoogleApiClientState googleapiclientstate)
        {
            mOwner = googleapiclientstate;
        }
    }

    final class TaskHandler extends Handler
    {

        final GoogleApiClientStateHolder this$0;

        public final void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                Log.w("GACStateManager", (new StringBuilder("Unknown message id: ")).append(message.what).toString());
                return;

            case 1: // '\001'
                ((HandlerTask)message.obj).run(GoogleApiClientStateHolder.this);
                return;

            case 2: // '\002'
                throw (RuntimeException)message.obj;
            }
        }

        TaskHandler(Looper looper)
        {
            this$0 = GoogleApiClientStateHolder.this;
            super(looper);
        }
    }


    final GoogleApiAvailability mApiAvailability;
    final GoogleApiClientImpl mApiClient;
    final Map mApiTypeMap;
    final ClientSettings mClientSettings;
    final Map mClients;
    final Context mContext;
    private ConnectionResult mDisconnectionCause;
    final Map mFailedConnections = new HashMap();
    final TaskHandler mHandlerForTasks;
    final InternalGoogleApiClient.InternalCallbacks mInternalCallbacks;
    int mLastConnectionFailurePriority;
    final Lock mLock;
    final com.google.android.gms.common.api.Api.AbstractClientBuilder mSignInApiBuilder;
    volatile GoogleApiClientState mState;
    final Condition mStateChanged;

    public GoogleApiClientStateHolder(Context context, GoogleApiClientImpl googleapiclientimpl, Lock lock, Looper looper, GoogleApiAvailability googleapiavailability, Map map, ClientSettings clientsettings, 
            Map map1, com.google.android.gms.common.api.Api.AbstractClientBuilder abstractclientbuilder, ArrayList arraylist, InternalGoogleApiClient.InternalCallbacks internalcallbacks)
    {
        mDisconnectionCause = null;
        mContext = context;
        mLock = lock;
        mApiAvailability = googleapiavailability;
        mClients = map;
        mClientSettings = clientsettings;
        mApiTypeMap = map1;
        mSignInApiBuilder = abstractclientbuilder;
        mApiClient = googleapiclientimpl;
        mInternalCallbacks = internalcallbacks;
        for (context = arraylist.iterator(); context.hasNext();)
        {
            ((ClientCallbacks)context.next()).mGoogleApiClient = this;
        }

        mHandlerForTasks = new TaskHandler(looper);
        mStateChanged = lock.newCondition();
        mState = new GoogleApiClientDisconnected(this);
    }

    public final ConnectionResult blockingConnect()
    {
        connect();
        do
        {
            if (!(mState instanceof GoogleApiClientConnecting))
            {
                break;
            }
            try
            {
                mStateChanged.await();
            }
            catch (InterruptedException interruptedexception)
            {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        } while (true);
        if (isConnected())
        {
            return ConnectionResult.RESULT_SUCCESS;
        }
        if (mDisconnectionCause != null)
        {
            return mDisconnectionCause;
        } else
        {
            return new ConnectionResult(13, null);
        }
    }

    final void changeToDisconnected(ConnectionResult connectionresult)
    {
        mLock.lock();
        mDisconnectionCause = connectionresult;
        mState = new GoogleApiClientDisconnected(this);
        mState.begin();
        mStateChanged.signalAll();
        mLock.unlock();
        return;
        connectionresult;
        mLock.unlock();
        throw connectionresult;
    }

    public final void connect()
    {
        mState.connect();
    }

    public final void disconnect()
    {
        mFailedConnections.clear();
        mState.disconnect();
    }

    public final void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        filedescriptor = (new StringBuilder()).append(s).append("  ").toString();
        Api api;
        for (as = mApiTypeMap.keySet().iterator(); as.hasNext(); ((com.google.android.gms.common.api.Api.Client)mClients.get(api.getClientKey())).dump$ec96877(filedescriptor, printwriter))
        {
            api = (Api)as.next();
            printwriter.append(s).append(api.mName).println(":");
        }

    }

    public final BaseImplementation.ApiMethodImpl enqueue(BaseImplementation.ApiMethodImpl apimethodimpl)
    {
        return mState.enqueue(apimethodimpl);
    }

    public final BaseImplementation.ApiMethodImpl execute(BaseImplementation.ApiMethodImpl apimethodimpl)
    {
        return mState.execute(apimethodimpl);
    }

    public final boolean isConnected()
    {
        return mState instanceof GoogleApiClientConnected;
    }

    public final void onConnectionSuspended(int i)
    {
        mLock.lock();
        mState.onConnectionSuspended(i);
        mLock.unlock();
        return;
        Exception exception;
        exception;
        mLock.unlock();
        throw exception;
    }

    final void postToHandler(HandlerTask handlertask)
    {
        handlertask = mHandlerForTasks.obtainMessage(1, handlertask);
        mHandlerForTasks.sendMessage(handlertask);
    }
}
