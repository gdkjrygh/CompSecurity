// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.b.b;

public class DataEntryUrlBox extends AbstractFullBox
{

    public static final String TYPE = "url ";
    private static final org.b.a.a.a ajc$tjp_0;

    public DataEntryUrlBox()
    {
        super("url ");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("DataEntryUrlBox.java", com/coremedia/iso/boxes/DataEntryUrlBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "toString", "com.coremedia.iso.boxes.DataEntryUrlBox", "", "", "", "java.lang.String"), 51);
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
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return "DataEntryUrlBox[]";
    }

    static 
    {
        ajc$preClinit();
    }
}
