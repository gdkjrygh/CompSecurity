// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mp4parser.iso14496.part15;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import org.b.b.a.a;
import org.b.b.b.b;

// Referenced classes of package com.mp4parser.iso14496.part15:
//            AvcDecoderConfigurationRecord

public final class AvcConfigurationBox extends AbstractBox
{

    public static final String TYPE = "avcC";
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
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    private static final org.b.a.a.a ajc$tjp_7;
    private static final org.b.a.a.a ajc$tjp_8;
    private static final org.b.a.a.a ajc$tjp_9;
    public AvcDecoderConfigurationRecord avcDecoderConfigurationRecord;

    public AvcConfigurationBox()
    {
        super("avcC");
        avcDecoderConfigurationRecord = new AvcDecoderConfigurationRecord();
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("AvcConfigurationBox.java", com/mp4parser/iso14496/part15/AvcConfigurationBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 44);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 48);
        ajc$tjp_10 = b1.a("method-execution", b1.a("1", "setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "", "void"), 84);
        ajc$tjp_11 = b1.a("method-execution", b1.a("1", "setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "", "void"), 88);
        ajc$tjp_12 = b1.a("method-execution", b1.a("1", "setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "", "void"), 92);
        ajc$tjp_13 = b1.a("method-execution", b1.a("1", "setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "", "void"), 96);
        ajc$tjp_14 = b1.a("method-execution", b1.a("1", "getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 100);
        ajc$tjp_15 = b1.a("method-execution", b1.a("1", "setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "", "void"), 104);
        ajc$tjp_16 = b1.a("method-execution", b1.a("1", "getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 108);
        ajc$tjp_17 = b1.a("method-execution", b1.a("1", "setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "", "void"), 112);
        ajc$tjp_18 = b1.a("method-execution", b1.a("1", "getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 116);
        ajc$tjp_19 = b1.a("method-execution", b1.a("1", "setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "", "void"), 120);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 52);
        ajc$tjp_20 = b1.a("method-execution", b1.a("1", "getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 124);
        ajc$tjp_21 = b1.a("method-execution", b1.a("1", "setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "", "void"), 128);
        ajc$tjp_22 = b1.a("method-execution", b1.a("1", "hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "boolean"), 132);
        ajc$tjp_23 = b1.a("method-execution", b1.a("1", "setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "", "void"), 136);
        ajc$tjp_24 = b1.a("method-execution", b1.a("1", "getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "long"), 147);
        ajc$tjp_25 = b1.a("method-execution", b1.a("1", "getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 153);
        ajc$tjp_26 = b1.a("method-execution", b1.a("1", "getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "[Ljava.lang.String;"), 158);
        ajc$tjp_27 = b1.a("method-execution", b1.a("1", "getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "[Ljava.lang.String;"), 162);
        ajc$tjp_28 = b1.a("method-execution", b1.a("1", "getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"), 167);
        ajc$tjp_29 = b1.a("method-execution", b1.a("1", "toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.lang.String"), 172);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 56);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 60);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 64);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 68);
        ajc$tjp_7 = b1.a("method-execution", b1.a("1", "setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "", "void"), 72);
        ajc$tjp_8 = b1.a("method-execution", b1.a("1", "setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "", "void"), 76);
        ajc$tjp_9 = b1.a("method-execution", b1.a("1", "setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "", "void"), 80);
    }

    public final void _parseDetails(ByteBuffer bytebuffer)
    {
        avcDecoderConfigurationRecord = new AvcDecoderConfigurationRecord(bytebuffer);
    }

    public final int getAvcLevelIndication()
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return avcDecoderConfigurationRecord.avcLevelIndication;
    }

    public final int getAvcProfileIndication()
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return avcDecoderConfigurationRecord.avcProfileIndication;
    }

    public final int getBitDepthChromaMinus8()
    {
        org.b.a.a a1 = b.a(ajc$tjp_18, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return avcDecoderConfigurationRecord.bitDepthChromaMinus8;
    }

    public final int getBitDepthLumaMinus8()
    {
        org.b.a.a a1 = b.a(ajc$tjp_16, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return avcDecoderConfigurationRecord.bitDepthLumaMinus8;
    }

    public final int getChromaFormat()
    {
        org.b.a.a a1 = b.a(ajc$tjp_14, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return avcDecoderConfigurationRecord.chromaFormat;
    }

    public final int getConfigurationVersion()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return avcDecoderConfigurationRecord.configurationVersion;
    }

    public final void getContent(ByteBuffer bytebuffer)
    {
        org.b.a.a a1 = b.a(ajc$tjp_25, this, this, bytebuffer);
        RequiresParseDetailAspect.aspectOf().before(a1);
        avcDecoderConfigurationRecord.getContent(bytebuffer);
    }

    public final long getContentSize()
    {
        org.b.a.a a1 = b.a(ajc$tjp_24, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return avcDecoderConfigurationRecord.getContentSize();
    }

    public final int getLengthSizeMinusOne()
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return avcDecoderConfigurationRecord.lengthSizeMinusOne;
    }

    public final String[] getPPS()
    {
        org.b.a.a a1 = b.a(ajc$tjp_27, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return avcDecoderConfigurationRecord.getPPS();
    }

    public final List getPictureParameterSets()
    {
        org.b.a.a a1 = b.a(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return Collections.unmodifiableList(avcDecoderConfigurationRecord.pictureParameterSets);
    }

    public final int getProfileCompatibility()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return avcDecoderConfigurationRecord.profileCompatibility;
    }

    public final String[] getSPS()
    {
        org.b.a.a a1 = b.a(ajc$tjp_26, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return avcDecoderConfigurationRecord.getSPS();
    }

    public final List getSequenceParameterSetExts()
    {
        org.b.a.a a1 = b.a(ajc$tjp_20, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return avcDecoderConfigurationRecord.sequenceParameterSetExts;
    }

    public final List getSequenceParameterSets()
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return Collections.unmodifiableList(avcDecoderConfigurationRecord.sequenceParameterSets);
    }

    public final AvcDecoderConfigurationRecord getavcDecoderConfigurationRecord()
    {
        org.b.a.a a1 = b.a(ajc$tjp_28, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return avcDecoderConfigurationRecord;
    }

    public final boolean hasExts()
    {
        org.b.a.a a1 = b.a(ajc$tjp_22, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return avcDecoderConfigurationRecord.hasExts;
    }

    public final void setAvcLevelIndication(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_10, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        avcDecoderConfigurationRecord.avcLevelIndication = i;
    }

    public final void setAvcProfileIndication(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_8, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        avcDecoderConfigurationRecord.avcProfileIndication = i;
    }

    public final void setBitDepthChromaMinus8(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_19, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        avcDecoderConfigurationRecord.bitDepthChromaMinus8 = i;
    }

    public final void setBitDepthLumaMinus8(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_17, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        avcDecoderConfigurationRecord.bitDepthLumaMinus8 = i;
    }

    public final void setChromaFormat(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_15, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        avcDecoderConfigurationRecord.chromaFormat = i;
    }

    public final void setConfigurationVersion(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_7, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        avcDecoderConfigurationRecord.configurationVersion = i;
    }

    public final void setHasExts(boolean flag)
    {
        org.b.a.a a1 = b.a(ajc$tjp_23, this, this, a.a(flag));
        RequiresParseDetailAspect.aspectOf().before(a1);
        avcDecoderConfigurationRecord.hasExts = flag;
    }

    public final void setLengthSizeMinusOne(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_11, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        avcDecoderConfigurationRecord.lengthSizeMinusOne = i;
    }

    public final void setPictureParameterSets(List list)
    {
        org.b.a.a a1 = b.a(ajc$tjp_13, this, this, list);
        RequiresParseDetailAspect.aspectOf().before(a1);
        avcDecoderConfigurationRecord.pictureParameterSets = list;
    }

    public final void setProfileCompatibility(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_9, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        avcDecoderConfigurationRecord.profileCompatibility = i;
    }

    public final void setSequenceParameterSetExts(List list)
    {
        org.b.a.a a1 = b.a(ajc$tjp_21, this, this, list);
        RequiresParseDetailAspect.aspectOf().before(a1);
        avcDecoderConfigurationRecord.sequenceParameterSetExts = list;
    }

    public final void setSequenceParameterSets(List list)
    {
        org.b.a.a a1 = b.a(ajc$tjp_12, this, this, list);
        RequiresParseDetailAspect.aspectOf().before(a1);
        avcDecoderConfigurationRecord.sequenceParameterSets = list;
    }

    public final String toString()
    {
        org.b.a.a a1 = b.a(ajc$tjp_29, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return (new StringBuilder("AvcConfigurationBox{avcDecoderConfigurationRecord=")).append(avcDecoderConfigurationRecord).append('}').toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
