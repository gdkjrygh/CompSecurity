// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.service;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import java.util.Calendar;

// Referenced classes of package com.skype.android.service:
//            ContactsAlarmReceiver

public class ContactsAlarmManager
{

    private static final int FIRST_TIME_DELAYED_RUN = 30000;

    public ContactsAlarmManager()
    {
    }

    public void cancelAlarm(Context context)
    {
        PendingIntent pendingintent = PendingIntent.getBroadcast(context, 0, new Intent(context, com/skype/android/service/ContactsAlarmManager), 0);
        ((AlarmManager)context.getSystemService("alarm")).cancel(pendingintent);
    }

    public void setAlarm(Context context)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.add(14, 30000);
        PendingIntent pendingintent = PendingIntent.getBroadcast(context, 0, new Intent(context, com/skype/android/service/ContactsAlarmReceiver), 0x10000000);
        ((AlarmManager)context.getSystemService("alarm")).setInexactRepeating(1, calendar.getTimeInMillis(), 0x5265c00L, pendingintent);
    }
}
