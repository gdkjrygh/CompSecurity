// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.authoring.Sample;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

// Referenced classes of package com.googlecode.mp4parser.authoring.tracks:
//            AACTrackImpl

class val.frameSize
    implements Sample
{

    final AACTrackImpl this$0;
    private final long val$currentPosition;
    private final long val$frameSize;

    public ByteBuffer asByteBuffer()
    {
        ByteBuffer bytebuffer;
        try
        {
            bytebuffer = AACTrackImpl.access$0(AACTrackImpl.this).map(val$currentPosition, val$frameSize);
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception);
        }
        return bytebuffer;
    }

    public long getSize()
    {
        return val$frameSize;
    }

    public void writeTo(WritableByteChannel writablebytechannel)
    {
        AACTrackImpl.access$0(AACTrackImpl.this).transferTo(val$currentPosition, val$frameSize, writablebytechannel);
    }

    ()
    {
        this$0 = final_aactrackimpl;
        val$currentPosition = l;
        val$frameSize = J.this;
        super();
    }
}
