// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.development;

import android.app.Activity;
import android.app.Application;
import me.lyft.android.infrastructure.activity.SimpleActivityLifecycleCallbacks;
import me.lyft.android.ui.MainActivity;

// Referenced classes of package me.lyft.android.ui.development:
//            EnvironmentSwitcherView

class ecycleCallbacks extends SimpleActivityLifecycleCallbacks
{

    final EnvironmentSwitcherView this$0;
    final Application val$app;

    public void onActivityDestroyed(Activity activity)
    {
        super.onActivityDestroyed(activity);
        val$app.unregisterActivityLifecycleCallbacks(lifecycleCallback);
        activity.startActivity(MainActivity.createIntent(activity));
    }

    ecycleCallbacks()
    {
        this$0 = final_environmentswitcherview;
        val$app = Application.this;
        super();
    }
}
