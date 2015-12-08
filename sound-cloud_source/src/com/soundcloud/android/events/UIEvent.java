// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import android.net.Uri;
import com.soundcloud.android.ads.AdProperty;
import com.soundcloud.android.analytics.PromotedSourceInfo;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.TrackSourceInfo;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.optional.Optional;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.soundcloud.android.events:
//            TrackingEvent, EntityMetadata

public final class UIEvent extends TrackingEvent
{

    private static final String CLICKTHROUGHS = "CLICKTHROUGHS";
    public static final String KIND_ADD_TO_PLAYLIST = "add_to_playlist";
    public static final String KIND_AUDIO_AD_CLICK = "audio_ad_click";
    public static final String KIND_COMMENT = "comment";
    public static final String KIND_CREATE_PLAYLIST = "create_playlist";
    public static final String KIND_FOLLOW = "follow";
    public static final String KIND_LIKE = "like";
    public static final String KIND_NAVIGATION = "navigation";
    public static final String KIND_OFFLINE_COLLECTION_ADD = "offline_collection_add";
    public static final String KIND_OFFLINE_COLLECTION_REMOVE = "offline_collection_remove";
    public static final String KIND_OFFLINE_LIKES_ADD = "offline_likes_add";
    public static final String KIND_OFFLINE_LIKES_REMOVE = "offline_likes_remove";
    public static final String KIND_OFFLINE_PLAYLIST_ADD = "offline_playlist_add";
    public static final String KIND_OFFLINE_PLAYLIST_REMOVE = "offline_playlist_remove";
    public static final String KIND_PLAYER_CLOSE = "player_close";
    public static final String KIND_PLAYER_OPEN = "player_open";
    public static final String KIND_REPOST = "repost";
    public static final String KIND_SHARE = "share";
    public static final String KIND_SHUFFLE_LIKES = "shuffle_likes";
    public static final String KIND_SHUFFLE_PLAYLIST = "shuffle_playlist";
    public static final String KIND_SKIP_AUDIO_AD_CLICK = "skip_audio_ad_click";
    public static final String KIND_UNFOLLOW = "unfollow";
    public static final String KIND_UNLIKE = "unlike";
    public static final String KIND_UNREPOST = "unrepost";
    public static final String METHOD_AD_PLAY = "ad_play";
    public static final String METHOD_BACK_BUTTON = "back_button";
    public static final String METHOD_COMMENTS_OPEN = "comments_open";
    public static final String METHOD_COMMENTS_OPEN_FROM_ADD_COMMENT = "comments_open_from_add_comment";
    public static final String METHOD_HIDE_BUTTON = "hide_button";
    public static final String METHOD_PROFILE_OPEN = "profile_open";
    public static final String METHOD_SLIDE = "slide";
    public static final String METHOD_SLIDE_FOOTER = "slide_footer";
    public static final String METHOD_TAP_FOOTER = "tap_footer";
    public static final String METHOD_TRACK_PLAY = "track_play";
    private static final String SKIPS = "SKIPS";
    private static final String TYPE_MONETIZABLE_PROMOTED = "promoted";
    private static final String TYPE_PLAYLIST = "playlist";
    private static final String TYPE_TRACK = "track";
    private static final String TYPE_UNKNOWN = "unknown";
    private final Map promotedTrackingUrls;

    public UIEvent(String s)
    {
        this(s, System.currentTimeMillis());
    }

    public UIEvent(String s, long l)
    {
        super(s, l);
        promotedTrackingUrls = new HashMap();
    }

    private UIEvent addPromotedTrackingUrls(String s, List list)
    {
        promotedTrackingUrls.put(s, list);
        return this;
    }

    public static UIEvent fromAddOfflineLikes(String s)
    {
        return (UIEvent)(new UIEvent("offline_likes_add")).put("origin_screen", s);
    }

    public static UIEvent fromAddOfflinePlaylist(String s, Urn urn, PromotedSourceInfo promotedsourceinfo)
    {
        return ((UIEvent)((UIEvent)(new UIEvent("offline_playlist_add")).put("click_object_urn", urn.toString())).put("origin_screen", s)).putPromotedItemKeys(promotedsourceinfo);
    }

    public static UIEvent fromAddToPlaylist(String s, String s1, boolean flag, long l)
    {
        s1 = (new UIEvent("add_to_playlist")).put("location", s).put("context", s1);
        if (flag)
        {
            s = "yes";
        } else
        {
            s = "no";
        }
        return (UIEvent)s1.put("is_new_playlist", s).put("track_id", String.valueOf(l));
    }

    public static UIEvent fromAudioAdClick(PropertySet propertyset, Urn urn, Urn urn1, TrackSourceInfo tracksourceinfo)
    {
        return fromAudioAdCompanionDisplayClick(propertyset, urn, urn1, tracksourceinfo, System.currentTimeMillis());
    }

    public static UIEvent fromAudioAdCompanionDisplayClick(PropertySet propertyset, Urn urn, Urn urn1, TrackSourceInfo tracksourceinfo, long l)
    {
        return ((UIEvent)((UIEvent)((UIEvent)withBasicAudioAdAttributes(new UIEvent("audio_ad_click", l), propertyset, urn, urn1, tracksourceinfo).put("ad_urn", (String)propertyset.get(AdProperty.COMPANION_URN))).put("ad_artwork_url", ((Uri)propertyset.get(AdProperty.ARTWORK)).toString())).put("click_through", ((Uri)propertyset.get(AdProperty.CLICK_THROUGH_LINK)).toString())).addPromotedTrackingUrls("CLICKTHROUGHS", (List)propertyset.get(AdProperty.AD_CLICKTHROUGH_URLS));
    }

    public static UIEvent fromComment(String s, long l, EntityMetadata entitymetadata)
    {
        return ((UIEvent)((UIEvent)(new UIEvent("comment")).put("context", s)).put("track_id", String.valueOf(l))).putPlayableMetadata(entitymetadata);
    }

    public static UIEvent fromCreatePlaylist(EntityMetadata entitymetadata)
    {
        return (new UIEvent("create_playlist")).putPlayableMetadata(entitymetadata);
    }

    public static UIEvent fromExploreNav()
    {
        return (UIEvent)(new UIEvent("navigation")).put("page", "explore");
    }

    public static UIEvent fromLikesNav()
    {
        return (UIEvent)(new UIEvent("navigation")).put("page", "collection_likes");
    }

    public static UIEvent fromPlayerClose(String s)
    {
        return (UIEvent)(new UIEvent("player_close")).put("method", s);
    }

    public static UIEvent fromPlayerOpen(String s)
    {
        return (UIEvent)(new UIEvent("player_open")).put("method", s);
    }

    public static UIEvent fromPlaylistsNav()
    {
        return (UIEvent)(new UIEvent("navigation")).put("page", "collection_playlists");
    }

    public static UIEvent fromProfileNav()
    {
        return (UIEvent)(new UIEvent("navigation")).put("page", "you");
    }

    public static UIEvent fromRemoveOfflineLikes(String s)
    {
        return (UIEvent)(new UIEvent("offline_likes_remove")).put("origin_screen", s);
    }

    public static UIEvent fromRemoveOfflinePlaylist(String s, Urn urn, PromotedSourceInfo promotedsourceinfo)
    {
        return ((UIEvent)((UIEvent)(new UIEvent("offline_playlist_remove")).put("click_object_urn", urn.toString())).put("origin_screen", s)).putPromotedItemKeys(promotedsourceinfo);
    }

    public static UIEvent fromSearchAction()
    {
        return (UIEvent)(new UIEvent("navigation")).put("page", "search");
    }

    public static UIEvent fromShare(String s, String s1, Urn urn, Urn urn1, PromotedSourceInfo promotedsourceinfo, EntityMetadata entitymetadata)
    {
        return ((UIEvent)((UIEvent)((UIEvent)((UIEvent)((UIEvent)((UIEvent)(new UIEvent("share")).put("context", s)).put("resource", getPlayableType(urn))).put("resource_id", String.valueOf(urn.getNumericId()))).put("click_object_urn", urn.toString())).put("origin_screen", s1)).put("page_urn", urn1.toString())).putPromotedItemKeys(promotedsourceinfo).putPlayableMetadata(entitymetadata);
    }

    public static UIEvent fromShuffleMyLikes()
    {
        return new UIEvent("shuffle_likes");
    }

    public static UIEvent fromShufflePlaylist(String s, Urn urn)
    {
        return (UIEvent)(new UIEvent("shuffle_playlist")).put("context", s).put("resource", "playlist").put("resource_id", String.valueOf(urn.getNumericId()));
    }

    public static UIEvent fromSkipAudioAdClick(PropertySet propertyset, Urn urn, Urn urn1, TrackSourceInfo tracksourceinfo)
    {
        return fromSkipAudioAdClick(propertyset, urn, urn1, tracksourceinfo, System.currentTimeMillis());
    }

    public static UIEvent fromSkipAudioAdClick(PropertySet propertyset, Urn urn, Urn urn1, TrackSourceInfo tracksourceinfo, long l)
    {
        return ((UIEvent)withBasicAudioAdAttributes(new UIEvent("skip_audio_ad_click", l), propertyset, urn, urn1, tracksourceinfo).put("ad_urn", (String)propertyset.get(AdProperty.AD_URN))).addPromotedTrackingUrls("SKIPS", (List)propertyset.get(AdProperty.AD_SKIP_URLS));
    }

    public static UIEvent fromStreamNav()
    {
        return (UIEvent)(new UIEvent("navigation")).put("page", "stream");
    }

    public static UIEvent fromToggleFollow(boolean flag, EntityMetadata entitymetadata)
    {
        String s;
        if (flag)
        {
            s = "follow";
        } else
        {
            s = "unfollow";
        }
        return (new UIEvent(s)).putPlayableMetadata(entitymetadata);
    }

    public static UIEvent fromToggleLike(boolean flag, String s, String s1, String s2, Urn urn, Urn urn1, PromotedSourceInfo promotedsourceinfo, EntityMetadata entitymetadata)
    {
        String s3;
        if (flag)
        {
            s3 = "like";
        } else
        {
            s3 = "unlike";
        }
        return ((UIEvent)((UIEvent)((UIEvent)((UIEvent)((UIEvent)((UIEvent)((UIEvent)(new UIEvent(s3)).put("location", s)).put("context", s1)).put("resource", getPlayableType(urn))).put("resource_id", String.valueOf(urn.getNumericId()))).put("click_object_urn", urn.toString())).put("page_urn", urn1.toString())).put("origin_screen", s2)).putPromotedItemKeys(promotedsourceinfo).putPlayableMetadata(entitymetadata);
    }

    public static UIEvent fromToggleOfflineCollection(boolean flag)
    {
        String s;
        if (flag)
        {
            s = "offline_collection_add";
        } else
        {
            s = "offline_collection_remove";
        }
        return new UIEvent(s);
    }

    public static UIEvent fromToggleRepost(boolean flag, String s, String s1, Urn urn, Urn urn1, PromotedSourceInfo promotedsourceinfo, EntityMetadata entitymetadata)
    {
        String s2;
        if (flag)
        {
            s2 = "repost";
        } else
        {
            s2 = "unrepost";
        }
        return ((UIEvent)((UIEvent)((UIEvent)((UIEvent)((UIEvent)((UIEvent)(new UIEvent(s2)).put("context", s)).put("resource", getPlayableType(urn))).put("resource_id", String.valueOf(urn.getNumericId()))).put("click_object_urn", urn.toString())).put("page_urn", urn1.toString())).put("origin_screen", s1)).putPromotedItemKeys(promotedsourceinfo).putPlayableMetadata(entitymetadata);
    }

    private static String getNotNullOriginScreen(TrackSourceInfo tracksourceinfo)
    {
        if (tracksourceinfo != null)
        {
            return tracksourceinfo.getOriginScreen();
        } else
        {
            return "";
        }
    }

    private static String getPlayableType(Urn urn)
    {
        if (urn.isTrack())
        {
            return "track";
        }
        if (urn.isPlaylist())
        {
            return "playlist";
        } else
        {
            return "unknown";
        }
    }

    private UIEvent putPlayableMetadata(EntityMetadata entitymetadata)
    {
        entitymetadata.addToTrackingEvent(this);
        return this;
    }

    private static UIEvent withBasicAudioAdAttributes(UIEvent uievent, PropertySet propertyset, Urn urn, Urn urn1, TrackSourceInfo tracksourceinfo)
    {
        return (UIEvent)uievent.put("click_object_urn", urn.toString()).put("user_urn", urn1.toString()).put("monetizable_track_urn", ((Urn)propertyset.get(AdProperty.MONETIZABLE_TRACK_URN)).toString()).put("ad_artwork_url", ((Uri)propertyset.get(AdProperty.ARTWORK)).toString()).put("ad_track_urn", urn.toString()).put("origin_screen", getNotNullOriginScreen(tracksourceinfo));
    }

    public final List getAudioAdClickthroughUrls()
    {
        List list1 = (List)promotedTrackingUrls.get("CLICKTHROUGHS");
        List list = list1;
        if (list1 == null)
        {
            list = Collections.emptyList();
        }
        return list;
    }

    public final List getAudioAdSkipUrls()
    {
        List list1 = (List)promotedTrackingUrls.get("SKIPS");
        List list = list1;
        if (list1 == null)
        {
            list = Collections.emptyList();
        }
        return list;
    }

    public final UIEvent putPromotedItemKeys(PromotedSourceInfo promotedsourceinfo)
    {
        if (promotedsourceinfo != null)
        {
            put("ad_urn", promotedsourceinfo.getAdUrn()).put("monetization_type", "promoted");
            if (promotedsourceinfo.getPromoterUrn().isPresent())
            {
                put("promoter_urn", ((Urn)promotedsourceinfo.getPromoterUrn().get()).toString());
            }
        }
        return this;
    }

    public final String toString()
    {
        return String.format("UI Event with type id %s and %s", new Object[] {
            kind, attributes.toString()
        });
    }
}
