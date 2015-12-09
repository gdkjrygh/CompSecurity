// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.purchaserecord.IncomingMoneyRequestsEvent;
import com.google.android.apps.wallet.purchaserecord.PurchaseRecordPublisher;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.list.SimpleListAdapter;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            IncomingMoneyRequestBinder

public class IncomingMoneyRequestListActivity extends WalletActivity
{

    EventBus eventBus;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    IncomingMoneyRequestBinder incomingMoneyRequestBinder;
    private IncomingMoneyRequestsEvent incomingMoneyRequestsEvent;
    private LinearLayout incomingRequestsMessageContainer;
    private ListView listView;
    private SimpleListAdapter moneyRequestAdapter;
    PurchaseRecordPublisher purchaseRecordPublisher;
    private SwipeRefreshLayout swipeRefreshLayout;
    UriRegistry uriRegistry;

    public IncomingMoneyRequestListActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    private void hideAllViews()
    {
        fullScreenProgressSpinnerManager.hide();
        incomingRequestsMessageContainer.removeAllViews();
        listView.setVisibility(8);
    }

    private void updateView()
    {
        if (incomingMoneyRequestsEvent == null)
        {
            return;
        }
        hideAllViews();
        if (incomingMoneyRequestsEvent.getFailureCause() != null && incomingMoneyRequestsEvent.getIncomingMoneyRequests() == null)
        {
            View view = LayoutInflater.from(this).inflate(com.google.android.apps.walletnfcrel.R.layout.retry_widget, null);
            ((TextView)view.findViewById(com.google.android.apps.walletnfcrel.R.id.loading_list_error_message)).setText(com.google.android.apps.walletnfcrel.R.string.errormessage_fetch_transactions);
            ((Button)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.loading_list_retry_button)).setOnClickListener(new android.view.View.OnClickListener() {

                final IncomingMoneyRequestListActivity this$0;

                public final void onClick(View view2)
                {
                    reloadPage();
                }

            
            {
                this$0 = IncomingMoneyRequestListActivity.this;
                super();
            }
            });
            incomingRequestsMessageContainer.addView(view);
        } else
        if (incomingMoneyRequestsEvent.getFailureCause() != null)
        {
            Toasts.show(this, com.google.android.apps.walletnfcrel.R.string.errormessage_fetch_transactions);
            moneyRequestAdapter.clearItems();
            moneyRequestAdapter.addItems(incomingMoneyRequestsEvent.getIncomingMoneyRequests());
            listView.setVisibility(0);
        } else
        if (incomingMoneyRequestsEvent.getIncomingMoneyRequests() == null || incomingMoneyRequestsEvent.getIncomingMoneyRequests().isEmpty())
        {
            View view1 = LayoutInflater.from(this).inflate(com.google.android.apps.walletnfcrel.R.layout.incoming_money_requests_no_items_view, null);
            incomingRequestsMessageContainer.addView(view1);
        } else
        {
            moneyRequestAdapter.clearItems();
            moneyRequestAdapter.addItems(incomingMoneyRequestsEvent.getIncomingMoneyRequests());
            listView.setVisibility(0);
        }
        swipeRefreshLayout.setRefreshing(false);
    }

    public final void doOnCreate(Bundle bundle)
    {
        super.doOnCreate(bundle);
        setTitle(com.google.android.apps.walletnfcrel.R.string.incoming_money_request_title);
        setContentView(com.google.android.apps.walletnfcrel.R.layout.incoming_money_request_list_activity);
        incomingRequestsMessageContainer = (LinearLayout)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.incoming_money_requests_message_container);
        swipeRefreshLayout = (SwipeRefreshLayout)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.swipe_refresh_widget);
        swipeRefreshLayout.setColorSchemeResources(new int[] {
            com.google.android.apps.walletnfcrel.R.color.google_green, com.google.android.apps.walletnfcrel.R.color.google_red, com.google.android.apps.walletnfcrel.R.color.google_blue, com.google.android.apps.walletnfcrel.R.color.google_yellow
        });
        swipeRefreshLayout.setOnRefreshListener(new android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener() {

            final IncomingMoneyRequestListActivity this$0;

            public final void onRefresh()
            {
                reloadPage();
            }

            
            {
                this$0 = IncomingMoneyRequestListActivity.this;
                super();
            }
        });
        listView = (ListView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ListView);
        moneyRequestAdapter = new SimpleListAdapter(incomingMoneyRequestBinder);
        listView.setAdapter(moneyRequestAdapter);
        fullScreenProgressSpinnerManager.show();
    }

    public final void doOnResume()
    {
        super.doOnResume();
        eventBus.register(this);
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public void onIncomingMoneyRequestsEvent(IncomingMoneyRequestsEvent incomingmoneyrequestsevent)
    {
        incomingMoneyRequestsEvent = incomingmoneyrequestsevent;
        updateView();
    }

    public void onPause()
    {
        eventBus.unregisterAll(this);
        super.onPause();
    }

    protected final void onUpPressed()
    {
        navigateUpWithIntent(uriRegistry.createIntent(2, new Object[0]));
    }

    protected final void reloadPage()
    {
        swipeRefreshLayout.setRefreshing(true);
        purchaseRecordPublisher.reload();
    }
}
