// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.analytics:
//            c

final class a
    implements android.app.ication.ActivityLifecycleCallbacks
{

    final c a;

    public final void onActivityCreated(Activity activity, Bundle bundle)
    {
    }

    public final void onActivityDestroyed(Activity activity)
    {
    }

    public final void onActivityPaused(Activity activity)
    {
    }

    public final void onActivityResumed(Activity activity)
    {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public final void onActivityStarted(Activity activity)
    {
        a.a(activity);
    }

    public final void onActivityStopped(Activity activity)
    {
        a.e();
    }

    ycleCallbacks(c c1)
    {
        a = c1;
        super();
    }
}
