// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.geo.nativeImpl;

import android.content.Context;
import com.worklight.location.api.geo.WLGeoAcquisitionPolicy;
import com.worklight.location.internal.geo.GeoFactory;
import com.worklight.location.internal.geo.LocationHandler;
import com.worklight.location.internal.geo.NativeLocationListener;

// Referenced classes of package com.worklight.location.internal.geo.nativeImpl:
//            AndroidLocationListener

public class AndroidLocationListenerFactory extends GeoFactory
{

    private Context context;

    public AndroidLocationListenerFactory(Context context1)
    {
        context = context1;
    }

    public NativeLocationListener createLocationListener(LocationHandler locationhandler, WLGeoAcquisitionPolicy wlgeoacquisitionpolicy)
    {
        return new AndroidLocationListener(context, locationhandler, wlgeoacquisitionpolicy);
    }
}
