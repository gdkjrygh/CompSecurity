// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.googlemap;

import android.view.View;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.UrlTileProvider;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.common.Iterables;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import me.lyft.android.infrastructure.location.GoogleLocationMapper;
import me.lyft.android.logging.L;
import me.lyft.android.map.core.IMap;
import me.lyft.android.map.core.MapInfoWindowView;
import me.lyft.android.map.core.camera.IMapBound;
import me.lyft.android.map.core.camera.IMapPosition;
import me.lyft.android.map.core.camera.MapPosition;
import me.lyft.android.map.core.markers.IMarker;
import me.lyft.android.map.core.markers.IMarkerOptions;
import me.lyft.android.map.core.polyline.IPolyline;
import me.lyft.android.map.core.polyline.IPolylineOptions;
import me.lyft.android.map.core.projection.IProjection;
import me.lyft.android.map.core.tileoverlay.ITileOverlay;
import me.lyft.android.map.core.tileoverlay.ITileOverlayOptions;
import me.lyft.android.map.core.tileoverlay.ITileProvider;
import me.lyft.android.map.googlemap.marker.GoogleMarker;
import me.lyft.android.map.googlemap.polyline.GooglePolyline;
import me.lyft.android.map.googlemap.projection.GoogleMapProjection;
import me.lyft.android.map.googlemap.tileoverlay.GoogleTileOverlay;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.subjects.BehaviorSubject;

public class GooglePlayMap
    implements IMap
{

    private static final Integer DEFAULT_ANIMATION_SPEED = Integer.valueOf(300);
    private static final CameraPosition NULL_CAMERA_POSITION = new CameraPosition(new LatLng(0.0D, 0.0D), 0.0F, 0.0F, 0.0F);
    private int bottomPadding;
    private final GoogleMap googleMap;
    private int topPadding;

    public GooglePlayMap(GoogleMap googlemap)
    {
        topPadding = 0;
        bottomPadding = 0;
        googleMap = googlemap;
    }

    private Observable animateCamera(CameraUpdate cameraupdate)
    {
        final BehaviorSubject animateCameraSubject = BehaviorSubject.create();
        try
        {
            googleMap.a(cameraupdate, DEFAULT_ANIMATION_SPEED.intValue(), new com.google.android.gms.maps.GoogleMap.CancelableCallback() {

                final GooglePlayMap this$0;
                final BehaviorSubject val$animateCameraSubject;

                public void onCancel()
                {
                    animateCameraSubject.onNext(Unit.create());
                }

                public void onFinish()
                {
                    animateCameraSubject.onNext(Unit.create());
                }

            
            {
                this$0 = GooglePlayMap.this;
                animateCameraSubject = behaviorsubject;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (CameraUpdate cameraupdate)
        {
            L.e(cameraupdate, cameraupdate.getMessage(), new Object[0]);
            animateCameraSubject.onNext(Unit.create());
        }
        return animateCameraSubject.first().asObservable();
    }

    private CameraUpdate getCameraUpdate(IMapPosition imapposition)
    {
        Location location = imapposition.getLocation();
        return CameraUpdateFactory.a(new CameraPosition(new LatLng(location.getLat().doubleValue(), location.getLng().doubleValue()), imapposition.getZoom(), imapposition.getTilt(), imapposition.getBearing()));
    }

    public IMarker addMarker(IMarkerOptions imarkeroptions)
    {
        MarkerOptions markeroptions = new MarkerOptions();
        markeroptions.a(imarkeroptions.getRotation());
        markeroptions.a(imarkeroptions.getXOffset(), imarkeroptions.getYOffset());
        markeroptions.a(imarkeroptions.getIcon());
        markeroptions.a(new LatLng(imarkeroptions.getLocation().getLat().doubleValue(), imarkeroptions.getLocation().getLng().doubleValue()));
        return new GoogleMarker(googleMap.a(markeroptions));
    }

    public IPolyline addPolyline(IPolylineOptions ipolylineoptions)
    {
        PolylineOptions polylineoptions = new PolylineOptions();
        polylineoptions.a(Iterables.select(ipolylineoptions.getLocations(), new Func1() {

            final GooglePlayMap this$0;

            public LatLng call(Location location)
            {
                return new LatLng(location.getLat().doubleValue(), location.getLng().doubleValue());
            }

            public volatile Object call(Object obj)
            {
                return call((Location)obj);
            }

            
            {
                this$0 = GooglePlayMap.this;
                super();
            }
        }));
        polylineoptions.a(ipolylineoptions.getColor());
        polylineoptions.a(ipolylineoptions.getWidth());
        return new GooglePolyline(googleMap.a(polylineoptions));
    }

    public ITileOverlay addTileOverlay(ITileOverlayOptions itileoverlayoptions)
    {
        TileOverlayOptions tileoverlayoptions = new TileOverlayOptions();
        ITileProvider itileprovider = itileoverlayoptions.getProvider();
        tileoverlayoptions.a(new UrlTileProvider(itileprovider.getHeight(), itileprovider) {

            final GooglePlayMap this$0;
            final ITileProvider val$provider;

            public URL getTileUrl(int i, int j, int k)
            {
                return provider.getTileUrl(i, j, k);
            }

            
            {
                this$0 = GooglePlayMap.this;
                provider = itileprovider;
                super(final_i, j);
            }
        });
        tileoverlayoptions.a(itileoverlayoptions.getZIndex());
        tileoverlayoptions.a(itileoverlayoptions.isFadeIn());
        return new GoogleTileOverlay(googleMap.a(tileoverlayoptions));
    }

    public Observable animateCamera(IMapBound imapbound)
    {
        com.google.android.gms.maps.model.LatLngBounds.Builder builder = new com.google.android.gms.maps.model.LatLngBounds.Builder();
        Iterator iterator = imapbound.getLocationList().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Location location = (Location)iterator.next();
            if (!location.isNull())
            {
                builder.a(GoogleLocationMapper.toMapLatLng(location));
            }
        } while (true);
        return animateCamera(CameraUpdateFactory.a(builder.a(), imapbound.getWidth(), imapbound.getHeight(), imapbound.getPadding()));
    }

    public Observable animateCamera(IMapPosition imapposition)
    {
        return animateCamera(getCameraUpdate(imapposition));
    }

    public void clearPadding()
    {
        googleMap.a(0, 0, 0, 0);
    }

    public void detach()
    {
        googleMap.c(false);
        googleMap.a(null);
        googleMap.a(null);
        googleMap.b();
    }

    public void disableTraffic()
    {
        googleMap.a(false);
    }

    public void displayLocation()
    {
        googleMap.c(true);
    }

    public void enableTraffic()
    {
        googleMap.a(true);
    }

    public volatile IMapPosition getMapPosition()
    {
        return getMapPosition();
    }

    public MapPosition getMapPosition()
    {
        CameraPosition cameraposition = (CameraPosition)Objects.firstNonNull(googleMap.a(), NULL_CAMERA_POSITION);
        LatLng latlng = cameraposition.a;
        return new MapPosition(new Location(latlng.a, latlng.b), cameraposition.b, cameraposition.c, cameraposition.d);
    }

    public IProjection getProjection()
    {
        return new GoogleMapProjection(googleMap.d());
    }

    public void hideLocation()
    {
        googleMap.c(false);
    }

    public void initialize()
    {
        googleMap.c(true);
        googleMap.c().h(false);
        googleMap.c().a(false);
        googleMap.c().c(false);
        googleMap.c().b(false);
        googleMap.c().f(false);
        googleMap.c().g(false);
        googleMap.b(false);
    }

    public boolean isNull()
    {
        return false;
    }

    public void moveCamera(MapPosition mapposition)
    {
        mapposition = getCameraUpdate(mapposition);
        try
        {
            googleMap.a(mapposition);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MapPosition mapposition)
        {
            L.e(mapposition, mapposition.getMessage(), new Object[0]);
        }
    }

    public void reapplyPadding()
    {
        googleMap.a(0, topPadding, 0, bottomPadding);
    }

    public void setBottomPadding(int i)
    {
        bottomPadding = i;
    }

    public void setGesturesEnabled(Boolean boolean1)
    {
        UiSettings uisettings = googleMap.c();
        uisettings.d(boolean1.booleanValue());
        uisettings.e(boolean1.booleanValue());
    }

    public void setInfoWindowView(final MapInfoWindowView infoWindowView)
    {
        googleMap.a(new com.google.android.gms.maps.GoogleMap.InfoWindowAdapter() {

            final GooglePlayMap this$0;
            final MapInfoWindowView val$infoWindowView;

            public View getInfoContents(Marker marker)
            {
                return null;
            }

            public View getInfoWindow(Marker marker)
            {
                marker = marker.c();
                infoWindowView.setText(marker);
                if (!Strings.isNullOrEmpty(marker))
                {
                    return infoWindowView;
                } else
                {
                    return null;
                }
            }

            
            {
                this$0 = GooglePlayMap.this;
                infoWindowView = mapinfowindowview;
                super();
            }
        });
    }

    public void setOnCameraChangeListener(final Action1 cameraChangeCallback)
    {
        googleMap.a(new com.google.android.gms.maps.GoogleMap.OnCameraChangeListener() {

            final GooglePlayMap this$0;
            final Action1 val$cameraChangeCallback;

            public void onCameraChange(CameraPosition cameraposition)
            {
                cameraChangeCallback.call(Unit.create());
            }

            
            {
                this$0 = GooglePlayMap.this;
                cameraChangeCallback = action1;
                super();
            }
        });
    }

    public void setOnMarkerClickListener(final Func1 onMarkerClicked)
    {
        googleMap.a(new com.google.android.gms.maps.GoogleMap.OnMarkerClickListener() {

            final GooglePlayMap this$0;
            final Func1 val$onMarkerClicked;

            public boolean onMarkerClick(Marker marker)
            {
                return ((Boolean)onMarkerClicked.call(marker.b())).booleanValue();
            }

            
            {
                this$0 = GooglePlayMap.this;
                onMarkerClicked = func1;
                super();
            }
        });
    }

    public void setTopPadding(int i)
    {
        topPadding = i;
    }

}
