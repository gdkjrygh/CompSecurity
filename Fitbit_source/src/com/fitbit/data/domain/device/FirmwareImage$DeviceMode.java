// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;


// Referenced classes of package com.fitbit.data.domain.device:
//            FirmwareImage

public static final class  extends Enum
{

    private static final BSL $VALUES[];
    public static final BSL APP;
    public static final BSL BSL;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fitbit/data/domain/device/FirmwareImage$DeviceMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        APP = new <init>("APP", 0);
        BSL = new <init>("BSL", 1);
        $VALUES = (new .VALUES[] {
            APP, BSL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
