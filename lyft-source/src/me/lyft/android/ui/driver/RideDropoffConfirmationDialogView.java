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
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.UserImageView;
import me.lyft.android.ui.dialogs.DialogContainerView;
import me.lyft.android.ui.tooltips.TooltipContainerView;
import rx.functions.Action1;

public class RideDropoffConfirmationDialogView extends DialogContainerView
{

    MessageBus bus;
    Button confirmDropoffButton;
    DialogFlow dialogFlow;
    Button dismissButton;
    private Action1 onRouteUpdated;
    UserImageView passengerPhoto;
    TextView primaryMessage;
    IDriverRideProvider routeProvider;
    private Stop stop;
    TooltipContainerView tooltipContainer;

    public RideDropoffConfirmationDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onRouteUpdated = new Action1() {

            final RideDropoffConfirmationDialogView this$0;

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
                this$0 = RideDropoffConfirmationDialogView.this;
                super();
            }
        };
        Scoop.a(this).b(this);
    }

    private void showTooltips()
    {
        if (!routeProvider.getDriverRide().showHints())
        {
            return;
        } else
        {
            tooltipContainer.tryToShowAndMarkShown("confirm_drop_off", confirmDropoffButton, 80);
            return;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        ButterKnife.a(this);
        stop = routeProvider.getDriverRide().getCurrentStop();
        Passenger passenger = routeProvider.getDriverRide().getCurrentPassenger();
        Resources resources = getResources();
        passengerPhoto.setUserPartySize(Integer.valueOf(passenger.getPartySize()));
        passengerPhoto.loadPhoto(passenger.getPhotoUrl());
        confirmDropoffButton.setBackgroundResource(0x7f020058);
        confirmDropoffButton.setTextColor(resources.getColorStateList(0x7f0c00ac));
        dismissButton.setOnClickListener(new android.view.View.OnClickListener() {

            final RideDropoffConfirmationDialogView this$0;

            public void onClick(View view)
            {
                dialogFlow.dismiss();
            }

            
            {
                this$0 = RideDropoffConfirmationDialogView.this;
                super();
            }
        });
        primaryMessage.setText(resources.getString(0x7f070122, new Object[] {
            passenger.getFirstName()
        }));
        confirmDropoffButton.setVisibility(0);
        confirmDropoffButton.setText(0x7f0700b9);
        confirmDropoffButton.setOnClickListener(new android.view.View.OnClickListener() {

            final RideDropoffConfirmationDialogView this$0;

            public void onClick(View view)
            {
                bus.post(me/lyft/android/ui/driver/RideDropoffConfirmationDialogView$RideDropoffConfirmationResultEvent, Unit.create());
                dialogFlow.dismiss();
            }

            
            {
                this$0 = RideDropoffConfirmationDialogView.this;
                super();
            }
        });
        Binder.attach(this).bind(routeProvider.observeRide(), onRouteUpdated);
        showTooltips();
    }

}
