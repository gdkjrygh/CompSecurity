// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry;


public final class EventPriority extends Enum
{

    private static final EventPriority $VALUES[];
    public static final EventPriority HIGH;
    public static final EventPriority LOW;
    public static final EventPriority NORMAL;
    public static final EventPriority OFF;
    public static final EventPriority UNSPECIFIED;
    private final int val;

    private EventPriority(String s, int i, int j)
    {
        super(s, i);
        val = j;
    }

    public static EventPriority fromValue(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown EventPriority value: ")).append(i).toString());

        case -1: 
            return UNSPECIFIED;

        case 0: // '\0'
            return OFF;

        case 1: // '\001'
            return LOW;

        case 2: // '\002'
            return NORMAL;

        case 3: // '\003'
            return HIGH;
        }
    }

    public static EventPriority valueOf(String s)
    {
        return (EventPriority)Enum.valueOf(com/microsoft/applications/telemetry/EventPriority, s);
    }

    public static EventPriority[] values()
    {
        return (EventPriority[])$VALUES.clone();
    }

    public final int getValue()
    {
        return val;
    }

    static 
    {
        UNSPECIFIED = new EventPriority("UNSPECIFIED", 0, -1);
        OFF = new EventPriority("OFF", 1, 0);
        LOW = new EventPriority("LOW", 2, 1);
        NORMAL = new EventPriority("NORMAL", 3, 2);
        HIGH = new EventPriority("HIGH", 4, 3);
        $VALUES = (new EventPriority[] {
            UNSPECIFIED, OFF, LOW, NORMAL, HIGH
        });
    }
}
