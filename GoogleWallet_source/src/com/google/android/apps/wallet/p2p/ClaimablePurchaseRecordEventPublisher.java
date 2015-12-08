// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import com.google.android.apps.wallet.eventbus.RegistrationCallback;
import com.google.android.apps.wallet.purchaserecord.PurchaseRecordManager;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.common.cache.Cache;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            ClaimablePurchaseRecordEvent

public class ClaimablePurchaseRecordEventPublisher
    implements InitializedEventPublisher
{

    private static final Object CACHE_KEY = new Object();
    private final ActionExecutor actionExecutor;
    private final Cache cache;
    private final EventBus eventBus;
    private final FeatureManager featureManager;
    private final PurchaseRecordManager purchaseRecordManager;

    protected ClaimablePurchaseRecordEventPublisher(PurchaseRecordManager purchaserecordmanager, FeatureManager featuremanager, ActionExecutor actionexecutor, EventBus eventbus, Cache cache1)
    {
        purchaseRecordManager = purchaserecordmanager;
        featureManager = featuremanager;
        actionExecutor = actionexecutor;
        eventBus = eventbus;
        cache = cache1;
    }

    private void asyncFetchClaimablePurchaseRecordFromServer()
    {
        if (!featureManager.isFeatureEnabled(Feature.TRANSACTION_LIST))
        {
            return;
        } else
        {
            actionExecutor.executeAction(new Callable() {

                final ClaimablePurchaseRecordEventPublisher this$0;

                private List call()
                    throws RpcException
                {
                    return purchaseRecordManager.getClaimablePurchaseRecords();
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = ClaimablePurchaseRecordEventPublisher.this;
                super();
            }
            }, new AsyncCallback() {

                final ClaimablePurchaseRecordEventPublisher this$0;

                private void onSuccess(List list)
                {
                    list = new ClaimablePurchaseRecordEvent(list, null);
                    cache.put(ClaimablePurchaseRecordEventPublisher.CACHE_KEY, list);
                    eventBus.post(list);
                }

                public final void onFailure(Exception exception)
                {
                    eventBus.post(new ClaimablePurchaseRecordEvent(null, exception));
                }

                public final volatile void onSuccess(Object obj)
                {
                    onSuccess((List)obj);
                }

            
            {
                this$0 = ClaimablePurchaseRecordEventPublisher.this;
                super();
            }
            });
            return;
        }
    }

    private void handleRegistrationEvent(Object obj)
    {
        ClaimablePurchaseRecordEvent claimablepurchaserecordevent = (ClaimablePurchaseRecordEvent)cache.getIfPresent(CACHE_KEY);
        if (claimablepurchaserecordevent != null)
        {
            eventBus.post(obj, claimablepurchaserecordevent);
            return;
        } else
        {
            asyncFetchClaimablePurchaseRecordFromServer();
            return;
        }
    }

    public final void initialize()
    {
        eventBus.register(this, com/google/wallet/proto/NanoWalletTransport$SystemNotificationBundle$SystemNotification, new EventHandler() {

            final ClaimablePurchaseRecordEventPublisher this$0;

            private void handleEvent(com.google.wallet.proto.NanoWalletTransport.SystemNotificationBundle.SystemNotification systemnotification)
            {
                if (Protos.valuesEqual(systemnotification.type, 4))
                {
                    invalidate();
                    asyncFetchClaimablePurchaseRecordFromServer();
                }
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((com.google.wallet.proto.NanoWalletTransport.SystemNotificationBundle.SystemNotification)obj);
            }

            
            {
                this$0 = ClaimablePurchaseRecordEventPublisher.this;
                super();
            }
        });
        eventBus.registerEventProducer(com/google/android/apps/wallet/p2p/ClaimablePurchaseRecordEvent, new RegistrationCallback() {

            final ClaimablePurchaseRecordEventPublisher this$0;

            public final void handleRegistration(Object obj)
            {
                handleRegistrationEvent(obj);
            }

            
            {
                this$0 = ClaimablePurchaseRecordEventPublisher.this;
                super();
            }
        });
    }

    public final void invalidate()
    {
        cache.invalidate(CACHE_KEY);
    }







}
