// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.bankaccount.api.BankAccount;
import com.google.android.apps.wallet.bankaccount.api.BankAccountClient;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModelPublisher;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.help.api.HelpUrls;
import com.google.android.apps.wallet.money.CurrencyUtil;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.money.MonetaryValueInput;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.bankaccount:
//            RemoveBankAccountActivity, RemoveBankAccountHelper

public class ChallengeDepositActivity extends RemoveBankAccountActivity
{

    private String accountId;
    ActionExecutor actionExecutor;
    AnalyticsUtil analyticsUtil;
    BankAccountClient bankAccountClient;
    BankAccountsModelPublisher bankAccountsModelPublisher;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    private boolean isRequestInFlight;

    public ChallengeDepositActivity()
    {
        this(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    public ChallengeDepositActivity(int i)
    {
        super(i);
        isRequestInFlight = false;
    }

    private Intent createChallengeDepositDeclinedIntent()
    {
        return InternalIntents.forClass(this, "com.google.android.apps.wallet.bankaccount.ChallengeDepositDeclinedActivity");
    }

    private Callable createVerifyAction(final com.google.wallet.proto.NanoWalletEntities.MoneyProto challengeAmount)
    {
        return new Callable() {

            final ChallengeDepositActivity this$0;
            final com.google.wallet.proto.NanoWalletEntities.MoneyProto val$challengeAmount;

            private com.google.wallet.proto.api.NanoWalletInstrument.VerifyChallengeDepositResponse call()
                throws Exception
            {
                com.google.wallet.proto.api.NanoWalletInstrument.VerifyChallengeDepositRequest verifychallengedepositrequest = new com.google.wallet.proto.api.NanoWalletInstrument.VerifyChallengeDepositRequest();
                verifychallengedepositrequest.bankAccountSubId = accountId;
                verifychallengedepositrequest.depositAmount = challengeAmount;
                return bankAccountClient.verifyChallengeDeposit(verifychallengedepositrequest);
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = ChallengeDepositActivity.this;
                challengeAmount = moneyproto;
                super();
            }
        };
    }

    private AsyncCallback createVerifyActionCallback()
    {
        return new AsyncCallback() {

            final ChallengeDepositActivity this$0;

            private void onSuccess(com.google.wallet.proto.api.NanoWalletInstrument.VerifyChallengeDepositResponse verifychallengedepositresponse)
            {
                fullScreenProgressSpinnerManager.hide();
                isRequestInFlight = false;
                if (verifychallengedepositresponse.account != null)
                {
                    bankAccountsModelPublisher.generateEventForAccount(verifychallengedepositresponse.account);
                }
                processResult(verifychallengedepositresponse);
            }

            public final void onFailure(Exception exception)
            {
                fullScreenProgressSpinnerManager.hide();
                isRequestInFlight = false;
                processResult(null);
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((com.google.wallet.proto.api.NanoWalletInstrument.VerifyChallengeDepositResponse)obj);
            }

            
            {
                this$0 = ChallengeDepositActivity.this;
                super();
            }
        };
    }

    private void processResult(com.google.wallet.proto.api.NanoWalletInstrument.VerifyChallengeDepositResponse verifychallengedepositresponse)
    {
        if (verifychallengedepositresponse.callError != null)
        {
            analyticsUtil.sendError("VerifyBankAccount", new AnalyticsCustomDimension[0]);
            CallErrorDialogs.createBuilderWithGenericTitle(verifychallengedepositresponse.callError, com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).build().show(getSupportFragmentManager());
            return;
        }
        if (verifychallengedepositresponse.account == null || verifychallengedepositresponse.account.accountStatus == null || verifychallengedepositresponse.account.accountStatus.status == null)
        {
            analyticsUtil.sendError("VerifyBankAccount", new AnalyticsCustomDimension[0]);
            AlertDialogFragment.newBuilder().setMessage(getString(com.google.android.apps.walletnfcrel.R.string.challenge_deposit_error_dialog_text)).build().show(getSupportFragmentManager());
            return;
        }
        if (verifychallengedepositresponse.account.accountStatus.status.intValue() == 3)
        {
            analyticsUtil.sendError("VerifyBankAccount", new AnalyticsCustomDimension[0]);
            startActivity(createChallengeDepositDeclinedIntent());
            finish();
            return;
        } else
        {
            analyticsUtil.sendSuccess("VerifyBankAccount", new AnalyticsCustomDimension[0]);
            Toast.makeText(this, com.google.android.apps.walletnfcrel.R.string.challenge_deposit_success, 1).show();
            finish();
            return;
        }
    }

    private void verify()
    {
        if (isRequestInFlight)
        {
            return;
        } else
        {
            isRequestInFlight = true;
            fullScreenProgressSpinnerManager.show();
            analyticsUtil.sendButtonTap("VerifyBankAccount", new AnalyticsCustomDimension[0]);
            MonetaryValueInput monetaryvalueinput = (MonetaryValueInput)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ChallengeDepositInput);
            actionExecutor.executeAction(createVerifyAction(monetaryvalueinput.getMoneyValue()), createVerifyActionCallback());
            return;
        }
    }

    protected final void doOnCreate(Bundle bundle)
    {
        setContentView(com.google.android.apps.walletnfcrel.R.layout.challenge_deposit_activity);
        setTitle(com.google.android.apps.walletnfcrel.R.string.challenge_deposit_title);
        Views.setLink((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ChallengeDepositLink), getString(com.google.android.apps.walletnfcrel.R.string.challenge_deposit_missing_link, new Object[] {
            HelpUrls.createChallengeDepositHelpUrl()
        }));
        ((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ChallengeDepositMoneySymbol)).setText(CurrencyUtil.getCurrencySymbol());
        bundle = getIntent();
        if (!bundle.hasExtra("bank_account"))
        {
            throw new IllegalArgumentException("ChallengeDepositActivity.doOnCreate() missing extras");
        } else
        {
            bundle = (BankAccount)bundle.getParcelableExtra("bank_account");
            removeBankAccountHelper.initMenu(bundle);
            accountId = bundle.getSubId();
            ((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ChallengeDepositInput)).setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

                final ChallengeDepositActivity this$0;

                public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
                {
                    if (i == 6)
                    {
                        verify();
                        return true;
                    } else
                    {
                        return false;
                    }
                }

            
            {
                this$0 = ChallengeDepositActivity.this;
                super();
            }
            });
            return;
        }
    }

    protected final boolean isWidthLimited()
    {
        return true;
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(com.google.android.apps.walletnfcrel.R.menu.action_bar_button, menu);
        menu.findItem(com.google.android.apps.walletnfcrel.R.id.ActionBarButton).setTitle(com.google.android.apps.walletnfcrel.R.string.challenge_deposit_verify_button_label);
        RemoveBankAccountHelper removebankaccounthelper = removeBankAccountHelper;
        RemoveBankAccountHelper.createOptionsMenu(menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == com.google.android.apps.walletnfcrel.R.id.ActionBarButton)
        {
            verify();
        } else
        if (!removeBankAccountHelper.handleOptionsMenuItemSelection(this, menuitem) && !super.onOptionsItemSelected(menuitem))
        {
            return false;
        }
        return true;
    }

    protected void onPause()
    {
        actionExecutor.cancelAll();
        super.onPause();
    }

    protected final void onUpPressed()
    {
        finish();
    }




/*
    static boolean access$202(ChallengeDepositActivity challengedepositactivity, boolean flag)
    {
        challengedepositactivity.isRequestInFlight = flag;
        return flag;
    }

*/

}
