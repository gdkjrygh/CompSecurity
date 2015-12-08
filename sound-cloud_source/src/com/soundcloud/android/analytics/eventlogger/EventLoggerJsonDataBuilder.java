// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.eventlogger;

import android.content.res.Resources;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.analytics.SearchQuerySourceInfo;
import com.soundcloud.android.api.ApiMapperException;
import com.soundcloud.android.api.json.JsonTransformer;
import com.soundcloud.android.configuration.experiments.ExperimentOperations;
import com.soundcloud.android.events.AdOverlayTrackingEvent;
import com.soundcloud.android.events.ConnectionType;
import com.soundcloud.android.events.ForegroundEvent;
import com.soundcloud.android.events.MidTierTrackEvent;
import com.soundcloud.android.events.PlaybackErrorEvent;
import com.soundcloud.android.events.PlaybackPerformanceEvent;
import com.soundcloud.android.events.PlaybackSessionEvent;
import com.soundcloud.android.events.PlayerType;
import com.soundcloud.android.events.PromotedTrackingEvent;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.events.SearchEvent;
import com.soundcloud.android.events.TrackingEvent;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.events.UpgradeTrackingEvent;
import com.soundcloud.android.events.VisualAdImpressionEvent;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlaybackProtocol;
import com.soundcloud.android.playback.TrackSourceInfo;
import com.soundcloud.android.utils.DeviceHelper;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.analytics.eventlogger:
//            EventLoggerEventData

public class EventLoggerJsonDataBuilder
{

    private static final String AUDIO_ERROR_EVENT = "audio_error";
    private static final String AUDIO_EVENT = "audio";
    private static final String AUDIO_PERFORMANCE_EVENT = "audio_performance";
    private static final String BOOGALOO_VERSION = "v0.0.0";
    private static final String CLICK_EVENT = "click";
    private static final String FOREGROUND_EVENT = "foreground";
    private static final String IMPRESSION_EVENT = "impression";
    private static final String MONETIZATION_TYPE_AUDIO_AD = "audio_ad";
    private static final String PAGEVIEW_EVENT = "pageview";
    protected final AccountOperations accountOperations;
    protected final int appId;
    protected final DeviceHelper deviceHelper;
    protected final ExperimentOperations experimentOperations;
    private final JsonTransformer jsonTransformer;

    public EventLoggerJsonDataBuilder(Resources resources, ExperimentOperations experimentoperations, DeviceHelper devicehelper, AccountOperations accountoperations, JsonTransformer jsontransformer)
    {
        accountOperations = accountoperations;
        appId = resources.getInteger(0x7f0a000e);
        experimentOperations = experimentoperations;
        deviceHelper = devicehelper;
        jsonTransformer = jsontransformer;
    }

    private void addExperiments(EventLoggerEventData eventloggereventdata)
    {
        java.util.Map.Entry entry;
        for (Iterator iterator = experimentOperations.getTrackingParams().entrySet().iterator(); iterator.hasNext(); eventloggereventdata.experiment((String)entry.getKey(), ((Integer)entry.getValue()).intValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

    }

    private EventLoggerEventData buildAudioAdFinishedEvent(PlaybackSessionEvent playbacksessionevent)
    {
        return buildBaseEvent("click", playbacksessionevent).adUrn(playbacksessionevent.get("ad_urn")).pageName(playbacksessionevent.getTrackSourceInfo().getOriginScreen()).clickObject(playbacksessionevent.getTrackUrn().toString()).clickName("ad::finish").monetizedObject(playbacksessionevent.get("monetizable_track_urn")).monetizationType("audio_ad");
    }

    private EventLoggerEventData buildAudioAdImpressionEvent(PlaybackSessionEvent playbacksessionevent)
    {
        return buildBaseEvent("impression", playbacksessionevent).adUrn(playbacksessionevent.get("ad_urn")).pageName(playbacksessionevent.getTrackSourceInfo().getOriginScreen()).impressionName("audio_ad_impression").impressionObject(playbacksessionevent.get("ad_track_urn")).monetizedObject(playbacksessionevent.get("monetizable_track_urn")).monetizationType("audio_ad");
    }

    private EventLoggerEventData buildAudioEvent(PlaybackSessionEvent playbacksessionevent)
    {
        Urn urn = playbacksessionevent.getTrackUrn();
        EventLoggerEventData eventloggereventdata = buildBaseEvent("audio", playbacksessionevent).pageName(playbacksessionevent.getTrackSourceInfo().getOriginScreen()).duration(playbacksessionevent.getDuration()).sound(getLegacyTrackUrn(urn.toString())).trigger(getTrigger(playbacksessionevent.getTrackSourceInfo())).protocol(playbacksessionevent.get("protocol")).playerType(playbacksessionevent.get("player_type")).connectionType(playbacksessionevent.get("connection_type")).adUrn(playbacksessionevent.get("ad_urn")).monetizedObject(playbacksessionevent.get("monetizable_track_urn")).monetizationType(playbacksessionevent.get("monetization_type")).promotedBy(playbacksessionevent.get("promoter_urn"));
        TrackSourceInfo tracksourceinfo = playbacksessionevent.getTrackSourceInfo();
        if (playbacksessionevent.isPlayEvent())
        {
            eventloggereventdata.action("play");
        } else
        {
            eventloggereventdata.action("stop");
            eventloggereventdata.reason(getStopReason(playbacksessionevent));
        }
        if (tracksourceinfo.hasSource())
        {
            eventloggereventdata.source(tracksourceinfo.getSource());
            eventloggereventdata.sourceVersion(tracksourceinfo.getSourceVersion());
        }
        if (tracksourceinfo.isFromPlaylist())
        {
            eventloggereventdata.playlistId(String.valueOf(tracksourceinfo.getCollectionUrn().getNumericId()));
            eventloggereventdata.playlistPositionV0(String.valueOf(tracksourceinfo.getPlaylistPosition()));
        }
        if (tracksourceinfo.isFromSearchQuery())
        {
            playbacksessionevent = tracksourceinfo.getSearchQuerySourceInfo();
            eventloggereventdata.queryUrn(playbacksessionevent.getQueryUrn().toString());
            eventloggereventdata.queryPosition(playbacksessionevent.getUpdatedResultPosition(urn));
        }
        return eventloggereventdata;
    }

    private EventLoggerEventData buildBaseEvent(String s, long l)
    {
        s = new EventLoggerEventData(s, "v0.0.0", appId, getAnonymousId(), getUserUrn(), l);
        addExperiments(s);
        return s;
    }

    private EventLoggerEventData buildBaseEvent(String s, TrackingEvent trackingevent)
    {
        return buildBaseEvent(s, trackingevent.getTimestamp());
    }

    private EventLoggerEventData buildPlaybackErrorEvent(PlaybackErrorEvent playbackerrorevent)
    {
        return buildBaseEvent("audio_error", playbackerrorevent.getTimestamp()).protocol(playbackerrorevent.getProtocol().getValue()).os(deviceHelper.getUserAgent()).bitrate(playbackerrorevent.getBitrate()).format(playbackerrorevent.getFormat()).url(playbackerrorevent.getCdnHost()).errorCode(playbackerrorevent.getCategory()).connectionType(playbackerrorevent.getConnectionType().getValue());
    }

    private EventLoggerEventData buildPlaybackPerformanceEvent(PlaybackPerformanceEvent playbackperformanceevent)
    {
        return buildBaseEvent("audio_performance", playbackperformanceevent.getTimestamp()).latency(playbackperformanceevent.getMetricValue()).protocol(playbackperformanceevent.getProtocol().getValue()).playerType(playbackperformanceevent.getPlayerType().getValue()).type(getPerformanceEventType(playbackperformanceevent.getMetric())).host(playbackperformanceevent.getCdnHost()).connectionType(playbackperformanceevent.getConnectionType().getValue());
    }

    private String getAnonymousId()
    {
        return deviceHelper.getUdid();
    }

    private EventLoggerEventData getAudioAdClickEvent(UIEvent uievent)
    {
        return buildBaseEvent("click", uievent).pageName(uievent.get("origin_screen")).clickName("clickthrough::companion_display").clickTarget(uievent.get("click_through")).clickObject(uievent.get("click_object_urn")).adUrn(uievent.get("ad_urn")).monetizedObject(uievent.get("monetizable_track_urn")).monetizationType("audio_ad").externalMedia(uievent.get("ad_artwork_url"));
    }

    private EventLoggerEventData getAudioAdClickThroughEvent(AdOverlayTrackingEvent adoverlaytrackingevent)
    {
        return buildBaseEvent("click", adoverlaytrackingevent).adUrn(adoverlaytrackingevent.get("ad_urn")).pageName(adoverlaytrackingevent.get("origin_screen")).clickTarget(adoverlaytrackingevent.get("click_through")).clickObject(adoverlaytrackingevent.get("click_object_urn")).clickName((new StringBuilder("clickthrough::")).append(adoverlaytrackingevent.get("ad_type")).toString()).externalMedia(adoverlaytrackingevent.get("ad_artwork_url")).monetizedObject(adoverlaytrackingevent.get("monetizable_track_urn")).monetizationType(adoverlaytrackingevent.get("monetization_type"));
    }

    private EventLoggerEventData getAudioAdImpressionEvent(AdOverlayTrackingEvent adoverlaytrackingevent)
    {
        return buildBaseEvent("impression", adoverlaytrackingevent).adUrn(adoverlaytrackingevent.get("ad_urn")).pageName(adoverlaytrackingevent.get("origin_screen")).externalMedia(adoverlaytrackingevent.get("ad_artwork_url")).impressionName(adoverlaytrackingevent.get("ad_type")).impressionObject(adoverlaytrackingevent.get("ad_track_urn")).monetizedObject(adoverlaytrackingevent.get("monetizable_track_urn")).monetizationType(adoverlaytrackingevent.get("monetization_type"));
    }

    private EventLoggerEventData getAudioAdSkipClickEvent(UIEvent uievent)
    {
        return buildBaseEvent("click", uievent).pageName(uievent.get("origin_screen")).clickName("ad::skip").clickObject(uievent.get("click_object_urn")).adUrn(uievent.get("ad_urn")).monetizedObject(uievent.get("monetizable_track_urn")).monetizationType("audio_ad").externalMedia(uievent.get("ad_artwork_url"));
    }

    private EventLoggerEventData getEngagementEvent(String s, UIEvent uievent)
    {
        s = buildBaseEvent("click", uievent).adUrn(uievent.get("ad_urn")).pageName(uievent.get("origin_screen")).monetizationType(uievent.get("monetization_type")).promotedBy(uievent.get("promoter_urn")).clickName(s).clickObject(uievent.get("click_object_urn"));
        if (!uievent.get("page_urn").equals(Urn.NOT_SET.toString()))
        {
            s.pageUrn(uievent.get("page_urn"));
        }
        return s;
    }

    private String getLegacyTrackUrn(String s)
    {
        return s.replaceFirst(":tracks:", ":sounds:");
    }

    private String getPerformanceEventType(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unexpected metric type ")).append(i).toString());

        case 0: // '\0'
            return "play";

        case 1: // '\001'
            return "playlist";

        case 2: // '\002'
            return "buffer";

        case 3: // '\003'
            return "seek";

        case 4: // '\004'
            return "fragmentRate";

        case 5: // '\005'
            return "timeToLoadLibrary";

        case 6: // '\006'
            return "cacheUsage";

        case 7: // '\007'
            return "uninterruptedPlaytimeMs";
        }
    }

    private EventLoggerEventData getPromotedClickEvent(PromotedTrackingEvent promotedtrackingevent)
    {
        return buildBaseEvent("click", promotedtrackingevent).adUrn(promotedtrackingevent.get("ad_urn")).pageName(promotedtrackingevent.get("origin_screen")).monetizationType(promotedtrackingevent.get("monetization_type")).promotedBy(promotedtrackingevent.get("promoter_urn")).clickName("item_navigation").clickObject(promotedtrackingevent.get("click_object_urn")).clickTarget(promotedtrackingevent.get("click_target_urn"));
    }

    private EventLoggerEventData getPromotedImpressionEvent(PromotedTrackingEvent promotedtrackingevent)
    {
        String s1 = promotedtrackingevent.get("ad_track_urn");
        String s;
        if ((new Urn(s1)).isPlaylist())
        {
            s = "promoted_playlist";
        } else
        {
            s = "promoted_track";
        }
        return buildBaseEvent("impression", promotedtrackingevent).adUrn(promotedtrackingevent.get("ad_urn")).pageName(promotedtrackingevent.get("origin_screen")).monetizationType(promotedtrackingevent.get("monetization_type")).promotedBy(promotedtrackingevent.get("promoter_urn")).impressionName(s).impressionObject(s1);
    }

    private String getStopReason(PlaybackSessionEvent playbacksessionevent)
    {
        switch (playbacksessionevent.getStopReason())
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unexpected stop reason : ")).append(playbacksessionevent.getStopReason()).toString());

        case 0: // '\0'
            return "pause";

        case 1: // '\001'
            return "buffering";

        case 2: // '\002'
            return "skip";

        case 3: // '\003'
            return "track_finished";

        case 4: // '\004'
            return "end_of_content";

        case 5: // '\005'
            return "context_change";

        case 6: // '\006'
            return "playback_error";
        }
    }

    private String getTrigger(TrackSourceInfo tracksourceinfo)
    {
        if (tracksourceinfo.getIsUserTriggered())
        {
            return "manual";
        } else
        {
            return "auto";
        }
    }

    private String getUserUrn()
    {
        return accountOperations.getLoggedInUserUrn().toString();
    }

    private EventLoggerEventData getVisualAdImpressionData(VisualAdImpressionEvent visualadimpressionevent)
    {
        return buildBaseEvent("impression", visualadimpressionevent).adUrn(visualadimpressionevent.get("ad_urn")).pageName(visualadimpressionevent.get("origin_screen")).impressionName("companion_display").impressionObject(visualadimpressionevent.get("ad_track_urn")).monetizedObject(visualadimpressionevent.get("monetizable_track_urn")).monetizationType("audio_ad").externalMedia(visualadimpressionevent.get("ad_artwork_url"));
    }

    private String transform(EventLoggerEventData eventloggereventdata)
    {
        try
        {
            eventloggereventdata = jsonTransformer.toJson(eventloggereventdata);
        }
        // Misplaced declaration of an exception variable
        catch (EventLoggerEventData eventloggereventdata)
        {
            throw new IllegalArgumentException(eventloggereventdata);
        }
        return eventloggereventdata;
    }

    public String build(AdOverlayTrackingEvent adoverlaytrackingevent)
    {
        if (adoverlaytrackingevent.getKind().equals("click"))
        {
            return transform(getAudioAdClickThroughEvent(adoverlaytrackingevent));
        } else
        {
            return transform(getAudioAdImpressionEvent(adoverlaytrackingevent));
        }
    }

    public String build(ForegroundEvent foregroundevent)
    {
        String s;
        byte byte0;
        s = foregroundevent.getKind();
        byte0 = -1;
        s.hashCode();
        JVM INSTR tableswitch 3417674 3417674: default 28
    //                   3417674 73;
           goto _L1 _L2
_L1:
        switch (byte0)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unexpected Foreground Event type ")).append(foregroundevent).toString());

        case 0: // '\0'
            return transform(buildBaseEvent("foreground", foregroundevent).pageName(foregroundevent.get("page_name")).pageUrn(foregroundevent.get("page_urn")).referrer(foregroundevent.get("referrer")));
        }
_L2:
        if (s.equals("open"))
        {
            byte0 = 0;
        }
          goto _L1
    }

    public String build(MidTierTrackEvent midtiertrackevent)
    {
        String s;
        byte byte0;
        s = midtiertrackevent.getKind();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 2: default 36
    //                   65197416: 100
    //                   2114088489: 85;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_100;
_L4:
        switch (byte0)
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unexpected MidTierTrackEvent type: ")).append(midtiertrackevent).toString());

        case 0: // '\0'
            return transform(buildBaseEvent("impression", midtiertrackevent).pageName(midtiertrackevent.getPageName()).impressionName("consumer_sub_track").impressionObject(String.valueOf(midtiertrackevent.getTrackUrn())));

        case 1: // '\001'
            return transform(buildBaseEvent("click", midtiertrackevent).pageName(midtiertrackevent.getPageName()).clickName("consumer_sub_track").clickObject(String.valueOf(midtiertrackevent.getTrackUrn())));
        }
_L3:
        if (s.equals("Impression"))
        {
            byte0 = 0;
        }
          goto _L4
        if (s.equals("Click"))
        {
            byte0 = 1;
        }
          goto _L4
    }

    public String build(PlaybackErrorEvent playbackerrorevent)
    {
        return transform(buildPlaybackErrorEvent(playbackerrorevent));
    }

    public String build(PlaybackPerformanceEvent playbackperformanceevent)
    {
        return transform(buildPlaybackPerformanceEvent(playbackperformanceevent));
    }

    public String build(PromotedTrackingEvent promotedtrackingevent)
    {
        String s;
        byte byte0;
        s = promotedtrackingevent.getKind();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 2: default 36
    //                   94750088: 85
    //                   120623625: 99;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_99;
_L4:
        switch (byte0)
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unexpected PromotedTrackingEvent type: ")).append(promotedtrackingevent).toString());

        case 0: // '\0'
            return transform(getPromotedClickEvent(promotedtrackingevent));

        case 1: // '\001'
            return transform(getPromotedImpressionEvent(promotedtrackingevent));
        }
_L2:
        if (s.equals("click"))
        {
            byte0 = 0;
        }
          goto _L4
        if (s.equals("impression"))
        {
            byte0 = 1;
        }
          goto _L4
    }

    public String build(ScreenEvent screenevent)
    {
        try
        {
            screenevent = jsonTransformer.toJson(buildBaseEvent("pageview", screenevent).pageName(screenevent.getScreenTag()));
        }
        // Misplaced declaration of an exception variable
        catch (ScreenEvent screenevent)
        {
            throw new IllegalArgumentException(screenevent);
        }
        return screenevent;
    }

    public String build(SearchEvent searchevent)
    {
        String s;
        byte byte0;
        s = searchevent.getKind();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 44
    //                   -891535336: 127
    //                   1097546742: 97
    //                   1197722116: 112;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_127;
_L5:
        switch (byte0)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unexpected Search Event type ")).append(searchevent).toString());

        case 0: // '\0'
        case 1: // '\001'
            return transform(buildBaseEvent("click", searchevent).pageName(searchevent.get("page_name")).queryUrn(searchevent.get("query_urn")).queryPosition(searchevent.getClickPosition()).clickName(searchevent.get("click_name")).clickObject(searchevent.get("click_object")));

        case 2: // '\002'
            return transform(buildBaseEvent("click", searchevent).queryUrn(searchevent.get("query_urn")).clickName(searchevent.get("click_name")));
        }
_L3:
        if (s.equals("results"))
        {
            byte0 = 0;
        }
          goto _L5
_L4:
        if (s.equals("suggestion"))
        {
            byte0 = 1;
        }
          goto _L5
        if (s.equals("submit"))
        {
            byte0 = 2;
        }
          goto _L5
    }

    public String build(UIEvent uievent)
    {
        String s;
        byte byte0;
        s = uievent.getKind();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 6: default 68
    //                   -934521517: 193
    //                   -840447568: 178
    //                   -204812427: 148
    //                   -48018132: 208
    //                   3321751: 163
    //                   1230886069: 133;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_208;
_L8:
        switch (byte0)
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unexpected UIEvent type: ")).append(uievent).toString());

        case 0: // '\0'
            return transform(getAudioAdClickEvent(uievent));

        case 1: // '\001'
            return transform(getAudioAdSkipClickEvent(uievent));

        case 2: // '\002'
            return transform(getEngagementEvent("like::add", uievent));

        case 3: // '\003'
            return transform(getEngagementEvent("like::remove", uievent));

        case 4: // '\004'
            return transform(getEngagementEvent("repost::add", uievent));

        case 5: // '\005'
            return transform(getEngagementEvent("repost::remove", uievent));
        }
_L7:
        if (s.equals("audio_ad_click"))
        {
            byte0 = 0;
        }
          goto _L8
_L4:
        if (s.equals("skip_audio_ad_click"))
        {
            byte0 = 1;
        }
          goto _L8
_L6:
        if (s.equals("like"))
        {
            byte0 = 2;
        }
          goto _L8
_L3:
        if (s.equals("unlike"))
        {
            byte0 = 3;
        }
          goto _L8
_L2:
        if (s.equals("repost"))
        {
            byte0 = 4;
        }
          goto _L8
        if (s.equals("unrepost"))
        {
            byte0 = 5;
        }
          goto _L8
    }

    public String build(UpgradeTrackingEvent upgradetrackingevent)
    {
        String s;
        byte byte0;
        s = upgradetrackingevent.getKind();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 44
    //                   -1340179658: 97
    //                   -729323524: 127
    //                   768358683: 112;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_127;
_L5:
        switch (byte0)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unexpected upsell tracking event type ")).append(upgradetrackingevent).toString());

        case 0: // '\0'
            return transform(buildBaseEvent("click", upgradetrackingevent).clickName("clickthrough::consumer_sub_ad").clickObject(upgradetrackingevent.get("tcode")));

        case 1: // '\001'
            return transform(buildBaseEvent("impression", upgradetrackingevent).impressionName("consumer_sub_ad").impressionObject(upgradetrackingevent.get("tcode")));

        case 2: // '\002'
            return transform(buildBaseEvent("impression", upgradetrackingevent).impressionName("consumer_sub_upgrade_success"));
        }
_L2:
        if (s.equals("upsell_click"))
        {
            byte0 = 0;
        }
          goto _L5
_L4:
        if (s.equals("upsell_impression"))
        {
            byte0 = 1;
        }
          goto _L5
        if (s.equals("upgrade_complete"))
        {
            byte0 = 2;
        }
          goto _L5
    }

    public String build(VisualAdImpressionEvent visualadimpressionevent)
    {
        return transform(getVisualAdImpressionData(visualadimpressionevent));
    }

    public String buildForAdFinished(PlaybackSessionEvent playbacksessionevent)
    {
        return transform(buildAudioAdFinishedEvent(playbacksessionevent));
    }

    public String buildForAudioAdImpression(PlaybackSessionEvent playbacksessionevent)
    {
        return transform(buildAudioAdImpressionEvent(playbacksessionevent));
    }

    public String buildForAudioEvent(PlaybackSessionEvent playbacksessionevent)
    {
        return transform(buildAudioEvent(playbacksessionevent));
    }
}
