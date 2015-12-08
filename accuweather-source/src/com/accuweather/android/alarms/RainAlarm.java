// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.alarms;

import com.accuweather.android.models.daily.ForecastValues;

// Referenced classes of package com.accuweather.android.alarms:
//            AbstractAlarm

public class RainAlarm extends AbstractAlarm
{

    public RainAlarm()
    {
    }

    private static double getRainThreshold(Integer integer)
    {
        return integer.intValue() != 0 ? 12.699999999999999D : 0.5D;
    }

    public boolean hasAlarm(ForecastValues forecastvalues, Integer integer, int i)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (i < getMaxDaysOut())
        {
            flag = flag1;
            if (Double.parseDouble(forecastvalues.getRainForAlarm()) > getRainThreshold(integer))
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
