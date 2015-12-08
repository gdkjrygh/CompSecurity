// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.flurry.sdk:
//            jr, js, kc

class it>
    implements android.app.cation.ActivityLifecycleCallbacks
{

    final js a;

    protected void a(Activity activity,  )
    {
        jr jr1 = new jr();
        jr1.a = activity;
        jr1.b = ;
        jr1.b();
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        kc.a(3, js.d(), (new StringBuilder("onActivityCreated for activity:")).append(activity).toString());
        a(activity, a);
    }

    public void onActivityDestroyed(Activity activity)
    {
        kc.a(3, js.d(), (new StringBuilder("onActivityDestroyed for activity:")).append(activity).toString());
        a(activity, b);
    }

    public void onActivityPaused(Activity activity)
    {
        kc.a(3, js.d(), (new StringBuilder("onActivityPaused for activity:")).append(activity).toString());
        a(activity, c);
    }

    public void onActivityResumed(Activity activity)
    {
        kc.a(3, js.d(), (new StringBuilder("onActivityResumed for activity:")).append(activity).toString());
        a(activity, d);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
        kc.a(3, js.d(), (new StringBuilder("onActivitySaveInstanceState for activity:")).append(activity).toString());
        a(activity, g);
    }

    public void onActivityStarted(Activity activity)
    {
        kc.a(3, js.d(), (new StringBuilder("onActivityStarted for activity:")).append(activity).toString());
        a(activity, e);
    }

    public void onActivityStopped(Activity activity)
    {
        kc.a(3, js.d(), (new StringBuilder("onActivityStopped for activity:")).append(activity).toString());
        a(activity, f);
    }

    (js js1)
    {
        a = js1;
        super();
    }
}
