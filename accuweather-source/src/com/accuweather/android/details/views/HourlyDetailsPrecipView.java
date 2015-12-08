// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.details.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.accuweather.android.dailydetails.values.DewValue;
import com.accuweather.android.dailydetails.values.HumidityValue;
import com.accuweather.android.dailydetails.values.IceValue;
import com.accuweather.android.dailydetails.values.ProbabilityValue;
import com.accuweather.android.dailydetails.values.RainValue;
import com.accuweather.android.dailydetails.values.SnowValue;
import com.accuweather.android.details.viewbuilders.HourlyDetailsTableImageLabelViewBuilder;
import com.accuweather.android.enums.WeatherLabel;
import java.util.List;

// Referenced classes of package com.accuweather.android.details.views:
//            QuickView

public class HourlyDetailsPrecipView extends QuickView
{

    public HourlyDetailsPrecipView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        View.inflate(context, com.accuweather.android.R.layout.details_container_view, this);
        names.add(new HourlyDetailsTableImageLabelViewBuilder(context, new ProbabilityValue(), WeatherLabel.PROBABILITY));
        names.add(new HourlyDetailsTableImageLabelViewBuilder(context, new RainValue(), WeatherLabel.RAIN));
        names.add(new HourlyDetailsTableImageLabelViewBuilder(context, new SnowValue(), WeatherLabel.SNOW));
        names.add(new HourlyDetailsTableImageLabelViewBuilder(context, new IceValue(), WeatherLabel.ICE));
        names.add(new HourlyDetailsTableImageLabelViewBuilder(context, new DewValue(), WeatherLabel.DEW));
        names.add(new HourlyDetailsTableImageLabelViewBuilder(context, new HumidityValue(), WeatherLabel.HUMIDITY));
    }
}
