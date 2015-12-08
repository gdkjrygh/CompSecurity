// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.extension.decoder;


public interface VideoDecoderExtension
{

    public abstract int configure(long l, int i, long l1, int j);

    public abstract int flushFrames(long l, long l1);

    public abstract int init(String s);

    public abstract int processFrame(long l, long l1, long l2, int i, 
            long l3);

    public abstract int uninit();
}
