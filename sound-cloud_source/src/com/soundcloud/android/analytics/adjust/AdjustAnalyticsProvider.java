// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.adjust;

import android.content.Context;
import com.soundcloud.android.analytics.AnalyticsProvider;
import com.soundcloud.android.events.ActivityLifeCycleEvent;
import com.soundcloud.android.events.CurrentUserChangedEvent;
import com.soundcloud.android.events.OnboardingEvent;
import com.soundcloud.android.events.PlaybackErrorEvent;
import com.soundcloud.android.events.PlaybackPerformanceEvent;
import com.soundcloud.android.events.TrackingEvent;

// Referenced classes of package com.soundcloud.android.analytics.adjust:
//            AdjustWrapper

public class AdjustAnalyticsProvider
    implements AnalyticsProvider
{

    private final AdjustWrapper adjustWrapper;

    public AdjustAnalyticsProvider(AdjustWrapper adjustwrapper)
    {
        adjustWrapper = adjustwrapper;
    }

    public void flush()
    {
    }

    public void handleActivityLifeCycleEvent(ActivityLifeCycleEvent activitylifecycleevent)
    {
        if (activitylifecycleevent.getKind() == 0)
        {
            adjustWrapper.onResume();
        } else
        if (activitylifecycleevent.getKind() == 2)
        {
            adjustWrapper.onPause();
            return;
        }
    }

    public void handleCurrentUserChangedEvent(CurrentUserChangedEvent currentuserchangedevent)
    {
    }

    public void handleOnboardingEvent(OnboardingEvent onboardingevent)
    {
    }

    public void handlePlaybackErrorEvent(PlaybackErrorEvent playbackerrorevent)
    {
    }

    public void handlePlaybackPerformanceEvent(PlaybackPerformanceEvent playbackperformanceevent)
    {
    }

    public void handleTrackingEvent(TrackingEvent trackingevent)
    {
    }

    public void onAppCreated(Context context)
    {
        adjustWrapper.onCreate(context);
    }
}
