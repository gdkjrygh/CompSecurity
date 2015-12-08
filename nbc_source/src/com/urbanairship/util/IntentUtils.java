// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.util;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

public class IntentUtils
{

    public IntentUtils()
    {
    }

    public static void scheduleIntent(Context context, Intent intent, int i, long l)
    {
        AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
        context = PendingIntent.getService(context, 0, intent, 0);
        alarmmanager.set(i, System.currentTimeMillis() + l, context);
    }

    public static void scheduleIntent(Context context, Intent intent, long l)
    {
        scheduleIntent(context, intent, 1, l);
    }
}
