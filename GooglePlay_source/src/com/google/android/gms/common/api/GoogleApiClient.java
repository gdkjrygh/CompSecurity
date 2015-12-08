// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.util.ArrayMap;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.ClientCallbacks;
import com.google.android.gms.common.api.internal.GoogleApiClientImpl;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.SupportLifecycleFragment;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignIn;
import com.google.android.gms.signin.SignInOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.gms.common.api:
//            Api, Scope

public abstract class GoogleApiClient
{
    public static final class Builder
    {

        private Account mAccount;
        private GoogleApiAvailability mApiAvailability;
        private final Map mApis;
        private int mAutoManageId;
        private final ArrayList mConnectedCallbacks;
        private final Context mContext;
        private final Set mImpliedScopes;
        public Looper mLooper;
        private final ArrayList mOnConnectionFailedListeners;
        private final Map mOptionalApis;
        private String mRealClientClassName;
        public String mRealClientPackageName;
        private final Set mRequiredScopes;
        private Api.AbstractClientBuilder mSignInApiBuilder;
        private SignInOptions mSignInOptions;

        public final Builder addApi(Api api)
        {
            Preconditions.checkNotNull(api, "Api must not be null");
            mApis.put(api, null);
            api = api.getClientBuilder().getImpliedScopes$505be9ea();
            mImpliedScopes.addAll(api);
            mRequiredScopes.addAll(api);
            return this;
        }

        public final Builder addApi(Api api, Api.ApiOptions.HasOptions hasoptions)
        {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(hasoptions, "Null options are not permitted for this Api");
            mApis.put(api, hasoptions);
            api = api.getClientBuilder().getImpliedScopes$505be9ea();
            mImpliedScopes.addAll(api);
            mRequiredScopes.addAll(api);
            return this;
        }

        public final Builder addScope(Scope scope)
        {
            Preconditions.checkNotNull(scope, "Scope must not be null");
            mRequiredScopes.add(scope);
            return this;
        }

        public final Builder addScopeNames(String as[])
        {
            for (int i = 0; i < as.length; i++)
            {
                mRequiredScopes.add(new Scope(as[i]));
            }

            return this;
        }

        public final GoogleApiClient build()
        {
            ClientSettings clientsettings;
            Map map;
            ArrayMap arraymap;
            ArrayMap arraymap1;
            ArrayList arraylist;
            Iterator iterator;
            boolean flag;
            if (!mApis.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "must call addApi() to add at least one API");
            clientsettings = buildClientSettings();
            map = clientsettings.mOptionalApiSettingsMap;
            arraymap = new ArrayMap();
            arraymap1 = new ArrayMap();
            arraylist = new ArrayList();
            iterator = mApis.keySet().iterator();
            while (iterator.hasNext()) 
            {
                Api api = (Api)iterator.next();
                Object obj2 = mApis.get(api);
                int i = 0;
                ClientCallbacks clientcallbacks;
                if (map.get(api) != null)
                {
                    if (((com.google.android.gms.common.internal.ClientSettings.OptionalApiSettings)map.get(api)).mIsRecoverable)
                    {
                        i = 1;
                    } else
                    {
                        i = 2;
                    }
                }
                arraymap.put(api, Integer.valueOf(i));
                clientcallbacks = new ClientCallbacks(api, i);
                arraylist.add(clientcallbacks);
                obj2 = api.getClientBuilder().buildClient(mContext, mLooper, clientsettings, obj2, clientcallbacks, clientcallbacks);
                arraymap1.put(api.getClientKey(), obj2);
            }
            int j = GoogleApiClientImpl.selectSignInModeAutomatically$251b1977(arraymap1.values());
            obj = new GoogleApiClientImpl(mContext, new ReentrantLock(), mLooper, clientsettings, mApiAvailability, mSignInApiBuilder, arraymap, mConnectedCallbacks, mOnConnectionFailedListeners, arraymap1, mAutoManageId, j, arraylist);
            synchronized (GoogleApiClient.sAllClients)
            {
                GoogleApiClient.sAllClients.add(obj);
            }
            if (mAutoManageId >= 0)
            {
                obj1 = SupportLifecycleFragment.getInstanceOrNull(null);
                if (obj1 != null)
                {
                    break MISSING_BLOCK_LABEL_364;
                }
                (new Handler(mContext.getMainLooper())).post(((_cls1) (obj)). new Runnable() {

                    final Builder this$0;
                    final GoogleApiClient val$apiClient;

                    public final void run()
                    {
                        throw new NullPointerException();
                    }

            
            {
                this$0 = final_builder;
                apiClient = GoogleApiClient.this;
                super();
            }
                });
            }
            return ((GoogleApiClient) (obj));
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
            startAutoManage(((SupportLifecycleFragment) (obj1)), ((GoogleApiClient) (obj)));
            return ((GoogleApiClient) (obj));
        }

        public final ClientSettings buildClientSettings()
        {
            SignInOptions signinoptions;
            if (mApis.containsKey(SignIn.API))
            {
                Account account;
                Set set;
                Map map;
                String s;
                String s1;
                boolean flag;
                if (mSignInOptions == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkState(flag, "SignIn.API can't be used in conjunction with requestServerAuthCode.");
                mSignInOptions = (SignInOptions)mApis.get(SignIn.API);
            }
            account = mAccount;
            set = mRequiredScopes;
            map = mOptionalApis;
            s = mRealClientPackageName;
            s1 = mRealClientClassName;
            if (mSignInOptions != null)
            {
                signinoptions = mSignInOptions;
            } else
            {
                signinoptions = SignInOptions.DEFAULT;
            }
            return new ClientSettings(account, set, map, 0, null, s, s1, signinoptions);
        }

        public final Builder setAccountName(String s)
        {
            if (s == null)
            {
                s = null;
            } else
            {
                s = new Account(s, "com.google");
            }
            mAccount = s;
            return this;
        }

        final void startAutoManage(SupportLifecycleFragment supportlifecyclefragment, GoogleApiClient googleapiclient)
        {
            int i = mAutoManageId;
            Preconditions.checkNotNull(googleapiclient, "GoogleApiClient instance cannot be null");
            com.google.android.gms.common.api.internal.SupportLifecycleFragment.ClientInfo clientinfo;
            boolean flag;
            if (supportlifecyclefragment.mClientInfoMap.indexOfKey(i) < 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, (new StringBuilder("Already managing a GoogleApiClient with id ")).append(i).toString());
            clientinfo = new com.google.android.gms.common.api.internal.SupportLifecycleFragment.ClientInfo(supportlifecyclefragment, i, googleapiclient, null);
            supportlifecyclefragment.mClientInfoMap.put(i, clientinfo);
            if (supportlifecyclefragment.mStarted && !supportlifecyclefragment.mResolvingError)
            {
                googleapiclient.connect();
            }
        }

        public Builder(Context context)
        {
            mRequiredScopes = new HashSet();
            mImpliedScopes = new HashSet();
            mOptionalApis = new ArrayMap();
            mApis = new ArrayMap();
            mAutoManageId = -1;
            mApiAvailability = GoogleApiAvailability.getInstance();
            mSignInApiBuilder = SignIn.CLIENT_BUILDER;
            mConnectedCallbacks = new ArrayList();
            mOnConnectionFailedListeners = new ArrayList();
            mContext = context;
            mLooper = context.getMainLooper();
            mRealClientPackageName = context.getPackageName();
            mRealClientClassName = context.getClass().getName();
        }

        public Builder(Context context, ConnectionCallbacks connectioncallbacks, OnConnectionFailedListener onconnectionfailedlistener)
        {
            this(context);
            Preconditions.checkNotNull(connectioncallbacks, "Must provide a connected listener");
            mConnectedCallbacks.add(connectioncallbacks);
            Preconditions.checkNotNull(onconnectionfailedlistener, "Must provide a connection failed listener");
            mOnConnectionFailedListeners.add(onconnectionfailedlistener);
        }
    }

    public static interface ConnectionCallbacks
    {

        public abstract void onConnected(Bundle bundle);

        public abstract void onConnectionSuspended(int i);
    }

    public static interface ConnectionProgressReportCallbacks
    {

        public abstract void onReportAccountValidation(ConnectionResult connectionresult);

        public abstract void onReportServiceBinding(ConnectionResult connectionresult);
    }

    public static interface OnConnectionFailedListener
    {

        public abstract void onConnectionFailed(ConnectionResult connectionresult);
    }

    public static interface ServerAuthCodeCallbacks
    {

        public abstract boolean onUploadServerAuthCode$16da05f3();
    }


    private static final Set sAllClients = Collections.newSetFromMap(new WeakHashMap());

    public GoogleApiClient()
    {
    }

    public abstract ConnectionResult blockingConnect();

    public abstract void connect();

    public abstract void disconnect();

    public abstract void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

    public com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl enqueue(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apimethodimpl)
    {
        throw new UnsupportedOperationException();
    }

    public com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl execute(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apimethodimpl)
    {
        throw new UnsupportedOperationException();
    }

    public Api.Client getClient(Api.ClientKey clientkey)
    {
        throw new UnsupportedOperationException();
    }

    public Looper getLooper()
    {
        throw new UnsupportedOperationException();
    }

    public boolean hasApi(Api api)
    {
        throw new UnsupportedOperationException();
    }

    public boolean hasAuthenticatedScope(Scope scope)
    {
        throw new UnsupportedOperationException();
    }

    public abstract boolean hasConnectedApi(Api api);

    public abstract boolean isConnected();

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(ConnectionCallbacks connectioncallbacks);

    public abstract void registerConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener);

    public ListenerHolder registerListener(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public abstract void unregisterConnectionCallbacks(ConnectionCallbacks connectioncallbacks);

    public abstract void unregisterConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener);


}
