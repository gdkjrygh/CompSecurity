// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave;


public final class DataType extends Enum
{

    private static final DataType $VALUES[];
    public static final DataType DT_3GPP_CAPTION_METADATA;
    public static final DataType DT_AMF;
    private final int value;

    private DataType(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static DataType valueOf(String s)
    {
        return (DataType)Enum.valueOf(com/adobe/ave/DataType, s);
    }

    public static DataType[] values()
    {
        return (DataType[])$VALUES.clone();
    }

    final int getValue()
    {
        return value;
    }

    static 
    {
        DT_3GPP_CAPTION_METADATA = new DataType("DT_3GPP_CAPTION_METADATA", 0, 0x33475050);
        DT_AMF = new DataType("DT_AMF", 1, 0x414d462e);
        $VALUES = (new DataType[] {
            DT_3GPP_CAPTION_METADATA, DT_AMF
        });
    }
}
