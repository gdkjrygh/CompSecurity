// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akN;
import cA;
import cu;
import cv;
import cx;
import ft;
import fx;
import java.nio.ByteBuffer;

public class RatingBox extends ft
{

    public static final String TYPE = "rtng";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private static final akp.a ajc$tjp_3;
    private static final akp.a ajc$tjp_4;
    private static final akp.a ajc$tjp_5;
    private static final akp.a ajc$tjp_6;
    private static final akp.a ajc$tjp_7;
    private static final akp.a ajc$tjp_8;
    private String language;
    private String ratingCriteria;
    private String ratingEntity;
    private String ratingInfo;

    public RatingBox()
    {
        super("rtng");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("RatingBox.java", com/coremedia/iso/boxes/RatingBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "setRatingEntity", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "ratingEntity", "", "void"), 46);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "setRatingCriteria", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "ratingCriteria", "", "void"), 50);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "setLanguage", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "language", "", "void"), 54);
        ajc$tjp_3 = akn.a("method-execution", akn.a("1", "setRatingInfo", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "ratingInfo", "", "void"), 58);
        ajc$tjp_4 = akn.a("method-execution", akn.a("1", "getLanguage", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 62);
        ajc$tjp_5 = akn.a("method-execution", akn.a("1", "getRatingEntity", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 73);
        ajc$tjp_6 = akn.a("method-execution", akn.a("1", "getRatingCriteria", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 83);
        ajc$tjp_7 = akn.a("method-execution", akn.a("1", "getRatingInfo", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 87);
        ajc$tjp_8 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 115);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        ratingEntity = cv.k(bytebuffer);
        ratingCriteria = cv.k(bytebuffer);
        language = cv.j(bytebuffer);
        ratingInfo = cv.e(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        bytebuffer.put(cu.a(ratingEntity));
        bytebuffer.put(cu.a(ratingCriteria));
        cx.a(bytebuffer, language);
        bytebuffer.put(cA.a(ratingInfo));
        bytebuffer.put((byte)0);
    }

    protected long getContentSize()
    {
        return (long)(cA.b(ratingInfo) + 15);
    }

    public String getLanguage()
    {
        akp akp = akN.a(ajc$tjp_4, this);
        fx.a();
        fx.a(akp);
        return language;
    }

    public String getRatingCriteria()
    {
        akp akp = akN.a(ajc$tjp_6, this);
        fx.a();
        fx.a(akp);
        return ratingCriteria;
    }

    public String getRatingEntity()
    {
        akp akp = akN.a(ajc$tjp_5, this);
        fx.a();
        fx.a(akp);
        return ratingEntity;
    }

    public String getRatingInfo()
    {
        akp akp = akN.a(ajc$tjp_7, this);
        fx.a();
        fx.a(akp);
        return ratingInfo;
    }

    public void setLanguage(String s)
    {
        akp akp = akN.a(ajc$tjp_2, this, s);
        fx.a();
        fx.a(akp);
        language = s;
    }

    public void setRatingCriteria(String s)
    {
        akp akp = akN.a(ajc$tjp_1, this, s);
        fx.a();
        fx.a(akp);
        ratingCriteria = s;
    }

    public void setRatingEntity(String s)
    {
        akp akp = akN.a(ajc$tjp_0, this, s);
        fx.a();
        fx.a(akp);
        ratingEntity = s;
    }

    public void setRatingInfo(String s)
    {
        akp akp = akN.a(ajc$tjp_3, this, s);
        fx.a();
        fx.a(akp);
        ratingInfo = s;
    }

    public String toString()
    {
        Object obj = akN.a(ajc$tjp_8, this);
        fx.a();
        fx.a(((akp) (obj)));
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("RatingBox[language=").append(getLanguage());
        ((StringBuilder) (obj)).append("ratingEntity=").append(getRatingEntity());
        ((StringBuilder) (obj)).append(";ratingCriteria=").append(getRatingCriteria());
        ((StringBuilder) (obj)).append(";language=").append(getLanguage());
        ((StringBuilder) (obj)).append(";ratingInfo=").append(getRatingInfo());
        ((StringBuilder) (obj)).append("]");
        return ((StringBuilder) (obj)).toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
