// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import com.google.android.apps.wallet.config.featurecontrol.FeaturesChangedEvent;
import com.google.android.apps.wallet.eventbus.EventHandler;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            WalletBalanceAmountFragment

final class this._cls0
    implements EventHandler
{

    final WalletBalanceAmountFragment this$0;

    private void handleEvent(FeaturesChangedEvent featureschangedevent)
    {
        WalletBalanceAmountFragment.access$300(WalletBalanceAmountFragment.this, featureschangedevent);
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((FeaturesChangedEvent)obj);
    }

    ()
    {
        this$0 = WalletBalanceAmountFragment.this;
        super();
    }
}
