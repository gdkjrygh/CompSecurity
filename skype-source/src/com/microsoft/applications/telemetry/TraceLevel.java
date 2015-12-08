// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry;


public final class TraceLevel extends Enum
{

    private static final TraceLevel $VALUES[];
    public static final TraceLevel ERROR;
    public static final TraceLevel INFORMATION;
    public static final TraceLevel NONE;
    public static final TraceLevel VERBOSE;
    public static final TraceLevel WARNING;
    private final int val;

    private TraceLevel(String s, int i, int j)
    {
        super(s, i);
        val = j;
    }

    public static TraceLevel valueOf(String s)
    {
        return (TraceLevel)Enum.valueOf(com/microsoft/applications/telemetry/TraceLevel, s);
    }

    public static TraceLevel[] values()
    {
        return (TraceLevel[])$VALUES.clone();
    }

    public final int getValue()
    {
        return val;
    }

    static 
    {
        NONE = new TraceLevel("NONE", 0, 0);
        ERROR = new TraceLevel("ERROR", 1, 1);
        WARNING = new TraceLevel("WARNING", 2, 2);
        INFORMATION = new TraceLevel("INFORMATION", 3, 3);
        VERBOSE = new TraceLevel("VERBOSE", 4, 4);
        $VALUES = (new TraceLevel[] {
            NONE, ERROR, WARNING, INFORMATION, VERBOSE
        });
    }
}
