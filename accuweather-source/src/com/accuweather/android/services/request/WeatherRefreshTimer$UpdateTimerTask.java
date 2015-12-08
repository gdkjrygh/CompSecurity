// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.request;

import android.os.SystemClock;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.services.RefreshService;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import java.util.TimerTask;

// Referenced classes of package com.accuweather.android.services.request:
//            WeatherRefreshTimer

private class <init> extends TimerTask
{

    final WeatherRefreshTimer this$0;

    private void callRefreshService(WeatherDataModel weatherdatamodel, boolean flag)
    {
        if (weatherdatamodel.isResultOfGpsSearch())
        {
            Logger.d(getClass().getName(), "*** In run(), about to do a follow me timer update.");
            WeatherRefreshTimer.access$500(WeatherRefreshTimer.this).refreshFollowMeForTimer(flag);
            return;
        } else
        {
            Logger.d(getClass().getName(), "*** In run(), about to do a 'normal' timer update.");
            WeatherRefreshTimer.access$500(WeatherRefreshTimer.this).refreshForTimer(weatherdatamodel.getLocationKey(), flag);
            return;
        }
    }

    public void run()
    {
        WeatherDataModel weatherdatamodel = WeatherRefreshTimer.access$100(WeatherRefreshTimer.this).getCurrentlyViewedWeatherDataModel();
        if (weatherdatamodel == null) goto _L2; else goto _L1
_L1:
        long l = SystemClock.elapsedRealtime() - WeatherRefreshTimer.access$200(WeatherRefreshTimer.this);
        if (!WeatherRefreshTimer.access$300(WeatherRefreshTimer.this)) goto _L4; else goto _L3
_L3:
        if (l >= WeatherRefreshTimer.access$400() * 5L) goto _L6; else goto _L5
_L5:
        callRefreshService(weatherdatamodel, true);
_L2:
        return;
_L6:
        WeatherRefreshTimer.access$202(WeatherRefreshTimer.this, SystemClock.elapsedRealtime());
        callRefreshService(weatherdatamodel, false);
        return;
_L4:
        if (l >= WeatherRefreshTimer.access$400() * 5L)
        {
            WeatherRefreshTimer.access$202(WeatherRefreshTimer.this, SystemClock.elapsedRealtime());
            callRefreshService(weatherdatamodel, false);
            return;
        }
        if (true) goto _L2; else goto _L7
_L7:
    }

    private ()
    {
        this$0 = WeatherRefreshTimer.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
