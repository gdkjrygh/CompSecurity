// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;

import android.os.Handler;

// Referenced classes of package com.accuweather.android:
//            WeatherActivity

private class <init>
    implements Runnable
{

    private static final int TIMEOUT_IN_MILLIS = 30000;
    private static final int UPDATE_INTERVAL_IN_MILLIS = 250;
    private boolean _isGpsSearch;
    private boolean _isRunning;
    int _progress;
    final WeatherActivity this$0;

    public void run()
    {
        _isRunning = true;
        _progress = _progress + 83;
        mHandler.removeCallbacks(this);
        if (_progress < 10000)
        {
            mHandler.postDelayed(this, 250L);
        } else
        if (_isRunning)
        {
            if (_isGpsSearch)
            {
                onGpsTimeout();
                return;
            } else
            {
                onWeatherTimeout();
                return;
            }
        }
    }

    public void setRunning(boolean flag)
    {
        _isRunning = flag;
    }


/*
    static boolean access$102( , boolean flag)
    {
        ._isGpsSearch = flag;
        return flag;
    }

*/

    private _isGpsSearch()
    {
        this$0 = WeatherActivity.this;
        super();
        _isGpsSearch = false;
        _progress = 0;
        _isRunning = false;
    }

    _isRunning(_isRunning _pisrunning)
    {
        this();
    }
}
