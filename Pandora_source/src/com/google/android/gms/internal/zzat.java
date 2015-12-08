// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzj;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzh;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzap, zzaq, zzas

public final class zzat
{

    public static final zzap zzrA = zzap.zzd("gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");
    public static final zzap zzrB = zzap.zzd("gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");
    public static final zzap zzrC = com.google.android.gms.internal.zzap.zza("gads:enabled_sdk_csi", Boolean.valueOf(false));
    public static final zzap zzrD = com.google.android.gms.internal.zzap.zza("gads:sdk_csi_batch_size", 20);
    public static final zzap zzrE = zzap.zzd("gads:sdk_csi_server", "https://csi.gstatic.com/csi");
    public static final zzap zzrF = com.google.android.gms.internal.zzap.zza("gads:sdk_csi_write_to_file", Boolean.valueOf(false));
    public static final zzap zzrG = com.google.android.gms.internal.zzap.zza("gads:enable_content_fetching", Boolean.valueOf(true));
    public static final zzap zzrH = com.google.android.gms.internal.zzap.zza("gads:content_length_weight", 1);
    public static final zzap zzrI = com.google.android.gms.internal.zzap.zza("gads:content_age_weight", 1);
    public static final zzap zzrJ = com.google.android.gms.internal.zzap.zza("gads:min_content_len", 11);
    public static final zzap zzrK = com.google.android.gms.internal.zzap.zza("gads:fingerprint_number", 10);
    public static final zzap zzrL = com.google.android.gms.internal.zzap.zza("gads:sleep_sec", 10);
    public static final zzap zzrM = zzap.zzC("gads:kitkat_interstitial_workaround:experiment_id");
    public static final zzap zzrN = com.google.android.gms.internal.zzap.zza("gads:kitkat_interstitial_workaround:enabled", Boolean.valueOf(true));
    public static final zzap zzrO = com.google.android.gms.internal.zzap.zza("gads:interstitial_follow_url", Boolean.valueOf(true));
    public static final zzap zzrP = zzap.zzC("gads:interstitial_follow_url:experiment_id");
    public static final zzap zzrQ = com.google.android.gms.internal.zzap.zza("gads:analytics_enabled", Boolean.valueOf(true));
    public static final zzap zzrR = com.google.android.gms.internal.zzap.zza("gads:ad_key_enabled", Boolean.valueOf(false));
    public static final zzap zzrS = com.google.android.gms.internal.zzap.zza("gads:webview_cache_version", 0);
    public static final zzap zzrT = zzap.zzD("gads:pan:experiment_id");
    public static final zzap zzrU = zzap.zzd("gads:native:engine_url", "//googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
    public static final zzap zzrV = com.google.android.gms.internal.zzap.zza("gads:ad_manager_creator:enabled", Boolean.valueOf(true));
    public static final zzap zzrW = com.google.android.gms.internal.zzap.zza("gads:log:verbose_enabled", Boolean.valueOf(false));
    public static final zzap zzrX = com.google.android.gms.internal.zzap.zza("gads:sdk_less_mediation:enabled", Boolean.valueOf(true));
    public static final zzap zzrg = zzap.zzC("gads:sdk_core_experiment_id");
    public static final zzap zzrh = zzap.zzd("gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");
    public static final zzap zzri = com.google.android.gms.internal.zzap.zza("gads:request_builder:singleton_webview", Boolean.valueOf(false));
    public static final zzap zzrj = zzap.zzC("gads:request_builder:singleton_webview_experiment_id");
    public static final zzap zzrk = com.google.android.gms.internal.zzap.zza("gads:sdk_crash_report_enabled", Boolean.valueOf(false));
    public static final zzap zzrl = com.google.android.gms.internal.zzap.zza("gads:sdk_crash_report_full_stacktrace", Boolean.valueOf(false));
    public static final zzap zzrm = com.google.android.gms.internal.zzap.zza("gads:block_autoclicks", Boolean.valueOf(false));
    public static final zzap zzrn = zzap.zzC("gads:block_autoclicks_experiment_id");
    public static final zzap zzro = zzap.zzD("gads:prefetch:experiment_id");
    public static final zzap zzrp = zzap.zzC("gads:spam_app_context:experiment_id");
    public static final zzap zzrq = com.google.android.gms.internal.zzap.zza("gads:spam_app_context:enabled", Boolean.valueOf(false));
    public static final zzap zzrr = zzap.zzC("gads:video_stream_cache:experiment_id");
    public static final zzap zzrs = com.google.android.gms.internal.zzap.zza("gads:video_stream_cache:limit_count", 5);
    public static final zzap zzrt = com.google.android.gms.internal.zzap.zza("gads:video_stream_cache:limit_space", 0x800000);
    public static final zzap zzru = com.google.android.gms.internal.zzap.zza("gads:video_stream_cache:limit_time_sec", 300L);
    public static final zzap zzrv = com.google.android.gms.internal.zzap.zza("gads:video_stream_cache:notify_interval_millis", 1000L);
    public static final zzap zzrw = com.google.android.gms.internal.zzap.zza("gads:video_stream_cache:connect_timeout_millis", 10000);
    public static final zzap zzrx = zzap.zzD("gads:spam_ad_id_decorator:experiment_id");
    public static final zzap zzry = com.google.android.gms.internal.zzap.zza("gads:spam_ad_id_decorator:enabled", Boolean.valueOf(false));
    public static final zzap zzrz = zzap.zzd("gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");

    public static List zzcg()
    {
        return zzh.zzaX().zzcg();
    }

    public static void zzo(Context context)
    {
        zzh.zzaY().zzo(context);
    }

    public static List zzp(Context context)
    {
        if (zzj.zzbJ().zzD(context))
        {
            return zzh.zzaX().zzcf();
        } else
        {
            return null;
        }
    }

}
