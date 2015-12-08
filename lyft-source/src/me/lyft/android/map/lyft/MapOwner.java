// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.lyft;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import me.lyft.android.common.INullable;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import me.lyft.android.map.core.IMap;
import me.lyft.android.map.core.MapInfoWindowView;
import me.lyft.android.map.core.NullMap;
import me.lyft.android.map.core.camera.IMapPosition;
import me.lyft.android.map.core.camera.MapBound;
import me.lyft.android.map.core.camera.MapPosition;
import me.lyft.android.map.core.markers.MarkerOptions;
import me.lyft.android.map.core.polyline.IPolyline;
import me.lyft.android.map.core.polyline.IPolylineOptions;
import me.lyft.android.map.core.projection.IProjection;
import me.lyft.android.map.core.tileoverlay.ITileOverlay;
import me.lyft.android.map.core.tileoverlay.TileOverlayOptions;
import me.lyft.android.map.googlemap.projection.GoogleMapProjection;
import me.lyft.android.map.lyft.markers.Marker;
import me.lyft.android.rx.Binder;
import me.lyft.android.utils.MetricsUtils;
import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.subjects.BehaviorSubject;
import rx.subscriptions.Subscriptions;

// Referenced classes of package me.lyft.android.map.lyft:
//            LyftMapView, MarkerBank, MarkerClickManager

public class MapOwner
{

    public static final float DEFAULT_ZOOM_LEVEL = 12F;
    public static final int FIT_ZOOM_PADDING = 60;
    private static final double MARKER_SNAPPING_THRESHOLD = 50D;
    private Subscription animateCameraSubscription;
    private final AtomicBoolean initialCameraMove = new AtomicBoolean(true);
    private IMap map;
    private final BehaviorSubject mapLoadedSubject = BehaviorSubject.create();
    private ViewGroup mapPlaceholder;
    private final LyftMapView mapView;
    private final MarkerBank markerBank;
    private final MarkerClickManager markerClickManager;
    private final MetricsUtils metricsUtils;
    final Func1 onMarkerClicked = new Func1() {

        final MapOwner this$0;

        public Boolean call(String s)
        {
            return Boolean.valueOf(markerClickManager.onMarkerClick(s));
        }

        public volatile Object call(Object obj)
        {
            return call((String)obj);
        }

            
            {
                this$0 = MapOwner.this;
                super();
            }
    };

    public MapOwner(LyftMapView lyftmapview, MarkerBank markerbank, MarkerClickManager markerclickmanager)
    {
        map = NullMap.getInstance();
        animateCameraSubscription = Subscriptions.empty();
        mapView = lyftmapview;
        markerBank = markerbank;
        markerClickManager = markerclickmanager;
        metricsUtils = MetricsUtils.fromView(lyftmapview);
    }

    private Location calculateShortcutsGeoDiff(double d, double d1, List list)
    {
        list = list.iterator();
        double d2 = 0.0D;
        double d3 = 0.0D;
        while (list.hasNext()) 
        {
            Location location = (Location)list.next();
            d3 = Math.max(d3, Math.abs(d - location.getLat().doubleValue()));
            d2 = Math.max(d2, Math.abs(d1 - location.getLng().doubleValue()));
        }
        return new Location(d3, d2);
    }

    private Observable center(Location location, float f)
    {
        if (initialCameraMove.getAndSet(false))
        {
            map.moveCamera(getMapPosition(location, f));
            return Unit.just();
        } else
        {
            return map.animateCamera(getMapPosition(location, f));
        }
    }

    private MapPosition getMapPosition(Location location, float f)
    {
        return new MapPosition(location, f, 0.0F, 0.0F);
    }

    private void setupMap(IMap imap)
    {
        map = imap;
        map.initialize();
        map.setOnMarkerClickListener(onMarkerClicked);
        map.setInfoWindowView(new MapInfoWindowView(mapPlaceholder.getContext()));
        mapLoadedSubject.onNext(map);
    }

    public IPolyline addPolyline(IPolylineOptions ipolylineoptions)
    {
        return map.addPolyline(ipolylineoptions);
    }

    public ITileOverlay addTileOverlay(TileOverlayOptions tileoverlayoptions)
    {
        return map.addTileOverlay(tileoverlayoptions);
    }

    public void attach(ViewGroup viewgroup)
    {
        mapPlaceholder = viewgroup;
        mapPlaceholder.removeAllViews();
        mapPlaceholder.addView(mapView, 0);
        mapView.setEnabled(true);
        Binder.attach(viewgroup).bind(mapView.observeGoogleMapLoaded(), new Action1() {

            final MapOwner this$0;

            public volatile void call(Object obj)
            {
                call((IMap)obj);
            }

            public void call(IMap imap)
            {
                setupMap(imap);
            }

            
            {
                this$0 = MapOwner.this;
                super();
            }
        });
    }

    public void centerMapGestures(Boolean boolean1)
    {
        mapView.setCenterMapGestures(boolean1.booleanValue());
    }

    public void centerToBoundsWithPadding(List list)
    {
        animateCameraSubscription.unsubscribe();
        animateCameraSubscription = mapView.animateToBounds(list, metricsUtils.dpToPixels(60F)).flatMap(new Func1() {

            final MapOwner this$0;

            public volatile Object call(Object obj)
            {
                return call((MapBound)obj);
            }

            public Observable call(MapBound mapbound)
            {
                return map.animateCamera(mapbound);
            }

            
            {
                this$0 = MapOwner.this;
                super();
            }
        }).subscribe();
    }

    public Observable centerWithPadding(Location location, float f)
    {
        animateCameraSubscription.unsubscribe();
        location = center(location, f);
        animateCameraSubscription = location.subscribe();
        return location;
    }

    public Observable centerWithoutPadding(Location location, float f)
    {
        animateCameraSubscription.unsubscribe();
        map.clearPadding();
        location = center(location, f).doOnUnsubscribe(new Action0() {

            final MapOwner this$0;

            public void call()
            {
                map.reapplyPadding();
            }

            
            {
                this$0 = MapOwner.this;
                super();
            }
        });
        animateCameraSubscription = location.subscribe();
        return location;
    }

    public Marker createMarker(MarkerOptions markeroptions)
    {
        return markerBank.createMarker(map, markeroptions);
    }

    public Map createMarkers(List list)
    {
        return markerBank.createMarkers(map, list);
    }

    public void detach()
    {
        animateCameraSubscription.unsubscribe();
        mapPlaceholder.removeAllViews();
        map.detach();
        map = NullMap.getInstance();
        mapLoadedSubject.onNext(map);
    }

    public void disableTraffic()
    {
        map.disableTraffic();
    }

    public void displayLocation()
    {
        map.displayLocation();
    }

    public void enableTraffic()
    {
        map.enableTraffic();
    }

    public Marker findClosestMarker(Location location, List list)
    {
        android.graphics.Point point = map.getProjection().toScreenLocation(location);
        double d = 1.7976931348623157E+308D;
        location = null;
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            list = (Marker)iterator.next();
            Location location1 = list.getLocation();
            double d1 = GoogleMapProjection.distanceBetween(point, map.getProjection().toScreenLocation(location1));
            if (d1 < 50D && d1 < d)
            {
                d = d1;
                location = list;
            }
        } while (true);
        return location;
    }

    public Location getCameraLocationWithoutPadding()
    {
        map.clearPadding();
        Location location = map.getMapPosition().getLocation();
        map.reapplyPadding();
        return location;
    }

    public float getCameraZoom()
    {
        return map.getMapPosition().getZoom();
    }

    public MetricsUtils getMetricsUtils()
    {
        return metricsUtils;
    }

    public void hideLocation()
    {
        map.hideLocation();
    }

    public Observable observeCameraPositionChanged()
    {
        return mapView.observeCameraPositionChanged();
    }

    public Observable observeCameraZoomChanged()
    {
        return mapView.observeCameraPositionChanged().map(new Func1() {

            final MapOwner this$0;

            public Float call(Unit unit)
            {
                return Float.valueOf(map.getMapPosition().getZoom());
            }

            public volatile Object call(Object obj)
            {
                return call((Unit)obj);
            }

            
            {
                this$0 = MapOwner.this;
                super();
            }
        });
    }

    public Observable observeMapDragEnd()
    {
        return mapView.observeMapDragEnd().observeOn(AndroidSchedulers.mainThread());
    }

    public Observable observeMapDragStart()
    {
        return mapView.observeMapDragStart();
    }

    public Observable observeMapLoaded()
    {
        return mapLoadedSubject.first(INullable.FILTER_NON_NULL).map(Unit.func1()).asObservable();
    }

    public Observable observeMarkerClick(Class class1)
    {
        return markerClickManager.observeMarkerClick(class1);
    }

    public Map obtainMarkersByType(Class class1)
    {
        return markerBank.getMarkersByType(class1);
    }

    public void removeAllMarkers()
    {
        markerBank.removeAll();
    }

    public void removeMarkers(Class class1)
    {
        markerBank.remove(class1);
    }

    public void setBottomPadding(int i)
    {
        map.setBottomPadding(i);
        map.reapplyPadding();
    }

    public void setGesturesEnabled(Boolean boolean1)
    {
        map.setGesturesEnabled(boolean1);
    }

    public void setTopPadding(int i)
    {
        map.setTopPadding(i);
        map.reapplyPadding();
    }

    public void setZoom(float f)
    {
        Object obj = map.getMapPosition();
        obj = new MapPosition(((IMapPosition) (obj)).getLocation(), f, ((IMapPosition) (obj)).getTilt(), ((IMapPosition) (obj)).getBearing());
        map.moveCamera(((MapPosition) (obj)));
    }

    public void zoomOutFrom(Location location, List list)
    {
        if (list.isEmpty())
        {
            centerWithPadding(location, 12F);
            return;
        } else
        {
            list = calculateShortcutsGeoDiff(location.getLat().doubleValue(), location.getLng().doubleValue(), list);
            ArrayList arraylist = new ArrayList();
            arraylist.add(new Location(location.getLat().doubleValue() - list.getLat().doubleValue(), location.getLng().doubleValue() - list.getLng().doubleValue()));
            arraylist.add(new Location(location.getLat().doubleValue() + list.getLat().doubleValue(), location.getLng().doubleValue() - list.getLng().doubleValue()));
            arraylist.add(new Location(location.getLat().doubleValue() + list.getLat().doubleValue(), location.getLng().doubleValue() + list.getLng().doubleValue()));
            arraylist.add(new Location(location.getLat().doubleValue() - list.getLat().doubleValue(), location.getLng().doubleValue() + list.getLng().doubleValue()));
            centerToBoundsWithPadding(arraylist);
            return;
        }
    }



}
