// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.now.card;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.accuweather.android.utilities.Logger;
import java.util.Calendar;

// Referenced classes of package com.accuweather.android.now.card:
//            NowUtil

public class NowCardScheduler
{

    public static final int EVENING_END_HOUR = 19;
    public static final int EVENING_END_MINUTE = 0;
    public static final int EVENING_START_HOUR = 16;
    public static final int MORNING_END_HOUR = 10;
    public static final int MORNING_END_MINUTE = 0;
    public static final int MORNING_START_HOUR = 6;
    private static String TAG = "NowCardScheduler";
    private PendingIntent alarmEveningIntent;
    private PendingIntent alarmIntent;
    private AlarmManager alarmMgr;
    private PendingIntent cancelEveningPI;
    private PendingIntent cancelIntent;

    public NowCardScheduler()
    {
    }

    private int getNextHalfHour(int i, int j)
    {
        if (i >= 30)
        {
            return j + 0;
        } else
        {
            return j + 30;
        }
    }

    public void scheduleEveningCard(Context context, boolean flag)
        throws Exception
    {
        Calendar calendar;
        Object obj;
        int i;
        int j;
        int k;
        long l;
        long l1;
        long l2;
        try
        {
            alarmMgr = (AlarmManager)context.getSystemService("alarm");
            NowUtil.writeToFile(TAG, "Scheduling evening card", false);
            alarmEveningIntent = PendingIntent.getBroadcast(context, 0, new Intent("com.accuweather.android.UPDATE_ACCUWEATHER_EVENING_NOW_CARDS"), 0);
            obj = Calendar.getInstance();
            i = ((Calendar) (obj)).get(11);
            k = ((Calendar) (obj)).get(12);
            l = ((Calendar) (obj)).getTimeInMillis();
            ((Calendar) (obj)).setTimeInMillis(System.currentTimeMillis());
            ((Calendar) (obj)).set(11, 16);
            j = NowUtil.randInt(0, 5);
            ((Calendar) (obj)).set(12, j);
            ((Calendar) (obj)).set(13, NowUtil.randInt(0, 59));
            l1 = ((Calendar) (obj)).getTimeInMillis();
            calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(11, 19);
            calendar.set(12, 0);
            l2 = calendar.getTimeInMillis();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            NowUtil.writeToFile(TAG, "Error scheduling Now evening alarm", false);
            Logger.e(TAG, (new StringBuilder()).append("Error scheduling Now evening alarm: ").append(context.getMessage()).toString());
            throw context;
        }
        if (l1 > l) goto _L2; else goto _L1
_L1:
        if (l < l2) goto _L4; else goto _L3
_L3:
        ((Calendar) (obj)).setTimeInMillis(0x5265c00L + l1);
_L2:
        alarmMgr.setRepeating(0, ((Calendar) (obj)).getTimeInMillis(), 0x1b7740L, alarmEveningIntent);
        if (l2 > l && !flag)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        calendar.setTimeInMillis(0x5265c00L + l2);
        obj = new Intent("com.accuweather.android.CANCEL_UPDATE_ACCUWEATHER_EVENING_NOW_CARDS");
        ((Intent) (obj)).putExtra("com.accuweather.android.CANCEL_UPDATE_ACCUWEATHER_EVENING_NOW_CARDS", alarmEveningIntent);
        cancelEveningPI = PendingIntent.getBroadcast(context, 0, ((Intent) (obj)), 0x8000000);
        alarmMgr.set(0, calendar.getTimeInMillis(), cancelEveningPI);
        return;
_L4:
        k = getNextHalfHour(k, j);
        if (k != j + 0)
        {
            break MISSING_BLOCK_LABEL_383;
        }
        if (i + 1 >= 19)
        {
            break MISSING_BLOCK_LABEL_369;
        }
        ((Calendar) (obj)).set(11, i + 1);
        ((Calendar) (obj)).set(12, k);
          goto _L2
        ((Calendar) (obj)).setTimeInMillis(0x5265c00L + l1);
          goto _L2
        if (i >= 19)
        {
            break MISSING_BLOCK_LABEL_411;
        }
        ((Calendar) (obj)).set(11, i);
        ((Calendar) (obj)).set(12, k);
          goto _L2
        ((Calendar) (obj)).setTimeInMillis(0x5265c00L + l1);
          goto _L2
    }

    public void scheduleGoogleNowAlarm(Context context)
    {
        try
        {
            NowUtil.writeToFile(TAG, "Scheduling cards", false);
            scheduleMorningCard(context, false);
            scheduleEveningCard(context, false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            NowUtil.writeToFile(TAG, (new StringBuilder()).append("Error scheduling cards: ").append(context.getMessage()).toString(), true);
        }
        Logger.e(TAG, (new StringBuilder()).append("Error scheduling Now alarm: ").append(context.getMessage()).toString());
    }

    public void scheduleMorningCard(Context context, boolean flag)
        throws Exception
    {
        Calendar calendar;
        Object obj;
        int i;
        int j;
        int k;
        long l;
        long l1;
        long l2;
        try
        {
            alarmMgr = (AlarmManager)context.getSystemService("alarm");
            NowUtil.writeToFile(TAG, "Scheduling morning card", false);
            alarmIntent = PendingIntent.getBroadcast(context, 0, new Intent("com.accuweather.android.UPDATE_ACCUWEATHER_NOW_CARDS"), 0);
            obj = Calendar.getInstance();
            i = ((Calendar) (obj)).get(11);
            k = ((Calendar) (obj)).get(12);
            l = ((Calendar) (obj)).getTimeInMillis();
            ((Calendar) (obj)).setTimeInMillis(System.currentTimeMillis());
            ((Calendar) (obj)).set(11, 6);
            j = NowUtil.randInt(0, 5);
            ((Calendar) (obj)).set(12, j);
            ((Calendar) (obj)).set(13, NowUtil.randInt(0, 59));
            l1 = ((Calendar) (obj)).getTimeInMillis();
            calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(11, 10);
            calendar.set(12, 0);
            l2 = calendar.getTimeInMillis();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            NowUtil.writeToFile(TAG, "Error scheduling Now morning alarm", false);
            Logger.e(TAG, (new StringBuilder()).append("Error scheduling Now morning alarm: ").append(context.getMessage()).toString());
            throw context;
        }
        if (l1 > l) goto _L2; else goto _L1
_L1:
        if (l < l2) goto _L4; else goto _L3
_L3:
        ((Calendar) (obj)).setTimeInMillis(0x5265c00L + l1);
_L2:
        alarmMgr.setRepeating(0, ((Calendar) (obj)).getTimeInMillis(), 0x1b7740L, alarmIntent);
        if (l2 > l && !flag)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        calendar.setTimeInMillis(0x5265c00L + l2);
        obj = new Intent("com.accuweather.android.CANCEL_UPDATE_ACCUWEATHER_NOW_CARDS");
        ((Intent) (obj)).putExtra("com.accuweather.android.CANCEL_UPDATE_ACCUWEATHER_NOW_CARDS", alarmIntent);
        cancelIntent = PendingIntent.getBroadcast(context, 0, ((Intent) (obj)), 0x8000000);
        alarmMgr.set(0, calendar.getTimeInMillis(), cancelIntent);
        return;
_L4:
        k = getNextHalfHour(k, j);
        if (k != j + 0)
        {
            break MISSING_BLOCK_LABEL_383;
        }
        if (i + 1 >= 10)
        {
            break MISSING_BLOCK_LABEL_369;
        }
        ((Calendar) (obj)).set(11, i + 1);
        ((Calendar) (obj)).set(12, k);
          goto _L2
        ((Calendar) (obj)).setTimeInMillis(0x5265c00L + l1);
          goto _L2
        if (i >= 10)
        {
            break MISSING_BLOCK_LABEL_411;
        }
        ((Calendar) (obj)).set(11, i);
        ((Calendar) (obj)).set(12, k);
          goto _L2
        ((Calendar) (obj)).setTimeInMillis(0x5265c00L + l1);
          goto _L2
    }

}
