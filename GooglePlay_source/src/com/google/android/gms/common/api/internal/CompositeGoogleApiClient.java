// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            InternalGoogleApiClient, ClientCallbacks, GoogleApiClientStateHolder, GoogleApiClientImpl

public final class CompositeGoogleApiClient
    implements InternalGoogleApiClient
{

    private final GoogleApiClientImpl mApiClient;
    ConnectionResult mAuthResult;
    final GoogleApiClientStateHolder mAuthenticatedClient;
    private int mCallbackMode;
    private final Context mContext;
    private final Map mGoogleApiClientMap = new ArrayMap();
    final Lock mLock;
    private final Looper mLooper;
    Bundle mOnConnectedHint;
    private final AtomicInteger mOnConnectionSuspendedCount = new AtomicInteger(0);
    private final com.google.android.gms.common.api.Api.Client mSignInClient = null;
    private final Set mSignInConnListeners = Collections.newSetFromMap(new WeakHashMap());
    ConnectionResult mUnauthResult;
    final GoogleApiClientStateHolder mUnauthenticatedClient;

    public CompositeGoogleApiClient(Context context, GoogleApiClientImpl googleapiclientimpl, Lock lock, Looper looper, GoogleApiAvailability googleapiavailability, Map map, ClientSettings clientsettings, 
            Map map1, com.google.android.gms.common.api.Api.AbstractClientBuilder abstractclientbuilder, ArrayList arraylist)
    {
        mUnauthResult = null;
        mAuthResult = null;
        mCallbackMode = 0;
        mContext = context;
        mApiClient = googleapiclientimpl;
        mLock = lock;
        mLooper = looper;
        googleapiclientimpl = new ArrayMap();
        ArrayMap arraymap = new ArrayMap();
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();)
        {
            com.google.android.gms.common.api.Api.ClientKey clientkey = (com.google.android.gms.common.api.Api.ClientKey)iterator.next();
            com.google.android.gms.common.api.Api.Client client = (com.google.android.gms.common.api.Api.Client)map.get(clientkey);
            if (client.requiresSignIn())
            {
                googleapiclientimpl.put(clientkey, client);
            } else
            {
                arraymap.put(clientkey, client);
            }
        }

        if (googleapiclientimpl.isEmpty())
        {
            throw new IllegalStateException("CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        }
        map = new ArrayMap();
        ArrayMap arraymap1 = new ArrayMap();
        for (Iterator iterator1 = map1.keySet().iterator(); iterator1.hasNext();)
        {
            Api api = (Api)iterator1.next();
            com.google.android.gms.common.api.Api.ClientKey clientkey1 = api.getClientKey();
            if (googleapiclientimpl.containsKey(clientkey1))
            {
                map.put(api, map1.get(api));
            } else
            if (arraymap.containsKey(clientkey1))
            {
                arraymap1.put(api, map1.get(api));
            } else
            {
                throw new IllegalStateException("Each API in the apiTypeMap must have a corresponding client in the clients map.");
            }
        }

        map1 = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        for (arraylist = arraylist.iterator(); arraylist.hasNext();)
        {
            ClientCallbacks clientcallbacks = (ClientCallbacks)arraylist.next();
            if (map.containsKey(clientcallbacks.mApi))
            {
                map1.add(clientcallbacks);
            } else
            if (arraymap1.containsKey(clientcallbacks.mApi))
            {
                arraylist1.add(clientcallbacks);
            } else
            {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the apiTypeMap");
            }
        }

        arraylist = new InternalGoogleApiClient.InternalCallbacks() {

            final CompositeGoogleApiClient this$0;

            public final void handleOnConnectionFailed(ConnectionResult connectionresult)
            {
                mLock.lock();
                mUnauthResult = connectionresult;
                CompositeGoogleApiClient.access$300(CompositeGoogleApiClient.this);
                mLock.unlock();
                return;
                connectionresult;
                mLock.unlock();
                throw connectionresult;
            }

            public final void handleOnConnectionSuccess(Bundle bundle)
            {
                mLock.lock();
                CompositeGoogleApiClient compositegoogleapiclient = CompositeGoogleApiClient.this;
                if (compositegoogleapiclient.mOnConnectedHint != null) goto _L2; else goto _L1
_L1:
                compositegoogleapiclient.mOnConnectedHint = bundle;
_L4:
                mUnauthResult = ConnectionResult.RESULT_SUCCESS;
                CompositeGoogleApiClient.access$300(CompositeGoogleApiClient.this);
                mLock.unlock();
                return;
_L2:
                if (bundle == null) goto _L4; else goto _L3
_L3:
                compositegoogleapiclient.mOnConnectedHint.putAll(bundle);
                  goto _L4
                bundle;
                mLock.unlock();
                throw bundle;
            }

            public final void handleOnConnectionSuspended(int i)
            {
                mLock.lock();
                CompositeGoogleApiClient.access$500(CompositeGoogleApiClient.this, mAuthenticatedClient, i);
                mLock.unlock();
                return;
                Exception exception;
                exception;
                mLock.unlock();
                throw exception;
            }

            
            {
                this$0 = CompositeGoogleApiClient.this;
                super();
            }
        };
        mUnauthenticatedClient = new GoogleApiClientStateHolder(context, mApiClient, lock, looper, googleapiavailability, arraymap, null, arraymap1, null, arraylist1, arraylist);
        arraylist = new InternalGoogleApiClient.InternalCallbacks() {

            final CompositeGoogleApiClient this$0;

            public final void handleOnConnectionFailed(ConnectionResult connectionresult)
            {
                mLock.lock();
                mAuthResult = connectionresult;
                CompositeGoogleApiClient.access$300(CompositeGoogleApiClient.this);
                mLock.unlock();
                return;
                connectionresult;
                mLock.unlock();
                throw connectionresult;
            }

            public final void handleOnConnectionSuccess(Bundle bundle)
            {
                mLock.lock();
                mAuthResult = ConnectionResult.RESULT_SUCCESS;
                CompositeGoogleApiClient.access$300(CompositeGoogleApiClient.this);
                mLock.unlock();
                return;
                bundle;
                mLock.unlock();
                throw bundle;
            }

            public final void handleOnConnectionSuspended(int i)
            {
                mLock.lock();
                CompositeGoogleApiClient.access$500(CompositeGoogleApiClient.this, mUnauthenticatedClient, i);
                mLock.unlock();
                return;
                Exception exception;
                exception;
                mLock.unlock();
                throw exception;
            }

            
            {
                this$0 = CompositeGoogleApiClient.this;
                super();
            }
        };
        mAuthenticatedClient = new GoogleApiClientStateHolder(context, mApiClient, lock, looper, googleapiavailability, googleapiclientimpl, clientsettings, map, abstractclientbuilder, map1, arraylist);
        for (context = arraymap.keySet().iterator(); context.hasNext(); mGoogleApiClientMap.put(lock, mUnauthenticatedClient))
        {
            lock = (com.google.android.gms.common.api.Api.ClientKey)context.next();
        }

        for (context = googleapiclientimpl.keySet().iterator(); context.hasNext(); mGoogleApiClientMap.put(googleapiclientimpl, mAuthenticatedClient))
        {
            googleapiclientimpl = (com.google.android.gms.common.api.Api.ClientKey)context.next();
        }

    }

    private void callFailureCallbacksLocked(ConnectionResult connectionresult)
    {
        mCallbackMode;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 57
    //                   2 49;
           goto _L1 _L2 _L3
_L1:
        Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CALLBACK_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
_L5:
        mCallbackMode = 0;
        return;
_L3:
        mApiClient.handleOnConnectionFailed(connectionresult);
_L2:
        callSignInCallbacksLocked();
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void callSignInCallbacksLocked()
    {
        for (Iterator iterator = mSignInConnListeners.iterator(); iterator.hasNext(); iterator.next()) { }
        mSignInConnListeners.clear();
    }

    private boolean hasSignInFailedWithSignInRequiredLocked()
    {
        return mAuthResult != null && mAuthResult.mStatusCode == 4;
    }

    private boolean isAuthenticatedCall(BaseImplementation.ApiMethodImpl apimethodimpl)
    {
        apimethodimpl = apimethodimpl.mClientKey;
        Preconditions.checkArgument(mGoogleApiClientMap.containsKey(apimethodimpl), "GoogleApiClient is not configured to use the API required for this call.");
        return ((GoogleApiClientStateHolder)mGoogleApiClientMap.get(apimethodimpl)).equals(mAuthenticatedClient);
    }

    private static boolean isConnectionSuccess(ConnectionResult connectionresult)
    {
        return connectionresult != null && connectionresult.isSuccess();
    }

    public final ConnectionResult blockingConnect()
    {
        throw new UnsupportedOperationException();
    }

    public final void connect()
    {
        mCallbackMode = 2;
        mAuthResult = null;
        mUnauthResult = null;
        mUnauthenticatedClient.connect();
        mAuthenticatedClient.connect();
    }

    public final void disconnect()
    {
        mAuthResult = null;
        mUnauthResult = null;
        mCallbackMode = 0;
        mUnauthenticatedClient.disconnect();
        mAuthenticatedClient.disconnect();
        callSignInCallbacksLocked();
    }

    public final void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.append(s).append("authClient").println(":");
        mAuthenticatedClient.dump((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
        printwriter.append(s).append("unauthClient").println(":");
        mUnauthenticatedClient.dump((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
    }

    public final BaseImplementation.ApiMethodImpl enqueue(BaseImplementation.ApiMethodImpl apimethodimpl)
    {
        if (isAuthenticatedCall(apimethodimpl))
        {
            if (hasSignInFailedWithSignInRequiredLocked())
            {
                apimethodimpl.setFailedResult(new Status(4, null, null));
                return apimethodimpl;
            } else
            {
                return mAuthenticatedClient.enqueue(apimethodimpl);
            }
        } else
        {
            return mUnauthenticatedClient.enqueue(apimethodimpl);
        }
    }

    public final BaseImplementation.ApiMethodImpl execute(BaseImplementation.ApiMethodImpl apimethodimpl)
    {
        if (isAuthenticatedCall(apimethodimpl))
        {
            if (hasSignInFailedWithSignInRequiredLocked())
            {
                apimethodimpl.setFailedResult(new Status(4, null, null));
                return apimethodimpl;
            } else
            {
                return mAuthenticatedClient.execute(apimethodimpl);
            }
        } else
        {
            return mUnauthenticatedClient.execute(apimethodimpl);
        }
    }

    public final boolean isConnected()
    {
        boolean flag1;
        flag1 = true;
        mLock.lock();
        if (!mUnauthenticatedClient.isConnected()) goto _L2; else goto _L1
_L1:
        boolean flag = flag1;
        if (mAuthenticatedClient.isConnected()) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (hasSignInFailedWithSignInRequiredLocked()) goto _L4; else goto _L5
_L5:
        int i = mCallbackMode;
        if (i != 1) goto _L2; else goto _L6
_L6:
        flag = flag1;
_L4:
        mLock.unlock();
        return flag;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L7
_L7:
        Exception exception;
        exception;
        mLock.unlock();
        throw exception;
    }


/*
    static void access$300(CompositeGoogleApiClient compositegoogleapiclient)
    {
        if (!isConnectionSuccess(compositegoogleapiclient.mUnauthResult)) goto _L2; else goto _L1
_L1:
        if (!isConnectionSuccess(compositegoogleapiclient.mAuthResult) && !compositegoogleapiclient.hasSignInFailedWithSignInRequiredLocked()) goto _L4; else goto _L3
_L3:
        compositegoogleapiclient.mCallbackMode;
        JVM INSTR tableswitch 1 2: default 52
    //                   1 84
    //                   2 73;
           goto _L5 _L6 _L7
_L5:
        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CALLBACK_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
_L12:
        compositegoogleapiclient.mCallbackMode = 0;
_L9:
        return;
_L7:
        compositegoogleapiclient.mApiClient.handleOnConnectionSuccess(compositegoogleapiclient.mOnConnectedHint);
_L6:
        compositegoogleapiclient.callSignInCallbacksLocked();
        continue; /* Loop/switch isn't completed */
_L4:
        if (compositegoogleapiclient.mAuthResult == null) goto _L9; else goto _L8
_L8:
        if (compositegoogleapiclient.mCallbackMode == 1)
        {
            compositegoogleapiclient.callSignInCallbacksLocked();
            return;
        } else
        {
            compositegoogleapiclient.callFailureCallbacksLocked(compositegoogleapiclient.mAuthResult);
            compositegoogleapiclient.mUnauthenticatedClient.disconnect();
            return;
        }
_L2:
        if (compositegoogleapiclient.mUnauthResult != null && isConnectionSuccess(compositegoogleapiclient.mAuthResult))
        {
            compositegoogleapiclient.mAuthenticatedClient.disconnect();
            compositegoogleapiclient.callFailureCallbacksLocked(compositegoogleapiclient.mUnauthResult);
            return;
        }
        if (compositegoogleapiclient.mUnauthResult == null || compositegoogleapiclient.mAuthResult == null) goto _L9; else goto _L10
_L10:
        ConnectionResult connectionresult = compositegoogleapiclient.mUnauthResult;
        if (compositegoogleapiclient.mAuthenticatedClient.mLastConnectionFailurePriority < compositegoogleapiclient.mUnauthenticatedClient.mLastConnectionFailurePriority)
        {
            connectionresult = compositegoogleapiclient.mAuthResult;
        }
        compositegoogleapiclient.callFailureCallbacksLocked(connectionresult);
        return;
        if (true) goto _L12; else goto _L11
_L11:
        return;
    }

*/


/*
    static void access$500(CompositeGoogleApiClient compositegoogleapiclient, GoogleApiClientStateHolder googleapiclientstateholder, int i)
    {
        if (compositegoogleapiclient.mOnConnectionSuspendedCount.getAndIncrement() % 2 == 1)
        {
            compositegoogleapiclient.mApiClient.handleOnConnectionSuspended(i);
        }
        googleapiclientstateholder.onConnectionSuspended(i);
        compositegoogleapiclient.mAuthResult = null;
        compositegoogleapiclient.mUnauthResult = null;
        return;
    }

*/
}
