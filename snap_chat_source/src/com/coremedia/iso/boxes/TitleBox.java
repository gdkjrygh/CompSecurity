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

public class TitleBox extends ft
{

    public static final String TYPE = "titl";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private static final akp.a ajc$tjp_3;
    private static final akp.a ajc$tjp_4;
    private String language;
    private String title;

    public TitleBox()
    {
        super("titl");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("TitleBox.java", com/coremedia/iso/boxes/TitleBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getLanguage", "com.coremedia.iso.boxes.TitleBox", "", "", "", "java.lang.String"), 46);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "getTitle", "com.coremedia.iso.boxes.TitleBox", "", "", "", "java.lang.String"), 50);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "setLanguage", "com.coremedia.iso.boxes.TitleBox", "java.lang.String", "language", "", "void"), 59);
        ajc$tjp_3 = akn.a("method-execution", akn.a("1", "setTitle", "com.coremedia.iso.boxes.TitleBox", "java.lang.String", "title", "", "void"), 63);
        ajc$tjp_4 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.TitleBox", "", "", "", "java.lang.String"), 86);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        language = cv.j(bytebuffer);
        title = cv.e(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        cx.a(bytebuffer, language);
        bytebuffer.put(cA.a(title));
        bytebuffer.put((byte)0);
    }

    protected long getContentSize()
    {
        return (long)(cA.b(title) + 7);
    }

    public String getLanguage()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return language;
    }

    public String getTitle()
    {
        akp akp = akN.a(ajc$tjp_1, this);
        fx.a();
        fx.a(akp);
        return title;
    }

    public void setLanguage(String s)
    {
        akp akp = akN.a(ajc$tjp_2, this, s);
        fx.a();
        fx.a(akp);
        language = s;
    }

    public void setTitle(String s)
    {
        akp akp = akN.a(ajc$tjp_3, this, s);
        fx.a();
        fx.a(akp);
        title = s;
    }

    public String toString()
    {
        akp akp = akN.a(ajc$tjp_4, this);
        fx.a();
        fx.a(akp);
        return (new StringBuilder("TitleBox[language=")).append(getLanguage()).append(";title=").append(getTitle()).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
