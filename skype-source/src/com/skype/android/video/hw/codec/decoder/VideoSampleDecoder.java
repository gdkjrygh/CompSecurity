// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.decoder;

import android.media.MediaCodec;
import com.skype.android.video.hw.frame.InputFrame;
import com.skype.android.video.hw.frame.OutputFrame;
import java.nio.ByteBuffer;

// Referenced classes of package com.skype.android.video.hw.codec.decoder:
//            AbstractVideoDecoder

public class VideoSampleDecoder extends AbstractVideoDecoder
{

    private ByteBuffer inputBuffers[];
    private final InputFrame inputFrame = new InputFrame();

    public VideoSampleDecoder(String s)
    {
        super(s);
    }

    public OutputFrame decode(InputFrame inputframe, long l)
    {
        mediaCodec.queueInputBuffer(inputframe.getId(), 0, inputframe.getSize(), inputframe.getTimestamp(), 0);
        return super.drainCodec(l);
    }

    public OutputFrame flushOneFrame(long l)
    {
        return super.drainCodec(l);
    }

    public InputFrame getInputFrame(long l)
    {
        int i = mediaCodec.dequeueInputBuffer(l);
        if (i < 0)
        {
            throw new IllegalStateException("no input buffers available");
        } else
        {
            ByteBuffer bytebuffer = inputBuffers[i];
            bytebuffer.clear();
            inputFrame.initialize(i, bytebuffer);
            return inputFrame;
        }
    }

    public void signalEOS(long l, long l1)
    {
        int i = mediaCodec.dequeueInputBuffer(l1);
        if (i < 0)
        {
            throw new IllegalStateException("no input buffers available");
        } else
        {
            inputBuffers[i].clear();
            mediaCodec.queueInputBuffer(i, 0, 0, l, 4);
            return;
        }
    }

    public void start()
    {
        super.start();
        inputBuffers = mediaCodec.getInputBuffers();
    }
}
