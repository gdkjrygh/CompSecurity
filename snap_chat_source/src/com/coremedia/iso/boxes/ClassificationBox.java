// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akL;
import akN;
import cA;
import cu;
import cv;
import cx;
import ft;
import fx;
import java.nio.ByteBuffer;

public class ClassificationBox extends ft
{

    public static final String TYPE = "clsf";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private static final akp.a ajc$tjp_3;
    private static final akp.a ajc$tjp_4;
    private static final akp.a ajc$tjp_5;
    private static final akp.a ajc$tjp_6;
    private static final akp.a ajc$tjp_7;
    private static final akp.a ajc$tjp_8;
    private String classificationEntity;
    private String classificationInfo;
    private int classificationTableIndex;
    private String language;

    public ClassificationBox()
    {
        super("clsf");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("ClassificationBox.java", com/coremedia/iso/boxes/ClassificationBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getLanguage", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "getClassificationEntity", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 48);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "getClassificationTableIndex", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "int"), 52);
        ajc$tjp_3 = akn.a("method-execution", akn.a("1", "getClassificationInfo", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 56);
        ajc$tjp_4 = akn.a("method-execution", akn.a("1", "setClassificationEntity", "com.coremedia.iso.boxes.ClassificationBox", "java.lang.String", "classificationEntity", "", "void"), 60);
        ajc$tjp_5 = akn.a("method-execution", akn.a("1", "setClassificationTableIndex", "com.coremedia.iso.boxes.ClassificationBox", "int", "classificationTableIndex", "", "void"), 64);
        ajc$tjp_6 = akn.a("method-execution", akn.a("1", "setLanguage", "com.coremedia.iso.boxes.ClassificationBox", "java.lang.String", "language", "", "void"), 68);
        ajc$tjp_7 = akn.a("method-execution", akn.a("1", "setClassificationInfo", "com.coremedia.iso.boxes.ClassificationBox", "java.lang.String", "classificationInfo", "", "void"), 72);
        ajc$tjp_8 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 101);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        byte abyte0[] = new byte[4];
        bytebuffer.get(abyte0);
        classificationEntity = cu.a(abyte0);
        classificationTableIndex = cv.c(bytebuffer);
        language = cv.j(bytebuffer);
        classificationInfo = cv.e(bytebuffer);
    }

    public String getClassificationEntity()
    {
        akp akp = akN.a(ajc$tjp_1, this);
        fx.a();
        fx.a(akp);
        return classificationEntity;
    }

    public String getClassificationInfo()
    {
        akp akp = akN.a(ajc$tjp_3, this);
        fx.a();
        fx.a(akp);
        return classificationInfo;
    }

    public int getClassificationTableIndex()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        return classificationTableIndex;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        bytebuffer.put(cu.a(classificationEntity));
        cx.b(bytebuffer, classificationTableIndex);
        cx.a(bytebuffer, language);
        bytebuffer.put(cA.a(classificationInfo));
        bytebuffer.put((byte)0);
    }

    protected long getContentSize()
    {
        return (long)(cA.b(classificationInfo) + 8 + 1);
    }

    public String getLanguage()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return language;
    }

    public void setClassificationEntity(String s)
    {
        akp akp = akN.a(ajc$tjp_4, this, s);
        fx.a();
        fx.a(akp);
        classificationEntity = s;
    }

    public void setClassificationInfo(String s)
    {
        akp akp = akN.a(ajc$tjp_7, this, s);
        fx.a();
        fx.a(akp);
        classificationInfo = s;
    }

    public void setClassificationTableIndex(int i)
    {
        akp akp = akN.a(ajc$tjp_5, this, akL.a(i));
        fx.a();
        fx.a(akp);
        classificationTableIndex = i;
    }

    public void setLanguage(String s)
    {
        akp akp = akN.a(ajc$tjp_6, this, s);
        fx.a();
        fx.a(akp);
        language = s;
    }

    public String toString()
    {
        Object obj = akN.a(ajc$tjp_8, this);
        fx.a();
        fx.a(((akp) (obj)));
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("ClassificationBox[language=").append(getLanguage());
        ((StringBuilder) (obj)).append("classificationEntity=").append(getClassificationEntity());
        ((StringBuilder) (obj)).append(";classificationTableIndex=").append(getClassificationTableIndex());
        ((StringBuilder) (obj)).append(";language=").append(getLanguage());
        ((StringBuilder) (obj)).append(";classificationInfo=").append(getClassificationInfo());
        ((StringBuilder) (obj)).append("]");
        return ((StringBuilder) (obj)).toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
