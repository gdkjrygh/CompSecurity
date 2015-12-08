// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.details.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.accuweather.android.dailydetails.values.IceValue;
import com.accuweather.android.dailydetails.values.RainValue;
import com.accuweather.android.dailydetails.values.SnowValue;
import com.accuweather.android.dailydetails.values.WindGustValue;
import com.accuweather.android.dailydetails.values.WindSpeedValue;
import com.accuweather.android.details.viewbuilders.DetailsHeaderImageLabelViewBuilder;
import com.accuweather.android.details.viewbuilders.DetailsHeaderImageLabelWindViewBuilder;
import com.accuweather.android.enums.WeatherType;
import java.util.List;

// Referenced classes of package com.accuweather.android.details.views:
//            QuickView

public class HourlyDetailsQuickView extends QuickView
{

    public HourlyDetailsQuickView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        View.inflate(context, com.accuweather.android.R.layout.details_container_view, this);
        names.add(new DetailsHeaderImageLabelViewBuilder(context, new IceValue(), WeatherType.ICE));
        names.add(new DetailsHeaderImageLabelViewBuilder(context, new SnowValue(), WeatherType.SNOW));
        names.add(new DetailsHeaderImageLabelViewBuilder(context, new RainValue(), WeatherType.RAIN));
        names.add(new DetailsHeaderImageLabelWindViewBuilder(context, new WindSpeedValue(), new WindGustValue(), WeatherType.WIND));
    }
}
