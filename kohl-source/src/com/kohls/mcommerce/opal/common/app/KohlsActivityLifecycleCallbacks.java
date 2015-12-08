// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.common.app;

import android.app.Activity;
import android.os.Bundle;
import java.util.Timer;

// Referenced classes of package com.kohls.mcommerce.opal.common.app:
//            KohlsPhoneApplication

public class KohlsActivityLifecycleCallbacks
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private boolean isAppGoingToBackground;
    private boolean isInteractionCounterToReset;
    private Activity mActivity;

    public KohlsActivityLifecycleCallbacks()
    {
        isInteractionCounterToReset = true;
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
    }

    public void onActivityDestroyed(Activity activity)
    {
    }

    public void onActivityPaused(Activity activity)
    {
    }

    public void onActivityResumed(Activity activity)
    {
        mActivity = activity;
        isAppGoingToBackground = false;
        KohlsPhoneApplication.getInstance().setCurrentActivity(mActivity);
        KohlsPhoneApplication.getInstance().setEnableAnalytics(true);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public void onActivityStarted(Activity activity)
    {
    }

    public void onActivityStopped(Activity activity)
    {
        isAppGoingToBackground = true;
        (new Timer()).schedule(new _cls1(activity), 1000L);
    }

    public void setInteractionCounterToReset(boolean flag)
    {
        isInteractionCounterToReset = flag;
    }




    /* member class not found */
    class _cls1 {}

}
