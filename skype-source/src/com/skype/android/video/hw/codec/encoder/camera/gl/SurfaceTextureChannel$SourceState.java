// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.gl;


// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.gl:
//            SurfaceTextureChannel

private static final class  extends Enum
{

    private static final INTERRUPTED $VALUES[];
    public static final INTERRUPTED FRAME_AVAILABLE;
    public static final INTERRUPTED INTERRUPTED;
    public static final INTERRUPTED WAITING_FOR_FRAME;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/video/hw/codec/encoder/camera/gl/SurfaceTextureChannel$SourceState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        WAITING_FOR_FRAME = new <init>("WAITING_FOR_FRAME", 0);
        FRAME_AVAILABLE = new <init>("FRAME_AVAILABLE", 1);
        INTERRUPTED = new <init>("INTERRUPTED", 2);
        $VALUES = (new .VALUES[] {
            WAITING_FOR_FRAME, FRAME_AVAILABLE, INTERRUPTED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
