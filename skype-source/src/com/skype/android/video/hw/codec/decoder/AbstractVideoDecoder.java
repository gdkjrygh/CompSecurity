// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.decoder;

import android.media.MediaFormat;
import com.skype.android.video.hw.codec.AbstractMediaCodec;
import com.skype.android.video.hw.format.VideoFormat;
import java.nio.ByteBuffer;

public abstract class AbstractVideoDecoder extends AbstractMediaCodec
{

    protected AbstractVideoDecoder(String s)
    {
        super(s, false);
    }

    protected void doConfigureDynamic(VideoFormat videoformat)
    {
    }

    protected void doConfigureMediaFormat(MediaFormat mediaformat, VideoFormat videoformat)
    {
        if (videoformat.getSpsPps().capacity() != 0)
        {
            mediaformat.setByteBuffer("csd-0", videoformat.getSpsPps());
        }
    }

    protected int doGetMediaCodecFlags()
    {
        return 0;
    }
}
