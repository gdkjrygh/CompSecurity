// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers;

import android.content.Context;
import com.dominos.MobileSession_;
import com.dominos.android.sdk.core.user.UserService_;
import com.dominos.android.sdk.data.http.power.PowerRestClient_;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;

// Referenced classes of package com.dominos.controllers:
//            LandingScreenController

public final class LandingScreenController_ extends LandingScreenController
{

    private Context context_;

    private LandingScreenController_(Context context)
    {
        context_ = context;
        init_();
    }

    public static LandingScreenController_ getInstance_(Context context)
    {
        return new LandingScreenController_(context);
    }

    private void init_()
    {
        prefs = new DominosPrefs_(context_);
        user = UserService_.getInstance_(context_);
        powerService = PowerRestClient_.getInstance_(context_);
        mMobileSession = MobileSession_.getInstance_(context_);
        onAfterInject();
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
