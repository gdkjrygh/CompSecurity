// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.extension.encoder;


public interface VideoEncoderExtension
{

    public abstract int dropNextNFrames(int i);

    public abstract int enhanceROI(int i, int j, int k, int l, int i1);

    public abstract int flushFrames();

    public abstract int forceIdr();

    public abstract int getMaxQp();

    public abstract int h264SetQp(int i);

    public abstract int hintRcFrameRate(float f, float f1);

    public abstract int init(String s, boolean flag);

    public abstract int markLTRFrame(int i);

    public abstract int processFrame(long l, long l1, long l2, long l3, boolean flag);

    public abstract int restartEncoder(int i, float f);

    public abstract int setBaseLayerPID(int i);

    public abstract int setBitrate(int i);

    public abstract int setFPS(float f);

    public abstract int setLTRBufferControl(int i, boolean flag);

    public abstract int setMaxNumRefFrames(int i);

    public abstract int setNumTempLayers(int i);

    public abstract int setProvideMADMetric(boolean flag);

    public abstract int setSliceSize(int i, int j);

    public abstract int uninit(boolean flag);

    public abstract int useLTRFrame(int i, boolean flag);
}
