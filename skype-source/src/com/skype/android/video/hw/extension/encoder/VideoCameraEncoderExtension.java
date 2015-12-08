// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.extension.encoder;

import com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder;
import com.skype.android.video.hw.codec.encoder.camera.VideoCameraEncoder;
import com.skype.android.video.hw.frame.OutputFrame;

// Referenced classes of package com.skype.android.video.hw.extension.encoder:
//            AbstractVideoEncoderExtension, VideoEncoderExtensionFactory, VideoEncoderExtension

public class VideoCameraEncoderExtension extends AbstractVideoEncoderExtension
{
    public static class Factory
        implements VideoEncoderExtensionFactory
    {

        public VideoEncoderExtension create(int i)
        {
            return new VideoCameraEncoderExtension(i);
        }

        public Factory()
        {
        }
    }


    protected VideoCameraEncoderExtension(int i)
    {
        super(i);
    }

    protected volatile AbstractVideoEncoder doCreateEncoder(String s)
    {
        return doCreateEncoder(s);
    }

    protected VideoCameraEncoder doCreateEncoder(String s)
    {
        return new VideoCameraEncoder(s);
    }

    protected OutputFrame doEncodeFrame(long l, long l1, long l2)
    {
        return ((VideoCameraEncoder)getEncoder()).encode(l);
    }
}
