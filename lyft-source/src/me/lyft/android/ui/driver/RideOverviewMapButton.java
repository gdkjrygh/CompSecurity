// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Iterables;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.ReactiveProperty;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            RideProgressPassengerItem

public class RideOverviewMapButton extends LinearLayout
{

    private static final int MAX_DISPLAYED_PASSENGERS = 4;
    AppFlow appFlow;
    private ReactiveProperty currentPassengersSubject;
    private Action1 onRouteChanged;
    LinearLayout passengersContainer;
    LinearLayout queuedPassengersContainer;
    private ReactiveProperty queuedPassengersSubject;
    IDriverRideProvider routeProvider;

    public RideOverviewMapButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        currentPassengersSubject = ReactiveProperty.create(Collections.emptyList());
        queuedPassengersSubject = ReactiveProperty.create(Collections.emptyList());
        onRouteChanged = new Action1() {

            final RideOverviewMapButton this$0;

            public volatile void call(Object obj)
            {
                call((DriverRide)obj);
            }

            public void call(DriverRide driverride)
            {
                driverride = routeProvider.getDriverRide().getCurrentRouteNotDroppedOffPassengers();
                List list = routeProvider.getDriverRide().getPassengersFromNextRoute();
                currentPassengersSubject.onNext(driverride);
                queuedPassengersSubject.onNext(Iterables.take(list, 4 - driverride.size()));
            }

            
            {
                this$0 = RideOverviewMapButton.this;
                super();
            }
        };
        attributeset = Scoop.a(this);
        attributeset.b(this);
        attributeset.a(context).inflate(0x7f03011a, this);
    }

    private RideProgressPassengerItem createPassengerItem(Passenger passenger)
    {
        RideProgressPassengerItem rideprogresspassengeritem = new RideProgressPassengerItem(getContext());
        rideprogresspassengeritem.setPartyProfilePhoto(passenger.getPhotoUrl());
        rideprogresspassengeritem.setPartySize(Integer.valueOf(passenger.getPartySize()));
        rideprogresspassengeritem.setPickedUp(passenger.isPickedup());
        return rideprogresspassengeritem;
    }

    private void updateQueuedRoutesOverviewLayout(List list)
    {
        if (list.isEmpty())
        {
            queuedPassengersContainer.setVisibility(8);
        } else
        {
            queuedPassengersContainer.setVisibility(0);
            queuedPassengersContainer.removeAllViews();
            list = list.iterator();
            while (list.hasNext()) 
            {
                RideProgressPassengerItem rideprogresspassengeritem = createPassengerItem((Passenger)list.next());
                queuedPassengersContainer.addView(rideprogresspassengeritem);
            }
        }
    }

    private void updateRouteOverviewLayout(List list)
    {
        passengersContainer.removeAllViews();
        RideProgressPassengerItem rideprogresspassengeritem;
        for (list = list.iterator(); list.hasNext(); passengersContainer.addView(rideprogresspassengeritem))
        {
            rideprogresspassengeritem = createPassengerItem((Passenger)list.next());
        }

    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            Binder binder = Binder.attach(this);
            binder.bind(routeProvider.observeRide(), onRouteChanged);
            binder.bind(currentPassengersSubject, new Action1() {

                final RideOverviewMapButton this$0;

                public volatile void call(Object obj)
                {
                    call((List)obj);
                }

                public void call(List list)
                {
                    updateRouteOverviewLayout(list);
                }

            
            {
                this$0 = RideOverviewMapButton.this;
                super();
            }
            });
            binder.bind(queuedPassengersSubject, new Action1() {

                final RideOverviewMapButton this$0;

                public volatile void call(Object obj)
                {
                    call((List)obj);
                }

                public void call(List list)
                {
                    updateQueuedRoutesOverviewLayout(list);
                }

            
            {
                this$0 = RideOverviewMapButton.this;
                super();
            }
            });
            return;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            return;
        }
    }

    public void openRideOverviewScreen()
    {
        appFlow.goTo(new DriverScreens.RideOverviewScreen(false));
    }




}
