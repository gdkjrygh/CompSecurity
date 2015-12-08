// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.common.Unit;
import me.lyft.android.events.AppStateUpdatedEvent;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.rx.VisibilityBinding;
import me.lyft.android.services.HeatMapService;
import me.lyft.android.ui.ride.RideMap;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideIdleView

class this._cls0
    implements Action1
{

    final DriverRideIdleView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        rideMap.bindPadding(driverRideTop, driverRideBottom);
        rideMap.centerToCurrentLocation(12F);
        rideMap.clearAllMarkers();
        DriverRideIdleView.access$100(DriverRideIdleView.this).bind(bus.observe(me/lyft/android/events/AppStateUpdatedEvent), DriverRideIdleView.access$000(DriverRideIdleView.this));
        DriverRideIdleView.access$100(DriverRideIdleView.this).bind(DriverRideIdleView.access$200(DriverRideIdleView.this), new VisibilityBinding(heatmapHeader));
        DriverRideIdleView.access$100(DriverRideIdleView.this).bind(DriverRideIdleView.access$200(DriverRideIdleView.this), DriverRideIdleView.access$300(DriverRideIdleView.this));
        DriverRideIdleView.access$100(DriverRideIdleView.this).bind(heatMapService.observeHeatMapMetaData(), DriverRideIdleView.access$400(DriverRideIdleView.this));
        DriverRideIdleView.access$100(DriverRideIdleView.this).bind(DriverRideIdleView.access$500(DriverRideIdleView.this), DriverRideIdleView.access$600(DriverRideIdleView.this));
        DriverRideIdleView.access$100(DriverRideIdleView.this).bind(rideMap.observeCameraZoomChanged(), DriverRideIdleView.access$700(DriverRideIdleView.this));
        DriverRideIdleView.access$100(DriverRideIdleView.this).bind(DriverRideIdleView.access$800(DriverRideIdleView.this), DriverRideIdleView.access$900(DriverRideIdleView.this));
        DriverRideIdleView.access$100(DriverRideIdleView.this).bind(rideMap.observeMapDragStart(), DriverRideIdleView.access$1000(DriverRideIdleView.this));
    }

    ()
    {
        this$0 = DriverRideIdleView.this;
        super();
    }
}
