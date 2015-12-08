// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.eventbus.HandlerRegistration;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            WalletBalanceAmountFragment

final class this._cls0
    implements EventHandler
{

    final WalletBalanceAmountFragment this$0;

    private void handleEvent(com.google.android.apps.wallet.kyc.api.ent ent)
    {
        if (ent.getStatus() != null && ent.getStatus().intValue() == 1)
        {
            eventBus.unregister(new HandlerRegistration[] {
                WalletBalanceAmountFragment.access$000(WalletBalanceAmountFragment.this)
            });
            WalletBalanceAmountFragment.access$100(WalletBalanceAmountFragment.this);
        }
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((com.google.android.apps.wallet.kyc.api.ent)obj);
    }

    ()
    {
        this$0 = WalletBalanceAmountFragment.this;
        super();
    }
}
