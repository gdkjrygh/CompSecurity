// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.client.model;


public final class EventType extends Enum
{

    private static final EventType $VALUES[];
    public static final EventType event;
    public static final EventType sessionEnded;
    public static final EventType sessionStarted;

    private EventType(String s, int i)
    {
        super(s, i);
    }

    public static EventType valueOf(String s)
    {
        return (EventType)Enum.valueOf(com/netflix/mediaclient/service/logging/client/model/EventType, s);
    }

    public static EventType[] values()
    {
        return (EventType[])$VALUES.clone();
    }

    static 
    {
        event = new EventType("event", 0);
        sessionStarted = new EventType("sessionStarted", 1);
        sessionEnded = new EventType("sessionEnded", 2);
        $VALUES = (new EventType[] {
            event, sessionStarted, sessionEnded
        });
    }
}
