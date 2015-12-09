// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            AppEventsLogger

public final class c
    implements Runnable
{

    private AppEventsLogger a;
    private long b;
    private String c;

    public final void run()
    {
        AppEventsLogger.a(a, b, c);
    }

    (AppEventsLogger appeventslogger, long l, String s)
    {
        a = appeventslogger;
        b = l;
        c = s;
        super();
    }
}
