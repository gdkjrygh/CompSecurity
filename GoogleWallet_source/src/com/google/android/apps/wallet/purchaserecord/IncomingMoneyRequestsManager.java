// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import com.google.android.apps.wallet.eventbus.RegistrationCallback;
import com.google.android.apps.wallet.purchaserecord.api.NewPurchaseRecordReceiptEvent;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.async.ThreadPreconditions;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            IncomingMoneyRequestsEvent, PurchaseRecordManager

public class IncomingMoneyRequestsManager
    implements InitializedEventPublisher
{

    private static final String TAG = com/google/android/apps/wallet/purchaserecord/IncomingMoneyRequestsManager.getSimpleName();
    private final ActionExecutor actionExecutor;
    Cache cache;
    private final EventBus eventBus;
    private final PurchaseRecordManager purchaseRecordManager;

    public IncomingMoneyRequestsManager(EventBus eventbus, ActionExecutor actionexecutor, PurchaseRecordManager purchaserecordmanager)
    {
        eventBus = eventbus;
        actionExecutor = actionexecutor;
        purchaseRecordManager = purchaserecordmanager;
        cache = CacheBuilder.newBuilder().maximumSize(1L).build();
    }

    private void handleRegistrationEvent(Object obj)
    {
        ThreadPreconditions.checkOnUiThread();
        obj = (List)cache.getIfPresent(TAG);
        if (obj != null)
        {
            eventBus.post(new IncomingMoneyRequestsEvent(((List) (obj)), null));
        }
        postFreshEvent();
    }

    private void postFreshEvent()
    {
        actionExecutor.executeAction(new Callable() {

            final IncomingMoneyRequestsManager this$0;

            private List call()
                throws Exception
            {
                return purchaseRecordManager.getIncomingMoneyRequests();
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = IncomingMoneyRequestsManager.this;
                super();
            }
        }, new AsyncCallback() {

            final IncomingMoneyRequestsManager this$0;

            private void onSuccess(List list)
            {
                eventBus.post(new IncomingMoneyRequestsEvent(list, null));
                cache.put(IncomingMoneyRequestsManager.TAG, list);
            }

            public final void onFailure(Exception exception)
            {
                List list = (List)cache.getIfPresent(IncomingMoneyRequestsManager.TAG);
                eventBus.post(new IncomingMoneyRequestsEvent(list, exception));
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((List)obj);
            }

            
            {
                this$0 = IncomingMoneyRequestsManager.this;
                super();
            }
        });
    }

    public final void initialize()
    {
        eventBus.registerEventProducer(com/google/android/apps/wallet/purchaserecord/IncomingMoneyRequestsEvent, new RegistrationCallback() {

            final IncomingMoneyRequestsManager this$0;

            public final void handleRegistration(Object obj)
            {
                handleRegistrationEvent(obj);
            }

            
            {
                this$0 = IncomingMoneyRequestsManager.this;
                super();
            }
        });
        eventBus.register(this, com/google/android/apps/wallet/purchaserecord/api/NewPurchaseRecordReceiptEvent, Integer.valueOf(12), new EventHandler() {

            final IncomingMoneyRequestsManager this$0;

            private void handleEvent(NewPurchaseRecordReceiptEvent newpurchaserecordreceiptevent)
            {
                postFreshEvent();
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((NewPurchaseRecordReceiptEvent)obj);
            }

            
            {
                this$0 = IncomingMoneyRequestsManager.this;
                super();
            }
        });
        eventBus.register(this, com/google/wallet/proto/NanoWalletTransport$SystemNotificationBundle$SystemNotification, new EventHandler() {

            final IncomingMoneyRequestsManager this$0;

            private void handleEvent(com.google.wallet.proto.NanoWalletTransport.SystemNotificationBundle.SystemNotification systemnotification)
            {
                if (Protos.valuesEqual(systemnotification.type, 4))
                {
                    postFreshEvent();
                }
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((com.google.wallet.proto.NanoWalletTransport.SystemNotificationBundle.SystemNotification)obj);
            }

            
            {
                this$0 = IncomingMoneyRequestsManager.this;
                super();
            }
        });
    }






}
