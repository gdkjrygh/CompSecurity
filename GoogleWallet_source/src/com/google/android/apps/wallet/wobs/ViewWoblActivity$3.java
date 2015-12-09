// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.wobs.provider.WobDeletionEvent;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            ViewWoblActivity

final class this._cls0
    implements EventHandler
{

    final ViewWoblActivity this$0;

    private void handleEvent(WobDeletionEvent wobdeletionevent)
    {
        ViewWoblActivity.access$002(ViewWoblActivity.this, wobdeletionevent.getWobInstance());
        ViewWoblActivity.access$600(ViewWoblActivity.this, wobdeletionevent);
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((WobDeletionEvent)obj);
    }

    nEvent()
    {
        this$0 = ViewWoblActivity.this;
        super();
    }
}
