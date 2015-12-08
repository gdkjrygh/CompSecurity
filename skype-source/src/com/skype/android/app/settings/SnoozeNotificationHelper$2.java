// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

// Referenced classes of package com.skype.android.app.settings:
//            SnoozeNotificationHelper

final class val.majorText
    implements android.view.ificationHelper._cls2
{

    final SnoozeNotificationHelper this$0;
    final TextView val$majorText;
    final Switch val$snoozeSwitch;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        boolean flag = true;
        switch (motionevent.getAction())
        {
        default:
            flag = false;
            // fall through

        case 0: // '\0'
            return flag;

        case 1: // '\001'
            SnoozeNotificationHelper.access$100(SnoozeNotificationHelper.this, val$snoozeSwitch, val$majorText);
            break;
        }
        return true;
    }

    ()
    {
        this$0 = final_snoozenotificationhelper;
        val$snoozeSwitch = switch1;
        val$majorText = TextView.this;
        super();
    }
}
