// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import me.lyft.android.ILyftPreferences;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class PollingRateChangedJob
    implements Job
{

    private final long pollingRate;
    ILyftPreferences preferences;

    public PollingRateChangedJob(Long long1)
    {
        pollingRate = long1.longValue();
    }

    public void execute()
    {
        long l = 1000L;
        long l2 = preferences.getPollingRate();
        long l1 = pollingRate;
        if (l1 >= 1000L)
        {
            l = l1;
        }
        if (l2 != l)
        {
            preferences.setPollingRate(Long.valueOf(l));
        }
    }
}
