// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.vodafone;

import akN;
import cA;
import cv;
import ft;
import fx;
import java.nio.ByteBuffer;

public class CoverUriBox extends ft
{

    public static final String TYPE = "cvru";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private String coverUri;

    public CoverUriBox()
    {
        super("cvru");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("CoverUriBox.java", com/coremedia/iso/boxes/vodafone/CoverUriBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getCoverUri", "com.coremedia.iso.boxes.vodafone.CoverUriBox", "", "", "", "java.lang.String"), 38);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "setCoverUri", "com.coremedia.iso.boxes.vodafone.CoverUriBox", "java.lang.String", "coverUri", "", "void"), 42);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.vodafone.CoverUriBox", "", "", "", "java.lang.String"), 64);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        coverUri = cv.e(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        bytebuffer.put(cA.a(coverUri));
        bytebuffer.put((byte)0);
    }

    protected long getContentSize()
    {
        return (long)(cA.b(coverUri) + 5);
    }

    public String getCoverUri()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return coverUri;
    }

    public void setCoverUri(String s)
    {
        akp akp = akN.a(ajc$tjp_1, this, s);
        fx.a();
        fx.a(akp);
        coverUri = s;
    }

    public String toString()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        return (new StringBuilder("CoverUriBox[coverUri=")).append(getCoverUri()).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
