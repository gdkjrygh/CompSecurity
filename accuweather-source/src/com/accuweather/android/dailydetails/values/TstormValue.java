// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.dailydetails.values;

import android.content.Context;
import android.content.res.Resources;
import com.accuweather.android.models.daily.ForecastValues;
import java.util.Locale;

// Referenced classes of package com.accuweather.android.dailydetails.values:
//            IValue

public class TstormValue
    implements IValue
{

    public TstormValue()
    {
    }

    public String getNonConvertedValue(ForecastValues forecastvalues)
    {
        String s = forecastvalues.getTstorm_string();
        forecastvalues = s;
        if (Integer.parseInt(s) < 75)
        {
            forecastvalues = "0";
        }
        return forecastvalues;
    }

    public volatile String getNonConvertedValue(Object obj)
    {
        return getNonConvertedValue((ForecastValues)obj);
    }

    public String getValue(ForecastValues forecastvalues, Integer integer, Context context)
    {
        int i = Integer.parseInt(forecastvalues.getTstorm_string());
        Locale.getDefault().getDisplayLanguage();
        if (i < 75)
        {
            return "";
        } else
        {
            return (new StringBuilder()).append("75+").append(context.getResources().getString(com.accuweather.android.R.string.Percent)).toString();
        }
    }

    public volatile String getValue(Object obj, Integer integer, Context context)
    {
        return getValue((ForecastValues)obj, integer, context);
    }
}
