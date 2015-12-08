// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount.api;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.wallet.api.InternalIntents;

// Referenced classes of package com.google.android.apps.wallet.bankaccount.api:
//            BankAccount

public final class BankAccountApi
{

    public static Intent createAddBankAccountActivityIntent(Context context)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.bankaccount.AddBankAccountActivity");
    }

    public static Intent createAddBankAccountActivityWithUseIntent(Context context, int i)
    {
        return createAddBankAccountActivityIntent(context).putExtra("instrument_use", i);
    }

    public static Intent createBankAccountDetailsActivityIntent(Context context, BankAccount bankaccount)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.bankaccount.BankAccountDetailsActivity").putExtra("bank_account", bankaccount);
    }

    public static Intent createChallengeDepositActivityIntent(Context context, BankAccount bankaccount)
    {
        return createChallengeDepositActivityIntent(context, bankaccount, "com.google.android.apps.wallet.bankaccount.ChallengeDepositActivity");
    }

    private static Intent createChallengeDepositActivityIntent(Context context, BankAccount bankaccount, String s)
    {
        return InternalIntents.forClass(context, s).putExtra("bank_account", bankaccount);
    }

    public static Intent createVerifyBankAccountActivityIntent(Context context, BankAccount bankaccount)
    {
        return createVerifyBankAccountActivityIntent(context, bankaccount, "com.google.android.apps.wallet.bankaccount.VerifyBankAccountActivity");
    }

    private static Intent createVerifyBankAccountActivityIntent(Context context, BankAccount bankaccount, String s)
    {
        return InternalIntents.forClass(context, s).putExtra("bank_account", bankaccount);
    }

    public static Intent createVerifyWithDepositActivityIntent(Context context, BankAccount bankaccount)
    {
        return createVerifyWithDepositActivityIntent(context, bankaccount, "com.google.android.apps.wallet.bankaccount.VerifyWithDepositActivity");
    }

    private static Intent createVerifyWithDepositActivityIntent(Context context, BankAccount bankaccount, String s)
    {
        return InternalIntents.forClass(context, s).putExtra("bank_account", bankaccount);
    }

    public static Intent createVerifyWithIavActivityIntent(Context context, BankAccount bankaccount)
    {
        return createVerifyWithIavActivityIntent(context, bankaccount, "com.google.android.apps.wallet.bankaccount.VerifyWithIavActivity");
    }

    private static Intent createVerifyWithIavActivityIntent(Context context, BankAccount bankaccount, String s)
    {
        return InternalIntents.forClass(context, s).putExtra("account_id", bankaccount.getSubId());
    }
}
