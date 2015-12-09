// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.analytics.internal.zzm;
import com.google.android.gms.analytics.internal.zzo;

public final class bnz
{

    public static boa A = boa.a("analytics.service_client.idle_disconnect_millis", 10000L, 10000L);
    public static boa B = boa.a("analytics.service_client.connect_timeout_millis", 5000L, 5000L);
    public static boa C = boa.a("analytics.service_client.reconnect_throttle_millis", 0x1b7740L, 0x1b7740L);
    public static boa D = boa.a("analytics.monitoring.sample_period_millis", 0x5265c00L, 0x5265c00L);
    public static boa E = boa.a("analytics.initialization_warning_threshold", 5000L, 5000L);
    public static boa a = boa.a("analytics.service_client_enabled", true);
    public static boa b = boa.a("analytics.log_tag", "GAv4", "GAv4-SVC");
    public static boa c = boa.a("analytics.max_stored_hits", 2000, 20000);
    public static boa d = boa.a("analytics.max_stored_properties_per_app", 100, 100);
    public static boa e = boa.a("analytics.local_dispatch_millis", 0x1b7740L, 0x1d4c0L);
    public static boa f = boa.a("analytics.initial_local_dispatch_millis", 5000L, 5000L);
    public static boa g = boa.a("analytics.dispatch_alarm_millis", 0x6ddd00L, 0x6ddd00L);
    public static boa h = boa.a("analytics.max_dispatch_alarm_millis", 0x1ee6280L, 0x1ee6280L);
    public static boa i = boa.a("analytics.max_hits_per_dispatch", 20, 20);
    public static boa j = boa.a("analytics.max_hits_per_batch", 20, 20);
    public static boa k = boa.a("analytics.insecure_host", "http://www.google-analytics.com", "http://www.google-analytics.com");
    public static boa l = boa.a("analytics.secure_host", "https://ssl.google-analytics.com", "https://ssl.google-analytics.com");
    public static boa m = boa.a("analytics.simple_endpoint", "/collect", "/collect");
    public static boa n = boa.a("analytics.batching_endpoint", "/batch", "/batch");
    public static boa o = boa.a("analytics.max_get_length", 2036, 2036);
    public static boa p;
    public static boa q;
    public static boa r = boa.a("analytics.max_hit_length.k", 8192, 8192);
    public static boa s = boa.a("analytics.max_post_length.k", 8192, 8192);
    public static boa t = boa.a("analytics.max_batch_post_length", 8192, 8192);
    public static boa u = boa.a("analytics.fallback_responses.k", "404,502", "404,502");
    public static boa v = boa.a("analytics.batch_retry_interval.seconds.k", 3600, 3600);
    public static boa w = boa.a("analytics.http_connection.connect_timeout_millis", 60000, 60000);
    public static boa x = boa.a("analytics.http_connection.read_timeout_millis", 61000, 61000);
    public static boa y = boa.a("analytics.campaigns.time_limit", 0x5265c00L, 0x5265c00L);
    public static boa z = boa.a("analytics.test.disable_receiver", false);

    static 
    {
        boa.a("analytics.service_enabled", false);
        boa.a("analytics.max_tokens", 60L, 60L);
        new boa(cmz.c("analytics.tokens_per_sec"), Float.valueOf(0.5F));
        boa.a("analytics.max_stored_hits_per_app", 2000, 2000);
        boa.a("analytics.min_local_dispatch_millis", 0x1d4c0L, 0x1d4c0L);
        boa.a("analytics.max_local_dispatch_millis", 0x6ddd00L, 0x6ddd00L);
        p = boa.a("analytics.batching_strategy.k", zzm.b.name(), zzm.b.name());
        String s1 = zzo.a.name();
        q = boa.a("analytics.compression_strategy.k", s1, s1);
        boa.a("analytics.max_hits_per_request.k", 20, 20);
        boa.a("analytics.service_monitor_interval", 0x5265c00L, 0x5265c00L);
        boa.a("analytics.first_party_experiment_id", "", "");
        boa.a("analytics.first_party_experiment_variant", 0, 0);
        boa.a("analytics.service_client.second_connect_delay_millis", 5000L, 5000L);
        boa.a("analytics.service_client.unexpected_reconnect_millis", 60000L, 60000L);
    }
}
