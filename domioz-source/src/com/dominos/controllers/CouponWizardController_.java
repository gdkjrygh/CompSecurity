// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers;

import android.content.Context;
import com.dominos.MobileSession_;

// Referenced classes of package com.dominos.controllers:
//            CouponWizardController

public final class CouponWizardController_ extends CouponWizardController
{

    private Context context_;

    private CouponWizardController_(Context context)
    {
        context_ = context;
        init_();
    }

    public static CouponWizardController_ getInstance_(Context context)
    {
        return new CouponWizardController_(context);
    }

    private void init_()
    {
        mMobileSession = MobileSession_.getInstance_(context_);
        onAfterInject();
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
