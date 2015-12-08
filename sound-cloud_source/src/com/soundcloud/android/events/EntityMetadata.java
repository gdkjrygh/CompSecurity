// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import com.soundcloud.android.api.model.ApiPlaylist;
import com.soundcloud.android.api.model.ApiUser;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.ui.PlayerTrackState;
import com.soundcloud.android.playlists.PlaylistWithTracks;
import com.soundcloud.android.presentation.PlayableItem;
import com.soundcloud.android.users.UserProperty;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.events:
//            TrackingEvent

public class EntityMetadata
{

    public static final EntityMetadata EMPTY;
    public static final String KEY_CREATOR_NAME = "creator_display_name";
    public static final String KEY_CREATOR_URN = "creator_urn";
    public static final String KEY_PLAYABLE_TITLE = "playable_title";
    public static final String KEY_PLAYABLE_TYPE = "playable_type";
    public static final String KEY_PLAYABLE_URN = "playable_urn";
    private static final String TYPE_OTHER = "other";
    private static final String TYPE_PLAYLIST = "playlist";
    private static final String TYPE_STATION = "station";
    private static final String TYPE_TRACK = "track";
    private final String creatorName;
    private final Urn creatorUrn;
    private final String playableTitle;
    private final Urn playableUrn;

    EntityMetadata(String s, Urn urn, String s1, Urn urn1)
    {
        creatorName = s;
        creatorUrn = urn;
        playableTitle = s1;
        playableUrn = urn1;
    }

    public static EntityMetadata from(ApiPlaylist apiplaylist)
    {
        if (apiplaylist == null)
        {
            return EMPTY;
        } else
        {
            return new EntityMetadata(apiplaylist.getUsername(), apiplaylist.getUser().getUrn(), apiplaylist.getTitle(), apiplaylist.getUrn());
        }
    }

    public static EntityMetadata from(PlayerTrackState playertrackstate)
    {
        if (playertrackstate == null)
        {
            return EMPTY;
        } else
        {
            return new EntityMetadata(playertrackstate.getUserName(), playertrackstate.getUserUrn(), playertrackstate.getTitle(), playertrackstate.getTrackUrn());
        }
    }

    public static EntityMetadata from(PlaylistWithTracks playlistwithtracks)
    {
        if (playlistwithtracks == null)
        {
            return EMPTY;
        } else
        {
            return new EntityMetadata(playlistwithtracks.getCreatorName(), playlistwithtracks.getCreatorUrn(), playlistwithtracks.getTitle(), playlistwithtracks.getUrn());
        }
    }

    public static EntityMetadata from(PlayableItem playableitem)
    {
        if (playableitem == null)
        {
            return EMPTY;
        } else
        {
            return new EntityMetadata(playableitem.getCreatorName(), playableitem.getCreatorUrn(), playableitem.getTitle(), playableitem.getEntityUrn());
        }
    }

    public static EntityMetadata from(PropertySet propertyset)
    {
        if (propertyset == null)
        {
            return EMPTY;
        } else
        {
            return new EntityMetadata((String)propertyset.getOrElse(PlayableProperty.CREATOR_NAME, ""), (Urn)propertyset.getOrElse(PlayableProperty.CREATOR_URN, Urn.NOT_SET), (String)propertyset.getOrElse(PlayableProperty.TITLE, ""), (Urn)propertyset.getOrElse(PlayableProperty.URN, Urn.NOT_SET));
        }
    }

    public static EntityMetadata fromUser(PropertySet propertyset)
    {
        if (propertyset == null)
        {
            return EMPTY;
        } else
        {
            return new EntityMetadata((String)propertyset.getOrElse(UserProperty.USERNAME, ""), (Urn)propertyset.getOrElse(UserProperty.URN, Urn.NOT_SET), "", Urn.NOT_SET);
        }
    }

    private String getPlayableType()
    {
        if (playableUrn.isTrack())
        {
            return "track";
        }
        if (playableUrn.isPlaylist())
        {
            return "playlist";
        }
        if (playableUrn.isStation())
        {
            return "station";
        } else
        {
            return "other";
        }
    }

    void addToTrackingEvent(TrackingEvent trackingevent)
    {
        trackingevent.put("creator_display_name", creatorName).put("creator_urn", creatorUrn.toString()).put("playable_title", playableTitle).put("playable_urn", playableUrn.toString()).put("playable_type", getPlayableType());
    }

    static 
    {
        EMPTY = new EntityMetadata("", Urn.NOT_SET, "", Urn.NOT_SET);
    }
}
