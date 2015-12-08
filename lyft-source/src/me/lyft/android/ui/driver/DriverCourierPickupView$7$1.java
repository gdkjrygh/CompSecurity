// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.UserImageView;
import me.lyft.android.ui.ride.RideMap;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverCourierPickupView, DriverFollowLocationAndStopButton

class this._cls1
    implements Action1
{

    final engerPhotoImageView this$1;

    public volatile void call(Object obj)
    {
        call((String)obj);
    }

    public void call(String s)
    {
        passengerPhotoImageView.loadPhoto(s);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class me/lyft/android/ui/driver/DriverCourierPickupView$7

/* anonymous class */
    class DriverCourierPickupView._cls7
        implements Action1
    {

        final DriverCourierPickupView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            rideMap.clearRoutes();
            rideMap.bindPadding(driverRideTop, driverRideBottom);
            DriverCourierPickupView.access$400(DriverCourierPickupView.this).bind(routeProvider.observeRide(), DriverCourierPickupView.access$300(DriverCourierPickupView.this));
            DriverCourierPickupView.access$400(DriverCourierPickupView.this).bind(toolbar.observeItemClick(), DriverCourierPickupView.access$500(DriverCourierPickupView.this));
            DriverCourierPickupView.access$400(DriverCourierPickupView.this).bind(rideMap.observeMapDragStart(), DriverCourierPickupView.access$600(DriverCourierPickupView.this));
            DriverCourierPickupView.access$400(DriverCourierPickupView.this).bind(bus.observe(me/lyft/android/ui/driver/NoShowConfirmationDialogView$NoShowConfirmationResultEvent), DriverCourierPickupView.access$700(DriverCourierPickupView.this));
            DriverCourierPickupView.access$400(DriverCourierPickupView.this).bind(bus.observe(me/lyft/android/ui/driver/RidePickupConfirmationDialogView$RidePickupConfirmationResultEvent), DriverCourierPickupView.access$800(DriverCourierPickupView.this));
            DriverCourierPickupView.access$400(DriverCourierPickupView.this).bind(bus.observe(me/lyft/android/ui/driver/SkipPassengerDialogView$PassengerSkipResultEvent), DriverCourierPickupView.access$900(DriverCourierPickupView.this));
            DriverCourierPickupView.access$400(DriverCourierPickupView.this).bind(DriverCourierPickupView.access$1000(DriverCourierPickupView.this), new DriverCourierPickupView._cls7._cls1());
            DriverCourierPickupView.access$400(DriverCourierPickupView.this).bind(DriverCourierPickupView.access$1100(DriverCourierPickupView.this), DriverCourierPickupView.access$1200(DriverCourierPickupView.this));
            followCurrentLocationButton.setZoomOutEnabled(true);
            DriverCourierPickupView.access$1300(DriverCourierPickupView.this, routeProvider.getDriverRide().getCurrentStop());
        }

            
            {
                this$0 = DriverCourierPickupView.this;
                super();
            }
    }

}
