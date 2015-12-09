// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc.api;

import android.content.SharedPreferences;
import android.os.Handler;
import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import com.google.android.apps.wallet.eventbus.RegistrationCallback;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.network.NetworkConnectivityEvent;
import com.google.android.apps.wallet.network.NetworkConnectivityReturnChecker;
import com.google.android.apps.wallet.refresh.RequestRefreshEvent;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.kyc.api:
//            KycClient

public class KycStatusPublisher
    implements InitializedEventPublisher
{
    public static class KycStatusEvent
    {

        private final Exception exception;
        private final Integer status;

        public final Integer getStatus()
        {
            return status;
        }

        public KycStatusEvent(Integer integer, Exception exception1)
        {
            status = integer;
            exception = exception1;
        }
    }


    private static final String TAG = com/google/android/apps/wallet/kyc/api/KycStatusPublisher.getSimpleName();
    private final ActionExecutor actionExecutor;
    private final EventBus eventBus;
    private final Handler handler;
    private final KycClient kycClient;
    private final NetworkConnectivityReturnChecker networkConnectivityReturnChecker;
    private final SharedPreferences sharedPreferences;
    private final ThreadChecker threadChecker;

    KycStatusPublisher(EventBus eventbus, ActionExecutor actionexecutor, KycClient kycclient, SharedPreferences sharedpreferences, NetworkConnectivityReturnChecker networkconnectivityreturnchecker, ThreadChecker threadchecker, Handler handler1)
    {
        eventBus = eventbus;
        actionExecutor = actionexecutor;
        kycClient = kycclient;
        sharedPreferences = sharedpreferences;
        networkConnectivityReturnChecker = networkconnectivityreturnchecker;
        threadChecker = threadchecker;
        handler = handler1;
    }

    private void asyncFetchKycStatusFromServer()
    {
        ThreadChecker threadchecker = threadChecker;
        ThreadChecker.checkOnUiThread();
        actionExecutor.executeAction(new Callable() {

            final KycStatusPublisher this$0;

            private Void call()
                throws RpcException, CallErrorException
            {
                fetchKycStatusFromServer();
                return null;
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = KycStatusPublisher.this;
                super();
            }
        }, new AsyncCallback() {

            final KycStatusPublisher this$0;

            public final void onFailure(Exception exception)
            {
                WLog.e(KycStatusPublisher.TAG, "Could not fetch kyc status", exception);
                eventBus.post(new KycStatusEvent(null, exception));
            }

            public final volatile void onSuccess(Object obj)
            {
            }

            
            {
                this$0 = KycStatusPublisher.this;
                super();
            }
        });
    }

    private int getLastKnownStatus()
    {
        return sharedPreferences.getInt("KEY_LAST_KNOWN_KYC_STATUS", -1);
    }

    private void handleRegistrationEventId(Object obj)
    {
        int i = getLastKnownStatus();
        if (i != -1)
        {
            eventBus.post(obj, new KycStatusEvent(Integer.valueOf(i), null));
            return;
        } else
        {
            asyncFetchKycStatusFromServer();
            return;
        }
    }

    private void putLastKnownStatus(int i)
    {
        sharedPreferences.edit().putInt("KEY_LAST_KNOWN_KYC_STATUS", i).apply();
    }

    public final int fetchKycStatusFromServer()
        throws RpcException, CallErrorException
    {
        ThreadChecker threadchecker = threadChecker;
        ThreadChecker.checkOnBackgroundThread();
        int i = kycClient.getKycStatus();
        setKycStatus(i);
        return i;
    }

    public final boolean hasPassedKyc()
    {
        return getLastKnownStatus() == 1;
    }

    public final void initialize()
    {
        handler.post(new Runnable() {

            final KycStatusPublisher this$0;

            public final void run()
            {
                asyncFetchKycStatusFromServer();
            }

            
            {
                this$0 = KycStatusPublisher.this;
                super();
            }
        });
        eventBus.register(this, com/google/android/apps/wallet/refresh/RequestRefreshEvent, new EventHandler() {

            final KycStatusPublisher this$0;

            private void handleEvent(RequestRefreshEvent requestrefreshevent)
            {
                asyncFetchKycStatusFromServer();
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((RequestRefreshEvent)obj);
            }

            
            {
                this$0 = KycStatusPublisher.this;
                super();
            }
        });
        eventBus.registerEventProducer(com/google/android/apps/wallet/kyc/api/KycStatusPublisher$KycStatusEvent, new RegistrationCallback() {

            final KycStatusPublisher this$0;

            public final void handleRegistration(Object obj)
            {
                handleRegistrationEventId(obj);
            }

            
            {
                this$0 = KycStatusPublisher.this;
                super();
            }
        });
        eventBus.register(this);
    }

    void onInternetConnectivityChanged(NetworkConnectivityEvent networkconnectivityevent)
    {
        if (networkConnectivityReturnChecker.isConnectivityReturned(networkconnectivityevent))
        {
            asyncFetchKycStatusFromServer();
        }
    }

    public final void setKycStatus(int i)
    {
        putLastKnownStatus(i);
        eventBus.post(new KycStatusEvent(Integer.valueOf(i), null));
    }





}
