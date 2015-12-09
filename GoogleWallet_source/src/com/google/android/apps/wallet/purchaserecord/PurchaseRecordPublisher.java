// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.config.appcontrol.AppControlKey;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeaturesChangedEvent;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import com.google.android.apps.wallet.eventbus.RegistrationCallback;
import com.google.android.apps.wallet.locale.LocaleChangedEvent;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.purchaserecord.api.NewPurchaseRecordReceiptEvent;
import com.google.android.apps.wallet.refresh.RequestRefreshEvent;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.async.ThreadPreconditions;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.android.apps.wallet.widgets.list.PageResult;
import com.google.common.base.Optional;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordEvent, PurchaseRecord, PurchaseRecordManager, PurchaseRecordNotFoundException

public class PurchaseRecordPublisher
    implements InitializedEventPublisher
{

    public static final Object ALL_PURCHASE_RECORDS = "ALL_PURCHASE_RECORDS";
    private static final Optional NO_FULL_TEXT_QUERY = Optional.absent();
    private static final String TAG = com/google/android/apps/wallet/purchaserecord/PurchaseRecordPublisher.getSimpleName();
    private final ActionExecutor actionExecutor;
    private final Cache cache;
    private final EventBus eventBus;
    boolean firstToken;
    private Optional fullTextQuery;
    private final PurchaseRecordManager manager;
    private String nextToken;
    final List purchaseRecords = Lists.newArrayList();

    PurchaseRecordPublisher(PurchaseRecordManager purchaserecordmanager, EventBus eventbus, ActionExecutor actionexecutor, AppControl appcontrol)
    {
        manager = purchaserecordmanager;
        eventBus = eventbus;
        actionExecutor = actionexecutor;
        cache = CacheBuilder.newBuilder().expireAfterWrite(appcontrol.getLong(AppControlKey.PURCHASE_RECORD_LIST_CACHE_TTL_MINS), TimeUnit.MINUTES).build();
        fullTextQuery = NO_FULL_TEXT_QUERY;
    }

    private void fetchPage(final String token)
    {
        final boolean isFirstPage = "first_page_token".equals(token);
        Object obj = (PurchaseRecordEvent)cache.getIfPresent(ALL_PURCHASE_RECORDS);
        if (obj != null && (((PurchaseRecordEvent) (obj)).getType() == PurchaseRecordEvent.PurchaseRecordEventType.FETCHING_FIRST_PAGE || ((PurchaseRecordEvent) (obj)).getType() == PurchaseRecordEvent.PurchaseRecordEventType.FETCHING_ADDITIONAL_PAGE))
        {
            return;
        }
        WLog.d(TAG, "fetching page");
        EventBus eventbus = eventBus;
        Object obj1 = ALL_PURCHASE_RECORDS;
        if (isFirstPage)
        {
            obj = PurchaseRecordEvent.PurchaseRecordEventType.FETCHING_FIRST_PAGE;
        } else
        {
            obj = PurchaseRecordEvent.PurchaseRecordEventType.FETCHING_ADDITIONAL_PAGE;
        }
        eventbus.post(obj1, PurchaseRecordEvent.statusEvent(((PurchaseRecordEvent.PurchaseRecordEventType) (obj))));
        actionExecutor.executeAction(new Callable() {

            final PurchaseRecordPublisher this$0;
            final boolean val$isFirstPage;
            final String val$token;

            private PageResult call()
                throws com.google.android.apps.wallet.widgets.list.CollectionPager.FetchPageException
            {
                if (isFirstPage)
                {
                    return manager.fetchFirstPage(fullTextQuery);
                } else
                {
                    return manager.fetchNextPage(fullTextQuery, token);
                }
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = PurchaseRecordPublisher.this;
                isFirstPage = flag;
                token = s;
                super();
            }
        }, new AsyncCallback() {

            final PurchaseRecordPublisher this$0;
            final boolean val$isFirstPage;
            final String val$token;

            private void onSuccess(PageResult pageresult)
            {
                WLog.d(PurchaseRecordPublisher.TAG, "loaded page");
                nextToken = (String)pageresult.getNextPageToken().orNull();
                firstToken = false;
                postEvent(PurchaseRecordPublisher.ALL_PURCHASE_RECORDS, PurchaseRecordEvent.loadedPageEvent(onNewPage(pageresult)));
            }

            public final void onFailure(Exception exception)
            {
                WLog.e(PurchaseRecordPublisher.TAG, "error fetching page", exception);
                nextToken = token;
                firstToken = false;
                PurchaseRecordPublisher purchaserecordpublisher = PurchaseRecordPublisher.this;
                Object obj2 = PurchaseRecordPublisher.ALL_PURCHASE_RECORDS;
                if (isFirstPage)
                {
                    exception = PurchaseRecordEvent.PurchaseRecordEventType.FETCH_FIRST_PAGE_ERROR;
                } else
                {
                    exception = PurchaseRecordEvent.PurchaseRecordEventType.FETCH_ADDITIONAL_PAGE_ERROR;
                }
                purchaserecordpublisher.postEvent(obj2, PurchaseRecordEvent.statusEvent(exception));
            }

            public final volatile void onSuccess(Object obj2)
            {
                onSuccess((PageResult)obj2);
            }

            
            {
                this$0 = PurchaseRecordPublisher.this;
                token = s;
                isFirstPage = flag;
                super();
            }
        });
    }

    private ImmutableList onNewPage(PageResult pageresult)
    {
        purchaseRecords.addAll(pageresult.getItems());
        PurchaseRecord purchaserecord;
        for (pageresult = pageresult.getItems().iterator(); pageresult.hasNext(); postEvent(purchaserecord.getId(), PurchaseRecordEvent.loadedPurchaseRecordEvent(purchaserecord)))
        {
            purchaserecord = (PurchaseRecord)pageresult.next();
        }

        return ImmutableList.copyOf(purchaseRecords);
    }

    private void postEvent(Object obj, PurchaseRecordEvent purchaserecordevent)
    {
        cache.put(obj, purchaserecordevent);
        eventBus.post(obj, purchaserecordevent);
    }

    public final void fetchNextPage()
    {
        ThreadPreconditions.checkOnUiThread();
        if (nextToken != null)
        {
            String s = nextToken;
            nextToken = null;
            fetchPage(s);
        }
    }

    public final void fetchPurchaseRecord(final String id)
    {
        PurchaseRecordEvent purchaserecordevent = (PurchaseRecordEvent)cache.getIfPresent(id);
        if (purchaserecordevent != null && purchaserecordevent.getType() == PurchaseRecordEvent.PurchaseRecordEventType.FETCHING_PURCHASE_RECORD)
        {
            return;
        } else
        {
            postEvent(id, PurchaseRecordEvent.statusEvent(PurchaseRecordEvent.PurchaseRecordEventType.FETCHING_PURCHASE_RECORD));
            actionExecutor.executeAction(new Callable() {

                final PurchaseRecordPublisher this$0;
                final String val$id;

                private PurchaseRecord call()
                    throws Exception
                {
                    return manager.get(id);
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = PurchaseRecordPublisher.this;
                id = s;
                super();
            }
            }, new AsyncCallback() {

                final PurchaseRecordPublisher this$0;
                final String val$id;

                private void onSuccess(PurchaseRecord purchaserecord)
                {
                    postEvent(id, PurchaseRecordEvent.loadedPurchaseRecordEvent(purchaserecord));
                }

                public final void onFailure(Exception exception)
                {
                    if (exception instanceof PurchaseRecordNotFoundException)
                    {
                        postEvent(id, PurchaseRecordEvent.statusEvent(PurchaseRecordEvent.PurchaseRecordEventType.FETCH_PURCHASE_RECORD_NOT_FOUND));
                        return;
                    } else
                    {
                        WLog.efmt(PurchaseRecordPublisher.TAG, exception, "error fetching purchase record: %s", new Object[] {
                            id
                        });
                        postEvent(id, PurchaseRecordEvent.statusEvent(PurchaseRecordEvent.PurchaseRecordEventType.FETCH_PURCHASE_RECORD_FAIL));
                        return;
                    }
                }

                public final volatile void onSuccess(Object obj)
                {
                    onSuccess((PurchaseRecord)obj);
                }

            
            {
                this$0 = PurchaseRecordPublisher.this;
                id = s;
                super();
            }
            });
            return;
        }
    }

    final Optional getFullTextQuery()
    {
        return fullTextQuery;
    }

    public void handleEvent(FeaturesChangedEvent featureschangedevent)
    {
        if (featureschangedevent.didFeatureStateChange(Feature.TRANSACTION_LIST))
        {
            resetAndFetchFirstPage();
        }
    }

    public final void initialize()
    {
        eventBus.registerEventProducer(com/google/android/apps/wallet/purchaserecord/PurchaseRecordEvent, new RegistrationCallback() {

            final PurchaseRecordPublisher this$0;

            public final void handleRegistration(Object obj)
            {
                PurchaseRecordEvent purchaserecordevent = (PurchaseRecordEvent)cache.getIfPresent(obj);
                if (purchaserecordevent != null)
                {
                    eventBus.post(obj, purchaserecordevent);
                } else
                {
                    if (PurchaseRecordPublisher.ALL_PURCHASE_RECORDS.equals(obj))
                    {
                        resetAndFetchFirstPage();
                        return;
                    }
                    if (obj instanceof String)
                    {
                        fetchPurchaseRecord((String)obj);
                        return;
                    }
                }
            }

            
            {
                this$0 = PurchaseRecordPublisher.this;
                super();
            }
        });
        eventBus.register(this);
    }

    public void onLocaleChangedEvent(LocaleChangedEvent localechangedevent)
    {
        resetAndFetchFirstPage();
    }

    public void onNewPurchaseRecordReceiptEvent(NewPurchaseRecordReceiptEvent newpurchaserecordreceiptevent)
    {
        resetAndFetchFirstPage();
    }

    void onRefreshRequestEvent(RequestRefreshEvent requestrefreshevent)
    {
        resetAndFetchFirstPage();
    }

    public void onSystemNotificationEvent(com.google.wallet.proto.NanoWalletTransport.SystemNotificationBundle.SystemNotification systemnotification)
    {
        if (Protos.valuesEqual(systemnotification.type, 4))
        {
            resetAndFetchFirstPage();
        }
    }

    public final void reload()
    {
        com.google.wallet.proto.NanoWalletTransport.SystemNotificationBundle.SystemNotification systemnotification = new com.google.wallet.proto.NanoWalletTransport.SystemNotificationBundle.SystemNotification();
        systemnotification.type = Integer.valueOf(4);
        eventBus.post(systemnotification);
    }

    final void resetAndFetchFirstPage()
    {
        ThreadPreconditions.checkOnUiThread();
        if (!firstToken || fullTextQuery.isPresent())
        {
            actionExecutor.cancelAll();
            cache.invalidateAll();
            firstToken = true;
            purchaseRecords.clear();
            fetchPage("first_page_token");
        }
    }

    final void resetFullTextQuery()
    {
        fullTextQuery = NO_FULL_TEXT_QUERY;
    }

    final void setFullTextQuery(Optional optional)
    {
        fullTextQuery = optional;
    }








/*
    static String access$502(PurchaseRecordPublisher purchaserecordpublisher, String s)
    {
        purchaserecordpublisher.nextToken = s;
        return s;
    }

*/


}
