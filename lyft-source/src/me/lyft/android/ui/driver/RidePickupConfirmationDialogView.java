// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.RideFlags;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.rx.ReactiveProperty;
import me.lyft.android.rx.ReactiveUI;
import me.lyft.android.ui.dialogs.DialogContainerView;
import rx.functions.Action1;

public class RidePickupConfirmationDialogView extends DialogContainerView
{

    private static final int ONE_PERSON_PARTY_SIZE = 1;
    private static final int THREE_PEOPLE_PARTY_SIZE = 3;
    private static final int TWO_PEOPLE_PARTY_SIZE = 2;
    MessageBus bus;
    Button confirmOnePersonButton;
    Button confirmThreePeopleButton;
    Button confirmTwoPeopleButton;
    DialogFlow dialogFlow;
    Button dismissButton;
    ILyftPreferences lyftPreferences;
    private Action1 onRouteUpdated;
    private Passenger passenger;
    TextView primaryMessage;
    IDriverRideProvider routeProvider;
    private ReactiveProperty samePassengerArrived;

    public RidePickupConfirmationDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        samePassengerArrived = ReactiveProperty.create();
        onRouteUpdated = new Action1() {

            final RidePickupConfirmationDialogView this$0;

            public volatile void call(Object obj)
            {
                call((DriverRide)obj);
            }

            public void call(DriverRide driverride)
            {
                Stop stop = driverride.getCurrentStop();
                driverride = driverride.getCurrentPassenger();
                ReactiveProperty reactiveproperty = samePassengerArrived;
                boolean flag;
                if (stop.isArrived() && Objects.equals(driverride.getId(), passenger.getId()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                reactiveproperty.onNext(Boolean.valueOf(flag));
            }

            
            {
                this$0 = RidePickupConfirmationDialogView.this;
                super();
            }
        };
        context = Scoop.a(this);
        context.b(this);
        passenger = ((DriverDialogs.RidePickupConfirmationDialog)context.a()).getPassenger();
    }

    private void confirmPickup(int i)
    {
        RideFlags rideflags = lyftPreferences.getRideFlags();
        rideflags.setPickupConfirmationDialogShown(true);
        lyftPreferences.setRideFlags(rideflags);
        bus.post(me/lyft/android/ui/driver/RidePickupConfirmationDialogView$RidePickupConfirmationResultEvent, Integer.valueOf(i));
    }

    private void displayPickupConfirmation()
    {
        primaryMessage.setText(getResources().getString(0x7f0700c1, new Object[] {
            passenger.getFirstName()
        }));
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        ButterKnife.a(this);
        Binder binder = Binder.attach(this);
        binder.bind(routeProvider.observeRide(), onRouteUpdated);
        binder.bind(ReactiveUI.isFalse(samePassengerArrived), new Action1() {

            final RidePickupConfirmationDialogView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                dialogFlow.dismiss();
            }

            
            {
                this$0 = RidePickupConfirmationDialogView.this;
                super();
            }
        });
        dismissButton.setOnClickListener(new android.view.View.OnClickListener() {

            final RidePickupConfirmationDialogView this$0;

            public void onClick(View view)
            {
                dialogFlow.dismiss();
            }

            
            {
                this$0 = RidePickupConfirmationDialogView.this;
                super();
            }
        });
        confirmOnePersonButton.setOnClickListener(new android.view.View.OnClickListener() {

            final RidePickupConfirmationDialogView this$0;

            public void onClick(View view)
            {
                dialogFlow.dismiss();
                confirmPickup(1);
            }

            
            {
                this$0 = RidePickupConfirmationDialogView.this;
                super();
            }
        });
        confirmTwoPeopleButton.setOnClickListener(new android.view.View.OnClickListener() {

            final RidePickupConfirmationDialogView this$0;

            public void onClick(View view)
            {
                dialogFlow.dismiss();
                confirmPickup(2);
            }

            
            {
                this$0 = RidePickupConfirmationDialogView.this;
                super();
            }
        });
        confirmThreePeopleButton.setOnClickListener(new android.view.View.OnClickListener() {

            final RidePickupConfirmationDialogView this$0;

            public void onClick(View view)
            {
                dialogFlow.dismiss();
                confirmPickup(3);
            }

            
            {
                this$0 = RidePickupConfirmationDialogView.this;
                super();
            }
        });
        displayPickupConfirmation();
    }



}
