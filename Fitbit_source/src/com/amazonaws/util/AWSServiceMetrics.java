// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.util;

import com.amazonaws.metrics.k;

public final class AWSServiceMetrics extends Enum
    implements k
{

    public static final AWSServiceMetrics e;
    private static final AWSServiceMetrics f[];
    private final String serviceName;

    private AWSServiceMetrics(String s, int i, String s1)
    {
        super(s, i);
        serviceName = s1;
    }

    public static AWSServiceMetrics valueOf(String s)
    {
        return (AWSServiceMetrics)Enum.valueOf(com/amazonaws/util/AWSServiceMetrics, s);
    }

    public static AWSServiceMetrics[] values()
    {
        return (AWSServiceMetrics[])f.clone();
    }

    public String a()
    {
        return serviceName;
    }

    static 
    {
        e = new AWSServiceMetrics("HttpClientGetConnectionTime", 0, "HttpClient");
        f = (new AWSServiceMetrics[] {
            e
        });
    }
}
