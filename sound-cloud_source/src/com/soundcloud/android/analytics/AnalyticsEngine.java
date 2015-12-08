// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import com.soundcloud.android.events.ActivityLifeCycleEvent;
import com.soundcloud.android.events.CurrentUserChangedEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.OnboardingEvent;
import com.soundcloud.android.events.PlaybackErrorEvent;
import com.soundcloud.android.events.PlaybackPerformanceEvent;
import com.soundcloud.android.events.TrackingEvent;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.R;
import rx.a.b.a;
import rx.h.b;

// Referenced classes of package com.soundcloud.android.analytics:
//            AnalyticsProviderFactory, AnalyticsProvider

public class AnalyticsEngine
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
{
    private final class ActivityEventSubscriber extends EventSubscriber
    {

        final AnalyticsEngine this$0;

        protected final void handleEvent(AnalyticsProvider analyticsprovider, ActivityLifeCycleEvent activitylifecycleevent)
        {
            analyticsprovider.handleActivityLifeCycleEvent(activitylifecycleevent);
        }

        protected final volatile void handleEvent(AnalyticsProvider analyticsprovider, Object obj)
        {
            handleEvent(analyticsprovider, (ActivityLifeCycleEvent)obj);
        }

        private ActivityEventSubscriber()
        {
            this$0 = AnalyticsEngine.this;
            super(null);
        }

        ActivityEventSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private abstract class EventSubscriber extends DefaultSubscriber
    {

        final AnalyticsEngine this$0;

        protected abstract void handleEvent(AnalyticsProvider analyticsprovider, Object obj);

        public void onNext(Object obj)
        {
            (new StringBuilder("Track event ")).append(obj);
            if (obj instanceof OnboardingEvent)
            {
                ErrorUtils.log(4, "ScOnboarding", (new StringBuilder("onboarding event published: ")).append(obj).toString());
            }
            for (Iterator iterator = analyticsProviders.iterator(); iterator.hasNext();)
            {
                AnalyticsProvider analyticsprovider = (AnalyticsProvider)iterator.next();
                try
                {
                    handleEvent(analyticsprovider, obj);
                }
                catch (Throwable throwable)
                {
                    handleProviderError(throwable, analyticsprovider, getClass().getSimpleName());
                }
            }

            scheduleFlush();
        }

        private EventSubscriber()
        {
            this$0 = AnalyticsEngine.this;
            super();
        }

        EventSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private final class OnboardEventSubscriber extends EventSubscriber
    {

        final AnalyticsEngine this$0;

        protected final void handleEvent(AnalyticsProvider analyticsprovider, OnboardingEvent onboardingevent)
        {
            analyticsprovider.handleOnboardingEvent(onboardingevent);
        }

        protected final volatile void handleEvent(AnalyticsProvider analyticsprovider, Object obj)
        {
            handleEvent(analyticsprovider, (OnboardingEvent)obj);
        }

        private OnboardEventSubscriber()
        {
            this$0 = AnalyticsEngine.this;
            super(null);
        }

        OnboardEventSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private final class PlaybackErrorEventSubscriber extends EventSubscriber
    {

        final AnalyticsEngine this$0;

        protected final void handleEvent(AnalyticsProvider analyticsprovider, PlaybackErrorEvent playbackerrorevent)
        {
            analyticsprovider.handlePlaybackErrorEvent(playbackerrorevent);
        }

        protected final volatile void handleEvent(AnalyticsProvider analyticsprovider, Object obj)
        {
            handleEvent(analyticsprovider, (PlaybackErrorEvent)obj);
        }

        private PlaybackErrorEventSubscriber()
        {
            this$0 = AnalyticsEngine.this;
            super(null);
        }

        PlaybackErrorEventSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private final class PlaybackPerformanceEventSubscriber extends EventSubscriber
    {

        final AnalyticsEngine this$0;

        protected final void handleEvent(AnalyticsProvider analyticsprovider, PlaybackPerformanceEvent playbackperformanceevent)
        {
            analyticsprovider.handlePlaybackPerformanceEvent(playbackperformanceevent);
        }

        protected final volatile void handleEvent(AnalyticsProvider analyticsprovider, Object obj)
        {
            handleEvent(analyticsprovider, (PlaybackPerformanceEvent)obj);
        }

        private PlaybackPerformanceEventSubscriber()
        {
            this$0 = AnalyticsEngine.this;
            super(null);
        }

        PlaybackPerformanceEventSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private final class TrackingEventSubscriber extends EventSubscriber
    {

        final AnalyticsEngine this$0;

        protected final void handleEvent(AnalyticsProvider analyticsprovider, TrackingEvent trackingevent)
        {
            analyticsprovider.handleTrackingEvent(trackingevent);
        }

        protected final volatile void handleEvent(AnalyticsProvider analyticsprovider, Object obj)
        {
            handleEvent(analyticsprovider, (TrackingEvent)obj);
        }

        private TrackingEventSubscriber()
        {
            this$0 = AnalyticsEngine.this;
            super(null);
        }

        TrackingEventSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private final class UserEventSubscriber extends EventSubscriber
    {

        final AnalyticsEngine this$0;

        protected final void handleEvent(AnalyticsProvider analyticsprovider, CurrentUserChangedEvent currentuserchangedevent)
        {
            analyticsprovider.handleCurrentUserChangedEvent(currentuserchangedevent);
        }

        protected final volatile void handleEvent(AnalyticsProvider analyticsprovider, Object obj)
        {
            handleEvent(analyticsprovider, (CurrentUserChangedEvent)obj);
        }

        private UserEventSubscriber()
        {
            this$0 = AnalyticsEngine.this;
            super(null);
        }

        UserEventSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    static final long FLUSH_DELAY_SECONDS = 120L;
    private final AnalyticsProviderFactory analyticsProviderFactory;
    private Collection analyticsProviders;
    private final EventBus eventBus;
    private final rx.b.a flushAction;
    private AtomicBoolean pendingFlush;
    private final R scheduler;

    public AnalyticsEngine(EventBus eventbus, SharedPreferences sharedpreferences, AnalyticsProviderFactory analyticsproviderfactory)
    {
        this(eventbus, sharedpreferences, a.a(), analyticsproviderfactory);
    }

    protected AnalyticsEngine(EventBus eventbus, SharedPreferences sharedpreferences, R r, AnalyticsProviderFactory analyticsproviderfactory)
    {
        pendingFlush = new AtomicBoolean(true);
        flushAction = new _cls1();
        analyticsProviderFactory = analyticsproviderfactory;
        analyticsProviders = analyticsproviderfactory.getProviders();
        eventBus = eventbus;
        scheduler = r;
        sharedpreferences.registerOnSharedPreferenceChangeListener(this);
        subscribeEventQueues();
    }

    private void handleProviderError(Throwable throwable, AnalyticsProvider analyticsprovider, String s)
    {
        ErrorUtils.handleSilentException(String.format("exception while processing %s for provider %s, with error = %s", new Object[] {
            s, analyticsprovider.getClass(), throwable.toString()
        }), throwable);
    }

    private void scheduleFlush()
    {
        if (pendingFlush.getAndSet(false))
        {
            scheduler.a().a(flushAction, 120L, TimeUnit.SECONDS);
        }
    }

    private void subscribeEventQueues()
    {
        b b1 = new b();
        b1.a(eventBus.subscribe(EventQueue.TRACKING, new TrackingEventSubscriber(null)));
        b1.a(eventBus.subscribe(EventQueue.PLAYBACK_PERFORMANCE, new PlaybackPerformanceEventSubscriber(null)));
        b1.a(eventBus.subscribe(EventQueue.PLAYBACK_ERROR, new PlaybackErrorEventSubscriber(null)));
        b1.a(eventBus.subscribe(EventQueue.ONBOARDING, new OnboardEventSubscriber(null)));
        b1.a(eventBus.subscribe(EventQueue.ACTIVITY_LIFE_CYCLE, new ActivityEventSubscriber(null)));
        b1.a(eventBus.subscribe(EventQueue.CURRENT_USER_CHANGED, new UserEventSubscriber(null)));
    }

    public void onAppCreated(Context context)
    {
        for (Iterator iterator = analyticsProviders.iterator(); iterator.hasNext(); ((AnalyticsProvider)iterator.next()).onAppCreated(context)) { }
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        if ("analytics_enabled".equals(s))
        {
            analyticsProviders = analyticsProviderFactory.getProviders();
        }
    }





    private class _cls1
        implements rx.b.a
    {

        final AnalyticsEngine this$0;

        public void call()
        {
            for (Iterator iterator = analyticsProviders.iterator(); iterator.hasNext(); ((AnalyticsProvider)iterator.next()).flush()) { }
            pendingFlush.set(true);
        }

        _cls1()
        {
            this$0 = AnalyticsEngine.this;
            super();
        }
    }

}
