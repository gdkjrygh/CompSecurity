// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.worklight.androidgap:
//            WLSplashScreen

class this._cls0
    implements android.app.lbacks
{

    final WLSplashScreen this$0;

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
    }

    public void onActivityDestroyed(Activity activity)
    {
        if (activity.getClass().getName().equals(WLSplashScreen.access$000(WLSplashScreen.this)))
        {
            WLSplashScreen.getInstance().hide();
        }
    }

    public void onActivityPaused(Activity activity)
    {
    }

    public void onActivityResumed(Activity activity)
    {
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

    ()
    {
        this$0 = WLSplashScreen.this;
        super();
    }
}
