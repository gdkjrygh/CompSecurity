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

// Referenced classes of package com.coremedia.iso.boxes.fragment:
//            SampleFlags

public class TrackExtendsBox extends ft
{

    public static final String TYPE = "trex";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_10;
    private static final akp.a ajc$tjp_2;
    private static final akp.a ajc$tjp_3;
    private static final akp.a ajc$tjp_4;
    private static final akp.a ajc$tjp_5;
    private static final akp.a ajc$tjp_6;
    private static final akp.a ajc$tjp_7;
    private static final akp.a ajc$tjp_8;
    private static final akp.a ajc$tjp_9;
    private long defaultSampleDescriptionIndex;
    private long defaultSampleDuration;
    private SampleFlags defaultSampleFlags;
    private long defaultSampleSize;
    private long trackId;

    public TrackExtendsBox()
    {
        super("trex");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("TrackExtendsBox.java", com/coremedia/iso/boxes/fragment/TrackExtendsBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getTrackId", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "long"), 72);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "getDefaultSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "long"), 76);
        ajc$tjp_10 = akn.a("method-execution", akn.a("1", "setDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "defaultSampleFlags", "", "void"), 112);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "getDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "long"), 80);
        ajc$tjp_3 = akn.a("method-execution", akn.a("1", "getDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "long"), 84);
        ajc$tjp_4 = akn.a("method-execution", akn.a("1", "getDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"), 88);
        ajc$tjp_5 = akn.a("method-execution", akn.a("1", "getDefaultSampleFlagsStr", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "java.lang.String"), 92);
        ajc$tjp_6 = akn.a("method-execution", akn.a("1", "setTrackId", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "long", "trackId", "", "void"), 96);
        ajc$tjp_7 = akn.a("method-execution", akn.a("1", "setDefaultSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "long", "defaultSampleDescriptionIndex", "", "void"), 100);
        ajc$tjp_8 = akn.a("method-execution", akn.a("1", "setDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "long", "defaultSampleDuration", "", "void"), 104);
        ajc$tjp_9 = akn.a("method-execution", akn.a("1", "setDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "long", "defaultSampleSize", "", "void"), 108);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        trackId = cv.a(bytebuffer);
        defaultSampleDescriptionIndex = cv.a(bytebuffer);
        defaultSampleDuration = cv.a(bytebuffer);
        defaultSampleSize = cv.a(bytebuffer);
        defaultSampleFlags = new SampleFlags(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        cx.b(bytebuffer, trackId);
        cx.b(bytebuffer, defaultSampleDescriptionIndex);
        cx.b(bytebuffer, defaultSampleDuration);
        cx.b(bytebuffer, defaultSampleSize);
        defaultSampleFlags.getContent(bytebuffer);
    }

    protected long getContentSize()
    {
        return 24L;
    }

    public long getDefaultSampleDescriptionIndex()
    {
        akp akp = akN.a(ajc$tjp_1, this);
        fx.a();
        fx.a(akp);
        return defaultSampleDescriptionIndex;
    }

    public long getDefaultSampleDuration()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        return defaultSampleDuration;
    }

    public SampleFlags getDefaultSampleFlags()
    {
        akp akp = akN.a(ajc$tjp_4, this);
        fx.a();
        fx.a(akp);
        return defaultSampleFlags;
    }

    public String getDefaultSampleFlagsStr()
    {
        akp akp = akN.a(ajc$tjp_5, this);
        fx.a();
        fx.a(akp);
        return defaultSampleFlags.toString();
    }

    public long getDefaultSampleSize()
    {
        akp akp = akN.a(ajc$tjp_3, this);
        fx.a();
        fx.a(akp);
        return defaultSampleSize;
    }

    public long getTrackId()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return trackId;
    }

    public void setDefaultSampleDescriptionIndex(long l)
    {
        akp akp = akN.a(ajc$tjp_7, this, akL.a(l));
        fx.a();
        fx.a(akp);
        defaultSampleDescriptionIndex = l;
    }

    public void setDefaultSampleDuration(long l)
    {
        akp akp = akN.a(ajc$tjp_8, this, akL.a(l));
        fx.a();
        fx.a(akp);
        defaultSampleDuration = l;
    }

    public void setDefaultSampleFlags(SampleFlags sampleflags)
    {
        akp akp = akN.a(ajc$tjp_10, this, sampleflags);
        fx.a();
        fx.a(akp);
        defaultSampleFlags = sampleflags;
    }

    public void setDefaultSampleSize(long l)
    {
        akp akp = akN.a(ajc$tjp_9, this, akL.a(l));
        fx.a();
        fx.a(akp);
        defaultSampleSize = l;
    }

    public void setTrackId(long l)
    {
        akp akp = akN.a(ajc$tjp_6, this, akL.a(l));
        fx.a();
        fx.a(akp);
        trackId = l;
    }

    static 
    {
        ajc$preClinit();
    }
}
