// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.analytics.facebook;

import android.app.Activity;
import android.os.Bundle;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.utils.AnalyticsUtil;
import com.facebook.a.a;

public class FacebookActivityLifecycleCallbacks
    implements android.app.Application.ActivityLifecycleCallbacks
{

    AnalyticsUtil mAnalyticsUtil;
    UserProfileManager mUserProfileManager;

    public FacebookActivityLifecycleCallbacks()
    {
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
    }

    public void onActivityDestroyed(Activity activity)
    {
    }

    public void onActivityPaused(Activity activity)
    {
        a.b(activity);
    }

    public void onActivityResumed(Activity activity)
    {
        a.a(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public void onActivityStarted(Activity activity)
    {
    }

    public void onActivityStopped(Activity activity)
    {
    }
}
