// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.comscore;

import android.content.Context;
import com.comscore.analytics.comScore;
import com.soundcloud.android.analytics.AnalyticsProvider;
import com.soundcloud.android.events.ActivityLifeCycleEvent;
import com.soundcloud.android.events.CurrentUserChangedEvent;
import com.soundcloud.android.events.OnboardingEvent;
import com.soundcloud.android.events.PlaybackErrorEvent;
import com.soundcloud.android.events.PlaybackPerformanceEvent;
import com.soundcloud.android.events.PlaybackSessionEvent;
import com.soundcloud.android.events.TrackingEvent;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ComScoreAnalyticsProvider
    implements AnalyticsProvider
{

    public static final boolean AUTO_UPDATE_IN_BACKGROUND = false;
    public static final int ONE_MINUTE = 60;
    private final Executor executor = Executors.newSingleThreadExecutor();

    public ComScoreAnalyticsProvider(Context context)
    {
        comScore.setAppContext(context.getApplicationContext());
        comScore.setCustomerC2(context.getString(0x7f070290));
        comScore.setPublisherSecret(context.getString(0x7f070291));
        comScore.enableAutoUpdate(60, false);
    }

    private void handlePlaybackSessionEvent(final PlaybackSessionEvent event)
    {
        executor.execute(new _cls3());
    }

    public void flush()
    {
        executor.execute(new _cls1());
    }

    public void handleActivityLifeCycleEvent(final ActivityLifeCycleEvent event)
    {
        executor.execute(new _cls2());
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
        if (trackingevent instanceof PlaybackSessionEvent)
        {
            handlePlaybackSessionEvent((PlaybackSessionEvent)trackingevent);
        }
    }

    public void onAppCreated(Context context)
    {
    }

    private class _cls3
        implements Runnable
    {

        final ComScoreAnalyticsProvider this$0;
        final PlaybackSessionEvent val$event;

        public void run()
        {
            if (event.isPlayEvent())
            {
                comScore.onUxActive();
            } else
            if (event.isStopEvent())
            {
                comScore.onUxInactive();
                return;
            }
        }

        _cls3()
        {
            this$0 = ComScoreAnalyticsProvider.this;
            event = playbacksessionevent;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final ComScoreAnalyticsProvider this$0;

        public void run()
        {
            comScore.flushCache();
        }

        _cls1()
        {
            this$0 = ComScoreAnalyticsProvider.this;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final ComScoreAnalyticsProvider this$0;
        final ActivityLifeCycleEvent val$event;

        public void run()
        {
            if (event.getKind() == 0)
            {
                comScore.onEnterForeground();
            } else
            if (event.getKind() == 2)
            {
                comScore.onExitForeground();
                return;
            }
        }

        _cls2()
        {
            this$0 = ComScoreAnalyticsProvider.this;
            event = activitylifecycleevent;
            super();
        }
    }

}
