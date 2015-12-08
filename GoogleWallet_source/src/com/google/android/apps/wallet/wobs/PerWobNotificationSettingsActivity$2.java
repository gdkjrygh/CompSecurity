// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.wobs.provider.WobUpdateEvent;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            PerWobNotificationSettingsActivity

final class this._cls0
    implements EventHandler
{

    final PerWobNotificationSettingsActivity this$0;

    private void handleEvent(WobUpdateEvent wobupdateevent)
    {
        if (wobupdateevent.hasError())
        {
            PerWobNotificationSettingsActivity.access$200(PerWobNotificationSettingsActivity.this);
            return;
        } else
        {
            PerWobNotificationSettingsActivity.access$300(PerWobNotificationSettingsActivity.this, wobupdateevent.getWobInstance());
            return;
        }
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((WobUpdateEvent)obj);
    }

    ()
    {
        this$0 = PerWobNotificationSettingsActivity.this;
        super();
    }
}
