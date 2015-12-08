// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akN;
import ft;
import fx;
import java.nio.ByteBuffer;

public class DataEntryUrlBox extends ft
{

    public static final String TYPE = "url ";
    private static final akp.a ajc$tjp_0;

    public DataEntryUrlBox()
    {
        super("url ");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("DataEntryUrlBox.java", com/coremedia/iso/boxes/DataEntryUrlBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.DataEntryUrlBox", "", "", "", "java.lang.String"), 51);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
    }

    protected long getContentSize()
    {
        return 4L;
    }

    public String toString()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return "DataEntryUrlBox[]";
    }

    static 
    {
        ajc$preClinit();
    }
}
