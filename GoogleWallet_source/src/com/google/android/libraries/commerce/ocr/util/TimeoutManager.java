// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.util;

import android.util.Log;
import java.util.Timer;
import java.util.TimerTask;

public class TimeoutManager
{

    private final long defaultTimeoutInMs;
    private final Timer timer;

    public TimeoutManager(long l)
    {
        this(new Timer(com/google/android/libraries/commerce/ocr/util/TimeoutManager.getName(), true), l);
    }

    private TimeoutManager(Timer timer1, long l)
    {
        timer = timer1;
        defaultTimeoutInMs = l;
    }

    public final boolean startTimeout(TimerTask timertask)
    {
        return startTimeout(timertask, defaultTimeoutInMs);
    }

    public final boolean startTimeout(TimerTask timertask, long l)
    {
        try
        {
            timer.schedule(timertask, l);
        }
        // Misplaced declaration of an exception variable
        catch (TimerTask timertask)
        {
            Log.d("TimeoutManager", "timer already cancelled or task already scheduled.");
            return false;
        }
        return true;
    }

    public final void stopTimeout()
    {
        timer.purge();
        timer.cancel();
    }
}
