// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akN;
import cA;
import cv;
import cx;
import ft;
import fx;
import java.nio.ByteBuffer;

public class GenreBox extends ft
{

    public static final String TYPE = "gnre";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private static final akp.a ajc$tjp_3;
    private static final akp.a ajc$tjp_4;
    private String genre;
    private String language;

    public GenreBox()
    {
        super("gnre");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("GenreBox.java", com/coremedia/iso/boxes/GenreBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getLanguage", "com.coremedia.iso.boxes.GenreBox", "", "", "", "java.lang.String"), 42);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "getGenre", "com.coremedia.iso.boxes.GenreBox", "", "", "", "java.lang.String"), 46);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "setLanguage", "com.coremedia.iso.boxes.GenreBox", "java.lang.String", "language", "", "void"), 50);
        ajc$tjp_3 = akn.a("method-execution", akn.a("1", "setGenre", "com.coremedia.iso.boxes.GenreBox", "java.lang.String", "genre", "", "void"), 54);
        ajc$tjp_4 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.GenreBox", "", "", "", "java.lang.String"), 77);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        language = cv.j(bytebuffer);
        genre = cv.e(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        cx.a(bytebuffer, language);
        bytebuffer.put(cA.a(genre));
        bytebuffer.put((byte)0);
    }

    protected long getContentSize()
    {
        return (long)(cA.b(genre) + 7);
    }

    public String getGenre()
    {
        akp akp = akN.a(ajc$tjp_1, this);
        fx.a();
        fx.a(akp);
        return genre;
    }

    public String getLanguage()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return language;
    }

    public void setGenre(String s)
    {
        akp akp = akN.a(ajc$tjp_3, this, s);
        fx.a();
        fx.a(akp);
        genre = s;
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
        return (new StringBuilder("GenreBox[language=")).append(getLanguage()).append(";genre=").append(getGenre()).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
