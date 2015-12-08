// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.place.adapter;

import android.location.Location;

// Referenced classes of package com.pinterest.activity.place.adapter:
//            PlacePickerAdapter

class this._cls0
    implements com.pinterest.activity.place.ener
{

    final PlacePickerAdapter this$0;

    public void onGPSLocationUpdate(Location location)
    {
        PlacePickerAdapter.access$002(PlacePickerAdapter.this, location);
    }

    public void onNetworkLocationUpdate(Location location)
    {
        PlacePickerAdapter.access$002(PlacePickerAdapter.this, location);
    }

    ()
    {
        this$0 = PlacePickerAdapter.this;
        super();
    }
}
