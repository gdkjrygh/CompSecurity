// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;
import java.nio.ByteBuffer;
import org.b.b.a.a;
import org.b.b.b.b;

public class AC3SpecificBox extends AbstractBox
{

    public static final String TYPE = "dac3";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_10;
    private static final org.b.a.a.a ajc$tjp_11;
    private static final org.b.a.a.a ajc$tjp_12;
    private static final org.b.a.a.a ajc$tjp_13;
    private static final org.b.a.a.a ajc$tjp_14;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    private static final org.b.a.a.a ajc$tjp_7;
    private static final org.b.a.a.a ajc$tjp_8;
    private static final org.b.a.a.a ajc$tjp_9;
    int acmod;
    int bitRateCode;
    int bsid;
    int bsmod;
    int fscod;
    int lfeon;
    int reserved;

    public AC3SpecificBox()
    {
        super("dac3");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("AC3SpecificBox.java", com/googlecode/mp4parser/boxes/AC3SpecificBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getFscod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 55);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setFscod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "fscod", "", "void"), 59);
        ajc$tjp_10 = b1.a("method-execution", b1.a("1", "getBitRateCode", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 95);
        ajc$tjp_11 = b1.a("method-execution", b1.a("1", "setBitRateCode", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "bitRateCode", "", "void"), 99);
        ajc$tjp_12 = b1.a("method-execution", b1.a("1", "getReserved", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 103);
        ajc$tjp_13 = b1.a("method-execution", b1.a("1", "setReserved", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "reserved", "", "void"), 107);
        ajc$tjp_14 = b1.a("method-execution", b1.a("1", "toString", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "java.lang.String"), 112);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getBsid", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 63);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setBsid", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "bsid", "", "void"), 67);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getBsmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 71);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "setBsmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "bsmod", "", "void"), 75);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "getAcmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 79);
        ajc$tjp_7 = b1.a("method-execution", b1.a("1", "setAcmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "acmod", "", "void"), 83);
        ajc$tjp_8 = b1.a("method-execution", b1.a("1", "getLfeon", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 87);
        ajc$tjp_9 = b1.a("method-execution", b1.a("1", "setLfeon", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "lfeon", "", "void"), 91);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        bytebuffer = new BitReaderBuffer(bytebuffer);
        fscod = bytebuffer.readBits(2);
        bsid = bytebuffer.readBits(5);
        bsmod = bytebuffer.readBits(3);
        acmod = bytebuffer.readBits(3);
        lfeon = bytebuffer.readBits(1);
        bitRateCode = bytebuffer.readBits(5);
        reserved = bytebuffer.readBits(5);
    }

    public int getAcmod()
    {
        org.b.a.a a1 = b.a(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return acmod;
    }

    public int getBitRateCode()
    {
        org.b.a.a a1 = b.a(ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return bitRateCode;
    }

    public int getBsid()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return bsid;
    }

    public int getBsmod()
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return bsmod;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        bytebuffer = new BitWriterBuffer(bytebuffer);
        bytebuffer.writeBits(fscod, 2);
        bytebuffer.writeBits(bsid, 5);
        bytebuffer.writeBits(bsmod, 3);
        bytebuffer.writeBits(acmod, 3);
        bytebuffer.writeBits(lfeon, 1);
        bytebuffer.writeBits(bitRateCode, 5);
        bytebuffer.writeBits(reserved, 5);
    }

    protected long getContentSize()
    {
        return 3L;
    }

    public int getFscod()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return fscod;
    }

    public int getLfeon()
    {
        org.b.a.a a1 = b.a(ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return lfeon;
    }

    public int getReserved()
    {
        org.b.a.a a1 = b.a(ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return reserved;
    }

    public void setAcmod(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_7, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        acmod = i;
    }

    public void setBitRateCode(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_11, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        bitRateCode = i;
    }

    public void setBsid(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        bsid = i;
    }

    public void setBsmod(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        bsmod = i;
    }

    public void setFscod(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        fscod = i;
    }

    public void setLfeon(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_9, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        lfeon = i;
    }

    public void setReserved(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_13, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        reserved = i;
    }

    public String toString()
    {
        org.b.a.a a1 = b.a(ajc$tjp_14, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return (new StringBuilder("AC3SpecificBox{fscod=")).append(fscod).append(", bsid=").append(bsid).append(", bsmod=").append(bsmod).append(", acmod=").append(acmod).append(", lfeon=").append(lfeon).append(", bitRateCode=").append(bitRateCode).append(", reserved=").append(reserved).append('}').toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
