// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.android.apps.wallet.wobs.provider.WobUpdateEvent;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            ViewWoblActivity

final class this._cls0
    implements EventHandler
{

    final ViewWoblActivity this$0;

    private void handleEvent(WobUpdateEvent wobupdateevent)
    {
        if (wobupdateevent.hasError())
        {
            userEventLogger.log(43, 234);
            ViewWoblActivity.access$100(ViewWoblActivity.this);
            return;
        } else
        {
            ViewWoblActivity.access$002(ViewWoblActivity.this, wobupdateevent.getWobInstance());
            fullScreenProgressSpinnerManager.hide();
            supportInvalidateOptionsMenu();
            WLog.dfmt(ViewWoblActivity.access$200(), "Got wob instance with id %s", new Object[] {
                ViewWoblActivity.access$000(ViewWoblActivity.this).id
            });
            ViewWoblActivity.access$302(ViewWoblActivity.this, ViewWoblActivity.access$000(ViewWoblActivity.this).renderOutput);
            ViewWoblActivity.access$400(ViewWoblActivity.this);
            ViewWoblActivity.access$500(ViewWoblActivity.this);
            return;
        }
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((WobUpdateEvent)obj);
    }

    vent()
    {
        this$0 = ViewWoblActivity.this;
        super();
    }
}
