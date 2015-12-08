// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.samples;

import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

// Referenced classes of package com.googlecode.mp4parser.authoring.samples:
//            DefaultMp4SampleList

class val.finalOffsetWithInChunk
    implements Sample
{

    final DefaultMp4SampleList this$0;
    private final ByteBuffer val$finalCorrectPartOfChunk;
    private final long val$finalOffsetWithInChunk;
    private final long val$sampleSize;

    public ByteBuffer asByteBuffer()
    {
        return (ByteBuffer)((ByteBuffer)val$finalCorrectPartOfChunk.position(CastUtils.l2i(val$finalOffsetWithInChunk))).slice().limit(CastUtils.l2i(val$sampleSize));
    }

    public long getSize()
    {
        return val$sampleSize;
    }

    public String toString()
    {
        return (new StringBuilder("DefaultMp4Sample(size:")).append(val$sampleSize).append(")").toString();
    }

    public void writeTo(WritableByteChannel writablebytechannel)
    {
        writablebytechannel.write(asByteBuffer());
    }

    ()
    {
        this$0 = final_defaultmp4samplelist;
        val$sampleSize = l;
        val$finalCorrectPartOfChunk = bytebuffer;
        val$finalOffsetWithInChunk = J.this;
        super();
    }
}
