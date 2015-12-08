// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.heartrate;


// Referenced classes of package com.fitbit.data.domain.heartrate:
//            HeartRateZone

public static final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN CARDIO;
    public static final UNKNOWN CUSTOM_ZONE;
    public static final UNKNOWN FAT_BURN;
    public static final UNKNOWN OUT_OF_RANGE;
    public static final UNKNOWN PEAK;
    public static final UNKNOWN UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fitbit/data/domain/heartrate/HeartRateZone$HeartRateZoneType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        OUT_OF_RANGE = new <init>("OUT_OF_RANGE", 0);
        FAT_BURN = new <init>("FAT_BURN", 1);
        CARDIO = new <init>("CARDIO", 2);
        PEAK = new <init>("PEAK", 3);
        CUSTOM_ZONE = new <init>("CUSTOM_ZONE", 4);
        UNKNOWN = new <init>("UNKNOWN", 5);
        $VALUES = (new .VALUES[] {
            OUT_OF_RANGE, FAT_BURN, CARDIO, PEAK, CUSTOM_ZONE, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
