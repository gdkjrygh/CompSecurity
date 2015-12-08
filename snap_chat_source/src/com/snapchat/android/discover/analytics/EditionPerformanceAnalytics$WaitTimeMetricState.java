// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.analytics;


// Referenced classes of package com.snapchat.android.discover.analytics:
//            EditionPerformanceAnalytics

public static final class  extends Enum
{

    private static final REPORTED $VALUES[];
    public static final REPORTED NOT_STARTED;
    public static final REPORTED REPORTED;
    public static final REPORTED TIMING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/discover/analytics/EditionPerformanceAnalytics$WaitTimeMetricState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NOT_STARTED = new <init>("NOT_STARTED", 0);
        TIMING = new <init>("TIMING", 1);
        REPORTED = new <init>("REPORTED", 2);
        $VALUES = (new .VALUES[] {
            NOT_STARTED, TIMING, REPORTED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
