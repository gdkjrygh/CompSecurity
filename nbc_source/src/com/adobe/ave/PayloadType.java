// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave;


public final class PayloadType extends Enum
{

    private static final PayloadType $VALUES[];
    public static final PayloadType AUDIO;
    public static final PayloadType DATA;
    public static final PayloadType MAX;
    public static final PayloadType UNKNOWN;
    public static final PayloadType VIDEO;
    private final int value;

    private PayloadType(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static PayloadType valueOf(String s)
    {
        return (PayloadType)Enum.valueOf(com/adobe/ave/PayloadType, s);
    }

    public static PayloadType[] values()
    {
        return (PayloadType[])$VALUES.clone();
    }

    final int getValue()
    {
        return value;
    }

    static 
    {
        UNKNOWN = new PayloadType("UNKNOWN", 0, 0);
        AUDIO = new PayloadType("AUDIO", 1, 1);
        VIDEO = new PayloadType("VIDEO", 2, 2);
        DATA = new PayloadType("DATA", 3, 3);
        MAX = new PayloadType("MAX", 4, 4);
        $VALUES = (new PayloadType[] {
            UNKNOWN, AUDIO, VIDEO, DATA, MAX
        });
    }
}
