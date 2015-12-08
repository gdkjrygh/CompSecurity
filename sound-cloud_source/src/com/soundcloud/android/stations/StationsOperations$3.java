// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.api.model.StationRecord;
import com.soundcloud.android.model.Urn;
import java.util.List;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.stations:
//            Station, StationsOperations

class val.seed
    implements f
{

    final StationsOperations this$0;
    final Urn val$seed;

    public StationRecord call(StationRecord stationrecord)
    {
        if (stationrecord.getTracks().isEmpty())
        {
            return stationrecord;
        } else
        {
            return Station.stationWithSeedTrack(stationrecord, val$seed);
        }
    }

    public volatile Object call(Object obj)
    {
        return call((StationRecord)obj);
    }

    ()
    {
        this$0 = final_stationsoperations;
        val$seed = Urn.this;
        super();
    }
}
