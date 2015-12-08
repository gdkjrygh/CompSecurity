// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.qos.metrics;

import com.adobe.mediacore.utils.DateUtils;
import java.util.Date;

public class PlaybackLoadMetrics
{

    private Date _lastPlaybackInitDate;
    private long _timeToFail;
    private long _timeToFirstByte;
    private long _timeToFirstFrame;
    private long _timeToLoad;
    private long _timeToPrepare;
    private long _timeToStart;

    public PlaybackLoadMetrics()
    {
        reset();
    }

    public long getTimeToFail()
    {
        return _timeToFail;
    }

    public long getTimeToFirstByte()
    {
        return _timeToFirstByte;
    }

    public long getTimeToFirstFrame()
    {
        return _timeToFirstFrame;
    }

    public long getTimeToLoad()
    {
        return _timeToLoad;
    }

    public long getTimeToPrepare()
    {
        return _timeToPrepare;
    }

    public long getTimeToStart()
    {
        return _timeToStart;
    }

    public void recordPlaybackFail()
    {
        if (_timeToFail == 0L)
        {
            _timeToFail = DateUtils.getMillisecondsSince(_lastPlaybackInitDate);
            _lastPlaybackInitDate = null;
        }
    }

    public void recordPlaybackInit()
    {
        reset();
        _lastPlaybackInitDate = new Date();
    }

    public void recordPlaybackLoad()
    {
        if (_timeToLoad == 0L)
        {
            _timeToLoad = DateUtils.getMillisecondsSince(_lastPlaybackInitDate);
        }
    }

    public void recordPlaybackStart()
    {
        if (_timeToStart == 0L)
        {
            _timeToStart = DateUtils.getMillisecondsSince(_lastPlaybackInitDate);
        }
    }

    public void recordTimeToFirstFrame()
    {
        if (_timeToFirstFrame == 0L)
        {
            _timeToFirstFrame = DateUtils.getMillisecondsSince(_lastPlaybackInitDate);
        }
    }

    public void recordTimeToPrepare()
    {
        if (_timeToPrepare == 0L)
        {
            _timeToPrepare = DateUtils.getMillisecondsSince(_lastPlaybackInitDate);
        }
    }

    public void reset()
    {
        _timeToFail = 0L;
        _timeToFirstByte = 0L;
        _timeToLoad = 0L;
        _timeToStart = 0L;
        _timeToFirstFrame = 0L;
        _timeToPrepare = 0L;
    }
}
