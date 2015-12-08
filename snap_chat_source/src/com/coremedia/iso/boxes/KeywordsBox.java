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

public class KeywordsBox extends ft
{

    public static final String TYPE = "kywd";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private static final akp.a ajc$tjp_3;
    private static final akp.a ajc$tjp_4;
    private String keywords[];
    private String language;

    public KeywordsBox()
    {
        super("kywd");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("KeywordsBox.java", com/coremedia/iso/boxes/KeywordsBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getLanguage", "com.coremedia.iso.boxes.KeywordsBox", "", "", "", "java.lang.String"), 40);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "getKeywords", "com.coremedia.iso.boxes.KeywordsBox", "", "", "", "[Ljava.lang.String;"), 44);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "setLanguage", "com.coremedia.iso.boxes.KeywordsBox", "java.lang.String", "language", "", "void"), 48);
        ajc$tjp_3 = akn.a("method-execution", akn.a("1", "setKeywords", "com.coremedia.iso.boxes.KeywordsBox", "[Ljava.lang.String;", "keywords", "", "void"), 52);
        ajc$tjp_4 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.KeywordsBox", "", "", "", "java.lang.String"), 87);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        language = cv.j(bytebuffer);
        int j = cv.d(bytebuffer);
        keywords = new String[j];
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            cv.d(bytebuffer);
            keywords[i] = cv.e(bytebuffer);
            i++;
        } while (true);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        cx.a(bytebuffer, language);
        cx.c(bytebuffer, keywords.length);
        String as[] = keywords;
        int j = as.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            String s = as[i];
            cx.c(bytebuffer, cA.b(s) + 1);
            bytebuffer.put(cA.a(s));
            i++;
        } while (true);
    }

    protected long getContentSize()
    {
        long l = 7L;
        String as[] = keywords;
        int j = as.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return l;
            }
            l += cA.b(as[i]) + 1 + 1;
            i++;
        } while (true);
    }

    public String[] getKeywords()
    {
        akp akp = akN.a(ajc$tjp_1, this);
        fx.a();
        fx.a(akp);
        return keywords;
    }

    public String getLanguage()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return language;
    }

    public void setKeywords(String as[])
    {
        akp akp = akN.a(ajc$tjp_3, this, as);
        fx.a();
        fx.a(akp);
        keywords = as;
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
        Object obj = akN.a(ajc$tjp_4, this);
        fx.a();
        fx.a(((akp) (obj)));
        obj = new StringBuffer();
        ((StringBuffer) (obj)).append("KeywordsBox[language=").append(getLanguage());
        int i = 0;
        do
        {
            if (i >= keywords.length)
            {
                ((StringBuffer) (obj)).append("]");
                return ((StringBuffer) (obj)).toString();
            }
            ((StringBuffer) (obj)).append(";keyword").append(i).append("=").append(keywords[i]);
            i++;
        } while (true);
    }

    static 
    {
        ajc$preClinit();
    }
}
