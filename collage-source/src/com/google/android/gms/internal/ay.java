// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzp;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            au, av, ax

public final class ay
{

    public static final au A = au.a("gads:looper_for_gms_client:enabled", Boolean.valueOf(true));
    public static final au B = au.a("gads:sw_ad_request_service:enabled", Boolean.valueOf(true));
    public static final au C = au.a("gads:sw_dynamite:enabled", Boolean.valueOf(true));
    public static final au D = au.a("gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");
    public static final au E = au.a("gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");
    public static final au F = au.a("gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");
    public static final au G = au.a("gads:enabled_sdk_csi", Boolean.valueOf(false));
    public static final au H = au.a("gads:sdk_csi_server", "https://csi.gstatic.com/csi");
    public static final au I = au.a("gads:sdk_csi_write_to_file", Boolean.valueOf(false));
    public static final au J = au.a("gads:enable_content_fetching", Boolean.valueOf(true));
    public static final au K = au.a("gads:content_length_weight", 1);
    public static final au L = au.a("gads:content_age_weight", 1);
    public static final au M = au.a("gads:min_content_len", 11);
    public static final au N = au.a("gads:fingerprint_number", 10);
    public static final au O = au.a("gads:sleep_sec", 10);
    public static final au P = au.a("gad:app_index_enabled", Boolean.valueOf(true));
    public static final au Q = au.a("gads:kitkat_interstitial_workaround:experiment_id");
    public static final au R = au.a("gads:kitkat_interstitial_workaround:enabled", Boolean.valueOf(true));
    public static final au S = au.a("gads:interstitial_follow_url", Boolean.valueOf(true));
    public static final au T = au.a("gads:interstitial_follow_url:register_click", Boolean.valueOf(true));
    public static final au U = au.a("gads:interstitial_follow_url:experiment_id");
    public static final au V = au.a("gads:analytics_enabled", Boolean.valueOf(true));
    public static final au W = au.a("gads:ad_key_enabled", Boolean.valueOf(false));
    public static final au X = au.a("gads:webview_cache_version", 0);
    public static final au Y = au.b("gads:pan:experiment_id");
    public static final au Z = au.a("gads:native:engine_url", "//googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
    public static final au a = au.a("gads:sdk_core_experiment_id");
    public static final au aa = au.a("gads:ad_manager_creator:enabled", Boolean.valueOf(true));
    public static final au ab = au.a("gads:log:verbose_enabled", Boolean.valueOf(false));
    public static final au ac = au.a("gads:device_info_caching:enabled", Boolean.valueOf(true));
    public static final au ad = au.a("gads:device_info_caching_expiry_ms:expiry", 0x493e0L);
    public static final au ae = au.a("gads:gen204_signals:enabled", Boolean.valueOf(false));
    public static final au af = au.a("gads:webview:error_reporting_enabled", Boolean.valueOf(false));
    public static final au ag = au.a("gads:adid_reporting:enabled", Boolean.valueOf(false));
    public static final au ah = au.a("gads:request_pkg:enabled", Boolean.valueOf(true));
    public static final au ai = au.a("gads:gmsg:disable_back_button:enabled", Boolean.valueOf(false));
    public static final au aj = au.a("gads:network:cache_prediction_duration_s", 300L);
    public static final au b = au.a("gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");
    public static final au c = au.a("gads:request_builder:singleton_webview", Boolean.valueOf(false));
    public static final au d = au.a("gads:request_builder:singleton_webview_experiment_id");
    public static final au e = au.a("gads:sdk_use_dynamic_module", Boolean.valueOf(false));
    public static final au f = au.a("gads:sdk_use_dynamic_module_experiment_id");
    public static final au g = au.a("gads:sdk_crash_report_enabled", Boolean.valueOf(false));
    public static final au h = au.a("gads:sdk_crash_report_full_stacktrace", Boolean.valueOf(false));
    public static final au i = au.a("gads:block_autoclicks", Boolean.valueOf(false));
    public static final au j = au.a("gads:block_autoclicks_experiment_id");
    public static final au k = au.b("gads:prefetch:experiment_id");
    public static final au l = au.a("gads:spam_app_context:experiment_id");
    public static final au m = au.a("gads:spam_app_context:enabled", Boolean.valueOf(false));
    public static final au n = au.a("gads:video_stream_cache:experiment_id");
    public static final au o = au.a("gads:video_stream_cache:limit_count", 5);
    public static final au p = au.a("gads:video_stream_cache:limit_space", 0x800000);
    public static final au q = au.a("gads:video_stream_exo_cache:buffer_size", 0x800000);
    public static final au r = au.a("gads:video_stream_cache:limit_time_sec", 300L);
    public static final au s = au.a("gads:video_stream_cache:notify_interval_millis", 1000L);
    public static final au t = au.a("gads:video_stream_cache:connect_timeout_millis", 10000);
    public static final au u = au.a("gads:video:metric_reporting_enabled", Boolean.valueOf(false));
    public static final au v = au.a("gads:video:metric_frame_hash_times", "");
    public static final au w = au.a("gads:video:metric_frame_hash_time_leniency", 500L);
    public static final au x = au.b("gads:spam_ad_id_decorator:experiment_id");
    public static final au y = au.a("gads:spam_ad_id_decorator:enabled", Boolean.valueOf(false));
    public static final au z = au.b("gads:looper_for_gms_client:experiment_id");

    public static List a()
    {
        return zzp.zzbF().a();
    }

    public static void a(Context context)
    {
        zzp.zzbG().a(context);
    }

}
