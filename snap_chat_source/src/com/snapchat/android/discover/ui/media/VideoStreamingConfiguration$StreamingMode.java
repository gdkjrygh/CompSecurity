// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui.media;


// Referenced classes of package com.snapchat.android.discover.ui.media:
//            VideoStreamingConfiguration

public static final class  extends Enum
{

    private static final CLIENT_DECIDES $VALUES[];
    public static final CLIENT_DECIDES CLIENT_DECIDES;
    public static final CLIENT_DECIDES HLS;
    public static final CLIENT_DECIDES MP4;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/discover/ui/media/VideoStreamingConfiguration$StreamingMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        HLS = new <init>("HLS", 0);
        MP4 = new <init>("MP4", 1);
        CLIENT_DECIDES = new <init>("CLIENT_DECIDES", 2);
        $VALUES = (new .VALUES[] {
            HLS, MP4, CLIENT_DECIDES
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
