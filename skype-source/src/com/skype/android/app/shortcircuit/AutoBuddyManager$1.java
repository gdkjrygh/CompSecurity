// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.shortcircuit;

import com.skype.android.event.EventBus;
import com.skype.android.sync.ContactsIngestManager;

// Referenced classes of package com.skype.android.app.shortcircuit:
//            AutoBuddyManager, OnAutoBuddyPreferenceResult

final class val.enable
    implements Runnable
{

    final AutoBuddyManager this$0;
    final boolean val$enable;

    public final void run()
    {
        AutoBuddyPreferenceResult autobuddypreferenceresult = AutoBuddyManager.access$000(AutoBuddyManager.this, val$enable);
        AutoBuddyManager.access$100(AutoBuddyManager.this).a(new OnAutoBuddyPreferenceResult(autobuddypreferenceresult));
        AutoBuddyManager.access$200(AutoBuddyManager.this).runNow();
    }

    ceResult()
    {
        this$0 = final_autobuddymanager;
        val$enable = Z.this;
        super();
    }
}
