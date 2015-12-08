// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mp4parser.iso14496.part12;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.a.a;
import org.b.b.b.b;

public final class BitRateBox extends AbstractBox
{

    public static final String TYPE = "btrt";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private long avgBitrate;
    private long bufferSizeDb;
    private long maxBitrate;

    public BitRateBox()
    {
        super("btrt");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("BitRateBox.java", com/mp4parser/iso14496/part12/BitRateBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getBufferSizeDb", "com.mp4parser.iso14496.part12.BitRateBox", "", "", "", "long"), 74);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setBufferSizeDb", "com.mp4parser.iso14496.part12.BitRateBox", "long", "bufferSizeDb", "", "void"), 82);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getMaxBitrate", "com.mp4parser.iso14496.part12.BitRateBox", "", "", "", "long"), 90);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setMaxBitrate", "com.mp4parser.iso14496.part12.BitRateBox", "long", "maxBitrate", "", "void"), 98);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getAvgBitrate", "com.mp4parser.iso14496.part12.BitRateBox", "", "", "", "long"), 106);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "setAvgBitrate", "com.mp4parser.iso14496.part12.BitRateBox", "long", "avgBitrate", "", "void"), 114);
    }

    public final void _parseDetails(ByteBuffer bytebuffer)
    {
        bufferSizeDb = IsoTypeReader.readUInt32(bytebuffer);
        maxBitrate = IsoTypeReader.readUInt32(bytebuffer);
        avgBitrate = IsoTypeReader.readUInt32(bytebuffer);
    }

    public final long getAvgBitrate()
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return avgBitrate;
    }

    public final long getBufferSizeDb()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return bufferSizeDb;
    }

    protected final void getContent(ByteBuffer bytebuffer)
    {
        IsoTypeWriter.writeUInt32(bytebuffer, bufferSizeDb);
        IsoTypeWriter.writeUInt32(bytebuffer, maxBitrate);
        IsoTypeWriter.writeUInt32(bytebuffer, avgBitrate);
    }

    protected final long getContentSize()
    {
        return 12L;
    }

    public final long getMaxBitrate()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return maxBitrate;
    }

    public final void setAvgBitrate(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        avgBitrate = l;
    }

    public final void setBufferSizeDb(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        bufferSizeDb = l;
    }

    public final void setMaxBitrate(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        maxBitrate = l;
    }

    static 
    {
        ajc$preClinit();
    }
}
