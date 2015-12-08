// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.apple;

import akL;
import akN;
import cv;
import cx;
import ft;
import fx;
import java.nio.ByteBuffer;

public final class AppleLosslessSpecificBox extends ft
{

    public static final String TYPE = "alac";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_10;
    private static final akp.a ajc$tjp_11;
    private static final akp.a ajc$tjp_12;
    private static final akp.a ajc$tjp_13;
    private static final akp.a ajc$tjp_14;
    private static final akp.a ajc$tjp_15;
    private static final akp.a ajc$tjp_16;
    private static final akp.a ajc$tjp_17;
    private static final akp.a ajc$tjp_18;
    private static final akp.a ajc$tjp_19;
    private static final akp.a ajc$tjp_2;
    private static final akp.a ajc$tjp_20;
    private static final akp.a ajc$tjp_21;
    private static final akp.a ajc$tjp_3;
    private static final akp.a ajc$tjp_4;
    private static final akp.a ajc$tjp_5;
    private static final akp.a ajc$tjp_6;
    private static final akp.a ajc$tjp_7;
    private static final akp.a ajc$tjp_8;
    private static final akp.a ajc$tjp_9;
    private long bitRate;
    private int channels;
    private int historyMult;
    private int initialHistory;
    private int kModifier;
    private long maxCodedFrameSize;
    private long maxSamplePerFrame;
    private long sampleRate;
    private int sampleSize;
    private int unknown1;
    private int unknown2;

    public AppleLosslessSpecificBox()
    {
        super("alac");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("AppleLosslessSpecificBox.java", com/coremedia/iso/boxes/apple/AppleLosslessSpecificBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getMaxSamplePerFrame", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 34);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "setMaxSamplePerFrame", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "maxSamplePerFrame", "", "void"), 38);
        ajc$tjp_10 = akn.a("method-execution", akn.a("1", "getKModifier", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 74);
        ajc$tjp_11 = akn.a("method-execution", akn.a("1", "setKModifier", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "kModifier", "", "void"), 78);
        ajc$tjp_12 = akn.a("method-execution", akn.a("1", "getChannels", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 82);
        ajc$tjp_13 = akn.a("method-execution", akn.a("1", "setChannels", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "channels", "", "void"), 86);
        ajc$tjp_14 = akn.a("method-execution", akn.a("1", "getUnknown2", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 90);
        ajc$tjp_15 = akn.a("method-execution", akn.a("1", "setUnknown2", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "unknown2", "", "void"), 94);
        ajc$tjp_16 = akn.a("method-execution", akn.a("1", "getMaxCodedFrameSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 98);
        ajc$tjp_17 = akn.a("method-execution", akn.a("1", "setMaxCodedFrameSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "maxCodedFrameSize", "", "void"), 102);
        ajc$tjp_18 = akn.a("method-execution", akn.a("1", "getBitRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 106);
        ajc$tjp_19 = akn.a("method-execution", akn.a("1", "setBitRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "bitRate", "", "void"), 110);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "getUnknown1", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 42);
        ajc$tjp_20 = akn.a("method-execution", akn.a("1", "getSampleRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 114);
        ajc$tjp_21 = akn.a("method-execution", akn.a("1", "setSampleRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "sampleRate", "", "void"), 118);
        ajc$tjp_3 = akn.a("method-execution", akn.a("1", "setUnknown1", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "unknown1", "", "void"), 46);
        ajc$tjp_4 = akn.a("method-execution", akn.a("1", "getSampleSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 50);
        ajc$tjp_5 = akn.a("method-execution", akn.a("1", "setSampleSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "sampleSize", "", "void"), 54);
        ajc$tjp_6 = akn.a("method-execution", akn.a("1", "getHistoryMult", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 58);
        ajc$tjp_7 = akn.a("method-execution", akn.a("1", "setHistoryMult", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "historyMult", "", "void"), 62);
        ajc$tjp_8 = akn.a("method-execution", akn.a("1", "getInitialHistory", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 66);
        ajc$tjp_9 = akn.a("method-execution", akn.a("1", "setInitialHistory", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "initialHistory", "", "void"), 70);
    }

    public final void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        maxSamplePerFrame = cv.a(bytebuffer);
        unknown1 = cv.d(bytebuffer);
        sampleSize = cv.d(bytebuffer);
        historyMult = cv.d(bytebuffer);
        initialHistory = cv.d(bytebuffer);
        kModifier = cv.d(bytebuffer);
        channels = cv.d(bytebuffer);
        unknown2 = cv.c(bytebuffer);
        maxCodedFrameSize = cv.a(bytebuffer);
        bitRate = cv.a(bytebuffer);
        sampleRate = cv.a(bytebuffer);
    }

    public final long getBitRate()
    {
        akp akp = akN.a(ajc$tjp_18, this);
        fx.a();
        fx.a(akp);
        return bitRate;
    }

    public final int getChannels()
    {
        akp akp = akN.a(ajc$tjp_12, this);
        fx.a();
        fx.a(akp);
        return channels;
    }

    protected final void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        cx.b(bytebuffer, maxSamplePerFrame);
        cx.c(bytebuffer, unknown1);
        cx.c(bytebuffer, sampleSize);
        cx.c(bytebuffer, historyMult);
        cx.c(bytebuffer, initialHistory);
        cx.c(bytebuffer, kModifier);
        cx.c(bytebuffer, channels);
        cx.b(bytebuffer, unknown2);
        cx.b(bytebuffer, maxCodedFrameSize);
        cx.b(bytebuffer, bitRate);
        cx.b(bytebuffer, sampleRate);
    }

    protected final long getContentSize()
    {
        return 28L;
    }

    public final int getHistoryMult()
    {
        akp akp = akN.a(ajc$tjp_6, this);
        fx.a();
        fx.a(akp);
        return historyMult;
    }

    public final int getInitialHistory()
    {
        akp akp = akN.a(ajc$tjp_8, this);
        fx.a();
        fx.a(akp);
        return initialHistory;
    }

    public final int getKModifier()
    {
        akp akp = akN.a(ajc$tjp_10, this);
        fx.a();
        fx.a(akp);
        return kModifier;
    }

    public final long getMaxCodedFrameSize()
    {
        akp akp = akN.a(ajc$tjp_16, this);
        fx.a();
        fx.a(akp);
        return maxCodedFrameSize;
    }

    public final long getMaxSamplePerFrame()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return maxSamplePerFrame;
    }

    public final long getSampleRate()
    {
        akp akp = akN.a(ajc$tjp_20, this);
        fx.a();
        fx.a(akp);
        return sampleRate;
    }

    public final int getSampleSize()
    {
        akp akp = akN.a(ajc$tjp_4, this);
        fx.a();
        fx.a(akp);
        return sampleSize;
    }

    public final int getUnknown1()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        return unknown1;
    }

    public final int getUnknown2()
    {
        akp akp = akN.a(ajc$tjp_14, this);
        fx.a();
        fx.a(akp);
        return unknown2;
    }

    public final void setBitRate(int i)
    {
        akp akp = akN.a(ajc$tjp_19, this, akL.a(i));
        fx.a();
        fx.a(akp);
        bitRate = i;
    }

    public final void setChannels(int i)
    {
        akp akp = akN.a(ajc$tjp_13, this, akL.a(i));
        fx.a();
        fx.a(akp);
        channels = i;
    }

    public final void setHistoryMult(int i)
    {
        akp akp = akN.a(ajc$tjp_7, this, akL.a(i));
        fx.a();
        fx.a(akp);
        historyMult = i;
    }

    public final void setInitialHistory(int i)
    {
        akp akp = akN.a(ajc$tjp_9, this, akL.a(i));
        fx.a();
        fx.a(akp);
        initialHistory = i;
    }

    public final void setKModifier(int i)
    {
        akp akp = akN.a(ajc$tjp_11, this, akL.a(i));
        fx.a();
        fx.a(akp);
        kModifier = i;
    }

    public final void setMaxCodedFrameSize(int i)
    {
        akp akp = akN.a(ajc$tjp_17, this, akL.a(i));
        fx.a();
        fx.a(akp);
        maxCodedFrameSize = i;
    }

    public final void setMaxSamplePerFrame(int i)
    {
        akp akp = akN.a(ajc$tjp_1, this, akL.a(i));
        fx.a();
        fx.a(akp);
        maxSamplePerFrame = i;
    }

    public final void setSampleRate(int i)
    {
        akp akp = akN.a(ajc$tjp_21, this, akL.a(i));
        fx.a();
        fx.a(akp);
        sampleRate = i;
    }

    public final void setSampleSize(int i)
    {
        akp akp = akN.a(ajc$tjp_5, this, akL.a(i));
        fx.a();
        fx.a(akp);
        sampleSize = i;
    }

    public final void setUnknown1(int i)
    {
        akp akp = akN.a(ajc$tjp_3, this, akL.a(i));
        fx.a();
        fx.a(akp);
        unknown1 = i;
    }

    public final void setUnknown2(int i)
    {
        akp akp = akN.a(ajc$tjp_15, this, akL.a(i));
        fx.a();
        fx.a(akp);
        unknown2 = i;
    }

    static 
    {
        ajc$preClinit();
    }
}
