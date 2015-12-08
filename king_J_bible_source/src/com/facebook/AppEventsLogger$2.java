// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            AppEventsLogger

class val.eventTime
    implements Runnable
{

    private final long val$eventTime;
    private final AppEventsLogger val$logger;

    public void run()
    {
        AppEventsLogger.access$4(val$logger, val$eventTime);
    }

    ()
    {
        val$logger = appeventslogger;
        val$eventTime = l;
        super();
    }
}
