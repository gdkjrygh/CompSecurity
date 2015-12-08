// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets;

import android.app.Service;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.accuweather.android.models.location.LocationSearch;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import com.comscore.analytics.comScore;
import java.util.List;

// Referenced classes of package com.accuweather.android.widgets:
//            HoloLightContentUpdater, HoloUiBuilder

public class WidgetProviderHoloLight extends AppWidgetProvider
{
    public static class UpdateService extends Service
        implements com.accuweather.android.utilities.Data.IWidgetWeatherDataListener
    {

        private HoloLightContentUpdater mHoloLightContentUpdater;

        private void handleStart(Intent intent, int i)
        {
            mHoloLightContentUpdater.handleStart(intent, i, this);
        }

        protected HoloUiBuilder getHoloUiBuilder()
        {
            return new HoloUiBuilder();
        }

        public IBinder onBind(Intent intent)
        {
            return null;
        }

        public void onCreate()
        {
            super.onCreate();
            mHoloLightContentUpdater.setUiBuilder(getHoloUiBuilder());
            WidgetProviderHoloLight.getData(this).registerWeatherDataListener(this);
        }

        public void onDestroy()
        {
            WidgetProviderHoloLight.getData(this).unregisterWeatherDataListener(this);
            super.onDestroy();
        }

        public void onError(Exception exception)
        {
        }

        public void onGpsSearchCompleted(LocationSearch locationsearch, List list)
        {
            mHoloLightContentUpdater.onGpsSearchCompleted(locationsearch, this);
        }

        public void onHomeLocationChanged()
        {
        }

        public void onLocationSearchCompleted(LocationSearch locationsearch, List list)
        {
        }

        public int onStartCommand(Intent intent, int i, int j)
        {
            handleStart(intent, j);
            return 1;
        }

        public void onWeatherCallCompleted(List list, List list1)
        {
        }

        public void onWidgetLocationSearchCompleted(LocationSearch locationsearch)
        {
        }

        public void onWidgetWeatherCallCompleted(List list)
        {
            mHoloLightContentUpdater.onWidgetWeatherCallCompleted(list, this);
        }

        public UpdateService()
        {
            mHoloLightContentUpdater = new HoloLightContentUpdater();
        }
    }


    private static final String APP_WIDGET_MIN_HEIGHT_EXTRA = "appWidgetMinHeight";
    private static final String APP_WIDGET_MIN_WIDTH_EXTRA = "appWidgetMinWidth";
    private static final int INVALID_SIZE = -1;

    public WidgetProviderHoloLight()
    {
    }

    private static Data getData(Context context)
    {
        return Data.getInstance(context);
    }

    private void saveNewWidgetDimensions(Context context, int i, Bundle bundle)
    {
        int j = -1;
        int k = -1;
        if (bundle.containsKey("appWidgetMinWidth"))
        {
            j = bundle.getInt("appWidgetMinWidth");
        }
        if (bundle.containsKey("appWidgetMinHeight"))
        {
            k = bundle.getInt("appWidgetMinHeight");
        }
        HoloLightContentUpdater.saveWidgetDimensions(context, i, j, k);
    }

    protected Class getProviderClass()
    {
        return getClass();
    }

    protected Class getUpdateServiceClass()
    {
        return com/accuweather/android/widgets/WidgetProviderHoloLight$UpdateService;
    }

    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appwidgetmanager, int i, Bundle bundle)
    {
        Logger.i(getClass().getName(), "In onAppWidgetOptionsChanged().");
        Intent intent = new Intent(context, getUpdateServiceClass());
        intent.setAction("com.accuweather.android.action.WIDGET_RESIZE");
        saveNewWidgetDimensions(context, i, bundle);
        context.startService(intent);
        super.onAppWidgetOptionsChanged(context, appwidgetmanager, i, bundle);
    }

    public void onEnabled(Context context)
    {
        super.onEnabled(context);
        comScore.setAppContext(context);
        comScore.setCustomerC2("6005068");
        comScore.setPublisherSecret("c7d1f7f9920e55503ee3470a942d6341");
        Data.getInstance(context).init();
        Logger.i(getClass().getName(), "In onEnabled().");
    }

    public void onReceive(Context context, Intent intent)
    {
        Logger.i(getClass().getName(), (new StringBuilder()).append("In onReceive(), intent = ").append(intent).toString());
        Intent intent1 = new Intent(context, getUpdateServiceClass());
        intent1.setAction(intent.getAction());
        intent1.putExtras(intent);
        context.startService(intent1);
        super.onReceive(context, intent);
    }

}
