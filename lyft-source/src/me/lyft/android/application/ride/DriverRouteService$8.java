// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import me.lyft.android.infrastructure.googleplaces.IGooglePlaceService;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.rx.SimpleSubscriber;
import rx.Observable;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.application.ride:
//            DriverRouteService

class val.placeId
    implements Action1
{

    final DriverRouteService this$0;
    final String val$placeId;

    public volatile void call(Object obj)
    {
        call((AppStateDTO)obj);
    }

    public void call(AppStateDTO appstatedto)
    {
        DriverRouteService.access$200(DriverRouteService.this).reportPlace(val$placeId, "passenger_dropoff").subscribe(new SimpleSubscriber());
    }

    ceService()
    {
        this$0 = final_driverrouteservice;
        val$placeId = String.this;
        super();
    }
}
