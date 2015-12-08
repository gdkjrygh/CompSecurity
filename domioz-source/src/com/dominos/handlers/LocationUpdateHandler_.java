// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.handlers;

import android.content.Context;
import android.location.LocationManager;

// Referenced classes of package com.dominos.handlers:
//            LocationUpdateHandler

public final class LocationUpdateHandler_ extends LocationUpdateHandler
{

    private Context context_;

    private LocationUpdateHandler_(Context context)
    {
        super(context);
        context_ = context;
        init_();
    }

    public static LocationUpdateHandler_ getInstance_(Context context)
    {
        return new LocationUpdateHandler_(context);
    }

    private void init_()
    {
        mLocationManager = (LocationManager)context_.getSystemService("location");
        requestLocationUpdates();
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
