// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.analytics.ScreenAnalytics;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.rx.ReactiveUI;
import me.lyft.android.rx.VisibilityBinding;
import me.lyft.android.ui.UserImageView;
import me.lyft.android.ui.ride.RideMap;
import rx.Observable;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideInProgressView

class this._cls1
    implements Action1
{

    final layPassengerNameAndRating this$1;

    public volatile void call(Object obj)
    {
        call((String)obj);
    }

    public void call(String s)
    {
        displayPassengerNameAndRating();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class me/lyft/android/ui/driver/DriverRideInProgressView$5

/* anonymous class */
    class DriverRideInProgressView._cls5
        implements Action1
    {

        final DriverRideInProgressView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            rideMap.clearRoutes();
            rideMap.bindPadding(driverRideTop, driverRideBottom);
            DriverRideInProgressView.access$500(DriverRideInProgressView.this).bind(routeProvider.observeRide(), DriverRideInProgressView.access$400(DriverRideInProgressView.this));
            DriverRideInProgressView.access$500(DriverRideInProgressView.this).bind(ReactiveUI.and(new Observable[] {
                ReactiveUI.not(DriverRideInProgressView.access$600(DriverRideInProgressView.this)), DriverRideInProgressView.access$700(DriverRideInProgressView.this), ReactiveUI.not(DriverRideInProgressView.access$800(DriverRideInProgressView.this))
            }), new VisibilityBinding(tapToEditView));
            DriverRideInProgressView.access$500(DriverRideInProgressView.this).bind(ReactiveUI.and(new Observable[] {
                ReactiveUI.not(DriverRideInProgressView.access$600(DriverRideInProgressView.this)), DriverRideInProgressView.access$700(DriverRideInProgressView.this)
            }), DriverRideInProgressView.access$900(DriverRideInProgressView.this));
            DriverRideInProgressView.access$500(DriverRideInProgressView.this).bind(toolbar.observeItemClick(), DriverRideInProgressView.access$1000(DriverRideInProgressView.this));
            DriverRideInProgressView.access$500(DriverRideInProgressView.this).bind(DriverRideInProgressView.access$1100(DriverRideInProgressView.this), DriverRideInProgressView.access$1200(DriverRideInProgressView.this));
            DriverRideInProgressView.access$500(DriverRideInProgressView.this).bind(rideMap.observeMapDragStart(), DriverRideInProgressView.access$1300(DriverRideInProgressView.this));
            DriverRideInProgressView.access$500(DriverRideInProgressView.this).bind(bus.observe(me/lyft/android/ui/driver/DriverRideInProgressView$DriverLocationIssueDialogResultEvent), DriverRideInProgressView.access$1400(DriverRideInProgressView.this));
            DriverRideInProgressView.access$500(DriverRideInProgressView.this).bind(bus.observe(me/lyft/android/ui/driver/DriverRideInProgressView$DriverCallPassengerDialogResultEvent), DriverRideInProgressView.access$1500(DriverRideInProgressView.this));
            DriverRideInProgressView.access$500(DriverRideInProgressView.this).bind(bus.observe(me/lyft/android/ui/driver/RideArrivalConfirmationDialogView$RideArrivalConfirmationResultEvent), DriverRideInProgressView.access$1600(DriverRideInProgressView.this));
            DriverRideInProgressView.access$500(DriverRideInProgressView.this).bind(bus.observe(me/lyft/android/ui/driver/RideDropoffConfirmationDialogView$RideDropoffConfirmationResultEvent), DriverRideInProgressView.access$1700(DriverRideInProgressView.this));
            DriverRideInProgressView.access$500(DriverRideInProgressView.this).bind(DriverRideInProgressView.access$600(DriverRideInProgressView.this), new VisibilityBinding(rideOverviewMapButton));
            DriverRideInProgressView.access$500(DriverRideInProgressView.this).bind(DriverRideInProgressView.access$1800(DriverRideInProgressView.this), new DriverRideInProgressView._cls5._cls1());
            DriverRideInProgressView.access$500(DriverRideInProgressView.this).bind(DriverRideInProgressView.access$1900(DriverRideInProgressView.this), new DriverRideInProgressView._cls5._cls2());
            DriverRideInProgressView.access$500(DriverRideInProgressView.this).bind(ReactiveUI.any(DriverRideInProgressView.access$1900(DriverRideInProgressView.this), ReactiveUI.isTrue(appForegroundDetector.observeAppForegrounded())), new DriverRideInProgressView._cls5._cls3());
            DriverRideInProgressView.access$500(DriverRideInProgressView.this).bind(DriverRideInProgressView.access$2400(DriverRideInProgressView.this), DriverRideInProgressView.access$2500(DriverRideInProgressView.this));
            DriverRideInProgressView.access$500(DriverRideInProgressView.this).bind(ReactiveUI.isTrue(DriverRideInProgressView.access$2600(DriverRideInProgressView.this)), new DriverRideInProgressView._cls5._cls4());
            DriverRideInProgressView.access$500(DriverRideInProgressView.this).bind(ReactiveUI.isTrue(DriverRideInProgressView.access$700(DriverRideInProgressView.this)), new DriverRideInProgressView._cls5._cls5());
            DriverRideInProgressView.access$500(DriverRideInProgressView.this).bind(DriverRideInProgressView.access$2700(DriverRideInProgressView.this), new DriverRideInProgressView._cls5._cls6());
            DriverRideInProgressView.access$500(DriverRideInProgressView.this).bind(DriverRideInProgressView.access$2800(DriverRideInProgressView.this), new DriverRideInProgressView._cls5._cls7());
        }

            
            {
                this$0 = DriverRideInProgressView.this;
                super();
            }

        // Unreferenced inner class me/lyft/android/ui/driver/DriverRideInProgressView$5$2

/* anonymous class */
        class DriverRideInProgressView._cls5._cls2
            implements Action1
        {

            final DriverRideInProgressView._cls5 this$1;

            public volatile void call(Object obj)
            {
                call((Stop)obj);
            }

            public void call(Stop stop)
            {
                if (stop.isPickup())
                {
                    displayPickupAddress(DriverRideInProgressView.access$100(this$0));
                    DriverRideInProgressView.access$2000(this$0, DriverRideInProgressView.access$100(this$0));
                } else
                if (stop.isDropOff())
                {
                    displayDropoffAddress(DriverRideInProgressView.access$100(this$0));
                    DriverRideInProgressView.access$2100(this$0, DriverRideInProgressView.access$100(this$0));
                    return;
                }
            }

                    
                    {
                        this$1 = DriverRideInProgressView._cls5.this;
                        super();
                    }
        }


        // Unreferenced inner class me/lyft/android/ui/driver/DriverRideInProgressView$5$3

/* anonymous class */
        class DriverRideInProgressView._cls5._cls3
            implements Action1
        {

            final DriverRideInProgressView._cls5 this$1;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                if (DriverRideInProgressView.access$100(this$0).isPickup())
                {
                    DriverRideInProgressView.access$2200(this$0, DriverRideInProgressView.access$100(this$0));
                    return;
                } else
                {
                    DriverRideInProgressView.access$2300(this$0, DriverRideInProgressView.access$100(this$0));
                    return;
                }
            }

                    
                    {
                        this$1 = DriverRideInProgressView._cls5.this;
                        super();
                    }
        }


        // Unreferenced inner class me/lyft/android/ui/driver/DriverRideInProgressView$5$4

/* anonymous class */
        class DriverRideInProgressView._cls5._cls4
            implements Action1
        {

            final DriverRideInProgressView._cls5 this$1;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                ScreenAnalytics.trackScreenView("driver_ride_accepted");
            }

                    
                    {
                        this$1 = DriverRideInProgressView._cls5.this;
                        super();
                    }
        }


        // Unreferenced inner class me/lyft/android/ui/driver/DriverRideInProgressView$5$5

/* anonymous class */
        class DriverRideInProgressView._cls5._cls5
            implements Action1
        {

            final DriverRideInProgressView._cls5 this$1;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                ScreenAnalytics.trackScreenView("driver_dropoff");
            }

                    
                    {
                        this$1 = DriverRideInProgressView._cls5.this;
                        super();
                    }
        }


        // Unreferenced inner class me/lyft/android/ui/driver/DriverRideInProgressView$5$6

/* anonymous class */
        class DriverRideInProgressView._cls5._cls6
            implements Action1
        {

            final DriverRideInProgressView._cls5 this$1;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                if (DriverRideInProgressView.access$100(this$0).isPickup())
                {
                    DriverRideInProgressView.access$2200(this$0, DriverRideInProgressView.access$100(this$0));
                    return;
                } else
                {
                    DriverRideInProgressView.access$2300(this$0, DriverRideInProgressView.access$100(this$0));
                    return;
                }
            }

                    
                    {
                        this$1 = DriverRideInProgressView._cls5.this;
                        super();
                    }
        }


        // Unreferenced inner class me/lyft/android/ui/driver/DriverRideInProgressView$5$7

/* anonymous class */
        class DriverRideInProgressView._cls5._cls7
            implements Action1
        {

            final DriverRideInProgressView._cls5 this$1;

            public volatile void call(Object obj)
            {
                call((String)obj);
            }

            public void call(String s)
            {
                passengerPhotoImageView.loadPhoto(s);
            }

                    
                    {
                        this$1 = DriverRideInProgressView._cls5.this;
                        super();
                    }
        }

    }

}
