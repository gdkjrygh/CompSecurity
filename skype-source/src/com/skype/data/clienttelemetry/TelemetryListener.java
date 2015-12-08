// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.data.clienttelemetry;


public interface TelemetryListener
{
    public static final class EventType extends Enum
    {

        public static final EventType a;
        public static final EventType b;
        public static final EventType c;
        private static final EventType d[];

        public static EventType valueOf(String s)
        {
            return (EventType)Enum.valueOf(com/skype/data/clienttelemetry/TelemetryListener$EventType, s);
        }

        public static EventType[] values()
        {
            return (EventType[])d.clone();
        }

        static 
        {
            a = new EventType("SENT", 0);
            b = new EventType("SEND_FAILED", 1);
            c = new EventType("EVENT_DROPPED", 2);
            d = (new EventType[] {
                a, b, c
            });
        }

        private EventType(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract void a();
}
