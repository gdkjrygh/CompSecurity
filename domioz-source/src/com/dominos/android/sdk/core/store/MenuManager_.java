// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.store;

import android.content.Context;
import com.dominos.android.sdk.core.cart.CartAPI_;
import com.dominos.android.sdk.data.http.power.PowerRestClient_;

// Referenced classes of package com.dominos.android.sdk.core.store:
//            MenuManager

public final class MenuManager_ extends MenuManager
{

    private Context context_;

    private MenuManager_(Context context)
    {
        context_ = context;
        init_();
    }

    public static MenuManager_ getInstance_(Context context)
    {
        return new MenuManager_(context);
    }

    private void init_()
    {
        mCartApi = CartAPI_.getInstance_(context_);
        mPowerService = PowerRestClient_.getInstance_(context_);
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
