// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import android.view.View;
import com.soundcloud.android.api.model.StationRecord;

// Referenced classes of package com.soundcloud.android.stations:
//            StationRenderer, StartStationPresenter

class val.station
    implements android.view.er
{

    final StationRenderer this$0;
    final StationRecord val$station;

    public void onClick(View view)
    {
        StationRenderer.access$000(StationRenderer.this).startStation(view.getContext(), val$station.getUrn());
    }

    ter()
    {
        this$0 = final_stationrenderer;
        val$station = StationRecord.this;
        super();
    }
}
