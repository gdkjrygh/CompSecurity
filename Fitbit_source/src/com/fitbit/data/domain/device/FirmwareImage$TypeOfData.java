// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;


// Referenced classes of package com.fitbit.data.domain.device:
//            FirmwareImage

public static final class  extends Enum
{

    private static final MEGA $VALUES[];
    public static final MEGA MEGA;
    public static final MEGA MICRO;
    public static final MEGA MICROV2;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fitbit/data/domain/device/FirmwareImage$TypeOfData, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        MICRO = new <init>("MICRO", 0);
        MICROV2 = new <init>("MICROV2", 1);
        MEGA = new <init>("MEGA", 2);
        $VALUES = (new .VALUES[] {
            MICRO, MICROV2, MEGA
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
