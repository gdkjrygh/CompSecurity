// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;


// Referenced classes of package com.soundcloud.android.events:
//            TrackingEvent

public class PaymentFailureEvent extends TrackingEvent
{

    private static final String KEY_REASON = "reason";

    private PaymentFailureEvent(String s)
    {
        super("default", System.currentTimeMillis());
        put("reason", s);
    }

    public static PaymentFailureEvent create(String s)
    {
        return new PaymentFailureEvent(s);
    }

    public String getReason()
    {
        return get("reason");
    }

    public String toString()
    {
        return (new StringBuilder("Payment failure: ")).append(getReason()).toString();
    }
}
