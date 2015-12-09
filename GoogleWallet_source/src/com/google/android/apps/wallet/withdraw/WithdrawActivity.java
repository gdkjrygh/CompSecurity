// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.withdraw;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.bankaccount.api.BankAccount;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModel;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModelEvent;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.storedvalue.api.StoredValueEvent;
import com.google.android.apps.wallet.storedvalue.api.StoredValueModel;
import com.google.android.apps.wallet.storedvalue.api.StoredValuePublisher;
import com.google.android.apps.wallet.transfer.api.FundsTransferClient;
import com.google.android.apps.wallet.transfer.api.TransferApi;
import com.google.android.apps.wallet.transfer.validator.MoneyTransferAmountValidator;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.util.text.DefaultTextWatcher;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.money.MonetaryValueInput;
import com.google.android.apps.wallet.widgets.money.MoneyInputSection;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.common.base.Optional;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;

public class WithdrawActivity extends WalletActivity
{

    protected MonetaryValueInput amount;
    private TextView amountError;
    AnalyticsUtil analyticsUtil;
    private BankAccount bankAccount;
    private BankAccountsModelEvent bankAccountsModelEvent;
    EventBus eventBus;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    FundsTransferClient fundsTransferClient;
    long lastWithdrawAmount;
    MoneyTransferAmountValidator moneyTransferAmountValidator;
    NetworkAccessChecker networkAccessChecker;
    private String previousError;
    private StoredValueEvent storedValueEvent;
    StoredValuePublisher storedValuePublisher;
    UriRegistry uriRegistry;
    String withdrawId;

    public WithdrawActivity()
    {
        this(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    public WithdrawActivity(int i)
    {
        super(i);
    }

    private Intent createConfirmMoneyTransferIntent()
    {
        return TransferApi.createConfirmMoneyTransferIntent(this, 5, amount.getMoneyValue().micros.longValue(), amount.getMoneyValue().currencyCode, null, null);
    }

    public static Intent createIntent(Context context)
    {
        return InternalIntents.forClass(context, com/google/android/apps/wallet/withdraw/WithdrawActivity);
    }

    private void renderIfNecessary()
    {
        if (storedValueEvent == null || bankAccountsModelEvent == null)
        {
            return;
        }
        boolean flag;
        boolean flag1;
        if (storedValueEvent.getFailureCause() != null || storedValueEvent.getModel().getStoredValue() == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!bankAccountsModelEvent.isFeatureEnabled() || bankAccountsModelEvent.getFailureCause() != null || bankAccountsModelEvent.getModel().getBankAccounts().isEmpty())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag || flag1)
        {
            AlertDialogFragment.newBuilder().setMessage(getString(com.google.android.apps.walletnfcrel.R.string.withdraw_error_please_try_again)).setFinishActivityOnClick().setCancelable(false).build().show(getSupportFragmentManager());
            return;
        }
        fullScreenProgressSpinnerManager.hide();
        bankAccount = (BankAccount)bankAccountsModelEvent.getModel().getBankAccounts().get(0);
        ((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.TransferToAccountName)).setText(bankAccount.getNickname(this));
        String s1 = storedValueEvent.getModel().getStoredValue().balance.displayAmount;
        String s = s1;
        if (Strings.isNullOrEmpty(s1))
        {
            s = getString(com.google.android.apps.walletnfcrel.R.string.unknown_wallet_balance_amount);
        }
        ((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.AvailableAmount)).setText(s);
        amount.addTextChangedListener(new DefaultTextWatcher() {

            final WithdrawActivity this$0;

            public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
                validate();
            }

            
            {
                this$0 = WithdrawActivity.this;
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

    protected final void doOnCreate(Bundle bundle)
    {
        setTitle(com.google.android.apps.walletnfcrel.R.string.transfer_to_bank_activity_title);
        if (bundle != null)
        {
            if (bundle.containsKey("key_withdraw_id"))
            {
                withdrawId = bundle.getString("key_withdraw_id");
            }
            if (bundle.containsKey("key_last_withdraw_amount"))
            {
                lastWithdrawAmount = bundle.getLong("key_last_withdraw_amount");
            }
        }
        setContentView(com.google.android.apps.walletnfcrel.R.layout.withdraw_activity);
        amount = ((MoneyInputSection)findViewById(com.google.android.apps.walletnfcrel.R.id.MoneyInputSection)).getInput();
        amountError = ((MoneyInputSection)findViewById(com.google.android.apps.walletnfcrel.R.id.MoneyInputSection)).getErrorView();
        Views.setLink((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.TransferDelayExplanation), getString(com.google.android.apps.walletnfcrel.R.string.withdraw_transaction_free));
        fullScreenProgressSpinnerManager.showImmediately();
    }

    public final void doOnResume()
    {
        eventBus.register(this, com/google/android/apps/wallet/withdraw/WithdrawActivity);
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

    public void onBankAccountsModelEvent(BankAccountsModelEvent bankaccountsmodelevent)
    {
        bankAccountsModelEvent = bankaccountsmodelevent;
        renderIfNecessary();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(com.google.android.apps.walletnfcrel.R.menu.action_bar_button, menu);
        menu.findItem(com.google.android.apps.walletnfcrel.R.id.ActionBarButton).setTitle(com.google.android.apps.walletnfcrel.R.string.button_review);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == com.google.android.apps.walletnfcrel.R.id.ActionBarButton)
        {
            if (validate())
            {
                startActivityForResult(createConfirmMoneyTransferIntent(), 1);
            }
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onPause()
    {
        eventBus.unregisterAll(this);
        super.onPause();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (withdrawId != null)
        {
            bundle.putString("key_withdraw_id", withdrawId);
        }
        bundle.putLong("key_last_withdraw_amount", lastWithdrawAmount);
    }

    public void onStoredValueEvent(StoredValueEvent storedvalueevent)
    {
        storedValueEvent = storedvalueevent;
        renderIfNecessary();
    }

    protected final void onUpPressed()
    {
        Views.hideSoftKeyboard(this, getCurrentFocus());
        navigateUpWithIntent(uriRegistry.createIntent(5003, new Object[0]));
    }

    protected final boolean validate()
    {
        String s = moneyTransferAmountValidator.validateAmount(getResources(), amount.getMoneyValue(), Optional.of(storedValueEvent.getModel().getStoredValue().balance), previousError, 5);
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
}
