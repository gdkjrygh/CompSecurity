// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.SignInClient;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.BaseSignInCallbacks;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            GoogleApiClientState, GoogleApiClientStateHolder, GoogleApiClientImpl, GoogleApiClientConnected, 
//            GoogleApiExecutor

public final class GoogleApiClientConnecting
    implements GoogleApiClientState
{
    private static final class AccountAuthCallbackHandler extends BaseSignInCallbacks
    {

        private final WeakReference mStateRef;

        public final void onAuthAccountComplete(ConnectionResult connectionresult, final AuthAccountResult final_googleapiclientstate)
        {
            final_googleapiclientstate = (GoogleApiClientConnecting)mStateRef.get();
            if (final_googleapiclientstate == null)
            {
                return;
            } else
            {
                ((GoogleApiClientConnecting) (final_googleapiclientstate)).mHolder.postToHandler(final_googleapiclientstate. new GoogleApiClientStateHolder.HandlerTask(connectionresult) {

                    final AccountAuthCallbackHandler this$0;
                    final ConnectionResult val$result;
                    final GoogleApiClientConnecting val$state;

                    public final void runLocked()
                    {
                        GoogleApiClientConnecting googleapiclientconnecting;
                        ConnectionResult connectionresult;
label0:
                        {
                            googleapiclientconnecting = state;
                            connectionresult = result;
                            if (googleapiclientconnecting.checkStepLocked(2))
                            {
                                if (!connectionresult.isSuccess())
                                {
                                    break label0;
                                }
                                googleapiclientconnecting.startGetRemoteServiceLocked();
                            }
                            return;
                        }
                        if (googleapiclientconnecting.shouldSkipSignInLocked(connectionresult))
                        {
                            googleapiclientconnecting.cancelSignInLocked();
                            googleapiclientconnecting.startGetRemoteServiceLocked();
                            return;
                        } else
                        {
                            googleapiclientconnecting.handleConnectionFailureLocked(connectionresult);
                            return;
                        }
                    }

            
            {
                this$0 = final_accountauthcallbackhandler;
                state = GoogleApiClientConnecting.this;
                result = connectionresult;
                super(final_googleapiclientstate);
            }
                });
                return;
            }
        }

        AccountAuthCallbackHandler(GoogleApiClientConnecting googleapiclientconnecting)
        {
            mStateRef = new WeakReference(googleapiclientconnecting);
        }
    }

    private static final class AccountResolutionCallbackHandler extends com.google.android.gms.common.internal.IResolveAccountCallbacks.Stub
    {

        private final WeakReference mStateRef;

        public final void onAccountResolutionComplete(ResolveAccountResponse resolveaccountresponse)
        {
            final GoogleApiClientConnecting final_googleapiclientstate = (GoogleApiClientConnecting)mStateRef.get();
            if (final_googleapiclientstate == null)
            {
                return;
            } else
            {
                final_googleapiclientstate.mHolder.postToHandler(final_googleapiclientstate. new GoogleApiClientStateHolder.HandlerTask(resolveaccountresponse) {

                    final AccountResolutionCallbackHandler this$0;
                    final ResolveAccountResponse val$resolveAccountResponse;
                    final GoogleApiClientConnecting val$state;

                    public final void runLocked()
                    {
                        GoogleApiClientConnecting googleapiclientconnecting;
                        ConnectionResult connectionresult;
label0:
                        {
                            googleapiclientconnecting = state;
                            ResolveAccountResponse resolveaccountresponse = resolveAccountResponse;
                            if (googleapiclientconnecting.checkStepLocked(0))
                            {
                                connectionresult = resolveaccountresponse.mConnectionResult;
                                if (!connectionresult.isSuccess())
                                {
                                    break label0;
                                }
                                googleapiclientconnecting.mResolvedAccountAccessor = com.google.android.gms.common.internal.IAccountAccessor.Stub.asInterface(resolveaccountresponse.mAccountAccessorBinder);
                                googleapiclientconnecting.mAccountResolved = true;
                                googleapiclientconnecting.mSaveDefaultAccount = resolveaccountresponse.mSaveDefaultAccount;
                                googleapiclientconnecting.mShowCrossClientAuthToast = resolveaccountresponse.mIsFromCrossClientAuth;
                                googleapiclientconnecting.tryEndServiceBindingLocked();
                            }
                            return;
                        }
                        if (googleapiclientconnecting.shouldSkipSignInLocked(connectionresult))
                        {
                            googleapiclientconnecting.cancelSignInLocked();
                            googleapiclientconnecting.tryEndServiceBindingLocked();
                            return;
                        } else
                        {
                            googleapiclientconnecting.handleConnectionFailureLocked(connectionresult);
                            return;
                        }
                    }

            
            {
                this$0 = final_accountresolutioncallbackhandler;
                state = GoogleApiClientConnecting.this;
                resolveAccountResponse = resolveaccountresponse;
                super(final_googleapiclientstate);
            }
                });
                return;
            }
        }

        AccountResolutionCallbackHandler(GoogleApiClientConnecting googleapiclientconnecting)
        {
            mStateRef = new WeakReference(googleapiclientconnecting);
        }
    }

    private final class AuthAccountTask extends WorkerThreadTask
    {

        final GoogleApiClientConnecting this$0;

        public final void runLocked()
        {
            mSignInClient.authAccount(mResolvedAccountAccessor, mHolder.mApiClient.mValidatedScopes, new AccountAuthCallbackHandler(GoogleApiClientConnecting.this));
        }

        private AuthAccountTask()
        {
            this$0 = GoogleApiClientConnecting.this;
            super((byte)0);
        }

        AuthAccountTask(byte byte0)
        {
            this();
        }
    }

    private static final class ConnectionProgressReportCallbacksImpl
        implements com.google.android.gms.common.api.GoogleApiClient.ConnectionProgressReportCallbacks
    {

        private final Api mApi;
        private final int mApiType;
        private final WeakReference mStateRef;

        public final void onReportAccountValidation(ConnectionResult connectionresult)
        {
            GoogleApiClientConnecting googleapiclientconnecting;
            boolean flag = true;
            googleapiclientconnecting = (GoogleApiClientConnecting)mStateRef.get();
            if (googleapiclientconnecting == null)
            {
                return;
            }
            if (Looper.myLooper() != googleapiclientconnecting.mHolder.mApiClient.mLooper)
            {
                flag = false;
            }
            Preconditions.checkState(flag, "onReportAccountValidation must be called on the GoogleApiClient handler thread");
            googleapiclientconnecting.mLock.lock();
            flag = googleapiclientconnecting.checkStepLocked(1);
            if (!flag)
            {
                googleapiclientconnecting.mLock.unlock();
                return;
            }
            if (!connectionresult.isSuccess())
            {
                googleapiclientconnecting.recordFailedConnectionLocked(connectionresult, mApi, mApiType);
            }
            if (googleapiclientconnecting.onClientStepCallback())
            {
                googleapiclientconnecting.startAuthAccountLocked();
            }
            googleapiclientconnecting.mLock.unlock();
            return;
            connectionresult;
            googleapiclientconnecting.mLock.unlock();
            throw connectionresult;
        }

        public final void onReportServiceBinding(ConnectionResult connectionresult)
        {
            GoogleApiClientConnecting googleapiclientconnecting;
            boolean flag = false;
            googleapiclientconnecting = (GoogleApiClientConnecting)mStateRef.get();
            if (googleapiclientconnecting == null)
            {
                return;
            }
            if (Looper.myLooper() == googleapiclientconnecting.mHolder.mApiClient.mLooper)
            {
                flag = true;
            }
            Preconditions.checkState(flag, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            googleapiclientconnecting.mLock.lock();
            boolean flag1 = googleapiclientconnecting.checkStepLocked(0);
            if (!flag1)
            {
                googleapiclientconnecting.mLock.unlock();
                return;
            }
            if (!connectionresult.isSuccess())
            {
                googleapiclientconnecting.recordFailedConnectionLocked(connectionresult, mApi, mApiType);
            }
            if (googleapiclientconnecting.onClientStepCallback())
            {
                googleapiclientconnecting.tryEndServiceBindingLocked();
            }
            googleapiclientconnecting.mLock.unlock();
            return;
            connectionresult;
            googleapiclientconnecting.mLock.unlock();
            throw connectionresult;
        }

        public ConnectionProgressReportCallbacksImpl(GoogleApiClientConnecting googleapiclientconnecting, Api api, int i)
        {
            mStateRef = new WeakReference(googleapiclientconnecting);
            mApi = api;
            mApiType = i;
        }
    }

    private final class ConnectionTask extends WorkerThreadTask
    {

        private final Map mProgressCallbacksMap;
        final GoogleApiClientConnecting this$0;

        public final void runLocked()
        {
            int i = GoogleApiAvailability.isGooglePlayServicesAvailable(mContext);
            if (i != 0)
            {
                ConnectionResult connectionresult = new ConnectionResult(i, null);
                mHolder.postToHandler(new GoogleApiClientStateHolder.HandlerTask(connectionresult) {

                    final ConnectionTask this$1;
                    final ConnectionResult val$failure;

                    public final void runLocked()
                    {
                        handleConnectionFailureLocked(failure);
                    }

            
            {
                this$1 = final_connectiontask;
                failure = connectionresult;
                super(GoogleApiClientState.this);
            }
                });
            } else
            {
                if (mPerformSignIn)
                {
                    mSignInClient.connect();
                }
                Iterator iterator = mProgressCallbacksMap.keySet().iterator();
                while (iterator.hasNext()) 
                {
                    com.google.android.gms.common.api.Api.Client client = (com.google.android.gms.common.api.Api.Client)iterator.next();
                    client.connect((com.google.android.gms.common.api.GoogleApiClient.ConnectionProgressReportCallbacks)mProgressCallbacksMap.get(client));
                }
            }
        }

        public ConnectionTask(Map map)
        {
            this$0 = GoogleApiClientConnecting.this;
            super((byte)0);
            mProgressCallbacksMap = map;
        }
    }

    private final class GetRemoteServiceTask extends WorkerThreadTask
    {

        private final ArrayList mClients;
        final GoogleApiClientConnecting this$0;

        public final void runLocked()
        {
            if (mHolder.mApiClient.mValidatedScopes.isEmpty())
            {
                mHolder.mApiClient.mValidatedScopes = determineValidatedScopes();
            }
            for (Iterator iterator = mClients.iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.Api.Client)iterator.next()).getRemoteService(mResolvedAccountAccessor, mHolder.mApiClient.mValidatedScopes)) { }
        }

        public GetRemoteServiceTask(ArrayList arraylist)
        {
            this$0 = GoogleApiClientConnecting.this;
            super((byte)0);
            mClients = arraylist;
        }
    }

    private final class SignInConnectionCallbacks
        implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    {

        final GoogleApiClientConnecting this$0;

        public final void onConnected(Bundle bundle)
        {
            mSignInClient.resolveAccount(new AccountResolutionCallbackHandler(GoogleApiClientConnecting.this));
        }

        public final void onConnectionFailed(ConnectionResult connectionresult)
        {
            mLock.lock();
            if (!shouldSkipSignInLocked(connectionresult)) goto _L2; else goto _L1
_L1:
            cancelSignInLocked();
            startGetRemoteServiceLocked();
_L4:
            mLock.unlock();
            return;
_L2:
            handleConnectionFailureLocked(connectionresult);
            if (true) goto _L4; else goto _L3
_L3:
            connectionresult;
            mLock.unlock();
            throw connectionresult;
        }

        public final void onConnectionSuspended(int i)
        {
        }

        private SignInConnectionCallbacks()
        {
            this$0 = GoogleApiClientConnecting.this;
            super();
        }

        SignInConnectionCallbacks(byte byte0)
        {
            this();
        }
    }

    private final class ValidateAccountTask extends WorkerThreadTask
    {

        private final ArrayList mClients;
        final GoogleApiClientConnecting this$0;

        public final void runLocked()
        {
            for (Iterator iterator = mClients.iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.Api.Client)iterator.next()).validateAccount(mResolvedAccountAccessor)) { }
        }

        public ValidateAccountTask(ArrayList arraylist)
        {
            this$0 = GoogleApiClientConnecting.this;
            super((byte)0);
            mClients = arraylist;
        }
    }

    private abstract class WorkerThreadTask
        implements Runnable
    {

        final GoogleApiClientConnecting this$0;

        public void run()
        {
            mLock.lock();
            boolean flag = Thread.interrupted();
            if (flag)
            {
                mLock.unlock();
                return;
            }
            runLocked();
            mLock.unlock();
            return;
            RuntimeException runtimeexception;
            runtimeexception;
            GoogleApiClientStateHolder googleapiclientstateholder = mHolder;
            android.os.Message message = googleapiclientstateholder.mHandlerForTasks.obtainMessage(2, runtimeexception);
            googleapiclientstateholder.mHandlerForTasks.sendMessage(message);
            mLock.unlock();
            return;
            Exception exception;
            exception;
            mLock.unlock();
            throw exception;
        }

        protected abstract void runLocked();

        private WorkerThreadTask()
        {
            this$0 = GoogleApiClientConnecting.this;
            super();
        }

        WorkerThreadTask(byte byte0)
        {
            this();
        }
    }


    boolean mAccountResolved;
    private final GoogleApiAvailability mApiAvailability;
    private final Map mApiTypeMap;
    private ArrayList mAsyncTasks;
    private final ClientSettings mClientSettings;
    private final Bundle mConnectionHints = new Bundle();
    private int mConnectionStep;
    final Context mContext;
    final GoogleApiClientStateHolder mHolder;
    final Lock mLock;
    private final Set mOptionalApisWithSignIn = new HashSet();
    boolean mPerformSignIn;
    private int mRemainingConnections;
    IAccountAccessor mResolvedAccountAccessor;
    boolean mSaveDefaultAccount;
    boolean mShowCrossClientAuthToast;
    private final com.google.android.gms.common.api.Api.AbstractClientBuilder mSignInApiBuilder;
    private int mSignInApiType;
    SignInClient mSignInClient;
    private boolean mWaitingToDisconnect;
    private ConnectionResult mWorstFailure;
    private int mWorstFailurePriority;

    public GoogleApiClientConnecting(GoogleApiClientStateHolder googleapiclientstateholder, ClientSettings clientsettings, Map map, GoogleApiAvailability googleapiavailability, com.google.android.gms.common.api.Api.AbstractClientBuilder abstractclientbuilder, Lock lock, Context context)
    {
        mConnectionStep = 0;
        mWaitingToDisconnect = false;
        mAsyncTasks = new ArrayList();
        mHolder = googleapiclientstateholder;
        mClientSettings = clientsettings;
        mApiTypeMap = map;
        mApiAvailability = googleapiavailability;
        mSignInApiBuilder = abstractclientbuilder;
        mLock = lock;
        mContext = context;
    }

    private void cancelAsyncTasks()
    {
        for (Iterator iterator = mAsyncTasks.iterator(); iterator.hasNext(); ((Future)iterator.next()).cancel(true)) { }
        mAsyncTasks.clear();
    }

    private void disconnectSignInClient(boolean flag)
    {
        if (mSignInClient != null)
        {
            if (mSignInClient.isConnected() && flag)
            {
                mSignInClient.clearAccountFromSessionStore();
            }
            mSignInClient.disconnect();
            mResolvedAccountAccessor = null;
        }
    }

    private void endGetRemoteServiceLocked()
    {
        Object obj;
        obj = mHolder;
        ((GoogleApiClientStateHolder) (obj)).mLock.lock();
        ((GoogleApiClientStateHolder) (obj)).mApiClient.stopResumingLocked();
        obj.mState = new GoogleApiClientConnected(((GoogleApiClientStateHolder) (obj)));
        ((GoogleApiClientStateHolder) (obj)).mState.begin();
        ((GoogleApiClientStateHolder) (obj)).mStateChanged.signalAll();
        ((GoogleApiClientStateHolder) (obj)).mLock.unlock();
        GoogleApiExecutor.getInstance().execute(new Runnable() {

            final GoogleApiClientConnecting this$0;

            public final void run()
            {
                GoogleApiAvailability.cancelAvailabilityErrorNotifications(mContext);
            }

            
            {
                this$0 = GoogleApiClientConnecting.this;
                super();
            }
        });
        if (mSignInClient != null)
        {
            if (mSaveDefaultAccount)
            {
                mSignInClient.saveDefaultAccount(mResolvedAccountAccessor, mShowCrossClientAuthToast);
            }
            disconnectSignInClient(false);
        }
        com.google.android.gms.common.api.Api.ClientKey clientkey;
        for (obj = mHolder.mFailedConnections.keySet().iterator(); ((Iterator) (obj)).hasNext(); ((com.google.android.gms.common.api.Api.Client)mHolder.mClients.get(clientkey)).disconnect())
        {
            clientkey = (com.google.android.gms.common.api.Api.ClientKey)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_186;
        Exception exception;
        exception;
        ((GoogleApiClientStateHolder) (obj)).mLock.unlock();
        throw exception;
        Bundle bundle;
        if (mConnectionHints.isEmpty())
        {
            bundle = null;
        } else
        {
            bundle = mConnectionHints;
        }
        mHolder.mInternalCallbacks.handleOnConnectionSuccess(bundle);
        if (mWaitingToDisconnect)
        {
            mWaitingToDisconnect = false;
            disconnect();
        }
        return;
    }

    private static String printStep(int i)
    {
        switch (i)
        {
        default:
            return "UNKNOWN";

        case 0: // '\0'
            return "STEP_GETTING_SERVICE_BINDINGS";

        case 1: // '\001'
            return "STEP_VALIDATING_ACCOUNT";

        case 2: // '\002'
            return "STEP_AUTHENTICATING";

        case 3: // '\003'
            return "STEP_GETTING_REMOTE_SERVICE";
        }
    }

    public final void begin()
    {
        mHolder.mFailedConnections.clear();
        mWaitingToDisconnect = false;
        mPerformSignIn = false;
        mWorstFailure = null;
        mConnectionStep = 0;
        mSignInApiType = 2;
        mAccountResolved = false;
        mSaveDefaultAccount = false;
        boolean flag = false;
        HashMap hashmap = new HashMap();
        Iterator iterator = mApiTypeMap.keySet().iterator();
        while (iterator.hasNext()) 
        {
            Api api = (Api)iterator.next();
            com.google.android.gms.common.api.Api.Client client = (com.google.android.gms.common.api.Api.Client)mHolder.mClients.get(api.getClientKey());
            int i = ((Integer)mApiTypeMap.get(api)).intValue();
            boolean flag1;
            if (api.getClientBuilder().getPriority() == 1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag |= flag1;
            if (!client.requiresSignIn())
            {
                continue;
            }
            mPerformSignIn = true;
            if (i < mSignInApiType)
            {
                mSignInApiType = i;
            }
            if (i != 0)
            {
                mOptionalApisWithSignIn.add(api.getClientKey());
            }
            hashmap.put(client, new ConnectionProgressReportCallbacksImpl(this, api, i));
        }
        if (flag)
        {
            mPerformSignIn = false;
        }
        if (mPerformSignIn)
        {
            mClientSettings.mSessionId = Integer.valueOf(System.identityHashCode(mHolder.mApiClient));
            SignInConnectionCallbacks signinconnectioncallbacks = new SignInConnectionCallbacks((byte)0);
            mSignInClient = (SignInClient)mSignInApiBuilder.buildClient(mContext, mHolder.mApiClient.mLooper, mClientSettings, mClientSettings.mSignInOptions, signinconnectioncallbacks, signinconnectioncallbacks);
        }
        mRemainingConnections = mHolder.mClients.size();
        mAsyncTasks.add(GoogleApiExecutor.getInstance().submit(new ConnectionTask(hashmap)));
    }

    final void cancelSignInLocked()
    {
        mPerformSignIn = false;
        mHolder.mApiClient.mValidatedScopes = Collections.emptySet();
        Iterator iterator = mOptionalApisWithSignIn.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.gms.common.api.Api.ClientKey clientkey = (com.google.android.gms.common.api.Api.ClientKey)iterator.next();
            if (!mHolder.mFailedConnections.containsKey(clientkey))
            {
                mHolder.mFailedConnections.put(clientkey, new ConnectionResult(17, null));
            }
        } while (true);
    }

    final boolean checkStepLocked(int i)
    {
        if (mConnectionStep != i)
        {
            Log.i("GoogleApiClientConnecting", mHolder.mApiClient.dumpToString());
            Log.wtf("GoogleApiClientConnecting", (new StringBuilder("GoogleApiClient connecting is in step ")).append(printStep(mConnectionStep)).append(" but received callback for step ").append(printStep(i)).toString(), new Exception());
            handleConnectionFailureLocked(new ConnectionResult(8, null));
            return false;
        } else
        {
            return true;
        }
    }

    public final void connect()
    {
        mWaitingToDisconnect = false;
    }

    final Set determineValidatedScopes()
    {
        if (mClientSettings != null) goto _L2; else goto _L1
_L1:
        Object obj = Collections.emptySet();
_L4:
        return ((Set) (obj));
_L2:
        HashSet hashset = new HashSet(mClientSettings.mRequiredScopes);
        Map map = mClientSettings.mOptionalApiSettingsMap;
        Iterator iterator = map.keySet().iterator();
        do
        {
            obj = hashset;
            if (!iterator.hasNext())
            {
                continue;
            }
            obj = (Api)iterator.next();
            if (!mHolder.mFailedConnections.containsKey(((Api) (obj)).getClientKey()))
            {
                hashset.addAll(((com.google.android.gms.common.internal.ClientSettings.OptionalApiSettings)map.get(obj)).mScopes);
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void disconnect()
    {
        for (Iterator iterator = mHolder.mApiClient.mWorkQueue.iterator(); iterator.hasNext(); iterator.remove())
        {
            ((GoogleApiClientImpl.Runner)iterator.next()).cancel();
        }

        if (mWorstFailure == null && !mHolder.mApiClient.mWorkQueue.isEmpty())
        {
            mWaitingToDisconnect = true;
            return;
        } else
        {
            cancelAsyncTasks();
            disconnectSignInClient(true);
            mHolder.changeToDisconnected(null);
            return;
        }
    }

    public final BaseImplementation.ApiMethodImpl enqueue(BaseImplementation.ApiMethodImpl apimethodimpl)
    {
        mHolder.mApiClient.mWorkQueue.add(apimethodimpl);
        return apimethodimpl;
    }

    public final BaseImplementation.ApiMethodImpl execute(BaseImplementation.ApiMethodImpl apimethodimpl)
    {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    final void handleConnectionFailureLocked(ConnectionResult connectionresult)
    {
        cancelAsyncTasks();
        boolean flag;
        if (!connectionresult.hasResolution())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        disconnectSignInClient(flag);
        mHolder.changeToDisconnected(connectionresult);
        if (!mWaitingToDisconnect)
        {
            mHolder.mInternalCallbacks.handleOnConnectionFailed(connectionresult);
        }
        mWaitingToDisconnect = false;
    }

    final boolean onClientStepCallback()
    {
        mRemainingConnections = mRemainingConnections - 1;
        if (mRemainingConnections > 0)
        {
            return false;
        }
        if (mRemainingConnections < 0)
        {
            Log.i("GoogleApiClientConnecting", mHolder.mApiClient.dumpToString());
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            handleConnectionFailureLocked(new ConnectionResult(8, null));
            return false;
        }
        if (mWorstFailure != null)
        {
            mHolder.mLastConnectionFailurePriority = mWorstFailurePriority;
            handleConnectionFailureLocked(mWorstFailure);
            return false;
        } else
        {
            return true;
        }
    }

    public final void onConnected(Bundle bundle)
    {
        if (checkStepLocked(3))
        {
            if (bundle != null)
            {
                mConnectionHints.putAll(bundle);
            }
            if (onClientStepCallback())
            {
                endGetRemoteServiceLocked();
                return;
            }
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionresult, Api api, int i)
    {
        if (checkStepLocked(3))
        {
            recordFailedConnectionLocked(connectionresult, api, i);
            if (onClientStepCallback())
            {
                endGetRemoteServiceLocked();
                return;
            }
        }
    }

    public final void onConnectionSuspended(int i)
    {
        handleConnectionFailureLocked(new ConnectionResult(8, null));
    }

    final void recordFailedConnectionLocked(ConnectionResult connectionresult, Api api, int i)
    {
        boolean flag = true;
        if (i == 2) goto _L2; else goto _L1
_L1:
        int j = api.getClientBuilder().getPriority();
        if (i != 1) goto _L4; else goto _L3
_L3:
        if (connectionresult.hasResolution())
        {
            i = 1;
        } else
        if (GoogleApiAvailability.getErrorResolutionIntent(null, connectionresult.mStatusCode, null) != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0) goto _L5; else goto _L4
_L4:
        i = ((flag) ? 1 : 0);
        if (mWorstFailure == null) goto _L7; else goto _L6
_L6:
        if (j >= mWorstFailurePriority) goto _L5; else goto _L8
_L8:
        i = ((flag) ? 1 : 0);
_L7:
        if (i != 0)
        {
            mWorstFailure = connectionresult;
            mWorstFailurePriority = j;
        }
_L2:
        mHolder.mFailedConnections.put(api.getClientKey(), connectionresult);
        return;
_L5:
        i = 0;
        if (true) goto _L7; else goto _L9
_L9:
    }

    final boolean shouldSkipSignInLocked(ConnectionResult connectionresult)
    {
        return mSignInApiType == 2 || mSignInApiType == 1 && !connectionresult.hasResolution();
    }

    final void startAuthAccountLocked()
    {
        mConnectionStep = 2;
        mHolder.mApiClient.mValidatedScopes = determineValidatedScopes();
        mAsyncTasks.add(GoogleApiExecutor.getInstance().submit(new AuthAccountTask((byte)0)));
    }

    final void startGetRemoteServiceLocked()
    {
        ArrayList arraylist = new ArrayList();
        mConnectionStep = 3;
        mRemainingConnections = mHolder.mClients.size();
        Iterator iterator = mHolder.mClients.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.gms.common.api.Api.ClientKey clientkey = (com.google.android.gms.common.api.Api.ClientKey)iterator.next();
            if (mHolder.mFailedConnections.containsKey(clientkey))
            {
                if (onClientStepCallback())
                {
                    endGetRemoteServiceLocked();
                }
            } else
            {
                arraylist.add(mHolder.mClients.get(clientkey));
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            mAsyncTasks.add(GoogleApiExecutor.getInstance().submit(new GetRemoteServiceTask(arraylist)));
        }
    }

    final void tryEndServiceBindingLocked()
    {
        if (mRemainingConnections == 0)
        {
            if (mPerformSignIn)
            {
                if (mAccountResolved)
                {
                    ArrayList arraylist = new ArrayList();
                    mConnectionStep = 1;
                    mRemainingConnections = mHolder.mClients.size();
                    Iterator iterator = mHolder.mClients.keySet().iterator();
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        com.google.android.gms.common.api.Api.ClientKey clientkey = (com.google.android.gms.common.api.Api.ClientKey)iterator.next();
                        if (mHolder.mFailedConnections.containsKey(clientkey))
                        {
                            if (onClientStepCallback())
                            {
                                startAuthAccountLocked();
                            }
                        } else
                        {
                            arraylist.add(mHolder.mClients.get(clientkey));
                        }
                    } while (true);
                    if (!arraylist.isEmpty())
                    {
                        mAsyncTasks.add(GoogleApiExecutor.getInstance().submit(new ValidateAccountTask(arraylist)));
                        return;
                    }
                }
            } else
            {
                startGetRemoteServiceLocked();
                return;
            }
        }
    }
}
