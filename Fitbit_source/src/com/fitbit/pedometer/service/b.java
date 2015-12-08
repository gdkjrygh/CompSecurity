// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer.service;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.PowerManager;
import com.fitbit.ApplicationForegroundController;
import com.fitbit.FitBitApplication;
import com.fitbit.e.a;
import com.fitbit.pedometer.e;
import com.fitbit.pedometer.schedule.SchedulingPolicy;
import java.util.Date;

// Referenced classes of package com.fitbit.pedometer.service:
//            PedometerService_

public class b
{

    private static final String a = "PedometerServiceScheduler";
    private static final int b = 4455;

    public b()
    {
    }

    public static void a()
    {
        SchedulingPolicy schedulingpolicy = e.g().f();
        if (schedulingpolicy != null && schedulingpolicy.a())
        {
            a(schedulingpolicy.a(b()));
            return;
        } else
        {
            c();
            return;
        }
    }

    private static void a(long l)
    {
        com.fitbit.e.a.a("PedometerServiceScheduler", "Adding PedometerService to schedule...", new Object[0]);
        if (l > 0L)
        {
            com.fitbit.e.a.d("PedometerServiceScheduler", (new StringBuilder()).append("Scheduling start of PedometerService after ").append(l).append("ms...").toString(), new Object[0]);
            Object obj = FitBitApplication.a();
            AlarmManager alarmmanager = (AlarmManager)((Context) (obj)).getSystemService("alarm");
            obj = PendingIntent.getService(((Context) (obj)), 4455, com.fitbit.pedometer.service.PedometerService_.a(((Context) (obj))).a(), 0x8000000);
            alarmmanager.set(1, (new Date()).getTime() + l, ((PendingIntent) (obj)));
            return;
        } else
        {
            com.fitbit.e.a.d("PedometerServiceScheduler", "Unable to schedule PedometerService: negative interval.", new Object[0]);
            return;
        }
    }

    public static com.fitbit.pedometer.schedule.SchedulingPolicy.ApplicationState b()
    {
        if (!((PowerManager)FitBitApplication.a().getSystemService("power")).isScreenOn())
        {
            return com.fitbit.pedometer.schedule.SchedulingPolicy.ApplicationState.c;
        }
        if (ApplicationForegroundController.a().b())
        {
            return com.fitbit.pedometer.schedule.SchedulingPolicy.ApplicationState.a;
        } else
        {
            return com.fitbit.pedometer.schedule.SchedulingPolicy.ApplicationState.b;
        }
    }

    public static void c()
    {
        com.fitbit.e.a.a("PedometerServiceScheduler", "Removing PedometerService from schedule...", new Object[0]);
        FitBitApplication fitbitapplication = FitBitApplication.a();
        ((AlarmManager)fitbitapplication.getSystemService("alarm")).cancel(PendingIntent.getService(fitbitapplication, 4455, com.fitbit.pedometer.service.PedometerService_.a(fitbitapplication).a(), 0x8000000));
    }
}
