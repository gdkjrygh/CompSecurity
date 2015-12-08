// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.alarms;

import com.accuweather.android.models.daily.ForecastValues;

// Referenced classes of package com.accuweather.android.alarms:
//            AbstractAlarm

public class TstormAlarm extends AbstractAlarm
{

    public TstormAlarm()
    {
    }

    public boolean hasAlarm(ForecastValues forecastvalues, Integer integer, int i)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (i < getMaxDaysOut())
        {
            flag = flag1;
            if (Double.parseDouble(forecastvalues.getTstorm_string()) >= 75D)
            {
                flag = true;
            }
        }
        return flag;
    }

    public volatile boolean hasAlarm(Object obj, Integer integer, int i)
    {
        return hasAlarm((ForecastValues)obj, integer, i);
    }
}
