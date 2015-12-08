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
//            DTSTrackImpl

class val.currentPosition
    implements Sample
{

    final DTSTrackImpl this$0;
    private final int val$currentPosition;

    public ByteBuffer asByteBuffer()
    {
        ByteBuffer bytebuffer;
        try
        {
            bytebuffer = DTSTrackImpl.access$0(DTSTrackImpl.this).map(val$currentPosition, frameSize);
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception);
        }
        return bytebuffer;
    }

    public long getSize()
    {
        return (long)frameSize;
    }

    public void writeTo(WritableByteChannel writablebytechannel)
    {
        DTSTrackImpl.access$0(DTSTrackImpl.this).transferTo(val$currentPosition, frameSize, writablebytechannel);
    }

    ()
    {
        this$0 = final_dtstrackimpl;
        val$currentPosition = I.this;
        super();
    }
}
