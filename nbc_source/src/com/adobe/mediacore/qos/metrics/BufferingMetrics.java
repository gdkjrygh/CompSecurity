// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.qos.metrics;

import com.adobe.mediacore.utils.DateUtils;
import java.util.Date;

public class BufferingMetrics
{

    private long _emptyBufferCount;
    private Date _lastBufferingStartDate;
    private long _totalBufferingTime;

    public BufferingMetrics()
    {
        reset();
    }

    public long getEmptyBufferCount()
    {
        return _emptyBufferCount;
    }

    public long getTotalBufferingTime()
    {
        return _totalBufferingTime;
    }

    public void recordBufferEmpty()
    {
        _emptyBufferCount = _emptyBufferCount + 1L;
        _lastBufferingStartDate = new Date();
    }

    public void recordBufferFull()
    {
        _totalBufferingTime = _totalBufferingTime + DateUtils.getMillisecondsSince(_lastBufferingStartDate);
        _lastBufferingStartDate = null;
    }

    public void reset()
    {
        _emptyBufferCount = 0L;
        _totalBufferingTime = 0L;
    }
}
