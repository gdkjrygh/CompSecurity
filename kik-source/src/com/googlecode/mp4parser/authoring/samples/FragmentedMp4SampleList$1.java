// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.samples;

import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

// Referenced classes of package com.googlecode.mp4parser.authoring.samples:
//            FragmentedMp4SampleList

class val.finalOffset
    implements Sample
{

    final FragmentedMp4SampleList this$0;
    private final int val$finalOffset;
    private final ByteBuffer val$finalTrunData;
    private final long val$sampleSize;

    public ByteBuffer asByteBuffer()
    {
        return (ByteBuffer)((ByteBuffer)val$finalTrunData.position(val$finalOffset)).slice().limit(CastUtils.l2i(val$sampleSize));
    }

    public long getSize()
    {
        return val$sampleSize;
    }

    public void writeTo(WritableByteChannel writablebytechannel)
    {
        writablebytechannel.write(asByteBuffer());
    }

    ()
    {
        this$0 = final_fragmentedmp4samplelist;
        val$sampleSize = l;
        val$finalTrunData = bytebuffer;
        val$finalOffset = I.this;
        super();
    }
}
