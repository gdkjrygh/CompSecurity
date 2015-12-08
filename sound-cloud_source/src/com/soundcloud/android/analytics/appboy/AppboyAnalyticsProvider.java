// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.appboy;

import android.content.Context;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.analytics.AnalyticsProvider;
import com.soundcloud.android.events.ActivityLifeCycleEvent;
import com.soundcloud.android.events.AttributionEvent;
import com.soundcloud.android.events.CurrentUserChangedEvent;
import com.soundcloud.android.events.OnboardingEvent;
import com.soundcloud.android.events.PlaybackErrorEvent;
import com.soundcloud.android.events.PlaybackPerformanceEvent;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.events.SearchEvent;
import com.soundcloud.android.events.TrackingEvent;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.users.UserProperty;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.analytics.appboy:
//            AppboyEventHandler, AppboyWrapper

public class AppboyAnalyticsProvider
    implements AnalyticsProvider
{

    private final AppboyWrapper appboy;
    private final AppboyEventHandler eventHandler;

    public AppboyAnalyticsProvider(AppboyWrapper appboywrapper, AccountOperations accountoperations)
    {
        appboy = appboywrapper;
        eventHandler = new AppboyEventHandler(appboywrapper);
        changeUser(accountoperations.getLoggedInUserUrn());
    }

    private void changeUser(Urn urn)
    {
        if (urn.getNumericId() > 0L)
        {
            appboy.changeUser(urn.toString());
        }
    }

    public void flush()
    {
        appboy.requestImmediateDataFlush();
    }

    public void handleActivityLifeCycleEvent(ActivityLifeCycleEvent activitylifecycleevent)
    {
    }

    public void handleCurrentUserChangedEvent(CurrentUserChangedEvent currentuserchangedevent)
    {
        if (currentuserchangedevent.getKind() == 0)
        {
            currentuserchangedevent = currentuserchangedevent.getCurrentUser();
            if (currentuserchangedevent != null)
            {
                changeUser((Urn)currentuserchangedevent.get(UserProperty.URN));
            }
        }
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
        if (trackingevent instanceof UIEvent)
        {
            eventHandler.handleEvent((UIEvent)trackingevent);
        } else
        {
            if (trackingevent instanceof ScreenEvent)
            {
                eventHandler.handleEvent((ScreenEvent)trackingevent);
                return;
            }
            if (trackingevent instanceof SearchEvent)
            {
                eventHandler.handleEvent((SearchEvent)trackingevent);
                return;
            }
            if (trackingevent instanceof AttributionEvent)
            {
                eventHandler.handleEvent((AttributionEvent)trackingevent);
                return;
            }
        }
    }

    public void onAppCreated(Context context)
    {
        appboy.setAppboyEndpointProvider(context.getString(0x7f07028f));
    }
}
