// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave;


public final class ContainerType extends Enum
{

    private static final ContainerType $VALUES[];
    public static final ContainerType F4M;
    public static final ContainerType FLV;
    public static final ContainerType HLS;
    public static final ContainerType MAX_TYPES;
    public static final ContainerType MP4;
    public static final ContainerType UNDEFINED;
    private final int value;

    private ContainerType(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static ContainerType valueOf(String s)
    {
        return (ContainerType)Enum.valueOf(com/adobe/ave/ContainerType, s);
    }

    public static ContainerType[] values()
    {
        return (ContainerType[])$VALUES.clone();
    }

    final int getValue()
    {
        return value;
    }

    static 
    {
        UNDEFINED = new ContainerType("UNDEFINED", 0, 0);
        FLV = new ContainerType("FLV", 1, 1);
        F4M = new ContainerType("F4M", 2, 2);
        HLS = new ContainerType("HLS", 3, 3);
        MP4 = new ContainerType("MP4", 4, 4);
        MAX_TYPES = new ContainerType("MAX_TYPES", 5, 5);
        $VALUES = (new ContainerType[] {
            UNDEFINED, FLV, F4M, HLS, MP4, MAX_TYPES
        });
    }
}
