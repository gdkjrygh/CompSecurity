// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import com.google.android.apps.wallet.bankaccount.api.BankAccountsModelEvent;
import com.google.android.apps.wallet.eventbus.EventHandler;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            WalletBalanceLinkBankAccountFragment

final class this._cls0
    implements EventHandler
{

    final WalletBalanceLinkBankAccountFragment this$0;

    private void handleEvent(BankAccountsModelEvent bankaccountsmodelevent)
    {
        onBankAccountEvent(bankaccountsmodelevent);
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((BankAccountsModelEvent)obj);
    }

    ()
    {
        this$0 = WalletBalanceLinkBankAccountFragment.this;
        super();
    }
}
