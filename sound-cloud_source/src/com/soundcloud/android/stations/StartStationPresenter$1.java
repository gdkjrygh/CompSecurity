// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.analytics.ScreenProvider;
import com.soundcloud.android.api.model.StationRecord;
import com.soundcloud.android.playback.PlaySessionSource;
import com.soundcloud.android.playback.PlaybackInitiator;
import com.soundcloud.java.checks.Preconditions;
import java.util.List;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.stations:
//            StartStationPresenter

class this._cls0
    implements f
{

    final StartStationPresenter this$0;

    public volatile Object call(Object obj)
    {
        return call((StationRecord)obj);
    }

    public b call(StationRecord stationrecord)
    {
        PlaySessionSource playsessionsource;
        boolean flag;
        if (!stationrecord.getTracks().isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "The stationWithSeed does not have any tracks.");
        playsessionsource = PlaySessionSource.forStation(StartStationPresenter.access$000(StartStationPresenter.this).getLastScreenTag(), stationrecord.getUrn());
        return StartStationPresenter.access$100(StartStationPresenter.this).playStation(stationrecord.getUrn(), stationrecord.getTracks(), playsessionsource, stationrecord.getPreviousPosition());
    }

    ()
    {
        this$0 = StartStationPresenter.this;
        super();
    }
}
