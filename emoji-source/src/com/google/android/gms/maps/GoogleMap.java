// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.internal.hm;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.h;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.IndoorBuilding;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.internal.d;
import com.google.android.gms.maps.model.internal.f;

// Referenced classes of package com.google.android.gms.maps:
//            CameraUpdate, Projection, UiSettings, LocationSource

public final class GoogleMap
{
    public static interface CancelableCallback
    {

        public abstract void onCancel();

        public abstract void onFinish();
    }

    public static interface InfoWindowAdapter
    {

        public abstract View getInfoContents(Marker marker);

        public abstract View getInfoWindow(Marker marker);
    }

    public static interface OnCameraChangeListener
    {

        public abstract void onCameraChange(CameraPosition cameraposition);
    }

    public static interface OnIndoorStateChangeListener
    {

        public abstract void onIndoorBuildingFocused();

        public abstract void onIndoorLevelActivated(IndoorBuilding indoorbuilding);
    }

    public static interface OnInfoWindowClickListener
    {

        public abstract void onInfoWindowClick(Marker marker);
    }

    public static interface OnMapClickListener
    {

        public abstract void onMapClick(LatLng latlng);
    }

    public static interface OnMapLoadedCallback
    {

        public abstract void onMapLoaded();
    }

    public static interface OnMapLongClickListener
    {

        public abstract void onMapLongClick(LatLng latlng);
    }

    public static interface OnMarkerClickListener
    {

        public abstract boolean onMarkerClick(Marker marker);
    }

    public static interface OnMarkerDragListener
    {

        public abstract void onMarkerDrag(Marker marker);

        public abstract void onMarkerDragEnd(Marker marker);

        public abstract void onMarkerDragStart(Marker marker);
    }

    public static interface OnMyLocationButtonClickListener
    {

        public abstract boolean onMyLocationButtonClick();
    }

    public static interface OnMyLocationChangeListener
    {

        public abstract void onMyLocationChange(Location location);
    }

    public static interface SnapshotReadyCallback
    {

        public abstract void onSnapshotReady(Bitmap bitmap);
    }

    private static final class a extends com.google.android.gms.maps.internal.b.a
    {

        private final CancelableCallback Zr;

        public void onCancel()
        {
            Zr.onCancel();
        }

        public void onFinish()
        {
            Zr.onFinish();
        }

        a(CancelableCallback cancelablecallback)
        {
            Zr = cancelablecallback;
        }
    }


    public static final int MAP_TYPE_HYBRID = 4;
    public static final int MAP_TYPE_NONE = 0;
    public static final int MAP_TYPE_NORMAL = 1;
    public static final int MAP_TYPE_SATELLITE = 2;
    public static final int MAP_TYPE_TERRAIN = 3;
    private final IGoogleMapDelegate YZ;
    private UiSettings Za;

    protected GoogleMap(IGoogleMapDelegate igooglemapdelegate)
    {
        YZ = (IGoogleMapDelegate)hm.f(igooglemapdelegate);
    }

    public final Circle addCircle(CircleOptions circleoptions)
    {
        try
        {
            circleoptions = new Circle(YZ.addCircle(circleoptions));
        }
        // Misplaced declaration of an exception variable
        catch (CircleOptions circleoptions)
        {
            throw new RuntimeRemoteException(circleoptions);
        }
        return circleoptions;
    }

    public final GroundOverlay addGroundOverlay(GroundOverlayOptions groundoverlayoptions)
    {
        try
        {
            groundoverlayoptions = YZ.addGroundOverlay(groundoverlayoptions);
        }
        // Misplaced declaration of an exception variable
        catch (GroundOverlayOptions groundoverlayoptions)
        {
            throw new RuntimeRemoteException(groundoverlayoptions);
        }
        if (groundoverlayoptions == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        groundoverlayoptions = new GroundOverlay(groundoverlayoptions);
        return groundoverlayoptions;
        return null;
    }

    public final Marker addMarker(MarkerOptions markeroptions)
    {
        try
        {
            markeroptions = YZ.addMarker(markeroptions);
        }
        // Misplaced declaration of an exception variable
        catch (MarkerOptions markeroptions)
        {
            throw new RuntimeRemoteException(markeroptions);
        }
        if (markeroptions == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        markeroptions = new Marker(markeroptions);
        return markeroptions;
        return null;
    }

    public final Polygon addPolygon(PolygonOptions polygonoptions)
    {
        try
        {
            polygonoptions = new Polygon(YZ.addPolygon(polygonoptions));
        }
        // Misplaced declaration of an exception variable
        catch (PolygonOptions polygonoptions)
        {
            throw new RuntimeRemoteException(polygonoptions);
        }
        return polygonoptions;
    }

    public final Polyline addPolyline(PolylineOptions polylineoptions)
    {
        try
        {
            polylineoptions = new Polyline(YZ.addPolyline(polylineoptions));
        }
        // Misplaced declaration of an exception variable
        catch (PolylineOptions polylineoptions)
        {
            throw new RuntimeRemoteException(polylineoptions);
        }
        return polylineoptions;
    }

    public final TileOverlay addTileOverlay(TileOverlayOptions tileoverlayoptions)
    {
        try
        {
            tileoverlayoptions = YZ.addTileOverlay(tileoverlayoptions);
        }
        // Misplaced declaration of an exception variable
        catch (TileOverlayOptions tileoverlayoptions)
        {
            throw new RuntimeRemoteException(tileoverlayoptions);
        }
        if (tileoverlayoptions == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        tileoverlayoptions = new TileOverlay(tileoverlayoptions);
        return tileoverlayoptions;
        return null;
    }

    public final void animateCamera(CameraUpdate cameraupdate)
    {
        try
        {
            YZ.animateCamera(cameraupdate.jn());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CameraUpdate cameraupdate)
        {
            throw new RuntimeRemoteException(cameraupdate);
        }
    }

    public final void animateCamera(CameraUpdate cameraupdate, int i, CancelableCallback cancelablecallback)
    {
        IGoogleMapDelegate igooglemapdelegate;
        com.google.android.gms.dynamic.d d;
        try
        {
            igooglemapdelegate = YZ;
            d = cameraupdate.jn();
        }
        // Misplaced declaration of an exception variable
        catch (CameraUpdate cameraupdate)
        {
            throw new RuntimeRemoteException(cameraupdate);
        }
        if (cancelablecallback != null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        cameraupdate = null;
        igooglemapdelegate.animateCameraWithDurationAndCallback(d, i, cameraupdate);
        return;
        cameraupdate = new a(cancelablecallback);
        break MISSING_BLOCK_LABEL_18;
    }

    public final void animateCamera(CameraUpdate cameraupdate, CancelableCallback cancelablecallback)
    {
        IGoogleMapDelegate igooglemapdelegate;
        com.google.android.gms.dynamic.d d;
        try
        {
            igooglemapdelegate = YZ;
            d = cameraupdate.jn();
        }
        // Misplaced declaration of an exception variable
        catch (CameraUpdate cameraupdate)
        {
            throw new RuntimeRemoteException(cameraupdate);
        }
        if (cancelablecallback != null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        cameraupdate = null;
        igooglemapdelegate.animateCameraWithCallback(d, cameraupdate);
        return;
        cameraupdate = new a(cancelablecallback);
        break MISSING_BLOCK_LABEL_17;
    }

    public final void clear()
    {
        try
        {
            YZ.clear();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final CameraPosition getCameraPosition()
    {
        CameraPosition cameraposition;
        try
        {
            cameraposition = YZ.getCameraPosition();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return cameraposition;
    }

    public IndoorBuilding getFocusedBuilding()
    {
        Object obj;
        try
        {
            obj = YZ.getFocusedBuilding();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        obj = new IndoorBuilding(((d) (obj)));
        return ((IndoorBuilding) (obj));
        return null;
    }

    public final int getMapType()
    {
        int i;
        try
        {
            i = YZ.getMapType();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }

    public final float getMaxZoomLevel()
    {
        float f;
        try
        {
            f = YZ.getMaxZoomLevel();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return f;
    }

    public final float getMinZoomLevel()
    {
        float f;
        try
        {
            f = YZ.getMinZoomLevel();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return f;
    }

    public final Location getMyLocation()
    {
        Location location;
        try
        {
            location = YZ.getMyLocation();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return location;
    }

    public final Projection getProjection()
    {
        Projection projection;
        try
        {
            projection = new Projection(YZ.getProjection());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return projection;
    }

    public final UiSettings getUiSettings()
    {
        UiSettings uisettings;
        try
        {
            if (Za == null)
            {
                Za = new UiSettings(YZ.getUiSettings());
            }
            uisettings = Za;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return uisettings;
    }

    public final boolean isBuildingsEnabled()
    {
        boolean flag;
        try
        {
            flag = YZ.isBuildingsEnabled();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public final boolean isIndoorEnabled()
    {
        boolean flag;
        try
        {
            flag = YZ.isIndoorEnabled();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public final boolean isMyLocationEnabled()
    {
        boolean flag;
        try
        {
            flag = YZ.isMyLocationEnabled();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public final boolean isTrafficEnabled()
    {
        boolean flag;
        try
        {
            flag = YZ.isTrafficEnabled();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    IGoogleMapDelegate jp()
    {
        return YZ;
    }

    public final void moveCamera(CameraUpdate cameraupdate)
    {
        try
        {
            YZ.moveCamera(cameraupdate.jn());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CameraUpdate cameraupdate)
        {
            throw new RuntimeRemoteException(cameraupdate);
        }
    }

    public final void setBuildingsEnabled(boolean flag)
    {
        try
        {
            YZ.setBuildingsEnabled(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final boolean setIndoorEnabled(boolean flag)
    {
        try
        {
            flag = YZ.setIndoorEnabled(flag);
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public final void setInfoWindowAdapter(InfoWindowAdapter infowindowadapter)
    {
        if (infowindowadapter == null)
        {
            try
            {
                YZ.setInfoWindowAdapter(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (InfoWindowAdapter infowindowadapter)
            {
                throw new RuntimeRemoteException(infowindowadapter);
            }
        }
        YZ.setInfoWindowAdapter(new com.google.android.gms.maps.internal.d.a(infowindowadapter) {

            final GoogleMap Zc;
            final InfoWindowAdapter Zq;

            public com.google.android.gms.dynamic.d f(f f1)
            {
                return e.h(Zq.getInfoWindow(new Marker(f1)));
            }

            public com.google.android.gms.dynamic.d g(f f1)
            {
                return e.h(Zq.getInfoContents(new Marker(f1)));
            }

            
            {
                Zc = GoogleMap.this;
                Zq = infowindowadapter;
                super();
            }
        });
        return;
    }

    public final void setLocationSource(LocationSource locationsource)
    {
        if (locationsource == null)
        {
            try
            {
                YZ.setLocationSource(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (LocationSource locationsource)
            {
                throw new RuntimeRemoteException(locationsource);
            }
        }
        YZ.setLocationSource(new com.google.android.gms.maps.internal.ILocationSourceDelegate.a(locationsource) {

            final GoogleMap Zc;
            final LocationSource Zh;

            public void activate(h h)
            {
                Zh.activate(new LocationSource.OnLocationChangedListener(this, h) {

                    final h Zi;
                    final _cls6 Zj;

                    public void onLocationChanged(Location location)
                    {
                        try
                        {
                            Zi.k(e.h(location));
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (Location location)
                        {
                            throw new RuntimeRemoteException(location);
                        }
                    }

            
            {
                Zj = _pcls6;
                Zi = h1;
                super();
            }
                });
            }

            public void deactivate()
            {
                Zh.deactivate();
            }

            
            {
                Zc = GoogleMap.this;
                Zh = locationsource;
                super();
            }
        });
        return;
    }

    public final void setMapType(int i)
    {
        try
        {
            YZ.setMapType(i);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void setMyLocationEnabled(boolean flag)
    {
        try
        {
            YZ.setMyLocationEnabled(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void setOnCameraChangeListener(OnCameraChangeListener oncamerachangelistener)
    {
        if (oncamerachangelistener == null)
        {
            try
            {
                YZ.setOnCameraChangeListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnCameraChangeListener oncamerachangelistener)
            {
                throw new RuntimeRemoteException(oncamerachangelistener);
            }
        }
        YZ.setOnCameraChangeListener(new com.google.android.gms.maps.internal.e.a(oncamerachangelistener) {

            final GoogleMap Zc;
            final OnCameraChangeListener Zk;

            public void onCameraChange(CameraPosition cameraposition)
            {
                Zk.onCameraChange(cameraposition);
            }

            
            {
                Zc = GoogleMap.this;
                Zk = oncamerachangelistener;
                super();
            }
        });
        return;
    }

    public final void setOnIndoorStateChangeListener(OnIndoorStateChangeListener onindoorstatechangelistener)
    {
        if (onindoorstatechangelistener == null)
        {
            try
            {
                YZ.setOnIndoorStateChangeListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnIndoorStateChangeListener onindoorstatechangelistener)
            {
                throw new RuntimeRemoteException(onindoorstatechangelistener);
            }
        }
        YZ.setOnIndoorStateChangeListener(new com.google.android.gms.maps.internal.f.a(onindoorstatechangelistener) {

            final OnIndoorStateChangeListener Zb;
            final GoogleMap Zc;

            public void a(d d)
            {
                Zb.onIndoorLevelActivated(new IndoorBuilding(d));
            }

            public void onIndoorBuildingFocused()
            {
                Zb.onIndoorBuildingFocused();
            }

            
            {
                Zc = GoogleMap.this;
                Zb = onindoorstatechangelistener;
                super();
            }
        });
        return;
    }

    public final void setOnInfoWindowClickListener(OnInfoWindowClickListener oninfowindowclicklistener)
    {
        if (oninfowindowclicklistener == null)
        {
            try
            {
                YZ.setOnInfoWindowClickListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnInfoWindowClickListener oninfowindowclicklistener)
            {
                throw new RuntimeRemoteException(oninfowindowclicklistener);
            }
        }
        YZ.setOnInfoWindowClickListener(new com.google.android.gms.maps.internal.g.a(oninfowindowclicklistener) {

            final GoogleMap Zc;
            final OnInfoWindowClickListener Zp;

            public void e(f f)
            {
                Zp.onInfoWindowClick(new Marker(f));
            }

            
            {
                Zc = GoogleMap.this;
                Zp = oninfowindowclicklistener;
                super();
            }
        });
        return;
    }

    public final void setOnMapClickListener(OnMapClickListener onmapclicklistener)
    {
        if (onmapclicklistener == null)
        {
            try
            {
                YZ.setOnMapClickListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnMapClickListener onmapclicklistener)
            {
                throw new RuntimeRemoteException(onmapclicklistener);
            }
        }
        YZ.setOnMapClickListener(new com.google.android.gms.maps.internal.i.a(onmapclicklistener) {

            final GoogleMap Zc;
            final OnMapClickListener Zl;

            public void onMapClick(LatLng latlng)
            {
                Zl.onMapClick(latlng);
            }

            
            {
                Zc = GoogleMap.this;
                Zl = onmapclicklistener;
                super();
            }
        });
        return;
    }

    public void setOnMapLoadedCallback(OnMapLoadedCallback onmaploadedcallback)
    {
        if (onmaploadedcallback == null)
        {
            try
            {
                YZ.setOnMapLoadedCallback(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnMapLoadedCallback onmaploadedcallback)
            {
                throw new RuntimeRemoteException(onmaploadedcallback);
            }
        }
        YZ.setOnMapLoadedCallback(new com.google.android.gms.maps.internal.j.a(onmaploadedcallback) {

            final GoogleMap Zc;
            final OnMapLoadedCallback Zf;

            public void onMapLoaded()
                throws RemoteException
            {
                Zf.onMapLoaded();
            }

            
            {
                Zc = GoogleMap.this;
                Zf = onmaploadedcallback;
                super();
            }
        });
        return;
    }

    public final void setOnMapLongClickListener(OnMapLongClickListener onmaplongclicklistener)
    {
        if (onmaplongclicklistener == null)
        {
            try
            {
                YZ.setOnMapLongClickListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnMapLongClickListener onmaplongclicklistener)
            {
                throw new RuntimeRemoteException(onmaplongclicklistener);
            }
        }
        YZ.setOnMapLongClickListener(new com.google.android.gms.maps.internal.k.a(onmaplongclicklistener) {

            final GoogleMap Zc;
            final OnMapLongClickListener Zm;

            public void onMapLongClick(LatLng latlng)
            {
                Zm.onMapLongClick(latlng);
            }

            
            {
                Zc = GoogleMap.this;
                Zm = onmaplongclicklistener;
                super();
            }
        });
        return;
    }

    public final void setOnMarkerClickListener(OnMarkerClickListener onmarkerclicklistener)
    {
        if (onmarkerclicklistener == null)
        {
            try
            {
                YZ.setOnMarkerClickListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnMarkerClickListener onmarkerclicklistener)
            {
                throw new RuntimeRemoteException(onmarkerclicklistener);
            }
        }
        YZ.setOnMarkerClickListener(new com.google.android.gms.maps.internal.l.a(onmarkerclicklistener) {

            final GoogleMap Zc;
            final OnMarkerClickListener Zn;

            public boolean a(f f)
            {
                return Zn.onMarkerClick(new Marker(f));
            }

            
            {
                Zc = GoogleMap.this;
                Zn = onmarkerclicklistener;
                super();
            }
        });
        return;
    }

    public final void setOnMarkerDragListener(OnMarkerDragListener onmarkerdraglistener)
    {
        if (onmarkerdraglistener == null)
        {
            try
            {
                YZ.setOnMarkerDragListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnMarkerDragListener onmarkerdraglistener)
            {
                throw new RuntimeRemoteException(onmarkerdraglistener);
            }
        }
        YZ.setOnMarkerDragListener(new com.google.android.gms.maps.internal.m.a(onmarkerdraglistener) {

            final GoogleMap Zc;
            final OnMarkerDragListener Zo;

            public void b(f f)
            {
                Zo.onMarkerDragStart(new Marker(f));
            }

            public void c(f f)
            {
                Zo.onMarkerDragEnd(new Marker(f));
            }

            public void d(f f)
            {
                Zo.onMarkerDrag(new Marker(f));
            }

            
            {
                Zc = GoogleMap.this;
                Zo = onmarkerdraglistener;
                super();
            }
        });
        return;
    }

    public final void setOnMyLocationButtonClickListener(OnMyLocationButtonClickListener onmylocationbuttonclicklistener)
    {
        if (onmylocationbuttonclicklistener == null)
        {
            try
            {
                YZ.setOnMyLocationButtonClickListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnMyLocationButtonClickListener onmylocationbuttonclicklistener)
            {
                throw new RuntimeRemoteException(onmylocationbuttonclicklistener);
            }
        }
        YZ.setOnMyLocationButtonClickListener(new com.google.android.gms.maps.internal.n.a(onmylocationbuttonclicklistener) {

            final GoogleMap Zc;
            final OnMyLocationButtonClickListener Ze;

            public boolean onMyLocationButtonClick()
                throws RemoteException
            {
                return Ze.onMyLocationButtonClick();
            }

            
            {
                Zc = GoogleMap.this;
                Ze = onmylocationbuttonclicklistener;
                super();
            }
        });
        return;
    }

    public final void setOnMyLocationChangeListener(OnMyLocationChangeListener onmylocationchangelistener)
    {
        if (onmylocationchangelistener == null)
        {
            try
            {
                YZ.setOnMyLocationChangeListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnMyLocationChangeListener onmylocationchangelistener)
            {
                throw new RuntimeRemoteException(onmylocationchangelistener);
            }
        }
        YZ.setOnMyLocationChangeListener(new com.google.android.gms.maps.internal.o.a(onmylocationchangelistener) {

            final GoogleMap Zc;
            final OnMyLocationChangeListener Zd;

            public void f(com.google.android.gms.dynamic.d d)
            {
                Zd.onMyLocationChange((Location)e.e(d));
            }

            
            {
                Zc = GoogleMap.this;
                Zd = onmylocationchangelistener;
                super();
            }
        });
        return;
    }

    public final void setPadding(int i, int j, int k, int l)
    {
        try
        {
            YZ.setPadding(i, j, k, l);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void setTrafficEnabled(boolean flag)
    {
        try
        {
            YZ.setTrafficEnabled(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void snapshot(SnapshotReadyCallback snapshotreadycallback)
    {
        snapshot(snapshotreadycallback, null);
    }

    public final void snapshot(SnapshotReadyCallback snapshotreadycallback, Bitmap bitmap)
    {
        if (bitmap != null)
        {
            bitmap = e.h(bitmap);
        } else
        {
            bitmap = null;
        }
        bitmap = (e)(e)bitmap;
        try
        {
            YZ.snapshot(new com.google.android.gms.maps.internal.s.a(snapshotreadycallback) {

                final GoogleMap Zc;
                final SnapshotReadyCallback Zg;

                public void g(com.google.android.gms.dynamic.d d)
                    throws RemoteException
                {
                    Zg.onSnapshotReady((Bitmap)e.e(d));
                }

                public void onSnapshotReady(Bitmap bitmap1)
                    throws RemoteException
                {
                    Zg.onSnapshotReady(bitmap1);
                }

            
            {
                Zc = GoogleMap.this;
                Zg = snapshotreadycallback;
                super();
            }
            }, bitmap);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SnapshotReadyCallback snapshotreadycallback)
        {
            throw new RuntimeRemoteException(snapshotreadycallback);
        }
    }

    public final void stopAnimation()
    {
        try
        {
            YZ.stopAnimation();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }
}
