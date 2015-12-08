// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.res.Resources;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.NullLocation;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.ReactiveProperty;
import me.lyft.android.ui.dialogs.Toast;
import me.lyft.android.ui.ride.RideMap;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverDestinyView

class val.destinyLocation extends AsyncCall
{

    final val.destinyLocation this$1;
    final Location val$destinyLocation;

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Location)obj);
    }

    public void onSuccess(Location location)
    {
        super.onSuccess(location);
        rideMap.showDriverDirections(location, val$destinyLocation, getResources().getColor(0x7f0c007e));
        rideMap.fitMapTo(new Location[] {
            location, val$destinyLocation
        });
    }

    Instance()
    {
        this$1 = final_instance;
        val$destinyLocation = Location.this;
        super();
    }

    // Unreferenced inner class me/lyft/android/ui/driver/DriverDestinyView$6

/* anonymous class */
    class DriverDestinyView._cls6
        implements Action1
    {

        private Location previousLocation;
        final DriverDestinyView this$0;

        public volatile void call(Object obj)
        {
            call((Location)obj);
        }

        public void call(Location location)
        {
            if (!previousLocation.isNull() && location.isNull())
            {
                String s = constantsProvider.getConstants().getDestinyEndedModalText(getResources().getString(0x7f070114));
                dialogFlow.show(new Toast(s));
            }
            DriverDestinyView.access$400(DriverDestinyView.this).onNext(location.getDisplayName());
            rideMap.clearAllMarkers();
            rideMap.clearRoutes();
            if (!location.isNull())
            {
                rideMap.showDestinationMarker(location);
                DriverDestinyView.access$200(DriverDestinyView.this).bind(locationService.getLastLocation(), location. new DriverDestinyView._cls6._cls1());
            }
            previousLocation = location;
        }

            
            {
                this$0 = DriverDestinyView.this;
                super();
                previousLocation = NullLocation.getInstance();
            }
    }

}
