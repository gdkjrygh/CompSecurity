// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.fragment;

import akL;
import akN;
import cv;
import cx;
import ft;
import fx;
import java.nio.ByteBuffer;

public class MovieFragmentHeaderBox extends ft
{

    public static final String TYPE = "mfhd";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private long sequenceNumber;

    public MovieFragmentHeaderBox()
    {
        super("mfhd");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("MovieFragmentHeaderBox.java", com/coremedia/iso/boxes/fragment/MovieFragmentHeaderBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getSequenceNumber", "com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox", "", "", "", "long"), 59);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "setSequenceNumber", "com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox", "long", "sequenceNumber", "", "void"), 63);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox", "", "", "", "java.lang.String"), 68);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        sequenceNumber = cv.a(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        cx.b(bytebuffer, sequenceNumber);
    }

    protected long getContentSize()
    {
        return 8L;
    }

    public long getSequenceNumber()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return sequenceNumber;
    }

    public void setSequenceNumber(long l)
    {
        akp akp = akN.a(ajc$tjp_1, this, akL.a(l));
        fx.a();
        fx.a(akp);
        sequenceNumber = l;
    }

    public String toString()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        return (new StringBuilder("MovieFragmentHeaderBox{sequenceNumber=")).append(sequenceNumber).append('}').toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
