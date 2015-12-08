// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.RideFlags;
import me.lyft.android.analytics.ScreenAnalytics;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.application.ride.IDriverRouteService;
import me.lyft.android.common.DateUtils;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.flows.ProfileFlow;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.rx.ReactiveProperty;
import me.lyft.android.services.TimerManager;
import me.lyft.android.ui.HeightObservableLayout;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.UserImageView;
import me.lyft.android.ui.dialogs.Toast;
import me.lyft.android.ui.ride.RideMap;
import me.lyft.android.ui.tooltips.TooltipContainerView;
import rx.Subscription;
import rx.functions.Action1;
import rx.subscriptions.Subscriptions;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverActionsCallback, DriverFollowLocationAndStopButton

public class DriverCourierPickupView extends FrameLayout
{

    private static final String CONFIRMATION_COUNTDOWN_FORMAT = "m:ss";
    public static final String TIMER_CONFIRMATION_PICKUP = "confirmation_pickup";
    private Binder binder;
    View bottomButtonContainer;
    MessageBus bus;
    TextView confirmPartySizeTextView;
    View confirmPickupButton;
    View confirmPickupOtherButton;
    private Action1 confirmationCountdownCallback;
    private DateFormat confirmationCountdownFormatter;
    TextView confirmationInfoTextView;
    TextView confirmationTimer;
    IConstantsProvider constantsProvider;
    private Passenger currentPassenger;
    DialogFlow dialogFlow;
    HeightObservableLayout driverRideBottom;
    TextView driverRideButtonTextView;
    HeightObservableLayout driverRideTop;
    DriverFollowLocationAndStopButton followCurrentLocationButton;
    ILocationService locationService;
    ILyftPreferences lyftPreferences;
    private Subscription mapTransitionSubscription;
    private Action1 onMapDragStart;
    private Action1 onMapLoaded;
    private Action1 onMenuItemClicked;
    private Action1 onNoShowConfirmationResult;
    private Action1 onPassengerSkipConfirmationResult;
    private Action1 onRidePartySizeChanged;
    private Action1 onRidePickupConfirmationResult;
    private Action1 onRouteUpdated;
    View passengerNoShowButton;
    UserImageView passengerPhotoImageView;
    private Subscription pickupConfirmationTimerSubscription;
    ProfileFlow profileFlow;
    IProgressController progressController;
    RideMap rideMap;
    private ReactiveProperty ridePartySizeChange;
    IDriverRideProvider routeProvider;
    IDriverRouteService routeService;
    View timeToGoView;
    TimerManager timerManager;
    Toolbar toolbar;
    TooltipContainerView tooltipContainer;
    private ReactiveProperty userImageChangeSubject;
    IViewErrorHandler viewErrorHandler;

    public DriverCourierPickupView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        pickupConfirmationTimerSubscription = Subscriptions.empty();
        mapTransitionSubscription = Subscriptions.empty();
        userImageChangeSubject = ReactiveProperty.create();
        ridePartySizeChange = ReactiveProperty.create();
        confirmationCountdownFormatter = DateUtils.createDateFormat("m:ss");
        onMapLoaded = new Action1() {

            final DriverCourierPickupView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                rideMap.clearRoutes();
                rideMap.bindPadding(driverRideTop, driverRideBottom);
                binder.bind(routeProvider.observeRide(), onRouteUpdated);
                binder.bind(toolbar.observeItemClick(), onMenuItemClicked);
                binder.bind(rideMap.observeMapDragStart(), onMapDragStart);
                binder.bind(bus.observe(me/lyft/android/ui/driver/NoShowConfirmationDialogView$NoShowConfirmationResultEvent), onNoShowConfirmationResult);
                binder.bind(bus.observe(me/lyft/android/ui/driver/RidePickupConfirmationDialogView$RidePickupConfirmationResultEvent), onRidePickupConfirmationResult);
                binder.bind(bus.observe(me/lyft/android/ui/driver/SkipPassengerDialogView$PassengerSkipResultEvent), onPassengerSkipConfirmationResult);
                binder.bind(userImageChangeSubject, new Action1() {

                    final _cls7 this$1;

                    public volatile void call(Object obj)
                    {
                        call((String)obj);
                    }

                    public void call(String s)
                    {
                        passengerPhotoImageView.loadPhoto(s);
                    }

            
            {
                this$1 = _cls7.this;
                super();
            }
                });
                binder.bind(ridePartySizeChange, onRidePartySizeChanged);
                followCurrentLocationButton.setZoomOutEnabled(true);
                transitionMapToPassengerPickup(routeProvider.getDriverRide().getCurrentStop());
            }

            
            {
                this$0 = DriverCourierPickupView.this;
                super();
            }
        };
        onMapDragStart = new Action1() {

            final DriverCourierPickupView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                followCurrentLocationButton.unfollow();
                showRideButton();
            }

            
            {
                this$0 = DriverCourierPickupView.this;
                super();
            }
        };
        onRouteUpdated = new Action1() {

            final DriverCourierPickupView this$0;

            public volatile void call(Object obj)
            {
                call((DriverRide)obj);
            }

            public void call(DriverRide driverride)
            {
                currentPassenger = driverride.getCurrentPassenger();
                userImageChangeSubject.onNext(currentPassenger.getPhotoUrl());
                ridePartySizeChange.onNext(Integer.valueOf(currentPassenger.getPartySize()));
            }

            
            {
                this$0 = DriverCourierPickupView.this;
                super();
            }
        };
        confirmationCountdownCallback = new Action1() {

            final DriverCourierPickupView this$0;

            public void call(Long long1)
            {
                if (long1.longValue() >= 0L)
                {
                    String s = confirmationCountdownFormatter.format(new Date(TimeUnit.SECONDS.toMillis(long1.longValue())));
                    confirmationTimer.setText(s);
                }
                if (long1.longValue() == 0L)
                {
                    passengerNoShowButton.setVisibility(0);
                    if (!lyftPreferences.getRideFlags().isPickupConfirmationDialogShown())
                    {
                        confirmationInfoTextView.setText(0x7f070360);
                        timeToGoView.setVisibility(0);
                    }
                }
            }

            public volatile void call(Object obj)
            {
                call((Long)obj);
            }

            
            {
                this$0 = DriverCourierPickupView.this;
                super();
            }
        };
        onMenuItemClicked = new Action1() {

            final DriverCourierPickupView this$0;

            public void call(Integer integer)
            {
                switch (integer.intValue())
                {
                default:
                    return;

                case 2131558433: 
                    dialogFlow.show(new DriverDialogs.DriverOverflowMenuScreen());
                    break;
                }
            }

            public volatile void call(Object obj)
            {
                call((Integer)obj);
            }

            
            {
                this$0 = DriverCourierPickupView.this;
                super();
            }
        };
        onRidePickupConfirmationResult = new Action1() {

            final DriverCourierPickupView this$0;

            public void call(Integer integer)
            {
                onPartySizeConfirmed(integer);
            }

            public volatile void call(Object obj)
            {
                call((Integer)obj);
            }

            
            {
                this$0 = DriverCourierPickupView.this;
                super();
            }
        };
        onNoShowConfirmationResult = new Action1() {

            final DriverCourierPickupView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                skipNoShow();
            }

            
            {
                this$0 = DriverCourierPickupView.this;
                super();
            }
        };
        onPassengerSkipConfirmationResult = new Action1() {

            final DriverCourierPickupView this$0;

            public void call(Integer integer)
            {
                dialogFlow.queue(new Toast(getResources().getString(0x7f070241, new Object[] {
                    currentPassenger.getFirstName()
                })));
                skipWrongPartySize(integer);
            }

            public volatile void call(Object obj)
            {
                call((Integer)obj);
            }

            
            {
                this$0 = DriverCourierPickupView.this;
                super();
            }
        };
        onRidePartySizeChanged = new Action1() {

            final DriverCourierPickupView this$0;

            public void call(Integer integer)
            {
                Integer integer1 = integer;
                if (integer.intValue() == 0)
                {
                    integer1 = Integer.valueOf(1);
                }
                confirmPartySizeTextView.setText(String.valueOf(integer1));
                int i;
                if (integer1.intValue() > 1)
                {
                    i = 0x7f020193;
                } else
                {
                    i = 0x7f020195;
                }
                confirmPartySizeTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
            }

            public volatile void call(Object obj)
            {
                call((Integer)obj);
            }

            
            {
                this$0 = DriverCourierPickupView.this;
                super();
            }
        };
        Scoop.a(this).b(this);
    }

    private void displayButtonText()
    {
        String s = currentPassenger.getFirstName();
        driverRideButtonTextView.setText(getResources().getString(0x7f070146, new Object[] {
            s
        }));
    }

    private void hideRideButton()
    {
        driverRideButtonTextView.animate().translationX(driverRideButtonTextView.getWidth());
        confirmPickupButton.startAnimation(AnimationUtils.loadAnimation(getContext(), 0x7f040003));
        confirmPickupOtherButton.startAnimation(AnimationUtils.loadAnimation(getContext(), 0x7f040004));
    }

    private void initToolbar()
    {
        int i = 0x7f020107;
        if (!routeProvider.getDriverRide().isCourier()) goto _L2; else goto _L1
_L1:
        i = 0x7f020101;
_L4:
        toolbar.hideHomeIcon().setLogo(i).addItem(0x7f0d0021, 0x7f02018c).showItem(0x7f0d0021);
        return;
_L2:
        if (routeProvider.getDriverRide().isPlus())
        {
            i = 0x7f020109;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void onPartySizeConfirmed(Integer integer)
    {
        if (integer.intValue() > currentPassenger.getPartySize())
        {
            dialogFlow.show(new DriverDialogs.SkipPassengerDialog(currentPassenger, integer));
            return;
        } else
        {
            pickup(integer);
            return;
        }
    }

    private void pickup(Integer integer)
    {
        progressController.disableUI();
        binder.bind(routeService.pickup(currentPassenger, integer.intValue()), new DriverActionsCallback(progressController, viewErrorHandler));
    }

    private void showRideButton()
    {
        driverRideButtonTextView.animate().translationX(0.0F);
        confirmPickupButton.startAnimation(AnimationUtils.loadAnimation(getContext(), 0x7f040000));
        confirmPickupOtherButton.startAnimation(AnimationUtils.loadAnimation(getContext(), 0x7f040001));
    }

    private void showTooltips()
    {
        if (!routeProvider.getDriverRide().showHints())
        {
            return;
        } else
        {
            tooltipContainer.tryToShowAndMarkShown("pickup_button", bottomButtonContainer, 48);
            return;
        }
    }

    private void skipNoShow()
    {
        progressController.disableUI();
        binder.bind(routeService.skipNoShow(currentPassenger), new DriverActionsCallback(progressController, viewErrorHandler));
    }

    private void skipWrongPartySize(Integer integer)
    {
        progressController.disableUI();
        binder.bind(routeService.skipWrongPartySize(currentPassenger, integer.intValue()), new DriverActionsCallback(progressController, viewErrorHandler));
    }

    private void transitionMapToPassengerPickup(final Stop stop)
    {
        mapTransitionSubscription.unsubscribe();
        rideMap.clearPickupMarker();
        rideMap.clearDestinationMarker();
        rideMap.clearRoutes();
        mapTransitionSubscription = binder.bind(locationService.getLastLocation(), new AsyncCall() {

            final DriverCourierPickupView this$0;
            final Stop val$stop;

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Location)obj);
            }

            public void onSuccess(Location location)
            {
                super.onSuccess(location);
                rideMap.showDriverDirections(location, getResources().getColor(0x7f0c000b), getResources().getColor(0x7f0c0070));
                rideMap.fitMapTo(new Location[] {
                    location, stop.getLocation()
                });
            }

            
            {
                this$0 = DriverCourierPickupView.this;
                stop = stop1;
                super();
            }
        });
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            binder = Binder.attach(this);
            currentPassenger = routeProvider.getDriverRide().getCurrentPassenger();
            initToolbar();
            passengerPhotoImageView.setOnClickListener(new android.view.View.OnClickListener() {

                final DriverCourierPickupView this$0;

                public void onClick(View view)
                {
                    profileFlow.openPassengerRideProfile(currentPassenger.getId());
                }

            
            {
                this$0 = DriverCourierPickupView.this;
                super();
            }
            });
            driverRideButtonTextView.setOnClickListener(new android.view.View.OnClickListener() {

                final DriverCourierPickupView this$0;

                public void onClick(View view)
                {
                    hideRideButton();
                }

            
            {
                this$0 = DriverCourierPickupView.this;
                super();
            }
            });
            confirmPickupButton.setOnClickListener(new android.view.View.OnClickListener() {

                final DriverCourierPickupView this$0;

                public void onClick(View view)
                {
                    onPartySizeConfirmed(Integer.valueOf(currentPassenger.getPartySize()));
                }

            
            {
                this$0 = DriverCourierPickupView.this;
                super();
            }
            });
            confirmPickupOtherButton.setOnClickListener(new android.view.View.OnClickListener() {

                final DriverCourierPickupView this$0;

                public void onClick(View view)
                {
                    dialogFlow.show(new DriverDialogs.RidePickupConfirmationDialog(currentPassenger));
                }

            
            {
                this$0 = DriverCourierPickupView.this;
                super();
            }
            });
            passengerNoShowButton.setOnClickListener(new android.view.View.OnClickListener() {

                final DriverCourierPickupView this$0;

                public void onClick(View view)
                {
                    dialogFlow.show(new DriverDialogs.NoShowConfirmationDialog());
                }

            
            {
                this$0 = DriverCourierPickupView.this;
                super();
            }
            });
            displayButtonText();
            showTooltips();
            ScreenAnalytics.trackScreenView("driver_confirm_pickup");
            pickupConfirmationTimerSubscription.unsubscribe();
            pickupConfirmationTimerSubscription = binder.bind(timerManager.getTimer("confirmation_pickup", currentPassenger.getRideId(), constantsProvider.getConstants().getCourierPickupCountdownTimeoutDriver()), confirmationCountdownCallback);
            binder.bind(rideMap.observeMapLoaded(), onMapLoaded);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        followCurrentLocationButton.unfollow();
        rideMap.clearAllMarkers();
        rideMap.clearRoutes();
        rideMap.reset();
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



/*
    static Passenger access$002(DriverCourierPickupView drivercourierpickupview, Passenger passenger)
    {
        drivercourierpickupview.currentPassenger = passenger;
        return passenger;
    }

*/

















}
