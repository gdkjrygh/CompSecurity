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
import org.b.b.a.a;
import org.b.b.b.b;

public class AlbumBox extends AbstractFullBox
{

    public static final String TYPE = "albm";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    private String albumTitle;
    private String language;
    private int trackNumber;

    public AlbumBox()
    {
        super("albm");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("AlbumBox.java", com/coremedia/iso/boxes/AlbumBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getLanguage", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "java.lang.String"), 51);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "getAlbumTitle", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "java.lang.String"), 55);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getTrackNumber", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "int"), 59);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setLanguage", "com.coremedia.iso.boxes.AlbumBox", "java.lang.String", "language", "", "void"), 63);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "setAlbumTitle", "com.coremedia.iso.boxes.AlbumBox", "java.lang.String", "albumTitle", "", "void"), 67);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "setTrackNumber", "com.coremedia.iso.boxes.AlbumBox", "int", "trackNumber", "", "void"), 71);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "toString", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "java.lang.String"), 103);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        language = IsoTypeReader.readIso639(bytebuffer);
        albumTitle = IsoTypeReader.readString(bytebuffer);
        if (bytebuffer.remaining() > 0)
        {
            trackNumber = IsoTypeReader.readUInt8(bytebuffer);
            return;
        } else
        {
            trackNumber = -1;
            return;
        }
    }

    public String getAlbumTitle()
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return albumTitle;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeIso639(bytebuffer, language);
        bytebuffer.put(Utf8.convert(albumTitle));
        bytebuffer.put((byte)0);
        if (trackNumber != -1)
        {
            IsoTypeWriter.writeUInt8(bytebuffer, trackNumber);
        }
    }

    protected long getContentSize()
    {
        int j = Utf8.utf8StringLengthInBytes(albumTitle);
        int i;
        if (trackNumber == -1)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        return (long)(i + (j + 6 + 1));
    }

    public String getLanguage()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return language;
    }

    public int getTrackNumber()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return trackNumber;
    }

    public void setAlbumTitle(String s)
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a1);
        albumTitle = s;
    }

    public void setLanguage(String s)
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a1);
        language = s;
    }

    public void setTrackNumber(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        trackNumber = i;
    }

    public String toString()
    {
        Object obj = b.a(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(((org.b.a.a) (obj)));
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("AlbumBox[language=").append(getLanguage()).append(";");
        ((StringBuilder) (obj)).append("albumTitle=").append(getAlbumTitle());
        if (trackNumber >= 0)
        {
            ((StringBuilder) (obj)).append(";trackNumber=").append(getTrackNumber());
        }
        ((StringBuilder) (obj)).append("]");
        return ((StringBuilder) (obj)).toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
