// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs.domain;


public final class EventID extends Enum
{

    public static final EventID a;
    public static final EventID b;
    public static final EventID c;
    private static final EventID d[];
    private final byte eventId;

    private EventID(String s, int i, byte byte0)
    {
        super(s, i);
        eventId = byte0;
    }

    public static EventID valueOf(String s)
    {
        return (EventID)Enum.valueOf(com/fitbit/dncs/domain/EventID, s);
    }

    public static EventID[] values()
    {
        return (EventID[])d.clone();
    }

    public byte a()
    {
        return eventId;
    }

    static 
    {
        a = new EventID("NOTIFICATION_ADDED", 0, (byte)0);
        b = new EventID("NOTIFICATION_MODIFIED", 1, (byte)1);
        c = new EventID("NOTIFICATION_REMOVED", 2, (byte)2);
        d = (new EventID[] {
            a, b, c
        });
    }
}
