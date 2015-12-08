// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package io.fabric.sdk.android:
//            ActivityLifecycleManager

class val.callbacks
    implements android.app.Wrapper._cls1
{

    final val.callbacks this$0;
    final val.callbacks val$callbacks;

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        val$callbacks.callbacks(activity, bundle);
    }

    public void onActivityDestroyed(Activity activity)
    {
        val$callbacks.callbacks(activity);
    }

    public void onActivityPaused(Activity activity)
    {
        val$callbacks.callbacks(activity);
    }

    public void onActivityResumed(Activity activity)
    {
        val$callbacks.callbacks(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
        val$callbacks.e(activity, bundle);
    }

    public void onActivityStarted(Activity activity)
    {
        val$callbacks.callbacks(activity);
    }

    public void onActivityStopped(Activity activity)
    {
        val$callbacks.callbacks(activity);
    }

    ()
    {
        this$0 = final_;
        val$callbacks = val.callbacks.this;
        super();
    }
}
