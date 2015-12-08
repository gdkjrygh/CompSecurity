// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.IHandleBack;
import com.lyft.scoop.Scoop;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.analytics.ScreenAnalytics;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.application.ride.IDestinyService;
import me.lyft.android.application.ride.IDestinySession;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.location.Location;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.ReactiveProperty;
import me.lyft.android.ui.HeightObservableLayout;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.dialogs.Toast;
import me.lyft.android.ui.ride.RideMap;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;
import rx.subscriptions.Subscriptions;

public class SetDestinyView extends RelativeLayout
    implements IHandleBack
{

    AppFlow appFlow;
    private Binder binder;
    HeightObservableLayout bottomView;
    ImageButton centerToCurrentLocationButton;
    IConstantsProvider constantsProvider;
    FrameLayout destinyAddressInput;
    private ReactiveProperty destinyAddressSubject;
    TextView destinyAddressTextView;
    IDestinyService destinyService;
    IDestinySession destinySession;
    DialogFlow dialogFlow;
    IGeoService geoService;
    ILocationService locationService;
    private Action1 onDestinyAddressChanged;
    private Action1 onDestinyLocationChanged;
    private Action1 onMapDragEnded;
    Action1 onMapLoaded;
    private Action1 onShortcutClick;
    private Action1 onToolbarItemClicked;
    ILyftPreferences preferences;
    IProgressController progressController;
    private Subscription reverseGeocodeSubscription;
    RideMap rideMap;
    Button setDestinyButton;
    Toolbar toolbar;
    HeightObservableLayout topView;
    IViewErrorHandler viewErrorHandler;

    public SetDestinyView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        destinyAddressSubject = ReactiveProperty.create();
        reverseGeocodeSubscription = Subscriptions.empty();
        onMapLoaded = new Action1() {

            final SetDestinyView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                ScreenAnalytics.trackScreenView("driver_add_destiny");
                rideMap.bindPadding(topView, bottomView);
                rideMap.centerMapGestures(true);
                rideMap.clearAllMarkers();
                rideMap.showShortcuts();
                binder.bind(toolbar.observeItemClick(), onToolbarItemClicked);
                binder.bind(rideMap.observeMapDragEnd(), onMapDragEnded);
                binder.bind(rideMap.observeShortcutClick(), onShortcutClick);
                binder.bind(destinySession.observeLocationChanges(), onDestinyLocationChanged);
                binder.bind(rideMap.observeMapDragEnd(), onMapDragEnded);
                binder.bind(destinyAddressSubject, onDestinyAddressChanged);
            }

            
            {
                this$0 = SetDestinyView.this;
                super();
            }
        };
        onShortcutClick = new Action1() {

            final SetDestinyView this$0;

            public volatile void call(Object obj)
            {
                call((Location)obj);
            }

            public void call(Location location)
            {
                destinySession.setLocation(location);
                setDestinyLocation();
            }

            
            {
                this$0 = SetDestinyView.this;
                super();
            }
        };
        onMapDragEnded = new Action1() {

            final SetDestinyView this$0;

            public volatile void call(Object obj)
            {
                call((Location)obj);
            }

            public void call(Location location)
            {
                location.setSource("map");
                destinySession.setLocation(location);
            }

            
            {
                this$0 = SetDestinyView.this;
                super();
            }
        };
        onDestinyLocationChanged = new Action1() {

            final SetDestinyView this$0;

            public volatile void call(Object obj)
            {
                call((Location)obj);
            }

            public void call(Location location)
            {
                rideMap.centerToLocationWithoutPadding(location);
                geocodeAddressIfNeeded(location);
            }

            
            {
                this$0 = SetDestinyView.this;
                super();
            }
        };
        onDestinyAddressChanged = new Action1() {

            final SetDestinyView this$0;

            public volatile void call(Object obj)
            {
                call((String)obj);
            }

            public void call(String s)
            {
                destinyAddressTextView.setText(s);
            }

            
            {
                this$0 = SetDestinyView.this;
                super();
            }
        };
        onToolbarItemClicked = new Action1() {

            final SetDestinyView this$0;

            public void call(Integer integer)
            {
                if (integer.intValue() == 0x7f0d0005)
                {
                    exitDestinyMode();
                }
            }

            public volatile void call(Object obj)
            {
                call((Integer)obj);
            }

            
            {
                this$0 = SetDestinyView.this;
                super();
            }
        };
        Scoop.a(this).b(this);
    }

    private void exitDestinyMode()
    {
        progressController.disableUI();
        destinyService.exitSetDestiny().first().subscribe(new AsyncCall() {

            final SetDestinyView this$0;

            public void onFail(Throwable throwable)
            {
                viewErrorHandler.handle(throwable);
            }

            public void onUnsubscribe()
            {
                progressController.enableUI();
            }

            
            {
                this$0 = SetDestinyView.this;
                super();
            }
        });
    }

    private void geocodeAddressIfNeeded(final Location location)
    {
        String s = location.getAddress();
        if (!location.isNull() && Strings.isNullOrEmpty(s))
        {
            destinyAddressSubject.onNext(getResources().getString(0x7f070240));
            reverseGeocodeSubscription.unsubscribe();
            reverseGeocodeSubscription = binder.bind(geoService.reverseGeocode(location), new AsyncCall() {

                final SetDestinyView this$0;
                final Location val$location;

                public volatile void onSuccess(Object obj)
                {
                    onSuccess((Location)obj);
                }

                public void onSuccess(Location location1)
                {
                    super.onSuccess(location1);
                    location1 = location.getDisplayName();
                    if (!Strings.isNullOrEmpty(location1))
                    {
                        destinyAddressSubject.onNext(location1);
                        return;
                    } else
                    {
                        destinyAddressSubject.onNext(getResources().getString(0x7f070064));
                        return;
                    }
                }

            
            {
                this$0 = SetDestinyView.this;
                location = location1;
                super();
            }
            });
            return;
        } else
        {
            destinyAddressSubject.onNext(s);
            return;
        }
    }

    private void restoreViewState()
    {
        destinySession.restoreSession();
        rideMap.restoreZoom(destinySession.getZoomLevel());
    }

    private void saveViewState()
    {
        destinySession.setZoomLevel(rideMap.getZoomLevel());
    }

    private void setDestinyLocation()
    {
        progressController.disableUI();
        binder.bind(destinyService.setDestiny(destinySession.getLocation()).doOnNext(new Action1() {

            final SetDestinyView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                unit = constantsProvider.getConstants().getDestinyStartedModalText(getResources().getString(0x7f07010d));
                dialogFlow.show(new Toast(unit));
            }

            
            {
                this$0 = SetDestinyView.this;
                super();
            }
        }), new AsyncCall() {

            final SetDestinyView this$0;

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.enableUI();
            }

            
            {
                this$0 = SetDestinyView.this;
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
        }
        binder = Binder.attach(this);
        destinyAddressTextView.setFocusable(true);
        destinyAddressTextView.setFocusableInTouchMode(true);
        if (!preferences.isFirstTimeDestinyInfoShown())
        {
            preferences.setFirstTimeDestinyInfoShown(true);
            dialogFlow.show(new me.lyft.android.ui.driver.DriverDialogs.DestinyInfoDialog());
        }
        toolbar.addItem(0x7f0d0005, 0x7f02012a).showItem(0x7f0d0005).setTitle(getResources().getString(0x7f070131)).hideHomeIcon();
        destinyAddressInput.setOnClickListener(new android.view.View.OnClickListener() {

            final SetDestinyView this$0;

            public void onClick(View view)
            {
                openPlaceSearch();
            }

            
            {
                this$0 = SetDestinyView.this;
                super();
            }
        });
        centerToCurrentLocationButton.setOnClickListener(new android.view.View.OnClickListener() {

            final SetDestinyView this$0;

            public void onClick(View view)
            {
                binder.bind(locationService.getLastLocation(), new Action1() {

                    final _cls2 this$1;

                    public volatile void call(Object obj)
                    {
                        call((Location)obj);
                    }

                    public void call(Location location)
                    {
                        rideMap.centerToLocationWithoutPadding(location);
                        destinySession.setLocation(location);
                    }

            
            {
                this$1 = _cls2.this;
                super();
            }
                });
            }

            
            {
                this$0 = SetDestinyView.this;
                super();
            }
        });
        setDestinyButton.setOnClickListener(new android.view.View.OnClickListener() {

            final SetDestinyView this$0;

            public void onClick(View view)
            {
                if (destinySession.getLocation().isNull())
                {
                    openPlaceSearch();
                    return;
                } else
                {
                    setDestinyLocation();
                    return;
                }
            }

            
            {
                this$0 = SetDestinyView.this;
                super();
            }
        });
        restoreViewState();
        binder.bind(rideMap.observeMapLoaded(), onMapLoaded);
    }

    public boolean onBack()
    {
        exitDestinyMode();
        return true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        saveViewState();
        rideMap.centerMapGestures(false);
        rideMap.clearAllMarkers();
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

    public void openPlaceSearch()
    {
        appFlow.goTo(new me.lyft.android.ui.placesearch.PlaceSearchScreens.DestinySearch());
    }










}
