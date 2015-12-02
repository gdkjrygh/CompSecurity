// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.ComponentName;
import android.os.Bundle;
import com.facebook.analytics.d;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.orca.threadlist.ForThreadListActivity;
import com.facebook.ui.h.a;

public class MessengerSplashScreenActivity extends a
    implements d
{

    private static final Class p = com/facebook/orca/app/MessengerSplashScreenActivity;
    private ComponentName q;

    public MessengerSplashScreenActivity()
    {
        super(k.splash_screen, null);
    }

    public void b(Bundle bundle)
    {
        super.b(bundle);
        q = (ComponentName)i().a(android/content/ComponentName, com/facebook/orca/threadlist/ForThreadListActivity);
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.SPLASH_SCREEN_ACTIVITY;
    }

    protected ComponentName j()
    {
        return q;
    }

}
