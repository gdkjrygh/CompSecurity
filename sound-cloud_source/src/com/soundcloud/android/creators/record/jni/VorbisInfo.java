// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record.jni;


public class VorbisInfo
{

    public long bitrate;
    public int channels;
    public double duration;
    public long numSamples;
    public int sampleRate;

    public VorbisInfo()
    {
    }

    public String toString()
    {
        return (new StringBuilder("Info{numSamples=")).append(numSamples).append(", channels=").append(channels).append(", sampleRate=").append(sampleRate).append(", bitrate=").append(bitrate).append(", duration=").append(duration).append('}').toString();
    }
}
