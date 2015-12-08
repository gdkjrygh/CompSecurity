// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.geo;

import java.util.TimerTask;

// Referenced classes of package com.worklight.location.internal.geo:
//            LocationHandler

public class TimeoutTimerTask extends TimerTask
{

    private LocationHandler handler;

    public TimeoutTimerTask(LocationHandler locationhandler)
    {
        handler = locationhandler;
    }

    public void run()
    {
        handler.sendTimeout();
        handler = null;
    }
}
