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

public class TitleBox extends AbstractFullBox
{

    public static final String TYPE = "titl";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private String language;
    private String title;

    public TitleBox()
    {
        super("titl");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("TitleBox.java", com/coremedia/iso/boxes/TitleBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getLanguage", "com.coremedia.iso.boxes.TitleBox", "", "", "", "java.lang.String"), 46);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "getTitle", "com.coremedia.iso.boxes.TitleBox", "", "", "", "java.lang.String"), 50);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "setLanguage", "com.coremedia.iso.boxes.TitleBox", "java.lang.String", "language", "", "void"), 59);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setTitle", "com.coremedia.iso.boxes.TitleBox", "java.lang.String", "title", "", "void"), 63);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "toString", "com.coremedia.iso.boxes.TitleBox", "", "", "", "java.lang.String"), 86);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        language = IsoTypeReader.readIso639(bytebuffer);
        title = IsoTypeReader.readString(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeIso639(bytebuffer, language);
        bytebuffer.put(Utf8.convert(title));
        bytebuffer.put((byte)0);
    }

    protected long getContentSize()
    {
        return (long)(Utf8.utf8StringLengthInBytes(title) + 7);
    }

    public String getLanguage()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return language;
    }

    public String getTitle()
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return title;
    }

    public void setLanguage(String s)
    {
        org.b.a.a a = b.a(ajc$tjp_2, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a);
        language = s;
    }

    public void setTitle(String s)
    {
        org.b.a.a a = b.a(ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a);
        title = s;
    }

    public String toString()
    {
        org.b.a.a a = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return (new StringBuilder("TitleBox[language=")).append(getLanguage()).append(";title=").append(getTitle()).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
