// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.api.model.StationRecord;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlayQueueManager;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.stations:
//            StationViewModel, ShowAllStationsPresenter

class this._cls0
    implements f
{

    final ShowAllStationsPresenter this$0;

    public StationViewModel call(StationRecord stationrecord)
    {
        return new StationViewModel(stationrecord, ShowAllStationsPresenter.access$100(ShowAllStationsPresenter.this).getCollectionUrn().equals(stationrecord.getUrn()));
    }

    public volatile Object call(Object obj)
    {
        return call((StationRecord)obj);
    }

    ()
    {
        this$0 = ShowAllStationsPresenter.this;
        super();
    }
}
