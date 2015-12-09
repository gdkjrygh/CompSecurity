// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;


// Referenced classes of package com.admarvel.android.ads:
//            VideoInterstitialControls

public static final class  extends Enum
{

    public static final CloseVideo CloseVideo;
    private static final CloseVideo ENUM$VALUES[];
    public static final CloseVideo PauseVideo;
    public static final CloseVideo StopVideo;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/admarvel/android/ads/VideoInterstitialControls$ExitVideoScreenBehavior, s);
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
        PauseVideo = new <init>("PauseVideo", 0);
        StopVideo = new <init>("StopVideo", 1);
        CloseVideo = new <init>("CloseVideo", 2);
        ENUM$VALUES = (new ENUM.VALUES[] {
            PauseVideo, StopVideo, CloseVideo
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
