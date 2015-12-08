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

public class KycExperimentPublisher
    implements InitializedEventPublisher
{
    public static class KycExperimentEvent
    {

        private final Exception exception;
        private final int experiment;

        public final Integer getExperiment()
        {
            return Integer.valueOf(experiment);
        }

        public KycExperimentEvent(int i)
        {
            experiment = i;
            exception = null;
        }

        public KycExperimentEvent(Exception exception1)
        {
            experiment = 1;
            exception = exception1;
        }
    }


    private static final String TAG = com/google/android/apps/wallet/kyc/api/KycExperimentPublisher.getSimpleName();
    private final ActionExecutor actionExecutor;
    private final EventBus eventBus;
    private final Handler handler;
    private final KycClient kycClient;
    private final NetworkConnectivityReturnChecker networkConnectivityReturnChecker;
    private final SharedPreferences sharedPreferences;
    private final ThreadChecker threadChecker;

    KycExperimentPublisher(EventBus eventbus, ActionExecutor actionexecutor, KycClient kycclient, SharedPreferences sharedpreferences, NetworkConnectivityReturnChecker networkconnectivityreturnchecker, ThreadChecker threadchecker, Handler handler1)
    {
        eventBus = eventbus;
        actionExecutor = actionexecutor;
        kycClient = kycclient;
        sharedPreferences = sharedpreferences;
        networkConnectivityReturnChecker = networkconnectivityreturnchecker;
        threadChecker = threadchecker;
        handler = handler1;
    }

    private void asyncFetchKycExperimentFromServer()
    {
        ThreadChecker threadchecker = threadChecker;
        ThreadChecker.checkOnUiThread();
        actionExecutor.executeAction(new Callable() {

            final KycExperimentPublisher this$0;

            private com.google.wallet.proto.api.NanoWalletKyc.GetKycDataResponse call()
                throws RpcException, CallErrorException
            {
                return kycClient.getKycData();
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = KycExperimentPublisher.this;
                super();
            }
        }, new AsyncCallback() {

            final KycExperimentPublisher this$0;

            private void onSuccess(com.google.wallet.proto.api.NanoWalletKyc.GetKycDataResponse getkycdataresponse)
            {
                int i;
                if (getkycdataresponse != null)
                {
                    i = getkycdataresponse.experiment.intValue();
                } else
                {
                    i = 1;
                }
                setLastKnownExperiment(i);
                eventBus.post(new KycExperimentEvent(i));
            }

            public final void onFailure(Exception exception)
            {
                WLog.e(KycExperimentPublisher.TAG, "Could not fetch kyc experiment", exception);
                eventBus.post(new KycExperimentEvent(exception));
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((com.google.wallet.proto.api.NanoWalletKyc.GetKycDataResponse)obj);
            }

            
            {
                this$0 = KycExperimentPublisher.this;
                super();
            }
        });
    }

    private int getLastKnownExperiment()
    {
        return sharedPreferences.getInt("KEY_LAST_KNOWN_EXPERIMENT_STATUS", -1);
    }

    private void handleRegistrationEventId(Object obj)
    {
        int i = getLastKnownExperiment();
        if (i != -1)
        {
            eventBus.post(obj, new KycExperimentEvent(i));
            return;
        } else
        {
            asyncFetchKycExperimentFromServer();
            return;
        }
    }

    private void setLastKnownExperiment(int i)
    {
        sharedPreferences.edit().putInt("KEY_LAST_KNOWN_EXPERIMENT_STATUS", i).apply();
    }

    public final void initialize()
    {
        handler.post(new Runnable() {

            final KycExperimentPublisher this$0;

            public final void run()
            {
                asyncFetchKycExperimentFromServer();
            }

            
            {
                this$0 = KycExperimentPublisher.this;
                super();
            }
        });
        eventBus.register(this, com/google/android/apps/wallet/refresh/RequestRefreshEvent, new EventHandler() {

            final KycExperimentPublisher this$0;

            private void handleEvent(RequestRefreshEvent requestrefreshevent)
            {
                asyncFetchKycExperimentFromServer();
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((RequestRefreshEvent)obj);
            }

            
            {
                this$0 = KycExperimentPublisher.this;
                super();
            }
        });
        eventBus.registerEventProducer(com/google/android/apps/wallet/kyc/api/KycExperimentPublisher$KycExperimentEvent, new RegistrationCallback() {

            final KycExperimentPublisher this$0;

            public final void handleRegistration(Object obj)
            {
                handleRegistrationEventId(obj);
            }

            
            {
                this$0 = KycExperimentPublisher.this;
                super();
            }
        });
        eventBus.register(this);
    }

    void onInternetConnectivityChanged(NetworkConnectivityEvent networkconnectivityevent)
    {
        if (networkConnectivityReturnChecker.isConnectivityReturned(networkconnectivityevent))
        {
            asyncFetchKycExperimentFromServer();
        }
    }







}
