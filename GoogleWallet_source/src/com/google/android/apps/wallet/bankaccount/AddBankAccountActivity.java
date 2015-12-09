// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.bankaccount.api.BankAccount;
import com.google.android.apps.wallet.bankaccount.api.BankAccountApi;
import com.google.android.apps.wallet.bankaccount.api.BankAccountClient;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModelPublisher;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager;
import com.google.android.apps.wallet.data.StringValidators;
import com.google.android.apps.wallet.data.TextViewMatchValidator;
import com.google.android.apps.wallet.encryption.EncryptionService;
import com.google.android.apps.wallet.funding.api.FundingSource;
import com.google.android.apps.wallet.help.api.HelpUrls;
import com.google.android.apps.wallet.money.CurrencyUtil;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.android.apps.wallet.widgets.validation.ValidatedEditText;
import com.google.android.apps.wallet.widgets.validation.ValidationGroup;
import java.util.Locale;
import java.util.concurrent.Callable;

public class AddBankAccountActivity extends WalletActivity
{

    ActionExecutor actionExecutor;
    AnalyticsUtil analyticsUtil;
    BankAccountClient bankAccountClient;
    BankAccountsModelPublisher bankAccountsModelPublisher;
    CloudConfigurationManager cloudConfigurationManager;
    EncryptionService encryptionService;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    private int instrumentUse;
    NetworkAccessChecker prerequisiteExecutor;
    ValidationGroup validationGroup;

    public AddBankAccountActivity()
    {
        this(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    public AddBankAccountActivity(int i)
    {
        super(i);
    }

    private void addBankAccount()
    {
        if (!prerequisiteExecutor.check())
        {
            return;
        }
        if (validationGroup.checkForErrors())
        {
            validationGroup.focusOnFirstError();
            return;
        }
        analyticsUtil.startTiming(null, "user_add_bank");
        fullScreenProgressSpinnerManager.show();
        int i;
        if (((Spinner)findViewById(com.google.android.apps.walletnfcrel.R.id.AccountTypeSpinner)).getSelectedItemPosition() == 0)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        actionExecutor.executeAction(createAddBankAccountAction(i, ((ValidatedEditText)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.RoutingNumber)).getValue(), ((ValidatedEditText)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.AccountNumber)).getValue(), ((ValidatedEditText)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.AccountHolderName)).getValue().trim()), createAddBankAccountCallback());
    }

    private boolean checkApplicableForUse(com.google.wallet.proto.NanoWalletEntities.BankAccount bankaccount)
    {
        while (instrumentUse == -1 || (new BankAccount(bankaccount)).getRestrictedUseExcludingUnverified(instrumentUse) == null) 
        {
            return true;
        }
        return false;
    }

    private Callable createAddBankAccountAction(final int accountType, final String routingNumber, final String accountNumber, final String accountHolderName)
    {
        return new Callable() {

            final AddBankAccountActivity this$0;
            final String val$accountHolderName;
            final String val$accountNumber;
            final int val$accountType;
            final String val$routingNumber;

            private com.google.wallet.proto.api.NanoWalletInstrument.AddBankAccountResponse call()
                throws Exception
            {
                String s;
                com.google.wallet.proto.api.NanoWalletInstrument.AddBankAccountRequest.EncryptedAccountData encryptedaccountdata;
                Object obj;
                if (accountNumber.length() < 4)
                {
                    s = accountNumber;
                } else
                {
                    s = accountNumber.substring(accountNumber.length() - 4);
                }
                obj = encryptionService.newSession();
                encryptedaccountdata = new com.google.wallet.proto.api.NanoWalletInstrument.AddBankAccountRequest.EncryptedAccountData();
                encryptedaccountdata.encryptedAccountNumber = (String)((com.google.android.apps.wallet.encryption.EncryptionService.EncryptionSession) (obj)).encrypt(accountNumber);
                encryptedaccountdata.billingPublicKeyEncryptedSessionMaterial = (String)((com.google.android.apps.wallet.encryption.EncryptionService.EncryptionSession) (obj)).getSessionMaterial();
                obj = new com.google.wallet.proto.api.NanoWalletInstrument.AddBankAccountRequest();
                obj.encryptedAccountData = encryptedaccountdata;
                obj.accountType = Integer.valueOf(accountType);
                obj.accountHolderName = accountHolderName;
                obj.accountNumberTrailingDigits = s;
                obj.bankCode = routingNumber;
                obj.regionCode = CurrencyUtil.getLegalAddressLocale().getCountry();
                return bankAccountClient.addBankAccount(((com.google.wallet.proto.api.NanoWalletInstrument.AddBankAccountRequest) (obj)));
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = AddBankAccountActivity.this;
                accountNumber = s;
                accountType = i;
                accountHolderName = s1;
                routingNumber = s2;
                super();
            }
        };
    }

    private AsyncCallback createAddBankAccountCallback()
    {
        return new AsyncCallback() {

            final AddBankAccountActivity this$0;

            private void onSuccess(com.google.wallet.proto.api.NanoWalletInstrument.AddBankAccountResponse addbankaccountresponse)
            {
                handleAddBankAccountCallSuccess(addbankaccountresponse);
            }

            public final void onFailure(Exception exception)
            {
                fullScreenProgressSpinnerManager.hide();
                AlertDialogFragment.newBuilder().setMessage(getString(com.google.android.apps.walletnfcrel.R.string.add_bank_account_error_please_try_again)).build().show(getSupportFragmentManager());
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((com.google.wallet.proto.api.NanoWalletInstrument.AddBankAccountResponse)obj);
            }

            
            {
                this$0 = AddBankAccountActivity.this;
                super();
            }
        };
    }

    private Intent createBankAccountVerifyIntent(BankAccount bankaccount)
    {
        return BankAccountApi.createVerifyBankAccountActivityIntent(this, bankaccount);
    }

    private Intent createChallengeDepositIntent(BankAccount bankaccount)
    {
        return BankAccountApi.createChallengeDepositActivityIntent(this, bankaccount);
    }

    private Intent createVerifyWithDepositIntent(BankAccount bankaccount)
    {
        return BankAccountApi.createVerifyWithDepositActivityIntent(this, bankaccount);
    }

    private void handleAddBankAccountCallSuccess(com.google.wallet.proto.api.NanoWalletInstrument.AddBankAccountResponse addbankaccountresponse)
    {
        if (addbankaccountresponse.callError == null)
        {
            analyticsUtil.endTiming(null, "user_add_bank");
            addbankaccountresponse = addbankaccountresponse.account;
            bankAccountsModelPublisher.generateUpdateBankAccountEvent(addbankaccountresponse);
            if (!checkApplicableForUse(addbankaccountresponse))
            {
                Intent intent = new Intent();
                intent.putExtra("funding_source", new FundingSource(new BankAccount(addbankaccountresponse)));
                setResult(0, intent);
                finish();
                return;
            }
            Intent intent1 = new Intent();
            intent1.putExtra("funding_source", new FundingSource(new BankAccount(addbankaccountresponse)));
            if (((com.google.wallet.proto.NanoWalletEntities.BankAccount) (addbankaccountresponse)).accountStatus.status.intValue() == 2)
            {
                Toasts.show(this, getString(com.google.android.apps.walletnfcrel.R.string.bank_account_added));
                setResult(-1, intent1);
                finish();
                return;
            }
            if (((com.google.wallet.proto.NanoWalletEntities.BankAccount) (addbankaccountresponse)).challengeStatus.status.intValue() == 3)
            {
                startActivity(createVerifyWithDepositIntent(new BankAccount(addbankaccountresponse)));
            } else
            if (((com.google.wallet.proto.NanoWalletEntities.BankAccount) (addbankaccountresponse)).challengeStatus.status.intValue() == 2)
            {
                startActivity(createChallengeDepositIntent(new BankAccount(addbankaccountresponse)));
            } else
            {
                startActivity(createBankAccountVerifyIntent(new BankAccount(addbankaccountresponse)));
            }
            setResult(-1, intent1);
            finish();
            return;
        } else
        {
            fullScreenProgressSpinnerManager.hide();
            addbankaccountresponse = addbankaccountresponse.callError;
            AlertDialogFragment.newBuilder().setTitle(((com.google.wallet.proto.NanoWalletError.CallError) (addbankaccountresponse)).title).setMessage(((com.google.wallet.proto.NanoWalletError.CallError) (addbankaccountresponse)).content).build().show(getSupportFragmentManager());
            return;
        }
    }

    private void setFullWidthSingleSpinnerPadding(Spinner spinner)
    {
        int i = getResources().getDimensionPixelSize(com.google.android.apps.walletnfcrel.R.dimen.default_spacing);
        spinner.setPadding(getResources().getDimensionPixelSize(com.google.android.apps.walletnfcrel.R.dimen.narrow_spacing), i, 0, i);
    }

    protected final void doOnCreate(Bundle bundle)
    {
        getWindow().addFlags(8192);
        setTitle(com.google.android.apps.walletnfcrel.R.string.enter_bank_information);
        setContentView(com.google.android.apps.walletnfcrel.R.layout.add_bank_account);
        bundle = (Spinner)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.AccountTypeSpinner);
        setFullWidthSingleSpinnerPadding(bundle);
        Object obj = ArrayAdapter.createFromResource(this, com.google.android.apps.walletnfcrel.R.array.bank_account_type, 0x1090008);
        ((ArrayAdapter) (obj)).setDropDownViewResource(0x1090009);
        bundle.setAdapter(((android.widget.SpinnerAdapter) (obj)));
        bundle = (ValidatedEditText)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.RoutingNumber);
        bundle.setMaxLength(9);
        bundle.setInputType(2);
        if (cloudConfigurationManager.getCloudConfig() == com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager.CloudConfig.PROD)
        {
            bundle.setValidator(StringValidators.BANK_ROUTING_NUMBER);
        } else
        {
            bundle.setValidator(StringValidators.NO_VALIDATION);
        }
        validationGroup.addInput(bundle);
        bundle = (ValidatedEditText)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.AccountNumber);
        bundle.setMaxLength(17);
        bundle.setInputType(2);
        bundle.setValidator(StringValidators.BANK_ACCOUNT_NUMBER);
        validationGroup.addInput(bundle);
        obj = (ValidatedEditText)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.AccountNumberConfirmation);
        ((ValidatedEditText) (obj)).setMaxLength(17);
        ((ValidatedEditText) (obj)).setInputType(2);
        ((ValidatedEditText) (obj)).setValidator(new TextViewMatchValidator(bundle, com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_bank_account_numbers_must_match));
        validationGroup.addInput(((android.view.View) (obj)));
        bundle = (ValidatedEditText)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.AccountHolderName);
        bundle.setInputType(8289);
        bundle.setValidator(StringValidators.BANK_ACCOUNT_HOLDER_NAME);
        validationGroup.addInput(bundle);
        Views.setLink((TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.BankAccountLearnMore), getString(com.google.android.apps.walletnfcrel.R.string.bank_account_learn_more, new Object[] {
            HelpUrls.createBankAccountLearnMoreUrl()
        }));
        instrumentUse = getIntent().getIntExtra("instrument_use", -1);
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(com.google.android.apps.walletnfcrel.R.menu.action_bar_button, menu);
        menu.findItem(com.google.android.apps.walletnfcrel.R.id.ActionBarButton).setTitle(com.google.android.apps.walletnfcrel.R.string.button_next);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == com.google.android.apps.walletnfcrel.R.id.ActionBarButton)
        {
            addBankAccount();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onPause()
    {
        actionExecutor.cancelAll();
        super.onPause();
    }

    protected final void onUpPressed()
    {
        Views.hideSoftKeyboard(this, getCurrentFocus());
        finish();
    }

}
