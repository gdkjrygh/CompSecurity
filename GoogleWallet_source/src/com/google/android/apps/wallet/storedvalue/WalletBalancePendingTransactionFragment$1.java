// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.eventbus.HandlerRegistration;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            WalletBalancePendingTransactionFragment

final class this._cls0
    implements EventHandler
{

    final WalletBalancePendingTransactionFragment this$0;

    private void handleEvent(com.google.android.apps.wallet.kyc.api.t._cls1 _pcls1)
    {
        if (_pcls1.s() != null && _pcls1.s().intValue() == 1)
        {
            eventBus.unregister(new HandlerRegistration[] {
                WalletBalancePendingTransactionFragment.access$000(WalletBalancePendingTransactionFragment.this)
            });
            WalletBalancePendingTransactionFragment.access$100(WalletBalancePendingTransactionFragment.this);
        }
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((com.google.android.apps.wallet.kyc.api.t._cls1.handleEvent)obj);
    }

    ()
    {
        this$0 = WalletBalancePendingTransactionFragment.this;
        super();
    }
}
