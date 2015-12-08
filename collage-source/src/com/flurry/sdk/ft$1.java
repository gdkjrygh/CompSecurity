// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.flurry.sdk:
//            ft, fs, gd

class it>
    implements android.app.cation.ActivityLifecycleCallbacks
{

    final ft a;

    protected void a(Activity activity,  )
    {
        fs fs1 = new fs();
        fs1.a = activity;
        fs1.b = ;
        fs1.b();
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        gd.a(3, ft.d(), (new StringBuilder()).append("onActivityCreated for activity:").append(activity).toString());
        a(activity, a);
    }

    public void onActivityDestroyed(Activity activity)
    {
        gd.a(3, ft.d(), (new StringBuilder()).append("onActivityDestroyed for activity:").append(activity).toString());
        a(activity, b);
    }

    public void onActivityPaused(Activity activity)
    {
        gd.a(3, ft.d(), (new StringBuilder()).append("onActivityPaused for activity:").append(activity).toString());
        a(activity, c);
    }

    public void onActivityResumed(Activity activity)
    {
        gd.a(3, ft.d(), (new StringBuilder()).append("onActivityResumed for activity:").append(activity).toString());
        a(activity, d);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
        gd.a(3, ft.d(), (new StringBuilder()).append("onActivitySaveInstanceState for activity:").append(activity).toString());
        a(activity, g);
    }

    public void onActivityStarted(Activity activity)
    {
        gd.a(3, ft.d(), (new StringBuilder()).append("onActivityStarted for activity:").append(activity).toString());
        a(activity, e);
    }

    public void onActivityStopped(Activity activity)
    {
        gd.a(3, ft.d(), (new StringBuilder()).append("onActivityStopped for activity:").append(activity).toString());
        a(activity, f);
    }

    (ft ft1)
    {
        a = ft1;
        super();
    }
}
