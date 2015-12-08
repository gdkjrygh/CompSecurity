// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry;


public final class ActionType extends Enum
{

    private static final ActionType $VALUES[];
    public static final ActionType CLICK;
    public static final ActionType HOVER;
    public static final ActionType OTHER;
    public static final ActionType PAN;
    public static final ActionType UNKNOWN;
    public static final ActionType UNSPECIFIED;
    public static final ActionType ZOOM;
    private final int val;

    private ActionType(String s, int i, int j)
    {
        super(s, i);
        val = j;
    }

    public static ActionType valueOf(String s)
    {
        return (ActionType)Enum.valueOf(com/microsoft/applications/telemetry/ActionType, s);
    }

    public static ActionType[] values()
    {
        return (ActionType[])$VALUES.clone();
    }

    public final int getValue()
    {
        return val;
    }

    static 
    {
        UNSPECIFIED = new ActionType("UNSPECIFIED", 0, 0);
        UNKNOWN = new ActionType("UNKNOWN", 1, 1);
        OTHER = new ActionType("OTHER", 2, 2);
        CLICK = new ActionType("CLICK", 3, 3);
        PAN = new ActionType("PAN", 4, 5);
        ZOOM = new ActionType("ZOOM", 5, 6);
        HOVER = new ActionType("HOVER", 6, 7);
        $VALUES = (new ActionType[] {
            UNSPECIFIED, UNKNOWN, OTHER, CLICK, PAN, ZOOM, HOVER
        });
    }
}
