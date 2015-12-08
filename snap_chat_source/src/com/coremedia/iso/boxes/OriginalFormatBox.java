// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akN;
import cu;
import cv;
import fr;
import fx;
import java.nio.ByteBuffer;

public class OriginalFormatBox extends fr
{

    static final boolean $assertionsDisabled;
    public static final String TYPE = "frma";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private String dataFormat;

    public OriginalFormatBox()
    {
        super("frma");
        dataFormat = "    ";
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("OriginalFormatBox.java", com/coremedia/iso/boxes/OriginalFormatBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getDataFormat", "com.coremedia.iso.boxes.OriginalFormatBox", "", "", "", "java.lang.String"), 42);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "setDataFormat", "com.coremedia.iso.boxes.OriginalFormatBox", "java.lang.String", "dataFormat", "", "void"), 47);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.OriginalFormatBox", "", "", "", "java.lang.String"), 67);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        dataFormat = cv.k(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        bytebuffer.put(cu.a(dataFormat));
    }

    protected long getContentSize()
    {
        return 4L;
    }

    public String getDataFormat()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return dataFormat;
    }

    public void setDataFormat(String s)
    {
        akp akp = akN.a(ajc$tjp_1, this, s);
        fx.a();
        fx.a(akp);
        if (!$assertionsDisabled && s.length() != 4)
        {
            throw new AssertionError();
        } else
        {
            dataFormat = s;
            return;
        }
    }

    public String toString()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        return (new StringBuilder("OriginalFormatBox[dataFormat=")).append(getDataFormat()).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
        boolean flag;
        if (!com/coremedia/iso/boxes/OriginalFormatBox.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
