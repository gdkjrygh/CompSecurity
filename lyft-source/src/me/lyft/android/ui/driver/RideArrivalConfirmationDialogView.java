// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.UserImageView;
import me.lyft.android.ui.dialogs.DialogContainerView;
import me.lyft.android.ui.tooltips.TooltipContainerView;

public class RideArrivalConfirmationDialogView extends DialogContainerView
{

    MessageBus bus;
    Button confirmButton;
    IConstantsProvider constantsProvider;
    DialogFlow dialogFlow;
    UserImageView passengerPhoto;
    TextView primaryMessage;
    IDriverRideProvider routeProvider;
    TextView secondaryMessage;
    TooltipContainerView tooltipContainer;

    public RideArrivalConfirmationDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    private int getConfirmButtonBackground()
    {
        return !routeProvider.getDriverRide().isCourier() ? 0x7f02004e : 0x7f02005b;
    }

    private String getPrimaryMessage()
    {
        String s = routeProvider.getDriverRide().getCurrentStop().getLocation().getDisplayName();
        if (Strings.isNullOrEmpty(s))
        {
            return getResources().getString(0x7f07018c);
        } else
        {
            return getResources().getString(0x7f07018b, new Object[] {
                s
            });
        }
    }

    private String getSecondaryMessage()
    {
        String s = routeProvider.getDriverRide().getCurrentPassenger().getFirstName();
        if (Strings.isNullOrEmpty(s))
        {
            return getResources().getString(0x7f0700cd);
        } else
        {
            return getResources().getString(0x7f0700cc, new Object[] {
                s
            });
        }
    }

    private ColorStateList getTextColor()
    {
        Resources resources = getResources();
        int i;
        if (routeProvider.getDriverRide().isCourier())
        {
            i = 0x7f0c00ad;
        } else
        {
            i = 0x7f0c00ab;
        }
        return resources.getColorStateList(i);
    }

    private void initialize()
    {
        primaryMessage.setText(getPrimaryMessage());
        if (routeProvider.getDriverRide().isCourier())
        {
            secondaryMessage.setText(getSecondaryMessage());
            secondaryMessage.setVisibility(0);
        }
        confirmButton.setVisibility(0);
        confirmButton.setText(0x7f0700b7);
        confirmButton.setOnClickListener(new android.view.View.OnClickListener() {

            final RideArrivalConfirmationDialogView this$0;

            public void onClick(View view)
            {
                dialogFlow.dismiss();
                bus.post(me/lyft/android/ui/driver/RideArrivalConfirmationDialogView$RideArrivalConfirmationResultEvent, Unit.create());
            }

            
            {
                this$0 = RideArrivalConfirmationDialogView.this;
                super();
            }
        });
        if (routeProvider.getDriverRide().showHints())
        {
            tooltipContainer.tryToShowAndMarkShown("confirm_arrival_button", confirmButton, 80);
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        ButterKnife.a(this);
        initialize();
        Passenger passenger = routeProvider.getDriverRide().getCurrentPassenger();
        passengerPhoto.setUserPartySize(Integer.valueOf(passenger.getPartySize()));
        passengerPhoto.loadPhoto(passenger.getPhotoUrl());
        confirmButton.setBackgroundResource(getConfirmButtonBackground());
        confirmButton.setTextColor(getTextColor());
    }
}
