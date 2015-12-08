// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akN;
import fr;
import fx;
import java.nio.ByteBuffer;

public class FreeSpaceBox extends fr
{

    public static final String TYPE = "skip";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    byte data[];

    public FreeSpaceBox()
    {
        super("skip");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("FreeSpaceBox.java", com/coremedia/iso/boxes/FreeSpaceBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "setData", "com.coremedia.iso.boxes.FreeSpaceBox", "[B", "data", "", "void"), 42);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "getData", "com.coremedia.iso.boxes.FreeSpaceBox", "", "", "", "[B"), 46);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.FreeSpaceBox", "", "", "", "java.lang.String"), 61);
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
        akp akp = akN.a(ajc$tjp_0, this, abyte0);
        fx.a();
        fx.a(akp);
        data = abyte0;
    }

    public String toString()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        return (new StringBuilder("FreeSpaceBox[size=")).append(data.length).append(";type=").append(getType()).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
