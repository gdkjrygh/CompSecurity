// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.app.Activity;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.flurry.sdk:
//            dv, du

class it>
    implements android.app.cation.ActivityLifecycleCallbacks
{

    final dv a;

    protected void a(Activity activity,  )
    {
        for (Iterator iterator = dv.a(a).iterator(); iterator.hasNext(); ((du)iterator.next()).a(activity, )) { }
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        a(activity, a);
    }

    public void onActivityDestroyed(Activity activity)
    {
        a(activity, b);
    }

    public void onActivityPaused(Activity activity)
    {
        a(activity, c);
    }

    public void onActivityResumed(Activity activity)
    {
        a(activity, d);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
        a(activity, g);
    }

    public void onActivityStarted(Activity activity)
    {
        a(activity, e);
    }

    public void onActivityStopped(Activity activity)
    {
        a(activity, f);
    }

    (dv dv1)
    {
        a = dv1;
        super();
    }
}
