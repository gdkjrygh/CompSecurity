// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.analytics.ScreenAnalytics;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.driver.IDailyTotalsRepository;
import me.lyft.android.application.ride.IDestinyService;
import me.lyft.android.application.ride.IDestinySession;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.NullLocation;
import me.lyft.android.domain.payment.Money;
import me.lyft.android.errorhandling.IDefaultErrorHandler;
import me.lyft.android.facades.UserModeSwitchFacade;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.rx.ReactiveProperty;
import me.lyft.android.rx.SimpleSubscriber;
import me.lyft.android.ui.HeightObservableLayout;
import me.lyft.android.ui.SlideMenuController;
import me.lyft.android.ui.dialogs.DialogResult;
import me.lyft.android.ui.dialogs.Toast;
import me.lyft.android.ui.ride.RideMap;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;

public class DriverDestinyView extends LinearLayout
{

    private static final int DEFAULT_ZOOM_LEVEL = 12;
    AppFlow appFlow;
    private Binder binder;
    MessageBus bus;
    IConstantsProvider constantsProvider;
    IDailyTotalsRepository dailyTotalsRepository;
    IDefaultErrorHandler defaultErrorHandler;
    private ReactiveProperty destinyAddressTextSubject;
    TextView destinyAddressTextView;
    TextView destinyBottomLayout;
    IDestinyService destinyService;
    IDestinySession destinySession;
    DialogFlow dialogFlow;
    Button driverDailyTotalButtonView;
    HeightObservableLayout driverRideBottom;
    HeightObservableLayout driverRideTop;
    LinearLayout editDestinyAddressView;
    ImageView exitDestinyButton;
    ImageButton followCurrentLocationButton;
    ILocationService locationService;
    private Action1 onDestinyAddressTextChanged;
    private Action1 onDestinyLocationChanged;
    private android.view.View.OnClickListener onFollowCurrentLocationClicked;
    private Action1 onMapDragStart;
    private Action1 onMapLoaded;
    private Action1 onMenuItemClicked;
    private Action1 onToolbarItemClicked;
    private Action1 onTurnOffDestinyConfirmation;
    ILyftPreferences preferences;
    RideMap rideMap;
    SlideMenuController slideMenuController;
    Toolbar toolbar;
    UserModeSwitchFacade userModeSwitchFacade;

    public DriverDestinyView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        destinyAddressTextSubject = ReactiveProperty.create();
        onMapLoaded = new Action1() {

            final DriverDestinyView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                rideMap.bindPadding(driverRideTop, driverRideBottom);
                rideMap.centerToCurrentLocation(12F);
                rideMap.clearRoutes();
                binder.bind(destinySession.observeLocationChanges(), onDestinyLocationChanged);
                binder.bind(bus.observe(me/lyft/android/ui/driver/DriverDestinyView$DestinyConfirmationResultEvent), onTurnOffDestinyConfirmation);
                binder.bind(destinyAddressTextSubject, onDestinyAddressTextChanged);
                binder.bind(rideMap.observeMapDragStart(), onMapDragStart);
            }

            
            {
                this$0 = DriverDestinyView.this;
                super();
            }
        };
        onDestinyLocationChanged = new Action1() {

            private Location previousLocation;
            final DriverDestinyView this$0;

            public volatile void call(Object obj)
            {
                call((Location)obj);
            }

            public void call(Location location)
            {
                if (!previousLocation.isNull() && location.isNull())
                {
                    String s = constantsProvider.getConstants().getDestinyEndedModalText(getResources().getString(0x7f070114));
                    dialogFlow.show(new Toast(s));
                }
                destinyAddressTextSubject.onNext(location.getDisplayName());
                rideMap.clearAllMarkers();
                rideMap.clearRoutes();
                if (!location.isNull())
                {
                    rideMap.showDestinationMarker(location);
                    binder.bind(locationService.getLastLocation(), location. new AsyncCall() {

                        final _cls6 this$1;
                        final Location val$destinyLocation;

                        public volatile void onSuccess(Object obj)
                        {
                            onSuccess((Location)obj);
                        }

                        public void onSuccess(Location location)
                        {
                            super.onSuccess(location);
                            rideMap.showDriverDirections(location, destinyLocation, getResources().getColor(0x7f0c007e));
                            rideMap.fitMapTo(new Location[] {
                                location, destinyLocation
                            });
                        }

            
            {
                this$1 = final__pcls6;
                destinyLocation = Location.this;
                super();
            }
                    });
                }
                previousLocation = location;
            }

            
            {
                this$0 = DriverDestinyView.this;
                super();
                previousLocation = NullLocation.getInstance();
            }
        };
        onTurnOffDestinyConfirmation = new Action1() {

            final DriverDestinyView this$0;

            public volatile void call(Object obj)
            {
                call((DialogResult)obj);
            }

            public void call(DialogResult dialogresult)
            {
                if (dialogresult.getButtonId() == 0x7f0d000b)
                {
                    destinyService.exitDestiny().observeOn(AndroidSchedulers.mainThread()).subscribe(new AsyncCall() {

                        final _cls7 this$1;

                        public void onFail(Throwable throwable)
                        {
                            super.onFail(throwable);
                            defaultErrorHandler.handle(throwable);
                        }

                        public volatile void onSuccess(Object obj)
                        {
                            onSuccess((Unit)obj);
                        }

                        public void onSuccess(Unit unit)
                        {
                            super.onSuccess(unit);
                            rideMap.clearDestinationMarker();
                            rideMap.clearPickupMarker();
                            rideMap.clearRoutes();
                        }

            
            {
                this$1 = _cls7.this;
                super();
            }
                    });
                }
            }

            
            {
                this$0 = DriverDestinyView.this;
                super();
            }
        };
        onDestinyAddressTextChanged = new Action1() {

            final DriverDestinyView this$0;

            public volatile void call(Object obj)
            {
                call((String)obj);
            }

            public void call(String s)
            {
                TextView textview = destinyAddressTextView;
                String s1 = s;
                if (Strings.isNullOrEmpty(s))
                {
                    s1 = getResources().getString(0x7f070064);
                }
                textview.setText(s1);
            }

            
            {
                this$0 = DriverDestinyView.this;
                super();
            }
        };
        onToolbarItemClicked = new Action1() {

            final DriverDestinyView this$0;

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
                this$0 = DriverDestinyView.this;
                super();
            }
        };
        onMenuItemClicked = new Action1() {

            final DriverDestinyView this$0;

            public void call(Integer integer)
            {
                switch (integer.intValue())
                {
                case 2131558415: 
                default:
                    return;

                case 2131558416: 
                    appFlow.goTo(new DriverScreens.DriverStatsScreen());
                    return;

                case 2131558414: 
                    turnOnDestinationMode();
                    return;
                }
            }

            public volatile void call(Object obj)
            {
                call((Integer)obj);
            }

            
            {
                this$0 = DriverDestinyView.this;
                super();
            }
        };
        onMapDragStart = new Action1() {

            final DriverDestinyView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                unfollowCurrentLocation();
            }

            
            {
                this$0 = DriverDestinyView.this;
                super();
            }
        };
        onFollowCurrentLocationClicked = new android.view.View.OnClickListener() {

            final DriverDestinyView this$0;

            public void onClick(View view)
            {
                if (!view.isSelected())
                {
                    followCurrentLocation();
                    return;
                } else
                {
                    unfollowCurrentLocation();
                    return;
                }
            }

            
            {
                this$0 = DriverDestinyView.this;
                super();
            }
        };
        Scoop.a(this).b(this);
    }

    private void followCurrentLocation()
    {
        followCurrentLocationButton.setSelected(true);
        rideMap.followCurrentLocation();
    }

    private void showDestinyTurnoffDialog()
    {
        me.lyft.android.ui.Dialogs.AlertDialog alertdialog = (new me.lyft.android.ui.Dialogs.AlertDialog("destiny_turnoff_dialog")).setButtonsOrientation(Integer.valueOf(1)).setTitle(getResources().getString(0x7f07016a)).setTitleColorResource(0x7f0c0025).addPositiveButton(getResources().getString(0x7f070169), 0x7f030059).addNegativeButton(getResources().getString(0x7f07011e)).setDialogEventClass(me/lyft/android/ui/driver/DriverDestinyView$DestinyConfirmationResultEvent);
        dialogFlow.show(alertdialog);
    }

    private void turnOnDestinationMode()
    {
        destinyService.switchToDestiny().subscribe(new SimpleSubscriber());
    }

    private void unfollowCurrentLocation()
    {
        followCurrentLocationButton.setSelected(false);
        rideMap.unfollowCurrentLocation();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        ScreenAnalytics.trackScreenView("driver_idle_destiny_set");
        binder = Binder.attach(this);
        slideMenuController.enableMenu();
        followCurrentLocationButton.setOnClickListener(onFollowCurrentLocationClicked);
        unfollowCurrentLocation();
        toolbar.clearItems().showHomeIcon().addItem(0x7f0d0021, 0x7f02018c);
        toolbar.showDriverModeToggle();
        driverDailyTotalButtonView.setText(dailyTotalsRepository.getDailyTotal().format());
        driverDailyTotalButtonView.setOnClickListener(new android.view.View.OnClickListener() {

            final DriverDestinyView this$0;

            public void onClick(View view)
            {
                appFlow.goTo(new DriverScreens.DriverStatsScreen());
            }

            
            {
                this$0 = DriverDestinyView.this;
                super();
            }
        });
        String s = constantsProvider.getConstants().getDestinyMatchingLabelText(getResources().getString(0x7f070132));
        destinyBottomLayout.setText(s);
        destinyBottomLayout.setOnClickListener(new android.view.View.OnClickListener() {

            final DriverDestinyView this$0;

            public void onClick(View view)
            {
                dialogFlow.show(new DriverDialogs.DestinyInfoDialog());
            }

            
            {
                this$0 = DriverDestinyView.this;
                super();
            }
        });
        editDestinyAddressView.setOnClickListener(new android.view.View.OnClickListener() {

            final DriverDestinyView this$0;

            public void onClick(View view)
            {
                destinyService.switchToDestiny().subscribe(new SimpleSubscriber());
            }

            
            {
                this$0 = DriverDestinyView.this;
                super();
            }
        });
        exitDestinyButton.setOnClickListener(new android.view.View.OnClickListener() {

            final DriverDestinyView this$0;

            public void onClick(View view)
            {
                showDestinyTurnoffDialog();
            }

            
            {
                this$0 = DriverDestinyView.this;
                super();
            }
        });
        binder.bind(toolbar.observeItemClick(), onToolbarItemClicked);
        binder.bind(bus.observe(me/lyft/android/ui/driver/DriverOverflowMenuView$OverflowMenuItemPressedEvent), onMenuItemClicked);
        binder.bind(rideMap.observeMapLoaded(), onMapLoaded);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        rideMap.clearRoutes();
        rideMap.clearDestinationMarker();
        rideMap.clearPickupMarker();
        rideMap.reset();
        slideMenuController.disableMenu();
        unfollowCurrentLocation();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }










}
