// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.gl;


// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.gl:
//            SurfaceTextureChannel

public static final class Y extends Enum
{

    private static final ENCODER $VALUES[];
    public static final ENCODER ENCODER;
    public static final ENCODER SCREEN;

    public static Y valueOf(String s)
    {
        return (Y)Enum.valueOf(com/skype/android/video/hw/codec/encoder/camera/gl/SurfaceTextureChannel$OutputType, s);
    }

    public static Y[] values()
    {
        return (Y[])$VALUES.clone();
    }

    static 
    {
        SCREEN = new <init>("SCREEN", 0);
        ENCODER = new <init>("ENCODER", 1);
        $VALUES = (new .VALUES[] {
            SCREEN, ENCODER
        });
    }

    private Y(String s, int i)
    {
        super(s, i);
    }
}
