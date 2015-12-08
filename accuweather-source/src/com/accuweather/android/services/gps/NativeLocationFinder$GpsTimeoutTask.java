// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.gps;

import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.accuweather.android.services.gps:
//            NativeLocationFinder

protected class _listener extends TimerTask
{

    stener _listener;
    Timer _timer;
    final NativeLocationFinder this$0;

    public void run()
    {
        _timer.cancel();
        _listener.onTimeout();
    }

    void setTimer(Timer timer)
    {
        _timer = timer;
    }

    public stener(Timer timer, stener stener)
    {
        this$0 = NativeLocationFinder.this;
        super();
        _timer = timer;
        _listener = stener;
    }
}
