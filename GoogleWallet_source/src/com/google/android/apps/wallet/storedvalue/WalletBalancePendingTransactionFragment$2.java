// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import com.google.android.apps.wallet.eventbus.EventHandler;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            WalletBalancePendingTransactionFragment, WalletBalancePendingTransactionEvent

final class this._cls0
    implements EventHandler
{

    final WalletBalancePendingTransactionFragment this$0;

    private void handleEvent(WalletBalancePendingTransactionEvent walletbalancependingtransactionevent)
    {
        WalletBalancePendingTransactionFragment.access$200(WalletBalancePendingTransactionFragment.this, walletbalancependingtransactionevent);
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((WalletBalancePendingTransactionEvent)obj);
    }

    ()
    {
        this$0 = WalletBalancePendingTransactionFragment.this;
        super();
    }
}
