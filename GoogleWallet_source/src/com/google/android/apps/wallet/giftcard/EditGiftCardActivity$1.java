// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.giftcard;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.android.apps.wallet.wobs.provider.WobUpdateEvent;

// Referenced classes of package com.google.android.apps.wallet.giftcard:
//            EditGiftCardActivity

final class this._cls0
    implements EventHandler
{

    final EditGiftCardActivity this$0;

    private void handleEvent(WobUpdateEvent wobupdateevent)
    {
        eventBus.unregisterAll(EditGiftCardActivity.this);
        if (!networkAccessChecker.check(true))
        {
            spinnerManager.hide();
            return;
        }
        if (wobupdateevent.hasError())
        {
            EditGiftCardActivity.access$000(EditGiftCardActivity.this);
            return;
        } else
        {
            EditGiftCardActivity.access$102(EditGiftCardActivity.this, wobupdateevent.getWobInstance().serverData);
            executeAction("getEditForm", EditGiftCardActivity.access$200(EditGiftCardActivity.this));
            return;
        }
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((WobUpdateEvent)obj);
    }

    enProgressSpinnerManager()
    {
        this$0 = EditGiftCardActivity.this;
        super();
    }
}
