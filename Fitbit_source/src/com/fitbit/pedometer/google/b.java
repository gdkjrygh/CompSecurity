// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer.google;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.fitbit.FitBitApplication;
import com.fitbit.e.a;
import java.util.Date;

// Referenced classes of package com.fitbit.pedometer.google:
//            GoogleStepsService

public final class b
{

    private static final String a = "GoogleStepsServiceScheduler";
    private static final long b = 0x493e0L;
    private static final int c = 2301;

    public b()
    {
    }

    public static void a()
    {
        a(0x493e0L);
    }

    public static void a(long l)
    {
        com.fitbit.e.a.a("GoogleStepsServiceScheduler", "Scheduling service with interval: %s ms", new Object[] {
            Long.valueOf(0x493e0L)
        });
        Object obj = FitBitApplication.a();
        Intent intent = new Intent(((Context) (obj)), com/fitbit/pedometer/google/GoogleStepsService);
        intent.putExtra("com.fitbit.pedometer.google.GoogleStepsService.EXTRA_SERVICE_COMMAND", com.fitbit.pedometer.google.GoogleStepsService.ServiceCommand.a);
        AlarmManager alarmmanager = (AlarmManager)((Context) (obj)).getSystemService("alarm");
        obj = PendingIntent.getService(((Context) (obj)), 2301, intent, 0x8000000);
        alarmmanager.setRepeating(1, (new Date()).getTime() + l, 0x493e0L, ((PendingIntent) (obj)));
    }

    public static void b()
    {
        com.fitbit.e.a.a("GoogleStepsServiceScheduler", "Removing service from schedule.", new Object[0]);
        FitBitApplication fitbitapplication = FitBitApplication.a();
        ((AlarmManager)fitbitapplication.getSystemService("alarm")).cancel(PendingIntent.getService(fitbitapplication, 2301, new Intent(fitbitapplication, com/fitbit/pedometer/google/GoogleStepsService), 0x8000000));
    }
}
