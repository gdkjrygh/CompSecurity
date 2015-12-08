// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.map;

import android.os.Bundle;
import com.google.android.gms.maps.b;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.e;
import com.google.android.gms.maps.f;
import com.google.android.gms.maps.j;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

// Referenced classes of package com.dominos.fragments.map:
//            MapInterface

public class GoogleMapFragment extends f
    implements MapInterface, e
{

    private c mGoogleMap;
    boolean mIsZoomAndGestures;
    LatLng mLatLng;

    public GoogleMapFragment()
    {
    }

    private void setZoomAndGestures()
    {
        mGoogleMap.c().a(mIsZoomAndGestures);
        mGoogleMap.c().b(mIsZoomAndGestures);
        mGoogleMap.c().c(mIsZoomAndGestures);
    }

    public void bringToCenter()
    {
        mGoogleMap.a(b.a(mLatLng));
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        getMapAsync(this);
    }

    public void onMapReady(c c1)
    {
        mGoogleMap = c1;
        setZoomAndGestures();
        mGoogleMap.b();
        mGoogleMap.a(b.a(mLatLng));
        mGoogleMap.a((new MarkerOptions()).a(mLatLng).a(com.google.android.gms.maps.model.b.a()));
    }

    public void setMapType(MapInterface.MapType maptype)
    {
        if (mGoogleMap == null) goto _L2; else goto _L1
_L1:
        _cls1..SwitchMap.com.dominos.fragments.map.MapInterface.MapType[maptype.ordinal()];
        JVM INSTR tableswitch 1 2: default 36
    //                   1 37
    //                   2 46;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        mGoogleMap.a(1);
        return;
_L4:
        mGoogleMap.a(2);
        return;
    }

    private class _cls1
    {

        static final int $SwitchMap$com$dominos$fragments$map$MapInterface$MapType[];

        static 
        {
            $SwitchMap$com$dominos$fragments$map$MapInterface$MapType = new int[MapInterface.MapType.values().length];
            try
            {
                $SwitchMap$com$dominos$fragments$map$MapInterface$MapType[MapInterface.MapType.NORMAL.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$dominos$fragments$map$MapInterface$MapType[MapInterface.MapType.SATELLITE.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
