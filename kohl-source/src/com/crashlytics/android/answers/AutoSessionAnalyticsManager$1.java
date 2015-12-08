// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.crashlytics.android.answers:
//            AutoSessionAnalyticsManager

class this._cls0
    implements android.app.allbacks
{

    final AutoSessionAnalyticsManager this$0;

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        onCreate(activity);
    }

    public void onActivityDestroyed(Activity activity)
    {
        onDestroy(activity);
    }

    public void onActivityPaused(Activity activity)
    {
        onPause(activity);
    }

    public void onActivityResumed(Activity activity)
    {
        onResume(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
        onSaveInstanceState(activity);
    }

    public void onActivityStarted(Activity activity)
    {
        onStart(activity);
    }

    public void onActivityStopped(Activity activity)
    {
        onStop(activity);
    }

    ()
    {
        this$0 = AutoSessionAnalyticsManager.this;
        super();
    }
}
