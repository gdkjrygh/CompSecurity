// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

// Referenced classes of package com.localytics.android:
//            LocalyticsSession, ReflectionUtils

public class LocalyticsActivityLifecycleCallbacks
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private static final String AMP_SESSION_CLASS_NAME = "com.localytics.android.LocalyticsAmpSession";
    private LocalyticsSession mSession;

    public LocalyticsActivityLifecycleCallbacks(LocalyticsSession localyticssession)
    {
        if (localyticssession == null)
        {
            throw new IllegalArgumentException("session cannot be null");
        } else
        {
            mSession = localyticssession;
            return;
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        mSession.open();
        mSession.upload();
        mSession.handlePushReceived(activity.getIntent());
        if (mSession.getClass().getCanonicalName().equals("com.localytics.android.LocalyticsAmpSession"))
        {
            bundle = mSession;
            activity = activity.getIntent();
            ReflectionUtils.tryInvokeInstance(bundle, "handleIntent", new Class[] {
                android/content/Intent
            }, new Object[] {
                activity
            });
        }
    }

    public void onActivityDestroyed(Activity activity)
    {
    }

    public void onActivityPaused(Activity activity)
    {
        if (mSession.getClass().getCanonicalName().equals("com.localytics.android.LocalyticsAmpSession") && (activity instanceof FragmentActivity))
        {
            ReflectionUtils.tryInvokeInstance(mSession, "detach", null, null);
        }
        mSession.close();
        mSession.upload();
    }

    public void onActivityResumed(Activity activity)
    {
        mSession.open();
        mSession.upload();
        if (mSession.getClass().getCanonicalName().equals("com.localytics.android.LocalyticsAmpSession"))
        {
            if (activity instanceof FragmentActivity)
            {
                LocalyticsSession localyticssession = mSession;
                FragmentActivity fragmentactivity = (FragmentActivity)activity;
                ReflectionUtils.tryInvokeInstance(localyticssession, "attach", new Class[] {
                    android/support/v4/app/FragmentActivity
                }, new Object[] {
                    fragmentactivity
                });
            }
            LocalyticsSession localyticssession1 = mSession;
            Intent intent = activity.getIntent();
            ReflectionUtils.tryInvokeInstance(localyticssession1, "handleIntent", new Class[] {
                android/content/Intent
            }, new Object[] {
                intent
            });
        }
        mSession.handlePushReceived(activity.getIntent());
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
