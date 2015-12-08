// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;


// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelAd

public static final class  extends Enum
{

    public static final CUSTOM CUSTOM;
    private static final CUSTOM ENUM$VALUES[];
    public static final CUSTOM ERROR;
    public static final CUSTOM IMAGE;
    public static final CUSTOM JAVASCRIPT;
    public static final CUSTOM SDKCALL;
    public static final CUSTOM TEXT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/admarvel/android/ads/AdMarvelAd$AdType, s);
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
        TEXT = new <init>("TEXT", 0);
        IMAGE = new <init>("IMAGE", 1);
        JAVASCRIPT = new <init>("JAVASCRIPT", 2);
        SDKCALL = new <init>("SDKCALL", 3);
        ERROR = new <init>("ERROR", 4);
        CUSTOM = new <init>("CUSTOM", 5);
        ENUM$VALUES = (new ENUM.VALUES[] {
            TEXT, IMAGE, JAVASCRIPT, SDKCALL, ERROR, CUSTOM
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
