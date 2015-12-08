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
import com.pinterest.activity.pin.view.modules.util.PinMapMarker;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupNewPlaceModule

class val.latLng
    implements com.google.android.gms.maps.tener
{

    final PinCloseupNewPlaceModule this$0;
    final LatLng val$latLng;
    final GoogleMap val$map;

    public void onCameraChange(CameraPosition cameraposition)
    {
        val$map.setOnCameraChangeListener(null);
        cameraposition = val$map.getProjection().toScreenLocation(val$latLng);
        int i = ((Point) (cameraposition)).y;
        int j = (int)((float)PinCloseupNewPlaceModule.access$500(PinCloseupNewPlaceModule.this).getMarkerHeight() / 2.0F);
        cameraposition = val$map.getProjection().fromScreenLocation(new Point(((Point) (cameraposition)).x, i - j));
        val$map.moveCamera(CameraUpdateFactory.newLatLng(cameraposition));
    }

    ()
    {
        this$0 = final_pincloseupnewplacemodule;
        val$map = googlemap;
        val$latLng = LatLng.this;
        super();
    }
}
