// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.common;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Calendar;

// Referenced classes of package com.hmobile.common:
//            MyDailyQuoteReceiver

public class BootReceiver extends BroadcastReceiver
{

    public BootReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        intent = PreferenceManager.getDefaultSharedPreferences(context);
        int i = intent.getInt("notification_hour", 8);
        int j = intent.getInt("notification_min", 0);
        Object obj = Calendar.getInstance();
        ((Calendar) (obj)).set(11, i);
        ((Calendar) (obj)).set(12, j);
        intent = Calendar.getInstance();
        if (((Calendar) (obj)).before(intent))
        {
            ((Calendar) (obj)).add(5, 1);
        }
        long l = ((Calendar) (obj)).getTimeInMillis();
        long l1 = intent.getTimeInMillis();
        obj = PendingIntent.getBroadcast(context, 0, new Intent(context, com/hmobile/common/MyDailyQuoteReceiver), 0x10000000);
        context = (AlarmManager)context.getSystemService("alarm");
        context.cancel(((PendingIntent) (obj)));
        context.setInexactRepeating(0, intent.getTimeInMillis() + Long.valueOf(l - l1).longValue(), 0x5265c00L, ((PendingIntent) (obj)));
    }
}
