// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.qos.metrics;


public class PlaybackSessionMetrics
{

    private long _secondsPlayed;
    private long _secondsSpent;

    public PlaybackSessionMetrics()
    {
    }

    public long getSecondsPlayed()
    {
        return _secondsPlayed;
    }

    public long getSecondsSpent()
    {
        return _secondsSpent;
    }
}
