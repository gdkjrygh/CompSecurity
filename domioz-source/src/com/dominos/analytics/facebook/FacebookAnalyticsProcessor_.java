// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.analytics.facebook;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.dominos.MobileSession_;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.analytics.facebook:
//            FacebookAnalyticsProcessor

public final class FacebookAnalyticsProcessor_ extends FacebookAnalyticsProcessor
{

    private static FacebookAnalyticsProcessor_ instance_;
    private Context context_;

    private FacebookAnalyticsProcessor_(Context context)
    {
        context_ = context;
    }

    public static FacebookAnalyticsProcessor_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new FacebookAnalyticsProcessor_(context.getApplicationContext());
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
            Log.w("FacebookAnalyticsProcessor_", (new StringBuilder("Due to Context class ")).append(context_.getClass().getSimpleName()).append(", the @RootContext Application won't be populated").toString());
        }
        onAfterInject();
    }
}
