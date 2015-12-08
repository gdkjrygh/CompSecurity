// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.eventlogger;

import java.util.HashMap;

// Referenced classes of package com.soundcloud.android.analytics.eventlogger:
//            EventLoggerEventData

final class EventLoggerEventDataV1 extends EventLoggerEventData
{

    public EventLoggerEventDataV1(String s, String s1, int i, String s2, String s3, long l, 
            String s4)
    {
        super(s, s1, i, s2, s3, l);
        addToPayload("connection_type", s4);
    }

    protected final void addToPayload(String s, int i)
    {
        payload.put(s, Integer.valueOf(i));
    }

    protected final void addToPayload(String s, long l)
    {
        payload.put(s, Long.valueOf(l));
    }

    protected final void addToPayload(String s, boolean flag)
    {
        payload.put(s, Boolean.valueOf(flag));
    }
}
