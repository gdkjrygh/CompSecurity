// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.details.viewbuilders;

import android.content.Context;
import android.view.View;
import com.accuweather.android.alarms.IAlarm;
import com.accuweather.android.dailydetails.values.IValue;
import com.accuweather.android.enums.LayoutStyleType;
import com.accuweather.android.enums.WeatherType;
import com.accuweather.android.models.daily.ForecastValues;
import com.accuweather.android.models.hourly.HourlyResult;

// Referenced classes of package com.accuweather.android.details.viewbuilders:
//            ImageLabelViewBuilder, RowBuilder

public class DetailsHeaderImageLabelWindViewBuilder
    implements ImageLabelViewBuilder
{

    private RowBuilder rowBuilder;
    private WeatherType weatherType;
    private IAlarm windGustAlarm;
    private IValue windGustIHeaderValue;
    private IAlarm windSpeedAlarm;
    private IValue windSpeedIHeaderValue;

    public DetailsHeaderImageLabelWindViewBuilder(Context context, IAlarm ialarm, IValue ivalue, IAlarm ialarm1, IValue ivalue1, WeatherType weathertype)
    {
        this(context, ivalue, ivalue1, weathertype);
        windSpeedAlarm = ialarm;
        windGustAlarm = ialarm1;
    }

    public DetailsHeaderImageLabelWindViewBuilder(Context context, IValue ivalue, IValue ivalue1, WeatherType weathertype)
    {
        windSpeedIHeaderValue = ivalue;
        windGustIHeaderValue = ivalue1;
        weatherType = weathertype;
        rowBuilder = new RowBuilder(context);
    }

    public View getView(ForecastValues forecastvalues, Integer integer, Context context, LayoutStyleType layoutstyletype, int i)
    {
        String s;
        String s1;
        boolean flag;
        boolean flag1;
label0:
        {
            s = windSpeedIHeaderValue.getValue(forecastvalues, integer, context);
            s1 = windGustIHeaderValue.getValue(forecastvalues, integer, context);
            Object obj = null;
            context = obj;
            if (s != null)
            {
                context = obj;
                if (s1 != null)
                {
                    boolean flag2 = false;
                    boolean flag3 = false;
                    flag1 = flag3;
                    flag = flag2;
                    if (windGustAlarm != null)
                    {
                        flag1 = flag3;
                        flag = flag2;
                        if (windSpeedAlarm != null)
                        {
                            flag1 = windSpeedAlarm.hasAlarm(forecastvalues, integer, i);
                            flag = windGustAlarm.hasAlarm(forecastvalues, integer, i);
                        }
                    }
                    if (!(forecastvalues instanceof HourlyResult))
                    {
                        break label0;
                    }
                    context = rowBuilder.buildHourlyHeaderWindRow(s, s1, weatherType, layoutstyletype);
                }
            }
            return context;
        }
        return rowBuilder.buildDailyHeaderWindRow(s, s1, flag1, flag, weatherType, layoutstyletype);
    }

    public volatile View getView(Object obj, Integer integer, Context context, LayoutStyleType layoutstyletype, int i)
    {
        return getView((ForecastValues)obj, integer, context, layoutstyletype, i);
    }
}
