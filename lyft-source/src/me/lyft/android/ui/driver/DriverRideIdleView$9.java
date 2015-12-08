// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.infrastructure.lyft.ride.HeatmapMetaDTO;
import me.lyft.android.rx.ReactiveProperty;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideIdleView

class this._cls0
    implements Action1
{

    final DriverRideIdleView this$0;

    public volatile void call(Object obj)
    {
        call((HeatmapMetaDTO)obj);
    }

    public void call(HeatmapMetaDTO heatmapmetadto)
    {
        DriverRideIdleView.access$500(DriverRideIdleView.this).onNext(heatmapmetadto);
        DriverRideIdleView.access$1100(DriverRideIdleView.this);
    }

    pMetaDTO()
    {
        this$0 = DriverRideIdleView.this;
        super();
    }
}
