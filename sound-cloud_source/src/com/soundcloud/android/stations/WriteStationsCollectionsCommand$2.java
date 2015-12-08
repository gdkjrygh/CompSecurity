// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Where;
import java.util.List;

// Referenced classes of package com.soundcloud.android.stations:
//            WriteStationsCollectionsCommand, ApiStationsCollections

class ncCollectionsMetadata extends com.soundcloud.propeller.mand._cls2
{

    final WriteStationsCollectionsCommand this$0;
    final ncCollectionsMetadata val$metadata;

    private void storeCollection(PropellerDatabase propellerdatabase, int i, List list)
    {
        step(WriteStationsCollectionsCommand.access$300(WriteStationsCollectionsCommand.this, propellerdatabase, list));
        step(WriteStationsCollectionsCommand.access$400(WriteStationsCollectionsCommand.this, propellerdatabase, i, list));
    }

    public void steps(PropellerDatabase propellerdatabase)
    {
        step(propellerdatabase.delete(com.soundcloud.android.storage..step, Filter.filter().whereLt(com.soundcloud.android.storage._LOCALLY_AT, Long.valueOf(ncCollectionsMetadata.access._mth100(val$metadata))).orWhereNull(com.soundcloud.android.storage._LOCALLY_AT)));
        ApiStationsCollections apistationscollections = ncCollectionsMetadata.access._mth200(val$metadata);
        storeCollection(propellerdatabase, 0, apistationscollections.getRecents());
        storeCollection(propellerdatabase, 1, apistationscollections.getSaved());
        storeCollection(propellerdatabase, 5, apistationscollections.getCuratorRecommendations());
        storeCollection(propellerdatabase, 4, apistationscollections.getGenreRecommendations());
        storeCollection(propellerdatabase, 3, apistationscollections.getTrackRecommendations());
    }

    ncCollectionsMetadata()
    {
        this$0 = final_writestationscollectionscommand;
        val$metadata = ncCollectionsMetadata.this;
        super();
    }
}
