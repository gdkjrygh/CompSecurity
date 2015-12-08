// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.util;

import com.thetransitapp.droid.model.Schedule;
import com.thetransitapp.droid.model.ScheduleItem;
import java.util.Iterator;
import java.util.List;

public final class TimeUtility
{

    private TimeUtility()
    {
    }

    public static ScheduleItem getNextSchedule(Schedule schedule)
    {
        Object obj = null;
        int i = 0x7fffffff;
        Iterator iterator = schedule.getScheduleItems().iterator();
        schedule = obj;
        do
        {
            ScheduleItem scheduleitem;
            int j;
            do
            {
                if (!iterator.hasNext())
                {
                    return schedule;
                }
                scheduleitem = (ScheduleItem)iterator.next();
                j = scheduleitem.getMinutesRemaining();
            } while (i <= j || j <= 0);
            schedule = scheduleitem;
            i = j;
        } while (true);
    }

    public static int getNextStopTime(Schedule schedule)
    {
        schedule = getNextSchedule(schedule);
        if (schedule != null)
        {
            return schedule.getMinutesRemaining();
        } else
        {
            return -1;
        }
    }
}
