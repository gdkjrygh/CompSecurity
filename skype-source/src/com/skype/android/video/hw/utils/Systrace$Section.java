// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.utils;


// Referenced classes of package com.skype.android.video.hw.utils:
//            Systrace

public static final class  extends Enum
{

    private static final RenderVideoTarget $VALUES[];
    public static final RenderVideoTarget CaptureVideo;
    public static final RenderVideoTarget RenderVideoPreview;
    public static final RenderVideoTarget RenderVideoTarget;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/video/hw/utils/Systrace$Section, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CaptureVideo = new <init>("CaptureVideo", 0);
        RenderVideoPreview = new <init>("RenderVideoPreview", 1);
        RenderVideoTarget = new <init>("RenderVideoTarget", 2);
        $VALUES = (new .VALUES[] {
            CaptureVideo, RenderVideoPreview, RenderVideoTarget
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
