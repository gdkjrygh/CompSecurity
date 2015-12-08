// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ride;

import android.graphics.Bitmap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me.lyft.android.analytics.ActionAnalytics;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.application.shortcuts.IShortcutService;
import me.lyft.android.common.Iterables;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.geo.Leg;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.NullLocation;
import me.lyft.android.domain.passenger.Driver;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.NearbyDriver;
import me.lyft.android.domain.ride.RequestRideType;
import me.lyft.android.domain.ride.RideType;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.domain.shortcuts.Shortcut;
import me.lyft.android.errorhandling.IDefaultErrorHandler;
import me.lyft.android.features.FeatureFlag;
import me.lyft.android.features.Features;
import me.lyft.android.infrastructure.assets.IAssetLoadingService;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.constants.RideTypeMeta;
import me.lyft.android.map.core.MapPlaceHolderView;
import me.lyft.android.map.core.polyline.IPolyline;
import me.lyft.android.map.core.polyline.IPolylineOptions;
import me.lyft.android.map.core.polyline.PolylineOptions;
import me.lyft.android.map.core.tileoverlay.ITileOverlay;
import me.lyft.android.map.core.tileoverlay.NullTileOverlay;
import me.lyft.android.map.core.tileoverlay.TileOverlayOptions;
import me.lyft.android.map.lyft.DriverHeatMapTileProvider;
import me.lyft.android.map.lyft.MapOwner;
import me.lyft.android.map.lyft.markeroptions.DriverMarkerOptions;
import me.lyft.android.map.lyft.markeroptions.DriverStopMarkerOptions;
import me.lyft.android.map.lyft.markeroptions.DropoffMarkerOptions;
import me.lyft.android.map.lyft.markeroptions.HotspotMarkerOptions;
import me.lyft.android.map.lyft.markeroptions.NearbyDriverMarkerOptions;
import me.lyft.android.map.lyft.markeroptions.PickupMarkerOptions;
import me.lyft.android.map.lyft.markeroptions.RouteMarkerOptions;
import me.lyft.android.map.lyft.markeroptions.ShortcutMarkerOptions;
import me.lyft.android.map.lyft.markeroptions.ToolTipDriverMarkerOptions;
import me.lyft.android.map.lyft.markers.DriverMarker;
import me.lyft.android.map.lyft.markers.DriverStopMarker;
import me.lyft.android.map.lyft.markers.DropoffPinMarker;
import me.lyft.android.map.lyft.markers.HotspotMarker;
import me.lyft.android.map.lyft.markers.Marker;
import me.lyft.android.map.lyft.markers.PickupPinMarker;
import me.lyft.android.map.lyft.markers.PinMarker;
import me.lyft.android.map.lyft.markers.SelectableMarker;
import me.lyft.android.map.lyft.markers.ShortcutMarker;
import me.lyft.android.map.lyft.markers.ToolTipDriverMarker;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.ReactiveProperty;
import me.lyft.android.ui.HeightObservableLayout;
import me.lyft.android.utils.MetricsUtils;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.subscriptions.Subscriptions;

public class RideMap
{

    private static final int DRIVER_ROUTE_LINE_WIDTH = 5;
    private static final int PASSENGER_ROUTE_LINE_WIDTH = 3;
    private static final float SHORTCUT_DISTANCE_THRESHOLD = 50000F;
    private Subscription assetLoadingRequestSubscription;
    private final IAssetLoadingService assetLoadingService;
    private Binder binder;
    private Subscription bottomPaddingSubscription;
    private final IConstantsProvider constantsProvider;
    private final IDefaultErrorHandler defaultErrorHandler;
    private Subscription directionsRequestSubscription;
    private boolean displayRoute;
    private Action1 followCurrentLocation;
    private Action1 followLocationAndFitToNextStop;
    private Subscription followLocationSubscription;
    private final IGeoService geoService;
    private final ILocationService locationService;
    private final ReactiveProperty locationSubject = ReactiveProperty.create(NullLocation.getInstance());
    private final MapOwner mapOwner;
    private final IPassengerRideProvider passengerRideProvider;
    private final List polylines = new ArrayList();
    private final IDriverRideProvider routeProvider;
    private final IShortcutService shortcutService;
    private ITileOverlay tileOverlay;
    private Subscription topPaddingSubscription;
    private Action1 updateLastKnownLocation;

    public RideMap(MapOwner mapowner, IAssetLoadingService iassetloadingservice, IDriverRideProvider idriverrideprovider, IPassengerRideProvider ipassengerrideprovider, IGeoService igeoservice, ILocationService ilocationservice, IDefaultErrorHandler idefaulterrorhandler, 
            IShortcutService ishortcutservice, IConstantsProvider iconstantsprovider)
    {
        tileOverlay = NullTileOverlay.getInstance();
        displayRoute = false;
        topPaddingSubscription = Subscriptions.empty();
        bottomPaddingSubscription = Subscriptions.empty();
        directionsRequestSubscription = Subscriptions.empty();
        assetLoadingRequestSubscription = Subscriptions.empty();
        followLocationSubscription = Subscriptions.empty();
        followCurrentLocation = new Action1() {

            final RideMap this$0;

            public volatile void call(Object obj)
            {
                call((Location)obj);
            }

            public void call(Location location)
            {
                mapOwner.centerWithPadding(location, mapOwner.getCameraZoom());
            }

            
            {
                this$0 = RideMap.this;
                super();
            }
        };
        followLocationAndFitToNextStop = new Action1() {

            final RideMap this$0;

            public volatile void call(Object obj)
            {
                call((Location)obj);
            }

            public void call(Location location)
            {
                Location location1 = routeProvider.getDriverRide().getCurrentStop().getLocation();
                if (location1.isNull())
                {
                    mapOwner.centerWithPadding(location, mapOwner.getCameraZoom());
                    return;
                } else
                {
                    fitMapTo(new Location[] {
                        location, location1
                    });
                    return;
                }
            }

            
            {
                this$0 = RideMap.this;
                super();
            }
        };
        updateLastKnownLocation = new Action1() {

            final RideMap this$0;

            public volatile void call(Object obj)
            {
                call((Location)obj);
            }

            public void call(Location location)
            {
                locationSubject.onNext(location);
            }

            
            {
                this$0 = RideMap.this;
                super();
            }
        };
        mapOwner = mapowner;
        assetLoadingService = iassetloadingservice;
        routeProvider = idriverrideprovider;
        passengerRideProvider = ipassengerrideprovider;
        geoService = igeoservice;
        locationService = ilocationservice;
        defaultErrorHandler = idefaulterrorhandler;
        shortcutService = ishortcutservice;
        constantsProvider = iconstantsprovider;
    }

    private void createRouteLineForPassenger(Location location, final int routeColor)
    {
        Object obj = passengerRideProvider.getPassengerRide().getStops();
        final ArrayList locations = new ArrayList(((List) (obj)).size() + 1);
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); locations.add(((Stop)((Iterator) (obj)).next()).getLocation())) { }
        directionsRequestSubscription.unsubscribe();
        obj = (ActionAnalytics)(new ActionAnalytics(me.lyft.android.analytics.definitions.ActionEvent.Action.DIRECTIONS_ROUTE_LINES)).trackInitiation();
        if (Features.ROUTE_DIRECTIONS.isEnabled())
        {
            obj = passengerRideProvider.getPassengerRide().getDriver().getId();
            if (Features.ROUTE_DIRECTIONS_INCLUDE_DRIVE.isEnabled())
            {
                location = geoService.directionsWithDriverLocation(((String) (obj)), location, locations);
            } else
            {
                location = geoService.directions(((String) (obj)), locations);
            }
            directionsRequestSubscription = binder.bind(location, new AsyncCall() {

                final RideMap this$0;
                final List val$locations;
                final int val$routeColor;

                public void onFail(Throwable throwable)
                {
                    clearRoutes();
                    drawStraightLines(locations, routeColor);
                }

                public volatile void onSuccess(Object obj1)
                {
                    onSuccess((List)obj1);
                }

                public void onSuccess(List list)
                {
                    clearRoutes();
                    drawRoute(routeColor, list, 3);
                }

            
            {
                this$0 = RideMap.this;
                routeColor = i;
                locations = list;
                super();
            }
            });
            return;
        } else
        {
            ((ActionAnalytics) (obj)).trackFailure("feature_flag_off");
            clearRoutes();
            drawStraightLines(locations, routeColor);
            return;
        }
    }

    private void drawRoute(int i, List list, int j)
    {
        list = (List)Iterables.aggregate(list, new ArrayList(), new Func2() {

            final RideMap this$0;

            public volatile Object call(Object obj, Object obj1)
            {
                return call((ArrayList)obj, (Leg)obj1);
            }

            public ArrayList call(ArrayList arraylist, Leg leg)
            {
                arraylist.addAll(leg.getLocations());
                return arraylist;
            }

            
            {
                this$0 = RideMap.this;
                super();
            }
        });
        list = mapOwner.addPolyline(PolylineOptions.create().addAll(list).width(mapOwner.getMetricsUtils().dpToPixels(j)).color(i));
        polylines.add(list);
    }

    private void drawStraightLines(List list, int i)
    {
        list = PolylineOptions.create().addAll(list).color(i).width(mapOwner.getMetricsUtils().dpToPixels(3F));
        polylines.add(mapOwner.addPolyline(list));
    }

    private List filterOutFarAwayLocations(Location location, List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Location location1 = (Location)list.next();
            if (location.distanceTo(location1) < 50000D)
            {
                arraylist.add(location1);
            }
        } while (true);
        return arraylist;
    }

    private Observable getLastLocationCameraUpdateObservable()
    {
        return locationService.getLastLocation();
    }

    private List getSelectableMarkers()
    {
        Map map = mapOwner.obtainMarkersByType(me/lyft/android/map/lyft/markers/HotspotMarker);
        Map map1 = mapOwner.obtainMarkersByType(me/lyft/android/map/lyft/markers/ShortcutMarker);
        ArrayList arraylist = new ArrayList(map.size() + map1.size());
        arraylist.addAll(map.values());
        arraylist.addAll(map1.values());
        return arraylist;
    }

    private void showDriverRouteMarkers()
    {
        DriverRide driverride = routeProvider.getDriverRide();
        Object obj = driverride.getIncompleteStops();
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = Iterables.skip(((Iterable) (obj)), 1).iterator(); iterator.hasNext(); arraylist.add(new DriverStopMarkerOptions((Stop)iterator.next()))) { }
        mapOwner.createMarkers(arraylist);
        obj = (Stop)Iterables.firstOrDefault(((Iterable) (obj)), Stop.empty());
        if (driverride.isDroppingOffPassenger())
        {
            ((DropoffPinMarker)mapOwner.createMarker(new DropoffMarkerOptions())).setLocation(((Stop) (obj)).getLocation());
            return;
        } else
        {
            ((PickupPinMarker)mapOwner.createMarker(new PickupMarkerOptions())).setLocation(((Stop) (obj)).getLocation());
            return;
        }
    }

    public void addHeatmapOverlay(String s)
    {
        s = new TileOverlayOptions(new DriverHeatMapTileProvider(s), 0.0F, false);
        tileOverlay = mapOwner.addTileOverlay(s);
    }

    public void attach(MapPlaceHolderView mapplaceholderview)
    {
        binder = Binder.attach(mapplaceholderview);
        binder.bind(locationService.observePassiveLocationUpdates(), updateLastKnownLocation);
        binder.bind(mapOwner.observeCameraPositionChanged(), new Action1() {

            final RideMap this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                Object obj = getSelectableMarkers();
                if (!((List) (obj)).isEmpty())
                {
                    unit = (SelectableMarker)mapOwner.findClosestMarker(getCameraLocationWithoutPadding(), ((List) (obj)));
                    obj = ((List) (obj)).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        SelectableMarker selectablemarker = (SelectableMarker)((Iterator) (obj)).next();
                        if (unit == selectablemarker)
                        {
                            selectablemarker.select();
                        } else
                        {
                            selectablemarker.unselect();
                        }
                    }
                }
            }

            
            {
                this$0 = RideMap.this;
                super();
            }
        });
        mapOwner.attach(mapplaceholderview);
    }

    public void bindBottomPadding(HeightObservableLayout heightobservablelayout)
    {
        binder.remove(bottomPaddingSubscription);
        bottomPaddingSubscription = binder.bind(heightobservablelayout.observeHeightChange(), new Action1() {

            final RideMap this$0;

            public void call(Integer integer)
            {
                mapOwner.setBottomPadding(integer.intValue());
            }

            public volatile void call(Object obj)
            {
                call((Integer)obj);
            }

            
            {
                this$0 = RideMap.this;
                super();
            }
        });
    }

    public void bindPadding(HeightObservableLayout heightobservablelayout, HeightObservableLayout heightobservablelayout1)
    {
        bindTopPadding(heightobservablelayout);
        bindBottomPadding(heightobservablelayout1);
    }

    public void bindTopPadding(HeightObservableLayout heightobservablelayout)
    {
        binder.remove(topPaddingSubscription);
        topPaddingSubscription = binder.bind(heightobservablelayout.observeHeightChange(), new Action1() {

            final RideMap this$0;

            public void call(Integer integer)
            {
                mapOwner.setTopPadding(integer.intValue());
            }

            public volatile void call(Object obj)
            {
                call((Integer)obj);
            }

            
            {
                this$0 = RideMap.this;
                super();
            }
        });
    }

    public void centerMapGestures(boolean flag)
    {
        mapOwner.centerMapGestures(Boolean.valueOf(flag));
    }

    public void centerToCurrentLocation()
    {
        binder.bind(getLastLocationCameraUpdateObservable(), new AsyncCall() {

            final RideMap this$0;

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Location)obj);
            }

            public void onSuccess(Location location)
            {
                mapOwner.centerWithPadding(location, mapOwner.getCameraZoom());
            }

            
            {
                this$0 = RideMap.this;
                super();
            }
        });
    }

    public void centerToCurrentLocation(final float zoom)
    {
        binder.bind(getLastLocationCameraUpdateObservable(), new AsyncCall() {

            final RideMap this$0;
            final float val$zoom;

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Location)obj);
            }

            public void onSuccess(Location location)
            {
                mapOwner.centerWithPadding(location, zoom);
            }

            
            {
                this$0 = RideMap.this;
                zoom = f;
                super();
            }
        });
    }

    public Observable centerToLocationWithZoom(Location location, float f)
    {
        return mapOwner.centerWithPadding(location, f);
    }

    public Observable centerToLocationWithoutPadding(Location location)
    {
        if (location.isNull())
        {
            return Unit.just();
        } else
        {
            return mapOwner.centerWithoutPadding(location, mapOwner.getCameraZoom());
        }
    }

    public void clearAllMarkers()
    {
        mapOwner.removeAllMarkers();
    }

    public void clearDestinationMarker()
    {
        mapOwner.removeMarkers(me/lyft/android/map/lyft/markers/DropoffPinMarker);
    }

    public void clearDriverMarkers()
    {
        mapOwner.removeMarkers(me/lyft/android/map/lyft/markers/DriverMarker);
    }

    public void clearDriverRouteMarkers()
    {
        mapOwner.removeMarkers(me/lyft/android/map/lyft/markers/PickupPinMarker);
        mapOwner.removeMarkers(me/lyft/android/map/lyft/markers/DropoffPinMarker);
        mapOwner.removeMarkers(me/lyft/android/map/lyft/markers/DriverStopMarker);
    }

    public void clearHotspotMarkers()
    {
        mapOwner.removeMarkers(me/lyft/android/map/lyft/markers/HotspotMarker);
    }

    public void clearPickupMarker()
    {
        mapOwner.removeMarkers(me/lyft/android/map/lyft/markers/PickupPinMarker);
    }

    public void clearRoutes()
    {
        displayRoute = false;
        for (Iterator iterator = polylines.iterator(); iterator.hasNext(); ((IPolyline)iterator.next()).remove()) { }
        polylines.clear();
    }

    public void clearShortcutMarkers()
    {
        mapOwner.removeMarkers(me/lyft/android/map/lyft/markers/ShortcutMarker);
    }

    public void detach()
    {
        clearAllMarkers();
        clearRoutes();
        disableTraffic();
        mapOwner.detach();
    }

    public void disableTraffic()
    {
        mapOwner.disableTraffic();
    }

    public void displayLocation()
    {
        mapOwner.displayLocation();
    }

    public void enableTraffic()
    {
        mapOwner.enableTraffic();
    }

    public void fitMapTo(List list)
    {
        mapOwner.centerToBoundsWithPadding(list);
    }

    public transient void fitMapTo(Location alocation[])
    {
        fitMapTo(Arrays.asList(alocation));
    }

    public void fitMapToDriverRoute()
    {
        List list = Iterables.select(routeProvider.getDriverRide().getStopsFromCurrentRoute(), Stop.toLocation());
        Location location = (Location)locationSubject.get();
        if (!location.isNull())
        {
            list.add(location);
        }
        fitMapTo(list);
    }

    public void fitMapToShortcuts(Location location)
    {
        List list = Iterables.select(shortcutService.getShortcuts(), new Func1() {

            final RideMap this$0;

            public volatile Object call(Object obj)
            {
                return call((Shortcut)obj);
            }

            public Location call(Shortcut shortcut)
            {
                return shortcut.getLocation();
            }

            
            {
                this$0 = RideMap.this;
                super();
            }
        });
        mapOwner.zoomOutFrom(location, filterOutFarAwayLocations(location, list));
    }

    public void followCurrentLocation()
    {
        followLocationSubscription.unsubscribe();
        followLocationSubscription = binder.bind(locationSubject, followCurrentLocation);
    }

    public void followLocationAndFitToNextStop()
    {
        followLocationSubscription.unsubscribe();
        followLocationSubscription = binder.bind(locationSubject, followLocationAndFitToNextStop);
    }

    public Location getCameraLocationWithoutPadding()
    {
        return mapOwner.getCameraLocationWithoutPadding();
    }

    public float getZoomLevel()
    {
        return mapOwner.getCameraZoom();
    }

    public void hideLocation()
    {
        mapOwner.hideLocation();
    }

    public Observable observeCameraZoomChanged()
    {
        return mapOwner.observeCameraZoomChanged();
    }

    public Observable observeHotspotClick()
    {
        return mapOwner.observeMarkerClick(me/lyft/android/map/lyft/markers/HotspotMarker).map(Marker.funcToLocation());
    }

    public Observable observeMapDragEnd()
    {
        return mapOwner.observeMapDragEnd().map(new Func1() {

            final RideMap this$0;

            public volatile Object call(Object obj)
            {
                return call((Unit)obj);
            }

            public Location call(Unit unit)
            {
                unit = getSelectableMarkers();
                if (unit.isEmpty())
                {
                    return getCameraLocationWithoutPadding();
                }
                unit = (SelectableMarker)mapOwner.findClosestMarker(getCameraLocationWithoutPadding(), unit);
                if (unit != null)
                {
                    return unit.getLocation();
                } else
                {
                    return getCameraLocationWithoutPadding();
                }
            }

            
            {
                this$0 = RideMap.this;
                super();
            }
        });
    }

    public Observable observeMapDragStart()
    {
        return mapOwner.observeMapDragStart();
    }

    public Observable observeMapLoaded()
    {
        return mapOwner.observeMapLoaded();
    }

    public Observable observeShortcutClick()
    {
        return mapOwner.observeMarkerClick(me/lyft/android/map/lyft/markers/ShortcutMarker).map(Marker.funcToLocation());
    }

    public void refreshDriverMarker()
    {
        final Driver driver = passengerRideProvider.getPassengerRide().getDriver();
        final Location driverLocation = driver.getLocation();
        final RideType rideType = passengerRideProvider.getPassengerRide().getRideType();
        String s = driver.getIcon();
        assetLoadingRequestSubscription.unsubscribe();
        assetLoadingRequestSubscription = binder.bind(assetLoadingService.loadMarkerBitmap(s), new AsyncCall() {

            final RideMap this$0;
            final Driver val$driver;
            final Location val$driverLocation;
            final RideType val$rideType;

            private void updateDriver(BitmapDescriptor bitmapdescriptor)
            {
                ToolTipDriverMarker tooltipdrivermarker = (ToolTipDriverMarker)mapOwner.createMarker(new ToolTipDriverMarkerOptions());
                tooltipdrivermarker.updateIcon(bitmapdescriptor);
                tooltipdrivermarker.setLocation(driverLocation);
                tooltipdrivermarker.setRecentLocations(driver.getRecentLocations());
            }

            public void onFail(Throwable throwable)
            {
                updateDriver(DriverMarkerOptions.resolveNearbyDriverMarker(rideType));
            }

            public void onSuccess(Bitmap bitmap)
            {
                updateDriver(BitmapDescriptorFactory.a(bitmap));
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Bitmap)obj);
            }

            
            {
                this$0 = RideMap.this;
                rideType = ridetype;
                driverLocation = location;
                driver = driver1;
                super();
            }
        });
    }

    public void refreshDriverMarker(final String driverStatus, int i)
    {
        final Driver driver = passengerRideProvider.getPassengerRide().getDriver();
        final Location driverLocation = driver.getLocation();
        final RideType rideType = passengerRideProvider.getPassengerRide().getRideType();
        final String icon = driver.getIcon();
        createRouteLineForPassenger(driverLocation, i);
        assetLoadingRequestSubscription.unsubscribe();
        assetLoadingRequestSubscription = binder.bind(assetLoadingService.loadMarkerBitmap(icon), new AsyncCall() {

            final RideMap this$0;
            final Driver val$driver;
            final Location val$driverLocation;
            final String val$driverStatus;
            final String val$icon;
            final RideType val$rideType;

            private void updateDriver(String s, BitmapDescriptor bitmapdescriptor)
            {
                ToolTipDriverMarker tooltipdrivermarker = (ToolTipDriverMarker)mapOwner.createMarker(new ToolTipDriverMarkerOptions());
                tooltipdrivermarker.updateIcon(s, bitmapdescriptor);
                tooltipdrivermarker.setLocation(driverLocation);
                tooltipdrivermarker.setRecentLocations(driver.getRecentLocations());
                tooltipdrivermarker.setText(driverStatus);
            }

            public void onFail(Throwable throwable)
            {
                throwable = DriverMarkerOptions.resolveNearbyDriverMarker(rideType);
                updateDriver(rideType.getType(), throwable);
            }

            public void onSuccess(Bitmap bitmap)
            {
                bitmap = BitmapDescriptorFactory.a(bitmap);
                updateDriver(icon, bitmap);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Bitmap)obj);
            }

            
            {
                this$0 = RideMap.this;
                icon = s;
                rideType = ridetype;
                driverLocation = location;
                driver = driver1;
                driverStatus = s1;
                super();
            }
        });
    }

    public void refreshNearbyDriversMarkers(final RequestRideType currentRideType)
    {
        final List drivers = currentRideType.getDrivers();
        String s = constantsProvider.getRideTypeMetaById(currentRideType.getId()).getMap().getIconFile();
        if (drivers.isEmpty())
        {
            clearDriverMarkers();
        }
        assetLoadingRequestSubscription.unsubscribe();
        assetLoadingRequestSubscription = binder.bind(assetLoadingService.loadMarkerBitmap(s), new AsyncCall() {

            final RideMap this$0;
            final RequestRideType val$currentRideType;
            final List val$drivers;

            private void updateNearbyDriverMarkers(BitmapDescriptor bitmapdescriptor)
            {
                Object obj = new ArrayList(drivers.size());
                for (Iterator iterator = drivers.iterator(); iterator.hasNext(); ((List) (obj)).add(new NearbyDriverMarkerOptions(((NearbyDriver)iterator.next()).getId()))) { }
                obj = mapOwner.createMarkers(((List) (obj)));
                Iterator iterator1 = drivers.iterator();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    NearbyDriver nearbydriver = (NearbyDriver)iterator1.next();
                    if (((Map) (obj)).containsKey(nearbydriver.getId()))
                    {
                        DriverMarker drivermarker = (DriverMarker)((Map) (obj)).get(nearbydriver.getId());
                        drivermarker.updateIcon(bitmapdescriptor);
                        drivermarker.setLocation(nearbydriver.getLocation());
                        drivermarker.setRecentLocations(nearbydriver.getRecentLocations());
                    }
                } while (true);
            }

            public void onFail(Throwable throwable)
            {
                updateNearbyDriverMarkers(DriverMarkerOptions.resolveNearbyDriverMarker(currentRideType.getRideType()));
            }

            public void onSuccess(Bitmap bitmap)
            {
                updateNearbyDriverMarkers(BitmapDescriptorFactory.a(bitmap));
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Bitmap)obj);
            }

            
            {
                this$0 = RideMap.this;
                currentRideType = requestridetype;
                drivers = list;
                super();
            }
        });
    }

    public void removeTileOverlay()
    {
        tileOverlay.remove();
        tileOverlay.clearTileCache();
        tileOverlay = NullTileOverlay.getInstance();
    }

    public void reset()
    {
        directionsRequestSubscription.unsubscribe();
        followLocationSubscription.unsubscribe();
        assetLoadingRequestSubscription.unsubscribe();
    }

    public void restoreZoom(float f)
    {
        mapOwner.setZoom(f);
    }

    public void setBottomPadding(int i)
    {
        mapOwner.setBottomPadding(i);
    }

    public void setGesturesEnabled(boolean flag)
    {
        mapOwner.setGesturesEnabled(Boolean.valueOf(flag));
    }

    public void setTopPadding(int i)
    {
        mapOwner.setTopPadding(i);
    }

    public void showCourierRouteMarkers(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); arraylist.add(new RouteMarkerOptions((Stop)list.next()))) { }
        mapOwner.createMarkers(arraylist);
    }

    public void showDestinationMarker(Location location)
    {
        if (location.isNull())
        {
            return;
        } else
        {
            PinMarker pinmarker = (PinMarker)mapOwner.createMarker(new DropoffMarkerOptions());
            pinmarker.setLocation(location);
            pinmarker.makeFill();
            return;
        }
    }

    public void showDriverDirections(Location location, final int currentLegColor, final int otherLegColor)
    {
        directionsRequestSubscription.unsubscribe();
        displayRoute = true;
        clearDriverRouteMarkers();
        showDriverRouteMarkers();
        List list = Iterables.select(routeProvider.getDriverRide().getIncompleteStops(), Stop.toLocation());
        directionsRequestSubscription = binder.bind(geoService.directionsWithDriverLocation(routeProvider.getDriverRide().getCurrentRideId(), location, list), new AsyncCall() {

            final RideMap this$0;
            final int val$currentLegColor;
            final int val$otherLegColor;

            public volatile void onSuccess(Object obj)
            {
                onSuccess((List)obj);
            }

            public void onSuccess(List list1)
            {
                clearRoutes();
                Leg leg = (Leg)Iterables.firstOrDefault(list1);
                drawRoute(currentLegColor, Collections.singletonList(leg), 5);
                list1 = Iterables.skip(list1, 1);
                drawRoute(otherLegColor, list1, 5);
            }

            
            {
                this$0 = RideMap.this;
                currentLegColor = i;
                otherLegColor = j;
                super();
            }
        });
    }

    public void showDriverDirections(Location location, Location location1, final int color)
    {
        directionsRequestSubscription.unsubscribe();
        displayRoute = true;
        directionsRequestSubscription = binder.bind(geoService.directions(routeProvider.getDriverRide().getCurrentRideId(), new Location[] {
            location, location1
        }).filter(new Func1() {

            final RideMap this$0;

            public Boolean call(List list)
            {
                return Boolean.valueOf(displayRoute);
            }

            public volatile Object call(Object obj)
            {
                return call((List)obj);
            }

            
            {
                this$0 = RideMap.this;
                super();
            }
        }), new AsyncCall() {

            final RideMap this$0;
            final int val$color;

            public void onFail(Throwable throwable)
            {
                defaultErrorHandler.handle(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((List)obj);
            }

            public void onSuccess(List list)
            {
                clearRoutes();
                drawRoute(color, list, 5);
            }

            
            {
                this$0 = RideMap.this;
                color = i;
                super();
            }
        });
    }

    public void showHotspotMarkers(Location location, List list)
    {
        list = filterOutFarAwayLocations(location, list);
        location = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); location.add(new HotspotMarkerOptions((Location)list.next()))) { }
        mapOwner.createMarkers(location);
    }

    public void showPickupMarker(Location location)
    {
        if (location.isNull())
        {
            return;
        } else
        {
            PinMarker pinmarker = (PinMarker)mapOwner.createMarker(new PickupMarkerOptions());
            pinmarker.setLocation(location);
            pinmarker.makeFill();
            return;
        }
    }

    public void showShortcuts()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = shortcutService.getShortcuts().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Shortcut shortcut = (Shortcut)iterator.next();
            if (!shortcut.getLocation().isNull())
            {
                arraylist.add(new ShortcutMarkerOptions(shortcut));
            }
        } while (true);
        mapOwner.createMarkers(arraylist);
    }

    public void showTransparentDestinationMarker(Location location)
    {
        if (location.isNull())
        {
            return;
        } else
        {
            PinMarker pinmarker = (PinMarker)mapOwner.createMarker(new DropoffMarkerOptions());
            pinmarker.setLocation(location);
            pinmarker.makeTransparent();
            return;
        }
    }

    public void showTransparentPickupMarker(Location location)
    {
        if (location.isNull())
        {
            return;
        } else
        {
            PinMarker pinmarker = (PinMarker)mapOwner.createMarker(new PickupMarkerOptions());
            pinmarker.setLocation(location);
            pinmarker.makeTransparent();
            return;
        }
    }

    public void unfollowCurrentLocation()
    {
        followLocationSubscription.unsubscribe();
    }








}
