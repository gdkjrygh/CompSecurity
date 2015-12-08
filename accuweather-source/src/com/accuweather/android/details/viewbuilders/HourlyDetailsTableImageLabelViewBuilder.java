// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.details.viewbuilders;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.accuweather.android.dailydetails.values.IValue;
import com.accuweather.android.enums.LayoutStyleType;
import com.accuweather.android.enums.WeatherLabel;
import com.accuweather.android.models.daily.ForecastValues;
import com.accuweather.android.utilities.ConversionUtilities;

// Referenced classes of package com.accuweather.android.details.viewbuilders:
//            ImageLabelViewBuilder, RowBuilder

public class HourlyDetailsTableImageLabelViewBuilder
    implements ImageLabelViewBuilder
{

    private IValue headerValue;
    private RowBuilder rowBuilder;
    private WeatherLabel weatherLabel;

    public HourlyDetailsTableImageLabelViewBuilder(Context context, IValue ivalue, WeatherLabel weatherlabel)
    {
        headerValue = ivalue;
        weatherLabel = weatherlabel;
        rowBuilder = new RowBuilder(context);
    }

    public View getView(ForecastValues forecastvalues, Integer integer, Context context, LayoutStyleType layoutstyletype, int i)
    {
        integer = headerValue.getValue(forecastvalues, integer, context);
        forecastvalues = headerValue.getNonConvertedValue(forecastvalues);
        if (!TextUtils.isEmpty(forecastvalues))
        {
            boolean flag;
            if (!ConversionUtilities.checkForZero(forecastvalues))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!TextUtils.isEmpty(integer))
            {
                return rowBuilder.buildHourlyTableRow(integer, flag, layoutstyletype, weatherLabel);
            }
        }
        return null;
    }

    public volatile View getView(Object obj, Integer integer, Context context, LayoutStyleType layoutstyletype, int i)
    {
        return getView((ForecastValues)obj, integer, context, layoutstyletype, i);
    }
}
