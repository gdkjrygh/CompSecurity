// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.service;

import android.content.Context;
import com.dominos.utils.AnalyticsUtil_;

// Referenced classes of package com.dominos.beacon.service:
//            GeofenceTransitionIntentService

public final class GeofenceTransitionIntentService_ extends GeofenceTransitionIntentService
{

    public GeofenceTransitionIntentService_()
    {
    }

    private void init_()
    {
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(this);
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
            super(context, com/dominos/beacon/service/GeofenceTransitionIntentService_);
        }
    }

}
