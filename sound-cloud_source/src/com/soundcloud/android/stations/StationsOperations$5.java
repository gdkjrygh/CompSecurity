// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.api.model.StationRecord;
import com.soundcloud.android.model.Urn;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsOperations, StationsStorage

class val.startPosition
    implements f
{

    final StationsOperations this$0;
    final int val$startPosition;
    final Urn val$station;

    public volatile Object call(Object obj)
    {
        return call((StationRecord)obj);
    }

    public b call(StationRecord stationrecord)
    {
        return StationsOperations.access$100(StationsOperations.this).loadPlayQueue(val$station, val$startPosition);
    }

    ()
    {
        this$0 = final_stationsoperations;
        val$station = urn;
        val$startPosition = I.this;
        super();
    }
}
