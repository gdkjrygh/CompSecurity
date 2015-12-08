// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.apple;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.b.b;

// Referenced classes of package com.googlecode.mp4parser.boxes.apple:
//            AppleDataBox

public class AppleCoverBox extends AppleDataBox
{

    private static final int IMAGE_TYPE_JPG = 13;
    private static final int IMAGE_TYPE_PNG = 14;
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private byte data[];

    public AppleCoverBox()
    {
        super("covr", 1);
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("AppleCoverBox.java", com/googlecode/mp4parser/boxes/apple/AppleCoverBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getCoverData", "com.googlecode.mp4parser.boxes.apple.AppleCoverBox", "", "", "", "[B"), 21);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setJpg", "com.googlecode.mp4parser.boxes.apple.AppleCoverBox", "[B", "data", "", "void"), 25);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "setPng", "com.googlecode.mp4parser.boxes.apple.AppleCoverBox", "[B", "data", "", "void"), 29);
    }

    private void setImageData(byte abyte0[], int i)
    {
        data = abyte0;
        dataType = i;
    }

    public byte[] getCoverData()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return data;
    }

    protected int getDataLength()
    {
        return data.length;
    }

    protected void parseData(ByteBuffer bytebuffer)
    {
        data = new byte[bytebuffer.limit()];
        bytebuffer.get(data);
    }

    public void setJpg(byte abyte0[])
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this, abyte0);
        RequiresParseDetailAspect.aspectOf().before(a);
        setImageData(abyte0, 13);
    }

    public void setPng(byte abyte0[])
    {
        org.b.a.a a = b.a(ajc$tjp_2, this, this, abyte0);
        RequiresParseDetailAspect.aspectOf().before(a);
        setImageData(abyte0, 14);
    }

    protected byte[] writeData()
    {
        return data;
    }

    static 
    {
        ajc$preClinit();
    }
}
