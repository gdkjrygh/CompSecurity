// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.content.SharedPreferences;
import android.os.Handler;
import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.cardlist.FrontingInstrumentClient;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import com.google.android.apps.wallet.eventbus.RegistrationCallback;
import com.google.android.apps.wallet.frontinginstrument.FrontingInstrumentInfoManager;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.plastic.api.PlasticCard;
import com.google.android.apps.wallet.plastic.api.PlasticCardCashWithdrawalDetails;
import com.google.android.apps.wallet.plastic.api.PlasticCardModel;
import com.google.android.apps.wallet.plastic.api.PlasticCardModelEvent;
import com.google.android.apps.wallet.refresh.RequestRefreshEvent;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.common.base.Preconditions;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class PlasticCardModelPublisher
    implements InitializedEventPublisher
{

    static final Object CACHE_KEY = new Object();
    private static final String TAG = com/google/android/apps/wallet/plastic/PlasticCardModelPublisher.getSimpleName();
    private final ActionExecutor actionExecutor;
    final Cache cache;
    private final EventBus eventBus;
    private final FeatureManager featureManager;
    private final FrontingInstrumentClient frontingInstrumentClient;
    private final FrontingInstrumentInfoManager frontingInstrumentInfoManager;
    private final Handler handler;
    private boolean hasSeenRegistrationEvent;
    private final SharedPreferences sharedPrefs;
    private final ThreadChecker threadChecker;

    public PlasticCardModelPublisher(EventBus eventbus, ActionExecutor actionexecutor, Handler handler1, ThreadChecker threadchecker, FrontingInstrumentClient frontinginstrumentclient, FrontingInstrumentInfoManager frontinginstrumentinfomanager, SharedPreferences sharedpreferences, 
            FeatureManager featuremanager)
    {
        this(eventbus, actionexecutor, handler1, threadchecker, frontinginstrumentclient, frontinginstrumentinfomanager, sharedpreferences, featuremanager, 5L);
    }

    private PlasticCardModelPublisher(EventBus eventbus, ActionExecutor actionexecutor, Handler handler1, ThreadChecker threadchecker, FrontingInstrumentClient frontinginstrumentclient, FrontingInstrumentInfoManager frontinginstrumentinfomanager, SharedPreferences sharedpreferences, 
            FeatureManager featuremanager, long l)
    {
        eventBus = eventbus;
        actionExecutor = actionexecutor;
        handler = handler1;
        threadChecker = threadchecker;
        frontingInstrumentClient = frontinginstrumentclient;
        frontingInstrumentInfoManager = frontinginstrumentinfomanager;
        sharedPrefs = sharedpreferences;
        featureManager = featuremanager;
        cache = CacheBuilder.newBuilder().expireAfterWrite(l, TimeUnit.MINUTES).build();
    }

    private void asyncFetchFrontingInstrumentInfoFromServerAndPostIfChanged()
    {
        actionExecutor.executeAction(new Callable() {

            final PlasticCardModelPublisher this$0;

            private com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo call()
                throws RpcException, CallErrorException
            {
                return frontingInstrumentClient.getFrontingInstrumentInfo();
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = PlasticCardModelPublisher.this;
                super();
            }
        }, new AsyncCallback() {

            final PlasticCardModelPublisher this$0;

            private void onSuccess(com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo frontinginstrumentinfo)
            {
                generateEventAndPostIfChanged(frontinginstrumentinfo);
            }

            public final void onFailure(Exception exception)
            {
                eventBus.post(PlasticCardModelPublisher.generateFailureEvent(PlasticCardModelPublisher.this, exception));
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo)obj);
            }

            
            {
                this$0 = PlasticCardModelPublisher.this;
                super();
            }
        });
    }

    private void asyncReadFrontingInstrumentInfoFromDbAndPostToRegistrant(final Object eventId)
    {
        actionExecutor.executeAction(new Callable() {

            final PlasticCardModelPublisher this$0;

            private com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo call()
                throws RpcException
            {
                return frontingInstrumentInfoManager.getFrontingInstrumentInfo();
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = PlasticCardModelPublisher.this;
                super();
            }
        }, new AsyncCallback() {

            final PlasticCardModelPublisher this$0;
            final Object val$eventId;

            private void onSuccess(com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo frontinginstrumentinfo)
            {
                if (frontinginstrumentinfo != null && cache.getIfPresent(PlasticCardModelPublisher.CACHE_KEY) == null)
                {
                    cache.put(PlasticCardModelPublisher.CACHE_KEY, frontinginstrumentinfo);
                    eventBus.post(eventId, generateEvent(frontinginstrumentinfo));
                }
            }

            public final void onFailure(Exception exception)
            {
                WLog.e(PlasticCardModelPublisher.TAG, "Error reading FrontingInstrumentInfo from db", exception);
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo)obj);
            }

            
            {
                this$0 = PlasticCardModelPublisher.this;
                eventId = obj;
                super();
            }
        });
    }

    private com.google.android.apps.wallet.plastic.api.PlasticCard.Status decidePlasticCardStatus(List list)
    {
        int i = findCurrentPlasticCard(list);
        if (i >= 0)
        {
            list = (com.google.wallet.proto.NanoWalletEntities.PlasticProxyCardDetails)list.get(i);
            return (new PlasticCard(list, decideStatusOfIndividualCard(list))).getStatus();
        } else
        {
            return com.google.android.apps.wallet.plastic.api.PlasticCard.Status.NOT_REQUESTED;
        }
    }

    private com.google.android.apps.wallet.plastic.api.PlasticCard.Status decideStatusOfIndividualCard(com.google.wallet.proto.NanoWalletEntities.PlasticProxyCardDetails plasticproxycarddetails)
    {
        if (plasticproxycarddetails.proxyCard == null)
        {
            return com.google.android.apps.wallet.plastic.api.PlasticCard.Status.NOT_REQUESTED;
        }
        switch (Protos.valueWithDefault(plasticproxycarddetails.proxyCard.status, 5))
        {
        default:
            return com.google.android.apps.wallet.plastic.api.PlasticCard.Status.UNKNOWN;

        case 1: // '\001'
            if (plasticproxycarddetails.fulfillmentStatus != null)
            {
                if (plasticproxycarddetails.fulfillmentStatus.equals(Integer.valueOf(5)))
                {
                    return com.google.android.apps.wallet.plastic.api.PlasticCard.Status.CANCELED;
                } else
                {
                    return com.google.android.apps.wallet.plastic.api.PlasticCard.Status.REQUESTED;
                }
            } else
            {
                return com.google.android.apps.wallet.plastic.api.PlasticCard.Status.UNKNOWN;
            }

        case 3: // '\003'
            return com.google.android.apps.wallet.plastic.api.PlasticCard.Status.CANCELED;

        case 2: // '\002'
            if (featureManager.isFeatureEnabled(Feature.WALLET_CARD_LOCK) && plasticproxycarddetails.proxyCard.lockingInfo != null && plasticproxycarddetails.proxyCard.lockingInfo.lockingStatus.intValue() == 2)
            {
                return com.google.android.apps.wallet.plastic.api.PlasticCard.Status.LOCKED;
            } else
            {
                return com.google.android.apps.wallet.plastic.api.PlasticCard.Status.ACTIVATED;
            }

        case 4: // '\004'
            return com.google.android.apps.wallet.plastic.api.PlasticCard.Status.SUSPENDED;

        case 5: // '\005'
            return com.google.android.apps.wallet.plastic.api.PlasticCard.Status.UNKNOWN;
        }
    }

    private static int findCurrentPlasticCard(List list)
    {
        if (list != null) goto _L2; else goto _L1
_L1:
        int i = -1;
_L6:
        return i;
_L2:
        int j = 0;
_L7:
        if (j >= list.size()) goto _L4; else goto _L3
_L3:
        com.google.wallet.proto.NanoWalletEntities.PlasticProxyCardDetails plasticproxycarddetails;
        plasticproxycarddetails = (com.google.wallet.proto.NanoWalletEntities.PlasticProxyCardDetails)list.get(j);
        if (plasticproxycarddetails.proxyCard == null || !Protos.valuesEqual(plasticproxycarddetails.proxyCard.status, 1))
        {
            continue; /* Loop/switch isn't completed */
        }
        i = j;
        if (plasticproxycarddetails.fulfillmentStatus != null) goto _L6; else goto _L5
_L5:
        j++;
          goto _L7
_L4:
        j = 0;
_L12:
        if (j >= list.size()) goto _L9; else goto _L8
_L8:
        plasticproxycarddetails = (com.google.wallet.proto.NanoWalletEntities.PlasticProxyCardDetails)list.get(j);
        if (plasticproxycarddetails.proxyCard == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = j;
        if (Protos.valuesEqual(plasticproxycarddetails.proxyCard.status, 2)) goto _L6; else goto _L10
_L10:
        i = j;
        if (Protos.valuesEqual(plasticproxycarddetails.proxyCard.status, 5)) goto _L6; else goto _L11
_L11:
        j++;
          goto _L12
_L9:
        j = 0;
_L16:
        if (j >= list.size()) goto _L14; else goto _L13
_L13:
        plasticproxycarddetails = (com.google.wallet.proto.NanoWalletEntities.PlasticProxyCardDetails)list.get(j);
        if (plasticproxycarddetails.proxyCard == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = j;
        if (Protos.valuesEqual(plasticproxycarddetails.proxyCard.status, 4)) goto _L6; else goto _L15
_L15:
        j++;
          goto _L16
_L14:
        j = -1;
        long l = 0L;
        for (i = 0; i < list.size();)
        {
            int k;
            long l1;
label0:
            {
                plasticproxycarddetails = (com.google.wallet.proto.NanoWalletEntities.PlasticProxyCardDetails)list.get(i);
                k = j;
                l1 = l;
                if (plasticproxycarddetails.proxyCard == null)
                {
                    break label0;
                }
                k = j;
                l1 = l;
                if (!Protos.valuesEqual(plasticproxycarddetails.proxyCard.status, 3))
                {
                    break label0;
                }
                long l2 = Protos.valueWithDefault(plasticproxycarddetails.proxyCard.cancellationTimestampMillis, 0L);
                if (j != -1)
                {
                    k = j;
                    l1 = l;
                    if (l2 <= l)
                    {
                        break label0;
                    }
                }
                k = i;
                l1 = l2;
            }
            i++;
            j = k;
            l = l1;
        }

        if (j != -1)
        {
            return j;
        }
        j = 0;
_L20:
        if (j >= list.size()) goto _L18; else goto _L17
_L17:
        plasticproxycarddetails = (com.google.wallet.proto.NanoWalletEntities.PlasticProxyCardDetails)list.get(j);
        if (plasticproxycarddetails.proxyCard == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = j;
        if (Protos.valueWithDefault(plasticproxycarddetails.proxyCard.status, 5) == 5) goto _L6; else goto _L19
_L19:
        j++;
          goto _L20
_L18:
        return -1;
    }

    private PlasticCardModelEvent generateEvent(com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo frontinginstrumentinfo)
    {
        if (frontinginstrumentinfo == null)
        {
            return PlasticCardModelEvent.newModelEvent(new PlasticCardModel(null, null));
        }
        com.google.wallet.proto.NanoWalletEntities.CashWithdrawalDetails cashwithdrawaldetails = null;
        List list = Arrays.asList(frontinginstrumentinfo.plasticFrontingInstrumentDetails);
        Object obj = cashwithdrawaldetails;
        if (list != null)
        {
            int i = findCurrentPlasticCard(list);
            obj = cashwithdrawaldetails;
            if (i >= 0)
            {
                obj = (com.google.wallet.proto.NanoWalletEntities.PlasticProxyCardDetails)list.get(i);
                obj = new PlasticCard(((com.google.wallet.proto.NanoWalletEntities.PlasticProxyCardDetails) (obj)), decideStatusOfIndividualCard(((com.google.wallet.proto.NanoWalletEntities.PlasticProxyCardDetails) (obj))));
            }
        }
        cashwithdrawaldetails = frontinginstrumentinfo.cashWithdrawalDetails;
        frontinginstrumentinfo = cashwithdrawaldetails;
        if (cashwithdrawaldetails == null)
        {
            frontinginstrumentinfo = new com.google.wallet.proto.NanoWalletEntities.CashWithdrawalDetails();
        }
        if (obj != null && ((PlasticCard) (obj)).getStatus() != com.google.android.apps.wallet.plastic.api.PlasticCard.Status.CANCELED && ((PlasticCard) (obj)).getStatus() != com.google.android.apps.wallet.plastic.api.PlasticCard.Status.SUSPENDED)
        {
            SharedPreference.DEACTIVATED_PLASTIC_CARD_TILE_DISMISSED.put(sharedPrefs, Boolean.valueOf(false));
        }
        return PlasticCardModelEvent.newModelEvent(new PlasticCardModel(((PlasticCard) (obj)), new PlasticCardCashWithdrawalDetails(frontinginstrumentinfo)));
    }

    private void generateEventAndPostIfChanged(final com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo info)
    {
        Object obj = threadChecker;
        ThreadChecker.checkOnUiThread();
        obj = generateEvent(info);
        com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo frontinginstrumentinfo = (com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo)cache.getIfPresent(CACHE_KEY);
        if (frontinginstrumentinfo == null || !((PlasticCardModelEvent) (obj)).equals(generateEvent(frontinginstrumentinfo)))
        {
            cache.put(CACHE_KEY, info);
            eventBus.post(obj);
            actionExecutor.executeAction(new Callable() {

                final PlasticCardModelPublisher this$0;
                final com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo val$info;

                private Void call()
                {
                    frontingInstrumentInfoManager.saveFrontingInstrumentInfo(info);
                    return null;
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = PlasticCardModelPublisher.this;
                info = frontinginstrumentinfo;
                super();
            }
            });
        }
    }

    private void generateEventFromCardAndAlwaysPost(com.google.wallet.proto.NanoWalletEntities.PlasticProxyCardDetails plasticproxycarddetails)
        throws CallErrorException, RpcException
    {
        final com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo frontingInstrumentInfo = threadChecker;
        ThreadChecker.checkOnBackgroundThread();
        com.google.wallet.proto.NanoWalletEntities.PlasticProxyCardDetails aplasticproxycarddetails[];
        if (cache.getIfPresent(CACHE_KEY) == null)
        {
            frontingInstrumentInfo = frontingInstrumentClient.getFrontingInstrumentInfo();
        } else
        {
            frontingInstrumentInfo = (com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo)cache.getIfPresent(CACHE_KEY);
        }
        Preconditions.checkNotNull(frontingInstrumentInfo);
        aplasticproxycarddetails = frontingInstrumentInfo.plasticFrontingInstrumentDetails;
        for (int i = 0; i < aplasticproxycarddetails.length; i++)
        {
            com.google.wallet.proto.NanoWalletEntities.PlasticProxyCardDetails plasticproxycarddetails1 = aplasticproxycarddetails[i];
            if (plasticproxycarddetails1.proxyCard != null && plasticproxycarddetails1.proxyCard.cdpProxyId != null && plasticproxycarddetails1.proxyCard.cdpProxyId.subId != null && plasticproxycarddetails1.proxyCard.cdpProxyId.subId.equals(plasticproxycarddetails.proxyCard.cdpProxyId.subId))
            {
                aplasticproxycarddetails[i] = plasticproxycarddetails;
            }
        }

        handler.post(new Runnable() {

            final PlasticCardModelPublisher this$0;
            final com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo val$frontingInstrumentInfo;

            public final void run()
            {
                PlasticCardModelEvent plasticcardmodelevent = generateEvent(frontingInstrumentInfo);
                eventBus.post(plasticcardmodelevent);
            }

            
            {
                this$0 = PlasticCardModelPublisher.this;
                frontingInstrumentInfo = frontinginstrumentinfo;
                super();
            }
        });
    }

    private static PlasticCardModelEvent generateFailureEvent(Exception exception)
    {
        return PlasticCardModelEvent.newFailureEvent(exception);
    }

    private void handleRegistrationEvent(Object obj)
    {
        com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo frontinginstrumentinfo = (com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo)cache.getIfPresent(CACHE_KEY);
        if (frontinginstrumentinfo != null)
        {
            eventBus.post(obj, generateEvent(frontinginstrumentinfo));
            return;
        } else
        {
            asyncReadFrontingInstrumentInfoFromDbAndPostToRegistrant(obj);
            asyncFetchFrontingInstrumentInfoFromServerAndPostIfChanged();
            return;
        }
    }

    public final com.google.android.apps.wallet.plastic.api.PlasticCard.Status activatePlasticCard(final String response, com.google.wallet.proto.NanoWalletEntities.CdpIdData cdpiddata)
        throws CallErrorException, RpcException
    {
        boolean flag1 = true;
        WLog.v(TAG, "Started activate plastic card");
        Object obj = threadChecker;
        ThreadChecker.checkOnBackgroundThread();
        Preconditions.checkNotNull(response);
        boolean flag;
        if (!response.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        Preconditions.checkNotNull(cdpiddata);
        obj = new com.google.wallet.proto.api.NanoWalletFrontingInstrument.ActivatePlasticCardRequest();
        obj.cardNumberLast4 = response;
        obj.proxyCardId = cdpiddata;
        response = frontingInstrumentClient.activatePlasticCard(((com.google.wallet.proto.api.NanoWalletFrontingInstrument.ActivatePlasticCardRequest) (obj)));
        if (((com.google.wallet.proto.api.NanoWalletFrontingInstrument.ActivatePlasticCardResponse) (response)).callError != null)
        {
            throw new CallErrorException(((com.google.wallet.proto.api.NanoWalletFrontingInstrument.ActivatePlasticCardResponse) (response)).callError);
        }
        if (((com.google.wallet.proto.api.NanoWalletFrontingInstrument.ActivatePlasticCardResponse) (response)).frontingInstrumentInfo != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Received empty response from server.");
        handler.post(new Runnable() {

            final PlasticCardModelPublisher this$0;
            final com.google.wallet.proto.api.NanoWalletFrontingInstrument.ActivatePlasticCardResponse val$response;

            public final void run()
            {
                generateEventAndPostIfChanged(response.frontingInstrumentInfo);
            }

            
            {
                this$0 = PlasticCardModelPublisher.this;
                response = activateplasticcardresponse;
                super();
            }
        });
        return decidePlasticCardStatus(Arrays.asList(((com.google.wallet.proto.api.NanoWalletFrontingInstrument.ActivatePlasticCardResponse) (response)).frontingInstrumentInfo.plasticFrontingInstrumentDetails));
    }

    public final com.google.wallet.proto.api.NanoWalletFrontingInstrument.CancelPlasticCardResponse cancelPlasticCard(com.google.wallet.proto.NanoWalletEntities.CdpIdData cdpiddata, int i, String s)
        throws CallErrorException, RpcException
    {
        Object obj = threadChecker;
        ThreadChecker.checkOnBackgroundThread();
        Preconditions.checkNotNull(cdpiddata);
        obj = new com.google.wallet.proto.api.NanoWalletFrontingInstrument.CancelPlasticCardRequest();
        obj.proxyCardId = cdpiddata;
        obj.reason = new com.google.wallet.proto.NanoWalletEntities.CancelPlasticCardReason();
        ((com.google.wallet.proto.api.NanoWalletFrontingInstrument.CancelPlasticCardRequest) (obj)).reason.reason = Integer.valueOf(i);
        ((com.google.wallet.proto.api.NanoWalletFrontingInstrument.CancelPlasticCardRequest) (obj)).reason.otherExplanation = s;
        cdpiddata = frontingInstrumentClient.cancelPlasticCard(((com.google.wallet.proto.api.NanoWalletFrontingInstrument.CancelPlasticCardRequest) (obj)));
        generateEventFromCardAndAlwaysPost(((com.google.wallet.proto.api.NanoWalletFrontingInstrument.CancelPlasticCardResponse) (cdpiddata)).plasticProxyCardDetails);
        return cdpiddata;
    }

    public final List getPlasticCards()
        throws RpcException, CallErrorException
    {
        WLog.d(TAG, "Getting plastic cards");
        ThreadChecker threadchecker = threadChecker;
        ThreadChecker.checkOnBackgroundThread();
        return Arrays.asList(frontingInstrumentClient.getFrontingInstrumentInfo().plasticFrontingInstrumentDetails);
    }

    public final void initialize()
    {
        eventBus.registerEventProducer(com/google/android/apps/wallet/plastic/api/PlasticCardModelEvent, new RegistrationCallback() {

            final PlasticCardModelPublisher this$0;

            public final void handleRegistration(Object obj)
            {
                if (!hasSeenRegistrationEvent)
                {
                    hasSeenRegistrationEvent = true;
                    eventBus.register(this, com/google/android/apps/wallet/refresh/RequestRefreshEvent, new EventHandler() {

                        final _cls1 this$1;

                        private void handleEvent(RequestRefreshEvent requestrefreshevent)
                        {
                            asyncFetchFrontingInstrumentInfoFromServerAndPostIfChanged();
                        }

                        public final volatile void handleEvent(Object obj)
                        {
                            handleEvent((RequestRefreshEvent)obj);
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    });
                }
                handleRegistrationEvent(obj);
            }

            
            {
                this$0 = PlasticCardModelPublisher.this;
                super();
            }
        });
    }

    public final com.google.wallet.proto.api.NanoWalletFrontingInstrument.LockPlasticCardResponse lockPlasticCard(String s)
        throws CallErrorException, RpcException
    {
        Object obj = threadChecker;
        ThreadChecker.checkOnBackgroundThread();
        obj = new com.google.wallet.proto.api.NanoWalletFrontingInstrument.LockPlasticCardRequest();
        obj.proxyCardSubId = s;
        s = frontingInstrumentClient.lockPlasticCard(((com.google.wallet.proto.api.NanoWalletFrontingInstrument.LockPlasticCardRequest) (obj)));
        generateEventFromCardAndAlwaysPost(((com.google.wallet.proto.api.NanoWalletFrontingInstrument.LockPlasticCardResponse) (s)).plasticProxyCardDetails);
        return s;
    }

    public final com.google.android.apps.wallet.plastic.api.PlasticCard.Status orderPlasticCard(final com.google.wallet.proto.NanoWalletEntities.Address response)
        throws CallErrorException, RpcException
    {
        WLog.v(TAG, "Started order plastic card");
        Object obj = threadChecker;
        ThreadChecker.checkOnBackgroundThread();
        Preconditions.checkNotNull(response);
        obj = new com.google.wallet.proto.api.NanoWalletFrontingInstrument.IssuePlasticCardRequest();
        obj.shippingAddress = response;
        response = frontingInstrumentClient.issuePlasticCard(((com.google.wallet.proto.api.NanoWalletFrontingInstrument.IssuePlasticCardRequest) (obj)));
        if (((com.google.wallet.proto.api.NanoWalletFrontingInstrument.IssuePlasticCardResponse) (response)).callError != null)
        {
            throw new CallErrorException(((com.google.wallet.proto.api.NanoWalletFrontingInstrument.IssuePlasticCardResponse) (response)).callError);
        }
        boolean flag;
        if (((com.google.wallet.proto.api.NanoWalletFrontingInstrument.IssuePlasticCardResponse) (response)).frontingInstrumentInfo != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Received empty response from server.");
        handler.post(new Runnable() {

            final PlasticCardModelPublisher this$0;
            final com.google.wallet.proto.api.NanoWalletFrontingInstrument.IssuePlasticCardResponse val$response;

            public final void run()
            {
                generateEventAndPostIfChanged(response.frontingInstrumentInfo);
            }

            
            {
                this$0 = PlasticCardModelPublisher.this;
                response = issueplasticcardresponse;
                super();
            }
        });
        return decidePlasticCardStatus(Arrays.asList(((com.google.wallet.proto.api.NanoWalletFrontingInstrument.IssuePlasticCardResponse) (response)).frontingInstrumentInfo.plasticFrontingInstrumentDetails));
    }

    public final com.google.wallet.proto.api.NanoWalletFrontingInstrument.UnlockPlasticCardResponse unlockPlasticCard(String s)
        throws CallErrorException, RpcException
    {
        Object obj = threadChecker;
        ThreadChecker.checkOnBackgroundThread();
        obj = new com.google.wallet.proto.api.NanoWalletFrontingInstrument.UnlockPlasticCardRequest();
        obj.proxyCardSubId = s;
        s = frontingInstrumentClient.unlockPlasticCard(((com.google.wallet.proto.api.NanoWalletFrontingInstrument.UnlockPlasticCardRequest) (obj)));
        generateEventFromCardAndAlwaysPost(((com.google.wallet.proto.api.NanoWalletFrontingInstrument.UnlockPlasticCardResponse) (s)).plasticProxyCardDetails);
        return s;
    }




/*
    static boolean access$002(PlasticCardModelPublisher plasticcardmodelpublisher, boolean flag)
    {
        plasticcardmodelpublisher.hasSeenRegistrationEvent = flag;
        return flag;
    }

*/









}
