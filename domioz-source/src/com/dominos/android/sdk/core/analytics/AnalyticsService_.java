// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.analytics;

import android.content.Context;
import com.dominos.android.sdk.app.ApplicationEventBus_;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.android.sdk.core.analytics:
//            AnalyticsService

public final class AnalyticsService_ extends AnalyticsService
{

    private static AnalyticsService_ instance_;
    private Context context_;

    private AnalyticsService_(Context context)
    {
        context_ = context;
    }

    public static AnalyticsService_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new AnalyticsService_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
        eventBus = ApplicationEventBus_.getInstance_(context_);
        initialize();
    }
}
