// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;


// Referenced classes of package com.fitbit.data.domain.device:
//            AutoLap

public static final class  extends Enum
{

    private static final DISTANCE_MILE $VALUES[];
    public static final DISTANCE_MILE DISTANCE_KM;
    public static final DISTANCE_MILE DISTANCE_MILE;
    public static final DISTANCE_MILE TIME;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fitbit/data/domain/device/AutoLap$AutoLapType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        TIME = new <init>("TIME", 0);
        DISTANCE_KM = new <init>("DISTANCE_KM", 1);
        DISTANCE_MILE = new <init>("DISTANCE_MILE", 2);
        $VALUES = (new .VALUES[] {
            TIME, DISTANCE_KM, DISTANCE_MILE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
