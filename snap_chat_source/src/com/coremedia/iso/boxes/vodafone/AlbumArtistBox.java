// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.vodafone;

import akN;
import cA;
import cv;
import cx;
import ft;
import fx;
import java.nio.ByteBuffer;

public class AlbumArtistBox extends ft
{

    public static final String TYPE = "albr";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private static final akp.a ajc$tjp_3;
    private static final akp.a ajc$tjp_4;
    private String albumArtist;
    private String language;

    public AlbumArtistBox()
    {
        super("albr");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("AlbumArtistBox.java", com/coremedia/iso/boxes/vodafone/AlbumArtistBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getLanguage", "com.coremedia.iso.boxes.vodafone.AlbumArtistBox", "", "", "", "java.lang.String"), 42);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "getAlbumArtist", "com.coremedia.iso.boxes.vodafone.AlbumArtistBox", "", "", "", "java.lang.String"), 46);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "setLanguage", "com.coremedia.iso.boxes.vodafone.AlbumArtistBox", "java.lang.String", "language", "", "void"), 50);
        ajc$tjp_3 = akn.a("method-execution", akn.a("1", "setAlbumArtist", "com.coremedia.iso.boxes.vodafone.AlbumArtistBox", "java.lang.String", "albumArtist", "", "void"), 54);
        ajc$tjp_4 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.vodafone.AlbumArtistBox", "", "", "", "java.lang.String"), 76);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        language = cv.j(bytebuffer);
        albumArtist = cv.e(bytebuffer);
    }

    public String getAlbumArtist()
    {
        akp akp = akN.a(ajc$tjp_1, this);
        fx.a();
        fx.a(akp);
        return albumArtist;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        cx.a(bytebuffer, language);
        bytebuffer.put(cA.a(albumArtist));
        bytebuffer.put((byte)0);
    }

    protected long getContentSize()
    {
        return (long)(cA.b(albumArtist) + 6 + 1);
    }

    public String getLanguage()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return language;
    }

    public void setAlbumArtist(String s)
    {
        akp akp = akN.a(ajc$tjp_3, this, s);
        fx.a();
        fx.a(akp);
        albumArtist = s;
    }

    public void setLanguage(String s)
    {
        akp akp = akN.a(ajc$tjp_2, this, s);
        fx.a();
        fx.a(akp);
        language = s;
    }

    public String toString()
    {
        akp akp = akN.a(ajc$tjp_4, this);
        fx.a();
        fx.a(akp);
        return (new StringBuilder("AlbumArtistBox[language=")).append(getLanguage()).append(";albumArtist=").append(getAlbumArtist()).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
