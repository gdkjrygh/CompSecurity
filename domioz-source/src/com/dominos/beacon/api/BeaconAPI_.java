// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.api;

import android.content.Context;
import com.dominos.android.sdk.common.DeviceCapabilities_;
import com.dominos.android.sdk.data.http.power.PowerRestClient_;
import com.dominos.beacon.client.BeaconRestClient_;
import com.dominos.beacon.util.BeaconConfigurationPreferences_;

// Referenced classes of package com.dominos.beacon.api:
//            BeaconAPI

public final class BeaconAPI_ extends BeaconAPI
{

    private Context context_;

    private BeaconAPI_(Context context)
    {
        context_ = context;
        init_();
    }

    public static BeaconAPI_ getInstance_(Context context)
    {
        return new BeaconAPI_(context);
    }

    private void init_()
    {
        mBeaconConfigurationPreferences = new BeaconConfigurationPreferences_(context_);
        mBeaconRestClient = BeaconRestClient_.getInstance_(context_);
        mDeviceCapabilities = DeviceCapabilities_.getInstance_(context_);
        mPowerRestClient = PowerRestClient_.getInstance_(context_);
        mContext = context_;
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
