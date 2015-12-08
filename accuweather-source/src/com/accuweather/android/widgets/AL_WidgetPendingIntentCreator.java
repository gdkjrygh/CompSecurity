// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets;


// Referenced classes of package com.accuweather.android.widgets:
//            ClockWidgetPendingIntentCreator, AL_WidgetConfigurationActivityFollowMe

public class AL_WidgetPendingIntentCreator extends ClockWidgetPendingIntentCreator
{

    public AL_WidgetPendingIntentCreator()
    {
    }

    protected int getAlertResourceId()
    {
        return com.accuweather.android.R.id.alert_icon;
    }

    protected int getClockTimeResourceId()
    {
        return com.accuweather.android.R.id.time;
    }

    protected int getDayOneResourceId()
    {
        return com.accuweather.android.R.id.day_one_ll;
    }

    protected int getDayTwoResourceId()
    {
        return com.accuweather.android.R.id.day_two_ll;
    }

    protected int getDownloadFullAppResourceId()
    {
        return com.accuweather.android.R.id.get_full_app;
    }

    protected int getExtendedForecastResourceId()
    {
        return com.accuweather.android.R.id.extended_forecast_ll;
    }

    protected int getNowResourceId()
    {
        return com.accuweather.android.R.id.current_ll;
    }

    protected Class getWidgetConfigurationActivityClass()
    {
        return com/accuweather/android/widgets/AL_WidgetConfigurationActivityFollowMe;
    }
}
