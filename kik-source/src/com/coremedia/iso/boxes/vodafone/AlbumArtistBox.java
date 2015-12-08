// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.vodafone;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.b.b;

public class AlbumArtistBox extends AbstractFullBox
{

    public static final String TYPE = "albr";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private String albumArtist;
    private String language;

    public AlbumArtistBox()
    {
        super("albr");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("AlbumArtistBox.java", com/coremedia/iso/boxes/vodafone/AlbumArtistBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getLanguage", "com.coremedia.iso.boxes.vodafone.AlbumArtistBox", "", "", "", "java.lang.String"), 42);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "getAlbumArtist", "com.coremedia.iso.boxes.vodafone.AlbumArtistBox", "", "", "", "java.lang.String"), 46);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "setLanguage", "com.coremedia.iso.boxes.vodafone.AlbumArtistBox", "java.lang.String", "language", "", "void"), 50);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setAlbumArtist", "com.coremedia.iso.boxes.vodafone.AlbumArtistBox", "java.lang.String", "albumArtist", "", "void"), 54);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "toString", "com.coremedia.iso.boxes.vodafone.AlbumArtistBox", "", "", "", "java.lang.String"), 76);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        language = IsoTypeReader.readIso639(bytebuffer);
        albumArtist = IsoTypeReader.readString(bytebuffer);
    }

    public String getAlbumArtist()
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return albumArtist;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeIso639(bytebuffer, language);
        bytebuffer.put(Utf8.convert(albumArtist));
        bytebuffer.put((byte)0);
    }

    protected long getContentSize()
    {
        return (long)(Utf8.utf8StringLengthInBytes(albumArtist) + 6 + 1);
    }

    public String getLanguage()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return language;
    }

    public void setAlbumArtist(String s)
    {
        org.b.a.a a = b.a(ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a);
        albumArtist = s;
    }

    public void setLanguage(String s)
    {
        org.b.a.a a = b.a(ajc$tjp_2, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a);
        language = s;
    }

    public String toString()
    {
        org.b.a.a a = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return (new StringBuilder("AlbumArtistBox[language=")).append(getLanguage()).append(";albumArtist=").append(getAlbumArtist()).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
