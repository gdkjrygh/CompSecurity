// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.eventlogger;

import android.content.res.Resources;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.analytics.SearchQuerySourceInfo;
import com.soundcloud.android.api.ApiMapperException;
import com.soundcloud.android.api.json.JsonTransformer;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.configuration.experiments.ExperimentOperations;
import com.soundcloud.android.events.CollectionEvent;
import com.soundcloud.android.events.ConnectionType;
import com.soundcloud.android.events.OfflineSyncEvent;
import com.soundcloud.android.events.PlaybackSessionEvent;
import com.soundcloud.android.events.StreamNotificationEvent;
import com.soundcloud.android.events.TrackingEvent;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.TrackSourceInfo;
import com.soundcloud.android.utils.DeviceHelper;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.analytics.eventlogger:
//            EventLoggerEventData, EventLoggerEventDataV1

public class EventLoggerV1JsonDataBuilder
{

    private static final String AUDIO_EVENT = "audio";
    private static final String BOOGALOO_VERSION = "v1.4.0";
    private static final String CLICK_EVENT = "click";
    private static final String IMPRESSION_EVENT = "impression";
    private final AccountOperations accountOperations;
    private final int appId;
    private final NetworkConnectionHelper connectionHelper;
    private final DeviceHelper deviceHelper;
    private final ExperimentOperations experimentOperations;
    private final FeatureOperations featureOperations;
    private final JsonTransformer jsonTransformer;

    public EventLoggerV1JsonDataBuilder(Resources resources, DeviceHelper devicehelper, NetworkConnectionHelper networkconnectionhelper, AccountOperations accountoperations, JsonTransformer jsontransformer, FeatureOperations featureoperations, ExperimentOperations experimentoperations)
    {
        connectionHelper = networkconnectionhelper;
        accountOperations = accountoperations;
        featureOperations = featureoperations;
        experimentOperations = experimentoperations;
        appId = resources.getInteger(0x7f0a000e);
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

    private EventLoggerEventData buildAudioEvent(PlaybackSessionEvent playbacksessionevent)
    {
        Urn urn = playbacksessionevent.getTrackUrn();
        EventLoggerEventData eventloggereventdata = buildBaseEvent("audio", playbacksessionevent).pageName(playbacksessionevent.getTrackSourceInfo().getOriginScreen()).playheadPosition(playbacksessionevent.getProgress()).trackLength(playbacksessionevent.getDuration()).track(urn).trackOwner(playbacksessionevent.getCreatorUrn()).localStoragePlayback(playbacksessionevent.isOfflineTrack()).consumerSubsPlan(featureOperations.getPlan()).trigger(getTrigger(playbacksessionevent.getTrackSourceInfo())).protocol(playbacksessionevent.get("protocol")).playerType(playbacksessionevent.get("player_type")).adUrn(playbacksessionevent.get("ad_urn")).monetizedObject(playbacksessionevent.get("monetizable_track_urn")).monetizationType(playbacksessionevent.get("monetization_type")).promotedBy(playbacksessionevent.get("promoter_urn"));
        TrackSourceInfo tracksourceinfo = playbacksessionevent.getTrackSourceInfo();
        if (playbacksessionevent.isPlayEvent())
        {
            eventloggereventdata.action("play");
        } else
        {
            eventloggereventdata.action("pause");
            eventloggereventdata.reason(getStopReason(playbacksessionevent));
        }
        if (tracksourceinfo.hasSource())
        {
            eventloggereventdata.source(tracksourceinfo.getSource());
            eventloggereventdata.sourceVersion(tracksourceinfo.getSourceVersion());
        }
        if (tracksourceinfo.isFromPlaylist())
        {
            eventloggereventdata.inPlaylist(tracksourceinfo.getCollectionUrn());
            eventloggereventdata.playlistPosition(tracksourceinfo.getPlaylistPosition());
        }
        if (tracksourceinfo.hasReposter())
        {
            eventloggereventdata.reposter(tracksourceinfo.getReposter());
        }
        if (tracksourceinfo.isFromSearchQuery())
        {
            playbacksessionevent = tracksourceinfo.getSearchQuerySourceInfo();
            eventloggereventdata.queryUrn(playbacksessionevent.getQueryUrn().toString());
            eventloggereventdata.queryPosition(playbacksessionevent.getUpdatedResultPosition(urn));
        }
        if (tracksourceinfo.isFromStation())
        {
            eventloggereventdata.queryUrn(tracksourceinfo.getCollectionUrn().toString());
        }
        return eventloggereventdata;
    }

    private EventLoggerEventData buildBaseEvent(String s, long l)
    {
        s = new EventLoggerEventDataV1(s, "v1.4.0", appId, getAnonymousId(), getUserUrn(), l, connectionHelper.getCurrentConnectionType().getValue());
        addExperiments(s);
        return s;
    }

    private EventLoggerEventData buildBaseEvent(String s, TrackingEvent trackingevent)
    {
        return buildBaseEvent(s, trackingevent.getTimestamp());
    }

    private EventLoggerEventData buildClickEvent(String s, UIEvent uievent)
    {
        return buildBaseEvent("click", uievent).clickName(s).pageName(uievent.get("origin_screen")).adUrn(uievent.get("ad_urn")).monetizationType(uievent.get("monetization_type")).promotedBy(uievent.get("promoter_urn")).clickObject(uievent.get("click_object_urn"));
    }

    private EventLoggerEventData buildCollectionEvent(String s, CollectionEvent collectionevent)
    {
        return buildBaseEvent("click", collectionevent).clickName(s).pageName(Screen.COLLECTIONS.get()).clickCategory("collection").clickObject(collectionevent.get("click_object")).clickTarget(collectionevent.get("click_target"));
    }

    private EventLoggerEventData buildEngagementEvent(String s, UIEvent uievent)
    {
        s = buildClickEvent(s, uievent).clickCategory("engagement");
        if (!uievent.get("page_urn").equals(Urn.NOT_SET.toString()))
        {
            s.pageUrn(uievent.get("page_urn"));
        }
        return s;
    }

    private EventLoggerEventData buildStreamNotificationClickEvent(StreamNotificationEvent streamnotificationevent)
    {
        return buildBaseEvent("click", streamnotificationevent).pageName(streamnotificationevent.get("page_name")).clickCategory(streamnotificationevent.get("click_category")).clickName(streamnotificationevent.get("click_name"));
    }

    private EventLoggerEventData buildStreamNotificationImpressionEvent(StreamNotificationEvent streamnotificationevent)
    {
        return buildBaseEvent("impression", streamnotificationevent).pageName(streamnotificationevent.get("page_name")).impressionCategory(streamnotificationevent.get("impression_category")).impressionName(streamnotificationevent.get("impression_name"));
    }

    private String getAnonymousId()
    {
        return deviceHelper.getUdid();
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

    public String buildForAudioEvent(PlaybackSessionEvent playbacksessionevent)
    {
        return transform(buildAudioEvent(playbacksessionevent));
    }

    public String buildForCollectionEvent(CollectionEvent collectionevent)
    {
        String s;
        byte byte0;
        s = collectionevent.getKind();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 2: default 36
    //                   -1833801018: 100
    //                   -1552729317: 85;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_100;
_L4:
        switch (byte0)
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unexpected CollectionEvent type: ")).append(collectionevent).toString());

        case 0: // '\0'
            return transform(buildCollectionEvent("filter_sort::set", collectionevent));

        case 1: // '\001'
            return transform(buildCollectionEvent("filter_sort::clear", collectionevent));
        }
_L3:
        if (s.equals("filter_set"))
        {
            byte0 = 0;
        }
          goto _L4
        if (s.equals("filter_clear"))
        {
            byte0 = 1;
        }
          goto _L4
    }

    public String buildForOfflineSyncEvent(OfflineSyncEvent offlinesyncevent)
    {
        return transform(buildBaseEvent("offline_sync", offlinesyncevent).eventType(offlinesyncevent.getKind()).eventStage(offlinesyncevent.getStage()).consumerSubsPlan(featureOperations.getPlan()).track(offlinesyncevent.getTrackUrn()).trackOwner(offlinesyncevent.getTrackOwner()).inPlaylist(offlinesyncevent.isInPlaylists()).inLikes(offlinesyncevent.isLiked()).appVersion(deviceHelper.getAppVersion()));
    }

    public String buildForStreamNotification(StreamNotificationEvent streamnotificationevent)
    {
        String s;
        byte byte0;
        s = streamnotificationevent.getKind();
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
            throw new IllegalStateException((new StringBuilder("Unexpected StreamNotificationEvent type: ")).append(streamnotificationevent).toString());

        case 0: // '\0'
            return transform(buildStreamNotificationClickEvent(streamnotificationevent));

        case 1: // '\001'
            return transform(buildStreamNotificationImpressionEvent(streamnotificationevent));
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

    public String buildForUIEvent(UIEvent uievent)
    {
        String s;
        byte byte0;
        s = uievent.getKind();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 7: default 76
    //                   -1862180555: 160
    //                   -1649527408: 145
    //                   109400031: 235
    //                   398433769: 220
    //                   430200156: 205
    //                   1872819778: 175
    //                   2036828995: 190;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_235;
_L9:
        switch (byte0)
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unexpected UIEvent type: ")).append(uievent).toString());

        case 0: // '\0'
            return transform(buildClickEvent("playlist_to_offline::add", uievent));

        case 1: // '\001'
            return transform(buildClickEvent("playlist_to_offline::remove", uievent));

        case 2: // '\002'
            return transform(buildClickEvent("likes_to_offline::add", uievent));

        case 3: // '\003'
            return transform(buildClickEvent("likes_to_offline::remove", uievent));

        case 4: // '\004'
            return transform(buildClickEvent("collection_to_offline::add", uievent));

        case 5: // '\005'
            return transform(buildClickEvent("collection_to_offline::remove", uievent));

        case 6: // '\006'
            return transform(buildEngagementEvent("share", uievent));
        }
_L3:
        if (s.equals("offline_playlist_add"))
        {
            byte0 = 0;
        }
          goto _L9
_L2:
        if (s.equals("offline_playlist_remove"))
        {
            byte0 = 1;
        }
          goto _L9
_L7:
        if (s.equals("offline_likes_add"))
        {
            byte0 = 2;
        }
          goto _L9
_L8:
        if (s.equals("offline_likes_remove"))
        {
            byte0 = 3;
        }
          goto _L9
_L6:
        if (s.equals("offline_collection_add"))
        {
            byte0 = 4;
        }
          goto _L9
_L5:
        if (s.equals("offline_collection_remove"))
        {
            byte0 = 5;
        }
          goto _L9
        if (s.equals("share"))
        {
            byte0 = 6;
        }
          goto _L9
    }
}
