// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.fragment;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.LatLng;
import com.pinterest.kit.log.PLog;

public class MapFragment extends SupportMapFragment
    implements OnMapReadyCallback
{

    private static final boolean USE_MAPBOX_TILES = false;
    public int DEFAULT_ZOOM;
    public int MIN_DISTANCE;
    private Listener _listener;

    public MapFragment()
    {
        DEFAULT_ZOOM = 13;
        MIN_DISTANCE = 200;
    }

    public void centerOn(LatLng latlng)
    {
        if (getMap() == null)
        {
            return;
        } else
        {
            getMap().moveCamera(CameraUpdateFactory.newLatLngZoom(latlng, DEFAULT_ZOOM));
            PLog.info((new StringBuilder("centerOn: ")).append(latlng).toString(), new Object[0]);
            return;
        }
    }

    public Listener getListener()
    {
        return _listener;
    }

    public void onMapReady(GoogleMap googlemap)
    {
        googlemap = googlemap.getUiSettings();
        googlemap.setZoomControlsEnabled(false);
        googlemap.setCompassEnabled(false);
        googlemap.setTiltGesturesEnabled(false);
        if (_listener != null)
        {
            _listener.onReady();
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        getMapAsync(this);
    }

    public void setMapListener(Listener listener)
    {
        _listener = listener;
    }

    private class Listener
    {

        public abstract void onReady();
    }

}
