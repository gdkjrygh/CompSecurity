// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.data.clienttelemetry;


public interface EcsListener
{
    public static final class EventType extends Enum
    {

        public static final EventType a;
        public static final EventType b;
        private static final EventType c[];

        public static EventType valueOf(String s)
        {
            return (EventType)Enum.valueOf(com/skype/data/clienttelemetry/EcsListener$EventType, s);
        }

        public static EventType[] values()
        {
            return (EventType[])c.clone();
        }

        static 
        {
            a = new EventType("CONFIG_UPDATED", 0);
            b = new EventType("TOKEN_IS_INVALID", 1);
            c = (new EventType[] {
                a, b
            });
        }

        private EventType(String s, int i)
        {
            super(s, i);
        }
    }

}
