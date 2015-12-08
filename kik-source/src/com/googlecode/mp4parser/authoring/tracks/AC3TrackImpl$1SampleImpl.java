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
//            AC3TrackImpl

class dataSource
    implements Sample
{

    private final DataSource dataSource;
    private final long size;
    private final long start;
    final AC3TrackImpl this$0;

    public ByteBuffer asByteBuffer()
    {
        ByteBuffer bytebuffer;
        try
        {
            bytebuffer = dataSource.map(start, size);
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception);
        }
        return bytebuffer;
    }

    public long getSize()
    {
        return size;
    }

    public void writeTo(WritableByteChannel writablebytechannel)
    {
        dataSource.transferTo(start, size, writablebytechannel);
    }

    public (long l, long l1, DataSource datasource)
    {
        this$0 = AC3TrackImpl.this;
        super();
        start = l;
        size = l1;
        dataSource = datasource;
    }
}
