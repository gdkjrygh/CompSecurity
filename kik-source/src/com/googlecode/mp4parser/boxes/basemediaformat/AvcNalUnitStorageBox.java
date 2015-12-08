// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.basemediaformat;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.mp4parser.iso14496.part15.AvcConfigurationBox;
import com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord;
import java.nio.ByteBuffer;
import java.util.List;
import org.b.b.b.b;

public class AvcNalUnitStorageBox extends AbstractBox
{

    public static final String TYPE = "avcn";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    private static final org.b.a.a.a ajc$tjp_7;
    AvcDecoderConfigurationRecord avcDecoderConfigurationRecord;

    public AvcNalUnitStorageBox()
    {
        super("avcn");
    }

    public AvcNalUnitStorageBox(AvcConfigurationBox avcconfigurationbox)
    {
        super("avcn");
        avcDecoderConfigurationRecord = avcconfigurationbox.getavcDecoderConfigurationRecord();
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("AvcNalUnitStorageBox.java", com/googlecode/mp4parser/boxes/basemediaformat/AvcNalUnitStorageBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getAvcDecoderConfigurationRecord", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"), 44);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "getLengthSizeMinusOne", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "int"), 49);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getSPS", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "[Ljava.lang.String;"), 53);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "getPPS", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "[Ljava.lang.String;"), 57);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getSequenceParameterSetsAsStrings", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.util.List"), 61);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "getSequenceParameterSetExtsAsStrings", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.util.List"), 65);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "getPictureParameterSetsAsStrings", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.util.List"), 69);
        ajc$tjp_7 = b1.a("method-execution", b1.a("1", "toString", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.lang.String"), 89);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        avcDecoderConfigurationRecord = new AvcDecoderConfigurationRecord(bytebuffer);
    }

    public AvcDecoderConfigurationRecord getAvcDecoderConfigurationRecord()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return avcDecoderConfigurationRecord;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        avcDecoderConfigurationRecord.getContent(bytebuffer);
    }

    protected long getContentSize()
    {
        return avcDecoderConfigurationRecord.getContentSize();
    }

    public int getLengthSizeMinusOne()
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return avcDecoderConfigurationRecord.lengthSizeMinusOne;
    }

    public String[] getPPS()
    {
        org.b.a.a a = b.a(ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return avcDecoderConfigurationRecord.getPPS();
    }

    public List getPictureParameterSetsAsStrings()
    {
        org.b.a.a a = b.a(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return avcDecoderConfigurationRecord.getPictureParameterSetsAsStrings();
    }

    public String[] getSPS()
    {
        org.b.a.a a = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return avcDecoderConfigurationRecord.getSPS();
    }

    public List getSequenceParameterSetExtsAsStrings()
    {
        org.b.a.a a = b.a(ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return avcDecoderConfigurationRecord.getSequenceParameterSetExtsAsStrings();
    }

    public List getSequenceParameterSetsAsStrings()
    {
        org.b.a.a a = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return avcDecoderConfigurationRecord.getSequenceParameterSetsAsStrings();
    }

    public String toString()
    {
        org.b.a.a a = b.a(ajc$tjp_7, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return (new StringBuilder("AvcNalUnitStorageBox{SPS=")).append(avcDecoderConfigurationRecord.getSequenceParameterSetsAsStrings()).append(",PPS=").append(avcDecoderConfigurationRecord.getPictureParameterSetsAsStrings()).append(",lengthSize=").append(avcDecoderConfigurationRecord.lengthSizeMinusOne + 1).append('}').toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
