// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.news.listener;

import android.app.Activity;
import android.os.Bundle;
import com.appboy.ui.inappmessage.a;
import com.dominos.MobileSession;
import com.dominos.news.manager.PushManager;

// Referenced classes of package com.dominos.news.listener:
//            InAppMessageListener

public class PushActivityLifecycleCallbacks
    implements android.app.Application.ActivityLifecycleCallbacks
{

    MobileSession mMobileSession;
    PushManager mPushManager;

    public PushActivityLifecycleCallbacks()
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
        if (mPushManager.isPushEnabled())
        {
            a.a().b(activity);
        }
    }

    public void onActivityResumed(Activity activity)
    {
        if (mPushManager.isPushEnabled())
        {
            a.a().a(activity);
            a.a().a(new InAppMessageListener(activity));
            com.appboy.a.a(activity).e();
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public void onActivityStarted(Activity activity)
    {
        if (mPushManager.isPushEnabled())
        {
            com.appboy.a.a(activity).a(activity);
        }
    }

    public void onActivityStopped(Activity activity)
    {
        if (mPushManager.isPushEnabled())
        {
            com.appboy.a.a(activity).b(activity);
        }
    }
}
