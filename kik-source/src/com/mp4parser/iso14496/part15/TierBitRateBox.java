// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mp4parser.iso14496.part15;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.a.a;
import org.b.b.b.b;

public class TierBitRateBox extends AbstractBox
{

    public static final String TYPE = "tibr";
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
    long avgBitRate;
    long baseBitRate;
    long maxBitRate;
    long tierAvgBitRate;
    long tierBaseBitRate;
    long tierMaxBitRate;

    public TierBitRateBox()
    {
        super("tibr");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("TierBitRateBox.java", com/mp4parser/iso14496/part15/TierBitRateBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getBaseBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", "long"), 52);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setBaseBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "long", "baseBitRate", "", "void"), 56);
        ajc$tjp_10 = b1.a("method-execution", b1.a("1", "getTierAvgBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", "long"), 92);
        ajc$tjp_11 = b1.a("method-execution", b1.a("1", "setTierAvgBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "long", "tierAvgBitRate", "", "void"), 96);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getMaxBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", "long"), 60);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setMaxBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "long", "maxBitRate", "", "void"), 64);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getAvgBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", "long"), 68);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "setAvgBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "long", "avgBitRate", "", "void"), 72);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "getTierBaseBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", "long"), 76);
        ajc$tjp_7 = b1.a("method-execution", b1.a("1", "setTierBaseBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "long", "tierBaseBitRate", "", "void"), 80);
        ajc$tjp_8 = b1.a("method-execution", b1.a("1", "getTierMaxBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", "long"), 84);
        ajc$tjp_9 = b1.a("method-execution", b1.a("1", "setTierMaxBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "long", "tierMaxBitRate", "", "void"), 88);
    }

    protected void _parseDetails(ByteBuffer bytebuffer)
    {
        baseBitRate = IsoTypeReader.readUInt32(bytebuffer);
        maxBitRate = IsoTypeReader.readUInt32(bytebuffer);
        avgBitRate = IsoTypeReader.readUInt32(bytebuffer);
        tierBaseBitRate = IsoTypeReader.readUInt32(bytebuffer);
        tierMaxBitRate = IsoTypeReader.readUInt32(bytebuffer);
        tierAvgBitRate = IsoTypeReader.readUInt32(bytebuffer);
    }

    public long getAvgBitRate()
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return avgBitRate;
    }

    public long getBaseBitRate()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return baseBitRate;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        IsoTypeWriter.writeUInt32(bytebuffer, baseBitRate);
        IsoTypeWriter.writeUInt32(bytebuffer, maxBitRate);
        IsoTypeWriter.writeUInt32(bytebuffer, avgBitRate);
        IsoTypeWriter.writeUInt32(bytebuffer, tierBaseBitRate);
        IsoTypeWriter.writeUInt32(bytebuffer, tierMaxBitRate);
        IsoTypeWriter.writeUInt32(bytebuffer, tierAvgBitRate);
    }

    protected long getContentSize()
    {
        return 24L;
    }

    public long getMaxBitRate()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return maxBitRate;
    }

    public long getTierAvgBitRate()
    {
        org.b.a.a a1 = b.a(ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return tierAvgBitRate;
    }

    public long getTierBaseBitRate()
    {
        org.b.a.a a1 = b.a(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return tierBaseBitRate;
    }

    public long getTierMaxBitRate()
    {
        org.b.a.a a1 = b.a(ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return tierMaxBitRate;
    }

    public void setAvgBitRate(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        avgBitRate = l;
    }

    public void setBaseBitRate(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        baseBitRate = l;
    }

    public void setMaxBitRate(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        maxBitRate = l;
    }

    public void setTierAvgBitRate(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_11, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        tierAvgBitRate = l;
    }

    public void setTierBaseBitRate(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_7, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        tierBaseBitRate = l;
    }

    public void setTierMaxBitRate(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_9, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        tierMaxBitRate = l;
    }

    static 
    {
        ajc$preClinit();
    }
}
