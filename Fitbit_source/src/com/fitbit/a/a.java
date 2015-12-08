// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.fitbit.galileo.service.GalileoSyncService;
import com.fitbit.galileo.service.GalileoSyncService_;
import com.fitbit.savedstate.TrackerSyncPreferencesSavedState;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public final class a
{

    public static final String a = "com.fitbit.controllers.AlarmsController.ACTION_MIDNIGHT_COMES";
    private static final String b = "AlarmsController";
    private static final int c = 1553;
    private static final int d = 4233;
    private static final int e = 4235;
    private static final long f;
    private static final long g;
    private static final Random h = new Random();

    public a()
    {
    }

    public static void a(Context context)
    {
        if (context == null)
        {
            com.fitbit.e.a.a("AlarmsController", "Midnight alarm is not scheduled: context is null.", new Object[0]);
            return;
        } else
        {
            AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
            GregorianCalendar gregoriancalendar = new GregorianCalendar();
            gregoriancalendar.set(14, 0);
            gregoriancalendar.set(13, 0);
            gregoriancalendar.set(12, 0);
            gregoriancalendar.set(11, 0);
            gregoriancalendar.add(5, 1);
            context = PendingIntent.getBroadcast(context, 1553, new Intent("com.fitbit.controllers.AlarmsController.ACTION_MIDNIGHT_COMES"), 0x8000000);
            alarmmanager.setRepeating(1, gregoriancalendar.getTimeInMillis(), 0x5265c00L, context);
            return;
        }
    }

    public static void a(Context context, long l, com.fitbit.galileo.service.GalileoSyncService.SyncMode syncmode, com.fitbit.serverinteraction.SynclairApi.SyncTrigger synctrigger, String s, boolean flag, boolean flag1)
    {
        AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
        context = PendingIntent.getService(context, 4233, GalileoSyncService.a(context, syncmode, synctrigger, s, flag, flag1), 0x8000000);
        alarmmanager.set(0, (new Date()).getTime() + l, context);
    }

    public static void b(Context context)
    {
        AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
        context = PendingIntent.getService(context, 4233, GalileoSyncService_.a(context).a(), 0x8000000);
        com.fitbit.e.a.a("AlarmsController", "Un-scheduling next alarm", new Object[0]);
        alarmmanager.cancel(context);
    }

    public static void b(Context context, long l, com.fitbit.galileo.service.GalileoSyncService.SyncMode syncmode, com.fitbit.serverinteraction.SynclairApi.SyncTrigger synctrigger, String s, boolean flag, boolean flag1)
    {
        AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
        context = PendingIntent.getService(context, 4233, GalileoSyncService.a(context, syncmode, synctrigger, s, flag, flag1), 0x8000000);
        if (!com.fitbit.util.b.a.a(19))
        {
            com.fitbit.e.a.a("AlarmsController", (new StringBuilder()).append("Scheduling sync for pre-kitkat builds ").append(context.toString()).toString(), new Object[0]);
            alarmmanager.setRepeating(0, (new Date()).getTime() + l, (long)TrackerSyncPreferencesSavedState.v() * 60000L, context);
            return;
        } else
        {
            long l2 = f;
            long l3 = h.nextInt((int)g);
            long l1 = (new Date()).getTime();
            l = l2 + l3 + (l1 + l);
            alarmmanager.setExact(0, l, context);
            com.fitbit.e.a.a("AlarmsController", "Scheduled next sync for %d minutes from now", new Object[] {
                Long.valueOf((l - l1) / 60000L)
            });
            return;
        }
    }

    static 
    {
        f = (long)TrackerSyncPreferencesSavedState.v() * 60000L;
        g = f * 2L;
    }
}
