// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal:
//            iy

public final class bn
{

    public static iy ph = a("gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");
    public static iy pi = a("gads:sdk_core_experiment_id", (String)null);
    public static iy pj = c("gads:sdk_crash_report_enabled", false);
    public static iy pk = c("gads:sdk_crash_report_full_stacktrace", false);
    public static iy pl = c("gads:block_autoclicks", false);
    public static iy pm = a("gads:block_autoclicks_experiment_id", (String)null);
    public static iy pn = c("gads:spam_app_context:enabled", false);
    public static iy po = a("gads:spam_app_context:experiment_id", (String)null);
    public static iy pp = c("gads:enable_content_fetching", false);
    public static iy pq = a("gads:content_length_weight", 1);
    public static iy pr = a("gads:content_age_weight", 1);
    public static iy ps = a("gads:min_content_len", 11);
    public static iy pt = a("gads:fingerprint_number", 10);
    public static iy pu = a("gads:sleep_sec", 10);
    private static final Bundle pv = new Bundle();
    private static boolean pw = false;

    private static iy a(String s, int i)
    {
        pv.putInt(s, i);
        return iy.a(s, Integer.valueOf(i));
    }

    private static iy a(String s, String s1)
    {
        pv.putString(s, s1);
        return iy.l(s, s1);
    }

    public static Bundle by()
    {
        return pv;
    }

    private static iy c(String s, boolean flag)
    {
        pv.putBoolean(s, flag);
        return iy.h(s, flag);
    }

    static 
    {
        pw = true;
    }
}
