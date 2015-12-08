// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal:
//            iv

public final class bn
{

    public static iv oX = a("gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");
    public static iv oY = a("gads:sdk_core_experiment_id", (String)null);
    public static iv oZ = c("gads:sdk_crash_report_enabled", false);
    public static iv pa = c("gads:sdk_crash_report_full_stacktrace", false);
    public static iv pb = c("gads:block_autoclicks", false);
    public static iv pc = a("gads:block_autoclicks_experiment_id", (String)null);
    public static iv pd = c("gads:enable_content_fetching", false);
    public static iv pe = a("gads:content_length_weight", 1);
    public static iv pf = a("gads:content_age_weight", 1);
    public static iv pg = a("gads:min_content_len", 11);
    public static iv ph = a("gads:fingerprint_number", 10);
    public static iv pi = a("gads:sleep_sec", 10);
    private static final Bundle pj = new Bundle();
    private static boolean pk = false;

    private static iv a(String s, int i)
    {
        pj.putInt(s, i);
        return iv.a(s, Integer.valueOf(i));
    }

    private static iv a(String s, String s1)
    {
        pj.putString(s, s1);
        return iv.m(s, s1);
    }

    public static Bundle bs()
    {
        return pj;
    }

    private static iv c(String s, boolean flag)
    {
        pj.putBoolean(s, flag);
        return iv.g(s, flag);
    }

    static 
    {
        pk = true;
    }
}
