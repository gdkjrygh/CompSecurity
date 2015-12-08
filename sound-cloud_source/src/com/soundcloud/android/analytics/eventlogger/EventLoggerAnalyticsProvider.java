// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.eventlogger;

import android.content.Context;
import android.content.SharedPreferences;
import com.soundcloud.android.analytics.AnalyticsProvider;
import com.soundcloud.android.analytics.EventTracker;
import com.soundcloud.android.analytics.TrackingRecord;
import com.soundcloud.android.events.ActivityLifeCycleEvent;
import com.soundcloud.android.events.AdOverlayTrackingEvent;
import com.soundcloud.android.events.CollectionEvent;
import com.soundcloud.android.events.CurrentUserChangedEvent;
import com.soundcloud.android.events.ForegroundEvent;
import com.soundcloud.android.events.MidTierTrackEvent;
import com.soundcloud.android.events.OnboardingEvent;
import com.soundcloud.android.events.PlaybackErrorEvent;
import com.soundcloud.android.events.PlaybackPerformanceEvent;
import com.soundcloud.android.events.PlaybackSessionEvent;
import com.soundcloud.android.events.PromotedTrackingEvent;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.events.SearchEvent;
import com.soundcloud.android.events.StreamNotificationEvent;
import com.soundcloud.android.events.TrackingEvent;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.events.UpgradeTrackingEvent;
import com.soundcloud.android.events.VisualAdImpressionEvent;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.properties.Flag;
import dagger.Lazy;

// Referenced classes of package com.soundcloud.android.analytics.eventlogger:
//            EventLoggerV1JsonDataBuilder, EventLoggerJsonDataBuilder

public class EventLoggerAnalyticsProvider
    implements AnalyticsProvider
{

    public static final String BATCH_BACKEND_NAME = "boogaloo";
    private final Lazy dataBuilderV0;
    private final Lazy dataBuilderV1;
    private final EventTracker eventTracker;
    private final FeatureFlags featureFlags;
    private final SharedPreferences sharedPreferences;

    public EventLoggerAnalyticsProvider(EventTracker eventtracker, Lazy lazy, Lazy lazy1, SharedPreferences sharedpreferences, FeatureFlags featureflags)
    {
        sharedPreferences = sharedpreferences;
        dataBuilderV0 = lazy;
        dataBuilderV1 = lazy1;
        eventTracker = eventtracker;
        featureFlags = featureflags;
    }

    private void handleCollectionEvent(CollectionEvent collectionevent)
    {
        trackEvent(collectionevent.getTimestamp(), ((EventLoggerV1JsonDataBuilder)dataBuilderV1.a()).buildForCollectionEvent(collectionevent));
    }

    private void handleForegroundEvent(ForegroundEvent foregroundevent)
    {
        trackEvent(foregroundevent.getTimestamp(), ((EventLoggerJsonDataBuilder)dataBuilderV0.a()).build(foregroundevent));
    }

    private void handleLeaveBehindTracking(AdOverlayTrackingEvent adoverlaytrackingevent)
    {
        String s = ((EventLoggerJsonDataBuilder)dataBuilderV0.a()).build(adoverlaytrackingevent);
        trackEvent(adoverlaytrackingevent.getTimestamp(), s);
    }

    private void handleMidTierTrackEvent(MidTierTrackEvent midtiertrackevent)
    {
        trackEvent(midtiertrackevent.getTimestamp(), ((EventLoggerJsonDataBuilder)dataBuilderV0.a()).build(midtiertrackevent));
    }

    private void handlePlaybackSessionEvent(PlaybackSessionEvent playbacksessionevent)
    {
        if (!playbacksessionevent.isAd()) goto _L2; else goto _L1
_L1:
        if (!playbacksessionevent.isFirstPlay()) goto _L4; else goto _L3
_L3:
        trackAudioAdImpression(playbacksessionevent);
_L2:
        trackAudioSessionEvent(playbacksessionevent);
        return;
_L4:
        if (playbacksessionevent.hasTrackFinished())
        {
            trackAudioAdFinished(playbacksessionevent);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    private void handlePromotedEvent(PromotedTrackingEvent promotedtrackingevent)
    {
        trackEvent(promotedtrackingevent.getTimestamp(), ((EventLoggerJsonDataBuilder)dataBuilderV0.a()).build(promotedtrackingevent));
    }

    private void handleScreenEvent(ScreenEvent screenevent)
    {
        trackEvent(screenevent.getTimestamp(), ((EventLoggerJsonDataBuilder)dataBuilderV0.a()).build(screenevent));
    }

    private void handleSearchEvent(SearchEvent searchevent)
    {
        String s;
        byte byte0;
        s = searchevent.getKind();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 44
    //                   -891535336: 87
    //                   1097546742: 73
    //                   1197722116: 101;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_101;
_L5:
        switch (byte0)
        {
        default:
            return;

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            trackEvent(searchevent.getTimestamp(), ((EventLoggerJsonDataBuilder)dataBuilderV0.a()).build(searchevent));
            break;
        }
        break MISSING_BLOCK_LABEL_139;
_L3:
        if (s.equals("results"))
        {
            byte0 = 0;
        }
          goto _L5
_L2:
        if (s.equals("submit"))
        {
            byte0 = 1;
        }
          goto _L5
        if (s.equals("suggestion"))
        {
            byte0 = 2;
        }
          goto _L5
    }

    private void handleStreamNotificationEvent(StreamNotificationEvent streamnotificationevent)
    {
        trackEvent(streamnotificationevent.getTimestamp(), ((EventLoggerV1JsonDataBuilder)dataBuilderV1.a()).buildForStreamNotification(streamnotificationevent));
    }

    private void handleUIEvent(UIEvent uievent)
    {
        String s;
        byte byte0;
        s = uievent.getKind();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 13: default 124
    //                   -1862180555: 352
    //                   -1649527408: 337
    //                   -934521517: 249
    //                   -840447568: 235
    //                   -204812427: 207
    //                   -48018132: 263
    //                   3321751: 221
    //                   109400031: 367
    //                   398433769: 322
    //                   430200156: 307
    //                   1230886069: 193
    //                   1872819778: 277
    //                   2036828995: 292;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
        break; /* Loop/switch isn't completed */
_L9:
        break MISSING_BLOCK_LABEL_367;
_L15:
        switch (byte0)
        {
        default:
            return;

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            trackEvent(uievent.getTimestamp(), ((EventLoggerJsonDataBuilder)dataBuilderV0.a()).build(uievent));
            return;

        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
            trackEvent(uievent.getTimestamp(), ((EventLoggerV1JsonDataBuilder)dataBuilderV1.a()).buildForUIEvent(uievent));
            break;
        }
        break MISSING_BLOCK_LABEL_431;
_L12:
        if (s.equals("audio_ad_click"))
        {
            byte0 = 0;
        }
          goto _L15
_L6:
        if (s.equals("skip_audio_ad_click"))
        {
            byte0 = 1;
        }
          goto _L15
_L8:
        if (s.equals("like"))
        {
            byte0 = 2;
        }
          goto _L15
_L5:
        if (s.equals("unlike"))
        {
            byte0 = 3;
        }
          goto _L15
_L4:
        if (s.equals("repost"))
        {
            byte0 = 4;
        }
          goto _L15
_L7:
        if (s.equals("unrepost"))
        {
            byte0 = 5;
        }
          goto _L15
_L13:
        if (s.equals("offline_likes_add"))
        {
            byte0 = 6;
        }
          goto _L15
_L14:
        if (s.equals("offline_likes_remove"))
        {
            byte0 = 7;
        }
          goto _L15
_L11:
        if (s.equals("offline_collection_add"))
        {
            byte0 = 8;
        }
          goto _L15
_L10:
        if (s.equals("offline_collection_remove"))
        {
            byte0 = 9;
        }
          goto _L15
_L3:
        if (s.equals("offline_playlist_add"))
        {
            byte0 = 10;
        }
          goto _L15
_L2:
        if (s.equals("offline_playlist_remove"))
        {
            byte0 = 11;
        }
          goto _L15
        if (s.equals("share"))
        {
            byte0 = 12;
        }
          goto _L15
    }

    private void handleUpsellEvent(UpgradeTrackingEvent upgradetrackingevent)
    {
        trackEvent(upgradetrackingevent.getTimestamp(), ((EventLoggerJsonDataBuilder)dataBuilderV0.a()).build(upgradetrackingevent));
    }

    private void handleVisualAdImpression(VisualAdImpressionEvent visualadimpressionevent)
    {
        trackEvent(visualadimpressionevent.getTimestamp(), ((EventLoggerJsonDataBuilder)dataBuilderV0.a()).build(visualadimpressionevent));
    }

    private void trackAudioAdFinished(PlaybackSessionEvent playbacksessionevent)
    {
        trackEvent(playbacksessionevent.getTimestamp(), ((EventLoggerJsonDataBuilder)dataBuilderV0.a()).buildForAdFinished(playbacksessionevent));
    }

    private void trackAudioAdImpression(PlaybackSessionEvent playbacksessionevent)
    {
        trackEvent(playbacksessionevent.getTimestamp(), ((EventLoggerJsonDataBuilder)dataBuilderV0.a()).buildForAudioAdImpression(playbacksessionevent));
    }

    private void trackAudioSessionEvent(PlaybackSessionEvent playbacksessionevent)
    {
        if (featureFlags.isEnabled(Flag.EVENTLOGGER_AUDIO_V1))
        {
            trackEvent(playbacksessionevent.getTimestamp(), ((EventLoggerV1JsonDataBuilder)dataBuilderV1.a()).buildForAudioEvent(playbacksessionevent));
            return;
        } else
        {
            trackEvent(playbacksessionevent.getTimestamp(), ((EventLoggerJsonDataBuilder)dataBuilderV0.a()).buildForAudioEvent(playbacksessionevent));
            return;
        }
    }

    private void trackEvent(long l, String s)
    {
        eventTracker.trackEvent(new TrackingRecord(l, "boogaloo", s));
        if (sharedPreferences.getBoolean("dev.flushEventloggerInstantly", false))
        {
            eventTracker.flush("boogaloo");
        }
    }

    public void flush()
    {
        eventTracker.flush("boogaloo");
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
        trackEvent(playbackerrorevent.getTimestamp(), ((EventLoggerJsonDataBuilder)dataBuilderV0.a()).build(playbackerrorevent));
    }

    public void handlePlaybackPerformanceEvent(PlaybackPerformanceEvent playbackperformanceevent)
    {
        trackEvent(playbackperformanceevent.getTimestamp(), ((EventLoggerJsonDataBuilder)dataBuilderV0.a()).build(playbackperformanceevent));
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
                handleLeaveBehindTracking((AdOverlayTrackingEvent)trackingevent);
                return;
            }
            if (trackingevent instanceof ScreenEvent)
            {
                handleScreenEvent((ScreenEvent)trackingevent);
                return;
            }
            if (trackingevent instanceof SearchEvent)
            {
                handleSearchEvent((SearchEvent)trackingevent);
                return;
            }
            if (trackingevent instanceof ForegroundEvent)
            {
                handleForegroundEvent((ForegroundEvent)trackingevent);
                return;
            }
            if (trackingevent instanceof PromotedTrackingEvent)
            {
                handlePromotedEvent((PromotedTrackingEvent)trackingevent);
                return;
            }
            if (trackingevent instanceof MidTierTrackEvent)
            {
                handleMidTierTrackEvent((MidTierTrackEvent)trackingevent);
                return;
            }
            if (trackingevent instanceof UpgradeTrackingEvent)
            {
                handleUpsellEvent((UpgradeTrackingEvent)trackingevent);
                return;
            }
            if (trackingevent instanceof StreamNotificationEvent)
            {
                handleStreamNotificationEvent((StreamNotificationEvent)trackingevent);
                return;
            }
            if (trackingevent instanceof CollectionEvent)
            {
                handleCollectionEvent((CollectionEvent)trackingevent);
                return;
            }
        }
    }

    public void onAppCreated(Context context)
    {
    }
}
