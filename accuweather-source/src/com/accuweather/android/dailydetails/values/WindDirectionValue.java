// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.dailydetails.values;

import android.content.Context;
import com.accuweather.android.models.daily.ForecastValues;

// Referenced classes of package com.accuweather.android.dailydetails.values:
//            IValue

public class WindDirectionValue
    implements IValue
{

    public WindDirectionValue()
    {
    }

    public String getNonConvertedValue(ForecastValues forecastvalues)
    {
        return forecastvalues.getWindDirection();
    }

    public volatile String getNonConvertedValue(Object obj)
    {
        return getNonConvertedValue((ForecastValues)obj);
    }

    public String getValue(ForecastValues forecastvalues, Integer integer, Context context)
    {
        return forecastvalues.getConvertedWindDirection(integer, context);
    }

    public volatile String getValue(Object obj, Integer integer, Context context)
    {
        return getValue((ForecastValues)obj, integer, context);
    }
}
