// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.droidguard.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Base64;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.GmsClientEventManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.droidguard.DroidGuardResultsCallback;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.droidguard.internal:
//            IDroidGuardService, AbstractDroidGuardCallbacks

public final class DroidGuardClientImpl extends GmsClient
{

    private static final int DEFAULT_BLOCKING_OPERATION_TIMEOUT_MILLIS;
    private static final int INITIAL_BLOCKING_OPERATION_TIMEOUT_MILLIS;
    private volatile int mBlockingOperationTimeoutMillis;
    private final GmsClientEventManager mEvents;

    public DroidGuardClientImpl(Context context)
    {
        super(context, context.getMainLooper(), (new com.google.android.gms.common.api.GoogleApiClient.Builder(context)).buildClientSettings());
        mBlockingOperationTimeoutMillis = DEFAULT_BLOCKING_OPERATION_TIMEOUT_MILLIS;
        mEvents = new GmsClientEventManager(context.getMainLooper(), this);
    }

    static String getErrorResponse(String s)
    {
        return Base64.encodeToString((new StringBuilder("ERROR : ")).append(s).toString().getBytes(), 11);
    }

    static String responseToString(byte abyte0[])
    {
        return Base64.encodeToString(abyte0, 11);
    }

    public final void checkAvailabilityAndConnect()
    {
        mEvents.mCallbacksEnabled = true;
        super.checkAvailabilityAndConnect();
    }

    protected final volatile IInterface createServiceInterface(IBinder ibinder)
    {
        return IDroidGuardService.Stub.asInterface(ibinder);
    }

    public final void disconnect()
    {
        mEvents.disableCallbacks();
        super.disconnect();
    }

    public final String getResults(String s, Map map)
    {
        final LinkedBlockingQueue resultQueue;
        Preconditions.checkNotMainThread("getResults() must not be called on the main thread.");
        resultQueue = new LinkedBlockingQueue();
        final DroidGuardResultsCallback onceCallback = new DroidGuardResultsCallback() {

            boolean mDelivered;
            final DroidGuardClientImpl this$0;
            final DroidGuardResultsCallback val$callback;

            public final void onDroidGuardResults(String s1)
            {
                this;
                JVM INSTR monitorenter ;
                if (!mDelivered)
                {
                    break MISSING_BLOCK_LABEL_12;
                }
                this;
                JVM INSTR monitorexit ;
                return;
                mDelivered = true;
                this;
                JVM INSTR monitorexit ;
                callback.onDroidGuardResults(s1);
                return;
                s1;
                this;
                JVM INSTR monitorexit ;
                throw s1;
            }

            
            {
                this$0 = DroidGuardClientImpl.this;
                callback = droidguardresultscallback;
                super();
                mDelivered = false;
            }
        };
        s = new com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks() {

            final DroidGuardClientImpl this$0;
            final Map val$args;
            final AbstractDroidGuardCallbacks val$binderCallbacks;
            final String val$flowName;
            final DroidGuardResultsCallback val$onceCallback;

            public final void onConnected(Bundle bundle)
            {
                try
                {
                    DroidGuardClientImpl.access$000(DroidGuardClientImpl.this);
                    ((IDroidGuardService)getService()).getResults(binderCallbacks, flowName, args);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    onceCallback.onDroidGuardResults(DroidGuardClientImpl.getErrorResponse((new StringBuilder("RemoteException: ")).append(bundle).toString()));
                }
            }

            public final void onConnectionSuspended(int j)
            {
                onceCallback.onDroidGuardResults(DroidGuardClientImpl.getErrorResponse("Disconnected."));
            }

            
            {
                this$0 = DroidGuardClientImpl.this;
                binderCallbacks = abstractdroidguardcallbacks;
                flowName = s;
                args = map;
                onceCallback = droidguardresultscallback;
                super();
            }
        };
        map = new com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener() {

            final DroidGuardClientImpl this$0;
            final DroidGuardResultsCallback val$onceCallback;

            public final void onConnectionFailed(ConnectionResult connectionresult)
            {
                onceCallback.onDroidGuardResults(DroidGuardClientImpl.getErrorResponse((new StringBuilder("Connection failed: ")).append(connectionresult).toString()));
            }

            
            {
                this$0 = DroidGuardClientImpl.this;
                onceCallback = droidguardresultscallback;
                super();
            }
        };
        mEvents.registerConnectionCallbacks(s);
        mEvents.registerConnectionFailedListener(map);
        checkAvailabilityAndConnect();
        s = ((String) (resultQueue.poll(INITIAL_BLOCKING_OPERATION_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS)));
        if (s == null) goto _L2; else goto _L1
_L1:
        map = (String)s;
        s = map;
        if (map != null)
        {
            break; /* Loop/switch isn't completed */
        }
        return getErrorResponse((new StringBuilder("Timeout: ")).append(mBlockingOperationTimeoutMillis).append("ms").toString());
_L2:
        int i = mBlockingOperationTimeoutMillis - INITIAL_BLOCKING_OPERATION_TIMEOUT_MILLIS;
        if (i > 0)
        {
            try
            {
                s = ((String) (resultQueue.poll(i, TimeUnit.MILLISECONDS)));
                continue; /* Loop/switch isn't completed */
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s = getErrorResponse((new StringBuilder("Interrupted: ")).append(s).toString());
            }
            break; /* Loop/switch isn't completed */
        }
        s = null;
        if (true) goto _L1; else goto _L3
_L3:
        return s;
    }

    protected final String getServiceDescriptor()
    {
        return "com.google.android.gms.droidguard.internal.IDroidGuardService";
    }

    protected final String getStartServiceAction()
    {
        return "com.google.android.gms.droidguard.service.START";
    }

    public final void onConnectedLocked()
    {
        super.onConnectedLocked();
        mEvents.onConnectionSuccess(getConnectionHint());
    }

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        super.onConnectionFailed(connectionresult);
        mEvents.onConnectionFailure(connectionresult);
    }

    public final void onConnectionSuspended(int i)
    {
        super.onConnectionSuspended(i);
        mEvents.onUnintentionalDisconnection(i);
    }

    static 
    {
        INITIAL_BLOCKING_OPERATION_TIMEOUT_MILLIS = (int)TimeUnit.SECONDS.toMillis(10L);
        DEFAULT_BLOCKING_OPERATION_TIMEOUT_MILLIS = (int)TimeUnit.SECONDS.toMillis(60L);
    }


/*
    static void access$000(DroidGuardClientImpl droidguardclientimpl)
    {
        try
        {
            droidguardclientimpl.mBlockingOperationTimeoutMillis = ((IDroidGuardService)droidguardclientimpl.getService()).getClientBlockingOperationTimeoutMillis();
            return;
        }
        catch (Exception exception)
        {
            droidguardclientimpl.mBlockingOperationTimeoutMillis = DEFAULT_BLOCKING_OPERATION_TIMEOUT_MILLIS;
        }
        return;
    }

*/

    // Unreferenced inner class com/google/android/gms/droidguard/internal/DroidGuardClientImpl$2

/* anonymous class */
    final class _cls2 extends AbstractDroidGuardCallbacks
    {

        final DroidGuardClientImpl this$0;
        final DroidGuardResultsCallback val$onceCallback;

        public final void onDroidGuardResults(byte abyte0[])
            throws RemoteException
        {
            abyte0 = onceCallback. new com.google.android.gms.common.internal.GmsClient.CallbackProxy(abyte0) {

                final _cls2 this$1;
                final byte val$results[];

                protected final volatile void deliverCallback(Object obj)
                {
                    obj = (DroidGuardResultsCallback)obj;
                    if (obj != null)
                    {
                        ((DroidGuardResultsCallback) (obj)).onDroidGuardResults(DroidGuardClientImpl.responseToString(results));
                    }
                    disconnect();
                }

                protected final void onDeliverCallbackFailed()
                {
                    disconnect();
                }

            
            {
                this$1 = final__pcls2;
                results = abyte0;
                super(final__pcls2._fld0, DroidGuardResultsCallback.this);
            }
            };
            doCallbackDEPRECATED(abyte0);
        }

            
            {
                this$0 = DroidGuardClientImpl.this;
                onceCallback = droidguardresultscallback;
                super();
            }
    }


    // Unreferenced inner class com/google/android/gms/droidguard/internal/DroidGuardClientImpl$5

/* anonymous class */
    final class _cls5
        implements DroidGuardResultsCallback
    {

        final DroidGuardClientImpl this$0;
        final LinkedBlockingQueue val$resultQueue;

        public final void onDroidGuardResults(String s)
        {
            try
            {
                resultQueue.put(s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return;
            }
        }

            
            {
                this$0 = DroidGuardClientImpl.this;
                resultQueue = linkedblockingqueue;
                super();
            }
    }

}
