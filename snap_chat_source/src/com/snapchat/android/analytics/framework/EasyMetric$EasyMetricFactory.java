// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.framework;


// Referenced classes of package com.snapchat.android.analytics.framework:
//            EasyMetric, PerformanceMetric, ErrorMetric

public static class 
{

    public static EasyMetric a(String s)
    {
        return new EasyMetric(s);
    }

    public static EasyMetric a(String s, double d)
    {
        return new EasyMetric(s, d);
    }

    public static EasyMetric b(String s)
    {
        return new PerformanceMetric(s);
    }

    public static EasyMetric b(String s, double d)
    {
        return new PerformanceMetric(s, d);
    }

    public static EasyMetric c(String s)
    {
        return new ErrorMetric(s);
    }

    public ()
    {
    }
}
