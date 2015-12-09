// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;


// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelInternalWebView

public static final class  extends Enum
{

    private static final PLAY_VIDEO ENUM$VALUES[];
    public static final PLAY_VIDEO PLAY_AUDIO;
    public static final PLAY_VIDEO PLAY_VIDEO;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/admarvel/android/ads/AdMarvelInternalWebView$Action, s);
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
        PLAY_AUDIO = new <init>("PLAY_AUDIO", 0);
        PLAY_VIDEO = new <init>("PLAY_VIDEO", 1);
        ENUM$VALUES = (new ENUM.VALUES[] {
            PLAY_AUDIO, PLAY_VIDEO
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
