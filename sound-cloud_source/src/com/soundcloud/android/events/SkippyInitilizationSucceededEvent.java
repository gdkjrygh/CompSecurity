// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;


// Referenced classes of package com.soundcloud.android.events:
//            TrackingEvent

public class SkippyInitilizationSucceededEvent extends TrackingEvent
{

    public static final String FAILURE_COUNT = "failure_count";
    public static final String HAS_FAILED = "has_failed";
    public static final String SUCCESS_COUNT = "success_count";

    public SkippyInitilizationSucceededEvent(int i, int j)
    {
        super("default", System.currentTimeMillis());
        put("failure_count", String.valueOf(i));
        put("success_count", String.valueOf(j));
        String s;
        if (i > 0)
        {
            s = "true";
        } else
        {
            s = "false";
        }
        put("has_failed", s);
    }
}
