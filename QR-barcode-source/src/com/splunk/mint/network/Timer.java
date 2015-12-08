// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint.network;

import java.io.Serializable;

// Referenced classes of package com.splunk.mint.network:
//            Metric

public class Timer extends Metric
{

    private Long end;
    private Long start;

    public Timer(String s)
    {
        super((new StringBuilder()).append(s).append("-timer").toString());
        start = null;
        end = Long.valueOf(0L);
    }

    public void done()
    {
        end = Long.valueOf(System.currentTimeMillis());
    }

    public long getStartValue()
    {
        if (start == null)
        {
            return 0L;
        } else
        {
            return start.longValue();
        }
    }

    public long getStopValue()
    {
        return end.longValue();
    }

    public volatile Serializable getValue()
    {
        return getValue();
    }

    public Long getValue()
    {
        if (start == null)
        {
            return null;
        }
        if (end != null)
        {
            return Long.valueOf(end.longValue() - start.longValue());
        } else
        {
            return Long.valueOf(System.currentTimeMillis() - start.longValue());
        }
    }

    public void start()
    {
        if (start == null)
        {
            start = Long.valueOf(System.currentTimeMillis());
        }
    }
}
