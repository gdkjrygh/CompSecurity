// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import org.b.b.a.a;
import org.b.b.b.b;

public class SampleSizeBox extends AbstractFullBox
{

    public static final String TYPE = "stsz";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    int sampleCount;
    private long sampleSize;
    private long sampleSizes[];

    public SampleSizeBox()
    {
        super("stsz");
        sampleSizes = new long[0];
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("SampleSizeBox.java", com/coremedia/iso/boxes/SampleSizeBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "long"), 50);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "", "void"), 54);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "", "long"), 59);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "long"), 67);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "[J"), 76);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "", "void"), 80);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "java.lang.String"), 119);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        sampleSize = IsoTypeReader.readUInt32(bytebuffer);
        sampleCount = CastUtils.l2i(IsoTypeReader.readUInt32(bytebuffer));
        if (sampleSize != 0L) goto _L2; else goto _L1
_L1:
        int i;
        sampleSizes = new long[sampleCount];
        i = 0;
_L5:
        if (i < sampleCount) goto _L3; else goto _L2
_L2:
        return;
_L3:
        sampleSizes[i] = IsoTypeReader.readUInt32(bytebuffer);
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeUInt32(bytebuffer, sampleSize);
        if (sampleSize == 0L)
        {
            IsoTypeWriter.writeUInt32(bytebuffer, sampleSizes.length);
            long al[] = sampleSizes;
            int j = al.length;
            int i = 0;
            do
            {
                if (i >= j)
                {
                    return;
                }
                IsoTypeWriter.writeUInt32(bytebuffer, al[i]);
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
        int i;
        if (sampleSize == 0L)
        {
            i = sampleSizes.length * 4;
        } else
        {
            i = 0;
        }
        return (long)(i + 12);
    }

    public long getSampleCount()
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        if (sampleSize > 0L)
        {
            return (long)sampleCount;
        } else
        {
            return (long)sampleSizes.length;
        }
    }

    public long getSampleSize()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return sampleSize;
    }

    public long getSampleSizeAtIndex(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        if (sampleSize > 0L)
        {
            return sampleSize;
        } else
        {
            return sampleSizes[i];
        }
    }

    public long[] getSampleSizes()
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return sampleSizes;
    }

    public void setSampleSize(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        sampleSize = l;
    }

    public void setSampleSizes(long al[])
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this, al);
        RequiresParseDetailAspect.aspectOf().before(a1);
        sampleSizes = al;
    }

    public String toString()
    {
        org.b.a.a a1 = b.a(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return (new StringBuilder("SampleSizeBox[sampleSize=")).append(getSampleSize()).append(";sampleCount=").append(getSampleCount()).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
