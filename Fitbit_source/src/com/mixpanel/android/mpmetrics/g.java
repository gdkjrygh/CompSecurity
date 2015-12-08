// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

public class g
{

    private static final String A = "MixpanelAPI.Conf";
    public static final String a = "4.6.0";
    public static boolean b = false;
    public static final int c = 16;
    static final String d = "com.mixpanel.android.mpmetrics.ReferralInfo";
    static final int e = 2;
    private static g y;
    private static final Object z = new Object();
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final String p;
    private final String q;
    private final String r;
    private final String s;
    private final String t;
    private final String u;
    private final boolean v;
    private final String w;
    private final String x;

    g(Bundle bundle, Context context)
    {
        boolean flag = true;
        super();
        b = bundle.getBoolean("com.mixpanel.android.MPConfig.EnableDebugLogging", false);
        if (bundle.containsKey("com.mixpanel.android.MPConfig.AutoCheckForSurveys"))
        {
            Log.w("MixpanelAPI.Conf", "com.mixpanel.android.MPConfig.AutoCheckForSurveys has been deprecated in favor of com.mixpanel.android.MPConfig.AutoShowMixpanelUpdates. Please update this key as soon as possible.");
        }
        f = bundle.getInt("com.mixpanel.android.MPConfig.BulkUploadLimit", 40);
        g = bundle.getInt("com.mixpanel.android.MPConfig.FlushInterval", 60000);
        h = bundle.getInt("com.mixpanel.android.MPConfig.DebugFlushInterval", 1000);
        i = bundle.getInt("com.mixpanel.android.MPConfig.DataExpiration", 0x19bfcc00);
        j = bundle.getInt("com.mixpanel.android.MPConfig.MinimumDatabaseLimit", 0x1400000);
        k = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableFallback", true);
        x = bundle.getString("com.mixpanel.android.MPConfig.ResourcePackageName");
        m = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableGestureBindingUI", false);
        n = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableEmulatorBindingUI", false);
        o = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableAppOpenEvent", true);
        boolean flag1 = bundle.getBoolean("com.mixpanel.android.MPConfig.AutoCheckForSurveys", true);
        boolean flag2 = bundle.getBoolean("com.mixpanel.android.MPConfig.AutoShowMixpanelUpdates", true);
        String s1;
        String s2;
        if (!flag1 || !flag2)
        {
            flag = false;
        }
        v = flag;
        l = bundle.getBoolean("com.mixpanel.android.MPConfig.TestMode", false);
        s2 = bundle.getString("com.mixpanel.android.MPConfig.EventsEndpoint");
        s1 = s2;
        if (s2 == null)
        {
            s1 = "https://api.mixpanel.com/track?ip=1";
        }
        p = s1;
        s2 = bundle.getString("com.mixpanel.android.MPConfig.EventsFallbackEndpoint");
        s1 = s2;
        if (s2 == null)
        {
            s1 = "http://api.mixpanel.com/track?ip=1";
        }
        q = s1;
        s2 = bundle.getString("com.mixpanel.android.MPConfig.PeopleEndpoint");
        s1 = s2;
        if (s2 == null)
        {
            s1 = "https://api.mixpanel.com/engage";
        }
        r = s1;
        s2 = bundle.getString("com.mixpanel.android.MPConfig.PeopleFallbackEndpoint");
        s1 = s2;
        if (s2 == null)
        {
            s1 = "http://api.mixpanel.com/engage";
        }
        s = s1;
        s2 = bundle.getString("com.mixpanel.android.MPConfig.DecideEndpoint");
        s1 = s2;
        if (s2 == null)
        {
            s1 = "https://decide.mixpanel.com/decide";
        }
        t = s1;
        s2 = bundle.getString("com.mixpanel.android.MPConfig.DecideFallbackEndpoint");
        s1 = s2;
        if (s2 == null)
        {
            s1 = "http://decide.mixpanel.com/decide";
        }
        u = s1;
        s1 = bundle.getString("com.mixpanel.android.MPConfig.EditorUrl");
        bundle = s1;
        if (s1 == null)
        {
            bundle = "wss://switchboard.mixpanel.com/connect/";
        }
        w = bundle;
        if (b)
        {
            Log.v("MixpanelAPI.Conf", (new StringBuilder()).append("Mixpanel configured with:\n    AutoShowMixpanelUpdates ").append(p()).append("\n").append("    BulkUploadLimit ").append(a()).append("\n").append("    FlushInterval ").append(b(context)).append("\n").append("    DataExpiration ").append(c()).append("\n").append("    MinimumDatabaseLimit ").append(d()).append("\n").append("    DisableFallback ").append(e()).append("\n").append("    DisableAppOpenEvent ").append(h()).append("\n").append("    DisableDeviceUIBinding ").append(f()).append("\n").append("    DisableEmulatorUIBinding ").append(g()).append("\n").append("    EnableDebugLogging ").append(b).append("\n").append("    TestMode ").append(i()).append("\n").append("    EventsEndpoint ").append(j()).append("\n").append("    PeopleEndpoint ").append(k()).append("\n").append("    DecideEndpoint ").append(l()).append("\n").append("    EventsFallbackEndpoint ").append(m()).append("\n").append("    PeopleFallbackEndpoint ").append(n()).append("\n").append("    DecideFallbackEndpoint ").append(o()).append("\n").append("    EditorUrl ").append(q()).append("\n").toString());
        }
    }

    public static g a(Context context)
    {
        synchronized (z)
        {
            if (y == null)
            {
                y = c(context.getApplicationContext());
            }
        }
        return y;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static g c(Context context)
    {
        String s1 = context.getPackageName();
        Bundle bundle;
        Bundle bundle1;
        try
        {
            bundle1 = context.getPackageManager().getApplicationInfo(s1, 128).metaData;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException((new StringBuilder()).append("Can't configure Mixpanel with package name ").append(s1).toString(), context);
        }
        bundle = bundle1;
        if (bundle1 != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        bundle = new Bundle();
        context = new g(bundle, context);
        return context;
    }

    public int a()
    {
        return f;
    }

    public int b()
    {
        return b(null);
    }

    public int b(Context context)
    {
        boolean flag;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        context = context.getApplicationInfo();
        int i1 = ((ApplicationInfo) (context)).flags & 2;
        context.flags = i1;
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        flag = true;
_L1:
        if (flag)
        {
            return h;
        } else
        {
            return g;
        }
        flag = false;
          goto _L1
    }

    public int c()
    {
        return i;
    }

    public int d()
    {
        return j;
    }

    public boolean e()
    {
        return k;
    }

    public boolean f()
    {
        return m;
    }

    public boolean g()
    {
        return n;
    }

    public boolean h()
    {
        return o;
    }

    public boolean i()
    {
        return l;
    }

    public String j()
    {
        return p;
    }

    public String k()
    {
        return r;
    }

    public String l()
    {
        return t;
    }

    public String m()
    {
        return q;
    }

    public String n()
    {
        return s;
    }

    public String o()
    {
        return u;
    }

    public boolean p()
    {
        return v;
    }

    public String q()
    {
        return w;
    }

    public String r()
    {
        return x;
    }

    static 
    {
        b = false;
    }
}
