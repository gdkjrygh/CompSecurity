// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.app;

import android.content.Context;
import com.dominos.android.sdk.common.ConfigProvider_;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.android.sdk.app:
//            ApplicationService

public final class ApplicationService_ extends ApplicationService
{

    private static ApplicationService_ instance_;
    private Context context_;

    private ApplicationService_(Context context)
    {
        super(context);
        context_ = context;
    }

    public static ApplicationService_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new ApplicationService_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
        prefs = new DominosPrefs_(context_);
        mConfigProvider = ConfigProvider_.getInstance_(context_);
    }
}
