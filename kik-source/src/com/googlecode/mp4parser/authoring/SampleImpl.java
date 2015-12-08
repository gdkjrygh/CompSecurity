// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring;

import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.util.CastUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

// Referenced classes of package com.googlecode.mp4parser.authoring:
//            Sample

public class SampleImpl
    implements Sample
{

    private ByteBuffer data[];
    private final long offset;
    private final Container parent;
    private final long size;

    public SampleImpl(long l, long l1, Container container)
    {
        offset = l;
        size = l1;
        data = null;
        parent = container;
    }

    public SampleImpl(long l, long l1, ByteBuffer bytebuffer)
    {
        offset = l;
        size = l1;
        data = (new ByteBuffer[] {
            bytebuffer
        });
        parent = null;
    }

    public SampleImpl(ByteBuffer bytebuffer)
    {
        offset = -1L;
        size = bytebuffer.limit();
        data = (new ByteBuffer[] {
            bytebuffer
        });
        parent = null;
    }

    public SampleImpl(ByteBuffer abytebuffer[])
    {
        int i = 0;
        super();
        offset = -1L;
        int k = abytebuffer.length;
        int j = 0;
        do
        {
            if (i >= k)
            {
                size = j;
                data = abytebuffer;
                parent = null;
                return;
            }
            j += abytebuffer[i].remaining();
            i++;
        } while (true);
    }

    public ByteBuffer asByteBuffer()
    {
        ensureData();
        ByteBuffer bytebuffer = ByteBuffer.wrap(new byte[CastUtils.l2i(size)]);
        ByteBuffer abytebuffer[] = data;
        int j = abytebuffer.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                bytebuffer.rewind();
                return bytebuffer;
            }
            bytebuffer.put(abytebuffer[i].duplicate());
            i++;
        } while (true);
    }

    protected void ensureData()
    {
        if (data != null)
        {
            return;
        }
        if (parent == null)
        {
            throw new RuntimeException((new StringBuilder("Missing parent container, can't read sample ")).append(this).toString());
        }
        try
        {
            data = (new ByteBuffer[] {
                parent.getByteBuffer(offset, size)
            });
            return;
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException((new StringBuilder("couldn't read sample ")).append(this).toString(), ioexception);
        }
    }

    public long getSize()
    {
        return size;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("SampleImpl");
        stringbuilder.append("{offset=").append(offset);
        stringbuilder.append("{size=").append(size);
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    public void writeTo(WritableByteChannel writablebytechannel)
    {
        ensureData();
        ByteBuffer abytebuffer[] = data;
        int j = abytebuffer.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            writablebytechannel.write(abytebuffer[i].duplicate());
            i++;
        } while (true);
    }
}
