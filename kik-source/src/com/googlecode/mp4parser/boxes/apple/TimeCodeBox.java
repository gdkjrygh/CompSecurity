// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.sampleentry.SampleEntry;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.a.a;
import org.b.b.b.b;

public class TimeCodeBox extends AbstractBox
    implements SampleEntry
{

    public static final String TYPE = "tmcd";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_10;
    private static final org.b.a.a.a ajc$tjp_11;
    private static final org.b.a.a.a ajc$tjp_12;
    private static final org.b.a.a.a ajc$tjp_13;
    private static final org.b.a.a.a ajc$tjp_14;
    private static final org.b.a.a.a ajc$tjp_15;
    private static final org.b.a.a.a ajc$tjp_16;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    private static final org.b.a.a.a ajc$tjp_7;
    private static final org.b.a.a.a ajc$tjp_8;
    private static final org.b.a.a.a ajc$tjp_9;
    int dataReferenceIndex;
    long flags;
    int frameDuration;
    int numberOfFrames;
    int reserved1;
    int reserved2;
    byte rest[];
    int timeScale;

    public TimeCodeBox()
    {
        super("tmcd");
        rest = new byte[0];
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("TimeCodeBox.java", com/googlecode/mp4parser/boxes/apple/TimeCodeBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getDataReferenceIndex", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 81);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setDataReferenceIndex", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "dataReferenceIndex", "", "void"), 85);
        ajc$tjp_10 = b1.a("method-execution", b1.a("1", "setReserved1", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "reserved1", "", "void"), 130);
        ajc$tjp_11 = b1.a("method-execution", b1.a("1", "getReserved2", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 134);
        ajc$tjp_12 = b1.a("method-execution", b1.a("1", "setReserved2", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "reserved2", "", "void"), 138);
        ajc$tjp_13 = b1.a("method-execution", b1.a("1", "getFlags", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "long"), 142);
        ajc$tjp_14 = b1.a("method-execution", b1.a("1", "setFlags", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "long", "flags", "", "void"), 146);
        ajc$tjp_15 = b1.a("method-execution", b1.a("1", "getRest", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "[B"), 150);
        ajc$tjp_16 = b1.a("method-execution", b1.a("1", "setRest", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "[B", "rest", "", "void"), 154);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "toString", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "java.lang.String"), 91);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "getTimeScale", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 102);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "setTimeScale", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "timeScale", "", "void"), 106);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "getFrameDuration", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 110);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "setFrameDuration", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "frameDuration", "", "void"), 114);
        ajc$tjp_7 = b1.a("method-execution", b1.a("1", "getNumberOfFrames", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 118);
        ajc$tjp_8 = b1.a("method-execution", b1.a("1", "setNumberOfFrames", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "numberOfFrames", "", "void"), 122);
        ajc$tjp_9 = b1.a("method-execution", b1.a("1", "getReserved1", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 126);
    }

    protected void _parseDetails(ByteBuffer bytebuffer)
    {
        bytebuffer.position(6);
        dataReferenceIndex = IsoTypeReader.readUInt16(bytebuffer);
        reserved1 = bytebuffer.getInt();
        flags = IsoTypeReader.readUInt32(bytebuffer);
        timeScale = bytebuffer.getInt();
        frameDuration = bytebuffer.getInt();
        numberOfFrames = IsoTypeReader.readUInt8(bytebuffer);
        reserved2 = IsoTypeReader.readUInt24(bytebuffer);
        rest = new byte[bytebuffer.remaining()];
        bytebuffer.get(rest);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        bytebuffer.put(new byte[6]);
        IsoTypeWriter.writeUInt16(bytebuffer, dataReferenceIndex);
        bytebuffer.putInt(reserved1);
        IsoTypeWriter.writeUInt32(bytebuffer, flags);
        bytebuffer.putInt(timeScale);
        bytebuffer.putInt(frameDuration);
        IsoTypeWriter.writeUInt8(bytebuffer, numberOfFrames);
        IsoTypeWriter.writeUInt24(bytebuffer, reserved2);
        bytebuffer.put(rest);
    }

    protected long getContentSize()
    {
        return (long)(rest.length + 28);
    }

    public int getDataReferenceIndex()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return dataReferenceIndex;
    }

    public long getFlags()
    {
        org.b.a.a a1 = b.a(ajc$tjp_13, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return flags;
    }

    public int getFrameDuration()
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return frameDuration;
    }

    public int getNumberOfFrames()
    {
        org.b.a.a a1 = b.a(ajc$tjp_7, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return numberOfFrames;
    }

    public int getReserved1()
    {
        org.b.a.a a1 = b.a(ajc$tjp_9, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return reserved1;
    }

    public int getReserved2()
    {
        org.b.a.a a1 = b.a(ajc$tjp_11, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return reserved2;
    }

    public byte[] getRest()
    {
        org.b.a.a a1 = b.a(ajc$tjp_15, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return rest;
    }

    public int getTimeScale()
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return timeScale;
    }

    public void setDataReferenceIndex(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        dataReferenceIndex = i;
    }

    public void setFlags(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_14, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        flags = l;
    }

    public void setFrameDuration(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_6, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        frameDuration = i;
    }

    public void setNumberOfFrames(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_8, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        numberOfFrames = i;
    }

    public void setReserved1(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_10, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        reserved1 = i;
    }

    public void setReserved2(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_12, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        reserved2 = i;
    }

    public void setRest(byte abyte0[])
    {
        org.b.a.a a1 = b.a(ajc$tjp_16, this, this, abyte0);
        RequiresParseDetailAspect.aspectOf().before(a1);
        rest = abyte0;
    }

    public void setTimeScale(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        timeScale = i;
    }

    public String toString()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return (new StringBuilder("TimeCodeBox{timeScale=")).append(timeScale).append(", frameDuration=").append(frameDuration).append(", numberOfFrames=").append(numberOfFrames).append(", reserved1=").append(reserved1).append(", reserved2=").append(reserved2).append(", flags=").append(flags).append('}').toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
