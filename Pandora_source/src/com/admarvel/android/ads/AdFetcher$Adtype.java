// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;


// Referenced classes of package com.admarvel.android.ads:
//            AdFetcher

public static final class  extends Enum
{

    public static final INTERSTITIAL BANNER;
    private static final INTERSTITIAL ENUM$VALUES[];
    public static final INTERSTITIAL INTERSTITIAL;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/admarvel/android/ads/AdFetcher$Adtype, s);
    }

    public static [] values()
    {
         a[] = ENUM$VALUES;
        int i = a.length;
         a1[] = new ENUM.VALUES[i];
        System.arraycopy(a, 0, a1, 0, i);
        return a1;
    }

    static 
    {
        BANNER = new <init>("BANNER", 0);
        INTERSTITIAL = new <init>("INTERSTITIAL", 1);
        ENUM$VALUES = (new ENUM.VALUES[] {
            BANNER, INTERSTITIAL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
