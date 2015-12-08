// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.location;

import android.location.Address;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.skype.android.app.location:
//            SendLocationActivity

public static class address
{

    private final Address address;
    private final LatLng latLng;

    public Address getAddress()
    {
        return address;
    }

    public LatLng getLatLng()
    {
        return latLng;
    }

    public (LatLng latlng, Address address1)
    {
        latLng = latlng;
        address = address1;
    }
}
