// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;


// Referenced classes of package com.accuweather.android.utilities:
//            Constants

public static final class model extends Enum
{

    private static final TABLET_16 $VALUES[];
    public static final TABLET_16 NOOK_COLOR;
    public static final TABLET_16 NOOK_HD;
    public static final TABLET_16 NOOK_HDPLUS;
    public static final TABLET_16 TABLET_16;
    public static final TABLET_16 TABLET_8;
    private String model;

    public static model valueOf(String s)
    {
        return (model)Enum.valueOf(com/accuweather/android/utilities/Constants$DeviceModel$BN, s);
    }

    public static model[] values()
    {
        return (model[])$VALUES.clone();
    }

    String model()
    {
        return model;
    }

    static 
    {
        NOOK_COLOR = new <init>("NOOK_COLOR", 0, "BNRV200");
        NOOK_HD = new <init>("NOOK_HD", 1, "BNTV400");
        NOOK_HDPLUS = new <init>("NOOK_HDPLUS", 2, "BNTV600");
        TABLET_8 = new <init>("TABLET_8", 3, "BNTV250A");
        TABLET_16 = new <init>("TABLET_16", 4, "BNTV250");
        $VALUES = (new .VALUES[] {
            NOOK_COLOR, NOOK_HD, NOOK_HDPLUS, TABLET_8, TABLET_16
        });
    }


    private (String s, int i, String s1)
    {
        super(s, i);
        model = s1;
    }
}
