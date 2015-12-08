// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
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
import me.lyft.android.ui.dialogs.DialogContainerView;
import rx.functions.Action1;

public class NoShowConfirmationDialogView extends DialogContainerView
{

    MessageBus bus;
    DialogFlow dialogFlow;
    Button dismissButton;
    ILyftPreferences lyftPreferences;
    private Action1 onRouteUpdated;
    TextView passengerNameTextView;
    Button passengerNoShowButton;
    ImageView passengerNoShowImage;
    IDriverRideProvider routeProvider;
    private Stop stop;

    public NoShowConfirmationDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onRouteUpdated = new Action1() {

            final NoShowConfirmationDialogView this$0;

            public volatile void call(Object obj)
            {
                call((DriverRide)obj);
            }

            public void call(DriverRide driverride)
            {
                boolean flag;
                if (!Objects.equals(stop, driverride.getCurrentStop()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    dialogFlow.dismiss();
                }
            }

            
            {
                this$0 = NoShowConfirmationDialogView.this;
                super();
            }
        };
        Scoop.a(this).b(this);
    }

    private void displayNoShowConfirmation()
    {
        passengerNoShowImage.setVisibility(0);
        passengerNameTextView.setText(getResources().getString(0x7f0700c0, new Object[] {
            routeProvider.getDriverRide().getCurrentPassenger().getFirstName()
        }));
        passengerNoShowButton.setVisibility(0);
        passengerNoShowButton.setOnClickListener(new android.view.View.OnClickListener() {

            final NoShowConfirmationDialogView this$0;

            public void onClick(View view)
            {
                dialogFlow.dismiss();
                passengerNoShow();
            }

            
            {
                this$0 = NoShowConfirmationDialogView.this;
                super();
            }
        });
        dismissButton.setOnClickListener(new android.view.View.OnClickListener() {

            final NoShowConfirmationDialogView this$0;

            public void onClick(View view)
            {
                dialogFlow.dismiss();
            }

            
            {
                this$0 = NoShowConfirmationDialogView.this;
                super();
            }
        });
    }

    private void passengerNoShow()
    {
        RideFlags rideflags = lyftPreferences.getRideFlags();
        rideflags.setPickupConfirmationDialogShown(true);
        lyftPreferences.setRideFlags(rideflags);
        bus.post(me/lyft/android/ui/driver/NoShowConfirmationDialogView$NoShowConfirmationResultEvent, Unit.create());
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        ButterKnife.a(this);
        stop = routeProvider.getDriverRide().getCurrentStop();
        displayNoShowConfirmation();
        Binder.attach(this).bind(routeProvider.observeRide(), onRouteUpdated);
    }


}
