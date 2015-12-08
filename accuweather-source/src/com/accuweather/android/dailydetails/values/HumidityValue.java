// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.dailydetails.values;

import android.content.Context;
import android.content.res.Resources;
import com.accuweather.android.models.hourly.HourlyForecastValues;

// Referenced classes of package com.accuweather.android.dailydetails.values:
//            IValue

public class HumidityValue
    implements IValue
{

    public HumidityValue()
    {
    }

    public String getNonConvertedValue(HourlyForecastValues hourlyforecastvalues)
    {
        return hourlyforecastvalues.getHumidityForecast();
    }

    public volatile String getNonConvertedValue(Object obj)
    {
        return getNonConvertedValue((HourlyForecastValues)obj);
    }

    public String getValue(HourlyForecastValues hourlyforecastvalues, Integer integer, Context context)
    {
        return (new StringBuilder()).append(hourlyforecastvalues.getHumidityForecast()).append(context.getResources().getString(com.accuweather.android.R.string.Percent)).toString();
    }

    public volatile String getValue(Object obj, Integer integer, Context context)
    {
        return getValue((HourlyForecastValues)obj, integer, context);
    }
}
