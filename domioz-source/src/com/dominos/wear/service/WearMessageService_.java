// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.wear.service;

import android.content.Context;
import com.dominos.wear.manager.WearRequestManager_;
import com.dominos.wear.util.WearAnalytics_;

// Referenced classes of package com.dominos.wear.service:
//            WearMessageService

public final class WearMessageService_ extends WearMessageService
{

    public WearMessageService_()
    {
    }

    private void init_()
    {
        mWearAnalytics = WearAnalytics_.getInstance_(this);
        mRequestManager = WearRequestManager_.getInstance_(this);
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
            super(context, com/dominos/wear/service/WearMessageService_);
        }
    }

}
