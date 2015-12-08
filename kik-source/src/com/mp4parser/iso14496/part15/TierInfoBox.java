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

public class TierInfoBox extends AbstractBox
{

    public static final String TYPE = "tiri";
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
    int constantFrameRate;
    int discardable;
    int frameRate;
    int levelIndication;
    int profileIndication;
    int profile_compatibility;
    int reserved1;
    int reserved2;
    int tierID;
    int visualHeight;
    int visualWidth;

    public TierInfoBox()
    {
        super("tiri");
        reserved1 = 0;
        reserved2 = 0;
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("TierInfoBox.java", com/mp4parser/iso14496/part15/TierInfoBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getTierID", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 69);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setTierID", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "tierID", "", "void"), 73);
        ajc$tjp_10 = b1.a("method-execution", b1.a("1", "getVisualWidth", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 109);
        ajc$tjp_11 = b1.a("method-execution", b1.a("1", "setVisualWidth", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "visualWidth", "", "void"), 113);
        ajc$tjp_12 = b1.a("method-execution", b1.a("1", "getVisualHeight", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 117);
        ajc$tjp_13 = b1.a("method-execution", b1.a("1", "setVisualHeight", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "visualHeight", "", "void"), 121);
        ajc$tjp_14 = b1.a("method-execution", b1.a("1", "getDiscardable", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 125);
        ajc$tjp_15 = b1.a("method-execution", b1.a("1", "setDiscardable", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "discardable", "", "void"), 129);
        ajc$tjp_16 = b1.a("method-execution", b1.a("1", "getConstantFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 133);
        ajc$tjp_17 = b1.a("method-execution", b1.a("1", "setConstantFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "constantFrameRate", "", "void"), 137);
        ajc$tjp_18 = b1.a("method-execution", b1.a("1", "getReserved2", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 141);
        ajc$tjp_19 = b1.a("method-execution", b1.a("1", "setReserved2", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "reserved2", "", "void"), 145);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getProfileIndication", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 77);
        ajc$tjp_20 = b1.a("method-execution", b1.a("1", "getFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 149);
        ajc$tjp_21 = b1.a("method-execution", b1.a("1", "setFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "frameRate", "", "void"), 153);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setProfileIndication", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "profileIndication", "", "void"), 81);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getProfile_compatibility", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 85);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "setProfile_compatibility", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "profile_compatibility", "", "void"), 89);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "getLevelIndication", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 93);
        ajc$tjp_7 = b1.a("method-execution", b1.a("1", "setLevelIndication", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "levelIndication", "", "void"), 97);
        ajc$tjp_8 = b1.a("method-execution", b1.a("1", "getReserved1", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 101);
        ajc$tjp_9 = b1.a("method-execution", b1.a("1", "setReserved1", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "reserved1", "", "void"), 105);
    }

    protected void _parseDetails(ByteBuffer bytebuffer)
    {
        tierID = IsoTypeReader.readUInt16(bytebuffer);
        profileIndication = IsoTypeReader.readUInt8(bytebuffer);
        profile_compatibility = IsoTypeReader.readUInt8(bytebuffer);
        levelIndication = IsoTypeReader.readUInt8(bytebuffer);
        reserved1 = IsoTypeReader.readUInt8(bytebuffer);
        visualWidth = IsoTypeReader.readUInt16(bytebuffer);
        visualHeight = IsoTypeReader.readUInt16(bytebuffer);
        int i = IsoTypeReader.readUInt8(bytebuffer);
        discardable = (i & 0xc0) >> 6;
        constantFrameRate = (i & 0x30) >> 4;
        reserved2 = i & 0xf;
        frameRate = IsoTypeReader.readUInt16(bytebuffer);
    }

    public int getConstantFrameRate()
    {
        org.b.a.a a1 = b.a(ajc$tjp_16, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return constantFrameRate;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        IsoTypeWriter.writeUInt16(bytebuffer, tierID);
        IsoTypeWriter.writeUInt8(bytebuffer, profileIndication);
        IsoTypeWriter.writeUInt8(bytebuffer, profile_compatibility);
        IsoTypeWriter.writeUInt8(bytebuffer, levelIndication);
        IsoTypeWriter.writeUInt8(bytebuffer, reserved1);
        IsoTypeWriter.writeUInt16(bytebuffer, visualWidth);
        IsoTypeWriter.writeUInt16(bytebuffer, visualHeight);
        IsoTypeWriter.writeUInt8(bytebuffer, (discardable << 6) + (constantFrameRate << 4) + reserved2);
        IsoTypeWriter.writeUInt16(bytebuffer, frameRate);
    }

    protected long getContentSize()
    {
        return 13L;
    }

    public int getDiscardable()
    {
        org.b.a.a a1 = b.a(ajc$tjp_14, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return discardable;
    }

    public int getFrameRate()
    {
        org.b.a.a a1 = b.a(ajc$tjp_20, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return frameRate;
    }

    public int getLevelIndication()
    {
        org.b.a.a a1 = b.a(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return levelIndication;
    }

    public int getProfileIndication()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return profileIndication;
    }

    public int getProfile_compatibility()
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return profile_compatibility;
    }

    public int getReserved1()
    {
        org.b.a.a a1 = b.a(ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return reserved1;
    }

    public int getReserved2()
    {
        org.b.a.a a1 = b.a(ajc$tjp_18, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return reserved2;
    }

    public int getTierID()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return tierID;
    }

    public int getVisualHeight()
    {
        org.b.a.a a1 = b.a(ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return visualHeight;
    }

    public int getVisualWidth()
    {
        org.b.a.a a1 = b.a(ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return visualWidth;
    }

    public void setConstantFrameRate(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_17, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        constantFrameRate = i;
    }

    public void setDiscardable(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_15, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        discardable = i;
    }

    public void setFrameRate(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_21, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        frameRate = i;
    }

    public void setLevelIndication(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_7, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        levelIndication = i;
    }

    public void setProfileIndication(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        profileIndication = i;
    }

    public void setProfile_compatibility(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        profile_compatibility = i;
    }

    public void setReserved1(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_9, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        reserved1 = i;
    }

    public void setReserved2(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_19, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        reserved2 = i;
    }

    public void setTierID(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        tierID = i;
    }

    public void setVisualHeight(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_13, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        visualHeight = i;
    }

    public void setVisualWidth(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_11, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        visualWidth = i;
    }

    static 
    {
        ajc$preClinit();
    }
}
