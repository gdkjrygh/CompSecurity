// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import com.google.android.gms.maps.GoogleMap;
import com.pinterest.activity.pin.view.modules.util.PinMapMarker;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinPlaceFragment

class val.map
    implements Runnable
{

    final PinPlaceFragment this$0;
    final GoogleMap val$map;

    public void run()
    {
        PinPlaceFragment.access$1700(PinPlaceFragment.this).bringToFront();
        val$map.setInfoWindowAdapter(PinPlaceFragment.access$1800(PinPlaceFragment.this));
    }

    r()
    {
        this$0 = final_pinplacefragment;
        val$map = GoogleMap.this;
        super();
    }
}
