// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.shortcircuit;

import com.skype.android.event.EventBus;
import com.skype.android.sync.ContactsIngestManager;

// Referenced classes of package com.skype.android.app.shortcircuit:
//            AutoBuddyManager, OnAutoBuddyPreferenceResult

final class this._cls0
    implements Runnable
{

    final AutoBuddyManager this$0;

    public final void run()
    {
        AutoBuddyPreferenceResult autobuddypreferenceresult = AutoBuddyManager.access$300(AutoBuddyManager.this);
        AutoBuddyManager.access$400(AutoBuddyManager.this, autobuddypreferenceresult);
        AutoBuddyManager.access$100(AutoBuddyManager.this).a(new OnAutoBuddyPreferenceResult(autobuddypreferenceresult));
        AutoBuddyManager.access$200(AutoBuddyManager.this).runNow();
    }

    ceResult()
    {
        this$0 = AutoBuddyManager.this;
        super();
    }
}
