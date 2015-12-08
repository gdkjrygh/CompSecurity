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

public class DescriptionBox extends ft
{

    public static final String TYPE = "dscp";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private static final akp.a ajc$tjp_3;
    private static final akp.a ajc$tjp_4;
    private String description;
    private String language;

    public DescriptionBox()
    {
        super("dscp");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("DescriptionBox.java", com/coremedia/iso/boxes/DescriptionBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getLanguage", "com.coremedia.iso.boxes.DescriptionBox", "", "", "", "java.lang.String"), 40);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "getDescription", "com.coremedia.iso.boxes.DescriptionBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.DescriptionBox", "", "", "", "java.lang.String"), 67);
        ajc$tjp_3 = akn.a("method-execution", akn.a("1", "setLanguage", "com.coremedia.iso.boxes.DescriptionBox", "java.lang.String", "language", "", "void"), 71);
        ajc$tjp_4 = akn.a("method-execution", akn.a("1", "setDescription", "com.coremedia.iso.boxes.DescriptionBox", "java.lang.String", "description", "", "void"), 75);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        language = cv.j(bytebuffer);
        description = cv.e(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        cx.a(bytebuffer, language);
        bytebuffer.put(cA.a(description));
        bytebuffer.put((byte)0);
    }

    protected long getContentSize()
    {
        return (long)(cA.b(description) + 7);
    }

    public String getDescription()
    {
        akp akp = akN.a(ajc$tjp_1, this);
        fx.a();
        fx.a(akp);
        return description;
    }

    public String getLanguage()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return language;
    }

    public void setDescription(String s)
    {
        akp akp = akN.a(ajc$tjp_4, this, s);
        fx.a();
        fx.a(akp);
        description = s;
    }

    public void setLanguage(String s)
    {
        akp akp = akN.a(ajc$tjp_3, this, s);
        fx.a();
        fx.a(akp);
        language = s;
    }

    public String toString()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        return (new StringBuilder("DescriptionBox[language=")).append(getLanguage()).append(";description=").append(getDescription()).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
