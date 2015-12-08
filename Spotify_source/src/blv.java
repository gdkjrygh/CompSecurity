// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

final class blv
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private blt a;

    blv(blt blt1)
    {
        a = blt1;
        super();
    }

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
        for (Iterator iterator = a.b.iterator(); iterator.hasNext(); ((blu)iterator.next()).a(activity)) { }
    }

    public final void onActivityStopped(Activity activity)
    {
        for (activity = a.b.iterator(); activity.hasNext(); ((blu)activity.next()).k_()) { }
    }
}
