// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import android.view.View;
import com.google.android.apps.wallet.transfer.api.TransferApi;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            WalletBalanceAmountFragment

final class val.amountOwed
    implements android.view.WalletBalanceAmountFragment._cls6
{

    final WalletBalanceAmountFragment this$0;
    final com.google.wallet.proto.ceAmountFragment val$amountOwed;

    public final void onClick(View view)
    {
        view = TransferApi.createConfirmMoneyTransferIntent(getActivity(), 3, val$amountOwed.micros.longValue(), val$amountOwed.currencyCode, null, null);
        startActivity(view);
    }

    ()
    {
        this$0 = final_walletbalanceamountfragment;
        val$amountOwed = com.google.wallet.proto.ceAmountFragment._cls6.val.amountOwed.this;
        super();
    }
}
