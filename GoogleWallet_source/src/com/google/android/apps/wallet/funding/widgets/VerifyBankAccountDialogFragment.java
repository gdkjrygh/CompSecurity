// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.funding.widgets;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.wallet.bankaccount.api.BankAccount;
import com.google.android.apps.wallet.bankaccount.api.BankAccountApi;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;

public class VerifyBankAccountDialogFragment extends AlertDialogFragment
{

    private BankAccount bankAccount;

    public VerifyBankAccountDialogFragment()
    {
        super(newBuilder());
    }

    protected final void configureAlertDialog(android.app.AlertDialog.Builder builder)
    {
        super.configureAlertDialog(builder);
        int i = bankAccount.getChallengeDepositStatus();
        if (i == 2)
        {
            builder.setMessage(getString(com.google.android.apps.walletnfcrel.R.string.verify_bank_account_dialog_enter_deposit_message, new Object[] {
                bankAccount.getNickname(getActivity())
            }));
            builder.setTitle(com.google.android.apps.walletnfcrel.R.string.verify_bank_account_dialog_enter_deposit_title).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.verify_bank_account_dialog_enter_deposit_button, new android.content.DialogInterface.OnClickListener() {

                final VerifyBankAccountDialogFragment this$0;

                public final void onClick(DialogInterface dialoginterface, int k)
                {
                    startActivity(BankAccountApi.createChallengeDepositActivityIntent(getActivity(), bankAccount));
                }

            
            {
                this$0 = VerifyBankAccountDialogFragment.this;
                super();
            }
            }).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.button_cancel, this);
            return;
        }
        if (i == 3)
        {
            builder.setMessage(getString(com.google.android.apps.walletnfcrel.R.string.verify_bank_account_dialog_wait_for_deposit_message, new Object[] {
                bankAccount.getNickname(getActivity())
            }));
            builder.setTitle(com.google.android.apps.walletnfcrel.R.string.verify_bank_account_dialog_wait_for_deposit_title).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_ok, this);
            return;
        }
        int j = bankAccount.getIavStatus();
        if (j == 3)
        {
            builder.setMessage(getString(com.google.android.apps.walletnfcrel.R.string.verify_bank_account_dialog_wait_for_iav_verification_message, new Object[] {
                bankAccount.getNickname(getActivity())
            }));
            builder.setTitle(com.google.android.apps.walletnfcrel.R.string.verify_bank_account_dialog_wait_for_iav_verification_title).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_ok, this);
            return;
        }
        if (i == 1 || j == 1 || j == 2 || j == 4)
        {
            builder.setMessage(getString(com.google.android.apps.walletnfcrel.R.string.verify_bank_account_dialog_choose_verification_method_message, new Object[] {
                bankAccount.getNickname(getActivity())
            }));
            builder.setTitle(com.google.android.apps.walletnfcrel.R.string.verify_bank_account_title).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.verify_bank_account_dialog_verify_account_button, new android.content.DialogInterface.OnClickListener() {

                final VerifyBankAccountDialogFragment this$0;

                public final void onClick(DialogInterface dialoginterface, int k)
                {
                    startActivity(BankAccountApi.createVerifyBankAccountActivityIntent(getActivity(), bankAccount));
                }

            
            {
                this$0 = VerifyBankAccountDialogFragment.this;
                super();
            }
            }).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.button_cancel, this);
            return;
        } else
        {
            builder.setMessage(getString(com.google.android.apps.walletnfcrel.R.string.verify_bank_account_dialog_verification_failed_message, new Object[] {
                bankAccount.getNickname(getActivity())
            }));
            builder.setTitle(com.google.android.apps.walletnfcrel.R.string.verify_bank_account_dialog_verification_failed_title).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.verify_bank_account_dialog_settings_button, new android.content.DialogInterface.OnClickListener() {

                final VerifyBankAccountDialogFragment this$0;

                public final void onClick(DialogInterface dialoginterface, int k)
                {
                    startActivity(BankAccountApi.createBankAccountDetailsActivityIntent(getActivity(), bankAccount));
                }

            
            {
                this$0 = VerifyBankAccountDialogFragment.this;
                super();
            }
            }).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.button_cancel, this);
            return;
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null && bundle.containsKey("bankaccount"))
        {
            bankAccount = (BankAccount)bundle.getParcelable("bankaccount");
        }
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("bankaccount", bankAccount);
    }

    public final void setBankAccount(BankAccount bankaccount)
    {
        bankAccount = bankaccount;
    }

}
