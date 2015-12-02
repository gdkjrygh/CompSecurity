// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.maps;

import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.OverlayItem;

// Referenced classes of package com.facebook.maps:
//            i, GoogleMapFragment, a

class e
    implements com.google.android.maps.ItemizedOverlay.OnFocusChangeListener
{

    final GoogleMapFragment a;

    e(GoogleMapFragment googlemapfragment)
    {
        a = googlemapfragment;
        super();
    }

    public void onFocusChanged(ItemizedOverlay itemizedoverlay, OverlayItem overlayitem)
    {
        itemizedoverlay = (i)overlayitem;
        GoogleMapFragment.a(a, itemizedoverlay);
        GoogleMapFragment.a(a).invalidate();
    }
}
