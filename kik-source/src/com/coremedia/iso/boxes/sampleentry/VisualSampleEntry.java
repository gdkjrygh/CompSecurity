// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.DataSource;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

// Referenced classes of package com.coremedia.iso.boxes.sampleentry:
//            AbstractSampleEntry

public final class VisualSampleEntry extends AbstractSampleEntry
    implements Container
{

    static final boolean $assertionsDisabled;
    public static final String TYPE1 = "mp4v";
    public static final String TYPE2 = "s263";
    public static final String TYPE3 = "avc1";
    public static final String TYPE4 = "avc3";
    public static final String TYPE5 = "drmi";
    public static final String TYPE6 = "hvc1";
    public static final String TYPE7 = "hev1";
    public static final String TYPE_ENCRYPTED = "encv";
    private String compressorname;
    private int depth;
    private int frameCount;
    private int height;
    private double horizresolution;
    private long predefined[];
    private double vertresolution;
    private int width;

    public VisualSampleEntry()
    {
        super("avc1");
        horizresolution = 72D;
        vertresolution = 72D;
        frameCount = 1;
        compressorname = "";
        depth = 24;
        predefined = new long[3];
    }

    public VisualSampleEntry(String s)
    {
        super(s);
        horizresolution = 72D;
        vertresolution = 72D;
        frameCount = 1;
        compressorname = "";
        depth = 24;
        predefined = new long[3];
    }

    public final void getBox(WritableByteChannel writablebytechannel)
    {
        writablebytechannel.write(getHeader());
        ByteBuffer bytebuffer = ByteBuffer.allocate(78);
        bytebuffer.position(6);
        IsoTypeWriter.writeUInt16(bytebuffer, dataReferenceIndex);
        IsoTypeWriter.writeUInt16(bytebuffer, 0);
        IsoTypeWriter.writeUInt16(bytebuffer, 0);
        IsoTypeWriter.writeUInt32(bytebuffer, predefined[0]);
        IsoTypeWriter.writeUInt32(bytebuffer, predefined[1]);
        IsoTypeWriter.writeUInt32(bytebuffer, predefined[2]);
        IsoTypeWriter.writeUInt16(bytebuffer, getWidth());
        IsoTypeWriter.writeUInt16(bytebuffer, getHeight());
        IsoTypeWriter.writeFixedPoint1616(bytebuffer, getHorizresolution());
        IsoTypeWriter.writeFixedPoint1616(bytebuffer, getVertresolution());
        IsoTypeWriter.writeUInt32(bytebuffer, 0L);
        IsoTypeWriter.writeUInt16(bytebuffer, getFrameCount());
        IsoTypeWriter.writeUInt8(bytebuffer, Utf8.utf8StringLengthInBytes(getCompressorname()));
        bytebuffer.put(Utf8.convert(getCompressorname()));
        int i = Utf8.utf8StringLengthInBytes(getCompressorname());
        do
        {
            if (i >= 31)
            {
                IsoTypeWriter.writeUInt16(bytebuffer, getDepth());
                IsoTypeWriter.writeUInt16(bytebuffer, 65535);
                writablebytechannel.write((ByteBuffer)bytebuffer.rewind());
                writeContainer(writablebytechannel);
                return;
            }
            i++;
            bytebuffer.put((byte)0);
        } while (true);
    }

    public final String getCompressorname()
    {
        return compressorname;
    }

    public final int getDepth()
    {
        return depth;
    }

    public final int getFrameCount()
    {
        return frameCount;
    }

    public final int getHeight()
    {
        return height;
    }

    public final double getHorizresolution()
    {
        return horizresolution;
    }

    public final long getSize()
    {
        long l = getContainerSize();
        int i;
        if (largeBox || l + 78L + 8L >= 0x100000000L)
        {
            i = 16;
        } else
        {
            i = 8;
        }
        return (long)i + (l + 78L);
    }

    public final double getVertresolution()
    {
        return vertresolution;
    }

    public final int getWidth()
    {
        return width;
    }

    public final void parse(DataSource datasource, ByteBuffer bytebuffer, long l, BoxParser boxparser)
    {
        long l1 = datasource.position();
        bytebuffer = ByteBuffer.allocate(78);
        datasource.read(bytebuffer);
        bytebuffer.position(6);
        dataReferenceIndex = IsoTypeReader.readUInt16(bytebuffer);
        long l2 = IsoTypeReader.readUInt16(bytebuffer);
        if (!$assertionsDisabled && 0L != l2)
        {
            throw new AssertionError("reserved byte not 0");
        }
        l2 = IsoTypeReader.readUInt16(bytebuffer);
        if (!$assertionsDisabled && 0L != l2)
        {
            throw new AssertionError("reserved byte not 0");
        }
        predefined[0] = IsoTypeReader.readUInt32(bytebuffer);
        predefined[1] = IsoTypeReader.readUInt32(bytebuffer);
        predefined[2] = IsoTypeReader.readUInt32(bytebuffer);
        width = IsoTypeReader.readUInt16(bytebuffer);
        height = IsoTypeReader.readUInt16(bytebuffer);
        horizresolution = IsoTypeReader.readFixedPoint1616(bytebuffer);
        vertresolution = IsoTypeReader.readFixedPoint1616(bytebuffer);
        l2 = IsoTypeReader.readUInt32(bytebuffer);
        if (!$assertionsDisabled && 0L != l2)
        {
            throw new AssertionError("reserved byte not 0");
        }
        frameCount = IsoTypeReader.readUInt16(bytebuffer);
        int j = IsoTypeReader.readUInt8(bytebuffer);
        int i = j;
        if (j > 31)
        {
            System.out.println((new StringBuilder("invalid compressor name displayable data: ")).append(j).toString());
            i = 31;
        }
        byte abyte0[] = new byte[i];
        bytebuffer.get(abyte0);
        compressorname = Utf8.convert(abyte0);
        if (i < 31)
        {
            bytebuffer.get(new byte[31 - i]);
        }
        depth = IsoTypeReader.readUInt16(bytebuffer);
        l2 = IsoTypeReader.readUInt16(bytebuffer);
        if (!$assertionsDisabled && 65535L != l2)
        {
            throw new AssertionError();
        } else
        {
            initContainer(new _cls1(), l - 78L, boxparser);
            return;
        }
    }

    public final void setCompressorname(String s)
    {
        compressorname = s;
    }

    public final void setDepth(int i)
    {
        depth = i;
    }

    public final void setFrameCount(int i)
    {
        frameCount = i;
    }

    public final void setHeight(int i)
    {
        height = i;
    }

    public final void setHorizresolution(double d)
    {
        horizresolution = d;
    }

    public final void setType(String s)
    {
        type = s;
    }

    public final void setVertresolution(double d)
    {
        vertresolution = d;
    }

    public final void setWidth(int i)
    {
        width = i;
    }

    static 
    {
        boolean flag;
        if (!com/coremedia/iso/boxes/sampleentry/VisualSampleEntry.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

    private class _cls1
        implements DataSource
    {

        final VisualSampleEntry this$0;
        private final DataSource val$dataSource;
        private final long val$endPosition;

        public void close()
        {
            dataSource.close();
        }

        public ByteBuffer map(long l, long l1)
        {
            return dataSource.map(l, l1);
        }

        public long position()
        {
            return dataSource.position();
        }

        public void position(long l)
        {
            dataSource.position(l);
        }

        public int read(ByteBuffer bytebuffer)
        {
            if (endPosition == dataSource.position())
            {
                return -1;
            }
            if ((long)bytebuffer.remaining() > endPosition - dataSource.position())
            {
                ByteBuffer bytebuffer1 = ByteBuffer.allocate(CastUtils.l2i(endPosition - dataSource.position()));
                dataSource.read(bytebuffer1);
                bytebuffer.put((ByteBuffer)bytebuffer1.rewind());
                return bytebuffer1.capacity();
            } else
            {
                return dataSource.read(bytebuffer);
            }
        }

        public long size()
        {
            return endPosition;
        }

        public long transferTo(long l, long l1, WritableByteChannel writablebytechannel)
        {
            return dataSource.transferTo(l, l1, writablebytechannel);
        }

        _cls1()
        {
            this$0 = VisualSampleEntry.this;
            endPosition = l;
            dataSource = datasource;
            super();
        }
    }

}
