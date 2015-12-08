// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import com.soundcloud.android.model.Urn;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.query.ColumnFunctions;
import com.soundcloud.propeller.query.Count;
import com.soundcloud.propeller.query.Field;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.query.Where;
import com.soundcloud.propeller.rx.PropellerRx;
import com.soundcloud.propeller.rx.RxResultMapper;
import com.soundcloud.propeller.schema.Column;
import com.soundcloud.propeller.schema.Table;
import rx.b;

// Referenced classes of package com.soundcloud.android.discovery:
//            RecommendedTrackMapper, RecommendationMapper

class RecommendationsStorage
{
    private static final class TrackUrnMapper extends RxResultMapper
    {

        public final Urn map(CursorReader cursorreader)
        {
            return Urn.forTrack(cursorreader.getLong(com.soundcloud.android.storage.Tables.Recommendations.RECOMMENDED_SOUND_ID));
        }

        public final volatile Object map(CursorReader cursorreader)
        {
            return map(cursorreader);
        }

        private TrackUrnMapper()
        {
        }

        TrackUrnMapper(_cls1 _pcls1)
        {
            this();
        }
    }


    private static final String RECOMMENDATIONS_SOUND_VIEW = "RecommendationsSoundView";
    private final PropellerRx propellerRx;

    RecommendationsStorage(PropellerRx propellerrx)
    {
        propellerRx = propellerrx;
    }

    private Query allRecommendedTracks()
    {
        return (Query)Query.from(new Table[] {
            com.soundcloud.android.storage.Tables.Recommendations.TABLE
        }).select(new Object[] {
            com.soundcloud.android.storage.Tables.Recommendations.RECOMMENDED_SOUND_ID
        }).whereEq(com.soundcloud.android.storage.Tables.Recommendations.RECOMMENDED_SOUND_TYPE, Integer.valueOf(0));
    }

    b recommendedTracks()
    {
        Query query = allRecommendedTracks();
        return propellerRx.query(query).map(new TrackUrnMapper(null)).toList();
    }

    b recommendedTracksAfterSeed(long l)
    {
        Query query = (Query)allRecommendedTracks().whereGe(com.soundcloud.android.storage.Tables.Recommendations.SEED_ID, Long.valueOf(l));
        return propellerRx.query(query).map(new TrackUrnMapper(null)).toList();
    }

    b recommendedTracksBeforeSeed(long l)
    {
        Query query = (Query)allRecommendedTracks().whereLt(com.soundcloud.android.storage.Tables.Recommendations.SEED_ID, Long.valueOf(l));
        return propellerRx.query(query).map(new TrackUrnMapper(null)).toList();
    }

    b recommendedTracksForSeed(long l)
    {
        Object obj = Filter.filter().whereEq(com.soundcloud.android.storage.Tables.RecommendationSeeds._ID, com.soundcloud.android.storage.Tables.Recommendations.SEED_ID);
        Where where = Filter.filter().whereEq(com.soundcloud.android.storage.Tables.Recommendations.RECOMMENDED_SOUND_TYPE, com.soundcloud.android.storage.Table.SoundView.field("_type")).whereEq(com.soundcloud.android.storage.Tables.Recommendations.RECOMMENDED_SOUND_ID, com.soundcloud.android.storage.Table.SoundView.field("_id"));
        obj = (Query)Query.from(new Table[] {
            com.soundcloud.android.storage.Tables.Recommendations.TABLE
        }).select(new Object[] {
            com.soundcloud.android.storage.Tables.Recommendations.SEED_ID, com.soundcloud.android.storage.Tables.Recommendations.RECOMMENDED_SOUND_ID, "title", "sound_user_username", "duration", "playback_count", "favoritings_count", "created_at"
        }).innerJoin(com.soundcloud.android.storage.Tables.RecommendationSeeds.TABLE, ((Where) (obj))).innerJoin(com.soundcloud.android.storage.Table.SoundView.name(), where).whereEq(com.soundcloud.android.storage.Tables.Recommendations.SEED_ID, Long.valueOf(l));
        return propellerRx.query(((Query) (obj))).map(new RecommendedTrackMapper()).toList();
    }

    b seedTracks()
    {
        Object obj = Filter.filter().whereEq(com.soundcloud.android.storage.Tables.RecommendationSeeds.SEED_SOUND_TYPE, com.soundcloud.android.storage.Table.SoundView.field("_type")).whereEq(com.soundcloud.android.storage.Tables.RecommendationSeeds.SEED_SOUND_ID, com.soundcloud.android.storage.Table.SoundView.field("_id"));
        Where where = Filter.filter().whereEq(com.soundcloud.android.storage.Tables.RecommendationSeeds._ID, com.soundcloud.android.storage.Tables.Recommendations.SEED_ID);
        Where where1 = Filter.filter().whereEq("RecommendationsSoundView._type", com.soundcloud.android.storage.Tables.Recommendations.RECOMMENDED_SOUND_TYPE).whereEq("RecommendationsSoundView._id", com.soundcloud.android.storage.Tables.Recommendations.RECOMMENDED_SOUND_ID);
        obj = Query.from(new Table[] {
            com.soundcloud.android.storage.Tables.RecommendationSeeds.TABLE
        }).select(new Object[] {
            com.soundcloud.android.storage.Tables.RecommendationSeeds._ID.as("seed_local_id"), com.soundcloud.android.storage.Tables.RecommendationSeeds.SEED_SOUND_ID, com.soundcloud.android.storage.Tables.RecommendationSeeds.RECOMMENDATION_REASON, Field.field(com.soundcloud.android.storage.Table.SoundView.field("title")).as("seed_title"), (new StringBuilder("MIN(")).append(com.soundcloud.android.storage.Tables.Recommendations._ID).append(")").toString(), Field.field("RecommendationsSoundView._id").as("recommendation_id"), Field.field("RecommendationsSoundView.title").as("recommendation_title"), Field.field("RecommendationsSoundView.sound_user_username").as("recommendation_username"), ColumnFunctions.count(com.soundcloud.android.storage.Tables.RecommendationSeeds.SEED_SOUND_ID).as("recommendations_count")
        }).innerJoin(com.soundcloud.android.storage.Table.SoundView.name(), ((Where) (obj))).innerJoin(com.soundcloud.android.storage.Tables.Recommendations.TABLE, where).innerJoin((new StringBuilder()).append(com.soundcloud.android.storage.Table.SoundView.name()).append(" AS RecommendationsSoundView").toString(), where1).groupBy(new Column[] {
            com.soundcloud.android.storage.Tables.RecommendationSeeds.SEED_SOUND_ID
        }).order(com.soundcloud.android.storage.Tables.Recommendations._ID, com.soundcloud.propeller.query.Query.Order.ASC);
        return propellerRx.query(((Query) (obj))).map(new RecommendationMapper()).toList();
    }
}
