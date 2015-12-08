// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.qos.metrics;

import com.adobe.mediacore.utils.DateUtils;
import java.util.Date;

public class SeekMetrics
{
    public static final class Result extends Enum
    {

        private static final Result $VALUES[];
        public static final Result FAIL;
        public static final Result SUCCESS;

        public static Result valueOf(String s)
        {
            return (Result)Enum.valueOf(com/adobe/mediacore/qos/metrics/SeekMetrics$Result, s);
        }

        public static Result[] values()
        {
            return (Result[])$VALUES.clone();
        }

        static 
        {
            SUCCESS = new Result("SUCCESS", 0);
            FAIL = new Result("FAIL", 1);
            $VALUES = (new Result[] {
                SUCCESS, FAIL
            });
        }

        private Result(String s, int i)
        {
            super(s, i);
        }
    }


    private Date _lastSeekStartDate;
    private long _lastSeekTime;
    private long _seekFailCount;
    private long _seekStartCount;
    private long _seekSuccessCount;
    private long _totalSeekTime;

    public SeekMetrics()
    {
        reset();
    }

    public long getLastSeekTime()
    {
        return _lastSeekTime;
    }

    public long getSeekFailCount()
    {
        return _seekFailCount;
    }

    public long getSeekStartCount()
    {
        return _seekStartCount;
    }

    public long getSeekSuccessCount()
    {
        return _seekSuccessCount;
    }

    public long getTotalSeekTime()
    {
        return _totalSeekTime;
    }

    public void recordSeekComplete(Result result)
    {
        if (_lastSeekStartDate == null)
        {
            return;
        }
        if (result == Result.SUCCESS)
        {
            _seekSuccessCount = _seekSuccessCount + 1L;
        } else
        {
            _seekFailCount = _seekFailCount + 1L;
        }
        _lastSeekTime = DateUtils.getMillisecondsSince(_lastSeekStartDate);
        _totalSeekTime = _totalSeekTime + _lastSeekTime;
        _lastSeekStartDate = null;
    }

    public void recordSeekStart()
    {
        _seekStartCount = _seekStartCount + 1L;
        _lastSeekStartDate = new Date();
    }

    public void reset()
    {
        _seekStartCount = 0L;
        _seekSuccessCount = 0L;
        _seekFailCount = 0L;
        _lastSeekTime = 0L;
        _totalSeekTime = 0L;
        _lastSeekStartDate = null;
    }
}
