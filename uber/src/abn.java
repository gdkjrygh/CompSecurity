// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.List;

public final class abn
{

    public static final abj A = abj.a("gads:enable_content_fetching", Boolean.valueOf(true));
    public static final abj B = abj.a("gads:content_length_weight", 1);
    public static final abj C = abj.a("gads:content_age_weight", 1);
    public static final abj D = abj.a("gads:min_content_len", 11);
    public static final abj E = abj.a("gads:fingerprint_number", 10);
    public static final abj F = abj.a("gads:sleep_sec", 10);
    public static final abj G = abj.a("gads:kitkat_interstitial_workaround:experiment_id");
    public static final abj H = abj.a("gads:kitkat_interstitial_workaround:enabled", Boolean.valueOf(true));
    public static final abj I = abj.a("gads:interstitial_follow_url", Boolean.valueOf(true));
    public static final abj J = abj.a("gads:interstitial_follow_url:experiment_id");
    public static final abj K = abj.a("gads:analytics_enabled", Boolean.valueOf(true));
    public static final abj L = abj.a("gads:ad_key_enabled", Boolean.valueOf(false));
    public static final abj M = abj.a("gads:webview_cache_version", 0);
    public static final abj N = abj.b("gads:pan:experiment_id");
    public static final abj O = abj.a("gads:native:engine_url", "//googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
    public static final abj P = abj.a("gads:ad_manager_creator:enabled", Boolean.valueOf(true));
    public static final abj Q = abj.a("gads:log:verbose_enabled", Boolean.valueOf(false));
    public static final abj R = abj.a("gads:sdk_less_mediation:enabled", Boolean.valueOf(true));
    public static final abj a = abj.a("gads:sdk_core_experiment_id");
    public static final abj b = abj.a("gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");
    public static final abj c = abj.a("gads:request_builder:singleton_webview", Boolean.valueOf(false));
    public static final abj d = abj.a("gads:request_builder:singleton_webview_experiment_id");
    public static final abj e = abj.a("gads:sdk_crash_report_enabled", Boolean.valueOf(false));
    public static final abj f = abj.a("gads:sdk_crash_report_full_stacktrace", Boolean.valueOf(false));
    public static final abj g = abj.a("gads:block_autoclicks", Boolean.valueOf(false));
    public static final abj h = abj.a("gads:block_autoclicks_experiment_id");
    public static final abj i = abj.b("gads:prefetch:experiment_id");
    public static final abj j = abj.a("gads:spam_app_context:experiment_id");
    public static final abj k = abj.a("gads:spam_app_context:enabled", Boolean.valueOf(false));
    public static final abj l = abj.a("gads:video_stream_cache:experiment_id");
    public static final abj m = abj.a("gads:video_stream_cache:limit_count", 5);
    public static final abj n = abj.a("gads:video_stream_cache:limit_space", 0x800000);
    public static final abj o = abj.a("gads:video_stream_cache:limit_time_sec", 300L);
    public static final abj p = abj.a("gads:video_stream_cache:notify_interval_millis", 1000L);
    public static final abj q = abj.a("gads:video_stream_cache:connect_timeout_millis", 10000);
    public static final abj r = abj.b("gads:spam_ad_id_decorator:experiment_id");
    public static final abj s = abj.a("gads:spam_ad_id_decorator:enabled", Boolean.valueOf(false));
    public static final abj t = abj.a("gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");
    public static final abj u = abj.a("gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");
    public static final abj v = abj.a("gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");
    public static final abj w = abj.a("gads:enabled_sdk_csi", Boolean.valueOf(false));
    public static final abj x = abj.a("gads:sdk_csi_batch_size", 20);
    public static final abj y = abj.a("gads:sdk_csi_server", "https://csi.gstatic.com/csi");
    public static final abj z = abj.a("gads:sdk_csi_write_to_file", Boolean.valueOf(false));

    public static List a()
    {
        return ot.l().b();
    }

    public static void a(Context context)
    {
        ot.m().a(context);
    }

    public static List b(Context context)
    {
        kx.a();
        if (oe.b(context))
        {
            return ot.l().a();
        } else
        {
            return null;
        }
    }

}
