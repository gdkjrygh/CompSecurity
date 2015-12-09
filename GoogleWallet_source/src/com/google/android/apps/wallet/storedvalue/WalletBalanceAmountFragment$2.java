// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.storedvalue.api.StoredValueEvent;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            WalletBalanceAmountFragment

final class this._cls0
    implements EventHandler
{

    final WalletBalanceAmountFragment this$0;

    private void handleEvent(StoredValueEvent storedvalueevent)
    {
        WalletBalanceAmountFragment.access$200(WalletBalanceAmountFragment.this, storedvalueevent);
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((StoredValueEvent)obj);
    }

    ()
    {
        this$0 = WalletBalanceAmountFragment.this;
        super();
    }
}
