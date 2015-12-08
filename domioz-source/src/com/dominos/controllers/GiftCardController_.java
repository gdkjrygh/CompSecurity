// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers;

import android.content.Context;
import com.dominos.MobileSession_;
import com.dominos.android.sdk.data.http.power.PowerRestClient_;

// Referenced classes of package com.dominos.controllers:
//            GiftCardController

public final class GiftCardController_ extends GiftCardController
{

    private Context context_;

    private GiftCardController_(Context context)
    {
        context_ = context;
        init_();
    }

    public static GiftCardController_ getInstance_(Context context)
    {
        return new GiftCardController_(context);
    }

    private void init_()
    {
        powerApi = PowerRestClient_.getInstance_(context_);
        mMobileSession = MobileSession_.getInstance_(context_);
        onAfterInject();
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
