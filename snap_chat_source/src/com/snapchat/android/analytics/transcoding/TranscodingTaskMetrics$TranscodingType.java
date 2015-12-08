// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.transcoding;


// Referenced classes of package com.snapchat.android.analytics.transcoding:
//            TranscodingTaskMetrics

public static final class  extends Enum
{

    private static final SETUP $VALUES[];
    public static final SETUP PREVIEW;
    public static final SETUP SETUP;
    public static final SETUP TRANSCODING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/analytics/transcoding/TranscodingTaskMetrics$TranscodingType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PREVIEW = new <init>("PREVIEW", 0);
        TRANSCODING = new <init>("TRANSCODING", 1);
        SETUP = new <init>("SETUP", 2);
        $VALUES = (new .VALUES[] {
            PREVIEW, TRANSCODING, SETUP
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
