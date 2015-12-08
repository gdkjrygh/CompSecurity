// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.a.a;
import org.b.b.b.b;

public class BaseMediaInfoAtom extends AbstractFullBox
{

    public static final String TYPE = "gmin";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_10;
    private static final org.b.a.a.a ajc$tjp_11;
    private static final org.b.a.a.a ajc$tjp_12;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    private static final org.b.a.a.a ajc$tjp_7;
    private static final org.b.a.a.a ajc$tjp_8;
    private static final org.b.a.a.a ajc$tjp_9;
    short balance;
    short graphicsMode;
    int opColorB;
    int opColorG;
    int opColorR;
    short reserved;

    public BaseMediaInfoAtom()
    {
        super("gmin");
        graphicsMode = 64;
        opColorR = 32768;
        opColorG = 32768;
        opColorB = 32768;
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("BaseMediaInfoAtom.java", com/googlecode/mp4parser/boxes/apple/BaseMediaInfoAtom);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getGraphicsMode", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "short"), 54);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setGraphicsMode", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "short", "graphicsMode", "", "void"), 58);
        ajc$tjp_10 = b1.a("method-execution", b1.a("1", "getReserved", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "short"), 94);
        ajc$tjp_11 = b1.a("method-execution", b1.a("1", "setReserved", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "short", "reserved", "", "void"), 98);
        ajc$tjp_12 = b1.a("method-execution", b1.a("1", "toString", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "java.lang.String"), 103);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getOpColorR", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "int"), 62);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setOpColorR", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "int", "opColorR", "", "void"), 66);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getOpColorG", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "int"), 70);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "setOpColorG", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "int", "opColorG", "", "void"), 74);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "getOpColorB", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "int"), 78);
        ajc$tjp_7 = b1.a("method-execution", b1.a("1", "setOpColorB", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "int", "opColorB", "", "void"), 82);
        ajc$tjp_8 = b1.a("method-execution", b1.a("1", "getBalance", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "short"), 86);
        ajc$tjp_9 = b1.a("method-execution", b1.a("1", "setBalance", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "short", "balance", "", "void"), 90);
    }

    protected void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        graphicsMode = bytebuffer.getShort();
        opColorR = IsoTypeReader.readUInt16(bytebuffer);
        opColorG = IsoTypeReader.readUInt16(bytebuffer);
        opColorB = IsoTypeReader.readUInt16(bytebuffer);
        balance = bytebuffer.getShort();
        reserved = bytebuffer.getShort();
    }

    public short getBalance()
    {
        org.b.a.a a1 = b.a(ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return balance;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        bytebuffer.putShort(graphicsMode);
        IsoTypeWriter.writeUInt16(bytebuffer, opColorR);
        IsoTypeWriter.writeUInt16(bytebuffer, opColorG);
        IsoTypeWriter.writeUInt16(bytebuffer, opColorB);
        bytebuffer.putShort(balance);
        bytebuffer.putShort(reserved);
    }

    protected long getContentSize()
    {
        return 16L;
    }

    public short getGraphicsMode()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return graphicsMode;
    }

    public int getOpColorB()
    {
        org.b.a.a a1 = b.a(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return opColorB;
    }

    public int getOpColorG()
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return opColorG;
    }

    public int getOpColorR()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return opColorR;
    }

    public short getReserved()
    {
        org.b.a.a a1 = b.a(ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return reserved;
    }

    public void setBalance(short word0)
    {
        org.b.a.a a1 = b.a(ajc$tjp_9, this, this, a.a(word0));
        RequiresParseDetailAspect.aspectOf().before(a1);
        balance = word0;
    }

    public void setGraphicsMode(short word0)
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this, a.a(word0));
        RequiresParseDetailAspect.aspectOf().before(a1);
        graphicsMode = word0;
    }

    public void setOpColorB(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_7, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        opColorB = i;
    }

    public void setOpColorG(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        opColorG = i;
    }

    public void setOpColorR(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        opColorR = i;
    }

    public void setReserved(short word0)
    {
        org.b.a.a a1 = b.a(ajc$tjp_11, this, this, a.a(word0));
        RequiresParseDetailAspect.aspectOf().before(a1);
        reserved = word0;
    }

    public String toString()
    {
        org.b.a.a a1 = b.a(ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return (new StringBuilder("BaseMediaInfoAtom{graphicsMode=")).append(graphicsMode).append(", opColorR=").append(opColorR).append(", opColorG=").append(opColorG).append(", opColorB=").append(opColorB).append(", balance=").append(balance).append(", reserved=").append(reserved).append('}').toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
