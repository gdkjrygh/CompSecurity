// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount;

import android.content.DialogInterface;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.bankaccount.api.BankAccount;
import com.google.android.apps.wallet.bankaccount.api.BankAccountClient;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModelPublisher;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import java.util.concurrent.Callable;

public class RemoveBankAccountHelper
{

    AnalyticsUtil analyticsUtil;
    BankAccount bankAccount;
    BankAccountClient bankAccountClient;
    BankAccountsModelPublisher bankAccountsModelPublisher;
    FullScreenProgressSpinnerManager fullScreenSpinnerManager;

    public RemoveBankAccountHelper()
    {
    }

    public static boolean createOptionsMenu(Menu menu)
    {
        menu.add(0, 38, 1, com.google.android.apps.walletnfcrel.R.string.remove_bank_account_item).setIcon(com.google.android.apps.walletnfcrel.R.drawable.optionsmenu_remove);
        return true;
    }

    private Callable createRemoveBankAccountAction(final String accountId)
    {
        return new Callable() {

            final RemoveBankAccountHelper this$0;
            final String val$accountId;

            private com.google.wallet.proto.api.NanoWalletInstrument.DeletePaymentInstrumentResponse call()
                throws Exception
            {
                com.google.wallet.proto.api.NanoWalletInstrument.DeletePaymentInstrumentRequest deletepaymentinstrumentrequest = new com.google.wallet.proto.api.NanoWalletInstrument.DeletePaymentInstrumentRequest();
                deletepaymentinstrumentrequest.instrumentSubId = accountId;
                return bankAccountClient.delete(deletepaymentinstrumentrequest);
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = RemoveBankAccountHelper.this;
                accountId = s;
                super();
            }
        };
    }

    private void showConfirmationDlg(FragmentActivity fragmentactivity)
    {
        AlertDialogFragment.newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.remove_bank_account_confirmation_dialog_title).setMessage(fragmentactivity.getString(com.google.android.apps.walletnfcrel.R.string.remove_bank_account_confirmation_dialog_message, new Object[] {
            bankAccount.getNickname(fragmentactivity)
        })).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_remove_bank_account).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.button_cancel).setCancelable(true).build().show(fragmentactivity.getSupportFragmentManager(), "CONFIRM_REMOVE_DIALOG");
    }

    public final boolean handleOptionsMenuItemSelection(FragmentActivity fragmentactivity, MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 38: // '&'
            showConfirmationDlg(fragmentactivity);
            break;
        }
        return true;
    }

    public final void initMenu(BankAccount bankaccount)
    {
        bankAccount = bankaccount;
    }

    public final boolean onRemoveAccountFailure(WalletActivity walletactivity, Exception exception)
    {
        fullScreenSpinnerManager.hide();
        analyticsUtil.sendError("RemoveBankAccount", new AnalyticsCustomDimension[0]);
        AlertDialogFragment.newBuilder().setMessage(walletactivity.getString(com.google.android.apps.walletnfcrel.R.string.remove_bank_account_error_please_try_again)).build().show(walletactivity.getSupportFragmentManager());
        return true;
    }

    public final void onRemoveAccountSuccess(final WalletActivity activity, Object obj)
    {
        obj = (com.google.wallet.proto.api.NanoWalletInstrument.DeletePaymentInstrumentResponse)obj;
        if (((com.google.wallet.proto.api.NanoWalletInstrument.DeletePaymentInstrumentResponse) (obj)).callError == null)
        {
            bankAccountsModelPublisher.generateRemoveBankAccountEvent(bankAccount.getBankAccountProto());
            analyticsUtil.sendSuccess("RemoveBankAccount", new AnalyticsCustomDimension[0]);
            Toasts.show(activity, activity.getString(com.google.android.apps.walletnfcrel.R.string.remove_bank_account_success));
            (new Handler()).postDelayed(new Runnable() {

                final RemoveBankAccountHelper this$0;
                final WalletActivity val$activity;

                public final void run()
                {
                    activity.finish();
                }

            
            {
                this$0 = RemoveBankAccountHelper.this;
                activity = walletactivity;
                super();
            }
            }, 2000L);
            return;
        } else
        {
            fullScreenSpinnerManager.hide();
            analyticsUtil.sendError("RemoveBankAccount", new AnalyticsCustomDimension[0]);
            obj = ((com.google.wallet.proto.api.NanoWalletInstrument.DeletePaymentInstrumentResponse) (obj)).callError;
            AlertDialogFragment.newBuilder().setTitle(((com.google.wallet.proto.NanoWalletError.CallError) (obj)).title).setMessage(((com.google.wallet.proto.NanoWalletError.CallError) (obj)).content).build().show(activity.getSupportFragmentManager());
            return;
        }
    }

    public final void removeAccount(WalletActivity walletactivity)
    {
        fullScreenSpinnerManager.show();
        walletactivity.executeAction("remove_bank_account", createRemoveBankAccountAction(bankAccount.getSubId()));
    }

    public final void setConfirmRemoveDialogOnClickListener(AlertDialogFragment alertdialogfragment, final WalletActivity currentActivity)
    {
        alertdialogfragment.setOnClickListener(new android.content.DialogInterface.OnClickListener() {

            final RemoveBankAccountHelper this$0;
            final WalletActivity val$currentActivity;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                if (i == -1)
                {
                    analyticsUtil.sendButtonTap("RemoveBankAccount", new AnalyticsCustomDimension[0]);
                    removeAccount(currentActivity);
                }
            }

            
            {
                this$0 = RemoveBankAccountHelper.this;
                currentActivity = walletactivity;
                super();
            }
        });
    }

    public final void updateAccount(BankAccount bankaccount)
    {
        bankAccount = bankaccount;
    }
}
