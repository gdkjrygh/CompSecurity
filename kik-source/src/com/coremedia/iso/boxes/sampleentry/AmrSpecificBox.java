// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.b.b;

public class AmrSpecificBox extends AbstractBox
{

    public static final String TYPE = "damr";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    private int decoderVersion;
    private int framesPerSample;
    private int modeChangePeriod;
    private int modeSet;
    private String vendor;

    public AmrSpecificBox()
    {
        super("damr");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("AmrSpecificBox.java", com/coremedia/iso/boxes/sampleentry/AmrSpecificBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getVendor", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "java.lang.String"), 46);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "getDecoderVersion", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 50);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getModeSet", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 54);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "getModeChangePeriod", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 58);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getFramesPerSample", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 62);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "getContent", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 84);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "toString", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "java.lang.String"), 92);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        byte abyte0[] = new byte[4];
        bytebuffer.get(abyte0);
        vendor = IsoFile.bytesToFourCC(abyte0);
        decoderVersion = IsoTypeReader.readUInt8(bytebuffer);
        modeSet = IsoTypeReader.readUInt16(bytebuffer);
        modeChangePeriod = IsoTypeReader.readUInt8(bytebuffer);
        framesPerSample = IsoTypeReader.readUInt8(bytebuffer);
    }

    public void getContent(ByteBuffer bytebuffer)
    {
        org.b.a.a a = b.a(ajc$tjp_5, this, this, bytebuffer);
        RequiresParseDetailAspect.aspectOf().before(a);
        bytebuffer.put(IsoFile.fourCCtoBytes(vendor));
        IsoTypeWriter.writeUInt8(bytebuffer, decoderVersion);
        IsoTypeWriter.writeUInt16(bytebuffer, modeSet);
        IsoTypeWriter.writeUInt8(bytebuffer, modeChangePeriod);
        IsoTypeWriter.writeUInt8(bytebuffer, framesPerSample);
    }

    protected long getContentSize()
    {
        return 9L;
    }

    public int getDecoderVersion()
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return decoderVersion;
    }

    public int getFramesPerSample()
    {
        org.b.a.a a = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return framesPerSample;
    }

    public int getModeChangePeriod()
    {
        org.b.a.a a = b.a(ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return modeChangePeriod;
    }

    public int getModeSet()
    {
        org.b.a.a a = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return modeSet;
    }

    public String getVendor()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return vendor;
    }

    public String toString()
    {
        Object obj = b.a(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(((org.b.a.a) (obj)));
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("AmrSpecificBox[vendor=").append(getVendor());
        ((StringBuilder) (obj)).append(";decoderVersion=").append(getDecoderVersion());
        ((StringBuilder) (obj)).append(";modeSet=").append(getModeSet());
        ((StringBuilder) (obj)).append(";modeChangePeriod=").append(getModeChangePeriod());
        ((StringBuilder) (obj)).append(";framesPerSample=").append(getFramesPerSample());
        ((StringBuilder) (obj)).append("]");
        return ((StringBuilder) (obj)).toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
