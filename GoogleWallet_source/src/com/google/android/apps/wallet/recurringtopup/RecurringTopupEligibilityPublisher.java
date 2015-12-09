// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.config.featurecontrol.FeaturesChangedEvent;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import com.google.android.apps.wallet.eventbus.RegistrationCallback;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.common.cache.Cache;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.recurringtopup:
//            RecurringTopupEligibilityEvent, TopupScheduleClient

public class RecurringTopupEligibilityPublisher
    implements InitializedEventPublisher
{

    private static final Object CACHE_KEY = new Object();
    private final ActionExecutor actionExecutor;
    private final Cache cache;
    private final EventBus eventBus;
    private final FeatureManager featureManager;
    private final TopupScheduleClient topupScheduleClient;

    RecurringTopupEligibilityPublisher(FeatureManager featuremanager, TopupScheduleClient topupscheduleclient, Cache cache1, ActionExecutor actionexecutor, EventBus eventbus)
    {
        featureManager = featuremanager;
        topupScheduleClient = topupscheduleclient;
        cache = cache1;
        actionExecutor = actionexecutor;
        eventBus = eventbus;
    }

    private void asyncGenerateAndPostEvent()
    {
        if (!featureManager.isFeatureEnabled(Feature.SCHEDULED_STORED_VALUE_TOPUP))
        {
            eventBus.post(new RecurringTopupEligibilityEvent(false, null, null));
            return;
        } else
        {
            actionExecutor.executeAction(new Callable() {

                final RecurringTopupEligibilityPublisher this$0;

                private com.google.wallet.proto.api.NanoWalletScheduleTopups.CheckScheduledTopupEligibilityResponse call()
                    throws RpcException
                {
                    return topupScheduleClient.checkEligibility(new com.google.wallet.proto.api.NanoWalletScheduleTopups.CheckScheduledTopupEligibilityRequest());
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = RecurringTopupEligibilityPublisher.this;
                super();
            }
            }, new AsyncCallback() {

                final RecurringTopupEligibilityPublisher this$0;

                private void onSuccess(com.google.wallet.proto.api.NanoWalletScheduleTopups.CheckScheduledTopupEligibilityResponse checkscheduledtopupeligibilityresponse)
                {
                    RecurringTopupEligibilityEvent recurringtopupeligibilityevent;
                    if (checkscheduledtopupeligibilityresponse.callError != null)
                    {
                        RecurringTopupEligibilityEvent recurringtopupeligibilityevent1 = new RecurringTopupEligibilityEvent(true, null, new CallErrorException(checkscheduledtopupeligibilityresponse.callError));
                        recurringtopupeligibilityevent = recurringtopupeligibilityevent1;
                        if (!Protos.valuesEqual(checkscheduledtopupeligibilityresponse.callError.errorCode, 1))
                        {
                            cache.put(RecurringTopupEligibilityPublisher.CACHE_KEY, recurringtopupeligibilityevent1);
                            recurringtopupeligibilityevent = recurringtopupeligibilityevent1;
                        }
                    } else
                    {
                        recurringtopupeligibilityevent = new RecurringTopupEligibilityEvent(true, ImmutableList.copyOf(checkscheduledtopupeligibilityresponse.transferLimits), null);
                        cache.put(RecurringTopupEligibilityPublisher.CACHE_KEY, recurringtopupeligibilityevent);
                    }
                    eventBus.post(recurringtopupeligibilityevent);
                }

                public final void onFailure(Exception exception)
                {
                    eventBus.post(new RecurringTopupEligibilityEvent(true, null, exception));
                }

                public final volatile void onSuccess(Object obj)
                {
                    onSuccess((com.google.wallet.proto.api.NanoWalletScheduleTopups.CheckScheduledTopupEligibilityResponse)obj);
                }

            
            {
                this$0 = RecurringTopupEligibilityPublisher.this;
                super();
            }
            });
            return;
        }
    }

    private void handleRegistrationEvent(Object obj)
    {
        RecurringTopupEligibilityEvent recurringtopupeligibilityevent = (RecurringTopupEligibilityEvent)cache.getIfPresent(CACHE_KEY);
        if (recurringtopupeligibilityevent != null)
        {
            eventBus.post(obj, recurringtopupeligibilityevent);
            return;
        } else
        {
            asyncGenerateAndPostEvent();
            return;
        }
    }

    public final void initialize()
    {
        eventBus.registerEventProducer(com/google/android/apps/wallet/recurringtopup/RecurringTopupEligibilityEvent, new RegistrationCallback() {

            final RecurringTopupEligibilityPublisher this$0;

            public final void handleRegistration(Object obj)
            {
                handleRegistrationEvent(obj);
            }

            
            {
                this$0 = RecurringTopupEligibilityPublisher.this;
                super();
            }
        });
        eventBus.register(this, com/google/android/apps/wallet/config/featurecontrol/FeaturesChangedEvent, new EventHandler() {

            final RecurringTopupEligibilityPublisher this$0;

            private void handleEvent(FeaturesChangedEvent featureschangedevent)
            {
                if (featureschangedevent.didFeatureStateChange(Feature.SCHEDULED_STORED_VALUE_TOPUP))
                {
                    cache.invalidate(RecurringTopupEligibilityPublisher.CACHE_KEY);
                    asyncGenerateAndPostEvent();
                }
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((FeaturesChangedEvent)obj);
            }

            
            {
                this$0 = RecurringTopupEligibilityPublisher.this;
                super();
            }
        });
    }







}
