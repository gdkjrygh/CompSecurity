// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring;


public class Edit
{

    private double mediaRate;
    private long mediaTime;
    private double segmentDurationInMs;
    private long timeScale;

    public Edit(long l, long l1, double d, double d1)
    {
        timeScale = l1;
        segmentDurationInMs = d1;
        mediaTime = l;
        mediaRate = d;
    }

    public double getMediaRate()
    {
        return mediaRate;
    }

    public long getMediaTime()
    {
        return mediaTime;
    }

    public double getSegmentDuration()
    {
        return segmentDurationInMs;
    }

    public long getTimeScale()
    {
        return timeScale;
    }
}
