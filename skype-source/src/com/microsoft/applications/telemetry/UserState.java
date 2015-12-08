// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry;


public final class UserState extends Enum
{

    private static final UserState $VALUES[];
    public static final UserState CONNECTED;
    public static final UserState REACHABLE;
    public static final UserState SIGNED_IN;
    public static final UserState SIGNED_OUT;
    public static final UserState UNKNOWN;
    private final int val;

    private UserState(String s, int i, int j)
    {
        super(s, i);
        val = j;
    }

    public static UserState valueOf(String s)
    {
        return (UserState)Enum.valueOf(com/microsoft/applications/telemetry/UserState, s);
    }

    public static UserState[] values()
    {
        return (UserState[])$VALUES.clone();
    }

    public final int getValue()
    {
        return val;
    }

    static 
    {
        UNKNOWN = new UserState("UNKNOWN", 0, 0);
        CONNECTED = new UserState("CONNECTED", 1, 1);
        REACHABLE = new UserState("REACHABLE", 2, 2);
        SIGNED_IN = new UserState("SIGNED_IN", 3, 3);
        SIGNED_OUT = new UserState("SIGNED_OUT", 4, 4);
        $VALUES = (new UserState[] {
            UNKNOWN, CONNECTED, REACHABLE, SIGNED_IN, SIGNED_OUT
        });
    }
}
