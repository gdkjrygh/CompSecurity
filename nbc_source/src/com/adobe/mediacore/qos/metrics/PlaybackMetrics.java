// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.qos.metrics;

import com.adobe.mediacore.utils.TimeRange;

public abstract class PlaybackMetrics
{

    protected long _bitrate;
    protected long _bufferLength;
    protected long _bufferTime;
    protected TimeRange _bufferedRange;
    protected long _droppedFramesCount;
    protected float _frameRate;
    protected TimeRange _playbackRange;
    protected TimeRange _seekableRange;
    protected long _time;
    protected long _timeLocal;

    public PlaybackMetrics()
    {
        _playbackRange = TimeRange.createRange(0L, 0L);
        _seekableRange = TimeRange.createRange(0L, 0L);
        _bufferedRange = TimeRange.createRange(0L, 0L);
    }

    protected abstract void doUpdate();

    public long getBitrate()
    {
        return _bitrate;
    }

    public long getBufferLength()
    {
        return _bufferLength;
    }

    public long getBufferTime()
    {
        return _bufferTime;
    }

    public TimeRange getBufferedRange()
    {
        return _bufferedRange;
    }

    public long getDroppedFramesCount()
    {
        return _droppedFramesCount;
    }

    public float getFrameRate()
    {
        return _frameRate;
    }

    public TimeRange getPlaybackRange()
    {
        return _playbackRange;
    }

    public TimeRange getSeekableRange()
    {
        return _seekableRange;
    }

    public long getTime()
    {
        return _time;
    }

    public long getTimeLocal()
    {
        return _timeLocal;
    }

    public void reset()
    {
        _time = 0L;
        _timeLocal = 0L;
        _playbackRange = TimeRange.createRange(0L, 0L);
        _seekableRange = TimeRange.createRange(0L, 0L);
        _bufferedRange = TimeRange.createRange(0L, 0L);
        _frameRate = 0.0F;
        _droppedFramesCount = 0L;
        _bitrate = 0L;
        _bufferTime = 0L;
        _bufferLength = 0L;
    }

    public void update()
    {
        doUpdate();
    }
}
