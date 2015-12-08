// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import android.view.View;
import com.google.android.apps.wallet.bankaccount.api.BankAccount;
import com.google.android.apps.wallet.funding.widgets.VerifyBankAccountDialogFragment;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            ClaimMoneyIntroActivity

final class val.bankAccount
    implements android.view.mMoneyIntroActivity._cls4
{

    final ClaimMoneyIntroActivity this$0;
    final BankAccount val$bankAccount;

    public final void onClick(View view)
    {
        view = new VerifyBankAccountDialogFragment();
        view.setBankAccount(val$bankAccount);
        view.show(getSupportFragmentManager());
    }

    untDialogFragment()
    {
        this$0 = final_claimmoneyintroactivity;
        val$bankAccount = BankAccount.this;
        super();
    }
}
