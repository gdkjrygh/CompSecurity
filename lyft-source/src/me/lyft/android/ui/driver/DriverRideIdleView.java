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
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.google.android.gms.maps.model.Marker;
import com.lyft.scoop.Scoop;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.analytics.ScreenAnalytics;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.driver.IDailyTotalsRepository;
import me.lyft.android.application.ride.IRequestRideTypeProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.payment.Money;
import me.lyft.android.domain.ride.RequestRideType;
import me.lyft.android.events.AppStateUpdatedEvent;
import me.lyft.android.features.FeatureFlag;
import me.lyft.android.features.Features;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.infrastructure.lyft.ride.HeatmapMetaDTO;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.rx.ReactiveProperty;
import me.lyft.android.rx.ReactiveUI;
import me.lyft.android.rx.VisibilityBinding;
import me.lyft.android.services.HeatMapService;
import me.lyft.android.ui.HeightObservableLayout;
import me.lyft.android.ui.SlideMenuController;
import me.lyft.android.ui.ride.RideMap;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.subscriptions.Subscriptions;

public class DriverRideIdleView extends LinearLayout
{

    private static final int DEFAULT_ZOOM_LEVEL = 12;
    private static final int ZOOM_CACHE_KILL_THRESHOLD = 1;
    AppFlow appFlow;
    private Binder binder;
    MessageBus bus;
    IConstantsProvider constantsProvider;
    IDailyTotalsRepository dailyTotalsRepository;
    DialogFlow dialogFlow;
    Button driverDailyTotalButtonView;
    private ReactiveProperty driverMarkerChange;
    private Action1 driverMarkerChangeCallback;
    HeightObservableLayout driverRideBottom;
    HeightObservableLayout driverRideTop;
    ImageButton followCurrentLocationButton;
    HeatMapService heatMapService;
    LinearLayout heatmapHeader;
    private Observable heatmapHeaderVisibilityObservable;
    private Observable heatmapPrimeTimeHasRangeObservable;
    TextView heatmapPrimeTimeRate;
    private ReactiveProperty heatmapPrimeTimeRateChange;
    private Action1 heatmapPrimeTimeRateChangeCallback;
    private ReactiveProperty isHeatmapEnabledSubject;
    private final ArrayList nearbyDriverMarkers = new ArrayList();
    private Subscription nearbyDriversUpdateSubscription;
    private Action1 onAppStateUpdated;
    private Action1 onCameraZoomChanged;
    private android.view.View.OnClickListener onFollowCurrentLocationClicked;
    private Action1 onHeaderVisibilityChange;
    private Action1 onHeatMapMetaDataChanged;
    private Action1 onHeatmapEnabledChange;
    private Action1 onMapDragStart;
    private Action1 onMapLoaded;
    private Action1 onToolbarItemClicked;
    IRequestRideTypeProvider requestRideTypeProvider;
    RideMap rideMap;
    SlideMenuController slideMenuController;
    private ReactiveProperty tilesUrlChange;
    Toolbar toolbar;

    public DriverRideIdleView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        isHeatmapEnabledSubject = ReactiveProperty.create();
        heatmapPrimeTimeRateChange = ReactiveProperty.create();
        heatmapPrimeTimeHasRangeObservable = heatmapPrimeTimeRateChange.map(new Func1() {

            final DriverRideIdleView this$0;

            public Boolean call(HeatmapMetaDTO heatmapmetadto)
            {
                boolean flag;
                if (!Strings.isNullOrEmpty((String)Objects.firstNonNull(heatmapmetadto.getPrimeTimeRange(), "")))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return Boolean.valueOf(flag);
            }

            public volatile Object call(Object obj)
            {
                return call((HeatmapMetaDTO)obj);
            }

            
            {
                this$0 = DriverRideIdleView.this;
                super();
            }
        });
        heatmapHeaderVisibilityObservable = ReactiveUI.and(new Observable[] {
            heatmapPrimeTimeHasRangeObservable, isHeatmapEnabledSubject
        });
        tilesUrlChange = ReactiveProperty.create();
        driverMarkerChange = ReactiveProperty.create();
        nearbyDriversUpdateSubscription = Subscriptions.empty();
        onMapLoaded = new Action1() {

            final DriverRideIdleView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                rideMap.bindPadding(driverRideTop, driverRideBottom);
                rideMap.centerToCurrentLocation(12F);
                rideMap.clearAllMarkers();
                binder.bind(bus.observe(me/lyft/android/events/AppStateUpdatedEvent), onAppStateUpdated);
                binder.bind(heatmapHeaderVisibilityObservable, new VisibilityBinding(heatmapHeader));
                binder.bind(heatmapHeaderVisibilityObservable, onHeaderVisibilityChange);
                binder.bind(heatMapService.observeHeatMapMetaData(), onHeatMapMetaDataChanged);
                binder.bind(heatmapPrimeTimeRateChange, heatmapPrimeTimeRateChangeCallback);
                binder.bind(rideMap.observeCameraZoomChanged(), onCameraZoomChanged);
                binder.bind(isHeatmapEnabledSubject, onHeatmapEnabledChange);
                binder.bind(rideMap.observeMapDragStart(), onMapDragStart);
            }

            
            {
                this$0 = DriverRideIdleView.this;
                super();
            }
        };
        onCameraZoomChanged = new Action1() {

            private int previousZoom;
            final DriverRideIdleView this$0;

            public void call(Float float1)
            {
                if (Math.abs((float)previousZoom - float1.floatValue()) >= 1.0F)
                {
                    previousZoom = float1.intValue();
                    addTileOverlay();
                }
            }

            public volatile void call(Object obj)
            {
                call((Float)obj);
            }

            
            {
                this$0 = DriverRideIdleView.this;
                super();
            }
        };
        heatmapPrimeTimeRateChangeCallback = new Action1() {

            final DriverRideIdleView this$0;

            public volatile void call(Object obj)
            {
                call((HeatmapMetaDTO)obj);
            }

            public void call(HeatmapMetaDTO heatmapmetadto)
            {
                LinearLayout linearlayout;
                int i;
                if (!Strings.isNullOrEmpty((String)Objects.firstNonNull(heatmapmetadto.getPrimeTimeRange(), "")))
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                linearlayout = heatmapHeader;
                if (i != 0)
                {
                    i = 0;
                } else
                {
                    i = 8;
                }
                linearlayout.setVisibility(i);
                heatmapPrimeTimeRate.setText(getResources().getString(0x7f070190, new Object[] {
                    Objects.firstNonNull(heatmapmetadto.getPrimeTimeRange(), "")
                }));
            }

            
            {
                this$0 = DriverRideIdleView.this;
                super();
            }
        };
        driverMarkerChangeCallback = new Action1() {

            final DriverRideIdleView this$0;

            public volatile void call(Object obj)
            {
                call((List)obj);
            }

            public void call(List list)
            {
                rideMap.refreshNearbyDriversMarkers(requestRideTypeProvider.getDefaultRideType());
            }

            
            {
                this$0 = DriverRideIdleView.this;
                super();
            }
        };
        onAppStateUpdated = new Action1() {

            final DriverRideIdleView this$0;

            public volatile void call(Object obj)
            {
                call((AppStateDTO)obj);
            }

            public void call(AppStateDTO appstatedto)
            {
                tilesUrlChange.onNext(constantsProvider.getConstants().getHeatmapTilesUrl());
                driverMarkerChange.onNext(requestRideTypeProvider.getDefaultRideType().getDrivers());
                isHeatmapEnabledSubject.onNext(Boolean.valueOf(Features.HEATMAPS.isEnabled()));
            }

            
            {
                this$0 = DriverRideIdleView.this;
                super();
            }
        };
        onHeatMapMetaDataChanged = new Action1() {

            final DriverRideIdleView this$0;

            public volatile void call(Object obj)
            {
                call((HeatmapMetaDTO)obj);
            }

            public void call(HeatmapMetaDTO heatmapmetadto)
            {
                heatmapPrimeTimeRateChange.onNext(heatmapmetadto);
                addTileOverlay();
            }

            
            {
                this$0 = DriverRideIdleView.this;
                super();
            }
        };
        onHeatmapEnabledChange = new Action1() {

            final DriverRideIdleView this$0;

            public void call(Boolean boolean1)
            {
                if (boolean1.booleanValue())
                {
                    nearbyDriversUpdateSubscription.unsubscribe();
                    clearNearbyDriversMarkers();
                    heatMapService.start();
                    addTileOverlay();
                    return;
                } else
                {
                    nearbyDriversUpdateSubscription = binder.bind(driverMarkerChange, driverMarkerChangeCallback);
                    heatMapService.stop();
                    rideMap.removeTileOverlay();
                    return;
                }
            }

            public volatile void call(Object obj)
            {
                call((Boolean)obj);
            }

            
            {
                this$0 = DriverRideIdleView.this;
                super();
            }
        };
        onHeaderVisibilityChange = new Action1() {

            final DriverRideIdleView this$0;

            public void call(Boolean boolean1)
            {
                if (boolean1.booleanValue())
                {
                    toolbar.showDivider();
                    return;
                } else
                {
                    toolbar.hideDivider();
                    return;
                }
            }

            public volatile void call(Object obj)
            {
                call((Boolean)obj);
            }

            
            {
                this$0 = DriverRideIdleView.this;
                super();
            }
        };
        onToolbarItemClicked = new Action1() {

            final DriverRideIdleView this$0;

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
                this$0 = DriverRideIdleView.this;
                super();
            }
        };
        onMapDragStart = new Action1() {

            final DriverRideIdleView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                unfollowCurrentLocation();
            }

            
            {
                this$0 = DriverRideIdleView.this;
                super();
            }
        };
        onFollowCurrentLocationClicked = new android.view.View.OnClickListener() {

            final DriverRideIdleView this$0;

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
                this$0 = DriverRideIdleView.this;
                super();
            }
        };
        Scoop.a(this).b(this);
    }

    private void addTileOverlay()
    {
        String s = (String)tilesUrlChange.get();
        rideMap.removeTileOverlay();
        rideMap.addHeatmapOverlay(s);
    }

    private void clearNearbyDriversMarkers()
    {
        for (Iterator iterator = nearbyDriverMarkers.iterator(); iterator.hasNext(); ((Marker)iterator.next()).a()) { }
        nearbyDriverMarkers.clear();
    }

    private void followCurrentLocation()
    {
        followCurrentLocationButton.setSelected(true);
        rideMap.followCurrentLocation();
    }

    private void unfollowCurrentLocation()
    {
        followCurrentLocationButton.setSelected(false);
        rideMap.unfollowCurrentLocation();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        ScreenAnalytics.trackScreenView("driver_idle_no_destiny");
        binder = Binder.attach(this);
        slideMenuController.enableMenu();
        heatMapService.stop();
        rideMap.removeTileOverlay();
        followCurrentLocationButton.setOnClickListener(onFollowCurrentLocationClicked);
        unfollowCurrentLocation();
        toolbar.clearItems().showHomeIcon().addItem(0x7f0d0021, 0x7f02018c);
        toolbar.showDriverModeToggle();
        heatmapHeader.setOnClickListener(new android.view.View.OnClickListener() {

            final DriverRideIdleView this$0;

            public void onClick(View view)
            {
                dialogFlow.show(new DriverDialogs.PrimeTimeHeatmapDialog((String)Objects.firstNonNull(heatMapService.getHeatMapMetaData().getPrimeTimeRange(), "")));
            }

            
            {
                this$0 = DriverRideIdleView.this;
                super();
            }
        });
        driverDailyTotalButtonView.setText(dailyTotalsRepository.getDailyTotal().format());
        driverDailyTotalButtonView.setOnClickListener(new android.view.View.OnClickListener() {

            final DriverRideIdleView this$0;

            public void onClick(View view)
            {
                appFlow.goTo(new DriverScreens.DriverStatsScreen());
            }

            
            {
                this$0 = DriverRideIdleView.this;
                super();
            }
        });
        binder.bind(toolbar.observeItemClick(), onToolbarItemClicked);
        binder.bind(rideMap.observeMapLoaded(), onMapLoaded);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        heatMapService.stop();
        rideMap.removeTileOverlay();
        clearNearbyDriversMarkers();
        rideMap.clearRoutes();
        rideMap.clearPickupMarker();
        rideMap.clearDestinationMarker();
        rideMap.reset();
        slideMenuController.disableMenu();
        unfollowCurrentLocation();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }









/*
    static Subscription access$1402(DriverRideIdleView driverrideidleview, Subscription subscription)
    {
        driverrideidleview.nearbyDriversUpdateSubscription = subscription;
        return subscription;
    }

*/












}
