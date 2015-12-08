// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.funding;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.bankaccount.api.BankAccountApi;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModel;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModelEvent;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.cardlist.PaymentCardModel;
import com.google.android.apps.wallet.cardlist.PaymentCardModelEvent;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.frontinginstrument.TapAndPayModel;
import com.google.android.apps.wallet.frontinginstrument.TapAndPayModelEvent;
import com.google.android.apps.wallet.frontinginstrument.TapAndPayModelPublisher;
import com.google.android.apps.wallet.funding.api.FeeDescriber;
import com.google.android.apps.wallet.funding.api.FundingSource;
import com.google.android.apps.wallet.help.api.HelpUrls;
import com.google.android.apps.wallet.help.ui.HowToPurchaseSynopsisActivity;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.paymentcard.api.PaymentCard;
import com.google.android.apps.wallet.paymentcard.api.PaymentCardApi;
import com.google.android.apps.wallet.storedvalue.api.StoredValueEvent;
import com.google.android.apps.wallet.storedvalue.api.StoredValueModel;
import com.google.android.apps.wallet.topup.api.TopUpApi;
import com.google.android.apps.wallet.transfer.api.FundsTransferInfoEvent;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.actionbutton.ActionsContainer;
import com.google.android.apps.wallet.widgets.actionbutton.FloatingActionButton;
import com.google.android.apps.wallet.widgets.list.HeadedListAdapter;
import com.google.android.apps.wallet.widgets.list.MergedListAdapter;
import com.google.android.apps.wallet.widgets.list.SimpleListAdapter;
import com.google.android.apps.wallet.widgets.list.SingleItemAdapter;
import com.google.android.apps.wallet.widgets.list.SingleRowAdapter;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.funding:
//            FundingSourceListItem, FundingSourceListItemBinder

public class SelectFundingSourceActivity extends WalletActivity
{

    private static final ImmutableMap FEE_INFO_MODE = ImmutableMap.of(Integer.valueOf(3), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(2));
    private static final String TAG = com/google/android/apps/wallet/funding/SelectFundingSourceActivity.getSimpleName();
    ActionExecutor actionExecutor;
    private ActionsContainer actionsContainer;
    AnalyticsUtil analyticsUtil;
    private Optional bankAccountsModelEvent;
    private FundingSource currentFundingSource;
    EventBus eventBus;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    FundingSourceListItemBinder fundingSourceListItemBinder;
    private Optional fundsTransferInfoEvent;
    private int instrumentUse;
    private SimpleListAdapter invalidFundingSourceAdapter;
    private FloatingActionButton multiActionButton;
    PaymentCardApi paymentCardApi;
    private Optional paymentCardModelEvent;
    private SingleItemAdapter selectedFundingSourceAdapter;
    private boolean showFees;
    private boolean shownLoadingError;
    private FloatingActionButton singleActionButton;
    private Optional storedValueEvent;
    private Optional tapAndPayModelEvent;
    TapAndPayModelPublisher tapAndPayModelPublisher;
    UriRegistry uriRegistry;
    private View useWalletBalanceBanner;
    private CheckBox useWalletBalanceCheckBox;
    private SimpleListAdapter validFundingSourceAdapter;

    public SelectFundingSourceActivity()
    {
        this(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    public SelectFundingSourceActivity(int i)
    {
        super(i);
        paymentCardModelEvent = Optional.absent();
        bankAccountsModelEvent = Optional.absent();
        storedValueEvent = Optional.absent();
        fundsTransferInfoEvent = Optional.absent();
        tapAndPayModelEvent = Optional.absent();
    }

    private void addFeeBanner()
    {
        TextView textview = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.FeeInformationBanner);
        textview.setVisibility(0);
        textview.setText(com.google.android.apps.walletnfcrel.R.string.fee_learn_more);
        Views.setLinkOnClickListener(textview, new android.view.View.OnClickListener() {

            final SelectFundingSourceActivity this$0;

            public final void onClick(View view)
            {
                view = TopUpApi.createFeeInfoActivityIntent(SelectFundingSourceActivity.this, ((Integer)SelectFundingSourceActivity.FEE_INFO_MODE.get(Integer.valueOf(instrumentUse))).intValue());
                startActivity(view);
            }

            
            {
                this$0 = SelectFundingSourceActivity.this;
                super();
            }
        });
    }

    private void addStoredValueBanner()
    {
        byte byte0 = 8;
        if (!((StoredValueEvent)storedValueEvent.get()).isFeatureEnabled())
        {
            useWalletBalanceBanner.setVisibility(8);
            return;
        }
        if (((StoredValueEvent)storedValueEvent.get()).getModel().getStoredValue() != null)
        {
            byte0 = 0;
        }
        useWalletBalanceBanner.setVisibility(byte0);
        boolean flag = ((TapAndPayModelEvent)tapAndPayModelEvent.get()).getModel().isStoredValueEnabled(((StoredValueEvent)storedValueEvent.get()).getModel().getStoredValue());
        useWalletBalanceCheckBox.setChecked(flag);
    }

    private boolean allEventsReady()
    {
        return storedValueEventOk() && bankAccountEventOk() && paymentCardsEventOk() && fundsTransferEventOk() && tapAndPayEventOk();
    }

    private boolean bankAccountEventOk()
    {
        return !useRequiresBankAccount() || bankAccountsModelEvent.isPresent();
    }

    private FundingSourceListItem createFundingSourceListItem(FundingSource fundingsource)
    {
        FundingSourceListItem fundingsourcelistitem;
        if (fundingsource == null)
        {
            fundingsourcelistitem = null;
        } else
        {
            FundingSourceListItem fundingsourcelistitem1 = new FundingSourceListItem();
            fundingsourcelistitem1.fundingSource = fundingsource;
            fundingsourcelistitem1.instrumentUse = instrumentUse;
            fundingsourcelistitem = fundingsourcelistitem1;
            if (showFees)
            {
                fundingsourcelistitem = fundingsourcelistitem1;
                if (fundsTransferInfoEvent.isPresent())
                {
                    fundingsourcelistitem1.feeDescription = (new FeeDescriber(((FundsTransferInfoEvent)fundsTransferInfoEvent.get()).getFundingSourceInfos())).getListDescription(fundingsource);
                    return fundingsourcelistitem1;
                }
            }
        }
        return fundingsourcelistitem;
    }

    private boolean fundsTransferEventOk()
    {
        return !showFees || fundsTransferInfoEvent.isPresent();
    }

    private List getInvalidUnselectedFundingSources(List list)
    {
        java.util.ArrayList arraylist = Lists.newArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            FundingSource fundingsource = (FundingSource)list.next();
            if (!fundingsource.equals(currentFundingSource) && fundingsource.isInapplicableForUse(instrumentUse))
            {
                arraylist.add(createFundingSourceListItem(fundingsource));
            }
        } while (true);
        return arraylist;
    }

    private int getTransactionType()
    {
        byte byte0 = 2;
        if (instrumentUse == 3)
        {
            byte0 = 1;
        } else
        if (instrumentUse != 2)
        {
            int i = instrumentUse;
            throw new IllegalArgumentException((new StringBuilder(59)).append("instrumentUse ").append(i).append(" cannot convert to TransactionType").toString());
        }
        return byte0;
    }

    private List getValidUnselectedFundingSources(List list)
    {
        java.util.ArrayList arraylist = Lists.newArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            FundingSource fundingsource = (FundingSource)list.next();
            if (!fundingsource.equals(currentFundingSource) && !fundingsource.isInapplicableForUse(instrumentUse))
            {
                arraylist.add(createFundingSourceListItem(fundingsource));
            }
        } while (true);
        return arraylist;
    }

    private boolean handleLoadingError(Throwable throwable)
    {
        if (throwable != null)
        {
            WLog.e(TAG, "Received exception from an event provider", throwable);
            if (!shownLoadingError)
            {
                shownLoadingError = true;
                CallErrorDialogs.createBuilderWithGenericTitle(throwable, com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).build().show(getSupportFragmentManager(), "loading_error_dialog");
            }
            return true;
        } else
        {
            return false;
        }
    }

    private void handleSelectFundingSource(FundingSource fundingsource)
    {
        if (fundingsource.isInapplicableForUse(instrumentUse))
        {
            showSelectionError(fundingsource.getRestrictedUse(instrumentUse).longMessage);
            return;
        } else
        {
            selectFundingSource(fundingsource);
            return;
        }
    }

    private boolean paymentCardsEventOk()
    {
        return !useRequiresPaymentCards() || paymentCardModelEvent.isPresent();
    }

    private void renderIfReady()
    {
        if (!allEventsReady())
        {
            return;
        }
        fullScreenProgressSpinnerManager.hide();
        java.util.ArrayList arraylist = Lists.newArrayList();
        if (storedValueEvent.isPresent() && instrumentUse != 1)
        {
            com.google.wallet.proto.NanoWalletEntities.StoredValue storedvalue = ((StoredValueEvent)storedValueEvent.get()).getModel().getStoredValue();
            if (storedvalue != null)
            {
                arraylist.add(new FundingSource(storedvalue));
            }
        }
        if (paymentCardModelEvent.isPresent())
        {
            arraylist.addAll(FundingSource.paymentCardList(((PaymentCardModelEvent)paymentCardModelEvent.get()).getModel().getAllCredentials()));
        }
        if (bankAccountsModelEvent.isPresent())
        {
            arraylist.addAll(FundingSource.bankAccountList(((BankAccountsModelEvent)bankAccountsModelEvent.get()).getModel().getBankAccounts()));
        }
        if (instrumentUse == 1)
        {
            Object obj = ((TapAndPayModelEvent)tapAndPayModelEvent.get()).getModel().getSelectedCredential(((PaymentCardModelEvent)paymentCardModelEvent.get()).getModel().getAllCredentials());
            List list;
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = new FundingSource(((PaymentCard) (obj)));
            }
            currentFundingSource = ((FundingSource) (obj));
            addStoredValueBanner();
        }
        if (showFees)
        {
            addFeeBanner();
        }
        showCurrentFundingSource(currentFundingSource);
        obj = getValidUnselectedFundingSources(arraylist);
        list = getInvalidUnselectedFundingSources(arraylist);
        if (currentFundingSource == null && arraylist.isEmpty())
        {
            findViewById(com.google.android.apps.walletnfcrel.R.id.NoCardsMessage).setVisibility(0);
            if (useRequiresBankAccount())
            {
                ((TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.NoCardsMessageExplanation)).setText(com.google.android.apps.walletnfcrel.R.string.empty_funding_sources_explanation);
            } else
            {
                ((TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.NoCardsMessageExplanation)).setText(com.google.android.apps.walletnfcrel.R.string.empty_funding_sources_explanation_no_bank);
            }
        } else
        {
            findViewById(com.google.android.apps.walletnfcrel.R.id.NoCardsMessage).setVisibility(8);
        }
        validFundingSourceAdapter.setItems(((Iterable) (obj)));
        invalidFundingSourceAdapter.setItems(list);
        showActionButton();
    }

    private void selectFundingSource(FundingSource fundingsource)
    {
        if (fundingsource.equals(currentFundingSource))
        {
            setResult(0);
            finish();
            return;
        }
        if (instrumentUse == 1)
        {
            final PaymentCard paymentCard = fundingsource.getPaymentCard();
            actionExecutor.executeAction(new Callable() {

                final SelectFundingSourceActivity this$0;
                final PaymentCard val$paymentCard;

                private Void call()
                    throws Exception
                {
                    tapAndPayModelPublisher.selectCredential(paymentCard, ((StoredValueEvent)storedValueEvent.get()).getModel().getStoredValue());
                    return null;
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = SelectFundingSourceActivity.this;
                paymentCard = paymentcard;
                super();
            }
            });
        }
        Intent intent = new Intent();
        intent.putExtra("funding_source", fundingsource);
        setResult(-1, intent);
        finish();
    }

    private void showActionButton()
    {
        if (useRequiresBankAccount() && ((BankAccountsModelEvent)bankAccountsModelEvent.get()).getModel().getBankAccounts().isEmpty())
        {
            multiActionButton.setVisibility(0);
            singleActionButton.setVisibility(8);
            return;
        } else
        {
            multiActionButton.setVisibility(8);
            singleActionButton.setVisibility(0);
            return;
        }
    }

    private void showCurrentFundingSource(FundingSource fundingsource)
    {
        selectedFundingSourceAdapter.setItem(createFundingSourceListItem(fundingsource));
    }

    private void showSelectionError(String s)
    {
        AlertDialogFragment.newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.unable_to_select_funding_source_title).setMessage(s).setCancelable(true).build().show(getSupportFragmentManager(), "DIALOG_UNSELECTABLE");
    }

    private boolean storedValueEventOk()
    {
        return !useRequiresStoredValue() || storedValueEvent.isPresent();
    }

    private boolean tapAndPayEventOk()
    {
        return !useRequiresTapAndPay() || tapAndPayModelEvent.isPresent();
    }

    private boolean useRequiresBankAccount()
    {
        return instrumentUse == 3 || instrumentUse == 2;
    }

    private boolean useRequiresPaymentCards()
    {
        return instrumentUse == 3 || instrumentUse == 1 || instrumentUse == 2;
    }

    private boolean useRequiresStoredValue()
    {
        return instrumentUse == 3 || instrumentUse == 1;
    }

    private boolean useRequiresTapAndPay()
    {
        return instrumentUse == 1;
    }

    protected final void doOnCreate(Bundle bundle)
    {
        if (getIntent().getBooleanExtra("dismiss_keyguard", false))
        {
            getWindow().addFlags(0x480000);
        }
        if (!getIntent().hasExtra("instrument_use"))
        {
            getIntent().putExtra("instrument_use", 1);
        }
        instrumentUse = getIntent().getIntExtra("instrument_use", -1);
        if (instrumentUse != 1 && instrumentUse != 3 && instrumentUse != 2)
        {
            int i = instrumentUse;
            throw new IllegalArgumentException((new StringBuilder(39)).append("unrecognized instrument use ").append(i).toString());
        }
        setContentView(com.google.android.apps.walletnfcrel.R.layout.funding_source_list);
        HeadedListAdapter headedlistadapter;
        HeadedListAdapter headedlistadapter1;
        ListView listview;
        SingleRowAdapter singlerowadapter;
        MergedListAdapter mergedlistadapter;
        int j;
        if (getIntent().hasExtra("title"))
        {
            setTitle(getIntent().getStringExtra("title"));
        } else
        if (instrumentUse == 1)
        {
            setTitle(com.google.android.apps.walletnfcrel.R.string.select_funding_sources_nfc_title);
        } else
        {
            setTitle(com.google.android.apps.walletnfcrel.R.string.select_funding_sources_title);
        }
        showFees = getIntent().getBooleanExtra("show_fees", false);
        bundle = findViewById(com.google.android.apps.walletnfcrel.R.id.NoCardSelectedHelpText);
        if (getIntent().getBooleanExtra("show_help_text", false))
        {
            j = 0;
        } else
        {
            j = 8;
        }
        bundle.setVisibility(j);
        useWalletBalanceBanner = findViewById(com.google.android.apps.walletnfcrel.R.id.UseWalletBalanceWhenAvailableBanner);
        useWalletBalanceCheckBox = (CheckBox)findViewById(com.google.android.apps.walletnfcrel.R.id.UseWalletBalanceWhenAvailableCheckBox);
        useWalletBalanceCheckBox.setOnClickListener(new android.view.View.OnClickListener() {

            final SelectFundingSourceActivity this$0;

            public final void onClick(View view)
            {
                useWalletBalanceCheckBox.setEnabled(false);
                actionExecutor.executeAction(new Callable() {

                    final _cls1 this$1;

                    private Void call()
                        throws Exception
                    {
                        tapAndPayModelPublisher.enableStoredValue(((StoredValueEvent)storedValueEvent.get()).getModel().getStoredValue(), ((PaymentCardModelEvent)paymentCardModelEvent.get()).getModel().getAllCredentials(), useWalletBalanceCheckBox.isChecked());
                        return null;
                    }

                    public final volatile Object call()
                        throws Exception
                    {
                        return call();
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                }, new AsyncCallback() {

                    final _cls1 this$1;

                    private void onSuccess(Void void1)
                    {
                        useWalletBalanceCheckBox.setEnabled(true);
                    }

                    public final void onFailure(Exception exception)
                    {
                        useWalletBalanceCheckBox.toggle();
                        useWalletBalanceCheckBox.setEnabled(true);
                        CallErrorDialogs.createBuilder(exception, com.google.android.apps.walletnfcrel.R.string.error_enable_disable_stored_balance_title, com.google.android.apps.walletnfcrel.R.string.error_enable_disable_stored_balance_message).build().show(getSupportFragmentManager());
                    }

                    public final volatile void onSuccess(Object obj)
                    {
                        onSuccess((Void)obj);
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
            }

            
            {
                this$0 = SelectFundingSourceActivity.this;
                super();
            }
        });
        Views.setLink((TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.UseWalletBalanceWhenAvailableTextView), getString(com.google.android.apps.walletnfcrel.R.string.funding_sources_use_wallet_balance_first_when_available_with_link, new Object[] {
            HelpUrls.createTapAndPayHelpUrl()
        }));
        selectedFundingSourceAdapter = new SingleItemAdapter(fundingSourceListItemBinder);
        selectedFundingSourceAdapter.setIsEnabled(true);
        bundle = (new com.google.android.apps.wallet.widgets.list.HeadedListAdapter.Builder()).withDefaultHeaderView(this).withListAdapter(selectedFundingSourceAdapter).build();
        bundle.setHeaderText(getString(com.google.android.apps.walletnfcrel.R.string.payment_card_selected_list_header));
        bundle.setHeaderVisibility(com.google.android.apps.wallet.widgets.list.HeadedListAdapter.FixedViewVisibility.VISIBLE_UNLESS_EMPTY);
        validFundingSourceAdapter = new SimpleListAdapter(fundingSourceListItemBinder);
        headedlistadapter = (new com.google.android.apps.wallet.widgets.list.HeadedListAdapter.Builder()).withDefaultHeaderView(this).withListAdapter(validFundingSourceAdapter).build();
        headedlistadapter.setHeaderText(getString(com.google.android.apps.walletnfcrel.R.string.payment_card_available_list_header));
        headedlistadapter.setHeaderVisibility(com.google.android.apps.wallet.widgets.list.HeadedListAdapter.FixedViewVisibility.VISIBLE_UNLESS_EMPTY);
        invalidFundingSourceAdapter = new SimpleListAdapter(fundingSourceListItemBinder);
        headedlistadapter1 = (new com.google.android.apps.wallet.widgets.list.HeadedListAdapter.Builder()).withDefaultHeaderView(this).withListAdapter(invalidFundingSourceAdapter).build();
        headedlistadapter1.setHeaderText(getString(com.google.android.apps.walletnfcrel.R.string.unavailable_cards_header));
        headedlistadapter1.setHeaderVisibility(com.google.android.apps.wallet.widgets.list.HeadedListAdapter.FixedViewVisibility.VISIBLE_UNLESS_EMPTY);
        listview = (ListView)findViewById(com.google.android.apps.walletnfcrel.R.id.CardList);
        singlerowadapter = new SingleRowAdapter();
        singlerowadapter.setView(getLayoutInflater().inflate(com.google.android.apps.walletnfcrel.R.layout.list_footer_fab_spacing, listview, false));
        mergedlistadapter = new MergedListAdapter();
        mergedlistadapter.setAdapters(new ListAdapter[] {
            bundle, headedlistadapter, headedlistadapter1, singlerowadapter
        });
        listview.setAdapter(mergedlistadapter);
        bundle = new FundingSourceListItemBinder.FundingSourceListItemListener() {

            final SelectFundingSourceActivity this$0;

            public final void onFundingSourceClicked(FundingSourceListItem fundingsourcelistitem)
            {
                handleSelectFundingSource(fundingsourcelistitem.fundingSource);
            }

            
            {
                this$0 = SelectFundingSourceActivity.this;
                super();
            }
        };
        fundingSourceListItemBinder.setFundingSourceListItemListener(bundle);
        if (getIntent().hasExtra("funding_source"))
        {
            currentFundingSource = (FundingSource)getIntent().getParcelableExtra("funding_source");
            showCurrentFundingSource(currentFundingSource);
        }
        singleActionButton = (FloatingActionButton)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.SingleActionButton);
        singleActionButton.setOnClickListener(new android.view.View.OnClickListener() {

            final SelectFundingSourceActivity this$0;

            public final void onClick(View view)
            {
                startActivity(PaymentCardApi.createAddNewCardIntent(SelectFundingSourceActivity.this, "instrument_add_context_P2P"));
            }

            
            {
                this$0 = SelectFundingSourceActivity.this;
                super();
            }
        });
        multiActionButton = (FloatingActionButton)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.MultiActionButton);
        actionsContainer = (ActionsContainer)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ActionsContainer);
        actionsContainer.addAction(com.google.android.apps.walletnfcrel.R.string.debit_action, com.google.android.apps.walletnfcrel.R.drawable.quantum_ic_credit_card_white_24, PaymentCardApi.createAddNewCardIntent(this, "instrument_add_context_P2P"));
        actionsContainer.addAction(com.google.android.apps.walletnfcrel.R.string.bank_account_action, com.google.android.apps.walletnfcrel.R.drawable.quantum_ic_account_balance_white_24, BankAccountApi.createAddBankAccountActivityWithUseIntent(this, instrumentUse));
    }

    public final void doOnResume()
    {
        if (useRequiresBankAccount())
        {
            eventBus.register(this, com/google/android/apps/wallet/bankaccount/api/BankAccountsModelEvent, new EventHandler() {

                final SelectFundingSourceActivity this$0;

                private void handleEvent(BankAccountsModelEvent bankaccountsmodelevent)
                {
                    if (handleLoadingError(bankaccountsmodelevent.getFailureCause()))
                    {
                        return;
                    } else
                    {
                        bankAccountsModelEvent = Optional.of(bankaccountsmodelevent);
                        renderIfReady();
                        return;
                    }
                }

                public final volatile void handleEvent(Object obj)
                {
                    handleEvent((BankAccountsModelEvent)obj);
                }

            
            {
                this$0 = SelectFundingSourceActivity.this;
                super();
            }
            });
        }
        if (useRequiresStoredValue())
        {
            eventBus.register(this, com/google/android/apps/wallet/storedvalue/api/StoredValueEvent, new EventHandler() {

                final SelectFundingSourceActivity this$0;

                private void handleEvent(StoredValueEvent storedvalueevent)
                {
                    if (handleLoadingError(storedvalueevent.getFailureCause()))
                    {
                        return;
                    } else
                    {
                        storedValueEvent = Optional.of(storedvalueevent);
                        renderIfReady();
                        return;
                    }
                }

                public final volatile void handleEvent(Object obj)
                {
                    handleEvent((StoredValueEvent)obj);
                }

            
            {
                this$0 = SelectFundingSourceActivity.this;
                super();
            }
            });
        }
        if (useRequiresPaymentCards())
        {
            eventBus.register(this, com/google/android/apps/wallet/cardlist/PaymentCardModelEvent, new EventHandler() {

                final SelectFundingSourceActivity this$0;

                private void handleEvent(PaymentCardModelEvent paymentcardmodelevent)
                {
                    if (handleLoadingError(paymentcardmodelevent.getFailureCause()))
                    {
                        return;
                    } else
                    {
                        paymentCardModelEvent = Optional.of(paymentcardmodelevent);
                        renderIfReady();
                        return;
                    }
                }

                public final volatile void handleEvent(Object obj)
                {
                    handleEvent((PaymentCardModelEvent)obj);
                }

            
            {
                this$0 = SelectFundingSourceActivity.this;
                super();
            }
            });
        }
        if (useRequiresTapAndPay())
        {
            eventBus.register(this, com/google/android/apps/wallet/frontinginstrument/TapAndPayModelEvent, new EventHandler() {

                final SelectFundingSourceActivity this$0;

                private void handleEvent(TapAndPayModelEvent tapandpaymodelevent)
                {
                    if (handleLoadingError(tapandpaymodelevent.getFailureCause()))
                    {
                        return;
                    } else
                    {
                        tapAndPayModelEvent = Optional.of(tapandpaymodelevent);
                        renderIfReady();
                        return;
                    }
                }

                public final volatile void handleEvent(Object obj)
                {
                    handleEvent((TapAndPayModelEvent)obj);
                }

            
            {
                this$0 = SelectFundingSourceActivity.this;
                super();
            }
            });
        }
        if (showFees)
        {
            eventBus.register(this, com/google/android/apps/wallet/transfer/api/FundsTransferInfoEvent, Integer.valueOf(getTransactionType()), new EventHandler() {

                final SelectFundingSourceActivity this$0;

                private void handleEvent(FundsTransferInfoEvent fundstransferinfoevent)
                {
                    if (handleLoadingError(fundstransferinfoevent.getFailureCause()))
                    {
                        return;
                    } else
                    {
                        fundsTransferInfoEvent = Optional.of(fundstransferinfoevent);
                        renderIfReady();
                        return;
                    }
                }

                public final volatile void handleEvent(Object obj)
                {
                    handleEvent((FundsTransferInfoEvent)obj);
                }

            
            {
                this$0 = SelectFundingSourceActivity.this;
                super();
            }
            });
        }
        if (instrumentUse == 1)
        {
            analyticsUtil.sendScreen("Tap And Pay Settings", new AnalyticsCustomDimension[0]);
            return;
        } else
        {
            analyticsUtil.sendScreen("Forms Of Payment", new AnalyticsCustomDimension[0]);
            return;
        }
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        if (instrumentUse == 1)
        {
            menu = menu.add(0, 53, 0x30001, com.google.android.apps.walletnfcrel.R.string.help_topic_how_to_tap_and_pay_title);
            menu.setIcon(com.google.android.apps.walletnfcrel.R.drawable.ic_help_white_24dp);
            menu.setShowAsActionFlags(1);
        }
        return true;
    }

    public void onDestroy()
    {
        actionExecutor.cancelAll();
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 53: // '5'
            startActivity(InternalIntents.forClass(this, com/google/android/apps/wallet/help/ui/HowToPurchaseSynopsisActivity));
            break;
        }
        return true;
    }

    protected void onPause()
    {
        eventBus.unregisterAll(this);
        super.onPause();
    }

    protected final void onUpPressed()
    {
        setResult(0);
        finish();
    }






/*
    static Optional access$102(SelectFundingSourceActivity selectfundingsourceactivity, Optional optional)
    {
        selectfundingsourceactivity.storedValueEvent = optional;
        return optional;
    }

*/



/*
    static Optional access$202(SelectFundingSourceActivity selectfundingsourceactivity, Optional optional)
    {
        selectfundingsourceactivity.paymentCardModelEvent = optional;
        return optional;
    }

*/




/*
    static Optional access$502(SelectFundingSourceActivity selectfundingsourceactivity, Optional optional)
    {
        selectfundingsourceactivity.bankAccountsModelEvent = optional;
        return optional;
    }

*/



/*
    static Optional access$702(SelectFundingSourceActivity selectfundingsourceactivity, Optional optional)
    {
        selectfundingsourceactivity.tapAndPayModelEvent = optional;
        return optional;
    }

*/


/*
    static Optional access$802(SelectFundingSourceActivity selectfundingsourceactivity, Optional optional)
    {
        selectfundingsourceactivity.fundsTransferInfoEvent = optional;
        return optional;
    }

*/

}
