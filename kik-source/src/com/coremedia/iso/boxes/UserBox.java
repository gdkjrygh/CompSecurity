// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.b.b;

public class UserBox extends AbstractBox
{

    public static final String TYPE = "uuid";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    byte data[];

    public UserBox(byte abyte0[])
    {
        super("uuid", abyte0);
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("UserBox.java", com/coremedia/iso/boxes/UserBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "toString", "com.coremedia.iso.boxes.UserBox", "", "", "", "java.lang.String"), 40);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "getData", "com.coremedia.iso.boxes.UserBox", "", "", "", "[B"), 47);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "setData", "com.coremedia.iso.boxes.UserBox", "[B", "data", "", "void"), 51);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        data = new byte[bytebuffer.remaining()];
        bytebuffer.get(data);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        bytebuffer.put(data);
    }

    protected long getContentSize()
    {
        return (long)data.length;
    }

    public byte[] getData()
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return data;
    }

    public void setData(byte abyte0[])
    {
        org.b.a.a a = b.a(ajc$tjp_2, this, this, abyte0);
        RequiresParseDetailAspect.aspectOf().before(a);
        data = abyte0;
    }

    public String toString()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return (new StringBuilder("UserBox[type=")).append(getType()).append(";userType=").append(new String(getUserType())).append(";contentLength=").append(data.length).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
