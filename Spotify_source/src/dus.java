// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class dus
{

    public static final gip a = gip.a("total_data_usage_date");
    public static final gip b = gip.a("total_data_usage_delta");
    public static final gip c = gip.a("total_data_usage");
    public final TimeUnit d;
    public final ScheduledExecutorService e;
    public long f;

    public dus(ScheduledExecutorService scheduledexecutorservice)
    {
        d = TimeUnit.HOURS;
        f = 0xfa00000L;
        e = scheduledexecutorservice;
    }

    static long a(dus dus1)
    {
        return dus1.f;
    }

    static long a(dus dus1, long l)
    {
        dus1.f = l;
        return l;
    }

}
