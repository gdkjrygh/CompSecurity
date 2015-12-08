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

public class SchemeTypeBox extends ft
{

    static final boolean $assertionsDisabled;
    public static final String TYPE = "schm";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private static final akp.a ajc$tjp_3;
    private static final akp.a ajc$tjp_4;
    private static final akp.a ajc$tjp_5;
    private static final akp.a ajc$tjp_6;
    String schemeType;
    String schemeUri;
    long schemeVersion;

    public SchemeTypeBox()
    {
        super("schm");
        schemeType = "    ";
        schemeUri = null;
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("SchemeTypeBox.java", com/coremedia/iso/boxes/SchemeTypeBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getSchemeType", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "getSchemeVersion", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "long"), 48);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "getSchemeUri", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"), 52);
        ajc$tjp_3 = akn.a("method-execution", akn.a("1", "setSchemeType", "com.coremedia.iso.boxes.SchemeTypeBox", "java.lang.String", "schemeType", "", "void"), 56);
        ajc$tjp_4 = akn.a("method-execution", akn.a("1", "setSchemeVersion", "com.coremedia.iso.boxes.SchemeTypeBox", "int", "schemeVersion", "", "void"), 61);
        ajc$tjp_5 = akn.a("method-execution", akn.a("1", "setSchemeUri", "com.coremedia.iso.boxes.SchemeTypeBox", "java.lang.String", "schemeUri", "", "void"), 65);
        ajc$tjp_6 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"), 93);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        schemeType = cv.k(bytebuffer);
        schemeVersion = cv.a(bytebuffer);
        if ((getFlags() & 1) == 1)
        {
            schemeUri = cv.e(bytebuffer);
        }
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        bytebuffer.put(cu.a(schemeType));
        cx.b(bytebuffer, schemeVersion);
        if ((getFlags() & 1) == 1)
        {
            bytebuffer.put(cA.a(schemeUri));
        }
    }

    protected long getContentSize()
    {
        int i;
        if ((getFlags() & 1) == 1)
        {
            i = cA.b(schemeUri) + 1;
        } else
        {
            i = 0;
        }
        return (long)(i + 12);
    }

    public String getSchemeType()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return schemeType;
    }

    public String getSchemeUri()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        return schemeUri;
    }

    public long getSchemeVersion()
    {
        akp akp = akN.a(ajc$tjp_1, this);
        fx.a();
        fx.a(akp);
        return schemeVersion;
    }

    public void setSchemeType(String s)
    {
        akp akp = akN.a(ajc$tjp_3, this, s);
        fx.a();
        fx.a(akp);
        if (!$assertionsDisabled && (s == null || s.length() != 4))
        {
            throw new AssertionError("SchemeType may not be null or not 4 bytes long");
        } else
        {
            schemeType = s;
            return;
        }
    }

    public void setSchemeUri(String s)
    {
        akp akp = akN.a(ajc$tjp_5, this, s);
        fx.a();
        fx.a(akp);
        schemeUri = s;
    }

    public void setSchemeVersion(int i)
    {
        akp akp = akN.a(ajc$tjp_4, this, akL.a(i));
        fx.a();
        fx.a(akp);
        schemeVersion = i;
    }

    public String toString()
    {
        Object obj = akN.a(ajc$tjp_6, this);
        fx.a();
        fx.a(((akp) (obj)));
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("Schema Type Box[");
        ((StringBuilder) (obj)).append("schemeUri=").append(schemeUri).append("; ");
        ((StringBuilder) (obj)).append("schemeType=").append(schemeType).append("; ");
        ((StringBuilder) (obj)).append("schemeVersion=").append(schemeVersion).append("; ");
        ((StringBuilder) (obj)).append("]");
        return ((StringBuilder) (obj)).toString();
    }

    static 
    {
        ajc$preClinit();
        boolean flag;
        if (!com/coremedia/iso/boxes/SchemeTypeBox.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
