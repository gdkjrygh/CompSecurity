// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.dailydetails.values;

import android.content.Context;
import com.accuweather.android.models.hourly.HourlyForecastValues;

// Referenced classes of package com.accuweather.android.dailydetails.values:
//            IValue

public class DewValue
    implements IValue
{

    public DewValue()
    {
    }

    public String getNonConvertedValue(HourlyForecastValues hourlyforecastvalues)
    {
        return hourlyforecastvalues.getDewPointForecast();
    }

    public volatile String getNonConvertedValue(Object obj)
    {
        return getNonConvertedValue((HourlyForecastValues)obj);
    }

    public String getValue(HourlyForecastValues hourlyforecastvalues, Integer integer, Context context)
    {
        if (hourlyforecastvalues.getDewPointForecast() != null)
        {
            return (new StringBuilder()).append(hourlyforecastvalues.getDewPointForecast()).append("\260").toString();
        } else
        {
            return context.getString(com.accuweather.android.R.string.NA);
        }
    }

    public volatile String getValue(Object obj, Integer integer, Context context)
    {
        return getValue((HourlyForecastValues)obj, integer, context);
    }
}
