// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.android;

import android.content.Context;
import com.flurry.sdk.cx;
import com.flurry.sdk.dl;
import com.flurry.sdk.dn;
import com.flurry.sdk.dp;
import com.flurry.sdk.dq;
import com.flurry.sdk.el;
import java.util.Map;

public final class FlurryAgent
{

    private static final String a = com/flurry/android/FlurryAgent.getSimpleName();

    private FlurryAgent()
    {
    }

    public static int getAgentVersion()
    {
        return dn.a().b();
    }

    public static void logEvent(String s)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            el.b(a, "Device SDK Version older than 10");
            return;
        }
        if (s == null)
        {
            el.b(a, "String eventId passed to logEvent was null.");
            return;
        }
        try
        {
            cx.a().a(s);
            return;
        }
        catch (Throwable throwable)
        {
            el.a(a, (new StringBuilder("Failed to log event: ")).append(s).toString(), throwable);
        }
    }

    public static void logEvent(String s, Map map)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            el.b(a, "Device SDK Version older than 10");
            return;
        }
        if (s == null)
        {
            el.b(a, "String eventId passed to logEvent was null.");
            return;
        }
        if (map == null)
        {
            el.b(a, "String parameters passed to logEvent was null.");
            return;
        }
        try
        {
            cx.a().a(s, map);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            el.a(a, (new StringBuilder("Failed to log event: ")).append(s).toString(), map);
        }
    }

    public static void onEndSession(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            el.b(a, "Device SDK Version older than 10");
            return;
        }
        if (context == null)
        {
            throw new NullPointerException("Null context");
        }
        try
        {
            dl.a().a(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            el.a(a, "", context);
        }
    }

    public static void onError(String s, String s1, Throwable throwable)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            el.b(a, "Device SDK Version older than 10");
            return;
        }
        if (s == null)
        {
            el.b(a, "String errorId passed to onError was null.");
            return;
        }
        if (s1 == null)
        {
            el.b(a, "String message passed to onError was null.");
            return;
        }
        if (throwable == null)
        {
            el.b(a, "Throwable passed to onError was null.");
            return;
        }
        try
        {
            cx.a().a(s, s1, throwable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            el.a(a, "", s);
        }
    }

    public static void onStartSession(Context context, String s)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            el.b(a, "Device SDK Version older than 10");
            return;
        }
        if (context == null)
        {
            throw new NullPointerException("Null context");
        }
        if (s == null || s.length() == 0)
        {
            throw new IllegalArgumentException("Api key not specified");
        }
        try
        {
            dl.a().a(context, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            el.a(a, "", context);
        }
    }

    public static void setReportLocation(boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            el.b(a, "Device SDK Version older than 10");
            return;
        } else
        {
            dp.a().a("ReportLocation", Boolean.valueOf(flag));
            return;
        }
    }

    public static void setUseHttps(boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            el.b(a, "Device SDK Version older than 10");
            return;
        } else
        {
            dp.a().a("UseHttps", Boolean.valueOf(flag));
            return;
        }
    }

}
