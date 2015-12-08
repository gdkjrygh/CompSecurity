// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ak, a, ap

public final class ar
{

    public static final ak A = ak.a("gads:interstitial_follow_url:experiment_id");
    public static final ak B = ak.a("gads:analytics_enabled", Boolean.valueOf(true));
    public static final ak C = ak.a("gads:ad_key_enabled", Boolean.valueOf(false));
    public static final ak D = ak.a("gads:webview_cache_version", 0);
    public static final ak a = ak.a("gads:sdk_core_experiment_id");
    public static final ak b = ak.a("gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");
    public static final ak c = ak.a("gads:request_builder:singleton_webview", Boolean.valueOf(false));
    public static final ak d = ak.a("gads:request_builder:singleton_webview_experiment_id");
    public static final ak e = ak.a("gads:sdk_crash_report_enabled", Boolean.valueOf(false));
    public static final ak f = ak.a("gads:sdk_crash_report_full_stacktrace", Boolean.valueOf(false));
    public static final ak g = ak.a("gads:block_autoclicks", Boolean.valueOf(false));
    public static final ak h = ak.a("gads:block_autoclicks_experiment_id");
    public static final ak i = ak.a("gads:prefetch:experiment_id");
    public static final ak j = ak.a("gads:spam_app_context:experiment_id");
    public static final ak k = ak.a("gads:spam_app_context:enabled", Boolean.valueOf(false));
    public static final ak l = ak.a("gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");
    public static final ak m = ak.a("gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");
    public static final ak n = ak.a("gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");
    public static final ak o = ak.a("gads:enabled_sdk_csi", Boolean.valueOf(false));
    public static ak p = ak.a("gads:sdk_csi_batch_size", 20);
    public static ak q = ak.a("gads:sdk_csi_server", "https://csi.gstatic.com/csi");
    public static final ak r = ak.a("gads:enable_content_fetching", Boolean.valueOf(false));
    public static final ak s = ak.a("gads:content_length_weight", 1);
    public static final ak t = ak.a("gads:content_age_weight", 1);
    public static final ak u = ak.a("gads:min_content_len", 11);
    public static final ak v = ak.a("gads:fingerprint_number", 10);
    public static final ak w = ak.a("gads:sleep_sec", 10);
    public static final ak x = ak.a("gads:kitkat_interstitial_workaround:experiment_id");
    public static final ak y = ak.a("gads:kitkat_interstitial_workaround:enabled", Boolean.valueOf(true));
    public static final ak z = ak.a("gads:interstitial_follow_url", Boolean.valueOf(true));

    public static List a()
    {
        Object obj = com.google.android.gms.internal.a.g();
        ArrayList arraylist = new ArrayList();
        obj = ((ap) (obj)).b.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s1 = (String)((ak)((Iterator) (obj)).next()).c();
            if (s1 != null)
            {
                arraylist.add(s1);
            }
        } while (true);
        return arraylist;
    }

}
