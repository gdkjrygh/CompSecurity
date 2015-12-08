// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.IndoorBuilding;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.internal.zzg;
import com.google.android.gms.maps.model.internal.zzi;

// Referenced classes of package com.google.android.gms.maps:
//            CameraUpdate, UiSettings, Projection, LocationSource

public final class GoogleMap
{

    private final IGoogleMapDelegate a;
    private UiSettings b;

    protected GoogleMap(IGoogleMapDelegate igooglemapdelegate)
    {
        a = (IGoogleMapDelegate)zzu.a(igooglemapdelegate);
    }

    public final CameraPosition a()
    {
        CameraPosition cameraposition;
        try
        {
            cameraposition = a.a();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return cameraposition;
    }

    public final Marker a(MarkerOptions markeroptions)
    {
        try
        {
            markeroptions = a.a(markeroptions);
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

    public final Polyline a(PolylineOptions polylineoptions)
    {
        try
        {
            polylineoptions = new Polyline(a.a(polylineoptions));
        }
        // Misplaced declaration of an exception variable
        catch (PolylineOptions polylineoptions)
        {
            throw new RuntimeRemoteException(polylineoptions);
        }
        return polylineoptions;
    }

    public final TileOverlay a(TileOverlayOptions tileoverlayoptions)
    {
        try
        {
            tileoverlayoptions = a.a(tileoverlayoptions);
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

    public final void a(int i, int j, int k, int l)
    {
        try
        {
            a.a(i, j, k, l);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void a(CameraUpdate cameraupdate)
    {
        try
        {
            a.a(cameraupdate.a());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CameraUpdate cameraupdate)
        {
            throw new RuntimeRemoteException(cameraupdate);
        }
    }

    public final void a(CameraUpdate cameraupdate, int i, CancelableCallback cancelablecallback)
    {
        IGoogleMapDelegate igooglemapdelegate;
        zzd zzd;
        try
        {
            igooglemapdelegate = a;
            zzd = cameraupdate.a();
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
        igooglemapdelegate.a(zzd, i, cameraupdate);
        return;
        cameraupdate = new zza(cancelablecallback);
        break MISSING_BLOCK_LABEL_18;
    }

    public final void a(InfoWindowAdapter infowindowadapter)
    {
        if (infowindowadapter == null)
        {
            try
            {
                a.a(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (InfoWindowAdapter infowindowadapter)
            {
                throw new RuntimeRemoteException(infowindowadapter);
            }
        }
        a.a(new com.google.android.gms.maps.internal.zzd.zza(infowindowadapter) {

            final InfoWindowAdapter a;
            final GoogleMap b;

            public zzd a(zzi zzi)
            {
                return zze.a(a.getInfoWindow(new Marker(zzi)));
            }

            public zzd b(zzi zzi)
            {
                return zze.a(a.getInfoContents(new Marker(zzi)));
            }

            
            {
                b = GoogleMap.this;
                a = infowindowadapter;
                super();
            }

            private class InfoWindowAdapter
            {

                public abstract View getInfoContents(Marker marker);

                public abstract View getInfoWindow(Marker marker);
            }

        });
        return;
    }

    public final void a(OnCameraChangeListener oncamerachangelistener)
    {
        if (oncamerachangelistener == null)
        {
            try
            {
                a.a(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnCameraChangeListener oncamerachangelistener)
            {
                throw new RuntimeRemoteException(oncamerachangelistener);
            }
        }
        a.a(new com.google.android.gms.maps.internal.zzf.zza(oncamerachangelistener) {

            final OnCameraChangeListener a;
            final GoogleMap b;

            public void a(CameraPosition cameraposition)
            {
                a.onCameraChange(cameraposition);
            }

            
            {
                b = GoogleMap.this;
                a = oncamerachangelistener;
                super();
            }

            private class OnCameraChangeListener
            {

                public abstract void onCameraChange(CameraPosition cameraposition);
            }

        });
        return;
    }

    public final void a(OnMarkerClickListener onmarkerclicklistener)
    {
        if (onmarkerclicklistener == null)
        {
            try
            {
                a.a(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnMarkerClickListener onmarkerclicklistener)
            {
                throw new RuntimeRemoteException(onmarkerclicklistener);
            }
        }
        a.a(new com.google.android.gms.maps.internal.zzn.zza(onmarkerclicklistener) {

            final OnMarkerClickListener a;
            final GoogleMap b;

            public boolean a(zzi zzi)
            {
                return a.onMarkerClick(new Marker(zzi));
            }

            
            {
                b = GoogleMap.this;
                a = onmarkerclicklistener;
                super();
            }

            private class OnMarkerClickListener
            {

                public abstract boolean onMarkerClick(Marker marker);
            }

        });
        return;
    }

    public final void a(boolean flag)
    {
        try
        {
            a.a(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void b()
    {
        try
        {
            a.e();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final boolean b(boolean flag)
    {
        try
        {
            flag = a.b(flag);
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public final UiSettings c()
    {
        UiSettings uisettings;
        try
        {
            if (b == null)
            {
                b = new UiSettings(a.k());
            }
            uisettings = b;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return uisettings;
    }

    public final void c(boolean flag)
    {
        try
        {
            a.c(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final Projection d()
    {
        Projection projection;
        try
        {
            projection = new Projection(a.l());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return projection;
    }

    // Unreferenced inner class com/google/android/gms/maps/GoogleMap$1

/* anonymous class */
    class _cls1 extends com.google.android.gms.maps.internal.zzg.zza
    {

        final OnIndoorStateChangeListener a;

        public void a()
        {
            a.a();
        }

        public void a(zzg zzg)
        {
            a.a(new IndoorBuilding(zzg));
        }

        private class OnIndoorStateChangeListener
        {

            public abstract void a();

            public abstract void a(IndoorBuilding indoorbuilding);
        }

    }


    // Unreferenced inner class com/google/android/gms/maps/GoogleMap$11

/* anonymous class */
    class _cls11 extends com.google.android.gms.maps.internal.zzo.zza
    {

        final OnMarkerDragListener a;

        public void a(zzi zzi)
        {
            a.a(new Marker(zzi));
        }

        public void b(zzi zzi)
        {
            a.c(new Marker(zzi));
        }

        public void c(zzi zzi)
        {
            a.b(new Marker(zzi));
        }

        private class OnMarkerDragListener
        {

            public abstract void a(Marker marker);

            public abstract void b(Marker marker);

            public abstract void c(Marker marker);
        }

    }


    // Unreferenced inner class com/google/android/gms/maps/GoogleMap$12

/* anonymous class */
    class _cls12 extends com.google.android.gms.maps.internal.zzh.zza
    {

        final OnInfoWindowClickListener a;

        public void a(zzi zzi)
        {
            a.a(new Marker(zzi));
        }

        private class OnInfoWindowClickListener
        {

            public abstract void a(Marker marker);
        }

    }


    // Unreferenced inner class com/google/android/gms/maps/GoogleMap$2

/* anonymous class */
    class _cls2 extends com.google.android.gms.maps.internal.zzq.zza
    {

        final OnMyLocationChangeListener a;

        public void a(Location location)
        {
            a.a(location);
        }

        public void a(zzd zzd)
        {
            a.a((Location)zze.a(zzd));
        }

        private class OnMyLocationChangeListener
        {

            public abstract void a(Location location);
        }

    }


    // Unreferenced inner class com/google/android/gms/maps/GoogleMap$3

/* anonymous class */
    class _cls3 extends com.google.android.gms.maps.internal.zzp.zza
    {

        final OnMyLocationButtonClickListener a;

        public boolean a()
        {
            return a.a();
        }

        private class OnMyLocationButtonClickListener
        {

            public abstract boolean a();
        }

    }


    // Unreferenced inner class com/google/android/gms/maps/GoogleMap$4

/* anonymous class */
    class _cls4 extends com.google.android.gms.maps.internal.zzk.zza
    {

        final OnMapLoadedCallback a;

        public void a()
        {
            a.a();
        }

        private class OnMapLoadedCallback
        {

            public abstract void a();
        }

    }


    // Unreferenced inner class com/google/android/gms/maps/GoogleMap$5

/* anonymous class */
    class _cls5 extends com.google.android.gms.maps.internal.zzw.zza
    {

        final SnapshotReadyCallback a;

        public void a(Bitmap bitmap)
        {
            a.a(bitmap);
        }

        public void a(zzd zzd)
        {
            a.a((Bitmap)zze.a(zzd));
        }

        private class SnapshotReadyCallback
        {

            public abstract void a(Bitmap bitmap);
        }

    }


    // Unreferenced inner class com/google/android/gms/maps/GoogleMap$6

/* anonymous class */
    class _cls6 extends com.google.android.gms.maps.internal.ILocationSourceDelegate.zza
    {

        final LocationSource a;

        public void a()
        {
            a.a();
        }

        public void a(com.google.android.gms.maps.internal.zzi zzi)
        {
            a.a(new LocationSource.OnLocationChangedListener(this, zzi) {

                final com.google.android.gms.maps.internal.zzi a;
                final _cls6 b;

            
            {
                b = _pcls6;
                a = zzi;
                super();
            }
            });
        }
    }


    // Unreferenced inner class com/google/android/gms/maps/GoogleMap$8

/* anonymous class */
    class _cls8 extends com.google.android.gms.maps.internal.zzj.zza
    {

        final OnMapClickListener a;

        public void a(LatLng latlng)
        {
            a.a(latlng);
        }

        private class OnMapClickListener
        {

            public abstract void a(LatLng latlng);
        }

    }


    // Unreferenced inner class com/google/android/gms/maps/GoogleMap$9

/* anonymous class */
    class _cls9 extends com.google.android.gms.maps.internal.zzl.zza
    {

        final OnMapLongClickListener a;

        public void a(LatLng latlng)
        {
            a.a(latlng);
        }

        private class OnMapLongClickListener
        {

            public abstract void a(LatLng latlng);
        }

    }


    private class zza extends com.google.android.gms.maps.internal.zzb.zza
    {

        private final CancelableCallback a;

        public void a()
        {
            a.onFinish();
        }

        public void b()
        {
            a.onCancel();
        }

        zza(CancelableCallback cancelablecallback)
        {
            a = cancelablecallback;
        }

        private class CancelableCallback
        {

            public abstract void onCancel();

            public abstract void onFinish();
        }

    }

}
