// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import android.content.ContentValues;
import com.soundcloud.android.api.model.StationRecord;
import com.soundcloud.android.commands.DefaultWriteStorageCommand;
import com.soundcloud.android.model.Urn;
import com.soundcloud.propeller.ContentValuesBuilder;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.WriteResult;

class StoreStationCommand extends DefaultWriteStorageCommand
{

    public StoreStationCommand(PropellerDatabase propellerdatabase)
    {
        super(propellerdatabase);
    }

    private ContentValues buildContentValues(StationRecord stationrecord, Urn urn, int i)
    {
        return ContentValuesBuilder.values().put(com.soundcloud.android.storage.Tables.StationsPlayQueues.STATION_URN, stationrecord.getUrn().toString()).put(com.soundcloud.android.storage.Tables.StationsPlayQueues.TRACK_URN, urn.toString()).put(com.soundcloud.android.storage.Tables.StationsPlayQueues.POSITION, i).get();
    }

    private ContentValues buildStationContentValues(StationRecord stationrecord)
    {
        return ContentValuesBuilder.values().put(com.soundcloud.android.storage.Tables.Stations.STATION_URN, stationrecord.getUrn().toString()).put(com.soundcloud.android.storage.Tables.Stations.TYPE, stationrecord.getType()).put(com.soundcloud.android.storage.Tables.Stations.TITLE, stationrecord.getTitle()).put(com.soundcloud.android.storage.Tables.Stations.PERMALINK, stationrecord.getPermalink()).get();
    }

    protected WriteResult write(PropellerDatabase propellerdatabase, final StationRecord station)
    {
        return propellerdatabase.runTransaction(new _cls1());
    }

    protected volatile WriteResult write(PropellerDatabase propellerdatabase, Object obj)
    {
        return write(propellerdatabase, (StationRecord)obj);
    }



    private class _cls1 extends com.soundcloud.propeller.PropellerDatabase.Transaction
    {

        final StoreStationCommand this$0;
        final StationRecord val$station;

        private void addPlayQueue(PropellerDatabase propellerdatabase)
        {
            List list = station.getTracks();
            Integer integer = (Integer)propellerdatabase.query((Query)Query.count(com.soundcloud.android.storage.Tables.StationsPlayQueues.TABLE).whereEq(com.soundcloud.android.storage.Tables.StationsPlayQueues.STATION_URN, station.getUrn().toString())).first(java/lang/Integer);
            for (int i = 0; i < list.size(); i++)
            {
                step(propellerdatabase.upsert(com.soundcloud.android.storage.Tables.StationsPlayQueues.TABLE, buildContentValues(station, (Urn)list.get(i), integer.intValue() + i)));
            }

        }

        public void steps(PropellerDatabase propellerdatabase)
        {
            step(propellerdatabase.upsert(com.soundcloud.android.storage.Tables.Stations.TABLE, buildStationContentValues(station)));
            addPlayQueue(propellerdatabase);
        }

        _cls1()
        {
            this$0 = StoreStationCommand.this;
            station = stationrecord;
            super();
        }
    }

}
