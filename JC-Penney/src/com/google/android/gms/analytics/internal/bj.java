// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            bk, at, ax

public final class bj
{

    public static bk A = bk.a("analytics.max_batch_post_length", 8192);
    public static bk B = bk.a("analytics.fallback_responses.k", "404,502");
    public static bk C = bk.a("analytics.batch_retry_interval.seconds.k", 3600);
    public static bk D = bk.a("analytics.service_monitor_interval", 0x5265c00L);
    public static bk E = bk.a("analytics.http_connection.connect_timeout_millis", 60000);
    public static bk F = bk.a("analytics.http_connection.read_timeout_millis", 61000);
    public static bk G = bk.a("analytics.campaigns.time_limit", 0x5265c00L);
    public static bk H = bk.a("analytics.first_party_experiment_id", "");
    public static bk I = bk.a("analytics.first_party_experiment_variant", 0);
    public static bk J = bk.a("analytics.test.disable_receiver", false);
    public static bk K = bk.a("analytics.service_client.idle_disconnect_millis", 10000L, 10000L);
    public static bk L = bk.a("analytics.service_client.connect_timeout_millis", 5000L);
    public static bk M = bk.a("analytics.service_client.second_connect_delay_millis", 5000L);
    public static bk N = bk.a("analytics.service_client.unexpected_reconnect_millis", 60000L);
    public static bk O = bk.a("analytics.service_client.reconnect_throttle_millis", 0x1b7740L);
    public static bk P = bk.a("analytics.monitoring.sample_period_millis", 0x5265c00L);
    public static bk Q = bk.a("analytics.initialization_warning_threshold", 5000L);
    public static bk a = bk.a("analytics.service_enabled", false);
    public static bk b = bk.a("analytics.service_client_enabled", true);
    public static bk c = bk.a("analytics.log_tag", "GAv4", "GAv4-SVC");
    public static bk d = bk.a("analytics.max_tokens", 60L);
    public static bk e = bk.a("analytics.tokens_per_sec", 0.5F);
    public static bk f = bk.a("analytics.max_stored_hits", 2000, 20000);
    public static bk g = bk.a("analytics.max_stored_hits_per_app", 2000);
    public static bk h = bk.a("analytics.max_stored_properties_per_app", 100);
    public static bk i = bk.a("analytics.local_dispatch_millis", 0x1b7740L, 0x1d4c0L);
    public static bk j = bk.a("analytics.initial_local_dispatch_millis", 5000L, 5000L);
    public static bk k = bk.a("analytics.min_local_dispatch_millis", 0x1d4c0L);
    public static bk l = bk.a("analytics.max_local_dispatch_millis", 0x6ddd00L);
    public static bk m = bk.a("analytics.dispatch_alarm_millis", 0x6ddd00L);
    public static bk n = bk.a("analytics.max_dispatch_alarm_millis", 0x1ee6280L);
    public static bk o = bk.a("analytics.max_hits_per_dispatch", 20);
    public static bk p = bk.a("analytics.max_hits_per_batch", 20);
    public static bk q = bk.a("analytics.insecure_host", "http://www.google-analytics.com");
    public static bk r = bk.a("analytics.secure_host", "https://ssl.google-analytics.com");
    public static bk s = bk.a("analytics.simple_endpoint", "/collect");
    public static bk t = bk.a("analytics.batching_endpoint", "/batch");
    public static bk u = bk.a("analytics.max_get_length", 2036);
    public static bk v;
    public static bk w;
    public static bk x = bk.a("analytics.max_hits_per_request.k", 20);
    public static bk y = bk.a("analytics.max_hit_length.k", 8192);
    public static bk z = bk.a("analytics.max_post_length.k", 8192);

    static 
    {
        v = bk.a("analytics.batching_strategy.k", at.e.name(), at.e.name());
        w = bk.a("analytics.compression_strategy.k", ax.b.name());
    }
}
