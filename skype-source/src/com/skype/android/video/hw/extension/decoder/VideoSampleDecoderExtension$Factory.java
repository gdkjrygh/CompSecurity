// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.extension.decoder;


// Referenced classes of package com.skype.android.video.hw.extension.decoder:
//            VideoDecoderExtensionFactory, VideoSampleDecoderExtension, VideoDecoderExtension

public static class 
    implements VideoDecoderExtensionFactory
{

    public volatile VideoDecoderExtension create(int i)
    {
        return create(i);
    }

    public VideoSampleDecoderExtension create(int i)
    {
        return new VideoSampleDecoderExtension(i, null);
    }

    public ()
    {
    }
}
