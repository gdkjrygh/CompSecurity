// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import android.view.View;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.pinterest.activity.pin.view.BasicMapInfoView;
import com.pinterest.activity.pin.view.NearbyPinInfoView;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.ViewHelper;
import java.util.Map;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinPlaceFragment

class _nearbyPinInfoView
    implements com.google.android.gms.maps.istener, com.google.android.gms.maps.r, com.google.android.gms.maps.r
{

    BasicMapInfoView _mainMapInfoView;
    NearbyPinInfoView _nearbyPinInfoView;
    final PinPlaceFragment this$0;

    public View getInfoContents(Marker marker)
    {
        return null;
    }

    public View getInfoWindow(Marker marker)
    {
        marker = (Pin)PinPlaceFragment.access$1400(PinPlaceFragment.this).get(marker.getId());
        if (marker != null)
        {
            if (marker.equals(PinPlaceFragment.access$1000(PinPlaceFragment.this)))
            {
                return _mainMapInfoView.populate(marker.getPlace());
            } else
            {
                return _nearbyPinInfoView;
            }
        } else
        {
            return null;
        }
    }

    public void onInfoWindowClick(Marker marker)
    {
        Pinalytics.a(ElementType.PLACE_VIEW_MAP_CALLOUT, ComponentType.PLACE_VIEW_MAP);
        marker = (Pin)PinPlaceFragment.access$1400(PinPlaceFragment.this).get(marker.getId());
        if (marker != null && !marker.equals(PinPlaceFragment.access$1000(PinPlaceFragment.this)))
        {
            Events.post(new Navigation(Location.PIN, marker));
        }
    }

    public boolean onMarkerClick(final Marker marker)
    {
        Pinalytics.a(ElementType.PLACE_VIEW_MAP_MARKER, ComponentType.PLACE_VIEW_MAP);
        Pin pin = (Pin)PinPlaceFragment.access$1400(PinPlaceFragment.this).get(marker.getId());
        if (pin != null && !pin.equals(PinPlaceFragment.access$1000(PinPlaceFragment.this)))
        {
            class _cls1 extends com.pinterest.ui.imageview.WebImageView.ImageListener
            {

                final PinPlaceFragment.MapClickListener this$1;
                final Marker val$marker;

                public void onBitmapSet()
                {
                    marker.showInfoWindow();
                }

            _cls1()
            {
                this$1 = PinPlaceFragment.MapClickListener.this;
                marker = marker1;
                super();
            }
            }

            _nearbyPinInfoView.populate(pin, new _cls1());
            PinPlaceFragment.access$600(PinPlaceFragment.this).getMap().animateCamera(CameraUpdateFactory.newLatLng(marker.getPosition()));
            return true;
        } else
        {
            return false;
        }
    }

    public nt()
    {
        this$0 = PinPlaceFragment.this;
        super();
        _mainMapInfoView = (BasicMapInfoView)ViewHelper.viewById(getActivity(), 0x7f0301c4);
        _nearbyPinInfoView = (NearbyPinInfoView)ViewHelper.viewById(getActivity(), 0x7f0301e9);
    }
}
