// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzm, zzo

public final class zzy
{

    public static zza A = zza.a("analytics.max_batch_post_length", 8192);
    public static zza B = zza.a("analytics.fallback_responses.k", "404,502");
    public static zza C = zza.a("analytics.batch_retry_interval.seconds.k", 3600);
    public static zza D = zza.a("analytics.service_monitor_interval", 0x5265c00L);
    public static zza E = zza.a("analytics.http_connection.connect_timeout_millis", 60000);
    public static zza F = zza.a("analytics.http_connection.read_timeout_millis", 61000);
    public static zza G = zza.a("analytics.campaigns.time_limit", 0x5265c00L);
    public static zza H = zza.a("analytics.first_party_experiment_id", "");
    public static zza I = zza.a("analytics.first_party_experiment_variant", 0);
    public static zza J = zza.a("analytics.test.disable_receiver", false);
    public static zza K = zza.a("analytics.service_client.idle_disconnect_millis", 10000L, 10000L);
    public static zza L = zza.a("analytics.service_client.connect_timeout_millis", 5000L);
    public static zza M = zza.a("analytics.service_client.second_connect_delay_millis", 5000L);
    public static zza N = zza.a("analytics.service_client.unexpected_reconnect_millis", 60000L);
    public static zza O = zza.a("analytics.service_client.reconnect_throttle_millis", 0x1b7740L);
    public static zza P = zza.a("analytics.monitoring.sample_period_millis", 0x5265c00L);
    public static zza Q = zza.a("analytics.initialization_warning_threshold", 5000L);
    public static zza a = zza.a("analytics.service_enabled", false);
    public static zza b = zza.a("analytics.service_client_enabled", true);
    public static zza c = zza.a("analytics.log_tag", "GAv4", "GAv4-SVC");
    public static zza d = zza.a("analytics.max_tokens", 60L);
    public static zza e = zza.a("analytics.tokens_per_sec", 0.5F);
    public static zza f = zza.a("analytics.max_stored_hits", 2000, 20000);
    public static zza g = zza.a("analytics.max_stored_hits_per_app", 2000);
    public static zza h = zza.a("analytics.max_stored_properties_per_app", 100);
    public static zza i = zza.a("analytics.local_dispatch_millis", 0x1b7740L, 0x1d4c0L);
    public static zza j = zza.a("analytics.initial_local_dispatch_millis", 5000L, 5000L);
    public static zza k = zza.a("analytics.min_local_dispatch_millis", 0x1d4c0L);
    public static zza l = zza.a("analytics.max_local_dispatch_millis", 0x6ddd00L);
    public static zza m = zza.a("analytics.dispatch_alarm_millis", 0x6ddd00L);
    public static zza n = zza.a("analytics.max_dispatch_alarm_millis", 0x1ee6280L);
    public static zza o = zza.a("analytics.max_hits_per_dispatch", 20);
    public static zza p = zza.a("analytics.max_hits_per_batch", 20);
    public static zza q = zza.a("analytics.insecure_host", "http://www.google-analytics.com");
    public static zza r = zza.a("analytics.secure_host", "https://ssl.google-analytics.com");
    public static zza s = zza.a("analytics.simple_endpoint", "/collect");
    public static zza t = zza.a("analytics.batching_endpoint", "/batch");
    public static zza u = zza.a("analytics.max_get_length", 2036);
    public static zza v;
    public static zza w;
    public static zza x = zza.a("analytics.max_hits_per_request.k", 20);
    public static zza y = zza.a("analytics.max_hit_length.k", 8192);
    public static zza z = zza.a("analytics.max_post_length.k", 8192);

    static 
    {
        v = zza.a("analytics.batching_strategy.k", zzm.e.name(), zzm.e.name());
        w = zza.a("analytics.compression_strategy.k", zzo.b.name());
    }

    private class zza
    {

        private final Object a;
        private final zzkf b;
        private Object c;

        static zza a(String s1, float f1)
        {
            return a(s1, f1, f1);
        }

        static zza a(String s1, float f1, float f2)
        {
            return new zza(zzkf.a(s1, Float.valueOf(f2)), Float.valueOf(f1));
        }

        static zza a(String s1, int i1)
        {
            return a(s1, i1, i1);
        }

        static zza a(String s1, int i1, int j1)
        {
            return new zza(zzkf.a(s1, Integer.valueOf(j1)), Integer.valueOf(i1));
        }

        static zza a(String s1, long l1)
        {
            return a(s1, l1, l1);
        }

        static zza a(String s1, long l1, long l2)
        {
            return new zza(zzkf.a(s1, Long.valueOf(l2)), Long.valueOf(l1));
        }

        static zza a(String s1, String s2)
        {
            return a(s1, s2, s2);
        }

        static zza a(String s1, String s2, String s3)
        {
            return new zza(zzkf.a(s1, s3), s2);
        }

        static zza a(String s1, boolean flag)
        {
            return a(s1, flag, flag);
        }

        static zza a(String s1, boolean flag, boolean flag1)
        {
            return new zza(zzkf.a(s1, flag1), Boolean.valueOf(flag));
        }

        public Object a()
        {
            if (c != null)
            {
                return c;
            }
            if (zzd.a && zzkf.b())
            {
                return b.d();
            } else
            {
                return a;
            }
        }

        private zza(zzkf zzkf1, Object obj)
        {
            zzu.a(zzkf1);
            b = zzkf1;
            a = obj;
        }
    }

}
