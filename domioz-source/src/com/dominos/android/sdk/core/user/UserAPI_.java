// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.user;

import android.content.Context;
import com.dominos.android.sdk.data.http.power.PowerRestClient_;

// Referenced classes of package com.dominos.android.sdk.core.user:
//            UserAPI

public final class UserAPI_ extends UserAPI
{

    private Context context_;

    private UserAPI_(Context context)
    {
        context_ = context;
        init_();
    }

    public static UserAPI_ getInstance_(Context context)
    {
        return new UserAPI_(context);
    }

    private void init_()
    {
        mPowerClient = PowerRestClient_.getInstance_(context_);
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
