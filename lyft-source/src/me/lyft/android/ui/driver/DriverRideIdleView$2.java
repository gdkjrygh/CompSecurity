// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.infrastructure.lyft.ride.HeatmapMetaDTO;
import me.lyft.android.services.HeatMapService;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideIdleView

class this._cls0
    implements android.view.deIdleView._cls2
{

    final DriverRideIdleView this$0;

    public void onClick(View view)
    {
        dialogFlow.show(new meHeatmapDialog((String)Objects.firstNonNull(heatMapService.getHeatMapMetaData().getPrimeTimeRange(), "")));
    }

    pMetaDTO()
    {
        this$0 = DriverRideIdleView.this;
        super();
    }
}
