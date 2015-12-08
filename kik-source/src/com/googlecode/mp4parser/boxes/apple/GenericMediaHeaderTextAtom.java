// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.apple;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.a.a;
import org.b.b.b.b;

public class GenericMediaHeaderTextAtom extends AbstractBox
{

    public static final String TYPE = "text";
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
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    private static final org.b.a.a.a ajc$tjp_7;
    private static final org.b.a.a.a ajc$tjp_8;
    private static final org.b.a.a.a ajc$tjp_9;
    int unknown_1;
    int unknown_2;
    int unknown_3;
    int unknown_4;
    int unknown_5;
    int unknown_6;
    int unknown_7;
    int unknown_8;
    int unknown_9;

    public GenericMediaHeaderTextAtom()
    {
        super("text");
        unknown_1 = 0x10000;
        unknown_5 = 0x10000;
        unknown_9 = 0x40000000;
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("GenericMediaHeaderTextAtom.java", com/googlecode/mp4parser/boxes/apple/GenericMediaHeaderTextAtom);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getUnknown_1", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 60);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setUnknown_1", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_1", "", "void"), 64);
        ajc$tjp_10 = b1.a("method-execution", b1.a("1", "getUnknown_6", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 100);
        ajc$tjp_11 = b1.a("method-execution", b1.a("1", "setUnknown_6", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_6", "", "void"), 104);
        ajc$tjp_12 = b1.a("method-execution", b1.a("1", "getUnknown_7", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 108);
        ajc$tjp_13 = b1.a("method-execution", b1.a("1", "setUnknown_7", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_7", "", "void"), 112);
        ajc$tjp_14 = b1.a("method-execution", b1.a("1", "getUnknown_8", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 116);
        ajc$tjp_15 = b1.a("method-execution", b1.a("1", "setUnknown_8", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_8", "", "void"), 120);
        ajc$tjp_16 = b1.a("method-execution", b1.a("1", "getUnknown_9", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 124);
        ajc$tjp_17 = b1.a("method-execution", b1.a("1", "setUnknown_9", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_9", "", "void"), 128);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getUnknown_2", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 68);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setUnknown_2", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_2", "", "void"), 72);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getUnknown_3", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 76);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "setUnknown_3", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_3", "", "void"), 80);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "getUnknown_4", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 84);
        ajc$tjp_7 = b1.a("method-execution", b1.a("1", "setUnknown_4", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_4", "", "void"), 88);
        ajc$tjp_8 = b1.a("method-execution", b1.a("1", "getUnknown_5", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 92);
        ajc$tjp_9 = b1.a("method-execution", b1.a("1", "setUnknown_5", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_5", "", "void"), 96);
    }

    protected void _parseDetails(ByteBuffer bytebuffer)
    {
        unknown_1 = bytebuffer.getInt();
        unknown_2 = bytebuffer.getInt();
        unknown_3 = bytebuffer.getInt();
        unknown_4 = bytebuffer.getInt();
        unknown_5 = bytebuffer.getInt();
        unknown_6 = bytebuffer.getInt();
        unknown_7 = bytebuffer.getInt();
        unknown_8 = bytebuffer.getInt();
        unknown_9 = bytebuffer.getInt();
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        bytebuffer.putInt(unknown_1);
        bytebuffer.putInt(unknown_2);
        bytebuffer.putInt(unknown_3);
        bytebuffer.putInt(unknown_4);
        bytebuffer.putInt(unknown_5);
        bytebuffer.putInt(unknown_6);
        bytebuffer.putInt(unknown_7);
        bytebuffer.putInt(unknown_8);
        bytebuffer.putInt(unknown_9);
    }

    protected long getContentSize()
    {
        return 36L;
    }

    public int getUnknown_1()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return unknown_1;
    }

    public int getUnknown_2()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return unknown_2;
    }

    public int getUnknown_3()
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return unknown_3;
    }

    public int getUnknown_4()
    {
        org.b.a.a a1 = b.a(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return unknown_4;
    }

    public int getUnknown_5()
    {
        org.b.a.a a1 = b.a(ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return unknown_5;
    }

    public int getUnknown_6()
    {
        org.b.a.a a1 = b.a(ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return unknown_6;
    }

    public int getUnknown_7()
    {
        org.b.a.a a1 = b.a(ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return unknown_7;
    }

    public int getUnknown_8()
    {
        org.b.a.a a1 = b.a(ajc$tjp_14, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return unknown_8;
    }

    public int getUnknown_9()
    {
        org.b.a.a a1 = b.a(ajc$tjp_16, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return unknown_9;
    }

    public void setUnknown_1(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        unknown_1 = i;
    }

    public void setUnknown_2(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        unknown_2 = i;
    }

    public void setUnknown_3(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        unknown_3 = i;
    }

    public void setUnknown_4(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_7, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        unknown_4 = i;
    }

    public void setUnknown_5(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_9, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        unknown_5 = i;
    }

    public void setUnknown_6(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_11, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        unknown_6 = i;
    }

    public void setUnknown_7(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_13, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        unknown_7 = i;
    }

    public void setUnknown_8(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_15, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        unknown_8 = i;
    }

    public void setUnknown_9(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_17, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        unknown_9 = i;
    }

    static 
    {
        ajc$preClinit();
    }
}
