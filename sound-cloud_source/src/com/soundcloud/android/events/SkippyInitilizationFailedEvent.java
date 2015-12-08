// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;


// Referenced classes of package com.soundcloud.android.events:
//            TrackingEvent

public class SkippyInitilizationFailedEvent extends TrackingEvent
{

    public static final String FAILURE_COUNT = "failure_count";
    public static final String HAS_SUCCEEDED = "has_succeeded";
    public static final String MESSAGE = "message";
    public static final String SUCCESS_COUNT = "success_count";
    public static final String THROWABLE = "throwable";

    public SkippyInitilizationFailedEvent(Throwable throwable, String s, int i, int j)
    {
        super("default", System.currentTimeMillis());
        put("throwable", throwable.toString());
        put("message", s);
        put("failure_count", String.valueOf(i));
        put("success_count", String.valueOf(j));
        if (j > 0)
        {
            throwable = "true";
        } else
        {
            throwable = "false";
        }
        put("has_succeeded", throwable);
    }
}
