// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.analytics.platforms.fitbit;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

final class b
{

    public static boolean a = false;
    private static final String b = "FitbitAnalyticsConfig";
    private static b e;
    private static final Object f = new Object();
    private final int c;
    private final int d;

    private b(Bundle bundle)
    {
        a = bundle.getBoolean("com.fitbit.platforms.fitbit.FitbitAnalyticsConfig.EnableDebugLogging", false);
        c = bundle.getInt("com.fitbit.platforms.fitbit.FitbitAnalyticsConfig.FlushInterval", 60000);
        d = bundle.getInt("com.fitbit.platforms.fitbit.FitbitAnalyticsConfig.DataExpiration", 0x19bfcc00);
        if (a)
        {
            Log.d("FitbitAnalyticsConfig", (new StringBuilder()).append("FitbitAnalytics configured with:\n    FlushInterval ").append(a()).append("\n").append("    DataExpiration ").append(b()).append("\n").append("    EnableDebugLogging ").append(a).append("\n").toString());
        }
    }

    public static b a(Context context)
    {
        synchronized (f)
        {
            if (e == null)
            {
                e = b(context.getApplicationContext());
            }
        }
        return e;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private static b b(Context context)
    {
        String s = context.getPackageName();
        Bundle bundle;
        try
        {
            bundle = context.getPackageManager().getApplicationInfo(s, 128).metaData;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException((new StringBuilder()).append("Can't configure FitbitAnalytics with package name ").append(s).toString(), context);
        }
        context = bundle;
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        context = new Bundle();
        context = new b(context);
        return context;
    }

    public int a()
    {
        return c;
    }

    public int b()
    {
        return d;
    }

    static 
    {
        a = false;
    }
}
