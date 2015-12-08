// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.LogAttributeName;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;

// Referenced classes of package com.skype.android.app.settings:
//            SnoozeNotificationHelper

final class val.snoozeSwitch
    implements android.app.istener
{

    final SnoozeNotificationHelper this$0;
    final TextView val$majorText;
    final Switch val$snoozeSwitch;

    public final void onTimeSet(TimePicker timepicker, int i, int j)
    {
        SnoozeNotificationHelper.access$200(SnoozeNotificationHelper.this, i, j);
        timepicker = SnoozeNotificationHelper.access$300(SnoozeNotificationHelper.this);
        val$majorText.setText(timepicker);
        val$majorText.setVisibility(0);
        val$snoozeSwitch.setChecked(true);
        timepicker = new SkypeTelemetryEvent(LogEvent.as);
        timepicker.put(LogAttributeName.af, SnoozeNotificationHelper.access$400(SnoozeNotificationHelper.this, userPreferences));
        analytics.a(timepicker);
    }

    ()
    {
        this$0 = final_snoozenotificationhelper;
        val$majorText = textview;
        val$snoozeSwitch = Switch.this;
        super();
    }
}
