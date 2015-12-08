// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.android.apps.wallet.wobs.provider.WobUpdateEvent;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            EditLoyaltyCardActivity

final class this._cls0
    implements EventHandler
{

    final EditLoyaltyCardActivity this$0;

    private void handleEvent(WobUpdateEvent wobupdateevent)
    {
        eventBus.unregisterAll(EditLoyaltyCardActivity.this);
        if (!networkAccessChecker.check(true))
        {
            spinnerManager.hide();
            return;
        }
        if (wobupdateevent.hasError())
        {
            WLog.e(EditLoyaltyCardActivity.access$000(), "Error during WobUpdateEvent");
            EditLoyaltyCardActivity.access$100(EditLoyaltyCardActivity.this);
            return;
        } else
        {
            EditLoyaltyCardActivity.access$202(EditLoyaltyCardActivity.this, wobupdateevent.getWobInstance().serverData);
            executeAction("getEditForm", EditLoyaltyCardActivity.access$300(EditLoyaltyCardActivity.this));
            return;
        }
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((WobUpdateEvent)obj);
    }

    ProgressSpinnerManager()
    {
        this$0 = EditLoyaltyCardActivity.this;
        super();
    }
}
