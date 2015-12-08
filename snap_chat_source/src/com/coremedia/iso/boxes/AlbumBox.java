// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akL;
import akN;
import cA;
import cv;
import cx;
import ft;
import fx;
import java.nio.ByteBuffer;

public class AlbumBox extends ft
{

    public static final String TYPE = "albm";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private static final akp.a ajc$tjp_3;
    private static final akp.a ajc$tjp_4;
    private static final akp.a ajc$tjp_5;
    private static final akp.a ajc$tjp_6;
    private String albumTitle;
    private String language;
    private int trackNumber;

    public AlbumBox()
    {
        super("albm");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("AlbumBox.java", com/coremedia/iso/boxes/AlbumBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getLanguage", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "java.lang.String"), 51);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "getAlbumTitle", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "java.lang.String"), 55);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "getTrackNumber", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "int"), 59);
        ajc$tjp_3 = akn.a("method-execution", akn.a("1", "setLanguage", "com.coremedia.iso.boxes.AlbumBox", "java.lang.String", "language", "", "void"), 63);
        ajc$tjp_4 = akn.a("method-execution", akn.a("1", "setAlbumTitle", "com.coremedia.iso.boxes.AlbumBox", "java.lang.String", "albumTitle", "", "void"), 67);
        ajc$tjp_5 = akn.a("method-execution", akn.a("1", "setTrackNumber", "com.coremedia.iso.boxes.AlbumBox", "int", "trackNumber", "", "void"), 71);
        ajc$tjp_6 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "java.lang.String"), 103);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        language = cv.j(bytebuffer);
        albumTitle = cv.e(bytebuffer);
        if (bytebuffer.remaining() > 0)
        {
            trackNumber = cv.d(bytebuffer);
            return;
        } else
        {
            trackNumber = -1;
            return;
        }
    }

    public String getAlbumTitle()
    {
        akp akp = akN.a(ajc$tjp_1, this);
        fx.a();
        fx.a(akp);
        return albumTitle;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        cx.a(bytebuffer, language);
        bytebuffer.put(cA.a(albumTitle));
        bytebuffer.put((byte)0);
        if (trackNumber != -1)
        {
            cx.c(bytebuffer, trackNumber);
        }
    }

    protected long getContentSize()
    {
        int j = cA.b(albumTitle);
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
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return language;
    }

    public int getTrackNumber()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        return trackNumber;
    }

    public void setAlbumTitle(String s)
    {
        akp akp = akN.a(ajc$tjp_4, this, s);
        fx.a();
        fx.a(akp);
        albumTitle = s;
    }

    public void setLanguage(String s)
    {
        akp akp = akN.a(ajc$tjp_3, this, s);
        fx.a();
        fx.a(akp);
        language = s;
    }

    public void setTrackNumber(int i)
    {
        akp akp = akN.a(ajc$tjp_5, this, akL.a(i));
        fx.a();
        fx.a(akp);
        trackNumber = i;
    }

    public String toString()
    {
        Object obj = akN.a(ajc$tjp_6, this);
        fx.a();
        fx.a(((akp) (obj)));
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
