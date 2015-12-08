// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.trackers;

import com.google.android.gms.analytics.Tracker;
import me.lyft.android.analytics.GoogleTrackerExtra;
import me.lyft.android.analytics.IEvent;
import me.lyft.android.analytics.IEventTracker;
import me.lyft.android.common.Strings;

public class GoogleEventTracker
    implements IEventTracker
{

    private final Tracker googleTracker;

    GoogleEventTracker(Tracker tracker)
    {
        googleTracker = tracker;
    }

    public static GoogleTrackerExtra createExtra(String s)
    {
        return new GoogleTrackerExtra(s);
    }

    private void trackEvent(IEvent ievent, GoogleTrackerExtra googletrackerextra)
    {
        ievent = (new com.google.android.gms.analytics.HitBuilders.EventBuilder()).b(ievent.getName()).a(googletrackerextra.getCategory());
        if (!Strings.isNullOrEmpty(googletrackerextra.getLabel()))
        {
            ievent.c(googletrackerextra.getLabel());
        }
        if (googletrackerextra.getValue() != null)
        {
            ievent.a(googletrackerextra.getValue().longValue());
        }
        googleTracker.a(ievent.a());
    }

    private void trackScreenEvent(me.lyft.android.analytics.ScreenAnalytics.ScreenViewEvent screenviewevent)
    {
        googleTracker.a(screenviewevent.getPage());
        googleTracker.a((new com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder()).a());
    }

    public void flush()
    {
    }

    public void track(IEvent ievent)
    {
        GoogleTrackerExtra googletrackerextra = (GoogleTrackerExtra)ievent.getExtra(me/lyft/android/analytics/GoogleTrackerExtra);
        if (googletrackerextra != null)
        {
            trackEvent(ievent, googletrackerextra);
        } else
        if (ievent instanceof me.lyft.android.analytics.ScreenAnalytics.ScreenViewEvent)
        {
            trackScreenEvent((me.lyft.android.analytics.ScreenAnalytics.ScreenViewEvent)ievent);
            return;
        }
    }
}
