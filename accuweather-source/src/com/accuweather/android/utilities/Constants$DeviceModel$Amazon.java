// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;


// Referenced classes of package com.accuweather.android.utilities:
//            Constants

public static final class model extends Enum
{

    private static final KINDLE_FIRE_HDX_9_WIFI_3RD_GEN $VALUES[];
    public static final KINDLE_FIRE_HDX_9_WIFI_3RD_GEN KINDLE_FIRE_1ST_GEN;
    public static final KINDLE_FIRE_HDX_9_WIFI_3RD_GEN KINDLE_FIRE_2ND_GEN;
    public static final KINDLE_FIRE_HDX_9_WIFI_3RD_GEN KINDLE_FIRE_HDX_7_WAN_3RD_GEN;
    public static final KINDLE_FIRE_HDX_9_WIFI_3RD_GEN KINDLE_FIRE_HDX_7_WIFI_3RD_GEN;
    public static final KINDLE_FIRE_HDX_9_WIFI_3RD_GEN KINDLE_FIRE_HDX_9_WAN_3RD_GEN;
    public static final KINDLE_FIRE_HDX_9_WIFI_3RD_GEN KINDLE_FIRE_HDX_9_WIFI_3RD_GEN;
    public static final KINDLE_FIRE_HDX_9_WIFI_3RD_GEN KINDLE_FIRE_HD_7_2ND_GEN;
    public static final KINDLE_FIRE_HDX_9_WIFI_3RD_GEN KINDLE_FIRE_HD_9_WAN_2ND_GEN;
    public static final KINDLE_FIRE_HDX_9_WIFI_3RD_GEN KINDLE_FIRE_HD_9_WIFI_2ND_GEN;
    private String model;

    public static model valueOf(String s)
    {
        return (model)Enum.valueOf(com/accuweather/android/utilities/Constants$DeviceModel$Amazon, s);
    }

    public static model[] values()
    {
        return (model[])$VALUES.clone();
    }

    static 
    {
        KINDLE_FIRE_1ST_GEN = new <init>("KINDLE_FIRE_1ST_GEN", 0, "Kindle Fire");
        KINDLE_FIRE_2ND_GEN = new <init>("KINDLE_FIRE_2ND_GEN", 1, "KFOT");
        KINDLE_FIRE_HD_7_2ND_GEN = new <init>("KINDLE_FIRE_HD_7_2ND_GEN", 2, "KFTT");
        KINDLE_FIRE_HD_9_WIFI_2ND_GEN = new <init>("KINDLE_FIRE_HD_9_WIFI_2ND_GEN", 3, "KFJWI");
        KINDLE_FIRE_HD_9_WAN_2ND_GEN = new <init>("KINDLE_FIRE_HD_9_WAN_2ND_GEN", 4, "KFJWA");
        KINDLE_FIRE_HDX_7_WAN_3RD_GEN = new <init>("KINDLE_FIRE_HDX_7_WAN_3RD_GEN", 5, "KFTHWA");
        KINDLE_FIRE_HDX_7_WIFI_3RD_GEN = new <init>("KINDLE_FIRE_HDX_7_WIFI_3RD_GEN", 6, "KFTHWI");
        KINDLE_FIRE_HDX_9_WAN_3RD_GEN = new <init>("KINDLE_FIRE_HDX_9_WAN_3RD_GEN", 7, "KFAPWA");
        KINDLE_FIRE_HDX_9_WIFI_3RD_GEN = new <init>("KINDLE_FIRE_HDX_9_WIFI_3RD_GEN", 8, "KFAPWI");
        $VALUES = (new .VALUES[] {
            KINDLE_FIRE_1ST_GEN, KINDLE_FIRE_2ND_GEN, KINDLE_FIRE_HD_7_2ND_GEN, KINDLE_FIRE_HD_9_WIFI_2ND_GEN, KINDLE_FIRE_HD_9_WAN_2ND_GEN, KINDLE_FIRE_HDX_7_WAN_3RD_GEN, KINDLE_FIRE_HDX_7_WIFI_3RD_GEN, KINDLE_FIRE_HDX_9_WAN_3RD_GEN, KINDLE_FIRE_HDX_9_WIFI_3RD_GEN
        });
    }


    private (String s, int i, String s1)
    {
        super(s, i);
        model = s1;
    }
}
