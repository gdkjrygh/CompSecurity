// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.b.b;

// Referenced classes of package com.coremedia.iso.boxes:
//            AbstractMediaHeaderBox

public class HintMediaHeaderBox extends AbstractMediaHeaderBox
{

    public static final String TYPE = "hmhd";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private long avgBitrate;
    private int avgPduSize;
    private long maxBitrate;
    private int maxPduSize;

    public HintMediaHeaderBox()
    {
        super("hmhd");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("HintMediaHeaderBox.java", com/coremedia/iso/boxes/HintMediaHeaderBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getMaxPduSize", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "int"), 42);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "getAvgPduSize", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "int"), 46);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getMaxBitrate", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "long"), 50);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "getAvgBitrate", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "long"), 54);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "toString", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "java.lang.String"), 84);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        maxPduSize = IsoTypeReader.readUInt16(bytebuffer);
        avgPduSize = IsoTypeReader.readUInt16(bytebuffer);
        maxBitrate = IsoTypeReader.readUInt32(bytebuffer);
        avgBitrate = IsoTypeReader.readUInt32(bytebuffer);
        IsoTypeReader.readUInt32(bytebuffer);
    }

    public long getAvgBitrate()
    {
        org.b.a.a a = b.a(ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return avgBitrate;
    }

    public int getAvgPduSize()
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return avgPduSize;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeUInt16(bytebuffer, maxPduSize);
        IsoTypeWriter.writeUInt16(bytebuffer, avgPduSize);
        IsoTypeWriter.writeUInt32(bytebuffer, maxBitrate);
        IsoTypeWriter.writeUInt32(bytebuffer, avgBitrate);
        IsoTypeWriter.writeUInt32(bytebuffer, 0L);
    }

    protected long getContentSize()
    {
        return 20L;
    }

    public long getMaxBitrate()
    {
        org.b.a.a a = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return maxBitrate;
    }

    public int getMaxPduSize()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return maxPduSize;
    }

    public String toString()
    {
        org.b.a.a a = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return (new StringBuilder("HintMediaHeaderBox{maxPduSize=")).append(maxPduSize).append(", avgPduSize=").append(avgPduSize).append(", maxBitrate=").append(maxBitrate).append(", avgBitrate=").append(avgBitrate).append('}').toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
