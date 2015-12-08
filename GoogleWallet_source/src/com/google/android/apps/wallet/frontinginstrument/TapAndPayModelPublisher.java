// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.frontinginstrument;

import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.cardlist.FrontingInstrumentClient;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import com.google.android.apps.wallet.eventbus.RegistrationCallback;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.paymentcard.api.PaymentCard;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.async.ThreadPreconditions;
import com.google.common.collect.Lists;
import com.google.protobuf.nano.MessageNano;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.wallet.frontinginstrument:
//            TapAndPayModel, FrontingInstrumentInfoManager, TapAndPayModelEvent

public class TapAndPayModelPublisher
    implements InitializedEventPublisher
{

    private static final TimeUnit CACHE_TTL_UNIT;
    private static final String TAG = com/google/android/apps/wallet/frontinginstrument/TapAndPayModelPublisher.getSimpleName();
    private final ActionExecutor actionExecutor;
    private final EventBus eventBus;
    private final FrontingInstrumentClient frontingInstrumentClient;
    private final FrontingInstrumentInfoManager frontingInstrumentInfoManager;
    private Exception lastRpcException;
    private long lastSuccessfulRpcTimeMillis;
    private final System system;

    TapAndPayModelPublisher(EventBus eventbus, System system1, ActionExecutor actionexecutor, FrontingInstrumentInfoManager frontinginstrumentinfomanager, FrontingInstrumentClient frontinginstrumentclient)
    {
        eventBus = eventbus;
        system = system1;
        actionExecutor = actionexecutor;
        frontingInstrumentInfoManager = frontinginstrumentinfomanager;
        frontingInstrumentClient = frontinginstrumentclient;
    }

    private void fetchModelFromServerAndPostIfChanged()
    {
        actionExecutor.executeAction(new Callable() {

            final TapAndPayModelPublisher this$0;

            private com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo call()
                throws Exception
            {
                com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo frontinginstrumentinfo = frontingInstrumentClient.getFrontingInstrumentInfo();
                com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo frontinginstrumentinfo1 = frontingInstrumentInfoManager.getFrontingInstrumentInfo();
                if (frontinginstrumentinfo1 != null && Arrays.equals(MessageNano.toByteArray(frontinginstrumentinfo1), MessageNano.toByteArray(frontinginstrumentinfo)))
                {
                    return null;
                } else
                {
                    frontingInstrumentInfoManager.saveFrontingInstrumentInfo(frontinginstrumentinfo);
                    return frontinginstrumentinfo;
                }
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = TapAndPayModelPublisher.this;
                super();
            }
        }, new AsyncCallback() {

            final TapAndPayModelPublisher this$0;

            private void onSuccess(com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo frontinginstrumentinfo)
            {
                lastRpcException = null;
                TapAndPayModelPublisher tapandpaymodelpublisher = TapAndPayModelPublisher.this;
                System _tmp = system;
                tapandpaymodelpublisher.lastSuccessfulRpcTimeMillis = System.currentTimeMillis();
                if (frontinginstrumentinfo == null)
                {
                    return;
                } else
                {
                    frontinginstrumentinfo = TapAndPayModelPublisher.frontingInstrumentInfo2TapAndPayModel(TapAndPayModelPublisher.this, frontinginstrumentinfo);
                    eventBus.post(new TapAndPayModelEvent(frontinginstrumentinfo, lastRpcException));
                    return;
                }
            }

            public final void onFailure(Exception exception)
            {
                lastRpcException = exception;
                getModelFromDatabaseAndPost(null);
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo)obj);
            }

            
            {
                this$0 = TapAndPayModelPublisher.this;
                super();
            }
        });
    }

    private static TapAndPayModel frontingInstrumentInfo2TapAndPayModel(com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo frontinginstrumentinfo)
    {
        java.util.ArrayList arraylist = Lists.newArrayList();
        Object obj = arraylist;
        if (frontinginstrumentinfo != null)
        {
            obj = arraylist;
            if (frontinginstrumentinfo.fundingSources != null)
            {
                obj = Arrays.asList(frontinginstrumentinfo.fundingSources);
            }
        }
        return new TapAndPayModel(((List) (obj)));
    }

    private void getModelFromDatabaseAndPost(final Runnable doAfter)
    {
        actionExecutor.executeAction(new Callable() {

            final TapAndPayModelPublisher this$0;

            private com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo call()
                throws Exception
            {
                return frontingInstrumentInfoManager.getFrontingInstrumentInfo();
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = TapAndPayModelPublisher.this;
                super();
            }
        }, new AsyncCallback() {

            final TapAndPayModelPublisher this$0;
            final Runnable val$doAfter;

            private void onSuccess(com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo frontinginstrumentinfo)
            {
                frontinginstrumentinfo = TapAndPayModelPublisher.frontingInstrumentInfo2TapAndPayModel(TapAndPayModelPublisher.this, frontinginstrumentinfo);
                eventBus.post(new TapAndPayModelEvent(frontinginstrumentinfo, lastRpcException));
                if (doAfter != null)
                {
                    doAfter.run();
                }
            }

            public final void onFailure(Exception exception)
            {
                WLog.e(TapAndPayModelPublisher.TAG, "Exception retrieving FrontingInstrumentInfo from db", exception);
                if (doAfter != null)
                {
                    doAfter.run();
                }
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo)obj);
            }

            
            {
                this$0 = TapAndPayModelPublisher.this;
                doAfter = runnable;
                super();
            }
        });
    }

    private void setFundingSourceListAndPost(List list)
        throws RpcException
    {
        list = frontingInstrumentClient.setFundingSources(list);
        if (((com.google.wallet.proto.api.NanoWalletFrontingInstrument.SetFundingSourcesResponse) (list)).frontingInstrumentInfo != null)
        {
            list = ((com.google.wallet.proto.api.NanoWalletFrontingInstrument.SetFundingSourcesResponse) (list)).frontingInstrumentInfo;
            frontingInstrumentInfoManager.saveFrontingInstrumentInfo(list);
            list = frontingInstrumentInfo2TapAndPayModel(list);
            eventBus.post(new TapAndPayModelEvent(list, null));
        } else
        if (((com.google.wallet.proto.api.NanoWalletFrontingInstrument.SetFundingSourcesResponse) (list)).callError != null)
        {
            eventBus.post(new TapAndPayModelEvent(null, new CallErrorException(((com.google.wallet.proto.api.NanoWalletFrontingInstrument.SetFundingSourcesResponse) (list)).callError)));
            return;
        }
    }

    public final void enableStoredValue(com.google.wallet.proto.NanoWalletEntities.StoredValue storedvalue, List list, boolean flag)
        throws RpcException
    {
        ThreadPreconditions.checkOnBackgroundThread();
        list = frontingInstrumentInfo2TapAndPayModel(frontingInstrumentInfoManager.getFrontingInstrumentInfo()).getSelectedCredential(list);
        java.util.ArrayList arraylist = Lists.newArrayList();
        if (flag)
        {
            arraylist.add(storedvalue.id);
        }
        if (list != null)
        {
            arraylist.add(list.getCdpId());
        }
        setFundingSourceListAndPost(arraylist);
    }

    protected final void handleRegistrationEvent()
    {
        ThreadPreconditions.checkOnUiThread();
        getModelFromDatabaseAndPost(new Runnable() {

            final TapAndPayModelPublisher this$0;

            public final void run()
            {
                System _tmp = system;
                if (System.currentTimeMillis() > lastSuccessfulRpcTimeMillis + TapAndPayModelPublisher.CACHE_TTL_UNIT.toMillis(5L))
                {
                    fetchModelFromServerAndPostIfChanged();
                }
            }

            
            {
                this$0 = TapAndPayModelPublisher.this;
                super();
            }
        });
    }

    public final void initialize()
    {
        eventBus.registerEventProducer(com/google/android/apps/wallet/frontinginstrument/TapAndPayModelEvent, new RegistrationCallback() {

            final TapAndPayModelPublisher this$0;

            public final void handleRegistration(Object obj)
            {
                handleRegistrationEvent();
            }

            
            {
                this$0 = TapAndPayModelPublisher.this;
                super();
            }
        });
    }

    public final void selectCredential(PaymentCard paymentcard, com.google.wallet.proto.NanoWalletEntities.StoredValue storedvalue)
        throws RpcException
    {
        selectCredential(paymentcard.getCdpId().subId, storedvalue);
    }

    public final void selectCredential(String s, com.google.wallet.proto.NanoWalletEntities.StoredValue storedvalue)
        throws RpcException
    {
        ThreadPreconditions.checkOnBackgroundThread();
        TapAndPayModel tapandpaymodel = frontingInstrumentInfo2TapAndPayModel(frontingInstrumentInfoManager.getFrontingInstrumentInfo());
        java.util.ArrayList arraylist = Lists.newArrayList();
        if (tapandpaymodel.isStoredValueEnabled(storedvalue))
        {
            arraylist.add(storedvalue.id);
        }
        storedvalue = new com.google.wallet.proto.NanoWalletEntities.CdpIdData();
        storedvalue.subId = s;
        arraylist.add(storedvalue);
        setFundingSourceListAndPost(arraylist);
    }

    static 
    {
        CACHE_TTL_UNIT = TimeUnit.MINUTES;
    }





/*
    static long access$102(TapAndPayModelPublisher tapandpaymodelpublisher, long l)
    {
        tapandpaymodelpublisher.lastSuccessfulRpcTimeMillis = l;
        return l;
    }

*/







/*
    static Exception access$602(TapAndPayModelPublisher tapandpaymodelpublisher, Exception exception)
    {
        tapandpaymodelpublisher.lastRpcException = exception;
        return exception;
    }

*/



}
