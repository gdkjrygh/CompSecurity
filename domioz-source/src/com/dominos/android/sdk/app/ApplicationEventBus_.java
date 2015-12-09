// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.app;

import android.content.Context;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.android.sdk.app:
//            ApplicationEventBus

public final class ApplicationEventBus_ extends ApplicationEventBus
{

    private static ApplicationEventBus_ instance_;
    private Context context_;

    private ApplicationEventBus_(Context context)
    {
        context_ = context;
    }

    public static ApplicationEventBus_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new ApplicationEventBus_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
        initialize();
    }
}
