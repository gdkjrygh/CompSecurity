// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.promoted;

import android.content.Context;
import com.soundcloud.android.analytics.AnalyticsProvider;
import com.soundcloud.android.analytics.EventTracker;
import com.soundcloud.android.analytics.TrackingRecord;
import com.soundcloud.android.events.ActivityLifeCycleEvent;
import com.soundcloud.android.events.AdOverlayTrackingEvent;
import com.soundcloud.android.events.CurrentUserChangedEvent;
import com.soundcloud.android.events.OnboardingEvent;
import com.soundcloud.android.events.PlaybackErrorEvent;
import com.soundcloud.android.events.PlaybackPerformanceEvent;
import com.soundcloud.android.events.PlaybackSessionEvent;
import com.soundcloud.android.events.PromotedTrackingEvent;
import com.soundcloud.android.events.TrackingEvent;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.events.VisualAdImpressionEvent;
import java.util.Iterator;
import java.util.List;

public class PromotedAnalyticsProvider
    implements AnalyticsProvider
{

    public static final String BACKEND_NAME = "promoted";
    private final EventTracker eventTracker;

    public PromotedAnalyticsProvider(EventTracker eventtracker)
    {
        eventTracker = eventtracker;
    }

    private void handleLeaveBehindImpression(AdOverlayTrackingEvent adoverlaytrackingevent)
    {
        trackAllUrls(adoverlaytrackingevent.getTimestamp(), adoverlaytrackingevent.getTrackingUrls());
    }

    private void handlePlaybackSessionEvent(PlaybackSessionEvent playbacksessionevent)
    {
        if (!playbacksessionevent.isAd()) goto _L2; else goto _L1
_L1:
        if (!playbacksessionevent.isFirstPlay()) goto _L4; else goto _L3
_L3:
        trackAllUrls(playbacksessionevent.getTimestamp(), playbacksessionevent.getAudioAdImpressionUrls());
_L6:
        return;
_L4:
        if (playbacksessionevent.hasTrackFinished())
        {
            trackAllUrls(playbacksessionevent.getTimestamp(), playbacksessionevent.getAudioAdFinishUrls());
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (playbacksessionevent.isPromotedTrack() && playbacksessionevent.isFirstPlay())
        {
            trackAllUrls(playbacksessionevent.getTimestamp(), playbacksessionevent.getPromotedPlayUrls());
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void handlePromotedTrackEvent(PromotedTrackingEvent promotedtrackingevent)
    {
        trackAllUrls(promotedtrackingevent.getTimestamp(), promotedtrackingevent.getTrackingUrls());
    }

    private void handleUIEvent(UIEvent uievent)
    {
        Object obj;
        byte byte0;
        obj = uievent.getKind();
        byte0 = -1;
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 2: default 36
    //                   -204812427: 75
    //                   1230886069: 61;
           goto _L1 _L2 _L3
_L1:
        byte0;
        JVM INSTR tableswitch 0 1: default 60
    //                   0 89
    //                   1 104;
           goto _L4 _L5 _L6
_L4:
        return;
_L3:
        if (((String) (obj)).equals("audio_ad_click"))
        {
            byte0 = 0;
        }
          goto _L1
_L2:
        if (((String) (obj)).equals("skip_audio_ad_click"))
        {
            byte0 = 1;
        }
          goto _L1
_L5:
        obj = uievent.getAudioAdClickthroughUrls();
_L8:
        trackAllUrls(uievent.getTimestamp(), ((List) (obj)));
        return;
_L6:
        obj = uievent.getAudioAdSkipUrls();
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void handleVisualAdImpression(VisualAdImpressionEvent visualadimpressionevent)
    {
        trackAllUrls(visualadimpressionevent.getTimestamp(), visualadimpressionevent.getImpressionUrls());
    }

    private void trackAllUrls(long l, List list)
    {
        String s;
        for (list = list.iterator(); list.hasNext(); eventTracker.trackEvent(new TrackingRecord(l, "promoted", s)))
        {
            s = (String)list.next();
        }

        eventTracker.flush("promoted");
    }

    public void flush()
    {
        eventTracker.flush("promoted");
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
        if (trackingevent instanceof PlaybackSessionEvent)
        {
            handlePlaybackSessionEvent((PlaybackSessionEvent)trackingevent);
        } else
        {
            if (trackingevent instanceof UIEvent)
            {
                handleUIEvent((UIEvent)trackingevent);
                return;
            }
            if (trackingevent instanceof VisualAdImpressionEvent)
            {
                handleVisualAdImpression((VisualAdImpressionEvent)trackingevent);
                return;
            }
            if (trackingevent instanceof AdOverlayTrackingEvent)
            {
                handleLeaveBehindImpression((AdOverlayTrackingEvent)trackingevent);
                return;
            }
            if (trackingevent instanceof PromotedTrackingEvent)
            {
                handlePromotedTrackEvent((PromotedTrackingEvent)trackingevent);
                return;
            }
        }
    }

    public void onAppCreated(Context context)
    {
    }
}
