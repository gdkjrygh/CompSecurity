// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.b.b;

public class DataEntryUrnBox extends AbstractFullBox
{

    public static final String TYPE = "urn ";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private String location;
    private String name;

    public DataEntryUrnBox()
    {
        super("urn ");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("DataEntryUrnBox.java", com/coremedia/iso/boxes/DataEntryUrnBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getName", "com.coremedia.iso.boxes.DataEntryUrnBox", "", "", "", "java.lang.String"), 40);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "getLocation", "com.coremedia.iso.boxes.DataEntryUrnBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "toString", "com.coremedia.iso.boxes.DataEntryUrnBox", "", "", "", "java.lang.String"), 67);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        name = IsoTypeReader.readString(bytebuffer);
        location = IsoTypeReader.readString(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        bytebuffer.put(Utf8.convert(name));
        bytebuffer.put((byte)0);
        bytebuffer.put(Utf8.convert(location));
        bytebuffer.put((byte)0);
    }

    protected long getContentSize()
    {
        return (long)(Utf8.utf8StringLengthInBytes(name) + 1 + Utf8.utf8StringLengthInBytes(location) + 1);
    }

    public String getLocation()
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return location;
    }

    public String getName()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return name;
    }

    public String toString()
    {
        org.b.a.a a = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return (new StringBuilder("DataEntryUrlBox[name=")).append(getName()).append(";location=").append(getLocation()).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
