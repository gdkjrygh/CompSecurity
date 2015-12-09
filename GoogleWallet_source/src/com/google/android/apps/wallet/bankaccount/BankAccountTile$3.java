// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount;


// Referenced classes of package com.google.android.apps.wallet.bankaccount:
//            BankAccountTile

static final class atus
{

    static final int $SwitchMap$com$google$android$apps$wallet$bankaccount$api$BankAccount$Status[];

    static 
    {
        $SwitchMap$com$google$android$apps$wallet$bankaccount$api$BankAccount$Status = new int[com.google.android.apps.wallet.bankaccount.api..values().length];
        try
        {
            $SwitchMap$com$google$android$apps$wallet$bankaccount$api$BankAccount$Status[com.google.android.apps.wallet.bankaccount.api..AWAITING_CHALLENGE_DEPOSIT_VERIFICATION.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$bankaccount$api$BankAccount$Status[com.google.android.apps.wallet.bankaccount.api..YODLEE_FAILED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
