// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class ktk
{

    public static final ktd a = ktd.a("gads:sdk_crash_report_enabled", Boolean.valueOf(false));
    public static final ktd b = ktd.a("gads:sdk_crash_report_full_stacktrace", Boolean.valueOf(false));
    public static final ktd c = ktd.a("gads:block_autoclicks", Boolean.valueOf(false));
    public static final ktd d = ktd.a("gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");
    public static final ktd e = ktd.a("gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");
    public static final ktd f = ktd.a("gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");
    public static final ktd g = ktd.a("gads:enabled_sdk_csi", Boolean.valueOf(false));
    public static final ktd h = ktd.a("gads:interstitial_follow_url:register_click", Boolean.valueOf(true));
    public static final ktd i = ktd.a("gads:analytics_enabled", Boolean.valueOf(true));
    public static final ktd j = ktd.a("gads:log:verbose_enabled", Boolean.valueOf(false));
    public static final ktd k = ktd.a("gads:webview:error_reporting_enabled", Boolean.valueOf(false));
    public static final ktd l = ktd.a("gads:gmsg:disable_back_button:enabled", Boolean.valueOf(false));

    public static List a()
    {
        Object obj = jqc.h();
        ArrayList arraylist = new ArrayList();
        obj = ((kti) (obj)).b.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj1 = (ktd)((Iterator) (obj)).next();
            obj1 = (String)jqc.i().a(((ktd) (obj1)));
            if (obj1 != null)
            {
                arraylist.add(obj1);
            }
        } while (true);
        return arraylist;
    }

    static 
    {
        ktd.a("gads:sdk_core_experiment_id");
        ktd.a("gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");
        ktd.a("gads:request_builder:singleton_webview", Boolean.valueOf(false));
        ktd.a("gads:request_builder:singleton_webview_experiment_id");
        ktd.a("gads:sdk_use_dynamic_module", Boolean.valueOf(false));
        ktd.a("gads:sdk_use_dynamic_module_experiment_id");
        ktd.a("gads:block_autoclicks_experiment_id");
        ktd.b("gads:prefetch:experiment_id");
        ktd.a("gads:spam_app_context:experiment_id");
        ktd.a("gads:spam_app_context:enabled", Boolean.valueOf(false));
        ktd.a("gads:video_stream_cache:experiment_id");
        ktd.a("gads:video_stream_cache:limit_count", 5);
        ktd.a("gads:video_stream_cache:limit_space", 0x800000);
        ktd.a("gads:video_stream_exo_cache:buffer_size", 0x800000);
        ktd.a("gads:video_stream_cache:limit_time_sec", 300L);
        ktd.a("gads:video_stream_cache:notify_interval_millis", 1000L);
        ktd.a("gads:video_stream_cache:connect_timeout_millis", 10000);
        ktd.a("gads:video:metric_reporting_enabled", Boolean.valueOf(false));
        ktd.a("gads:video:metric_frame_hash_times", "");
        ktd.a("gads:video:metric_frame_hash_time_leniency", 500L);
        ktd.b("gads:spam_ad_id_decorator:experiment_id");
        ktd.a("gads:spam_ad_id_decorator:enabled", Boolean.valueOf(false));
        ktd.b("gads:looper_for_gms_client:experiment_id");
        ktd.a("gads:looper_for_gms_client:enabled", Boolean.valueOf(true));
        ktd.a("gads:sw_ad_request_service:enabled", Boolean.valueOf(true));
        ktd.a("gads:sw_dynamite:enabled", Boolean.valueOf(true));
        ktd.a("gads:sdk_csi_server", "https://csi.gstatic.com/csi");
        ktd.a("gads:sdk_csi_write_to_file", Boolean.valueOf(false));
        ktd.a("gads:enable_content_fetching", Boolean.valueOf(true));
        ktd.a("gads:content_length_weight", 1);
        ktd.a("gads:content_age_weight", 1);
        ktd.a("gads:min_content_len", 11);
        ktd.a("gads:fingerprint_number", 10);
        ktd.a("gads:sleep_sec", 10);
        ktd.a("gad:app_index_enabled", Boolean.valueOf(true));
        ktd.a("gads:kitkat_interstitial_workaround:experiment_id");
        ktd.a("gads:kitkat_interstitial_workaround:enabled", Boolean.valueOf(true));
        ktd.a("gads:interstitial_follow_url", Boolean.valueOf(true));
        ktd.a("gads:interstitial_follow_url:experiment_id");
        ktd.a("gads:ad_key_enabled", Boolean.valueOf(false));
        ktd.a("gads:webview_cache_version", 0);
        ktd.b("gads:pan:experiment_id");
        ktd.a("gads:native:engine_url", "//googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
        ktd.a("gads:ad_manager_creator:enabled", Boolean.valueOf(true));
        ktd.a("gads:device_info_caching:enabled", Boolean.valueOf(true));
        ktd.a("gads:device_info_caching_expiry_ms:expiry", 0x493e0L);
        ktd.a("gads:gen204_signals:enabled", Boolean.valueOf(false));
        ktd.a("gads:adid_reporting:enabled", Boolean.valueOf(false));
        ktd.a("gads:request_pkg:enabled", Boolean.valueOf(true));
        ktd.a("gads:network:cache_prediction_duration_s", 300L);
    }
}
