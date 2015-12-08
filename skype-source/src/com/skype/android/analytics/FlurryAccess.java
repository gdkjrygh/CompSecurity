// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;

import android.content.Context;
import com.flurry.android.FlurryAgent;
import com.skype.telemetry.sdk.FlurryAccessInterface;
import java.util.Map;

public class FlurryAccess
    implements FlurryAccessInterface
{

    private String a;

    public FlurryAccess(String s)
    {
        a = s;
    }

    public static void a()
    {
        FlurryAgent.setContinueSessionMillis(60000L);
    }

    public static void a(String s)
    {
        FlurryAgent.setReportUrl(s);
    }

    public static void b()
    {
        FlurryAgent.setCaptureUncaughtExceptions(false);
    }

    public static void c()
    {
        FlurryAgent.setLogEnabled(false);
    }

    public static void d()
    {
        FlurryAgent.setUseHttps(true);
    }

    public static void e()
    {
        FlurryAgent.setReportLocation(false);
    }

    public final void a(Context context)
    {
        FlurryAgent.onStartSession(context, a);
    }

    public final void a(String s, Map map, boolean flag)
    {
        FlurryAgent.logEvent(s, map, flag);
    }

    public final void b(Context context)
    {
        FlurryAgent.onEndSession(context);
    }

    public final void b(String s)
    {
        FlurryAgent.logEvent(s);
    }

    public final void c(String s)
    {
        FlurryAgent.endTimedEvent(s);
    }
}
