// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.details.viewbuilders;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.accuweather.android.alarms.IAlarm;
import com.accuweather.android.dailydetails.values.IValue;
import com.accuweather.android.enums.LayoutStyleType;
import com.accuweather.android.enums.WeatherType;
import com.accuweather.android.models.daily.ForecastValues;
import com.accuweather.android.models.hourly.HourlyResult;
import com.accuweather.android.utilities.ConversionUtilities;

// Referenced classes of package com.accuweather.android.details.viewbuilders:
//            ImageLabelViewBuilder, RowBuilder

public class DetailsHeaderImageLabelViewBuilder
    implements ImageLabelViewBuilder
{

    private IAlarm alarm;
    private IValue headerValue;
    private RowBuilder rowBuilder;
    private WeatherType weatherType;

    public DetailsHeaderImageLabelViewBuilder(Context context, IAlarm ialarm, IValue ivalue, WeatherType weathertype)
    {
        this(context, ivalue, weathertype);
        alarm = ialarm;
    }

    public DetailsHeaderImageLabelViewBuilder(Context context, IValue ivalue, WeatherType weathertype)
    {
        headerValue = ivalue;
        weatherType = weathertype;
        rowBuilder = new RowBuilder(context);
    }

    public View getView(ForecastValues forecastvalues, Integer integer, Context context, LayoutStyleType layoutstyletype, int i)
    {
        String s;
        boolean flag;
label0:
        {
            s = headerValue.getValue(forecastvalues, integer, context);
            String s1 = headerValue.getNonConvertedValue(forecastvalues);
            Object obj = null;
            context = obj;
            if (!TextUtils.isEmpty(s))
            {
                context = obj;
                if (!ConversionUtilities.checkForZero(s1))
                {
                    flag = false;
                    if (alarm != null)
                    {
                        flag = alarm.hasAlarm(forecastvalues, integer, i);
                    }
                    if (!(forecastvalues instanceof HourlyResult))
                    {
                        break label0;
                    }
                    context = rowBuilder.buildHourlyHeaderRow(s, weatherType, layoutstyletype);
                }
            }
            return context;
        }
        return rowBuilder.buildDailyHeaderRow(s, flag, weatherType, layoutstyletype);
    }

    public volatile View getView(Object obj, Integer integer, Context context, LayoutStyleType layoutstyletype, int i)
    {
        return getView((ForecastValues)obj, integer, context, layoutstyletype, i);
    }
}
