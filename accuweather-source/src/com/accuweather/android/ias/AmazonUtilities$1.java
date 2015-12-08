// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.ias;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.View;
import com.accuweather.android.models.daily.DailyForecast;
import com.accuweather.android.models.daily.DayNight;
import com.accuweather.android.utilities.AccuAnalytics;
import com.accuweather.android.utilities.DateUtils;
import com.accuweather.android.utilities.Logger;

// Referenced classes of package com.accuweather.android.ias:
//            AmazonUtilities, AmazonProductChoiceDialog

static final class val.fragmentManager
    implements android.view.er
{

    final Context val$context;
    final DailyForecast val$forecast;
    final FragmentManager val$fragmentManager;

    public void onClick(View view)
    {
        Logger.i(this, "onClick Amazon Triangle");
        AccuAnalytics.logUiEvent(val$context, "Amazon shopping triangle click");
        view = new AmazonProductChoiceDialog();
        Bundle bundle = new Bundle();
        bundle.putString("shorttext", val$forecast.getDay().getIconPhrase());
        bundle.putString("day", AmazonUtilities.access$000(val$context, val$forecast));
        bundle.putString("date", DateUtils.toUserPreferredDate(val$forecast.getDate(), val$context));
        view.setArguments(bundle);
        view.show(val$fragmentManager, "dialog");
    }

    cast(Context context1, DailyForecast dailyforecast, FragmentManager fragmentmanager)
    {
        val$context = context1;
        val$forecast = dailyforecast;
        val$fragmentManager = fragmentmanager;
        super();
    }
}
