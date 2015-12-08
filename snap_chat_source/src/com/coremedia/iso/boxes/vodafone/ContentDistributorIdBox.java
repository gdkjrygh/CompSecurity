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

public class ContentDistributorIdBox extends ft
{

    public static final String TYPE = "cdis";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private String contentDistributorId;
    private String language;

    public ContentDistributorIdBox()
    {
        super("cdis");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("ContentDistributorIdBox.java", com/coremedia/iso/boxes/vodafone/ContentDistributorIdBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getLanguage", "com.coremedia.iso.boxes.vodafone.ContentDistributorIdBox", "", "", "", "java.lang.String"), 40);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "getContentDistributorId", "com.coremedia.iso.boxes.vodafone.ContentDistributorIdBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.vodafone.ContentDistributorIdBox", "", "", "", "java.lang.String"), 68);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        language = cv.j(bytebuffer);
        contentDistributorId = cv.e(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        cx.a(bytebuffer, language);
        bytebuffer.put(cA.a(contentDistributorId));
        bytebuffer.put((byte)0);
    }

    public String getContentDistributorId()
    {
        akp akp = akN.a(ajc$tjp_1, this);
        fx.a();
        fx.a(akp);
        return contentDistributorId;
    }

    protected long getContentSize()
    {
        return (long)(cA.b(contentDistributorId) + 2 + 5);
    }

    public String getLanguage()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return language;
    }

    public String toString()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        return (new StringBuilder("ContentDistributorIdBox[language=")).append(getLanguage()).append(";contentDistributorId=").append(getContentDistributorId()).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
