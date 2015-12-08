// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.sampleentry;

import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

// Referenced classes of package com.coremedia.iso.boxes.sampleentry:
//            VisualSampleEntry

class val.dataSource
    implements DataSource
{

    final VisualSampleEntry this$0;
    private final DataSource val$dataSource;
    private final long val$endPosition;

    public void close()
    {
        val$dataSource.close();
    }

    public ByteBuffer map(long l, long l1)
    {
        return val$dataSource.map(l, l1);
    }

    public long position()
    {
        return val$dataSource.position();
    }

    public void position(long l)
    {
        val$dataSource.position(l);
    }

    public int read(ByteBuffer bytebuffer)
    {
        if (val$endPosition == val$dataSource.position())
        {
            return -1;
        }
        if ((long)bytebuffer.remaining() > val$endPosition - val$dataSource.position())
        {
            ByteBuffer bytebuffer1 = ByteBuffer.allocate(CastUtils.l2i(val$endPosition - val$dataSource.position()));
            val$dataSource.read(bytebuffer1);
            bytebuffer.put((ByteBuffer)bytebuffer1.rewind());
            return bytebuffer1.capacity();
        } else
        {
            return val$dataSource.read(bytebuffer);
        }
    }

    public long size()
    {
        return val$endPosition;
    }

    public long transferTo(long l, long l1, WritableByteChannel writablebytechannel)
    {
        return val$dataSource.transferTo(l, l1, writablebytechannel);
    }

    ()
    {
        this$0 = final_visualsampleentry;
        val$endPosition = l;
        val$dataSource = DataSource.this;
        super();
    }
}
