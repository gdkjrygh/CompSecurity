// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.content.DialogInterface;
import android.widget.Switch;

// Referenced classes of package com.skype.android.app.settings:
//            SnoozeNotificationHelper

final class val.snoozeSwitch
    implements android.content.tener
{

    final SnoozeNotificationHelper this$0;
    final Switch val$snoozeSwitch;

    public final void onCancel(DialogInterface dialoginterface)
    {
        dialoginterface.dismiss();
        if (!checkSnoozedStatus())
        {
            val$snoozeSwitch.setChecked(false);
        }
    }

    ()
    {
        this$0 = final_snoozenotificationhelper;
        val$snoozeSwitch = Switch.this;
        super();
    }
}
