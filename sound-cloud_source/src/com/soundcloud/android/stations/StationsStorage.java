// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import android.content.SharedPreferences;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.android.utils.DateProvider;
import com.soundcloud.propeller.ChangeResult;
import com.soundcloud.propeller.ContentValuesBuilder;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.QueryResult;
import com.soundcloud.propeller.ResultMapper;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.rx.PropellerRx;
import com.soundcloud.propeller.schema.Table;
import java.util.List;
import rx.b;
import rx.b.f;

class StationsStorage
{

    private static final String ONBOARDING_DISABLED = "ONBOARDING_DISABLED";
    private static final ResultMapper TO_RECENT_STATION = new _cls3();
    private static final f TO_STATION_WITHOUT_TRACKS = new _cls1();
    private static final f TO_TRACK_URN = new _cls2();
    private final DateProvider dateProvider;
    private final PropellerDatabase propellerDatabase;
    private final PropellerRx propellerRx;
    private final SharedPreferences sharedPreferences;
    private final f toStation = new _cls4();

    public StationsStorage(SharedPreferences sharedpreferences, PropellerDatabase propellerdatabase, PropellerRx propellerrx, CurrentDateProvider currentdateprovider)
    {
        sharedPreferences = sharedpreferences;
        propellerDatabase = propellerdatabase;
        propellerRx = propellerrx;
        dateProvider = currentdateprovider;
    }

    private Query buildStationsQuery(int i)
    {
        return ((Query)Query.from(new Table[] {
            com.soundcloud.android.storage.Tables.StationsCollections.TABLE
        }).whereEq(com.soundcloud.android.storage.Tables.StationsCollections.COLLECTION_TYPE, Integer.valueOf(i))).order(com.soundcloud.android.storage.Tables.StationsCollections.UPDATED_LOCALLY_AT, com.soundcloud.propeller.query.Query.Order.DESC).order(com.soundcloud.android.storage.Tables.StationsCollections.POSITION, com.soundcloud.propeller.query.Query.Order.ASC);
    }

    private Query buildTracksListQuery(Urn urn)
    {
        return ((Query)Query.from(new Table[] {
            com.soundcloud.android.storage.Tables.StationsPlayQueues.TABLE
        }).select(new Object[] {
            com.soundcloud.android.storage.Tables.StationsPlayQueues.TRACK_URN
        }).whereEq(com.soundcloud.android.storage.Tables.StationsPlayQueues.STATION_URN, urn)).order(com.soundcloud.android.storage.Tables.StationsPlayQueues.POSITION, com.soundcloud.propeller.query.Query.Order.ASC);
    }

    void clear()
    {
        propellerDatabase.delete(com.soundcloud.android.storage.Tables.Stations.TABLE);
        propellerDatabase.delete(com.soundcloud.android.storage.Tables.StationsCollections.TABLE);
        propellerDatabase.delete(com.soundcloud.android.storage.Tables.StationsPlayQueues.TABLE);
        sharedPreferences.edit().clear().apply();
    }

    void disableOnboarding()
    {
        sharedPreferences.edit().putBoolean("ONBOARDING_DISABLED", true).apply();
    }

    List getRecentStationsToSync()
    {
        return propellerDatabase.query((Query)((Query)Query.from(new Table[] {
            com.soundcloud.android.storage.Tables.StationsCollections.TABLE
        }).whereEq(com.soundcloud.android.storage.Tables.StationsCollections.COLLECTION_TYPE, Integer.valueOf(0))).whereNotNull(com.soundcloud.android.storage.Tables.StationsCollections.UPDATED_LOCALLY_AT)).toList(TO_RECENT_STATION);
    }

    b getStationsCollection(int i)
    {
        return propellerRx.query(buildStationsQuery(i)).flatMap(toStation);
    }

    boolean isOnboardingDisabled()
    {
        return sharedPreferences.getBoolean("ONBOARDING_DISABLED", false);
    }

    public b loadPlayQueue(Urn urn, int i)
    {
        return propellerRx.query(((Query)((Query)Query.from(new Table[] {
            com.soundcloud.android.storage.Tables.StationsPlayQueues.TABLE
        }).whereEq(com.soundcloud.android.storage.Tables.StationsPlayQueues.STATION_URN, urn.toString())).whereGe(com.soundcloud.android.storage.Tables.StationsPlayQueues.POSITION, Integer.valueOf(i))).order(com.soundcloud.android.storage.Tables.StationsPlayQueues.POSITION, com.soundcloud.propeller.query.Query.Order.ASC)).map(TO_TRACK_URN);
    }

    ChangeResult saveLastPlayedTrackPosition(Urn urn, int i)
    {
        return propellerDatabase.update(com.soundcloud.android.storage.Tables.Stations.TABLE, ContentValuesBuilder.values().put(com.soundcloud.android.storage.Tables.Stations.LAST_PLAYED_TRACK_POSITION, i).get(), Filter.filter().whereEq(com.soundcloud.android.storage.Tables.Stations.STATION_URN, urn.toString()));
    }

    ChangeResult saveUnsyncedRecentlyPlayedStation(Urn urn)
    {
        return propellerDatabase.upsert(com.soundcloud.android.storage.Tables.StationsCollections.TABLE, ContentValuesBuilder.values().put(com.soundcloud.android.storage.Tables.StationsCollections.STATION_URN, urn.toString()).put(com.soundcloud.android.storage.Tables.StationsCollections.COLLECTION_TYPE, 0).put(com.soundcloud.android.storage.Tables.StationsCollections.UPDATED_LOCALLY_AT, dateProvider.getCurrentTime()).get());
    }

    b station(Urn urn)
    {
        return b.zip(propellerRx.query((Query)Query.from(new Table[] {
            com.soundcloud.android.storage.Tables.Stations.TABLE
        }).whereEq(com.soundcloud.android.storage.Tables.Stations.STATION_URN, urn)).map(TO_STATION_WITHOUT_TRACKS), propellerRx.query(buildTracksListQuery(urn)).map(TO_TRACK_URN).toList(), new _cls5());
    }


    private class _cls4
        implements f
    {

        final StationsStorage this$0;

        public volatile Object call(Object obj)
        {
            return call((CursorReader)obj);
        }

        public b call(CursorReader cursorreader)
        {
            return station(new Urn(cursorreader.getString(com.soundcloud.android.storage.Tables.Stations.STATION_URN)));
        }

        _cls4()
        {
            this$0 = StationsStorage.this;
            super();
        }
    }


    private class _cls5
        implements g
    {

        final StationsStorage this$0;

        public StationRecord call(Station station1, List list)
        {
            return new Station(station1.getUrn(), station1.getTitle(), station1.getType(), list, station1.getPermalink(), Integer.valueOf(station1.getPreviousPosition()));
        }

        public volatile Object call(Object obj, Object obj1)
        {
            return call((Station)obj, (List)obj1);
        }

        _cls5()
        {
            this$0 = StationsStorage.this;
            super();
        }
    }


    private class _cls1
        implements f
    {

        public final Station call(CursorReader cursorreader)
        {
            Urn urn = new Urn(cursorreader.getString(com.soundcloud.android.storage.Tables.Stations.STATION_URN));
            String s = cursorreader.getString(com.soundcloud.android.storage.Tables.Stations.TITLE);
            String s1 = cursorreader.getString(com.soundcloud.android.storage.Tables.Stations.TYPE);
            List list = Collections.emptyList();
            String s2 = cursorreader.getString(com.soundcloud.android.storage.Tables.Stations.PERMALINK);
            int i;
            if (cursorreader.isNull(com.soundcloud.android.storage.Tables.Stations.LAST_PLAYED_TRACK_POSITION))
            {
                i = Stations.NEVER_PLAYED;
            } else
            {
                i = cursorreader.getInt(com.soundcloud.android.storage.Tables.Stations.LAST_PLAYED_TRACK_POSITION);
            }
            return new Station(urn, s, s1, list, s2, Integer.valueOf(i));
        }

        public final volatile Object call(Object obj)
        {
            return call((CursorReader)obj);
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements f
    {

        public final Urn call(CursorReader cursorreader)
        {
            return new Urn(cursorreader.getString(com.soundcloud.android.storage.Tables.StationsPlayQueues.TRACK_URN));
        }

        public final volatile Object call(Object obj)
        {
            return call((CursorReader)obj);
        }

        _cls2()
        {
        }
    }


    private class _cls3
        implements ResultMapper
    {

        public final PropertySet map(CursorReader cursorreader)
        {
            return PropertySet.from(new PropertyBinding[] {
                StationProperty.URN.bind(new Urn(cursorreader.getString(com.soundcloud.android.storage.Tables.StationsCollections.STATION_URN))), StationProperty.UPDATED_LOCALLY_AT.bind(Long.valueOf(cursorreader.getLong(com.soundcloud.android.storage.Tables.StationsCollections.UPDATED_LOCALLY_AT))), StationProperty.POSITION.bind(Integer.valueOf(cursorreader.getInt(com.soundcloud.android.storage.Tables.StationsCollections.POSITION)))
            });
        }

        public final volatile Object map(CursorReader cursorreader)
        {
            return map(cursorreader);
        }

        _cls3()
        {
        }
    }

}
