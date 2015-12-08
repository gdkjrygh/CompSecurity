// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.support.v4.app.ah;
import android.support.v4.app.u;
import android.widget.Button;
import com.dominos.android.sdk.common.AmazonUtil;
import com.dominos.fragments.map.GoogleMapFragment_;
import com.dominos.fragments.map.MapInterface;
import com.dominos.fragments.map.MapWebViewFragment_;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.dominos.activities:
//            BaseActivity

public class MapActivity extends BaseActivity
{

    String mAddress;
    LatLng mLatLng;
    private MapInterface mMapInterface;
    Button mSatelliteViewBtn;
    Button mStreetViewBtn;

    public MapActivity()
    {
    }

    private void showMapFragments()
    {
        if (AmazonUtil.isAmazonDevice())
        {
            com.dominos.fragments.map.MapWebViewFragment mapwebviewfragment = MapWebViewFragment_.builder().mAddress(mAddress).build();
            getSupportFragmentManager().a().a(0x7f0f00cc, mapwebviewfragment).b();
            mMapInterface = mapwebviewfragment;
            return;
        } else
        {
            com.dominos.fragments.map.GoogleMapFragment googlemapfragment = GoogleMapFragment_.builder().mLatLng(mLatLng).mIsZoomAndGestures(true).build();
            getSupportFragmentManager().a().a(0x7f0f00cc, googlemapfragment).b();
            mMapInterface = googlemapfragment;
            return;
        }
    }

    void afterView()
    {
        if (AmazonUtil.isAmazonDevice())
        {
            mSatelliteViewBtn.setVisibility(8);
            mStreetViewBtn.setVisibility(8);
        }
        showMapFragments();
    }

    void centerViewBtn()
    {
        mMapInterface.bringToCenter();
    }

    void satelliteViewBtnClicked()
    {
        mMapInterface.setMapType(com.dominos.fragments.map.MapInterface.MapType.SATELLITE);
    }

    void streetViewBtnClicked()
    {
        mMapInterface.setMapType(com.dominos.fragments.map.MapInterface.MapType.NORMAL);
    }
}
