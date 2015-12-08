// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.news.listener;

import android.content.Context;
import com.dominos.MobileSession_;
import com.dominos.news.manager.PushManager_;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.news.listener:
//            PushActivityLifecycleCallbacks

public final class PushActivityLifecycleCallbacks_ extends PushActivityLifecycleCallbacks
{

    private static PushActivityLifecycleCallbacks_ instance_;
    private Context context_;

    private PushActivityLifecycleCallbacks_(Context context)
    {
        context_ = context;
    }

    public static PushActivityLifecycleCallbacks_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new PushActivityLifecycleCallbacks_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
        mPushManager = PushManager_.getInstance_(context_);
        mMobileSession = MobileSession_.getInstance_(context_);
    }
}
