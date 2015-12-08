// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.crashlytics.android.internal:
//            cn, cm

final class co
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private cn a;

    co(cn cn1)
    {
        a = cn1;
        super();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle)
    {
        cm.a(a.a, activity);
    }

    public final void onActivityDestroyed(Activity activity)
    {
    }

    public final void onActivityPaused(Activity activity)
    {
    }

    public final void onActivityResumed(Activity activity)
    {
        cm.a(a.a, activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public final void onActivityStarted(Activity activity)
    {
        cm.a(a.a, activity);
    }

    public final void onActivityStopped(Activity activity)
    {
    }
}
