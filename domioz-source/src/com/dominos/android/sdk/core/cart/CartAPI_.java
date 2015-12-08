// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.cart;

import android.content.Context;
import com.dominos.android.sdk.data.http.power.PowerRestClient_;

// Referenced classes of package com.dominos.android.sdk.core.cart:
//            CartAPI

public final class CartAPI_ extends CartAPI
{

    private Context context_;

    private CartAPI_(Context context)
    {
        context_ = context;
        init_();
    }

    public static CartAPI_ getInstance_(Context context)
    {
        return new CartAPI_(context);
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
