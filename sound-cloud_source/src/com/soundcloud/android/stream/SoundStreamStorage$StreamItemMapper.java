// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import com.soundcloud.android.api.model.Sharing;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.PostProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playlists.PlaylistProperty;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.strings.Strings;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.rx.RxResultMapper;

// Referenced classes of package com.soundcloud.android.stream:
//            SoundStreamStorage

private static class <init> extends RxResultMapper
{

    private void addOptionalPlayCount(CursorReader cursorreader, PropertySet propertyset)
    {
        if (getSoundType(cursorreader) == 0)
        {
            propertyset.put(TrackProperty.PLAY_COUNT, Integer.valueOf(cursorreader.getInt("playback_count")));
        }
    }

    private void addOptionalReposter(CursorReader cursorreader, PropertySet propertyset)
    {
        if (Strings.isNotBlank(cursorreader.getString("reposter_username")))
        {
            propertyset.put(PostProperty.REPOSTER, cursorreader.getString("reposter_username"));
            propertyset.put(PostProperty.REPOSTER_URN, Urn.forUser(cursorreader.getInt("reposter_id")));
        }
    }

    private void addOptionalTrackCount(CursorReader cursorreader, PropertySet propertyset)
    {
        if (getSoundType(cursorreader) == 1)
        {
            propertyset.put(PlaylistProperty.TRACK_COUNT, Integer.valueOf(cursorreader.getInt("track_count")));
        }
    }

    private void addTitle(CursorReader cursorreader, PropertySet propertyset)
    {
        String s = cursorreader.getString("title");
        if (s == null)
        {
            ErrorUtils.handleSilentException((new StringBuilder("urn : ")).append(readSoundUrn(cursorreader)).toString(), new IllegalStateException("Unexpected null title in stream"));
            propertyset.put(PlayableProperty.TITLE, "");
            return;
        } else
        {
            propertyset.put(PlayableProperty.TITLE, s);
            return;
        }
    }

    private void addUserLike(CursorReader cursorreader, PropertySet propertyset)
    {
        propertyset.put(PlayableProperty.IS_LIKED, Boolean.valueOf(cursorreader.getBoolean("sound_user_like")));
        propertyset.put(PlayableProperty.LIKES_COUNT, Integer.valueOf(cursorreader.getInt("favoritings_count")));
    }

    private void addUserRepost(CursorReader cursorreader, PropertySet propertyset)
    {
        propertyset.put(PlayableProperty.IS_REPOSTED, Boolean.valueOf(cursorreader.getBoolean("sound_user_repost")));
        propertyset.put(PlayableProperty.REPOSTS_COUNT, Integer.valueOf(cursorreader.getInt("reposts_count")));
    }

    private static int getSoundType(CursorReader cursorreader)
    {
        return cursorreader.getInt("sound_type");
    }

    private Urn readSoundUrn(CursorReader cursorreader)
    {
        int i = cursorreader.getInt("sound_id");
        if (getSoundType(cursorreader) == 0)
        {
            return Urn.forTrack(i);
        } else
        {
            return Urn.forPlaylist(i);
        }
    }

    public PropertySet map(CursorReader cursorreader)
    {
        PropertySet propertyset = PropertySet.create(cursorreader.getColumnCount());
        propertyset.put(PlayableProperty.URN, readSoundUrn(cursorreader));
        addTitle(cursorreader, propertyset);
        propertyset.put(PlayableProperty.DURATION, Long.valueOf(cursorreader.getLong("duration")));
        propertyset.put(PlayableProperty.CREATOR_NAME, cursorreader.getString("sound_user_username"));
        propertyset.put(PlayableProperty.CREATOR_URN, Urn.forUser(cursorreader.getInt("sound_user_id")));
        propertyset.put(PlayableProperty.CREATED_AT, cursorreader.getDateFromTimestamp("created_at"));
        propertyset.put(PlayableProperty.IS_PRIVATE, Boolean.valueOf(Sharing.PRIVATE.name().equalsIgnoreCase(cursorreader.getString("sharing"))));
        addUserLike(cursorreader, propertyset);
        addUserRepost(cursorreader, propertyset);
        addOptionalPlayCount(cursorreader, propertyset);
        addOptionalTrackCount(cursorreader, propertyset);
        addOptionalReposter(cursorreader, propertyset);
        if (cursorreader.isNotNull("sound_policies_sub_mid_tier"))
        {
            propertyset.put(TrackProperty.SUB_MID_TIER, Boolean.valueOf(cursorreader.getBoolean("sound_policies_sub_mid_tier")));
        }
        return propertyset;
    }

    public volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
