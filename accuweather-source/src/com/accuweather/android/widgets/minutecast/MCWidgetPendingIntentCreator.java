// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets.minutecast;

import android.app.PendingIntent;
import android.widget.RemoteViews;
import com.accuweather.android.utilities.MainContentPage;
import com.accuweather.android.widgets.ClockWidgetPendingIntentAction;
import com.accuweather.android.widgets.ClockWidgetPendingIntentCreator;

// Referenced classes of package com.accuweather.android.widgets.minutecast:
//            AL_WidgetConfigurationActivity

public class MCWidgetPendingIntentCreator extends ClockWidgetPendingIntentCreator
{

    public MCWidgetPendingIntentCreator()
    {
    }

    private int getConfigResourceId()
    {
        return com.accuweather.android.R.id.tv_location;
    }

    private PendingIntent getOpenMainAppMinuteCastPendingIntent(int i)
    {
        return getPendingIntent(ClockWidgetPendingIntentAction.OpenMinuteCast.getRequestCode(i), getTermsAndConditionsPendingIntentClass(), widgetLocationKey, MainContentPage.MinuteCast);
    }

    public void addPendingIntentsForMinuteCastWidget(int i, RemoteViews remoteviews)
    {
        PendingIntent pendingintent = getOpenMainAppNowPendingIntent(i);
        PendingIntent pendingintent1 = getOpenMainAppAlertsPendingIntent(i);
        PendingIntent pendingintent2 = getOpenMainAppDailyPendingIntent(i);
        PendingIntent pendingintent3 = getOpenMainAppMinuteCastPendingIntent(i);
        PendingIntent pendingintent4 = getOpenWidgetConfigurationPendingIntent(i);
        remoteviews.setOnClickPendingIntent(getNowResourceId(), pendingintent);
        remoteviews.setOnClickPendingIntent(getAlertResourceId(), pendingintent1);
        remoteviews.setOnClickPendingIntent(getExtendedForecastResourceId(), pendingintent2);
        remoteviews.setOnClickPendingIntent(getMinuteCastResourceId(), pendingintent3);
        remoteviews.setOnClickPendingIntent(getConfigResourceId(), pendingintent4);
    }

    protected int getAlertResourceId()
    {
        return -1;
    }

    protected int getClockTimeResourceId()
    {
        return com.accuweather.android.R.id.clockContainer;
    }

    protected int getDayOneResourceId()
    {
        return com.accuweather.android.R.id.mc_widget_layout_day_1;
    }

    protected int getDayTwoResourceId()
    {
        return com.accuweather.android.R.id.mc_widget_layout_day_2;
    }

    protected int getDownloadFullAppResourceId()
    {
        return com.accuweather.android.R.id.getFullApp;
    }

    protected int getExtendedForecastResourceId()
    {
        return com.accuweather.android.R.id.date_container;
    }

    protected int getMinuteCastResourceId()
    {
        return com.accuweather.android.R.id.mc_widget_bottom_box;
    }

    protected int getNowResourceId()
    {
        return com.accuweather.android.R.id.mc_widget_top_left;
    }

    protected Class getWidgetConfigurationActivityClass()
    {
        return com/accuweather/android/widgets/minutecast/AL_WidgetConfigurationActivity;
    }
}
