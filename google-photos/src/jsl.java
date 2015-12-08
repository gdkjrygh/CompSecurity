// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jsl
{

    public static jsm A = jsm.a("analytics.service_client.idle_disconnect_millis", 10000L, 10000L);
    public static jsm B = jsm.a("analytics.service_client.connect_timeout_millis", 5000L, 5000L);
    public static jsm C = jsm.a("analytics.service_client.reconnect_throttle_millis", 0x1b7740L, 0x1b7740L);
    public static jsm D = jsm.a("analytics.monitoring.sample_period_millis", 0x5265c00L, 0x5265c00L);
    public static jsm E = jsm.a("analytics.initialization_warning_threshold", 5000L, 5000L);
    public static jsm a = new jsm(kzu.a("analytics.service_client_enabled", true), Boolean.valueOf(true));
    public static jsm b = jsm.a("analytics.log_tag", "GAv4", "GAv4-SVC");
    public static jsm c = jsm.a("analytics.max_stored_hits", 2000, 20000);
    public static jsm d = jsm.a("analytics.max_stored_properties_per_app", 100, 100);
    public static jsm e = jsm.a("analytics.local_dispatch_millis", 0x1b7740L, 0x1d4c0L);
    public static jsm f = jsm.a("analytics.initial_local_dispatch_millis", 5000L, 5000L);
    public static jsm g = jsm.a("analytics.dispatch_alarm_millis", 0x6ddd00L, 0x6ddd00L);
    public static jsm h = jsm.a("analytics.max_dispatch_alarm_millis", 0x1ee6280L, 0x1ee6280L);
    public static jsm i = jsm.a("analytics.max_hits_per_dispatch", 20, 20);
    public static jsm j = jsm.a("analytics.max_hits_per_batch", 20, 20);
    public static jsm k = jsm.a("analytics.insecure_host", "http://www.google-analytics.com", "http://www.google-analytics.com");
    public static jsm l = jsm.a("analytics.secure_host", "https://ssl.google-analytics.com", "https://ssl.google-analytics.com");
    public static jsm m = jsm.a("analytics.simple_endpoint", "/collect", "/collect");
    public static jsm n = jsm.a("analytics.batching_endpoint", "/batch", "/batch");
    public static jsm o = jsm.a("analytics.max_get_length", 2036, 2036);
    public static jsm p;
    public static jsm q;
    public static jsm r = jsm.a("analytics.max_hit_length.k", 8192, 8192);
    public static jsm s = jsm.a("analytics.max_post_length.k", 8192, 8192);
    public static jsm t = jsm.a("analytics.max_batch_post_length", 8192, 8192);
    public static jsm u = jsm.a("analytics.fallback_responses.k", "404,502", "404,502");
    public static jsm v = jsm.a("analytics.batch_retry_interval.seconds.k", 3600, 3600);
    public static jsm w = jsm.a("analytics.http_connection.connect_timeout_millis", 60000, 60000);
    public static jsm x = jsm.a("analytics.http_connection.read_timeout_millis", 61000, 61000);
    public static jsm y = jsm.a("analytics.campaigns.time_limit", 0x5265c00L, 0x5265c00L);
    public static jsm z = new jsm(kzu.a("analytics.test.disable_receiver", false), Boolean.valueOf(false));

    static 
    {
        new jsm(kzu.a("analytics.service_enabled", false), Boolean.valueOf(false));
        jsm.a("analytics.max_tokens", 60L, 60L);
        new jsm(kzu.a("analytics.tokens_per_sec", Float.valueOf(0.5F)), Float.valueOf(0.5F));
        jsm.a("analytics.max_stored_hits_per_app", 2000, 2000);
        jsm.a("analytics.min_local_dispatch_millis", 0x1d4c0L, 0x1d4c0L);
        jsm.a("analytics.max_local_dispatch_millis", 0x6ddd00L, 0x6ddd00L);
        p = jsm.a("analytics.batching_strategy.k", jsb.b.name(), jsb.b.name());
        String s1 = jsg.a.name();
        q = jsm.a("analytics.compression_strategy.k", s1, s1);
        jsm.a("analytics.max_hits_per_request.k", 20, 20);
        jsm.a("analytics.service_monitor_interval", 0x5265c00L, 0x5265c00L);
        jsm.a("analytics.first_party_experiment_id", "", "");
        jsm.a("analytics.first_party_experiment_variant", 0, 0);
        jsm.a("analytics.service_client.second_connect_delay_millis", 5000L, 5000L);
        jsm.a("analytics.service_client.unexpected_reconnect_millis", 60000L, 60000L);
    }
}
