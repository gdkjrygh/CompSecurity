// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import android.content.ContentValues;
import com.soundcloud.android.commands.WriteStorageCommand;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.Lists;
import com.soundcloud.java.functions.Function;
import com.soundcloud.java.objects.MoreObjects;
import com.soundcloud.propeller.ContentValuesBuilder;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.TxnResult;
import com.soundcloud.propeller.WriteResult;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.soundcloud.android.stations:
//            ApiStationMetadata, ApiStationsCollections

public class WriteStationsCollectionsCommand extends WriteStorageCommand
{
    static final class SyncCollectionsMetadata
    {

        private final long clearBeforeTime;
        private final ApiStationsCollections stationsCollections;

        public final boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (SyncCollectionsMetadata)obj;
                if (!MoreObjects.equal(Long.valueOf(clearBeforeTime), Long.valueOf(((SyncCollectionsMetadata) (obj)).clearBeforeTime)) || !MoreObjects.equal(stationsCollections, ((SyncCollectionsMetadata) (obj)).stationsCollections))
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return MoreObjects.hashCode(new Object[] {
                Long.valueOf(clearBeforeTime), stationsCollections
            });
        }



        public SyncCollectionsMetadata(long l, ApiStationsCollections apistationscollections)
        {
            clearBeforeTime = l;
            stationsCollections = apistationscollections;
        }
    }


    private static final Function TO_CONTENT_VALUES = new _cls1();

    WriteStationsCollectionsCommand(PropellerDatabase propellerdatabase)
    {
        super(propellerdatabase);
    }

    private TxnResult addStationsToCollection(PropellerDatabase propellerdatabase, int i, List list)
    {
        return propellerdatabase.bulkInsert(com.soundcloud.android.storage.Tables.StationsCollections.TABLE, toStationsCollectionsContentValues(list, i), 4);
    }

    private static ContentValues buildStationContentValues(ApiStationMetadata apistationmetadata)
    {
        return ContentValuesBuilder.values().put(com.soundcloud.android.storage.Tables.Stations.STATION_URN, apistationmetadata.getUrn().toString()).put(com.soundcloud.android.storage.Tables.Stations.TYPE, apistationmetadata.getType()).put(com.soundcloud.android.storage.Tables.Stations.TITLE, apistationmetadata.getTitle()).put(com.soundcloud.android.storage.Tables.Stations.PERMALINK, apistationmetadata.getPermalink()).get();
    }

    private ContentValues buildStationsCollectionsItemContentValues(ApiStationMetadata apistationmetadata, int i, int j)
    {
        return ContentValuesBuilder.values().put(com.soundcloud.android.storage.Tables.StationsCollections.STATION_URN, apistationmetadata.getUrn().toString()).put(com.soundcloud.android.storage.Tables.StationsCollections.COLLECTION_TYPE, i).put(com.soundcloud.android.storage.Tables.StationsCollections.POSITION, j).get();
    }

    private TxnResult saveStations(PropellerDatabase propellerdatabase, List list)
    {
        return propellerdatabase.bulkUpsert(com.soundcloud.android.storage.Tables.Stations.TABLE, Lists.transform(list, TO_CONTENT_VALUES));
    }

    private ArrayList toStationsCollectionsContentValues(List list, int i)
    {
        ArrayList arraylist = new ArrayList();
        for (int j = 0; j < list.size(); j++)
        {
            arraylist.add(buildStationsCollectionsItemContentValues((ApiStationMetadata)list.get(j), i, j));
        }

        return arraylist;
    }

    protected Boolean transform(TxnResult txnresult)
    {
        return Boolean.valueOf(txnresult.success());
    }

    protected volatile Object transform(WriteResult writeresult)
    {
        return transform((TxnResult)writeresult);
    }

    protected TxnResult write(PropellerDatabase propellerdatabase, final SyncCollectionsMetadata metadata)
    {
        return propellerdatabase.runTransaction(new _cls2());
    }

    protected volatile WriteResult write(PropellerDatabase propellerdatabase, Object obj)
    {
        return write(propellerdatabase, (SyncCollectionsMetadata)obj);
    }





    private class _cls2 extends com.soundcloud.propeller.PropellerDatabase.Transaction
    {

        final WriteStationsCollectionsCommand this$0;
        final SyncCollectionsMetadata val$metadata;

        private void storeCollection(PropellerDatabase propellerdatabase, int i, List list)
        {
            step(saveStations(propellerdatabase, list));
            step(addStationsToCollection(propellerdatabase, i, list));
        }

        public void steps(PropellerDatabase propellerdatabase)
        {
            step(propellerdatabase.delete(com.soundcloud.android.storage.Tables.StationsCollections.TABLE, Filter.filter().whereLt(com.soundcloud.android.storage.Tables.StationsCollections.UPDATED_LOCALLY_AT, Long.valueOf(metadata.clearBeforeTime)).orWhereNull(com.soundcloud.android.storage.Tables.StationsCollections.UPDATED_LOCALLY_AT)));
            ApiStationsCollections apistationscollections = metadata.stationsCollections;
            storeCollection(propellerdatabase, 0, apistationscollections.getRecents());
            storeCollection(propellerdatabase, 1, apistationscollections.getSaved());
            storeCollection(propellerdatabase, 5, apistationscollections.getCuratorRecommendations());
            storeCollection(propellerdatabase, 4, apistationscollections.getGenreRecommendations());
            storeCollection(propellerdatabase, 3, apistationscollections.getTrackRecommendations());
        }

        _cls2()
        {
            this$0 = WriteStationsCollectionsCommand.this;
            metadata = synccollectionsmetadata;
            super();
        }
    }


    private class _cls1
        implements Function
    {

        public final ContentValues apply(ApiStationMetadata apistationmetadata)
        {
            return WriteStationsCollectionsCommand.buildStationContentValues(apistationmetadata);
        }

        public final volatile Object apply(Object obj)
        {
            return apply((ApiStationMetadata)obj);
        }

        _cls1()
        {
        }
    }

}
