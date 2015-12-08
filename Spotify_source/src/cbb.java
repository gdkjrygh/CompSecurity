// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class cbb
{

    public static final cax A = cax.a("gads:min_content_len", 11);
    public static final cax B = cax.a("gads:fingerprint_number", 10);
    public static final cax C = cax.a("gads:sleep_sec", 10);
    public static final cax D = cax.a("gad:app_index_enabled", Boolean.valueOf(true));
    public static final cax E = cax.a("gads:kitkat_interstitial_workaround:enabled", Boolean.valueOf(true));
    public static final cax F = cax.a("gads:interstitial_follow_url", Boolean.valueOf(true));
    public static final cax G = cax.a("gads:interstitial_follow_url:register_click", Boolean.valueOf(true));
    public static final cax H = cax.a("gads:ad_key_enabled", Boolean.valueOf(false));
    public static final cax I = cax.a("gads:webview_cache_version", 0);
    public static final cax J = cax.a("gads:native:engine_url", "//googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
    public static final cax K = cax.a("gads:log:verbose_enabled", Boolean.valueOf(false));
    public static final cax L = cax.a("gads:device_info_caching:enabled", Boolean.valueOf(true));
    public static final cax M = cax.a("gads:device_info_caching_expiry_ms:expiry", 0x493e0L);
    public static final cax N = cax.a("gads:gen204_signals:enabled", Boolean.valueOf(false));
    public static final cax O = cax.a("gads:webview:error_reporting_enabled", Boolean.valueOf(false));
    public static final cax P = cax.a("gads:request_pkg:enabled", Boolean.valueOf(true));
    public static final cax Q = cax.a("gads:gmsg:disable_back_button:enabled", Boolean.valueOf(false));
    public static final cax R = cax.a("gads:mediation:dynamite_first", Boolean.valueOf(true));
    public static final cax S = cax.a("gads:ad_loader:timeout_ms", 60000L);
    public static final cax T = cax.a("gads:rendering:timeout_ms", 60000L);
    public static final cax U = cax.a("gads:support_screen_shot", Boolean.valueOf(true));
    public static final cax a = cax.a("gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");
    public static final cax b = cax.a("gads:request_builder:singleton_webview", Boolean.valueOf(false));
    public static final cax c = cax.a("gads:sdk_crash_report_enabled", Boolean.valueOf(false));
    public static final cax d = cax.a("gads:sdk_crash_report_full_stacktrace", Boolean.valueOf(false));
    public static final cax e = cax.a("gads:block_autoclicks", Boolean.valueOf(false));
    public static final cax f = cax.a("gads:spam_app_context:enabled", Boolean.valueOf(false));
    public static final cax g = cax.a("gads:video_stream_cache:limit_count", 5);
    public static final cax h = cax.a("gads:video_stream_cache:limit_space", 0x800000);
    public static final cax i = cax.a("gads:video_stream_cache:limit_time_sec", 300L);
    public static final cax j = cax.a("gads:video_stream_cache:notify_interval_millis", 1000L);
    public static final cax k = cax.a("gads:video_stream_cache:connect_timeout_millis", 10000);
    public static final cax l = cax.a("gads:video:metric_reporting_enabled", Boolean.valueOf(false));
    public static final cax m = cax.a("gads:video:metric_frame_hash_times", "");
    public static final cax n = cax.a("gads:video:metric_frame_hash_time_leniency", 500L);
    public static final cax o = cax.a("gads:spam_ad_id_decorator:enabled", Boolean.valueOf(false));
    public static final cax p = cax.a("gads:looper_for_gms_client:enabled", Boolean.valueOf(true));
    public static final cax q = cax.a("gads:sw_ad_request_service:enabled", Boolean.valueOf(true));
    public static final cax r = cax.a("gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");
    public static final cax s = cax.a("gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");
    public static final cax t = cax.a("gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");
    public static final cax u = cax.a("gads:enabled_sdk_csi", Boolean.valueOf(false));
    public static final cax v = cax.a("gads:sdk_csi_server", "https://csi.gstatic.com/csi");
    public static final cax w = cax.a("gads:sdk_csi_write_to_file", Boolean.valueOf(false));
    public static final cax x = cax.a("gads:enable_content_fetching", Boolean.valueOf(true));
    public static final cax y = cax.a("gads:content_length_weight", 1);
    public static final cax z = cax.a("gads:content_age_weight", 1);

    public static List a()
    {
        Object obj = bkv.m();
        ArrayList arraylist = new ArrayList();
        obj = ((cay) (obj)).b.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj1 = (cax)((Iterator) (obj)).next();
            obj1 = (String)bkv.n().a(((cax) (obj1)));
            if (obj1 != null)
            {
                arraylist.add(obj1);
            }
        } while (true);
        return arraylist;
    }

    public static void a(Context context)
    {
        cba cba1;
label0:
        {
            cba1 = bkv.n();
            synchronized (cba1.a)
            {
                if (!cba1.b)
                {
                    break label0;
                }
            }
            return;
        }
        context = GooglePlayServicesUtil.getRemoteContext(context);
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        bkv.l();
        cba1.c = context.getSharedPreferences("google_ads_flags", 1);
        cba1.b = true;
        obj;
        JVM INSTR monitorexit ;
    }

    static 
    {
        cax.a("gads:sdk_core_experiment_id");
        cax.a("gads:request_builder:singleton_webview_experiment_id");
        cax.a("gads:sdk_use_dynamic_module", Boolean.valueOf(false));
        cax.a("gads:sdk_use_dynamic_module_experiment_id");
        cax.a("gads:block_autoclicks_experiment_id");
        cax.b("gads:prefetch:experiment_id");
        cax.a("gads:spam_app_context:experiment_id");
        cax.a("gads:video_stream_cache:experiment_id");
        cax.a("gads:video_stream_exo_cache:buffer_size", 0x800000);
        cax.b("gads:spam_ad_id_decorator:experiment_id");
        cax.b("gads:looper_for_gms_client:experiment_id");
        cax.a("gads:sw_dynamite:enabled", Boolean.valueOf(true));
        cax.a("gads:kitkat_interstitial_workaround:experiment_id");
        cax.a("gads:interstitial_follow_url:experiment_id");
        cax.a("gads:analytics_enabled", Boolean.valueOf(true));
        cax.b("gads:pan:experiment_id");
        cax.a("gads:ad_manager_creator:enabled", Boolean.valueOf(true));
        cax.a("gads:adid_reporting:enabled", Boolean.valueOf(false));
        cax.a("gads:network:cache_prediction_duration_s", 300L);
        cax.a("gads:adshield:enable_adshield_instrumentation", Boolean.valueOf(false));
        cax.a("gads:adid_notification:first_party_check:enabled", Boolean.valueOf(true));
    }
}
