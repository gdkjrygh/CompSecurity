// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry;


public final class AppLifecycleState extends Enum
{

    private static final AppLifecycleState $VALUES[];
    public static final AppLifecycleState BACKGROUND;
    public static final AppLifecycleState EXIT;
    public static final AppLifecycleState FOREGROUND;
    public static final AppLifecycleState LAUNCH;
    public static final AppLifecycleState RESUME;
    public static final AppLifecycleState SUSPEND;
    public static final AppLifecycleState UNKNOWN;
    private final int val;

    private AppLifecycleState(String s, int i, int j)
    {
        super(s, i);
        val = j;
    }

    public static AppLifecycleState valueOf(String s)
    {
        return (AppLifecycleState)Enum.valueOf(com/microsoft/applications/telemetry/AppLifecycleState, s);
    }

    public static AppLifecycleState[] values()
    {
        return (AppLifecycleState[])$VALUES.clone();
    }

    public final int getValue()
    {
        return val;
    }

    static 
    {
        UNKNOWN = new AppLifecycleState("UNKNOWN", 0, 0);
        LAUNCH = new AppLifecycleState("LAUNCH", 1, 1);
        EXIT = new AppLifecycleState("EXIT", 2, 2);
        SUSPEND = new AppLifecycleState("SUSPEND", 3, 3);
        RESUME = new AppLifecycleState("RESUME", 4, 4);
        FOREGROUND = new AppLifecycleState("FOREGROUND", 5, 5);
        BACKGROUND = new AppLifecycleState("BACKGROUND", 6, 6);
        $VALUES = (new AppLifecycleState[] {
            UNKNOWN, LAUNCH, EXIT, SUSPEND, RESUME, FOREGROUND, BACKGROUND
        });
    }
}
