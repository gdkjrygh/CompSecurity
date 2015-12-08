// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.text.MessageFormat;
import me.lyft.android.analytics.ScreenAnalytics;
import me.lyft.android.analytics.studies.DriverAnalytics;
import me.lyft.android.application.geo.IEtaAnalyticService;
import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.application.ride.IDriverRouteService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.RideStatus;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.errorhandling.IDefaultErrorHandler;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.rx.ReactiveProperty;
import me.lyft.android.services.TimerManager;
import me.lyft.android.ui.HeightObservableLayout;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.UserImageView;
import me.lyft.android.ui.ride.RideMap;
import me.lyft.android.ui.tooltips.TooltipContainerView;
import me.lyft.android.utils.SoundManager;
import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.subscriptions.Subscriptions;

public class DriverRideAcceptView extends FrameLayout
{

    public static final String TIMER_INCOMING_RIDE = "incoming_ride";
    TextView acceptRideCountdownTxt;
    View acceptRideView;
    View acceptView;
    TextView addressTextView;
    private Binder binder;
    MessageBus bus;
    IDefaultErrorHandler defaultErrorHandler;
    DialogFlow dialogFlow;
    HeightObservableLayout driverRideBottom;
    HeightObservableLayout driverRideTop;
    IDriverRouteService driverRouteService;
    IEtaAnalyticService etaAnalyticService;
    TextView etaTextView;
    IGeoService geoService;
    ILocationService locationService;
    private ReactiveProperty newRideRequested;
    private Action1 onMapLoaded;
    private Action1 onNewRideRequested;
    private Action1 onPrimeTimeChanged;
    private Action1 onRouteChanged;
    TextView passengerNameTextView;
    TextView passengerRatingTextView;
    UserImageView photoImageView;
    View primeTimeBannerContainer;
    TextView primeTimeBannerText;
    private ReactiveProperty primeTimeValueChanged;
    IProgressController progressController;
    RideMap rideMap;
    IDriverRideProvider routeProvider;
    SoundManager soundManager;
    private final Action1 timerCountdownCallback = new Action1() {

        final DriverRideAcceptView this$0;

        public void call(Long long1)
        {
            if (progressController.isUIEnabled())
            {
                updateCountdownUI(long1);
            }
        }

        public volatile void call(Object obj)
        {
            call((Long)obj);
        }

            
            {
                this$0 = DriverRideAcceptView.this;
                super();
            }
    };
    TimerManager timerManager;
    private Subscription timerSubscription;
    Toolbar toolbar;
    TooltipContainerView tooltipView;
    private String triedToAcceptRideId;

    public DriverRideAcceptView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        newRideRequested = ReactiveProperty.create();
        primeTimeValueChanged = ReactiveProperty.create();
        timerSubscription = Subscriptions.empty();
        onMapLoaded = new Action1() {

            final DriverRideAcceptView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                ScreenAnalytics.trackScreenView("driver_incoming_job");
                updateViewModels();
                rideMap.bindPadding(driverRideTop, driverRideBottom);
                binder.bind(routeProvider.observeRide(), onRouteChanged);
                binder.bind(newRideRequested.map(Unit.func1()), onNewRideRequested);
                binder.bind(primeTimeValueChanged, onPrimeTimeChanged);
            }

            
            {
                this$0 = DriverRideAcceptView.this;
                super();
            }
        };
        onRouteChanged = new Action1() {

            final DriverRideAcceptView this$0;

            public volatile void call(Object obj)
            {
                call((DriverRide)obj);
            }

            public void call(DriverRide driverride)
            {
                if (driverride.getStatus().isLapsed())
                {
                    onRouteLapsed();
                    return;
                } else
                {
                    updateViewModels();
                    return;
                }
            }

            
            {
                this$0 = DriverRideAcceptView.this;
                super();
            }
        };
        onNewRideRequested = new Action1() {

            final DriverRideAcceptView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                timerSubscription.unsubscribe();
                timerSubscription = binder.bind(timerManager.getTimer("incoming_ride", routeProvider.getDriverRide().getCurrentRideId(), Long.valueOf(routeProvider.getDriverRide().getLapseTimerSeconds())).observeOn(AndroidSchedulers.mainThread()), timerCountdownCallback);
                initializeUIElements();
            }

            
            {
                this$0 = DriverRideAcceptView.this;
                super();
            }
        };
        onPrimeTimeChanged = new Action1() {

            final DriverRideAcceptView this$0;

            public void call(Integer integer)
            {
                showPrimeTimeBanner(integer.intValue());
            }

            public volatile void call(Object obj)
            {
                call((Integer)obj);
            }

            
            {
                this$0 = DriverRideAcceptView.this;
                super();
            }
        };
        Scoop.a(this).b(this);
    }

    private void acceptRide()
    {
        triedToAcceptRideId = routeProvider.getDriverRide().getCurrentRideId();
        progressController.disableUI();
        driverRouteService.acceptRoute().subscribe(new AsyncCall() {

            final DriverRideAcceptView this$0;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                defaultErrorHandler.handle(throwable);
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.enableUI();
            }

            
            {
                this$0 = DriverRideAcceptView.this;
                super();
            }
        });
    }

    private String formatRating(float f)
    {
        if (f == 0.0F)
        {
            return getResources().getString(0x7f07020c);
        } else
        {
            return Float.toString(f);
        }
    }

    private String getCountdownText(long l)
    {
        return String.format(getResources().getString(0x7f070143), new Object[] {
            Long.valueOf(l)
        });
    }

    private void initializeUIElements()
    {
        binder.bind(locationService.getLastLocation().flatMap(new Func1() {

            final DriverRideAcceptView this$0;

            public volatile Object call(Object obj1)
            {
                return call((Location)obj1);
            }

            public Observable call(Location location)
            {
                return geoService.getDriverEta(routeProvider.getDriverRide().getCurrentRideId(), location, new Location[] {
                    routeProvider.getDriverRide().getCurrentStop().getLocation()
                });
            }

            
            {
                this$0 = DriverRideAcceptView.this;
                super();
            }
        }), new AsyncCall() {

            final DriverRideAcceptView this$0;

            public void onFail(Throwable throwable)
            {
                etaTextView.setVisibility(8);
            }

            public void onSuccess(Long long1)
            {
                long1 = Html.fromHtml(MessageFormat.format(getResources().getString(0x7f070147), new Object[] {
                    long1
                }));
                etaTextView.setVisibility(0);
                etaTextView.setText(long1);
            }

            public volatile void onSuccess(Object obj1)
            {
                onSuccess((Long)obj1);
            }

            
            {
                this$0 = DriverRideAcceptView.this;
                super();
            }
        });
        final Location pickupLocation = routeProvider.getDriverRide().getCurrentPassenger();
        passengerNameTextView.setText(pickupLocation.getFirstName());
        Object obj = formatRating(pickupLocation.getRating());
        passengerRatingTextView.setText(((CharSequence) (obj)));
        obj = routeProvider.getDriverRide().getCurrentStop().getLocation();
        if (Strings.isNullOrEmpty(((Location) (obj)).getAddress()))
        {
            addressTextView.setText(0x7f070064);
        } else
        {
            addressTextView.setText(((Location) (obj)).getAddress());
        }
        binder.bind(geoService.reverseGeocode(((Location) (obj))), new AsyncCall() {

            final DriverRideAcceptView this$0;

            public volatile void onSuccess(Object obj1)
            {
                onSuccess((Location)obj1);
            }

            public void onSuccess(Location location)
            {
                super.onSuccess(location);
                if (!Strings.isNullOrEmpty(location.getDisplayName()))
                {
                    addressTextView.setText(location.getDisplayName());
                    return;
                } else
                {
                    addressTextView.setText(0x7f070064);
                    return;
                }
            }

            
            {
                this$0 = DriverRideAcceptView.this;
                super();
            }
        });
        obj = pickupLocation.getPhotoUrl();
        photoImageView.loadPhoto(((String) (obj)));
        photoImageView.setUserPartySize(Integer.valueOf(pickupLocation.getPartySize()));
        pickupLocation = routeProvider.getDriverRide().getCurrentStop().getLocation();
        rideMap.showPickupMarker(pickupLocation);
        binder.bind(locationService.getLastLocation(), new AsyncCall() {

            final DriverRideAcceptView this$0;
            final Location val$pickupLocation;

            public volatile void onSuccess(Object obj1)
            {
                onSuccess((Location)obj1);
            }

            public void onSuccess(Location location)
            {
                super.onSuccess(location);
                rideMap.showDriverDirections(location, pickupLocation, getResources().getColor(0x7f0c000b));
                rideMap.fitMapTo(new Location[] {
                    pickupLocation, location
                });
            }

            
            {
                this$0 = DriverRideAcceptView.this;
                pickupLocation = location;
                super();
            }
        });
    }

    private void lapseRoute()
    {
        driverRouteService.lapseRoute(triedToAcceptCurrentRoute()).observeOn(AndroidSchedulers.mainThread()).subscribe(new AsyncCall());
        onRouteLapsed();
    }

    private void onRouteLapsed()
    {
        DriverAnalytics.trackRequestMissed();
        if (triedToAcceptCurrentRoute())
        {
            showDriverRideLapsedDialog();
        } else
        {
            showDriverMissedRideDialog();
        }
        driverRouteService.clearRoute();
    }

    private void resolveAcceptButtonColor(DriverRide driverride)
    {
        int i;
        if (driverride.isCourier())
        {
            i = 0x7f02005a;
        } else
        if (driverride.isPlus())
        {
            i = 0x7f02004d;
        } else
        {
            i = 0x7f020050;
        }
        acceptRideView.setBackgroundResource(i);
    }

    private void resolvePrimeTimeBannerColor(DriverRide driverride)
    {
        int i;
        if (driverride.isCourier())
        {
            i = getResources().getColor(0x7f0c0087);
        } else
        if (driverride.isPlus())
        {
            i = getResources().getColor(0x7f0c0085);
        } else
        {
            i = getResources().getColor(0x7f0c0086);
        }
        primeTimeBannerContainer.setBackgroundColor(i);
    }

    private void resolveToolbarLogo(DriverRide driverride)
    {
        if (driverride.isCourier())
        {
            toolbar.setLogo(0x7f020101);
            return;
        }
        if (driverride.isPlus())
        {
            toolbar.setLogo(0x7f020109);
            return;
        } else
        {
            toolbar.setLogo(0x7f020107);
            return;
        }
    }

    private void showPrimeTimeBanner(int i)
    {
        DriverAnalytics.trackPrimeTimeShown(i);
        if (i <= 0)
        {
            primeTimeBannerContainer.setVisibility(8);
            return;
        } else
        {
            primeTimeBannerContainer.setVisibility(0);
            primeTimeBannerText.setText(getResources().getString(0x7f0702b7, new Object[] {
                Integer.valueOf(i)
            }));
            return;
        }
    }

    private void showTooltips()
    {
        if (!routeProvider.getDriverRide().showHints())
        {
            return;
        } else
        {
            tooltipView.tryToShowAndMarkShown("accept_button");
            return;
        }
    }

    private boolean triedToAcceptCurrentRoute()
    {
        return Objects.equals(triedToAcceptRideId, routeProvider.getDriverRide().getCurrentRideId());
    }

    private void updateCountdownUI(Long long1)
    {
        acceptRideCountdownTxt.setText(getCountdownText(long1.longValue()));
        if (long1.equals(Long.valueOf(routeProvider.getDriverRide().getLapseTimerSeconds())))
        {
            soundManager.play(4);
            return;
        }
        if (long1.longValue() <= 0L)
        {
            progressController.enableUI();
            lapseRoute();
            soundManager.play(3);
            return;
        } else
        {
            soundManager.play(3);
            return;
        }
    }

    private void updateViewModels()
    {
        newRideRequested.onNext(routeProvider.getDriverRide().getCurrentRideId());
        primeTimeValueChanged.onNext(Integer.valueOf(routeProvider.getDriverRide().getPrimeTimePercent()));
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        DriverAnalytics.trackIncomingRequest();
        binder = Binder.attach(this);
        toolbar.hideHomeIcon().hideItem(0x7f0d0003).hideItem(0x7f0d0022).disableHomeButton().showDivider();
        DriverRide driverride = routeProvider.getDriverRide();
        resolveToolbarLogo(driverride);
        resolveAcceptButtonColor(driverride);
        resolvePrimeTimeBannerColor(driverride);
        showPrimeTimeBanner(driverride.getPrimeTimePercent());
        acceptRideCountdownTxt.setText("");
        acceptView.setOnClickListener(new android.view.View.OnClickListener() {

            final DriverRideAcceptView this$0;

            public void onClick(View view)
            {
                acceptRide();
            }

            
            {
                this$0 = DriverRideAcceptView.this;
                super();
            }
        });
        if (dialogFlow.hasActiveDialog())
        {
            dialogFlow.dismiss();
        }
        etaAnalyticService.clear();
        progressController.enableUI();
        binder.bind(rideMap.observeMapLoaded(), onMapLoaded);
        showTooltips();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        toolbar.enableHomeButton();
        rideMap.clearPickupMarker();
        rideMap.clearDestinationMarker();
        rideMap.clearRoutes();
        rideMap.reset();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

    public void showDriverMissedRideDialog()
    {
        me.lyft.android.ui.Dialogs.AlertDialog alertdialog = (new me.lyft.android.ui.Dialogs.AlertDialog("driver_missed_ride_dialog")).setIcon(Integer.valueOf(0x7f02013c)).setTitle(getContext().getString(0x7f07014e)).setMessage(getContext().getString(0x7f07014d)).addPositiveButton(getContext().getString(0x7f070212));
        dialogFlow.show(alertdialog);
    }

    public void showDriverRideLapsedDialog()
    {
        me.lyft.android.ui.Dialogs.AlertDialog alertdialog = (new me.lyft.android.ui.Dialogs.AlertDialog("driver_ride_lapsed_dialog")).setTitle(getContext().getString(0x7f07014c)).setMessage(getContext().getString(0x7f07014b)).addPositiveButton(getContext().getString(0x7f070212));
        dialogFlow.show(alertdialog);
    }





/*
    static Subscription access$1002(DriverRideAcceptView driverrideacceptview, Subscription subscription)
    {
        driverrideacceptview.timerSubscription = subscription;
        return subscription;
    }

*/











}
