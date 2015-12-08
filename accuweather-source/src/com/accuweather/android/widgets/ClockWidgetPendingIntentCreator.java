// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import com.accuweather.android.LiteTermsAndConditionsActivity;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.daily.DailyForecast;
import com.accuweather.android.models.daily.ForecastResult;
import com.accuweather.android.utilities.MainContentPage;
import com.accuweather.android.utilities.Utilities;
import java.util.List;

// Referenced classes of package com.accuweather.android.widgets:
//            AccuRemoteViews, ClockWidgetPendingIntentAction

public abstract class ClockWidgetPendingIntentCreator
{

    private static final String TERMS_AND_CONDITIONS_QUALIFIED_CLASS_NAME = "com.accuweather.android.TermsAndConditionsActivity";
    private Context context;
    protected String widgetLocationKey;

    public ClockWidgetPendingIntentCreator()
    {
    }

    private void addCommonPendingIntentsForLite(int i, AccuRemoteViews accuremoteviews)
    {
        PendingIntent pendingintent = getOpenWidgetConfigurationPendingIntent(i);
        PendingIntent pendingintent1 = getDownloadFullAppPendingIntent(i);
        i = getClockTimeResourceId();
        if (i != com.accuweather.android.R.id.clockContainer)
        {
            accuremoteviews.setOnClickPendingIntent(i, pendingintent);
        } else
        {
            accuremoteviews.setOnClickPendingIntent(com.accuweather.android.R.id.locationNameTextView, pendingintent);
        }
        accuremoteviews.setOnClickPendingIntent(getDownloadFullAppResourceId(), pendingintent1);
    }

    private void addPendingIntentsForFullApp(int i, AccuRemoteViews accuremoteviews)
    {
        PendingIntent pendingintent = getOpenMainAppNowPendingIntent(i);
        PendingIntent pendingintent1 = getOpenMainAppAlertsPendingIntent(i);
        PendingIntent pendingintent2 = getOpenMainAppDailyPendingIntent(i);
        accuremoteviews.setOnClickPendingIntent(getNowResourceId(), pendingintent);
        accuremoteviews.setOnClickPendingIntent(getAlertResourceId(), pendingintent1);
        accuremoteviews.setOnClickPendingIntent(getExtendedForecastResourceId(), pendingintent2);
    }

    private String getCurrentConditionsWebUrl(WeatherDataModel weatherdatamodel)
    {
        if (isLargeScreenDevice())
        {
            return weatherdatamodel.getTraditionalSiteUrl();
        } else
        {
            return weatherdatamodel.getMobileSiteUrl();
        }
    }

    private String getDay1Url(WeatherDataModel weatherdatamodel)
    {
        weatherdatamodel = (DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(0);
        if (isLargeScreenDevice())
        {
            return weatherdatamodel.getLink();
        } else
        {
            return weatherdatamodel.getMobileLink();
        }
    }

    private String getDay2Url(WeatherDataModel weatherdatamodel)
    {
        weatherdatamodel = (DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(1);
        if (isLargeScreenDevice())
        {
            return weatherdatamodel.getLink();
        } else
        {
            return weatherdatamodel.getMobileLink();
        }
    }

    private PendingIntent getDownloadFullAppPendingIntent(int i)
    {
        Intent intent = new Intent("com.accuweather.android.action.GET_FULL_APP");
        i = ClockWidgetPendingIntentAction.GetFullApp.getRequestCode(i);
        return PendingIntent.getBroadcast(context, i, intent, 0x8000000);
    }

    private PendingIntent getOpenMobileAlertsSiteIntent(int i, AccuRemoteViews accuremoteviews, Uri uri)
    {
        return getOpenMobileSiteIntent(ClockWidgetPendingIntentAction.OpenMobileAlerts.getRequestCode(i), accuremoteviews, uri);
    }

    private PendingIntent getOpenMobileNowSiteIntent(int i, AccuRemoteViews accuremoteviews, Uri uri)
    {
        return getOpenMobileSiteIntent(ClockWidgetPendingIntentAction.OpenMobileNow.getRequestCode(i), accuremoteviews, uri);
    }

    private PendingIntent getOpenMobileSiteIntent(int i, AccuRemoteViews accuremoteviews, Uri uri)
    {
        accuremoteviews = (new Intent("android.intent.action.VIEW", uri)).addFlags(0x20000000);
        return PendingIntent.getActivity(context, i, accuremoteviews, 0x8000000);
    }

    private boolean isLargeScreenDevice()
    {
        return (context.getResources().getConfiguration().screenLayout & 0xf) == 3;
    }

    public void addPendingIntentsForErrorLayout(int i, AccuRemoteViews accuremoteviews)
    {
        if (Utilities.isAndroidLite())
        {
            addCommonPendingIntentsForLite(i, accuremoteviews);
            return;
        } else
        {
            addPendingIntentsForFullApp(i, accuremoteviews);
            return;
        }
    }

    public void addPendingIntentsForSuccessLayout(int i, WeatherDataModel weatherdatamodel, AccuRemoteViews accuremoteviews)
    {
        if (Utilities.isAndroidLite())
        {
            addCommonPendingIntentsForLite(i, accuremoteviews);
            Object obj2 = Uri.parse(getCurrentConditionsWebUrl(weatherdatamodel));
            Object obj = Uri.parse(getDay1Url(weatherdatamodel));
            Object obj1 = Uri.parse(getDay2Url(weatherdatamodel));
            weatherdatamodel = getOpenMobileAlertsSiteIntent(i, accuremoteviews, ((Uri) (obj2)));
            obj2 = getOpenMobileNowSiteIntent(i, accuremoteviews, ((Uri) (obj2)));
            obj = getOpenMobileSiteIntent(i, accuremoteviews, ((Uri) (obj)));
            obj1 = getOpenMobileSiteIntent(i, accuremoteviews, ((Uri) (obj1)));
            accuremoteviews.setOnClickPendingIntent(getAlertResourceId(), weatherdatamodel);
            accuremoteviews.setOnClickPendingIntent(getNowResourceId(), ((PendingIntent) (obj2)));
            accuremoteviews.setOnClickPendingIntent(getDayOneResourceId(), ((PendingIntent) (obj)));
            accuremoteviews.setOnClickPendingIntent(getDayTwoResourceId(), ((PendingIntent) (obj1)));
            return;
        } else
        {
            addPendingIntentsForFullApp(i, accuremoteviews);
            return;
        }
    }

    protected abstract int getAlertResourceId();

    protected abstract int getClockTimeResourceId();

    protected abstract int getDayOneResourceId();

    protected abstract int getDayTwoResourceId();

    protected abstract int getDownloadFullAppResourceId();

    protected abstract int getExtendedForecastResourceId();

    protected abstract int getNowResourceId();

    protected PendingIntent getOpenMainAppAlertsPendingIntent(int i)
    {
        return getPendingIntent(ClockWidgetPendingIntentAction.OpenAlertsFullApp.getRequestCode(i), getTermsAndConditionsPendingIntentClass(), widgetLocationKey, MainContentPage.Now);
    }

    protected PendingIntent getOpenMainAppDailyPendingIntent(int i)
    {
        return getPendingIntent(ClockWidgetPendingIntentAction.OpenDailyFullApp.getRequestCode(i), getTermsAndConditionsPendingIntentClass(), widgetLocationKey, MainContentPage.Forecast);
    }

    protected PendingIntent getOpenMainAppNowPendingIntent(int i)
    {
        return getPendingIntent(ClockWidgetPendingIntentAction.OpenNowFullApp.getRequestCode(i), getTermsAndConditionsPendingIntentClass(), widgetLocationKey, MainContentPage.Now);
    }

    protected PendingIntent getOpenWidgetConfigurationPendingIntent(int i)
    {
        Intent intent = new Intent(context, getWidgetConfigurationActivityClass());
        intent.addFlags(0x10000000);
        intent.addFlags(32768);
        intent.putExtra("appWidgetId", i);
        i = ClockWidgetPendingIntentAction.OpenWidgetConfiguration.getRequestCode(i);
        return PendingIntent.getActivity(context, i, intent, 0x8000000);
    }

    protected PendingIntent getPendingIntent(int i, Class class1, String s, MainContentPage maincontentpage)
    {
        class1 = new Intent(context, class1);
        class1.addFlags(0x10000000);
        class1.addFlags(32768);
        class1.putExtra("location_code", s);
        class1.putExtra("page_index_from_widget", maincontentpage);
        return PendingIntent.getActivity(context, i, class1, 0x8000000);
    }

    protected Class getTermsAndConditionsPendingIntentClass()
    {
        if (Utilities.isAndroidLite())
        {
            return com/accuweather/android/LiteTermsAndConditionsActivity;
        }
        Class class1;
        try
        {
            class1 = Class.forName("com.accuweather.android.TermsAndConditionsActivity");
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            throw new RuntimeException("Couldn't instantiate TermsAndConditions pending intent class.");
        }
        return class1;
    }

    protected abstract Class getWidgetConfigurationActivityClass();

    public void setContext(Context context1)
    {
        context = context1;
    }

    public void setWidgetLocationKey(String s)
    {
        widgetLocationKey = s;
    }
}
