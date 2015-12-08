// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.studies;

import me.lyft.android.analytics.Analytics;
import me.lyft.android.analytics.Event;
import me.lyft.android.analytics.RedshiftTrackerExtra;
import me.lyft.android.analytics.definitions.EventName;
import me.lyft.android.analytics.definitions.Parameter;
import me.lyft.android.common.Strings;

public class PushNotificationAnalytics
{

    public PushNotificationAnalytics()
    {
    }

    public static void trackPushReceived(String s, String s1)
    {
        if (!Strings.isNullOrEmpty(s))
        {
            Analytics.track((new Event(EventName.PUSH_RECEIVED)).putParameter(Parameter.PUSH_ID, s).putParameter(Parameter.SOURCE, s1).addTracker(RedshiftTrackerExtra.create()));
        }
    }
}
