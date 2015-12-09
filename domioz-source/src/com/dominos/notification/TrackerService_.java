// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.notification;

import android.content.Context;
import com.dominos.MobileSession_;
import com.dominos.pebble.PebbleManager_;

// Referenced classes of package com.dominos.notification:
//            TrackerService

public final class TrackerService_ extends TrackerService
{

    public TrackerService_()
    {
    }

    private void init_()
    {
        mPebbleManager = PebbleManager_.getInstance_(this);
        mMobileSession = MobileSession_.getInstance_(this);
        onAfterInject();
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
            super(context, com/dominos/notification/TrackerService_);
        }
    }

}
