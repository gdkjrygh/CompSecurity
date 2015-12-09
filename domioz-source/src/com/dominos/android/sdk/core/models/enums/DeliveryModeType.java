// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.enums;


public final class DeliveryModeType extends Enum
{

    private static final DeliveryModeType $VALUES[];
    public static final DeliveryModeType CAMPUS;
    public static final DeliveryModeType NORMAL;
    private final String text;

    private DeliveryModeType(String s, int i, String s1)
    {
        super(s, i);
        text = s1;
    }

    public static DeliveryModeType valueOf(String s)
    {
        return (DeliveryModeType)Enum.valueOf(com/dominos/android/sdk/core/models/enums/DeliveryModeType, s);
    }

    public static DeliveryModeType[] values()
    {
        return (DeliveryModeType[])$VALUES.clone();
    }

    public final String toString()
    {
        return text;
    }

    static 
    {
        NORMAL = new DeliveryModeType("NORMAL", 0, "normal");
        CAMPUS = new DeliveryModeType("CAMPUS", 1, "campus");
        $VALUES = (new DeliveryModeType[] {
            NORMAL, CAMPUS
        });
    }
}
