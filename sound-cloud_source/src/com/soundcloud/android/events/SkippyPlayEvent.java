// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;


// Referenced classes of package com.soundcloud.android.events:
//            TrackingEvent, ConnectionType

public class SkippyPlayEvent extends TrackingEvent
{

    public static final String CONNECTION_TYPE = "connection_type";
    public static final String LOCKS_ACTIVE = "locks_active";

    public SkippyPlayEvent(ConnectionType connectiontype, boolean flag)
    {
        super("default", System.currentTimeMillis());
        put("connection_type", connectiontype.getValue());
        put("locks_active", String.valueOf(flag));
    }
}
