// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers;

import android.content.Context;
import com.dominos.MobileSession_;
import com.dominos.fordsync.service.AppLinkManager_;
import com.dominos.loader.ApplicationLoader_;
import org.androidannotations.api.a;

// Referenced classes of package com.dominos.controllers:
//            SplashScreenController

public final class SplashScreenController_ extends SplashScreenController
{

    private Context context_;

    private SplashScreenController_(Context context)
    {
        super(context);
        context_ = context;
        init_();
    }

    public static SplashScreenController_ getInstance_(Context context)
    {
        return new SplashScreenController_(context);
    }

    private void init_()
    {
        mAppLinkManager = AppLinkManager_.getInstance_(context_);
        mMobileSession = MobileSession_.getInstance_(context_);
        mApplicationLoader = ApplicationLoader_.getInstance_(context_);
        onAfterInject();
    }

    public final void checkGooglePlayServicesAndContinueVerification()
    {
        a.a(new _cls1("", 0, ""));
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }


    private class _cls1 extends c
    {

        final SplashScreenController_ this$0;

        public void execute()
        {
            try
            {
                checkGooglePlayServicesAndContinueVerification();
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls1(String s, int i, String s1)
        {
            this$0 = SplashScreenController_.this;
            super(s, i, s1);
        }
    }

}
