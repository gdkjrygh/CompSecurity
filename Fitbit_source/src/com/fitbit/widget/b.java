// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.widget;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.PowerManager;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.device.TrackerGoalType;
import com.fitbit.e.a;
import com.fitbit.savedstate.w;
import com.fitbit.util.p;
import java.util.Date;

// Referenced classes of package com.fitbit.widget:
//            WidgetUpdaterService_

public class b
{

    private static final String a = "WidgetUpdateScheduler";
    private static final long b = 60000L;
    private static final int c = 4242;

    public b()
    {
    }

    public static void a(Context context)
    {
        if (w.h())
        {
            com.fitbit.e.a.a("WidgetUpdateScheduler", "Starting updating service...", new Object[0]);
            com.fitbit.widget.WidgetUpdaterService_.a(context).b();
        }
    }

    public static void b(Context context)
    {
        com.fitbit.e.a.a("WidgetUpdateScheduler", "Updating schedule...", new Object[0]);
        if (!w.h())
        {
            com.fitbit.e.a.a("WidgetUpdateScheduler", "Update is removed from schedule: widget is not enabled.", new Object[0]);
            d(context);
            return;
        }
        if (!an.a().g())
        {
            com.fitbit.e.a.a("WidgetUpdateScheduler", "Update is removed from schedule: user is not logged in.", new Object[0]);
            d(context);
            return;
        }
        if (!((PowerManager)context.getSystemService("power")).isScreenOn())
        {
            com.fitbit.e.a.a("WidgetUpdateScheduler", "Update is removed from schedule: screen is off.", new Object[0]);
            d(context);
            return;
        }
        TrackerGoalType trackergoaltype = p.k();
        if (!TrackerGoalType.CALORIES.equals(trackergoaltype))
        {
            com.fitbit.e.a.a("WidgetUpdateScheduler", "Update is removed from schedule: primary goal is not Calories.", new Object[0]);
            d(context);
            return;
        } else
        {
            c(context);
            return;
        }
    }

    private static void c(Context context)
    {
        com.fitbit.e.a.a("WidgetUpdateScheduler", "Scheduling repeating update with interval: %s msec.", new Object[] {
            Long.valueOf(60000L)
        });
        AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
        context = PendingIntent.getService(context, 4242, com.fitbit.widget.WidgetUpdaterService_.a(context).a(), 0x8000000);
        alarmmanager.setRepeating(1, (new Date()).getTime(), 60000L, context);
    }

    private static void d(Context context)
    {
        ((AlarmManager)context.getSystemService("alarm")).cancel(PendingIntent.getService(context, 4242, com.fitbit.widget.WidgetUpdaterService_.a(context).a(), 0x8000000));
    }
}
