// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.giftcard;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.wobs.provider.WobUpdateEvent;

// Referenced classes of package com.google.android.apps.wallet.giftcard:
//            SimplifiedEditGiftCardActivity, SimplifiedEditGiftCardModel

final class this._cls0
    implements EventHandler
{

    final SimplifiedEditGiftCardActivity this$0;

    private void handleEvent(WobUpdateEvent wobupdateevent)
    {
        eventBus.unregisterAll(SimplifiedEditGiftCardActivity.this);
        if (!networkAccessChecker.check(true))
        {
            return;
        }
        if (wobupdateevent.hasError())
        {
            SimplifiedEditGiftCardActivity.access$000(SimplifiedEditGiftCardActivity.this);
            return;
        } else
        {
            SimplifiedEditGiftCardActivity.access$100(SimplifiedEditGiftCardActivity.this).setWobInstanceServerData(wobupdateevent.getWobInstance().verData);
            executeAction("getEditForm", SimplifiedEditGiftCardActivity.access$200(SimplifiedEditGiftCardActivity.this));
            return;
        }
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((WobUpdateEvent)obj);
    }

    ()
    {
        this$0 = SimplifiedEditGiftCardActivity.this;
        super();
    }
}
