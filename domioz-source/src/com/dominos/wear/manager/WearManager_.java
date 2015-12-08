// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.wear.manager;

import android.content.Context;
import com.dominos.wear.WearSession_;
import com.dominos.wear.api.WearAPI_;
import com.dominos.wear.client.WearMessageClient_;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.wear.manager:
//            WearManager

public final class WearManager_ extends WearManager
{

    private static WearManager_ instance_;
    private Context context_;

    private WearManager_(Context context)
    {
        context_ = context;
    }

    public static WearManager_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new WearManager_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
        mWearMessageClient = WearMessageClient_.getInstance_(context_);
        mWearSession = WearSession_.getInstance_(context_);
        mWearAPI = WearAPI_.getInstance_(context_);
        onAfterInject();
    }
}
