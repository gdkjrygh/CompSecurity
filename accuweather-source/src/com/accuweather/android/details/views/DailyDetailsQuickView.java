// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.details.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.accuweather.android.alarms.IceAlarm;
import com.accuweather.android.alarms.RainAlarm;
import com.accuweather.android.alarms.SnowAlarm;
import com.accuweather.android.alarms.TstormAlarm;
import com.accuweather.android.alarms.WindGustAlarm;
import com.accuweather.android.alarms.WindSpeedAlarm;
import com.accuweather.android.dailydetails.values.IceValue;
import com.accuweather.android.dailydetails.values.RainValue;
import com.accuweather.android.dailydetails.values.SnowValue;
import com.accuweather.android.dailydetails.values.TstormValue;
import com.accuweather.android.dailydetails.values.WindGustValue;
import com.accuweather.android.dailydetails.values.WindSpeedValue;
import com.accuweather.android.details.viewbuilders.DetailsHeaderImageLabelViewBuilder;
import com.accuweather.android.details.viewbuilders.DetailsHeaderImageLabelWindViewBuilder;
import com.accuweather.android.enums.WeatherType;
import java.util.List;

// Referenced classes of package com.accuweather.android.details.views:
//            QuickView

public class DailyDetailsQuickView extends QuickView
{

    public DailyDetailsQuickView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        View.inflate(context, com.accuweather.android.R.layout.details_container_view, this);
        names.add(new DetailsHeaderImageLabelViewBuilder(context, new IceAlarm(), new IceValue(), WeatherType.ICE));
        names.add(new DetailsHeaderImageLabelViewBuilder(context, new SnowAlarm(), new SnowValue(), WeatherType.SNOW));
        names.add(new DetailsHeaderImageLabelViewBuilder(context, new RainAlarm(), new RainValue(), WeatherType.RAIN));
        names.add(new DetailsHeaderImageLabelWindViewBuilder(context, new WindSpeedAlarm(), new WindSpeedValue(), new WindGustAlarm(), new WindGustValue(), WeatherType.WIND));
        names.add(new DetailsHeaderImageLabelViewBuilder(context, new TstormAlarm(), new TstormValue(), WeatherType.TSTORMS));
    }
}
