// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import com.google.android.apps.wallet.eventbus.RegistrationCallback;
import com.google.android.apps.wallet.purchaserecord.PurchaseRecordManager;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import com.google.android.apps.wallet.util.proto.Protos;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            WalletBalancePendingTransactionEvent

public class WalletBalancePendingTransactionPublisher
    implements InitializedEventPublisher
{

    private final ActionExecutor actionExecutor;
    private final EventBus eventBus;
    private final FeatureManager featureManager;
    private final PurchaseRecordManager purchaseRecordManager;
    private final ThreadChecker threadChecker;

    WalletBalancePendingTransactionPublisher(EventBus eventbus, ActionExecutor actionexecutor, PurchaseRecordManager purchaserecordmanager, FeatureManager featuremanager, ThreadChecker threadchecker)
    {
        eventBus = eventbus;
        actionExecutor = actionexecutor;
        purchaseRecordManager = purchaserecordmanager;
        featureManager = featuremanager;
        threadChecker = threadchecker;
    }

    private void fetchAndPublishPendingTransactions()
    {
        if (!featureManager.isFeatureEnabled(Feature.TRANSACTION_LIST))
        {
            return;
        } else
        {
            ThreadChecker threadchecker = threadChecker;
            ThreadChecker.checkOnUiThread();
            actionExecutor.executeAction(new Callable() {

                final WalletBalancePendingTransactionPublisher this$0;

                private Void call()
                {
                    WalletBalancePendingTransactionEvent walletbalancependingtransactionevent;
                    try
                    {
                        walletbalancependingtransactionevent = new WalletBalancePendingTransactionEvent(purchaseRecordManager.getPendingStoredValueTransactions(), null);
                    }
                    catch (RpcException rpcexception)
                    {
                        rpcexception = new WalletBalancePendingTransactionEvent(null, rpcexception);
                    }
                    eventBus.post(walletbalancependingtransactionevent);
                    return null;
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = WalletBalancePendingTransactionPublisher.this;
                super();
            }
            });
            return;
        }
    }

    public final void initialize()
    {
        eventBus.registerEventProducer(com/google/android/apps/wallet/storedvalue/WalletBalancePendingTransactionEvent, new RegistrationCallback() {

            final WalletBalancePendingTransactionPublisher this$0;

            public final void handleRegistration(Object obj)
            {
                fetchAndPublishPendingTransactions();
            }

            
            {
                this$0 = WalletBalancePendingTransactionPublisher.this;
                super();
            }
        });
        eventBus.register(this, com/google/wallet/proto/NanoWalletTransport$SystemNotificationBundle$SystemNotification, new EventHandler() {

            final WalletBalancePendingTransactionPublisher this$0;

            private void handleEvent(com.google.wallet.proto.NanoWalletTransport.SystemNotificationBundle.SystemNotification systemnotification)
            {
                if (Protos.valuesEqual(systemnotification.type, 4))
                {
                    fetchAndPublishPendingTransactions();
                }
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((com.google.wallet.proto.NanoWalletTransport.SystemNotificationBundle.SystemNotification)obj);
            }

            
            {
                this$0 = WalletBalancePendingTransactionPublisher.this;
                super();
            }
        });
    }



}
