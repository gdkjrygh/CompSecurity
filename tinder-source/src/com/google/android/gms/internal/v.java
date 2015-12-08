// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            r, s, u

public final class v
{

    public static final r A = com.google.android.gms.internal.r.a("gads:looper_for_gms_client:enabled", Boolean.valueOf(true));
    public static final r B = com.google.android.gms.internal.r.a("gads:sw_ad_request_service:enabled", Boolean.valueOf(true));
    public static final r C = com.google.android.gms.internal.r.a("gads:sw_dynamite:enabled", Boolean.valueOf(true));
    public static final r D = com.google.android.gms.internal.r.a("gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");
    public static final r E = com.google.android.gms.internal.r.a("gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");
    public static final r F = com.google.android.gms.internal.r.a("gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");
    public static final r G = com.google.android.gms.internal.r.a("gads:enabled_sdk_csi", Boolean.valueOf(false));
    public static final r H = com.google.android.gms.internal.r.a("gads:sdk_csi_server", "https://csi.gstatic.com/csi");
    public static final r I = com.google.android.gms.internal.r.a("gads:sdk_csi_write_to_file", Boolean.valueOf(false));
    public static final r J = com.google.android.gms.internal.r.a("gads:enable_content_fetching", Boolean.valueOf(true));
    public static final r K = com.google.android.gms.internal.r.a("gads:content_length_weight", 1);
    public static final r L = com.google.android.gms.internal.r.a("gads:content_age_weight", 1);
    public static final r M = com.google.android.gms.internal.r.a("gads:min_content_len", 11);
    public static final r N = com.google.android.gms.internal.r.a("gads:fingerprint_number", 10);
    public static final r O = com.google.android.gms.internal.r.a("gads:sleep_sec", 10);
    public static final r P = com.google.android.gms.internal.r.a("gad:app_index_enabled", Boolean.valueOf(true));
    public static final r Q = com.google.android.gms.internal.r.a("gads:kitkat_interstitial_workaround:experiment_id");
    public static final r R = com.google.android.gms.internal.r.a("gads:kitkat_interstitial_workaround:enabled", Boolean.valueOf(true));
    public static final r S = com.google.android.gms.internal.r.a("gads:interstitial_follow_url", Boolean.valueOf(true));
    public static final r T = com.google.android.gms.internal.r.a("gads:interstitial_follow_url:register_click", Boolean.valueOf(true));
    public static final r U = com.google.android.gms.internal.r.a("gads:interstitial_follow_url:experiment_id");
    public static final r V = com.google.android.gms.internal.r.a("gads:analytics_enabled", Boolean.valueOf(true));
    public static final r W = com.google.android.gms.internal.r.a("gads:ad_key_enabled", Boolean.valueOf(false));
    public static final r X = com.google.android.gms.internal.r.a("gads:webview_cache_version", 0);
    public static final r Y = com.google.android.gms.internal.r.b("gads:pan:experiment_id");
    public static final r Z = com.google.android.gms.internal.r.a("gads:native:engine_url", "//googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
    public static final r a = com.google.android.gms.internal.r.a("gads:sdk_core_experiment_id");
    public static final r aa = com.google.android.gms.internal.r.a("gads:ad_manager_creator:enabled", Boolean.valueOf(true));
    public static final r ab = com.google.android.gms.internal.r.a("gads:log:verbose_enabled", Boolean.valueOf(false));
    public static final r ac = com.google.android.gms.internal.r.a("gads:device_info_caching:enabled", Boolean.valueOf(true));
    public static final r ad = com.google.android.gms.internal.r.a("gads:device_info_caching_expiry_ms:expiry", 0x493e0L);
    public static final r ae = com.google.android.gms.internal.r.a("gads:gen204_signals:enabled", Boolean.valueOf(false));
    public static final r af = com.google.android.gms.internal.r.a("gads:webview:error_reporting_enabled", Boolean.valueOf(false));
    public static final r ag = com.google.android.gms.internal.r.a("gads:adid_reporting:enabled", Boolean.valueOf(false));
    public static final r ah = com.google.android.gms.internal.r.a("gads:request_pkg:enabled", Boolean.valueOf(true));
    public static final r ai = com.google.android.gms.internal.r.a("gads:gmsg:disable_back_button:enabled", Boolean.valueOf(false));
    public static final r aj = com.google.android.gms.internal.r.a("gads:network:cache_prediction_duration_s", 300L);
    public static final r ak = com.google.android.gms.internal.r.a("gads:mediation:dynamite_first", Boolean.valueOf(true));
    public static final r al = com.google.android.gms.internal.r.a("gads:ad_loader:timeout_ms", 60000L);
    public static final r am = com.google.android.gms.internal.r.a("gads:rendering:timeout_ms", 60000L);
    public static final r an = com.google.android.gms.internal.r.a("gads:adshield:enable_adshield_instrumentation", Boolean.valueOf(false));
    public static final r ao = com.google.android.gms.internal.r.a("gads:adid_notification:first_party_check:enabled", Boolean.valueOf(true));
    public static final r ap = com.google.android.gms.internal.r.a("gads:support_screen_shot", Boolean.valueOf(true));
    public static final r b = com.google.android.gms.internal.r.a("gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");
    public static final r c = com.google.android.gms.internal.r.a("gads:request_builder:singleton_webview", Boolean.valueOf(false));
    public static final r d = com.google.android.gms.internal.r.a("gads:request_builder:singleton_webview_experiment_id");
    public static final r e = com.google.android.gms.internal.r.a("gads:sdk_use_dynamic_module", Boolean.valueOf(false));
    public static final r f = com.google.android.gms.internal.r.a("gads:sdk_use_dynamic_module_experiment_id");
    public static final r g = com.google.android.gms.internal.r.a("gads:sdk_crash_report_enabled", Boolean.valueOf(false));
    public static final r h = com.google.android.gms.internal.r.a("gads:sdk_crash_report_full_stacktrace", Boolean.valueOf(false));
    public static final r i = com.google.android.gms.internal.r.a("gads:block_autoclicks", Boolean.valueOf(false));
    public static final r j = com.google.android.gms.internal.r.a("gads:block_autoclicks_experiment_id");
    public static final r k = com.google.android.gms.internal.r.b("gads:prefetch:experiment_id");
    public static final r l = com.google.android.gms.internal.r.a("gads:spam_app_context:experiment_id");
    public static final r m = com.google.android.gms.internal.r.a("gads:spam_app_context:enabled", Boolean.valueOf(false));
    public static final r n = com.google.android.gms.internal.r.a("gads:video_stream_cache:experiment_id");
    public static final r o = com.google.android.gms.internal.r.a("gads:video_stream_cache:limit_count", 5);
    public static final r p = com.google.android.gms.internal.r.a("gads:video_stream_cache:limit_space", 0x800000);
    public static final r q = com.google.android.gms.internal.r.a("gads:video_stream_exo_cache:buffer_size", 0x800000);
    public static final r r = com.google.android.gms.internal.r.a("gads:video_stream_cache:limit_time_sec", 300L);
    public static final r s = com.google.android.gms.internal.r.a("gads:video_stream_cache:notify_interval_millis", 1000L);
    public static final r t = com.google.android.gms.internal.r.a("gads:video_stream_cache:connect_timeout_millis", 10000);
    public static final r u = com.google.android.gms.internal.r.a("gads:video:metric_reporting_enabled", Boolean.valueOf(false));
    public static final r v = com.google.android.gms.internal.r.a("gads:video:metric_frame_hash_times", "");
    public static final r w = com.google.android.gms.internal.r.a("gads:video:metric_frame_hash_time_leniency", 500L);
    public static final r x = com.google.android.gms.internal.r.b("gads:spam_ad_id_decorator:experiment_id");
    public static final r y = com.google.android.gms.internal.r.a("gads:spam_ad_id_decorator:enabled", Boolean.valueOf(false));
    public static final r z = com.google.android.gms.internal.r.b("gads:looper_for_gms_client:experiment_id");

    public static List a()
    {
        Object obj = com.google.android.gms.ads.internal.d.h();
        ArrayList arraylist = new ArrayList();
        obj = ((s) (obj)).b.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj1 = (r)((Iterator) (obj)).next();
            obj1 = (String)com.google.android.gms.ads.internal.d.i().a(((r) (obj1)));
            if (obj1 != null)
            {
                arraylist.add(obj1);
            }
        } while (true);
        return arraylist;
    }

}
