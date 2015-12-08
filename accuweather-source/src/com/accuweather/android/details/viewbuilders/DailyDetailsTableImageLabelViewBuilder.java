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
import com.accuweather.android.enums.WeatherLabel;
import com.accuweather.android.models.daily.DailyForecast;
import com.accuweather.android.utilities.ConversionUtilities;

// Referenced classes of package com.accuweather.android.details.viewbuilders:
//            ImageLabelViewBuilder, RowBuilder

public class DailyDetailsTableImageLabelViewBuilder
    implements ImageLabelViewBuilder
{

    private IAlarm alarm;
    private IValue headerValue;
    private RowBuilder rowBuilder;
    private WeatherLabel weatherLabel;

    public DailyDetailsTableImageLabelViewBuilder(Context context, IAlarm ialarm, IValue ivalue, WeatherLabel weatherlabel)
    {
        alarm = ialarm;
        headerValue = ivalue;
        weatherLabel = weatherlabel;
        rowBuilder = new RowBuilder(context);
    }

    public View getView(DailyForecast dailyforecast, Integer integer, Context context, LayoutStyleType layoutstyletype, int i)
    {
        com.accuweather.android.models.daily.DayNight daynight = dailyforecast.getDay();
        dailyforecast = dailyforecast.getNight();
        String s = headerValue.getValue(daynight, integer, context);
        context = headerValue.getValue(dailyforecast, integer, context);
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (!ConversionUtilities.checkForZero(headerValue.getNonConvertedValue(daynight)))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!ConversionUtilities.checkForZero(headerValue.getNonConvertedValue(dailyforecast)))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        flag = false;
        if (alarm != null)
        {
            if (alarm.hasAlarm(daynight, integer, i) || alarm.hasAlarm(dailyforecast, integer, i))
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        if (weatherLabel.equals(WeatherLabel.TSTORMS))
        {
            if (!flag && TextUtils.isEmpty(s) && TextUtils.isEmpty(context))
            {
                return null;
            } else
            {
                return rowBuilder.buildDailyTableRow(s, flag1, context, flag2, flag, layoutstyletype, weatherLabel);
            }
        } else
        {
            return rowBuilder.buildDailyTableRow(s, flag1, context, flag2, flag, layoutstyletype, weatherLabel);
        }
    }

    public volatile View getView(Object obj, Integer integer, Context context, LayoutStyleType layoutstyletype, int i)
    {
        return getView((DailyForecast)obj, integer, context, layoutstyletype, i);
    }
}
