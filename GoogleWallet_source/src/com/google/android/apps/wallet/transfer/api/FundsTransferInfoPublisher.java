// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer.api;

import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import com.google.android.apps.wallet.eventbus.RegistrationCallback;
import com.google.android.apps.wallet.money.CurrencyUtil;
import com.google.android.apps.wallet.paymentcard.api.CredentialsChangedEvent;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.wallet.transfer.api:
//            FundsTransferInfoEvent, FundsTransferClient

public class FundsTransferInfoPublisher
    implements InitializedEventPublisher
{

    public static final String TAG = com/google/android/apps/wallet/transfer/api/FundsTransferInfoPublisher.getSimpleName();
    private final ActionExecutor actionExecutor;
    private final LoadingCache cache;
    private final EventBus eventBus;

    FundsTransferInfoPublisher(EventBus eventbus, final FundsTransferClient fundsTransferClient, ActionExecutor actionexecutor, FeatureManager featuremanager)
    {
        actionExecutor = actionexecutor;
        eventBus = eventbus;
        eventbus = new CacheLoader() {

            final FundsTransferInfoPublisher this$0;
            final FundsTransferClient val$fundsTransferClient;

            private com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferInfoResponse load(Object obj)
                throws RpcException, CallErrorException
            {
                com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferInfoRequest getfundstransferinforequest = new com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferInfoRequest();
                getfundstransferinforequest.currencyCode = CurrencyUtil.getCurrencyCode();
                getfundstransferinforequest.transactionType = new com.google.wallet.proto.NanoWalletEntities.TransactionType();
                getfundstransferinforequest.transactionType.type = (Integer)obj;
                getfundstransferinforequest.feeResponseFormat = Integer.valueOf(1);
                obj = fundsTransferClient.getFundsTransferInfo(getfundstransferinforequest);
                if (((com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferInfoResponse) (obj)).callError != null)
                {
                    throw new CallErrorException(((com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferInfoResponse) (obj)).callError);
                } else
                {
                    return ((com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferInfoResponse) (obj));
                }
            }

            public final volatile Object load(Object obj)
                throws Exception
            {
                return load(obj);
            }

            
            {
                this$0 = FundsTransferInfoPublisher.this;
                fundsTransferClient = fundstransferclient;
                super();
            }
        };
        cache = CacheBuilder.newBuilder().expireAfterWrite(5L, TimeUnit.MINUTES).build(eventbus);
    }

    private static FundsTransferInfoEvent getEventForResponse(com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferInfoResponse getfundstransferinforesponse)
    {
        getfundstransferinforesponse = getfundstransferinforesponse.info;
        return new FundsTransferInfoEvent(((com.google.wallet.proto.api.NanoWalletFundsTransfer.FundsTransferInfo) (getfundstransferinforesponse)).fundingSourceInfo, ((com.google.wallet.proto.api.NanoWalletFundsTransfer.FundsTransferInfo) (getfundstransferinforesponse)).fundingSourceOverview, ((com.google.wallet.proto.api.NanoWalletFundsTransfer.FundsTransferInfo) (getfundstransferinforesponse)).maxTransactionAmount, null);
    }

    protected final void handleRegistrationEvent(final Object eventId)
    {
        com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferInfoResponse getfundstransferinforesponse = (com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferInfoResponse)cache.getIfPresent(eventId);
        if (getfundstransferinforesponse != null)
        {
            eventBus.post(eventId, getEventForResponse(getfundstransferinforesponse));
            return;
        } else
        {
            actionExecutor.executeAction(new Callable() {

                final FundsTransferInfoPublisher this$0;
                final Object val$eventId;

                private com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferInfoResponse call()
                    throws ExecutionException
                {
                    return (com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferInfoResponse)cache.get(eventId);
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = FundsTransferInfoPublisher.this;
                eventId = obj;
                super();
            }
            }, new AsyncCallback() {

                final FundsTransferInfoPublisher this$0;
                final Object val$eventId;

                private void onSuccess(com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferInfoResponse getfundstransferinforesponse1)
                {
                    eventBus.post(eventId, FundsTransferInfoPublisher.getEventForResponse(FundsTransferInfoPublisher.this, getfundstransferinforesponse1));
                }

                public final void onFailure(Exception exception)
                {
                    exception = new FundsTransferInfoEvent(null, null, null, exception.getCause());
                    eventBus.post(eventId, exception);
                }

                public final volatile void onSuccess(Object obj)
                {
                    onSuccess((com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferInfoResponse)obj);
                }

            
            {
                this$0 = FundsTransferInfoPublisher.this;
                eventId = obj;
                super();
            }
            });
            return;
        }
    }

    public final void initialize()
    {
        eventBus.registerEventProducer(com/google/android/apps/wallet/transfer/api/FundsTransferInfoEvent, new RegistrationCallback() {

            final FundsTransferInfoPublisher this$0;

            public final void handleRegistration(Object obj)
            {
                handleRegistrationEvent(obj);
            }

            
            {
                this$0 = FundsTransferInfoPublisher.this;
                super();
            }
        });
        eventBus.register(this);
    }

    void onCredentialsChanged(CredentialsChangedEvent credentialschangedevent)
    {
        cache.invalidateAll();
    }




}
