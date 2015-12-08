// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.apple;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.a.a;
import org.b.b.b.b;

public class PixelAspectRationAtom extends AbstractBox
{

    public static final String TYPE = "pasp";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private int hSpacing;
    private int vSpacing;

    public PixelAspectRationAtom()
    {
        super("pasp");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("PixelAspectRationAtom.java", com/googlecode/mp4parser/boxes/apple/PixelAspectRationAtom);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "gethSpacing", "com.googlecode.mp4parser.boxes.apple.PixelAspectRationAtom", "", "", "", "int"), 35);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "sethSpacing", "com.googlecode.mp4parser.boxes.apple.PixelAspectRationAtom", "int", "hSpacing", "", "void"), 39);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getvSpacing", "com.googlecode.mp4parser.boxes.apple.PixelAspectRationAtom", "", "", "", "int"), 43);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setvSpacing", "com.googlecode.mp4parser.boxes.apple.PixelAspectRationAtom", "int", "vSpacing", "", "void"), 47);
    }

    protected void _parseDetails(ByteBuffer bytebuffer)
    {
        hSpacing = bytebuffer.getInt();
        vSpacing = bytebuffer.getInt();
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        bytebuffer.putInt(hSpacing);
        bytebuffer.putInt(vSpacing);
    }

    protected long getContentSize()
    {
        return 8L;
    }

    public int gethSpacing()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return hSpacing;
    }

    public int getvSpacing()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return vSpacing;
    }

    public void sethSpacing(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        hSpacing = i;
    }

    public void setvSpacing(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        vSpacing = i;
    }

    static 
    {
        ajc$preClinit();
    }
}
