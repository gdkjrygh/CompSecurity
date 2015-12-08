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

public class TrackFragmentBaseMediaDecodeTimeBox extends ft
{

    public static final String TYPE = "tfdt";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private long baseMediaDecodeTime;

    public TrackFragmentBaseMediaDecodeTimeBox()
    {
        super("tfdt");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("TrackFragmentBaseMediaDecodeTimeBox.java", com/coremedia/iso/boxes/fragment/TrackFragmentBaseMediaDecodeTimeBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getBaseMediaDecodeTime", "com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox", "", "", "", "long"), 65);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "setBaseMediaDecodeTime", "com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox", "long", "baseMediaDecodeTime", "", "void"), 69);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox", "", "", "", "java.lang.String"), 74);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        if (getVersion() == 1)
        {
            baseMediaDecodeTime = cv.f(bytebuffer);
            return;
        } else
        {
            baseMediaDecodeTime = cv.a(bytebuffer);
            return;
        }
    }

    public long getBaseMediaDecodeTime()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return baseMediaDecodeTime;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        if (getVersion() == 1)
        {
            cx.a(bytebuffer, baseMediaDecodeTime);
            return;
        } else
        {
            cx.b(bytebuffer, baseMediaDecodeTime);
            return;
        }
    }

    protected long getContentSize()
    {
        int i;
        if (getVersion() == 0)
        {
            i = 8;
        } else
        {
            i = 12;
        }
        return (long)i;
    }

    public void setBaseMediaDecodeTime(long l)
    {
        akp akp = akN.a(ajc$tjp_1, this, akL.a(l));
        fx.a();
        fx.a(akp);
        baseMediaDecodeTime = l;
    }

    public String toString()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        return (new StringBuilder("TrackFragmentBaseMediaDecodeTimeBox{baseMediaDecodeTime=")).append(baseMediaDecodeTime).append('}').toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
