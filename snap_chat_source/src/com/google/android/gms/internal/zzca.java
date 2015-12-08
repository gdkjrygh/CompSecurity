// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzbx, zzab, zzbz, zzby

public final class zzca
{

    public static zzbx zzqA = zzbx.zzd("gads:sdk_csi_server", "https://csi.gstatic.com/csi");
    public static final zzbx zzqB = zzbx.zza("gads:enable_content_fetching", Boolean.valueOf(false));
    public static final zzbx zzqC = zzbx.zza("gads:content_length_weight", 1);
    public static final zzbx zzqD = zzbx.zza("gads:content_age_weight", 1);
    public static final zzbx zzqE = zzbx.zza("gads:min_content_len", 11);
    public static final zzbx zzqF = zzbx.zza("gads:fingerprint_number", 10);
    public static final zzbx zzqG = zzbx.zza("gads:sleep_sec", 10);
    public static final zzbx zzqH = zzbx.zzA("gads:kitkat_interstitial_workaround:experiment_id");
    public static final zzbx zzqI = zzbx.zza("gads:kitkat_interstitial_workaround:enabled", Boolean.valueOf(true));
    public static final zzbx zzqJ = zzbx.zza("gads:interstitial_follow_url", Boolean.valueOf(true));
    public static final zzbx zzqK = zzbx.zzA("gads:interstitial_follow_url:experiment_id");
    public static final zzbx zzqL = zzbx.zza("gads:analytics_enabled", Boolean.valueOf(true));
    public static final zzbx zzqM = zzbx.zza("gads:ad_key_enabled", Boolean.valueOf(false));
    public static final zzbx zzqN = zzbx.zza("gads:webview_cache_version", 0);
    public static final zzbx zzqk = zzbx.zzA("gads:sdk_core_experiment_id");
    public static final zzbx zzql = zzbx.zzd("gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");
    public static final zzbx zzqm = zzbx.zza("gads:request_builder:singleton_webview", Boolean.valueOf(false));
    public static final zzbx zzqn = zzbx.zzA("gads:request_builder:singleton_webview_experiment_id");
    public static final zzbx zzqo = zzbx.zza("gads:sdk_crash_report_enabled", Boolean.valueOf(false));
    public static final zzbx zzqp = zzbx.zza("gads:sdk_crash_report_full_stacktrace", Boolean.valueOf(false));
    public static final zzbx zzqq = zzbx.zza("gads:block_autoclicks", Boolean.valueOf(false));
    public static final zzbx zzqr = zzbx.zzA("gads:block_autoclicks_experiment_id");
    public static final zzbx zzqs = zzbx.zzA("gads:prefetch:experiment_id");
    public static final zzbx zzqt = zzbx.zzA("gads:spam_app_context:experiment_id");
    public static final zzbx zzqu = zzbx.zza("gads:spam_app_context:enabled", Boolean.valueOf(false));
    public static final zzbx zzqv = zzbx.zzd("gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");
    public static final zzbx zzqw = zzbx.zzd("gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");
    public static final zzbx zzqx = zzbx.zzd("gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");
    public static final zzbx zzqy = zzbx.zza("gads:enabled_sdk_csi", Boolean.valueOf(false));
    public static zzbx zzqz = zzbx.zza("gads:sdk_csi_batch_size", 20);

    public static void zza(Runnable runnable)
    {
        zzab.zzaT().zza(runnable);
    }

    public static List zzca()
    {
        return zzab.zzaS().zzca();
    }

    public static List zzcb()
    {
        return zzab.zzaS().zzcb();
    }

    public static void zzl(Context context)
    {
        zzab.zzaT().zzl(context);
    }

}
