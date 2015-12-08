// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.ds;

public final class r
{
    public static final class a
    {

        private final Object a;
        private final ds b;
        private Object c;

        static a a(String s, int i1)
        {
            return new a(ds.a(s, Integer.valueOf(i1)), Integer.valueOf(i1));
        }

        static a a(String s, long l1)
        {
            return new a(ds.a(s, Long.valueOf(l1)), Long.valueOf(l1));
        }

        static a a(String s, String s1, String s2)
        {
            return new a(ds.a(s, s2), s1);
        }

        static a a(String s, boolean flag)
        {
            return new a(ds.a(s, flag), Boolean.valueOf(flag));
        }

        public final Object a()
        {
            if (c != null)
            {
                return c;
            }
            if (f.a && ds.b())
            {
                return b.e();
            } else
            {
                return a;
            }
        }

        private a(ds ds1, Object obj)
        {
            u.a(ds1);
            b = ds1;
            a = obj;
        }
    }


    public static a a = a.a("measurement.service_enabled", false);
    public static a b = a.a("measurement.service_client_enabled", true);
    public static a c = a.a("measurement.log_tag", "GMPM", "GMPM-SVC");
    public static a d = a.a("measurement.ad_id_cache_time", 10000L);
    public static a e = a.a("measurement.monitoring.sample_period_millis", 0x5265c00L);
    public static a f = a.a("measurement.upload.max_bundles", 100);
    public static a g = a.a("measurement.upload.max_batch_size", 0x10000);
    public static a h = a.a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a");
    public static a i = a.a("measurement.upload.backoff_period", 0x2932e00L);
    public static a j = a.a("measurement.upload.interval", 0x36ee80L);
    public static a k = a.a("measurement.upload.stale_data_deletion_interval", 0x5265c00L);
    public static a l = a.a("measurement.upload.initial_upload_delay_time", 15000L);
    public static a m = a.a("measurement.upload.retry_time", 0x1b7740L);
    public static a n = a.a("measurement.upload.retry_count", 6);
    public static a o = a.a("measurement.upload.retry_time", 0x90321000L);
    public static a p = a.a("measurement.service_client.idle_disconnect_millis", 5000L);

}
