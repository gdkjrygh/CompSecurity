// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.funding.api;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.wallet.bankaccount.api.BankAccount;
import com.google.android.apps.wallet.bankaccount.api.BankAccountApi;

public final class BankAccountItemHelper
{
    public static final class AccountItem
    {

        private final Intent intentWhenClicked;
        private final String mainText;
        private final String subText;

        public final Intent getIntentWhenClicked()
        {
            return intentWhenClicked;
        }

        public final String getMainText()
        {
            return mainText;
        }

        public final String getSubText()
        {
            return subText;
        }

        public AccountItem(String s, String s1, Intent intent)
        {
            mainText = s;
            subText = s1;
            intentWhenClicked = intent;
        }
    }


    public static AccountItem createAccountItem(BankAccount bankaccount, Context context)
    {
        Intent intent;
        int i;
        if (bankaccount == null)
        {
            return new AccountItem(context.getString(com.google.android.apps.walletnfcrel.R.string.settings_view_link_bank_account), null, BankAccountApi.createAddBankAccountActivityIntent(context));
        }
        i = 0;
        intent = BankAccountApi.createBankAccountDetailsActivityIntent(context, bankaccount);
        static final class _cls1
        {

            static final int $SwitchMap$com$google$android$apps$wallet$bankaccount$api$BankAccount$Status[];

            static 
            {
                $SwitchMap$com$google$android$apps$wallet$bankaccount$api$BankAccount$Status = new int[com.google.android.apps.wallet.bankaccount.api.BankAccount.Status.values().length];
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$bankaccount$api$BankAccount$Status[com.google.android.apps.wallet.bankaccount.api.BankAccount.Status.READY_TO_VERIFY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$bankaccount$api$BankAccount$Status[com.google.android.apps.wallet.bankaccount.api.BankAccount.Status.AWAITING_CHALLENGE_DEPOSIT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$bankaccount$api$BankAccount$Status[com.google.android.apps.wallet.bankaccount.api.BankAccount.Status.AWAITING_CHALLENGE_DEPOSIT_VERIFICATION.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$bankaccount$api$BankAccount$Status[com.google.android.apps.wallet.bankaccount.api.BankAccount.Status.YODLEE_CHALLENGE_IN_PROGRESS.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$bankaccount$api$BankAccount$Status[com.google.android.apps.wallet.bankaccount.api.BankAccount.Status.AWAITING_YODLEE_VERIFICATION.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$bankaccount$api$BankAccount$Status[com.google.android.apps.wallet.bankaccount.api.BankAccount.Status.YODLEE_FAILED.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$bankaccount$api$BankAccount$Status[com.google.android.apps.wallet.bankaccount.api.BankAccount.Status.DECLINED.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.google.android.apps.wallet.bankaccount.api.BankAccount.Status[bankaccount.getStatus().ordinal()];
        JVM INSTR tableswitch 1 7: default 88
    //                   1 153
    //                   2 167
    //                   3 175
    //                   4 189
    //                   5 203
    //                   6 211
    //                   7 219;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        String s = bankaccount.getNickname(context);
        bankaccount = s;
        int j = i;
        if (TextUtils.isEmpty(s))
        {
            bankaccount = s;
            j = i;
            if (i != 0)
            {
                bankaccount = context.getString(i);
                j = 0;
            }
        }
        s = null;
        if (j != 0)
        {
            s = context.getString(j);
        }
        return new AccountItem(bankaccount, s, intent);
_L2:
        i = com.google.android.apps.walletnfcrel.R.string.settings_view_bank_account_unverified;
        intent = BankAccountApi.createVerifyBankAccountActivityIntent(context, bankaccount);
        continue; /* Loop/switch isn't completed */
_L3:
        i = com.google.android.apps.walletnfcrel.R.string.settings_view_bank_account_waiting_for_deposit;
        continue; /* Loop/switch isn't completed */
_L4:
        i = com.google.android.apps.walletnfcrel.R.string.settings_view_bank_account_verify;
        intent = BankAccountApi.createChallengeDepositActivityIntent(context, bankaccount);
        continue; /* Loop/switch isn't completed */
_L5:
        i = com.google.android.apps.walletnfcrel.R.string.settings_view_bank_account_unverified;
        intent = BankAccountApi.createVerifyWithIavActivityIntent(context, bankaccount);
        continue; /* Loop/switch isn't completed */
_L6:
        i = com.google.android.apps.walletnfcrel.R.string.settings_view_bank_account_waiting;
        continue; /* Loop/switch isn't completed */
_L7:
        i = com.google.android.apps.walletnfcrel.R.string.settings_view_bank_account_yodlee_failed;
        continue; /* Loop/switch isn't completed */
_L8:
        i = com.google.android.apps.walletnfcrel.R.string.settings_view_bank_account_declined;
        if (true) goto _L1; else goto _L9
_L9:
    }
}
