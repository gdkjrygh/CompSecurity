// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.api;

import android.content.Context;
import com.dominos.beacon.client.BeaconContentRestClient_;
import com.dominos.beacon.util.BeaconConfigurationPreferences_;

// Referenced classes of package com.dominos.beacon.api:
//            BeaconConfigurationAPI

public final class BeaconConfigurationAPI_ extends BeaconConfigurationAPI
{

    private Context context_;

    private BeaconConfigurationAPI_(Context context)
    {
        context_ = context;
        init_();
    }

    public static BeaconConfigurationAPI_ getInstance_(Context context)
    {
        return new BeaconConfigurationAPI_(context);
    }

    private void init_()
    {
        mBeaconConfigurationPreferences = new BeaconConfigurationPreferences_(context_);
        mBeaconContentRestClient = BeaconContentRestClient_.getInstance_(context_);
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
