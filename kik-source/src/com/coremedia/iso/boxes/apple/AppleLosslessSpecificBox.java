// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.apple;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.a.a;
import org.b.b.b.b;

public final class AppleLosslessSpecificBox extends AbstractFullBox
{

    public static final String TYPE = "alac";
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
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    private static final org.b.a.a.a ajc$tjp_7;
    private static final org.b.a.a.a ajc$tjp_8;
    private static final org.b.a.a.a ajc$tjp_9;
    private long bitRate;
    private int channels;
    private int historyMult;
    private int initialHistory;
    private int kModifier;
    private long maxCodedFrameSize;
    private long maxSamplePerFrame;
    private long sampleRate;
    private int sampleSize;
    private int unknown1;
    private int unknown2;

    public AppleLosslessSpecificBox()
    {
        super("alac");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("AppleLosslessSpecificBox.java", com/coremedia/iso/boxes/apple/AppleLosslessSpecificBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getMaxSamplePerFrame", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 34);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setMaxSamplePerFrame", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "maxSamplePerFrame", "", "void"), 38);
        ajc$tjp_10 = b1.a("method-execution", b1.a("1", "getKModifier", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 74);
        ajc$tjp_11 = b1.a("method-execution", b1.a("1", "setKModifier", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "kModifier", "", "void"), 78);
        ajc$tjp_12 = b1.a("method-execution", b1.a("1", "getChannels", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 82);
        ajc$tjp_13 = b1.a("method-execution", b1.a("1", "setChannels", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "channels", "", "void"), 86);
        ajc$tjp_14 = b1.a("method-execution", b1.a("1", "getUnknown2", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 90);
        ajc$tjp_15 = b1.a("method-execution", b1.a("1", "setUnknown2", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "unknown2", "", "void"), 94);
        ajc$tjp_16 = b1.a("method-execution", b1.a("1", "getMaxCodedFrameSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 98);
        ajc$tjp_17 = b1.a("method-execution", b1.a("1", "setMaxCodedFrameSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "maxCodedFrameSize", "", "void"), 102);
        ajc$tjp_18 = b1.a("method-execution", b1.a("1", "getBitRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 106);
        ajc$tjp_19 = b1.a("method-execution", b1.a("1", "setBitRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "bitRate", "", "void"), 110);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getUnknown1", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 42);
        ajc$tjp_20 = b1.a("method-execution", b1.a("1", "getSampleRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 114);
        ajc$tjp_21 = b1.a("method-execution", b1.a("1", "setSampleRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "sampleRate", "", "void"), 118);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setUnknown1", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "unknown1", "", "void"), 46);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getSampleSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 50);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "setSampleSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "sampleSize", "", "void"), 54);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "getHistoryMult", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 58);
        ajc$tjp_7 = b1.a("method-execution", b1.a("1", "setHistoryMult", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "historyMult", "", "void"), 62);
        ajc$tjp_8 = b1.a("method-execution", b1.a("1", "getInitialHistory", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 66);
        ajc$tjp_9 = b1.a("method-execution", b1.a("1", "setInitialHistory", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "initialHistory", "", "void"), 70);
    }

    public final void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        maxSamplePerFrame = IsoTypeReader.readUInt32(bytebuffer);
        unknown1 = IsoTypeReader.readUInt8(bytebuffer);
        sampleSize = IsoTypeReader.readUInt8(bytebuffer);
        historyMult = IsoTypeReader.readUInt8(bytebuffer);
        initialHistory = IsoTypeReader.readUInt8(bytebuffer);
        kModifier = IsoTypeReader.readUInt8(bytebuffer);
        channels = IsoTypeReader.readUInt8(bytebuffer);
        unknown2 = IsoTypeReader.readUInt16(bytebuffer);
        maxCodedFrameSize = IsoTypeReader.readUInt32(bytebuffer);
        bitRate = IsoTypeReader.readUInt32(bytebuffer);
        sampleRate = IsoTypeReader.readUInt32(bytebuffer);
    }

    public final long getBitRate()
    {
        org.b.a.a a1 = b.a(ajc$tjp_18, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return bitRate;
    }

    public final int getChannels()
    {
        org.b.a.a a1 = b.a(ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return channels;
    }

    protected final void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeUInt32(bytebuffer, maxSamplePerFrame);
        IsoTypeWriter.writeUInt8(bytebuffer, unknown1);
        IsoTypeWriter.writeUInt8(bytebuffer, sampleSize);
        IsoTypeWriter.writeUInt8(bytebuffer, historyMult);
        IsoTypeWriter.writeUInt8(bytebuffer, initialHistory);
        IsoTypeWriter.writeUInt8(bytebuffer, kModifier);
        IsoTypeWriter.writeUInt8(bytebuffer, channels);
        IsoTypeWriter.writeUInt16(bytebuffer, unknown2);
        IsoTypeWriter.writeUInt32(bytebuffer, maxCodedFrameSize);
        IsoTypeWriter.writeUInt32(bytebuffer, bitRate);
        IsoTypeWriter.writeUInt32(bytebuffer, sampleRate);
    }

    protected final long getContentSize()
    {
        return 28L;
    }

    public final int getHistoryMult()
    {
        org.b.a.a a1 = b.a(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return historyMult;
    }

    public final int getInitialHistory()
    {
        org.b.a.a a1 = b.a(ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return initialHistory;
    }

    public final int getKModifier()
    {
        org.b.a.a a1 = b.a(ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return kModifier;
    }

    public final long getMaxCodedFrameSize()
    {
        org.b.a.a a1 = b.a(ajc$tjp_16, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return maxCodedFrameSize;
    }

    public final long getMaxSamplePerFrame()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return maxSamplePerFrame;
    }

    public final long getSampleRate()
    {
        org.b.a.a a1 = b.a(ajc$tjp_20, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return sampleRate;
    }

    public final int getSampleSize()
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return sampleSize;
    }

    public final int getUnknown1()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return unknown1;
    }

    public final int getUnknown2()
    {
        org.b.a.a a1 = b.a(ajc$tjp_14, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return unknown2;
    }

    public final void setBitRate(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_19, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        bitRate = i;
    }

    public final void setChannels(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_13, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        channels = i;
    }

    public final void setHistoryMult(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_7, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        historyMult = i;
    }

    public final void setInitialHistory(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_9, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        initialHistory = i;
    }

    public final void setKModifier(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_11, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        kModifier = i;
    }

    public final void setMaxCodedFrameSize(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_17, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        maxCodedFrameSize = i;
    }

    public final void setMaxSamplePerFrame(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        maxSamplePerFrame = i;
    }

    public final void setSampleRate(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_21, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        sampleRate = i;
    }

    public final void setSampleSize(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        sampleSize = i;
    }

    public final void setUnknown1(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        unknown1 = i;
    }

    public final void setUnknown2(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_15, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        unknown2 = i;
    }

    static 
    {
        ajc$preClinit();
    }
}
