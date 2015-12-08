// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.im;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            aa, ac

public final class am
{
    public static final class a
    {

        private final Object a;
        private final im b;
        private Object c;

        static a a(String s1, float f1)
        {
            return a(s1, f1, f1);
        }

        static a a(String s1, float f1, float f2)
        {
            return new a(im.a(s1, Float.valueOf(f2)), Float.valueOf(f1));
        }

        static a a(String s1, int i1)
        {
            return a(s1, i1, i1);
        }

        static a a(String s1, int i1, int j1)
        {
            return new a(im.a(s1, Integer.valueOf(j1)), Integer.valueOf(i1));
        }

        static a a(String s1, long l1)
        {
            return a(s1, l1, l1);
        }

        static a a(String s1, long l1, long l2)
        {
            return new a(im.a(s1, Long.valueOf(l2)), Long.valueOf(l1));
        }

        static a a(String s1, String s2)
        {
            return a(s1, s2, s2);
        }

        static a a(String s1, String s2, String s3)
        {
            return new a(im.a(s1, s3), s2);
        }

        static a a(String s1, boolean flag)
        {
            return a(s1, flag, flag);
        }

        static a a(String s1, boolean flag, boolean flag1)
        {
            return new a(im.a(s1, flag1), Boolean.valueOf(flag));
        }

        public Object a()
        {
            if (c != null)
            {
                return c;
            }
            if (g.a && im.b())
            {
                return b.d();
            } else
            {
                return a;
            }
        }

        private a(im im1, Object obj)
        {
            com.google.android.gms.common.internal.z.a(im1);
            b = im1;
            a = obj;
        }
    }


    public static a A = a.a("analytics.max_batch_post_length", 8192);
    public static a B = a.a("analytics.fallback_responses.k", "404,502");
    public static a C = a.a("analytics.batch_retry_interval.seconds.k", 3600);
    public static a D = a.a("analytics.service_monitor_interval", 0x5265c00L);
    public static a E = a.a("analytics.http_connection.connect_timeout_millis", 60000);
    public static a F = a.a("analytics.http_connection.read_timeout_millis", 61000);
    public static a G = a.a("analytics.campaigns.time_limit", 0x5265c00L);
    public static a H = a.a("analytics.first_party_experiment_id", "");
    public static a I = a.a("analytics.first_party_experiment_variant", 0);
    public static a J = a.a("analytics.test.disable_receiver", false);
    public static a K = a.a("analytics.service_client.idle_disconnect_millis", 10000L, 10000L);
    public static a L = a.a("analytics.service_client.connect_timeout_millis", 5000L);
    public static a M = a.a("analytics.service_client.second_connect_delay_millis", 5000L);
    public static a N = a.a("analytics.service_client.unexpected_reconnect_millis", 60000L);
    public static a O = a.a("analytics.service_client.reconnect_throttle_millis", 0x1b7740L);
    public static a P = a.a("analytics.monitoring.sample_period_millis", 0x5265c00L);
    public static a Q = a.a("analytics.initialization_warning_threshold", 5000L);
    public static a a = a.a("analytics.service_enabled", false);
    public static a b = a.a("analytics.service_client_enabled", true);
    public static a c = a.a("analytics.log_tag", "GAv4", "GAv4-SVC");
    public static a d = a.a("analytics.max_tokens", 60L);
    public static a e = a.a("analytics.tokens_per_sec", 0.5F);
    public static a f = a.a("analytics.max_stored_hits", 2000, 20000);
    public static a g = a.a("analytics.max_stored_hits_per_app", 2000);
    public static a h = a.a("analytics.max_stored_properties_per_app", 100);
    public static a i = a.a("analytics.local_dispatch_millis", 0x1b7740L, 0x1d4c0L);
    public static a j = a.a("analytics.initial_local_dispatch_millis", 5000L, 5000L);
    public static a k = a.a("analytics.min_local_dispatch_millis", 0x1d4c0L);
    public static a l = a.a("analytics.max_local_dispatch_millis", 0x6ddd00L);
    public static a m = a.a("analytics.dispatch_alarm_millis", 0x6ddd00L);
    public static a n = a.a("analytics.max_dispatch_alarm_millis", 0x1ee6280L);
    public static a o = a.a("analytics.max_hits_per_dispatch", 20);
    public static a p = a.a("analytics.max_hits_per_batch", 20);
    public static a q = a.a("analytics.insecure_host", "http://www.google-analytics.com");
    public static a r = a.a("analytics.secure_host", "https://ssl.google-analytics.com");
    public static a s = a.a("analytics.simple_endpoint", "/collect");
    public static a t = a.a("analytics.batching_endpoint", "/batch");
    public static a u = a.a("analytics.max_get_length", 2036);
    public static a v;
    public static a w;
    public static a x = a.a("analytics.max_hits_per_request.k", 20);
    public static a y = a.a("analytics.max_hit_length.k", 8192);
    public static a z = a.a("analytics.max_post_length.k", 8192);

    static 
    {
        v = a.a("analytics.batching_strategy.k", aa.e.name(), aa.e.name());
        w = a.a("analytics.compression_strategy.k", ac.b.name());
    }
}
