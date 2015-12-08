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

public class PriotityRangeBox extends AbstractBox
{

    public static final String TYPE = "svpr";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    private static final org.b.a.a.a ajc$tjp_7;
    int max_priorityId;
    int min_priorityId;
    int reserved1;
    int reserved2;

    public PriotityRangeBox()
    {
        super("svpr");
        reserved1 = 0;
        reserved2 = 0;
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("PriotityRangeBox.java", com/mp4parser/iso14496/part15/PriotityRangeBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getReserved1", "com.mp4parser.iso14496.part15.PriotityRangeBox", "", "", "", "int"), 45);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setReserved1", "com.mp4parser.iso14496.part15.PriotityRangeBox", "int", "reserved1", "", "void"), 49);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getMin_priorityId", "com.mp4parser.iso14496.part15.PriotityRangeBox", "", "", "", "int"), 53);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setMin_priorityId", "com.mp4parser.iso14496.part15.PriotityRangeBox", "int", "min_priorityId", "", "void"), 57);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getReserved2", "com.mp4parser.iso14496.part15.PriotityRangeBox", "", "", "", "int"), 61);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "setReserved2", "com.mp4parser.iso14496.part15.PriotityRangeBox", "int", "reserved2", "", "void"), 65);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "getMax_priorityId", "com.mp4parser.iso14496.part15.PriotityRangeBox", "", "", "", "int"), 69);
        ajc$tjp_7 = b1.a("method-execution", b1.a("1", "setMax_priorityId", "com.mp4parser.iso14496.part15.PriotityRangeBox", "int", "max_priorityId", "", "void"), 73);
    }

    protected void _parseDetails(ByteBuffer bytebuffer)
    {
        min_priorityId = IsoTypeReader.readUInt8(bytebuffer);
        reserved1 = (min_priorityId & 0xc0) >> 6;
        min_priorityId = min_priorityId & 0x3f;
        max_priorityId = IsoTypeReader.readUInt8(bytebuffer);
        reserved2 = (max_priorityId & 0xc0) >> 6;
        max_priorityId = max_priorityId & 0x3f;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        IsoTypeWriter.writeUInt8(bytebuffer, (reserved1 << 6) + min_priorityId);
        IsoTypeWriter.writeUInt8(bytebuffer, (reserved2 << 6) + max_priorityId);
    }

    protected long getContentSize()
    {
        return 2L;
    }

    public int getMax_priorityId()
    {
        org.b.a.a a1 = b.a(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return max_priorityId;
    }

    public int getMin_priorityId()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return min_priorityId;
    }

    public int getReserved1()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return reserved1;
    }

    public int getReserved2()
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return reserved2;
    }

    public void setMax_priorityId(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_7, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        max_priorityId = i;
    }

    public void setMin_priorityId(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        min_priorityId = i;
    }

    public void setReserved1(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        reserved1 = i;
    }

    public void setReserved2(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        reserved2 = i;
    }

    static 
    {
        ajc$preClinit();
    }
}
