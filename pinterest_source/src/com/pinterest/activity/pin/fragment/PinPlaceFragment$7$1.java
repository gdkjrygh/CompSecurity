// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import com.google.android.gms.maps.model.Marker;
import com.pinterest.api.model.Pin;
import java.util.Map;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinPlaceFragment

class val.nearbyPin
    implements com.pinterest.activity.pin.view.modules.util.rkerListener
{

    final val.nearbyPin this$1;
    final Pin val$nearbyPin;

    public void onMarkerAdded(Marker marker)
    {
        PinPlaceFragment.access$1400(_fld0).put(marker.getId(), val$nearbyPin);
    }

    .PinMapMarkerListener()
    {
        this$1 = final_pinmapmarkerlistener;
        val$nearbyPin = Pin.this;
        super();
    }
}
