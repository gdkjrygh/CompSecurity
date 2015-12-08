// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractContainerBox;
import com.googlecode.mp4parser.DataSource;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public class MetaBox extends AbstractContainerBox
{

    public static final String TYPE = "meta";
    private int flags;
    private int version;

    public MetaBox()
    {
        super("meta");
    }

    public void getBox(WritableByteChannel writablebytechannel)
    {
        writablebytechannel.write(getHeader());
        ByteBuffer bytebuffer = ByteBuffer.allocate(4);
        writeVersionAndFlags(bytebuffer);
        writablebytechannel.write((ByteBuffer)bytebuffer.rewind());
        writeContainer(writablebytechannel);
    }

    public int getFlags()
    {
        return flags;
    }

    public long getSize()
    {
        long l = getContainerSize();
        int i;
        if (largeBox || l + 4L >= 0x100000000L)
        {
            i = 16;
        } else
        {
            i = 8;
        }
        return (long)i + (l + 4L);
    }

    public int getVersion()
    {
        return version;
    }

    public void parse(DataSource datasource, ByteBuffer bytebuffer, long l, BoxParser boxparser)
    {
        bytebuffer = ByteBuffer.allocate(4);
        datasource.read(bytebuffer);
        parseVersionAndFlags((ByteBuffer)bytebuffer.rewind());
        initContainer(datasource, l - 4L, boxparser);
    }

    protected final long parseVersionAndFlags(ByteBuffer bytebuffer)
    {
        version = IsoTypeReader.readUInt8(bytebuffer);
        flags = IsoTypeReader.readUInt24(bytebuffer);
        return 4L;
    }

    public void setFlags(int i)
    {
        flags = i;
    }

    public void setVersion(int i)
    {
        version = i;
    }

    protected final void writeVersionAndFlags(ByteBuffer bytebuffer)
    {
        IsoTypeWriter.writeUInt8(bytebuffer, version);
        IsoTypeWriter.writeUInt24(bytebuffer, flags);
    }
}
