// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.bankaccount.api.BankAccount;
import com.google.android.apps.wallet.bankaccount.api.BankAccountApi;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModel;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModelEvent;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.util.view.Views;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

// Referenced classes of package com.google.android.apps.wallet.bankaccount:
//            RemoveBankAccountActivity, RemoveBankAccountHelper

public class BankAccountDetailsActivity extends RemoveBankAccountActivity
{

    private BankAccount bankAccount;
    EventBus eventBus;
    UriRegistry uriRegistry;

    public BankAccountDetailsActivity()
    {
    }

    public BankAccountDetailsActivity(int i)
    {
        super(i);
    }

    private static String getStateDetailsFor(Context context, BankAccount bankaccount)
    {
        static final class _cls3
        {

            static final int $SwitchMap$com$google$android$apps$wallet$bankaccount$api$BankAccount$Status[];

            static 
            {
                $SwitchMap$com$google$android$apps$wallet$bankaccount$api$BankAccount$Status = new int[com.google.android.apps.wallet.bankaccount.api.BankAccount.Status.values().length];
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$bankaccount$api$BankAccount$Status[com.google.android.apps.wallet.bankaccount.api.BankAccount.Status.READY_TO_VERIFY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$bankaccount$api$BankAccount$Status[com.google.android.apps.wallet.bankaccount.api.BankAccount.Status.YODLEE_FAILED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$bankaccount$api$BankAccount$Status[com.google.android.apps.wallet.bankaccount.api.BankAccount.Status.AWAITING_CHALLENGE_DEPOSIT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$bankaccount$api$BankAccount$Status[com.google.android.apps.wallet.bankaccount.api.BankAccount.Status.AWAITING_CHALLENGE_DEPOSIT_VERIFICATION.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$bankaccount$api$BankAccount$Status[com.google.android.apps.wallet.bankaccount.api.BankAccount.Status.YODLEE_CHALLENGE_IN_PROGRESS.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$bankaccount$api$BankAccount$Status[com.google.android.apps.wallet.bankaccount.api.BankAccount.Status.AWAITING_YODLEE_VERIFICATION.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$bankaccount$api$BankAccount$Status[com.google.android.apps.wallet.bankaccount.api.BankAccount.Status.VALID.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$bankaccount$api$BankAccount$Status[com.google.android.apps.wallet.bankaccount.api.BankAccount.Status.DECLINED.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls3..SwitchMap.com.google.android.apps.wallet.bankaccount.api.BankAccount.Status[bankaccount.getStatus().ordinal()];
        JVM INSTR tableswitch 2 6: default 44
    //                   2 63
    //                   3 46
    //                   4 44
    //                   5 44
    //                   6 56;
           goto _L1 _L2 _L3 _L1 _L1 _L4
_L1:
        return null;
_L3:
        int i = com.google.android.apps.walletnfcrel.R.string.bank_account_details_description_verifying;
_L6:
        return context.getString(i);
_L4:
        i = com.google.android.apps.walletnfcrel.R.string.bank_account_details_description_verifying_with_iav;
        continue; /* Loop/switch isn't completed */
_L2:
        i = com.google.android.apps.walletnfcrel.R.string.bank_account_details_description_iav_failed;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static String getStateTextFor(Context context, BankAccount bankaccount)
    {
        _cls3..SwitchMap.com.google.android.apps.wallet.bankaccount.api.BankAccount.Status[bankaccount.getStatus().ordinal()];
        JVM INSTR tableswitch 1 8: default 56
    //                   1 66
    //                   2 66
    //                   3 73
    //                   4 73
    //                   5 73
    //                   6 73
    //                   7 80
    //                   8 87;
           goto _L1 _L2 _L2 _L3 _L3 _L3 _L3 _L4 _L5
_L1:
        int i = com.google.android.apps.walletnfcrel.R.string.bank_account_state_unknown;
_L7:
        return context.getString(i);
_L2:
        i = com.google.android.apps.walletnfcrel.R.string.bank_account_state_unverified;
        continue; /* Loop/switch isn't completed */
_L3:
        i = com.google.android.apps.walletnfcrel.R.string.bank_account_state_verifying;
        continue; /* Loop/switch isn't completed */
_L4:
        i = com.google.android.apps.walletnfcrel.R.string.bank_account_state_verified;
        continue; /* Loop/switch isn't completed */
_L5:
        i = com.google.android.apps.walletnfcrel.R.string.bank_account_state_declined;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void updateView()
    {
        Object obj = Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.AccountStateDetailSection);
        TextView textview = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.AccountStateDetailText);
        TextView textview1 = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.AccountAlert);
        String s = getStateDetailsFor(this, bankAccount);
        ((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.AccountName)).setText(bankAccount.getNickname(this));
        if (s != null)
        {
            ((View) (obj)).setVisibility(0);
            if (bankAccount.getStatus() == com.google.android.apps.wallet.bankaccount.api.BankAccount.Status.YODLEE_FAILED)
            {
                textview1.setText(s);
                textview1.setVisibility(0);
                textview.setVisibility(8);
            } else
            {
                textview.setText(s);
                textview.setVisibility(0);
                textview1.setVisibility(8);
            }
        } else
        {
            ((View) (obj)).setVisibility(8);
        }
        ((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.AccountState)).setText(getStateTextFor(this, bankAccount));
        obj = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ActionButton);
        if (bankAccount.getStatus() == com.google.android.apps.wallet.bankaccount.api.BankAccount.Status.AWAITING_YODLEE_VERIFICATION)
        {
            ((TextView) (obj)).setVisibility(0);
            ((TextView) (obj)).setText(com.google.android.apps.walletnfcrel.R.string.bank_account_details_view_iav_progress_button);
            ((TextView) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

                final BankAccountDetailsActivity this$0;

                public final void onClick(View view)
                {
                    startActivity(BankAccountApi.createVerifyWithIavActivityIntent(BankAccountDetailsActivity.this, bankAccount));
                }

            
            {
                this$0 = BankAccountDetailsActivity.this;
                super();
            }
            });
        }
        if (bankAccount.getStatus() == com.google.android.apps.wallet.bankaccount.api.BankAccount.Status.YODLEE_FAILED)
        {
            ((TextView) (obj)).setVisibility(0);
            ((TextView) (obj)).setText(com.google.android.apps.walletnfcrel.R.string.bank_account_details_view_iav_failure_button);
            ((TextView) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

                final BankAccountDetailsActivity this$0;

                public final void onClick(View view)
                {
                    startActivity(BankAccountApi.createVerifyBankAccountActivityIntent(BankAccountDetailsActivity.this, bankAccount));
                }

            
            {
                this$0 = BankAccountDetailsActivity.this;
                super();
            }
            });
        }
    }

    protected final void doOnCreate(Bundle bundle)
    {
        setContentView(com.google.android.apps.walletnfcrel.R.layout.bank_account_details_activity);
        setTitle(com.google.android.apps.walletnfcrel.R.string.bank_account_details_title);
        bundle = getIntent();
        if (!bundle.hasExtra("bank_account"))
        {
            throw new IllegalArgumentException("BankAccountDetailsActivity.doOnCreate() missing extras");
        } else
        {
            bankAccount = (BankAccount)bundle.getParcelableExtra("bank_account");
            removeBankAccountHelper.initMenu(bankAccount);
            updateView();
            return;
        }
    }

    protected final void doOnResume()
    {
        eventBus.register(this, com/google/android/apps/wallet/bankaccount/BankAccountDetailsActivity);
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

    public void onNewBankAccountsModelEvent(BankAccountsModelEvent bankaccountsmodelevent)
    {
        if (!bankaccountsmodelevent.isFeatureEnabled())
        {
            onUpPressed();
        } else
        {
            bankaccountsmodelevent = bankaccountsmodelevent.getModel();
            if (bankaccountsmodelevent != null && bankaccountsmodelevent.getBankAccounts() != null)
            {
                bankaccountsmodelevent = bankaccountsmodelevent.getBankAccounts().iterator();
                while (bankaccountsmodelevent.hasNext()) 
                {
                    BankAccount bankaccount = (BankAccount)bankaccountsmodelevent.next();
                    if (bankAccount == null || bankAccount.getSubId().equals(bankaccount.getSubId()))
                    {
                        bankAccount = bankaccount;
                        removeBankAccountHelper.updateAccount(bankAccount);
                        updateView();
                    }
                }
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        return removeBankAccountHelper.handleOptionsMenuItemSelection(this, menuitem) || super.onOptionsItemSelected(menuitem);
    }

    protected void onPause()
    {
        eventBus.unregisterAll(this);
        super.onPause();
    }

    protected final void onUpPressed()
    {
        navigateUpWithIntent(uriRegistry.createIntent(9000, new Object[0]));
    }

}
