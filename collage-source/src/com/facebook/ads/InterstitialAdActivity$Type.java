// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;


// Referenced classes of package com.facebook.ads:
//            InterstitialAdActivity

public static final class  extends Enum
{

    public static final VIDEO DISPLAY;
    public static final VIDEO VIDEO;
    private static final VIDEO a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/ads/InterstitialAdActivity$Type, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        DISPLAY = new <init>("DISPLAY", 0);
        VIDEO = new <init>("VIDEO", 1);
        a = (new a[] {
            DISPLAY, VIDEO
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
