// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akN;
import fr;
import fx;
import java.nio.ByteBuffer;

public class UserBox extends fr
{

    public static final String TYPE = "uuid";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    byte data[];

    public UserBox(byte abyte0[])
    {
        super("uuid", abyte0);
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("UserBox.java", com/coremedia/iso/boxes/UserBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.UserBox", "", "", "", "java.lang.String"), 40);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "getData", "com.coremedia.iso.boxes.UserBox", "", "", "", "[B"), 47);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "setData", "com.coremedia.iso.boxes.UserBox", "[B", "data", "", "void"), 51);
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
        akp akp = akN.a(ajc$tjp_1, this);
        fx.a();
        fx.a(akp);
        return data;
    }

    public void setData(byte abyte0[])
    {
        akp akp = akN.a(ajc$tjp_2, this, abyte0);
        fx.a();
        fx.a(akp);
        data = abyte0;
    }

    public String toString()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return (new StringBuilder("UserBox[type=")).append(getType()).append(";userType=").append(new String(getUserType())).append(";contentLength=").append(data.length).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
