// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.client;

import android.content.Context;
import com.dominos.beacon.data.http.BeaconContentInterface_;

// Referenced classes of package com.dominos.beacon.client:
//            BeaconContentRestClient

public final class BeaconContentRestClient_ extends BeaconContentRestClient
{

    private Context context_;

    private BeaconContentRestClient_(Context context)
    {
        context_ = context;
        init_();
    }

    public static BeaconContentRestClient_ getInstance_(Context context)
    {
        return new BeaconContentRestClient_(context);
    }

    private void init_()
    {
        mBeaconContentInterface = new BeaconContentInterface_(context_);
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
