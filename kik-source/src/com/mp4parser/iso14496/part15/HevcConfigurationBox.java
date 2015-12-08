// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mp4parser.iso14496.part15;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import java.util.List;
import org.b.b.b.b;

// Referenced classes of package com.mp4parser.iso14496.part15:
//            HevcDecoderConfigurationRecord

public class HevcConfigurationBox extends AbstractBox
{

    public static final String TYPE = "hvcC";
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
    private HevcDecoderConfigurationRecord hevcDecoderConfigurationRecord;

    public HevcConfigurationBox()
    {
        super("hvcC");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("HevcConfigurationBox.java", com/mp4parser/iso14496/part15/HevcConfigurationBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getHevcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord"), 36);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setHevcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord", "hevcDecoderConfigurationRecord", "", "void"), 40);
        ajc$tjp_10 = b1.a("method-execution", b1.a("1", "getGeneral_level_idc", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 88);
        ajc$tjp_11 = b1.a("method-execution", b1.a("1", "getMin_spatial_segmentation_idc", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 92);
        ajc$tjp_12 = b1.a("method-execution", b1.a("1", "getParallelismType", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 96);
        ajc$tjp_13 = b1.a("method-execution", b1.a("1", "getChromaFormat", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 100);
        ajc$tjp_14 = b1.a("method-execution", b1.a("1", "getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 104);
        ajc$tjp_15 = b1.a("method-execution", b1.a("1", "getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 108);
        ajc$tjp_16 = b1.a("method-execution", b1.a("1", "getAvgFrameRate", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 112);
        ajc$tjp_17 = b1.a("method-execution", b1.a("1", "getNumTemporalLayers", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 116);
        ajc$tjp_18 = b1.a("method-execution", b1.a("1", "getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 120);
        ajc$tjp_19 = b1.a("method-execution", b1.a("1", "isTemporalIdNested", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "boolean"), 124);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "equals", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "java.lang.Object", "o", "", "boolean"), 45);
        ajc$tjp_20 = b1.a("method-execution", b1.a("1", "getConstantFrameRate", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 128);
        ajc$tjp_21 = b1.a("method-execution", b1.a("1", "getArrays", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "java.util.List"), 132);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "hashCode", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 58);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getConfigurationVersion", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 63);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "getGeneral_profile_space", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 67);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "isGeneral_tier_flag", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "boolean"), 71);
        ajc$tjp_7 = b1.a("method-execution", b1.a("1", "getGeneral_profile_idc", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 76);
        ajc$tjp_8 = b1.a("method-execution", b1.a("1", "getGeneral_profile_compatibility_flags", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "long"), 80);
        ajc$tjp_9 = b1.a("method-execution", b1.a("1", "getGeneral_constraint_indicator_flags", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "long"), 84);
    }

    protected void _parseDetails(ByteBuffer bytebuffer)
    {
        hevcDecoderConfigurationRecord = new HevcDecoderConfigurationRecord();
        hevcDecoderConfigurationRecord.parse(bytebuffer);
    }

    public boolean equals(Object obj)
    {
        org.b.a.a a = b.a(ajc$tjp_2, this, this, obj);
        RequiresParseDetailAspect.aspectOf().before(a);
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (HevcConfigurationBox)obj;
            if (hevcDecoderConfigurationRecord == null ? ((HevcConfigurationBox) (obj)).hevcDecoderConfigurationRecord != null : !hevcDecoderConfigurationRecord.equals(((HevcConfigurationBox) (obj)).hevcDecoderConfigurationRecord))
            {
                return false;
            }
        }
        return true;
    }

    public List getArrays()
    {
        org.b.a.a a = b.a(ajc$tjp_21, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return hevcDecoderConfigurationRecord.arrays;
    }

    public int getAvgFrameRate()
    {
        org.b.a.a a = b.a(ajc$tjp_16, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return hevcDecoderConfigurationRecord.avgFrameRate;
    }

    public int getBitDepthChromaMinus8()
    {
        org.b.a.a a = b.a(ajc$tjp_15, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return hevcDecoderConfigurationRecord.bitDepthChromaMinus8;
    }

    public int getBitDepthLumaMinus8()
    {
        org.b.a.a a = b.a(ajc$tjp_14, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return hevcDecoderConfigurationRecord.bitDepthLumaMinus8;
    }

    public int getChromaFormat()
    {
        org.b.a.a a = b.a(ajc$tjp_13, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return hevcDecoderConfigurationRecord.chromaFormat;
    }

    public int getConfigurationVersion()
    {
        org.b.a.a a = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return hevcDecoderConfigurationRecord.configurationVersion;
    }

    public int getConstantFrameRate()
    {
        org.b.a.a a = b.a(ajc$tjp_20, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return hevcDecoderConfigurationRecord.constantFrameRate;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        hevcDecoderConfigurationRecord.write(bytebuffer);
    }

    protected long getContentSize()
    {
        return (long)hevcDecoderConfigurationRecord.getSize();
    }

    public long getGeneral_constraint_indicator_flags()
    {
        org.b.a.a a = b.a(ajc$tjp_9, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return hevcDecoderConfigurationRecord.general_constraint_indicator_flags;
    }

    public int getGeneral_level_idc()
    {
        org.b.a.a a = b.a(ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return hevcDecoderConfigurationRecord.general_level_idc;
    }

    public long getGeneral_profile_compatibility_flags()
    {
        org.b.a.a a = b.a(ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return hevcDecoderConfigurationRecord.general_profile_compatibility_flags;
    }

    public int getGeneral_profile_idc()
    {
        org.b.a.a a = b.a(ajc$tjp_7, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return hevcDecoderConfigurationRecord.general_profile_idc;
    }

    public int getGeneral_profile_space()
    {
        org.b.a.a a = b.a(ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return hevcDecoderConfigurationRecord.general_profile_space;
    }

    public HevcDecoderConfigurationRecord getHevcDecoderConfigurationRecord()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return hevcDecoderConfigurationRecord;
    }

    public int getLengthSizeMinusOne()
    {
        org.b.a.a a = b.a(ajc$tjp_18, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return hevcDecoderConfigurationRecord.lengthSizeMinusOne;
    }

    public int getMin_spatial_segmentation_idc()
    {
        org.b.a.a a = b.a(ajc$tjp_11, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return hevcDecoderConfigurationRecord.min_spatial_segmentation_idc;
    }

    public int getNumTemporalLayers()
    {
        org.b.a.a a = b.a(ajc$tjp_17, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return hevcDecoderConfigurationRecord.numTemporalLayers;
    }

    public int getParallelismType()
    {
        org.b.a.a a = b.a(ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return hevcDecoderConfigurationRecord.parallelismType;
    }

    public int hashCode()
    {
        org.b.a.a a = b.a(ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        if (hevcDecoderConfigurationRecord != null)
        {
            return hevcDecoderConfigurationRecord.hashCode();
        } else
        {
            return 0;
        }
    }

    public boolean isGeneral_tier_flag()
    {
        org.b.a.a a = b.a(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return hevcDecoderConfigurationRecord.general_tier_flag;
    }

    public boolean isTemporalIdNested()
    {
        org.b.a.a a = b.a(ajc$tjp_19, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return hevcDecoderConfigurationRecord.temporalIdNested;
    }

    public void setHevcDecoderConfigurationRecord(HevcDecoderConfigurationRecord hevcdecoderconfigurationrecord)
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this, hevcdecoderconfigurationrecord);
        RequiresParseDetailAspect.aspectOf().before(a);
        hevcDecoderConfigurationRecord = hevcdecoderconfigurationrecord;
    }

    static 
    {
        ajc$preClinit();
    }
}
