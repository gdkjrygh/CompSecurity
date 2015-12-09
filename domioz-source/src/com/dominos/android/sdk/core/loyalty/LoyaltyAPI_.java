// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.loyalty;

import android.content.Context;
import com.dominos.android.sdk.core.setup.ConfigurationManager_;
import com.dominos.android.sdk.data.http.power.PowerRestClient_;

// Referenced classes of package com.dominos.android.sdk.core.loyalty:
//            LoyaltyAPI

public final class LoyaltyAPI_ extends LoyaltyAPI
{

    private Context context_;

    private LoyaltyAPI_(Context context)
    {
        context_ = context;
        init_();
    }

    public static LoyaltyAPI_ getInstance_(Context context)
    {
        return new LoyaltyAPI_(context);
    }

    private void init_()
    {
        mConfigurationManager = ConfigurationManager_.getInstance_(context_);
        mPowerClient = PowerRestClient_.getInstance_(context_);
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
