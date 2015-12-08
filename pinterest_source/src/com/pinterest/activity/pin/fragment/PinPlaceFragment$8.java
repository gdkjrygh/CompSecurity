// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import android.graphics.Point;
import android.support.v7.widget.Toolbar;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinPlaceFragment

class val.latLng
    implements com.google.android.gms.maps.hangeListener
{

    final PinPlaceFragment this$0;
    final LatLng val$latLng;
    final GoogleMap val$map;

    public void onCameraChange(CameraPosition cameraposition)
    {
        val$map.setOnCameraChangeListener(null);
        cameraposition = val$map.getProjection().toScreenLocation(val$latLng);
        float f = Resources.dimension(0x7f0a019f);
        int i = ((Point) (cameraposition)).y;
        int j = PinPlaceFragment.access$1600(PinPlaceFragment.this).getHeight();
        int k = (int)(f / 2.0F);
        int l = ((Point) (cameraposition)).y;
        cameraposition = val$map.getProjection().fromScreenLocation(new Point(((Point) (cameraposition)).x, (i - (k + j)) + l));
        val$map.moveCamera(CameraUpdateFactory.newLatLng(cameraposition));
    }

    tener()
    {
        this$0 = final_pinplacefragment;
        val$map = googlemap;
        val$latLng = LatLng.this;
        super();
    }
}
