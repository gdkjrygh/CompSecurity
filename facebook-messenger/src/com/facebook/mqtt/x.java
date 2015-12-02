// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.mqtt;


public final class x extends Enum
{

    private static final x $VALUES[];
    public static final x ACKNOWLEDGED_DELIVERY;
    public static final x ASSURED_DELIVERY;
    public static final x FIRE_AND_FORGET;
    private final int mValue;

    private x(String s, int i, int j)
    {
        super(s, i);
        mValue = j;
    }

    public static x fromInt(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown QOS level ").append(i).toString());

        case 0: // '\0'
            return FIRE_AND_FORGET;

        case 1: // '\001'
            return ACKNOWLEDGED_DELIVERY;

        case 2: // '\002'
            return ASSURED_DELIVERY;
        }
    }

    public static x valueOf(String s)
    {
        return (x)Enum.valueOf(com/facebook/mqtt/x, s);
    }

    public static x[] values()
    {
        return (x[])$VALUES.clone();
    }

    public int getValue()
    {
        return mValue;
    }

    static 
    {
        FIRE_AND_FORGET = new x("FIRE_AND_FORGET", 0, 0);
        ACKNOWLEDGED_DELIVERY = new x("ACKNOWLEDGED_DELIVERY", 1, 1);
        ASSURED_DELIVERY = new x("ASSURED_DELIVERY", 2, 2);
        $VALUES = (new x[] {
            FIRE_AND_FORGET, ACKNOWLEDGED_DELIVERY, ASSURED_DELIVERY
        });
    }
}
