// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

public final class t
{

    public static boolean a = false;
    private static t n;
    private static final Object o = new Object();
    private final int b;
    private final int c;
    private final int d;
    private final boolean e;
    private final boolean f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final boolean m;

    private t(Bundle bundle)
    {
        boolean flag = true;
        super();
        a = bundle.getBoolean("com.mixpanel.android.MPConfig.EnableDebugLogging", false);
        if (bundle.containsKey("com.mixpanel.android.MPConfig.AutoCheckForSurveys"))
        {
            Log.w("MixpanelAPI.MPConfig", "com.mixpanel.android.MPConfig.AutoCheckForSurveys has been deprecated in favor of com.mixpanel.android.MPConfig.AutoShowMixpanelUpdates. Please update this key as soon as possible.");
        }
        b = bundle.getInt("com.mixpanel.android.MPConfig.BulkUploadLimit", 40);
        c = bundle.getInt("com.mixpanel.android.MPConfig.FlushInterval", 60000);
        d = bundle.getInt("com.mixpanel.android.MPConfig.DataExpiration", 0x19bfcc00);
        e = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableFallback", true);
        boolean flag1 = bundle.getBoolean("com.mixpanel.android.MPConfig.AutoCheckForSurveys", true);
        boolean flag2 = bundle.getBoolean("com.mixpanel.android.MPConfig.AutoShowMixpanelUpdates", true);
        String s;
        String s1;
        if (!flag1 || !flag2)
        {
            flag = false;
        }
        m = flag;
        f = bundle.getBoolean("com.mixpanel.android.MPConfig.TestMode", false);
        s1 = bundle.getString("com.mixpanel.android.MPConfig.EventsEndpoint");
        s = s1;
        if (s1 == null)
        {
            s = "https://api.mixpanel.com/track?ip=1";
        }
        g = s;
        s1 = bundle.getString("com.mixpanel.android.MPConfig.EventsFallbackEndpoint");
        s = s1;
        if (s1 == null)
        {
            s = "http://api.mixpanel.com/track?ip=1";
        }
        h = s;
        s1 = bundle.getString("com.mixpanel.android.MPConfig.PeopleEndpoint");
        s = s1;
        if (s1 == null)
        {
            s = "https://api.mixpanel.com/engage";
        }
        i = s;
        s1 = bundle.getString("com.mixpanel.android.MPConfig.PeopleFallbackEndpoint");
        s = s1;
        if (s1 == null)
        {
            s = "http://api.mixpanel.com/engage";
        }
        j = s;
        s1 = bundle.getString("com.mixpanel.android.MPConfig.DecideEndpoint");
        s = s1;
        if (s1 == null)
        {
            s = "https://decide.mixpanel.com/decide";
        }
        k = s;
        s = bundle.getString("com.mixpanel.android.MPConfig.DecideFallbackEndpoint");
        bundle = s;
        if (s == null)
        {
            bundle = "http://decide.mixpanel.com/decide";
        }
        l = bundle;
        if (a)
        {
            (new StringBuilder("Mixpanel configured with:\n    AutoShowMixpanelUpdates ")).append(m).append("\n    BulkUploadLimit ").append(b).append("\n    FlushInterval ").append(c).append("\n    DataExpiration ").append(d).append("\n    DisableFallback ").append(e).append("\n    EnableDebugLogging ").append(a).append("\n    TestMode ").append(f).append("\n    EventsEndpoint ").append(g).append("\n    PeopleEndpoint ").append(i).append("\n    DecideEndpoint ").append(k).append("\n    EventsFallbackEndpoint ").append(h).append("\n    PeopleFallbackEndpoint ").append(j).append("\n    DecideFallbackEndpoint ").append(l).append("\n");
        }
    }

    public static t a(Context context)
    {
        synchronized (o)
        {
            if (n == null)
            {
                n = b(context.getApplicationContext());
            }
        }
        return n;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private static t b(Context context)
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
            throw new RuntimeException((new StringBuilder("Can't configure Mixpanel with package name ")).append(s).toString(), context);
        }
        context = bundle;
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        context = new Bundle();
        context = new t(context);
        return context;
    }

    public final int a()
    {
        return b;
    }

    public final int b()
    {
        return c;
    }

    public final int c()
    {
        return d;
    }

    public final boolean d()
    {
        return e;
    }

    public final boolean e()
    {
        return f;
    }

    public final String f()
    {
        return g;
    }

    public final String g()
    {
        return i;
    }

    public final String h()
    {
        return k;
    }

    public final String i()
    {
        return h;
    }

    public final String j()
    {
        return j;
    }

    public final String k()
    {
        return l;
    }

    public final boolean l()
    {
        return m;
    }

}
