// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser;

import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

// Referenced classes of package com.googlecode.mp4parser:
//            DataSource

public class MemoryDataSourceImpl
    implements DataSource
{

    ByteBuffer data;

    public MemoryDataSourceImpl(ByteBuffer bytebuffer)
    {
        data = bytebuffer;
    }

    public MemoryDataSourceImpl(byte abyte0[])
    {
        data = ByteBuffer.wrap(abyte0);
    }

    public void close()
    {
    }

    public ByteBuffer map(long l, long l1)
    {
        return (ByteBuffer)((ByteBuffer)data.position(CastUtils.l2i(l))).slice().limit(CastUtils.l2i(l1));
    }

    public long position()
    {
        return (long)data.position();
    }

    public void position(long l)
    {
        data.position(CastUtils.l2i(l));
    }

    public int read(ByteBuffer bytebuffer)
    {
        if (data.remaining() == 0 && bytebuffer.remaining() != 0)
        {
            return -1;
        } else
        {
            byte abyte0[] = new byte[Math.min(bytebuffer.remaining(), data.remaining())];
            data.get(abyte0);
            bytebuffer.put(abyte0);
            return abyte0.length;
        }
    }

    public long size()
    {
        return (long)data.capacity();
    }

    public long transferTo(long l, long l1, WritableByteChannel writablebytechannel)
    {
        return (long)writablebytechannel.write((ByteBuffer)((ByteBuffer)data.position(CastUtils.l2i(l))).slice().limit(CastUtils.l2i(l1)));
    }
}
