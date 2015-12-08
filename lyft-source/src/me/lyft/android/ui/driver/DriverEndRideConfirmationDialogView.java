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
import me.lyft.android.analytics.studies.EndRideConfirmationAnalytics;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.UserImageView;
import me.lyft.android.ui.dialogs.DialogContainerView;
import rx.functions.Action1;

public class DriverEndRideConfirmationDialogView extends DialogContainerView
{

    private Binder binder;
    Button closeDialogButton;
    IConstantsProvider constantsProvider;
    DialogFlow dialogFlow;
    Button notPickedUpButton;
    private Action1 onRouteUpdated;
    Button pickedUpButton;
    IDriverRideProvider routeProvider;
    private final Stop stop;
    TextView titleTextView;
    UserImageView userImageView;

    public DriverEndRideConfirmationDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onRouteUpdated = new Action1() {

            final DriverEndRideConfirmationDialogView this$0;

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
                this$0 = DriverEndRideConfirmationDialogView.this;
                super();
            }
        };
        Scoop.a(this).b(this);
        stop = routeProvider.getDriverRide().getCurrentStop();
    }

    private void initView()
    {
        Object obj = constantsProvider.getConstants();
        Resources resources = getResources();
        titleTextView.setText(Strings.nullOrEmptyToDefault(((Constants) (obj)).getEndRideConfirmationTitle(), resources.getString(0x7f070138)));
        pickedUpButton.setText(Strings.nullOrEmptyToDefault(((Constants) (obj)).getEndRideConfirmationPassengerPickedUpButton(), resources.getString(0x7f07013a)));
        notPickedUpButton.setText(Strings.nullOrEmptyToDefault(((Constants) (obj)).getEndRideConfirmationPassengerNotPickedUpButton(), resources.getString(0x7f070139)));
        closeDialogButton.setText(Strings.nullOrEmptyToDefault(((Constants) (obj)).getEndRideConfirmationCancelButton(), resources.getString(0x7f070137)));
        obj = routeProvider.getDriverRide().getCurrentPassenger();
        userImageView.loadPhoto(((Passenger) (obj)).getPhotoUrl());
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
        binder.bind(routeProvider.observeRide(), onRouteUpdated);
        initView();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        pickedUpButton.setOnClickListener(new android.view.View.OnClickListener() {

            final DriverEndRideConfirmationDialogView this$0;

            public void onClick(View view)
            {
                EndRideConfirmationAnalytics.trackEndRide();
                dialogFlow.show(new DriverDialogs.RideDropoffConfirmationDialog());
            }

            
            {
                this$0 = DriverEndRideConfirmationDialogView.this;
                super();
            }
        });
        notPickedUpButton.setOnClickListener(new android.view.View.OnClickListener() {

            final DriverEndRideConfirmationDialogView this$0;

            public void onClick(View view)
            {
                EndRideConfirmationAnalytics.trackCancelRide();
                dialogFlow.show(new DriverDialogs.DriverCancellationConfirmationDialog());
            }

            
            {
                this$0 = DriverEndRideConfirmationDialogView.this;
                super();
            }
        });
        closeDialogButton.setOnClickListener(new android.view.View.OnClickListener() {

            final DriverEndRideConfirmationDialogView this$0;

            public void onClick(View view)
            {
                EndRideConfirmationAnalytics.trackDontEndOrCancel();
                dialogFlow.dismiss();
            }

            
            {
                this$0 = DriverEndRideConfirmationDialogView.this;
                super();
            }
        });
    }

}
