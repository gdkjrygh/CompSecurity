// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.IUserSession;
import me.lyft.android.analytics.studies.RideAnalytics;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.HeightObservableLayout;
import me.lyft.android.ui.SlideMenuController;
import me.lyft.android.ui.ride.RideMap;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            MatchingStartTime, PassengerRideAddressInput, PassengerMatchingBottomView

public class PassengerClassicRideMatchingView extends LinearLayout
{

    private static final int INITIAL_ZOOM_LEVEL = 16;
    AppFlow appFlow;
    private Binder binder;
    IConstantsProvider constantsProvider;
    PassengerMatchingBottomView contactingDriverBottomView;
    DialogFlow dialogFlow;
    private final Action1 onMapLoaded = new Action1() {

        final PassengerClassicRideMatchingView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            rideMap.bindPadding(passengerRideTop, passengerRideBottom);
            unit = passengerRideProvider.getPassengerRide();
            Location location = unit.getPickup();
            Location location1 = unit.getDropoff();
            rideMap.showPickupMarker(location);
            if (!location1.isNull())
            {
                rideMap.showDestinationMarker(unit.getDropoff());
                rideMap.fitMapTo(new Location[] {
                    location, unit.getDropoff()
                });
            } else
            {
                rideMap.clearDestinationMarker();
                rideMap.centerToLocationWithZoom(location, 16F);
            }
            passengerRideAddressInput.setDropoffAddress(resolveAddressName(location1));
        }

            
            {
                this$0 = PassengerClassicRideMatchingView.this;
                super();
            }
    };
    private final Action1 onMenuItemClicked = new Action1() {

        final PassengerClassicRideMatchingView this$0;

        public void call(Integer integer)
        {
            switch (integer.intValue())
            {
            default:
                return;

            case 2131558403: 
                dialogFlow.show(new PassengerDialogs.PassengerCancelRideDialog());
                break;
            }
        }

        public volatile void call(Object obj)
        {
            call((Integer)obj);
        }

            
            {
                this$0 = PassengerClassicRideMatchingView.this;
                super();
            }
    };
    private final Action1 onRideUpdated = new Action1() {

        final PassengerClassicRideMatchingView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            updateWaitEstimate();
        }

            
            {
                this$0 = PassengerClassicRideMatchingView.this;
                super();
            }
    };
    PassengerRideAddressInput passengerRideAddressInput;
    HeightObservableLayout passengerRideBottom;
    IPassengerRideProvider passengerRideProvider;
    HeightObservableLayout passengerRideTop;
    ILyftPreferences preferences;
    RideMap rideMap;
    SlideMenuController slideMenuController;
    Toolbar toolbar;
    IUserSession userSession;

    public PassengerClassicRideMatchingView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    private long getMatchingStartTime()
    {
        MatchingStartTime matchingstarttime1 = preferences.getPassengerMatchingStartTime();
        String s = passengerRideProvider.getPassengerRide().getId();
        MatchingStartTime matchingstarttime = matchingstarttime1;
        if (!Objects.equals(matchingstarttime1.getRideId(), s))
        {
            matchingstarttime = new MatchingStartTime(s);
            preferences.setPassengerMatchingStartTime(matchingstarttime);
        }
        return matchingstarttime.getStartTime();
    }

    private String resolveAddressName(Location location)
    {
        String s = location.getDisplayName();
        if (location.isNull() || !Strings.isNullOrEmpty(s))
        {
            return s;
        } else
        {
            return getResources().getString(0x7f070064);
        }
    }

    private void setupRideAddressInput()
    {
        passengerRideAddressInput.showPickupAndDropoff();
        passengerRideAddressInput.setInputsFocusable(false);
        passengerRideAddressInput.setPickupAddress(resolveAddressName(passengerRideProvider.getPassengerRide().getPickup()));
        passengerRideAddressInput.setDropoffAddress(resolveAddressName(passengerRideProvider.getPassengerRide().getDropoff()));
        binder.bind(passengerRideAddressInput.observePickupClick(), new Action1() {

            final PassengerClassicRideMatchingView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                dialogFlow.show(new PassengerDialogs.LockAddressDialog(true));
            }

            
            {
                this$0 = PassengerClassicRideMatchingView.this;
                super();
            }
        });
        binder.bind(passengerRideAddressInput.observeDropoffClick(), new Action1() {

            final PassengerClassicRideMatchingView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                RideAnalytics.trackContactingDriverSetDestinationTap();
                appFlow.goTo(new me.lyft.android.ui.placesearch.PlaceSearchScreens.PassengerSetDropoffSearch());
            }

            
            {
                this$0 = PassengerClassicRideMatchingView.this;
                super();
            }
        });
    }

    private void updateWaitEstimate()
    {
        long l = passengerRideProvider.getPassengerRide().getWaitEstimateInSec();
        if (l > 0L)
        {
            contactingDriverBottomView.setWaitTime(l);
            return;
        } else
        {
            contactingDriverBottomView.hideProgressBar();
            return;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        slideMenuController.enableMenu();
        toolbar.addItem(0x7f0d0003, 0x7f02012a);
        binder = Binder.attach(this);
        binder.bind(toolbar.observeItemClick(), onMenuItemClicked);
        setupRideAddressInput();
        contactingDriverBottomView.setRotatingMessages(constantsProvider.getConstants().getPlaceholderClassicMatchingScreenStrings());
        contactingDriverBottomView.setStartTime(getMatchingStartTime());
        contactingDriverBottomView.hideEmptyPassengerView();
        binder.bind(passengerRideProvider.observeRideUpdateEvent(), onRideUpdated);
        binder.bind(rideMap.observeMapLoaded(), onMapLoaded);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        slideMenuController.disableMenu();
        rideMap.clearAllMarkers();
        rideMap.clearRoutes();
        rideMap.reset();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }


}
