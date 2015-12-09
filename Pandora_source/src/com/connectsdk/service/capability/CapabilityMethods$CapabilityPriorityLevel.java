// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.service.capability;


// Referenced classes of package com.connectsdk.service.capability:
//            CapabilityMethods

public static final class value extends Enum
{

    private static final VERY_HIGH $VALUES[];
    public static final VERY_HIGH HIGH;
    public static final VERY_HIGH LOW;
    public static final VERY_HIGH NORMAL;
    public static final VERY_HIGH VERY_HIGH;
    public static final VERY_HIGH VERY_LOW;
    private final int value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/connectsdk/service/capability/CapabilityMethods$CapabilityPriorityLevel, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    public int getValue()
    {
        return value;
    }

    static 
    {
        VERY_LOW = new <init>("VERY_LOW", 0, 1);
        LOW = new <init>("LOW", 1, 25);
        NORMAL = new <init>("NORMAL", 2, 50);
        HIGH = new <init>("HIGH", 3, 75);
        VERY_HIGH = new <init>("VERY_HIGH", 4, 100);
        $VALUES = (new .VALUES[] {
            VERY_LOW, LOW, NORMAL, HIGH, VERY_HIGH
        });
    }

    private Q(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }
}
