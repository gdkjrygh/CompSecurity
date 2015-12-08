// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.details.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.accuweather.android.dailydetails.values.WindDirectionValue;
import com.accuweather.android.dailydetails.values.WindGustValue;
import com.accuweather.android.dailydetails.values.WindSpeedValue;
import com.accuweather.android.details.viewbuilders.HourlyDetailsTableImageLabelViewBuilder;
import com.accuweather.android.enums.WeatherLabel;
import java.util.List;

// Referenced classes of package com.accuweather.android.details.views:
//            QuickView

public class HourlyDetailsWindView extends QuickView
{

    public HourlyDetailsWindView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        View.inflate(context, com.accuweather.android.R.layout.details_container_view, this);
        names.add(new HourlyDetailsTableImageLabelViewBuilder(context, new WindDirectionValue(), WeatherLabel.WIND_DIRECTION));
        names.add(new HourlyDetailsTableImageLabelViewBuilder(context, new WindSpeedValue(), WeatherLabel.WIND_SPEED));
        names.add(new HourlyDetailsTableImageLabelViewBuilder(context, new WindGustValue(), WeatherLabel.WIND_GUST));
    }
}
