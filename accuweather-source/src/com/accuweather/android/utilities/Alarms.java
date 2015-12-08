// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import com.accuweather.android.alarms.IAlarm;
import com.accuweather.android.alarms.IceAlarm;
import com.accuweather.android.alarms.RainAlarm;
import com.accuweather.android.alarms.SnowAlarm;
import com.accuweather.android.alarms.TstormAlarm;
import com.accuweather.android.alarms.WindGustAlarm;
import com.accuweather.android.alarms.WindSpeedAlarm;
import com.accuweather.android.models.daily.DailyForecast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Alarms
    implements IAlarm
{

    private List alarms;

    public Alarms()
    {
        alarms = new ArrayList();
        alarms.add(new IceAlarm());
        alarms.add(new RainAlarm());
        alarms.add(new SnowAlarm());
        alarms.add(new TstormAlarm());
        alarms.add(new WindGustAlarm());
        alarms.add(new WindSpeedAlarm());
    }

    public boolean hasAlarm(DailyForecast dailyforecast, Integer integer, int i)
    {
        boolean flag = false;
        Iterator iterator = alarms.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            IAlarm ialarm = (IAlarm)iterator.next();
            boolean flag1 = ialarm.hasAlarm(dailyforecast.getDay(), integer, i) | ialarm.hasAlarm(dailyforecast.getNight(), integer, i);
            flag = flag1;
            if (!flag1)
            {
                continue;
            }
            flag = flag1;
            break;
        } while (true);
        return flag;
    }

    public volatile boolean hasAlarm(Object obj, Integer integer, int i)
    {
        return hasAlarm((DailyForecast)obj, integer, i);
    }
}
