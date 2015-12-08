// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlayQueue;
import java.util.List;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsOperations

class val.station
    implements f
{

    final StationsOperations this$0;
    final Urn val$station;

    public PlayQueue call(List list)
    {
        return PlayQueue.fromStation(val$station, list);
    }

    public volatile Object call(Object obj)
    {
        return call((List)obj);
    }

    ()
    {
        this$0 = final_stationsoperations;
        val$station = Urn.this;
        super();
    }
}
