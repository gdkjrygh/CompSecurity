// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.sampleentry;

import akN;
import cu;
import cv;
import cx;
import fr;
import fx;
import java.nio.ByteBuffer;

public class AmrSpecificBox extends fr
{

    public static final String TYPE = "damr";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private static final akp.a ajc$tjp_3;
    private static final akp.a ajc$tjp_4;
    private static final akp.a ajc$tjp_5;
    private static final akp.a ajc$tjp_6;
    private int decoderVersion;
    private int framesPerSample;
    private int modeChangePeriod;
    private int modeSet;
    private String vendor;

    public AmrSpecificBox()
    {
        super("damr");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("AmrSpecificBox.java", com/coremedia/iso/boxes/sampleentry/AmrSpecificBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getVendor", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "java.lang.String"), 46);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "getDecoderVersion", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 50);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "getModeSet", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 54);
        ajc$tjp_3 = akn.a("method-execution", akn.a("1", "getModeChangePeriod", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 58);
        ajc$tjp_4 = akn.a("method-execution", akn.a("1", "getFramesPerSample", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 62);
        ajc$tjp_5 = akn.a("method-execution", akn.a("1", "getContent", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 84);
        ajc$tjp_6 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "java.lang.String"), 92);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        byte abyte0[] = new byte[4];
        bytebuffer.get(abyte0);
        vendor = cu.a(abyte0);
        decoderVersion = cv.d(bytebuffer);
        modeSet = cv.c(bytebuffer);
        modeChangePeriod = cv.d(bytebuffer);
        framesPerSample = cv.d(bytebuffer);
    }

    public void getContent(ByteBuffer bytebuffer)
    {
        akp akp = akN.a(ajc$tjp_5, this, bytebuffer);
        fx.a();
        fx.a(akp);
        bytebuffer.put(cu.a(vendor));
        cx.c(bytebuffer, decoderVersion);
        cx.b(bytebuffer, modeSet);
        cx.c(bytebuffer, modeChangePeriod);
        cx.c(bytebuffer, framesPerSample);
    }

    protected long getContentSize()
    {
        return 9L;
    }

    public int getDecoderVersion()
    {
        akp akp = akN.a(ajc$tjp_1, this);
        fx.a();
        fx.a(akp);
        return decoderVersion;
    }

    public int getFramesPerSample()
    {
        akp akp = akN.a(ajc$tjp_4, this);
        fx.a();
        fx.a(akp);
        return framesPerSample;
    }

    public int getModeChangePeriod()
    {
        akp akp = akN.a(ajc$tjp_3, this);
        fx.a();
        fx.a(akp);
        return modeChangePeriod;
    }

    public int getModeSet()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        return modeSet;
    }

    public String getVendor()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return vendor;
    }

    public String toString()
    {
        Object obj = akN.a(ajc$tjp_6, this);
        fx.a();
        fx.a(((akp) (obj)));
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("AmrSpecificBox[vendor=").append(getVendor());
        ((StringBuilder) (obj)).append(";decoderVersion=").append(getDecoderVersion());
        ((StringBuilder) (obj)).append(";modeSet=").append(getModeSet());
        ((StringBuilder) (obj)).append(";modeChangePeriod=").append(getModeChangePeriod());
        ((StringBuilder) (obj)).append(";framesPerSample=").append(getFramesPerSample());
        ((StringBuilder) (obj)).append("]");
        return ((StringBuilder) (obj)).toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
