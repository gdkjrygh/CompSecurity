// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import android.os.Handler;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.config.featurecontrol.FeaturesChangedEvent;
import com.google.android.apps.wallet.eventbus.AbstractCachedRpcPublisher;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.RegistrationCallback;
import com.google.android.apps.wallet.refresh.RequestRefreshEvent;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import com.google.common.base.Optional;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.wallet.recurringtopup:
//            RecurringTopupEvent, TopupScheduleClient, RecurringTopupRpcCache

public class RecurringTopupPublisher extends AbstractCachedRpcPublisher
{

    private final EventBus eventBus;
    private final FeatureManager featureManager;
    private final Handler mainThreadHandler;
    private final ThreadChecker threadChecker;
    private final TopupScheduleClient topupScheduleClient;

    RecurringTopupPublisher(RecurringTopupRpcCache recurringtopuprpccache, EventBus eventbus, ActionExecutor actionexecutor, ThreadChecker threadchecker, TopupScheduleClient topupscheduleclient, FeatureManager featuremanager, Handler handler)
    {
        super(recurringtopuprpccache, eventbus, actionexecutor, threadchecker, TimeUnit.MINUTES.toMillis(5L));
        topupScheduleClient = topupscheduleclient;
        featureManager = featuremanager;
        eventBus = eventbus;
        threadChecker = threadchecker;
        mainThreadHandler = handler;
    }

    private static RecurringTopupEvent buildErrorEvent(Exception exception)
    {
        return new RecurringTopupEvent(true, null, exception);
    }

    private static RecurringTopupEvent buildEvent(Optional optional)
    {
        if (optional != null && optional.isPresent())
        {
            optional = (com.google.wallet.proto.api.NanoWalletScheduleTopups.DisplayableSchedule)optional.get();
        } else
        {
            optional = null;
        }
        return new RecurringTopupEvent(true, optional, null);
    }

    protected final volatile Object buildErrorEvent(Exception exception)
    {
        return buildErrorEvent(exception);
    }

    protected final volatile Object buildEvent(Object obj)
    {
        return buildEvent((Optional)obj);
    }

    public final com.google.wallet.proto.api.NanoWalletScheduleTopups.CancelTopupScheduleResponse cancelTopupSchedule(final byte res[], boolean flag)
        throws RpcException
    {
        Object obj = threadChecker;
        ThreadChecker.checkOnBackgroundThread();
        obj = new com.google.wallet.proto.api.NanoWalletScheduleTopups.CancelTopupScheduleRequest();
        obj.serverData = res;
        obj.ignoreDeadline = Boolean.valueOf(flag);
        res = topupScheduleClient.cancelTopupSchedule(((com.google.wallet.proto.api.NanoWalletScheduleTopups.CancelTopupScheduleRequest) (obj)));
        mainThreadHandler.post(new Runnable() {

            final RecurringTopupPublisher this$0;
            final com.google.wallet.proto.api.NanoWalletScheduleTopups.CancelTopupScheduleResponse val$res;

            public final void run()
            {
                if (res.callError == null)
                {
                    postAndCacheNewData(Optional.absent());
                } else
                if (res.callError.errorCode.intValue() == 2)
                {
                    generateAndPostEvent(false);
                    return;
                }
            }

            
            {
                this$0 = RecurringTopupPublisher.this;
                res = canceltopupscheduleresponse;
                super();
            }
        });
        return res;
    }

    public final void initialize()
    {
        eventBus.registerEventProducer(com/google/android/apps/wallet/recurringtopup/RecurringTopupEvent, new RegistrationCallback() {

            final RecurringTopupPublisher this$0;

            public final void handleRegistration(Object obj)
            {
                generateAndPostEvent();
            }

            
            {
                this$0 = RecurringTopupPublisher.this;
                super();
            }
        });
        eventBus.register(this);
    }

    void onFeaturesChanged(FeaturesChangedEvent featureschangedevent)
    {
        if (featureschangedevent.didFeatureStateChange(Feature.SCHEDULED_STORED_VALUE_TOPUP))
        {
            generateAndPostEvent(false);
        }
    }

    void onRequestRefresh(RequestRefreshEvent requestrefreshevent)
    {
        generateAndPostEvent(false);
    }

    protected final boolean overrideIfDisabled()
    {
        boolean flag = false;
        if (!featureManager.isFeatureEnabled(Feature.SCHEDULED_STORED_VALUE_TOPUP))
        {
            eventBus.post(new RecurringTopupEvent(false, null, null));
            flag = true;
        }
        return flag;
    }

    public final com.google.wallet.proto.api.NanoWalletScheduleTopups.PreviewTopupScheduleResponse previewTopupSchedule(com.google.wallet.proto.features.NanoPaymentSchedule.Schedule schedule, com.google.wallet.proto.NanoWalletEntities.MoneyProto moneyproto, String s)
        throws RpcException
    {
        Object obj = threadChecker;
        ThreadChecker.checkOnBackgroundThread();
        obj = new com.google.wallet.proto.api.NanoWalletScheduleTopups.PreviewTopupScheduleRequest();
        obj.scheduleChange = new com.google.wallet.proto.features.NanoPaymentSchedule.ScheduleChange();
        ((com.google.wallet.proto.api.NanoWalletScheduleTopups.PreviewTopupScheduleRequest) (obj)).scheduleChange.schedule = schedule;
        ((com.google.wallet.proto.api.NanoWalletScheduleTopups.PreviewTopupScheduleRequest) (obj)).scheduleChange.amount = moneyproto;
        ((com.google.wallet.proto.api.NanoWalletScheduleTopups.PreviewTopupScheduleRequest) (obj)).scheduleChange.fundingInstrumentSubId = s;
        return topupScheduleClient.previewTopupSchedule(((com.google.wallet.proto.api.NanoWalletScheduleTopups.PreviewTopupScheduleRequest) (obj)));
    }

    public final com.google.wallet.proto.api.NanoWalletScheduleTopups.ScheduleTopupResponse scheduleTopup(final byte res[])
        throws RpcException
    {
        Object obj = threadChecker;
        ThreadChecker.checkOnBackgroundThread();
        obj = new com.google.wallet.proto.api.NanoWalletScheduleTopups.ScheduleTopupRequest();
        obj.serverData = res;
        res = topupScheduleClient.scheduleTopup(((com.google.wallet.proto.api.NanoWalletScheduleTopups.ScheduleTopupRequest) (obj)));
        mainThreadHandler.post(new Runnable() {

            final RecurringTopupPublisher this$0;
            final com.google.wallet.proto.api.NanoWalletScheduleTopups.ScheduleTopupResponse val$res;

            public final void run()
            {
                if (res.callError == null)
                {
                    postAndCacheNewData(Optional.fromNullable(res.schedule));
                } else
                if (res.callError.errorCode.intValue() == 2)
                {
                    generateAndPostEvent(false);
                    return;
                }
            }

            
            {
                this$0 = RecurringTopupPublisher.this;
                res = scheduletopupresponse;
                super();
            }
        });
        return res;
    }

    public final com.google.wallet.proto.api.NanoWalletScheduleTopups.SkipNextTopupTransactionResponse skipNextTopupTransaction(final byte res[])
        throws RpcException
    {
        Object obj = threadChecker;
        ThreadChecker.checkOnBackgroundThread();
        obj = new com.google.wallet.proto.api.NanoWalletScheduleTopups.SkipNextTopupTransactionRequest();
        obj.serverData = res;
        res = topupScheduleClient.skipNextTopupTransaction(((com.google.wallet.proto.api.NanoWalletScheduleTopups.SkipNextTopupTransactionRequest) (obj)));
        mainThreadHandler.post(new Runnable() {

            final RecurringTopupPublisher this$0;
            final com.google.wallet.proto.api.NanoWalletScheduleTopups.SkipNextTopupTransactionResponse val$res;

            public final void run()
            {
                if (res.callError == null)
                {
                    postAndCacheNewData(Optional.fromNullable(res.schedule));
                } else
                if (res.callError.errorCode.intValue() == 2)
                {
                    generateAndPostEvent(false);
                    return;
                }
            }

            
            {
                this$0 = RecurringTopupPublisher.this;
                res = skipnexttopuptransactionresponse;
                super();
            }
        });
        return res;
    }






}
