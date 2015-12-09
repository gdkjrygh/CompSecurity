// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.client;

import android.content.Context;
import com.dominos.beacon.data.http.BeaconRestInterface_;
import com.dominos.beacon.util.BeaconConfigurationPreferences_;

// Referenced classes of package com.dominos.beacon.client:
//            BeaconRestClient

public final class BeaconRestClient_ extends BeaconRestClient
{

    private Context context_;

    private BeaconRestClient_(Context context)
    {
        context_ = context;
        init_();
    }

    public static BeaconRestClient_ getInstance_(Context context)
    {
        return new BeaconRestClient_(context);
    }

    private void init_()
    {
        mBeaconConfigurationPreferences = new BeaconConfigurationPreferences_(context_);
        mRestInterface = new BeaconRestInterface_(context_);
        setupService();
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
