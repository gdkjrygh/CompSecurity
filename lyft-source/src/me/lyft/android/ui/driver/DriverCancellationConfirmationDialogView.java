// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.studies.RideAnalytics;
import me.lyft.android.application.ride.ICancellationOptionsProvider;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.application.ride.IDriverRouteService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.RideStatus;
import me.lyft.android.infrastructure.lyft.constants.CancellationOption;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.UserImageView;
import me.lyft.android.ui.dialogs.DialogContainerView;
import me.lyft.android.ui.dialogs.Toast;
import rx.functions.Action1;

public class DriverCancellationConfirmationDialogView extends DialogContainerView
{

    private Binder binder;
    MessageBus bus;
    TextView cancelPassengerText;
    LinearLayout cancellationOptionsContainer;
    ICancellationOptionsProvider cancellationOptionsProvider;
    DialogFlow dialogFlow;
    Button doNotCancelButton;
    IDriverRouteService driverRouteService;
    private Action1 onRouteUpdated;
    LinearLayout passengerPhotoListView;
    IProgressController progressController;
    IDriverRideProvider routeProvider;
    IViewErrorHandler viewErrorHandler;

    public DriverCancellationConfirmationDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onRouteUpdated = new Action1() {

            final DriverCancellationConfirmationDialogView this$0;

            public volatile void call(Object obj)
            {
                call((DriverRide)obj);
            }

            public void call(DriverRide driverride)
            {
                updatePassengerPhotos();
            }

            
            {
                this$0 = DriverCancellationConfirmationDialogView.this;
                super();
            }
        };
        Scoop.a(this).b(this);
    }

    private void addPassengerPhoto(Passenger passenger, android.view.ViewGroup.LayoutParams layoutparams)
    {
        UserImageView userimageview = new UserImageView(getContext());
        userimageview.loadPhoto(passenger.getPhotoUrl());
        passengerPhotoListView.addView(userimageview, layoutparams);
    }

    private void cancelRide(final CancellationOption cancellationOption)
    {
        progressController.disableUI();
        final AsyncActionAnalytics cancelRideAnalytics = RideAnalytics.trackDriverCancelRide();
        binder.bind(driverRouteService.cancelRoute(cancellationOption), new AsyncCall() {

            final DriverCancellationConfirmationDialogView this$0;
            final AsyncActionAnalytics val$cancelRideAnalytics;
            final CancellationOption val$cancellationOption;

            public void onFail(Throwable throwable)
            {
                viewErrorHandler.handle(throwable);
                cancelRideAnalytics.trackResponseFailure((new StringBuilder()).append(cancellationOption).append("|").append(throwable).toString());
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                dialogFlow.show(new Toast(getResources().getString(0x7f07030b)));
                cancelRideAnalytics.trackResponseSuccess(cancellationOption.getStatus());
                dialogFlow.dismiss();
            }

            public void onUnsubscribe()
            {
                progressController.enableUI();
            }

            
            {
                this$0 = DriverCancellationConfirmationDialogView.this;
                cancelRideAnalytics = asyncactionanalytics;
                cancellationOption = cancellationoption;
                super();
            }
        });
    }

    private void createCancellationOptions()
    {
        Button button;
        for (Iterator iterator = cancellationOptionsProvider.getCancellationOptions().iterator(); iterator.hasNext(); cancellationOptionsContainer.addView(button))
        {
            final CancellationOption cancellationOption = (CancellationOption)iterator.next();
            button = (Button)inflate(getContext(), 0x7f03005c, null);
            button.setText(cancellationOption.getString());
            button.setOnClickListener(new android.view.View.OnClickListener() {

                final DriverCancellationConfirmationDialogView this$0;
                final CancellationOption val$cancellationOption;

                public void onClick(View view)
                {
                    cancelRide(cancellationOption);
                }

            
            {
                this$0 = DriverCancellationConfirmationDialogView.this;
                cancellationOption = cancellationoption;
                super();
            }
            });
        }

    }

    private void updatePassengerPhotos()
    {
        passengerPhotoListView.removeAllViews();
        int i = getResources().getDimensionPixelOffset(0x7f080055);
        android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(i, i);
        for (Iterator iterator = routeProvider.getDriverRide().getNotDroppedOffPassengers().iterator(); iterator.hasNext(); addPassengerPhoto((Passenger)iterator.next(), layoutparams)) { }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        ButterKnife.a(this);
        binder = Binder.attach(this);
        binder.bind(routeProvider.observeRide(), onRouteUpdated);
        RideStatus ridestatus = routeProvider.getDriverRide().getStatus();
        Passenger passenger = routeProvider.getDriverRide().getCurrentPassenger();
        DriverRide driverride = routeProvider.getDriverRide();
        if (passenger.driverCanPenalize() && !driverride.isCourier() && ridestatus.isPickedUp())
        {
            cancelPassengerText.setText(0x7f07012c);
        } else
        {
            cancelPassengerText.setText(0x7f07012b);
        }
        createCancellationOptions();
        doNotCancelButton.setOnClickListener(new android.view.View.OnClickListener() {

            final DriverCancellationConfirmationDialogView this$0;

            public void onClick(View view)
            {
                dialogFlow.dismiss();
            }

            
            {
                this$0 = DriverCancellationConfirmationDialogView.this;
                super();
            }
        });
    }


}
