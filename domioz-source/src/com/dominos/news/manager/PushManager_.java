// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.news.manager;

import android.content.Context;
import com.dominos.news.listener.PushActivityLifecycleCallbacks_;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.news.manager:
//            PushManager, PushAPI_

public final class PushManager_ extends PushManager
{

    private static PushManager_ instance_;
    private Context context_;

    private PushManager_(Context context)
    {
        super(context);
        context_ = context;
    }

    public static PushManager_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new PushManager_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
        mPushActivityCallbacks = PushActivityLifecycleCallbacks_.getInstance_(context_);
        mPushAPI = PushAPI_.getInstance_(context_);
    }
}
