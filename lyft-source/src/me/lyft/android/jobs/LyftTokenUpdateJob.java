// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import me.lyft.android.ILyftPreferences;
import me.lyft.android.analytics.Analytics;
import me.lyft.android.analytics.DeveloperEvent;
import me.lyft.android.common.Strings;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class LyftTokenUpdateJob
    implements Job
{

    private final String lyftToken;
    ILyftPreferences preferences;

    public LyftTokenUpdateJob(String s)
    {
        lyftToken = s;
    }

    public void execute()
    {
        if (!Strings.isNullOrEmpty(lyftToken))
        {
            preferences.setLyftToken(lyftToken);
            return;
        } else
        {
            Analytics.track(new DeveloperEvent("server_sent_null_token"));
            return;
        }
    }
}
