// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.ave.PeriodInfo;

// Referenced classes of package com.adobe.mediacore:
//            VideoEngineTimeline

private final class periodInfo
{

    private final int periodIndex;
    private final PeriodInfo periodInfo;
    final VideoEngineTimeline this$0;

    public long getDuration()
    {
        return periodInfo.duration;
    }

    public long getLocalEndTime()
    {
        return getLocalStartTime() + getDuration();
    }

    public long getLocalStartTime()
    {
        return periodInfo.localStartTime;
    }

    public int getPeriodIndex()
    {
        return periodIndex;
    }

    public long getVirtualTime()
    {
        return periodInfo.virtualStartTime;
    }

    public (int i, PeriodInfo periodinfo)
    {
        this$0 = VideoEngineTimeline.this;
        super();
        periodIndex = i;
        periodInfo = periodinfo;
    }
}
