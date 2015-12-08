// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akN;
import cA;
import cv;
import ft;
import fx;
import java.nio.ByteBuffer;

public class XmlBox extends ft
{

    public static final String TYPE = "xml ";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    String xml;

    public XmlBox()
    {
        super("xml ");
        xml = "";
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("XmlBox.java", com/coremedia/iso/boxes/XmlBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getXml", "com.coremedia.iso.boxes.XmlBox", "", "", "", "java.lang.String"), 20);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "setXml", "com.coremedia.iso.boxes.XmlBox", "java.lang.String", "xml", "", "void"), 24);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.XmlBox", "", "", "", "java.lang.String"), 46);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        xml = cv.a(bytebuffer, bytebuffer.remaining());
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        bytebuffer.put(cA.a(xml));
    }

    protected long getContentSize()
    {
        return (long)(cA.b(xml) + 4);
    }

    public String getXml()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return xml;
    }

    public void setXml(String s)
    {
        akp akp = akN.a(ajc$tjp_1, this, s);
        fx.a();
        fx.a(akp);
        xml = s;
    }

    public String toString()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        return (new StringBuilder("XmlBox{xml='")).append(xml).append('\'').append('}').toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
