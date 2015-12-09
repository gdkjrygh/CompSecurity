// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.formsofpayment.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.bankaccount.api.BankAccount;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModel;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModelEvent;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.cardlist.PaymentCardListItemBinder;
import com.google.android.apps.wallet.cardlist.PaymentCardModel;
import com.google.android.apps.wallet.cardlist.PaymentCardModelEvent;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.paymentcard.api.PaymentCard;
import com.google.android.apps.wallet.paymentcard.api.PaymentCardApi;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.widgets.list.HeadedListAdapter;
import com.google.android.apps.wallet.widgets.list.MergedListAdapter;
import com.google.android.apps.wallet.widgets.list.SimpleListAdapter;
import com.google.android.apps.wallet.widgets.list.SingleItemAdapter;
import com.google.android.apps.wallet.widgets.list.SingleRowAdapter;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;

// Referenced classes of package com.google.android.apps.wallet.formsofpayment.ui:
//            EmptyPaymentCardListItemBinder, BankAccountListItemBinder

public class FormsOfPaymentActivity extends WalletActivity
{

    private static final String TAG = com/google/android/apps/wallet/formsofpayment/ui/FormsOfPaymentActivity.getSimpleName();
    AnalyticsUtil analyticsUtil;
    private SimpleListAdapter bankAccountListAdapter;
    private final BankAccountListItemBinder bankAccountListItemBinder = new BankAccountListItemBinder(this);
    private BankAccountsModelEvent bankAccountsModelEvent;
    private SingleItemAdapter emptyPaymentCardListAdapter;
    private final EmptyPaymentCardListItemBinder emptyPaymentCardListItemBinder = new EmptyPaymentCardListItemBinder(this);
    EventBus eventBus;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    private MergedListAdapter listAdapter;
    private ListView listView;
    PaymentCardApi paymentCardApi;
    private SimpleListAdapter paymentCardListAdapter;
    private final PaymentCardListItemBinder paymentCardListItemBinder = new PaymentCardListItemBinder(this);
    private PaymentCardModelEvent paymentCardModelEvent;
    private boolean shownLoadingError;
    UriRegistry uriRegistry;

    public FormsOfPaymentActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    private View createListSectionHeader(int i)
    {
        TextView textview = (TextView)getLayoutInflater().inflate(com.google.android.apps.walletnfcrel.R.layout.subheader, null);
        textview.setText(getText(i));
        return textview;
    }

    private boolean handleLoadingError(Throwable throwable)
    {
        if (throwable != null)
        {
            WLog.e(TAG, "Received exception from an event provider", throwable);
            if (!shownLoadingError)
            {
                shownLoadingError = true;
                CallErrorDialogs.createBuilderWithGenericTitle(throwable, com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).setFinishActivityOnClick().setFinishActivityOnDismiss().build().show(getSupportFragmentManager(), "loading_error_dialog");
            }
            return true;
        } else
        {
            return false;
        }
    }

    private void updateView()
    {
        if (paymentCardModelEvent == null || bankAccountsModelEvent == null)
        {
            return;
        }
        PaymentCardModel paymentcardmodel = paymentCardModelEvent.getModel();
        BankAccountsModel bankaccountsmodel = bankAccountsModelEvent.getModel();
        paymentCardListAdapter.clearItems();
        bankAccountListAdapter.clearItems();
        fullScreenProgressSpinnerManager.hide();
        listView.setVisibility(0);
        if (paymentcardmodel.hasCards())
        {
            paymentCardListAdapter.addItems(paymentcardmodel.getAllCredentials());
            emptyPaymentCardListAdapter.setItem(null);
        } else
        {
            emptyPaymentCardListAdapter.setItem(new PaymentCard(new com.google.wallet.proto.NanoWalletEntities.Credential()));
        }
        if (bankAccountsModelEvent.isFeatureEnabled())
        {
            if (bankaccountsmodel.getBankAccounts().isEmpty())
            {
                bankAccountListAdapter.addItems(Arrays.asList(new BankAccount[] {
                    null
                }));
            } else
            {
                bankAccountListAdapter.addItems(bankaccountsmodel.getBankAccounts());
            }
        }
        analyticsUtil.endTiming("OpenCardsAndAccounts", null);
    }

    protected final void doOnCreate(Bundle bundle)
    {
        setContentView(com.google.android.apps.walletnfcrel.R.layout.funding_source_list);
        setTitle(com.google.android.apps.walletnfcrel.R.string.forms_of_payment_title);
        listView = (ListView)findViewById(com.google.android.apps.walletnfcrel.R.id.CardList);
        paymentCardListAdapter = new SimpleListAdapter(paymentCardListItemBinder);
        bundle = (new com.google.android.apps.wallet.widgets.list.HeadedListAdapter.Builder()).withHeaderView(createListSectionHeader(com.google.android.apps.walletnfcrel.R.string.forms_of_payment_cards_heading)).withListAdapter(paymentCardListAdapter).build();
        bundle.setHeaderVisibility(com.google.android.apps.wallet.widgets.list.HeadedListAdapter.FixedViewVisibility.VISIBLE);
        emptyPaymentCardListAdapter = new SingleItemAdapter(emptyPaymentCardListItemBinder);
        bankAccountListAdapter = new SimpleListAdapter(bankAccountListItemBinder);
        HeadedListAdapter headedlistadapter = (new com.google.android.apps.wallet.widgets.list.HeadedListAdapter.Builder()).withHeaderView(createListSectionHeader(com.google.android.apps.walletnfcrel.R.string.forms_of_payment_account_heading)).withListAdapter(bankAccountListAdapter).build();
        headedlistadapter.setHeaderVisibility(com.google.android.apps.wallet.widgets.list.HeadedListAdapter.FixedViewVisibility.VISIBLE_UNLESS_EMPTY);
        SingleRowAdapter singlerowadapter = new SingleRowAdapter();
        singlerowadapter.setView(getLayoutInflater().inflate(com.google.android.apps.walletnfcrel.R.layout.list_footer_fab_spacing, listView, false));
        listAdapter = new MergedListAdapter();
        listAdapter.setAdapters(new ListAdapter[] {
            bundle, emptyPaymentCardListAdapter, headedlistadapter, singlerowadapter
        });
        listView.setAdapter(listAdapter);
        listView.setChoiceMode(1);
        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final FormsOfPaymentActivity this$0;

            public final void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = (Intent)view.getTag(com.google.android.apps.walletnfcrel.R.id.FormsOfPaymentIntentTagKey);
                startActivity(adapterview);
            }

            
            {
                this$0 = FormsOfPaymentActivity.this;
                super();
            }
        });
        findViewById(com.google.android.apps.walletnfcrel.R.id.SingleActionButton).setVisibility(0);
        findViewById(com.google.android.apps.walletnfcrel.R.id.SingleActionButton).setOnClickListener(new android.view.View.OnClickListener() {

            final FormsOfPaymentActivity this$0;

            public final void onClick(View view)
            {
                startActivity(PaymentCardApi.createAddNewCardIntent(FormsOfPaymentActivity.this, "instrument_add_context_UNDEFINED"));
            }

            
            {
                this$0 = FormsOfPaymentActivity.this;
                super();
            }
        });
        fullScreenProgressSpinnerManager.show();
    }

    public final void doOnResume()
    {
        eventBus.register(this);
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

    public void onNewBankAccountsModelEvent(BankAccountsModelEvent bankaccountsmodelevent)
    {
        if (handleLoadingError(bankaccountsmodelevent.getFailureCause()))
        {
            return;
        } else
        {
            bankAccountsModelEvent = bankaccountsmodelevent;
            updateView();
            return;
        }
    }

    public void onNewPaymentCardModel(PaymentCardModelEvent paymentcardmodelevent)
    {
        if (handleLoadingError(paymentcardmodelevent.getFailureCause()))
        {
            return;
        } else
        {
            paymentCardModelEvent = paymentcardmodelevent;
            updateView();
            return;
        }
    }

    protected void onPause()
    {
        eventBus.unregisterAll(this);
        super.onPause();
    }

}
