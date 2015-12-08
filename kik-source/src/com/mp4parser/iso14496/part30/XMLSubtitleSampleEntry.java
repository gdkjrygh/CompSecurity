// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mp4parser.iso14496.part30;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import com.googlecode.mp4parser.DataSource;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public class XMLSubtitleSampleEntry extends AbstractSampleEntry
{

    public static final String TYPE = "stpp";
    private String auxiliaryMimeTypes;
    private String namespace;
    private String schemaLocation;

    public XMLSubtitleSampleEntry()
    {
        super("stpp");
        namespace = "";
        schemaLocation = "";
        auxiliaryMimeTypes = "";
    }

    public String getAuxiliaryMimeTypes()
    {
        return auxiliaryMimeTypes;
    }

    public void getBox(WritableByteChannel writablebytechannel)
    {
        writablebytechannel.write(getHeader());
        ByteBuffer bytebuffer = ByteBuffer.allocate(namespace.length() + 8 + schemaLocation.length() + auxiliaryMimeTypes.length() + 3);
        bytebuffer.position(6);
        IsoTypeWriter.writeUInt16(bytebuffer, dataReferenceIndex);
        IsoTypeWriter.writeZeroTermUtf8String(bytebuffer, namespace);
        IsoTypeWriter.writeZeroTermUtf8String(bytebuffer, schemaLocation);
        IsoTypeWriter.writeZeroTermUtf8String(bytebuffer, auxiliaryMimeTypes);
        writablebytechannel.write((ByteBuffer)bytebuffer.rewind());
        writeContainer(writablebytechannel);
    }

    public String getNamespace()
    {
        return namespace;
    }

    public String getSchemaLocation()
    {
        return schemaLocation;
    }

    public long getSize()
    {
        long l = getContainerSize();
        long l1 = namespace.length() + 8 + schemaLocation.length() + auxiliaryMimeTypes.length() + 3;
        int i;
        if (largeBox || l + l1 + 8L >= 0x100000000L)
        {
            i = 16;
        } else
        {
            i = 8;
        }
        return (long)i + (l + l1);
    }

    public void parse(DataSource datasource, ByteBuffer bytebuffer, long l, BoxParser boxparser)
    {
        ByteBuffer bytebuffer1 = ByteBuffer.allocate(8);
        datasource.read((ByteBuffer)bytebuffer1.rewind());
        bytebuffer1.position(6);
        dataReferenceIndex = IsoTypeReader.readUInt16(bytebuffer1);
        long l1 = datasource.position();
        bytebuffer1 = ByteBuffer.allocate(1024);
        datasource.read((ByteBuffer)bytebuffer1.rewind());
        namespace = IsoTypeReader.readString((ByteBuffer)bytebuffer1.rewind());
        datasource.position((long)namespace.length() + l1 + 1L);
        datasource.read((ByteBuffer)bytebuffer1.rewind());
        schemaLocation = IsoTypeReader.readString((ByteBuffer)bytebuffer1.rewind());
        datasource.position((long)namespace.length() + l1 + (long)schemaLocation.length() + 2L);
        datasource.read((ByteBuffer)bytebuffer1.rewind());
        auxiliaryMimeTypes = IsoTypeReader.readString((ByteBuffer)bytebuffer1.rewind());
        datasource.position((long)namespace.length() + l1 + (long)schemaLocation.length() + (long)auxiliaryMimeTypes.length() + 3L);
        initContainer(datasource, l - (long)(bytebuffer.remaining() + namespace.length() + schemaLocation.length() + auxiliaryMimeTypes.length() + 3), boxparser);
    }

    public void setAuxiliaryMimeTypes(String s)
    {
        auxiliaryMimeTypes = s;
    }

    public void setNamespace(String s)
    {
        namespace = s;
    }

    public void setSchemaLocation(String s)
    {
        schemaLocation = s;
    }
}
