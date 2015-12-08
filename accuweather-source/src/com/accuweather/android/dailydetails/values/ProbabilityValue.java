// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.dailydetails.values;

import android.content.Context;
import android.content.res.Resources;
import com.accuweather.android.models.daily.ForecastValues;

// Referenced classes of package com.accuweather.android.dailydetails.values:
//            IValue

public class ProbabilityValue
    implements IValue
{

    Context context;

    public ProbabilityValue()
    {
    }

    public String getNonConvertedValue(ForecastValues forecastvalues)
    {
        return (new StringBuilder()).append(forecastvalues.getPrecipProbability_string()).append(context.getResources().getString(com.accuweather.android.R.string.Percent)).toString();
    }

    public volatile String getNonConvertedValue(Object obj)
    {
        return getNonConvertedValue((ForecastValues)obj);
    }

    public String getValue(ForecastValues forecastvalues, Integer integer, Context context1)
    {
        context = context1;
        return getNonConvertedValue(forecastvalues);
    }

    public volatile String getValue(Object obj, Integer integer, Context context1)
    {
        return getValue((ForecastValues)obj, integer, context1);
    }
}
