// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzp;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            cq, cv, cx

public final class cy
{

    public static final cq A = cq.a("gads:looper_for_gms_client:enabled", Boolean.valueOf(true));
    public static final cq B = cq.a("gads:sw_ad_request_service:enabled", Boolean.valueOf(true));
    public static final cq C = cq.a("gads:sw_dynamite:enabled", Boolean.valueOf(true));
    public static final cq D = cq.a("gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");
    public static final cq E = cq.a("gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");
    public static final cq F = cq.a("gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");
    public static final cq G = cq.a("gads:enabled_sdk_csi", Boolean.valueOf(false));
    public static final cq H = cq.a("gads:sdk_csi_server", "https://csi.gstatic.com/csi");
    public static final cq I = cq.a("gads:sdk_csi_write_to_file", Boolean.valueOf(false));
    public static final cq J = cq.a("gads:enable_content_fetching", Boolean.valueOf(true));
    public static final cq K = cq.a("gads:content_length_weight", 1);
    public static final cq L = cq.a("gads:content_age_weight", 1);
    public static final cq M = cq.a("gads:min_content_len", 11);
    public static final cq N = cq.a("gads:fingerprint_number", 10);
    public static final cq O = cq.a("gads:sleep_sec", 10);
    public static final cq P = cq.a("gad:app_index_enabled", Boolean.valueOf(true));
    public static final cq Q = cq.a("gads:kitkat_interstitial_workaround:experiment_id");
    public static final cq R = cq.a("gads:kitkat_interstitial_workaround:enabled", Boolean.valueOf(true));
    public static final cq S = cq.a("gads:interstitial_follow_url", Boolean.valueOf(true));
    public static final cq T = cq.a("gads:interstitial_follow_url:register_click", Boolean.valueOf(true));
    public static final cq U = cq.a("gads:interstitial_follow_url:experiment_id");
    public static final cq V = cq.a("gads:analytics_enabled", Boolean.valueOf(true));
    public static final cq W = cq.a("gads:ad_key_enabled", Boolean.valueOf(false));
    public static final cq X = cq.a("gads:webview_cache_version", 0);
    public static final cq Y = cq.b("gads:pan:experiment_id");
    public static final cq Z = cq.a("gads:native:engine_url", "//googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
    public static final cq a = cq.a("gads:sdk_core_experiment_id");
    public static final cq aa = cq.a("gads:ad_manager_creator:enabled", Boolean.valueOf(true));
    public static final cq ab = cq.a("gads:log:verbose_enabled", Boolean.valueOf(false));
    public static final cq ac = cq.a("gads:device_info_caching:enabled", Boolean.valueOf(true));
    public static final cq ad = cq.a("gads:device_info_caching_expiry_ms:expiry", 0x493e0L);
    public static final cq ae = cq.a("gads:gen204_signals:enabled", Boolean.valueOf(false));
    public static final cq af = cq.a("gads:webview:error_reporting_enabled", Boolean.valueOf(false));
    public static final cq ag = cq.a("gads:adid_reporting:enabled", Boolean.valueOf(false));
    public static final cq ah = cq.a("gads:request_pkg:enabled", Boolean.valueOf(true));
    public static final cq ai = cq.a("gads:gmsg:disable_back_button:enabled", Boolean.valueOf(false));
    public static final cq aj = cq.a("gads:network:cache_prediction_duration_s", 300L);
    public static final cq ak = cq.a("gads:mediation:dynamite_first", Boolean.valueOf(true));
    public static final cq al = cq.a("gads:ad_loader:timeout_ms", 60000L);
    public static final cq am = cq.a("gads:rendering:timeout_ms", 60000L);
    public static final cq an = cq.a("gads:adshield:enable_adshield_instrumentation", Boolean.valueOf(false));
    public static final cq ao = cq.a("gads:adid_notification:first_party_check:enabled", Boolean.valueOf(true));
    public static final cq ap = cq.a("gads:support_screen_shot", Boolean.valueOf(true));
    public static final cq b = cq.a("gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");
    public static final cq c = cq.a("gads:request_builder:singleton_webview", Boolean.valueOf(false));
    public static final cq d = cq.a("gads:request_builder:singleton_webview_experiment_id");
    public static final cq e = cq.a("gads:sdk_use_dynamic_module", Boolean.valueOf(false));
    public static final cq f = cq.a("gads:sdk_use_dynamic_module_experiment_id");
    public static final cq g = cq.a("gads:sdk_crash_report_enabled", Boolean.valueOf(false));
    public static final cq h = cq.a("gads:sdk_crash_report_full_stacktrace", Boolean.valueOf(false));
    public static final cq i = cq.a("gads:block_autoclicks", Boolean.valueOf(false));
    public static final cq j = cq.a("gads:block_autoclicks_experiment_id");
    public static final cq k = cq.b("gads:prefetch:experiment_id");
    public static final cq l = cq.a("gads:spam_app_context:experiment_id");
    public static final cq m = cq.a("gads:spam_app_context:enabled", Boolean.valueOf(false));
    public static final cq n = cq.a("gads:video_stream_cache:experiment_id");
    public static final cq o = cq.a("gads:video_stream_cache:limit_count", 5);
    public static final cq p = cq.a("gads:video_stream_cache:limit_space", 0x800000);
    public static final cq q = cq.a("gads:video_stream_exo_cache:buffer_size", 0x800000);
    public static final cq r = cq.a("gads:video_stream_cache:limit_time_sec", 300L);
    public static final cq s = cq.a("gads:video_stream_cache:notify_interval_millis", 1000L);
    public static final cq t = cq.a("gads:video_stream_cache:connect_timeout_millis", 10000);
    public static final cq u = cq.a("gads:video:metric_reporting_enabled", Boolean.valueOf(false));
    public static final cq v = cq.a("gads:video:metric_frame_hash_times", "");
    public static final cq w = cq.a("gads:video:metric_frame_hash_time_leniency", 500L);
    public static final cq x = cq.b("gads:spam_ad_id_decorator:experiment_id");
    public static final cq y = cq.a("gads:spam_ad_id_decorator:enabled", Boolean.valueOf(false));
    public static final cq z = cq.b("gads:looper_for_gms_client:experiment_id");

    public static List a()
    {
        return zzp.zzbD().a();
    }

    public static void a(Context context)
    {
        zzp.zzbE().a(context);
    }

}
