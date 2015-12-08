// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.wallet.bankaccount.api.BankAccountApi;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;

// Referenced classes of package com.google.android.apps.wallet.bankaccount:
//            BankAccountTileForWalletBalanceScreen

final class this._cls0
    implements android.view.tTileForWalletBalanceScreen._cls1
{

    final BankAccountTileForWalletBalanceScreen this$0;

    public final void onClick(View view)
    {
        if (!networkAccessChecker.check())
        {
            return;
        } else
        {
            BankAccountTileForWalletBalanceScreen.access$100(BankAccountTileForWalletBalanceScreen.this).startActivity(BankAccountApi.createAddBankAccountActivityIntent(BankAccountTileForWalletBalanceScreen.access$000(BankAccountTileForWalletBalanceScreen.this)));
            return;
        }
    }

    ()
    {
        this$0 = BankAccountTileForWalletBalanceScreen.this;
        super();
    }
}
