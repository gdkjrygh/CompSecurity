// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave.drm;

import java.util.Date;

public class DRMPlaybackTimeWindow
{

    private Date endDate;
    private long periodInSeconds;
    private Date startDate;

    protected DRMPlaybackTimeWindow(long l, Date date, Date date1)
    {
        periodInSeconds = l;
        startDate = date;
        endDate = date1;
    }

    public Date getPlaybackEndDate()
    {
        return endDate;
    }

    public long getPlaybackPeriodInSeconds()
    {
        return periodInSeconds;
    }

    public Date getPlaybackStartDate()
    {
        return startDate;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (getPlaybackPeriodInSeconds() > 0L)
        {
            stringbuffer.append((new StringBuilder()).append("period in seconds ").append(getPlaybackPeriodInSeconds()).append(" ").toString());
        }
        if (getPlaybackStartDate() != null)
        {
            stringbuffer.append((new StringBuilder()).append("start date ").append(getPlaybackStartDate()).toString());
        }
        if (getPlaybackEndDate() != null)
        {
            stringbuffer.append((new StringBuilder()).append("end date ").append(getPlaybackEndDate()).toString());
        }
        return stringbuffer.toString();
    }
}
