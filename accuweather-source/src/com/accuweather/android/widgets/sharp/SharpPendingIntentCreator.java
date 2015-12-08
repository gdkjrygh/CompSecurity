// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets.sharp;

import com.accuweather.android.widgets.ClockWidgetPendingIntentCreator;

// Referenced classes of package com.accuweather.android.widgets.sharp:
//            SharpWidgetConfigurationActivity

public class SharpPendingIntentCreator extends ClockWidgetPendingIntentCreator
{

    public SharpPendingIntentCreator()
    {
    }

    protected int getAlertResourceId()
    {
        return com.accuweather.android.R.id.alertImageView;
    }

    protected int getClockTimeResourceId()
    {
        return com.accuweather.android.R.id.clockContainer;
    }

    protected int getDayOneResourceId()
    {
        return com.accuweather.android.R.id.dayOneLinear;
    }

    protected int getDayTwoResourceId()
    {
        return com.accuweather.android.R.id.dayTwoLinear;
    }

    protected int getDownloadFullAppResourceId()
    {
        return com.accuweather.android.R.id.getFullApp;
    }

    protected int getExtendedForecastResourceId()
    {
        return com.accuweather.android.R.id.extendedForecast;
    }

    protected int getNowResourceId()
    {
        return com.accuweather.android.R.id.locationAndCurrentConditionsContainer;
    }

    protected Class getWidgetConfigurationActivityClass()
    {
        return com/accuweather/android/widgets/sharp/SharpWidgetConfigurationActivity;
    }
}
