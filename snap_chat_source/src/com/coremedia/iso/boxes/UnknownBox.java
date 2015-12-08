// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akN;
import fr;
import fx;
import java.nio.ByteBuffer;

public class UnknownBox extends fr
{

    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    ByteBuffer data;

    public UnknownBox(String s)
    {
        super(s);
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("UnknownBox.java", com/coremedia/iso/boxes/UnknownBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getData", "com.coremedia.iso.boxes.UnknownBox", "", "", "", "java.nio.ByteBuffer"), 52);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "setData", "com.coremedia.iso.boxes.UnknownBox", "java.nio.ByteBuffer", "data", "", "void"), 56);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        data = bytebuffer;
        bytebuffer.position(bytebuffer.position() + bytebuffer.remaining());
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        data.rewind();
        bytebuffer.put(data);
    }

    protected long getContentSize()
    {
        return (long)data.limit();
    }

    public ByteBuffer getData()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return data;
    }

    public void setData(ByteBuffer bytebuffer)
    {
        akp akp = akN.a(ajc$tjp_1, this, bytebuffer);
        fx.a();
        fx.a(akp);
        data = bytebuffer;
    }

    static 
    {
        ajc$preClinit();
    }
}
