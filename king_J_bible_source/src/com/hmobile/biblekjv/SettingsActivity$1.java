// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.widget.TimePicker;
import com.hmobile.common.MyDailyQuoteReceiver;
import java.util.Calendar;

// Referenced classes of package com.hmobile.biblekjv:
//            SettingsActivity

class this._cls0
    implements android.app.TimeSetListener
{

    final SettingsActivity this$0;

    public void onTimeSet(TimePicker timepicker, int i, int j)
    {
        editor.putInt("notification_hour", i);
        editor.putInt("notification_min", j);
        editor.putBoolean("is_notification", true);
        editor.commit();
        SettingsActivity.access$0(SettingsActivity.this, i, j);
        editor.putLong("notification_millis", 0L);
        editor.commit();
        Object obj = Calendar.getInstance();
        ((Calendar) (obj)).set(11, i);
        ((Calendar) (obj)).set(12, j);
        timepicker = Calendar.getInstance();
        long l = ((Calendar) (obj)).getTimeInMillis();
        long l1 = timepicker.getTimeInMillis();
        obj = new Intent(SettingsActivity.this, com/hmobile/common/MyDailyQuoteReceiver);
        obj = PendingIntent.getBroadcast(SettingsActivity.this, 0, ((Intent) (obj)), 0x10000000);
        AlarmManager alarmmanager = (AlarmManager)getSystemService("alarm");
        alarmmanager.cancel(((PendingIntent) (obj)));
        alarmmanager.setRepeating(0, timepicker.getTimeInMillis() + Long.valueOf(l - l1).longValue(), 0x5265c00L, ((PendingIntent) (obj)));
    }

    ()
    {
        this$0 = SettingsActivity.this;
        super();
    }
}
