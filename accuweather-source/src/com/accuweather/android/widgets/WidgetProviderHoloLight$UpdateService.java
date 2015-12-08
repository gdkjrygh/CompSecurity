// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.accuweather.android.models.location.LocationSearch;
import com.accuweather.android.utilities.Data;
import java.util.List;

// Referenced classes of package com.accuweather.android.widgets:
//            WidgetProviderHoloLight, HoloLightContentUpdater, HoloUiBuilder

public static class mHoloLightContentUpdater extends Service
    implements com.accuweather.android.utilities.oloLightContentUpdater
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
        WidgetProviderHoloLight.access$000(this).registerWeatherDataListener(this);
    }

    public void onDestroy()
    {
        WidgetProviderHoloLight.access$000(this).unregisterWeatherDataListener(this);
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

    public ()
    {
        mHoloLightContentUpdater = new HoloLightContentUpdater();
    }
}
