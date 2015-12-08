// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.extension.encoder;


// Referenced classes of package com.skype.android.video.hw.extension.encoder:
//            VideoEncoderExtensionFactory, VideoCameraEncoderExtension, VideoEncoderExtension

public static class 
    implements VideoEncoderExtensionFactory
{

    public VideoEncoderExtension create(int i)
    {
        return new VideoCameraEncoderExtension(i);
    }

    public ()
    {
    }
}
