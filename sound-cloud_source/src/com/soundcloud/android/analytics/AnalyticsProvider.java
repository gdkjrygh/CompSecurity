// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import android.content.Context;
import com.soundcloud.android.events.ActivityLifeCycleEvent;
import com.soundcloud.android.events.CurrentUserChangedEvent;
import com.soundcloud.android.events.OnboardingEvent;
import com.soundcloud.android.events.PlaybackErrorEvent;
import com.soundcloud.android.events.PlaybackPerformanceEvent;
import com.soundcloud.android.events.TrackingEvent;

public interface AnalyticsProvider
{

    public abstract void flush();

    public abstract void handleActivityLifeCycleEvent(ActivityLifeCycleEvent activitylifecycleevent);

    public abstract void handleCurrentUserChangedEvent(CurrentUserChangedEvent currentuserchangedevent);

    public abstract void handleOnboardingEvent(OnboardingEvent onboardingevent);

    public abstract void handlePlaybackErrorEvent(PlaybackErrorEvent playbackerrorevent);

    public abstract void handlePlaybackPerformanceEvent(PlaybackPerformanceEvent playbackperformanceevent);

    public abstract void handleTrackingEvent(TrackingEvent trackingevent);

    public abstract void onAppCreated(Context context);
}
