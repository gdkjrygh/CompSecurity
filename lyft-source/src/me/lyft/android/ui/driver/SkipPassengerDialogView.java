// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.UserImageView;
import me.lyft.android.ui.dialogs.DialogContainerView;
import rx.functions.Action1;

public class SkipPassengerDialogView extends DialogContainerView
{

    MessageBus bus;
    DialogFlow dialogFlow;
    Button dismissButton;
    private Action1 onRouteUpdated;
    private Integer partySize;
    private final Passenger passenger;
    IDriverRideProvider routeProvider;
    TextView secondaryMessageTextView;
    Button skipPassengerButton;
    private Stop stop;
    UserImageView userImageView;

    public SkipPassengerDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onRouteUpdated = new Action1() {

            final SkipPassengerDialogView this$0;

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
                this$0 = SkipPassengerDialogView.this;
                super();
            }
        };
        context = Scoop.a(this);
        context.b(this);
        context = (DriverDialogs.SkipPassengerDialog)context.a();
        passenger = context.getPassenger();
        partySize = context.getPartySize();
    }

    private void confirmSkip()
    {
        bus.post(me/lyft/android/ui/driver/SkipPassengerDialogView$PassengerSkipResultEvent, partySize);
        dialogFlow.dismiss();
    }

    private void displaySkipConfirmation()
    {
        secondaryMessageTextView.setText(getContext().getString(0x7f070343, new Object[] {
            partySize, passenger.getFirstName()
        }));
        userImageView.loadPhoto(passenger.getPhotoUrl());
        userImageView.setUserPartySize(partySize);
        skipPassengerButton.setText(getContext().getString(0x7f070341, new Object[] {
            passenger.getFirstName()
        }));
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        ButterKnife.a(this);
        Binder binder = Binder.attach(this);
        stop = routeProvider.getDriverRide().getCurrentStop();
        binder.bind(routeProvider.observeRide(), onRouteUpdated);
        dismissButton.setOnClickListener(new android.view.View.OnClickListener() {

            final SkipPassengerDialogView this$0;

            public void onClick(View view)
            {
                dialogFlow.dismiss();
            }

            
            {
                this$0 = SkipPassengerDialogView.this;
                super();
            }
        });
        skipPassengerButton.setOnClickListener(new android.view.View.OnClickListener() {

            final SkipPassengerDialogView this$0;

            public void onClick(View view)
            {
                confirmSkip();
            }

            
            {
                this$0 = SkipPassengerDialogView.this;
                super();
            }
        });
        displaySkipConfirmation();
    }


}
