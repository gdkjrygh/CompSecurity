// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.rx.RxResultMapper;

// Referenced classes of package com.soundcloud.android.discovery:
//            RecommendationReason, RecommendationProperty, RecommendedTrackProperty

class RecommendationMapper extends RxResultMapper
{

    static final String RECOMMENDATION_COUNT = "recommendations_count";
    static final String RECOMMENDATION_ID = "recommendation_id";
    static final String RECOMMENDATION_TITLE = "recommendation_title";
    static final String RECOMMENDATION_USERNAME = "recommendation_username";
    static final String SEED_LOCAL_ID = "seed_local_id";
    static final String SEED_TITLE = "seed_title";

    RecommendationMapper()
    {
    }

    private RecommendationReason getReason(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalStateException((new StringBuilder("Could not find reason for database value ")).append(i).toString());

        case 0: // '\0'
            return RecommendationReason.LIKED;

        case 1: // '\001'
            return RecommendationReason.LISTENED_TO;
        }
    }

    public PropertySet map(CursorReader cursorreader)
    {
        PropertySet propertyset = PropertySet.create(cursorreader.getColumnCount());
        propertyset.put(RecommendationProperty.SEED_TRACK_LOCAL_ID, Long.valueOf(cursorreader.getLong("seed_local_id")));
        propertyset.put(RecommendationProperty.SEED_TRACK_URN, Urn.forTrack(cursorreader.getLong(com.soundcloud.android.storage.Tables.RecommendationSeeds.SEED_SOUND_ID)));
        propertyset.put(RecommendationProperty.SEED_TRACK_TITLE, cursorreader.getString("seed_title"));
        propertyset.put(RecommendationProperty.RECOMMENDED_TRACKS_COUNT, Integer.valueOf(cursorreader.getInt("recommendations_count")));
        propertyset.put(RecommendationProperty.REASON, getReason(cursorreader.getInt(com.soundcloud.android.storage.Tables.RecommendationSeeds.RECOMMENDATION_REASON)));
        propertyset.put(RecommendedTrackProperty.URN, Urn.forTrack(cursorreader.getLong("recommendation_id")));
        propertyset.put(RecommendedTrackProperty.TITLE, cursorreader.getString("recommendation_title"));
        propertyset.put(RecommendedTrackProperty.USERNAME, cursorreader.getString("recommendation_username"));
        return propertyset;
    }

    public volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }
}
