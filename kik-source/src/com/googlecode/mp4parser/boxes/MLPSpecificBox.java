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

public class MLPSpecificBox extends AbstractBox
{

    public static final String TYPE = "dmlp";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    private static final org.b.a.a.a ajc$tjp_7;
    int format_info;
    int peak_data_rate;
    int reserved;
    int reserved2;

    public MLPSpecificBox()
    {
        super("dmlp");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("MLPSpecificBox.java", com/googlecode/mp4parser/boxes/MLPSpecificBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getFormat_info", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", "int"), 49);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setFormat_info", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "int", "format_info", "", "void"), 53);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getPeak_data_rate", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", "int"), 57);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setPeak_data_rate", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "int", "peak_data_rate", "", "void"), 61);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getReserved", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", "int"), 65);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "setReserved", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "int", "reserved", "", "void"), 69);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "getReserved2", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", "int"), 73);
        ajc$tjp_7 = b1.a("method-execution", b1.a("1", "setReserved2", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "int", "reserved2", "", "void"), 77);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        bytebuffer = new BitReaderBuffer(bytebuffer);
        format_info = bytebuffer.readBits(32);
        peak_data_rate = bytebuffer.readBits(15);
        reserved = bytebuffer.readBits(1);
        reserved2 = bytebuffer.readBits(32);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        bytebuffer = new BitWriterBuffer(bytebuffer);
        bytebuffer.writeBits(format_info, 32);
        bytebuffer.writeBits(peak_data_rate, 15);
        bytebuffer.writeBits(reserved, 1);
        bytebuffer.writeBits(reserved2, 32);
    }

    protected long getContentSize()
    {
        return 10L;
    }

    public int getFormat_info()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return format_info;
    }

    public int getPeak_data_rate()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return peak_data_rate;
    }

    public int getReserved()
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return reserved;
    }

    public int getReserved2()
    {
        org.b.a.a a1 = b.a(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return reserved2;
    }

    public void setFormat_info(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        format_info = i;
    }

    public void setPeak_data_rate(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        peak_data_rate = i;
    }

    public void setReserved(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        reserved = i;
    }

    public void setReserved2(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_7, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        reserved2 = i;
    }

    static 
    {
        ajc$preClinit();
    }
}
