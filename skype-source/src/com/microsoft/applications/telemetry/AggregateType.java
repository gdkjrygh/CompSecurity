// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry;


public final class AggregateType extends Enum
{

    private static final AggregateType $VALUES[];
    public static final AggregateType MAXIMUM;
    public static final AggregateType MINIMUM;
    public static final AggregateType SUM;
    public static final AggregateType SUM_OF_SQUARES;
    private final int val;

    private AggregateType(String s, int i, int j)
    {
        super(s, i);
        val = j;
    }

    public static AggregateType valueOf(String s)
    {
        return (AggregateType)Enum.valueOf(com/microsoft/applications/telemetry/AggregateType, s);
    }

    public static AggregateType[] values()
    {
        return (AggregateType[])$VALUES.clone();
    }

    public final int getValue()
    {
        return val;
    }

    static 
    {
        SUM = new AggregateType("SUM", 0, 0);
        MAXIMUM = new AggregateType("MAXIMUM", 1, 1);
        MINIMUM = new AggregateType("MINIMUM", 2, 2);
        SUM_OF_SQUARES = new AggregateType("SUM_OF_SQUARES", 3, 3);
        $VALUES = (new AggregateType[] {
            SUM, MAXIMUM, MINIMUM, SUM_OF_SQUARES
        });
    }
}
