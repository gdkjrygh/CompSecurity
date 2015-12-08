// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            bi, ar, av

public final class bh
{

    public static bi A = bi.a("analytics.max_batch_post_length", 8192);
    public static bi B = bi.a("analytics.fallback_responses.k", "404,502");
    public static bi C = bi.a("analytics.batch_retry_interval.seconds.k", 3600);
    public static bi D = bi.a("analytics.service_monitor_interval", 0x5265c00L);
    public static bi E = bi.a("analytics.http_connection.connect_timeout_millis", 60000);
    public static bi F = bi.a("analytics.http_connection.read_timeout_millis", 61000);
    public static bi G = bi.a("analytics.campaigns.time_limit", 0x5265c00L);
    public static bi H = bi.a("analytics.first_party_experiment_id", "");
    public static bi I = bi.a("analytics.first_party_experiment_variant", 0);
    public static bi J = bi.a("analytics.test.disable_receiver", false);
    public static bi K = bi.a("analytics.service_client.idle_disconnect_millis", 10000L, 10000L);
    public static bi L = bi.a("analytics.service_client.connect_timeout_millis", 5000L);
    public static bi M = bi.a("analytics.service_client.second_connect_delay_millis", 5000L);
    public static bi N = bi.a("analytics.service_client.unexpected_reconnect_millis", 60000L);
    public static bi O = bi.a("analytics.service_client.reconnect_throttle_millis", 0x1b7740L);
    public static bi P = bi.a("analytics.monitoring.sample_period_millis", 0x5265c00L);
    public static bi Q = bi.a("analytics.initialization_warning_threshold", 5000L);
    public static bi a = bi.a("analytics.service_enabled", false);
    public static bi b = bi.a("analytics.service_client_enabled", true);
    public static bi c = bi.a("analytics.log_tag", "GAv4", "GAv4-SVC");
    public static bi d = bi.a("analytics.max_tokens", 60L);
    public static bi e = bi.a("analytics.tokens_per_sec");
    public static bi f = bi.a("analytics.max_stored_hits", 2000, 20000);
    public static bi g = bi.a("analytics.max_stored_hits_per_app", 2000);
    public static bi h = bi.a("analytics.max_stored_properties_per_app", 100);
    public static bi i = bi.a("analytics.local_dispatch_millis", 0x1b7740L, 0x1d4c0L);
    public static bi j = bi.a("analytics.initial_local_dispatch_millis", 5000L, 5000L);
    public static bi k = bi.a("analytics.min_local_dispatch_millis", 0x1d4c0L);
    public static bi l = bi.a("analytics.max_local_dispatch_millis", 0x6ddd00L);
    public static bi m = bi.a("analytics.dispatch_alarm_millis", 0x6ddd00L);
    public static bi n = bi.a("analytics.max_dispatch_alarm_millis", 0x1ee6280L);
    public static bi o = bi.a("analytics.max_hits_per_dispatch", 20);
    public static bi p = bi.a("analytics.max_hits_per_batch", 20);
    public static bi q = bi.a("analytics.insecure_host", "http://www.google-analytics.com");
    public static bi r = bi.a("analytics.secure_host", "https://ssl.google-analytics.com");
    public static bi s = bi.a("analytics.simple_endpoint", "/collect");
    public static bi t = bi.a("analytics.batching_endpoint", "/batch");
    public static bi u = bi.a("analytics.max_get_length", 2036);
    public static bi v;
    public static bi w;
    public static bi x = bi.a("analytics.max_hits_per_request.k", 20);
    public static bi y = bi.a("analytics.max_hit_length.k", 8192);
    public static bi z = bi.a("analytics.max_post_length.k", 8192);

    static 
    {
        v = bi.a("analytics.batching_strategy.k", ar.e.name(), ar.e.name());
        w = bi.a("analytics.compression_strategy.k", av.b.name());
    }
}
