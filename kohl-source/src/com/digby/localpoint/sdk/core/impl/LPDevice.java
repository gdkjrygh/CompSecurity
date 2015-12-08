// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl;

import android.content.Context;
import android.location.Location;
import com.digby.localpoint.sdk.core.ILPDevice;
import com.digby.localpoint.sdk.core.ILPGeopoint;
import com.digby.localpoint.sdk.core.ILPID;
import com.digby.localpoint.sdk.core.filter.ILPLocationFilterFactory;
import com.digby.mm.android.library.controller.IDigbyController;
import com.digby.mm.android.library.controller.impl.DigbyController;
import com.digby.mm.android.library.utils.ILocationHelper;
import com.digby.mm.android.library.utils.Logger;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.digby.localpoint.sdk.core.impl:
//            LPGeopoint, LPLocalpointService, LPLocationProvider

public class LPDevice
    implements ILPDevice
{
    private class LPDeviceID
        implements ILPID
    {

        private final String deviceId;
        final LPDevice this$0;

        public String getValue()
        {
            return deviceId;
        }

        public LPDeviceID(String s)
        {
            this$0 = LPDevice.this;
            super();
            lpdevice = s;
            if (s == null)
            {
                lpdevice = "";
            }
            deviceId = LPDevice.this;
        }
    }


    private static LPDevice thisDevice = null;
    private Context mContext;

    protected LPDevice(Context context)
    {
        mContext = context;
    }

    public static LPDevice getInstance(Context context)
    {
        if (thisDevice != null)
        {
            return thisDevice;
        } else
        {
            thisDevice = new LPDevice(context);
            return thisDevice;
        }
    }

    public ILPID getID()
    {
        String s = "";
        String s1 = android.provider.Settings.Secure.getString(mContext.getContentResolver(), "android_id");
        s = s1;
_L2:
        return new LPDeviceID(s);
        Exception exception;
        exception;
        Logger.Error("getDeviceID", exception);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public ILPGeopoint getLastKnownGeopoint()
    {
        Location location = getLocationHelper().getBestCachedLocation();
        return new LPGeopoint(location.getLatitude(), location.getLongitude());
    }

    ILocationHelper getLocationHelper()
    {
        return DigbyController.getInstance(mContext).getLocationHelper();
    }

    public Set getLocationsIn()
    {
        LPLocationProvider lplocationprovider = LPLocalpointService.getInstance(mContext).getLocationProvider();
        return new HashSet(lplocationprovider.getLocations(lplocationprovider.getFilterFactory().getDeviceIsInFilter(), null));
    }

}
