// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class chx
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private final List a = new CopyOnWriteArrayList();
    private int b;

    public chx()
    {
        b = 0;
    }

    public final void a(chy chy1)
    {
        a.add(chy1);
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
        b = b + 1;
        if (b == 1)
        {
            for (Iterator iterator = a.iterator(); iterator.hasNext(); ((chy)iterator.next()).a(activity.getIntent())) { }
        }
    }

    public final void onActivityStopped(Activity activity)
    {
        b = b - 1;
        if (b == 0)
        {
            for (activity = a.iterator(); activity.hasNext(); ((chy)activity.next()).a()) { }
        }
    }
}
