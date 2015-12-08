// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.news.analytics;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.dominos.MobileSession_;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.news.analytics:
//            PushAnalyticsProcessor

public final class PushAnalyticsProcessor_ extends PushAnalyticsProcessor
{

    private static PushAnalyticsProcessor_ instance_;
    private Context context_;

    private PushAnalyticsProcessor_(Context context)
    {
        context_ = context;
    }

    public static PushAnalyticsProcessor_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new PushAnalyticsProcessor_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
        mMobileSession = MobileSession_.getInstance_(context_);
        if (context_ instanceof Application)
        {
            mApp = (Application)context_;
        } else
        {
            Log.w("PushAnalyticsProcessor_", (new StringBuilder("Due to Context class ")).append(context_.getClass().getSimpleName()).append(", the @RootContext Application won't be populated").toString());
        }
        onAfterInject();
    }
}
