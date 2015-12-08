// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.api.model.StationRecord;
import java.util.List;
import rx.b.g;

// Referenced classes of package com.soundcloud.android.stations:
//            Station, StationsStorage

class this._cls0
    implements g
{

    final StationsStorage this$0;

    public StationRecord call(Station station, List list)
    {
        return new Station(station.getUrn(), station.getTitle(), station.getType(), list, station.getPermalink(), Integer.valueOf(station.getPreviousPosition()));
    }

    public volatile Object call(Object obj, Object obj1)
    {
        return call((Station)obj, (List)obj1);
    }

    ()
    {
        this$0 = StationsStorage.this;
        super();
    }
}
