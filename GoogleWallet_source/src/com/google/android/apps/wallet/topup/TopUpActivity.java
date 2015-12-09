// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.topup;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.bankaccount.api.BankAccount;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModel;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModelEvent;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.config.appcontrol.AppControlKey;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.funding.widgets.VerifyBankAccountDialogFragment;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.money.CurrencyUtil;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.recurringtopup.RecurringTopupEligibilityEvent;
import com.google.android.apps.wallet.recurringtopup.RecurringTopupErrorActivity;
import com.google.android.apps.wallet.recurringtopup.RecurringTopupEvent;
import com.google.android.apps.wallet.recurringtopup.RecurringTopupIntroActivity;
import com.google.android.apps.wallet.recurringtopup.SetupRecurringTopupActivity;
import com.google.android.apps.wallet.recurringtopup.ViewRecurringTopupActivity;
import com.google.android.apps.wallet.transfer.api.FundsTransferClient;
import com.google.android.apps.wallet.transfer.api.FundsTransferInfoEvent;
import com.google.android.apps.wallet.transfer.api.TransferApi;
import com.google.android.apps.wallet.transfer.validator.MoneyTransferAmountValidator;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.util.text.DefaultTextWatcher;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.money.MonetaryValueInput;
import com.google.android.apps.wallet.widgets.money.MoneyInputSection;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Locale;

public class TopUpActivity extends WalletActivity
{

    private static final String TAG = com/google/android/apps/wallet/topup/TopUpActivity.getSimpleName();
    Button addMoneyAmountButtons[];
    protected MonetaryValueInput amount;
    private TextView amountError;
    AnalyticsUtil analyticsUtil;
    AppControl appControl;
    private BankAccountsModelEvent bankAccountsModelEvent;
    EventBus eventBus;
    FeatureManager featureManager;
    FundsTransferClient fundsTransferClient;
    private Optional maxTransferAmount;
    MoneyTransferAmountValidator moneyTransferAmountValidator;
    NetworkAccessChecker networkAccessChecker;
    private TextView nextTopupButton;
    private String previousError;
    private RecurringTopupEligibilityEvent recurringTopupEligibilityEvent;
    private RecurringTopupEvent recurringTopupEvent;
    private TextView setupRecurringTopupButton;
    UriRegistry uriRegistry;
    UserEventLogger userEventLogger;

    public TopUpActivity()
    {
        this(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    public TopUpActivity(int i)
    {
        super(i);
        maxTransferAmount = Optional.absent();
    }

    private void confirmMoneyTransfer()
    {
        if (validate())
        {
            startActivityForResult(createConfirmMoneyTransferIntent(), 1);
        }
    }

    private Intent createConfirmMoneyTransferIntent()
    {
        return TransferApi.createConfirmMoneyTransferIntent(this, 2, amount.getMoneyValue().micros.longValue(), amount.getMoneyValue().currencyCode, null, null);
    }

    private void maybeUpdateRecurringTopupContent()
    {
        boolean flag = false;
        if (recurringTopupEligibilityEvent != null && recurringTopupEvent != null && bankAccountsModelEvent != null)
        {
            TextView textview = setupRecurringTopupButton;
            int i;
            if (recurringTopupEligibilityEvent.isFeatureEnabled() && bankAccountsModelEvent.isFeatureEnabled() && recurringTopupEvent.getTopupSchedule() == null)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            textview.setVisibility(i);
            textview = nextTopupButton;
            if (recurringTopupEligibilityEvent.isFeatureEnabled() && recurringTopupEvent.getTopupSchedule() != null)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 8;
            }
            textview.setVisibility(i);
            if (recurringTopupEvent.getTopupSchedule() != null)
            {
                nextTopupButton.setText(recurringTopupEvent.getTopupSchedule().nextTopup.startMessage);
                Views.setLinkOnClickListener(nextTopupButton, new android.view.View.OnClickListener() {

                    final TopUpActivity this$0;

                    public final void onClick(View view)
                    {
                        TopUpActivity topupactivity = TopUpActivity.this;
                        TopUpActivity topupactivity1 = TopUpActivity.this;
                        if (recurringTopupEvent.getTopupSchedule().errorState != null)
                        {
                            view = com/google/android/apps/wallet/recurringtopup/RecurringTopupErrorActivity;
                        } else
                        {
                            view = com/google/android/apps/wallet/recurringtopup/ViewRecurringTopupActivity;
                        }
                        topupactivity.startActivity(InternalIntents.forClass(topupactivity1, view));
                    }

            
            {
                this$0 = TopUpActivity.this;
                super();
            }
                }, nextTopupButton.getText().toString());
                return;
            }
        }
    }

    private void onSetupRecurringTopup()
    {
        Object obj = bankAccountsModelEvent.getModel().getBankAccounts();
        if (obj == null || ((List) (obj)).size() == 0)
        {
            startActivity(InternalIntents.forClass(this, com/google/android/apps/wallet/recurringtopup/RecurringTopupIntroActivity));
            return;
        }
        obj = (BankAccount)((List) (obj)).get(0);
        com.google.wallet.proto.NanoWalletEntities.RestrictedInstrumentUse restrictedinstrumentuse = ((BankAccount) (obj)).getRestrictedUseExcludingUnverified(5);
        if (restrictedinstrumentuse != null)
        {
            AlertDialogFragment.newBuilder().setTitle(restrictedinstrumentuse.shortMessage).setMessage(restrictedinstrumentuse.longMessage).build().show(getSupportFragmentManager());
            return;
        }
        if (((BankAccount) (obj)).isValid())
        {
            long l = amount.getMoneyValue().micros.longValue();
            if (l > 0L)
            {
                obj = SetupRecurringTopupActivity.createIntent(this, l);
            } else
            {
                obj = SetupRecurringTopupActivity.createIntent(this);
            }
            startActivity(((Intent) (obj)));
            return;
        } else
        {
            VerifyBankAccountDialogFragment verifybankaccountdialogfragment = new VerifyBankAccountDialogFragment();
            verifybankaccountdialogfragment.setBankAccount(((BankAccount) (obj)));
            verifybankaccountdialogfragment.show(getSupportFragmentManager());
            return;
        }
    }

    private void setTopUpAmounts(String s)
    {
        ArrayList arraylist = new ArrayList();
        s = s.split(",");
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(Integer.valueOf(Integer.parseInt(s[i])));
        }

        setUpTopUpAmountButton(0, ((Integer)arraylist.get(0)).intValue(), "SmallAmount");
        setUpTopUpAmountButton(1, ((Integer)arraylist.get(1)).intValue(), "MediumAmount");
        setUpTopUpAmountButton(2, ((Integer)arraylist.get(2)).intValue(), "LargeAmount");
    }

    private void setUpTopUpAmountButton(int i, final int topUpAmount, final String analyticsLabel)
    {
        Object obj = NumberFormat.getCurrencyInstance();
        ((NumberFormat) (obj)).setCurrency(CurrencyUtil.getLegalAddressCurrency());
        ((NumberFormat) (obj)).setMaximumFractionDigits(0);
        obj = ((NumberFormat) (obj)).format(topUpAmount);
        addMoneyAmountButtons[i].setText(((CharSequence) (obj)));
        addMoneyAmountButtons[i].setOnClickListener(new android.view.View.OnClickListener() {

            final TopUpActivity this$0;
            final String val$analyticsLabel;
            final int val$topUpAmount;

            public final void onClick(View view)
            {
                analyticsUtil.sendButtonTap(analyticsLabel, new AnalyticsCustomDimension[0]);
                int j = CurrencyUtil.getLegalAddressCurrency().getDefaultFractionDigits();
                view = String.format(Locale.getDefault(), (new StringBuilder(14)).append("%.").append(j).append("f").toString(), new Object[] {
                    Double.valueOf(1.0D * (double)topUpAmount)
                });
                amount.setText(view);
                amount.formatAmount();
            }

            
            {
                this$0 = TopUpActivity.this;
                analyticsLabel = s;
                topUpAmount = i;
                super();
            }
        });
    }

    private void showAmountError(String s)
    {
        previousError = s;
        amountError.setText(s);
        amountError.setVisibility(0);
        amountError.sendAccessibilityEvent(32);
    }

    private boolean validate()
    {
        String s = moneyTransferAmountValidator.validateAmount(getResources(), amount.getMoneyValue(), maxTransferAmount, previousError, 2);
        if (s == null)
        {
            previousError = null;
            amountError.setVisibility(8);
            return true;
        } else
        {
            showAmountError(s);
            return false;
        }
    }

    protected final void doOnCreate(Bundle bundle)
    {
        setTitle(com.google.android.apps.walletnfcrel.R.string.add_money);
        setContentView(com.google.android.apps.walletnfcrel.R.layout.top_up_activity);
        amount = ((MoneyInputSection)findViewById(com.google.android.apps.walletnfcrel.R.id.MoneyInputSection)).getInput();
        amountError = ((MoneyInputSection)findViewById(com.google.android.apps.walletnfcrel.R.id.MoneyInputSection)).getErrorView();
        amount.addTextChangedListener(new DefaultTextWatcher() {

            final TopUpActivity this$0;

            public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
                validate();
            }

            
            {
                this$0 = TopUpActivity.this;
                super();
            }
        });
        addMoneyAmountButtons = new Button[3];
        addMoneyAmountButtons[0] = (Button)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.AddMoneyAmount1);
        addMoneyAmountButtons[1] = (Button)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.AddMoneyAmount2);
        addMoneyAmountButtons[2] = (Button)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.AddMoneyAmount3);
        setTopUpAmounts(appControl.getString(AppControlKey.TOP_UP_AMOUNTS));
        setupRecurringTopupButton = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.SetupRecurringTransfer);
        Views.setLinkOnClickListener(setupRecurringTopupButton, new android.view.View.OnClickListener() {

            final TopUpActivity this$0;

            public final void onClick(View view)
            {
                onSetupRecurringTopup();
            }

            
            {
                this$0 = TopUpActivity.this;
                super();
            }
        }, com.google.android.apps.walletnfcrel.R.string.setup_recurring_topup_button);
        nextTopupButton = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.NextTransfer);
        userEventLogger.log(25, 108);
    }

    protected final void doOnResume()
    {
        super.doOnResume();
        eventBus.register(this, com/google/android/apps/wallet/topup/TopUpActivity);
        eventBus.register(this, com/google/android/apps/wallet/transfer/api/FundsTransferInfoEvent, Integer.valueOf(2), new EventHandler() {

            final TopUpActivity this$0;

            private void handleEvent(FundsTransferInfoEvent fundstransferinfoevent)
            {
                maxTransferAmount = fundstransferinfoevent.getMaxTransferAmount();
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((FundsTransferInfoEvent)obj);
            }

            
            {
                this$0 = TopUpActivity.this;
                super();
            }
        });
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 1 && j == -1)
        {
            setResult(-1);
            finish();
        }
    }

    public void onBackPressed()
    {
        setResult(0);
        super.onBackPressed();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(com.google.android.apps.walletnfcrel.R.menu.action_bar_button, menu);
        menu.findItem(com.google.android.apps.walletnfcrel.R.id.ActionBarButton).setTitle(com.google.android.apps.walletnfcrel.R.string.button_review);
        return true;
    }

    public void onNewBankAccountsModelEvent(BankAccountsModelEvent bankaccountsmodelevent)
    {
        if (bankaccountsmodelevent.getFailureCause() != null)
        {
            WLog.e(TAG, "Error getting BankAccountsModelEvent", bankaccountsmodelevent.getFailureCause());
            return;
        } else
        {
            bankAccountsModelEvent = bankaccountsmodelevent;
            maybeUpdateRecurringTopupContent();
            return;
        }
    }

    public void onNewKycStatusEvent(com.google.android.apps.wallet.kyc.api.KycStatusPublisher.KycStatusEvent kycstatusevent)
    {
        if (!Objects.equal(kycstatusevent.getStatus(), Integer.valueOf(1)))
        {
            navigateUpWithIntent(uriRegistry.createIntent(5003, new Object[0]));
        }
    }

    public void onNewRecurringTopupEligibilityEvent(RecurringTopupEligibilityEvent recurringtopupeligibilityevent)
    {
        if (recurringtopupeligibilityevent.getFailureCause() != null)
        {
            WLog.e(TAG, "Error getting RecurringTopupEligibilityEvent", recurringtopupeligibilityevent.getFailureCause());
            return;
        } else
        {
            recurringTopupEligibilityEvent = recurringtopupeligibilityevent;
            maybeUpdateRecurringTopupContent();
            return;
        }
    }

    public void onNewRecurringTopupEvent(RecurringTopupEvent recurringtopupevent)
    {
        if (recurringtopupevent.getFailureCause() != null)
        {
            WLog.e(TAG, "Error getting RecurringTopupEvent", recurringtopupevent.getFailureCause());
            return;
        } else
        {
            recurringTopupEvent = recurringtopupevent;
            maybeUpdateRecurringTopupContent();
            return;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == com.google.android.apps.walletnfcrel.R.id.ActionBarButton)
        {
            analyticsUtil.sendButtonTap("TopUpPreview", new AnalyticsCustomDimension[0]);
            Views.hideSoftKeyboard(this, null);
            confirmMoneyTransfer();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onPause()
    {
        super.onPause();
        eventBus.unregisterAll(this);
    }

    protected final void onUpPressed()
    {
        Views.hideSoftKeyboard(this, getCurrentFocus());
        if (featureManager.isFeatureEnabled(Feature.STORED_VALUE_BALANCE))
        {
            navigateUpWithIntent(uriRegistry.createIntent(5003, new Object[0]));
            return;
        } else
        {
            navigateUpWithIntent(uriRegistry.createIntent(2, new Object[0]));
            return;
        }
    }





/*
    static Optional access$202(TopUpActivity topupactivity, Optional optional)
    {
        topupactivity.maxTransferAmount = optional;
        return optional;
    }

*/

}
