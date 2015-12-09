// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClientEventManager;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            GoogleApiClientStateHolder, CompositeGoogleApiClient, InternalGoogleApiClient, ListenerHolder, 
//            GooglePlayServicesUpdatedReceiver

public final class GoogleApiClientImpl extends GoogleApiClient
    implements InternalGoogleApiClient.InternalCallbacks
{
    final class CallbackHandler extends Handler
    {

        final GoogleApiClientImpl this$0;

        public final void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                Log.w("GoogleApiClientImpl", (new StringBuilder("Unknown message id: ")).append(message.what).toString());
                return;

            case 1: // '\001'
                lock();
                return;

            case 2: // '\002'
                lock();
                break;
            }
        }

        CallbackHandler(Looper looper)
        {
            this$0 = GoogleApiClientImpl.this;
            super(looper);
        }
    }

    static final class PackageUpdatedReceiver extends GooglePlayServicesUpdatedReceiver
    {

        private WeakReference mClientRef;

        public final void onUpdated()
        {
            GoogleApiClientImpl googleapiclientimpl = (GoogleApiClientImpl)mClientRef.get();
            if (googleapiclientimpl == null)
            {
                return;
            } else
            {
                googleapiclientimpl.lock();
                return;
            }
        }

        PackageUpdatedReceiver(GoogleApiClientImpl googleapiclientimpl)
        {
            mClientRef = new WeakReference(googleapiclientimpl);
        }
    }

    static interface ResultConsumedCallback
    {

        public abstract void onConsumed(Runner runner);
    }

    static interface Runner
    {

        public abstract void cancel();

        public abstract void forceFailureUnlessReady(Status status);

        public abstract com.google.android.gms.common.api.Api.ClientKey getClientKey();

        public abstract Integer getResultId();

        public abstract void run(com.google.android.gms.common.api.Api.Client client)
            throws DeadObjectException;

        public abstract void setFailedResult(Status status);

        public abstract void setResultConsumedCallback(ResultConsumedCallback resultconsumedcallback);
    }


    private final GoogleApiAvailability mApiAvailability;
    private InternalGoogleApiClient mApiClient;
    final Map mApiTypeMap;
    private final int mAutoManageId;
    private final ArrayList mClientCallbacks;
    final ClientSettings mClientSettings;
    final Map mClients;
    private final Context mContext;
    private final com.google.android.gms.common.internal.GmsClientEventManager.GmsClientEventState mEventStateCallbacks = new com.google.android.gms.common.internal.GmsClientEventManager.GmsClientEventState() {

        final GoogleApiClientImpl this$0;

        public final Bundle getConnectionHint()
        {
            return null;
        }

        public final boolean isConnected()
        {
            return GoogleApiClientImpl.this.isConnected();
        }

            
            {
                this$0 = GoogleApiClientImpl.this;
                super();
            }
    };
    private final GmsClientEventManager mEvents;
    private final CallbackHandler mHandlerForCallbacks;
    private final Set mListeners = Collections.newSetFromMap(new WeakHashMap());
    private final Lock mLock;
    final Looper mLooper;
    PackageUpdatedReceiver mPackageUpdatedReceiver;
    private final ResultConsumedCallback mResultListener = new ResultConsumedCallback() {

        final GoogleApiClientImpl this$0;

        public final void onConsumed(Runner runner)
        {
            mUnconsumedRunners.remove(runner);
            runner.getResultId();
        }

            
            {
                this$0 = GoogleApiClientImpl.this;
                super();
            }
    };
    private long mResumeDelayMs;
    private long mResumeTimeoutMs;
    private volatile boolean mResuming;
    final com.google.android.gms.common.api.Api.AbstractClientBuilder mSignInApiBuilder;
    private Integer mSignInMode;
    final Set mUnconsumedRunners = Collections.newSetFromMap(new ConcurrentHashMap(16, 0.75F, 2));
    Set mValidatedScopes;
    final Queue mWorkQueue = new LinkedList();

    public GoogleApiClientImpl(Context context, Lock lock, Looper looper, ClientSettings clientsettings, GoogleApiAvailability googleapiavailability, com.google.android.gms.common.api.Api.AbstractClientBuilder abstractclientbuilder, Map map, 
            List list, List list1, Map map1, int i, int j, ArrayList arraylist)
    {
        mApiClient = null;
        mResumeTimeoutMs = 0x1d4c0L;
        mResumeDelayMs = 5000L;
        mValidatedScopes = new HashSet();
        mSignInMode = null;
        mContext = context;
        mLock = lock;
        mEvents = new GmsClientEventManager(looper, mEventStateCallbacks);
        mLooper = looper;
        mHandlerForCallbacks = new CallbackHandler(looper);
        mApiAvailability = googleapiavailability;
        mAutoManageId = i;
        if (mAutoManageId >= 0)
        {
            mSignInMode = Integer.valueOf(j);
        }
        mApiTypeMap = map;
        mClients = map1;
        mClientCallbacks = arraylist;
        for (context = list.iterator(); context.hasNext(); mEvents.registerConnectionCallbacks(lock))
        {
            lock = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)context.next();
        }

        for (context = list1.iterator(); context.hasNext(); mEvents.registerConnectionFailedListener(lock))
        {
            lock = (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)context.next();
        }

        mClientSettings = clientsettings;
        mSignInApiBuilder = abstractclientbuilder;
    }

    private void checkModeAndBuildApiClient(int i)
    {
        if (mSignInMode == null)
        {
            mSignInMode = Integer.valueOf(i);
        } else
        if (mSignInMode.intValue() != i)
        {
            throw new IllegalStateException((new StringBuilder("Cannot use sign-in mode: ")).append(getSignInModeName(i)).append(". Mode was already set to ").append(getSignInModeName(mSignInMode.intValue())).toString());
        }
        if (mApiClient != null)
        {
            return;
        }
        i = 0;
        Iterator iterator = mClients.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((com.google.android.gms.common.api.Api.Client)iterator.next()).requiresSignIn())
            {
                i = 1;
            }
        } while (true);
        mSignInMode.intValue();
        JVM INSTR tableswitch 1 3: default 160
    //                   1 210
    //                   2 225
    //                   3 160;
           goto _L1 _L2 _L3 _L1
_L1:
        mApiClient = new GoogleApiClientStateHolder(mContext, this, mLock, mLooper, mApiAvailability, mClients, mClientSettings, mApiTypeMap, mSignInApiBuilder, mClientCallbacks, this);
        return;
_L2:
        if (i == 0)
        {
            throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (i != 0)
        {
            mApiClient = new CompositeGoogleApiClient(mContext, this, mLock, mLooper, mApiAvailability, mClients, mClientSettings, mApiTypeMap, mSignInApiBuilder, mClientCallbacks);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void connectLocked()
    {
        mEvents.mCallbacksEnabled = true;
        mApiClient.connect();
    }

    private static String getSignInModeName(int i)
    {
        switch (i)
        {
        default:
            return "UNKNOWN";

        case 3: // '\003'
            return "SIGN_IN_MODE_NONE";

        case 1: // '\001'
            return "SIGN_IN_MODE_REQUIRED";

        case 2: // '\002'
            return "SIGN_IN_MODE_OPTIONAL";
        }
    }

    public static int selectSignInModeAutomatically$251b1977(Iterable iterable)
    {
        boolean flag = false;
        iterable = iterable.iterator();
        do
        {
            if (!iterable.hasNext())
            {
                break;
            }
            if (((com.google.android.gms.common.api.Api.Client)iterable.next()).requiresSignIn())
            {
                flag = true;
            }
        } while (true);
        return !flag ? 3 : 1;
    }

    final void addUnconsumedRunner(Runner runner)
    {
        mUnconsumedRunners.add(runner);
        runner.setResultConsumedCallback(mResultListener);
    }

    public final ConnectionResult blockingConnect()
    {
        boolean flag;
        boolean flag1 = true;
        ConnectionResult connectionresult;
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "blockingConnect must not be called on the UI thread");
        mLock.lock();
        if (mAutoManageId < 0) goto _L2; else goto _L1
_L1:
        if (mSignInMode != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Sign-in mode should have been set explicitly by auto-manage.");
_L3:
        checkModeAndBuildApiClient(mSignInMode.intValue());
        mEvents.mCallbacksEnabled = true;
        connectionresult = mApiClient.blockingConnect();
        mLock.unlock();
        return connectionresult;
_L2:
        if (mSignInMode != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        mSignInMode = Integer.valueOf(selectSignInModeAutomatically$251b1977(mClients.values()));
          goto _L3
        Exception exception;
        exception;
        mLock.unlock();
        throw exception;
        if (mSignInMode.intValue() != 2) goto _L3; else goto _L4
_L4:
        throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
    }

    final void cancelAndClearWorkQueue()
    {
        Runner runner;
        for (Iterator iterator = mWorkQueue.iterator(); iterator.hasNext(); runner.cancel())
        {
            runner = (Runner)iterator.next();
            runner.setResultConsumedCallback(null);
        }

        mWorkQueue.clear();
    }

    public final void connect()
    {
        boolean flag1;
        flag1 = false;
        mLock.lock();
        if (mAutoManageId < 0) goto _L2; else goto _L1
_L1:
        int i;
        boolean flag;
        if (mSignInMode != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Sign-in mode should have been set explicitly by auto-manage.");
_L3:
        i = mSignInMode.intValue();
        mLock.lock();
label0:
        {
            if (i != 3 && i != 1)
            {
                flag = flag1;
                if (i != 2)
                {
                    break label0;
                }
            }
            flag = true;
        }
        Preconditions.checkArgument(flag, (new StringBuilder("Illegal sign-in mode: ")).append(i).toString());
        checkModeAndBuildApiClient(i);
        connectLocked();
        mLock.unlock();
        mLock.unlock();
        return;
_L2:
        if (mSignInMode != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        mSignInMode = Integer.valueOf(selectSignInModeAutomatically$251b1977(mClients.values()));
          goto _L3
        Exception exception;
        exception;
        mLock.unlock();
        throw exception;
        if (mSignInMode.intValue() != 2) goto _L3; else goto _L4
_L4:
        throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
        exception;
        mLock.unlock();
        throw exception;
    }

    public final void disconnect()
    {
        mLock.lock();
        Runner runner;
        for (Iterator iterator = mUnconsumedRunners.iterator(); iterator.hasNext(); runner.cancel())
        {
            runner = (Runner)iterator.next();
            runner.setResultConsumedCallback(null);
            runner.getResultId();
        }

        break MISSING_BLOCK_LABEL_73;
        Exception exception;
        exception;
        mLock.unlock();
        throw exception;
        mUnconsumedRunners.clear();
        for (Iterator iterator1 = mListeners.iterator(); iterator1.hasNext();)
        {
            ((ListenerHolder)iterator1.next()).mListener = null;
        }

        mListeners.clear();
        if (mApiClient != null)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        cancelAndClearWorkQueue();
        mLock.unlock();
        return;
        stopResumingLocked();
        mApiClient.disconnect();
        mEvents.disableCallbacks();
        mLock.unlock();
        return;
    }

    public final void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.append(s).append("mContext=").println(mContext);
        printwriter.append(s).append("mResuming=").print(mResuming);
        printwriter.append(" mWorkQueue.size()=").print(mWorkQueue.size());
        printwriter.append(" mUnconsumedRunners.size()=").println(mUnconsumedRunners.size());
        if (mApiClient != null)
        {
            mApiClient.dump(s, filedescriptor, printwriter, as);
        }
    }

    final String dumpToString()
    {
        StringWriter stringwriter = new StringWriter();
        dump("", null, new PrintWriter(stringwriter), null);
        return stringwriter.toString();
    }

    public final BaseImplementation.ApiMethodImpl enqueue(BaseImplementation.ApiMethodImpl apimethodimpl)
    {
        boolean flag;
        if (apimethodimpl.mClientKey != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "This task can not be enqueued (it's probably a Batch or malformed)");
        Preconditions.checkArgument(mClients.containsKey(apimethodimpl.mClientKey), "GoogleApiClient is not configured to use the API required for this call.");
        mLock.lock();
        if (mApiClient != null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        mWorkQueue.add(apimethodimpl);
        mLock.unlock();
        return apimethodimpl;
        apimethodimpl = mApiClient.enqueue(apimethodimpl);
        mLock.unlock();
        return apimethodimpl;
        apimethodimpl;
        mLock.unlock();
        throw apimethodimpl;
    }

    public final BaseImplementation.ApiMethodImpl execute(BaseImplementation.ApiMethodImpl apimethodimpl)
    {
        boolean flag;
        if (apimethodimpl.mClientKey != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "This task can not be executed (it's probably a Batch or malformed)");
        mLock.lock();
        if (mApiClient == null)
        {
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        }
        break MISSING_BLOCK_LABEL_60;
        apimethodimpl;
        mLock.unlock();
        throw apimethodimpl;
        if (!mResuming)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        mWorkQueue.add(apimethodimpl);
        Runner runner;
        for (; !mWorkQueue.isEmpty(); runner.setFailedResult(Status.RESULT_INTERNAL_ERROR))
        {
            runner = (Runner)mWorkQueue.remove();
            addUnconsumedRunner(runner);
        }

        mLock.unlock();
        return apimethodimpl;
        apimethodimpl = mApiClient.execute(apimethodimpl);
        mLock.unlock();
        return apimethodimpl;
    }

    public final com.google.android.gms.common.api.Api.Client getClient(com.google.android.gms.common.api.Api.ClientKey clientkey)
    {
        clientkey = (com.google.android.gms.common.api.Api.Client)mClients.get(clientkey);
        Preconditions.checkNotNull(clientkey, "Appropriate Api was not requested.");
        return clientkey;
    }

    public final Looper getLooper()
    {
        return mLooper;
    }

    public final void handleOnConnectionFailed(ConnectionResult connectionresult)
    {
        if (!GoogleApiAvailability.isPlayServicesPossiblyUpdating(mContext, connectionresult.mStatusCode))
        {
            stopResumingLocked();
        }
        if (!mResuming)
        {
            mEvents.onConnectionFailure(connectionresult);
            mEvents.disableCallbacks();
        }
    }

    public final void handleOnConnectionSuccess(Bundle bundle)
    {
        for (; !mWorkQueue.isEmpty(); execute((BaseImplementation.ApiMethodImpl)mWorkQueue.remove())) { }
        mEvents.onConnectionSuccess(bundle);
    }

    public final void handleOnConnectionSuspended(int i)
    {
        if (i == 1 && !mResuming)
        {
            mResuming = true;
            if (mPackageUpdatedReceiver == null)
            {
                mPackageUpdatedReceiver = (PackageUpdatedReceiver)GooglePlayServicesUpdatedReceiver.register$2dbab250(mContext.getApplicationContext(), new PackageUpdatedReceiver(this));
            }
            mHandlerForCallbacks.sendMessageDelayed(mHandlerForCallbacks.obtainMessage(1), mResumeTimeoutMs);
            mHandlerForCallbacks.sendMessageDelayed(mHandlerForCallbacks.obtainMessage(2), mResumeDelayMs);
        }
        for (Iterator iterator = mUnconsumedRunners.iterator(); iterator.hasNext(); ((Runner)iterator.next()).forceFailureUnlessReady(new Status(8, "The connection to Google Play services was lost"))) { }
        mEvents.onUnintentionalDisconnection(i);
        mEvents.disableCallbacks();
        if (i == 2)
        {
            connectLocked();
        }
    }

    public final boolean hasApi(Api api)
    {
        return mClients.containsKey(api.getClientKey());
    }

    public final boolean hasAuthenticatedScope(Scope scope)
    {
        mLock.lock();
        if (!isConnected()) goto _L2; else goto _L1
_L1:
        boolean flag = mValidatedScopes.contains(scope);
        if (!flag) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        mLock.unlock();
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        scope;
        mLock.unlock();
        throw scope;
    }

    public final boolean hasConnectedApi(Api api)
    {
        api = (com.google.android.gms.common.api.Api.Client)mClients.get(api.getClientKey());
        return api != null && api.isConnected();
    }

    public final boolean isConnected()
    {
        return mApiClient != null && mApiClient.isConnected();
    }

    public final void reconnect()
    {
        disconnect();
        connect();
    }

    public final void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        mEvents.registerConnectionCallbacks(connectioncallbacks);
    }

    public final void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        mEvents.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public final ListenerHolder registerListener(Object obj)
    {
        Preconditions.checkNotNull(obj, "Listener must not be null");
        mLock.lock();
        obj = new ListenerHolder(mLooper, obj);
        mListeners.add(obj);
        mLock.unlock();
        return ((ListenerHolder) (obj));
        obj;
        mLock.unlock();
        throw obj;
    }

    final boolean stopResumingLocked()
    {
        if (!mResuming)
        {
            return false;
        }
        mResuming = false;
        mHandlerForCallbacks.removeMessages(2);
        mHandlerForCallbacks.removeMessages(1);
        if (mPackageUpdatedReceiver != null)
        {
            mPackageUpdatedReceiver.unregister();
            mPackageUpdatedReceiver = null;
        }
        return true;
    }

    public final void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        GmsClientEventManager gmsclienteventmanager;
        gmsclienteventmanager = mEvents;
        Preconditions.checkNotNull(connectioncallbacks);
        Object obj = gmsclienteventmanager.mLock;
        obj;
        JVM INSTR monitorenter ;
        if (gmsclienteventmanager.mConnectionListeners.remove(connectioncallbacks)) goto _L2; else goto _L1
_L1:
        Log.w("GmsClientEvents", (new StringBuilder("unregisterConnectionCallbacks(): listener ")).append(connectioncallbacks).append(" not found").toString());
_L4:
        return;
_L2:
        if (gmsclienteventmanager.mIsProcessingConnectionCallback)
        {
            gmsclienteventmanager.mConnectionListenersRemoved.add(connectioncallbacks);
        }
        if (true) goto _L4; else goto _L3
_L3:
        connectioncallbacks;
        obj;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public final void unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        GmsClientEventManager gmsclienteventmanager = mEvents;
        Preconditions.checkNotNull(onconnectionfailedlistener);
        synchronized (gmsclienteventmanager.mLock)
        {
            if (!gmsclienteventmanager.mConnectionFailedListeners.remove(onconnectionfailedlistener))
            {
                Log.w("GmsClientEvents", (new StringBuilder("unregisterConnectionFailedListener(): listener ")).append(onconnectionfailedlistener).append(" not found").toString());
            }
        }
        return;
        onconnectionfailedlistener;
        obj;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }


/*
    static void access$200(GoogleApiClientImpl googleapiclientimpl)
    {
        googleapiclientimpl.mLock.lock();
        if (googleapiclientimpl.mResuming)
        {
            googleapiclientimpl.connectLocked();
        }
        googleapiclientimpl.mLock.unlock();
        return;
        Exception exception;
        exception;
        googleapiclientimpl.mLock.unlock();
        throw exception;
    }

*/


/*
    static void access$300(GoogleApiClientImpl googleapiclientimpl)
    {
        googleapiclientimpl.mLock.lock();
        if (googleapiclientimpl.stopResumingLocked())
        {
            googleapiclientimpl.connectLocked();
        }
        googleapiclientimpl.mLock.unlock();
        return;
        Exception exception;
        exception;
        googleapiclientimpl.mLock.unlock();
        throw exception;
    }

*/
}
