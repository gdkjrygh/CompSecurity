// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzhc;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzl, zzn

public final class zzx
{
    public static final class zza
    {

        private final Object zzHU;
        private final zzhc zzHV;
        private Object zzHW;

        static zza zza(String s, float f)
        {
            return zza(s, f, f);
        }

        static zza zza(String s, float f, float f1)
        {
            return new zza(zzhc.zza(s, Float.valueOf(f1)), Float.valueOf(f));
        }

        static zza zza(String s, int i, int j)
        {
            return new zza(zzhc.zza(s, Integer.valueOf(j)), Integer.valueOf(i));
        }

        static zza zza(String s, long l, long l1)
        {
            return new zza(zzhc.zza(s, Long.valueOf(l1)), Long.valueOf(l));
        }

        static zza zza(String s, boolean flag, boolean flag1)
        {
            return new zza(zzhc.zzg(s, flag1), Boolean.valueOf(flag));
        }

        static zza zzb(String s, long l)
        {
            return zza(s, l, l);
        }

        static zza zzd(String s, int i)
        {
            return zza(s, i, i);
        }

        static zza zzd(String s, String s1, String s2)
        {
            return new zza(zzhc.zzr(s, s2), s1);
        }

        static zza zzd(String s, boolean flag)
        {
            return zza(s, flag, flag);
        }

        static zza zzl(String s, String s1)
        {
            return zzd(s, s1, s1);
        }

        public Object get()
        {
            if (zzHW != null)
            {
                return zzHW;
            }
            if (zzd.zzSV && zzhc.isInitialized())
            {
                return zzHV.zzlk();
            } else
            {
                return zzHU;
            }
        }

        private zza(zzhc zzhc1, Object obj)
        {
            zzv.zzr(zzhc1);
            zzHV = zzhc1;
            zzHU = obj;
        }
    }


    public static zza zzHA = com.google.android.gms.analytics.internal.zza.zzd("analytics.max_hits_per_request.k", 20);
    public static zza zzHB = com.google.android.gms.analytics.internal.zza.zzd("analytics.max_hit_length.k", 8192);
    public static zza zzHC = com.google.android.gms.analytics.internal.zza.zzd("analytics.max_post_length.k", 8192);
    public static zza zzHD = com.google.android.gms.analytics.internal.zza.zzd("analytics.max_batch_post_length", 8192);
    public static zza zzHE = zza.zzl("analytics.fallback_responses.k", "404,502");
    public static zza zzHF = com.google.android.gms.analytics.internal.zza.zzd("analytics.batch_retry_interval.seconds.k", 3600);
    public static zza zzHG = zza.zzb("analytics.service_monitor_interval", 0x5265c00L);
    public static zza zzHH = com.google.android.gms.analytics.internal.zza.zzd("analytics.http_connection.connect_timeout_millis", 60000);
    public static zza zzHI = com.google.android.gms.analytics.internal.zza.zzd("analytics.http_connection.read_timeout_millis", 61000);
    public static zza zzHJ = zza.zzb("analytics.campaigns.time_limit", 0x5265c00L);
    public static zza zzHK = zza.zzl("analytics.first_party_experiment_id", "");
    public static zza zzHL = com.google.android.gms.analytics.internal.zza.zzd("analytics.first_party_experiment_variant", 0);
    public static zza zzHM = com.google.android.gms.analytics.internal.zza.zzd("analytics.test.disable_receiver", false);
    public static zza zzHN = zza.zza("analytics.service_client.idle_disconnect_millis", 10000L, 10000L);
    public static zza zzHO = zza.zzb("analytics.service_client.connect_timeout_millis", 5000L);
    public static zza zzHP = zza.zzb("analytics.service_client.second_connect_delay_millis", 5000L);
    public static zza zzHQ = zza.zzb("analytics.service_client.unexpected_reconnect_millis", 60000L);
    public static zza zzHR = zza.zzb("analytics.service_client.reconnect_throttle_millis", 0x1b7740L);
    public static zza zzHS = zza.zzb("analytics.monitoring.sample_period_millis", 0x5265c00L);
    public static zza zzHT = zza.zzb("analytics.initialization_warning_threshold", 5000L);
    public static zza zzHd = com.google.android.gms.analytics.internal.zza.zzd("analytics.service_enabled", false);
    public static zza zzHe = com.google.android.gms.analytics.internal.zza.zzd("analytics.service_client_enabled", true);
    public static zza zzHf = com.google.android.gms.analytics.internal.zza.zzd("analytics.log_tag", "GAv4", "GAv4-SVC");
    public static zza zzHg = zza.zzb("analytics.max_tokens", 60L);
    public static zza zzHh = zza.zza("analytics.tokens_per_sec", 0.5F);
    public static zza zzHi = zza.zza("analytics.max_stored_hits", 2000, 20000);
    public static zza zzHj = com.google.android.gms.analytics.internal.zza.zzd("analytics.max_stored_hits_per_app", 2000);
    public static zza zzHk = com.google.android.gms.analytics.internal.zza.zzd("analytics.max_stored_properties_per_app", 100);
    public static zza zzHl = zza.zza("analytics.local_dispatch_millis", 0x1b7740L, 0x1d4c0L);
    public static zza zzHm = zza.zza("analytics.initial_local_dispatch_millis", 5000L, 5000L);
    public static zza zzHn = zza.zzb("analytics.min_local_dispatch_millis", 0x1d4c0L);
    public static zza zzHo = zza.zzb("analytics.max_local_dispatch_millis", 0x6ddd00L);
    public static zza zzHp = zza.zzb("analytics.dispatch_alarm_millis", 0x6ddd00L);
    public static zza zzHq = zza.zzb("analytics.max_dispatch_alarm_millis", 0x1ee6280L);
    public static zza zzHr = com.google.android.gms.analytics.internal.zza.zzd("analytics.max_hits_per_dispatch", 20);
    public static zza zzHs = com.google.android.gms.analytics.internal.zza.zzd("analytics.max_hits_per_batch", 20);
    public static zza zzHt = zza.zzl("analytics.insecure_host", "http://www.google-analytics.com");
    public static zza zzHu = zza.zzl("analytics.secure_host", "https://ssl.google-analytics.com");
    public static zza zzHv = zza.zzl("analytics.simple_endpoint", "/collect");
    public static zza zzHw = zza.zzl("analytics.batching_endpoint", "/batch");
    public static zza zzHx = com.google.android.gms.analytics.internal.zza.zzd("analytics.max_get_length", 2036);
    public static zza zzHy;
    public static zza zzHz;

    static 
    {
        zzHy = com.google.android.gms.analytics.internal.zza.zzd("analytics.batching_strategy.k", zzl.zzGH.name(), zzl.zzGH.name());
        zzHz = zza.zzl("analytics.compression_strategy.k", zzn.zzGP.name());
    }
}
