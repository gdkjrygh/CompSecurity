// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mp4parser.iso14496.part12;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.b.b.a.a;
import org.b.b.b.b;

public class SampleAuxiliaryInformationSizesBox extends AbstractFullBox
{

    static final boolean $assertionsDisabled;
    public static final String TYPE = "saiz";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_10;
    private static final org.b.a.a.a ajc$tjp_11;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    private static final org.b.a.a.a ajc$tjp_7;
    private static final org.b.a.a.a ajc$tjp_8;
    private static final org.b.a.a.a ajc$tjp_9;
    private String auxInfoType;
    private String auxInfoTypeParameter;
    private short defaultSampleInfoSize;
    private int sampleCount;
    private short sampleInfoSizes[];

    public SampleAuxiliaryInformationSizesBox()
    {
        super("saiz");
        sampleInfoSizes = new short[0];
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("SampleAuxiliaryInformationSizesBox.java", com/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getSize", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "int", "index", "", "short"), 57);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "getAuxInfoType", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 107);
        ajc$tjp_10 = b1.a("method-execution", b1.a("1", "setSampleCount", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "int", "sampleCount", "", "void"), 144);
        ajc$tjp_11 = b1.a("method-execution", b1.a("1", "toString", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 149);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "setAuxInfoType", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "java.lang.String", "auxInfoType", "", "void"), 111);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "getAuxInfoTypeParameter", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 115);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "setAuxInfoTypeParameter", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "java.lang.String", "auxInfoTypeParameter", "", "void"), 119);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "getDefaultSampleInfoSize", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "int"), 123);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "setDefaultSampleInfoSize", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "int", "defaultSampleInfoSize", "", "void"), 127);
        ajc$tjp_7 = b1.a("method-execution", b1.a("1", "getSampleInfoSizes", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "[S"), 132);
        ajc$tjp_8 = b1.a("method-execution", b1.a("1", "setSampleInfoSizes", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "[S", "sampleInfoSizes", "", "void"), 136);
        ajc$tjp_9 = b1.a("method-execution", b1.a("1", "getSampleCount", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "int"), 140);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        if ((getFlags() & 1) == 1)
        {
            auxInfoType = IsoTypeReader.read4cc(bytebuffer);
            auxInfoTypeParameter = IsoTypeReader.read4cc(bytebuffer);
        }
        defaultSampleInfoSize = (short)IsoTypeReader.readUInt8(bytebuffer);
        sampleCount = CastUtils.l2i(IsoTypeReader.readUInt32(bytebuffer));
        if (defaultSampleInfoSize != 0) goto _L2; else goto _L1
_L1:
        int i;
        sampleInfoSizes = new short[sampleCount];
        i = 0;
_L5:
        if (i < sampleCount) goto _L3; else goto _L2
_L2:
        return;
_L3:
        sampleInfoSizes[i] = (short)IsoTypeReader.readUInt8(bytebuffer);
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public String getAuxInfoType()
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return auxInfoType;
    }

    public String getAuxInfoTypeParameter()
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return auxInfoTypeParameter;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        if ((getFlags() & 1) == 1)
        {
            bytebuffer.put(IsoFile.fourCCtoBytes(auxInfoType));
            bytebuffer.put(IsoFile.fourCCtoBytes(auxInfoTypeParameter));
        }
        IsoTypeWriter.writeUInt8(bytebuffer, defaultSampleInfoSize);
        if (defaultSampleInfoSize == 0)
        {
            IsoTypeWriter.writeUInt32(bytebuffer, sampleInfoSizes.length);
            short aword0[] = sampleInfoSizes;
            int j = aword0.length;
            int i = 0;
            do
            {
                if (i >= j)
                {
                    return;
                }
                IsoTypeWriter.writeUInt8(bytebuffer, aword0[i]);
                i++;
            } while (true);
        } else
        {
            IsoTypeWriter.writeUInt32(bytebuffer, sampleCount);
            return;
        }
    }

    protected long getContentSize()
    {
        byte byte0 = 4;
        if ((getFlags() & 1) == 1)
        {
            byte0 = 12;
        }
        int i;
        if (defaultSampleInfoSize == 0)
        {
            i = sampleInfoSizes.length;
        } else
        {
            i = 0;
        }
        return (long)(i + (byte0 + 5));
    }

    public int getDefaultSampleInfoSize()
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return defaultSampleInfoSize;
    }

    public int getSampleCount()
    {
        org.b.a.a a1 = b.a(ajc$tjp_9, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return sampleCount;
    }

    public short[] getSampleInfoSizes()
    {
        org.b.a.a a1 = b.a(ajc$tjp_7, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return Arrays.copyOf(sampleInfoSizes, sampleInfoSizes.length);
    }

    public short getSize(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        if (getDefaultSampleInfoSize() == 0)
        {
            return sampleInfoSizes[i];
        } else
        {
            return defaultSampleInfoSize;
        }
    }

    public void setAuxInfoType(String s)
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a1);
        auxInfoType = s;
    }

    public void setAuxInfoTypeParameter(String s)
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a1);
        auxInfoTypeParameter = s;
    }

    public void setDefaultSampleInfoSize(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_6, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        if (!$assertionsDisabled && i > 255)
        {
            throw new AssertionError();
        } else
        {
            defaultSampleInfoSize = (short)i;
            return;
        }
    }

    public void setSampleCount(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_10, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        sampleCount = i;
    }

    public void setSampleInfoSizes(short aword0[])
    {
        org.b.a.a a1 = b.a(ajc$tjp_8, this, this, aword0);
        RequiresParseDetailAspect.aspectOf().before(a1);
        sampleInfoSizes = Arrays.copyOf(aword0, aword0.length);
    }

    public String toString()
    {
        org.b.a.a a1 = b.a(ajc$tjp_11, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return (new StringBuilder("SampleAuxiliaryInformationSizesBox{defaultSampleInfoSize=")).append(defaultSampleInfoSize).append(", sampleCount=").append(sampleCount).append(", auxInfoType='").append(auxInfoType).append('\'').append(", auxInfoTypeParameter='").append(auxInfoTypeParameter).append('\'').append('}').toString();
    }

    static 
    {
        ajc$preClinit();
        boolean flag;
        if (!com/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
