// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.rx.RxResultMapper;

// Referenced classes of package com.soundcloud.android.discovery:
//            RecommendedTrackProperty

class RecommendedTrackMapper extends RxResultMapper
{

    RecommendedTrackMapper()
    {
    }

    public PropertySet map(CursorReader cursorreader)
    {
        PropertySet propertyset = PropertySet.create(cursorreader.getColumnCount());
        propertyset.put(RecommendedTrackProperty.SEED_SOUND_URN, Urn.forTrack(cursorreader.getLong(com.soundcloud.android.storage.Tables.Recommendations.SEED_ID)));
        propertyset.put(PlayableProperty.URN, Urn.forTrack(cursorreader.getLong(com.soundcloud.android.storage.Tables.Recommendations.RECOMMENDED_SOUND_ID)));
        propertyset.put(PlayableProperty.TITLE, cursorreader.getString("title"));
        propertyset.put(PlayableProperty.CREATOR_NAME, cursorreader.getString("sound_user_username"));
        propertyset.put(PlayableProperty.DURATION, Long.valueOf(cursorreader.getLong("duration")));
        propertyset.put(TrackProperty.PLAY_COUNT, Integer.valueOf(cursorreader.getInt("playback_count")));
        propertyset.put(PlayableProperty.LIKES_COUNT, Integer.valueOf(cursorreader.getInt("favoritings_count")));
        propertyset.put(PlayableProperty.CREATED_AT, cursorreader.getDateFromTimestamp("created_at"));
        return propertyset;
    }

    public volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }
}
