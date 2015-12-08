// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.geo;

import com.worklight.location.api.geo.WLGeoAcquisitionPolicy;
import com.worklight.location.api.geo.WLGeoCallback;
import com.worklight.location.api.geo.WLGeoFailureCallback;

// Referenced classes of package com.worklight.location.internal.geo:
//            LocationHandler, NativeLocationListener

public abstract class GeoFactory
{

    public GeoFactory()
    {
    }

    public LocationHandler createLocationHandler(WLGeoCallback wlgeocallback, WLGeoFailureCallback wlgeofailurecallback, WLGeoAcquisitionPolicy wlgeoacquisitionpolicy, boolean flag)
    {
        return new LocationHandler(this, wlgeocallback, wlgeofailurecallback, wlgeoacquisitionpolicy, flag);
    }

    public abstract NativeLocationListener createLocationListener(LocationHandler locationhandler, WLGeoAcquisitionPolicy wlgeoacquisitionpolicy);
}
