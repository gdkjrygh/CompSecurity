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
//            EC3TrackImpl

class val.start
    implements Sample
{

    final EC3TrackImpl this$0;
    private final int val$start;

    public ByteBuffer asByteBuffer()
    {
        ByteBuffer bytebuffer;
        try
        {
            bytebuffer = EC3TrackImpl.access$0(EC3TrackImpl.this).map(val$start, EC3TrackImpl.access$1(EC3TrackImpl.this));
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception);
        }
        return bytebuffer;
    }

    public long getSize()
    {
        return (long)EC3TrackImpl.access$1(EC3TrackImpl.this);
    }

    public void writeTo(WritableByteChannel writablebytechannel)
    {
        EC3TrackImpl.access$0(EC3TrackImpl.this).transferTo(val$start, EC3TrackImpl.access$1(EC3TrackImpl.this), writablebytechannel);
    }

    ()
    {
        this$0 = final_ec3trackimpl;
        val$start = I.this;
        super();
    }
}
