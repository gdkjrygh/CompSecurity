// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appevents;


// Referenced classes of package com.facebook.appevents:
//            AppEventsLogger

static final class b
    implements Runnable
{

    final AppEventsLogger a;
    final long b;

    public final void run()
    {
        AppEventsLogger.a(a, b);
    }

    (AppEventsLogger appeventslogger, long l)
    {
        a = appeventslogger;
        b = l;
        super();
    }
}
