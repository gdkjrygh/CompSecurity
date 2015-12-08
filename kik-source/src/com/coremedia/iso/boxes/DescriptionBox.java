// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.b.b;

public class DescriptionBox extends AbstractFullBox
{

    public static final String TYPE = "dscp";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private String description;
    private String language;

    public DescriptionBox()
    {
        super("dscp");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("DescriptionBox.java", com/coremedia/iso/boxes/DescriptionBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getLanguage", "com.coremedia.iso.boxes.DescriptionBox", "", "", "", "java.lang.String"), 40);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "getDescription", "com.coremedia.iso.boxes.DescriptionBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "toString", "com.coremedia.iso.boxes.DescriptionBox", "", "", "", "java.lang.String"), 67);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setLanguage", "com.coremedia.iso.boxes.DescriptionBox", "java.lang.String", "language", "", "void"), 71);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "setDescription", "com.coremedia.iso.boxes.DescriptionBox", "java.lang.String", "description", "", "void"), 75);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        language = IsoTypeReader.readIso639(bytebuffer);
        description = IsoTypeReader.readString(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeIso639(bytebuffer, language);
        bytebuffer.put(Utf8.convert(description));
        bytebuffer.put((byte)0);
    }

    protected long getContentSize()
    {
        return (long)(Utf8.utf8StringLengthInBytes(description) + 7);
    }

    public String getDescription()
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return description;
    }

    public String getLanguage()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return language;
    }

    public void setDescription(String s)
    {
        org.b.a.a a = b.a(ajc$tjp_4, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a);
        description = s;
    }

    public void setLanguage(String s)
    {
        org.b.a.a a = b.a(ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a);
        language = s;
    }

    public String toString()
    {
        org.b.a.a a = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return (new StringBuilder("DescriptionBox[language=")).append(getLanguage()).append(";description=").append(getDescription()).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
