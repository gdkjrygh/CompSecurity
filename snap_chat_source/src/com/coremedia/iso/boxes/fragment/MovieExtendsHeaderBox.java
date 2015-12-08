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

public class MovieExtendsHeaderBox extends ft
{

    public static final String TYPE = "mehd";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private long fragmentDuration;

    public MovieExtendsHeaderBox()
    {
        super("mehd");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("MovieExtendsHeaderBox.java", com/coremedia/iso/boxes/fragment/MovieExtendsHeaderBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getFragmentDuration", "com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox", "", "", "", "long"), 65);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "setFragmentDuration", "com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox", "long", "fragmentDuration", "", "void"), 69);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        long l;
        if (getVersion() == 1)
        {
            l = cv.f(bytebuffer);
        } else
        {
            l = cv.a(bytebuffer);
        }
        fragmentDuration = l;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        if (getVersion() == 1)
        {
            cx.a(bytebuffer, fragmentDuration);
            return;
        } else
        {
            cx.b(bytebuffer, fragmentDuration);
            return;
        }
    }

    protected long getContentSize()
    {
        int i;
        if (getVersion() == 1)
        {
            i = 12;
        } else
        {
            i = 8;
        }
        return (long)i;
    }

    public long getFragmentDuration()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return fragmentDuration;
    }

    public void setFragmentDuration(long l)
    {
        akp akp = akN.a(ajc$tjp_1, this, akL.a(l));
        fx.a();
        fx.a(akp);
        fragmentDuration = l;
    }

    static 
    {
        ajc$preClinit();
    }
}
