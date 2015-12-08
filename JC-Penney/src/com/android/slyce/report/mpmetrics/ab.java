// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

public class ab
{

    public static boolean a = false;
    private static ab s;
    private static final Object t = new Object();
    private final int b;
    private final int c;
    private final int d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private final String n;
    private final String o;
    private final boolean p;
    private final String q;
    private final String r;

    ab(Bundle bundle)
    {
        boolean flag = true;
        super();
        a = bundle.getBoolean("com.mixpanel.android.MPConfig.EnableDebugLogging", false);
        if (bundle.containsKey("com.mixpanel.android.MPConfig.AutoCheckForSurveys"))
        {
            Log.w("MixpanelAPI.Configuration", "com.mixpanel.android.MPConfig.AutoCheckForSurveys has been deprecated in favor of com.mixpanel.android.MPConfig.AutoShowMixpanelUpdates. Please update this key as soon as possible.");
        }
        b = bundle.getInt("com.mixpanel.android.MPConfig.BulkUploadLimit", 40);
        c = bundle.getInt("com.mixpanel.android.MPConfig.FlushInterval", 60000);
        d = bundle.getInt("com.mixpanel.android.MPConfig.DataExpiration", 0x19bfcc00);
        e = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableFallback", true);
        r = bundle.getString("com.mixpanel.android.MPConfig.ResourcePackageName");
        g = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableGestureBindingUI", false);
        h = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableEmulatorBindingUI", false);
        i = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableAppOpenEvent", true);
        boolean flag1 = bundle.getBoolean("com.mixpanel.android.MPConfig.AutoCheckForSurveys", true);
        boolean flag2 = bundle.getBoolean("com.mixpanel.android.MPConfig.AutoShowMixpanelUpdates", true);
        String s1;
        String s2;
        if (!flag1 || !flag2)
        {
            flag = false;
        }
        p = flag;
        f = bundle.getBoolean("com.mixpanel.android.MPConfig.TestMode", false);
        s2 = bundle.getString("com.mixpanel.android.MPConfig.EventsEndpoint");
        s1 = s2;
        if (s2 == null)
        {
            s1 = "https://api.mixpanel.com/track?ip=1";
        }
        j = s1;
        s2 = bundle.getString("com.mixpanel.android.MPConfig.EventsFallbackEndpoint");
        s1 = s2;
        if (s2 == null)
        {
            s1 = "http://api.mixpanel.com/track?ip=1";
        }
        k = s1;
        s2 = bundle.getString("com.mixpanel.android.MPConfig.PeopleEndpoint");
        s1 = s2;
        if (s2 == null)
        {
            s1 = "https://api.mixpanel.com/engage";
        }
        l = s1;
        s2 = bundle.getString("com.mixpanel.android.MPConfig.PeopleFallbackEndpoint");
        s1 = s2;
        if (s2 == null)
        {
            s1 = "http://api.mixpanel.com/engage";
        }
        m = s1;
        s2 = bundle.getString("com.mixpanel.android.MPConfig.DecideEndpoint");
        s1 = s2;
        if (s2 == null)
        {
            s1 = "https://decide.mixpanel.com/decide";
        }
        n = s1;
        s2 = bundle.getString("com.mixpanel.android.MPConfig.DecideFallbackEndpoint");
        s1 = s2;
        if (s2 == null)
        {
            s1 = "http://decide.mixpanel.com/decide";
        }
        o = s1;
        s1 = bundle.getString("com.mixpanel.android.MPConfig.EditorUrl");
        bundle = s1;
        if (s1 == null)
        {
            bundle = "wss://switchboard.mixpanel.com/connect/";
        }
        q = bundle;
        if (a)
        {
            Log.v("MixpanelAPI.Configuration", (new StringBuilder()).append("Mixpanel configured with:\n    AutoShowMixpanelUpdates ").append(o()).append("\n").append("    BulkUploadLimit ").append(a()).append("\n").append("    FlushInterval ").append(b()).append("\n").append("    DataExpiration ").append(c()).append("\n").append("    DisableFallback ").append(d()).append("\n").append("    DisableAppOpenEvent ").append(g()).append("\n").append("    DisableDeviceUIBinding ").append(e()).append("\n").append("    DisableEmulatorUIBinding ").append(f()).append("\n").append("    EnableDebugLogging ").append(a).append("\n").append("    TestMode ").append(h()).append("\n").append("    EventsEndpoint ").append(i()).append("\n").append("    PeopleEndpoint ").append(j()).append("\n").append("    DecideEndpoint ").append(k()).append("\n").append("    EventsFallbackEndpoint ").append(l()).append("\n").append("    PeopleFallbackEndpoint ").append(m()).append("\n").append("    DecideFallbackEndpoint ").append(n()).append("\n").append("    EditorUrl ").append(p()).append("\n").toString());
        }
    }

    public static ab a(Context context)
    {
        synchronized (t)
        {
            if (s == null)
            {
                s = b(context.getApplicationContext());
            }
        }
        return s;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static ab b(Context context)
    {
        String s1 = context.getPackageName();
        Bundle bundle;
        try
        {
            bundle = context.getPackageManager().getApplicationInfo(s1, 128).metaData;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException((new StringBuilder()).append("Can't configure Mixpanel with package name ").append(s1).toString(), context);
        }
        context = bundle;
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        context = new Bundle();
        context = new ab(context);
        return context;
    }

    public int a()
    {
        return b;
    }

    public int b()
    {
        return c;
    }

    public int c()
    {
        return d;
    }

    public boolean d()
    {
        return e;
    }

    public boolean e()
    {
        return g;
    }

    public boolean f()
    {
        return h;
    }

    public boolean g()
    {
        return i;
    }

    public boolean h()
    {
        return f;
    }

    public String i()
    {
        return j;
    }

    public String j()
    {
        return l;
    }

    public String k()
    {
        return n;
    }

    public String l()
    {
        return k;
    }

    public String m()
    {
        return m;
    }

    public String n()
    {
        return o;
    }

    public boolean o()
    {
        return p;
    }

    public String p()
    {
        return q;
    }

    public String q()
    {
        return r;
    }

}
