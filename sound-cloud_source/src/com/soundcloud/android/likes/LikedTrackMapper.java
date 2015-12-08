// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.offline.OfflineStateMapper;
import com.soundcloud.android.policies.PolicyMapper;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.rx.RxResultMapper;

// Referenced classes of package com.soundcloud.android.likes:
//            LikeProperty

class LikedTrackMapper extends RxResultMapper
{

    private static final String SHARING_PRIVATE = "private";
    private final OfflineStateMapper offlineStateMapper = new OfflineStateMapper();
    private final PolicyMapper policyMapper = new PolicyMapper();

    LikedTrackMapper()
    {
    }

    private Urn readSoundUrn(CursorReader cursorreader)
    {
        return Urn.forTrack(cursorreader.getLong("_id"));
    }

    public PropertySet map(CursorReader cursorreader)
    {
        PropertySet propertyset = PropertySet.create(cursorreader.getColumnCount());
        propertyset.put(TrackProperty.URN, readSoundUrn(cursorreader));
        propertyset.put(PlayableProperty.TITLE, cursorreader.getString("title"));
        propertyset.put(PlayableProperty.CREATOR_NAME, cursorreader.getString("username"));
        propertyset.put(PlayableProperty.DURATION, Long.valueOf(cursorreader.getLong("duration")));
        propertyset.put(TrackProperty.PLAY_COUNT, Integer.valueOf(cursorreader.getInt("playback_count")));
        propertyset.put(PlayableProperty.LIKES_COUNT, Integer.valueOf(cursorreader.getInt("favoritings_count")));
        propertyset.put(LikeProperty.CREATED_AT, cursorreader.getDateFromTimestamp("created_at"));
        propertyset.put(PlayableProperty.IS_PRIVATE, Boolean.valueOf("private".equalsIgnoreCase(cursorreader.getString("sharing"))));
        propertyset.update(offlineStateMapper.map(cursorreader));
        propertyset.update(policyMapper.map(cursorreader));
        return propertyset;
    }

    public volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }
}
