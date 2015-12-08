// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.wallet.bankaccount.api.BankAccount;
import com.google.android.apps.wallet.bankaccount.api.BankAccountApi;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;

// Referenced classes of package com.google.android.apps.wallet.bankaccount:
//            BankAccountTile

final class val.bankAccount
    implements android.view.er
{

    final BankAccountTile this$0;
    final BankAccount val$bankAccount;

    public final void onClick(View view)
    {
        if (!networkAccessChecker.check())
        {
            return;
        } else
        {
            BankAccountTile.access$300(BankAccountTile.this).startActivity(BankAccountApi.createVerifyBankAccountActivityIntent(BankAccountTile.access$200(BankAccountTile.this), val$bankAccount));
            return;
        }
    }

    ()
    {
        this$0 = final_bankaccounttile;
        val$bankAccount = BankAccount.this;
        super();
    }
}
