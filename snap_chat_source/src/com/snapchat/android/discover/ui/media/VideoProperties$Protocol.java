// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui.media;


// Referenced classes of package com.snapchat.android.discover.ui.media:
//            VideoProperties

public static final class  extends Enum
{

    private static final HLS $VALUES[];
    public static final HLS HLS;
    public static final HLS MP4;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/discover/ui/media/VideoProperties$Protocol, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        MP4 = new <init>("MP4", 0);
        HLS = new <init>("HLS", 1);
        $VALUES = (new .VALUES[] {
            MP4, HLS
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
