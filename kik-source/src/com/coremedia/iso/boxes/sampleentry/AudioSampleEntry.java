// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.util.CastUtils;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

// Referenced classes of package com.coremedia.iso.boxes.sampleentry:
//            AbstractSampleEntry

public final class AudioSampleEntry extends AbstractSampleEntry
{

    static final boolean $assertionsDisabled;
    public static final String TYPE1 = "samr";
    public static final String TYPE10 = "mlpa";
    public static final String TYPE11 = "dtsl";
    public static final String TYPE12 = "dtsh";
    public static final String TYPE13 = "dtse";
    public static final String TYPE2 = "sawb";
    public static final String TYPE3 = "mp4a";
    public static final String TYPE4 = "drms";
    public static final String TYPE5 = "alac";
    public static final String TYPE7 = "owma";
    public static final String TYPE8 = "ac-3";
    public static final String TYPE9 = "ec-3";
    public static final String TYPE_ENCRYPTED = "enca";
    private long bytesPerFrame;
    private long bytesPerPacket;
    private long bytesPerSample;
    private int channelCount;
    private int compressionId;
    private int packetSize;
    private int reserved1;
    private long reserved2;
    private long sampleRate;
    private int sampleSize;
    private long samplesPerPacket;
    private int soundVersion;
    private byte soundVersion2Data[];

    public AudioSampleEntry(String s)
    {
        super(s);
    }

    public final void getBox(WritableByteChannel writablebytechannel)
    {
        byte byte1 = 0;
        writablebytechannel.write(getHeader());
        ByteBuffer bytebuffer;
        byte byte0;
        if (soundVersion == 1)
        {
            byte0 = 16;
        } else
        {
            byte0 = 0;
        }
        if (soundVersion == 2)
        {
            byte1 = 36;
        }
        bytebuffer = ByteBuffer.allocate(byte0 + 28 + byte1);
        bytebuffer.position(6);
        IsoTypeWriter.writeUInt16(bytebuffer, dataReferenceIndex);
        IsoTypeWriter.writeUInt16(bytebuffer, soundVersion);
        IsoTypeWriter.writeUInt16(bytebuffer, reserved1);
        IsoTypeWriter.writeUInt32(bytebuffer, reserved2);
        IsoTypeWriter.writeUInt16(bytebuffer, channelCount);
        IsoTypeWriter.writeUInt16(bytebuffer, sampleSize);
        IsoTypeWriter.writeUInt16(bytebuffer, compressionId);
        IsoTypeWriter.writeUInt16(bytebuffer, packetSize);
        if (type.equals("mlpa"))
        {
            IsoTypeWriter.writeUInt32(bytebuffer, getSampleRate());
        } else
        {
            IsoTypeWriter.writeUInt32(bytebuffer, getSampleRate() << 16);
        }
        if (soundVersion == 1)
        {
            IsoTypeWriter.writeUInt32(bytebuffer, samplesPerPacket);
            IsoTypeWriter.writeUInt32(bytebuffer, bytesPerPacket);
            IsoTypeWriter.writeUInt32(bytebuffer, bytesPerFrame);
            IsoTypeWriter.writeUInt32(bytebuffer, bytesPerSample);
        }
        if (soundVersion == 2)
        {
            IsoTypeWriter.writeUInt32(bytebuffer, samplesPerPacket);
            IsoTypeWriter.writeUInt32(bytebuffer, bytesPerPacket);
            IsoTypeWriter.writeUInt32(bytebuffer, bytesPerFrame);
            IsoTypeWriter.writeUInt32(bytebuffer, bytesPerSample);
            bytebuffer.put(soundVersion2Data);
        }
        writablebytechannel.write((ByteBuffer)bytebuffer.rewind());
        writeContainer(writablebytechannel);
    }

    public final long getBytesPerFrame()
    {
        return bytesPerFrame;
    }

    public final long getBytesPerPacket()
    {
        return bytesPerPacket;
    }

    public final long getBytesPerSample()
    {
        return bytesPerSample;
    }

    public final int getChannelCount()
    {
        return channelCount;
    }

    public final int getCompressionId()
    {
        return compressionId;
    }

    public final int getPacketSize()
    {
        return packetSize;
    }

    public final int getReserved1()
    {
        return reserved1;
    }

    public final long getReserved2()
    {
        return reserved2;
    }

    public final long getSampleRate()
    {
        return sampleRate;
    }

    public final int getSampleSize()
    {
        return sampleSize;
    }

    public final long getSamplesPerPacket()
    {
        return samplesPerPacket;
    }

    public final long getSize()
    {
        byte byte1 = 16;
        byte byte0 = 0;
        int i;
        long l;
        if (soundVersion == 1)
        {
            i = 16;
        } else
        {
            i = 0;
        }
        if (soundVersion == 2)
        {
            byte0 = 36;
        }
        l = (long)(i + 28 + byte0) + getContainerSize();
        i = byte1;
        if (!largeBox)
        {
            if (8L + l >= 0x100000000L)
            {
                i = byte1;
            } else
            {
                i = 8;
            }
        }
        return (long)i + l;
    }

    public final int getSoundVersion()
    {
        return soundVersion;
    }

    public final byte[] getSoundVersion2Data()
    {
        return soundVersion2Data;
    }

    public final void parse(DataSource datasource, final ByteBuffer owmaSpecifics, final long remaining, BoxParser boxparser)
    {
        byte byte0 = 36;
        int i = 16;
        boolean flag = false;
        owmaSpecifics = ByteBuffer.allocate(28);
        datasource.read(owmaSpecifics);
        owmaSpecifics.position(6);
        dataReferenceIndex = IsoTypeReader.readUInt16(owmaSpecifics);
        soundVersion = IsoTypeReader.readUInt16(owmaSpecifics);
        reserved1 = IsoTypeReader.readUInt16(owmaSpecifics);
        reserved2 = IsoTypeReader.readUInt32(owmaSpecifics);
        channelCount = IsoTypeReader.readUInt16(owmaSpecifics);
        sampleSize = IsoTypeReader.readUInt16(owmaSpecifics);
        compressionId = IsoTypeReader.readUInt16(owmaSpecifics);
        packetSize = IsoTypeReader.readUInt16(owmaSpecifics);
        sampleRate = IsoTypeReader.readUInt32(owmaSpecifics);
        if (!type.equals("mlpa"))
        {
            sampleRate = sampleRate >>> 16;
        }
        if (soundVersion == 1)
        {
            owmaSpecifics = ByteBuffer.allocate(16);
            datasource.read(owmaSpecifics);
            owmaSpecifics.rewind();
            samplesPerPacket = IsoTypeReader.readUInt32(owmaSpecifics);
            bytesPerPacket = IsoTypeReader.readUInt32(owmaSpecifics);
            bytesPerFrame = IsoTypeReader.readUInt32(owmaSpecifics);
            bytesPerSample = IsoTypeReader.readUInt32(owmaSpecifics);
        }
        if (soundVersion == 2)
        {
            owmaSpecifics = ByteBuffer.allocate(36);
            datasource.read(owmaSpecifics);
            owmaSpecifics.rewind();
            samplesPerPacket = IsoTypeReader.readUInt32(owmaSpecifics);
            bytesPerPacket = IsoTypeReader.readUInt32(owmaSpecifics);
            bytesPerFrame = IsoTypeReader.readUInt32(owmaSpecifics);
            bytesPerSample = IsoTypeReader.readUInt32(owmaSpecifics);
            soundVersion2Data = new byte[20];
            owmaSpecifics.get(soundVersion2Data);
        }
        if ("owma".equals(type))
        {
            System.err.println("owma");
            long l;
            if (soundVersion != 1)
            {
                i = 0;
            }
            l = i;
            i = ((flag) ? 1 : 0);
            if (soundVersion == 2)
            {
                i = 36;
            }
            remaining = remaining - 28L - l - (long)i;
            owmaSpecifics = ByteBuffer.allocate(CastUtils.l2i(remaining));
            datasource.read(owmaSpecifics);
            addBox(new _cls1());
            return;
        }
        long l1;
        if (soundVersion != 1)
        {
            i = 0;
        }
        l1 = i;
        if (soundVersion == 2)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        initContainer(datasource, remaining - 28L - l1 - (long)i, boxparser);
    }

    public final void setBytesPerFrame(long l)
    {
        bytesPerFrame = l;
    }

    public final void setBytesPerPacket(long l)
    {
        bytesPerPacket = l;
    }

    public final void setBytesPerSample(long l)
    {
        bytesPerSample = l;
    }

    public final void setChannelCount(int i)
    {
        channelCount = i;
    }

    public final void setCompressionId(int i)
    {
        compressionId = i;
    }

    public final void setPacketSize(int i)
    {
        packetSize = i;
    }

    public final void setReserved1(int i)
    {
        reserved1 = i;
    }

    public final void setReserved2(long l)
    {
        reserved2 = l;
    }

    public final void setSampleRate(long l)
    {
        sampleRate = l;
    }

    public final void setSampleSize(int i)
    {
        sampleSize = i;
    }

    public final void setSamplesPerPacket(long l)
    {
        samplesPerPacket = l;
    }

    public final void setSoundVersion(int i)
    {
        soundVersion = i;
    }

    public final void setSoundVersion2Data(byte abyte0[])
    {
        soundVersion2Data = abyte0;
    }

    public final void setType(String s)
    {
        type = s;
    }

    public final String toString()
    {
        return (new StringBuilder("AudioSampleEntry{bytesPerSample=")).append(bytesPerSample).append(", bytesPerFrame=").append(bytesPerFrame).append(", bytesPerPacket=").append(bytesPerPacket).append(", samplesPerPacket=").append(samplesPerPacket).append(", packetSize=").append(packetSize).append(", compressionId=").append(compressionId).append(", soundVersion=").append(soundVersion).append(", sampleRate=").append(sampleRate).append(", sampleSize=").append(sampleSize).append(", channelCount=").append(channelCount).append(", boxes=").append(getBoxes()).append('}').toString();
    }

    static 
    {
        boolean flag;
        if (!com/coremedia/iso/boxes/sampleentry/AudioSampleEntry.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

    private class _cls1
        implements Box
    {

        final AudioSampleEntry this$0;
        private final ByteBuffer val$owmaSpecifics;
        private final long val$remaining;

        public void getBox(WritableByteChannel writablebytechannel)
        {
            owmaSpecifics.rewind();
            writablebytechannel.write(owmaSpecifics);
        }

        public long getOffset()
        {
            return 0L;
        }

        public Container getParent()
        {
            return AudioSampleEntry.this;
        }

        public long getSize()
        {
            return remaining;
        }

        public String getType()
        {
            return "----";
        }

        public void parse(DataSource datasource, ByteBuffer bytebuffer, long l, BoxParser boxparser)
        {
            throw new RuntimeException("NotImplemented");
        }

        public void setParent(Container container)
        {
            if (!AudioSampleEntry.$assertionsDisabled && container != AudioSampleEntry.this)
            {
                throw new AssertionError("you cannot diswown this special box");
            } else
            {
                return;
            }
        }

        _cls1()
        {
            this$0 = AudioSampleEntry.this;
            remaining = l;
            owmaSpecifics = bytebuffer;
            super();
        }
    }

}
