// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appevents;


// Referenced classes of package com.facebook.appevents:
//            AppEventsLogger

static final class val.sourceApplicationInfo
    implements Runnable
{

    final long val$eventTime;
    final AppEventsLogger val$logger;
    final String val$sourceApplicationInfo;

    public void run()
    {
        AppEventsLogger.access$100(val$logger, val$eventTime, val$sourceApplicationInfo);
    }

    (AppEventsLogger appeventslogger, long l, String s)
    {
        val$logger = appeventslogger;
        val$eventTime = l;
        val$sourceApplicationInfo = s;
        super();
    }
}
