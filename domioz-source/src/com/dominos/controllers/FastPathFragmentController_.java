// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers;

import android.content.Context;
import com.dominos.MobileSession_;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization_;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.controllers:
//            FastPathFragmentController

public final class FastPathFragmentController_ extends FastPathFragmentController
{

    private static FastPathFragmentController_ instance_;
    private Context context_;

    private FastPathFragmentController_(Context context)
    {
        context_ = context;
    }

    public static FastPathFragmentController_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new FastPathFragmentController_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
        mMobileSession = MobileSession_.getInstance_(context_);
        userAuth = UserAuthorization_.getInstance_(context_);
        onAfterInject();
    }
}
