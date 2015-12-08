// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;


// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelUtils

public static final class _cls9 extends Enum
{

    public static final PULSE3D ADCOLONY;
    public static final PULSE3D ADMARVEL;
    public static final PULSE3D ADMOB;
    public static final PULSE3D AMAZON;
    private static final PULSE3D ENUM$VALUES[];
    public static final PULSE3D GREYSTRIPE;
    public static final PULSE3D MEDIALETS;
    public static final PULSE3D MILLENNIAL;
    public static final PULSE3D PINSIGHT;
    public static final PULSE3D PULSE3D;
    public static final PULSE3D RHYTHM;

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/admarvel/android/ads/AdMarvelUtils$SDKAdNetwork, s);
    }

    public static _cls9[] values()
    {
        _cls9 a_lcls9[] = ENUM$VALUES;
        int i = a_lcls9.length;
        _cls9 a_lcls9_1[] = new ENUM.VALUES[i];
        System.arraycopy(a_lcls9, 0, a_lcls9_1, 0, i);
        return a_lcls9_1;
    }

    static 
    {
        ADMOB = new <init>("ADMOB", 0);
        GREYSTRIPE = new <init>("GREYSTRIPE", 1);
        MEDIALETS = new <init>("MEDIALETS", 2);
        RHYTHM = new <init>("RHYTHM", 3);
        MILLENNIAL = new <init>("MILLENNIAL", 4);
        ADMARVEL = new <init>("ADMARVEL", 5);
        AMAZON = new <init>("AMAZON", 6);
        ADCOLONY = new <init>("ADCOLONY", 7);
        PINSIGHT = new <init>("PINSIGHT", 8);
        PULSE3D = new <init>("PULSE3D", 9);
        ENUM$VALUES = (new ENUM.VALUES[] {
            ADMOB, GREYSTRIPE, MEDIALETS, RHYTHM, MILLENNIAL, ADMARVEL, AMAZON, ADCOLONY, PINSIGHT, PULSE3D
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
