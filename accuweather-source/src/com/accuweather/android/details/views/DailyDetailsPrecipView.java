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
import com.accuweather.android.dailydetails.values.IceValue;
import com.accuweather.android.dailydetails.values.ProbabilityValue;
import com.accuweather.android.dailydetails.values.RainValue;
import com.accuweather.android.dailydetails.values.SnowValue;
import com.accuweather.android.dailydetails.values.TstormValue;
import com.accuweather.android.details.viewbuilders.DailyDetailsTableImageLabelViewBuilder;
import com.accuweather.android.enums.WeatherLabel;
import java.util.List;

// Referenced classes of package com.accuweather.android.details.views:
//            QuickView

public class DailyDetailsPrecipView extends QuickView
{

    public DailyDetailsPrecipView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        attributeset = new DailyDetailsTableImageLabelViewBuilder(context, new TstormAlarm(), new TstormValue(), WeatherLabel.TSTORMS);
        View.inflate(context, com.accuweather.android.R.layout.details_container_view, this);
        names.add(new DailyDetailsTableImageLabelViewBuilder(context, null, new ProbabilityValue(), WeatherLabel.PROBABILITY));
        names.add(new DailyDetailsTableImageLabelViewBuilder(context, new RainAlarm(), new RainValue(), WeatherLabel.RAIN));
        names.add(new DailyDetailsTableImageLabelViewBuilder(context, new SnowAlarm(), new SnowValue(), WeatherLabel.SNOW));
        names.add(new DailyDetailsTableImageLabelViewBuilder(context, new IceAlarm(), new IceValue(), WeatherLabel.ICE));
        if (attributeset != null)
        {
            names.add(attributeset);
        }
    }
}
