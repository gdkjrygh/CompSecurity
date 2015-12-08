// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.api.model.StationRecord;
import com.soundcloud.android.model.Urn;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.QueryResult;
import com.soundcloud.propeller.query.Query;
import java.util.List;

// Referenced classes of package com.soundcloud.android.stations:
//            StoreStationCommand

class  extends com.soundcloud.propeller.saction
{

    final StoreStationCommand this$0;
    final StationRecord val$station;

    private void addPlayQueue(PropellerDatabase propellerdatabase)
    {
        List list = val$station.getTracks();
        Integer integer = (Integer)propellerdatabase.query((Query)Query.count(com.soundcloud.android.storage.ues.TABLE).whereEq(com.soundcloud.android.storage.ues.STATION_URN, val$station.getUrn().toString())).first(java/lang/Integer);
        for (int i = 0; i < list.size(); i++)
        {
            step(propellerdatabase.upsert(com.soundcloud.android.storage.ues.TABLE, StoreStationCommand.access$100(StoreStationCommand.this, val$station, (Urn)list.get(i), integer.intValue() + i)));
        }

    }

    public void steps(PropellerDatabase propellerdatabase)
    {
        step(propellerdatabase.upsert(com.soundcloud.android.storage..step, StoreStationCommand.access$000(StoreStationCommand.this, val$station)));
        addPlayQueue(propellerdatabase);
    }

    es()
    {
        this$0 = final_storestationcommand;
        val$station = StationRecord.this;
        super();
    }
}
