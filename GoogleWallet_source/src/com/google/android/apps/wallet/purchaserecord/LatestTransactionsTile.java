// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.network.NetworkConnectivityEvent;
import com.google.android.apps.wallet.network.NetworkConnectivityReturnChecker;
import com.google.android.apps.wallet.tile.Tile;
import com.google.android.apps.wallet.util.view.Views;
import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import dagger.Lazy;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordExpandedListView, PurchaseRecordEvent, PurchaseRecordPublisher, PurchaseRecordListItemBinder, 
//            PurchaseRecord

public class LatestTransactionsTile extends Tile
{
    static final class State extends Enum
    {

        private static final State $VALUES[];
        public static final State ERROR;
        public static final State INITIAL;
        public static final State LATEST_TRANSACTIONS;
        public static final State LOADING;
        public static final State NO_TRANSACTIONS;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/google/android/apps/wallet/purchaserecord/LatestTransactionsTile$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            INITIAL = new State("INITIAL", 0);
            LOADING = new State("LOADING", 1);
            ERROR = new State("ERROR", 2);
            NO_TRANSACTIONS = new State("NO_TRANSACTIONS", 3);
            LATEST_TRANSACTIONS = new State("LATEST_TRANSACTIONS", 4);
            $VALUES = (new State[] {
                INITIAL, LOADING, ERROR, NO_TRANSACTIONS, LATEST_TRANSACTIONS
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }


    private final AnalyticsUtil analyticsUtil;
    private final EventBus eventBus;
    private final FeatureManager featureManager;
    private State lastState;
    private final PurchaseRecordListItemBinder listItemBinder;
    private TextView loadingTransactionsMessage;
    private List mPurchaseRecords;
    private final NetworkConnectivityReturnChecker networkConnectivityReturnChecker;
    private PurchaseRecordExpandedListView purchaseRecordListView;
    private final Lazy purchaseRecordPublisher;
    private View rootView;
    private ViewGroup transactionList;
    private ViewGroup transactionLoadErrorContainer;
    private TextView transactionsEmptyMessage;
    private final UriRegistry uriRegistry;

    LatestTransactionsTile(Activity activity, EventBus eventbus, PurchaseRecordListItemBinder purchaserecordlistitembinder, Lazy lazy, NetworkConnectivityReturnChecker networkconnectivityreturnchecker, FeatureManager featuremanager, UriRegistry uriregistry, 
            AnalyticsUtil analyticsutil)
    {
        super(activity);
        lastState = State.INITIAL;
        eventBus = eventbus;
        listItemBinder = purchaserecordlistitembinder;
        purchaseRecordPublisher = lazy;
        networkConnectivityReturnChecker = networkconnectivityreturnchecker;
        featureManager = featuremanager;
        uriRegistry = uriregistry;
        analyticsUtil = analyticsutil;
    }

    private List getPurchaseRecordsToShow()
    {
        java.util.ArrayList arraylist = Lists.newArrayList(mPurchaseRecords);
        Collections.sort(arraylist, new Comparator() {

            final LatestTransactionsTile this$0;

            private static int compare(PurchaseRecord purchaserecord, PurchaseRecord purchaserecord1)
            {
                long l = ((Long)purchaserecord.getTransactionTimeInMillis().or(Long.valueOf(0x7fffffffffffffffL))).longValue();
                long l1 = ((Long)purchaserecord1.getTransactionTimeInMillis().or(Long.valueOf(0x7fffffffffffffffL))).longValue();
                if (l == l1)
                {
                    return 0;
                }
                return l >= l1 ? -1 : 1;
            }

            public final volatile int compare(Object obj, Object obj1)
            {
                return compare((PurchaseRecord)obj, (PurchaseRecord)obj1);
            }

            
            {
                this$0 = LatestTransactionsTile.this;
                super();
            }
        });
        return arraylist.subList(0, Math.min(arraylist.size(), 3));
    }

    private void showLatestTransactions()
    {
        purchaseRecordListView.setPurchaseRecordListItemBinder(listItemBinder, featureManager.isFeatureEnabled(Feature.TRANSACTIONS_USE_WOBL));
        purchaseRecordListView.showPurchaseRecordsTransactions(getPurchaseRecordsToShow());
    }

    private void showState(State state)
    {
        if (state == lastState && (state == State.ERROR || state == State.LOADING || state == State.NO_TRANSACTIONS))
        {
            return;
        }
        lastState = state;
        loadingTransactionsMessage.setVisibility(8);
        transactionList.setVisibility(8);
        transactionLoadErrorContainer.setVisibility(8);
        transactionsEmptyMessage.setVisibility(8);
        static final class _cls5
        {

            static final int $SwitchMap$com$google$android$apps$wallet$purchaserecord$LatestTransactionsTile$State[];
            static final int $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[];

            static 
            {
                $SwitchMap$com$google$android$apps$wallet$purchaserecord$LatestTransactionsTile$State = new int[State.values().length];
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$purchaserecord$LatestTransactionsTile$State[State.ERROR.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$purchaserecord$LatestTransactionsTile$State[State.LOADING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$purchaserecord$LatestTransactionsTile$State[State.NO_TRANSACTIONS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$purchaserecord$LatestTransactionsTile$State[State.LATEST_TRANSACTIONS.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType = new int[PurchaseRecordEvent.PurchaseRecordEventType.values().length];
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[PurchaseRecordEvent.PurchaseRecordEventType.FETCH_FIRST_PAGE_ERROR.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[PurchaseRecordEvent.PurchaseRecordEventType.FETCHING_FIRST_PAGE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[PurchaseRecordEvent.PurchaseRecordEventType.LOADED_PAGE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[PurchaseRecordEvent.PurchaseRecordEventType.FETCHING_ADDITIONAL_PAGE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[PurchaseRecordEvent.PurchaseRecordEventType.FETCH_ADDITIONAL_PAGE_ERROR.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls5..SwitchMap.com.google.android.apps.wallet.purchaserecord.LatestTransactionsTile.State[state.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            transactionLoadErrorContainer.setVisibility(0);
            return;

        case 2: // '\002'
            loadingTransactionsMessage.setVisibility(0);
            return;

        case 3: // '\003'
            state = transactionsEmptyMessage;
            int i;
            if (featureManager.isFeatureEnabled(Feature.NFC_HCE_PPMS))
            {
                i = com.google.android.apps.walletnfcrel.R.string.latest_transactions_content_empty_contactless_payments;
            } else
            {
                i = com.google.android.apps.walletnfcrel.R.string.latest_transactions_content_empty_no_contactless_payments;
            }
            state.setText(i);
            transactionsEmptyMessage.setVisibility(0);
            return;

        case 4: // '\004'
            showLatestTransactions();
            transactionList.setVisibility(0);
            return;
        }
    }

    public final boolean canDismiss(Object obj)
    {
        return false;
    }

    public final String getAnchor()
    {
        return "transactions";
    }

    protected final void onActivate()
    {
        super.onActivate();
        eventBus.register(this, com/google/android/apps/wallet/purchaserecord/PurchaseRecordEvent, PurchaseRecordPublisher.ALL_PURCHASE_RECORDS, new EventHandler() {

            final LatestTransactionsTile this$0;

            private void handleEvent(PurchaseRecordEvent purchaserecordevent)
            {
                _cls5..SwitchMap.com.google.android.apps.wallet.purchaserecord.PurchaseRecordEvent.PurchaseRecordEventType[purchaserecordevent.getType().ordinal()];
                JVM INSTR tableswitch 1 3: default 36
            //                           1 37
            //                           2 48
            //                           3 72;
                   goto _L1 _L2 _L3 _L4
_L1:
                return;
_L2:
                showState(State.ERROR);
                return;
_L3:
                if (lastState == State.ERROR)
                {
                    showState(State.LOADING);
                    return;
                }
                  goto _L1
_L4:
                mPurchaseRecords = purchaserecordevent.getPurchaseRecords();
                LatestTransactionsTile latesttransactionstile = LatestTransactionsTile.this;
                if (mPurchaseRecords.isEmpty())
                {
                    purchaserecordevent = State.NO_TRANSACTIONS;
                } else
                {
                    purchaserecordevent = State.LATEST_TRANSACTIONS;
                }
                latesttransactionstile.showState(purchaserecordevent);
                return;
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((PurchaseRecordEvent)obj);
            }

            
            {
                this$0 = LatestTransactionsTile.this;
                super();
            }
        });
    }

    protected final View onCreateView(ViewGroup viewgroup)
    {
        rootView = context.getLayoutInflater().inflate(com.google.android.apps.walletnfcrel.R.layout.latest_transactions_tile, viewgroup, false);
        loadingTransactionsMessage = (TextView)Views.findViewById(rootView, com.google.android.apps.walletnfcrel.R.id.TransactionsLoading);
        transactionList = (ViewGroup)Views.findViewById(rootView, com.google.android.apps.walletnfcrel.R.id.TransactionList);
        transactionsEmptyMessage = (TextView)Views.findViewById(rootView, com.google.android.apps.walletnfcrel.R.id.TransactionListEmpty);
        transactionLoadErrorContainer = (ViewGroup)Views.findViewById(rootView, com.google.android.apps.walletnfcrel.R.id.TransactionErrorLoading);
        purchaseRecordListView = (PurchaseRecordExpandedListView)Views.findViewById(rootView, com.google.android.apps.walletnfcrel.R.id.PurchaseRecordListView);
        Views.setLinkOnClickListener((TextView)rootView.findViewById(com.google.android.apps.walletnfcrel.R.id.ViewAllActionText), new android.view.View.OnClickListener() );
        rootView.setOnClickListener(new android.view.View.OnClickListener() );
        showState(State.LOADING);
        return rootView;
    }

    protected final void onDeactivate()
    {
        onDeactivate();
        eventBus.unregisterAll(this);
    }

    public void onInternetConnectivityChanged(NetworkConnectivityEvent networkconnectivityevent)
    {
        if (networkConnectivityReturnChecker.isConnectivityReturned(networkconnectivityevent))
        {
            ((PurchaseRecordPublisher)purchaseRecordPublisher.get()).reload();
        }
    }

    public final boolean shouldShow()
    {
        return featureManager.isFeatureEnabled(Feature.TRANSACTION_LIST);
    }









/*
    static List access$602(LatestTransactionsTile latesttransactionstile, List list)
    {
        latesttransactionstile.mPurchaseRecords = list;
        return list;
    }

*/
}
