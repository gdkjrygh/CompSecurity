// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.apple;

import akN;
import cA;
import cu;
import cv;
import cx;
import fF;
import ft;
import fx;
import java.nio.ByteBuffer;

public class AppleDataReferenceBox extends ft
{

    public static final String TYPE = "rdrf";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private String dataReference;
    private int dataReferenceSize;
    private String dataReferenceType;

    public AppleDataReferenceBox()
    {
        super("rdrf");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("AppleDataReferenceBox.java", com/coremedia/iso/boxes/apple/AppleDataReferenceBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getDataReferenceSize", "com.coremedia.iso.boxes.apple.AppleDataReferenceBox", "", "", "", "long"), 63);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "getDataReferenceType", "com.coremedia.iso.boxes.apple.AppleDataReferenceBox", "", "", "", "java.lang.String"), 67);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "getDataReference", "com.coremedia.iso.boxes.apple.AppleDataReferenceBox", "", "", "", "java.lang.String"), 71);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        dataReferenceType = cv.k(bytebuffer);
        dataReferenceSize = fF.a(cv.a(bytebuffer));
        dataReference = cv.a(bytebuffer, dataReferenceSize);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        bytebuffer.put(cu.a(dataReferenceType));
        cx.b(bytebuffer, dataReferenceSize);
        bytebuffer.put(cA.a(dataReference));
    }

    protected long getContentSize()
    {
        return (long)(dataReferenceSize + 12);
    }

    public String getDataReference()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        return dataReference;
    }

    public long getDataReferenceSize()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return (long)dataReferenceSize;
    }

    public String getDataReferenceType()
    {
        akp akp = akN.a(ajc$tjp_1, this);
        fx.a();
        fx.a(akp);
        return dataReferenceType;
    }

    static 
    {
        ajc$preClinit();
    }
}
