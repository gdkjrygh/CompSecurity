// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.ride.IRequestRideTypeProvider;
import me.lyft.android.domain.ride.RequestRideType;
import me.lyft.android.features.FeatureFlag;
import me.lyft.android.features.Features;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.constants.Constants;
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
        call((AppStateDTO)obj);
    }

    public void call(AppStateDTO appstatedto)
    {
        DriverRideIdleView.access$1200(DriverRideIdleView.this).onNext(constantsProvider.getConstants().getHeatmapTilesUrl());
        DriverRideIdleView.access$1300(DriverRideIdleView.this).onNext(requestRideTypeProvider.getDefaultRideType().getDrivers());
        DriverRideIdleView.access$800(DriverRideIdleView.this).onNext(Boolean.valueOf(Features.HEATMAPS.isEnabled()));
    }

    ()
    {
        this$0 = DriverRideIdleView.this;
        super();
    }
}
