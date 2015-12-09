// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.common.internal:
//            GmsClientSupervisor, Preconditions, ClientSettings, GetServiceRequest, 
//            IAccountAccessor, IGmsServiceBroker, ValidateAccountRequest

public abstract class GmsClient
    implements com.google.android.gms.common.api.Api.Client, GmsClientEventManager.GmsClientEventState
{
    private abstract class ApiServiceCallback extends CallbackProxy
    {

        public final Bundle resolution;
        public final int statusCode;
        final GmsClient this$0;

        protected final volatile void deliverCallback(Object obj)
        {
            Object obj1 = null;
            if ((Boolean)obj != null) goto _L2; else goto _L1
_L1:
            setConnectState(1);
_L4:
            return;
_L2:
            switch (statusCode)
            {
            default:
                setConnectState(1);
                obj = obj1;
                if (resolution != null)
                {
                    obj = (PendingIntent)resolution.getParcelable("pendingIntent");
                }
                handleServiceFailure(new ConnectionResult(statusCode, ((PendingIntent) (obj))));
                return;

            case 0: // '\0'
                if (!handleServiceSuccess())
                {
                    setConnectState(1);
                    handleServiceFailure(new ConnectionResult(8, null));
                    return;
                }
                break;

            case 10: // '\n'
                setConnectState(1);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        protected abstract void handleServiceFailure(ConnectionResult connectionresult);

        protected abstract boolean handleServiceSuccess();

        protected final void onDeliverCallbackFailed()
        {
        }

        protected ApiServiceCallback(int i, Bundle bundle)
        {
            this$0 = GmsClient.this;
            super(Boolean.valueOf(true));
            statusCode = i;
            resolution = bundle;
        }
    }

    final class CallbackHandler extends Handler
    {

        final GmsClient this$0;

        private static void deliverCallbackFailed(Message message)
        {
            message = (CallbackProxy)message.obj;
            message.onDeliverCallbackFailed();
            message.unregister();
        }

        private static boolean hasCallback(Message message)
        {
            return message.what == 2 || message.what == 1 || message.what == 5 || message.what == 6;
        }

        public final void handleMessage(Message message)
        {
            if (mDisconnectCount.get() != message.arg1)
            {
                if (hasCallback(message))
                {
                    deliverCallbackFailed(message);
                }
                return;
            }
            if ((message.what == 1 || message.what == 5 || message.what == 6) && !isConnecting())
            {
                deliverCallbackFailed(message);
                return;
            }
            if (message.what == 3)
            {
                message = new ConnectionResult(message.arg2, null);
                mConnectionProgressReportCallbacks.onReportServiceBinding(message);
                onConnectionFailed(message);
                return;
            }
            if (message.what == 4)
            {
                setConnectState(4);
                if (mConnectionCallbacks != null)
                {
                    mConnectionCallbacks.onConnectionSuspended(message.arg2);
                }
                onConnectionSuspended(message.arg2);
                compareAndSetConnectState(4, 1, null);
                return;
            }
            if (message.what == 2 && !isConnected())
            {
                deliverCallbackFailed(message);
                return;
            }
            if (!hasCallback(message))
            {
                break MISSING_BLOCK_LABEL_305;
            }
            Object obj;
            synchronized ((CallbackProxy)message.obj)
            {
                obj = ((CallbackProxy) (message)).mListener;
                if (((CallbackProxy) (message)).mCallbackDelivered)
                {
                    Log.w("GmsClient", (new StringBuilder("Callback proxy ")).append(message).append(" being reused. This is not safe.").toString());
                }
            }
            if (obj != null)
            {
                try
                {
                    message.deliverCallback(obj);
                }
                catch (RuntimeException runtimeexception)
                {
                    message.onDeliverCallbackFailed();
                    throw runtimeexception;
                }
            } else
            {
                message.onDeliverCallbackFailed();
            }
            message;
            JVM INSTR monitorenter ;
            message.mCallbackDelivered = true;
            message;
            JVM INSTR monitorexit ;
            message.unregister();
            return;
            exception;
            message;
            JVM INSTR monitorexit ;
            throw exception;
            Exception exception1;
            exception1;
            message;
            JVM INSTR monitorexit ;
            throw exception1;
            Log.wtf("GmsClient", (new StringBuilder("Don't know how to handle message: ")).append(message.what).toString(), new Exception());
            return;
        }

        public CallbackHandler(Looper looper)
        {
            this$0 = GmsClient.this;
            super(looper);
        }
    }

    protected abstract class CallbackProxy
    {

        boolean mCallbackDelivered;
        Object mListener;
        final GmsClient this$0;

        public abstract void deliverCallback(Object obj);

        public abstract void onDeliverCallbackFailed();

        public final void removeListener()
        {
            this;
            JVM INSTR monitorenter ;
            mListener = null;
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void unregister()
        {
            removeListener();
            synchronized (mCallbackProxyList)
            {
                mCallbackProxyList.remove(this);
            }
            return;
            exception;
            arraylist;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public CallbackProxy(Object obj)
        {
            this$0 = GmsClient.this;
            super();
            mListener = obj;
            mCallbackDelivered = false;
        }
    }

    public static final class GmsCallbacks extends IGmsCallbacks.Stub
    {

        private final int mDisconnectCount;
        private GmsClient mGmsClient;

        public final void onAccountValidationComplete(int i, Bundle bundle)
        {
            Preconditions.checkNotNull(mGmsClient, "onAccountValidationComplete can be called only once per call to validateAccount");
            GmsClient gmsclient = mGmsClient;
            int j = mDisconnectCount;
            gmsclient.mHandler.sendMessage(gmsclient.mHandler.obtainMessage(5, j, -1, gmsclient. new PostValidationCallback(i, bundle)));
            mGmsClient = null;
        }

        public final void onPostInitComplete(int i, IBinder ibinder, Bundle bundle)
        {
            Preconditions.checkNotNull(mGmsClient, "onPostInitComplete can be called only once per call to getRemoteService");
            mGmsClient.onPostInitHandler(i, ibinder, bundle, mDisconnectCount);
            mGmsClient = null;
        }

        public GmsCallbacks(GmsClient gmsclient, int i)
        {
            mGmsClient = gmsclient;
            mDisconnectCount = i;
        }
    }

    public final class GmsServiceConnection
        implements ServiceConnection
    {

        private final int mDisconnectCount;
        final GmsClient this$0;

        public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            Preconditions.checkNotNull(ibinder, "Expecting a valid IBinder");
            mServiceBroker = IGmsServiceBroker.Stub.asInterface(ibinder);
            componentname = GmsClient.this;
            int i = mDisconnectCount;
            ((GmsClient) (componentname)).mHandler.sendMessage(((GmsClient) (componentname)).mHandler.obtainMessage(6, i, -1, componentname. new PostServiceBindingCallback()));
        }

        public final void onServiceDisconnected(ComponentName componentname)
        {
            mHandler.sendMessage(mHandler.obtainMessage(4, mDisconnectCount, 1));
        }

        public GmsServiceConnection(int i)
        {
            this$0 = GmsClient.this;
            super();
            mDisconnectCount = i;
        }
    }

    protected final class LegacyClientCallbackAdapter
        implements com.google.android.gms.common.api.GoogleApiClient.ConnectionProgressReportCallbacks
    {

        final GmsClient this$0;

        public final void onReportAccountValidation(ConnectionResult connectionresult)
        {
            throw new IllegalStateException("Legacy GmsClient received onReportAccountValidation callback.");
        }

        public final void onReportServiceBinding(ConnectionResult connectionresult)
        {
            if (connectionresult.isSuccess())
            {
                getRemoteService(null, mScopes);
            } else
            if (mConnectionFailedListener != null)
            {
                mConnectionFailedListener.onConnectionFailed(connectionresult);
                return;
            }
        }

        public LegacyClientCallbackAdapter()
        {
            this$0 = GmsClient.this;
            super();
        }
    }

    protected final class PostInitCallback extends ApiServiceCallback
    {

        public final IBinder service;
        final GmsClient this$0;

        protected final void handleServiceFailure(ConnectionResult connectionresult)
        {
            if (mConnectionFailedListener != null)
            {
                mConnectionFailedListener.onConnectionFailed(connectionresult);
            }
            onConnectionFailed(connectionresult);
        }

        protected final boolean handleServiceSuccess()
        {
            String s;
            try
            {
                s = service.getInterfaceDescriptor();
            }
            catch (RemoteException remoteexception)
            {
                Log.w("GmsClient", "service probably died");
                return false;
            }
            if (!getServiceDescriptor().equals(s))
            {
                Log.e("GmsClient", (new StringBuilder("service descriptor mismatch: ")).append(getServiceDescriptor()).append(" vs. ").append(s).toString());
            } else
            {
                IInterface iinterface = createServiceInterface(service);
                if (iinterface != null && compareAndSetConnectState(2, 3, iinterface))
                {
                    Bundle bundle = getConnectionHint();
                    if (mConnectionCallbacks != null)
                    {
                        mConnectionCallbacks.onConnected(bundle);
                    }
                    return true;
                }
            }
            return false;
        }

        public PostInitCallback(int i, IBinder ibinder, Bundle bundle)
        {
            this$0 = GmsClient.this;
            super(i, bundle);
            service = ibinder;
        }
    }

    protected final class PostServiceBindingCallback extends ApiServiceCallback
    {

        final GmsClient this$0;

        protected final void handleServiceFailure(ConnectionResult connectionresult)
        {
            mConnectionProgressReportCallbacks.onReportServiceBinding(connectionresult);
            onConnectionFailed(connectionresult);
        }

        protected final boolean handleServiceSuccess()
        {
            mConnectionProgressReportCallbacks.onReportServiceBinding(ConnectionResult.RESULT_SUCCESS);
            return true;
        }

        public PostServiceBindingCallback()
        {
            this$0 = GmsClient.this;
            super(0, null);
        }
    }

    protected final class PostValidationCallback extends ApiServiceCallback
    {

        final GmsClient this$0;

        protected final void handleServiceFailure(ConnectionResult connectionresult)
        {
            mConnectionProgressReportCallbacks.onReportAccountValidation(connectionresult);
            onConnectionFailed(connectionresult);
        }

        protected final boolean handleServiceSuccess()
        {
            mConnectionProgressReportCallbacks.onReportAccountValidation(ConnectionResult.RESULT_SUCCESS);
            return true;
        }

        public PostValidationCallback(int i, Bundle bundle)
        {
            this$0 = GmsClient.this;
            super(i, bundle);
        }
    }


    public static final String GOOGLE_PLUS_REQUIRED_FEATURES[] = {
        "service_esmobile", "service_googleme"
    };
    private final Account mAccount;
    private final GoogleApiAvailability mApiAvailability;
    private final ArrayList mCallbackProxyList;
    public final ClientSettings mClientSettings;
    private int mConnectState;
    private GmsServiceConnection mConnection;
    private final com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks mConnectionCallbacks;
    private final com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener mConnectionFailedListener;
    private com.google.android.gms.common.api.GoogleApiClient.ConnectionProgressReportCallbacks mConnectionProgressReportCallbacks;
    public final Context mContext;
    protected AtomicInteger mDisconnectCount;
    private final int mGCoreServiceId;
    final Handler mHandler;
    private final Object mLock;
    private final Looper mLooper;
    private final Set mScopes;
    private IInterface mService;
    private IGmsServiceBroker mServiceBroker;
    private final GmsClientSupervisor mSupervisor;

    public GmsClient(Context context, Looper looper, int i, ClientSettings clientsettings, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        this(context, looper, GmsClientSupervisor.getInstance(context), GoogleApiAvailability.getInstance(), i, clientsettings, (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)Preconditions.checkNotNull(connectioncallbacks), (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)Preconditions.checkNotNull(onconnectionfailedlistener));
    }

    public GmsClient(Context context, Looper looper, ClientSettings clientsettings)
    {
        this(context, looper, GmsClientSupervisor.getInstance(context), GoogleApiAvailability.getInstance(), 25, clientsettings, null, null);
    }

    private GmsClient(Context context, Looper looper, GmsClientSupervisor gmsclientsupervisor, GoogleApiAvailability googleapiavailability, int i, ClientSettings clientsettings, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, 
            com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        mLock = new Object();
        mCallbackProxyList = new ArrayList();
        mConnectState = 1;
        mDisconnectCount = new AtomicInteger(0);
        mContext = (Context)Preconditions.checkNotNull(context, "Context must not be null");
        mLooper = (Looper)Preconditions.checkNotNull(looper, "Looper must not be null");
        mSupervisor = (GmsClientSupervisor)Preconditions.checkNotNull(gmsclientsupervisor, "Supervisor must not be null");
        mApiAvailability = (GoogleApiAvailability)Preconditions.checkNotNull(googleapiavailability, "API availability must not be null");
        mHandler = new CallbackHandler(looper);
        mGCoreServiceId = i;
        mClientSettings = (ClientSettings)Preconditions.checkNotNull(clientsettings);
        mAccount = clientsettings.mAccount;
        mScopes = validateScopesDisallowingExpansion(clientsettings.mAllRequestedScopes);
        mConnectionCallbacks = connectioncallbacks;
        mConnectionFailedListener = onconnectionfailedlistener;
    }

    private boolean compareAndSetConnectState(int i, int j, IInterface iinterface)
    {
label0:
        {
            synchronized (mLock)
            {
                if (mConnectState == i)
                {
                    break label0;
                }
            }
            return false;
        }
        setConnectState(j, iinterface);
        obj;
        JVM INSTR monitorexit ;
        return true;
        iinterface;
        obj;
        JVM INSTR monitorexit ;
        throw iinterface;
    }

    private void setConnectState(int i, IInterface iinterface)
    {
        boolean flag2 = true;
        Object obj;
        boolean flag;
        boolean flag1;
        if (i == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (iinterface != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag != flag1)
        {
            flag2 = false;
        }
        Preconditions.checkArgument(flag2);
        obj = mLock;
        obj;
        JVM INSTR monitorenter ;
        mConnectState = i;
        mService = iinterface;
        i;
        JVM INSTR tableswitch 1 3: default 288
    //                   1 251
    //                   2 79
    //                   3 244;
           goto _L1 _L2 _L3 _L4
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (mConnection != null)
        {
            Log.e("GmsClient", (new StringBuilder("Calling connect() while still connected, missing disconnect() for ")).append(getStartServiceAction()).toString());
            mSupervisor.unbindService(getStartServiceAction(), mConnection, mClientSettings.mRealClientClassName);
            mDisconnectCount.incrementAndGet();
        }
        mConnection = new GmsServiceConnection(mDisconnectCount.get());
        if (!mSupervisor.bindService(getStartServiceAction(), mConnection, mClientSettings.mRealClientClassName))
        {
            Log.e("GmsClient", (new StringBuilder("unable to connect to service: ")).append(getStartServiceAction()).toString());
            mHandler.sendMessage(mHandler.obtainMessage(3, mDisconnectCount.get(), 9));
        }
          goto _L1
        iinterface;
        obj;
        JVM INSTR monitorexit ;
        throw iinterface;
_L4:
        onConnectedLocked();
          goto _L1
_L2:
        if (mConnection == null) goto _L1; else goto _L5
_L5:
        mSupervisor.unbindService(getStartServiceAction(), mConnection, mClientSettings.mRealClientClassName);
        mConnection = null;
          goto _L1
    }

    private void triggerConnectionSuspended$13462e()
    {
        mHandler.sendMessage(mHandler.obtainMessage(4, mDisconnectCount.get(), 1));
    }

    private Set validateScopesDisallowingExpansion(Set set)
    {
        Set set1 = validateScopes(set);
        if (set1 != null)
        {
            Iterator iterator = set1.iterator();
            while (iterator.hasNext()) 
            {
                if (!set.contains((Scope)iterator.next()))
                {
                    throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
                }
            }
        }
        return set1;
    }

    public void checkAvailabilityAndConnect()
    {
        int i = GoogleApiAvailability.isGooglePlayServicesAvailable(mContext);
        if (i != 0)
        {
            setConnectState(1, null);
            mConnectionProgressReportCallbacks = new LegacyClientCallbackAdapter();
            mHandler.sendMessage(mHandler.obtainMessage(3, mDisconnectCount.get(), i));
            return;
        } else
        {
            connect(new LegacyClientCallbackAdapter());
            return;
        }
    }

    public final void checkConnected()
    {
        if (!isConnected())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else
        {
            return;
        }
    }

    public void connect(com.google.android.gms.common.api.GoogleApiClient.ConnectionProgressReportCallbacks connectionprogressreportcallbacks)
    {
        mConnectionProgressReportCallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionProgressReportCallbacks)Preconditions.checkNotNull(connectionprogressreportcallbacks, "Connection progress callbacks cannot be null.");
        setConnectState(2, null);
    }

    public abstract IInterface createServiceInterface(IBinder ibinder);

    public void disconnect()
    {
        mDisconnectCount.incrementAndGet();
        ArrayList arraylist = mCallbackProxyList;
        arraylist;
        JVM INSTR monitorenter ;
        int j = mCallbackProxyList.size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((CallbackProxy)mCallbackProxyList.get(i)).removeListener();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        mCallbackProxyList.clear();
        arraylist;
        JVM INSTR monitorexit ;
        setConnectState(1, null);
        return;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void doCallbackDEPRECATED(CallbackProxy callbackproxy)
    {
        synchronized (mCallbackProxyList)
        {
            mCallbackProxyList.add(callbackproxy);
        }
        mHandler.sendMessage(mHandler.obtainMessage(2, mDisconnectCount.get(), -1, callbackproxy));
        return;
        callbackproxy;
        arraylist;
        JVM INSTR monitorexit ;
        throw callbackproxy;
    }

    public final void dump$ec96877(String s, PrintWriter printwriter)
    {
        IInterface iinterface;
        int i;
        synchronized (mLock)
        {
            i = mConnectState;
            iinterface = mService;
        }
        printwriter.append(s).append("mConnectState=");
        i;
        JVM INSTR tableswitch 1 4: default 64
    //                   1 127
    //                   2 97
    //                   3 107
    //                   4 117;
           goto _L1 _L2 _L3 _L4 _L5
_L2:
        break MISSING_BLOCK_LABEL_127;
_L1:
        printwriter.print("UNKNOWN");
_L6:
        printwriter.append(" mService=");
        if (iinterface == null)
        {
            printwriter.println("null");
            return;
        } else
        {
            printwriter.append(getServiceDescriptor()).append("@").println(Integer.toHexString(System.identityHashCode(iinterface.asBinder())));
            return;
        }
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
_L3:
        printwriter.print("CONNECTING");
          goto _L6
_L4:
        printwriter.print("CONNECTED");
          goto _L6
_L5:
        printwriter.print("DISCONNECTING");
          goto _L6
        printwriter.print("DISCONNECTED");
          goto _L6
    }

    public Bundle getConnectionHint()
    {
        return null;
    }

    public Bundle getGetServiceRequestExtraArgs()
    {
        return new Bundle();
    }

    public final void getRemoteService(IAccountAccessor iaccountaccessor, Set set)
    {
        GetServiceRequest getservicerequest;
        Bundle bundle = getGetServiceRequestExtraArgs();
        getservicerequest = new GetServiceRequest(mGCoreServiceId);
        getservicerequest.callingPackage = mContext.getPackageName();
        getservicerequest.extraArgs = bundle;
        if (set == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        getservicerequest.setScopes(set);
        if (!requiresSignIn()) goto _L2; else goto _L1
_L1:
        if (mAccount == null) goto _L4; else goto _L3
_L3:
        set = mAccount;
_L5:
        getservicerequest.clientRequestedAccount = set;
        if (iaccountaccessor == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        getservicerequest.accountAccessorBinder = iaccountaccessor.asBinder();
_L7:
        mServiceBroker.getService(new GmsCallbacks(this, mDisconnectCount.get()), getservicerequest);
        return;
_L4:
        try
        {
            set = new Account("<<default account>>", "com.google");
        }
        // Misplaced declaration of an exception variable
        catch (IAccountAccessor iaccountaccessor)
        {
            Log.w("GmsClient", "service died");
            triggerConnectionSuspended$13462e();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IAccountAccessor iaccountaccessor)
        {
            Log.w("GmsClient", "Remote exception occurred", iaccountaccessor);
            return;
        }
          goto _L5
_L2:
        if (!requiresAccount()) goto _L7; else goto _L6
_L6:
        getservicerequest.clientRequestedAccount = mAccount;
          goto _L7
    }

    public final IInterface getService()
        throws DeadObjectException
    {
        Object obj = mLock;
        obj;
        JVM INSTR monitorenter ;
        if (mConnectState == 4)
        {
            throw new DeadObjectException();
        }
        break MISSING_BLOCK_LABEL_28;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        checkConnected();
        IInterface iinterface;
        boolean flag;
        if (mService != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Client is connected but service is null");
        iinterface = mService;
        obj;
        JVM INSTR monitorexit ;
        return iinterface;
    }

    public abstract String getServiceDescriptor();

    public abstract String getStartServiceAction();

    public final boolean isConnected()
    {
        Object obj = mLock;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (mConnectState == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean isConnecting()
    {
        Object obj = mLock;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (mConnectState == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onConnectedLocked()
    {
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
    }

    public void onConnectionSuspended(int i)
    {
    }

    public void onPostInitHandler(int i, IBinder ibinder, Bundle bundle, int j)
    {
        mHandler.sendMessage(mHandler.obtainMessage(1, j, -1, new PostInitCallback(i, ibinder, bundle)));
    }

    public boolean requiresAccount()
    {
        return false;
    }

    public boolean requiresSignIn()
    {
        return false;
    }

    public final void validateAccount(IAccountAccessor iaccountaccessor)
    {
        iaccountaccessor = new ValidateAccountRequest(iaccountaccessor, (Scope[])mScopes.toArray(new Scope[mScopes.size()]), mContext.getPackageName(), null);
        try
        {
            mServiceBroker.validateAccount(new GmsCallbacks(this, mDisconnectCount.get()), iaccountaccessor);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IAccountAccessor iaccountaccessor)
        {
            Log.w("GmsClient", "service died");
            triggerConnectionSuspended$13462e();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IAccountAccessor iaccountaccessor)
        {
            Log.w("GmsClient", "Remote exception occurred", iaccountaccessor);
        }
    }

    public Set validateScopes(Set set)
    {
        return set;
    }



/*
    static IGmsServiceBroker access$002(GmsClient gmsclient, IGmsServiceBroker igmsservicebroker)
    {
        gmsclient.mServiceBroker = igmsservicebroker;
        return igmsservicebroker;
    }

*/







}
