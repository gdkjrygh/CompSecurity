// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.graphics.Point;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupPlaceModule

class val.latLng
    implements com.google.android.gms.maps.Listener
{

    final PinCloseupPlaceModule this$0;
    final LatLng val$latLng;
    final GoogleMap val$map;

    public void onCameraChange(CameraPosition cameraposition)
    {
        cameraposition = val$map.getProjection();
        Point point = cameraposition.toScreenLocation(val$latLng);
        point.offset(0, -PinCloseupPlaceModule.MARKER_SIZE / 2);
        cameraposition = cameraposition.fromScreenLocation(point);
        val$map.setOnCameraChangeListener(null);
        val$map.moveCamera(CameraUpdateFactory.newLatLngZoom(cameraposition, 15F));
    }

    ()
    {
        this$0 = final_pincloseupplacemodule;
        val$map = googlemap;
        val$latLng = LatLng.this;
        super();
    }
}
