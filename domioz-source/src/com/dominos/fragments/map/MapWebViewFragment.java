// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.map;

import android.os.Bundle;
import android.widget.LinearLayout;
import com.dominos.fragments.BaseFragment;
import com.dominos.views.MapWebView;

// Referenced classes of package com.dominos.fragments.map:
//            MapInterface

public class MapWebViewFragment extends BaseFragment
    implements MapInterface, com.dominos.views.MapWebView.MapWebViewCallbacks
{

    String mAddress;
    LinearLayout mMapBusy;
    MapWebView mMapView;

    public MapWebViewFragment()
    {
    }

    public void bringToCenter()
    {
        mMapView.addLocationAndCenter(mAddress);
    }

    public void mapFinishedLoading()
    {
        mMapView.addLocationAndCenter(mAddress);
    }

    public void mapMarkerSet()
    {
        mMapBusy.setVisibility(8);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        mMapView.setMapViewListener(this);
    }

    public void setMapType(MapInterface.MapType maptype)
    {
    }
}
