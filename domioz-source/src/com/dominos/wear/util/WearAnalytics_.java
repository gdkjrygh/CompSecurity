// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.wear.util;

import android.content.Context;
import com.dominos.android.sdk.core.analytics.AnalyticsService_;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.wear.util:
//            WearAnalytics

public final class WearAnalytics_ extends WearAnalytics
{

    private static WearAnalytics_ instance_;
    private Context context_;

    private WearAnalytics_(Context context)
    {
        context_ = context;
    }

    public static WearAnalytics_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new WearAnalytics_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
        mAnalyticsService = AnalyticsService_.getInstance_(context_);
    }
}
