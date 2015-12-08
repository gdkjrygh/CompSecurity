// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.DataSource;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.coremedia.iso.boxes.sampleentry:
//            AbstractSampleEntry

public class MpegSampleEntry extends AbstractSampleEntry
{

    public MpegSampleEntry()
    {
        super("mp4s");
    }

    public MpegSampleEntry(String s)
    {
        super(s);
    }

    public void getBox(WritableByteChannel writablebytechannel)
    {
        writablebytechannel.write(getHeader());
        ByteBuffer bytebuffer = ByteBuffer.allocate(8);
        bytebuffer.position(6);
        IsoTypeWriter.writeUInt16(bytebuffer, dataReferenceIndex);
        writablebytechannel.write((ByteBuffer)bytebuffer.rewind());
        writeContainer(writablebytechannel);
    }

    public long getSize()
    {
        long l = getContainerSize();
        int i;
        if (largeBox || l + 8L >= 0x100000000L)
        {
            i = 16;
        } else
        {
            i = 8;
        }
        return (long)i + (l + 8L);
    }

    public void parse(DataSource datasource, ByteBuffer bytebuffer, long l, BoxParser boxparser)
    {
        bytebuffer = ByteBuffer.allocate(8);
        datasource.read(bytebuffer);
        bytebuffer.position(6);
        dataReferenceIndex = IsoTypeReader.readUInt16(bytebuffer);
        initContainer(datasource, l - 8L, boxparser);
    }

    public String toString()
    {
        return (new StringBuilder("MpegSampleEntry")).append(Arrays.asList(new List[] {
            getBoxes()
        })).toString();
    }
}
