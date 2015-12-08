// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.qos;


public class PlaybackInformation
{

    private final long _bitrate;
    private final long _bufferLength;
    private final long _bufferTime;
    private final long _bufferingTime;
    private final long _droppedFrameCount;
    private final long _emptyBufferCount;
    private final float _frameRate;
    private final long _lastSeekTime;
    private final long _secondsPlayed;
    private final long _secondsSpent;
    private final long _timeToFail;
    private final long _timeToFirstByte;
    private final long _timeToFirstFrame;
    private final long _timeToLoad;
    private final long _timeToPrepare;
    private final long _timeToStart;

    public PlaybackInformation(long l, long l1, long l2, long l3, long l4, long l5, long l6, 
            long l7, float f, long l8, long l9, 
            long l10, long l11, long l12, long l13, long l14)
    {
        _timeToFirstByte = l;
        _timeToLoad = l1;
        _timeToStart = l2;
        _timeToFirstFrame = l3;
        _timeToPrepare = l4;
        _timeToFail = l5;
        _secondsPlayed = l6;
        _secondsSpent = l7;
        _frameRate = f;
        _droppedFrameCount = l8;
        _bitrate = l9;
        _bufferTime = l10;
        _bufferLength = l11;
        _emptyBufferCount = l12;
        _bufferingTime = l13;
        _lastSeekTime = l14;
    }

    public final long getBitrate()
    {
        return _bitrate;
    }

    public final long getBufferLength()
    {
        return _bufferLength;
    }

    public final long getBufferTime()
    {
        return _bufferTime;
    }

    public final long getBufferingTime()
    {
        return _bufferingTime;
    }

    public final long getDroppedFrameCount()
    {
        return _droppedFrameCount;
    }

    public final long getEmptyBufferCount()
    {
        return _emptyBufferCount;
    }

    public final float getFrameRate()
    {
        return _frameRate;
    }

    public long getLastSeekTime()
    {
        return _lastSeekTime;
    }

    public final long getTimeToFail()
    {
        return _timeToFail;
    }

    public final long getTimeToFirstByte()
    {
        return _timeToFirstByte;
    }

    public final long getTimeToFirstFrame()
    {
        return _timeToFirstFrame;
    }

    public final long getTimeToLoad()
    {
        return _timeToLoad;
    }

    public long getTimeToPrepare()
    {
        return _timeToPrepare;
    }

    public final long getTimeToStart()
    {
        return _timeToStart;
    }

    public final long getTotalSecondsPlayed()
    {
        return _secondsPlayed;
    }

    public final long getTotalSecondsSpent()
    {
        return _secondsSpent;
    }
}
