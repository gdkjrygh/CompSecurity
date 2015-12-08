// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos;

import com.dominos.android.sdk.app.ApplicationEventBus_;
import com.dominos.android.sdk.core.user.UserService_;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;

// Referenced classes of package com.dominos:
//            App

public final class App_ extends App
{

    private static App INSTANCE_;

    public App_()
    {
    }

    public static App getInstance()
    {
        return INSTANCE_;
    }

    private void init_()
    {
        prefs = new DominosPrefs_(this);
        bus = ApplicationEventBus_.getInstance_(this);
        user = UserService_.getInstance_(this);
    }

    public static void setForTesting(App app)
    {
        INSTANCE_ = app;
    }

    public final void onCreate()
    {
        INSTANCE_ = this;
        init_();
        super.onCreate();
    }
}
