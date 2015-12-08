// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api;


public final class WLConfidenceLevel extends Enum
{

    private static final WLConfidenceLevel $VALUES[];
    public static final WLConfidenceLevel HIGH;
    public static final WLConfidenceLevel LOW;
    public static final WLConfidenceLevel MEDIUM;

    private WLConfidenceLevel(String s, int i)
    {
        super(s, i);
    }

    public static WLConfidenceLevel valueOf(String s)
    {
        return (WLConfidenceLevel)Enum.valueOf(com/worklight/location/api/WLConfidenceLevel, s);
    }

    public static WLConfidenceLevel[] values()
    {
        return (WLConfidenceLevel[])$VALUES.clone();
    }

    static 
    {
        LOW = new WLConfidenceLevel("LOW", 0);
        MEDIUM = new WLConfidenceLevel("MEDIUM", 1);
        HIGH = new WLConfidenceLevel("HIGH", 2);
        $VALUES = (new WLConfidenceLevel[] {
            LOW, MEDIUM, HIGH
        });
    }
}
