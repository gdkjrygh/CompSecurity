// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.extension.encoder;

import com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder;
import com.skype.android.video.hw.codec.encoder.sample.VideoSampleEncoder;
import com.skype.android.video.hw.extension.JniCodecUtils;
import com.skype.android.video.hw.frame.InputFrame;
import com.skype.android.video.hw.frame.OutputFrame;

// Referenced classes of package com.skype.android.video.hw.extension.encoder:
//            AbstractVideoEncoderExtension, VideoEncoderExtensionFactory, VideoEncoderExtension

public class VideoSampleEncoderExtension extends AbstractVideoEncoderExtension
{
    public static class Factory
        implements VideoEncoderExtensionFactory
    {

        public volatile VideoEncoderExtension create(int i)
        {
            return create(i);
        }

        public VideoSampleEncoderExtension create(int i)
        {
            return new VideoSampleEncoderExtension(i);
        }

        public Factory()
        {
        }
    }


    public VideoSampleEncoderExtension(int i)
    {
        super(i);
    }

    protected volatile AbstractVideoEncoder doCreateEncoder(String s)
    {
        return doCreateEncoder(s);
    }

    protected VideoSampleEncoder doCreateEncoder(String s)
    {
        return new VideoSampleEncoder(s);
    }

    protected OutputFrame doEncodeFrame(long l, long l1, long l2)
    {
        InputFrame inputframe = ((VideoSampleEncoder)getEncoder()).getInputFrame(l);
        inputframe.setTimestamp((l2 - getInitialTimestamp()) * 1000L);
        inputframe.setSize(getRawFrameSize());
        JniCodecUtils.fillInputFrameBuffer(l1, inputframe.getData(), getRawFrameSize());
        return ((VideoSampleEncoder)getEncoder()).encode(inputframe, l);
    }
}
