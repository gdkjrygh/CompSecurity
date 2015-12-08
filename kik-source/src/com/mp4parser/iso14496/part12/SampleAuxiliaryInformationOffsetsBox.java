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
import org.b.b.b.b;

public class SampleAuxiliaryInformationOffsetsBox extends AbstractFullBox
{

    public static final String TYPE = "saio";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private String auxInfoType;
    private String auxInfoTypeParameter;
    private long offsets[];

    public SampleAuxiliaryInformationOffsetsBox()
    {
        super("saio");
        offsets = new long[0];
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("SampleAuxiliaryInformationOffsetsBox.java", com/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getAuxInfoType", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "", "", "", "java.lang.String"), 107);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setAuxInfoType", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "java.lang.String", "auxInfoType", "", "void"), 111);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getAuxInfoTypeParameter", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "", "", "", "java.lang.String"), 115);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setAuxInfoTypeParameter", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "java.lang.String", "auxInfoTypeParameter", "", "void"), 119);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getOffsets", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "", "", "", "[J"), 123);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "setOffsets", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "[J", "offsets", "", "void"), 127);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        if ((getFlags() & 1) == 1)
        {
            auxInfoType = IsoTypeReader.read4cc(bytebuffer);
            auxInfoTypeParameter = IsoTypeReader.read4cc(bytebuffer);
        }
        int j = CastUtils.l2i(IsoTypeReader.readUInt32(bytebuffer));
        offsets = new long[j];
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            if (getVersion() == 0)
            {
                offsets[i] = IsoTypeReader.readUInt32(bytebuffer);
            } else
            {
                offsets[i] = IsoTypeReader.readUInt64(bytebuffer);
            }
            i++;
        } while (true);
    }

    public String getAuxInfoType()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return auxInfoType;
    }

    public String getAuxInfoTypeParameter()
    {
        org.b.a.a a = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
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
        IsoTypeWriter.writeUInt32(bytebuffer, offsets.length);
        long al[] = offsets;
        int j = al.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            Long long1 = Long.valueOf(al[i]);
            if (getVersion() == 0)
            {
                IsoTypeWriter.writeUInt32(bytebuffer, long1.longValue());
            } else
            {
                IsoTypeWriter.writeUInt64(bytebuffer, long1.longValue());
            }
            i++;
        } while (true);
    }

    protected long getContentSize()
    {
        int i;
        byte byte0;
        if (getVersion() == 0)
        {
            i = offsets.length * 4;
        } else
        {
            i = offsets.length * 8;
        }
        if ((getFlags() & 1) == 1)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        return (long)(byte0 + (i + 8));
    }

    public long[] getOffsets()
    {
        org.b.a.a a = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return offsets;
    }

    public void setAuxInfoType(String s)
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a);
        auxInfoType = s;
    }

    public void setAuxInfoTypeParameter(String s)
    {
        org.b.a.a a = b.a(ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a);
        auxInfoTypeParameter = s;
    }

    public void setOffsets(long al[])
    {
        org.b.a.a a = b.a(ajc$tjp_5, this, this, al);
        RequiresParseDetailAspect.aspectOf().before(a);
        offsets = al;
    }

    static 
    {
        ajc$preClinit();
    }
}
