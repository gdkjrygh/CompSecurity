// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.service;

import android.content.Context;

// Referenced classes of package com.dominos.fordsync.service:
//            AppLinkService, AppLinkManager_

public final class AppLinkService_ extends AppLinkService
{

    public AppLinkService_()
    {
    }

    private void init_()
    {
        mAppLinkManager = AppLinkManager_.getInstance_(this);
    }

    public static IntentBuilder_ intent(Context context)
    {
        return new IntentBuilder_(context);
    }

    public final void onCreate()
    {
        init_();
        super.onCreate();
    }

    private class IntentBuilder_ extends f
    {

        public IntentBuilder_(Context context)
        {
            super(context, com/dominos/fordsync/service/AppLinkService_);
        }
    }

}
