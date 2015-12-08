// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.tracker;

import android.content.Context;
import com.dominos.android.sdk.data.http.power.PowerRestClient_;

// Referenced classes of package com.dominos.android.sdk.core.tracker:
//            TrackerAPI

public final class TrackerAPI_ extends TrackerAPI
{

    private Context context_;

    private TrackerAPI_(Context context)
    {
        context_ = context;
        init_();
    }

    public static TrackerAPI_ getInstance_(Context context)
    {
        return new TrackerAPI_(context);
    }

    private void init_()
    {
        mPowerRestClient = PowerRestClient_.getInstance_(context_);
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
