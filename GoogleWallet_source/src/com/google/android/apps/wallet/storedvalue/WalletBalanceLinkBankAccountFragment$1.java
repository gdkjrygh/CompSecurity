// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.eventbus.HandlerRegistration;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            WalletBalanceLinkBankAccountFragment

final class this._cls0
    implements EventHandler
{

    final WalletBalanceLinkBankAccountFragment this$0;

    private void handleEvent(com.google.android.apps.wallet.kyc.api.t._cls1 _pcls1)
    {
        if (_pcls1.atus() != null && _pcls1.atus().intValue() == 1)
        {
            eventBus.unregister(new HandlerRegistration[] {
                WalletBalanceLinkBankAccountFragment.access$000(WalletBalanceLinkBankAccountFragment.this)
            });
            WalletBalanceLinkBankAccountFragment.access$100(WalletBalanceLinkBankAccountFragment.this);
        }
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((com.google.android.apps.wallet.kyc.api.t._cls1.handleEvent)obj);
    }

    ()
    {
        this$0 = WalletBalanceLinkBankAccountFragment.this;
        super();
    }
}
