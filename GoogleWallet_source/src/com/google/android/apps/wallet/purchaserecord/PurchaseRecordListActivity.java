// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.hce.setup.setupstate.NfcPaymentSetupEvent;
import com.google.android.apps.wallet.hce.setup.setupstate.NfcPaymentSetupState;
import com.google.android.apps.wallet.hce.setup.tos.TermsOfUseDialog;
import com.google.android.apps.wallet.network.NetworkConnectivityEvent;
import com.google.android.apps.wallet.network.NetworkConnectivityReturnChecker;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.refresh.RequestRefreshEvent;
import com.google.android.apps.wallet.util.view.Views;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import java.util.EnumMap;
import java.util.EnumSet;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            LoadingListNoItemsView, DividedPurchaseRecordAdapterWrapper, PurchaseRecordPublisher, PurchaseRecordEvent, 
//            PurchaseRecord, PurchaseRecordListItemBinder

public class PurchaseRecordListActivity extends WalletActivity
{
    static final class State extends Enum
    {

        private static final State $VALUES[];
        public static final State ERROR;
        public static final State LOADED;
        public static final State LOADING_ADDITIONAL_PAGE;
        public static final State LOADING_FIRST_PAGE;
        public static final State UNLOADED;
        private static final EnumMap allowedTransitions;

        static void checkTransition(State state1, State state2)
        {
            if (state1 != state2 && !((EnumSet)allowedTransitions.get(state1)).contains(state2))
            {
                state1 = String.valueOf(state1);
                state2 = String.valueOf(state2);
                throw new AssertionError((new StringBuilder(String.valueOf(state1).length() + 39 + String.valueOf(state2).length())).append("State transition from ").append(state1).append(" to ").append(state2).append(" not allowed.").toString());
            } else
            {
                return;
            }
        }

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/google/android/apps/wallet/purchaserecord/PurchaseRecordListActivity$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            UNLOADED = new State("UNLOADED", 0);
            LOADING_FIRST_PAGE = new State("LOADING_FIRST_PAGE", 1);
            LOADING_ADDITIONAL_PAGE = new State("LOADING_ADDITIONAL_PAGE", 2);
            LOADED = new State("LOADED", 3);
            ERROR = new State("ERROR", 4);
            $VALUES = (new State[] {
                UNLOADED, LOADING_FIRST_PAGE, LOADING_ADDITIONAL_PAGE, LOADED, ERROR
            });
            EnumMap enummap = new EnumMap(com/google/android/apps/wallet/purchaserecord/PurchaseRecordListActivity$State);
            allowedTransitions = enummap;
            enummap.put(UNLOADED, EnumSet.of(ERROR, LOADING_FIRST_PAGE, LOADED, UNLOADED));
            allowedTransitions.put(LOADING_ADDITIONAL_PAGE, EnumSet.of(LOADED, ERROR, UNLOADED));
            allowedTransitions.put(LOADING_FIRST_PAGE, EnumSet.of(LOADED, ERROR, UNLOADED));
            allowedTransitions.put(LOADED, EnumSet.of(LOADING_ADDITIONAL_PAGE, LOADING_FIRST_PAGE, ERROR, UNLOADED));
            allowedTransitions.put(ERROR, EnumSet.of(LOADING_FIRST_PAGE, UNLOADED));
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }


    static final String TAG = com/google/android/apps/wallet/purchaserecord/PurchaseRecordListActivity.getSimpleName();
    AnalyticsUtil analyticsUtil;
    private LoadingListNoItemsView emptyView;
    private TextView errorMessageText;
    private View errorRootView;
    public EventBus eventBus;
    FeatureManager featureManager;
    Integer itemIndexToDisplayOnListDataChange;
    ListView listView;
    NetworkAccessChecker networkAccessChecker;
    NetworkConnectivityReturnChecker networkConnectivityReturnChecker;
    private NfcPaymentSetupState nfcPaymentSetupState;
    public DividedPurchaseRecordAdapterWrapper purchaseRecordAdapterWrapper;
    PurchaseRecordPublisher purchaseRecordPublisher;
    private MenuItem searchItem;
    private SearchView searchView;
    PurchaseRecordListItemBinder simplePurchaseRecordListItemBinder;
    private State state;
    private SwipeRefreshLayout swipeRefreshLayout;
    UriRegistry uriRegistry;
    boolean viewResumed;

    public PurchaseRecordListActivity()
    {
        this(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    public PurchaseRecordListActivity(int i)
    {
        super(i);
        state = State.UNLOADED;
    }

    private static int getContentViewResId()
    {
        return com.google.android.apps.walletnfcrel.R.layout.purchase_record_list;
    }

    private static int getTitleId()
    {
        return com.google.android.apps.walletnfcrel.R.string.label_transactions;
    }

    private void handlePageFailure()
    {
        errorMessageText.setText(getString(com.google.android.apps.walletnfcrel.R.string.errormessage_fetch_transactions));
        State.checkTransition(state, State.ERROR);
        if (state != State.ERROR)
        {
            listView.setVisibility(8);
            if (emptyView != null)
            {
                emptyView.setVisibility(8);
            }
            errorRootView.setVisibility(0);
        }
        state = State.ERROR;
    }

    private boolean isFastWobl()
    {
        return featureManager.isFeatureEnabled(Feature.TRANSACTIONS_USE_WOBL) && featureManager.isFeatureEnabled(Feature.FAST_WOBL) && featureManager.isFeatureEnabled(Feature.WOBL_PROTO);
    }

    private void manualRefresh()
    {
        State.checkTransition(state, State.UNLOADED);
        state = State.UNLOADED;
        eventBus.post(new RequestRefreshEvent());
        swipeRefreshLayout.setRefreshing(true);
    }

    private void reloadPage()
    {
        State.checkTransition(state, State.UNLOADED);
        if (state != State.UNLOADED)
        {
            errorRootView.setVisibility(8);
            listView.setEmptyView(emptyView);
        }
        state = State.UNLOADED;
        purchaseRecordAdapterWrapper.clearAdapters();
        purchaseRecordPublisher.reload();
    }

    private void search(String s)
    {
        if (s.isEmpty())
        {
            s = Optional.absent();
        } else
        {
            s = Optional.of(s);
        }
        if (!purchaseRecordPublisher.getFullTextQuery().equals(s))
        {
            State.checkTransition(state, State.UNLOADED);
            state = State.UNLOADED;
            purchaseRecordPublisher.setFullTextQuery(s);
            purchaseRecordPublisher.resetAndFetchFirstPage();
            swipeRefreshLayout.setRefreshing(true);
        }
    }

    private void setNoItemsActionMessage()
    {
        if (nfcPaymentSetupState == null)
        {
            return;
        }
        if (featureManager.isFeatureEnabled(Feature.NFC_HCE_PPMS) && nfcPaymentSetupState.equals(NfcPaymentSetupState.NOT_STARTED))
        {
            emptyView.setNoItemsBottomMessageAndListener(getString(com.google.android.apps.walletnfcrel.R.string.setup_tap_and_pay_button), new android.view.View.OnClickListener() {

                final PurchaseRecordListActivity this$0;

                public final void onClick(View view)
                {
                    if (!networkAccessChecker.check())
                    {
                        return;
                    } else
                    {
                        TermsOfUseDialog.createAndShow(PurchaseRecordListActivity.this);
                        return;
                    }
                }

            
            {
                this$0 = PurchaseRecordListActivity.this;
                super();
            }
            });
            emptyView.showNoItemsBottomMessage(true);
            return;
        } else
        {
            emptyView.showNoItemsBottomMessage(false);
            return;
        }
    }

    private void setRenderer(PurchaseRecordEvent purchaserecordevent)
    {
        while (purchaserecordevent.getPurchaseRecords() == null || purchaserecordevent.getPurchaseRecords().isEmpty() || ((PurchaseRecord)purchaserecordevent.getPurchaseRecords().get(0)).getRenderOutput() == null) 
        {
            return;
        }
        simplePurchaseRecordListItemBinder.setTransactionsUseWobl(true);
    }

    protected static boolean shouldSeparatePendingTransactions()
    {
        return true;
    }

    public final void doOnCreate(Bundle bundle)
    {
        super.doOnCreate(bundle);
        if (isFastWobl())
        {
            purchaseRecordAdapterWrapper.init();
        } else
        {
            purchaseRecordAdapterWrapper.init(simplePurchaseRecordListItemBinder, simplePurchaseRecordListItemBinder);
        }
        state = State.UNLOADED;
        itemIndexToDisplayOnListDataChange = Integer.valueOf(0);
        viewResumed = false;
        setTitle(getTitleId());
        setContentView(getContentViewResId());
        swipeRefreshLayout = (SwipeRefreshLayout)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.swipe_refresh_widget);
        swipeRefreshLayout.setColorSchemeResources(new int[] {
            com.google.android.apps.walletnfcrel.R.color.google_green, com.google.android.apps.walletnfcrel.R.color.google_red, com.google.android.apps.walletnfcrel.R.color.google_blue, com.google.android.apps.walletnfcrel.R.color.google_yellow
        });
        swipeRefreshLayout.setOnRefreshListener(new android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener() {

            final PurchaseRecordListActivity this$0;

            public final void onRefresh()
            {
                analyticsUtil.sendSwipe("RefreshWallet", new AnalyticsCustomDimension[0]);
                manualRefresh();
            }

            
            {
                this$0 = PurchaseRecordListActivity.this;
                super();
            }
        });
        listView = (ListView)Views.findViewById(this, 0x102000a);
        emptyView = (LoadingListNoItemsView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.EmptyView);
        listView.setEmptyView(emptyView);
        listView.setAdapter(purchaseRecordAdapterWrapper.getAdapter());
        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final PurchaseRecordListActivity this$0;

            public final void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = ((AdapterView) (purchaseRecordAdapterWrapper.getAdapter().getItem(i)));
                if (isFastWobl())
                {
                    if (adapterview instanceof com.google.android.apps.wallet.wobs.list.FastWoblListAdapter.ListItem)
                    {
                        adapterview = ((com.google.android.apps.wallet.wobs.list.FastWoblListAdapter.ListItem)adapterview).getEntityId();
                        startActivity(uriRegistry.createIntent(8001, new Object[] {
                            adapterview
                        }));
                    }
                    return;
                } else
                {
                    adapterview = (PurchaseRecord)adapterview;
                    startActivity(uriRegistry.createIntent(8001, new Object[] {
                        adapterview.getId()
                    }));
                    return;
                }
            }

            
            {
                this$0 = PurchaseRecordListActivity.this;
                super();
            }
        });
        listView.setOnScrollListener(new android.widget.AbsListView.OnScrollListener() {

            final PurchaseRecordListActivity this$0;

            public final void onScroll(AbsListView abslistview, int i, int j, int k)
            {
                while (swipeRefreshLayout.isRefreshing() || j <= 0 || i + j != k) 
                {
                    return;
                }
                itemIndexToDisplayOnListDataChange = null;
                purchaseRecordPublisher.fetchNextPage();
            }

            public final void onScrollStateChanged(AbsListView abslistview, int i)
            {
            }

            
            {
                this$0 = PurchaseRecordListActivity.this;
                super();
            }
        });
        errorRootView = Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.loading_list_error_view);
        errorRootView.setVisibility(8);
        errorMessageText = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.loading_list_error_message);
        ((Button)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.loading_list_retry_button)).setOnClickListener(new android.view.View.OnClickListener() {

            final PurchaseRecordListActivity this$0;

            public final void onClick(View view)
            {
                reloadPage();
            }

            
            {
                this$0 = PurchaseRecordListActivity.this;
                super();
            }
        });
    }

    public final void doOnResume()
    {
        super.doOnResume();
        viewResumed = true;
        eventBus.register(this, com/google/android/apps/wallet/purchaserecord/PurchaseRecordEvent, PurchaseRecordPublisher.ALL_PURCHASE_RECORDS, new EventHandler() {

            final PurchaseRecordListActivity this$0;

            private void handleEvent(PurchaseRecordEvent purchaserecordevent)
            {
                static final class _cls8
                {

                    static final int $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[];

                    static 
                    {
                        $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType = new int[PurchaseRecordEvent.PurchaseRecordEventType.values().length];
                        try
                        {
                            $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[PurchaseRecordEvent.PurchaseRecordEventType.FETCHING_FIRST_PAGE.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror4) { }
                        try
                        {
                            $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[PurchaseRecordEvent.PurchaseRecordEventType.LOADED_PAGE.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[PurchaseRecordEvent.PurchaseRecordEventType.FETCH_FIRST_PAGE_ERROR.ordinal()] = 3;
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

                _cls8..SwitchMap.com.google.android.apps.wallet.purchaserecord.PurchaseRecordEvent.PurchaseRecordEventType[purchaserecordevent.getType().ordinal()];
                JVM INSTR tableswitch 1 5: default 44
            //                           1 45
            //                           2 132
            //                           3 373
            //                           4 392
            //                           5 500;
                   goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
                return;
_L2:
                State.checkTransition(state, State.LOADING_FIRST_PAGE);
                if (state != State.LOADING_FIRST_PAGE)
                {
                    errorRootView.setVisibility(8);
                    listView.setEmptyView(emptyView);
                }
                state = State.LOADING_FIRST_PAGE;
                itemIndexToDisplayOnListDataChange = Integer.valueOf(listView.getFirstVisiblePosition());
                return;
_L3:
                if (viewResumed)
                {
                    itemIndexToDisplayOnListDataChange = Integer.valueOf(listView.getFirstVisiblePosition());
                    viewResumed = false;
                }
                swipeRefreshLayout.setRefreshing(false);
                setRenderer(purchaserecordevent);
                DividedPurchaseRecordAdapterWrapper dividedpurchaserecordadapterwrapper = purchaseRecordAdapterWrapper;
                purchaserecordevent = purchaserecordevent.getPurchaseRecords();
                PurchaseRecordListActivity purchaserecordlistactivity = PurchaseRecordListActivity.this;
                dividedpurchaserecordadapterwrapper.onReloadAllPurchaseRecords(purchaserecordevent, PurchaseRecordListActivity.shouldSeparatePendingTransactions());
                if (itemIndexToDisplayOnListDataChange != null)
                {
                    if (listView.getCount() < itemIndexToDisplayOnListDataChange.intValue())
                    {
                        listView.setSelection(0);
                        purchaseRecordPublisher.fetchNextPage();
                    } else
                    {
                        listView.setSelection(itemIndexToDisplayOnListDataChange.intValue());
                    }
                }
                State.checkTransition(state, State.LOADED);
                if (state != State.LOADED)
                {
                    errorRootView.setVisibility(8);
                    listView.setEmptyView(emptyView);
                }
                state = State.LOADED;
                analyticsUtil.endTiming("OpenTransactions", "user_open_transactions");
                return;
_L4:
                swipeRefreshLayout.setRefreshing(false);
                handlePageFailure();
                return;
_L5:
                swipeRefreshLayout.setRefreshing(true);
                State.checkTransition(state, State.LOADING_ADDITIONAL_PAGE);
                if (state != State.LOADING_ADDITIONAL_PAGE)
                {
                    errorRootView.setVisibility(8);
                    listView.setEmptyView(emptyView);
                }
                state = State.LOADING_ADDITIONAL_PAGE;
                if (itemIndexToDisplayOnListDataChange == null)
                {
                    itemIndexToDisplayOnListDataChange = Integer.valueOf(listView.getFirstVisiblePosition());
                    return;
                }
                  goto _L1
_L6:
                swipeRefreshLayout.setRefreshing(false);
                State.checkTransition(state, State.LOADED);
                if (state != State.LOADED)
                {
                    errorRootView.setVisibility(8);
                    listView.setEmptyView(emptyView);
                }
                state = State.LOADED;
                return;
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((PurchaseRecordEvent)obj);
            }

            
            {
                this$0 = PurchaseRecordListActivity.this;
                super();
            }
        });
        eventBus.register(this, com/google/android/apps/wallet/purchaserecord/PurchaseRecordListActivity);
        if (state == State.ERROR)
        {
            reloadPage();
        }
    }

    public final boolean hasDrawerIndicator()
    {
        return true;
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public void onBackPressed()
    {
        startActivity(uriRegistry.createIntent(2, new Object[0]));
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add(0, 24, 1, com.google.android.apps.walletnfcrel.R.string.refresh_label).setIcon(com.google.android.apps.walletnfcrel.R.drawable.optionsmenu_refresh);
        if (featureManager.isFeatureEnabled(Feature.TRANSACTION_HISTORY_SEARCH))
        {
            getMenuInflater().inflate(com.google.android.apps.walletnfcrel.R.menu.search_bar, menu);
            searchItem = menu.findItem(com.google.android.apps.walletnfcrel.R.id.action_search);
            searchView = (SearchView)MenuItemCompat.getActionView(searchItem);
            searchView.setQueryHint(getString(com.google.android.apps.walletnfcrel.R.string.search_bar_query_hint));
            searchView.setOnQueryTextListener(new android.support.v7.widget.SearchView.OnQueryTextListener() {

                final PurchaseRecordListActivity this$0;

                public final boolean onQueryTextChange(String s)
                {
                    search(s);
                    return true;
                }

                public final boolean onQueryTextSubmit(String s)
                {
                    search(s);
                    return true;
                }

            
            {
                this$0 = PurchaseRecordListActivity.this;
                super();
            }
            });
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy()
    {
        if (searchView != null && !searchView.isIconified())
        {
            purchaseRecordPublisher.resetFullTextQuery();
            manualRefresh();
        }
        super.onDestroy();
    }

    public void onNfcPaymentSetupEvent(NfcPaymentSetupEvent nfcpaymentsetupevent)
    {
        nfcPaymentSetupState = nfcpaymentsetupevent.getState();
        setNoItemsActionMessage();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 24: // '\030'
            analyticsUtil.sendListItemTap("RefreshWallet", new AnalyticsCustomDimension[0]);
            break;
        }
        manualRefresh();
        return true;
    }

    public void onPause()
    {
        eventBus.unregisterAll(this);
        super.onPause();
    }

    public void onResumeInternetConnection(NetworkConnectivityEvent networkconnectivityevent)
    {
        if (networkConnectivityReturnChecker.isConnectivityReturned(networkconnectivityevent) && state == State.ERROR)
        {
            reloadPage();
        }
    }








/*
    static State access$402(PurchaseRecordListActivity purchaserecordlistactivity, State state1)
    {
        purchaserecordlistactivity.state = state1;
        return state1;
    }

*/





}
