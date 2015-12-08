// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue.api;

import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.config.featurecontrol.FeaturesChangedEvent;
import com.google.android.apps.wallet.eventbus.AbstractCachedRpcPublisher;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.RegistrationCallback;
import com.google.android.apps.wallet.purchaserecord.api.NewPurchaseRecordReceiptEvent;
import com.google.android.apps.wallet.refresh.RequestRefreshEvent;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.common.collect.ImmutableSet;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.wallet.storedvalue.api:
//            StoredValueEvent, StoredValueModel, StoredValueRpcCache

public class StoredValuePublisher extends AbstractCachedRpcPublisher
{

    private final EventBus eventBus;
    private final FeatureManager featureManager;
    private StoredValueModel lastPostedModel;

    StoredValuePublisher(StoredValueRpcCache storedvaluerpccache, FeatureManager featuremanager, ActionExecutor actionexecutor, EventBus eventbus, ThreadChecker threadchecker)
    {
        this(storedvaluerpccache, featuremanager, actionexecutor, eventbus, threadchecker, TimeUnit.MINUTES.toMillis(5L));
    }

    private StoredValuePublisher(StoredValueRpcCache storedvaluerpccache, FeatureManager featuremanager, ActionExecutor actionexecutor, EventBus eventbus, ThreadChecker threadchecker, long l)
    {
        super(storedvaluerpccache, eventbus, actionexecutor, threadchecker, l);
        featureManager = featuremanager;
        eventBus = eventbus;
    }

    private StoredValueEvent buildErrorEvent(Exception exception)
    {
        return new StoredValueEvent(lastPostedModel, exception, featureManager.isFeatureEnabled(Feature.STORED_VALUE_BALANCE));
    }

    private StoredValueEvent buildEvent(com.google.wallet.proto.NanoWalletEntities.StoredValue storedvalue)
    {
        if (storedvalue == null || storedvalue.id == null)
        {
            storedvalue = null;
        }
        lastPostedModel = new StoredValueModel(storedvalue);
        return new StoredValueEvent(lastPostedModel, null, featureManager.isFeatureEnabled(Feature.STORED_VALUE_BALANCE));
    }

    protected final volatile Object buildErrorEvent(Exception exception)
    {
        return buildErrorEvent(exception);
    }

    protected final volatile Object buildEvent(Object obj)
    {
        return buildEvent((com.google.wallet.proto.NanoWalletEntities.StoredValue)obj);
    }

    public final void initialize()
    {
        eventBus.registerEventProducer(com/google/android/apps/wallet/storedvalue/api/StoredValueEvent, new RegistrationCallback() {

            final StoredValuePublisher this$0;

            public final void handleRegistration(Object obj)
            {
                generateAndPostEvent();
            }

            
            {
                this$0 = StoredValuePublisher.this;
                super();
            }
        });
        eventBus.register(this);
    }

    void onFeaturesChangedEvent(FeaturesChangedEvent featureschangedevent)
    {
        if (featureschangedevent.getTurnedOffFeatures().contains(Feature.STORED_VALUE_BALANCE))
        {
            postAndCacheNewData(null);
        } else
        if (featureschangedevent.getTurnedOnFeatures().contains(Feature.STORED_VALUE_BALANCE))
        {
            generateAndPostEvent(false);
            return;
        }
    }

    void onNewPurchaseRecordReceiptEvent(NewPurchaseRecordReceiptEvent newpurchaserecordreceiptevent)
    {
        generateAndPostEvent(false);
    }

    void onRequestRefreshEvent(RequestRefreshEvent requestrefreshevent)
    {
        generateAndPostEvent(false);
    }

    void onSystemNotification(com.google.wallet.proto.NanoWalletTransport.SystemNotificationBundle.SystemNotification systemnotification)
    {
        if (Protos.valuesEqual(systemnotification.type, 3))
        {
            generateAndPostEvent(false);
        }
    }

    protected final boolean overrideIfDisabled()
    {
        if (!featureManager.isFeatureEnabled(Feature.STORED_VALUE_BALANCE))
        {
            postAndCacheNewData(null);
            return true;
        } else
        {
            return false;
        }
    }
}
