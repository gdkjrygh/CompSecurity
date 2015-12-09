// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.bankaccount.api.BankAccount;
import com.google.android.apps.wallet.bankaccount.api.BankAccountApi;
import com.google.android.apps.wallet.bankaccount.api.BankAccountClient;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModelPublisher;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.bankaccount:
//            RemoveBankAccountActivity, Amounts, RemoveBankAccountHelper

public class VerifyBankAccountActivity extends RemoveBankAccountActivity
{

    ActionExecutor actionExecutor;
    AnalyticsUtil analyticsUtil;
    private BankAccount bankAccount;
    BankAccountClient bankAccountClient;
    BankAccountsModelPublisher bankAccountsModelPublisher;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    NetworkAccessChecker networkAccessChecker;

    public VerifyBankAccountActivity()
    {
    }

    public VerifyBankAccountActivity(int i)
    {
        super(i);
    }

    private Callable createVerifyUsingChallengeDepositAction(final String bankAccountSubId)
    {
        return new Callable() {

            final VerifyBankAccountActivity this$0;
            final String val$bankAccountSubId;

            private com.google.wallet.proto.api.NanoWalletInstrument.InitiateChallengeDepositResponse call()
                throws Exception
            {
                com.google.wallet.proto.api.NanoWalletInstrument.InitiateChallengeDepositRequest initiatechallengedepositrequest = new com.google.wallet.proto.api.NanoWalletInstrument.InitiateChallengeDepositRequest();
                initiatechallengedepositrequest.bankAccountSubId = bankAccountSubId;
                return bankAccountClient.initiateChallengeDeposit(initiatechallengedepositrequest);
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = VerifyBankAccountActivity.this;
                bankAccountSubId = s;
                super();
            }
        };
    }

    private AsyncCallback createVerifyUsingChallengeDepositCallback()
    {
        return new AsyncCallback() {

            final VerifyBankAccountActivity this$0;

            private void onSuccess(com.google.wallet.proto.api.NanoWalletInstrument.InitiateChallengeDepositResponse initiatechallengedepositresponse)
            {
                handleVerifyUsingChallengeDepositCallSuccess(initiatechallengedepositresponse);
            }

            public final void onFailure(Exception exception)
            {
                fullScreenProgressSpinnerManager.hide();
                analyticsUtil.sendError("SendChallengeDeposit", new AnalyticsCustomDimension[0]);
                showErrorDialog();
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((com.google.wallet.proto.api.NanoWalletInstrument.InitiateChallengeDepositResponse)obj);
            }

            
            {
                this$0 = VerifyBankAccountActivity.this;
                super();
            }
        };
    }

    private Intent createVerifyWithDepositActivityIntent(BankAccount bankaccount)
    {
        return BankAccountApi.createVerifyWithDepositActivityIntent(this, bankaccount);
    }

    private Intent createVerifyWithIavIntent(BankAccount bankaccount)
    {
        return BankAccountApi.createVerifyWithIavActivityIntent(this, bankaccount);
    }

    private void handleVerifyUsingChallengeDepositCallSuccess(com.google.wallet.proto.api.NanoWalletInstrument.InitiateChallengeDepositResponse initiatechallengedepositresponse)
    {
        if (initiatechallengedepositresponse.callError == null)
        {
            analyticsUtil.sendSuccess("SendChallengeDeposit", new AnalyticsCustomDimension[0]);
            bankAccountsModelPublisher.generateUpdateBankAccountEvent(initiatechallengedepositresponse.account);
            startActivity(createVerifyWithDepositActivityIntent(new BankAccount(initiatechallengedepositresponse.account)));
            finish();
            return;
        } else
        {
            fullScreenProgressSpinnerManager.hide();
            analyticsUtil.sendError("SendChallengeDeposit", new AnalyticsCustomDimension[0]);
            initiatechallengedepositresponse = initiatechallengedepositresponse.callError;
            AlertDialogFragment.newBuilder().setTitle(((com.google.wallet.proto.NanoWalletError.CallError) (initiatechallengedepositresponse)).title).setMessage(((com.google.wallet.proto.NanoWalletError.CallError) (initiatechallengedepositresponse)).content).build().show(getSupportFragmentManager());
            return;
        }
    }

    private void showErrorDialog()
    {
        AlertDialogFragment.newBuilder().setMessage(getString(com.google.android.apps.walletnfcrel.R.string.verify_bank_account_error_please_try_again)).build().show(getSupportFragmentManager());
    }

    private void verifyUsingChallengeDeposit()
    {
        if (!networkAccessChecker.check())
        {
            return;
        } else
        {
            fullScreenProgressSpinnerManager.show();
            analyticsUtil.sendButtonTap("SendChallengeDeposit", new AnalyticsCustomDimension[0]);
            actionExecutor.executeAction(createVerifyUsingChallengeDepositAction(bankAccount.getCdpId().subId), createVerifyUsingChallengeDepositCallback());
            return;
        }
    }

    private void verifyUsingIav()
    {
        if (!networkAccessChecker.check())
        {
            return;
        } else
        {
            analyticsUtil.sendButtonTap("VerifyBankAccount", new AnalyticsCustomDimension[0]);
            startActivity(createVerifyWithIavIntent(bankAccount));
            finish();
            return;
        }
    }

    protected final void doOnCreate(Bundle bundle)
    {
        boolean flag1 = true;
        setTitle(com.google.android.apps.walletnfcrel.R.string.verify_bank_account_title);
        setContentView(com.google.android.apps.walletnfcrel.R.layout.verify_bank_account);
        bundle = getIntent();
        if (!bundle.hasExtra("bank_account"))
        {
            throw new IllegalArgumentException("VerifyBankAccountActivity.doOnCreate() missing extras");
        }
        bankAccount = (BankAccount)bundle.getParcelableExtra("bank_account");
        Views.setLinkOnClickListener(findViewById(com.google.android.apps.walletnfcrel.R.id.InstantVerification), new android.view.View.OnClickListener() {

            final VerifyBankAccountActivity this$0;

            public final void onClick(View view)
            {
                verifyUsingIav();
            }

            
            {
                this$0 = VerifyBankAccountActivity.this;
                super();
            }
        }, com.google.android.apps.walletnfcrel.R.string.verify_bank_account_instantly_description);
        bundle = new android.view.View.OnClickListener() {

            final VerifyBankAccountActivity this$0;

            public final void onClick(View view)
            {
                verifyUsingChallengeDeposit();
            }

            
            {
                this$0 = VerifyBankAccountActivity.this;
                super();
            }
        };
        String s = getString(com.google.android.apps.walletnfcrel.R.string.verify_bank_account_using_challenge_deposit_description, new Object[] {
            Amounts.MAX_DEPOSIT_AMOUNT
        });
        Views.setLinkOnClickListener(findViewById(com.google.android.apps.walletnfcrel.R.id.ChallengeDepositVerification), bundle, s);
        ((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ChallengeDepositDescription)).setText(s);
        findViewById(com.google.android.apps.walletnfcrel.R.id.SendChallengeDeposit).setOnClickListener(bundle);
        ((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.VerificationMessageContent)).setText(getString(com.google.android.apps.walletnfcrel.R.string.verification_ownership_message_content, new Object[] {
            Amounts.MAX_DEPOSIT_AMOUNT
        }));
        bundle = getString(com.google.android.apps.walletnfcrel.R.string.please_verify_your_bank_account, new Object[] {
            bankAccount.getNickname(this)
        });
        ((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.VerifyBankAccountTitle)).setText(bundle);
        int i = bankAccount.getIavStatus();
        boolean flag = flag1;
        if (i != 1)
        {
            flag = flag1;
            if (i != 2)
            {
                if (i == 4)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
            }
        }
        if (flag)
        {
            findViewById(com.google.android.apps.walletnfcrel.R.id.ChooseVerificationMethodLayout).setVisibility(0);
            findViewById(com.google.android.apps.walletnfcrel.R.id.SendChallengeDepositLayout).setVisibility(8);
        } else
        {
            findViewById(com.google.android.apps.walletnfcrel.R.id.ChooseVerificationMethodLayout).setVisibility(8);
            findViewById(com.google.android.apps.walletnfcrel.R.id.SendChallengeDepositLayout).setVisibility(0);
        }
        removeBankAccountHelper.initMenu(bankAccount);
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        RemoveBankAccountHelper removebankaccounthelper = removeBankAccountHelper;
        boolean flag = RemoveBankAccountHelper.createOptionsMenu(menu);
        return super.onCreateOptionsMenu(menu) || flag;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        return removeBankAccountHelper.handleOptionsMenuItemSelection(this, menuitem) || super.onOptionsItemSelected(menuitem);
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
