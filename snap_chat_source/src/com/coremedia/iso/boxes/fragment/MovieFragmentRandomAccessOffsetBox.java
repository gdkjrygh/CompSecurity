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

public class MovieFragmentRandomAccessOffsetBox extends ft
{

    public static final String TYPE = "mfro";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private long mfraSize;

    public MovieFragmentRandomAccessOffsetBox()
    {
        super("mfro");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("MovieFragmentRandomAccessOffsetBox.java", com/coremedia/iso/boxes/fragment/MovieFragmentRandomAccessOffsetBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getMfraSize", "com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessOffsetBox", "", "", "", "long"), 56);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "setMfraSize", "com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessOffsetBox", "long", "mfraSize", "", "void"), 60);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        mfraSize = cv.a(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        cx.b(bytebuffer, mfraSize);
    }

    protected long getContentSize()
    {
        return 8L;
    }

    public long getMfraSize()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return mfraSize;
    }

    public void setMfraSize(long l)
    {
        akp akp = akN.a(ajc$tjp_1, this, akL.a(l));
        fx.a();
        fx.a(akp);
        mfraSize = l;
    }

    static 
    {
        ajc$preClinit();
    }
}
