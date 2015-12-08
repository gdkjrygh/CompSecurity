// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.playcounts;

import android.content.Context;
import com.soundcloud.android.analytics.AnalyticsProvider;
import com.soundcloud.android.analytics.EventTracker;
import com.soundcloud.android.analytics.TrackingRecord;
import com.soundcloud.android.events.ActivityLifeCycleEvent;
import com.soundcloud.android.events.CurrentUserChangedEvent;
import com.soundcloud.android.events.OnboardingEvent;
import com.soundcloud.android.events.PlaybackErrorEvent;
import com.soundcloud.android.events.PlaybackPerformanceEvent;
import com.soundcloud.android.events.PlaybackSessionEvent;
import com.soundcloud.android.events.TrackingEvent;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.properties.Flag;

// Referenced classes of package com.soundcloud.android.analytics.playcounts:
//            PlayCountUrlBuilder

public class PlayCountAnalyticsProvider
    implements AnalyticsProvider
{

    public static final String BACKEND_NAME = "play_counts";
    private final EventTracker eventTracker;
    private final FeatureFlags featureFlags;
    private final PlayCountUrlBuilder urlBuilder;

    public PlayCountAnalyticsProvider(EventTracker eventtracker, PlayCountUrlBuilder playcounturlbuilder, FeatureFlags featureflags)
    {
        eventTracker = eventtracker;
        urlBuilder = playcounturlbuilder;
        featureFlags = featureflags;
    }

    private void handlePlaybackSessionEvent(PlaybackSessionEvent playbacksessionevent)
    {
        if (playbacksessionevent.isFirstPlay())
        {
            String s = urlBuilder.buildUrl(playbacksessionevent);
            playbacksessionevent = new TrackingRecord(playbacksessionevent.getTimestamp(), "play_counts", s);
            eventTracker.trackEvent(playbacksessionevent);
            eventTracker.flush("play_counts");
        }
    }

    public void flush()
    {
        eventTracker.flush("play_counts");
    }

    public void handleActivityLifeCycleEvent(ActivityLifeCycleEvent activitylifecycleevent)
    {
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
        if ((trackingevent instanceof PlaybackSessionEvent) && featureFlags.isDisabled(Flag.EVENTLOGGER_AUDIO_V1))
        {
            handlePlaybackSessionEvent((PlaybackSessionEvent)trackingevent);
        }
    }

    public void onAppCreated(Context context)
    {
    }
}
