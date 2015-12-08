// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;

// Referenced classes of package com.skype.android.app.settings:
//            SnoozeNotificationHelper

final class val.bannerView
    implements android.view.ificationHelper._cls5
{

    final SnoozeNotificationHelper this$0;
    final TextView val$bannerView;

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
            SnoozeNotificationHelper.access$000(SnoozeNotificationHelper.this);
            break;
        }
        val$bannerView.setVisibility(8);
        view = new SkypeTelemetryEvent(LogEvent.at);
        analytics.a(view);
        return true;
    }

    ()
    {
        this$0 = final_snoozenotificationhelper;
        val$bannerView = TextView.this;
        super();
    }
}
