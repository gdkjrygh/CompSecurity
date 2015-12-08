// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.mopub.common:
//            LifecycleListener

public class MoPubLifecycleManager
    implements LifecycleListener
{

    private static MoPubLifecycleManager a;
    private final Set b = new HashSet();
    private final WeakReference c;

    private MoPubLifecycleManager(Activity activity)
    {
        c = new WeakReference(activity);
    }

    public static MoPubLifecycleManager getInstance(Activity activity)
    {
        com/mopub/common/MoPubLifecycleManager;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new MoPubLifecycleManager(activity);
        }
        activity = a;
        com/mopub/common/MoPubLifecycleManager;
        JVM INSTR monitorexit ;
        return activity;
        activity;
        throw activity;
    }

    public void addLifecycleListener(LifecycleListener lifecyclelistener)
    {
        if (lifecyclelistener != null && b.add(lifecyclelistener))
        {
            Activity activity = (Activity)c.get();
            if (activity != null)
            {
                lifecyclelistener.onCreate(activity);
                lifecyclelistener.onStart(activity);
                return;
            }
        }
    }

    public void onBackPressed(Activity activity)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((LifecycleListener)iterator.next()).onBackPressed(activity)) { }
    }

    public void onCreate(Activity activity)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((LifecycleListener)iterator.next()).onCreate(activity)) { }
    }

    public void onDestroy(Activity activity)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((LifecycleListener)iterator.next()).onRestart(activity)) { }
    }

    public void onPause(Activity activity)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((LifecycleListener)iterator.next()).onPause(activity)) { }
    }

    public void onRestart(Activity activity)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((LifecycleListener)iterator.next()).onRestart(activity)) { }
    }

    public void onResume(Activity activity)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((LifecycleListener)iterator.next()).onResume(activity)) { }
    }

    public void onStart(Activity activity)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((LifecycleListener)iterator.next()).onStart(activity)) { }
    }

    public void onStop(Activity activity)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((LifecycleListener)iterator.next()).onRestart(activity)) { }
    }
}
