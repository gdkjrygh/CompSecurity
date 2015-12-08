// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.apple;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.a.a;
import org.b.b.b.b;

// Referenced classes of package com.googlecode.mp4parser.boxes.apple:
//            AppleDataBox

public class AppleTrackNumberBox extends AppleDataBox
{

    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    int a;
    int b;

    public AppleTrackNumberBox()
    {
        super("trkn", 0);
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("AppleTrackNumberBox.java", com/googlecode/mp4parser/boxes/apple/AppleTrackNumberBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getA", "com.googlecode.mp4parser.boxes.apple.AppleTrackNumberBox", "", "", "", "int"), 16);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setA", "com.googlecode.mp4parser.boxes.apple.AppleTrackNumberBox", "int", "a", "", "void"), 20);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getB", "com.googlecode.mp4parser.boxes.apple.AppleTrackNumberBox", "", "", "", "int"), 24);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setB", "com.googlecode.mp4parser.boxes.apple.AppleTrackNumberBox", "int", "b", "", "void"), 28);
    }

    public int getA()
    {
        org.b.a.a a1 = org.b.b.b.b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return a;
    }

    public int getB()
    {
        org.b.a.a a1 = org.b.b.b.b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return b;
    }

    protected int getDataLength()
    {
        return 8;
    }

    protected void parseData(ByteBuffer bytebuffer)
    {
        a = bytebuffer.getInt();
        b = bytebuffer.getInt();
    }

    public void setA(int i)
    {
        org.b.a.a a1 = org.b.b.b.b.a(ajc$tjp_1, this, this, org.b.b.a.a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        a = i;
    }

    public void setB(int i)
    {
        org.b.a.a a1 = org.b.b.b.b.a(ajc$tjp_3, this, this, org.b.b.a.a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        b = i;
    }

    protected byte[] writeData()
    {
        ByteBuffer bytebuffer = ByteBuffer.allocate(8);
        bytebuffer.putInt(a);
        bytebuffer.putInt(b);
        return bytebuffer.array();
    }

    static 
    {
        ajc$preClinit();
    }
}
