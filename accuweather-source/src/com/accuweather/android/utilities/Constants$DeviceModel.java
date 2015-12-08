// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;


// Referenced classes of package com.accuweather.android.utilities:
//            Constants

public static class BN.model
{
    public static final class Amazon extends Enum
    {

        private static final Amazon $VALUES[];
        public static final Amazon KINDLE_FIRE_1ST_GEN;
        public static final Amazon KINDLE_FIRE_2ND_GEN;
        public static final Amazon KINDLE_FIRE_HDX_7_WAN_3RD_GEN;
        public static final Amazon KINDLE_FIRE_HDX_7_WIFI_3RD_GEN;
        public static final Amazon KINDLE_FIRE_HDX_9_WAN_3RD_GEN;
        public static final Amazon KINDLE_FIRE_HDX_9_WIFI_3RD_GEN;
        public static final Amazon KINDLE_FIRE_HD_7_2ND_GEN;
        public static final Amazon KINDLE_FIRE_HD_9_WAN_2ND_GEN;
        public static final Amazon KINDLE_FIRE_HD_9_WIFI_2ND_GEN;
        private String model;

        public static Amazon valueOf(String s)
        {
            return (Amazon)Enum.valueOf(com/accuweather/android/utilities/Constants$DeviceModel$Amazon, s);
        }

        public static Amazon[] values()
        {
            return (Amazon[])$VALUES.clone();
        }

        static 
        {
            KINDLE_FIRE_1ST_GEN = new Amazon("KINDLE_FIRE_1ST_GEN", 0, "Kindle Fire");
            KINDLE_FIRE_2ND_GEN = new Amazon("KINDLE_FIRE_2ND_GEN", 1, "KFOT");
            KINDLE_FIRE_HD_7_2ND_GEN = new Amazon("KINDLE_FIRE_HD_7_2ND_GEN", 2, "KFTT");
            KINDLE_FIRE_HD_9_WIFI_2ND_GEN = new Amazon("KINDLE_FIRE_HD_9_WIFI_2ND_GEN", 3, "KFJWI");
            KINDLE_FIRE_HD_9_WAN_2ND_GEN = new Amazon("KINDLE_FIRE_HD_9_WAN_2ND_GEN", 4, "KFJWA");
            KINDLE_FIRE_HDX_7_WAN_3RD_GEN = new Amazon("KINDLE_FIRE_HDX_7_WAN_3RD_GEN", 5, "KFTHWA");
            KINDLE_FIRE_HDX_7_WIFI_3RD_GEN = new Amazon("KINDLE_FIRE_HDX_7_WIFI_3RD_GEN", 6, "KFTHWI");
            KINDLE_FIRE_HDX_9_WAN_3RD_GEN = new Amazon("KINDLE_FIRE_HDX_9_WAN_3RD_GEN", 7, "KFAPWA");
            KINDLE_FIRE_HDX_9_WIFI_3RD_GEN = new Amazon("KINDLE_FIRE_HDX_9_WIFI_3RD_GEN", 8, "KFAPWI");
            $VALUES = (new Amazon[] {
                KINDLE_FIRE_1ST_GEN, KINDLE_FIRE_2ND_GEN, KINDLE_FIRE_HD_7_2ND_GEN, KINDLE_FIRE_HD_9_WIFI_2ND_GEN, KINDLE_FIRE_HD_9_WAN_2ND_GEN, KINDLE_FIRE_HDX_7_WAN_3RD_GEN, KINDLE_FIRE_HDX_7_WIFI_3RD_GEN, KINDLE_FIRE_HDX_9_WAN_3RD_GEN, KINDLE_FIRE_HDX_9_WIFI_3RD_GEN
            });
        }


        private Amazon(String s, int i, String s1)
        {
            super(s, i);
            model = s1;
        }
    }

    public static final class BN extends Enum
    {

        private static final BN $VALUES[];
        public static final BN NOOK_COLOR;
        public static final BN NOOK_HD;
        public static final BN NOOK_HDPLUS;
        public static final BN TABLET_16;
        public static final BN TABLET_8;
        private String model;

        public static BN valueOf(String s)
        {
            return (BN)Enum.valueOf(com/accuweather/android/utilities/Constants$DeviceModel$BN, s);
        }

        public static BN[] values()
        {
            return (BN[])$VALUES.clone();
        }

        String model()
        {
            return model;
        }

        static 
        {
            NOOK_COLOR = new BN("NOOK_COLOR", 0, "BNRV200");
            NOOK_HD = new BN("NOOK_HD", 1, "BNTV400");
            NOOK_HDPLUS = new BN("NOOK_HDPLUS", 2, "BNTV600");
            TABLET_8 = new BN("TABLET_8", 3, "BNTV250A");
            TABLET_16 = new BN("TABLET_16", 4, "BNTV250");
            $VALUES = (new BN[] {
                NOOK_COLOR, NOOK_HD, NOOK_HDPLUS, TABLET_8, TABLET_16
            });
        }


        private BN(String s, int i, String s1)
        {
            super(s, i);
            model = s1;
        }
    }


    public BN.model()
    {
    }
}
