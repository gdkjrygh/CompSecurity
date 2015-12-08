// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;
import java.nio.ByteBuffer;
import org.b.b.a.a;
import org.b.b.b.b;

public class DTSSpecificBox extends AbstractBox
{

    public static final String TYPE = "ddts";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_10;
    private static final org.b.a.a.a ajc$tjp_11;
    private static final org.b.a.a.a ajc$tjp_12;
    private static final org.b.a.a.a ajc$tjp_13;
    private static final org.b.a.a.a ajc$tjp_14;
    private static final org.b.a.a.a ajc$tjp_15;
    private static final org.b.a.a.a ajc$tjp_16;
    private static final org.b.a.a.a ajc$tjp_17;
    private static final org.b.a.a.a ajc$tjp_18;
    private static final org.b.a.a.a ajc$tjp_19;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_20;
    private static final org.b.a.a.a ajc$tjp_21;
    private static final org.b.a.a.a ajc$tjp_22;
    private static final org.b.a.a.a ajc$tjp_23;
    private static final org.b.a.a.a ajc$tjp_24;
    private static final org.b.a.a.a ajc$tjp_25;
    private static final org.b.a.a.a ajc$tjp_26;
    private static final org.b.a.a.a ajc$tjp_27;
    private static final org.b.a.a.a ajc$tjp_28;
    private static final org.b.a.a.a ajc$tjp_29;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_30;
    private static final org.b.a.a.a ajc$tjp_31;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    private static final org.b.a.a.a ajc$tjp_7;
    private static final org.b.a.a.a ajc$tjp_8;
    private static final org.b.a.a.a ajc$tjp_9;
    long DTSSamplingFrequency;
    int LBRDurationMod;
    long avgBitRate;
    int channelLayout;
    int coreLFEPresent;
    int coreLayout;
    int coreSize;
    int frameDuration;
    long maxBitRate;
    int multiAssetFlag;
    int pcmSampleDepth;
    int representationType;
    int reserved;
    int reservedBoxPresent;
    int stereoDownmix;
    int streamConstruction;

    public DTSSpecificBox()
    {
        super("ddts");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("DTSSpecificBox.java", com/googlecode/mp4parser/boxes/DTSSpecificBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getAvgBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "long"), 89);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setAvgBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "long", "avgBitRate", "", "void"), 93);
        ajc$tjp_10 = b1.a("method-execution", b1.a("1", "getStreamConstruction", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 129);
        ajc$tjp_11 = b1.a("method-execution", b1.a("1", "setStreamConstruction", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "streamConstruction", "", "void"), 133);
        ajc$tjp_12 = b1.a("method-execution", b1.a("1", "getCoreLFEPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 137);
        ajc$tjp_13 = b1.a("method-execution", b1.a("1", "setCoreLFEPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "coreLFEPresent", "", "void"), 141);
        ajc$tjp_14 = b1.a("method-execution", b1.a("1", "getCoreLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 145);
        ajc$tjp_15 = b1.a("method-execution", b1.a("1", "setCoreLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "coreLayout", "", "void"), 149);
        ajc$tjp_16 = b1.a("method-execution", b1.a("1", "getCoreSize", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 153);
        ajc$tjp_17 = b1.a("method-execution", b1.a("1", "setCoreSize", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "coreSize", "", "void"), 157);
        ajc$tjp_18 = b1.a("method-execution", b1.a("1", "getStereoDownmix", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 161);
        ajc$tjp_19 = b1.a("method-execution", b1.a("1", "setStereoDownmix", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "stereoDownmix", "", "void"), 165);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getDTSSamplingFrequency", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "long"), 97);
        ajc$tjp_20 = b1.a("method-execution", b1.a("1", "getRepresentationType", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 169);
        ajc$tjp_21 = b1.a("method-execution", b1.a("1", "setRepresentationType", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "representationType", "", "void"), 173);
        ajc$tjp_22 = b1.a("method-execution", b1.a("1", "getChannelLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 177);
        ajc$tjp_23 = b1.a("method-execution", b1.a("1", "setChannelLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "channelLayout", "", "void"), 181);
        ajc$tjp_24 = b1.a("method-execution", b1.a("1", "getMultiAssetFlag", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 185);
        ajc$tjp_25 = b1.a("method-execution", b1.a("1", "setMultiAssetFlag", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "multiAssetFlag", "", "void"), 189);
        ajc$tjp_26 = b1.a("method-execution", b1.a("1", "getLBRDurationMod", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 193);
        ajc$tjp_27 = b1.a("method-execution", b1.a("1", "setLBRDurationMod", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "LBRDurationMod", "", "void"), 197);
        ajc$tjp_28 = b1.a("method-execution", b1.a("1", "getReserved", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 201);
        ajc$tjp_29 = b1.a("method-execution", b1.a("1", "setReserved", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "reserved", "", "void"), 205);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setDTSSamplingFrequency", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "long", "DTSSamplingFrequency", "", "void"), 101);
        ajc$tjp_30 = b1.a("method-execution", b1.a("1", "getReservedBoxPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 209);
        ajc$tjp_31 = b1.a("method-execution", b1.a("1", "setReservedBoxPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "reservedBoxPresent", "", "void"), 213);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getMaxBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "long"), 105);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "setMaxBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "long", "maxBitRate", "", "void"), 109);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "getPcmSampleDepth", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 113);
        ajc$tjp_7 = b1.a("method-execution", b1.a("1", "setPcmSampleDepth", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "pcmSampleDepth", "", "void"), 117);
        ajc$tjp_8 = b1.a("method-execution", b1.a("1", "getFrameDuration", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 121);
        ajc$tjp_9 = b1.a("method-execution", b1.a("1", "setFrameDuration", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "frameDuration", "", "void"), 125);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        DTSSamplingFrequency = IsoTypeReader.readUInt32(bytebuffer);
        maxBitRate = IsoTypeReader.readUInt32(bytebuffer);
        avgBitRate = IsoTypeReader.readUInt32(bytebuffer);
        pcmSampleDepth = IsoTypeReader.readUInt8(bytebuffer);
        bytebuffer = new BitReaderBuffer(bytebuffer);
        frameDuration = bytebuffer.readBits(2);
        streamConstruction = bytebuffer.readBits(5);
        coreLFEPresent = bytebuffer.readBits(1);
        coreLayout = bytebuffer.readBits(6);
        coreSize = bytebuffer.readBits(14);
        stereoDownmix = bytebuffer.readBits(1);
        representationType = bytebuffer.readBits(3);
        channelLayout = bytebuffer.readBits(16);
        multiAssetFlag = bytebuffer.readBits(1);
        LBRDurationMod = bytebuffer.readBits(1);
        reservedBoxPresent = bytebuffer.readBits(1);
        reserved = bytebuffer.readBits(5);
    }

    public long getAvgBitRate()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return avgBitRate;
    }

    public int getChannelLayout()
    {
        org.b.a.a a1 = b.a(ajc$tjp_22, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return channelLayout;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        IsoTypeWriter.writeUInt32(bytebuffer, DTSSamplingFrequency);
        IsoTypeWriter.writeUInt32(bytebuffer, maxBitRate);
        IsoTypeWriter.writeUInt32(bytebuffer, avgBitRate);
        IsoTypeWriter.writeUInt8(bytebuffer, pcmSampleDepth);
        bytebuffer = new BitWriterBuffer(bytebuffer);
        bytebuffer.writeBits(frameDuration, 2);
        bytebuffer.writeBits(streamConstruction, 5);
        bytebuffer.writeBits(coreLFEPresent, 1);
        bytebuffer.writeBits(coreLayout, 6);
        bytebuffer.writeBits(coreSize, 14);
        bytebuffer.writeBits(stereoDownmix, 1);
        bytebuffer.writeBits(representationType, 3);
        bytebuffer.writeBits(channelLayout, 16);
        bytebuffer.writeBits(multiAssetFlag, 1);
        bytebuffer.writeBits(LBRDurationMod, 1);
        bytebuffer.writeBits(reservedBoxPresent, 1);
        bytebuffer.writeBits(reserved, 5);
    }

    protected long getContentSize()
    {
        return 20L;
    }

    public int getCoreLFEPresent()
    {
        org.b.a.a a1 = b.a(ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return coreLFEPresent;
    }

    public int getCoreLayout()
    {
        org.b.a.a a1 = b.a(ajc$tjp_14, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return coreLayout;
    }

    public int getCoreSize()
    {
        org.b.a.a a1 = b.a(ajc$tjp_16, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return coreSize;
    }

    public long getDTSSamplingFrequency()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return DTSSamplingFrequency;
    }

    public int[] getDashAudioChannelConfiguration()
    {
        int i1 = getChannelLayout();
        int i;
        int j;
        int k;
        int l;
        if ((i1 & 1) == 1)
        {
            k = 4;
            l = 1;
        } else
        {
            k = 0;
            l = 0;
        }
        i = k;
        j = l;
        if ((i1 & 2) == 2)
        {
            j = l + 2;
            i = k | 1 | 2;
        }
        k = i;
        l = j;
        if ((i1 & 4) == 4)
        {
            l = j + 2;
            k = i | 0x10 | 0x20;
        }
        i = k;
        j = l;
        if ((i1 & 8) == 8)
        {
            j = l + 1;
            i = k | 8;
        }
        k = i;
        l = j;
        if ((i1 & 0x10) == 16)
        {
            l = j + 1;
            k = i | 0x100;
        }
        i = k;
        j = l;
        if ((i1 & 0x20) == 32)
        {
            j = l + 2;
            i = k | 0x1000 | 0x4000;
        }
        k = i;
        l = j;
        if ((i1 & 0x40) == 64)
        {
            l = j + 2;
            k = i | 0x10 | 0x20;
        }
        i = k;
        j = l;
        if ((i1 & 0x80) == 128)
        {
            j = l + 1;
            i = k | 0x2000;
        }
        k = i;
        l = j;
        if ((i1 & 0x100) == 256)
        {
            l = j + 1;
            k = i | 0x800;
        }
        i = k;
        j = l;
        if ((i1 & 0x200) == 512)
        {
            j = l + 2;
            i = k | 0x40 | 0x80;
        }
        k = i;
        l = j;
        if ((i1 & 0x400) == 1024)
        {
            l = j + 2;
            k = i | 0x200 | 0x400;
        }
        i = k;
        j = l;
        if ((i1 & 0x800) == 2048)
        {
            j = l + 2;
            i = k | 0x10 | 0x20;
        }
        k = i;
        l = j;
        if ((i1 & 0x1000) == 4096)
        {
            l = j + 1;
            k = i | 8;
        }
        i = k;
        j = l;
        if ((i1 & 0x2000) == 8192)
        {
            j = l + 2;
            i = k | 0x10 | 0x20;
        }
        k = i;
        l = j;
        if ((i1 & 0x4000) == 16384)
        {
            l = j + 1;
            k = i | 0x10000;
        }
        if ((i1 & 0x8000) == 32768)
        {
            i = l + 2;
            k = k | 0x8000 | 0x20000;
        } else
        {
            i = l;
        }
        j = i;
        if ((i1 & 0x10000) == 0x10000)
        {
            j = i + 1;
        }
        i = j;
        if ((i1 & 0x20000) == 0x20000)
        {
            i = j + 2;
        }
        return (new int[] {
            i, k
        });
    }

    public int getFrameDuration()
    {
        org.b.a.a a1 = b.a(ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return frameDuration;
    }

    public int getLBRDurationMod()
    {
        org.b.a.a a1 = b.a(ajc$tjp_26, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return LBRDurationMod;
    }

    public long getMaxBitRate()
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return maxBitRate;
    }

    public int getMultiAssetFlag()
    {
        org.b.a.a a1 = b.a(ajc$tjp_24, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return multiAssetFlag;
    }

    public int getPcmSampleDepth()
    {
        org.b.a.a a1 = b.a(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return pcmSampleDepth;
    }

    public int getRepresentationType()
    {
        org.b.a.a a1 = b.a(ajc$tjp_20, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return representationType;
    }

    public int getReserved()
    {
        org.b.a.a a1 = b.a(ajc$tjp_28, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return reserved;
    }

    public int getReservedBoxPresent()
    {
        org.b.a.a a1 = b.a(ajc$tjp_30, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return reservedBoxPresent;
    }

    public int getStereoDownmix()
    {
        org.b.a.a a1 = b.a(ajc$tjp_18, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return stereoDownmix;
    }

    public int getStreamConstruction()
    {
        org.b.a.a a1 = b.a(ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return streamConstruction;
    }

    public void setAvgBitRate(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        avgBitRate = l;
    }

    public void setChannelLayout(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_23, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        channelLayout = i;
    }

    public void setCoreLFEPresent(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_13, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        coreLFEPresent = i;
    }

    public void setCoreLayout(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_15, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        coreLayout = i;
    }

    public void setCoreSize(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_17, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        coreSize = i;
    }

    public void setDTSSamplingFrequency(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        DTSSamplingFrequency = l;
    }

    public void setFrameDuration(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_9, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        frameDuration = i;
    }

    public void setLBRDurationMod(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_27, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        LBRDurationMod = i;
    }

    public void setMaxBitRate(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        maxBitRate = l;
    }

    public void setMultiAssetFlag(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_25, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        multiAssetFlag = i;
    }

    public void setPcmSampleDepth(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_7, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        pcmSampleDepth = i;
    }

    public void setRepresentationType(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_21, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        representationType = i;
    }

    public void setReserved(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_29, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        reserved = i;
    }

    public void setReservedBoxPresent(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_31, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        reservedBoxPresent = i;
    }

    public void setStereoDownmix(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_19, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        stereoDownmix = i;
    }

    public void setStreamConstruction(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_11, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        streamConstruction = i;
    }

    static 
    {
        ajc$preClinit();
    }
}
