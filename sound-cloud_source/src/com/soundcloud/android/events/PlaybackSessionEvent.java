// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import android.net.Uri;
import com.soundcloud.android.ads.AdProperty;
import com.soundcloud.android.analytics.PromotedSourceInfo;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.TrackSourceInfo;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.optional.Optional;
import java.util.Collections;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.soundcloud.android.events:
//            TrackingEvent, EntityMetadata

public class PlaybackSessionEvent extends TrackingEvent
{

    public static final String CONNECTION_TYPE = "connection_type";
    private static final String EVENT_KIND_PLAY = "play";
    private static final String EVENT_KIND_STOP = "stop";
    public static final long FIRST_PLAY_MAX_PROGRESS = 1000L;
    public static final String KEY_LOGGED_IN_USER_URN = "logged_in_user_urn";
    public static final String KEY_POLICY = "policy";
    public static final String KEY_PROTOCOL = "protocol";
    private static final String MONETIZATION_AUDIO_AD = "audio_ad";
    private static final String MONETIZATION_PROMOTED = "promoted";
    public static final String PLAYER_TYPE = "player_type";
    public static final int STOP_REASON_BUFFERING = 1;
    public static final int STOP_REASON_END_OF_QUEUE = 4;
    public static final int STOP_REASON_ERROR = 6;
    public static final int STOP_REASON_NEW_QUEUE = 5;
    public static final int STOP_REASON_PAUSE = 0;
    public static final int STOP_REASON_SKIP = 2;
    public static final int STOP_REASON_TRACK_FINISHED = 3;
    private List adCompanionImpressionUrls;
    private List adFinishedUrls;
    private List adImpressionUrls;
    private final Urn creatorUrn;
    private final long duration;
    private final boolean isOfflineTrack;
    private long listenTime;
    private final long progress;
    private List promotedPlayUrls;
    private int stopReason;
    private final TrackSourceInfo trackSourceInfo;
    private final Urn trackUrn;

    private PlaybackSessionEvent(String s, PropertySet propertyset, Urn urn, TrackSourceInfo tracksourceinfo, long l, long l1, String s1, String s2, String s3, boolean flag)
    {
        super(s, l1);
        adCompanionImpressionUrls = Collections.emptyList();
        adImpressionUrls = Collections.emptyList();
        adFinishedUrls = Collections.emptyList();
        promotedPlayUrls = Collections.emptyList();
        isOfflineTrack = flag;
        trackUrn = (Urn)propertyset.get(TrackProperty.URN);
        creatorUrn = (Urn)propertyset.get(TrackProperty.CREATOR_URN);
        put("logged_in_user_urn", urn.toString());
        put("protocol", s1);
        put("policy", (String)propertyset.getOrElseNull(TrackProperty.POLICY));
        put("player_type", s2);
        put("connection_type", s3);
        trackSourceInfo = tracksourceinfo;
        progress = l;
        duration = ((Long)propertyset.get(PlayableProperty.DURATION)).longValue();
        EntityMetadata.from(propertyset).addToTrackingEvent(this);
    }

    public static PlaybackSessionEvent forPlay(PropertySet propertyset, Urn urn, TrackSourceInfo tracksourceinfo, long l, long l1, String s, 
            String s1, String s2, boolean flag)
    {
        return new PlaybackSessionEvent("play", propertyset, urn, tracksourceinfo, l, l1, s, s1, s2, flag);
    }

    public static PlaybackSessionEvent forPlay(PropertySet propertyset, Urn urn, TrackSourceInfo tracksourceinfo, long l, String s, String s1, String s2, 
            boolean flag)
    {
        return forPlay(propertyset, urn, tracksourceinfo, l, System.currentTimeMillis(), s, s1, s2, flag);
    }

    public static PlaybackSessionEvent forStop(PropertySet propertyset, Urn urn, TrackSourceInfo tracksourceinfo, PlaybackSessionEvent playbacksessionevent, long l, long l1, 
            String s, String s1, String s2, int i, boolean flag)
    {
        propertyset = new PlaybackSessionEvent("stop", propertyset, urn, tracksourceinfo, l, l1, s, s1, s2, flag);
        propertyset.setListenTime(((PlaybackSessionEvent) (propertyset)).timestamp - playbacksessionevent.getTimestamp());
        propertyset.setStopReason(i);
        return propertyset;
    }

    public static PlaybackSessionEvent forStop(PropertySet propertyset, Urn urn, TrackSourceInfo tracksourceinfo, PlaybackSessionEvent playbacksessionevent, long l, String s, String s1, 
            String s2, int i, boolean flag)
    {
        return forStop(propertyset, urn, tracksourceinfo, playbacksessionevent, l, System.currentTimeMillis(), s, s1, s2, i, flag);
    }

    private boolean isMonetizationType(String s)
    {
        return attributes.containsKey("monetization_type") && ((String)attributes.get("monetization_type")).equals(s);
    }

    private void setListenTime(long l)
    {
        listenTime = l;
    }

    private void setStopReason(int i)
    {
        stopReason = i;
    }

    public List getAudioAdCompanionImpressionUrls()
    {
        return adCompanionImpressionUrls;
    }

    public List getAudioAdFinishUrls()
    {
        return adFinishedUrls;
    }

    public List getAudioAdImpressionUrls()
    {
        return adImpressionUrls;
    }

    public Urn getCreatorUrn()
    {
        return creatorUrn;
    }

    public long getDuration()
    {
        return duration;
    }

    public long getListenTime()
    {
        return listenTime;
    }

    public long getProgress()
    {
        return progress;
    }

    public List getPromotedPlayUrls()
    {
        return promotedPlayUrls;
    }

    public int getStopReason()
    {
        return stopReason;
    }

    public TrackSourceInfo getTrackSourceInfo()
    {
        return trackSourceInfo;
    }

    public Urn getTrackUrn()
    {
        return trackUrn;
    }

    public boolean hasTrackFinished()
    {
        return isStopEvent() && getStopReason() == 3;
    }

    public boolean isAd()
    {
        return isMonetizationType("audio_ad");
    }

    public boolean isBufferingEvent()
    {
        return stopReason == 1;
    }

    public boolean isFirstPlay()
    {
        return isPlayEvent() && 0L <= progress && progress <= 1000L;
    }

    public boolean isOfflineTrack()
    {
        return isOfflineTrack;
    }

    public boolean isPlayEvent()
    {
        return "play".equals(kind);
    }

    public boolean isPlayingOwnPlaylist()
    {
        return trackSourceInfo.getPlaylistOwnerUrn().toString().equals(get("logged_in_user_urn"));
    }

    public boolean isPromotedTrack()
    {
        return isMonetizationType("promoted");
    }

    public boolean isStopEvent()
    {
        return !isPlayEvent();
    }

    public boolean isUserTriggered()
    {
        return trackSourceInfo.getIsUserTriggered();
    }

    public PlaybackSessionEvent withAudioAd(PropertySet propertyset)
    {
        put("user_urn", get("logged_in_user_urn"));
        put("ad_urn", (String)propertyset.get(AdProperty.AD_URN));
        put("monetization_type", "audio_ad");
        put("monetizable_track_urn", ((Urn)propertyset.get(AdProperty.MONETIZABLE_TRACK_URN)).toString());
        put("ad_artwork_url", ((Uri)propertyset.get(AdProperty.ARTWORK)).toString());
        put("ad_track_urn", trackUrn.toString());
        put("origin_screen", trackSourceInfo.getOriginScreen());
        put("click_object_urn", trackUrn.toString());
        adImpressionUrls = (List)propertyset.get(AdProperty.AD_IMPRESSION_URLS);
        adCompanionImpressionUrls = (List)propertyset.get(AdProperty.AD_COMPANION_DISPLAY_IMPRESSION_URLS);
        adFinishedUrls = (List)propertyset.get(AdProperty.AD_FINISH_URLS);
        return this;
    }

    public PlaybackSessionEvent withPromotedTrack(PromotedSourceInfo promotedsourceinfo)
    {
        put("ad_urn", promotedsourceinfo.getAdUrn());
        put("monetization_type", "promoted");
        if (promotedsourceinfo.getPromoterUrn().isPresent())
        {
            put("promoter_urn", ((Urn)promotedsourceinfo.getPromoterUrn().get()).toString());
        }
        promotedPlayUrls = promotedsourceinfo.getTrackingUrls();
        return this;
    }
}
