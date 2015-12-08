// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.request;

import android.os.SystemClock;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.services.RefreshService;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.PartnerCoding;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class WeatherRefreshTimer
{
    private class UpdateTimerTask extends TimerTask
    {

        final WeatherRefreshTimer this$0;

        private void callRefreshService(WeatherDataModel weatherdatamodel, boolean flag)
        {
            if (weatherdatamodel.isResultOfGpsSearch())
            {
                Logger.d(getClass().getName(), "*** In run(), about to do a follow me timer update.");
                refreshService.refreshFollowMeForTimer(flag);
                return;
            } else
            {
                Logger.d(getClass().getName(), "*** In run(), about to do a 'normal' timer update.");
                refreshService.refreshForTimer(weatherdatamodel.getLocationKey(), flag);
                return;
            }
        }

        public void run()
        {
            WeatherDataModel weatherdatamodel = data.getCurrentlyViewedWeatherDataModel();
            if (weatherdatamodel == null) goto _L2; else goto _L1
_L1:
            long l = SystemClock.elapsedRealtime() - startTime;
            if (!minuteCastFocused) goto _L4; else goto _L3
_L3:
            if (l >= WeatherRefreshTimer.oneMinute * 5L) goto _L6; else goto _L5
_L5:
            callRefreshService(weatherdatamodel, true);
_L2:
            return;
_L6:
            startTime = SystemClock.elapsedRealtime();
            callRefreshService(weatherdatamodel, false);
            return;
_L4:
            if (l >= WeatherRefreshTimer.oneMinute * 5L)
            {
                startTime = SystemClock.elapsedRealtime();
                callRefreshService(weatherdatamodel, false);
                return;
            }
            if (true) goto _L2; else goto _L7
_L7:
        }

        private UpdateTimerTask()
        {
            this$0 = WeatherRefreshTimer.this;
            super();
        }

    }


    private static long oneMinute = 60000L;
    private Data data;
    private long initialExecutionDelayMillis;
    private boolean minuteCastFocused;
    private long refreshIntervalMillis;
    private RefreshService refreshService;
    private long startTime;
    private Timer timer;

    public WeatherRefreshTimer(Data data1)
    {
        initialExecutionDelayMillis = 0L;
        refreshIntervalMillis = 0x668a0L;
        refreshService = new RefreshService();
        minuteCastFocused = false;
        data = data1;
        refreshService.setData(data1);
        refreshService.setPartnerCode(PartnerCoding.getPartnerCodeFromSharedPreferences(data1.getContext()));
    }

    public void setInitialExecutionDelay(long l)
    {
        initialExecutionDelayMillis = l;
    }

    public void setMinuteCastFocused(boolean flag)
    {
        minuteCastFocused = flag;
    }

    public void setRefreshIntervalMillis(long l)
    {
        refreshIntervalMillis = l;
    }

    public void start()
    {
        if (timer != null)
        {
            timer.cancel();
        }
        timer = new Timer();
        Date date = new Date(System.currentTimeMillis() + initialExecutionDelayMillis);
        timer.schedule(new UpdateTimerTask(), date, refreshIntervalMillis);
        startTime = SystemClock.elapsedRealtime();
    }

    public void stop()
    {
        if (timer != null)
        {
            timer.cancel();
        }
    }





/*
    static long access$202(WeatherRefreshTimer weatherrefreshtimer, long l)
    {
        weatherrefreshtimer.startTime = l;
        return l;
    }

*/



}
