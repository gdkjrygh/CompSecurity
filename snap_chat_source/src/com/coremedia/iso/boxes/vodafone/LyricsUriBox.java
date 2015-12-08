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

public class LyricsUriBox extends ft
{

    public static final String TYPE = "lrcu";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private String lyricsUri;

    public LyricsUriBox()
    {
        super("lrcu");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("LyricsUriBox.java", com/coremedia/iso/boxes/vodafone/LyricsUriBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getLyricsUri", "com.coremedia.iso.boxes.vodafone.LyricsUriBox", "", "", "", "java.lang.String"), 39);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "setLyricsUri", "com.coremedia.iso.boxes.vodafone.LyricsUriBox", "java.lang.String", "lyricsUri", "", "void"), 43);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.vodafone.LyricsUriBox", "", "", "", "java.lang.String"), 64);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        lyricsUri = cv.e(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        bytebuffer.put(cA.a(lyricsUri));
        bytebuffer.put((byte)0);
    }

    protected long getContentSize()
    {
        return (long)(cA.b(lyricsUri) + 5);
    }

    public String getLyricsUri()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return lyricsUri;
    }

    public void setLyricsUri(String s)
    {
        akp akp = akN.a(ajc$tjp_1, this, s);
        fx.a();
        fx.a(akp);
        lyricsUri = s;
    }

    public String toString()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        return (new StringBuilder("LyricsUriBox[lyricsUri=")).append(getLyricsUri()).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
